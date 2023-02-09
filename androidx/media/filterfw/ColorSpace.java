package androidx.media.filterfw;

import java.nio.ByteBuffer;

/* compiled from: PG */
public class ColorSpace {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native void nativeArgb8888ToRgba8888(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3);

    private static native void nativeCropRgbaImage(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5, int i6);

    private static native void nativeRgba8888ToGray8888(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2);

    private static native void nativeRgba8888ToHsva8888(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2);

    private static native void nativeRgba8888ToYcbcra8888(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2);

    private static native void nativeYuv420pToRgba8888(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3);
}
