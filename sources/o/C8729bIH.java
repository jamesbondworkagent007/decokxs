package o;

import com.okinc.wallet.core.sign.cardano.CardanoMultiAsset;
import java.math.BigDecimal;

/* JADX INFO: renamed from: o.bIH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8729bIH extends AbstractC8752bIe {
    @Override // o.AbstractC8752bIe
    public java.util.List<CardanoMultiAsset> QVAiDq() {
        return null;
    }

    @Override // o.AbstractC8752bIe
    public boolean QUSxYX() {
        return C_();
    }

    @Override // o.AbstractC8752bIe
    public java.lang.String OcIXYQ() {
        return AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null);
    }

    @Override // o.AbstractC8752bIe
    public java.lang.String UeEOUB() {
        return C_() ? "0" : C33129mqd.addS$default(DXXBbs().AEQbTJ(), KWHzl(), null, null, null, 14, null);
    }

    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB
    public void x_() {
        super.x_();
        DLWbHP().AEQbTJ(new C9822bco(djSkpj(), ORxRYg()));
    }

    private final boolean djSkpj() {
        return C33129mqd.copydefault(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), ORxRYg());
    }

    @Override // o.AbstractC8664bGw
    public kotlin.Pair<java.lang.Boolean, java.lang.String> ao_() {
        java.lang.String strConvertToString$default = null;
        java.lang.String coinCheckBalance$default = AbstractC8704bHj.getCoinCheckBalance$default(this, null, 1, null);
        java.lang.String strAddS$default = C33129mqd.addS$default(DXXBbs().AEQbTJ(), KWHzl(), null, null, null, 14, null);
        boolean z = EZpvd(coinCheckBalance$default, strAddS$default, AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null)) && !aKErDB();
        if (!z) {
            BigDecimal bigDecimalAEQbTJ = C54862xYb.AEQbTJ(coinCheckBalance$default, strAddS$default);
            strConvertToString$default = "0";
            if (!C33129mqd.gEmmrt(bigDecimalAEQbTJ, "0")) {
                strConvertToString$default = C54862xYb.convertToString$default(bigDecimalAEQbTJ, false, null, null, 7, null);
            }
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.valueOf(z), strConvertToString$default);
    }

    @Override // o.AbstractC8664bGw
    public java.lang.String D_() {
        return KWHzl();
    }
}
