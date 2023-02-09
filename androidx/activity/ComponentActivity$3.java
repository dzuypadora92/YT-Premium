package androidx.activity;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
public class ComponentActivity$3 implements bcy {

    /* renamed from: a */
    final /* synthetic */ C0702qv f11787a;

    public ComponentActivity$3(C0702qv qvVar) {
        this.f11787a = qvVar;
    }

    /* renamed from: a */
    public final void mo3716a(bda bda, bct bct) {
        if (bct == bct.ON_STOP) {
            Window window = this.f11787a.getWindow();
            View peekDecorView = window != null ? window.peekDecorView() : null;
            if (peekDecorView != null) {
                peekDecorView.cancelPendingInputEvents();
            }
        }
    }
}
