package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jwc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27513jwc implements InterfaceC27453jvV {
    public final C23906iNs EZpvd;

    public C27513jwc(@NotNull C23906iNs c23906iNs) {
        Intrinsics.checkNotNullParameter(c23906iNs, "");
        this.EZpvd = c23906iNs;
    }

    @Override // o.InterfaceC27453jvV
    public android.view.View AEQbTJ() {
        ConstraintLayout root = this.EZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/xcM; */
    @Override // o.InterfaceC27453jvV
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public C57461yip OLrzqt() {
        C57461yip c57461yip = this.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c57461yip, "");
        return c57461yip;
    }

    @Override // o.InterfaceC27453jvV
    public android.widget.TextView KWHzl() {
        android.widget.TextView textView = this.EZpvd.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    @Override // o.InterfaceC27453jvV
    public android.widget.TextView copydefault() {
        android.widget.TextView textView = this.EZpvd.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    @Override // o.InterfaceC27453jvV
    public C55113xdn EZpvd() {
        C55113xdn c55113xdn = this.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        return c55113xdn;
    }

    @Override // o.InterfaceC27453jvV
    public void KWHzl(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        if (z) {
            this.EZpvd.OLrzqt.setAmountAndSymbol(charSequence, C33061mpO.setupSpanStyles$default(charSequence2, new java.lang.String[]{charSequence2.toString()}, 0, null, false, new Function1() { // from class: o.jwe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C27513jwc.EZpvd(this.copydefault, (java.util.List) obj);
                }
            }, 14, null));
            return;
        }
        C57461yip c57461yip = this.EZpvd.OLrzqt;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append((java.lang.CharSequence) " ");
        spannableStringBuilder.append(C33061mpO.setupSpanStyles$default(charSequence2, new java.lang.String[]{charSequence2.toString()}, 0, null, false, new Function1() { // from class: o.jwa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27513jwc.KWHzl(this.EZpvd, (java.util.List) obj);
            }
        }, 14, null));
        c57461yip.setTextByAnimation(new android.text.SpannedString(spannableStringBuilder));
    }

    public static final Unit EZpvd(C27513jwc c27513jwc, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        android.content.Context context = c27513jwc.EZpvd.OLrzqt.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C27512jwb.KWHzl(list, context);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C27513jwc c27513jwc, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        android.content.Context context = c27513jwc.OLrzqt().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C27512jwb.KWHzl(list, context);
        return Unit.INSTANCE;
    }
}
