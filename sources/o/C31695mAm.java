package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.mAm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C31695mAm extends RecyclerView {
    public C31695mAm(android.content.Context context) {
        super(context);
    }

    public C31695mAm(android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C31695mAm(android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }
}
