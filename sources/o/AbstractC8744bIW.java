package o;

import com.okinc.business.defi.biz.net.bean.CeDefiGasResp;
import com.okinc.business.defi.biz.net.bean.CoinMetaBean;
import com.okinc.business.defi.biz.net.bean.FactionInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bIW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8744bIW extends AbstractC8422bCS {
    public C10854bwM gEmmrt;
    public final AbstractC8727bIF<?> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC8727bIF<?> fetchVPNInfo() {
        return this.valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8744bIW(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull AbstractC8727bIF<?> abstractC8727bIF) {
        super(abstractC8564bFB);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        Intrinsics.checkNotNullParameter(abstractC8727bIF, "");
        this.valueOf = abstractC8727bIF;
    }

    public final boolean fJNWhG() {
        return this.valueOf.AEQbTJ().getGasPayType() == 1;
    }

    public final boolean DbNXlk() {
        return Intrinsics.EZpvd((java.lang.Object) this.valueOf.AEQbTJ().getFeeTokenCoinTypeNo(), (java.lang.Object) this.valueOf.AEQbTJ().getNativeTokenCoinTypeNo());
    }

    @Override // o.AbstractC8426bCW
    public C10854bwM AYXKKw() {
        if (this.gEmmrt == null) {
            CeDefiGasResp ceDefiGasRespAEQbTJ = this.valueOf.AEQbTJ();
            int feeTokenDecimal = ceDefiGasRespAEQbTJ.getFeeTokenDecimal();
            int feeTokenDisplayPrecision = ceDefiGasRespAEQbTJ.getFeeTokenDisplayPrecision();
            this.gEmmrt = new C10854bwM(new CoinMetaBean(0L, 0L, 0L, 0L, (java.lang.String) null, (java.lang.String) null, ceDefiGasRespAEQbTJ.getFeeTokenSymbol(), ceDefiGasRespAEQbTJ.getFeeTokenImageUrl(), (java.lang.String) null, (java.lang.String) null, feeTokenDecimal, 0, 0, 0, (java.lang.String) null, false, false, (java.lang.Integer) null, false, 0, 0, 0, false, false, (java.lang.String) null, (FactionInfo) null, (java.lang.Boolean) null, 0, 0, false, (java.lang.Boolean) null, (java.lang.Long) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.Integer) null, 0, (java.lang.Integer) null, (java.lang.Integer) null, ceDefiGasRespAEQbTJ.getFeeTokenStableCoin(), feeTokenDisplayPrecision, false, (java.lang.String) null, -1217, 831, (DefaultConstructorMarker) null));
        }
        C10854bwM c10854bwM = this.gEmmrt;
        Intrinsics.copydefault(c10854bwM);
        return c10854bwM;
    }

    @Override // o.AbstractC8426bCW
    public java.lang.String valueOf() {
        return this.valueOf.AEQbTJ().getFeeTokenPrice();
    }
}
