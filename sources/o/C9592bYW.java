package o;

import com.okinc.business.defi.biz.net.bean.JitoInfoResult;
import com.okinc.wallet.core.sign.solana.SolUnitLimitAndPrice;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bYW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9592bYW extends C8429bCZ {
    public final AbstractC8564bFB<?, ?> AhwBna;
    public final InterfaceC9462bVz valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9592bYW(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull InterfaceC9462bVz interfaceC9462bVz) {
        super(abstractC8564bFB);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        Intrinsics.checkNotNullParameter(interfaceC9462bVz, "");
        this.AhwBna = abstractC8564bFB;
        this.valueOf = interfaceC9462bVz;
    }

    @Override // o.C8429bCZ, o.AbstractC8426bCW
    public java.lang.String AEQbTJ() {
        return getCurrentFeeAmountWithSolTxMode$default(this, 0, 1, null);
    }

    public static /* synthetic */ java.lang.String getCurrentFeeAmountWithSolTxMode$default(C9592bYW c9592bYW, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c9592bYW.valueOf.isConnected();
        }
        return c9592bYW.EZpvd(i);
    }

    public final java.lang.String EZpvd(int i) {
        if (i == 2) {
            return C54862xYb.convertToBigIntegerString$default(C54862xYb.KWHzl(C54862xYb.KWHzl(fetchVPNInfo(), OLrzqt(i)), DbNXlk()), false, (RoundingMode) null, 3, (java.lang.Object) null);
        }
        return C54862xYb.convertToBigIntegerString$default(C54862xYb.KWHzl(fetchVPNInfo(), OLrzqt(i)), false, (RoundingMode) null, 3, (java.lang.Object) null);
    }

    public final java.lang.String fetchVPNInfo() {
        return this.valueOf.AEQbTJ();
    }

    private final java.lang.String fARcdN() {
        java.util.List<SolUnitLimitAndPrice> listEZpvd = this.valueOf.EZpvd();
        if (listEZpvd == null) {
            return "0";
        }
        java.lang.String strConvertToString$default = "0";
        for (SolUnitLimitAndPrice solUnitLimitAndPrice : listEZpvd) {
            strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.KWHzl(strConvertToString$default, (solUnitLimitAndPrice.getDeserialized() && C33129mqd.OLrzqt((java.lang.CharSequence) solUnitLimitAndPrice.getComputeUnitPrice())) ? this.valueOf.EZpvd(solUnitLimitAndPrice.getComputeUnitPrice(), solUnitLimitAndPrice.getComputeUnitLimit()) : "0"), false, null, null, 7, null);
        }
        return strConvertToString$default;
    }

    public static /* synthetic */ java.lang.String priorityFee$default(C9592bYW c9592bYW, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c9592bYW.valueOf.isConnected();
        }
        return c9592bYW.OLrzqt(i);
    }

    public final java.lang.String OLrzqt(int i) {
        return i == 2 ? "0" : fARcdN();
    }

    public final java.lang.String DbNXlk() {
        JitoInfoResult jitoInfoResultQKVWgx;
        java.lang.String clientGasPrice;
        AbstractC8564bFB<?, ?> abstractC8564bFB = this.AhwBna;
        java.lang.String strConvertToBigIntegerString$default = null;
        C9615bYt c9615bYt = abstractC8564bFB instanceof C9615bYt ? (C9615bYt) abstractC8564bFB : null;
        if (c9615bYt != null && (jitoInfoResultQKVWgx = c9615bYt.QKVWgx()) != null && (clientGasPrice = jitoInfoResultQKVWgx.getClientGasPrice()) != null) {
            strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(clientGasPrice, false, (RoundingMode) null, 3, (java.lang.Object) null);
        }
        if (strConvertToBigIntegerString$default == null || strConvertToBigIntegerString$default.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strConvertToBigIntegerString$default)) {
            strConvertToBigIntegerString$default = "0";
        }
        return C54862xYb.convertToString$default(C54862xYb.KWHzl(strConvertToBigIntegerString$default, fetchVPNInfo()), false, 0, RoundingMode.UP, 1, null);
    }
}
