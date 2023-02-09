package androidx.core.view;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
public final /* synthetic */ class MenuHostHelper$$ExternalSyntheticLambda1 implements bcy {

    /* renamed from: a */
    public final /* synthetic */ atx f11873a;

    /* renamed from: b */
    public final /* synthetic */ bcu f11874b;

    /* renamed from: c */
    public final /* synthetic */ atz f11875c;

    public /* synthetic */ MenuHostHelper$$ExternalSyntheticLambda1(atx atx, bcu bcu, atz atz) {
        this.f11873a = atx;
        this.f11874b = bcu;
        this.f11875c = atz;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, java.lang.Runnable] */
    /* renamed from: a */
    public final void mo3716a(bda bda, bct bct) {
        atx atx = this.f11873a;
        bcu bcu = this.f11874b;
        atz atz = this.f11875c;
        if (bct == bct.m95556b(bcu)) {
            atx.mo5668a(atz);
        } else if (bct == bct.ON_DESTROY) {
            atx.mo5671d(atz);
        } else if (bct == bct.m95555a(bcu)) {
            ((CopyOnWriteArrayList) atx.f18896b).remove(atz);
            atx.f18895a.run();
        }
    }
}
