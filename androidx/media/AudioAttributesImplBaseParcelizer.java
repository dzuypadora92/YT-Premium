package androidx.media;

/* compiled from: PG */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(cxr cxr) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f68861a = cxr.mo10720a(audioAttributesImplBase.f68861a, 1);
        audioAttributesImplBase.f68862b = cxr.mo10720a(audioAttributesImplBase.f68862b, 2);
        audioAttributesImplBase.f68863c = cxr.mo10720a(audioAttributesImplBase.f68863c, 3);
        audioAttributesImplBase.f68864d = cxr.mo10720a(audioAttributesImplBase.f68864d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, cxr cxr) {
        cxr.mo10727h(audioAttributesImplBase.f68861a, 1);
        cxr.mo10727h(audioAttributesImplBase.f68862b, 2);
        cxr.mo10727h(audioAttributesImplBase.f68863c, 3);
        cxr.mo10727h(audioAttributesImplBase.f68864d, 4);
    }
}
