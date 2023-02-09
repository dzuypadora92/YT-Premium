package androidx.media3.decoder.vp9;

/* compiled from: PG */
public final class VpxLibrary {

    /* renamed from: a */
    private static final bjq f11952a = new bmx("vpx", "vpxV2JNI");

    /* renamed from: b */
    private static final int f11953b = 1;

    static {
        bhr.m8705a("media3.decoder.vpx");
    }

    private VpxLibrary() {
    }

    /* renamed from: a */
    public static boolean m4827a() {
        return f11952a.mo7066b();
    }

    /* renamed from: b */
    public static boolean m4828b(int i) {
        if (i != 0) {
            return i != 1 && i == f11953b;
        }
        return true;
    }

    private static native String vpxGetBuildConfig();

    public static native String vpxGetVersion();

    public static native boolean vpxIsSecureDecodeSupported();
}
