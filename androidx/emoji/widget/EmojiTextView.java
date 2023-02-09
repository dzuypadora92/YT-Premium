package androidx.emoji.widget;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;

/* compiled from: PG */
public class EmojiTextView extends TextView {

    /* renamed from: a */
    private boolean f11917a;

    /* renamed from: b */
    private beg f11918b;

    public EmojiTextView(Context context) {
        super(context);
        m4794a();
    }

    /* renamed from: a */
    private final void m4794a() {
        if (!this.f11917a) {
            this.f11917a = true;
            ((avc) m4795b().f150734a).mo29786p();
        }
    }

    /* renamed from: b */
    private final beg m4795b() {
        if (this.f11918b == null) {
            this.f11918b = new beg((TextView) this, (byte[]) null);
        }
        return this.f11918b;
    }

    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        Object obj = m4795b().f150734a;
        if (z) {
            ((avc) obj).mo29786p();
        }
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(aux.m46567e(this, callback));
    }

    public final void setFilters(InputFilter[] inputFilterArr) {
        Object obj = m4795b().f150734a;
        int length = inputFilterArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
                System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
                inputFilterArr2[length] = ((bas) obj).f77065a;
                inputFilterArr = inputFilterArr2;
                break;
            } else if (inputFilterArr[i] instanceof baq) {
                break;
            } else {
                i++;
            }
        }
        super.setFilters(inputFilterArr);
    }

    public EmojiTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4794a();
    }

    public EmojiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4794a();
    }

    public EmojiTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m4794a();
    }
}
