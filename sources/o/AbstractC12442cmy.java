package o;

import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.web3.security.bridge.MnemonicKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cmy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12442cmy {
    public final java.lang.String AhwBna;
    public final InterfaceC56387yDm gEmmrt;
    public final OKWBaseTransaction<?> valueOf;

    public AbstractC12442cmy(@NotNull OKWBaseTransaction<?> oKWBaseTransaction) {
        Intrinsics.checkNotNullParameter(oKWBaseTransaction, "");
        this.valueOf = oKWBaseTransaction;
        this.AhwBna = "TXSignBaseHandler";
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.cmA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC12442cmy.gEmmrt();
            }
        });
    }

    public final java.lang.String AhwBna() {
        return (java.lang.String) this.gEmmrt.getValue();
    }

    public static final java.lang.String gEmmrt() {
        return xYS.copydefault.KWHzl(MnemonicKt.MnemonicLanguageEnglish);
    }

    public static /* synthetic */ SignParams generateSignParams$default(AbstractC12442cmy abstractC12442cmy, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateSignParams");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return abstractC12442cmy.AEQbTJ(str, str2, z);
    }

    public final SignParams AEQbTJ(java.lang.String str, java.lang.String str2, boolean z) {
        SignParams signParams = new SignParams(this.valueOf.dHguZz().QKVWgx(), this.valueOf.dHguZz().fetchVPNInfo(), v_(), str, str2, java.lang.Integer.valueOf(this.valueOf.dUDNAs().finit()), this.valueOf.fERRXa().getAddressType(), this.valueOf.fERRXa().getAddress(), z, this.valueOf.dUDNAs().QVAiDq(), null, 1024, null);
        OKWBaseTransaction<?> oKWBaseTransaction = this.valueOf;
        if (oKWBaseTransaction instanceof AbstractC11993ceZ) {
            ((AbstractC11993ceZ) oKWBaseTransaction).OLrzqt(this.AhwBna, "token:" + v_());
        }
        return signParams;
    }

    public java.lang.String v_() {
        OKWBaseTransaction<?> oKWBaseTransaction = this.valueOf;
        if (oKWBaseTransaction instanceof AbstractC8564bFB) {
            AbstractC8564bFB abstractC8564bFB = (AbstractC8564bFB) oKWBaseTransaction;
            if (!(abstractC8564bFB instanceof AbstractC8704bHj)) {
                boolean z = abstractC8564bFB instanceof AbstractC8601bFm;
            } else if (!((AbstractC8704bHj) oKWBaseTransaction).fHqPtx().AuCTel()) {
                return ((AbstractC8704bHj) this.valueOf).fHqPtx().fJNWhG();
            }
        } else {
            boolean z2 = oKWBaseTransaction instanceof AbstractC8610bFv;
        }
        return null;
    }
}
