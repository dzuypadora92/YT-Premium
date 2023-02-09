package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: a */
    public static final PorterDuff.Mode f11860a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public int f11861b;

    /* renamed from: c */
    public Object f11862c;

    /* renamed from: d */
    public byte[] f11863d;

    /* renamed from: e */
    public Parcelable f11864e;

    /* renamed from: f */
    public int f11865f;

    /* renamed from: g */
    public int f11866g;

    /* renamed from: h */
    public ColorStateList f11867h;

    /* renamed from: i */
    public PorterDuff.Mode f11868i;

    /* renamed from: j */
    public String f11869j;

    /* renamed from: k */
    public String f11870k;

    public IconCompat() {
        this.f11861b = -1;
        this.f11863d = null;
        this.f11864e = null;
        this.f11865f = 0;
        this.f11866g = 0;
        this.f11867h = null;
        this.f11868i = f11860a;
        this.f11869j = null;
    }

    public IconCompat(int i) {
        this.f11863d = null;
        this.f11864e = null;
        this.f11865f = 0;
        this.f11866g = 0;
        this.f11867h = null;
        this.f11868i = f11860a;
        this.f11869j = null;
        this.f11861b = i;
    }

    /* renamed from: d */
    public static IconCompat m4744d(Bitmap bitmap) {
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f11862c = bitmap;
        return iconCompat;
    }

    /* renamed from: e */
    public static IconCompat m4745e(int i) {
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f11865f = i;
            iconCompat.f11862c = "";
            iconCompat.f11870k = "";
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    /* renamed from: b */
    public final int mo3806b() {
        int i = this.f11861b;
        if (i != -1) {
            return i;
        }
        Object obj = this.f11862c;
        if (Build.VERSION.SDK_INT >= 28) {
            return arc.m73312b(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            new StringBuilder("Unable to get icon type ").append(obj);
            Log.e("IconCompat", "Unable to get icon type ".concat(String.valueOf(obj)), e);
            return -1;
        } catch (InvocationTargetException e2) {
            new StringBuilder("Unable to get icon type ").append(obj);
            Log.e("IconCompat", "Unable to get icon type ".concat(String.valueOf(obj)), e2);
            return -1;
        } catch (NoSuchMethodException e3) {
            new StringBuilder("Unable to get icon type ").append(obj);
            Log.e("IconCompat", "Unable to get icon type ".concat(String.valueOf(obj)), e3);
            return -1;
        }
    }

    public final String toString() {
        String str;
        if (this.f11861b == -1) {
            return String.valueOf(this.f11862c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f11861b) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f11861b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f11862c).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f11862c).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f11870k);
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(mo3805a())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f11865f);
                if (this.f11866g != 0) {
                    sb.append(" off=");
                    sb.append(this.f11866g);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f11862c);
                break;
        }
        if (this.f11867h != null) {
            sb.append(" tint=");
            sb.append(this.f11867h);
        }
        if (this.f11868i != f11860a) {
            sb.append(" mode=");
            sb.append(this.f11868i);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final int mo3805a() {
        int i = this.f11861b;
        if (i == -1) {
            Object obj = this.f11862c;
            if (Build.VERSION.SDK_INT >= 28) {
                return arc.m73311a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon resource", e);
                return 0;
            } catch (InvocationTargetException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            }
        } else if (i == 2) {
            return this.f11865f;
        } else {
            new StringBuilder("called getResId() on ").append(this);
            throw new IllegalStateException("called getResId() on ".concat(toString()));
        }
    }

    /* renamed from: c */
    public final Uri mo3807c() {
        int i = this.f11861b;
        if (i == -1) {
            return ara.m93644c(this.f11862c);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f11862c);
        }
        new StringBuilder("called getUri() on ").append(this);
        throw new IllegalStateException("called getUri() on ".concat(toString()));
    }
}
