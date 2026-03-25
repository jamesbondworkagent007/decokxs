package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.api.bean.CurrencyPrependSign;
import com.okinc.business.defi.wallet.home.more.ui.MoreFunctionItemViewBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fbS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18068fbS extends AbstractC14584doH<C18063fbN, C16777eqN> {
    public final Function1<C18063fbN, Unit> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fbN, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C18068fbS(@NotNull Function1<? super C18063fbN, Unit> function1) {
        super(MoreFunctionItemViewBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull final C16777eqN c16777eqN, @NotNull final C18063fbN c18063fbN) {
        java.lang.CharSequence charSequenceAhwBna;
        java.lang.String strEZpvd;
        java.lang.String specificNum$default;
        Intrinsics.checkNotNullParameter(c16777eqN, "");
        Intrinsics.checkNotNullParameter(c18063fbN, "");
        c16777eqN.OLrzqt.setText(c18063fbN.gEmmrt());
        android.widget.TextView textView = c16777eqN.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        java.lang.String strAhwBna = c18063fbN.AhwBna();
        textView.setVisibility((strAhwBna == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAhwBna)) ^ true ? 0 : 8);
        android.widget.TextView textView2 = c16777eqN.AEQbTJ;
        if (c18063fbN.AYXKKw() != null) {
            java.lang.Integer numAEQbTJ = c18063fbN.AEQbTJ();
            if (numAEQbTJ != null && numAEQbTJ.intValue() == 1) {
                specificNum$default = C54873xYm.formatSpecificNum$default(C33129mqd.EZpvd(c18063fbN.AYXKKw()), CurrencyPrependSign.CURRENCY_SIGN_NONE, null, 2, null);
            } else {
                specificNum$default = C54873xYm.formatSpecificNum$default(C33129mqd.EZpvd(c18063fbN.AYXKKw()), CurrencyPrependSign.CURRENCY_SIGN_NONE, null, 2, null);
            }
            charSequenceAhwBna = C33061mpO.setupSpanStyles$default(specificNum$default + " " + c18063fbN.AhwBna(), new java.lang.String[]{specificNum$default}, 0, null, false, new Function1() { // from class: o.fbU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18068fbS.EZpvd(c16777eqN, (java.util.List) obj);
                }
            }, 14, null);
        } else {
            charSequenceAhwBna = c18063fbN.AhwBna();
        }
        textView2.setText(charSequenceAhwBna);
        C55251xgS c55251xgS = c16777eqN.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(c18063fbN.valueOf() ? 0 : 8);
        if (C33492mxV.OLrzqt()) {
            strEZpvd = c18063fbN.djBIcL();
        } else {
            strEZpvd = c18063fbN.EZpvd();
        }
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(c16777eqN.getRoot().getContext(), C13754dXa.Activity.DGOPHZ);
        if (drawable != null) {
            drawable.setTint(ContextCompat.getColor(c16777eqN.getRoot().getContext(), C52761wXj.Activity.invokespecialODCBUN));
        }
        C5335Nt c5335NtEZpvd = Glide.AEQbTJ(c16777eqN.getRoot().getContext()).AEQbTJ().copydefault(strEZpvd).AEQbTJ(drawable).OLrzqt(drawable).EZpvd((NN<android.graphics.Bitmap>) new C5405Ql());
        android.content.Context context = c16777eqN.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iKWHzl = C55298xhM.KWHzl(28.0f, context);
        android.content.Context context2 = c16777eqN.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c5335NtEZpvd.copydefault(iKWHzl, C55298xhM.KWHzl(28.0f, context2)).EZpvd(c16777eqN.copydefault);
        c16777eqN.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.fbR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C18068fbS.KWHzl(this.copydefault, c18063fbN, view);
            }
        });
    }

    public static final Unit EZpvd(C16777eqN c16777eqN, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(c16777eqN.getRoot().getContext().getColor(C52761wXj.Activity.OJuSTm)));
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C18068fbS c18068fbS, C18063fbN c18063fbN, android.view.View view) {
        c18068fbS.AEQbTJ.invoke(c18063fbN);
    }
}
