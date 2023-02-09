package androidx.media3.decoder.av1;

import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import java.nio.ByteBuffer;

/* compiled from: PG */
public final class Gav1Decoder extends bmm {

    /* renamed from: a */
    public final long f68865a;

    /* renamed from: b */
    public volatile int f68866b;

    public Gav1Decoder(int i) {
        super(new bmi[4], new VideoDecoderOutputBuffer[4]);
        if (bmp.m75453a()) {
            int gav1GetThreads = gav1GetThreads();
            long gav1Init = gav1Init(gav1GetThreads <= 0 ? Runtime.getRuntime().availableProcessors() : gav1GetThreads);
            this.f68865a = gav1Init;
            if (gav1Init == 0 || gav1CheckError(gav1Init) == 0) {
                throw new bmn("Failed to initialize decoder. Error: ".concat(String.valueOf(gav1GetErrorMessage(gav1Init))));
            }
            mo7186l(i);
            return;
        }
        throw new bmn("Failed to load decoder native library.");
    }

    private native int gav1CheckError(long j);

    private native void gav1Close(long j);

    private native int gav1Decode(long j, ByteBuffer byteBuffer, int i);

    private native int gav1GetFrame(long j, VideoDecoderOutputBuffer videoDecoderOutputBuffer, boolean z);

    private native int gav1GetThreads();

    private native long gav1Init(int i);

    private native void gav1ReleaseFrame(long j, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    /* renamed from: c */
    public final String mo28490c() {
        return "libgav1";
    }

    /* renamed from: f */
    public final void mo7180f() {
        super.mo7180f();
        gav1Close(this.f68865a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ bmg mo7181g(Throwable th) {
        return new bmn(th);
    }

    public native String gav1GetErrorMessage(long j);

    public native int gav1RenderFrame(long j, Surface surface, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ bmg mo7182h(bmi bmi, bmk bmk, boolean z) {
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) bmk;
        ByteBuffer byteBuffer = bmi.f20517c;
        int i = bkd.f20408a;
        if (gav1Decode(this.f68865a, byteBuffer, byteBuffer.limit()) == 0) {
            return new bmn("gav1Decode error: ".concat(String.valueOf(gav1GetErrorMessage(this.f68865a))));
        }
        boolean isDecodeOnly = bmi.isDecodeOnly();
        if (!isDecodeOnly) {
            videoDecoderOutputBuffer.init(bmi.f20519e, this.f68866b, (ByteBuffer) null);
        }
        int gav1GetFrame = gav1GetFrame(this.f68865a, videoDecoderOutputBuffer, isDecodeOnly);
        if (gav1GetFrame == 0) {
            return new bmn("gav1GetFrame error: ".concat(String.valueOf(gav1GetErrorMessage(this.f68865a))));
        }
        if (gav1GetFrame == 2) {
            videoDecoderOutputBuffer.addFlag(Integer.MIN_VALUE);
        }
        if (isDecodeOnly) {
            return null;
        }
        videoDecoderOutputBuffer.format = bmi.f20515a;
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final bmi mo7183i() {
        return new bmi(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ bmk mo7184j() {
        return new VideoDecoderOutputBuffer(new bms(this, 1));
    }

    /* renamed from: n */
    public final void mo28493n(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        if (videoDecoderOutputBuffer.mode == 1 && !videoDecoderOutputBuffer.isDecodeOnly()) {
            gav1ReleaseFrame(this.f68865a, videoDecoderOutputBuffer);
        }
        super.mo7185k(videoDecoderOutputBuffer);
    }
}
