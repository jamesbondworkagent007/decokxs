package o;

import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.pi.PiChangeTrustTransaction;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bVv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9458bVv extends AbstractC12442cmy {
    public final C9372bUO EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9458bVv(@NotNull C9372bUO c9372bUO) {
        super(c9372bUO);
        Intrinsics.checkNotNullParameter(c9372bUO, "");
        this.EZpvd = c9372bUO;
    }

    public final SignedTx EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54893xZf.KWHzl.EZpvd(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), EZpvd());
    }

    public final PiChangeTrustTransaction EZpvd() {
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(this.EZpvd.djBIcL().getNonce(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String networkPassphrase = this.EZpvd.djBIcL().getNetworkPassphrase();
        java.lang.String str = networkPassphrase == null ? "" : networkPassphrase;
        java.lang.String assetName = this.EZpvd.djBIcL().getAssetName();
        java.lang.String str2 = assetName == null ? "" : assetName;
        java.lang.String issuer = this.EZpvd.djBIcL().getIssuer();
        java.lang.String str3 = issuer == null ? "" : issuer;
        java.lang.String trustLineLimit = this.EZpvd.djBIcL().getTrustLineLimit();
        return new PiChangeTrustTransaction("changeTrust", strConvertToBigIntegerString$default, str, str2, str3, trustLineLimit == null ? "" : trustLineLimit, java.lang.String.valueOf(this.EZpvd.dHguZz().valueOf()), C54862xYb.convertToBigIntegerString$default(this.EZpvd.djBIcL().getNormal(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(this.EZpvd.djBIcL().getTimeout(), false, (RoundingMode) null, 3, (java.lang.Object) null));
    }
}
