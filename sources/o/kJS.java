package o;

import androidx.lifecycle.LiveData;
import com.okinc.business.market.bean.CoinQuote;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC27554jxQ;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class kJS extends AbstractC27554jxQ {
    public final boolean fetchVPNInfo;
    public final LiveData<java.lang.String> isConnected;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 androidx.lifecycle.LiveData)
  (wrap:o.jxQ$ActionBar:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.jxQ$ActionBar) : (r2v0 o.jxQ$ActionBar))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(androidx.lifecycle.LiveData<java.lang.String>, o.jxQ$ActionBar, boolean):void (m)] (LINE:11) call: o.kJS.<init>(androidx.lifecycle.LiveData, o.jxQ$ActionBar, boolean):void type: THIS */
    public /* synthetic */ kJS(LiveData liveData, AbstractC27554jxQ.ActionBar actionBar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(liveData, (i & 2) != 0 ? null : actionBar, (i & 4) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kJS(@NotNull LiveData<java.lang.String> liveData, AbstractC27554jxQ.ActionBar actionBar, boolean z) {
        super(actionBar);
        Intrinsics.checkNotNullParameter(liveData, "");
        this.isConnected = liveData;
        this.fetchVPNInfo = z;
    }

    @Override // o.AbstractC27554jxQ
    public java.lang.CharSequence gEmmrt(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        if (this.fetchVPNInfo) {
            java.lang.String strCopydefault = C40381qTt.copydefault.copydefault(coinQuote.getInstId());
            return strCopydefault == null ? coinQuote.getInstId() : strCopydefault;
        }
        java.lang.String titleByIdAndType$default = C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, coinQuote.getInstId(), coinQuote.getInstType(), false, false, false, 28, null);
        java.lang.String string = context.getResources().getString(qZH.PendingIntent.dvKsVJ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) C59449zhJ.replace$default(titleByIdAndType$default, string, "", false, 4, (java.lang.Object) null)).toString();
    }

    @Override // o.AbstractC27554jxQ
    public java.lang.CharSequence djBIcL(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        if (this.fetchVPNInfo) {
            return null;
        }
        java.lang.String string = context.getResources().getString(qZH.PendingIntent.dvKsVJ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.AbstractC27554jxQ
    public java.lang.CharSequence copydefault(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        if (Intrinsics.EZpvd((java.lang.Object) this.isConnected.getValue(), (java.lang.Object) "Volume")) {
            return java.lang.String.valueOf(coinQuote.getVoulum());
        }
        return java.lang.String.valueOf(coinQuote.getTurnover());
    }
}
