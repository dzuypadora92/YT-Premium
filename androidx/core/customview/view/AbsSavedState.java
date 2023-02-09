package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1710oh(5);

    /* renamed from: c */
    public static final AbsSavedState f11913c = new AbsSavedState() {
    };

    /* renamed from: d */
    public final Parcelable f11914d;

    public AbsSavedState() {
        this.f11914d = null;
    }

    protected AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f11914d = readParcelable == null ? f11913c : readParcelable;
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11914d, i);
    }

    protected AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f11914d = parcelable == f11913c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }
}
