package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import app.revanced.android.youtube.R;
import java.util.ArrayList;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
public class NestedScrollView extends FrameLayout implements aud, aua {

    /* renamed from: d */
    private static final float f11882d = ((float) (Math.log(0.78d) / Math.log(0.9d)));

    /* renamed from: e */
    private static final axw f11883e = new axw();

    /* renamed from: f */
    private static final int[] f11884f = {16843130};

    /* renamed from: A */
    private SavedState f11885A;

    /* renamed from: B */
    private final auf f11886B;

    /* renamed from: C */
    private final aub f11887C;

    /* renamed from: D */
    private float f11888D;

    /* renamed from: a */
    public EdgeEffect f11889a;

    /* renamed from: b */
    public EdgeEffect f11890b;

    /* renamed from: c */
    public axy f11891c;

    /* renamed from: g */
    private final float f11892g;

    /* renamed from: h */
    private long f11893h;

    /* renamed from: i */
    private final Rect f11894i;

    /* renamed from: j */
    private OverScroller f11895j;

    /* renamed from: k */
    private int f11896k;

    /* renamed from: l */
    private boolean f11897l;

    /* renamed from: m */
    private boolean f11898m;

    /* renamed from: n */
    private View f11899n;

    /* renamed from: o */
    private boolean f11900o;

    /* renamed from: p */
    private VelocityTracker f11901p;

    /* renamed from: q */
    private boolean f11902q;

    /* renamed from: r */
    private boolean f11903r;

    /* renamed from: s */
    private int f11904s;

    /* renamed from: t */
    private int f11905t;

    /* renamed from: u */
    private int f11906u;

    /* renamed from: v */
    private int f11907v;

    /* renamed from: w */
    private final int[] f11908w;

    /* renamed from: x */
    private final int[] f11909x;

    /* renamed from: y */
    private int f11910y;

    /* renamed from: z */
    private int f11911z;

    public NestedScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    private final void m4754A(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f11887C.mo5711i(0, scrollY2, 0, i - scrollY2, (int[]) null, i2, iArr);
    }

    /* renamed from: B */
    private final void m4755B(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f11907v) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f11896k = (int) motionEvent.getY(i);
            this.f11907v = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f11901p;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: C */
    private final void m4756C() {
        VelocityTracker velocityTracker = this.f11901p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f11901p = null;
        }
    }

    /* renamed from: D */
    private final void m4757D(boolean z) {
        if (z) {
            mo3848o(2, 1);
        } else {
            mo3836i(1);
        }
        this.f11911z = getScrollY();
        avl.m7935H(this);
    }

    /* renamed from: E */
    private final void m4758E(View view) {
        view.getDrawingRect(this.f11894i);
        offsetDescendantRectToMyCoords(view, this.f11894i);
        int lC = mo3841lC(this.f11894i);
        if (lC != 0) {
            scrollBy(0, lC);
        }
    }

    /* renamed from: F */
    private final boolean m4759F(View view) {
        return !m4761H(view, 0, getHeight());
    }

    /* renamed from: G */
    private static boolean m4760G(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m4760G((View) parent, view2)) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    private final boolean m4761H(View view, int i, int i2) {
        view.getDrawingRect(this.f11894i);
        offsetDescendantRectToMyCoords(view, this.f11894i);
        return this.f11894i.bottom + i >= getScrollY() && this.f11894i.top - i <= getScrollY() + i2;
    }

    /* renamed from: I */
    private final boolean m4762I(int i, int i2, int i3) {
        boolean z;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = (View) focusables.get(i8);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i5 < bottom && top < i6) {
                boolean z3 = i5 < top && bottom < i6;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = i4 != 33 ? bottom > view.getBottom() : top < view.getTop();
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i5 < scrollY || i6 > i7) {
            m4767w(i4 == 33 ? i5 - scrollY : i6 - i7, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i4);
        }
        return z;
    }

    /* renamed from: J */
    private final boolean m4763J(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float h = auw.m46539h(edgeEffect) * ((float) getHeight());
        double log = Math.log((double) ((((float) Math.abs(-i)) * 0.35f) / (this.f11892g * 0.015f)));
        double d = (double) f11882d;
        Double.isNaN(d);
        Double.isNaN(d);
        double d2 = (double) (this.f11892g * 0.015f);
        double exp = Math.exp((d / (-1.0d + d)) * log);
        Double.isNaN(d2);
        if (((float) (d2 * exp)) < h) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    private final boolean m4764K(MotionEvent motionEvent) {
        boolean z;
        if (auw.m46539h(this.f11889a) != 0.0f) {
            auw.m46540i(this.f11889a, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z = true;
        } else {
            z = false;
        }
        if (auw.m46539h(this.f11890b) == 0.0f) {
            return z;
        }
        auw.m46540i(this.f11890b, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    /* renamed from: L */
    private final void m4765L(int i, int i2, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f11893h > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                this.f11895j.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
                m4757D(z);
            } else {
                if (!this.f11895j.isFinished()) {
                    m4768x();
                }
                scrollBy(i, i2);
            }
            this.f11893h = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: v */
    private static int m4766v(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: w */
    private final int m4767w(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        int i6 = i2;
        int i7 = i3;
        if (i7 == 1) {
            mo3848o(2, 1);
        }
        if (mo3839k(0, i, this.f11909x, this.f11908w, i3)) {
            i5 = i - this.f11909x[1];
            i4 = this.f11908w[1];
        } else {
            i5 = i;
            i4 = 0;
        }
        int scrollY = getScrollY();
        int b = mo3817b();
        int overScrollMode = getOverScrollMode();
        boolean z2 = (overScrollMode == 0 || (overScrollMode == 1 && mo3817b() > 0)) && !z;
        boolean z3 = mo3843lE(i5, 0, scrollY, b) && !mo3847n(i7);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f11909x;
        iArr[1] = 0;
        mo3842lD(scrollY2, i5 - scrollY2, this.f11908w, i3, iArr);
        int i8 = i4 + this.f11908w[1];
        int i9 = i5 - this.f11909x[1];
        int i10 = scrollY + i9;
        if (i10 < 0) {
            if (z2) {
                auw.m46540i(this.f11889a, ((float) (-i9)) / ((float) getHeight()), ((float) i6) / ((float) getWidth()));
                if (!this.f11890b.isFinished()) {
                    this.f11890b.onRelease();
                }
            }
        } else if (i10 > b && z2) {
            auw.m46540i(this.f11890b, ((float) i9) / ((float) getHeight()), 1.0f - (((float) i6) / ((float) getWidth())));
            if (!this.f11889a.isFinished()) {
                this.f11889a.onRelease();
            }
        }
        if (!this.f11889a.isFinished() || !this.f11890b.isFinished()) {
            avl.m7935H(this);
        } else if (z3 && i7 == 0) {
            this.f11901p.clear();
        }
        if (i7 == 1) {
            mo3836i(1);
            this.f11889a.onRelease();
            this.f11890b.onRelease();
        }
        return i8;
    }

    /* renamed from: x */
    private final void m4768x() {
        this.f11895j.abortAnimation();
        mo3836i(1);
    }

    /* renamed from: y */
    private final void m4769y() {
        this.f11907v = -1;
        this.f11900o = false;
        m4756C();
        mo3836i(0);
        this.f11889a.onRelease();
        this.f11890b.onRelease();
    }

    /* renamed from: z */
    private final void m4770z() {
        if (this.f11901p == null) {
            this.f11901p = VelocityTracker.obtain();
        }
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public final int mo3817b() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* renamed from: c */
    public void mo3818c(int i) {
        if (getChildCount() > 0) {
            this.f11895j.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m4757D(true);
        }
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void computeScroll() {
        /*
            r15 = this;
            android.widget.OverScroller r0 = r15.f11895j
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            android.widget.OverScroller r0 = r15.f11895j
            r0.computeScrollOffset()
            android.widget.OverScroller r0 = r15.f11895j
            int r0 = r0.getCurrY()
            int r1 = r15.f11911z
            int r1 = r0 - r1
            int r2 = r15.getHeight()
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 0
            r5 = 1082130432(0x40800000, float:4.0)
            if (r1 <= 0) goto L_0x004b
            android.widget.EdgeEffect r6 = r15.f11889a
            float r6 = p000.auw.m46539h(r6)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x004b
            int r4 = -r1
            float r4 = (float) r4
            float r4 = r4 * r5
            float r6 = (float) r2
            int r2 = -r2
            float r2 = (float) r2
            float r2 = r2 / r5
            android.widget.EdgeEffect r5 = r15.f11889a
            float r4 = r4 / r6
            float r3 = p000.auw.m46540i(r5, r4, r3)
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            if (r2 == r1) goto L_0x0049
            android.widget.EdgeEffect r3 = r15.f11889a
            r3.finish()
        L_0x0049:
            int r1 = r1 - r2
            goto L_0x0072
        L_0x004b:
            if (r1 >= 0) goto L_0x0072
            android.widget.EdgeEffect r6 = r15.f11890b
            float r6 = p000.auw.m46539h(r6)
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0072
            float r4 = (float) r1
            float r4 = r4 * r5
            float r2 = (float) r2
            float r5 = r2 / r5
            android.widget.EdgeEffect r6 = r15.f11890b
            float r4 = r4 / r2
            float r2 = p000.auw.m46540i(r6, r4, r3)
            float r5 = r5 * r2
            int r2 = java.lang.Math.round(r5)
            if (r2 == r1) goto L_0x0049
            android.widget.EdgeEffect r3 = r15.f11890b
            r3.finish()
            goto L_0x0049
        L_0x0072:
            r15.f11911z = r0
            r3 = 0
            int[] r5 = r15.f11909x
            r0 = 1
            r8 = 0
            r5[r0] = r8
            r6 = 0
            r7 = 1
            r2 = r15
            r4 = r1
            r2.mo3839k(r3, r4, r5, r6, r7)
            int[] r2 = r15.f11909x
            r2 = r2[r0]
            int r1 = r1 - r2
            int r2 = r15.mo3817b()
            if (r1 == 0) goto L_0x00b0
            int r3 = r15.getScrollY()
            int r4 = r15.getScrollX()
            r15.mo3843lE(r1, r4, r3, r2)
            int r4 = r15.getScrollY()
            int r10 = r4 - r3
            int[] r14 = r15.f11909x
            r14[r0] = r8
            int[] r12 = r15.f11908w
            int r1 = r1 - r10
            r13 = 1
            r9 = r15
            r11 = r1
            r9.mo3842lD(r10, r11, r12, r13, r14)
            int[] r3 = r15.f11909x
            r3 = r3[r0]
            int r1 = r1 - r3
        L_0x00b0:
            if (r1 == 0) goto L_0x00ea
            int r3 = r15.getOverScrollMode()
            if (r3 == 0) goto L_0x00bc
            if (r3 != r0) goto L_0x00e7
            if (r2 <= 0) goto L_0x00e7
        L_0x00bc:
            if (r1 >= 0) goto L_0x00d3
            android.widget.EdgeEffect r1 = r15.f11889a
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L_0x00e7
            android.widget.EdgeEffect r1 = r15.f11889a
            android.widget.OverScroller r2 = r15.f11895j
            float r2 = r2.getCurrVelocity()
            int r2 = (int) r2
            r1.onAbsorb(r2)
            goto L_0x00e7
        L_0x00d3:
            android.widget.EdgeEffect r1 = r15.f11890b
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L_0x00e7
            android.widget.EdgeEffect r1 = r15.f11890b
            android.widget.OverScroller r2 = r15.f11895j
            float r2 = r2.getCurrVelocity()
            int r2 = (int) r2
            r1.onAbsorb(r2)
        L_0x00e7:
            r15.m4768x()
        L_0x00ea:
            android.widget.OverScroller r1 = r15.f11895j
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x00f6
            p000.avl.m7935H(r15)
            return
        L_0x00f6:
            r15.mo3836i(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY <= max ? bottom : bottom + (scrollY - max);
    }

    /* renamed from: d */
    public final void mo3161d(View view, int i, int i2, int[] iArr, int i3) {
        mo3839k(i, i2, iArr, (int[]) null, i3);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo3840l(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f11887C.mo5706d(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f11887C.mo5707e(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo3839k(i, i2, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f11887C.mo5710h(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.f11889a.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (axx.m47063a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (axx.m47063a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate((float) i, (float) min);
            this.f11889a.setSize(width, height);
            if (this.f11889a.draw(canvas)) {
                avl.m7935H(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f11890b.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(mo3817b(), scrollY) + height2;
            if (axx.m47063a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i2 = getPaddingLeft();
            }
            if (axx.m47063a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i2 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f11890b.setSize(width2, height2);
            if (this.f11890b.draw(canvas)) {
                avl.m7935H(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* renamed from: e */
    public final void mo3163e(View view, int i, int i2, int i3, int i4, int i5) {
        m4754A(i4, i5, (int[]) null);
    }

    /* renamed from: f */
    public final void mo3164f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m4754A(i4, i5, iArr);
    }

    /* renamed from: g */
    public final void mo3165g(View view, View view2, int i, int i2) {
        this.f11886B.mo5728b(i, i2);
        mo3848o(2, i2);
    }

    /* access modifiers changed from: protected */
    public final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public final int getNestedScrollAxes() {
        return this.f11886B.mo5727a();
    }

    /* access modifiers changed from: protected */
    public final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* renamed from: h */
    public final void mo3170h(View view, int i) {
        this.f11886B.mo5729c(i);
        mo3836i(i);
    }

    public final boolean hasNestedScrollingParent() {
        return mo3847n(0);
    }

    /* renamed from: i */
    public final void mo3836i(int i) {
        this.f11887C.mo5705c(i);
    }

    public final boolean isNestedScrollingEnabled() {
        return this.f11887C.f18912a;
    }

    /* renamed from: j */
    public final boolean mo3838j(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int height = (int) (((float) getHeight()) * 0.5f);
        if (findNextFocus == null || !m4761H(findNextFocus, height, getHeight())) {
            if (i == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                height = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i != 130) {
                height = -height;
            }
            m4767w(height, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f11894i);
            offsetDescendantRectToMyCoords(findNextFocus, this.f11894i);
            m4767w(mo3841lC(this.f11894i), 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && m4759F(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* renamed from: k */
    public final boolean mo3839k(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f11887C.mo5709g(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: l */
    public final boolean mo3840l(KeyEvent keyEvent) {
        this.f11894i.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                int i = 33;
                if (keyCode != 19) {
                    if (keyCode != 20) {
                        if (keyCode != 62) {
                            return false;
                        }
                        if (true != keyEvent.isShiftPressed()) {
                            i = 130;
                        }
                        int height = getHeight();
                        if (i == 130) {
                            this.f11894i.top = getScrollY() + height;
                            int childCount = getChildCount();
                            if (childCount > 0) {
                                View childAt2 = getChildAt(childCount - 1);
                                int bottom = childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin + getPaddingBottom();
                                if (this.f11894i.top + height > bottom) {
                                    this.f11894i.top = bottom - height;
                                }
                            }
                        } else {
                            this.f11894i.top = getScrollY() - height;
                            if (this.f11894i.top < 0) {
                                this.f11894i.top = 0;
                            }
                        }
                        Rect rect = this.f11894i;
                        rect.bottom = rect.top + height;
                        m4762I(i, this.f11894i.top, this.f11894i.bottom);
                        return false;
                    } else if (!keyEvent.isAltPressed()) {
                        return mo3838j(130);
                    } else {
                        return mo3844m(130);
                    }
                } else if (!keyEvent.isAltPressed()) {
                    return mo3838j(33);
                } else {
                    return mo3844m(33);
                }
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: lC */
    public final int mo3841lC(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        if (rect.bottom > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        } else if (rect.top >= scrollY || rect.bottom >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = -(i4 - rect.bottom);
            } else {
                i = -(scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    /* renamed from: lD */
    public final void mo3842lD(int i, int i2, int[] iArr, int i3, int[] iArr2) {
        this.f11887C.mo5711i(0, i, 0, i2, iArr, i3, iArr2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lE */
    public final boolean mo3843lE(int i, int i2, int i3, int i4) {
        boolean z;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        boolean z2 = i2 > 0 || i2 < 0;
        int i5 = i3 + i;
        if (i5 > i4) {
            z = true;
        } else if (i5 < 0) {
            z = true;
            i4 = 0;
        } else {
            i4 = i5;
            z = false;
        }
        if (z && !mo3847n(1)) {
            this.f11895j.springBack(0, i4, 0, 0, 0, mo3817b());
        }
        onOverScrolled(0, i4, z2, z);
        return z2 || z;
    }

    /* renamed from: m */
    public final boolean mo3844m(int i) {
        int childCount;
        int height = getHeight();
        this.f11894i.top = 0;
        this.f11894i.bottom = height;
        if (i == 130 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f11894i.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect = this.f11894i;
            rect.top = rect.bottom - height;
        }
        return m4762I(i, this.f11894i.top, this.f11894i.bottom);
    }

    /* access modifiers changed from: protected */
    public final void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public final boolean mo3847n(int i) {
        return this.f11887C.mo5713k(i);
    }

    /* renamed from: o */
    public final boolean mo3848o(int i, int i2) {
        return this.f11887C.mo5715m(i, i2);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11898m = false;
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        float f;
        if (motionEvent.getAction() == 8 && !this.f11900o) {
            if (atr.m7118d(motionEvent, 2)) {
                f = motionEvent.getAxisValue(9);
                i = (int) motionEvent.getX();
            } else if (atr.m7118d(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i = getWidth() / 2;
                f = axisValue;
            } else {
                f = 0.0f;
                i = 0;
            }
            if (f != 0.0f) {
                float f2 = this.f11888D;
                if (f2 == 0.0f) {
                    TypedValue typedValue = new TypedValue();
                    Context context = getContext();
                    if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                        f2 = typedValue.getDimension(context.getResources().getDisplayMetrics());
                        this.f11888D = f2;
                    } else {
                        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                    }
                }
                m4767w(-((int) (f * f2)), i, 1, atr.m7118d(motionEvent, 8194));
                return true;
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2) {
            if (this.f11900o) {
                return true;
            }
            action = 2;
        }
        int i = action & PrivateKeyType.INVALID;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f11907v;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f11896k) > this.f11904s && (2 & getNestedScrollAxes()) == 0) {
                                this.f11900o = true;
                                this.f11896k = y;
                                m4770z();
                                this.f11901p.addMovement(motionEvent);
                                this.f11910y = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m4755B(motionEvent);
                    }
                }
            }
            this.f11900o = false;
            this.f11907v = -1;
            m4756C();
            if (this.f11895j.springBack(getScrollX(), getScrollY(), 0, 0, 0, mo3817b())) {
                avl.m7935H(this);
            }
            mo3836i(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.f11896k = y2;
                    this.f11907v = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker = this.f11901p;
                    if (velocityTracker == null) {
                        this.f11901p = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    this.f11901p.addMovement(motionEvent);
                    this.f11895j.computeScrollOffset();
                    if (!m4764K(motionEvent) && this.f11895j.isFinished()) {
                        z = false;
                    }
                    this.f11900o = z;
                    mo3848o(2, 0);
                }
            }
            if (!m4764K(motionEvent) && this.f11895j.isFinished()) {
                z = false;
            }
            this.f11900o = z;
            m4756C();
        }
        return this.f11900o;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f11897l = false;
        View view = this.f11899n;
        if (view != null && m4760G(view, this)) {
            m4758E(this.f11899n);
        }
        this.f11899n = null;
        if (!this.f11898m) {
            if (this.f11885A != null) {
                scrollTo(getScrollX(), this.f11885A.f11912a);
                this.f11885A = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int v = m4766v(scrollY, paddingTop, i5);
            if (v != scrollY) {
                scrollTo(getScrollX(), v);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f11898m = true;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f11902q && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo3818c((int) f2);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo3161d(view, i, i2, iArr, 0);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m4754A(i4, 0, (int[]) null);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo3165g(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !m4759F(view)) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f11885A = savedState;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f11912a = getScrollY();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        axy axy = this.f11891c;
        if (axy != null) {
            axy.mo29679a(this, i, i2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m4761H(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f11894i);
            offsetDescendantRectToMyCoords(findFocus, this.f11894i);
            int lC = mo3841lC(this.f11894i);
            if (lC == 0) {
                return;
            }
            if (this.f11903r) {
                mo3868r(lC);
            } else {
                scrollBy(0, lC);
            }
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo3197t(view, view2, i, 0);
    }

    public final void onStopNestedScroll(View view) {
        mo3170h(view, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            r13 = this;
            r13.m4770z()
            int r0 = r14.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L_0x000d
            r13.f11910y = r1
            r0 = 0
        L_0x000d:
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r14)
            int r3 = r13.f11910y
            float r3 = (float) r3
            r4 = 0
            r2.offsetLocation(r4, r3)
            r3 = 2
            r5 = 1
            if (r0 == 0) goto L_0x01c5
            if (r0 == r5) goto L_0x0145
            if (r0 == r3) goto L_0x0079
            r1 = 3
            if (r0 == r1) goto L_0x0050
            r1 = 5
            if (r0 == r1) goto L_0x003d
            r1 = 6
            if (r0 == r1) goto L_0x002b
            goto L_0x01f4
        L_0x002b:
            r13.m4755B(r14)
            int r0 = r13.f11907v
            int r0 = r14.findPointerIndex(r0)
            float r14 = r14.getY(r0)
            int r14 = (int) r14
            r13.f11896k = r14
            goto L_0x01f4
        L_0x003d:
            int r0 = r14.getActionIndex()
            float r1 = r14.getY(r0)
            int r1 = (int) r1
            r13.f11896k = r1
            int r14 = r14.getPointerId(r0)
            r13.f11907v = r14
            goto L_0x01f4
        L_0x0050:
            boolean r14 = r13.f11900o
            if (r14 == 0) goto L_0x0074
            int r14 = r13.getChildCount()
            if (r14 <= 0) goto L_0x0074
            android.widget.OverScroller r6 = r13.f11895j
            int r7 = r13.getScrollX()
            int r8 = r13.getScrollY()
            r9 = 0
            r10 = 0
            r11 = 0
            int r12 = r13.mo3817b()
            boolean r14 = r6.springBack(r7, r8, r9, r10, r11, r12)
            if (r14 == 0) goto L_0x0074
            p000.avl.m7935H(r13)
        L_0x0074:
            r13.m4769y()
            goto L_0x01f4
        L_0x0079:
            int r0 = r13.f11907v
            int r0 = r14.findPointerIndex(r0)
            r3 = -1
            if (r0 != r3) goto L_0x009e
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid pointerId="
            r14.<init>(r0)
            int r0 = r13.f11907v
            r14.append(r0)
            java.lang.String r0 = " in onTouchEvent"
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r14)
            goto L_0x01f4
        L_0x009e:
            float r3 = r14.getY(r0)
            int r3 = (int) r3
            int r6 = r13.f11896k
            int r6 = r6 - r3
            float r7 = r14.getX(r0)
            int r8 = r13.getWidth()
            float r8 = (float) r8
            float r7 = r7 / r8
            int r8 = r13.getHeight()
            float r8 = (float) r8
            android.widget.EdgeEffect r9 = r13.f11889a
            float r9 = p000.auw.m46539h(r9)
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            float r10 = (float) r6
            float r10 = r10 / r8
            if (r9 == 0) goto L_0x00da
            android.widget.EdgeEffect r8 = r13.f11889a
            float r9 = -r10
            float r7 = p000.auw.m46540i(r8, r9, r7)
            float r7 = -r7
            android.widget.EdgeEffect r8 = r13.f11889a
            float r8 = p000.auw.m46539h(r8)
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x00d8
            android.widget.EdgeEffect r4 = r13.f11889a
            r4.onRelease()
        L_0x00d8:
            r4 = r7
            goto L_0x00fd
        L_0x00da:
            android.widget.EdgeEffect r8 = r13.f11890b
            float r8 = p000.auw.m46539h(r8)
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x00fd
            android.widget.EdgeEffect r8 = r13.f11890b
            r9 = 1065353216(0x3f800000, float:1.0)
            float r9 = r9 - r7
            float r7 = p000.auw.m46540i(r8, r10, r9)
            android.widget.EdgeEffect r8 = r13.f11890b
            float r8 = p000.auw.m46539h(r8)
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x00d8
            android.widget.EdgeEffect r4 = r13.f11890b
            r4.onRelease()
            goto L_0x00d8
        L_0x00fd:
            int r7 = r13.getHeight()
            float r7 = (float) r7
            float r4 = r4 * r7
            int r4 = java.lang.Math.round(r4)
            if (r4 == 0) goto L_0x010d
            r13.invalidate()
        L_0x010d:
            int r6 = r6 - r4
            boolean r4 = r13.f11900o
            if (r4 != 0) goto L_0x012e
            int r4 = java.lang.Math.abs(r6)
            int r7 = r13.f11904s
            if (r4 <= r7) goto L_0x012e
            android.view.ViewParent r4 = r13.getParent()
            if (r4 == 0) goto L_0x0123
            r4.requestDisallowInterceptTouchEvent(r5)
        L_0x0123:
            r13.f11900o = r5
            if (r6 <= 0) goto L_0x012b
            int r4 = r13.f11904s
            int r6 = r6 - r4
            goto L_0x012e
        L_0x012b:
            int r4 = r13.f11904s
            int r6 = r6 + r4
        L_0x012e:
            boolean r4 = r13.f11900o
            if (r4 == 0) goto L_0x01f4
            float r14 = r14.getX(r0)
            int r14 = (int) r14
            int r14 = r13.m4767w(r6, r14, r1, r1)
            int r3 = r3 - r14
            r13.f11896k = r3
            int r0 = r13.f11910y
            int r0 = r0 + r14
            r13.f11910y = r0
            goto L_0x01f4
        L_0x0145:
            android.view.VelocityTracker r14 = r13.f11901p
            int r0 = r13.f11906u
            float r0 = (float) r0
            r1 = 1000(0x3e8, float:1.401E-42)
            r14.computeCurrentVelocity(r1, r0)
            int r0 = r13.f11907v
            float r14 = r14.getYVelocity(r0)
            int r14 = (int) r14
            int r0 = java.lang.Math.abs(r14)
            int r1 = r13.f11905t
            if (r0 < r1) goto L_0x01a7
            android.widget.EdgeEffect r0 = r13.f11889a
            float r0 = p000.auw.m46539h(r0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x017b
            android.widget.EdgeEffect r0 = r13.f11889a
            boolean r0 = r13.m4763J(r0, r14)
            if (r0 == 0) goto L_0x0176
            android.widget.EdgeEffect r0 = r13.f11889a
            r0.onAbsorb(r14)
            goto L_0x01c1
        L_0x0176:
            int r14 = -r14
            r13.mo3818c(r14)
            goto L_0x01c1
        L_0x017b:
            android.widget.EdgeEffect r0 = r13.f11890b
            float r0 = p000.auw.m46539h(r0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0198
            android.widget.EdgeEffect r0 = r13.f11890b
            int r14 = -r14
            boolean r0 = r13.m4763J(r0, r14)
            if (r0 == 0) goto L_0x0194
            android.widget.EdgeEffect r0 = r13.f11890b
            r0.onAbsorb(r14)
            goto L_0x01c1
        L_0x0194:
            r13.mo3818c(r14)
            goto L_0x01c1
        L_0x0198:
            int r14 = -r14
            float r0 = (float) r14
            boolean r1 = r13.dispatchNestedPreFling(r4, r0)
            if (r1 != 0) goto L_0x01c1
            r13.dispatchNestedFling(r4, r0, r5)
            r13.mo3818c(r14)
            goto L_0x01c1
        L_0x01a7:
            android.widget.OverScroller r6 = r13.f11895j
            int r7 = r13.getScrollX()
            int r8 = r13.getScrollY()
            r9 = 0
            r10 = 0
            r11 = 0
            int r12 = r13.mo3817b()
            boolean r14 = r6.springBack(r7, r8, r9, r10, r11, r12)
            if (r14 == 0) goto L_0x01c1
            p000.avl.m7935H(r13)
        L_0x01c1:
            r13.m4769y()
            goto L_0x01f4
        L_0x01c5:
            int r0 = r13.getChildCount()
            if (r0 != 0) goto L_0x01cc
            return r1
        L_0x01cc:
            boolean r0 = r13.f11900o
            if (r0 == 0) goto L_0x01d9
            android.view.ViewParent r0 = r13.getParent()
            if (r0 == 0) goto L_0x01d9
            r0.requestDisallowInterceptTouchEvent(r5)
        L_0x01d9:
            android.widget.OverScroller r0 = r13.f11895j
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01e4
            r13.m4768x()
        L_0x01e4:
            float r0 = r14.getY()
            int r0 = (int) r0
            int r14 = r14.getPointerId(r1)
            r13.f11896k = r0
            r13.f11907v = r14
            r13.mo3848o(r3, r1)
        L_0x01f4:
            android.view.VelocityTracker r14 = r13.f11901p
            if (r14 == 0) goto L_0x01fb
            r14.addMovement(r2)
        L_0x01fb:
            r2.recycle()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    public final void mo3868r(int i) {
        m4765L(0, i, false);
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.f11897l) {
            m4758E(view2);
        } else {
            this.f11899n = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int lC = mo3841lC(rect);
        boolean z2 = lC != 0;
        if (z2) {
            if (z) {
                scrollBy(0, lC);
            } else {
                mo3868r(lC);
            }
        }
        return z2;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m4756C();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void requestLayout() {
        this.f11897l = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public final void mo3873s(int i, boolean z) {
        m4765L(-getScrollX(), i - getScrollY(), z);
    }

    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int v = m4766v(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int v2 = m4766v(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (v != getScrollX() || v2 != getScrollY()) {
                super.scrollTo(v, v2);
            }
        }
    }

    public final void setNestedScrollingEnabled(boolean z) {
        this.f11887C.mo5703a(z);
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean startNestedScroll(int i) {
        return mo3848o(i, 0);
    }

    public void stopNestedScroll() {
        mo3836i(0);
    }

    /* renamed from: t */
    public final boolean mo3197t(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* renamed from: u */
    public final void mo3879u(int i) {
        mo3873s(i, true);
    }

    /* compiled from: PG */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new axz(0);

        /* renamed from: a */
        public int f11912a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f11912a = parcel.readInt();
        }

        public final String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f11912a + "}";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f11912a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11894i = new Rect();
        this.f11897l = true;
        this.f11898m = false;
        this.f11899n = null;
        this.f11900o = false;
        this.f11903r = true;
        this.f11907v = -1;
        this.f11908w = new int[2];
        this.f11909x = new int[2];
        this.f11889a = auw.m46541j(context, attributeSet);
        this.f11890b = auw.m46541j(context, attributeSet);
        this.f11892g = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f11895j = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f11904s = viewConfiguration.getScaledTouchSlop();
        this.f11905t = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f11906u = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f11884f, i, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        if (z != this.f11902q) {
            this.f11902q = z;
            requestLayout();
        }
        obtainStyledAttributes.recycle();
        this.f11886B = new auf();
        this.f11887C = new aub(this);
        setNestedScrollingEnabled(true);
        avl.m7941N(this, f11883e);
    }

    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
