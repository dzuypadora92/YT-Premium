package androidx.media3.decoder.vp9;

import android.view.Surface;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import java.nio.ByteBuffer;

/* compiled from: PG */
public final class VpxDecoder extends bmm {

    /* renamed from: a */
    public final long f68875a;

    /* renamed from: b */
    public volatile int f68876b;

    /* renamed from: c */
    private final CryptoConfig f68877c;

    /* renamed from: d */
    private ByteBuffer f68878d;

    public VpxDecoder(int i, int i2, int i3, CryptoConfig cryptoConfig, int i4) {
        super(new bmi[i], new VideoDecoderOutputBuffer[i2]);
        if (VpxLibrary.m4827a()) {
            this.f68877c = cryptoConfig;
            if (cryptoConfig == null || VpxLibrary.vpxIsSecureDecodeSupported()) {
                long vpxInit = vpxInit(false, false, i4);
                this.f68875a = vpxInit;
                if (vpxInit != 0) {
                    mo7186l(i3);
                    return;
                }
                throw new bmw("Failed to initialize decoder");
            }
            throw new bmw("Vpx decoder does not support secure decode.");
        }
        throw new bmw("Failed to load decoder native libraries.");
    }

    private native long vpxClose(long j);

    private native long vpxDecode(long j, ByteBuffer byteBuffer, int i);

    private native int vpxGetErrorCode(long j);

    private native String vpxGetErrorMessage(long j);

    private native int vpxGetFrame(long j, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    private native long vpxInit(boolean z, boolean z2, int i);

    private native int vpxReleaseFrame(long j, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    private native long vpxSecureDecode(long j, ByteBuffer byteBuffer, int i, CryptoConfig cryptoConfig, int i2, byte[] bArr, byte[] bArr2, int i3, int[] iArr, int[] iArr2);

    /* renamed from: c */
    public final String mo28490c() {
        return "libvpx".concat(String.valueOf(VpxLibrary.m4827a() ? VpxLibrary.vpxGetVersion() : null));
    }

    /* renamed from: f */
    public final void mo7180f() {
        super.mo7180f();
        this.f68878d = null;
        vpxClose(this.f68875a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ bmg mo7181g(Throwable th) {
        return new bmw("Unexpected decode error", th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ bmg mo7182h(bmi bmi, bmk bmk, boolean z) {
        long j;
        ByteBuffer byteBuffer;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) bmk;
        if (z && (byteBuffer = this.f68878d) != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = bmi.f20517c;
        int i = bkd.f20408a;
        int limit = byteBuffer2.limit();
        bme bme = bmi.f20516b;
        if (bmi.mo7174d()) {
            long j2 = this.f68875a;
            CryptoConfig cryptoConfig = this.f68877c;
            int i2 = bme.f120115c;
            byte[] bArr = bme.f120114b;
            axu.m47052j(bArr);
            byte[] bArr2 = bme.f120113a;
            axu.m47052j(bArr2);
            j = vpxSecureDecode(j2, byteBuffer2, limit, cryptoConfig, i2, bArr, bArr2, bme.f120118f, bme.f120116d, bme.f120117e);
        } else {
            j = vpxDecode(this.f68875a, byteBuffer2, limit);
        }
        if (j == 0) {
            if (bmi.hasSupplementalData()) {
                ByteBuffer byteBuffer3 = bmi.f20520f;
                axu.m47052j(byteBuffer3);
                int remaining = byteBuffer3.remaining();
                if (remaining > 0) {
                    ByteBuffer byteBuffer4 = this.f68878d;
                    if (byteBuffer4 == null || byteBuffer4.capacity() < remaining) {
                        this.f68878d = ByteBuffer.allocate(remaining);
                    } else {
                        this.f68878d.clear();
                    }
                    this.f68878d.put(byteBuffer3);
                    this.f68878d.flip();
                }
            }
            if (!bmi.isDecodeOnly()) {
                videoDecoderOutputBuffer.init(bmi.f20519e, this.f68876b, this.f68878d);
                int vpxGetFrame = vpxGetFrame(this.f68875a, videoDecoderOutputBuffer);
                if (vpxGetFrame == 1) {
                    videoDecoderOutputBuffer.addFlag(Integer.MIN_VALUE);
                } else if (vpxGetFrame == -1) {
                    return new bmw("Buffer initialization failed.");
                }
                videoDecoderOutputBuffer.format = bmi.f20515a;
            }
            return null;
        } else if (j != -2) {
            return new bmw("Decode error: ".concat(String.valueOf(vpxGetErrorMessage(this.f68875a))));
        } else {
            String valueOf = String.valueOf(vpxGetErrorMessage(this.f68875a));
            vpxGetErrorCode(this.f68875a);
            String concat = "Drm error: ".concat(valueOf);
            return new bmw(concat, new bmd(concat));
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
        return new VideoDecoderOutputBuffer(new bms(this, 2));
    }

    /* renamed from: n */
    public final void mo28494n(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        if (this.f68876b == 1 && !videoDecoderOutputBuffer.isDecodeOnly()) {
            vpxReleaseFrame(this.f68875a, videoDecoderOutputBuffer);
        }
        super.mo7185k(videoDecoderOutputBuffer);
    }

    public native int vpxRenderFrame(long j, Surface surface, VideoDecoderOutputBuffer videoDecoderOutputBuffer);
}
