package o;

import android.graphics.drawable.ColorDrawable;
import com.okinc.core.widget.tipswindow.AnchorPopupWindow;
import o.C52761wXj;

/* JADX INFO: loaded from: classes8.dex */
public class mAE extends AnchorPopupWindow {
    public android.widget.TextView AEQbTJ;
    public android.view.View EZpvd;

    public mAE(android.content.Context context, java.lang.String str) {
        super(context);
        KWHzl(context);
        this.AEQbTJ.setText(str);
    }

    public final void KWHzl(android.content.Context context) {
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C52761wXj.Fragment.RlQdEF, (android.view.ViewGroup) null, false);
        this.EZpvd = viewInflate;
        this.AEQbTJ = (android.widget.TextView) viewInflate.findViewById(C52761wXj.FragmentManager.RkASWs);
        setContentView(this.EZpvd);
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new ColorDrawable(0));
    }

    public void AEQbTJ(android.view.View view, AnchorPopupWindow.Style style, AnchorPopupWindow.HorizontalPosition horizontalPosition, boolean z) {
        copydefault(view, style, z ? AnchorPopupWindow.VerticalPosition.ABOVE : AnchorPopupWindow.VerticalPosition.BELOW, horizontalPosition, true);
    }

    public static mAE OLrzqt(android.content.Context context, final android.view.View view, final AnchorPopupWindow.Style style, java.lang.String str, final AnchorPopupWindow.VerticalPosition verticalPosition, boolean z, final int i, final int i2, final int i3, final int i4, final android.graphics.Rect rect, final android.graphics.Rect rect2, final int[] iArr) {
        mAE mae = new mAE(context, str);
        mae.AEQbTJ(z);
        view.post(new java.lang.Runnable() { // from class: o.mAE.3
            @Override // java.lang.Runnable
            public void run() {
                mAE.this.KWHzl(view, verticalPosition, i, i2, i3, i4, rect, rect2, iArr, style);
            }
        });
        return mae;
    }
}
