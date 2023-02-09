package androidx.lifecycle;

/* compiled from: PG */
public final class DefaultLifecycleObserverAdapter implements bcy {

    /* renamed from: a */
    private final bcn f11920a;

    /* renamed from: b */
    private final bcy f11921b;

    public DefaultLifecycleObserverAdapter(bcn bcn, bcy bcy) {
        this.f11920a = bcn;
        this.f11921b = bcy;
    }

    /* renamed from: a */
    public final void mo3716a(bda bda, bct bct) {
        switch (bct.ordinal()) {
            case 0:
                this.f11920a.mo3725mw(bda);
                break;
            case 1:
                this.f11920a.mo3727pk(bda);
                break;
            case 2:
                this.f11920a.mo3724md(bda);
                break;
            case 3:
                this.f11920a.mo3723mE(bda);
                break;
            case 4:
                this.f11920a.mo3728pp(bda);
                break;
            case 5:
                this.f11920a.mo3726pe(bda);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        bcy bcy = this.f11921b;
        if (bcy != null) {
            bcy.mo3716a(bda, bct);
        }
    }
}
