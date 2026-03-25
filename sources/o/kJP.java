package o;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.OptionInstrument;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC27554jxQ;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class kJP extends AbstractC27554jxQ {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public kJP() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27554jxQ
    public java.lang.CharSequence djBIcL(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return null;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.jxQ$ActionBar:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.jxQ$ActionBar) : (r1v0 o.jxQ$ActionBar))
 A[MD:(o.jxQ$ActionBar):void (m)] (LINE:21) call: o.kJP.<init>(o.jxQ$ActionBar):void type: THIS */
    public /* synthetic */ kJP(AbstractC27554jxQ.ActionBar actionBar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : actionBar);
    }

    public kJP(AbstractC27554jxQ.ActionBar actionBar) {
        super(actionBar);
    }

    @Override // o.AbstractC27554jxQ
    public java.lang.CharSequence gEmmrt(@NotNull final android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        java.lang.String coinFormatName$default = getCoinFormatName$default(this, coinQuote.getInstId(), false, 2, null);
        return StringsKt__StringsKt.hDKMBd(C33061mpO.setupSpanStyles$default(java.lang.String.valueOf(coinFormatName$default), new java.lang.String[]{java.lang.String.valueOf(coinFormatName$default)}, 0, null, false, new Function1() { // from class: o.kJQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kJP.djBIcL(context, (java.util.List) obj);
            }
        }, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit djBIcL(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C32113mPz.Dialog.AuCTelauCTel));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC27554jxQ
    public java.lang.CharSequence copydefault(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        if (Intrinsics.EZpvd((java.lang.Object) C42955rgF.copydefault.OLrzqt(), (java.lang.Object) "Volume")) {
            return java.lang.String.valueOf(coinQuote.getVoulum());
        }
        return java.lang.String.valueOf(coinQuote.getTurnover());
    }

    public static /* synthetic */ java.lang.String getCoinFormatName$default(kJP kjp, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCoinFormatName");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return kjp.OLrzqt(str, z);
    }

    public final java.lang.String OLrzqt(java.lang.String str, boolean z) {
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

    public final java.lang.String AEQbTJ(BizInstrument bizInstrument) {
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
