package androidx.media3.exoplayer.dash;

import java.util.List;

/* compiled from: PG */
public final class DashMediaSource$Factory implements byj {

    /* renamed from: b */
    private final bkq f68879b;

    /* renamed from: c */
    private final buz f68880c = new buq();

    /* renamed from: d */
    private final cbp f68881d = new cbo();

    /* renamed from: e */
    private final bfw f68882e = new bfw();

    /* renamed from: f */
    private final bse f68883f;

    public DashMediaSource$Factory(bkq bkq) {
        this.f68883f = new bse(bkq);
        this.f68879b = bkq;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bye mo28496a(bhq bhq) {
        axu.m47052j(bhq.f77253b);
        cbx btp = new btp();
        List list = bhq.f77253b.f20082e;
        return new btb(bhq, this.f68879b, !list.isEmpty() ? new bwx(btp, list) : btp, this.f68883f, this.f68880c.mo29960a(bhq), this.f68881d, (byte[]) null, (byte[]) null, (byte[]) null);
    }
}
