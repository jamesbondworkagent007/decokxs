package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.okinc.tradeapi.bean.BotGridOrderDialogData;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public final class vPY extends ViewModel {
    public final C56111xwe<java.lang.String> gEmmrt = new C56111xwe<>();
    public final C56111xwe<SmartRecommendResp> OLrzqt = new C56111xwe<>();
    public final C56111xwe<BotGridOrderDialogData> AEQbTJ = new C56111xwe<>();
    public final MutableLiveData<BotGridOrderDialogData> AhwBna = new MutableLiveData<>();
    public final MutableLiveData<java.util.Map<java.lang.String, SmartRecommendResp>> djBIcL = new MutableLiveData<>();
    public final MutableLiveData<java.lang.Boolean> KWHzl = new MutableLiveData<>();
    public final MutableLiveData<BotGridOrderDialogData> copydefault = new MutableLiveData<>();
    public final java.lang.String EZpvd = C33129mqd.gEmmrt(UUID.randomUUID());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.Map<java.lang.String, SmartRecommendResp>> AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<BotGridOrderDialogData> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<BotGridOrderDialogData> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<SmartRecommendResp> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<java.lang.String> djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<BotGridOrderDialogData> gEmmrt() {
        return this.AhwBna;
    }
}
