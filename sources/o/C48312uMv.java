package o;

import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.MaterialToolbar;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uMv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48312uMv implements ViewBinding {
    public final Group AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final Group EZpvd;
    public final wYF KWHzl;
    public final MaterialToolbar OLrzqt;
    public final ComposeView copydefault;
    public final C55113xdn djBIcL;
    public final ConstraintLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.valueOf;
    }

    public C48312uMv(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull MaterialToolbar materialToolbar, @androidx.annotation.NonNull ComposeView composeView, @androidx.annotation.NonNull wYF wyf, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull Group group2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.valueOf = constraintLayout;
        this.OLrzqt = materialToolbar;
        this.copydefault = composeView;
        this.KWHzl = wyf;
        this.AEQbTJ = group;
        this.EZpvd = group2;
        this.AYXKKw = textView;
        this.djBIcL = c55113xdn;
    }

    public static C48312uMv KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C48312uMv copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.isConnected, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C48312uMv EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.dvKsVJ;
        MaterialToolbar materialToolbar = (MaterialToolbar) ViewBindings.findChildViewById(view, i);
        if (materialToolbar != null) {
            i = C48033uCm.Application.GQzpsZ;
            ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
            if (composeView != null) {
                i = C48033uCm.Application.DQnQnb;
                wYF wyf = (wYF) ViewBindings.findChildViewById(view, i);
                if (wyf != null) {
                    i = C48033uCm.Application.inahnb;
                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                    if (group != null) {
                        i = C48033uCm.Application.fromMediaMetadata;
                        Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                        if (group2 != null) {
                            i = C48033uCm.Application.getRating;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C48033uCm.Application.getString;
                                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                if (c55113xdn != null) {
                                    return new C48312uMv((ConstraintLayout) view, materialToolbar, composeView, wyf, group, group2, textView, c55113xdn);
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
