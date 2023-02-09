package androidx.media;

import android.media.AudioAttributes;

/* compiled from: PG */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f68859a;

    /* renamed from: b */
    public int f68860b = -1;

    public AudioAttributesImplApi21() {
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.f68859a = audioAttributes;
    }

    /* renamed from: a */
    public final Object mo3907a() {
        return this.f68859a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f68859a.equals(((AudioAttributesImplApi21) obj).f68859a);
    }

    public final int hashCode() {
        return this.f68859a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat: audioattributes=");
        AudioAttributes audioAttributes = this.f68859a;
        sb.append(audioAttributes);
        return "AudioAttributesCompat: audioattributes=".concat(String.valueOf(audioAttributes));
    }
}
