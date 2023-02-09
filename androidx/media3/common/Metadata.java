package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new axz(4);

    /* renamed from: a */
    public final Entry[] f11945a;

    /* renamed from: b */
    public final long f11946b;

    /* compiled from: PG */
    public interface Entry extends Parcelable {
        /* renamed from: a */
        bgy mo3930a();

        /* renamed from: b */
        void mo3931b(bhs bhs);

        /* renamed from: c */
        byte[] mo3932c();
    }

    public Metadata(long j, Entry... entryArr) {
        this.f11946b = j;
        this.f11945a = entryArr;
    }

    public Metadata(Parcel parcel) {
        this.f11945a = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.f11945a;
            if (i < entryArr.length) {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                this.f11946b = parcel.readLong();
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo3921a() {
        return this.f11945a.length;
    }

    /* renamed from: b */
    public final Entry mo3922b(int i) {
        return this.f11945a[i];
    }

    /* renamed from: c */
    public final Metadata mo3923c(Entry... entryArr) {
        if (entryArr.length == 0) {
            return this;
        }
        return new Metadata(this.f11946b, (Entry[]) bkd.m9078am(this.f11945a, entryArr));
    }

    /* renamed from: d */
    public final Metadata mo3924d(Metadata metadata) {
        return metadata == null ? this : mo3923c(metadata.f11945a);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Metadata metadata = (Metadata) obj;
            return Arrays.equals(this.f11945a, metadata.f11945a) && this.f11946b == metadata.f11946b;
        }
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f11945a) * 31) + aefh.m40577G(this.f11946b);
    }

    public final String toString() {
        String str;
        String arrays = Arrays.toString(this.f11945a);
        long j = this.f11946b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        return "entries=" + arrays + str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11945a.length);
        for (Entry writeParcelable : this.f11945a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
        parcel.writeLong(this.f11946b);
    }

    public Metadata(List list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Entry... entryArr) {
        this(-9223372036854775807L, entryArr);
    }
}
