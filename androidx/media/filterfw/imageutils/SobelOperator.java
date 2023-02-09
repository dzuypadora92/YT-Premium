package androidx.media.filterfw.imageutils;

import java.nio.ByteBuffer;

/* compiled from: PG */
public class SobelOperator {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean sobelOperator(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5);
}
