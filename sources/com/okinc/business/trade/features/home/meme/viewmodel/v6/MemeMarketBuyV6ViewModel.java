package com.okinc.business.trade.features.home.meme.viewmodel.v6;

import androidx.lifecycle.LiveData;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.dexlogic.bean.UnitType;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6ApproveExecutionUseCase;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6DeFiPlatformUseCase;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6FeeCalculationUseCase;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6OrderSubmitUseCase;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6QuoteExecutionUseCase;
import com.okinc.business.trade.features.home.meme.usecase.transaction.v6.MemeV6TradeStateUseCase;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC28352kYf;
import o.C19700gMb;
import o.C19756gOd;
import o.C23212htv;
import o.C28163kRf;
import o.C28293kWa;
import o.C28295kWc;
import o.C28296kWd;
import o.C28297kWe;
import o.C28300kWh;
import o.C28310kWr;
import o.C6968aZQ;
import o.C6977aZZ;
import o.InterfaceC28298kWf;
import o.InterfaceC28302kWj;
import o.InterfaceC28303kWk;
import o.InterfaceC28305kWm;
import o.InterfaceC28306kWn;
import o.kKG;
import o.kTW;
import o.kUU;
import o.kVV;
import o.kVZ;
import o.kWB;
import o.kWE;
import o.kWG;
import o.kWO;
import o.kWQ;
import o.kWR;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeMarketBuyV6ViewModel extends AbstractC28352kYf {
    public final C6968aZQ AuCTel;
    public final MemeV6ApproveExecutionUseCase AuCTelauCTel;
    public final C28300kWh AubY;
    public final MemeV6QuoteExecutionUseCase AwvSrB;
    public final MemeV6OrderSubmitUseCase AxsJAY;
    public final C28297kWe DTwDnp;
    public final C28293kWa ORxRYg;
    public final C28296kWd OcIXYQ;
    public final C28310kWr QKVWgx;
    public final kWO QOLQEE;
    public final kKG QUSxYX;
    public final C19700gMb QVAiDq;
    public final TransactionType QbewEr;
    public final C23212htv QfsBiF;
    public UnitType RJOkX;
    public final kWB ejfBZ;
    public final kWG fARcdN;
    public final C28163kRf fIwbmz;
    public final kTW fJNWhG;
    public final MemeV6TradeStateUseCase gHZMYf;
    public final kVV getFieldNames;
    public final C6977aZZ getNewProxyInstance;
    public final C28295kWc hDKMBd;
    public final kUU iwGUEr;
    public final kWE sSMYrx;
    public final kVZ uzCIH;
    public final C19756gOd wlaJM;
    public final MemeV6DeFiPlatformUseCase zLjUOn;
    public final MemeV6FeeCalculationUseCase zsXlph;
    public final kWR zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28336kXq
    public kUU AkhnZx() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28336kXq
    public TransactionType DTwDnp() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28336kXq
    public void OLrzqt(@NotNull UnitType unitType) {
        Intrinsics.checkNotNullParameter(unitType, "");
        this.RJOkX = unitType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28336kXq
    public UnitType OcIXYQ() {
        return this.RJOkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28336kXq
    public kKG QVAiDq() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28352kYf
    public C28163kRf RJOkX() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28352kYf
    public C19756gOd RcXXUw() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28352kYf
    public C28300kWh UeEOUB() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.kYf.aKErDB()Lo/hoH; */
    public kWB aKErDB() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28336kXq
    public C6968aZQ djBIcL() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28352kYf
    public kTW djSkpj() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28352kYf
    public MemeV6ApproveExecutionUseCase dvKsVJ() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28352kYf
    public MemeV6FeeCalculationUseCase dxcTrN() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28336kXq
    public C28293kWa ejfBZ() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28352kYf
    public MemeV6DeFiPlatformUseCase fFgQHt() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28336kXq
    public kVZ fJNWhG() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28352kYf
    public MemeV6QuoteExecutionUseCase fZBcTu() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28336kXq
    public kVV fetchVPNInfo() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28352kYf
    public MemeV6OrderSubmitUseCase finit() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28352kYf
    public kWE flVtFt() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28352kYf
    public C19700gMb fvQaOB() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28352kYf
    public MemeV6TradeStateUseCase gGvvIC() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28352kYf
    public C23212htv giSNqX() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28336kXq
    public C28297kWe uzCIH() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28336kXq
    public C28295kWc values() {
        return this.hDKMBd;
    }

    @yCM
    public MemeMarketBuyV6ViewModel(@NotNull C28300kWh c28300kWh, @NotNull kKG kkg, @NotNull kWO kwo, @NotNull kWR kwr, @NotNull MemeV6QuoteExecutionUseCase memeV6QuoteExecutionUseCase, @NotNull MemeV6TradeStateUseCase memeV6TradeStateUseCase, @NotNull MemeV6ApproveExecutionUseCase memeV6ApproveExecutionUseCase, @NotNull MemeV6OrderSubmitUseCase memeV6OrderSubmitUseCase, @NotNull MemeV6DeFiPlatformUseCase memeV6DeFiPlatformUseCase, @NotNull C28310kWr c28310kWr, @NotNull C28297kWe c28297kWe, @NotNull kUU kuu, @NotNull kVZ kvz, @NotNull C28296kWd c28296kWd, @NotNull C28293kWa c28293kWa, @NotNull kWB kwb, @NotNull kWG kwg, @NotNull C28295kWc c28295kWc, @NotNull C6977aZZ c6977aZZ, @NotNull C6968aZQ c6968aZQ, @NotNull C28163kRf c28163kRf, @NotNull C23212htv c23212htv, @NotNull C19700gMb c19700gMb, @NotNull kVV kvv, @NotNull C19756gOd c19756gOd, @NotNull MemeV6FeeCalculationUseCase memeV6FeeCalculationUseCase, @NotNull kWE kwe, @NotNull kTW ktw) {
        Intrinsics.checkNotNullParameter(c28300kWh, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(kwo, "");
        Intrinsics.checkNotNullParameter(kwr, "");
        Intrinsics.checkNotNullParameter(memeV6QuoteExecutionUseCase, "");
        Intrinsics.checkNotNullParameter(memeV6TradeStateUseCase, "");
        Intrinsics.checkNotNullParameter(memeV6ApproveExecutionUseCase, "");
        Intrinsics.checkNotNullParameter(memeV6OrderSubmitUseCase, "");
        Intrinsics.checkNotNullParameter(memeV6DeFiPlatformUseCase, "");
        Intrinsics.checkNotNullParameter(c28310kWr, "");
        Intrinsics.checkNotNullParameter(c28297kWe, "");
        Intrinsics.checkNotNullParameter(kuu, "");
        Intrinsics.checkNotNullParameter(kvz, "");
        Intrinsics.checkNotNullParameter(c28296kWd, "");
        Intrinsics.checkNotNullParameter(c28293kWa, "");
        Intrinsics.checkNotNullParameter(kwb, "");
        Intrinsics.checkNotNullParameter(kwg, "");
        Intrinsics.checkNotNullParameter(c28295kWc, "");
        Intrinsics.checkNotNullParameter(c6977aZZ, "");
        Intrinsics.checkNotNullParameter(c6968aZQ, "");
        Intrinsics.checkNotNullParameter(c28163kRf, "");
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(kvv, "");
        Intrinsics.checkNotNullParameter(c19756gOd, "");
        Intrinsics.checkNotNullParameter(memeV6FeeCalculationUseCase, "");
        Intrinsics.checkNotNullParameter(kwe, "");
        Intrinsics.checkNotNullParameter(ktw, "");
        this.AubY = c28300kWh;
        this.QUSxYX = kkg;
        this.QOLQEE = kwo;
        this.zuBGHE = kwr;
        this.AwvSrB = memeV6QuoteExecutionUseCase;
        this.gHZMYf = memeV6TradeStateUseCase;
        this.AuCTelauCTel = memeV6ApproveExecutionUseCase;
        this.AxsJAY = memeV6OrderSubmitUseCase;
        this.zLjUOn = memeV6DeFiPlatformUseCase;
        this.QKVWgx = c28310kWr;
        this.DTwDnp = c28297kWe;
        this.iwGUEr = kuu;
        this.uzCIH = kvz;
        this.OcIXYQ = c28296kWd;
        this.ORxRYg = c28293kWa;
        this.ejfBZ = kwb;
        this.fARcdN = kwg;
        this.hDKMBd = c28295kWc;
        this.getNewProxyInstance = c6977aZZ;
        this.AuCTel = c6968aZQ;
        this.fIwbmz = c28163kRf;
        this.QfsBiF = c23212htv;
        this.QVAiDq = c19700gMb;
        this.getFieldNames = kvv;
        this.wlaJM = c19756gOd;
        this.zsXlph = memeV6FeeCalculationUseCase;
        this.sSMYrx = kwe;
        this.fJNWhG = ktw;
        this.QbewEr = TransactionType.Buy;
        this.RJOkX = UnitType.UnitTypeToken;
    }

    @Override // o.AbstractC28352kYf
    public LiveData<Boolean> dNCPSb() {
        return fdOvFl();
    }

    @Override // o.AbstractC28336kXq
    public InterfaceC28305kWm getNewProxyInstance() {
        return uzCIH();
    }

    @Override // o.AbstractC28336kXq
    public InterfaceC28306kWn AuCTelauCTel() {
        return valueOf();
    }

    @Override // o.AbstractC28336kXq
    public InterfaceC28303kWk AxsJAY() {
        return valueOf();
    }

    @Override // o.AbstractC28352kYf
    public void gasjUx() {
        aKErDB().KWHzl();
    }

    @Override // o.AbstractC28352kYf
    public void hUfVAv() {
        aKErDB().copydefault();
    }

    @Override // o.AbstractC28336kXq
    public InterfaceC28298kWf iwGUEr() {
        return valueOf();
    }

    @Override // o.AbstractC28336kXq
    public InterfaceC28302kWj hDKMBd() {
        return valueOf();
    }

    @Override // o.AbstractC28336kXq
    public kWQ fARcdN() {
        return new kWQ(QVAiDq());
    }
}
