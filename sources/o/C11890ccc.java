package o;

import com.okinc.business.defi.biz.core.transaction.sign.sui.bean.SuiInputCoin;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.sui.SuiObject;
import com.okinc.wallet.core.sign.sui.SuiTokenTxData;
import com.okinc.wallet.core.sign.sui.SuiTransaction;
import com.okinc.wallet.core.sign.sui.SuiTxData;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ccc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11890ccc extends AbstractC12442cmy {
    public final C11812cbD KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11890ccc(@NotNull C11812cbD c11812cbD) {
        super(c11812cbD);
        Intrinsics.checkNotNullParameter(c11812cbD, "");
        this.KWHzl = c11812cbD;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<SuiObject> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.String gasPrice = this.KWHzl.OcIXYQ().getGasPrice();
        return C54898xZk.AEQbTJ.copydefault(new SuiTxData(gasPrice == null ? "" : gasPrice, C54862xYb.convertToBigIntegerString$default(str, false, (RoundingMode) null, 3, (java.lang.Object) null), "0", this.KWHzl.fERRXa().getAddress(), C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.KWHzl, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null), this.KWHzl.zLjUOn(), list));
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.util.List<SuiObject> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.String gasPrice = this.KWHzl.OcIXYQ().getGasPrice();
        java.lang.String str2 = gasPrice == null ? "" : gasPrice;
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(str, false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String address = this.KWHzl.fERRXa().getAddress();
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.KWHzl, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strZLjUOn = this.KWHzl.zLjUOn();
        java.util.List<SuiInputCoin> tokenInputCoins = this.KWHzl.OcIXYQ().getTokenInputCoins();
        java.util.List<SuiObject> listAEQbTJ = tokenInputCoins != null ? C11832cbX.AEQbTJ(tokenInputCoins) : null;
        return C54898xZk.AEQbTJ.EZpvd(new SuiTokenTxData(str2, strConvertToBigIntegerString$default, "0", address, strConvertToBigIntegerString$default2, strZLjUOn, list, listAEQbTJ == null ? yDY.AhwBna() : listAEQbTJ));
    }

    public final SignedTx EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C54898xZk.AEQbTJ.copydefault(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), new SuiTransaction(str2));
    }
}
