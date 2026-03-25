package o;

import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23419hxq implements ViewBinding {
    public final wYF AEQbTJ;
    public final C30568ldc AYXKKw;
    public final C55173xeu AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final NestedScrollView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final C33537myN copydefault;
    public final C55113xdn djBIcL;
    public final C30571ldf gEmmrt;
    public final android.widget.LinearLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.valueOf;
    }

    public C23419hxq(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull wYF wyf, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C30568ldc c30568ldc, @androidx.annotation.NonNull C30571ldf c30571ldf, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.valueOf = linearLayout;
        this.OLrzqt = textView;
        this.KWHzl = textView2;
        this.copydefault = c33537myN;
        this.AEQbTJ = wyf;
        this.EZpvd = nestedScrollView;
        this.AhwBna = c55173xeu;
        this.AYXKKw = c30568ldc;
        this.gEmmrt = c30571ldf;
        this.djBIcL = c55113xdn;
        this.AkhnZx = textView3;
        this.DbNXlk = textView4;
    }

    public static C23419hxq copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C23419hxq OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.values, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C23419hxq AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.fJNWhG;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C23274hvD.Application.iwGUEr;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = C23274hvD.Application.dxcTrN;
                C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
                if (c33537myN != null) {
                    i = C23274hvD.Application.DGUQLIOvDItG;
                    wYF wyf = (wYF) ViewBindings.findChildViewById(view, i);
                    if (wyf != null) {
                        i = C23274hvD.Application.OijiEz;
                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                        if (nestedScrollView != null) {
                            i = C23274hvD.Application.QOjuYg;
                            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                            if (c55173xeu != null) {
                                i = C23274hvD.Application.registerCallback;
                                C30568ldc c30568ldc = (C30568ldc) ViewBindings.findChildViewById(view, i);
                                if (c30568ldc != null) {
                                    i = C23274hvD.Application.MediaControllerCompatCallbackMessageHandler;
                                    C30571ldf c30571ldf = (C30571ldf) ViewBindings.findChildViewById(view, i);
                                    if (c30571ldf != null) {
                                        i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                        if (c55113xdn != null) {
                                            i = C23274hvD.Application.AppCompatDelegateImpl4;
                                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null) {
                                                i = C23274hvD.Application.showForActionMode;
                                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView4 != null) {
                                                    return new C23419hxq((android.widget.LinearLayout) view, textView, textView2, c33537myN, wyf, nestedScrollView, c55173xeu, c30568ldc, c30571ldf, c55113xdn, textView3, textView4);
                                                }
                                            }
                                        }
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
