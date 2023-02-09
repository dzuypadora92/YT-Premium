package androidx.activity;

/* compiled from: PG */
public class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements bcy, C1761qp {

    /* renamed from: a */
    final /* synthetic */ C1769rb f11790a;

    /* renamed from: b */
    private final bcv f11791b;

    /* renamed from: c */
    private final C1766qy f11792c;

    /* renamed from: d */
    private C1761qp f11793d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(C1769rb rbVar, bcv bcv, C1766qy qyVar) {
        this.f11790a = rbVar;
        this.f11791b = bcv;
        this.f11792c = qyVar;
        bcv.mo29794b(this);
    }

    /* renamed from: a */
    public final void mo3716a(bda bda, bct bct) {
        if (bct == bct.ON_START) {
            this.f11793d = this.f11790a.mo57521a(this.f11792c);
        } else if (bct == bct.ON_STOP) {
            C1761qp qpVar = this.f11793d;
            if (qpVar != null) {
                qpVar.mo3717b();
            }
        } else if (bct == bct.ON_DESTROY) {
            mo3717b();
        }
    }

    /* renamed from: b */
    public final void mo3717b() {
        this.f11791b.mo29795c(this);
        this.f11792c.mo57439d(this);
        C1761qp qpVar = this.f11793d;
        if (qpVar != null) {
            qpVar.mo3717b();
            this.f11793d = null;
        }
    }
}
