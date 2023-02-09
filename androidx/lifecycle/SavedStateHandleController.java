package androidx.lifecycle;

/* compiled from: PG */
public final class SavedStateHandleController implements bcy {

    /* renamed from: a */
    public boolean f11929a = false;

    /* renamed from: b */
    public final bdu f11930b;

    /* renamed from: c */
    private final String f11931c;

    public SavedStateHandleController(String str, bdu bdu) {
        this.f11931c = str;
        this.f11930b = bdu;
    }

    /* renamed from: a */
    public final void mo3716a(bda bda, bct bct) {
        if (bct == bct.ON_DESTROY) {
            this.f11929a = false;
            bda.getLifecycle().mo29795c(this);
        }
    }

    /* renamed from: b */
    public final void mo3903b(ctm ctm, bcv bcv) {
        if (!this.f11929a) {
            this.f11929a = true;
            bcv.mo29794b(this);
            ctm.mo31670c(this.f11931c, this.f11930b.f150719f);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }
}
