package androidx.media3.decoder.opus;

import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* compiled from: PG */
public final class OpusDecoder extends bmm {

    /* renamed from: a */
    public final boolean f68867a;

    /* renamed from: b */
    public final int f68868b;

    /* renamed from: c */
    public boolean f68869c;

    /* renamed from: d */
    private final CryptoConfig f68870d;

    /* renamed from: e */
    private final int f68871e;

    /* renamed from: f */
    private final int f68872f;

    /* renamed from: g */
    private final long f68873g;

    /* renamed from: h */
    private int f68874h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpusDecoder(int i, List list, CryptoConfig cryptoConfig, boolean z) {
        super(new bmi[16], new SimpleDecoderOutputBuffer[16]);
        int i2;
        byte b;
        byte b2;
        List list2 = list;
        CryptoConfig cryptoConfig2 = cryptoConfig;
        boolean z2 = z;
        if (OpusLibrary.m4825a()) {
            this.f68870d = cryptoConfig2;
            if (cryptoConfig2 == null || OpusLibrary.opusIsSecureDecodeSupported()) {
                int size = list.size();
                if (size != 1) {
                    if (size != 3) {
                        throw new bmt("Invalid initialization data size");
                    } else if (!(((byte[]) list2.get(1)).length == 8 && ((byte[]) list2.get(2)).length == 8)) {
                        throw new bmt("Invalid pre-skip or seek pre-roll");
                    }
                }
                if (list.size() == 3) {
                    i2 = (int) ((ByteBuffer.wrap((byte[]) list2.get(1)).order(ByteOrder.nativeOrder()).getLong() * 48000) / 1000000000);
                } else {
                    byte[] bArr = (byte[]) list2.get(0);
                    i2 = (bArr[10] & 255) | ((bArr[11] & 255) << 8);
                }
                this.f68871e = i2;
                this.f68872f = list.size() == 3 ? (int) ((ByteBuffer.wrap((byte[]) list2.get(2)).order(ByteOrder.nativeOrder()).getLong() * 48000) / 1000000000) : 3840;
                this.f68874h = i2;
                byte[] bArr2 = (byte[]) list2.get(0);
                int length = bArr2.length;
                if (length >= 19) {
                    byte b3 = bArr2[9] & 255;
                    this.f68868b = b3;
                    if (b3 <= 8) {
                        byte b4 = bArr2[16] & 255;
                        byte b5 = bArr2[17] & 255;
                        byte[] bArr3 = new byte[8];
                        if (bArr2[18] == 0) {
                            if (b3 <= 2) {
                                byte b6 = b3 == 2 ? (byte) 1 : 0;
                                bArr3[0] = 0;
                                bArr3[1] = 1;
                                b = b6;
                                b2 = 1;
                            } else {
                                throw new bmt("Invalid header, missing stream map");
                            }
                        } else if (length >= b3 + 21) {
                            System.arraycopy(bArr2, 21, bArr3, 0, b3);
                            b = bArr2[20] & 255;
                            b2 = bArr2[19] & 255;
                        } else {
                            throw new bmt("Invalid header length");
                        }
                        long opusInit = opusInit(48000, b3, b2, b, (short) ((b5 << 8) | b4), bArr3);
                        this.f68873g = opusInit;
                        if (opusInit != 0) {
                            mo7186l(i);
                            this.f68867a = z2;
                            if (z2) {
                                opusSetFloatOutput();
                                return;
                            }
                            return;
                        }
                        throw new bmt("Failed to initialize decoder");
                    }
                    throw new bmt("Invalid channel count: " + b3);
                }
                throw new bmt("Invalid header length");
            }
            throw new bmt("Opus decoder does not support secure decode");
        }
        throw new bmt("Failed to load decoder native libraries");
    }

    /* renamed from: n */
    private static int m43873n(int i, int i2, boolean z) {
        return i * i2 * (true != z ? 2 : 4);
    }

    private native void opusClose(long j);

    private native int opusDecode(long j, long j2, ByteBuffer byteBuffer, int i, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer);

    private native int opusGetErrorCode(long j);

    private native String opusGetErrorMessage(long j);

    private native long opusInit(int i, int i2, int i3, int i4, int i5, byte[] bArr);

    private native void opusReset(long j);

    private native int opusSecureDecode(long j, long j2, ByteBuffer byteBuffer, int i, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, int i2, CryptoConfig cryptoConfig, int i3, byte[] bArr, byte[] bArr2, int i4, int[] iArr, int[] iArr2);

    private native void opusSetFloatOutput();

    /* renamed from: c */
    public final String mo28490c() {
        return "libopus".concat(String.valueOf(OpusLibrary.m4825a() ? OpusLibrary.opusGetVersion() : null));
    }

    /* renamed from: f */
    public final void mo7180f() {
        super.mo7180f();
        opusClose(this.f68873g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ bmg mo7181g(Throwable th) {
        return new bmt("Unexpected decode error", th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ bmg mo7182h(bmi bmi, bmk bmk, boolean z) {
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer;
        bmi bmi2;
        OpusDecoder opusDecoder;
        int i;
        int n;
        int i2;
        bmi bmi3 = bmi;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = (SimpleDecoderOutputBuffer) bmk;
        if (z) {
            opusReset(this.f68873g);
            if (bmi3.f20519e == 0) {
                i2 = this.f68871e;
            } else {
                i2 = this.f68872f;
            }
            this.f68874h = i2;
        }
        ByteBuffer byteBuffer = bmi3.f20517c;
        int i3 = bkd.f20408a;
        bme bme = bmi3.f20516b;
        if (bmi.mo7174d()) {
            long j = this.f68873g;
            long j2 = bmi3.f20519e;
            int limit = byteBuffer.limit();
            CryptoConfig cryptoConfig = this.f68870d;
            int i4 = bme.f120115c;
            byte[] bArr = bme.f120114b;
            axu.m47052j(bArr);
            byte[] bArr2 = bme.f120113a;
            axu.m47052j(bArr2);
            int i5 = bme.f120118f;
            int i6 = i5;
            simpleDecoderOutputBuffer = simpleDecoderOutputBuffer2;
            i = opusSecureDecode(j, j2, byteBuffer, limit, simpleDecoderOutputBuffer2, 48000, cryptoConfig, i4, bArr, bArr2, i6, bme.f120116d, bme.f120117e);
            opusDecoder = this;
            bmi2 = bmi;
        } else {
            simpleDecoderOutputBuffer = simpleDecoderOutputBuffer2;
            opusDecoder = this;
            bmi2 = bmi;
            i = opusDecode(opusDecoder.f68873g, bmi2.f20519e, byteBuffer, byteBuffer.limit(), simpleDecoderOutputBuffer);
        }
        if (i >= 0) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer3 = simpleDecoderOutputBuffer;
            ByteBuffer byteBuffer2 = simpleDecoderOutputBuffer3.data;
            int i7 = 0;
            byteBuffer2.position(0);
            byteBuffer2.limit(i);
            int i8 = opusDecoder.f68874h;
            if (i8 > 0) {
                int n2 = m43873n(1, opusDecoder.f68868b, opusDecoder.f68867a);
                int i9 = i8 * n2;
                if (i <= i9) {
                    opusDecoder.f68874h = i8 - (i / n2);
                    simpleDecoderOutputBuffer3.addFlag(Integer.MIN_VALUE);
                    byteBuffer2.position(i);
                } else {
                    opusDecoder.f68874h = 0;
                    byteBuffer2.position(i9);
                }
            } else if (opusDecoder.f68869c && bmi.hasSupplementalData()) {
                ByteBuffer byteBuffer3 = bmi2.f20520f;
                if (byteBuffer3 != null && byteBuffer3.remaining() == 8) {
                    long j3 = byteBuffer3.order(ByteOrder.LITTLE_ENDIAN).getLong();
                    if (j3 >= 0) {
                        i7 = (int) ((j3 * 48000) / 1000000000);
                    }
                }
                if (i7 > 0 && i >= (n = m43873n(i7, opusDecoder.f68868b, opusDecoder.f68867a))) {
                    byteBuffer2.limit(i - n);
                    return null;
                }
            }
            return null;
        } else if (i != -2) {
            return new bmt("Decode error: ".concat(String.valueOf(opusDecoder.opusGetErrorMessage((long) i))));
        } else {
            String valueOf = String.valueOf(opusDecoder.opusGetErrorMessage(opusDecoder.f68873g));
            opusDecoder.opusGetErrorCode(opusDecoder.f68873g);
            String concat = "Drm error: ".concat(valueOf);
            return new bmt(concat, new bmd(concat));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final bmi mo7183i() {
        return new bmi(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ bmk mo7184j() {
        return new SimpleDecoderOutputBuffer(new bms(this, 0));
    }
}
