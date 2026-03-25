package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.LiveData;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.OptionInstrument;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC27964kJw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kJG extends AbstractC27964kJw<C42669ral> {
    public final LiveData<java.lang.String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public kJG() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27964kJw
    public java.util.List<java.lang.CharSequence> AEQbTJ(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return null;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:androidx.lifecycle.LiveData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null androidx.lifecycle.LiveData) : (r2v0 androidx.lifecycle.LiveData))
  (wrap:o.kJw$StateListAnimator:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.kJw$StateListAnimator) : (r3v0 o.kJw$StateListAnimator))
 A[MD:(androidx.lifecycle.LiveData<java.lang.String>, o.kJw$StateListAnimator):void (m)] (LINE:24) call: o.kJG.<init>(androidx.lifecycle.LiveData, o.kJw$StateListAnimator):void type: THIS */
    public /* synthetic */ kJG(LiveData liveData, AbstractC27964kJw.StateListAnimator stateListAnimator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : liveData, (i & 2) != 0 ? null : stateListAnimator);
    }

    public kJG(LiveData<java.lang.String> liveData, AbstractC27964kJw.StateListAnimator stateListAnimator) {
        super(stateListAnimator);
        this.copydefault = liveData;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.kLX
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42669ral copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42669ral c42669ralOLrzqt = C42669ral.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42669ralOLrzqt, "");
        return c42669ralOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;)Lo/rgg; */
    @Override // o.AbstractC27964kJw
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42982rgg copydefault(@NotNull C42669ral c42669ral) {
        Intrinsics.checkNotNullParameter(c42669ral, "");
        C42982rgg c42982rgg = c42669ral.copydefault;
        Intrinsics.checkNotNullExpressionValue(c42982rgg, "");
        return c42982rgg;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)Landroid/widget/ImageView; */
    @Override // o.AbstractC27964kJw
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.ImageView EZpvd(@NotNull C42669ral c42669ral) {
        Intrinsics.checkNotNullParameter(c42669ral, "");
        AppCompatImageView appCompatImageView = c42669ral.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        return appCompatImageView;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Landroid/content/Context;Lcom/okinc/business/market/bean/CoinQuote;)V */
    @Override // o.AbstractC27964kJw
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C42669ral c42669ral, @NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(c42669ral, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        c42669ral.copydefault.setPriceLayoutVisible(true);
    }

    @Override // o.AbstractC27964kJw
    public kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        java.lang.String coinFormatName$default = getCoinFormatName$default(this, coinQuote.getInstId(), false, 2, null);
        return C56390yDp.OLrzqt(C33129mqd.gEmmrt(coinFormatName$default != null ? StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) coinFormatName$default).toString() : null), "");
    }

    @Override // o.AbstractC27964kJw
    public java.lang.CharSequence EZpvd(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        LiveData<java.lang.String> liveData = this.copydefault;
        if (Intrinsics.EZpvd((java.lang.Object) (liveData != null ? liveData.getValue() : null), (java.lang.Object) "Volume")) {
            return java.lang.String.valueOf(coinQuote.getVoulum());
        }
        return java.lang.String.valueOf(coinQuote.getTurnover());
    }

    public static /* synthetic */ java.lang.String getCoinFormatName$default(kJG kjg, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kjg.copydefault(str, z);
    }

    private final java.lang.String copydefault(java.lang.String str, boolean z) {
        BizInstrument bizInstrumentValueOf;
        java.lang.String instFamily;
        AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl("OPTION");
        java.lang.String strReplace$default = null;
        if (abstractC54531xLwKWHzl != null) {
            bizInstrumentValueOf = abstractC54531xLwKWHzl.valueOf(str == null ? "" : str);
        } else {
            bizInstrumentValueOf = null;
        }
        java.lang.String strAEQbTJ = AEQbTJ(bizInstrumentValueOf);
        if (z) {
            if (bizInstrumentValueOf != null && (instFamily = bizInstrumentValueOf.getInstFamily()) != null) {
                strReplace$default = C59449zhJ.replace$default(instFamily, "-", "", false, 4, (java.lang.Object) null);
            }
            return strReplace$default + strAEQbTJ;
        }
        java.util.List listSplit$default = str != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null) : null;
        if (listSplit$default == null || listSplit$default.size() != 5) {
            if (str != null) {
                return C59449zhJ.replaceFirst$default(str, "-", "", false, 4, (java.lang.Object) null);
            }
            return null;
        }
        return listSplit$default.get(0) + listSplit$default.get(1) + "-" + strAEQbTJ + "-" + listSplit$default.get(3) + "-" + listSplit$default.get(4);
    }

    private final java.lang.String AEQbTJ(BizInstrument bizInstrument) {
        if (bizInstrument != null && (bizInstrument instanceof OptionInstrument)) {
            OptionInstrument optionInstrument = (OptionInstrument) bizInstrument;
            long jValueOf = C33129mqd.valueOf(optionInstrument.getExpTime());
            if (jValueOf == 0) {
                java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) optionInstrument.getInstId(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
                if (listSplit$default.size() == 5) {
                    return "20" + listSplit$default.get(2);
                }
            } else {
                return pTA.formatDate$default(new Date(jValueOf), OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null);
            }
        }
        return "";
    }
}
