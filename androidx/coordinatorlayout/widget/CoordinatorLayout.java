package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.customview.view.AbsSavedState;
import app.revanced.android.youtube.R;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public class CoordinatorLayout extends ViewGroup implements auc, aud {

    /* renamed from: a */
    static final String f11830a;

    /* renamed from: b */
    static final Class[] f11831b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    static final ThreadLocal f11832c = new ThreadLocal();

    /* renamed from: d */
    static final Comparator f11833d = new C1796mo(3);

    /* renamed from: i */
    private static final atb f11834i = new atd(12);

    /* renamed from: e */
    public final amr f11835e;

    /* renamed from: f */
    public awk f11836f;

    /* renamed from: g */
    public boolean f11837g;

    /* renamed from: h */
    public ViewGroup.OnHierarchyChangeListener f11838h;

    /* renamed from: j */
    private final List f11839j;

    /* renamed from: k */
    private final List f11840k;

    /* renamed from: l */
    private final int[] f11841l;

    /* renamed from: m */
    private final int[] f11842m;

    /* renamed from: n */
    private boolean f11843n;

    /* renamed from: o */
    private boolean f11844o;

    /* renamed from: p */
    private int[] f11845p;

    /* renamed from: q */
    private View f11846q;

    /* renamed from: r */
    private View f11847r;

    /* renamed from: s */
    private boolean f11848s;

    /* renamed from: t */
    private Drawable f11849t;

    /* renamed from: u */
    private aug f11850u;

    /* renamed from: v */
    private final auf f11851v;

    /* renamed from: w */
    private eqw f11852w;

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        f11830a = packageR != null ? packageR.getName() : null;
    }

    public CoordinatorLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    private static final void m4713A(int i, Rect rect, Rect rect2, amq amq, int i2, int i3) {
        int i4;
        int i5;
        int i6 = amq.f110471c;
        if (i6 == 0) {
            i6 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, i);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(m4721q(amq.f110472d), i);
        int i9 = absoluteGravity2 & 7;
        int i10 = absoluteGravity2 & 112;
        if (i9 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i9 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i10 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i10 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i7 == 1) {
            i4 -= i2 / 2;
        } else if (i7 != 5) {
            i4 -= i2;
        }
        if (i8 == 16) {
            i5 -= i3 / 2;
        } else if (i8 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    /* renamed from: B */
    private static final MotionEvent m4714B(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        return obtain;
    }

    /* renamed from: C */
    private static final void m4715C(View view, int i) {
        amq amq = (amq) view.getLayoutParams();
        int i2 = amq.f110477i;
        if (i2 != i) {
            avl.m7932E(view, i - i2);
            amq.f110477i = i;
        }
    }

    /* renamed from: D */
    private static final void m4716D(View view, int i) {
        amq amq = (amq) view.getLayoutParams();
        int i2 = amq.f110478j;
        if (i2 != i) {
            avl.m7933F(view, i - i2);
            amq.f110478j = i;
        }
    }

    /* renamed from: a */
    public static amo m4717a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = String.valueOf(context.getPackageName()).concat(String.valueOf(str));
        } else if (str.indexOf(46) < 0) {
            String str2 = f11830a;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f11832c;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f11831b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (amo) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass ".concat(String.valueOf(str)), e);
        }
    }

    /* renamed from: m */
    static final amq m4718m(View view) {
        amq amq = (amq) view.getLayoutParams();
        if (!amq.f110470b) {
            if (view instanceof amn) {
                amo a = ((amn) view).mo30850a();
                if (a == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                amq.mo41631b(a);
                amq.f110470b = true;
            } else {
                amp amp = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    amp = (amp) cls.getAnnotation(amp.class);
                    if (amp != null) {
                        break;
                    }
                }
                if (amp != null) {
                    try {
                        amq.mo41631b((amo) amp.mo41629a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + amp.mo41629a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                amq.f110470b = true;
            }
        }
        return amq;
    }

    /* renamed from: o */
    private final int mo53826o() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            amq amq = (amq) childAt.getLayoutParams();
            i += childAt.getHeight() + amq.topMargin + amq.bottomMargin;
        }
        return i;
    }

    /* renamed from: p */
    private final int m4720p(int i) {
        int[] iArr = this.f11845p;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    /* renamed from: q */
    private static int m4721q(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: r */
    private static int m4722r(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: s */
    private static Rect m4723s() {
        Rect rect = (Rect) f11834i.mo5259a();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: u */
    private final void m4724u(amq amq, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + amq.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - amq.rightMargin));
        int max2 = Math.max(getPaddingTop() + amq.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - amq.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: v */
    private static void m4725v(Rect rect) {
        rect.setEmpty();
        f11834i.mo5260b(rect);
    }

    /* renamed from: w */
    private final void m4726w() {
        View view = this.f11846q;
        if (view != null) {
            amo amo = ((amq) view.getLayoutParams()).f110469a;
            if (amo != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                amo.mo1591m(this, this.f11846q, obtain);
                obtain.recycle();
            }
            this.f11846q = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((amq) getChildAt(i).getLayoutParams()).f110481m = false;
        }
        this.f11843n = false;
    }

    /* renamed from: x */
    private final void m4727x() {
        if (avl.m7970aj(this)) {
            if (this.f11850u == null) {
                this.f11850u = new uoz(this, 1);
            }
            avl.m7961aa(this, this.f11850u);
            setSystemUiVisibility(1280);
            return;
        }
        avl.m7961aa(this, (aug) null);
    }

    /* renamed from: y */
    private final boolean m4728y(amo amo, View view, MotionEvent motionEvent, int i) {
        if (i != 0) {
            return amo.mo1591m(this, view, motionEvent);
        }
        return amo.mo1592rc(this, view, motionEvent);
    }

    /* renamed from: z */
    private final boolean m4729z(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f11840k;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator comparator = f11833d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) list.get(i3);
            amq amq = (amq) view.getLayoutParams();
            amo amo = amq.f110469a;
            if (!z || actionMasked == 0) {
                if (!z && amo != null && (z = m4728y(amo, view, motionEvent, i))) {
                    this.f11846q = view;
                    if (!(actionMasked == 3 || actionMasked == 1)) {
                        for (int i4 = 0; i4 < i3; i4++) {
                            View view2 = (View) list.get(i4);
                            amo amo2 = ((amq) view2.getLayoutParams()).f110469a;
                            if (amo2 != null) {
                                if (motionEvent2 == null) {
                                    motionEvent2 = m4714B(motionEvent);
                                }
                                m4728y(amo2, view2, motionEvent2, i);
                            }
                        }
                    }
                }
                if (amq.f110469a == null) {
                    amq.f110481m = false;
                }
                boolean z2 = amq.f110481m;
            } else if (amo != null) {
                if (motionEvent2 == null) {
                    motionEvent2 = m4714B(motionEvent);
                }
                m4728y(amo, view, motionEvent2, i);
            }
        }
        list.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z;
    }

    /* renamed from: b */
    public final List mo3761b(View view) {
        amr amr = this.f11835e;
        int i = ((ajs) amr.f110487b).f7409d;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) ((ajs) amr.f110487b).mo3039f(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((ajs) amr.f110487b).mo3032c(i2));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* renamed from: c */
    public final void mo3762c(View view) {
        ArrayList a = this.f11835e.mo41634a(view);
        if (a != null && !a.isEmpty()) {
            for (int i = 0; i < a.size(); i++) {
                View view2 = (View) a.get(i);
                amo amo = ((amq) view2.getLayoutParams()).f110469a;
                if (amo != null) {
                    amo.mo8072rb(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof amq) && super.checkLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public final void mo3161d(View view, int i, int i2, int[] iArr, int i3) {
        amo amo;
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                amq amq = (amq) childAt.getLayoutParams();
                if (amq.mo41633d(i3) && (amo = amq.f110469a) != null) {
                    int[] iArr2 = this.f11841l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    amo.mo8157sL(this, childAt, view, i, i2, iArr2, i3);
                    if (i > 0) {
                        i4 = Math.max(i6, this.f11841l[0]);
                    } else {
                        i4 = Math.min(i6, this.f11841l[0]);
                    }
                    i6 = i4;
                    if (i2 > 0) {
                        i5 = Math.max(i7, this.f11841l[1]);
                    } else {
                        i5 = Math.min(i7, this.f11841l[1]);
                    }
                    i7 = i5;
                    z = true;
                }
            } else {
                int i9 = i3;
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            mo3774j(1);
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (dispatchKeyEvent || keyEvent.getAction() != 0) {
            return dispatchKeyEvent;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 19 && keyCode != 20 && keyCode != 62) {
            return dispatchKeyEvent;
        }
        if (keyEvent.getKeyCode() == 62) {
            if (keyEvent.isShiftPressed()) {
                i = -mo53826o();
            } else {
                i = mo53826o() - getHeight();
            }
        } else if (keyEvent.isAltPressed()) {
            i = getHeight();
        } else {
            i = (int) (((float) getHeight()) * 0.1f);
        }
        View view = this;
        while (true) {
            if (view != null) {
                if (view.isFocused()) {
                    break;
                }
                view = view instanceof ViewGroup ? ((ViewGroup) view).getFocusedChild() : null;
            } else {
                view = null;
                break;
            }
        }
        if (keyEvent.getKeyCode() == 19) {
            i = -i;
        }
        mo3197t(this, view, 2, 1);
        mo3164f(view, 0, 0, 0, i, 1, this.f11841l);
        mo3170h(view, 1);
        if (this.f11841l[1] > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        amo amo = ((amq) view.getLayoutParams()).f110469a;
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f11849t;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void mo3163e(View view, int i, int i2, int i3, int i4, int i5) {
        mo3164f(view, i, i2, i3, i4, 0, this.f11842m);
    }

    /* renamed from: f */
    public final void mo3164f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        amo amo;
        int i6;
        int i7;
        int childCount = getChildCount();
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                amq amq = (amq) childAt.getLayoutParams();
                if (amq.mo41633d(i5) && (amo = amq.f110469a) != null) {
                    int[] iArr2 = this.f11841l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    amo.mo8158sM(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    if (i3 > 0) {
                        i6 = Math.max(i8, this.f11841l[0]);
                    } else {
                        i6 = Math.min(i8, this.f11841l[0]);
                    }
                    i8 = i6;
                    if (i4 > 0) {
                        i7 = Math.max(i9, this.f11841l[1]);
                    } else {
                        i7 = Math.min(i9, this.f11841l[1]);
                    }
                    i9 = i7;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z) {
            mo3774j(1);
        }
    }

    /* renamed from: g */
    public final void mo3165g(View view, View view2, int i, int i2) {
        this.f11851v.mo5728b(i, i2);
        this.f11847r = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            amq amq = (amq) getChildAt(i3).getLayoutParams();
            if (amq.mo41633d(i2)) {
                amo amo = amq.f110469a;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new amq();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new amq(getContext(), attributeSet);
    }

    public final int getNestedScrollAxes() {
        return this.f11851v.mo5727a();
    }

    /* access modifiers changed from: protected */
    public final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* renamed from: h */
    public final void mo3170h(View view, int i) {
        this.f11851v.mo5729c(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            amq amq = (amq) childAt.getLayoutParams();
            if (amq.mo41633d(i)) {
                amo amo = amq.f110469a;
                if (amo != null) {
                    amo.mo8156qZ(this, childAt, view, i);
                }
                amq.mo41632c(i, false);
                amq.mo41630a();
            }
        }
        this.f11847r = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo3773i(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            ams.m72888a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x025d  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3774j(int r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            int r8 = p000.avl.m7991f(r24)
            java.util.List r2 = r0.f11839j
            int r9 = r2.size()
            android.graphics.Rect r10 = m4723s()
            android.graphics.Rect r11 = m4723s()
            android.graphics.Rect r12 = m4723s()
            r14 = 0
        L_0x001b:
            if (r14 >= r9) goto L_0x02c4
            java.util.List r2 = r0.f11839j
            java.lang.Object r2 = r2.get(r14)
            r15 = r2
            android.view.View r15 = (android.view.View) r15
            android.view.ViewGroup$LayoutParams r2 = r15.getLayoutParams()
            r7 = r2
            amq r7 = (p000.amq) r7
            if (r1 != 0) goto L_0x003e
            int r2 = r15.getVisibility()
            r3 = 8
            if (r2 != r3) goto L_0x003e
            r4 = r9
            r5 = r12
            r18 = r14
            r2 = 0
            goto L_0x02be
        L_0x003e:
            r6 = 0
        L_0x003f:
            if (r6 >= r14) goto L_0x00eb
            java.util.List r2 = r0.f11839j
            java.lang.Object r2 = r2.get(r6)
            android.view.View r2 = (android.view.View) r2
            android.view.View r3 = r7.f110480l
            if (r3 != r2) goto L_0x00d5
            android.view.ViewGroup$LayoutParams r2 = r15.getLayoutParams()
            r4 = r2
            amq r4 = (p000.amq) r4
            android.view.View r2 = r4.f110479k
            if (r2 == 0) goto L_0x00d5
            android.graphics.Rect r3 = m4723s()
            android.graphics.Rect r2 = m4723s()
            android.graphics.Rect r13 = m4723s()
            android.view.View r5 = r4.f110479k
            p000.ams.m72888a(r0, r5, r3)
            r5 = 0
            r0.mo3773i(r15, r5, r2)
            int r5 = r15.getMeasuredWidth()
            r17 = r9
            int r9 = r15.getMeasuredHeight()
            r18 = r14
            r14 = r2
            r2 = r8
            r19 = r3
            r20 = r4
            r4 = r13
            r16 = r5
            r21 = r12
            r12 = 1
            r5 = r20
            r22 = r6
            r6 = r16
            r23 = r7
            r7 = r9
            m4713A(r2, r3, r4, r5, r6, r7)
            int r2 = r13.left
            int r3 = r14.left
            if (r2 != r3) goto L_0x00a4
            int r2 = r13.top
            int r3 = r14.top
            if (r2 == r3) goto L_0x009e
            goto L_0x00a4
        L_0x009e:
            r3 = r16
            r2 = r20
            r5 = 0
            goto L_0x00a9
        L_0x00a4:
            r3 = r16
            r2 = r20
            r5 = 1
        L_0x00a9:
            r0.m4724u(r2, r13, r3, r9)
            int r3 = r13.left
            int r4 = r14.left
            int r3 = r3 - r4
            int r4 = r13.top
            int r6 = r14.top
            int r4 = r4 - r6
            if (r3 == 0) goto L_0x00bb
            p000.avl.m7932E(r15, r3)
        L_0x00bb:
            if (r4 == 0) goto L_0x00c0
            p000.avl.m7933F(r15, r4)
        L_0x00c0:
            if (r5 == 0) goto L_0x00cb
            amo r3 = r2.f110469a
            if (r3 == 0) goto L_0x00cb
            android.view.View r2 = r2.f110479k
            r3.mo8072rb(r0, r15, r2)
        L_0x00cb:
            m4725v(r19)
            m4725v(r14)
            m4725v(r13)
            goto L_0x00df
        L_0x00d5:
            r22 = r6
            r23 = r7
            r17 = r9
            r21 = r12
            r18 = r14
        L_0x00df:
            int r6 = r22 + 1
            r9 = r17
            r14 = r18
            r12 = r21
            r7 = r23
            goto L_0x003f
        L_0x00eb:
            r23 = r7
            r17 = r9
            r21 = r12
            r18 = r14
            r12 = 1
            r0.mo3773i(r15, r12, r11)
            r2 = r23
            int r3 = r2.f110475g
            r4 = 5
            r5 = 3
            r6 = 80
            r7 = 48
            if (r3 == 0) goto L_0x0151
            boolean r3 = r11.isEmpty()
            if (r3 != 0) goto L_0x0151
            int r3 = r2.f110475g
            int r3 = android.view.Gravity.getAbsoluteGravity(r3, r8)
            r9 = r3 & 112(0x70, float:1.57E-43)
            if (r9 == r7) goto L_0x0126
            if (r9 == r6) goto L_0x0116
            goto L_0x0130
        L_0x0116:
            int r9 = r10.bottom
            int r13 = r24.getHeight()
            int r14 = r11.top
            int r13 = r13 - r14
            int r9 = java.lang.Math.max(r9, r13)
            r10.bottom = r9
            goto L_0x0130
        L_0x0126:
            int r9 = r10.top
            int r13 = r11.bottom
            int r9 = java.lang.Math.max(r9, r13)
            r10.top = r9
        L_0x0130:
            r3 = r3 & 7
            if (r3 == r5) goto L_0x0147
            if (r3 == r4) goto L_0x0137
            goto L_0x0151
        L_0x0137:
            int r3 = r10.right
            int r9 = r24.getWidth()
            int r13 = r11.left
            int r9 = r9 - r13
            int r3 = java.lang.Math.max(r3, r9)
            r10.right = r3
            goto L_0x0151
        L_0x0147:
            int r3 = r10.left
            int r9 = r11.right
            int r3 = java.lang.Math.max(r3, r9)
            r10.left = r3
        L_0x0151:
            int r2 = r2.f110476h
            if (r2 == 0) goto L_0x0259
            int r2 = r15.getVisibility()
            if (r2 != 0) goto L_0x0259
            boolean r2 = p000.avl.m7976ap(r15)
            if (r2 != 0) goto L_0x0163
            goto L_0x0259
        L_0x0163:
            int r2 = r15.getWidth()
            if (r2 <= 0) goto L_0x0259
            int r2 = r15.getHeight()
            if (r2 <= 0) goto L_0x0259
            android.view.ViewGroup$LayoutParams r2 = r15.getLayoutParams()
            amq r2 = (p000.amq) r2
            amo r3 = r2.f110469a
            android.graphics.Rect r9 = m4723s()
            android.graphics.Rect r13 = m4723s()
            int r14 = r15.getLeft()
            int r12 = r15.getTop()
            int r4 = r15.getRight()
            int r5 = r15.getBottom()
            r13.set(r14, r12, r4, r5)
            if (r3 == 0) goto L_0x01c5
            boolean r3 = r3.mo30955s(r15, r9)
            if (r3 == 0) goto L_0x01c5
            boolean r3 = r13.contains(r9)
            if (r3 == 0) goto L_0x01a1
            goto L_0x01c8
        L_0x01a1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Rect should be within the child's bounds. Rect:"
            r2.<init>(r3)
            java.lang.String r3 = r9.toShortString()
            r2.append(r3)
            java.lang.String r3 = " | Bounds:"
            r2.append(r3)
            java.lang.String r3 = r13.toShortString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01c5:
            r9.set(r13)
        L_0x01c8:
            m4725v(r13)
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L_0x01d6
            m4725v(r9)
            goto L_0x0259
        L_0x01d6:
            int r3 = r2.f110476h
            int r3 = android.view.Gravity.getAbsoluteGravity(r3, r8)
            r4 = r3 & 48
            if (r4 != r7) goto L_0x01f4
            int r4 = r9.top
            int r5 = r2.topMargin
            int r4 = r4 - r5
            int r5 = r2.f110478j
            int r4 = r4 - r5
            int r5 = r10.top
            if (r4 >= r5) goto L_0x01f4
            int r5 = r10.top
            int r5 = r5 - r4
            m4716D(r15, r5)
            r5 = 1
            goto L_0x01f5
        L_0x01f4:
            r5 = 0
        L_0x01f5:
            r4 = r3 & 80
            if (r4 != r6) goto L_0x0211
            int r4 = r24.getHeight()
            int r6 = r9.bottom
            int r4 = r4 - r6
            int r6 = r2.bottomMargin
            int r4 = r4 - r6
            int r6 = r2.f110478j
            int r4 = r4 + r6
            int r6 = r10.bottom
            if (r4 >= r6) goto L_0x0211
            int r5 = r10.bottom
            int r4 = r4 - r5
            m4716D(r15, r4)
            goto L_0x0217
        L_0x0211:
            if (r5 != 0) goto L_0x0217
            r4 = 0
            m4716D(r15, r4)
        L_0x0217:
            r4 = r3 & 3
            r5 = 3
            if (r4 != r5) goto L_0x0230
            int r4 = r9.left
            int r5 = r2.leftMargin
            int r4 = r4 - r5
            int r5 = r2.f110477i
            int r4 = r4 - r5
            int r5 = r10.left
            if (r4 >= r5) goto L_0x0230
            int r5 = r10.left
            int r5 = r5 - r4
            m4715C(r15, r5)
            r5 = 1
            goto L_0x0231
        L_0x0230:
            r5 = 0
        L_0x0231:
            r3 = r3 & 5
            r4 = 5
            if (r3 != r4) goto L_0x024f
            int r3 = r24.getWidth()
            int r4 = r9.right
            int r3 = r3 - r4
            int r4 = r2.rightMargin
            int r3 = r3 - r4
            int r2 = r2.f110477i
            int r3 = r3 + r2
            int r2 = r10.right
            if (r3 >= r2) goto L_0x024f
            int r2 = r10.right
            int r3 = r3 - r2
            m4715C(r15, r3)
            r2 = 0
            goto L_0x0255
        L_0x024f:
            r2 = 0
            if (r5 != 0) goto L_0x0255
            m4715C(r15, r2)
        L_0x0255:
            m4725v(r9)
            goto L_0x025a
        L_0x0259:
            r2 = 0
        L_0x025a:
            r3 = 2
            if (r1 == r3) goto L_0x027f
            android.view.ViewGroup$LayoutParams r4 = r15.getLayoutParams()
            amq r4 = (p000.amq) r4
            android.graphics.Rect r4 = r4.f110484p
            r5 = r21
            r5.set(r4)
            boolean r4 = r5.equals(r11)
            if (r4 != 0) goto L_0x027c
            android.view.ViewGroup$LayoutParams r4 = r15.getLayoutParams()
            amq r4 = (p000.amq) r4
            android.graphics.Rect r4 = r4.f110484p
            r4.set(r11)
            goto L_0x0281
        L_0x027c:
            r4 = r17
            goto L_0x02be
        L_0x027f:
            r5 = r21
        L_0x0281:
            int r14 = r18 + 1
            r4 = r17
        L_0x0285:
            if (r14 >= r4) goto L_0x02be
            java.util.List r6 = r0.f11839j
            java.lang.Object r6 = r6.get(r14)
            android.view.View r6 = (android.view.View) r6
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            amq r7 = (p000.amq) r7
            amo r9 = r7.f110469a
            if (r9 == 0) goto L_0x02ba
            boolean r12 = r9.mo8071n(r15)
            if (r12 == 0) goto L_0x02ba
            if (r1 != 0) goto L_0x02a9
            boolean r12 = r7.f110483o
            if (r12 == 0) goto L_0x02a9
            r7.mo41630a()
            goto L_0x02ba
        L_0x02a9:
            if (r1 == r3) goto L_0x02b0
            boolean r6 = r9.mo8072rb(r0, r6, r15)
            goto L_0x02b4
        L_0x02b0:
            r9.mo30886o(r0, r15)
            r6 = 1
        L_0x02b4:
            r9 = 1
            if (r1 != r9) goto L_0x02bb
            r7.f110483o = r6
            goto L_0x02bb
        L_0x02ba:
            r9 = 1
        L_0x02bb:
            int r14 = r14 + 1
            goto L_0x0285
        L_0x02be:
            int r14 = r18 + 1
            r9 = r4
            r12 = r5
            goto L_0x001b
        L_0x02c4:
            r5 = r12
            m4725v(r10)
            m4725v(r11)
            m4725v(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.mo3774j(int):void");
    }

    /* renamed from: k */
    public final void mo3775k(View view, int i) {
        int i2;
        amq amq = (amq) view.getLayoutParams();
        View view2 = amq.f110479k;
        if (view2 == null && amq.f110474f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (view2 != null) {
            Rect s = m4723s();
            Rect s2 = m4723s();
            try {
                ams.m72888a(this, view2, s);
                amq amq2 = (amq) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m4713A(i, s, s2, amq2, measuredWidth, measuredHeight);
                m4724u(amq2, s2, measuredWidth, measuredHeight);
                view.layout(s2.left, s2.top, s2.right, s2.bottom);
            } finally {
                m4725v(s);
                m4725v(s2);
            }
        } else {
            int i3 = amq.f110473e;
            if (i3 >= 0) {
                amq amq3 = (amq) view.getLayoutParams();
                int absoluteGravity = Gravity.getAbsoluteGravity(m4722r(amq3.f110471c), i);
                int i4 = absoluteGravity & 7;
                int i5 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i == 1) {
                    i3 = width - i3;
                }
                int p = m4720p(i3) - measuredWidth2;
                if (i4 == 1) {
                    p += measuredWidth2 / 2;
                } else if (i4 == 5) {
                    p += measuredWidth2;
                }
                if (i5 != 16) {
                    i2 = i5 != 80 ? 0 : measuredHeight2;
                } else {
                    i2 = measuredHeight2 / 2;
                }
                int max = Math.max(getPaddingLeft() + amq3.leftMargin, Math.min(p, ((width - getPaddingRight()) - measuredWidth2) - amq3.rightMargin));
                int max2 = Math.max(getPaddingTop() + amq3.topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - amq3.bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            amq amq4 = (amq) view.getLayoutParams();
            Rect s3 = m4723s();
            s3.set(getPaddingLeft() + amq4.leftMargin, getPaddingTop() + amq4.topMargin, (getWidth() - getPaddingRight()) - amq4.rightMargin, (getHeight() - getPaddingBottom()) - amq4.bottomMargin);
            if (this.f11836f != null && avl.m7970aj(this) && !avl.m7970aj(view)) {
                s3.left += this.f11836f.mo29589b();
                s3.top += this.f11836f.mo29591d();
                s3.right -= this.f11836f.mo29590c();
                s3.bottom -= this.f11836f.mo29588a();
            }
            Rect s4 = m4723s();
            atr.m7115a(m4721q(amq4.f110471c), view.getMeasuredWidth(), view.getMeasuredHeight(), s3, s4, i);
            view.layout(s4.left, s4.top, s4.right, s4.bottom);
            m4725v(s3);
            m4725v(s4);
        }
    }

    /* renamed from: l */
    public final boolean mo3776l(View view, int i, int i2) {
        Rect s = m4723s();
        ams.m72888a(this, view, s);
        try {
            return s.contains(i, i2);
        } finally {
            m4725v(s);
        }
    }

    /* renamed from: n */
    public final void mo3777n(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4726w();
        if (this.f11848s) {
            if (this.f11852w == null) {
                this.f11852w = new eqw(this, 1);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f11852w);
        }
        if (this.f11836f == null && avl.m7970aj(this)) {
            avl.m7939L(this);
        }
        this.f11844o = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4726w();
        if (this.f11848s && this.f11852w != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f11852w);
        }
        View view = this.f11847r;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f11844o = false;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f11837g && this.f11849t != null) {
            awk awk = this.f11836f;
            int d = awk != null ? awk.mo29591d() : 0;
            if (d > 0) {
                this.f11849t.setBounds(0, 0, getWidth(), d);
                this.f11849t.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m4726w();
            actionMasked = 0;
        }
        boolean z = m4729z(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.f11846q = null;
            m4726w();
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        amo amo;
        int f = avl.m7991f(this);
        int size = this.f11839j.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f11839j.get(i5);
            if (view.getVisibility() != 8 && ((amo = ((amq) view.getLayoutParams()).f110469a) == null || !amo.mo8070h(this, view, f))) {
                mo3775k(view, f);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v25, types: [java.lang.Object, atb] */
    /* JADX WARNING: type inference failed for: r4v36, types: [java.lang.Object, atb] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x034e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r6 = r30
            java.util.List r0 = r6.f11839j
            r0.clear()
            amr r0 = r6.f11835e
            java.lang.Object r1 = r0.f110487b
            ajs r1 = (p000.ajs) r1
            int r1 = r1.f7409d
            r7 = 0
            r2 = 0
        L_0x0011:
            if (r2 >= r1) goto L_0x002a
            java.lang.Object r3 = r0.f110487b
            ajs r3 = (p000.ajs) r3
            java.lang.Object r3 = r3.mo3039f(r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L_0x0027
            r3.clear()
            java.lang.Object r4 = r0.f110486a
            r4.mo5260b(r3)
        L_0x0027:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x002a:
            java.lang.Object r0 = r0.f110487b
            ajs r0 = (p000.ajs) r0
            r0.clear()
            int r0 = r30.getChildCount()
            r1 = 0
        L_0x0036:
            if (r1 >= r0) goto L_0x018f
            android.view.View r2 = r6.getChildAt(r1)
            amq r3 = m4718m(r2)
            int r4 = r3.f110474f
            r5 = -1
            r8 = 0
            if (r4 != r5) goto L_0x004c
            r3.f110480l = r8
            r3.f110479k = r8
            goto L_0x00d3
        L_0x004c:
            android.view.View r4 = r3.f110479k
            if (r4 == 0) goto L_0x007a
            int r4 = r4.getId()
            int r5 = r3.f110474f
            if (r4 == r5) goto L_0x0059
            goto L_0x007a
        L_0x0059:
            android.view.View r4 = r3.f110479k
            android.view.ViewParent r5 = r4.getParent()
        L_0x005f:
            if (r5 == r6) goto L_0x0077
            if (r5 == 0) goto L_0x0072
            if (r5 != r2) goto L_0x0066
            goto L_0x0072
        L_0x0066:
            boolean r9 = r5 instanceof android.view.View
            if (r9 == 0) goto L_0x006d
            r4 = r5
            android.view.View r4 = (android.view.View) r4
        L_0x006d:
            android.view.ViewParent r5 = r5.getParent()
            goto L_0x005f
        L_0x0072:
            r3.f110480l = r8
            r3.f110479k = r8
            goto L_0x007a
        L_0x0077:
            r3.f110480l = r4
            goto L_0x00d1
        L_0x007a:
            int r4 = r3.f110474f
            android.view.View r4 = r6.findViewById(r4)
            r3.f110479k = r4
            android.view.View r4 = r3.f110479k
            if (r4 == 0) goto L_0x00c7
            if (r4 != r6) goto L_0x009b
            boolean r4 = r30.isInEditMode()
            if (r4 == 0) goto L_0x0093
            r3.f110480l = r8
            r3.f110479k = r8
            goto L_0x00d1
        L_0x0093:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x009b:
            android.view.ViewParent r5 = r4.getParent()
        L_0x009f:
            if (r5 == r6) goto L_0x00c4
            if (r5 == 0) goto L_0x00c4
            if (r5 != r2) goto L_0x00b8
            boolean r4 = r30.isInEditMode()
            if (r4 == 0) goto L_0x00b0
            r3.f110480l = r8
            r3.f110479k = r8
            goto L_0x00d1
        L_0x00b0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x00b8:
            boolean r9 = r5 instanceof android.view.View
            if (r9 == 0) goto L_0x00bf
            r4 = r5
            android.view.View r4 = (android.view.View) r4
        L_0x00bf:
            android.view.ViewParent r5 = r5.getParent()
            goto L_0x009f
        L_0x00c4:
            r3.f110480l = r4
            goto L_0x00d1
        L_0x00c7:
            boolean r4 = r30.isInEditMode()
            if (r4 == 0) goto L_0x0169
            r3.f110480l = r8
            r3.f110479k = r8
        L_0x00d1:
            android.view.View r4 = r3.f110479k
        L_0x00d3:
            amr r4 = r6.f11835e
            r4.mo41635b(r2)
            r4 = 0
        L_0x00d9:
            if (r4 >= r0) goto L_0x0165
            if (r4 != r1) goto L_0x00df
            goto L_0x0159
        L_0x00df:
            android.view.View r5 = r6.getChildAt(r4)
            android.view.View r8 = r3.f110480l
            if (r5 == r8) goto L_0x010d
            int r8 = p000.avl.m7991f(r30)
            android.view.ViewGroup$LayoutParams r9 = r5.getLayoutParams()
            amq r9 = (p000.amq) r9
            int r9 = r9.f110475g
            int r9 = android.view.Gravity.getAbsoluteGravity(r9, r8)
            if (r9 == 0) goto L_0x0103
            int r10 = r3.f110476h
            int r8 = android.view.Gravity.getAbsoluteGravity(r10, r8)
            r8 = r8 & r9
            if (r8 != r9) goto L_0x0103
            goto L_0x010d
        L_0x0103:
            amo r8 = r3.f110469a
            if (r8 == 0) goto L_0x0159
            boolean r8 = r8.mo8071n(r5)
            if (r8 == 0) goto L_0x0159
        L_0x010d:
            amr r8 = r6.f11835e
            java.lang.Object r8 = r8.f110487b
            ajs r8 = (p000.ajs) r8
            boolean r8 = r8.containsKey(r5)
            if (r8 != 0) goto L_0x011e
            amr r8 = r6.f11835e
            r8.mo41635b(r5)
        L_0x011e:
            amr r8 = r6.f11835e
            java.lang.Object r9 = r8.f110487b
            ajs r9 = (p000.ajs) r9
            boolean r9 = r9.containsKey(r5)
            if (r9 == 0) goto L_0x015d
            java.lang.Object r9 = r8.f110487b
            ajs r9 = (p000.ajs) r9
            boolean r9 = r9.containsKey(r2)
            if (r9 == 0) goto L_0x015d
            java.lang.Object r9 = r8.f110487b
            ajs r9 = (p000.ajs) r9
            java.lang.Object r9 = r9.get(r5)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 != 0) goto L_0x0156
            java.lang.Object r9 = r8.f110486a
            java.lang.Object r9 = r9.mo5259a()
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 != 0) goto L_0x014f
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x014f:
            java.lang.Object r8 = r8.f110487b
            ajs r8 = (p000.ajs) r8
            r8.put(r5, r9)
        L_0x0156:
            r9.add(r2)
        L_0x0159:
            int r4 = r4 + 1
            goto L_0x00d9
        L_0x015d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L_0x0165:
            int r1 = r1 + 1
            goto L_0x0036
        L_0x0169:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Could not find CoordinatorLayout descendant view with id "
            r1.<init>(r4)
            android.content.res.Resources r4 = r30.getResources()
            int r3 = r3.f110474f
            java.lang.String r3 = r4.getResourceName(r3)
            r1.append(r3)
            java.lang.String r3 = " to anchor view "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x018f:
            java.util.List r0 = r6.f11839j
            amr r1 = r6.f11835e
            java.lang.Object r2 = r1.f110488c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.clear()
            java.lang.Object r2 = r1.f110489d
            java.util.HashSet r2 = (java.util.HashSet) r2
            r2.clear()
            java.lang.Object r2 = r1.f110487b
            ajs r2 = (p000.ajs) r2
            int r2 = r2.f7409d
            r3 = 0
        L_0x01a8:
            if (r3 >= r2) goto L_0x01c0
            java.lang.Object r4 = r1.f110487b
            ajs r4 = (p000.ajs) r4
            java.lang.Object r4 = r4.mo3032c(r3)
            java.lang.Object r5 = r1.f110488c
            java.lang.Object r8 = r1.f110489d
            java.util.HashSet r8 = (java.util.HashSet) r8
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r1.mo41636c(r4, r5, r8)
            int r3 = r3 + 1
            goto L_0x01a8
        L_0x01c0:
            java.lang.Object r1 = r1.f110488c
            r0.addAll(r1)
            java.util.List r0 = r6.f11839j
            java.util.Collections.reverse(r0)
            int r0 = r30.getChildCount()
            r1 = 0
        L_0x01cf:
            r8 = 1
            if (r1 >= r0) goto L_0x01fb
            android.view.View r2 = r6.getChildAt(r1)
            amr r3 = r6.f11835e
            java.lang.Object r4 = r3.f110487b
            ajs r4 = (p000.ajs) r4
            int r4 = r4.f7409d
            r5 = 0
        L_0x01df:
            if (r5 >= r4) goto L_0x01f8
            java.lang.Object r9 = r3.f110487b
            ajs r9 = (p000.ajs) r9
            java.lang.Object r9 = r9.mo3039f(r5)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x01f5
            boolean r9 = r9.contains(r2)
            if (r9 == 0) goto L_0x01f5
            r0 = 1
            goto L_0x01fc
        L_0x01f5:
            int r5 = r5 + 1
            goto L_0x01df
        L_0x01f8:
            int r1 = r1 + 1
            goto L_0x01cf
        L_0x01fb:
            r0 = 0
        L_0x01fc:
            boolean r1 = r6.f11848s
            if (r0 == r1) goto L_0x0230
            if (r0 == 0) goto L_0x021d
            boolean r0 = r6.f11844o
            if (r0 == 0) goto L_0x021a
            eqw r0 = r6.f11852w
            if (r0 != 0) goto L_0x0211
            eqw r0 = new eqw
            r0.<init>((androidx.coordinatorlayout.widget.CoordinatorLayout) r6, (int) r8)
            r6.f11852w = r0
        L_0x0211:
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            eqw r1 = r6.f11852w
            r0.addOnPreDrawListener(r1)
        L_0x021a:
            r6.f11848s = r8
            goto L_0x0230
        L_0x021d:
            boolean r0 = r6.f11844o
            if (r0 == 0) goto L_0x022e
            eqw r0 = r6.f11852w
            if (r0 == 0) goto L_0x022e
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            eqw r1 = r6.f11852w
            r0.removeOnPreDrawListener(r1)
        L_0x022e:
            r6.f11848s = r7
        L_0x0230:
            int r9 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r10 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r11 = p000.avl.m7991f(r30)
            if (r11 != r8) goto L_0x0248
            r12 = 1
            goto L_0x0249
        L_0x0248:
            r12 = 0
        L_0x0249:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r9 + r10
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            awk r2 = r6.f11836f
            if (r2 == 0) goto L_0x0272
            boolean r2 = p000.avl.m7970aj(r30)
            if (r2 == 0) goto L_0x0272
            r19 = 1
            goto L_0x0274
        L_0x0272:
            r19 = 0
        L_0x0274:
            java.util.List r2 = r6.f11839j
            int r5 = r2.size()
            r4 = r0
            r3 = r1
            r1 = 0
            r2 = 0
        L_0x027e:
            if (r2 >= r5) goto L_0x03b3
            java.util.List r0 = r6.f11839j
            java.lang.Object r0 = r0.get(r2)
            android.view.View r0 = (android.view.View) r0
            int r8 = r0.getVisibility()
            r7 = 8
            if (r8 == r7) goto L_0x0396
            android.view.ViewGroup$LayoutParams r7 = r0.getLayoutParams()
            amq r7 = (p000.amq) r7
            int r8 = r7.f110473e
            if (r8 < 0) goto L_0x02dd
            if (r13 == 0) goto L_0x02dd
            int r8 = r6.m4720p(r8)
            r21 = r1
            int r1 = r7.f110471c
            int r1 = m4722r(r1)
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r11)
            r1 = r1 & 7
            r22 = r2
            r2 = 3
            if (r1 != r2) goto L_0x02b9
            if (r12 == 0) goto L_0x02c0
            r1 = 3
            r23 = 1
            goto L_0x02bb
        L_0x02b9:
            r23 = r12
        L_0x02bb:
            r2 = 5
            if (r1 != r2) goto L_0x02cd
            if (r23 == 0) goto L_0x02ca
        L_0x02c0:
            int r1 = r14 - r10
            int r1 = r1 - r8
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
        L_0x02c8:
            r8 = r1
            goto L_0x02e3
        L_0x02ca:
            r1 = 5
            r23 = 0
        L_0x02cd:
            if (r1 != r2) goto L_0x02d1
            if (r23 == 0) goto L_0x02d6
        L_0x02d1:
            r2 = 3
            if (r1 != r2) goto L_0x02e1
            if (r23 == 0) goto L_0x02e1
        L_0x02d6:
            int r8 = r8 - r9
            r2 = 0
            int r1 = java.lang.Math.max(r2, r8)
            goto L_0x02c8
        L_0x02dd:
            r21 = r1
            r22 = r2
        L_0x02e1:
            r2 = 0
            r8 = 0
        L_0x02e3:
            if (r19 == 0) goto L_0x0315
            boolean r1 = p000.avl.m7970aj(r0)
            if (r1 != 0) goto L_0x0315
            awk r1 = r6.f11836f
            int r1 = r1.mo29589b()
            awk r2 = r6.f11836f
            int r2 = r2.mo29590c()
            int r1 = r1 + r2
            awk r2 = r6.f11836f
            int r2 = r2.mo29591d()
            r23 = r0
            awk r0 = r6.f11836f
            int r0 = r0.mo29588a()
            int r2 = r2 + r0
            int r0 = r14 - r1
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r1 = r16 - r2
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r15)
            r2 = r0
            goto L_0x031b
        L_0x0315:
            r23 = r0
            r2 = r31
            r1 = r32
        L_0x031b:
            amo r0 = r7.f110469a
            if (r0 == 0) goto L_0x034e
            r24 = r23
            r23 = r9
            r9 = r21
            r21 = r1
            r1 = r30
            r20 = r22
            r25 = 0
            r22 = r2
            r2 = r24
            r26 = r10
            r10 = r3
            r3 = r22
            r27 = r11
            r11 = r4
            r4 = r8
            r28 = r5
            r5 = r21
            boolean r0 = r0.mo30881p(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x034b
            r2 = r21
            r1 = r22
            r0 = r24
            goto L_0x0367
        L_0x034b:
            r0 = r24
            goto L_0x036a
        L_0x034e:
            r28 = r5
            r26 = r10
            r27 = r11
            r20 = r22
            r24 = r23
            r25 = 0
            r10 = r3
            r11 = r4
            r23 = r9
            r9 = r21
            r0 = r24
            r29 = r2
            r2 = r1
            r1 = r29
        L_0x0367:
            r6.mo3777n(r0, r1, r8, r2)
        L_0x036a:
            int r1 = r0.getMeasuredWidth()
            int r1 = r17 + r1
            int r2 = r7.leftMargin
            int r1 = r1 + r2
            int r2 = r7.rightMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r11, r1)
            int r2 = r0.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r7.topMargin
            int r2 = r2 + r3
            int r3 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = java.lang.Math.max(r10, r2)
            int r0 = r0.getMeasuredState()
            int r0 = android.view.View.combineMeasuredStates(r9, r0)
            r4 = r1
            r3 = r2
            r1 = r0
            goto L_0x03a5
        L_0x0396:
            r20 = r2
            r28 = r5
            r23 = r9
            r26 = r10
            r27 = r11
            r25 = 0
            r9 = r1
            r10 = r3
            r11 = r4
        L_0x03a5:
            int r2 = r20 + 1
            r9 = r23
            r10 = r26
            r11 = r27
            r5 = r28
            r7 = 0
            r8 = 1
            goto L_0x027e
        L_0x03b3:
            r9 = r1
            r10 = r3
            r11 = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r9
            r1 = r31
            int r0 = android.view.View.resolveSizeAndState(r11, r1, r0)
            int r1 = r9 << 16
            r2 = r32
            int r1 = android.view.View.resolveSizeAndState(r10, r2, r1)
            r6.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        amo amo;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                amq amq = (amq) childAt.getLayoutParams();
                if (amq.f110482n && (amo = amq.f110469a) != null) {
                    z2 |= amo.mo8153i(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            mo3774j(1);
        }
        return z2;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        amo amo;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                amq amq = (amq) childAt.getLayoutParams();
                if (amq.f110482n && (amo = amq.f110469a) != null) {
                    z |= amo.mo8154j(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo3161d(view, i, i2, iArr, 0);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo3163e(view, i, i2, i3, i4, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo3165g(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f11914d);
        SparseArray sparseArray = savedState.f11853a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            amo amo = m4718m(childAt).f110469a;
            if (!(id == -1 || amo == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {
                amo.mo30882q(childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Parcelable r;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            amo amo = ((amq) childAt.getLayoutParams()).f110469a;
            if (!(id == -1 || amo == null || (r = amo.mo30883r(childAt)) == null)) {
                sparseArray.append(id, r);
            }
        }
        savedState.f11853a = sparseArray;
        return savedState;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo3197t(view, view2, i, 0);
    }

    public final void onStopNestedScroll(View view) {
        mo3170h(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f11846q;
        boolean z2 = false;
        if (view != null) {
            amo amo = ((amq) view.getLayoutParams()).f110469a;
            z = amo != null ? amo.mo1591m(this, this.f11846q, motionEvent) : false;
        } else {
            z = m4729z(motionEvent, 1);
            if (actionMasked != 0 && z) {
                z2 = true;
            }
        }
        if (this.f11846q == null || actionMasked == 3) {
            z |= super.onTouchEvent(motionEvent);
        } else if (z2) {
            MotionEvent B = m4714B(motionEvent);
            super.onTouchEvent(B);
            B.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f11846q = null;
            m4726w();
        }
        return z;
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        amo amo = ((amq) view.getLayoutParams()).f110469a;
        if (amo == null || !amo.mo30885k(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f11843n) {
            if (this.f11846q == null) {
                int childCount = getChildCount();
                MotionEvent motionEvent = null;
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    amo amo = ((amq) childAt.getLayoutParams()).f110469a;
                    if (amo != null) {
                        if (motionEvent == null) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        }
                        amo.mo1592rc(this, childAt, motionEvent);
                    }
                }
                if (motionEvent != null) {
                    motionEvent.recycle();
                }
            }
            m4726w();
            this.f11843n = true;
        }
    }

    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m4727x();
    }

    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f11838h = onHierarchyChangeListener;
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.f11849t;
        if (drawable != null) {
            boolean z = i == 0;
            if (drawable.isVisible() != z) {
                this.f11849t.setVisible(z, false);
            }
        }
    }

    /* renamed from: t */
    public final boolean mo3197t(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                amq amq = (amq) childAt.getLayoutParams();
                amo amo = amq.f110469a;
                if (amo != null) {
                    boolean l = amo.mo8155l(this, childAt, view, view2, i, i2);
                    z |= l;
                    amq.mo41632c(i3, l);
                } else {
                    amq.mo41632c(i3, false);
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f11849t;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof amq) {
            return new amq((amq) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new amq((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new amq(layoutParams);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.f11839j = new ArrayList();
        this.f11835e = new amr();
        this.f11840k = new ArrayList();
        this.f11841l = new int[2];
        this.f11842m = new int[2];
        this.f11851v = new auf();
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, amm.f110464a, 0, 2132085376);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, amm.f110464a, i, 0);
        }
        if (i == 0) {
            avl.m7940M(this, context, amm.f110464a, attributeSet, typedArray, 0, 2132085376);
        } else {
            avl.m7940M(this, context, amm.f110464a, attributeSet, typedArray, i, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f11845p = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f11845p.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f11845p;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f11849t = typedArray.getDrawable(1);
        typedArray.recycle();
        m4727x();
        super.setOnHierarchyChangeListener(new uoh(this, 1));
        if (avl.m7989d(this) == 0) {
            avl.m7952Y(this, 1);
        }
    }

    /* compiled from: PG */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C1710oh(4);

        /* renamed from: a */
        SparseArray f11853a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f11853a = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f11853a.append(iArr[i], readParcelableArray[i]);
            }
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.f11853a;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f11853a.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.f11853a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
