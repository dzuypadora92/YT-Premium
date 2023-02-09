package androidx.emoji.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* compiled from: PG */
public class EmojiExtractEditText extends ExtractEditText {

    /* renamed from: a */
    private boolean f11915a;

    /* renamed from: b */
    private beg f11916b;

    public EmojiExtractEditText(Context context) {
        super(context);
        m4792a((AttributeSet) null, 0, 0);
    }

    /* renamed from: a */
    private final void m4792a(AttributeSet attributeSet, int i, int i2) {
        if (!this.f11915a) {
            this.f11915a = true;
            int i3 = 0;
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, azw.f150521a, i, i2);
                i3 = obtainStyledAttributes.getInteger(0, Integer.MAX_VALUE);
                obtainStyledAttributes.recycle();
            }
            beg b = m4793b();
            asz.m6155i(i3, "maxEmojiCount should be greater than 0");
            ((bau) ((bbc) b.f150734a).f150586a).f150572a = i3;
            setKeyListener(super.getKeyListener());
        }
    }

    /* renamed from: b */
    private final beg m4793b() {
        if (this.f11916b == null) {
            this.f11916b = new beg((EditText) this, (byte[]) null);
        }
        return this.f11916b;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return m4793b().mo51904e(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(aux.m46567e(this, callback));
    }

    public final void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            m4793b();
            keyListener = beg.m95616f(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4792a(attributeSet, 16842862, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4792a(attributeSet, i, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m4792a(attributeSet, i, i2);
    }
}
