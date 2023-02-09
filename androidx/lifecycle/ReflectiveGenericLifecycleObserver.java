package androidx.lifecycle;

import java.util.List;

@Deprecated
/* compiled from: PG */
public class ReflectiveGenericLifecycleObserver implements bcy {

    /* renamed from: a */
    private final Object f11926a;

    /* renamed from: b */
    private final bck f11927b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f11926a = obj;
        this.f11927b = bcm.f150683a.mo51849b(obj.getClass());
    }

    /* renamed from: a */
    public final void mo3716a(bda bda, bct bct) {
        bck bck = this.f11927b;
        Object obj = this.f11926a;
        bck.m95545a((List) bck.f150679a.get(bct), bda, bct, obj);
        bck.m95545a((List) bck.f150679a.get(bct.ON_ANY), bda, bct, obj);
    }
}
