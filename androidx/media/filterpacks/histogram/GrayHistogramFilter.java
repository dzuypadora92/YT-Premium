package androidx.media.filterpacks.histogram;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* compiled from: PG */
public final class GrayHistogramFilter extends bgc {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native void extractHistogram(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, IntBuffer intBuffer);
}
