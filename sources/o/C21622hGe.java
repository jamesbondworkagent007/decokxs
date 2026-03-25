package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hGe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21622hGe implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final android.view.View AYXKKw;
    public final android.view.View AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C21622hGe(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.view.View view3, @androidx.annotation.NonNull android.view.View view4) {
        this.AEQbTJ = view;
        this.copydefault = view2;
        this.KWHzl = textView;
        this.OLrzqt = textView2;
        this.EZpvd = textView3;
        this.AhwBna = view3;
        this.AYXKKw = view4;
    }

    public static C21622hGe copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.HJWChPQdUnVm, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C21622hGe EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C23274hvD.Application.addOnActiveChangeListener;
        android.view.View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById3 != null) {
            i = C23274hvD.Application.ResultReceiverMyResultReceiver;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C23274hvD.Application.viewModels;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C23274hvD.Application.emit;
                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.trackPipAnimationHintViewpositionInWindow))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.showMenu))) != null) {
                        return new C21622hGe(view, viewFindChildViewById3, textView, textView2, textView3, viewFindChildViewById, viewFindChildViewById2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
