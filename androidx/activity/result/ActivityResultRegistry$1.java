package androidx.activity.result;

/* compiled from: PG */
public class ActivityResultRegistry$1 implements bcy {

    /* renamed from: a */
    final /* synthetic */ String f11796a;

    /* renamed from: b */
    final /* synthetic */ C1774rf f11797b;

    /* renamed from: c */
    final /* synthetic */ C0708rn f11798c;

    /* renamed from: d */
    final /* synthetic */ C0705rk f11799d;

    public ActivityResultRegistry$1(C0705rk rkVar, String str, C1774rf rfVar, C0708rn rnVar) {
        this.f11799d = rkVar;
        this.f11796a = str;
        this.f11797b = rfVar;
        this.f11798c = rnVar;
    }

    /* renamed from: a */
    public final void mo3716a(bda bda, bct bct) {
        if (bct.ON_START.equals(bct)) {
            this.f11799d.f50637e.put(this.f11796a, new bbc(this.f11797b, this.f11798c));
            if (this.f11799d.f50638f.containsKey(this.f11796a)) {
                Object obj = this.f11799d.f50638f.get(this.f11796a);
                this.f11799d.f50638f.remove(this.f11796a);
                this.f11797b.mo26709a(obj);
            }
            ActivityResult activityResult = (ActivityResult) this.f11799d.f50639g.getParcelable(this.f11796a);
            if (activityResult != null) {
                this.f11799d.f50639g.remove(this.f11796a);
                this.f11797b.mo26709a(this.f11798c.mo21449b(activityResult.f11794a, activityResult.f11795b));
            }
        } else if (bct.ON_STOP.equals(bct)) {
            this.f11799d.f50637e.remove(this.f11796a);
        } else if (bct.ON_DESTROY.equals(bct)) {
            this.f11799d.mo21365d(this.f11796a);
        }
    }
}
