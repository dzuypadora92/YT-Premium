package androidx.media3.extractor.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;

/* compiled from: PG */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = new axz(6);

    /* renamed from: a */
    public final int f11959a;

    /* renamed from: b */
    public final String f11960b;

    public AppInfoTable(int i, String str) {
        this.f11959a = i;
        this.f11960b = str;
    }

    /* renamed from: a */
    public final /* synthetic */ bgy mo3930a() {
        return null;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo3931b(bhs bhs) {
    }

    /* renamed from: c */
    public final /* synthetic */ byte[] mo3932c() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        int i = this.f11959a;
        String str = this.f11960b;
        return "Ait(controlCode=" + i + ",url=" + str + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11960b);
        parcel.writeInt(this.f11959a);
    }
}
