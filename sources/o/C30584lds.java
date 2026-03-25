package o;

import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lds, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30584lds extends AbstractC30580ldo {
    public static final Application Companion = new Application(null);
    public static final BigDecimal DbNXlk = new BigDecimal("-99");

    /* JADX INFO: renamed from: o.lds$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lds.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30584lds(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        setLabel(C23274hvD.Fragment.getExtraBinder);
        C55001xbh c55001xbhKWHzl = KWHzl();
        if (c55001xbhKWHzl != null) {
            c55001xbhKWHzl.setNegativeMode(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30584lds(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        setLabel(C23274hvD.Fragment.getExtraBinder);
        C55001xbh c55001xbhKWHzl = KWHzl();
        if (c55001xbhKWHzl != null) {
            c55001xbhKWHzl.setNegativeMode(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30584lds(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setLabel(C23274hvD.Fragment.getExtraBinder);
        C55001xbh c55001xbhKWHzl = KWHzl();
        if (c55001xbhKWHzl != null) {
            c55001xbhKWHzl.setNegativeMode(true);
        }
    }

    @Override // o.AbstractC30580ldo
    public boolean AEQbTJ(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        return C23313hvq.EZpvd(bigDecimal, DbNXlk) && C23313hvq.valueOf(bigDecimal, BigDecimal.ZERO);
    }

    @Override // o.AbstractC30580ldo
    public AdvancedAutoSellStrategy OLrzqt() {
        java.lang.String strIsConnected;
        java.lang.String strIsConnected2;
        C55001xbh c55001xbhKWHzl = KWHzl();
        java.lang.String str = (c55001xbhKWHzl == null || (strIsConnected2 = c55001xbhKWHzl.isConnected()) == null) ? "0" : strIsConnected2;
        C55001xbh c55001xbhEZpvd = EZpvd();
        return new AdvancedAutoSellStrategy.StopLoss(str, (c55001xbhEZpvd == null || (strIsConnected = c55001xbhEZpvd.isConnected()) == null) ? "0" : strIsConnected, false, (java.lang.String) null, (java.lang.String) null, 0, 60, (DefaultConstructorMarker) null);
    }
}
