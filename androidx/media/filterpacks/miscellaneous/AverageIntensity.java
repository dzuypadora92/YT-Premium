package androidx.media.filterpacks.miscellaneous;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* compiled from: PG */
public final class AverageIntensity extends bgc {
    private static int mBinHeight = 2;
    private static int mBinWidth = 2;

    static {
        System.loadLibrary("filterframework_jni");
    }

    private native void averageIntensity(ByteBuffer byteBuffer, IntBuffer intBuffer, int i, int i2, int i3, int i4);
}
