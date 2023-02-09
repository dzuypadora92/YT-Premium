package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* compiled from: PG */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: a */
    public long f11876a;

    /* renamed from: b */
    public boolean f11877b;

    /* renamed from: c */
    public boolean f11878c;

    /* renamed from: d */
    public boolean f11879d;

    /* renamed from: e */
    public final Runnable f11880e;

    /* renamed from: f */
    public final Runnable f11881f;

    public ContentLoadingProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    private final void m4751c() {
        removeCallbacks(this.f11880e);
        removeCallbacks(this.f11881f);
    }

    /* renamed from: a */
    public final void mo3809a() {
        post(new ahq(this, 10));
    }

    /* renamed from: b */
    public final void mo3810b() {
        post(new ahq(this, 9));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4751c();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4751c();
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f11876a = -1;
        this.f11877b = false;
        this.f11878c = false;
        this.f11879d = false;
        this.f11880e = new ahq(this, 11);
        this.f11881f = new ahq(this, 12);
    }
}
