package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingCreateParams;
import com.okinc.business.dex.trade.copytrading.home.data.CopyTradingHomeParams;
import com.okinc.business.dexlogic.bean.MemeTransactionParams;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedModeParams;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.heE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22374heE {
    public C22828hmi AEQbTJ;
    public final MutableLiveData<CopyTradingCreateParams> AYXKKw;
    public C23193htc AhwBna;
    public C22506hge AkhnZx;
    public C22384heO AuCTel;
    public final MutableLiveData<CopyTradingHomeParams> DbNXlk;
    public C22597hiP EZpvd;
    public C22427hfE KWHzl;
    public C22692hkE OLrzqt;
    public C22431hfI copydefault;
    public final MutableLiveData<AdvancedModeParams> djBIcL;
    public C22535hhG ejfBZ;
    public final C23232huO fIwbmz;
    public final C23230huM fJNWhG;
    public final MutableLiveData<MemeTransactionParams> fetchVPNInfo;
    public C22677hjq gEmmrt;
    public final C23224huG isConnected;
    public C22830hmk valueOf;
    public final C23237huT values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<CopyTradingCreateParams> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC22425hfC AYXKKw() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC22502hga AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC22387heR AkhnZx() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC22693hkF DbNXlk() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<AdvancedModeParams> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC22598hiQ EZpvd(boolean z) {
        return z ? this.gEmmrt : this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<CopyTradingHomeParams> KWHzl() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC22601hiT OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC22824hme OLrzqt(boolean z) {
        return z ? this.valueOf : this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC22598hiQ copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC22598hiQ djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC23194htd fARcdN() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22830hmk fJNWhG() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC22672hjl fetchVPNInfo() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC22432hfJ gEmmrt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC22533hhE isConnected() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC22824hme valueOf() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<MemeTransactionParams> values() {
        return this.fetchVPNInfo;
    }

    public C22374heE(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C23237huT c23237huT = new C23237huT();
        this.values = c23237huT;
        C23230huM c23230huM = new C23230huM();
        this.fJNWhG = c23230huM;
        C23232huO c23232huO = new C23232huO();
        this.fIwbmz = c23232huO;
        C23224huG c23224huG = new C23224huG();
        this.isConnected = c23224huG;
        this.AhwBna = new C23193htc(str);
        this.AEQbTJ = new C22828hmi(str);
        this.valueOf = new C22830hmk();
        this.EZpvd = new C22597hiP(str, c23237huT, c23230huM);
        this.gEmmrt = new C22677hjq(str, c23237huT, c23230huM);
        this.OLrzqt = new C22692hkE(str, c23237huT, null, 4, null);
        this.KWHzl = new C22427hfE(str);
        this.copydefault = new C22431hfI(str, c23237huT);
        this.fetchVPNInfo = new MutableLiveData<>();
        this.djBIcL = new MutableLiveData<>();
        this.DbNXlk = new MutableLiveData<>();
        this.AYXKKw = new MutableLiveData<>();
        this.AuCTel = new C22384heO(c23237huT, c23230huM);
        this.ejfBZ = new C22535hhG(c23237huT, c23230huM, c23232huO);
        this.AkhnZx = new C22506hge(str, c23224huG);
    }
}
