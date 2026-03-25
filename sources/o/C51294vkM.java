package o;

import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: o.vkM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C51294vkM extends NestedScrollView {
    public Activity copydefault;

    /* JADX INFO: renamed from: o.vkM$Activity */
    public interface Activity {
        void copydefault(int i, int i2, int i3, int i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOnObservableScrollViewListener(Activity activity) {
        this.copydefault = activity;
    }

    public C51294vkM(android.content.Context context) {
        super(context);
    }

    public C51294vkM(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C51294vkM(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        Activity activity = this.copydefault;
        if (activity != null) {
            activity.copydefault(i, i2, i3, i4);
        }
    }
}
