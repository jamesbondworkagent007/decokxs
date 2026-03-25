package o;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: o.mxt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C33516mxt {
    public int AEQbTJ;
    public FrameLayout.LayoutParams KWHzl;
    public android.view.View OLrzqt;
    public android.widget.FrameLayout copydefault;

    public static void EZpvd(android.app.Activity activity) {
        new C33516mxt(activity);
    }

    public C33516mxt(android.app.Activity activity) {
        this.copydefault = (android.widget.FrameLayout) activity.findViewById(android.R.id.content);
        final android.content.Context applicationContext = activity.getApplicationContext();
        android.view.View childAt = this.copydefault.getChildAt(0);
        this.OLrzqt = childAt;
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.mxt.4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C33516mxt.this.AEQbTJ(applicationContext);
            }
        });
        this.KWHzl = (FrameLayout.LayoutParams) this.OLrzqt.getLayoutParams();
    }

    public final void AEQbTJ(android.content.Context context) {
        int iCopydefault = copydefault(context);
        if (iCopydefault != this.AEQbTJ) {
            int height = this.OLrzqt.getRootView().getHeight();
            int i = height - iCopydefault;
            int iEZpvd = EZpvd(this.copydefault.getLayoutParams()) + EZpvd(this.KWHzl);
            if (i > 0) {
                this.KWHzl.height = (height - i) - iEZpvd;
            } else {
                this.KWHzl.height = height - iEZpvd;
            }
            this.OLrzqt.requestLayout();
            this.AEQbTJ = iCopydefault;
        }
    }

    public final int EZpvd(@androidx.annotation.Nullable ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int copydefault(android.content.Context context) {
        android.graphics.Rect rect = new android.graphics.Rect();
        this.OLrzqt.getWindowVisibleDisplayFrame(rect);
        if (rect.top == 0) {
            rect.top = C33570myu.gEmmrt(context);
        }
        return rect.bottom;
    }
}
