package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jwx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27534jwx implements InterfaceC27525jwo {
    public final C23903iNp KWHzl;

    public C27534jwx(@NotNull C23903iNp c23903iNp) {
        Intrinsics.checkNotNullParameter(c23903iNp, "");
        this.KWHzl = c23903iNp;
    }

    @Override // o.InterfaceC27525jwo
    public android.view.View copydefault() {
        ConstraintLayout root = this.KWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.InterfaceC27525jwo
    public C27308jsj OLrzqt() {
        C27308jsj c27308jsj = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(c27308jsj, "");
        return c27308jsj;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/xcM; */
    @Override // o.InterfaceC27525jwo
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public C57461yip EZpvd() {
        C57461yip c57461yip = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c57461yip, "");
        return c57461yip;
    }

    @Override // o.InterfaceC27525jwo
    public android.widget.TextView AEQbTJ() {
        android.widget.TextView textView = this.KWHzl.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    @Override // o.InterfaceC27525jwo
    public android.widget.TextView KWHzl() {
        android.widget.TextView textView = this.KWHzl.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    @Override // o.InterfaceC27525jwo
    public void EZpvd(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        if (z) {
            this.KWHzl.KWHzl.setAmountAndSymbol(charSequence, C33061mpO.setupSpanStyles$default(charSequence2, new java.lang.String[]{charSequence2.toString()}, 0, null, false, new Function1() { // from class: o.jww
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C27534jwx.KWHzl(this.KWHzl, (java.util.List) obj);
                }
            }, 14, null));
            return;
        }
        C57461yip c57461yip = this.KWHzl.KWHzl;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append((java.lang.CharSequence) " ");
        spannableStringBuilder.append(C33061mpO.setupSpanStyles$default(charSequence2, new java.lang.String[]{charSequence2.toString()}, 0, null, false, new Function1() { // from class: o.jwy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27534jwx.AEQbTJ(this.OLrzqt, (java.util.List) obj);
            }
        }, 14, null));
        c57461yip.setTextByAnimation(new android.text.SpannedString(spannableStringBuilder));
    }

    public static final Unit KWHzl(C27534jwx c27534jwx, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        android.content.Context context = c27534jwx.KWHzl.KWHzl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C27523jwm.KWHzl(list, context);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C27534jwx c27534jwx, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        android.content.Context context = c27534jwx.EZpvd().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C27523jwm.KWHzl(list, context);
        return Unit.INSTANCE;
    }
}
