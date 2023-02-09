package androidx.media.filterfw;

import java.nio.ByteBuffer;

/* compiled from: PG */
public class PixelUtils {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native void nativeCopyPixels(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5);
}
