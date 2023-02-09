package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
public final class DrmInitData implements Comparator, Parcelable {
    public static final Parcelable.Creator CREATOR = new axz(2);

    /* renamed from: a */
    public final SchemeData[] f11936a;

    /* renamed from: b */
    public final String f11937b;

    /* renamed from: c */
    public final int f11938c;

    /* renamed from: d */
    private int f11939d;

    public DrmInitData(Parcel parcel) {
        this.f11937b = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i = bkd.f20408a;
        this.f11936a = schemeDataArr;
        this.f11938c = schemeDataArr.length;
    }

    /* renamed from: a */
    public final SchemeData mo3908a(int i) {
        return this.f11936a[i];
    }

    /* renamed from: b */
    public final DrmInitData mo3909b(String str) {
        if (bkd.m9067ab(this.f11937b, str)) {
            return this;
        }
        return new DrmInitData(str, false, this.f11936a);
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        SchemeData schemeData = (SchemeData) obj;
        SchemeData schemeData2 = (SchemeData) obj2;
        if (bgn.f20004a.equals(schemeData.f11940a)) {
            return !bgn.f20004a.equals(schemeData2.f11940a) ? 1 : 0;
        }
        return schemeData.f11940a.compareTo(schemeData2.f11940a);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DrmInitData drmInitData = (DrmInitData) obj;
            return bkd.m9067ab(this.f11937b, drmInitData.f11937b) && Arrays.equals(this.f11936a, drmInitData.f11936a);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11937b);
        parcel.writeTypedArray(this.f11936a, 0);
    }

    public final int hashCode() {
        int i;
        int i2 = this.f11939d;
        if (i2 != 0) {
            return i2;
        }
        String str = this.f11937b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = (i * 31) + Arrays.hashCode(this.f11936a);
        this.f11939d = hashCode;
        return hashCode;
    }

    /* compiled from: PG */
    public final class SchemeData implements Parcelable {
        public static final Parcelable.Creator CREATOR = new axz(3);

        /* renamed from: a */
        public final UUID f11940a;

        /* renamed from: b */
        public final String f11941b;

        /* renamed from: c */
        public final String f11942c;

        /* renamed from: d */
        public final byte[] f11943d;

        /* renamed from: e */
        private int f11944e;

        public SchemeData(Parcel parcel) {
            this.f11940a = new UUID(parcel.readLong(), parcel.readLong());
            this.f11941b = parcel.readString();
            String readString = parcel.readString();
            int i = bkd.f20408a;
            this.f11942c = readString;
            this.f11943d = parcel.createByteArray();
        }

        /* renamed from: a */
        public final boolean mo3915a() {
            return this.f11943d != null;
        }

        /* renamed from: b */
        public final boolean mo3916b(UUID uuid) {
            return bgn.f20004a.equals(this.f11940a) || uuid.equals(this.f11940a);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return bkd.m9067ab(this.f11941b, schemeData.f11941b) && bkd.m9067ab(this.f11942c, schemeData.f11942c) && bkd.m9067ab(this.f11940a, schemeData.f11940a) && Arrays.equals(this.f11943d, schemeData.f11943d);
        }

        public final int hashCode() {
            int i;
            int i2 = this.f11944e;
            if (i2 != 0) {
                return i2;
            }
            int hashCode = this.f11940a.hashCode() * 31;
            String str = this.f11941b;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            int hashCode2 = ((((hashCode + i) * 31) + this.f11942c.hashCode()) * 31) + Arrays.hashCode(this.f11943d);
            this.f11944e = hashCode2;
            return hashCode2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f11940a.getMostSignificantBits());
            parcel.writeLong(this.f11940a.getLeastSignificantBits());
            parcel.writeString(this.f11941b);
            parcel.writeString(this.f11942c);
            parcel.writeByteArray(this.f11943d);
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            axu.m47052j(uuid);
            this.f11940a = uuid;
            this.f11941b = str;
            axu.m47052j(str2);
            this.f11942c = str2;
            this.f11943d = bArr;
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, (String) null, str, bArr);
        }
    }

    public DrmInitData(String str, List list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: androidx.media3.common.DrmInitData$SchemeData[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private DrmInitData(java.lang.String r1, boolean r2, androidx.media3.common.DrmInitData.SchemeData... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f11937b = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            androidx.media3.common.DrmInitData$SchemeData[] r3 = (androidx.media3.common.DrmInitData.SchemeData[]) r3
        L_0x000e:
            r0.f11936a = r3
            int r1 = r3.length
            r0.f11938c = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.DrmInitData.<init>(java.lang.String, boolean, androidx.media3.common.DrmInitData$SchemeData[]):void");
    }

    public DrmInitData(List list) {
        this((String) null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, true, schemeDataArr);
    }
}
