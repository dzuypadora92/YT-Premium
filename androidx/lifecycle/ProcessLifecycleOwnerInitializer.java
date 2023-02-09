package androidx.lifecycle;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: PG */
public class ProcessLifecycleOwnerInitializer extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onCreate() {
        /*
            r7 = this;
            java.lang.String r0 = "androidx.lifecycle.ProcessLifecycleInitializer"
            r1 = 1
            java.lang.String r2 = "cuj"
            java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x0034 }
            java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0034 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{  }
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{  }
            java.lang.reflect.Constructor r3 = r0.getDeclaredConstructor(r3)     // Catch:{  }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{  }
            java.lang.Object r3 = r3.newInstance(r4)     // Catch:{  }
            java.lang.String r4 = "create"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{  }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r2] = r6     // Catch:{  }
            java.lang.reflect.Method r0 = r0.getMethod(r4, r5)     // Catch:{  }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{  }
            android.content.Context r5 = r7.getContext()     // Catch:{  }
            r4[r2] = r5     // Catch:{  }
            r0.invoke(r3, r4)     // Catch:{  }
            goto L_0x0071
        L_0x0034:
            android.content.Context r0 = r7.getContext()
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.bcx.f150692a
            boolean r2 = r2.getAndSet(r1)
            if (r2 != 0) goto L_0x004f
            android.content.Context r0 = r0.getApplicationContext()
            android.app.Application r0 = (android.app.Application) r0
            bcw r2 = new bcw
            r2.<init>()
            r0.registerActivityLifecycleCallbacks(r2)
        L_0x004f:
            android.content.Context r0 = r7.getContext()
            bdp r2 = p000.bdp.f77092a
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            r2.f77096e = r3
            bdb r3 = r2.f77097f
            bct r4 = p000.bct.ON_CREATE
            r3.mo29796d(r4)
            android.content.Context r0 = r0.getApplicationContext()
            android.app.Application r0 = (android.app.Application) r0
            bdn r3 = new bdn
            r3.<init>(r2)
            r0.registerActivityLifecycleCallbacks(r3)
        L_0x0071:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.ProcessLifecycleOwnerInitializer.onCreate():boolean");
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
