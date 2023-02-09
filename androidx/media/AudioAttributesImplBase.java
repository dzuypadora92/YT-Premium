package androidx.media;

import java.util.Arrays;

/* compiled from: PG */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f68861a = 0;

    /* renamed from: b */
    public int f68862b = 0;

    /* renamed from: c */
    public int f68863c = 0;

    /* renamed from: d */
    public int f68864d = -1;

    /* renamed from: a */
    public final Object mo3907a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f68862b == audioAttributesImplBase.f68862b) {
            int i = this.f68863c;
            int i2 = audioAttributesImplBase.f68863c;
            int i3 = audioAttributesImplBase.f68864d;
            if (i3 == -1) {
                i3 = AudioAttributesCompat.m4812b(i2, audioAttributesImplBase.f68861a);
            }
            if (i3 == 6) {
                i2 |= 4;
            } else if (i3 == 7) {
                i2 |= 1;
            }
            if (i == (i2 & 273) && this.f68861a == audioAttributesImplBase.f68861a && this.f68864d == audioAttributesImplBase.f68864d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f68862b), Integer.valueOf(this.f68863c), Integer.valueOf(this.f68861a), Integer.valueOf(this.f68864d)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f68864d != -1) {
            sb.append(" stream=");
            sb.append(this.f68864d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m4811a(this.f68861a));
        sb.append(" content=");
        sb.append(this.f68862b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f68863c).toUpperCase());
        return sb.toString();
    }
}
