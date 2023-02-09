package androidx.lifecycle;

/* compiled from: PG */
public class LiveData$LifecycleBoundObserver extends bdg implements bcy {

    /* renamed from: a */
    final bda f11924a;

    /* renamed from: b */
    final /* synthetic */ bdh f11925b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveData$LifecycleBoundObserver(bdh bdh, bda bda, bdl bdl) {
        super(bdh, bdl);
        this.f11925b = bdh;
        this.f11924a = bda;
    }

    /* renamed from: a */
    public final void mo3716a(bda bda, bct bct) {
        bcu a = this.f11924a.getLifecycle().mo29793a();
        if (a != bcu.DESTROYED) {
            bcu bcu = null;
            while (bcu != a) {
                mo51857d(mo3893kM());
                bcu = a;
                a = this.f11924a.getLifecycle().mo29793a();
            }
            return;
        }
        this.f11925b.mo42935l(this.f150696c);
    }

    /* renamed from: b */
    public final void mo3891b() {
        this.f11924a.getLifecycle().mo29795c(this);
    }

    /* renamed from: c */
    public final boolean mo3892c(bda bda) {
        return this.f11924a == bda;
    }

    /* renamed from: kM */
    public final boolean mo3893kM() {
        return this.f11924a.getLifecycle().mo29793a().mo51856a(bcu.STARTED);
    }
}
