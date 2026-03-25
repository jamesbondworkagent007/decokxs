package com.okinc.buysell.ui.bsc.fragment.buy;

import android.content.Context;
import androidx.camera.video.AudioStats;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.okinc.buysell.data.BannerFlowType;
import com.okinc.buysell.data.BannerPageNames;
import com.okinc.buysell.data.NotificationConfig;
import com.okinc.buysell.ui.bsc.BaseBuySellViewModel;
import com.okinc.buysell.ui.bsc.InputBaseViewModel;
import com.okinc.buysell.ui.bsc.util.InputType;
import com.okinc.buysell.ui.bsc.util.NotificationWorker;
import com.okinc.core.util.SPUtils;
import com.okinc.crcore.shared.net.responsebean.bsc.CampaignBean;
import com.okinc.okex.lite_market_api.bean.FairPriceTickerData;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okuser.data.User;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C30327lUg;
import o.C31354lsT;
import o.C31657lze;
import o.C31659lzg;
import o.C32989mnw;
import o.C33129mqd;
import o.C48787ucK;
import o.C56390yDp;
import o.C56424yEw;
import o.InterfaceC31764mDa;
import o.InterfaceC47278tmy;
import o.lyI;
import o.lyM;
import o.lyN;
import o.lyR;
import o.lyT;
import o.lyX;
import o.mHA;
import o.mHQ;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class BuyViewModel extends BaseBuySellViewModel {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int RlQdEF = 8;
    public final MutableLiveData<C32989mnw<CampaignBean>> AxsJAYsNCnLh;
    public final MutableStateFlow<String> DAIeex;
    public final MutableStateFlow<String> DCJXGO;
    public final MutableStateFlow<String> DCUTEI;
    public final StateFlow<String> DLWbHP;
    public final MutableStateFlow<String> DXXBbs;
    public final MutableStateFlow<Boolean> DarRvM;
    public final StateFlow<Map<String, FairPriceTickerData>> OBJEWx;
    public final MutableStateFlow<String> ODWQjV;
    public final StateFlow<String> ODXsMY;
    public Job OFhtUX;
    public final StateFlow<String> OHqIaq;
    public final StateFlow<String> OJuSTm;
    public final MutableStateFlow<String> OqFWZa;
    public final MutableStateFlow<Boolean> OuxcSI;
    public final StateFlow<String> OxVOHk;
    public final InterfaceC47278tmy QCjLjM;
    public final StateFlow<Boolean> QHmsKR;
    public final StateFlow<String> QSBOWP;
    public final lyN QkdxfA;
    public BannerFlowType RKDWNf;
    public final StateFlow<String> RdAHlO;
    public final MutableStateFlow<Map<String, FairPriceTickerData>> accept;
    public final StateFlow<String> dHguZz;
    public final StateFlow<String> dmfpNf;
    public final MutableStateFlow<String> ffGIBT;
    public final MutableStateFlow<String> getPostValueLengthLimit;
    public boolean gwTjWJ;
    public String hBpjJd;
    public final StateFlow<Boolean> hrNTAI;
    public final MutableStateFlow<String> zuWLRA;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(boolean z) {
        this.gwTjWJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<CampaignBean>> DCJXGO() {
        return this.AxsJAYsNCnLh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> DCUTEI() {
        return this.dmfpNf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzT
    public String KWHzl() {
        return this.hBpjJd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> OBJEWx() {
        return this.ODXsMY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> ODWQjV() {
        return this.QSBOWP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> OuxcSI() {
        return this.OHqIaq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> QHmsKR() {
        return this.OJuSTm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> QSBOWP() {
        return this.hrNTAI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> RKDWNf() {
        return this.DLWbHP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzT
    public BannerFlowType copydefault() {
        return this.RKDWNf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> dHguZz() {
        return this.OxVOHk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> ffGIBT() {
        return this.RdAHlO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> zuWLRA() {
        return this.dHguZz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public BuyViewModel(@NotNull C31659lzg c31659lzg, @NotNull C31657lze c31657lze, @NotNull lyX lyx, @NotNull lyT lyt, @NotNull lyI lyi, @NotNull lyM lym, @NotNull InterfaceC31764mDa interfaceC31764mDa, @NotNull lyR lyr, @NotNull lyN lyn, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        super(c31659lzg, c31657lze, lyx, lyt, lyi, interfaceC31764mDa, lym, lyr, interfaceC47278tmy);
        Intrinsics.checkNotNullParameter(c31659lzg, "");
        Intrinsics.checkNotNullParameter(c31657lze, "");
        Intrinsics.checkNotNullParameter(lyx, "");
        Intrinsics.checkNotNullParameter(lyt, "");
        Intrinsics.checkNotNullParameter(lyi, "");
        Intrinsics.checkNotNullParameter(lym, "");
        Intrinsics.checkNotNullParameter(interfaceC31764mDa, "");
        Intrinsics.checkNotNullParameter(lyr, "");
        Intrinsics.checkNotNullParameter(lyn, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.QkdxfA = lyn;
        this.QCjLjM = interfaceC47278tmy;
        this.hBpjJd = BannerPageNames.BSC.getPageName();
        this.RKDWNf = BannerFlowType.MERGE;
        MutableStateFlow<Map<String, FairPriceTickerData>> MutableStateFlow = StateFlowKt.MutableStateFlow(C56424yEw.KWHzl());
        this.accept = MutableStateFlow;
        this.OBJEWx = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.zuWLRA = MutableStateFlow2;
        this.DLWbHP = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<String> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.getPostValueLengthLimit = MutableStateFlow3;
        this.OxVOHk = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<String> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.ffGIBT = MutableStateFlow4;
        this.ODXsMY = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<String> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.DCUTEI = MutableStateFlow5;
        this.OJuSTm = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<String> MutableStateFlow6 = StateFlowKt.MutableStateFlow(null);
        this.DAIeex = MutableStateFlow6;
        this.QSBOWP = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<String> MutableStateFlow7 = StateFlowKt.MutableStateFlow(null);
        this.DXXBbs = MutableStateFlow7;
        this.dmfpNf = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<String> MutableStateFlow8 = StateFlowKt.MutableStateFlow(null);
        this.DCJXGO = MutableStateFlow8;
        this.dHguZz = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<String> MutableStateFlow9 = StateFlowKt.MutableStateFlow(null);
        this.ODWQjV = MutableStateFlow9;
        this.RdAHlO = FlowKt.asStateFlow(MutableStateFlow9);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow10 = StateFlowKt.MutableStateFlow(bool);
        this.OuxcSI = MutableStateFlow10;
        this.hrNTAI = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow<String> MutableStateFlow11 = StateFlowKt.MutableStateFlow(null);
        this.OqFWZa = MutableStateFlow11;
        this.OHqIaq = FlowKt.asStateFlow(MutableStateFlow11);
        MutableStateFlow<Boolean> MutableStateFlow12 = StateFlowKt.MutableStateFlow(bool);
        this.DarRvM = MutableStateFlow12;
        this.QHmsKR = FlowKt.asStateFlow(MutableStateFlow12);
        this.AxsJAYsNCnLh = new MutableLiveData<>();
    }

    public final void valueOf(boolean z) {
        this.DarRvM.setValue(Boolean.valueOf(z));
    }

    public final void isConnected(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OqFWZa.setValue(str);
    }

    public final void fetchVPNInfo(boolean z) {
        this.OuxcSI.setValue(Boolean.valueOf(z));
    }

    public final void DbNXlk(String str) {
        this.zuWLRA.setValue(str);
    }

    public final void values(String str) {
        this.ffGIBT.setValue(str);
    }

    public final void AkhnZx(String str) {
        this.getPostValueLengthLimit.setValue(str);
    }

    public final void fetchVPNInfo(String str) {
        this.DCUTEI.setValue(str);
    }

    public final void OLrzqt(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.DAIeex.setValue(str3);
        this.DXXBbs.setValue(str4);
        this.DCJXGO.setValue(str);
        this.ODWQjV.setValue(str2);
    }

    public final void DarRvM() {
        Job job = this.OFhtUX;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        DarRvM();
    }

    public final void DXXBbs() {
        if (iZzfmt() || !C30327lUg.EZpvd()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BuyViewModel$fetchCampaignInfoIfNeeded$1(this, null), 3, null);
    }

    public final void AhwBna(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (iZzfmt()) {
            return;
        }
        OLrzqt(lyN.Companion.copydefault(zuBGHE(), OcIXYQ(), str, (CampaignBean) mHA.OLrzqt.AEQbTJ(DCJXGO())));
    }

    public final void KWHzl(@NotNull InputBaseViewModel inputBaseViewModel) {
        Pair pairOLrzqt;
        Intrinsics.checkNotNullParameter(inputBaseViewModel, "");
        if (C33129mqd.OLrzqt((CharSequence) zLjUOn())) {
            inputBaseViewModel.OLrzqt(zLjUOn());
            pairOLrzqt = C56390yDp.OLrzqt(InputType.CRYPTO_INPUT, inputBaseViewModel.OLrzqt());
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(InputType.FIAT_INPUT, inputBaseViewModel.uzCIH());
        }
        InputType inputType = (InputType) pairOLrzqt.component1();
        String str = (String) pairOLrzqt.component2();
        inputBaseViewModel.copydefault(inputType);
        inputBaseViewModel.copydefault(C33129mqd.AEQbTJ(str) >= AudioStats.AUDIO_AMPLITUDE_NONE ? C33129mqd.OLrzqt((Object) str) : "0", true);
    }

    @Override // com.okinc.buysell.ui.bsc.BaseBuySellViewModel
    public TradeType flVtFt() {
        return TradeType.BUY;
    }

    public final List<Pair<Double, String>> QkdxfA() {
        return yDY.AhwBna(new Pair(Double.valueOf(0.1d), "10"), new Pair(Double.valueOf(0.25d), "25"), new Pair(Double.valueOf(0.5d), "50"), new Pair(Double.valueOf(1.0d), "All"));
    }

    public final String AEQbTJ(@NotNull InputType inputType, @NotNull String str, double d) {
        Intrinsics.checkNotNullParameter(inputType, "");
        Intrinsics.checkNotNullParameter(str, "");
        String strFetchVPNInfo = fetchVPNInfo();
        if (inputType == InputType.FIAT_INPUT) {
            return C33129mqd.mulS$default(strFetchVPNInfo, Double.valueOf(d), null, null, null, 14, null);
        }
        return C33129mqd.mulS$default(C33129mqd.divS$default(strFetchVPNInfo, str, null, null, null, 14, null), Double.valueOf(d), null, null, null, 14, null);
    }

    public final void OLrzqt(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, long j) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        EZpvd(context);
        Data dataBuild = new Data.Builder().putString("baseCurrency", str).putString("orderType", str2).putString("orderFrequency", str3).build();
        Intrinsics.checkNotNullExpressionValue(dataBuild, "");
        WorkManager.getInstance(context.getApplicationContext()).enqueue(new OneTimeWorkRequest.Builder(NotificationWorker.class).setInputData(dataBuild).addTag("simple_trade").setInitialDelay(j, TimeUnit.MINUTES).build());
    }

    public final void EZpvd(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        WorkManager.getInstance(context.getApplicationContext()).cancelAllWorkByTag("simple_trade");
    }

    public final NotificationConfig getPostValueLengthLimit() {
        NotificationConfig notificationConfig = new NotificationConfig(0L, 1, null);
        NotificationConfig notificationConfig2 = (NotificationConfig) C48787ucK.AEQbTJ.EZpvd("simpleTradeConfig", NotificationConfig.class);
        return notificationConfig2 != null ? notificationConfig2 : notificationConfig;
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C31354lsT.KWHzl.KWHzl(str, str2, str3);
    }

    public final boolean RdAHlO() {
        return !SPUtils.getBoolean(OqFWZa(), false);
    }

    public final void hBpjJd() {
        SPUtils.put(OqFWZa(), Boolean.TRUE);
    }

    public final String OqFWZa() {
        User userOLrzqt = this.QCjLjM.OLrzqt();
        String uid = userOLrzqt != null ? userOLrzqt.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        return "bsc_has_shown_crypto_coachmark" + mHQ.KWHzl.AEQbTJ(uid);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.bsc.fragment.buy.BuyViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
