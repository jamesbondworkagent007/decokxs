package o;

import com.okinc.business.dex.trade.copytrading.edit.ui.widget.autosell.data.CopyTradingAutoSellStrategy;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class gUK extends gUD {
    public static final Application Companion = new Application(null);
    public static final BigDecimal valueOf = new BigDecimal("1000000000");

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gUK.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gUK(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        setLabel(C23274hvD.Fragment.hashCode, C52761wXj.TaskDescription.QOeQqh);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gUK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        setLabel(C23274hvD.Fragment.hashCode, C52761wXj.TaskDescription.QOeQqh);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gUK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setLabel(C23274hvD.Fragment.hashCode, C52761wXj.TaskDescription.QOeQqh);
    }

    @Override // o.gUD
    public boolean KWHzl(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        return C23313hvq.valueOf(bigDecimal, valueOf) && C23313hvq.EZpvd(bigDecimal, BigDecimal.ZERO);
    }

    @Override // o.gUD
    public CopyTradingAutoSellStrategy AEQbTJ() {
        java.lang.String strIsConnected;
        java.lang.String strIsConnected2;
        C55001xbh c55001xbhEZpvd = EZpvd();
        java.lang.String str = "0";
        if (c55001xbhEZpvd == null || (strIsConnected = c55001xbhEZpvd.isConnected()) == null) {
            strIsConnected = "0";
        }
        C55001xbh c55001xbhOLrzqt = OLrzqt();
        if (c55001xbhOLrzqt != null && (strIsConnected2 = c55001xbhOLrzqt.isConnected()) != null) {
            str = strIsConnected2;
        }
        return new CopyTradingAutoSellStrategy.TakeProfit(strIsConnected, str);
    }
}
