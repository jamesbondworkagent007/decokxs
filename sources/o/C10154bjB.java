package o;

import android.view.View;
import o.C52761wXj;

/* JADX INFO: renamed from: o.bjB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10154bjB {
    public static final void AEQbTJ(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(str);
        viewOnClickListenerC54939xaY.EZpvd(str2);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) str3, new View.OnClickListener() { // from class: o.bjA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C10154bjB.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final java.lang.CharSequence AEQbTJ(java.lang.String str) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new android.text.style.StrikethroughSpan(), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }
}
