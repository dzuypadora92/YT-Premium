package androidx.media.filterpacks.image;

import java.nio.ByteBuffer;

/* compiled from: PG */
public class MaskingFilter extends bgc {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean applyMask(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3);
}
