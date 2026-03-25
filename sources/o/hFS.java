package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes18.dex */
public final class hFS implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final android.view.View EZpvd;
    public final C55113xdn OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public hFS(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.EZpvd = view;
        this.OLrzqt = c55113xdn;
        this.AEQbTJ = appCompatTextView;
    }

    public static hFS AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.HJWChPHhYHK, viewGroup);
        return EZpvd(viewGroup);
    }

    public static hFS EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.MediaBrowserCompatMediaBrowserImplApi217;
        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
        if (c55113xdn != null) {
            i = C23274hvD.Application.setDisplayShowTitleEnabled;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                return new hFS(view, c55113xdn, appCompatTextView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
