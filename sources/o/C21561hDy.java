package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hDy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21561hDy implements ViewBinding {
    public final wYF AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final C54984xbQ AkhnZx;
    public final android.widget.FrameLayout DbNXlk;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final ConstraintLayout djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.LinearLayout gEmmrt;
    public final C54984xbQ isConnected;
    public final android.widget.LinearLayout valueOf;
    public final android.view.View values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AYXKKw;
    }

    public C21561hDy(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull wYF wyf, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout4, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C54984xbQ c54984xbQ, @androidx.annotation.NonNull C54984xbQ c54984xbQ2) {
        this.AYXKKw = constraintLayout;
        this.AEQbTJ = wyf;
        this.EZpvd = linearLayout;
        this.copydefault = frameLayout;
        this.OLrzqt = textView;
        this.KWHzl = textView2;
        this.djBIcL = constraintLayout2;
        this.valueOf = linearLayout2;
        this.AhwBna = linearLayout3;
        this.gEmmrt = linearLayout4;
        this.DbNXlk = frameLayout2;
        this.fetchVPNInfo = textView3;
        this.values = view;
        this.AkhnZx = c54984xbQ;
        this.isConnected = c54984xbQ2;
    }

    public static C21561hDy KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.fiXcQa, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21561hDy KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.DGUQLIOvDItG;
        wYF wyf = (wYF) ViewBindings.findChildViewById(view, i);
        if (wyf != null) {
            i = C23274hvD.Application.sVvuFk;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C23274hvD.Application.hbZCHz;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = C23274hvD.Application.fMBJsc;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C23274hvD.Application.hKJZrr;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i = C23274hvD.Application.createOnBackInvokedCallbacklambda0;
                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout2 != null) {
                                i = C23274hvD.Application.OnBackPressedDispatcherOwner;
                                android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout3 != null) {
                                    i = C23274hvD.Application.IntentSenderRequestCompanion;
                                    android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout4 != null) {
                                        i = C23274hvD.Application.IntentSenderRequestBuilderFlag;
                                        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                        if (frameLayout2 != null) {
                                            i = C23274hvD.Application.getIntentSender;
                                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.ActivityResultContractsTakePicture))) != null) {
                                                i = C23274hvD.Application.ActionBarNavigationMode;
                                                C54984xbQ c54984xbQ = (C54984xbQ) ViewBindings.findChildViewById(view, i);
                                                if (c54984xbQ != null) {
                                                    i = C23274hvD.Application.WindowDecorActionBarActionModeImpl;
                                                    C54984xbQ c54984xbQ2 = (C54984xbQ) ViewBindings.findChildViewById(view, i);
                                                    if (c54984xbQ2 != null) {
                                                        return new C21561hDy(constraintLayout, wyf, linearLayout, frameLayout, textView, textView2, constraintLayout, linearLayout2, linearLayout3, linearLayout4, frameLayout2, textView3, viewFindChildViewById, c54984xbQ, c54984xbQ2);
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
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
