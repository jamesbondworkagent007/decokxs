package com.okinc.buysell.ui.bsc.convert;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.buysell.data.BannerFlowType;
import com.okinc.buysell.data.BannerPageNames;
import com.okinc.buysell.data.ConvertChipAmount;
import com.okinc.buysell.domain.BothTokenSwitchedUseCase;
import com.okinc.buysell.ui.bsc.convert.ConvertViewModel;
import com.okinc.buysell.ui.bsc.fragment.master.BSCMasterViewModel;
import com.okinc.buysell.ui.bsc.util.InputType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.crcore.coreapi.net.responsebean.EarnOption;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency;
import com.okinc.okpaymentapi.data.remote.model.management.OrderType;
import com.okinc.okx.paymentapi.presentation.BSCLevel;
import com.okinc.okx.paymentapi.service.BuySellConvertParameters;
import com.okinc.okx.paymentapi.service.ProConvertEntranceParameters;
import com.okinc.okx.paymentapi.service.TargetTab;
import com.okinc.okx.paymentapi.service.VerificationStatus;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C31351lsQ;
import o.C31354lsT;
import o.C31389ltB;
import o.C31661lzi;
import o.C31663lzk;
import o.C31785mDv;
import o.C32866mlf;
import o.C32868mlh;
import o.C32989mnw;
import o.C33129mqd;
import o.C43251rlk;
import o.InterfaceC46553tYp;
import o.InterfaceC54581xNr;
import o.lyC;
import o.lyH;
import o.lyK;
import o.lyM;
import o.lyP;
import o.lyU;
import o.lzT;
import o.mHA;
import o.pWO;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class ConvertViewModel extends lzT {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final MutableStateFlow<String> AYXKKw;
    public final MutableStateFlow<String> AhwBna;
    public MutableLiveData<C32989mnw<Pair<String, ConvertCurrencyBean>>> AkhnZx;
    public MutableLiveData<C32989mnw<Object>> AuCTel;
    public final MutableLiveData<C32989mnw<Boolean>> AuCTelauCTel;
    public MutableLiveData<C32989mnw<Boolean>> AubY;
    public MutableLiveData<C32989mnw<String>> AwvSrB;
    public final MutableStateFlow<String> AxsJAY;
    public final StateFlow<String> AxsJAYaxsJAY;
    public final MutableStateFlow<String> DTwDnp;
    public MutableLiveData<C32989mnw<C31389ltB>> DbNXlk;
    public final BothTokenSwitchedUseCase ORxRYg;
    public final MutableStateFlow<String> OcIXYQ;
    public List<ConvertCurrencyBean> QKVWgx;
    public final C31663lzk QKudOq;
    public MutableLiveData<C32989mnw<String>> QOLQEE;
    public ConvertCurrencyBean QUSxYX;
    public BannerFlowType QVAiDq;
    public InputType QbewEr;
    public List<ConvertCurrencyBean> QfsBiF;
    public ConvertCurrencyBean RJOkX;
    public final StateFlow<String> RcXXUw;
    public String UeEOUB;
    public final StateFlow<String> aKErDB;
    public final StateFlow<String> dNCPSb;
    public MutableLiveData<C32989mnw<String>> djBIcL;
    public final StateFlow<String> djSkpj;
    public final lyM dvKsVJ;
    public final lyU dxcTrN;
    public MutableLiveData<C32989mnw<TaskDescription>> ejfBZ;
    public final MutableStateFlow<Boolean> fARcdN;
    public final lyP fFgQHt;
    public MutableLiveData<C32989mnw<Boolean>> fIwbmz;
    public MutableLiveData<C32989mnw<Boolean>> fJNWhG;
    public final lyH fZBcTu;
    public MutableLiveData<C32989mnw<Unit>> fetchVPNInfo;
    public final InterfaceC46553tYp finit;
    public boolean flVtFt;
    public boolean fvQaOB;
    public final MutableStateFlow<String> gEmmrt;
    public boolean gGvvIC;
    public final MutableStateFlow<String> gHZMYf;
    public boolean gasjUx;
    public MutableLiveData<C32989mnw<Pair<ConvertCurrencyBean, ConvertCurrencyBean>>> getFieldNames;
    public MutableLiveData<C32989mnw<Pair<ConvertCurrencyBean, ConvertCurrencyBean>>> getNewProxyInstance;
    public final StateFlow<Boolean> giSNqX;
    public final StateFlow<String> gkJEwt;
    public MutableLiveData<C32989mnw<Unit>> hDKMBd;
    public final StateFlow<String> hUfVAv;
    public final StateFlow<String> iRxXKY;
    public String iZzfmt;
    public MutableLiveData<C32989mnw<Pair<ConvertCurrencyBean, ConvertCurrencyBean>>> isConnected;
    public MutableLiveData<C32989mnw<ConvertCurrencyBean>> iwGUEr;
    public MutableLiveData<C32989mnw<String>> sSMYrx;
    public MutableLiveData<C32989mnw<Pair<ConvertCurrencyBean, ConvertCurrencyBean>>> uzCIH;
    public final MutableStateFlow<String> valueOf;
    public MutableLiveData<C32989mnw<InputType>> values;
    public MutableLiveData<C32989mnw<Boolean>> wlaJM;
    public final MutableLiveData<C32989mnw<Boolean>> zLjUOn;
    public final MutableLiveData<C32989mnw<CurrencyToken>> zsXlph;
    public MutableLiveData<C32989mnw<Boolean>> zuBGHE;

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ConvertChipAmount.values().length];
            try {
                iArr[ConvertChipAmount.TWENTY_FIVE_PERCENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConvertChipAmount.FIFTY_PERCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConvertChipAmount.SEVENTY_FIVE_PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConvertChipAmount.ALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ConvertChipAmount.CONVERT_ALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ConvertChipAmount.CONVERT_MAX.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ConvertChipAmount.ADD_MORE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ConvertChipAmount.TRANSFER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[InputType.values().length];
            try {
                iArr2[InputType.CRYPTO_INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[InputType.FIAT_INPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            EZpvd = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull List<ConvertCurrencyBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.QKVWgx = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.gGvvIC = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BothTokenSwitchedUseCase AkhnZx() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> AuCTel() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<String>> AuCTelauCTel() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<Pair<ConvertCurrencyBean, ConvertCurrencyBean>>> AubY() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<InputType>> AwvSrB() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<Pair<String, ConvertCurrencyBean>>> AxsJAY() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<Pair<ConvertCurrencyBean, ConvertCurrencyBean>>> DTwDnp() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzT
    public String KWHzl() {
        return this.iZzfmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull ConvertCurrencyBean convertCurrencyBean) {
        Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
        this.RJOkX = convertCurrencyBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.gasjUx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull ConvertCurrencyBean convertCurrencyBean) {
        Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
        this.QUSxYX = convertCurrencyBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.UeEOUB = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.fvQaOB = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<ConvertCurrencyBean>> ORxRYg() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<Pair<ConvertCurrencyBean, ConvertCurrencyBean>>> OcIXYQ() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> QKVWgx() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<CurrencyToken>> QOLQEE() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<Boolean>> QUSxYX() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> QVAiDq() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> QbewEr() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<Boolean>> QfsBiF() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<Boolean>> RJOkX() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> RcXXUw() {
        return this.hUfVAv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<String>> UeEOUB() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> aKErDB() {
        return this.iRxXKY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzT
    public BannerFlowType copydefault() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull InputType inputType) {
        Intrinsics.checkNotNullParameter(inputType, "");
        this.QbewEr = inputType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull List<ConvertCurrencyBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.QfsBiF = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<String>> dNCPSb() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> djSkpj() {
        return this.AxsJAYaxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31663lzk dvKsVJ() {
        return this.QKudOq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> dxcTrN() {
        return this.gkJEwt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertCurrencyBean ejfBZ() {
        return this.RJOkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputType fARcdN() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<String>> fFgQHt() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fJNWhG() {
        return this.UeEOUB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertCurrencyBean fetchVPNInfo() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean finit() {
        return this.gGvvIC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean flVtFt() {
        return this.gasjUx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<Boolean>> gGvvIC() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<Pair<ConvertCurrencyBean, ConvertCurrencyBean>>> gHZMYf() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final lyU getFieldNames() {
        return this.dxcTrN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final lyH getNewProxyInstance() {
        return this.fZBcTu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean giSNqX() {
        return this.fvQaOB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> hDKMBd() {
        return this.RcXXUw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ConvertCurrencyBean> isConnected() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> iwGUEr() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<TaskDescription>> sSMYrx() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> uzCIH() {
        return this.aKErDB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ConvertCurrencyBean> values() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<Unit>> wlaJM() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final lyP zLjUOn() {
        return this.fFgQHt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<C31389ltB>> zsXlph() {
        return this.DbNXlk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public ConvertViewModel(@NotNull lyU lyu, @NotNull lyP lyp, @NotNull C31663lzk c31663lzk, @NotNull lyH lyh, @NotNull BothTokenSwitchedUseCase bothTokenSwitchedUseCase, @NotNull lyM lym) {
        super(lym);
        Intrinsics.checkNotNullParameter(lyu, "");
        Intrinsics.checkNotNullParameter(lyp, "");
        Intrinsics.checkNotNullParameter(c31663lzk, "");
        Intrinsics.checkNotNullParameter(lyh, "");
        Intrinsics.checkNotNullParameter(bothTokenSwitchedUseCase, "");
        Intrinsics.checkNotNullParameter(lym, "");
        this.dxcTrN = lyu;
        this.fFgQHt = lyp;
        this.QKudOq = c31663lzk;
        this.fZBcTu = lyh;
        this.ORxRYg = bothTokenSwitchedUseCase;
        this.dvKsVJ = lym;
        this.finit = (InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class);
        this.isConnected = new MutableLiveData<>();
        this.DbNXlk = new MutableLiveData<>();
        this.AwvSrB = new MutableLiveData<>();
        this.getNewProxyInstance = new MutableLiveData<>();
        this.uzCIH = new MutableLiveData<>();
        this.getFieldNames = new MutableLiveData<>();
        this.fJNWhG = new MutableLiveData<>();
        this.fIwbmz = new MutableLiveData<>();
        this.AuCTel = new MutableLiveData<>();
        this.ejfBZ = new MutableLiveData<>();
        this.AkhnZx = new MutableLiveData<>();
        this.djBIcL = new MutableLiveData<>();
        this.fetchVPNInfo = new MutableLiveData<>();
        this.zLjUOn = new MutableLiveData<>();
        this.AuCTelauCTel = new MutableLiveData<>();
        this.zsXlph = new MutableLiveData<>();
        this.zuBGHE = new MutableLiveData<>();
        this.AubY = new MutableLiveData<>();
        this.wlaJM = new MutableLiveData<>();
        this.iwGUEr = new MutableLiveData<>();
        this.sSMYrx = new MutableLiveData<>();
        this.values = new MutableLiveData<>();
        this.QOLQEE = new MutableLiveData<>();
        this.hDKMBd = new MutableLiveData<>();
        this.iZzfmt = BannerPageNames.CONVERT.getPageName();
        this.QVAiDq = BannerFlowType.MERGE;
        lyK lyk = lyK.copydefault;
        this.QUSxYX = lyk.OLrzqt().getFirst();
        this.RJOkX = lyk.OLrzqt().getSecond();
        this.QfsBiF = yDY.AhwBna();
        this.QKVWgx = yDY.AhwBna();
        this.flVtFt = true;
        this.fvQaOB = true;
        this.QbewEr = InputType.CRYPTO_INPUT;
        this.UeEOUB = "0";
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow(this.QUSxYX.getIcon());
        this.gEmmrt = MutableStateFlow;
        this.RcXXUw = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow(this.QUSxYX.getCcy());
        this.AhwBna = MutableStateFlow2;
        this.aKErDB = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<String> MutableStateFlow3 = StateFlowKt.MutableStateFlow(this.RJOkX.getIcon());
        this.gHZMYf = MutableStateFlow3;
        this.hUfVAv = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<String> MutableStateFlow4 = StateFlowKt.MutableStateFlow(this.RJOkX.getCcy());
        this.OcIXYQ = MutableStateFlow4;
        this.gkJEwt = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<String> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.DTwDnp = MutableStateFlow5;
        this.AxsJAYaxsJAY = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<String> MutableStateFlow6 = StateFlowKt.MutableStateFlow(null);
        this.AYXKKw = MutableStateFlow6;
        this.dNCPSb = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<String> MutableStateFlow7 = StateFlowKt.MutableStateFlow("0.0");
        this.AxsJAY = MutableStateFlow7;
        this.iRxXKY = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<String> MutableStateFlow8 = StateFlowKt.MutableStateFlow(null);
        this.valueOf = MutableStateFlow8;
        this.djSkpj = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<Boolean> MutableStateFlow9 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.fARcdN = MutableStateFlow9;
        this.giSNqX = FlowKt.asStateFlow(MutableStateFlow9);
    }

    public final void valueOf(boolean z) {
        mHA.OLrzqt.OLrzqt(this.zLjUOn, Boolean.valueOf(z));
    }

    public final void gEmmrt(boolean z) {
        mHA.OLrzqt.OLrzqt(this.wlaJM, Boolean.valueOf(z));
    }

    public final void EZpvd(@NotNull ConvertCurrencyBean convertCurrencyBean) {
        Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
        mHA.OLrzqt.OLrzqt(this.iwGUEr, convertCurrencyBean);
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.bsc.convert.ConvertViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class SharedElementCallback extends TaskDescription {
            public static final SharedElementCallback EZpvd = new SharedElementCallback();

            private SharedElementCallback() {
                super(null);
            }
        }

        private TaskDescription() {
        }

        public static final class VoiceInteractor extends TaskDescription {
            public static final VoiceInteractor OLrzqt = new VoiceInteractor();

            private VoiceInteractor() {
                super(null);
            }
        }

        public static final class LoaderManager extends TaskDescription {
            public static final LoaderManager EZpvd = new LoaderManager();

            private LoaderManager() {
                super(null);
            }
        }

        public static final class PictureInPictureParams extends TaskDescription {
            public static final int EZpvd = ConvertCurrencyBean.$stable;
            public final String KWHzl;
            public final ConvertCurrencyBean OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ PictureInPictureParams copy$default(PictureInPictureParams pictureInPictureParams, String str, ConvertCurrencyBean convertCurrencyBean, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = pictureInPictureParams.KWHzl;
                }
                if ((i & 2) != 0) {
                    convertCurrencyBean = pictureInPictureParams.OLrzqt;
                }
                return pictureInPictureParams.OLrzqt(str, convertCurrencyBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PictureInPictureParams OLrzqt(@NotNull String str, @NotNull ConvertCurrencyBean convertCurrencyBean) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
                return new PictureInPictureParams(str, convertCurrencyBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ConvertCurrencyBean OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PictureInPictureParams)) {
                    return false;
                }
                PictureInPictureParams pictureInPictureParams = (PictureInPictureParams) obj;
                return Intrinsics.EZpvd((Object) this.KWHzl, (Object) pictureInPictureParams.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, pictureInPictureParams.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "TokenBalanceBelowMinInputBelowMin(minLimit=" + this.KWHzl + ", fromCcy=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PictureInPictureParams(@NotNull String str, @NotNull ConvertCurrencyBean convertCurrencyBean) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
                this.KWHzl = str;
                this.OLrzqt = convertCurrencyBean;
            }
        }

        public static final class Dialog extends TaskDescription {
            public static final int OLrzqt = ConvertCurrencyBean.$stable;
            public final ConvertCurrencyBean AEQbTJ;
            public final String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Dialog copy$default(Dialog dialog, String str, ConvertCurrencyBean convertCurrencyBean, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dialog.KWHzl;
                }
                if ((i & 2) != 0) {
                    convertCurrencyBean = dialog.AEQbTJ;
                }
                return dialog.OLrzqt(str, convertCurrencyBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Dialog OLrzqt(@NotNull String str, @NotNull ConvertCurrencyBean convertCurrencyBean) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
                return new Dialog(str, convertCurrencyBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ConvertCurrencyBean OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Dialog)) {
                    return false;
                }
                Dialog dialog = (Dialog) obj;
                return Intrinsics.EZpvd((Object) this.KWHzl, (Object) dialog.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, dialog.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "TokenBalanceBelowMinInputAboveMin(minLimit=" + this.KWHzl + ", fromCcy=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Dialog(@NotNull String str, @NotNull ConvertCurrencyBean convertCurrencyBean) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
                this.KWHzl = str;
                this.AEQbTJ = convertCurrencyBean;
            }
        }

        public static final class StateListAnimator extends TaskDescription {
            public static final int KWHzl = ConvertCurrencyBean.$stable;
            public final String EZpvd;
            public final ConvertCurrencyBean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, ConvertCurrencyBean convertCurrencyBean, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.EZpvd;
                }
                if ((i & 2) != 0) {
                    convertCurrencyBean = stateListAnimator.copydefault;
                }
                return stateListAnimator.copydefault(str, convertCurrencyBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ConvertCurrencyBean OLrzqt() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator copydefault(@NotNull String str, @NotNull ConvertCurrencyBean convertCurrencyBean) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
                return new StateListAnimator(str, convertCurrencyBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StateListAnimator)) {
                    return false;
                }
                StateListAnimator stateListAnimator = (StateListAnimator) obj;
                return Intrinsics.EZpvd((Object) this.EZpvd, (Object) stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.EZpvd.hashCode() * 31) + this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "InputMinBalanceMax(minLimit=" + this.EZpvd + ", fromCcy=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull String str, @NotNull ConvertCurrencyBean convertCurrencyBean) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
                this.EZpvd = str;
                this.copydefault = convertCurrencyBean;
            }
        }

        public static final class Activity extends TaskDescription {
            public static final Activity OLrzqt = new Activity();

            private Activity() {
                super(null);
            }
        }

        public static final class Application extends TaskDescription {
            public static final int OLrzqt = ConvertCurrencyBean.$stable;
            public final ConvertCurrencyBean AEQbTJ;
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, String str, ConvertCurrencyBean convertCurrencyBean, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = application.copydefault;
                }
                if ((i & 2) != 0) {
                    convertCurrencyBean = application.AEQbTJ;
                }
                return application.AEQbTJ(str, convertCurrencyBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application AEQbTJ(@NotNull String str, @NotNull ConvertCurrencyBean convertCurrencyBean) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
                return new Application(str, convertCurrencyBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ConvertCurrencyBean KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                Application application = (Application) obj;
                return Intrinsics.EZpvd((Object) this.copydefault, (Object) application.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "MinBalanceInputMax(balance=" + this.copydefault + ", fromCcy=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull String str, @NotNull ConvertCurrencyBean convertCurrencyBean) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
                this.copydefault = str;
                this.AEQbTJ = convertCurrencyBean;
            }
        }

        /* JADX INFO: renamed from: com.okinc.buysell.ui.bsc.convert.ConvertViewModel$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0383TaskDescription extends TaskDescription {
            public static final int AEQbTJ = ConvertCurrencyBean.$stable;
            public final String OLrzqt;
            public final ConvertCurrencyBean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0383TaskDescription copy$default(C0383TaskDescription c0383TaskDescription, String str, ConvertCurrencyBean convertCurrencyBean, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c0383TaskDescription.OLrzqt;
                }
                if ((i & 2) != 0) {
                    convertCurrencyBean = c0383TaskDescription.copydefault;
                }
                return c0383TaskDescription.AEQbTJ(str, convertCurrencyBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0383TaskDescription AEQbTJ(@NotNull String str, @NotNull ConvertCurrencyBean convertCurrencyBean) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
                return new C0383TaskDescription(str, convertCurrencyBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ConvertCurrencyBean AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0383TaskDescription)) {
                    return false;
                }
                C0383TaskDescription c0383TaskDescription = (C0383TaskDescription) obj;
                return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) c0383TaskDescription.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c0383TaskDescription.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "MinBalanceMaxInput(balance=" + this.OLrzqt + ", fromCcy=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0383TaskDescription(@NotNull String str, @NotNull ConvertCurrencyBean convertCurrencyBean) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
                this.OLrzqt = str;
                this.copydefault = convertCurrencyBean;
            }
        }

        public static final class ActionBar extends TaskDescription {
            public static final int OLrzqt = ConvertCurrencyBean.$stable;
            public final String KWHzl;
            public final ConvertCurrencyBean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, String str, ConvertCurrencyBean convertCurrencyBean, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = actionBar.KWHzl;
                }
                if ((i & 2) != 0) {
                    convertCurrencyBean = actionBar.copydefault;
                }
                return actionBar.EZpvd(str, convertCurrencyBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar EZpvd(@NotNull String str, @NotNull ConvertCurrencyBean convertCurrencyBean) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
                return new ActionBar(str, convertCurrencyBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ConvertCurrencyBean copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                ActionBar actionBar = (ActionBar) obj;
                return Intrinsics.EZpvd((Object) this.KWHzl, (Object) actionBar.KWHzl) && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.KWHzl.hashCode() * 31) + this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "InputMinMaxBalance(minLimit=" + this.KWHzl + ", fromCcy=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull String str, @NotNull ConvertCurrencyBean convertCurrencyBean) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
                this.KWHzl = str;
                this.copydefault = convertCurrencyBean;
            }
        }

        public static final class PendingIntent extends TaskDescription {
            public static final PendingIntent OLrzqt = new PendingIntent();

            private PendingIntent() {
                super(null);
            }
        }

        public static final class FragmentManager extends TaskDescription {
            public static final int copydefault = ConvertCurrencyBean.$stable;
            public final ConvertCurrencyBean AEQbTJ;
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, String str, ConvertCurrencyBean convertCurrencyBean, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fragmentManager.OLrzqt;
                }
                if ((i & 2) != 0) {
                    convertCurrencyBean = fragmentManager.AEQbTJ;
                }
                return fragmentManager.EZpvd(str, convertCurrencyBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final FragmentManager EZpvd(@NotNull String str, @NotNull ConvertCurrencyBean convertCurrencyBean) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
                return new FragmentManager(str, convertCurrencyBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ConvertCurrencyBean copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FragmentManager)) {
                    return false;
                }
                FragmentManager fragmentManager = (FragmentManager) obj;
                return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) fragmentManager.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, fragmentManager.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "MinMaxInputBalance(maxLimit=" + this.OLrzqt + ", fromCcy=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FragmentManager(@NotNull String str, @NotNull ConvertCurrencyBean convertCurrencyBean) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
                this.OLrzqt = str;
                this.AEQbTJ = convertCurrencyBean;
            }
        }

        public static final class Fragment extends TaskDescription {
            public static final int copydefault = ConvertCurrencyBean.$stable;
            public final ConvertCurrencyBean AEQbTJ;
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Fragment copy$default(Fragment fragment, String str, ConvertCurrencyBean convertCurrencyBean, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fragment.OLrzqt;
                }
                if ((i & 2) != 0) {
                    convertCurrencyBean = fragment.AEQbTJ;
                }
                return fragment.EZpvd(str, convertCurrencyBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Fragment EZpvd(@NotNull String str, @NotNull ConvertCurrencyBean convertCurrencyBean) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
                return new Fragment(str, convertCurrencyBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ConvertCurrencyBean OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Fragment)) {
                    return false;
                }
                Fragment fragment = (Fragment) obj;
                return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) fragment.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, fragment.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "MinMaxBalanceInput(maxLimit=" + this.OLrzqt + ", fromCcy=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Fragment(@NotNull String str, @NotNull ConvertCurrencyBean convertCurrencyBean) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
                this.OLrzqt = str;
                this.AEQbTJ = convertCurrencyBean;
            }
        }
    }

    public final ValuationCurrencyBean fIwbmz() {
        return this.finit.zLjUOn();
    }

    public final void EZpvd(boolean z) {
        this.fARcdN.setValue(Boolean.valueOf(z));
    }

    public final void AhwBna(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw.setValue(str);
        this.valueOf.setValue(DbNXlk(C31351lsQ.Activity.dUDNAs));
    }

    public final void AYXKKw(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AxsJAY.setValue(str);
    }

    public final void EZpvd(@NotNull ConvertCurrencyBean convertCurrencyBean, @NotNull ConvertCurrencyBean convertCurrencyBean2, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
        Intrinsics.checkNotNullParameter(convertCurrencyBean2, "");
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConvertViewModel$updateConvertToAmount$1(z, this, convertCurrencyBean, convertCurrencyBean2, str, null), 3, null);
    }

    public final void AEQbTJ(@NotNull BuySellConvertParameters buySellConvertParameters) {
        Intrinsics.checkNotNullParameter(buySellConvertParameters, "");
        valueOf(true);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConvertViewModel$setupConvertDefaultCurrency$1(this, buySellConvertParameters, null), 3, null);
    }

    public final void copydefault(BuySellConvertParameters buySellConvertParameters) {
        ProConvertEntranceParameters proConvertEntranceParametersValueOf = buySellConvertParameters.valueOf();
        if (proConvertEntranceParametersValueOf == null) {
            return;
        }
        if (proConvertEntranceParametersValueOf.OLrzqt() != -1) {
            buySellConvertParameters.AEQbTJ(KWHzl(proConvertEntranceParametersValueOf.OLrzqt()));
        } else if (proConvertEntranceParametersValueOf.copydefault() != -1) {
            buySellConvertParameters.copydefault(KWHzl(proConvertEntranceParametersValueOf.copydefault()));
        }
    }

    public final String KWHzl(int i) {
        Object next;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        String symbol = null;
        ArrayList<TradeCoinInfo> arrayListOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt() : null;
        if (arrayListOLrzqt != null) {
            Iterator<T> it = arrayListOLrzqt.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((TradeCoinInfo) next).getId(), (Object) String.valueOf(i))) {
                    break;
                }
            }
            TradeCoinInfo tradeCoinInfo = (TradeCoinInfo) next;
            if (tradeCoinInfo != null) {
                symbol = tradeCoinInfo.getSymbol();
            }
        }
        return symbol == null ? "" : symbol;
    }

    public final void OLrzqt(@NotNull BSCMasterViewModel bSCMasterViewModel) {
        Intrinsics.checkNotNullParameter(bSCMasterViewModel, "");
        this.gasjUx = true;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConvertViewModel$getInitTokenAndData$1(bSCMasterViewModel, this, null), 3, null);
    }

    public final String EZpvd(EarnOption earnOption) {
        Integer rewardType;
        String earnRate;
        return (earnOption == null || (rewardType = earnOption.getRewardType()) == null || rewardType.intValue() != 1 || (earnRate = earnOption.getEarnRate()) == null) ? "" : earnRate;
    }

    public final void AhwBna(boolean z) {
        mHA.OLrzqt.OLrzqt(this.AuCTelauCTel, Boolean.valueOf(z));
    }

    public final void EZpvd(ConvertCurrencyBean convertCurrencyBean, ConvertCurrencyBean convertCurrencyBean2) {
        this.QUSxYX = convertCurrencyBean;
        this.RJOkX = convertCurrencyBean2;
        mHA.OLrzqt.OLrzqt(this.zsXlph, lyC.AEQbTJ.EZpvd(convertCurrencyBean));
    }

    public static /* synthetic */ String getFiatAmountForConvertFrom$default(ConvertViewModel convertViewModel, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return convertViewModel.copydefault(str, z);
    }

    public final String copydefault(@NotNull String str, boolean z) {
        C31389ltB c31389ltBOLrzqt;
        C31389ltB c31389ltBOLrzqt2;
        Intrinsics.checkNotNullParameter(str, "");
        if (OLrzqt(this.QUSxYX, this.RJOkX)) {
            String strCopydefault = null;
            if (!Intrinsics.EZpvd(this.QUSxYX.getFiatFlag(), Boolean.TRUE)) {
                C32989mnw<C31389ltB> value = zsXlph().getValue();
                if (value != null && (c31389ltBOLrzqt = value.OLrzqt()) != null) {
                    strCopydefault = c31389ltBOLrzqt.copydefault();
                }
                return C33129mqd.mulS$default(str, strCopydefault, null, null, null, 14, null);
            }
            if (z) {
                return str;
            }
            C32989mnw<C31389ltB> value2 = zsXlph().getValue();
            if (value2 != null && (c31389ltBOLrzqt2 = value2.OLrzqt()) != null) {
                strCopydefault = c31389ltBOLrzqt2.copydefault();
            }
            return C33129mqd.divS$default(str, strCopydefault, null, null, null, 14, null);
        }
        return C33129mqd.mulS$default(str, this.QUSxYX.getLocalCurrentPrice(), null, null, null, 14, null);
    }

    public final String KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.divS$default(str, this.QUSxYX.getLocalCurrentPrice(), null, null, null, 14, null);
    }

    public final void AEQbTJ(@NotNull ConvertCurrencyBean convertCurrencyBean, @NotNull ConvertCurrencyBean convertCurrencyBean2) {
        Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
        Intrinsics.checkNotNullParameter(convertCurrencyBean2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConvertViewModel$onToTokenSwitched$1(this, convertCurrencyBean, convertCurrencyBean2, null), 3, null);
    }

    public final void KWHzl(@NotNull ConvertCurrencyBean convertCurrencyBean, @NotNull ConvertCurrencyBean convertCurrencyBean2) {
        Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
        Intrinsics.checkNotNullParameter(convertCurrencyBean2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConvertViewModel$onFromTokenSwitched$1(this, convertCurrencyBean, convertCurrencyBean2, null), 3, null);
    }

    public static /* synthetic */ void refreshBalance$default(ConvertViewModel convertViewModel, VerificationStatus verificationStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            verificationStatus = null;
        }
        convertViewModel.AEQbTJ(verificationStatus);
    }

    public final void AEQbTJ(VerificationStatus verificationStatus) {
        if (!this.flVtFt) {
            AxsJAYaxsJAY();
        } else {
            this.flVtFt = false;
            OLrzqt(verificationStatus, this.UeEOUB);
        }
    }

    public final void AxsJAYaxsJAY() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConvertViewModel$onRefreshBalance$1(this, null), 3, null);
    }

    public static /* synthetic */ void onBothTokenSwitched$default(ConvertViewModel convertViewModel, ConvertCurrencyBean convertCurrencyBean, ConvertCurrencyBean convertCurrencyBean2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        convertViewModel.copydefault(convertCurrencyBean, convertCurrencyBean2, z);
    }

    public final void copydefault(@NotNull ConvertCurrencyBean convertCurrencyBean, @NotNull ConvertCurrencyBean convertCurrencyBean2, boolean z) {
        Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
        Intrinsics.checkNotNullParameter(convertCurrencyBean2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ConvertViewModel$onBothTokenSwitched$1(z, convertCurrencyBean, convertCurrencyBean2, this, null), 3, null);
    }

    public final Activity.ActionBar fZBcTu() {
        return new Activity.ActionBar(this.RJOkX.getLocalCurrencyToUsdRate(), this.QUSxYX.getLocalCurrentPrice());
    }

    public final boolean OLrzqt(@NotNull ConvertCurrencyBean convertCurrencyBean, @NotNull ConvertCurrencyBean convertCurrencyBean2) {
        Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
        Intrinsics.checkNotNullParameter(convertCurrencyBean2, "");
        Boolean fiatFlag = convertCurrencyBean.getFiatFlag();
        Boolean bool = Boolean.TRUE;
        return Intrinsics.EZpvd(fiatFlag, bool) || Intrinsics.EZpvd(convertCurrencyBean2.getFiatFlag(), bool);
    }

    public final void OLrzqt(VerificationStatus verificationStatus, @NotNull String str) {
        C31389ltB c31389ltBOLrzqt;
        C31389ltB c31389ltBOLrzqt2;
        Intrinsics.checkNotNullParameter(str, "");
        C32989mnw<C31389ltB> value = zsXlph().getValue();
        Double dValueOf = null;
        String strGEmmrt = C33129mqd.gEmmrt((value == null || (c31389ltBOLrzqt2 = value.OLrzqt()) == null) ? null : Double.valueOf(c31389ltBOLrzqt2.EZpvd()));
        C32989mnw<C31389ltB> value2 = zsXlph().getValue();
        if (value2 != null && (c31389ltBOLrzqt = value2.OLrzqt()) != null) {
            dValueOf = Double.valueOf(c31389ltBOLrzqt.OLrzqt());
        }
        String strGEmmrt2 = C33129mqd.gEmmrt(dValueOf);
        String strGEmmrt3 = C33129mqd.gEmmrt(this.QUSxYX.getAvailable());
        double dAEQbTJ = C33129mqd.AEQbTJ(str);
        if (verificationStatus == VerificationStatus.PRE_KYC || verificationStatus == VerificationStatus.PRE_LOGIN) {
            mHA.OLrzqt.OLrzqt(this.ejfBZ, TaskDescription.LoaderManager.EZpvd);
            return;
        }
        if (C33129mqd.OLrzqt(Double.valueOf(dAEQbTJ), Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE))) {
            if (C33129mqd.gEmmrt(strGEmmrt3, strGEmmrt)) {
                mHA.OLrzqt.OLrzqt(this.ejfBZ, TaskDescription.VoiceInteractor.OLrzqt);
                return;
            } else {
                mHA.OLrzqt.OLrzqt(this.ejfBZ, TaskDescription.SharedElementCallback.EZpvd);
                return;
            }
        }
        if (C33129mqd.gEmmrt(strGEmmrt3, strGEmmrt)) {
            if (C33129mqd.gEmmrt(Double.valueOf(dAEQbTJ), strGEmmrt)) {
                mHA.OLrzqt.OLrzqt(this.ejfBZ, new TaskDescription.PictureInPictureParams(strGEmmrt, this.QUSxYX));
                return;
            } else {
                mHA.OLrzqt.OLrzqt(this.ejfBZ, new TaskDescription.Dialog(strGEmmrt, this.QUSxYX));
                return;
            }
        }
        if (C33129mqd.gEmmrt(str, strGEmmrt)) {
            if (C33129mqd.AEQbTJ(strGEmmrt3, strGEmmrt2)) {
                mHA.OLrzqt.OLrzqt(this.ejfBZ, new TaskDescription.ActionBar(strGEmmrt, this.QUSxYX));
                return;
            } else {
                mHA.OLrzqt.OLrzqt(this.ejfBZ, new TaskDescription.StateListAnimator(strGEmmrt, this.QUSxYX));
                return;
            }
        }
        if (C33129mqd.AEQbTJ(str, strGEmmrt2)) {
            if (C33129mqd.AEQbTJ(strGEmmrt3, strGEmmrt2)) {
                if (C33129mqd.AEQbTJ(str, strGEmmrt3)) {
                    mHA.OLrzqt.OLrzqt(this.ejfBZ, new TaskDescription.Fragment(strGEmmrt2, this.QUSxYX));
                    return;
                } else {
                    mHA.OLrzqt.OLrzqt(this.ejfBZ, new TaskDescription.FragmentManager(strGEmmrt2, this.QUSxYX));
                    return;
                }
            }
            mHA.OLrzqt.OLrzqt(this.ejfBZ, new TaskDescription.C0383TaskDescription(this.QUSxYX.getAvailable(), this.QUSxYX));
            return;
        }
        if (C33129mqd.AEQbTJ(strGEmmrt3, strGEmmrt2)) {
            mHA.OLrzqt.OLrzqt(this.ejfBZ, TaskDescription.PendingIntent.OLrzqt);
        } else if (C33129mqd.AEQbTJ(str, strGEmmrt3)) {
            mHA.OLrzqt.OLrzqt(this.ejfBZ, new TaskDescription.Application(this.QUSxYX.getAvailable(), this.QUSxYX));
        } else {
            mHA.OLrzqt.OLrzqt(this.ejfBZ, TaskDescription.Activity.OLrzqt);
        }
    }

    public final void fvQaOB() {
        mHA.OLrzqt.OLrzqt(this.djBIcL, this.QUSxYX.getCcy());
    }

    public static /* synthetic */ void onChipClicked$default(ConvertViewModel convertViewModel, ConvertChipAmount convertChipAmount, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        convertViewModel.KWHzl(convertChipAmount, str);
    }

    public final void KWHzl(ConvertChipAmount convertChipAmount, @NotNull String str) {
        Pair pair;
        Pair pair2;
        String tag;
        Intrinsics.checkNotNullParameter(str, "");
        this.gGvvIC = true;
        switch (convertChipAmount == null ? -1 : ActionBar.copydefault[convertChipAmount.ordinal()]) {
            case 1:
            case 2:
            case 3:
                pair = new Pair(C33129mqd.mulS$default(this.QUSxYX.getAvailable(), Double.valueOf(convertChipAmount.getPercentDecimal()), null, null, RoundingMode.DOWN, 6, null), this.QUSxYX);
                pair2 = pair;
                break;
            case 4:
            case 5:
                pair = new Pair(this.QUSxYX.getAvailable(), this.QUSxYX);
                pair2 = pair;
                break;
            case 6:
                pair2 = new Pair(this.QUSxYX.getAvailable(), this.QUSxYX);
                break;
            default:
                pair2 = null;
                break;
        }
        if (pair2 != null) {
            mHA.OLrzqt.OLrzqt(this.AkhnZx, pair2);
        } else {
            int i = convertChipAmount != null ? ActionBar.copydefault[convertChipAmount.ordinal()] : -1;
            if (i == 7) {
                mHA.OLrzqt.OLrzqt(this.djBIcL, this.QUSxYX.getCcy());
            } else if (i == 8) {
                mHA.OLrzqt.KWHzl(this.fetchVPNInfo);
            }
        }
        if (convertChipAmount == null || (tag = convertChipAmount.getTag()) == null) {
            return;
        }
        String str2 = tag.length() > 0 ? tag : null;
        if (str2 != null) {
            djBIcL(str2);
        }
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gGvvIC = true;
        mHA.OLrzqt.OLrzqt(this.AkhnZx, new Pair(str, this.QUSxYX));
    }

    public final void gasjUx() {
        this.gGvvIC = true;
        mHA.OLrzqt.OLrzqt(this.AkhnZx, new Pair(this.QUSxYX.getAvailable(), this.QUSxYX));
    }

    public final void OLrzqt(@NotNull BSCLevel bSCLevel) {
        Intrinsics.checkNotNullParameter(bSCLevel, "");
        C31354lsT.KWHzl.OLrzqt(TargetTab.CONVERT, (48 & 2) != 0 ? "" : null, (48 & 4) != 0 ? "" : null, (48 & 8) != 0 ? "" : null, (48 & 16) != 0 ? "" : this.QUSxYX.getCcy(), (48 & 32) != 0 ? "" : this.RJOkX.getCcy(), (48 & 64) != 0 ? OrderType.OTHERS : null, (48 & 128) != 0 ? OrderFrequency.NO_FREQ : null, bSCLevel);
    }

    public final void djBIcL(final String str) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Simpletrade_Convert_Chip_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lDo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ConvertViewModel.OLrzqt(str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("chip", str, true);
        return Unit.INSTANCE;
    }

    public final void gkJEwt() {
        InputType inputType;
        int i = ActionBar.EZpvd[this.QbewEr.ordinal()];
        if (i == 1) {
            inputType = InputType.FIAT_INPUT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            inputType = InputType.CRYPTO_INPUT;
        }
        this.QbewEr = inputType;
        EZpvd(inputType);
    }

    public final void OLrzqt(@NotNull InputType inputType) {
        Intrinsics.checkNotNullParameter(inputType, "");
        this.QbewEr = inputType;
        EZpvd(inputType);
    }

    public final void copydefault(@NotNull Pair<ConvertCurrencyBean, ConvertCurrencyBean> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        mHA.OLrzqt.OLrzqt(this.getNewProxyInstance, pair);
        this.gEmmrt.setValue(pair.getFirst().getIcon());
        this.AhwBna.setValue(pair.getFirst().getCcy());
        this.gHZMYf.setValue(pair.getSecond().getIcon());
        this.OcIXYQ.setValue(pair.getSecond().getCcy());
        this.DTwDnp.setValue(EZpvd(pair.getSecond().getEarnOption()));
    }

    public final void EZpvd(@NotNull InputType inputType) {
        Intrinsics.checkNotNullParameter(inputType, "");
        mHA.OLrzqt.OLrzqt(this.values, inputType);
    }

    public final String EZpvd(@NotNull String str) {
        int scale;
        Intrinsics.checkNotNullParameter(str, "");
        int i = ActionBar.EZpvd[this.QbewEr.ordinal()];
        if (i == 1) {
            return C31661lzi.formatToMaxPrecision$default(str, 2, null, 2, null) + " " + fIwbmz().getIsoCode();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        List<String> listOLrzqt = C31785mDv.EZpvd.OLrzqt();
        if ((listOLrzqt instanceof Collection) && listOLrzqt.isEmpty()) {
            scale = this.QUSxYX.getScale();
        } else {
            Iterator<T> it = listOLrzqt.iterator();
            while (it.hasNext()) {
                if (StringsKt__StringsKt.AhwBna((CharSequence) it.next(), (CharSequence) this.QUSxYX.getCcy(), true)) {
                    scale = 2;
                    break;
                }
            }
            scale = this.QUSxYX.getScale();
        }
        return C31661lzi.formatToMaxPrecision$default(str, scale, null, 2, null) + " " + this.QUSxYX.getCcy();
    }

    public final String AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        double dAEQbTJ = C33129mqd.AEQbTJ(str);
        int scale = this.QUSxYX.getScale();
        return C33129mqd.AEQbTJ(Double.valueOf(dAEQbTJ), Integer.valueOf(scale), Boolean.TRUE, RoundingMode.DOWN);
    }

    public final int zuBGHE() {
        int i = ActionBar.EZpvd[this.QbewEr.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 2;
            }
            throw new NoWhenBranchMatchedException();
        }
        List<String> listOLrzqt = C31785mDv.EZpvd.OLrzqt();
        if (!(listOLrzqt instanceof Collection) || !listOLrzqt.isEmpty()) {
            Iterator<T> it = listOLrzqt.iterator();
            while (it.hasNext()) {
                if (StringsKt__StringsKt.AhwBna((CharSequence) it.next(), (CharSequence) this.QUSxYX.getCcy(), true)) {
                    return 2;
                }
            }
        }
        return this.QUSxYX.getScale();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.bsc.convert.ConvertViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX INFO: loaded from: classes15.dex */
        public static final class ActionBar {
            public final String AEQbTJ;
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = actionBar.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    str2 = actionBar.OLrzqt;
                }
                return actionBar.KWHzl(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar KWHzl(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new ActionBar(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                ActionBar actionBar = (ActionBar) obj;
                return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) actionBar.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) actionBar.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UnifiedAmountResult(localCurrencyToUSDRate=" + this.AEQbTJ + ", fromCurrencyToLocalCurrencyRate=" + this.OLrzqt + ")";
            }

            public ActionBar(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.AEQbTJ = str;
                this.OLrzqt = str2;
            }
        }
    }
}
