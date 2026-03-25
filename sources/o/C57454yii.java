package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57454yii implements ViewBinding {
    public final android.widget.TextView EZpvd;
    public final C57478yjF KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C57454yii(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C57478yjF c57478yjF, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.copydefault = view;
        this.KWHzl = c57478yjF;
        this.OLrzqt = imageView;
        this.EZpvd = textView;
    }

    public static C57454yii KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.aKErDB, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C57454yii EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C57406yhn.StateListAnimator.ejfBZ;
        C57478yjF c57478yjF = (C57478yjF) ViewBindings.findChildViewById(view, i);
        if (c57478yjF != null) {
            i = C57406yhn.StateListAnimator.fZBcTu;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C57406yhn.StateListAnimator.akftKQ;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new C57454yii(view, c57478yjF, imageView, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
