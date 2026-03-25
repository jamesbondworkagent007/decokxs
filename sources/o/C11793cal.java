package o;

import com.okinc.business.defi.biz.core.transaction.sign.stacks.bean.StacksSignInfo;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.core.mpc.CoinAddressBean;
import com.okinc.wallet.core.mpc.WalletAddressList;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.stacks.StacksTokenTransaction;
import com.okinc.wallet.core.sign.stacks.StacksTransaction;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cal, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11793cal extends AbstractC12442cmy {
    public final C9628bZF copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11793cal(@NotNull C9628bZF c9628bZF) {
        super(c9628bZF);
        Intrinsics.checkNotNullParameter(c9628bZF, "");
        this.copydefault = c9628bZF;
    }

    public final java.lang.String AEQbTJ() {
        return C54862xYb.convertToBigIntegerString$default(this.copydefault.zuBGHE(), false, (RoundingMode) null, 3, (java.lang.Object) null);
    }

    public final StacksTransaction EZpvd() {
        java.lang.String strZLjUOn = this.copydefault.zLjUOn();
        StacksSignInfo stacksSignInfoQKVWgx = this.copydefault.QKVWgx();
        return new StacksTransaction(strZLjUOn, C54862xYb.convertToBigIntegerString$default(stacksSignInfoQKVWgx != null ? stacksSignInfoQKVWgx.getNonce() : null, false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.copydefault, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null), AEQbTJ(), this.copydefault.copydefault());
    }

    public final StacksTokenTransaction OLrzqt() {
        java.lang.String strHtlTjW = this.copydefault.htlTjW();
        java.lang.String strZLjUOn = this.copydefault.zLjUOn();
        StacksSignInfo stacksSignInfoQKVWgx = this.copydefault.QKVWgx();
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(stacksSignInfoQKVWgx != null ? stacksSignInfoQKVWgx.getNonce() : null, false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.copydefault, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strAEQbTJ = AEQbTJ();
        java.lang.String strCopydefault = this.copydefault.copydefault();
        StacksSignInfo stacksSignInfoQKVWgx2 = this.copydefault.QKVWgx();
        java.lang.String contractAddress = stacksSignInfoQKVWgx2 != null ? stacksSignInfoQKVWgx2.getContractAddress() : null;
        java.lang.String str = contractAddress == null ? "" : contractAddress;
        StacksSignInfo stacksSignInfoQKVWgx3 = this.copydefault.QKVWgx();
        java.lang.String contractName = stacksSignInfoQKVWgx3 != null ? stacksSignInfoQKVWgx3.getContractName() : null;
        java.lang.String str2 = contractName == null ? "" : contractName;
        StacksSignInfo stacksSignInfoQKVWgx4 = this.copydefault.QKVWgx();
        java.lang.String tokenName = stacksSignInfoQKVWgx4 != null ? stacksSignInfoQKVWgx4.getTokenName() : null;
        return new StacksTokenTransaction(strHtlTjW, strZLjUOn, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, strAEQbTJ, strCopydefault, str, str2, ExtJson.BRC20TYPE_TRANSFER, tokenName == null ? "" : tokenName);
    }

    public final SignedTx KWHzl(java.lang.String str) {
        WalletAddressList walletAddressListOLrzqt;
        C10854bwM c10854bwMFHqPtx = this.copydefault.fHqPtx();
        C10854bwM c10854bwMDHguZz = this.copydefault.dHguZz();
        if (str != null && (walletAddressListOLrzqt = new C13847daM(c10854bwMDHguZz.fetchVPNInfo()).OLrzqt(str, AddressType.Legacy.getValue(), "")) != null) {
            CoinAddressBean coinAddressBean = (CoinAddressBean) CollectionsKt___CollectionsKt.firstOrNull(walletAddressListOLrzqt.getAddressList());
            if (!Intrinsics.EZpvd((java.lang.Object) (coinAddressBean != null ? coinAddressBean.getAddress() : null), (java.lang.Object) this.copydefault.htlTjW())) {
                str = xYW.AEQbTJ.AkhnZx(str);
            }
        }
        java.lang.String str2 = str;
        if (c10854bwMFHqPtx.AuCTel()) {
            return C54899xZl.AEQbTJ.OLrzqt(AbstractC12442cmy.generateSignParams$default(this, str2, null, false, 6, null), EZpvd());
        }
        return C54899xZl.AEQbTJ.OLrzqt(AbstractC12442cmy.generateSignParams$default(this, str2, null, false, 6, null), OLrzqt());
    }
}
