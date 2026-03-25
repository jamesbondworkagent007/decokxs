package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.item.OKRegularCell;
import o.C47501trL;

/* JADX INFO: renamed from: o.tNv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46262tNv implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final OKRegularCell EZpvd;
    public final OKRegularCell KWHzl;
    public final OKRegularCell OLrzqt;
    public final android.widget.ImageView copydefault;
    public final ConstraintLayout djBIcL;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public C46262tNv(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull OKRegularCell oKRegularCell, @androidx.annotation.NonNull OKRegularCell oKRegularCell2, @androidx.annotation.NonNull OKRegularCell oKRegularCell3, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.djBIcL = constraintLayout;
        this.AEQbTJ = textView;
        this.KWHzl = oKRegularCell;
        this.OLrzqt = oKRegularCell2;
        this.EZpvd = oKRegularCell3;
        this.copydefault = imageView;
        this.valueOf = textView2;
    }

    public static C46262tNv EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.gasjUx, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C46262tNv copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.QXDzTk;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C47501trL.TaskDescription.zYHWMc;
            OKRegularCell oKRegularCell = (OKRegularCell) ViewBindings.findChildViewById(view, i);
            if (oKRegularCell != null) {
                i = C47501trL.TaskDescription.zqTOFw;
                OKRegularCell oKRegularCell2 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                if (oKRegularCell2 != null) {
                    i = C47501trL.TaskDescription.zOIQXb;
                    OKRegularCell oKRegularCell3 = (OKRegularCell) ViewBindings.findChildViewById(view, i);
                    if (oKRegularCell3 != null) {
                        i = C47501trL.TaskDescription.gdmIOq;
                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C47501trL.TaskDescription.unregister;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                return new C46262tNv((ConstraintLayout) view, textView, oKRegularCell, oKRegularCell2, oKRegularCell3, imageView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
