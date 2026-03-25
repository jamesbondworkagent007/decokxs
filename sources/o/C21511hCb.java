package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hCb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21511hCb implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final android.view.View EZpvd;
    public final ViewOnClickListenerC24771ikC KWHzl;
    public final C24819iky copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C21511hCb(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull C24819iky c24819iky, @androidx.annotation.NonNull ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC) {
        this.EZpvd = view;
        this.AEQbTJ = appCompatTextView;
        this.copydefault = c24819iky;
        this.KWHzl = viewOnClickListenerC24771ikC;
    }

    public static C21511hCb EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.invokespecialdPnHjp, viewGroup);
        return copydefault(viewGroup);
    }

    public static C21511hCb copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.verifyNotNull;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = C23274hvD.Application.requiresOverflow;
            C24819iky c24819iky = (C24819iky) ViewBindings.findChildViewById(view, i);
            if (c24819iky != null) {
                i = C23274hvD.Application.getItemView;
                ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC = (ViewOnClickListenerC24771ikC) ViewBindings.findChildViewById(view, i);
                if (viewOnClickListenerC24771ikC != null) {
                    return new C21511hCb(view, appCompatTextView, c24819iky, viewOnClickListenerC24771ikC);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
