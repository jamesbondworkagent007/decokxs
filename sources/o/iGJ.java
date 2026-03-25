package o;

import com.okinc.business.invest_biz.ui.screens.base_transaction.model.DeFiTradeExecutorType;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@yCR
public final class iGJ {
    public final C27164jpy AEQbTJ;
    public final InterfaceC23916iOb EZpvd;
    public final iFN KWHzl;
    public final iDH OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final iFL djBIcL;
    public final iFR gEmmrt;

    @yCM
    public iGJ(@NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull iFN ifn, @NotNull iFL ifl, @NotNull iFR ifr, @NotNull iDH idh, @NotNull C27164jpy c27164jpy, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(ifn, "");
        Intrinsics.checkNotNullParameter(ifl, "");
        Intrinsics.checkNotNullParameter(ifr, "");
        Intrinsics.checkNotNullParameter(idh, "");
        Intrinsics.checkNotNullParameter(c27164jpy, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC23916iOb;
        this.KWHzl = ifn;
        this.djBIcL = ifl;
        this.gEmmrt = ifr;
        this.OLrzqt = idh;
        this.AEQbTJ = c27164jpy;
        this.copydefault = coroutineDispatcher;
    }

    public final iXE AEQbTJ(@NotNull TransactionConfig transactionConfig) {
        iCU icu;
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        int iFIwbmz = transactionConfig.fIwbmz();
        if (iFIwbmz == 1) {
            InterfaceC23916iOb interfaceC23916iOb = this.EZpvd;
            return new iGQ(interfaceC23916iOb, this.KWHzl, this.AEQbTJ, new C23618iDa(interfaceC23916iOb), this.copydefault);
        }
        if (iFIwbmz == 2) {
            InterfaceC23916iOb interfaceC23916iOb2 = this.EZpvd;
            iFL ifl = this.djBIcL;
            C27164jpy c27164jpy = this.AEQbTJ;
            if (transactionConfig.KWHzl() == DeFiTradeExecutorType.SINGLE_REDEEM_V2) {
                icu = new C23619iDb(this.EZpvd);
            } else {
                icu = new iCU();
            }
            return new iGO(interfaceC23916iOb2, ifl, c27164jpy, icu, this.copydefault);
        }
        if (iFIwbmz == 4) {
            InterfaceC23916iOb interfaceC23916iOb3 = this.EZpvd;
            return new iGR(interfaceC23916iOb3, this.gEmmrt, this.AEQbTJ, new C23620iDc(interfaceC23916iOb3), this.copydefault);
        }
        if (iFIwbmz == 10) {
            if (transactionConfig.AuCTelauCTel()) {
                return new iGM(this.EZpvd, this.djBIcL, this.AEQbTJ, new iCY(), this.copydefault);
            }
            return new iGO(this.EZpvd, this.djBIcL, this.AEQbTJ, new C23622iDe(), this.copydefault);
        }
        if (iFIwbmz == 17) {
            return new iGQ(this.EZpvd, this.KWHzl, this.AEQbTJ, new iCT(), this.copydefault);
        }
        if (iFIwbmz == 7) {
            return new iGI(this.EZpvd, this.KWHzl, this.AEQbTJ, new iCR(), this.copydefault);
        }
        if (iFIwbmz == 8) {
            return new iGL(this.EZpvd, this.djBIcL, this.AEQbTJ, new iCQ(), this.copydefault);
        }
        switch (iFIwbmz) {
            case 12:
                return new iGM(this.EZpvd, this.djBIcL, this.AEQbTJ, new iCY(), this.copydefault);
            case 13:
                return new iGD(this.EZpvd, this.KWHzl, this.AEQbTJ, this.OLrzqt, new iCN(), this.copydefault);
            case 14:
                return new iGG(this.EZpvd, this.djBIcL, this.AEQbTJ, new iCO(), this.copydefault);
            default:
                InterfaceC23916iOb interfaceC23916iOb4 = this.EZpvd;
                return new iGQ(interfaceC23916iOb4, this.KWHzl, this.AEQbTJ, new C23618iDa(interfaceC23916iOb4), this.copydefault);
        }
    }
}
