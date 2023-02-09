package androidx.media3.decoder;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
public class SimpleDecoderOutputBuffer extends bmk {
    public ByteBuffer data;
    private final bmj owner;

    public SimpleDecoderOutputBuffer(bmj bmj) {
        this.owner = bmj;
    }

    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public ByteBuffer init(long j, int i) {
        this.timeUs = j;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.data = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        this.data.position(0);
        this.data.limit(i);
        return this.data;
    }

    public void release() {
        this.owner.mo7188a(this);
    }
}
