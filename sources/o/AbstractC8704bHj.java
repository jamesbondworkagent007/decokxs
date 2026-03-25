package o;

import com.okinc.business.defi.api.model.tx.signdata.BaseTransferSignData;
import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.net.bean.TxToastCheckReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC8426bCW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bHj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8704bHj<Fee extends AbstractC8426bCW<?>, SignData extends BaseTransferSignData> extends AbstractC8564bFB<Fee, SignData> {
    public OKWBaseTransaction.TransactionType ORxRYg = OKWBaseTransaction.TransactionType.Transfer;

    public abstract java.lang.String AEQbTJ(boolean z, boolean z2);

    public int DWgRXt() {
        return 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8564bFB
    public void OLrzqt(@NotNull java.util.List<TxToastCheckRes> list) {
        Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public OKWBaseTransaction.TransactionType k_() {
        return this.ORxRYg;
    }

    @Override // o.AbstractC8564bFB
    public java.lang.String l_() {
        return null;
    }

    @Override // o.AbstractC8564bFB
    public boolean q_() {
        return true;
    }

    public final long DGOPHZ() {
        return fHqPtx().AhwBna();
    }

    public C10854bwM fHqPtx() {
        return DarRvM().OLrzqt(QVsKAR().getCoinId());
    }

    @Override // o.AbstractC8564bFB
    public java.util.HashSet<java.lang.Long> j_() {
        java.util.HashSet<java.lang.Long> hashSetJ_ = super.j_();
        hashSetJ_.add(java.lang.Long.valueOf(DGOPHZ()));
        return hashSetJ_;
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        AbstractC58185ywX<Unit> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(Unit.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static /* synthetic */ java.lang.String getTransferAmount$default(AbstractC8704bHj abstractC8704bHj, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTransferAmount");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return abstractC8704bHj.AEQbTJ(z, z2);
    }

    public final boolean a_(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33129mqd.copydefault(str, str2);
    }

    public final boolean c_(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33129mqd.copydefault(str, str2);
    }

    public final boolean EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C33129mqd.copydefault(str, C54862xYb.KWHzl(str2, str3));
    }

    public final boolean b_(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return C33129mqd.valueOf(str, 0) || C33129mqd.valueOf(str, str2);
    }

    public final java.lang.String values(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54862xYb.convertToString$default(C54862xYb.OLrzqt(C54862xYb.OLrzqt(C54870xYj.AEQbTJ(str, fHqPtx().valueOf()), KDccX()), java.lang.Double.valueOf(DcqEDu())), false, null, null, 7, null);
    }

    public final java.lang.String fetchVPNInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54862xYb.convertToBigIntegerString$default(C54862xYb.divB$default(C54862xYb.divB$default(C54870xYj.KWHzl(str, fHqPtx().valueOf()), java.lang.Double.valueOf(DcqEDu()), 0, null, 6, null), KDccX(), 0, null, 6, null), true, (RoundingMode) null, 2, (java.lang.Object) null);
    }

    public final java.lang.String isConnected(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54862xYb.convertToString$default(C54862xYb.OLrzqt(C54870xYj.AEQbTJ(str, fHqPtx().valueOf()), KDccX()), false, null, null, 7, null);
    }

    public final java.lang.String KDccX() {
        WalletTickerManager.CoinPrice coinPriceCopydefault = DarRvM().copydefault(java.lang.Long.valueOf(fHqPtx().AhwBna()));
        if (coinPriceCopydefault != null) {
            return coinPriceCopydefault.getRealPrice();
        }
        return null;
    }

    public final double DcqEDu() {
        return zuWLRA().KWHzl().getUsdToThisRate();
    }

    public final boolean UrRBLY() {
        return DXXBbs().djBIcL() == dHguZz().AhwBna();
    }

    public boolean heceqZ() {
        return DXXBbs().djBIcL() == DGOPHZ();
    }

    @Override // o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public TxToastCheckReq i_() {
        TxToastCheckReq txToastCheckReqI_ = super.i_();
        txToastCheckReqI_.setCoinId(java.lang.Long.valueOf(DGOPHZ()));
        txToastCheckReqI_.setBizType(null);
        txToastCheckReqI_.setTo(zLjUOn());
        txToastCheckReqI_.setAmount(fHqPtx().AuCTel() ? C54862xYb.convertToBigIntegerString$default(getTransferAmount$default(this, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null) : "");
        txToastCheckReqI_.setInputData(null);
        txToastCheckReqI_.setTokenAddress(null);
        txToastCheckReqI_.setProjectAddress(fHqPtx().DCUTEIddSDPG() ? fHqPtx().OLrzqt() : null);
        return txToastCheckReqI_;
    }

    public static /* synthetic */ java.lang.String getCoinCheckBalance$default(AbstractC8704bHj abstractC8704bHj, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCoinCheckBalance");
        }
        if ((i & 1) != 0) {
            str = abstractC8704bHj.htlTjW();
        }
        return abstractC8704bHj.ejfBZ(str);
    }

    public java.lang.String ejfBZ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AuCTel(str);
    }

    public static /* synthetic */ java.lang.String getCoinBalance$default(AbstractC8704bHj abstractC8704bHj, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCoinBalance");
        }
        if ((i & 1) != 0) {
            str = abstractC8704bHj.htlTjW();
        }
        return abstractC8704bHj.AuCTel(str);
    }

    public final java.lang.String AuCTel(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strKWHzl = DarRvM().KWHzl(java.lang.Long.valueOf(DGOPHZ()), str);
        return strKWHzl == null ? "" : strKWHzl;
    }
}
