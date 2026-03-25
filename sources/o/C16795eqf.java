package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eqf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16795eqf implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final ConstraintLayout KWHzl;
    public final C57440yiU OLrzqt;
    public final C57440yiU copydefault;
    public final android.widget.TextView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C16795eqf(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C57440yiU c57440yiU, @androidx.annotation.NonNull C57440yiU c57440yiU2, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.KWHzl = constraintLayout;
        this.AEQbTJ = textView;
        this.copydefault = c57440yiU;
        this.OLrzqt = c57440yiU2;
        this.EZpvd = textView2;
        this.djBIcL = textView3;
    }

    public static C16795eqf KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.fVjYLc, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C16795eqf EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.AxsJAY;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C13754dXa.ActionBar.fJk;
            C57440yiU c57440yiU = (C57440yiU) ViewBindings.findChildViewById(view, i);
            if (c57440yiU != null) {
                i = C13754dXa.ActionBar.OAjjVP;
                C57440yiU c57440yiU2 = (C57440yiU) ViewBindings.findChildViewById(view, i);
                if (c57440yiU2 != null) {
                    i = C13754dXa.ActionBar.MediaSessionCompatOnActiveChangeListener;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C13754dXa.ActionBar.PlaybackStateCompatBuilder;
                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            return new C16795eqf((ConstraintLayout) view, textView, c57440yiU, c57440yiU2, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
