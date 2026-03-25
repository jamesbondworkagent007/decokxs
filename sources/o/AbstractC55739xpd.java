package o;

import com.okinc.unify_trade.biz.subscribe.BizTradeAggregatedData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xpd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55739xpd extends AbstractC55755xpt<java.util.List<? extends BizTradeAggregatedData>> {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55755xpt
    public java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55755xpt
    public java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC55739xpd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        super(null, null, str, null, str2, null, 43, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.AEQbTJ = str2;
        this.KWHzl = "TradeAggregatedListener-" + str;
        this.EZpvd = "TradeAggregatedListener";
    }
}
