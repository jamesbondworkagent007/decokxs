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
import o.AbstractC27969kKa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kKg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27975kKg extends AbstractC27969kKa<C42672rao> {
    public final LiveData<java.lang.String> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27975kKg() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27969kKa
    public java.util.List<java.lang.CharSequence> OLrzqt(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return null;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:androidx.lifecycle.LiveData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null androidx.lifecycle.LiveData) : (r2v0 androidx.lifecycle.LiveData))
  (wrap:o.kKa$StateListAnimator:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.kKa$StateListAnimator) : (r3v0 o.kKa$StateListAnimator))
 A[MD:(androidx.lifecycle.LiveData<java.lang.String>, o.kKa$StateListAnimator):void (m)] (LINE:25) call: o.kKg.<init>(androidx.lifecycle.LiveData, o.kKa$StateListAnimator):void type: THIS */
    public /* synthetic */ C27975kKg(LiveData liveData, AbstractC27969kKa.StateListAnimator stateListAnimator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : liveData, (i & 2) != 0 ? null : stateListAnimator);
    }

    public C27975kKg(LiveData<java.lang.String> liveData, AbstractC27969kKa.StateListAnimator stateListAnimator) {
        super(stateListAnimator);
        this.AEQbTJ = liveData;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.kLX
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C42672rao copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42672rao c42672raoKWHzl = C42672rao.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42672raoKWHzl, "");
        return c42672raoKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;)Lo/xcy; */
    @Override // o.AbstractC27969kKa
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C55071xcy KWHzl(@NotNull C42672rao c42672rao) {
        Intrinsics.checkNotNullParameter(c42672rao, "");
        C55071xcy c55071xcy = c42672rao.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55071xcy, "");
        return c55071xcy;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)Lo/rgn; */
    @Override // o.AbstractC27969kKa
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42989rgn EZpvd(@NotNull C42672rao c42672rao) {
        Intrinsics.checkNotNullParameter(c42672rao, "");
        C42989rgn c42989rgn = c42672rao.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c42989rgn, "");
        return c42989rgn;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;)Landroid/widget/ImageView; */
    @Override // o.AbstractC27969kKa
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.ImageView AEQbTJ(@NotNull C42672rao c42672rao) {
        Intrinsics.checkNotNullParameter(c42672rao, "");
        AppCompatImageView appCompatImageView = c42672rao.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        return appCompatImageView;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/content/Context;Lcom/okinc/business/market/bean/CoinQuote;)V */
    @Override // o.AbstractC27969kKa
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C42672rao c42672rao, @NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(c42672rao, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        c42672rao.EZpvd.setPriceLayoutVisible(true);
    }

    @Override // o.AbstractC27969kKa
    public kotlin.Pair<java.lang.String, java.lang.String> EZpvd(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return C56390yDp.OLrzqt(C33129mqd.gEmmrt(getCoinFormatName$default(this, coinQuote.getInstId(), false, 2, null)), "");
    }

    @Override // o.AbstractC27969kKa
    public java.lang.CharSequence AEQbTJ(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return java.lang.String.valueOf(coinQuote.getTurnover());
    }

    public static /* synthetic */ java.lang.String getCoinFormatName$default(C27975kKg c27975kKg, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c27975kKg.OLrzqt(str, z);
    }

    private final java.lang.String OLrzqt(java.lang.String str, boolean z) {
        BizInstrument bizInstrumentValueOf;
        java.lang.String instFamily;
        AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl("OPTION");
        java.lang.String strReplace$default = null;
        if (abstractC54531xLwKWHzl != null) {
            bizInstrumentValueOf = abstractC54531xLwKWHzl.valueOf(str == null ? "" : str);
        } else {
            bizInstrumentValueOf = null;
        }
        java.lang.String strKWHzl = KWHzl(bizInstrumentValueOf);
        if (z) {
            if (bizInstrumentValueOf != null && (instFamily = bizInstrumentValueOf.getInstFamily()) != null) {
                strReplace$default = C59449zhJ.replace$default(instFamily, "-", "", false, 4, (java.lang.Object) null);
            }
            return strReplace$default + strKWHzl;
        }
        java.util.List listSplit$default = str != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null) : null;
        if (listSplit$default == null || listSplit$default.size() != 5) {
            if (str != null) {
                return C59449zhJ.replaceFirst$default(str, "-", "", false, 4, (java.lang.Object) null);
            }
            return null;
        }
        return listSplit$default.get(0) + listSplit$default.get(1) + "-" + strKWHzl + "-" + listSplit$default.get(3) + "-" + listSplit$default.get(4);
    }

    private final java.lang.String KWHzl(BizInstrument bizInstrument) {
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
