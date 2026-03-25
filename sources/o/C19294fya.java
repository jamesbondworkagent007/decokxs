package o;

import android.view.View;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.core.ktx.MatchPattern;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19294fya extends AbstractC59533zio<C18992fsq, C19231fxQ> {
    public final C18955fsF AEQbTJ;
    public java.lang.String OLrzqt;
    public final Function1<C18992fsq, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsq, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C19294fya(@NotNull Function1<? super C18992fsq, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
        this.OLrzqt = "";
        this.AEQbTJ = new C18955fsF();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C19231fxQ onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.DQnQnb, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C19231fxQ(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C19231fxQ c19231fxQ, @NotNull final C18992fsq c18992fsq) {
        java.lang.CharSequence charSequenceEZpvd;
        android.widget.ImageView imageViewKWHzl;
        Intrinsics.checkNotNullParameter(c19231fxQ, "");
        Intrinsics.checkNotNullParameter(c18992fsq, "");
        android.widget.ImageView imageViewOLrzqt = c19231fxQ.OLrzqt();
        java.lang.String strAhwBna = c18992fsq.AhwBna();
        int i = C52761wXj.TaskDescription.aHXSQp;
        int i2 = C52761wXj.Activity.zuBGHE;
        android.content.Context context = c19231fxQ.OLrzqt().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C14725dqq.loadFixSizeBorderImage$default(imageViewOLrzqt, strAhwBna, i, 1.0f, 32.0f, C33070mpX.OLrzqt(i2, context), false, 32, null);
        java.lang.String strValues = c18992fsq.values();
        boolean z = !(strValues == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strValues));
        android.widget.ImageView imageViewKWHzl2 = c19231fxQ.KWHzl();
        if (imageViewKWHzl2 != null) {
            imageViewKWHzl2.setVisibility(z ? 0 : 8);
        }
        if (z && (imageViewKWHzl = c19231fxQ.KWHzl()) != null) {
            java.lang.String strValues2 = c18992fsq.values();
            int i3 = C52761wXj.TaskDescription.aHXSQp;
            int i4 = C52761wXj.Activity.zuBGHE;
            android.content.Context context2 = c19231fxQ.KWHzl().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            C14725dqq.loadFixSizeBorderImage$default(imageViewKWHzl, strValues2, i3, 1.0f, 16.0f, C33070mpX.OLrzqt(i4, context2), false, 32, null);
        }
        android.widget.TextView textViewAEQbTJ = c19231fxQ.AEQbTJ();
        C18955fsF c18955fsF = this.AEQbTJ;
        java.lang.String strAkhnZx = c18992fsq.AkhnZx();
        java.lang.String str = this.OLrzqt;
        android.content.Context context3 = c19231fxQ.AEQbTJ().getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        textViewAEQbTJ.setText(c18955fsF.EZpvd(strAkhnZx, str, context3));
        if (c18992fsq.fJNWhG()) {
            c19231fxQ.copydefault().setVisibility(8);
        } else {
            android.widget.TextView textViewCopydefault = c19231fxQ.copydefault();
            if (c18992fsq.EZpvd().length() == 0 && c18992fsq.valueOf().length() == 0) {
                charSequenceEZpvd = "--";
            } else if (c18992fsq.valueOf().length() == 0) {
                charSequenceEZpvd = C54872xYl.formatCoinPrice$default(C33129mqd.EZpvd(c18992fsq.EZpvd()), null, c18992fsq.fJNWhG(), null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, 21, null);
            } else {
                java.lang.String strEZpvd = c18992fsq.EZpvd();
                java.lang.String strValueOf = c18992fsq.valueOf();
                android.content.Context context4 = c19231fxQ.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                charSequenceEZpvd = EZpvd(strEZpvd, strValueOf, context4, c18992fsq.fJNWhG());
            }
            textViewCopydefault.setText(charSequenceEZpvd);
        }
        android.widget.TextView textViewEZpvd = c19231fxQ.EZpvd();
        C13821dZn c13821dZn = C13821dZn.EZpvd;
        textViewEZpvd.setText(c13821dZn.KWHzl(c18992fsq.KWHzl()));
        c19231fxQ.valueOf().setText(c13821dZn.KWHzl(c18992fsq.copydefault()));
        c19231fxQ.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.fxY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C19294fya.OLrzqt(this.AEQbTJ, c18992fsq, view);
            }
        });
    }

    public static final void OLrzqt(C19294fya c19294fya, C18992fsq c18992fsq, android.view.View view) {
        c19294fya.copydefault.invoke(c18992fsq);
    }

    public final java.lang.CharSequence EZpvd(java.lang.String str, java.lang.String str2, final android.content.Context context, boolean z) {
        final int i;
        final int iTradeFallDefault$default;
        if (C33129mqd.AEQbTJ(str2, 0)) {
            i = C32113mPz.Dialog.fJNWhG;
        } else {
            i = C33129mqd.gEmmrt(str2, 0) ? C32113mPz.Dialog.djBIcL : C13754dXa.LoaderManager.iwGUEr;
        }
        if (C33129mqd.AEQbTJ(str2, 0)) {
            iTradeFallDefault$default = C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
        } else {
            iTradeFallDefault$default = C33129mqd.gEmmrt(str2, 0) ? C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null) : C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
        }
        java.lang.String iCUPercent$default = pTB.formatICUPercent$default(C33129mqd.copydefault(str2), RoundingMode.DOWN, null, DisplaySign.EXCEPT_ZERO, null, null, 26, null);
        if (iCUPercent$default.length() > 0) {
            iCUPercent$default = "(" + iCUPercent$default + ")";
        }
        java.lang.String coinPrice$default = C54872xYl.formatCoinPrice$default(C33129mqd.EZpvd(str), null, z, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, 21, null);
        return C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(coinPrice$default + "" + iCUPercent$default, new java.lang.String[]{coinPrice$default}, 0, MatchPattern.FIRST_ONLY, false, new Function1() { // from class: o.fxZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19294fya.OLrzqt(context, iTradeFallDefault$default, (java.util.List) obj);
            }
        }, 10, null), new java.lang.String[]{iCUPercent$default}, 0, MatchPattern.LAST_ONLY, false, new Function1() { // from class: o.fxX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19294fya.copydefault(context, i, iTradeFallDefault$default, (java.util.List) obj);
            }
        }, 10, null);
    }

    public static final Unit OLrzqt(android.content.Context context, int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C52761wXj.LoaderManager.QSBOWP));
        list.add(new android.text.style.ForegroundColorSpan(i));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(android.content.Context context, int i, int i2, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, i));
        list.add(new android.text.style.ForegroundColorSpan(i2));
        return Unit.INSTANCE;
    }
}
