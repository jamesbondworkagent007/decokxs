package o;

import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: renamed from: o.myQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33540myQ extends AppCompatTextView {
    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }

    public C33540myQ(android.content.Context context) {
        super(context);
        OLrzqt();
    }

    public C33540myQ(android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        OLrzqt();
    }

    public C33540myQ(android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        OLrzqt();
    }

    private void OLrzqt() {
        setSingleLine(true);
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
    }
}
