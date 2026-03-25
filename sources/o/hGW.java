package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hGW implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final C55113xdn EZpvd;
    public final AppCompatImageView KWHzl;
    public final C52794wYp OLrzqt;
    public final C55113xdn copydefault;
    public final android.view.View djBIcL;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.djBIcL;
    }

    public hGW(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C55113xdn c55113xdn2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.djBIcL = view;
        this.OLrzqt = c52794wYp;
        this.EZpvd = c55113xdn;
        this.KWHzl = appCompatImageView;
        this.AEQbTJ = imageView;
        this.copydefault = c55113xdn2;
        this.AhwBna = linearLayout;
        this.valueOf = appCompatTextView;
        this.AYXKKw = appCompatTextView2;
    }

    public static hGW EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.DsfknC, viewGroup);
        return copydefault(viewGroup);
    }

    public static hGW copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.zOIQXb;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C23274hvD.Application.ijmTNW;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                i = C23274hvD.Application.ArkbYM;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = C23274hvD.Application.onPostMessage;
                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C23274hvD.Application.getMediaId;
                        C55113xdn c55113xdn2 = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn2 != null) {
                            i = C23274hvD.Application.next;
                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = C23274hvD.Application.onTabReselected;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    i = C23274hvD.Application.parseItem;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView2 != null) {
                                        return new hGW(view, c52794wYp, c55113xdn, appCompatImageView, imageView, c55113xdn2, linearLayout, appCompatTextView, appCompatTextView2);
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
