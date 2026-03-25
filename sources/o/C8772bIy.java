package o;

import com.okinc.wallet.core.sign.cardano.CardanoAsset;
import com.okinc.wallet.core.sign.cardano.CardanoMultiAsset;
import java.math.RoundingMode;

/* JADX INFO: renamed from: o.bIy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8772bIy extends AbstractC8752bIe {
    @Override // o.AbstractC8752bIe
    public boolean QUSxYX() {
        return false;
    }

    @Override // o.AbstractC8752bIe
    public java.lang.String OcIXYQ() {
        return ORxRYg();
    }

    @Override // o.AbstractC8752bIe
    public java.util.List<CardanoMultiAsset> QVAiDq() {
        C10854bwM c10854bwMFHqPtx = fHqPtx();
        java.lang.String strHDKMBd = c10854bwMFHqPtx.hDKMBd();
        java.lang.String strAubY = c10854bwMFHqPtx.AubY();
        if (strAubY == null) {
            strAubY = "";
        }
        return C56402yEa.EZpvd(new CardanoMultiAsset(strAubY, C56402yEa.EZpvd(new CardanoAsset(strHDKMBd, C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), true, (RoundingMode) null, 2, (java.lang.Object) null)))));
    }

    @Override // o.AbstractC8752bIe
    public java.lang.String UeEOUB() {
        return C33129mqd.addS$default(C33129mqd.addS$default(DXXBbs().AEQbTJ(), KWHzl(), null, null, null, 14, null), ORxRYg(), null, null, null, 14, null);
    }

    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB
    public void AhwBna() {
        java.lang.String strAddS$default = C33129mqd.addS$default(C33129mqd.addS$default(DXXBbs().AEQbTJ(), KWHzl(), null, null, null, 14, null), ORxRYg(), null, null, null, 14, null);
        DLWbHP().AEQbTJ(new C9825bcr(c_(AbstractC8564bFB.getFeeCoinCheckBalance$default(this, null, 1, null), strAddS$default) && !aKErDB(), DXXBbs().AYXKKw(), strAddS$default));
    }
}
