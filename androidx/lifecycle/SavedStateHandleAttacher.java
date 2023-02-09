package androidx.lifecycle;

/* compiled from: PG */
public final class SavedStateHandleAttacher implements bcy {

    /* renamed from: a */
    private final bdx f11928a;

    public SavedStateHandleAttacher(bdx bdx) {
        this.f11928a = bdx;
    }

    /* renamed from: a */
    public final void mo3716a(bda bda, bct bct) {
        if (bct == bct.ON_CREATE) {
            bda.getLifecycle().mo29795c(this);
            this.f11928a.mo51889b();
            return;
        }
        new StringBuilder("Next event must be ON_CREATE, it was ").append(bct);
        throw new IllegalStateException("Next event must be ON_CREATE, it was ".concat(bct.toString()));
    }
}
