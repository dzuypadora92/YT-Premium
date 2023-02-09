package androidx.media;

import android.media.AudioAttributes;

/* compiled from: PG */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(cxr cxr) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f68859a = (AudioAttributes) cxr.mo10721b(audioAttributesImplApi21.f68859a, 1);
        audioAttributesImplApi21.f68860b = cxr.mo10720a(audioAttributesImplApi21.f68860b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, cxr cxr) {
        cxr.mo10728i(audioAttributesImplApi21.f68859a, 1);
        cxr.mo10727h(audioAttributesImplApi21.f68860b, 2);
    }
}
