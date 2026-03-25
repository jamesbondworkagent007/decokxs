package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23420hxr implements ViewBinding {
    public final C24337ibt AEQbTJ;
    public final C54984xbQ AYXKKw;
    public final C24335ibr AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.view.View KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final android.widget.TextView copydefault;
    public final C54984xbQ djBIcL;
    public final C55113xdn gEmmrt;
    public final C54984xbQ valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.KWHzl;
    }

    public C23420hxr(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C24337ibt c24337ibt, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C54984xbQ c54984xbQ, @androidx.annotation.NonNull C54984xbQ c54984xbQ2, @androidx.annotation.NonNull C54984xbQ c54984xbQ3, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C24335ibr c24335ibr) {
        this.KWHzl = view;
        this.OLrzqt = frameLayout;
        this.AEQbTJ = c24337ibt;
        this.EZpvd = textView;
        this.copydefault = textView2;
        this.valueOf = c54984xbQ;
        this.djBIcL = c54984xbQ2;
        this.AYXKKw = c54984xbQ3;
        this.gEmmrt = c55113xdn;
        this.AhwBna = c24335ibr;
    }

    public static C23420hxr OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.AuCTel, viewGroup);
        return KWHzl(viewGroup);
    }

    public static C23420hxr KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.fXYAwm;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C23274hvD.Application.DcMfJK;
            C24337ibt c24337ibt = (C24337ibt) ViewBindings.findChildViewById(view, i);
            if (c24337ibt != null) {
                i = C23274hvD.Application.onPrepareFromMediaId;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C23274hvD.Application.onSkipToQueueItem;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C23274hvD.Application.setFillInIntent;
                        C54984xbQ c54984xbQ = (C54984xbQ) ViewBindings.findChildViewById(view, i);
                        if (c54984xbQ != null) {
                            i = C23274hvD.Application.IntentSenderRequestBuilder;
                            C54984xbQ c54984xbQ2 = (C54984xbQ) ViewBindings.findChildViewById(view, i);
                            if (c54984xbQ2 != null) {
                                i = C23274hvD.Application.IntentSenderRequestCompanionCREATOR1;
                                C54984xbQ c54984xbQ3 = (C54984xbQ) ViewBindings.findChildViewById(view, i);
                                if (c54984xbQ3 != null) {
                                    i = C23274hvD.Application.applyIconTint;
                                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                    if (c55113xdn != null) {
                                        i = C23274hvD.Application.getActionView;
                                        C24335ibr c24335ibr = (C24335ibr) ViewBindings.findChildViewById(view, i);
                                        if (c24335ibr != null) {
                                            return new C23420hxr(view, frameLayout, c24337ibt, textView, textView2, c54984xbQ, c54984xbQ2, c54984xbQ3, c55113xdn, c24335ibr);
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
