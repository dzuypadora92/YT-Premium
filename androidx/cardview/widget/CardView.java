package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import app.revanced.android.youtube.R;

/* compiled from: PG */
public class CardView extends FrameLayout {

    /* renamed from: e */
    public static final ahp f11809e = new ahp();

    /* renamed from: g */
    private static final int[] f11810g = {16842801};

    /* renamed from: a */
    public boolean f11811a;

    /* renamed from: b */
    public boolean f11812b;

    /* renamed from: c */
    public final Rect f11813c;

    /* renamed from: d */
    public final Rect f11814d;

    /* renamed from: f */
    public final aze f11815f;

    public CardView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public float mo3733b() {
        return ahp.m91789d(this.f11815f);
    }

    /* renamed from: d */
    public void mo3734d(int i) {
        aze aze = this.f11815f;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        ajd ajd = (ajd) aze.f150496a;
        ajd.mo2738a(valueOf);
        ajd.invalidateSelf();
    }

    /* renamed from: e */
    public void mo3735e(float f) {
        f11809e.mo50046b(this.f11815f, f);
    }

    /* renamed from: f */
    public void mo3736f(float f) {
        ajd ajd = (ajd) this.f11815f.f150496a;
        if (f != ajd.f7136a) {
            ajd.f7136a = f;
            ajd.mo2739b((Rect) null);
            ajd.invalidateSelf();
        }
    }

    /* renamed from: g */
    public void mo3737g() {
        ((View) this.f11815f.f150497b).setElevation(0.0f);
    }

    /* renamed from: mC */
    public final float mo3738mC() {
        return ahp.m91788c(this.f11815f);
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList colorStateList;
        int i2;
        Rect rect = new Rect();
        this.f11813c = rect;
        this.f11814d = new Rect();
        aze aze = new aze(this);
        this.f11815f = aze;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajc.f7108a, i, R.style.CardView);
        avl.m7940M(this, context, ajc.f7108a, attributeSet, obtainStyledAttributes, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            colorStateList = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f11810g);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(R.color.cardview_light_background);
            } else {
                i2 = getResources().getColor(R.color.cardview_dark_background);
            }
            colorStateList = ColorStateList.valueOf(i2);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f11811a = obtainStyledAttributes.getBoolean(7, false);
        this.f11812b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        ahp ahp = f11809e;
        ajd ajd = new ajd(colorStateList, dimension);
        aze.f150496a = ajd;
        ((CardView) aze.f150497b).setBackgroundDrawable(ajd);
        View view = (View) aze.f150497b;
        view.setClipToOutline(true);
        view.setElevation(dimension2);
        ahp.mo50046b(aze, dimension3);
    }
}
