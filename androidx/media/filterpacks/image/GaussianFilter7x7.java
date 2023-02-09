package androidx.media.filterpacks.image;

import java.nio.ByteBuffer;

/* compiled from: PG */
public class GaussianFilter7x7 extends bgc {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean blur(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);
}
