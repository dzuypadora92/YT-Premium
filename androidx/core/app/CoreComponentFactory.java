package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

/* compiled from: PG */
public class CoreComponentFactory extends AppComponentFactory {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = ((p000.anj) r1).mo28636a();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Object m4743a(java.lang.Object r1) {
        /*
            boolean r0 = r1 instanceof p000.anj
            if (r0 == 0) goto L_0x000e
            r0 = r1
            anj r0 = (p000.anj) r0
            java.lang.Object r0 = r0.mo28636a()
            if (r0 == 0) goto L_0x000e
            return r0
        L_0x000e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.CoreComponentFactory.m4743a(java.lang.Object):java.lang.Object");
    }

    public final Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) m4743a(super.instantiateActivity(classLoader, str, intent));
    }

    public final Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) m4743a(super.instantiateApplication(classLoader, str));
    }

    public final ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) m4743a(super.instantiateProvider(classLoader, str));
    }

    public final BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) m4743a(super.instantiateReceiver(classLoader, str, intent));
    }

    public final Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return (Service) m4743a(super.instantiateService(classLoader, str, intent));
    }
}
