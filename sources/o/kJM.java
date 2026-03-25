package o;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC27554jxQ;
import o.C35966oKh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class kJM extends AbstractC27554jxQ {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public kJM() {
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
 A[MD:(o.jxQ$ActionBar):void (m)] (LINE:12) call: o.kJM.<init>(o.jxQ$ActionBar):void type: THIS */
    public /* synthetic */ kJM(AbstractC27554jxQ.ActionBar actionBar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : actionBar);
    }

    public kJM(AbstractC27554jxQ.ActionBar actionBar) {
        super(actionBar);
    }

    @Override // o.AbstractC27554jxQ
    public java.lang.CharSequence gEmmrt(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl("FUTURES");
        BizInstrument bizInstrumentValueOf = abstractC54531xLwKWHzl != null ? abstractC54531xLwKWHzl.valueOf(coinQuote.getInstId()) : null;
        if (bizInstrumentValueOf != null && bizInstrumentValueOf.isPreMarketPair()) {
            return C33069mpW.copydefault(C35966oKh.TaskDescription.gEmmrt, C56423yEv.EZpvd(C56390yDp.OLrzqt("uly", C59449zhJ.replace$default(bizInstrumentValueOf.getInstFamily(), "-", "", false, 4, (java.lang.Object) null))));
        }
        return C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, coinQuote.getInstId(), coinQuote.getInstType(), false, false, false, 28, null);
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
}
