package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23392hxP implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C55018xby AYXKKw;
    public final C28055kNf AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final wYF OLrzqt;
    public final TextInputEditText copydefault;
    public final android.view.View djBIcL;
    public final android.widget.TextView gEmmrt;
    public final LinearLayoutCompat valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.valueOf;
    }

    public C23392hxP(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull wYF wyf, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull TextInputEditText textInputEditText, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55018xby c55018xby, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C28055kNf c28055kNf) {
        this.valueOf = linearLayoutCompat;
        this.OLrzqt = wyf;
        this.KWHzl = imageView;
        this.copydefault = textInputEditText;
        this.AEQbTJ = constraintLayout;
        this.EZpvd = textView;
        this.AYXKKw = c55018xby;
        this.gEmmrt = textView2;
        this.djBIcL = view;
        this.AhwBna = c28055kNf;
    }

    public static C23392hxP OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.RJOkX, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C23392hxP EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.DGUQLIOvDItG;
        wYF wyf = (wYF) ViewBindings.findChildViewById(view, i);
        if (wyf != null) {
            i = C23274hvD.Application.DRuYWY;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C23274hvD.Application.QgUVrU;
                TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, i);
                if (textInputEditText != null) {
                    i = C23274hvD.Application.MediaSessionCompatMediaSessionImplApi191;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = C23274hvD.Application.MediaSessionCompatMediaSessionImplApi28;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C23274hvD.Application.onBackInvoked;
                            C55018xby c55018xby = (C55018xby) ViewBindings.findChildViewById(view, i);
                            if (c55018xby != null) {
                                i = C23274hvD.Application.clearObservers;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.dispatchPopulateAccessibilityEvent))) != null) {
                                    i = C23274hvD.Application.setId;
                                    C28055kNf c28055kNf = (C28055kNf) ViewBindings.findChildViewById(view, i);
                                    if (c28055kNf != null) {
                                        return new C23392hxP((LinearLayoutCompat) view, wyf, imageView, textInputEditText, constraintLayout, textView, c55018xby, textView2, viewFindChildViewById, c28055kNf);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
