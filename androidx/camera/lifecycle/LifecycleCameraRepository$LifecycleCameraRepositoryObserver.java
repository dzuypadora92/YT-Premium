package androidx.camera.lifecycle;

import androidx.lifecycle.OnLifecycleEvent;
import java.util.Set;

/* compiled from: PG */
public class LifecycleCameraRepository$LifecycleCameraRepositoryObserver implements bcz {

    /* renamed from: a */
    public final bda f11807a;

    /* renamed from: b */
    private final amr f11808b;

    public LifecycleCameraRepository$LifecycleCameraRepositoryObserver(bda bda, amr amr, byte[] bArr) {
        this.f11807a = bda;
        this.f11808b = amr;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v6, types: [java.util.Map, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.Map, java.lang.Object] */
    @OnLifecycleEvent(mo3894a = bct.ON_DESTROY)
    public void onDestroy(bda bda) {
        amr amr = this.f11808b;
        synchronized (amr.f110487b) {
            LifecycleCameraRepository$LifecycleCameraRepositoryObserver d = amr.mo41637d(bda);
            if (d != null) {
                amr.mo41639f(bda);
                for (aiy remove : (Set) amr.f110489d.get(d)) {
                    amr.f110488c.remove(remove);
                }
                amr.f110489d.remove(d);
                d.f11807a.getLifecycle().mo29795c(d);
            }
        }
    }

    @OnLifecycleEvent(mo3894a = bct.ON_START)
    public void onStart(bda bda) {
        this.f11808b.mo41638e(bda);
    }

    @OnLifecycleEvent(mo3894a = bct.ON_STOP)
    public void onStop(bda bda) {
        this.f11808b.mo41639f(bda);
    }
}
