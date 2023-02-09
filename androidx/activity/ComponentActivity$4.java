package androidx.activity;

/* compiled from: PG */
public class ComponentActivity$4 implements bcy {

    /* renamed from: a */
    final /* synthetic */ C0702qv f11788a;

    public ComponentActivity$4(C0702qv qvVar) {
        this.f11788a = qvVar;
    }

    /* renamed from: a */
    public final void mo3716a(bda bda, bct bct) {
        if (bct == bct.ON_DESTROY) {
            this.f11788a.mContextAwareHelper.f167153b = null;
            if (!this.f11788a.isChangingConfigurations()) {
                this.f11788a.getViewModelStore().mo51902c();
            }
        }
    }
}
