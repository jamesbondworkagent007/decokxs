package o;

import com.okinc.business.market.bean.CoinQuote;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC27554jxQ;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class kJN extends AbstractC27554jxQ {
    public static final int values = C54536xML.KWHzl;
    public final C54536xML isConnected;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public kJN() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.jxQ$ActionBar:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.jxQ$ActionBar) : (r1v0 o.jxQ$ActionBar))
 A[MD:(o.jxQ$ActionBar):void (m)] (LINE:12) call: o.kJN.<init>(o.jxQ$ActionBar):void type: THIS */
    public /* synthetic */ kJN(AbstractC27554jxQ.ActionBar actionBar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : actionBar);
    }

    public kJN(AbstractC27554jxQ.ActionBar actionBar) {
        super(actionBar);
        this.isConnected = new C54536xML();
    }

    @Override // o.AbstractC27554jxQ
    public java.lang.CharSequence gEmmrt(@NotNull final android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        java.lang.CharSequence charSequenceAEQbTJ = AEQbTJ(coinQuote);
        return StringsKt__StringsKt.hDKMBd(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(((java.lang.Object) charSequenceAEQbTJ) + " /" + coinQuote.getQuoteCurrency(), new java.lang.String[]{java.lang.String.valueOf(AEQbTJ(coinQuote))}, 0, null, false, new Function1() { // from class: o.kJL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kJN.djBIcL(context, (java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{"/" + coinQuote.getQuoteCurrency()}, 0, null, false, new Function1() { // from class: o.kJR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kJN.AhwBna(context, (java.util.List) obj);
            }
        }, 14, null));
    }

    public static final Unit djBIcL(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C32113mPz.Dialog.gHZMYf));
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C52761wXj.LoaderManager.QSBOWP));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC27554jxQ
    public java.lang.CharSequence djBIcL(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        java.lang.String strKWHzl = KWHzl(coinQuote);
        if (strKWHzl.length() == 0) {
            return null;
        }
        return strKWHzl;
    }

    @Override // o.AbstractC27554jxQ
    public java.lang.CharSequence copydefault(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        if (Intrinsics.EZpvd((java.lang.Object) C42955rgF.copydefault.OLrzqt(), (java.lang.Object) "Volume")) {
            C54536xML c54536xML = this.isConnected;
            java.lang.String voulum = coinQuote.getVoulum();
            return c54536xML.OLrzqt(voulum != null ? voulum : "") + " " + coinQuote.getBaseCurrency();
        }
        return java.lang.String.valueOf(coinQuote.getTurnover());
    }

    public final java.lang.String KWHzl(CoinQuote coinQuote) {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) coinQuote.getLeverageRatio())) {
            return "";
        }
        return coinQuote.getLeverageRatio() + "x";
    }

    public final java.lang.CharSequence AEQbTJ(@NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(coinQuote, "");
        java.lang.String baseCurrency = coinQuote.getBaseCurrency();
        if (coinQuote.getBaseCurrency().length() < 8) {
            return baseCurrency;
        }
        java.lang.String strSubstring = baseCurrency.substring(0, 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring + "...";
    }
}
