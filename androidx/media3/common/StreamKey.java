package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class StreamKey implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new axz(5);

    /* renamed from: a */
    public final int f11947a;

    /* renamed from: b */
    public final int f11948b;

    /* renamed from: c */
    public final int f11949c;

    public StreamKey() {
        this.f11947a = -1;
        this.f11948b = -1;
        this.f11949c = -1;
    }

    public StreamKey(Parcel parcel) {
        this.f11947a = parcel.readInt();
        this.f11948b = parcel.readInt();
        this.f11949c = parcel.readInt();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        StreamKey streamKey = (StreamKey) obj;
        int i = this.f11947a - streamKey.f11947a;
        if (i != 0) {
            return i;
        }
        int i2 = this.f11948b - streamKey.f11948b;
        return i2 == 0 ? this.f11949c - streamKey.f11949c : i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            StreamKey streamKey = (StreamKey) obj;
            return this.f11947a == streamKey.f11947a && this.f11948b == streamKey.f11948b && this.f11949c == streamKey.f11949c;
        }
    }

    public final int hashCode() {
        return (((this.f11947a * 31) + this.f11948b) * 31) + this.f11949c;
    }

    public final String toString() {
        int i = this.f11947a;
        int i2 = this.f11948b;
        int i3 = this.f11949c;
        return i + "." + i2 + "." + i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11947a);
        parcel.writeInt(this.f11948b);
        parcel.writeInt(this.f11949c);
    }
}
