package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: a */
    final SparseArray f11816a = new SparseArray();

    /* renamed from: b */
    public final ArrayList f11817b = new ArrayList(4);

    /* renamed from: c */
    protected final aky f11818c = new aky();

    /* renamed from: d */
    public int f11819d = 0;

    /* renamed from: e */
    protected boolean f11820e = true;

    /* renamed from: f */
    public int f11821f = 257;

    /* renamed from: g */
    final alx f11822g = new alx(this, this);

    /* renamed from: h */
    private int f11823h = 0;

    /* renamed from: i */
    private int f11824i = Integer.MAX_VALUE;

    /* renamed from: j */
    private int f11825j = Integer.MAX_VALUE;

    /* renamed from: k */
    private amg f11826k = null;

    /* renamed from: l */
    private int f11827l = -1;

    /* renamed from: m */
    private HashMap f11828m = new HashMap();

    /* renamed from: n */
    private final SparseArray f11829n = new SparseArray();

    public ConstraintLayout(Context context) {
        super(context);
        m4705f((AttributeSet) null, 0, 0);
    }

    /* renamed from: d */
    protected static final alw m4704d() {
        return new alw();
    }

    /* renamed from: f */
    private final void m4705f(AttributeSet attributeSet, int i, int i2) {
        aky aky = this.f11818c;
        aky.f65167ag = this;
        alx alx = this.f11822g;
        aky.f107647aG = alx;
        aky.f107640a.f108265g = alx;
        this.f11816a.put(getId(), this);
        this.f11826k = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, amk.f110454b, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.f11823h = obtainStyledAttributes.getDimensionPixelOffset(16, this.f11823h);
                } else if (index == 17) {
                    this.f11819d = obtainStyledAttributes.getDimensionPixelOffset(17, this.f11819d);
                } else if (index == 14) {
                    this.f11824i = obtainStyledAttributes.getDimensionPixelOffset(14, this.f11824i);
                } else if (index == 15) {
                    this.f11825j = obtainStyledAttributes.getDimensionPixelOffset(15, this.f11825j);
                } else if (index == 113) {
                    this.f11821f = obtainStyledAttributes.getInt(113, this.f11821f);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(56, 0);
                    if (resourceId != 0) {
                        try {
                            amo.m72843t(getContext(), resourceId, new SparseArray(), new SparseArray());
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(34, 0);
                    try {
                        amg amg = new amg();
                        this.f11826k = amg;
                        amg.mo41615c(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f11826k = null;
                    }
                    this.f11827l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f11818c.mo41533U(this.f11821f);
    }

    /* renamed from: g */
    private final void mo44111g() {
        this.f11820e = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:370:0x087a  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void mo44112h() {
        /*
            r24 = this;
            r7 = r24
            java.lang.String r1 = "\" not found on "
            java.lang.String r2 = " Custom Attribute \""
            java.lang.String r3 = "TransitionLayout"
            boolean r8 = r24.isInEditMode()
            int r9 = r24.getChildCount()
            r0 = 0
        L_0x0011:
            if (r0 >= r9) goto L_0x0023
            android.view.View r4 = r7.getChildAt(r0)
            akx r4 = r7.mo3753rX(r4)
            if (r4 == 0) goto L_0x0020
            r4.mo28104s()
        L_0x0020:
            int r0 = r0 + 1
            goto L_0x0011
        L_0x0023:
            r4 = 0
            r11 = -1
            if (r8 == 0) goto L_0x00b7
            r0 = 0
        L_0x0028:
            if (r0 >= r9) goto L_0x00b7
            android.view.View r5 = r7.getChildAt(r0)
            android.content.res.Resources r6 = r24.getResources()     // Catch:{ NotFoundException -> 0x00b3 }
            int r12 = r5.getId()     // Catch:{ NotFoundException -> 0x00b3 }
            java.lang.String r6 = r6.getResourceName(r12)     // Catch:{ NotFoundException -> 0x00b3 }
            int r12 = r5.getId()     // Catch:{ NotFoundException -> 0x00b3 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NotFoundException -> 0x00b3 }
            boolean r13 = r6 instanceof java.lang.String     // Catch:{ NotFoundException -> 0x00b3 }
            if (r13 == 0) goto L_0x006e
            java.util.HashMap r13 = r7.f11828m     // Catch:{ NotFoundException -> 0x00b3 }
            if (r13 != 0) goto L_0x0051
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ NotFoundException -> 0x00b3 }
            r13.<init>()     // Catch:{ NotFoundException -> 0x00b3 }
            r7.f11828m = r13     // Catch:{ NotFoundException -> 0x00b3 }
        L_0x0051:
            java.lang.String r13 = "/"
            int r13 = r6.indexOf(r13)     // Catch:{ NotFoundException -> 0x00b3 }
            if (r13 == r11) goto L_0x0060
            int r13 = r13 + 1
            java.lang.String r13 = r6.substring(r13)     // Catch:{ NotFoundException -> 0x00b3 }
            goto L_0x0061
        L_0x0060:
            r13 = r6
        L_0x0061:
            int r12 = r12.intValue()     // Catch:{ NotFoundException -> 0x00b3 }
            java.util.HashMap r14 = r7.f11828m     // Catch:{ NotFoundException -> 0x00b3 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NotFoundException -> 0x00b3 }
            r14.put(r13, r12)     // Catch:{ NotFoundException -> 0x00b3 }
        L_0x006e:
            r12 = 47
            int r12 = r6.indexOf(r12)     // Catch:{ NotFoundException -> 0x00b3 }
            if (r12 == r11) goto L_0x007c
            int r12 = r12 + 1
            java.lang.String r6 = r6.substring(r12)     // Catch:{ NotFoundException -> 0x00b3 }
        L_0x007c:
            int r5 = r5.getId()     // Catch:{ NotFoundException -> 0x00b3 }
            if (r5 != 0) goto L_0x0085
            aky r5 = r7.f11818c     // Catch:{ NotFoundException -> 0x00b3 }
            goto L_0x00b1
        L_0x0085:
            android.util.SparseArray r12 = r7.f11816a     // Catch:{ NotFoundException -> 0x00b3 }
            java.lang.Object r12 = r12.get(r5)     // Catch:{ NotFoundException -> 0x00b3 }
            android.view.View r12 = (android.view.View) r12     // Catch:{ NotFoundException -> 0x00b3 }
            if (r12 != 0) goto L_0x00a0
            android.view.View r12 = r7.findViewById(r5)     // Catch:{ NotFoundException -> 0x00b3 }
            if (r12 == 0) goto L_0x00a0
            if (r12 == r7) goto L_0x00a0
            android.view.ViewParent r5 = r12.getParent()     // Catch:{ NotFoundException -> 0x00b3 }
            if (r5 != r7) goto L_0x00a0
            r7.onViewAdded(r12)     // Catch:{ NotFoundException -> 0x00b3 }
        L_0x00a0:
            if (r12 != r7) goto L_0x00a5
            aky r5 = r7.f11818c     // Catch:{ NotFoundException -> 0x00b3 }
            goto L_0x00b1
        L_0x00a5:
            if (r12 != 0) goto L_0x00a9
            r5 = r4
            goto L_0x00b1
        L_0x00a9:
            android.view.ViewGroup$LayoutParams r5 = r12.getLayoutParams()     // Catch:{ NotFoundException -> 0x00b3 }
            alw r5 = (p000.alw) r5     // Catch:{ NotFoundException -> 0x00b3 }
            akx r5 = r5.f109554av     // Catch:{ NotFoundException -> 0x00b3 }
        L_0x00b1:
            r5.f65169ai = r6     // Catch:{ NotFoundException -> 0x00b3 }
        L_0x00b3:
            int r0 = r0 + 1
            goto L_0x0028
        L_0x00b7:
            int r0 = r7.f11827l
            if (r0 == r11) goto L_0x00d5
            r0 = 0
        L_0x00bc:
            if (r0 >= r9) goto L_0x00d5
            android.view.View r5 = r7.getChildAt(r0)
            int r6 = r5.getId()
            int r12 = r7.f11827l
            if (r6 != r12) goto L_0x00d2
            boolean r6 = r5 instanceof p000.amh
            if (r6 != 0) goto L_0x00cf
            goto L_0x00d2
        L_0x00cf:
            amh r5 = (p000.amh) r5
            throw r4
        L_0x00d2:
            int r0 = r0 + 1
            goto L_0x00bc
        L_0x00d5:
            amg r5 = r7.f11826k
            r12 = 1
            if (r5 == 0) goto L_0x04ca
            int r6 = r24.getChildCount()
            java.util.HashSet r13 = new java.util.HashSet
            java.util.HashMap r0 = r5.f110246b
            java.util.Set r0 = r0.keySet()
            r13.<init>(r0)
            r14 = 0
        L_0x00ea:
            if (r14 >= r6) goto L_0x0421
            android.view.View r15 = r7.getChildAt(r14)
            int r0 = r15.getId()
            java.util.HashMap r4 = r5.f110246b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            boolean r4 = r4.containsKey(r10)
            if (r4 != 0) goto L_0x0124
            android.content.Context r0 = r15.getContext()     // Catch:{ Exception -> 0x0111 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x0111 }
            int r4 = r15.getId()     // Catch:{ Exception -> 0x0111 }
            java.lang.String r0 = r0.getResourceEntryName(r4)     // Catch:{ Exception -> 0x0111 }
            goto L_0x0113
        L_0x0111:
            java.lang.String r0 = "UNKNOWN"
        L_0x0113:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = "ConstraintSet"
            java.lang.String r10 = "id unknown "
            java.lang.String r0 = r10.concat(r0)
            android.util.Log.w(r4, r0)
            goto L_0x0404
        L_0x0124:
            if (r0 == r11) goto L_0x0419
            if (r0 == r11) goto L_0x0404
            java.util.HashMap r4 = r5.f110246b
            boolean r4 = r4.containsKey(r10)
            if (r4 == 0) goto L_0x0404
            r13.remove(r10)
            java.util.HashMap r4 = r5.f110246b
            java.lang.Object r4 = r4.get(r10)
            amb r4 = (p000.amb) r4
            if (r4 == 0) goto L_0x0404
            boolean r10 = r15 instanceof androidx.constraintlayout.widget.Barrier
            if (r10 == 0) goto L_0x0177
            amc r10 = r4.f109614d
            r10.f109654aj = r12
            r10 = r15
            androidx.constraintlayout.widget.Barrier r10 = (androidx.constraintlayout.widget.Barrier) r10
            r10.setId(r0)
            amc r0 = r4.f109614d
            int r11 = r0.f109652ah
            r10.f68852a = r11
            int r0 = r0.f109653ai
            r10.mo28479c(r0)
            amc r0 = r4.f109614d
            boolean r11 = r0.f109660ap
            aku r12 = r10.f68853b
            r12.f64531b = r11
            int[] r11 = r0.f109655ak
            if (r11 == 0) goto L_0x0166
            r10.mo41598g(r11)
            goto L_0x0177
        L_0x0166:
            java.lang.String r11 = r0.f109656al
            if (r11 == 0) goto L_0x0177
            int[] r11 = p000.amg.m72828g(r10, r11)
            r0.f109655ak = r11
            amc r0 = r4.f109614d
            int[] r0 = r0.f109655ak
            r10.mo41598g(r0)
        L_0x0177:
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            r10 = r0
            alw r10 = (p000.alw) r10
            r10.mo41603a()
            r4.mo41611a(r10)
            java.util.HashMap r11 = r4.f109616f
            java.lang.Class r12 = r15.getClass()
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r19 = r0.iterator()
        L_0x0192:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x032d
            java.lang.Object r0 = r19.next()
            r20 = r8
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r0 = r11.get(r8)
            alt r0 = (p000.alt) r0
            r21 = r11
            boolean r11 = r0.f109489a
            if (r11 != 0) goto L_0x01ba
            java.lang.String r11 = java.lang.String.valueOf(r8)
            r22 = r9
            java.lang.String r9 = "set"
            java.lang.String r9 = r9.concat(r11)
            goto L_0x01bd
        L_0x01ba:
            r22 = r9
            r9 = r8
        L_0x01bd:
            int r11 = r0.f109496h     // Catch:{ NoSuchMethodException -> 0x0303, IllegalAccessException -> 0x02e6, InvocationTargetException -> 0x02c9 }
            int r23 = r11 + -1
            if (r11 == 0) goto L_0x02bf
            switch(r23) {
                case 0: goto L_0x02a2;
                case 1: goto L_0x0284;
                case 2: goto L_0x0266;
                case 3: goto L_0x0243;
                case 4: goto L_0x0229;
                case 5: goto L_0x020b;
                case 6: goto L_0x01ed;
                case 7: goto L_0x01cf;
                default: goto L_0x01c6;
            }
        L_0x01c6:
            r7 = r24
            r8 = r20
            r11 = r21
            r9 = r22
            goto L_0x0192
        L_0x01cf:
            r23 = r6
            r11 = 1
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.Class r18 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r17 = 0
            r6[r17] = r18     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.reflect.Method r6 = r12.getMethod(r9, r6)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.Object[] r7 = new java.lang.Object[r11]     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            int r0 = r0.f109491c     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r7[r17] = r0     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r6.invoke(r15, r7)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            goto L_0x0321
        L_0x01ed:
            r23 = r6
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.Class r11 = java.lang.Float.TYPE     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r17 = 0
            r7[r17] = r11     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.reflect.Method r7 = r12.getMethod(r9, r7)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            float r0 = r0.f109492d     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r11[r17] = r0     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r7.invoke(r15, r11)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            goto L_0x0321
        L_0x020b:
            r23 = r6
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.Class r11 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r17 = 0
            r7[r17] = r11     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.reflect.Method r7 = r12.getMethod(r9, r7)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            boolean r0 = r0.f109494f     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r11[r17] = r0     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r7.invoke(r15, r11)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            goto L_0x0321
        L_0x0229:
            r23 = r6
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.Class<java.lang.CharSequence> r11 = java.lang.CharSequence.class
            r17 = 0
            r7[r17] = r11     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.reflect.Method r7 = r12.getMethod(r9, r7)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.String r0 = r0.f109493e     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r11[r17] = r0     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r7.invoke(r15, r11)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            goto L_0x0321
        L_0x0243:
            r23 = r6
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.Class<android.graphics.drawable.Drawable> r6 = android.graphics.drawable.Drawable.class
            r11 = 0
            r7[r11] = r6     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.reflect.Method r6 = r12.getMethod(r9, r7)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r7.<init>()     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            int r0 = r0.f109495g     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r7.setColor(r0)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r11 = 1
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r11 = 0
            r0[r11] = r7     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r6.invoke(r15, r0)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            goto L_0x0321
        L_0x0266:
            r23 = r6
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r17 = 0
            r7[r17] = r11     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.reflect.Method r7 = r12.getMethod(r9, r7)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            int r0 = r0.f109495g     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r11[r17] = r0     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r7.invoke(r15, r11)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            goto L_0x0321
        L_0x0284:
            r23 = r6
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.Class r11 = java.lang.Float.TYPE     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r17 = 0
            r7[r17] = r11     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.reflect.Method r7 = r12.getMethod(r9, r7)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            float r0 = r0.f109492d     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r11[r17] = r0     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r7.invoke(r15, r11)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            goto L_0x0321
        L_0x02a2:
            r23 = r6
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r17 = 0
            r7[r17] = r11     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.reflect.Method r7 = r12.getMethod(r9, r7)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            int r0 = r0.f109491c     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r11[r17] = r0     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            r7.invoke(r15, r11)     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
            goto L_0x0321
        L_0x02bf:
            r23 = r6
            r6 = 0
            throw r6     // Catch:{ NoSuchMethodException -> 0x02c7, IllegalAccessException -> 0x02c5, InvocationTargetException -> 0x02c3 }
        L_0x02c3:
            r0 = move-exception
            goto L_0x02cc
        L_0x02c5:
            r0 = move-exception
            goto L_0x02e9
        L_0x02c7:
            r0 = move-exception
            goto L_0x0306
        L_0x02c9:
            r0 = move-exception
            r23 = r6
        L_0x02cc:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            r6.append(r8)
            r6.append(r1)
            java.lang.String r7 = r12.getName()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r3, r6, r0)
            goto L_0x0321
        L_0x02e6:
            r0 = move-exception
            r23 = r6
        L_0x02e9:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            r6.append(r8)
            r6.append(r1)
            java.lang.String r7 = r12.getName()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r3, r6, r0)
            goto L_0x0321
        L_0x0303:
            r0 = move-exception
            r23 = r6
        L_0x0306:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r12.getName()
            r6.append(r7)
            java.lang.String r7 = " must have a method "
            r6.append(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r3, r6, r0)
        L_0x0321:
            r7 = r24
            r8 = r20
            r11 = r21
            r9 = r22
            r6 = r23
            goto L_0x0192
        L_0x032d:
            r23 = r6
            r20 = r8
            r22 = r9
            r15.setLayoutParams(r10)
            ame r0 = r4.f109612b
            int r6 = r0.f109834c
            if (r6 != 0) goto L_0x0341
            int r0 = r0.f109833b
            r15.setVisibility(r0)
        L_0x0341:
            ame r0 = r4.f109612b
            float r0 = r0.f109835d
            r15.setAlpha(r0)
            amf r0 = r4.f109615e
            float r0 = r0.f110000c
            r15.setRotation(r0)
            amf r0 = r4.f109615e
            float r0 = r0.f110001d
            r15.setRotationX(r0)
            amf r0 = r4.f109615e
            float r0 = r0.f110002e
            r15.setRotationY(r0)
            amf r0 = r4.f109615e
            float r0 = r0.f110003f
            r15.setScaleX(r0)
            amf r0 = r4.f109615e
            float r0 = r0.f110004g
            r15.setScaleY(r0)
            amf r0 = r4.f109615e
            int r6 = r0.f110007j
            r7 = -1
            if (r6 == r7) goto L_0x03c3
            android.view.ViewParent r0 = r15.getParent()
            android.view.View r0 = (android.view.View) r0
            amf r6 = r4.f109615e
            int r6 = r6.f110007j
            android.view.View r0 = r0.findViewById(r6)
            if (r0 == 0) goto L_0x03e3
            int r6 = r0.getTop()
            int r7 = r0.getBottom()
            int r6 = r6 + r7
            int r7 = r0.getLeft()
            int r0 = r0.getRight()
            int r7 = r7 + r0
            int r0 = r15.getRight()
            int r8 = r15.getLeft()
            int r0 = r0 - r8
            float r7 = (float) r7
            float r6 = (float) r6
            if (r0 <= 0) goto L_0x03e3
            int r0 = r15.getBottom()
            int r8 = r15.getTop()
            int r0 = r0 - r8
            if (r0 <= 0) goto L_0x03e3
            r0 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r0
            float r6 = r6 / r0
            int r0 = r15.getLeft()
            float r0 = (float) r0
            int r8 = r15.getTop()
            float r8 = (float) r8
            float r7 = r7 - r0
            r15.setPivotX(r7)
            float r6 = r6 - r8
            r15.setPivotY(r6)
            goto L_0x03e3
        L_0x03c3:
            float r0 = r0.f110005h
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x03d2
            amf r0 = r4.f109615e
            float r0 = r0.f110005h
            r15.setPivotX(r0)
        L_0x03d2:
            amf r0 = r4.f109615e
            float r0 = r0.f110006i
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x03e3
            amf r0 = r4.f109615e
            float r0 = r0.f110006i
            r15.setPivotY(r0)
        L_0x03e3:
            amf r0 = r4.f109615e
            float r0 = r0.f110008k
            r15.setTranslationX(r0)
            amf r0 = r4.f109615e
            float r0 = r0.f110009l
            r15.setTranslationY(r0)
            amf r0 = r4.f109615e
            float r0 = r0.f110010m
            r15.setTranslationZ(r0)
            amf r0 = r4.f109615e
            boolean r4 = r0.f110011n
            if (r4 == 0) goto L_0x040a
            float r0 = r0.f110012o
            r15.setElevation(r0)
            goto L_0x040a
        L_0x0404:
            r23 = r6
            r20 = r8
            r22 = r9
        L_0x040a:
            int r14 = r14 + 1
            r7 = r24
            r8 = r20
            r9 = r22
            r6 = r23
            r4 = 0
            r11 = -1
            r12 = 1
            goto L_0x00ea
        L_0x0419:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            r0.<init>(r1)
            throw r0
        L_0x0421:
            r23 = r6
            r20 = r8
            r22 = r9
            java.util.Iterator r0 = r13.iterator()
        L_0x042b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x04b6
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.util.HashMap r2 = r5.f110246b
            java.lang.Object r2 = r2.get(r1)
            amb r2 = (p000.amb) r2
            if (r2 == 0) goto L_0x04b2
            amc r3 = r2.f109614d
            int r3 = r3.f109654aj
            r4 = 1
            if (r3 != r4) goto L_0x048e
            androidx.constraintlayout.widget.Barrier r3 = new androidx.constraintlayout.widget.Barrier
            android.content.Context r4 = r24.getContext()
            r3.<init>(r4)
            int r4 = r1.intValue()
            r3.setId(r4)
            amc r4 = r2.f109614d
            int[] r6 = r4.f109655ak
            if (r6 == 0) goto L_0x0462
            r3.mo41598g(r6)
            goto L_0x0473
        L_0x0462:
            java.lang.String r6 = r4.f109656al
            if (r6 == 0) goto L_0x0473
            int[] r6 = p000.amg.m72828g(r3, r6)
            r4.f109655ak = r6
            amc r4 = r2.f109614d
            int[] r4 = r4.f109655ak
            r3.mo41598g(r4)
        L_0x0473:
            amc r4 = r2.f109614d
            int r6 = r4.f109652ah
            r3.f68852a = r6
            int r4 = r4.f109653ai
            r3.mo28479c(r4)
            alw r4 = m4704d()
            r3.mo41599h()
            r2.mo41611a(r4)
            r7 = r24
            r7.addView(r3, r4)
            goto L_0x0490
        L_0x048e:
            r7 = r24
        L_0x0490:
            amc r3 = r2.f109614d
            boolean r3 = r3.f109662b
            if (r3 == 0) goto L_0x042b
            androidx.constraintlayout.widget.Guideline r3 = new androidx.constraintlayout.widget.Guideline
            android.content.Context r4 = r24.getContext()
            r3.<init>(r4)
            int r1 = r1.intValue()
            r3.setId(r1)
            alw r1 = m4704d()
            r2.mo41611a(r1)
            r7.addView(r3, r1)
            goto L_0x042b
        L_0x04b2:
            r7 = r24
            goto L_0x042b
        L_0x04b6:
            r7 = r24
            r1 = r23
            r0 = 0
        L_0x04bb:
            if (r0 >= r1) goto L_0x04ce
            android.view.View r2 = r7.getChildAt(r0)
            boolean r3 = r2 instanceof p000.alu
            if (r3 == 0) goto L_0x04c7
            alu r2 = (p000.alu) r2
        L_0x04c7:
            int r0 = r0 + 1
            goto L_0x04bb
        L_0x04ca:
            r20 = r8
            r22 = r9
        L_0x04ce:
            aky r0 = r7.f11818c
            java.util.ArrayList r0 = r0.f66405aI
            r0.clear()
            java.util.ArrayList r0 = r7.f11817b
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0565
            r1 = 0
        L_0x04de:
            if (r1 >= r0) goto L_0x0565
            java.util.ArrayList r2 = r7.f11817b
            java.lang.Object r2 = r2.get(r1)
            alu r2 = (p000.alu) r2
            boolean r3 = r2.isInEditMode()
            if (r3 == 0) goto L_0x04f3
            java.lang.String r3 = r2.f109501f
            r2.mo41596e(r3)
        L_0x04f3:
            alb r3 = r2.f109504i
            if (r3 != 0) goto L_0x04f8
            goto L_0x0561
        L_0x04f8:
            r4 = 0
            r3.f65299as = r4
            akx[] r3 = r3.f65298ar
            r4 = 0
            java.util.Arrays.fill(r3, r4)
            r3 = 0
        L_0x0502:
            int r4 = r2.f109499d
            if (r3 >= r4) goto L_0x055f
            int[] r4 = r2.f109498c
            r4 = r4[r3]
            android.view.View r5 = r7.mo3741a(r4)
            if (r5 != 0) goto L_0x0533
            java.util.HashMap r6 = r2.f109503h
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r6.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            int r6 = r2.mo41595d(r7, r4)
            if (r6 == 0) goto L_0x0533
            int[] r5 = r2.f109498c
            r5[r3] = r6
            java.util.HashMap r5 = r2.f109503h
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r5.put(r8, r4)
            android.view.View r5 = r7.mo3741a(r6)
        L_0x0533:
            if (r5 == 0) goto L_0x055c
            alb r4 = r2.f109504i
            akx r5 = r7.mo3753rX(r5)
            if (r5 == r4) goto L_0x055c
            if (r5 != 0) goto L_0x0540
            goto L_0x055c
        L_0x0540:
            int r6 = r4.f65299as
            r8 = 1
            int r6 = r6 + r8
            akx[] r8 = r4.f65298ar
            int r9 = r8.length
            if (r6 <= r9) goto L_0x0552
            int r9 = r9 + r9
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r8, r9)
            akx[] r6 = (p000.akx[]) r6
            r4.f65298ar = r6
        L_0x0552:
            akx[] r6 = r4.f65298ar
            int r8 = r4.f65299as
            r6[r8] = r5
            r5 = 1
            int r8 = r8 + r5
            r4.f65299as = r8
        L_0x055c:
            int r3 = r3 + 1
            goto L_0x0502
        L_0x055f:
            alb r2 = r2.f109504i
        L_0x0561:
            int r1 = r1 + 1
            goto L_0x04de
        L_0x0565:
            r8 = r22
            r0 = 0
        L_0x0568:
            if (r0 >= r8) goto L_0x0579
            android.view.View r1 = r7.getChildAt(r0)
            boolean r2 = r1 instanceof p000.ami
            if (r2 != 0) goto L_0x0575
            int r0 = r0 + 1
            goto L_0x0568
        L_0x0575:
            ami r1 = (p000.ami) r1
            r1 = 0
            throw r1
        L_0x0579:
            android.util.SparseArray r0 = r7.f11829n
            r0.clear()
            android.util.SparseArray r0 = r7.f11829n
            aky r1 = r7.f11818c
            r2 = 0
            r0.put(r2, r1)
            android.util.SparseArray r0 = r7.f11829n
            int r1 = r24.getId()
            aky r2 = r7.f11818c
            r0.put(r1, r2)
            r0 = 0
        L_0x0592:
            if (r0 >= r8) goto L_0x05a8
            android.view.View r1 = r7.getChildAt(r0)
            akx r2 = r7.mo3753rX(r1)
            android.util.SparseArray r3 = r7.f11829n
            int r1 = r1.getId()
            r3.put(r1, r2)
            int r0 = r0 + 1
            goto L_0x0592
        L_0x05a8:
            r0 = 0
        L_0x05a9:
            if (r0 >= r8) goto L_0x08e5
            android.view.View r1 = r7.getChildAt(r0)
            akx r15 = r7.mo3753rX(r1)
            if (r15 != 0) goto L_0x05bb
        L_0x05b5:
            r4 = 1
            r9 = -1
            r17 = 0
            goto L_0x08e1
        L_0x05bb:
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r6 = r2
            alw r6 = (p000.alw) r6
            aky r2 = r7.f11818c
            java.util.ArrayList r3 = r2.f66405aI
            r3.add(r15)
            akx r3 = r15.f65154U
            if (r3 == 0) goto L_0x05d2
            ale r3 = (p000.ale) r3
            r3.mo28121Y(r15)
        L_0x05d2:
            r15.f65154U = r2
            android.util.SparseArray r4 = r7.f11829n
            r6.mo41603a()
            r2 = 0
            r6.f109555aw = r2
            int r2 = r1.getVisibility()
            r15.f65168ah = r2
            boolean r2 = r6.f109542aj
            r15.f65167ag = r1
            boolean r2 = r1 instanceof p000.alu
            if (r2 == 0) goto L_0x05f3
            alu r1 = (p000.alu) r1
            aky r2 = r7.f11818c
            boolean r2 = r2.f107659c
            r1.mo28478b(r15, r2)
        L_0x05f3:
            boolean r1 = r6.f109540ah
            if (r1 == 0) goto L_0x0626
            ala r15 = (p000.ala) r15
            int r1 = r6.f109551as
            int r2 = r6.f109552at
            float r3 = r6.f109553au
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x0611
            int r1 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x05b5
            r15.f65279a = r3
            r3 = -1
            r15.f65282b = r3
        L_0x060e:
            r15.f65283c = r3
            goto L_0x05b5
        L_0x0611:
            r3 = -1
            if (r1 == r3) goto L_0x061b
            if (r1 < 0) goto L_0x05b5
            r15.f65279a = r4
            r15.f65282b = r1
            goto L_0x060e
        L_0x061b:
            if (r2 == r3) goto L_0x05b5
            if (r2 < 0) goto L_0x05b5
            r15.f65279a = r4
            r15.f65282b = r3
            r15.f65283c = r2
            goto L_0x05b5
        L_0x0626:
            int r1 = r6.f109544al
            int r2 = r6.f109545am
            int r3 = r6.f109546an
            int r5 = r6.f109547ao
            int r14 = r6.f109548ap
            int r13 = r6.f109549aq
            float r12 = r6.f109550ar
            int r9 = r6.f109570p
            r11 = 0
            r10 = -1
            if (r9 == r10) goto L_0x0655
            java.lang.Object r1 = r4.get(r9)
            akx r1 = (p000.akx) r1
            if (r1 == 0) goto L_0x0651
            float r2 = r6.f109572r
            r12 = 7
            int r13 = r6.f109571q
            r14 = 0
            r9 = r15
            r10 = r12
            r3 = 0
            r11 = r1
            r9.mo28087O(r10, r11, r12, r13, r14)
            r15.f65138E = r2
        L_0x0651:
            r12 = r6
            r1 = 0
            goto L_0x0756
        L_0x0655:
            r9 = -1
            if (r1 == r9) goto L_0x0676
            java.lang.Object r1 = r4.get(r1)
            akx r1 = (p000.akx) r1
            if (r1 == 0) goto L_0x0672
            r10 = 2
            r2 = 2
            int r9 = r6.leftMargin
            r16 = r9
            r9 = r15
            r11 = r1
            r1 = r12
            r12 = r2
            r19 = r13
            r13 = r16
            r9.mo28087O(r10, r11, r12, r13, r14)
            goto L_0x068c
        L_0x0672:
            r1 = r12
            r19 = r13
            goto L_0x068c
        L_0x0676:
            r1 = r12
            r19 = r13
            if (r2 == r9) goto L_0x068c
            java.lang.Object r2 = r4.get(r2)
            r11 = r2
            akx r11 = (p000.akx) r11
            if (r11 == 0) goto L_0x068c
            r10 = 2
            r12 = 4
            int r13 = r6.leftMargin
            r9 = r15
            r9.mo28087O(r10, r11, r12, r13, r14)
        L_0x068c:
            r2 = -1
            if (r3 == r2) goto L_0x06a3
            java.lang.Object r2 = r4.get(r3)
            r11 = r2
            akx r11 = (p000.akx) r11
            if (r11 == 0) goto L_0x06b8
            r10 = 4
            r12 = 2
            int r13 = r6.rightMargin
            r9 = r15
            r14 = r19
            r9.mo28087O(r10, r11, r12, r13, r14)
            goto L_0x06b8
        L_0x06a3:
            if (r5 == r2) goto L_0x06b8
            java.lang.Object r2 = r4.get(r5)
            r11 = r2
            akx r11 = (p000.akx) r11
            if (r11 == 0) goto L_0x06b8
            r10 = 4
            r12 = 4
            int r13 = r6.rightMargin
            r9 = r15
            r14 = r19
            r9.mo28087O(r10, r11, r12, r13, r14)
        L_0x06b8:
            int r2 = r6.f109563i
            r3 = -1
            if (r2 == r3) goto L_0x06d1
            java.lang.Object r2 = r4.get(r2)
            r11 = r2
            akx r11 = (p000.akx) r11
            if (r11 == 0) goto L_0x06e9
            r10 = 3
            r12 = 3
            int r13 = r6.topMargin
            int r14 = r6.f109578x
            r9 = r15
            r9.mo28087O(r10, r11, r12, r13, r14)
            goto L_0x06e9
        L_0x06d1:
            int r2 = r6.f109564j
            r3 = -1
            if (r2 == r3) goto L_0x06e9
            java.lang.Object r2 = r4.get(r2)
            r11 = r2
            akx r11 = (p000.akx) r11
            if (r11 == 0) goto L_0x06e9
            r10 = 3
            r12 = 5
            int r13 = r6.topMargin
            int r14 = r6.f109578x
            r9 = r15
            r9.mo28087O(r10, r11, r12, r13, r14)
        L_0x06e9:
            int r2 = r6.f109565k
            r3 = -1
            if (r2 == r3) goto L_0x0702
            java.lang.Object r2 = r4.get(r2)
            r11 = r2
            akx r11 = (p000.akx) r11
            if (r11 == 0) goto L_0x071a
            r10 = 5
            r12 = 3
            int r13 = r6.bottomMargin
            int r14 = r6.f109580z
            r9 = r15
            r9.mo28087O(r10, r11, r12, r13, r14)
            goto L_0x071a
        L_0x0702:
            int r2 = r6.f109566l
            r3 = -1
            if (r2 == r3) goto L_0x071a
            java.lang.Object r2 = r4.get(r2)
            r11 = r2
            akx r11 = (p000.akx) r11
            if (r11 == 0) goto L_0x071a
            r10 = 5
            r12 = 5
            int r13 = r6.bottomMargin
            int r14 = r6.f109580z
            r9 = r15
            r9.mo28087O(r10, r11, r12, r13, r14)
        L_0x071a:
            int r5 = r6.f109567m
            r9 = -1
            if (r5 == r9) goto L_0x072c
            r10 = 6
            r11 = r1
            r1 = r24
            r2 = r15
            r3 = r6
            r12 = r6
            r6 = r10
            r1.m4708i(r2, r3, r4, r5, r6)
        L_0x072a:
            r1 = 0
            goto L_0x0748
        L_0x072c:
            r11 = r1
            r12 = r6
            int r5 = r12.f109568n
            if (r5 == r9) goto L_0x073b
            r6 = 3
            r1 = r24
            r2 = r15
            r3 = r12
            r1.m4708i(r2, r3, r4, r5, r6)
            goto L_0x072a
        L_0x073b:
            int r5 = r12.f109569o
            if (r5 == r9) goto L_0x072a
            r6 = 5
            r1 = r24
            r2 = r15
            r3 = r12
            r1.m4708i(r2, r3, r4, r5, r6)
            goto L_0x072a
        L_0x0748:
            int r2 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r2 < 0) goto L_0x074e
            r15.f65165ae = r11
        L_0x074e:
            float r2 = r12.f109513H
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x0756
            r15.f65166af = r2
        L_0x0756:
            if (r20 == 0) goto L_0x0768
            int r2 = r12.f109529X
            r3 = -1
            if (r2 != r3) goto L_0x0762
            int r2 = r12.f109530Y
            if (r2 == r3) goto L_0x0768
            r2 = -1
        L_0x0762:
            int r3 = r12.f109530Y
            r15.f65159Z = r2
            r15.f65161aa = r3
        L_0x0768:
            boolean r2 = r12.f109537ae
            r3 = -2
            r4 = 4
            r5 = 2
            r6 = 3
            if (r2 != 0) goto L_0x0799
            int r2 = r12.width
            r9 = -1
            if (r2 != r9) goto L_0x0791
            boolean r2 = r12.f109533aa
            if (r2 == 0) goto L_0x077d
            r15.mo28088P(r6)
            goto L_0x0780
        L_0x077d:
            r15.mo28088P(r4)
        L_0x0780:
            akw r2 = r15.mo28083K(r5)
            int r9 = r12.leftMargin
            r2.f64994f = r9
            akw r2 = r15.mo28083K(r4)
            int r9 = r12.rightMargin
            r2.f64994f = r9
            goto L_0x07a9
        L_0x0791:
            r15.mo28088P(r6)
            r2 = 0
            r15.mo28075C(r2)
            goto L_0x07a9
        L_0x0799:
            r2 = 1
            r15.mo28088P(r2)
            int r2 = r12.width
            r15.mo28075C(r2)
            int r2 = r12.width
            if (r2 != r3) goto L_0x07a9
            r15.mo28088P(r5)
        L_0x07a9:
            boolean r2 = r12.f109538af
            if (r2 != 0) goto L_0x07d7
            int r2 = r12.height
            r9 = -1
            if (r2 != r9) goto L_0x07cf
            boolean r2 = r12.f109534ab
            if (r2 == 0) goto L_0x07ba
            r15.mo28089Q(r6)
            goto L_0x07bd
        L_0x07ba:
            r15.mo28089Q(r4)
        L_0x07bd:
            akw r2 = r15.mo28083K(r6)
            int r3 = r12.topMargin
            r2.f64994f = r3
            r2 = 5
            akw r2 = r15.mo28083K(r2)
            int r3 = r12.bottomMargin
            r2.f64994f = r3
            goto L_0x07e8
        L_0x07cf:
            r15.mo28089Q(r6)
            r2 = 0
            r15.mo28109x(r2)
            goto L_0x07e8
        L_0x07d7:
            r2 = 1
            r9 = -1
            r15.mo28089Q(r2)
            int r2 = r12.height
            r15.mo28109x(r2)
            int r2 = r12.height
            if (r2 != r3) goto L_0x07e8
            r15.mo28089Q(r5)
        L_0x07e8:
            java.lang.String r2 = r12.f109514I
            if (r2 == 0) goto L_0x087f
            int r3 = r2.length()
            if (r3 != 0) goto L_0x07f4
            goto L_0x087f
        L_0x07f4:
            int r3 = r2.length()
            r4 = 44
            int r4 = r2.indexOf(r4)
            if (r4 <= 0) goto L_0x0821
            int r10 = r3 + -1
            if (r4 >= r10) goto L_0x0821
            r10 = 0
            java.lang.String r11 = r2.substring(r10, r4)
            java.lang.String r10 = "W"
            boolean r10 = r11.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x0813
            r10 = 0
            goto L_0x081e
        L_0x0813:
            java.lang.String r10 = "H"
            boolean r10 = r11.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x081d
            r10 = 1
            goto L_0x081e
        L_0x081d:
            r10 = -1
        L_0x081e:
            int r4 = r4 + 1
            goto L_0x0823
        L_0x0821:
            r4 = 0
            r10 = -1
        L_0x0823:
            r11 = 58
            int r11 = r2.indexOf(r11)
            if (r11 < 0) goto L_0x0866
            int r3 = r3 + -1
            if (r11 >= r3) goto L_0x0866
            java.lang.String r3 = r2.substring(r4, r11)
            int r11 = r11 + 1
            java.lang.String r2 = r2.substring(r11)
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x0875
            int r4 = r2.length()
            if (r4 <= 0) goto L_0x0875
            float r3 = java.lang.Float.parseFloat(r3)     // Catch:{ NumberFormatException -> 0x0864 }
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0864 }
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0875
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0875
            r4 = 1
            if (r10 != r4) goto L_0x085e
            float r2 = r2 / r3
            float r11 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0864 }
            goto L_0x0876
        L_0x085e:
            float r3 = r3 / r2
            float r11 = java.lang.Math.abs(r3)     // Catch:{ NumberFormatException -> 0x0864 }
            goto L_0x0876
        L_0x0864:
            goto L_0x0875
        L_0x0866:
            java.lang.String r2 = r2.substring(r4)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0875
            float r11 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0864 }
            goto L_0x0876
        L_0x0875:
            r11 = 0
        L_0x0876:
            int r2 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0881
            r15.f65157X = r11
            r15.f65158Y = r10
            goto L_0x0881
        L_0x087f:
            r15.f65157X = r1
        L_0x0881:
            float r2 = r12.f109517L
            float[] r3 = r15.f65172al
            r17 = 0
            r3[r17] = r2
            float r2 = r12.f109518M
            r4 = 1
            r3[r4] = r2
            int r2 = r12.f109519N
            r15.f65170aj = r2
            int r2 = r12.f109520O
            r15.f65171ak = r2
            int r2 = r12.f109536ad
            if (r2 < 0) goto L_0x089e
            if (r2 > r6) goto L_0x089e
            r15.f65192r = r2
        L_0x089e:
            int r2 = r12.f109521P
            int r3 = r12.f109523R
            int r6 = r12.f109525T
            float r10 = r12.f109527V
            r15.f65193s = r2
            r15.f65196v = r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r6 != r3) goto L_0x08b0
            r6 = 0
        L_0x08b0:
            r15.f65197w = r6
            r15.f65198x = r10
            r6 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r11 <= 0) goto L_0x08c2
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x08c2
            if (r2 != 0) goto L_0x08c2
            r15.f65193s = r5
        L_0x08c2:
            int r2 = r12.f109522Q
            int r10 = r12.f109524S
            int r11 = r12.f109526U
            float r12 = r12.f109528W
            r15.f65194t = r2
            r15.f65199y = r10
            if (r11 != r3) goto L_0x08d1
            r11 = 0
        L_0x08d1:
            r15.f65200z = r11
            r15.f65134A = r12
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x08e1
            int r1 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x08e1
            if (r2 != 0) goto L_0x08e1
            r15.f65194t = r5
        L_0x08e1:
            int r0 = r0 + 1
            goto L_0x05a9
        L_0x08e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo44112h():void");
    }

    /* renamed from: i */
    private final void m4708i(akx akx, alw alw, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f11816a.get(i);
        akx akx2 = (akx) sparseArray.get(i);
        if (akx2 != null && view != null && (view.getLayoutParams() instanceof alw)) {
            alw.f109539ag = true;
            if (i2 == 6) {
                alw alw2 = (alw) view.getLayoutParams();
                alw2.f109539ag = true;
                alw2.f109554av.f65139F = true;
            }
            akx.mo28083K(6).mo28068j(akx2.mo28083K(i2), alw.f109509D, alw.f109508C);
            akx.f65139F = true;
            akx.mo28083K(3).mo28062d();
            akx.mo28083K(5).mo28062d();
        }
    }

    /* renamed from: a */
    public final View mo3741a(int i) {
        return (View) this.f11816a.get(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo3742c() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && getLayoutDirection() == 1;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof alw;
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f11817b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                alu alu = (alu) this.f11817b.get(i);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        int i3 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        int i4 = (int) ((((float) parseInt) / 1080.0f) * width);
                        float f = (float) (((int) ((((float) parseInt3) / 1080.0f) * width)) + i4);
                        float f2 = (float) i4;
                        float f3 = (float) i3;
                        Canvas canvas2 = canvas;
                        float f4 = f;
                        float f5 = f3;
                        Paint paint2 = paint;
                        canvas2.drawLine(f2, f3, f4, f3, paint);
                        float parseInt4 = (float) (i3 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f6 = f;
                        float f7 = parseInt4;
                        canvas2.drawLine(f6, f5, f4, f7, paint);
                        float f8 = parseInt4;
                        float f9 = f2;
                        canvas2.drawLine(f6, f8, f9, f7, paint);
                        float f10 = f2;
                        canvas2.drawLine(f10, f8, f9, f5, paint);
                        paint.setColor(-16711936);
                        float f11 = f;
                        Paint paint3 = paint;
                        canvas2.drawLine(f10, f5, f11, parseInt4, paint);
                        canvas2.drawLine(f10, parseInt4, f11, f5, paint);
                    }
                }
            }
        }
    }

    public final void forceLayout() {
        mo44111g();
        super.forceLayout();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m4704d();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new alw(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            alw alw = (alw) childAt.getLayoutParams();
            akx akx = alw.f109554av;
            if (childAt.getVisibility() == 8 && !alw.f109540ah && !alw.f109541ai) {
                boolean z2 = alw.f109543ak;
                if (!isInEditMode) {
                    continue;
                    i5++;
                }
            }
            boolean z3 = alw.f109542aj;
            int k = akx.mo28096k();
            int l = akx.mo28097l();
            childAt.layout(k, l, akx.mo28095j() + k, akx.mo28093h() + l);
            if (!(childAt instanceof ami)) {
                i5++;
            } else {
                ami ami = (ami) childAt;
                throw null;
            }
        }
        int size = this.f11817b.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                alu alu = (alu) this.f11817b.get(i6);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04cf  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0532  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x05c3  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x05c9  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x0751  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0797  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x079a  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x03ff A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0209  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r26, int r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            boolean r3 = r0.f11820e
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0023
            int r3 = r25.getChildCount()
            r6 = 0
        L_0x0011:
            if (r6 >= r3) goto L_0x0023
            android.view.View r7 = r0.getChildAt(r6)
            boolean r7 = r7.isLayoutRequested()
            if (r7 == 0) goto L_0x0020
            r0.f11820e = r4
            goto L_0x0023
        L_0x0020:
            int r6 = r6 + 1
            goto L_0x0011
        L_0x0023:
            aky r3 = r0.f11818c
            boolean r6 = r25.mo3742c()
            r3.f107659c = r6
            boolean r3 = r0.f11820e
            if (r3 == 0) goto L_0x0050
            r0.f11820e = r5
            int r3 = r25.getChildCount()
            r6 = 0
        L_0x0036:
            if (r6 >= r3) goto L_0x0050
            android.view.View r7 = r0.getChildAt(r6)
            boolean r7 = r7.isLayoutRequested()
            if (r7 == 0) goto L_0x004d
            r25.mo44112h()
            aky r3 = r0.f11818c
            eg r6 = r3.f107648aH
            r6.mo11343v(r3)
            goto L_0x0050
        L_0x004d:
            int r6 = r6 + 1
            goto L_0x0036
        L_0x0050:
            aky r3 = r0.f11818c
            akp r6 = r3.f107660d
            int r6 = r0.f11821f
            int r7 = android.view.View.MeasureSpec.getMode(r26)
            int r8 = android.view.View.MeasureSpec.getSize(r26)
            int r9 = android.view.View.MeasureSpec.getMode(r27)
            int r10 = android.view.View.MeasureSpec.getSize(r27)
            int r11 = r25.getPaddingTop()
            int r11 = java.lang.Math.max(r5, r11)
            int r12 = r25.getPaddingBottom()
            int r12 = java.lang.Math.max(r5, r12)
            int r13 = r11 + r12
            int r14 = r25.getPaddingLeft()
            int r14 = java.lang.Math.max(r5, r14)
            int r15 = r25.getPaddingRight()
            int r15 = java.lang.Math.max(r5, r15)
            int r14 = r14 + r15
            int r15 = r25.getPaddingStart()
            int r15 = java.lang.Math.max(r5, r15)
            int r4 = r25.getPaddingEnd()
            int r4 = java.lang.Math.max(r5, r4)
            int r15 = r15 + r4
            if (r15 <= 0) goto L_0x009d
            r14 = r15
        L_0x009d:
            alx r4 = r0.f11822g
            r4.f109582b = r11
            r4.f109583c = r12
            r4.f109584d = r14
            r4.f109585e = r13
            r4.f109586f = r1
            r4.f109587g = r2
            int r4 = r25.getPaddingStart()
            int r4 = java.lang.Math.max(r5, r4)
            int r12 = r25.getPaddingEnd()
            int r12 = java.lang.Math.max(r5, r12)
            if (r4 > 0) goto L_0x00c9
            if (r12 <= 0) goto L_0x00c0
            goto L_0x00c9
        L_0x00c0:
            int r4 = r25.getPaddingLeft()
            int r4 = java.lang.Math.max(r5, r4)
            goto L_0x00d0
        L_0x00c9:
            boolean r15 = r25.mo3742c()
            if (r15 == 0) goto L_0x00d0
            r4 = r12
        L_0x00d0:
            int r8 = r8 - r14
            int r10 = r10 - r13
            alx r12 = r0.f11822g
            int r13 = r12.f109585e
            int r12 = r12.f109584d
            int r14 = r25.getChildCount()
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r15) goto L_0x0101
            if (r7 == 0) goto L_0x00f2
            r5 = 1073741824(0x40000000, float:2.0)
            if (r7 == r5) goto L_0x00e8
            r2 = 0
            goto L_0x00f0
        L_0x00e8:
            int r5 = r0.f11824i
            int r5 = r5 - r12
            int r5 = java.lang.Math.min(r5, r8)
            r2 = r5
        L_0x00f0:
            r5 = 1
            goto L_0x0110
        L_0x00f2:
            if (r14 != 0) goto L_0x00fe
            int r5 = r0.f11823h
            r14 = 0
            int r17 = java.lang.Math.max(r14, r5)
            r2 = r17
            goto L_0x010f
        L_0x00fe:
            r5 = 0
            r2 = 0
            goto L_0x010f
        L_0x0101:
            r5 = 0
            if (r14 != 0) goto L_0x010e
            int r14 = r0.f11823h
            int r14 = java.lang.Math.max(r5, r14)
            r2 = r14
            r5 = 2
            r14 = 0
            goto L_0x0110
        L_0x010e:
            r2 = r8
        L_0x010f:
            r5 = 2
        L_0x0110:
            if (r9 == r15) goto L_0x0133
            if (r9 == 0) goto L_0x0125
            r15 = 1073741824(0x40000000, float:2.0)
            if (r9 == r15) goto L_0x011b
            r14 = 1
            r15 = 0
            goto L_0x0140
        L_0x011b:
            int r14 = r0.f11825j
            int r14 = r14 - r13
            int r14 = java.lang.Math.min(r14, r10)
            r15 = r14
            r14 = 1
            goto L_0x0140
        L_0x0125:
            if (r14 != 0) goto L_0x0131
            int r14 = r0.f11819d
            r15 = 0
            int r17 = java.lang.Math.max(r15, r14)
            r15 = r17
            goto L_0x013f
        L_0x0131:
            r15 = 0
            goto L_0x013f
        L_0x0133:
            r15 = 0
            if (r14 != 0) goto L_0x013e
            int r14 = r0.f11819d
            int r14 = java.lang.Math.max(r15, r14)
            r15 = r14
            goto L_0x013f
        L_0x013e:
            r15 = r10
        L_0x013f:
            r14 = 2
        L_0x0140:
            int r1 = r3.mo28095j()
            if (r2 != r1) goto L_0x0152
            int r1 = r3.mo28093h()
            if (r15 == r1) goto L_0x014d
            goto L_0x0152
        L_0x014d:
            r19 = r10
            r1 = 0
            r10 = 1
            goto L_0x015a
        L_0x0152:
            ali r1 = r3.f107640a
            r19 = r10
            r10 = 1
            r1.f108261c = r10
            r1 = 0
        L_0x015a:
            r3.f65159Z = r1
            r3.f65161aa = r1
            int r10 = r0.f11824i
            int r10 = r10 - r12
            r20 = r8
            int[] r8 = r3.f65137D
            r8[r1] = r10
            int r10 = r0.f11825j
            int r10 = r10 - r13
            r16 = 1
            r8[r16] = r10
            r3.mo28074B(r1)
            r3.mo28073A(r1)
            r3.mo28088P(r5)
            r3.mo28075C(r2)
            r3.mo28089Q(r14)
            r3.mo28109x(r15)
            int r1 = r0.f11823h
            int r1 = r1 - r12
            r3.mo28074B(r1)
            int r1 = r0.f11819d
            int r1 = r1 - r13
            r3.mo28073A(r1)
            r3.f107649ar = r4
            r3.f107650as = r11
            eg r1 = r3.f107648aH
            alx r2 = r3.f107647aG
            java.util.ArrayList r4 = r3.f66405aI
            int r4 = r4.size()
            r5 = 128(0x80, float:1.794E-43)
            boolean r5 = p000.alc.m43107b(r6, r5)
            int r8 = r3.mo28095j()
            int r10 = r3.mo28093h()
            r11 = 64
            if (r5 != 0) goto L_0x01b5
            boolean r6 = p000.alc.m43107b(r6, r11)
            if (r6 == 0) goto L_0x01b3
            goto L_0x01b5
        L_0x01b3:
            r6 = 0
            goto L_0x01b6
        L_0x01b5:
            r6 = 1
        L_0x01b6:
            r13 = 3
            if (r6 == 0) goto L_0x0205
            r14 = 0
        L_0x01ba:
            if (r14 >= r4) goto L_0x0205
            java.util.ArrayList r15 = r3.f66405aI
            java.lang.Object r15 = r15.get(r14)
            akx r15 = (p000.akx) r15
            int r11 = r15.mo28085M()
            int r12 = r15.mo28086N()
            if (r11 != r13) goto L_0x01d9
            if (r12 != r13) goto L_0x01d9
            float r11 = r15.f65157X
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x01d9
            r11 = 1
            goto L_0x01da
        L_0x01d9:
            r11 = 0
        L_0x01da:
            boolean r12 = r15.mo28080H()
            if (r12 == 0) goto L_0x01e5
            if (r11 == 0) goto L_0x01e4
        L_0x01e2:
            r6 = 0
            goto L_0x0205
        L_0x01e4:
            r11 = 0
        L_0x01e5:
            boolean r12 = r15.mo28081I()
            if (r12 == 0) goto L_0x01ee
            if (r11 == 0) goto L_0x01ee
            goto L_0x01e2
        L_0x01ee:
            boolean r11 = r15 instanceof p000.ald
            if (r11 == 0) goto L_0x01f3
            goto L_0x01e2
        L_0x01f3:
            boolean r11 = r15.mo28080H()
            if (r11 != 0) goto L_0x01e2
            boolean r11 = r15.mo28081I()
            if (r11 == 0) goto L_0x0200
            goto L_0x01e2
        L_0x0200:
            int r14 = r14 + 1
            r11 = 64
            goto L_0x01ba
        L_0x0205:
            r11 = 1073741824(0x40000000, float:2.0)
            if (r7 != r11) goto L_0x0214
            if (r9 == r11) goto L_0x020e
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x0214
        L_0x020e:
            r7 = 1073741824(0x40000000, float:2.0)
            r9 = 1073741824(0x40000000, float:2.0)
        L_0x0212:
            r11 = 1
            goto L_0x0218
        L_0x0214:
            if (r5 == 0) goto L_0x0217
            goto L_0x0212
        L_0x0217:
            r11 = 0
        L_0x0218:
            r6 = r6 & r11
            if (r6 == 0) goto L_0x04bd
            int[] r12 = r3.f65137D
            r14 = 0
            r12 = r12[r14]
            r14 = r20
            int r12 = java.lang.Math.min(r12, r14)
            int[] r14 = r3.f65137D
            r15 = 1
            r14 = r14[r15]
            r15 = r19
            int r14 = java.lang.Math.min(r14, r15)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r7 != r15) goto L_0x0238
            r19 = 0
            goto L_0x023a
        L_0x0238:
            r19 = 1
        L_0x023a:
            if (r7 != r15) goto L_0x0248
            int r13 = r3.mo28095j()
            if (r13 == r12) goto L_0x0248
            r3.mo28075C(r12)
            r3.mo41537c()
        L_0x0248:
            if (r9 != r15) goto L_0x024c
            r12 = 0
            goto L_0x024d
        L_0x024c:
            r12 = 1
        L_0x024d:
            if (r9 != r15) goto L_0x025b
            int r13 = r3.mo28093h()
            if (r13 == r14) goto L_0x025b
            r3.mo28109x(r14)
            r3.mo41537c()
        L_0x025b:
            if (r7 != r15) goto L_0x0411
            if (r9 != r15) goto L_0x0411
            ali r7 = r3.f107640a
            boolean r9 = r7.f108260b
            if (r9 != 0) goto L_0x026c
            boolean r9 = r7.f108261c
            if (r9 == 0) goto L_0x026a
            goto L_0x026c
        L_0x026a:
            r11 = 0
            goto L_0x02a8
        L_0x026c:
            aky r9 = r7.f108259a
            java.util.ArrayList r9 = r9.f66405aI
            int r13 = r9.size()
            r14 = 0
        L_0x0275:
            if (r14 >= r13) goto L_0x0290
            java.lang.Object r15 = r9.get(r14)
            akx r15 = (p000.akx) r15
            r15.mo28103r()
            r11 = 0
            r15.f65179e = r11
            alo r11 = r15.f65182h
            r11.mo41583g()
            alq r11 = r15.f65183i
            r11.mo41587g()
            int r14 = r14 + 1
            goto L_0x0275
        L_0x0290:
            aky r9 = r7.f108259a
            r9.mo28103r()
            aky r9 = r7.f108259a
            r11 = 0
            r9.f65179e = r11
            alo r9 = r9.f65182h
            r9.mo41583g()
            aky r9 = r7.f108259a
            alq r9 = r9.f65183i
            r9.mo41587g()
            r7.f108261c = r11
        L_0x02a8:
            aky r9 = r7.f108262d
            r7.mo41582d(r9)
            aky r9 = r7.f108259a
            r9.f65159Z = r11
            r9.f65161aa = r11
            int r9 = r9.mo28084L(r11)
            aky r11 = r7.f108259a
            r13 = 1
            int r11 = r11.mo28084L(r13)
            boolean r13 = r7.f108260b
            if (r13 == 0) goto L_0x02c5
            r7.mo41580b()
        L_0x02c5:
            aky r13 = r7.f108259a
            int r14 = r13.mo28096k()
            int r15 = r13.mo28097l()
            alo r13 = r13.f65182h
            alj r13 = r13.f67352i
            r13.mo28130c(r14)
            aky r13 = r7.f108259a
            alq r13 = r13.f65183i
            alj r13 = r13.f67352i
            r13.mo28130c(r15)
            r7.mo41581c()
            r13 = 2
            if (r9 == r13) goto L_0x02e8
            if (r11 != r13) goto L_0x0342
            r11 = 2
        L_0x02e8:
            if (r5 == 0) goto L_0x0342
            java.util.ArrayList r5 = r7.f108263e
            int r13 = r5.size()
            r0 = 0
        L_0x02f1:
            if (r0 >= r13) goto L_0x0302
            java.lang.Object r18 = r5.get(r0)
            als r18 = (p000.als) r18
            boolean r18 = r18.mo28139e()
            int r0 = r0 + 1
            if (r18 != 0) goto L_0x02f1
            goto L_0x0342
        L_0x0302:
            r0 = 2
            if (r9 != r0) goto L_0x0324
            aky r0 = r7.f108259a
            r5 = 1
            r0.mo28088P(r5)
            aky r0 = r7.f108259a
            r5 = 0
            int r9 = r7.mo41579a(r0, r5)
            r0.mo28075C(r9)
            aky r0 = r7.f108259a
            alo r5 = r0.f65182h
            alk r5 = r5.f67349f
            int r0 = r0.mo28095j()
            r5.mo28130c(r0)
            r0 = 2
            r9 = 2
        L_0x0324:
            if (r11 != r0) goto L_0x0342
            aky r0 = r7.f108259a
            r5 = 1
            r0.mo28089Q(r5)
            aky r0 = r7.f108259a
            int r13 = r7.mo41579a(r0, r5)
            r0.mo28109x(r13)
            aky r0 = r7.f108259a
            alq r5 = r0.f65183i
            alk r5 = r5.f67349f
            int r0 = r0.mo28093h()
            r5.mo28130c(r0)
        L_0x0342:
            aky r0 = r7.f108259a
            int[] r5 = r0.f65177aq
            r13 = 0
            r5 = r5[r13]
            r13 = 1
            if (r5 == r13) goto L_0x0352
            r13 = 4
            if (r5 != r13) goto L_0x0350
            goto L_0x0352
        L_0x0350:
            r0 = 0
            goto L_0x0391
        L_0x0352:
            int r5 = r0.mo28095j()
            int r5 = r5 + r14
            alo r0 = r0.f65182h
            alj r0 = r0.f67353j
            r0.mo28130c(r5)
            aky r0 = r7.f108259a
            alo r0 = r0.f65182h
            alk r0 = r0.f67349f
            int r5 = r5 - r14
            r0.mo28130c(r5)
            r7.mo41581c()
            aky r0 = r7.f108259a
            int[] r5 = r0.f65177aq
            r13 = 1
            r5 = r5[r13]
            if (r5 == r13) goto L_0x0377
            r13 = 4
            if (r5 != r13) goto L_0x038d
        L_0x0377:
            int r5 = r0.mo28093h()
            int r5 = r5 + r15
            alq r0 = r0.f65183i
            alj r0 = r0.f67353j
            r0.mo28130c(r5)
            aky r0 = r7.f108259a
            alq r0 = r0.f65183i
            alk r0 = r0.f67349f
            int r5 = r5 - r15
            r0.mo28130c(r5)
        L_0x038d:
            r7.mo41581c()
            r0 = 1
        L_0x0391:
            java.util.ArrayList r5 = r7.f108263e
            int r13 = r5.size()
            r14 = 0
        L_0x0398:
            if (r14 >= r13) goto L_0x03b8
            java.lang.Object r15 = r5.get(r14)
            als r15 = (p000.als) r15
            r18 = r5
            akx r5 = r15.f67347d
            r23 = r13
            aky r13 = r7.f108259a
            if (r5 != r13) goto L_0x03ae
            boolean r5 = r15.f67351h
            if (r5 == 0) goto L_0x03b1
        L_0x03ae:
            r15.mo28137c()
        L_0x03b1:
            int r14 = r14 + 1
            r5 = r18
            r13 = r23
            goto L_0x0398
        L_0x03b8:
            java.util.ArrayList r5 = r7.f108263e
            int r13 = r5.size()
            r14 = 0
        L_0x03bf:
            if (r14 >= r13) goto L_0x03ff
            java.lang.Object r15 = r5.get(r14)
            als r15 = (p000.als) r15
            r18 = r0
            if (r0 != 0) goto L_0x03d4
            akx r0 = r15.f67347d
            r23 = r5
            aky r5 = r7.f108259a
            if (r0 != r5) goto L_0x03d6
            goto L_0x03f8
        L_0x03d4:
            r23 = r5
        L_0x03d6:
            alj r0 = r15.f67352i
            boolean r0 = r0.f66541i
            if (r0 != 0) goto L_0x03de
        L_0x03dc:
            r0 = 0
            goto L_0x0400
        L_0x03de:
            alj r0 = r15.f67353j
            boolean r0 = r0.f66541i
            if (r0 != 0) goto L_0x03e9
            boolean r0 = r15 instanceof p000.alm
            if (r0 != 0) goto L_0x03e9
            goto L_0x03dc
        L_0x03e9:
            alk r0 = r15.f67349f
            boolean r0 = r0.f66541i
            if (r0 != 0) goto L_0x03f8
            boolean r0 = r15 instanceof p000.alg
            if (r0 != 0) goto L_0x03f8
            boolean r0 = r15 instanceof p000.alm
            if (r0 != 0) goto L_0x03f8
            goto L_0x03dc
        L_0x03f8:
            int r14 = r14 + 1
            r0 = r18
            r5 = r23
            goto L_0x03bf
        L_0x03ff:
            r0 = 1
        L_0x0400:
            aky r5 = r7.f108259a
            r5.mo28088P(r9)
            aky r5 = r7.f108259a
            r5.mo28089Q(r11)
            r5 = r0
            r24 = r6
            r0 = 1
            r6 = 2
            goto L_0x04b3
        L_0x0411:
            ali r0 = r3.f107640a
            boolean r11 = r0.f108260b
            if (r11 == 0) goto L_0x047b
            aky r11 = r0.f108259a
            java.util.ArrayList r11 = r11.f66405aI
            int r13 = r11.size()
            r14 = 0
        L_0x0420:
            if (r14 >= r13) goto L_0x0453
            java.lang.Object r15 = r11.get(r14)
            akx r15 = (p000.akx) r15
            r15.mo28103r()
            r23 = r11
            r11 = 0
            r15.f65179e = r11
            r17 = r13
            alo r13 = r15.f65182h
            r24 = r6
            alk r6 = r13.f67349f
            r6.f66541i = r11
            r13.f67351h = r11
            r13.mo41583g()
            alq r6 = r15.f65183i
            alk r13 = r6.f67349f
            r13.f66541i = r11
            r6.f67351h = r11
            r6.mo41587g()
            int r14 = r14 + 1
            r13 = r17
            r11 = r23
            r6 = r24
            goto L_0x0420
        L_0x0453:
            r24 = r6
            r11 = 0
            aky r6 = r0.f108259a
            r6.mo28103r()
            aky r6 = r0.f108259a
            r6.f65179e = r11
            alo r6 = r6.f65182h
            alk r13 = r6.f67349f
            r13.f66541i = r11
            r6.f67351h = r11
            r6.mo41583g()
            aky r6 = r0.f108259a
            alq r6 = r6.f65183i
            alk r13 = r6.f67349f
            r13.f66541i = r11
            r6.f67351h = r11
            r6.mo41587g()
            r0.mo41580b()
            goto L_0x047e
        L_0x047b:
            r24 = r6
            r11 = 0
        L_0x047e:
            aky r6 = r0.f108262d
            r0.mo41582d(r6)
            aky r6 = r0.f108259a
            r6.f65159Z = r11
            r6.f65161aa = r11
            alo r6 = r6.f65182h
            alj r6 = r6.f67352i
            r6.mo28130c(r11)
            aky r0 = r0.f108259a
            alq r0 = r0.f65183i
            alj r0 = r0.f67352i
            r0.mo28130c(r11)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r7 != r0) goto L_0x04a4
            boolean r6 = r3.mo41534V(r5, r11)
            r7 = r6
            r6 = 1
            goto L_0x04a6
        L_0x04a4:
            r6 = 0
            r7 = 1
        L_0x04a6:
            if (r9 != r0) goto L_0x04b1
            r0 = 1
            boolean r5 = r3.mo41534V(r5, r0)
            r5 = r5 & r7
            int r6 = r6 + 1
            goto L_0x04b3
        L_0x04b1:
            r0 = 1
            r5 = r7
        L_0x04b3:
            if (r5 == 0) goto L_0x04c1
            r7 = r19 ^ 1
            r9 = r12 ^ 1
            r3.mo28076D(r7, r9)
            goto L_0x04c1
        L_0x04bd:
            r24 = r6
            r5 = 0
            r6 = 0
        L_0x04c1:
            if (r5 == 0) goto L_0x04cb
            r0 = 2
            if (r6 == r0) goto L_0x04c7
            goto L_0x04cb
        L_0x04c7:
            r0 = r25
            goto L_0x075b
        L_0x04cb:
            int r0 = r3.f107655ax
            if (r4 <= 0) goto L_0x05b6
            java.util.ArrayList r5 = r3.f66405aI
            int r5 = r5.size()
            r6 = 64
            boolean r6 = r3.mo41535W(r6)
            alx r7 = r3.f107647aG
            r9 = 0
        L_0x04de:
            if (r9 >= r5) goto L_0x057e
            java.util.ArrayList r11 = r3.f66405aI
            java.lang.Object r11 = r11.get(r9)
            akx r11 = (p000.akx) r11
            boolean r12 = r11 instanceof p000.ala
            if (r12 == 0) goto L_0x04f2
        L_0x04ec:
            r18 = r5
            r12 = 3
            r13 = 0
            goto L_0x0578
        L_0x04f2:
            boolean r12 = r11 instanceof p000.aku
            if (r12 != 0) goto L_0x04ec
            boolean r12 = r11.f65140G
            if (r6 == 0) goto L_0x050e
            alo r12 = r11.f65182h
            if (r12 == 0) goto L_0x050e
            alq r13 = r11.f65183i
            if (r13 == 0) goto L_0x050e
            alk r12 = r12.f67349f
            boolean r12 = r12.f66541i
            if (r12 == 0) goto L_0x050e
            alk r12 = r13.f67349f
            boolean r12 = r12.f66541i
            if (r12 != 0) goto L_0x04ec
        L_0x050e:
            r12 = 0
            int r13 = r11.mo28084L(r12)
            r12 = 1
            int r14 = r11.mo28084L(r12)
            r15 = 3
            if (r13 != r15) goto L_0x052e
            int r13 = r11.f65193s
            if (r13 == r12) goto L_0x052d
            if (r14 != r15) goto L_0x052d
            int r13 = r11.f65194t
            if (r13 == r12) goto L_0x052a
            r13 = 3
            r14 = 3
            r16 = 1
            goto L_0x0530
        L_0x052a:
            r13 = 3
            r14 = 3
            goto L_0x052e
        L_0x052d:
            r13 = 3
        L_0x052e:
            r16 = 0
        L_0x0530:
            if (r16 != 0) goto L_0x04ec
            boolean r15 = r3.mo41535W(r12)
            if (r15 == 0) goto L_0x0570
            boolean r12 = r11 instanceof p000.ald
            if (r12 != 0) goto L_0x0570
            r12 = 3
            if (r13 != r12) goto L_0x054d
            int r15 = r11.f65193s
            if (r15 != 0) goto L_0x054d
            if (r14 == r12) goto L_0x054d
            boolean r15 = r11.mo28080H()
            if (r15 != 0) goto L_0x054d
            r15 = 1
            goto L_0x054e
        L_0x054d:
            r15 = 0
        L_0x054e:
            r18 = r5
            if (r14 != r12) goto L_0x055f
            int r5 = r11.f65194t
            if (r5 != 0) goto L_0x055f
            if (r13 == r12) goto L_0x055f
            boolean r5 = r11.mo28080H()
            if (r5 != 0) goto L_0x055f
            r15 = 1
        L_0x055f:
            if (r13 == r12) goto L_0x0566
            if (r14 != r12) goto L_0x0564
            goto L_0x0566
        L_0x0564:
            r13 = 0
            goto L_0x056d
        L_0x0566:
            float r5 = r11.f65157X
            r13 = 0
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 > 0) goto L_0x0578
        L_0x056d:
            if (r15 != 0) goto L_0x0578
            goto L_0x0574
        L_0x0570:
            r18 = r5
            r12 = 3
            r13 = 0
        L_0x0574:
            r5 = 0
            r1.mo11344w(r7, r11, r5)
        L_0x0578:
            int r9 = r9 + 1
            r5 = r18
            goto L_0x04de
        L_0x057e:
            androidx.constraintlayout.widget.ConstraintLayout r5 = r7.f109581a
            int r5 = r5.getChildCount()
            r6 = 0
        L_0x0585:
            if (r6 >= r5) goto L_0x059a
            androidx.constraintlayout.widget.ConstraintLayout r9 = r7.f109581a
            android.view.View r9 = r9.getChildAt(r6)
            boolean r11 = r9 instanceof p000.ami
            if (r11 != 0) goto L_0x0594
            int r6 = r6 + 1
            goto L_0x0585
        L_0x0594:
            ami r9 = (p000.ami) r9
            androidx.constraintlayout.widget.ConstraintLayout r0 = r7.f109581a
            r0 = 0
            throw r0
        L_0x059a:
            androidx.constraintlayout.widget.ConstraintLayout r5 = r7.f109581a
            java.util.ArrayList r5 = r5.f11817b
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x05b6
            r6 = 0
        L_0x05a5:
            if (r6 >= r5) goto L_0x05b6
            androidx.constraintlayout.widget.ConstraintLayout r9 = r7.f109581a
            java.util.ArrayList r9 = r9.f11817b
            java.lang.Object r9 = r9.get(r6)
            alu r9 = (p000.alu) r9
            androidx.constraintlayout.widget.ConstraintLayout r9 = r7.f109581a
            int r6 = r6 + 1
            goto L_0x05a5
        L_0x05b6:
            r1.mo11343v(r3)
            java.lang.Object r5 = r1.f26919d
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            if (r4 <= 0) goto L_0x05c7
            r4 = 0
            r1.mo11345x(r3, r4, r8, r10)
        L_0x05c7:
            if (r5 <= 0) goto L_0x0751
            int r4 = r3.mo28085M()
            int r6 = r3.mo28086N()
            int r7 = r3.mo28095j()
            java.lang.Object r9 = r1.f26918c
            akx r9 = (p000.akx) r9
            int r9 = r9.f65163ac
            int r7 = java.lang.Math.max(r7, r9)
            int r9 = r3.mo28093h()
            java.lang.Object r11 = r1.f26918c
            akx r11 = (p000.akx) r11
            int r11 = r11.f65164ad
            int r9 = java.lang.Math.max(r9, r11)
            r11 = 0
            r14 = 0
        L_0x05ef:
            if (r14 >= r5) goto L_0x066b
            java.lang.Object r13 = r1.f26919d
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r13 = r13.get(r14)
            akx r13 = (p000.akx) r13
            boolean r15 = r13 instanceof p000.ald
            if (r15 == 0) goto L_0x0664
            int r15 = r13.mo28095j()
            int r12 = r13.mo28093h()
            r19 = r0
            r0 = 1
            boolean r20 = r1.mo11344w(r2, r13, r0)
            r0 = r11 | r20
            int r11 = r13.mo28095j()
            r20 = r0
            int r0 = r13.mo28093h()
            if (r11 == r15) goto L_0x063c
            r13.mo28075C(r11)
            r11 = 2
            if (r4 != r11) goto L_0x063a
            int r11 = r13.mo28094i()
            if (r11 <= r7) goto L_0x063a
            int r11 = r13.mo28094i()
            r15 = 4
            akw r20 = r13.mo28083K(r15)
            int r15 = r20.mo28060b()
            int r11 = r11 + r15
            int r7 = java.lang.Math.max(r7, r11)
        L_0x063a:
            r20 = 1
        L_0x063c:
            if (r0 == r12) goto L_0x065f
            r13.mo28109x(r0)
            r0 = 2
            if (r6 != r0) goto L_0x065d
            int r0 = r13.mo28092g()
            if (r0 <= r9) goto L_0x065d
            int r0 = r13.mo28092g()
            r11 = 5
            akw r11 = r13.mo28083K(r11)
            int r11 = r11.mo28060b()
            int r0 = r0 + r11
            int r0 = java.lang.Math.max(r9, r0)
            r9 = r0
        L_0x065d:
            r20 = 1
        L_0x065f:
            ald r13 = (p000.ald) r13
            r11 = r20
            goto L_0x0666
        L_0x0664:
            r19 = r0
        L_0x0666:
            int r14 = r14 + 1
            r0 = r19
            goto L_0x05ef
        L_0x066b:
            r19 = r0
            r0 = 2
            r14 = 0
        L_0x066f:
            if (r14 >= r0) goto L_0x0753
            r0 = 0
        L_0x0672:
            if (r0 >= r5) goto L_0x0733
            java.lang.Object r12 = r1.f26919d
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.lang.Object r12 = r12.get(r0)
            akx r12 = (p000.akx) r12
            boolean r13 = r12 instanceof p000.alb
            if (r13 == 0) goto L_0x0686
            boolean r13 = r12 instanceof p000.ald
            if (r13 == 0) goto L_0x068a
        L_0x0686:
            boolean r13 = r12 instanceof p000.ala
            if (r13 == 0) goto L_0x0695
        L_0x068a:
            r22 = r2
            r21 = r3
            r20 = r5
            r2 = 2
            r13 = 4
            r15 = 5
            goto L_0x0729
        L_0x0695:
            int r13 = r12.f65168ah
            r15 = 8
            if (r13 == r15) goto L_0x068a
            if (r24 == 0) goto L_0x06ad
            alo r13 = r12.f65182h
            alk r13 = r13.f67349f
            boolean r13 = r13.f66541i
            if (r13 == 0) goto L_0x06ad
            alq r13 = r12.f65183i
            alk r13 = r13.f67349f
            boolean r13 = r13.f66541i
            if (r13 != 0) goto L_0x068a
        L_0x06ad:
            boolean r13 = r12 instanceof p000.ald
            if (r13 != 0) goto L_0x068a
            int r13 = r12.mo28095j()
            int r15 = r12.mo28093h()
            r20 = r5
            int r5 = r12.f65162ab
            r21 = r3
            r3 = 1
            if (r14 != r3) goto L_0x06c3
            r3 = 2
        L_0x06c3:
            boolean r3 = r1.mo11344w(r2, r12, r3)
            r3 = r3 | r11
            int r11 = r12.mo28095j()
            r22 = r2
            int r2 = r12.mo28093h()
            if (r11 == r13) goto L_0x06f6
            r12.mo28075C(r11)
            r3 = 2
            if (r4 != r3) goto L_0x06f3
            int r3 = r12.mo28094i()
            if (r3 <= r7) goto L_0x06f3
            int r3 = r12.mo28094i()
            r13 = 4
            akw r11 = r12.mo28083K(r13)
            int r11 = r11.mo28060b()
            int r3 = r3 + r11
            int r7 = java.lang.Math.max(r7, r3)
            goto L_0x06f4
        L_0x06f3:
            r13 = 4
        L_0x06f4:
            r3 = 1
            goto L_0x06f7
        L_0x06f6:
            r13 = 4
        L_0x06f7:
            if (r2 == r15) goto L_0x071c
            r12.mo28109x(r2)
            r2 = 2
            if (r6 != r2) goto L_0x0719
            int r3 = r12.mo28092g()
            if (r3 <= r9) goto L_0x0719
            int r3 = r12.mo28092g()
            r15 = 5
            akw r11 = r12.mo28083K(r15)
            int r11 = r11.mo28060b()
            int r3 = r3 + r11
            int r3 = java.lang.Math.max(r9, r3)
            r9 = r3
            goto L_0x071a
        L_0x0719:
            r15 = 5
        L_0x071a:
            r3 = 1
            goto L_0x071e
        L_0x071c:
            r2 = 2
            r15 = 5
        L_0x071e:
            boolean r11 = r12.f65139F
            if (r11 == 0) goto L_0x0728
            int r11 = r12.f65162ab
            if (r5 == r11) goto L_0x0728
            r11 = 1
            goto L_0x0729
        L_0x0728:
            r11 = r3
        L_0x0729:
            int r0 = r0 + 1
            r5 = r20
            r3 = r21
            r2 = r22
            goto L_0x0672
        L_0x0733:
            r22 = r2
            r21 = r3
            r20 = r5
            r2 = 2
            r13 = 4
            r15 = 5
            if (r11 == 0) goto L_0x074e
            int r14 = r14 + 1
            r0 = r21
            r1.mo11345x(r0, r14, r8, r10)
            r3 = r0
            r5 = r20
            r2 = r22
            r0 = 2
            r11 = 0
            goto L_0x066f
        L_0x074e:
            r0 = r21
            goto L_0x0754
        L_0x0751:
            r19 = r0
        L_0x0753:
            r0 = r3
        L_0x0754:
            r1 = r19
            r0.mo41533U(r1)
            goto L_0x04c7
        L_0x075b:
            aky r1 = r0.f11818c
            int r1 = r1.mo28095j()
            aky r2 = r0.f11818c
            int r2 = r2.mo28093h()
            aky r3 = r0.f11818c
            boolean r4 = r3.f107656ay
            boolean r3 = r3.f107657az
            alx r5 = r0.f11822g
            int r6 = r5.f109585e
            int r5 = r5.f109584d
            int r1 = r1 + r5
            int r2 = r2 + r6
            r5 = r26
            r6 = 0
            int r1 = resolveSizeAndState(r1, r5, r6)
            r5 = r27
            int r2 = resolveSizeAndState(r2, r5, r6)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r5
            r2 = r2 & r5
            int r5 = r0.f11824i
            int r1 = java.lang.Math.min(r5, r1)
            int r5 = r0.f11825j
            int r2 = java.lang.Math.min(r5, r2)
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            if (r4 == 0) goto L_0x0798
            r1 = r1 | r5
        L_0x0798:
            if (r3 == 0) goto L_0x079b
            r2 = r2 | r5
        L_0x079b:
            r0.setMeasuredDimension(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        akx rX = mo3753rX(view);
        if ((view instanceof Guideline) && !(rX instanceof ala)) {
            alw alw = (alw) view.getLayoutParams();
            alw.f109554av = new ala();
            alw.f109540ah = true;
            ((ala) alw.f109554av).mo28115c(alw.f109531Z);
        }
        if (view instanceof alu) {
            alu alu = (alu) view;
            alu.mo41599h();
            ((alw) view.getLayoutParams()).f109541ai = true;
            if (!this.f11817b.contains(alu)) {
                this.f11817b.add(alu);
            }
        }
        this.f11816a.put(view.getId(), view);
        this.f11820e = true;
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f11816a.remove(view.getId());
        this.f11818c.mo28121Y(mo3753rX(view));
        this.f11817b.remove(view);
        this.f11820e = true;
    }

    /* renamed from: rX */
    public final akx mo3753rX(View view) {
        if (view == this) {
            return this.f11818c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof alw) {
            return ((alw) view.getLayoutParams()).f109554av;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof alw) {
            return ((alw) view.getLayoutParams()).f109554av;
        }
        return null;
    }

    /* renamed from: rY */
    public final Object mo3754rY(Object obj) {
        HashMap hashMap;
        if (!(obj instanceof String) || (hashMap = this.f11828m) == null || !hashMap.containsKey(obj)) {
            return null;
        }
        return this.f11828m.get(obj);
    }

    public final void requestLayout() {
        mo44111g();
        super.requestLayout();
    }

    public final void setId(int i) {
        this.f11816a.remove(getId());
        super.setId(i);
        this.f11816a.put(getId(), this);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new alw(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4705f(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4705f(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m4705f(attributeSet, i, i2);
    }
}
