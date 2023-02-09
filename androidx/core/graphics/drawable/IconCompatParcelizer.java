package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* compiled from: PG */
public class IconCompatParcelizer {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.graphics.drawable.IconCompat read(p000.cxr r5) {
        /*
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.f11861b
            r2 = 1
            int r1 = r5.mo10720a(r1, r2)
            r0.f11861b = r1
            byte[] r1 = r0.f11863d
            r2 = 2
            boolean r3 = r5.mo10738s(r2)
            if (r3 == 0) goto L_0x0028
            android.os.Parcel r1 = r5.f26212d
            int r1 = r1.readInt()
            if (r1 >= 0) goto L_0x0021
            r1 = 0
            goto L_0x0028
        L_0x0021:
            byte[] r1 = new byte[r1]
            android.os.Parcel r3 = r5.f26212d
            r3.readByteArray(r1)
        L_0x0028:
            r0.f11863d = r1
            android.os.Parcelable r1 = r0.f11864e
            r3 = 3
            android.os.Parcelable r1 = r5.mo10721b(r1, r3)
            r0.f11864e = r1
            int r1 = r0.f11865f
            r4 = 4
            int r1 = r5.mo10720a(r1, r4)
            r0.f11865f = r1
            int r1 = r0.f11866g
            r4 = 5
            int r1 = r5.mo10720a(r1, r4)
            r0.f11866g = r1
            android.content.res.ColorStateList r1 = r0.f11867h
            r4 = 6
            android.os.Parcelable r1 = r5.mo10721b(r1, r4)
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.f11867h = r1
            java.lang.String r1 = r0.f11869j
            r4 = 7
            java.lang.String r1 = r5.mo10724e(r1, r4)
            r0.f11869j = r1
            java.lang.String r1 = r0.f11870k
            r4 = 8
            java.lang.String r5 = r5.mo10724e(r1, r4)
            r0.f11870k = r5
            java.lang.String r5 = r0.f11869j
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.valueOf(r5)
            r0.f11868i = r5
            int r5 = r0.f11861b
            r1 = 0
            switch(r5) {
                case -1: goto L_0x00af;
                case 0: goto L_0x0071;
                case 1: goto L_0x009e;
                case 2: goto L_0x0077;
                case 3: goto L_0x0072;
                case 4: goto L_0x0077;
                case 5: goto L_0x009e;
                case 6: goto L_0x0077;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x00be
        L_0x0072:
            byte[] r5 = r0.f11863d
            r0.f11862c = r5
            goto L_0x00be
        L_0x0077:
            java.lang.String r5 = new java.lang.String
            byte[] r3 = r0.f11863d
            java.lang.String r4 = "UTF-16"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r5.<init>(r3, r4)
            r0.f11862c = r5
            int r5 = r0.f11861b
            if (r5 != r2) goto L_0x00be
            java.lang.String r5 = r0.f11870k
            if (r5 != 0) goto L_0x00be
            java.lang.Object r5 = r0.f11862c
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r2 = ":"
            r3 = -1
            java.lang.String[] r5 = r5.split(r2, r3)
            r5 = r5[r1]
            r0.f11870k = r5
            goto L_0x00be
        L_0x009e:
            android.os.Parcelable r5 = r0.f11864e
            if (r5 == 0) goto L_0x00a3
            goto L_0x00b3
        L_0x00a3:
            byte[] r5 = r0.f11863d
            r0.f11862c = r5
            r0.f11861b = r3
            r0.f11865f = r1
            int r5 = r5.length
            r0.f11866g = r5
            goto L_0x00be
        L_0x00af:
            android.os.Parcelable r5 = r0.f11864e
            if (r5 == 0) goto L_0x00b6
        L_0x00b3:
            r0.f11862c = r5
            goto L_0x00be
        L_0x00b6:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid icon"
            r5.<init>(r0)
            throw r5
        L_0x00be:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.read(cxr):androidx.core.graphics.drawable.IconCompat");
    }

    public static void write(IconCompat iconCompat, cxr cxr) {
        iconCompat.f11869j = iconCompat.f11868i.name();
        switch (iconCompat.f11861b) {
            case -1:
                iconCompat.f11864e = (Parcelable) iconCompat.f11862c;
                break;
            case 1:
            case 5:
                iconCompat.f11864e = (Parcelable) iconCompat.f11862c;
                break;
            case 2:
                iconCompat.f11863d = ((String) iconCompat.f11862c).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f11863d = (byte[]) iconCompat.f11862c;
                break;
            case 4:
            case 6:
                iconCompat.f11863d = iconCompat.f11862c.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f11861b;
        if (i != -1) {
            cxr.mo10727h(i, 1);
        }
        byte[] bArr = iconCompat.f11863d;
        if (bArr != null) {
            cxr.mo10735p(2);
            cxr.f26212d.writeInt(bArr.length);
            cxr.f26212d.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f11864e;
        if (parcelable != null) {
            cxr.mo10728i(parcelable, 3);
        }
        int i2 = iconCompat.f11865f;
        if (i2 != 0) {
            cxr.mo10727h(i2, 4);
        }
        int i3 = iconCompat.f11866g;
        if (i3 != 0) {
            cxr.mo10727h(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f11867h;
        if (colorStateList != null) {
            cxr.mo10728i(colorStateList, 6);
        }
        String str = iconCompat.f11869j;
        if (str != null) {
            cxr.mo10729j(str, 7);
        }
        String str2 = iconCompat.f11870k;
        if (str2 != null) {
            cxr.mo10729j(str2, 8);
        }
    }
}
