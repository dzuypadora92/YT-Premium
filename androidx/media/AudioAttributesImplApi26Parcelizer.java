package androidx.media;

import android.media.AudioAttributes;

/* compiled from: PG */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(cxr cxr) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f68859a = (AudioAttributes) cxr.mo10721b(audioAttributesImplApi26.f68859a, 1);
        audioAttributesImplApi26.f68860b = cxr.mo10720a(audioAttributesImplApi26.f68860b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, cxr cxr) {
        cxr.mo10728i(audioAttributesImplApi26.f68859a, 1);
        cxr.mo10727h(audioAttributesImplApi26.f68860b, 2);
    }
}
