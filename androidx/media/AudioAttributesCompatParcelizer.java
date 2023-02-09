package androidx.media;

/* compiled from: PG */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(cxr cxr) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f11935a = (AudioAttributesImpl) cxr.mo10739t(audioAttributesCompat.f11935a);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, cxr cxr) {
        cxr.mo10740u(audioAttributesCompat.f11935a);
    }
}
