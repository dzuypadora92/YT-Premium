package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: PG */
public class Barrier extends alu {

    /* renamed from: a */
    public int f68852a;

    /* renamed from: b */
    public aku f68853b;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28477a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, amk.f110454b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    this.f109501f = obtainStyledAttributes.getString(35);
                    mo41596e(this.f109501f);
                } else if (index == 36) {
                    this.f109502g = obtainStyledAttributes.getString(36);
                    mo41597f(this.f109502g);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f68853b = new aku();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, amk.f110454b);
            int indexCount2 = obtainStyledAttributes2.getIndexCount();
            for (int i2 = 0; i2 < indexCount2; i2++) {
                int index2 = obtainStyledAttributes2.getIndex(i2);
                if (index2 == 26) {
                    this.f68852a = obtainStyledAttributes2.getInt(26, 0);
                } else if (index2 == 25) {
                    this.f68853b.f64531b = obtainStyledAttributes2.getBoolean(25, true);
                } else if (index2 == 27) {
                    this.f68853b.f64532c = obtainStyledAttributes2.getDimensionPixelSize(27, 0);
                }
            }
            obtainStyledAttributes2.recycle();
        }
        this.f109504i = this.f68853b;
        mo41599h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r0 == 6) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r0 == 6) goto L_0x000a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28478b(p000.akx r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r5.f68852a
            r1 = 1
            r2 = 0
            r3 = 6
            r4 = 5
            if (r7 == 0) goto L_0x000f
            if (r0 != r4) goto L_0x000c
        L_0x000a:
            r0 = 1
            goto L_0x0016
        L_0x000c:
            if (r0 != r3) goto L_0x0016
            goto L_0x0011
        L_0x000f:
            if (r0 != r4) goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0016
        L_0x0013:
            if (r0 != r3) goto L_0x0016
            goto L_0x000a
        L_0x0016:
            boolean r7 = r6 instanceof p000.aku
            if (r7 == 0) goto L_0x001e
            aku r6 = (p000.aku) r6
            r6.f64530a = r0
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.mo28478b(akx, boolean):void");
    }

    /* renamed from: c */
    public final void mo28479c(int i) {
        this.f68853b.f64532c = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
