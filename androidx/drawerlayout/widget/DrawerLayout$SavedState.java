package androidx.drawerlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* compiled from: PG */
public class DrawerLayout$SavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = new C1710oh(6);

    /* renamed from: a */
    public int f68854a = 0;

    /* renamed from: b */
    public int f68855b;

    /* renamed from: e */
    public int f68856e;

    /* renamed from: f */
    public int f68857f;

    /* renamed from: g */
    public int f68858g;

    public DrawerLayout$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f68854a = parcel.readInt();
        this.f68855b = parcel.readInt();
        this.f68856e = parcel.readInt();
        this.f68857f = parcel.readInt();
        this.f68858g = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f68854a);
        parcel.writeInt(this.f68855b);
        parcel.writeInt(this.f68856e);
        parcel.writeInt(this.f68857f);
        parcel.writeInt(this.f68858g);
    }

    public DrawerLayout$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
