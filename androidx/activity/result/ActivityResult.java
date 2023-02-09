package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new cxp(1);

    /* renamed from: a */
    public final int f11794a;

    /* renamed from: b */
    public final Intent f11795b;

    public ActivityResult(int i, Intent intent) {
        this.f11794a = i;
        this.f11795b = intent;
    }

    public ActivityResult(Parcel parcel) {
        this.f11794a = parcel.readInt();
        this.f11795b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f11794a;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f11795b);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11794a);
        parcel.writeInt(this.f11795b == null ? 0 : 1);
        Intent intent = this.f11795b;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
