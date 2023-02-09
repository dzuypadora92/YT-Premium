package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new axz(1);

    /* renamed from: a */
    public final IntentSender f11800a;

    /* renamed from: b */
    public final Intent f11801b;

    /* renamed from: c */
    public final int f11802c;

    /* renamed from: d */
    public final int f11803d;

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f11800a = intentSender;
        this.f11801b = intent;
        this.f11802c = i;
        this.f11803d = i2;
    }

    public IntentSenderRequest(Parcel parcel) {
        this.f11800a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f11801b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f11802c = parcel.readInt();
        this.f11803d = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11800a, i);
        parcel.writeParcelable(this.f11801b, i);
        parcel.writeInt(this.f11802c);
        parcel.writeInt(this.f11803d);
    }
}
