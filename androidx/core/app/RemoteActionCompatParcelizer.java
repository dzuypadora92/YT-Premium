package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(cxr cxr) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f11854a = (IconCompat) cxr.mo10739t(remoteActionCompat.f11854a);
        remoteActionCompat.f11855b = cxr.mo10723d(remoteActionCompat.f11855b, 2);
        remoteActionCompat.f11856c = cxr.mo10723d(remoteActionCompat.f11856c, 3);
        remoteActionCompat.f11857d = (PendingIntent) cxr.mo10721b(remoteActionCompat.f11857d, 4);
        remoteActionCompat.f11858e = cxr.mo10731l(remoteActionCompat.f11858e, 5);
        remoteActionCompat.f11859f = cxr.mo10731l(remoteActionCompat.f11859f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, cxr cxr) {
        cxr.mo10740u(remoteActionCompat.f11854a);
        cxr.mo10726g(remoteActionCompat.f11855b, 2);
        cxr.mo10726g(remoteActionCompat.f11856c, 3);
        cxr.mo10728i(remoteActionCompat.f11857d, 4);
        cxr.mo10725f(remoteActionCompat.f11858e, 5);
        cxr.mo10725f(remoteActionCompat.f11859f, 6);
    }
}
