package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.SubRouter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iei, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24485iei extends android.widget.LinearLayout {
    public Function0<Unit> EZpvd;
    public C21505hBw OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24485iei(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        copydefault(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24485iei(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        copydefault(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24485iei(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        copydefault(context);
    }

    public final void copydefault(android.content.Context context) {
        android.widget.LinearLayout root;
        C55390xiz c55390xiz;
        C21505hBw c21505hBwAEQbTJ = C21505hBw.AEQbTJ(android.view.LayoutInflater.from(context), this, true);
        this.OLrzqt = c21505hBwAEQbTJ;
        if (c21505hBwAEQbTJ != null && (c55390xiz = c21505hBwAEQbTJ.EZpvd) != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(c55390xiz, 0L, new Function1() { // from class: o.ieg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24485iei.KWHzl(this.copydefault, (android.view.View) obj);
                }
            }, 1, null);
        }
        C21505hBw c21505hBw = this.OLrzqt;
        if (c21505hBw == null || (root = c21505hBw.getRoot()) == null) {
            return;
        }
        C25352ivB.setOnDoubleCheckClickListener$default(root, 0L, new Function1() { // from class: o.ien
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24485iei.EZpvd(this.AEQbTJ, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit KWHzl(C24485iei c24485iei, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0 = c24485iei.EZpvd;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C24485iei c24485iei, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0 = c24485iei.EZpvd;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void setData(SubRouter subRouter, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        C21505hBw c21505hBw = this.OLrzqt;
        if (c21505hBw == null || subRouter == null) {
            return;
        }
        android.widget.ImageView imageView = c21505hBw.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        DexMultiTokenInfoBean toToken = subRouter.getToToken();
        java.lang.String tokenLogoUrl = toToken != null ? toToken.getTokenLogoUrl() : null;
        if (tokenLogoUrl == null) {
            tokenLogoUrl = "";
        }
        C25386ivj.loadImageWithBorder$default(imageView, tokenLogoUrl, null, 2, null);
        C55390xiz c55390xiz = c21505hBw.EZpvd;
        DexMultiTokenInfoBean toToken2 = subRouter.getToToken();
        java.lang.String tokenSymbol = toToken2 != null ? toToken2.getTokenSymbol() : null;
        c55390xiz.setText(tokenSymbol != null ? tokenSymbol : "");
        this.EZpvd = function0;
    }
}
