package androidx.media.filterpacks.image;

import java.nio.ByteBuffer;

/* compiled from: PG */
public class ToRgbValuesFilter extends bgc {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean toRgbValues(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);
}
