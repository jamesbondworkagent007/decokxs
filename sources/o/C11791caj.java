package o;

import com.okinc.business.defi.api.model.tx.signdata.StacksContractSignData;
import com.okinc.business.defi.biz.core.transaction.sign.stacks.bean.CustomData;
import com.okinc.business.defi.biz.core.transaction.sign.stacks.bean.StacksSignInfo;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.core.mpc.CoinAddressBean;
import com.okinc.wallet.core.mpc.WalletAddressList;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.stacks.StacksContractTransaction;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.caj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11791caj extends AbstractC12442cmy {
    public final C9662bZn AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11791caj(@NotNull C9662bZn c9662bZn) {
        super(c9662bZn);
        Intrinsics.checkNotNullParameter(c9662bZn, "");
        this.AEQbTJ = c9662bZn;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final StacksContractTransaction OLrzqt() {
        java.lang.String txOptions = ((StacksContractSignData) this.AEQbTJ.QVsKAR()).getTxOptions();
        StacksSignInfo stacksSignInfoEZpvd = this.AEQbTJ.EZpvd();
        return new StacksContractTransaction(txOptions, new CustomData(C54862xYb.convertToBigIntegerString$default(stacksSignInfoEZpvd != null ? stacksSignInfoEZpvd.getNonce() : null, false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(this.AEQbTJ.KWHzl(), false, (RoundingMode) null, 3, (java.lang.Object) null)).toJson());
    }

    public final SignedTx AEQbTJ(@NotNull java.lang.String str) {
        WalletAddressList walletAddressListOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwMDHguZz = this.AEQbTJ.dHguZz();
        if (this.AEQbTJ.dUDNAs().AwvSrB() && c10854bwMDHguZz != null && (walletAddressListOLrzqt = new C13847daM(c10854bwMDHguZz.fetchVPNInfo()).OLrzqt(str, AddressType.Legacy.getValue(), "")) != null) {
            CoinAddressBean coinAddressBean = (CoinAddressBean) CollectionsKt___CollectionsKt.firstOrNull(walletAddressListOLrzqt.getAddressList());
            if (!Intrinsics.EZpvd((java.lang.Object) (coinAddressBean != null ? coinAddressBean.getAddress() : null), (java.lang.Object) this.AEQbTJ.htlTjW())) {
                str = xYW.AEQbTJ.AkhnZx(str);
            }
        }
        return C54899xZl.AEQbTJ.AEQbTJ(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), OLrzqt());
    }
}
