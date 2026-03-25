package o;

import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.pi.PiBaseTransaction;
import com.okinc.wallet.core.sign.pi.PiTokenTransaction;
import com.okinc.wallet.core.sign.pi.PiTransaction;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bVx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9460bVx extends AbstractC12442cmy {
    public final C9443bVg AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9460bVx(@NotNull C9443bVg c9443bVg) {
        super(c9443bVg);
        Intrinsics.checkNotNullParameter(c9443bVg, "");
        this.AEQbTJ = c9443bVg;
    }

    public final SignedTx AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54893xZf.KWHzl.EZpvd(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), AEQbTJ());
    }

    public final PiBaseTransaction AEQbTJ() {
        if (this.AEQbTJ.fHqPtx().AuCTel()) {
            java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(this.AEQbTJ.OcIXYQ().getNonce(), false, (RoundingMode) null, 3, (java.lang.Object) null);
            java.lang.String networkPassphrase = this.AEQbTJ.OcIXYQ().getNetworkPassphrase();
            return new PiTransaction("transferNativeAsset", strConvertToBigIntegerString$default, networkPassphrase == null ? "" : networkPassphrase, C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.AEQbTJ, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null), java.lang.String.valueOf(this.AEQbTJ.fHqPtx().valueOf()), this.AEQbTJ.zLjUOn(), this.AEQbTJ.copydefault(), C54862xYb.convertToBigIntegerString$default(this.AEQbTJ.OcIXYQ().getNormal(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(this.AEQbTJ.OcIXYQ().getTimeout(), false, (RoundingMode) null, 3, (java.lang.Object) null));
        }
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(this.AEQbTJ.OcIXYQ().getNonce(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String networkPassphrase2 = this.AEQbTJ.OcIXYQ().getNetworkPassphrase();
        java.lang.String str = networkPassphrase2 == null ? "" : networkPassphrase2;
        java.lang.String assetName = this.AEQbTJ.OcIXYQ().getAssetName();
        java.lang.String str2 = assetName == null ? "" : assetName;
        java.lang.String issuer = this.AEQbTJ.OcIXYQ().getIssuer();
        return new PiTokenTransaction("transferAsset", strConvertToBigIntegerString$default2, str, str2, issuer == null ? "" : issuer, C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.AEQbTJ, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null), java.lang.String.valueOf(this.AEQbTJ.fHqPtx().valueOf()), this.AEQbTJ.zLjUOn(), this.AEQbTJ.copydefault(), C54862xYb.convertToBigIntegerString$default(this.AEQbTJ.OcIXYQ().getNormal(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(this.AEQbTJ.OcIXYQ().getTimeout(), false, (RoundingMode) null, 3, (java.lang.Object) null));
    }
}
