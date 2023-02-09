package androidx.media3.decoder.opus;

/* compiled from: PG */
public final class OpusLibrary {

    /* renamed from: a */
    private static final bjq f11950a = new bmu("opusV2JNI");

    /* renamed from: b */
    private static final int f11951b = 1;

    static {
        bhr.m8705a("media3.decoder.opus");
    }

    private OpusLibrary() {
    }

    /* renamed from: a */
    public static boolean m4825a() {
        return f11950a.mo7066b();
    }

    /* renamed from: b */
    public static boolean m4826b(int i) {
        if (i != 0) {
            return i != 1 && i == f11951b;
        }
        return true;
    }

    public static native String opusGetVersion();

    public static native boolean opusIsSecureDecodeSupported();
}
