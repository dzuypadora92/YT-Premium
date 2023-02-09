package androidx.media.filterpacks.image;

import java.nio.ByteBuffer;

/* compiled from: PG */
public class PerceptualSharpnessFilter extends bgc {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native float computePerceptualSharpness(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3);
}
