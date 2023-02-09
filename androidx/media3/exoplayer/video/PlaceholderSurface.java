package androidx.media3.exoplayer.video;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;

/* compiled from: PG */
public final class PlaceholderSurface extends Surface {

    /* renamed from: b */
    private static int f11954b;

    /* renamed from: c */
    private static boolean f11955c;

    /* renamed from: a */
    public final boolean f11956a;

    /* renamed from: d */
    private final ccl f11957d;

    /* renamed from: e */
    private boolean f11958e;

    public PlaceholderSurface(ccl ccl, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f11957d = ccl;
        this.f11956a = z;
    }

    /* renamed from: a */
    public static synchronized boolean m4829a() {
        int i;
        synchronized (PlaceholderSurface.class) {
            if (!f11955c) {
                int[] iArr = bjo.f20370a;
                int i2 = bkd.f20408a;
                String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                f11954b = (eglQueryString == null || !eglQueryString.contains("EGL_EXT_protected_content")) ? 0 : bjo.m8943m() ? 1 : 2;
                f11955c = true;
            }
            i = f11954b;
        }
        return i != 0;
    }

    /* renamed from: b */
    public static PlaceholderSurface m4830b(boolean z) {
        boolean z2 = false;
        axu.m47049g(!z || m4829a());
        ccl ccl = new ccl();
        int i = z ? f11954b : 0;
        ccl.start();
        ccl.f120805b = new Handler(ccl.getLooper(), ccl);
        ccl.f120804a = new bjk(ccl.f120805b);
        synchronized (ccl) {
            ccl.f120805b.obtainMessage(1, i, 0).sendToTarget();
            while (ccl.f120808e == null && ccl.f120807d == null && ccl.f120806c == null) {
                try {
                    ccl.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = ccl.f120807d;
        if (runtimeException == null) {
            Error error = ccl.f120806c;
            if (error == null) {
                PlaceholderSurface placeholderSurface = ccl.f120808e;
                axu.m47052j(placeholderSurface);
                return placeholderSurface;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void release() {
        super.release();
        synchronized (this.f11957d) {
            if (!this.f11958e) {
                ccl ccl = this.f11957d;
                axu.m47052j(ccl.f120805b);
                ccl.f120805b.sendEmptyMessage(2);
                this.f11958e = true;
            }
        }
    }
}
