package androidx.camera.lifecycle;

import androidx.lifecycle.OnLifecycleEvent;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public final class LifecycleCamera implements bcz, aai {

    /* renamed from: a */
    public final Object f68847a = new Object();

    /* renamed from: b */
    public final bda f68848b;

    /* renamed from: c */
    public final aih f68849c;

    /* renamed from: d */
    public boolean f68850d = false;

    /* renamed from: e */
    private volatile boolean f68851e = false;

    public LifecycleCamera(bda bda, aih aih) {
        this.f68848b = bda;
        this.f68849c = aih;
        if (((bdb) bda.getLifecycle()).f77080b.mo51856a(bcu.STARTED)) {
            aih.mo2684d();
        } else {
            aih.mo2685e();
        }
        bda.getLifecycle().mo29794b(this);
    }

    /* renamed from: a */
    public final bda mo28469a() {
        bda bda;
        synchronized (this.f68847a) {
            bda = this.f68848b;
        }
        return bda;
    }

    /* renamed from: b */
    public final aal mo2682b() {
        return this.f68849c.f5797a.mo37147e();
    }

    /* renamed from: c */
    public final aap mo2683c() {
        return this.f68849c.f5797a.mo37148f();
    }

    /* renamed from: d */
    public final List mo28470d() {
        List unmodifiableList;
        synchronized (this.f68847a) {
            unmodifiableList = Collections.unmodifiableList(this.f68849c.mo2681a());
        }
        return unmodifiableList;
    }

    /* renamed from: e */
    public final void mo28471e() {
        synchronized (this.f68847a) {
            if (!this.f68850d) {
                onStop(this.f68848b);
                this.f68850d = true;
            }
        }
    }

    @OnLifecycleEvent(mo3894a = bct.ON_DESTROY)
    public void onDestroy(bda bda) {
        synchronized (this.f68847a) {
            aih aih = this.f68849c;
            aih.mo2686f(aih.mo2681a());
        }
    }

    @OnLifecycleEvent(mo3894a = bct.ON_PAUSE)
    public void onPause(bda bda) {
        this.f68849c.mo2687g(false);
    }

    @OnLifecycleEvent(mo3894a = bct.ON_RESUME)
    public void onResume(bda bda) {
        this.f68849c.mo2687g(true);
    }

    @OnLifecycleEvent(mo3894a = bct.ON_START)
    public void onStart(bda bda) {
        synchronized (this.f68847a) {
            if (!this.f68850d) {
                this.f68849c.mo2684d();
                this.f68851e = true;
            }
        }
    }

    @OnLifecycleEvent(mo3894a = bct.ON_STOP)
    public void onStop(bda bda) {
        synchronized (this.f68847a) {
            if (!this.f68850d) {
                this.f68849c.mo2685e();
                this.f68851e = false;
            }
        }
    }
}
