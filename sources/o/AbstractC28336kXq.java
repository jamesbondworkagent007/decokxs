package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.MemeChainType;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.dexlogic.bean.UnitType;
import com.okinc.business.dexlogic.bean.track.TrackOrderType;
import com.okinc.business.dexlogic.bean.track.TrackTransactionDirection;
import com.okinc.business.dexlogic.track.enums.BusinessType;
import com.okinc.business.trade.features.home.meme.viewmodel.BaseMemeStrategyViewModel$updateTokenInfo$1;
import com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset;
import com.okinc.business.trade.features.home.ui.meme.data.SlippageRange;
import com.okinc.business.trade.features.home.ui.meme.statepool.TradeStatePool;
import com.okinc.wallet.api.MpcWalletService;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.kXY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kXq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC28336kXq extends AbstractC33073mpa {
    public boolean AYXKKw;
    public int OLrzqt;
    public Job fetchVPNInfo;
    public C58216yxB valueOf;
    public java.lang.String isConnected = "";
    public java.lang.String copydefault = "";
    public TokenBase AkhnZx = new TokenBase(null, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -1, null);
    public final MutableLiveData<kXY> AEQbTJ = new MutableLiveData<>();
    public int KWHzl = C31172lox.Companion.KWHzl();
    public final TradeStatePool gEmmrt = new TradeStatePool();
    public MpcWalletService.MpcWalletAbleStatus AhwBna = MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusDefault;
    public final MutableLiveData<java.lang.String> EZpvd = new MutableLiveData<>();
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.kXu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC28336kXq.OLrzqt(this.KWHzl);
        }
    });
    public java.lang.String values = "";
    public java.lang.String DbNXlk = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AYXKKw;
    }

    public abstract kUU AkhnZx();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeStatePool AuCTel() {
        return this.gEmmrt;
    }

    public abstract InterfaceC28306kWn AuCTelauCTel();

    public abstract InterfaceC28303kWk AxsJAY();

    public abstract TransactionType DTwDnp();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus) {
        Intrinsics.checkNotNullParameter(mpcWalletAbleStatus, "");
        this.AhwBna = mpcWalletAbleStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<kXY> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.KWHzl = i;
    }

    public abstract void OLrzqt(@NotNull UnitType unitType);

    public abstract UnitType OcIXYQ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenBase QKVWgx() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String QOLQEE() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int QUSxYX() {
        return this.KWHzl;
    }

    public abstract kKG QVAiDq();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> QfsBiF() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isConnected = str;
    }

    public abstract C6968aZQ djBIcL();

    public abstract C28293kWa ejfBZ();

    public abstract kWQ fARcdN();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpcWalletService.MpcWalletAbleStatus fIwbmz() {
        return this.AhwBna;
    }

    public abstract kVZ fJNWhG();

    public abstract kVV fetchVPNInfo();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values = str;
    }

    public abstract java.lang.String gHZMYf();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getFieldNames() {
        return this.values;
    }

    public abstract InterfaceC28305kWm getNewProxyInstance();

    public abstract InterfaceC28302kWj hDKMBd();

    public abstract InterfaceC28298kWf iwGUEr();

    public abstract C28297kWe uzCIH();

    public abstract C28295kWc values();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zLjUOn() {
        return this.DbNXlk;
    }

    public final java.lang.String AEQbTJ() {
        kXY value = this.AEQbTJ.getValue();
        kXY.ActionBar actionBar = value instanceof kXY.ActionBar ? (kXY.ActionBar) value : null;
        if (actionBar != null) {
            return actionBar.KWHzl();
        }
        return null;
    }

    public final java.lang.String zsXlph() {
        if (OcIXYQ() != UnitType.UnitTypePercent) {
            return this.copydefault;
        }
        java.lang.String str = this.copydefault;
        java.lang.String strAEQbTJ = AEQbTJ();
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        return C23311hvo.OLrzqt(C23313hvq.mulCheckS$default(str, strAEQbTJ, null, null, null, 14, null), C33129mqd.gEmmrt(java.lang.Integer.valueOf(this.AkhnZx.getDecimals())));
    }

    public final void djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String chainId = this.AkhnZx.getChainId();
        values().copydefault(chainId, QVAiDq().copydefault(chainId), str);
    }

    public void QbewEr() {
        C58216yxB c58216yxB = this.valueOf;
        if (c58216yxB != null) {
            c58216yxB.dispose();
        }
        this.valueOf = null;
    }

    public final void copydefault() {
        fARcdN().AEQbTJ(this.isConnected, this.AkhnZx.getChainId(), this.AhwBna, this.gEmmrt);
    }

    public final void copydefault(int i) {
        AkhnZx().copydefault(i);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            this.copydefault = "";
        } else {
            if (!z) {
                this.copydefault = str;
                return;
            }
            if (OcIXYQ() == UnitType.UnitTypePercent) {
                str = C23313hvq.divCheckS$default(str, 100, null, null, null, 14, null);
            }
            this.copydefault = str;
        }
    }

    public final void OLrzqt(@NotNull TokenBase tokenBase) {
        Intrinsics.checkNotNullParameter(tokenBase, "");
        this.AkhnZx = tokenBase;
        Job job = this.fetchVPNInfo;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.fetchVPNInfo = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseMemeStrategyViewModel$updateTokenInfo$1(this, null), 3, null);
    }

    public final kVP DbNXlk() {
        return AkhnZx().EZpvd();
    }

    public final C30923lkM valueOf() {
        return (C30923lkM) this.djBIcL.getValue();
    }

    public static final C30923lkM OLrzqt(AbstractC28336kXq abstractC28336kXq) {
        return new C30923lkM(abstractC28336kXq.uzCIH());
    }

    public final java.lang.String zuBGHE() {
        SlippageRange slippageRangeAEQbTJ = AxsJAY().AEQbTJ(this.AkhnZx.getChainId(), this.values, DTwDnp().getType());
        java.lang.String slippageValue = slippageRangeAEQbTJ != null ? slippageRangeAEQbTJ.getSlippageValue() : null;
        return slippageValue == null ? "" : slippageValue;
    }

    public final java.lang.String gEmmrt() {
        return AuCTelauCTel().copydefault(this.AkhnZx.getChainId(), this.values, DTwDnp().getType(), gHZMYf()).getFeeValue();
    }

    public final int AubY() {
        return AuCTelauCTel().copydefault(this.AkhnZx.getChainId(), this.values, DTwDnp().getType(), gHZMYf()).getFeeLevel();
    }

    public final int sSMYrx() {
        SlippageRange slippageRangeAEQbTJ = AxsJAY().AEQbTJ(this.AkhnZx.getChainId(), this.values, DTwDnp().getType());
        if (slippageRangeAEQbTJ != null) {
            return slippageRangeAEQbTJ.getSlippageLevel();
        }
        return 0;
    }

    public final java.lang.Integer AwvSrB() {
        SlippageConfigPreset slippageConfigPresetEZpvd = AxsJAY().EZpvd(this.AkhnZx.getChainId(), this.values, DTwDnp().getType());
        if (slippageConfigPresetEZpvd != null) {
            return java.lang.Integer.valueOf(slippageConfigPresetEZpvd.getSlippageType());
        }
        return null;
    }

    public final java.lang.String wlaJM() {
        return hDKMBd().copydefault(this.AkhnZx.getChainId(), this.values, DTwDnp().getType());
    }

    public final boolean ORxRYg() {
        return hDKMBd().EZpvd(this.AkhnZx.getChainId());
    }

    public final java.lang.String AYXKKw() {
        SlippageConfigPreset slippageConfigPresetEZpvd = AxsJAY().EZpvd(this.AkhnZx.getChainId(), this.values, DTwDnp().getType());
        if (slippageConfigPresetEZpvd != null) {
            return slippageConfigPresetEZpvd.getDynamicMaxSlippageValue();
        }
        return null;
    }

    public final java.lang.String isConnected() {
        return MemeChainType.Companion.EZpvd(java.lang.String.valueOf(iwGUEr().copydefault(this.AkhnZx.getChainId()))).getValue();
    }

    public final java.lang.String KWHzl(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i2) {
        java.util.List<java.lang.String> listOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (i == TransactionType.Buy.getType()) {
            java.util.List<java.lang.String> listKWHzl = ejfBZ().KWHzl(str, str2);
            listOLrzqt = listKWHzl.isEmpty() ^ true ? listKWHzl : null;
            if (listOLrzqt == null) {
                listOLrzqt = C28286kVu.Companion.copydefault();
            }
        } else {
            java.util.List<java.lang.String> listKWHzl2 = ejfBZ().KWHzl(str);
            listOLrzqt = listKWHzl2.isEmpty() ^ true ? listKWHzl2 : null;
            if (listOLrzqt == null) {
                listOLrzqt = C28286kVu.Companion.OLrzqt();
            }
        }
        if (i2 == 3) {
            return KWHzl(str2);
        }
        return (i2 < 0 || i2 > listOLrzqt.size()) ? "" : listOLrzqt.get(i2);
    }

    public final java.util.List<java.lang.String> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return ejfBZ().KWHzl(str, str2);
    }

    public final java.util.List<java.lang.String> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return ejfBZ().KWHzl(str);
    }

    public final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9738bbJ interfaceC9738bbJValueOf = QVAiDq().valueOf();
        return (interfaceC9738bbJValueOf == null || interfaceC9738bbJValueOf.QfsBiF() || interfaceC9738bbJValueOf.zsXlph() || !QVAiDq().copydefault(QVAiDq().valueOf(), str)) ? false : true;
    }

    public static /* synthetic */ void trackDexTradeHomeFullPageClick$default(AbstractC28336kXq abstractC28336kXq, java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.String str3, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackDexTradeHomeFullPageClick");
        }
        if ((i & 2) != 0) {
            str2 = BusinessType.MEME.getValue();
        }
        if ((i & 8) != 0) {
            str3 = TrackOrderType.SWAP.getType();
        }
        abstractC28336kXq.AEQbTJ(str, str2, map, str3);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str3, "");
        djBIcL().AEQbTJ(this.AkhnZx.getChainId(), DTwDnp() == TransactionType.Buy ? TrackTransactionDirection.BUY.getValue() : TrackTransactionDirection.SELL.getValue(), str3, str, str2, map);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.kXq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackDexTradeHomeFullPageView$default(AbstractC28336kXq abstractC28336kXq, java.lang.String str, TransactionType transactionType, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackDexTradeHomeFullPageView");
        }
        if ((i & 2) != 0) {
            transactionType = TransactionType.Buy;
        }
        TransactionType transactionType2 = transactionType;
        if ((i & 8) != 0) {
            str3 = BusinessType.MEME.getValue();
        }
        java.lang.String str5 = str3;
        if ((i & 16) != 0) {
            str4 = TrackOrderType.SWAP.getType();
        }
        java.lang.String str6 = str4;
        if ((i & 32) != 0) {
            map = null;
        }
        abstractC28336kXq.EZpvd(str, transactionType2, str2, str5, str6, map);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull TransactionType transactionType, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        djBIcL().KWHzl(str, str2, transactionType == TransactionType.Buy ? TrackTransactionDirection.BUY.getValue() : TrackTransactionDirection.SELL.getValue(), str4, str3, map);
    }

    public final int AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return ejfBZ().copydefault(str, str2);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ejfBZ().KWHzl(str, str2, i);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return ejfBZ().EZpvd(str);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ejfBZ().EZpvd(str, str2);
    }

    public final DexMultiTokenInfoBean copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AkhnZx().copydefault(this.KWHzl);
        return DbNXlk().OLrzqt(str, str2);
    }

    public final DefiChainInfo OLrzqt(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = fetchVPNInfo().EZpvd().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((DefiChainInfo) next).getChainId(), (java.lang.Object) str)) {
                break;
            }
        }
        return (DefiChainInfo) next;
    }

    public final java.lang.String EZpvd() {
        return this.AkhnZx.getChainId();
    }
}
