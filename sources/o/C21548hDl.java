package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hDl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21548hDl implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final android.widget.TextView KWHzl;
    public final android.view.View OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C21548hDl(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AEQbTJ = view;
        this.KWHzl = textView;
        this.OLrzqt = view2;
        this.copydefault = textView2;
    }

    public static C21548hDl copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.DcMfJKfbSiEC, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C21548hDl AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.addMenuProvider;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.addOnMultiWindowModeChangedListener))) != null) {
            i = C23274hvD.Application.addOnPictureInPictureModeChangedListener;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                return new C21548hDl(view, textView, viewFindChildViewById, textView2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
