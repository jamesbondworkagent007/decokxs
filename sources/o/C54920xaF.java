package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xaF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54920xaF implements ViewBinding {
    public final android.widget.ImageView EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final MaterialTextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C54920xaF(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull MaterialTextView materialTextView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.ImageView imageView) {
        this.OLrzqt = constraintLayout;
        this.copydefault = materialTextView;
        this.KWHzl = frameLayout;
        this.EZpvd = imageView;
    }

    public static C54920xaF KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.QKudOq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C54920xaF AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.dxcTrN;
        MaterialTextView materialTextView = (MaterialTextView) ViewBindings.findChildViewById(view, i);
        if (materialTextView != null) {
            i = C52761wXj.FragmentManager.iZzfmt;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C52761wXj.FragmentManager.cBPFI;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    return new C54920xaF((ConstraintLayout) view, materialTextView, frameLayout, imageView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
