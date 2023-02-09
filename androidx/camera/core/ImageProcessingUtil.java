package androidx.camera.core;

import android.graphics.Bitmap;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: PG */
public final class ImageProcessingUtil {
    static {
        System.loadLibrary("image_processing_util_jni");
    }

    private ImageProcessingUtil() {
    }

    /* renamed from: a */
    public static abx m4694a(afh afh, byte[] bArr) {
        asz.m6149c(afh.mo2038b() == 256);
        Surface e = afh.mo2041e();
        asz.m6156j(e);
        if (nativeWriteJpegToSurface(bArr, e) != 0) {
            acb.m88841a("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        abx f = afh.mo2042f();
        if (f == null) {
            acb.m88841a("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return f;
    }

    /* renamed from: b */
    public static void m4695b(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    /* renamed from: c */
    public static void m4696c(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i10, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i11, int i12, int i13);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
