package androidx.media3.decoder;

import java.nio.ByteBuffer;

/* compiled from: PG */
public class VideoDecoderOutputBuffer extends bmk {
    public static final int COLORSPACE_BT2020 = 3;
    public static final int COLORSPACE_BT601 = 1;
    public static final int COLORSPACE_BT709 = 2;
    public static final int COLORSPACE_UNKNOWN = 0;
    public int colorspace;
    public ByteBuffer data;
    public int decoderPrivate;
    public bgy format;
    public int height;
    public int mode;
    private final bmj owner;
    public ByteBuffer supplementalData;
    public int width;
    public ByteBuffer[] yuvPlanes;
    public int[] yuvStrides;

    public VideoDecoderOutputBuffer(bmj bmj) {
        this.owner = bmj;
    }

    private static boolean isSafeToMultiply(int i, int i2) {
        if (i < 0 || i2 < 0) {
            return false;
        }
        return i2 <= 0 || i < Integer.MAX_VALUE / i2;
    }

    public void init(long j, int i, ByteBuffer byteBuffer) {
        this.timeUs = j;
        this.mode = i;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            this.supplementalData = null;
            return;
        }
        addFlag(268435456);
        int limit = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 == null || byteBuffer2.capacity() < limit) {
            this.supplementalData = ByteBuffer.allocate(limit);
        } else {
            this.supplementalData.clear();
        }
        this.supplementalData.put(byteBuffer);
        this.supplementalData.flip();
        byteBuffer.position(0);
    }

    public void initForPrivateFrame(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public boolean initForYuvFrame(int i, int i2, int i3, int i4, int i5) {
        int i6;
        this.width = i;
        this.height = i2;
        this.colorspace = i5;
        if (isSafeToMultiply(i3, i2)) {
            int i7 = (int) ((((long) i2) + 1) / 2);
            if (isSafeToMultiply(i4, i7)) {
                int i8 = i2 * i3;
                int i9 = i7 * i4;
                if (isSafeToMultiply(i9, 2) && (i6 = i9 + i9 + i8) >= i8) {
                    ByteBuffer byteBuffer = this.data;
                    if (byteBuffer == null || byteBuffer.capacity() < i6) {
                        this.data = ByteBuffer.allocateDirect(i6);
                    } else {
                        this.data.position(0);
                        this.data.limit(i6);
                    }
                    if (this.yuvPlanes == null) {
                        this.yuvPlanes = new ByteBuffer[3];
                    }
                    ByteBuffer byteBuffer2 = this.data;
                    ByteBuffer[] byteBufferArr = this.yuvPlanes;
                    ByteBuffer slice = byteBuffer2.slice();
                    byteBufferArr[0] = slice;
                    slice.limit(i8);
                    byteBuffer2.position(i8);
                    ByteBuffer slice2 = byteBuffer2.slice();
                    byteBufferArr[1] = slice2;
                    slice2.limit(i9);
                    byteBuffer2.position(i8 + i9);
                    ByteBuffer slice3 = byteBuffer2.slice();
                    byteBufferArr[2] = slice3;
                    slice3.limit(i9);
                    if (this.yuvStrides == null) {
                        this.yuvStrides = new int[3];
                    }
                    int[] iArr = this.yuvStrides;
                    iArr[0] = i3;
                    iArr[1] = i4;
                    iArr[2] = i4;
                    return true;
                }
            }
        }
        return false;
    }

    public void release() {
        this.owner.mo7188a(this);
    }
}
