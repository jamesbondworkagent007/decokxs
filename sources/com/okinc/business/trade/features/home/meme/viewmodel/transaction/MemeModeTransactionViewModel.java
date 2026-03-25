package com.okinc.business.trade.features.home.meme.viewmodel.transaction;

import android.graphics.drawable.Drawable;
import androidx.camera.video.AudioStats;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MemeCurrencyBean;
import com.okinc.business.dexlogic.bean.MemeTokenInfo;
import com.okinc.business.dexlogic.bean.PreCheckBean;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.dexlogic.bean.track.EventPageNameType;
import com.okinc.business.dexlogic.bean.track.TrackOrderType;
import com.okinc.business.dexlogic.bean.track.TrackTransactionDirection;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState;
import com.okinc.business.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean;
import com.okinc.business.dexlogic.track.enums.BusinessType;
import com.okinc.business.trade.features.home.meme.viewmodel.transaction.MemeModeTransactionViewModel;
import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensRequest;
import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensResponse;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean;
import com.okinc.business.trade.features.home.ui.meme.track.MemeQuickPopUpSource;
import com.okinc.business.trade.features.home.ui.uistate.SearchMemeUiState;
import com.okinc.business.trade.features.home.ui.uistate.preset.MemePresetConfigAndToken;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.wallet.api.MpcWalletService;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC22401hef;
import o.AbstractC58185ywX;
import o.C19700gMb;
import o.C19703gMe;
import o.C19756gOd;
import o.C22311hcv;
import o.C22380heK;
import o.C23274hvD;
import o.C23311hvo;
import o.C23314hvr;
import o.C23317hvu;
import o.C25389ivm;
import o.C25446iwq;
import o.C28189kSe;
import o.C28267kVb;
import o.C28269kVd;
import o.C28293kWa;
import o.C28296kWd;
import o.C28297kWe;
import o.C31172lox;
import o.C32979mnm;
import o.C33069mpW;
import o.C33070mpX;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C59449zhJ;
import o.C9860bdZ;
import o.InterfaceC22387heR;
import o.InterfaceC25414iwK;
import o.InterfaceC28223kTl;
import o.InterfaceC28268kVc;
import o.InterfaceC58227yxM;
import o.InterfaceC9738bbJ;
import o.gLQ;
import o.kKG;
import o.kUU;
import o.kVP;
import o.kVU;
import o.kVV;
import o.kVY;
import o.kVZ;
import o.kWC;
import o.kXM;
import o.pUU;
import o.yCM;
import o.yDY;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeModeTransactionViewModel extends ViewModel {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final MutableSharedFlow<InterfaceC28223kTl> AEQbTJ;
    public final MutableLiveData<Boolean> AYXKKw;
    public final MutableLiveData<Boolean> AhwBna;
    public final C19703gMe AkhnZx;
    public final MutableLiveData<Boolean> AuCTel;
    public final MutableLiveData<MemeTokenInfo> AuCTelauCTel;
    public final kVU AubY;
    public final C28296kWd AwvSrB;
    public final MutableLiveData<MpcWalletService.MpcWalletAbleStatus> AxsJAY;
    public final MutableLiveData<Boolean> DTwDnp;
    public final kWC DbNXlk;
    public final C23314hvr<Boolean> EZpvd;
    public final MutableLiveData<MemePresetConfigAndToken> KWHzl;
    public final MutableLiveData<TransactionType> ORxRYg;
    public final MutableLiveData<Unit> OcIXYQ;
    public final C19700gMb QKVWgx;
    public final C28297kWe QOLQEE;
    public Job QUSxYX;
    public final MutableLiveData<SwapState> QVAiDq;
    public final C28189kSe QbewEr;
    public final kKG QfsBiF;
    public final C22311hcv RJOkX;
    public final MutableStateFlow<Boolean> copydefault;
    public final SharedFlow<InterfaceC28223kTl> djBIcL;
    public final kUU ejfBZ;
    public boolean fARcdN;
    public final kVZ fIwbmz;
    public final kVV fJNWhG;
    public final C25446iwq fetchVPNInfo;
    public MutableLiveData<DexMultiTokenInfoBean> gEmmrt;
    public final C19756gOd gHZMYf;
    public final MutableLiveData<C9860bdZ> getFieldNames;
    public final MutableStateFlow<MarketTxWsInfoItemBean> getNewProxyInstance;
    public final MutableLiveData<String> hDKMBd;
    public final InterfaceC25414iwK isConnected;
    public final MutableLiveData<C9860bdZ> iwGUEr;
    public final C23314hvr<Boolean> sSMYrx;
    public final MutableLiveData<TokenBase> uzCIH;
    public final MutableLiveData<DexPresetResultVO> valueOf;
    public final MutableLiveData<Boolean> values;
    public final MutableLiveData<SearchMemeUiState> wlaJM;
    public final MutableLiveData<TransactionType> zLjUOn;
    public final kVY zsXlph;
    public final C28293kWa zuBGHE;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.Buy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.Sell.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<MemePresetConfigAndToken> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<MarketTxWsInfoItemBean> AYXKKw() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<TokenBase> AhwBna() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<MemeTokenInfo> AkhnZx() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<Boolean> AuCTel() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<MpcWalletService.MpcWalletAbleStatus> DbNXlk() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> EZpvd() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<InterfaceC28223kTl> KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> OLrzqt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C9860bdZ> djBIcL() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<DexPresetResultVO> ejfBZ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> fARcdN() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> fIwbmz() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23314hvr<Boolean> fJNWhG() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<TransactionType> fetchVPNInfo() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<String> gEmmrt() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<SwapState> hDKMBd() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> isConnected() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Unit> iwGUEr() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C9860bdZ> valueOf() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<SearchMemeUiState> values() {
        return this.wlaJM;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.meme.viewmodel.transaction.MemeModeTransactionViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @yCM
    public MemeModeTransactionViewModel(@NotNull kVU kvu, @NotNull kKG kkg, @NotNull C28297kWe c28297kWe, @NotNull C28293kWa c28293kWa, @NotNull kVV kvv, @NotNull kWC kwc, @NotNull kVZ kvz, @NotNull C28296kWd c28296kWd, @NotNull kUU kuu, @NotNull C25446iwq c25446iwq, @NotNull InterfaceC25414iwK interfaceC25414iwK, @NotNull C19700gMb c19700gMb, @NotNull C19703gMe c19703gMe, @NotNull C28189kSe c28189kSe, @NotNull C22311hcv c22311hcv, @NotNull C19756gOd c19756gOd, @NotNull kVY kvy) {
        Intrinsics.checkNotNullParameter(kvu, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c28297kWe, "");
        Intrinsics.checkNotNullParameter(c28293kWa, "");
        Intrinsics.checkNotNullParameter(kvv, "");
        Intrinsics.checkNotNullParameter(kwc, "");
        Intrinsics.checkNotNullParameter(kvz, "");
        Intrinsics.checkNotNullParameter(c28296kWd, "");
        Intrinsics.checkNotNullParameter(kuu, "");
        Intrinsics.checkNotNullParameter(c25446iwq, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(c19703gMe, "");
        Intrinsics.checkNotNullParameter(c28189kSe, "");
        Intrinsics.checkNotNullParameter(c22311hcv, "");
        Intrinsics.checkNotNullParameter(c19756gOd, "");
        Intrinsics.checkNotNullParameter(kvy, "");
        this.AubY = kvu;
        this.QfsBiF = kkg;
        this.QOLQEE = c28297kWe;
        this.zuBGHE = c28293kWa;
        this.fJNWhG = kvv;
        this.DbNXlk = kwc;
        this.fIwbmz = kvz;
        this.AwvSrB = c28296kWd;
        this.ejfBZ = kuu;
        this.fetchVPNInfo = c25446iwq;
        this.isConnected = interfaceC25414iwK;
        this.QKVWgx = c19700gMb;
        this.AkhnZx = c19703gMe;
        this.QbewEr = c28189kSe;
        this.RJOkX = c22311hcv;
        this.gHZMYf = c19756gOd;
        this.zsXlph = kvy;
        this.zLjUOn = new MutableLiveData<>();
        this.values = new MutableLiveData<>();
        this.AxsJAY = new MutableLiveData<>();
        this.EZpvd = new C23314hvr<>();
        this.sSMYrx = new C23314hvr<>();
        this.QVAiDq = new MutableLiveData<>();
        this.AuCTelauCTel = new MutableLiveData<>();
        this.getNewProxyInstance = StateFlowKt.MutableStateFlow(null);
        this.DTwDnp = new MutableLiveData<>();
        this.ORxRYg = new MutableLiveData<>();
        this.AuCTel = new MutableLiveData<>();
        this.getFieldNames = new MutableLiveData<>();
        this.iwGUEr = new MutableLiveData<>();
        this.hDKMBd = new MutableLiveData<>();
        this.uzCIH = new MutableLiveData<>();
        this.wlaJM = new MutableLiveData<>();
        this.gEmmrt = new MutableLiveData<>();
        this.OcIXYQ = new MutableLiveData<>();
        this.AYXKKw = new MutableLiveData<>();
        this.valueOf = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        this.KWHzl = new MutableLiveData<>();
        this.copydefault = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        MutableSharedFlow<InterfaceC28223kTl> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 4, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.djBIcL = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kVP zsXlph() {
        return this.ejfBZ.EZpvd();
    }

    public final void copydefault(int i) {
        this.ejfBZ.copydefault(i);
    }

    public final void EZpvd(InterfaceC28223kTl interfaceC28223kTl) {
        this.AEQbTJ.tryEmit(interfaceC28223kTl);
    }

    public final void KWHzl(@NotNull String str, @NotNull TokenBase tokenBase, TokenBase tokenBase2, boolean z, @NotNull yHO<? super TokenBase, ? super TokenBase, ? super String, Unit> yho) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tokenBase, "");
        Intrinsics.checkNotNullParameter(yho, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MemeModeTransactionViewModel$requestMemeModeConfig$1(this, tokenBase, str, tokenBase2, z, yho, null), 3, null);
    }

    public final Object EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, kXM kxm, TokenBase tokenBase, Function2<? super TokenBase, ? super TokenBase, Unit> function2, Continuation<? super Unit> continuation) {
        Object objCopydefault = kxm.copydefault();
        if (Result.m7383isFailureimpl(objCopydefault)) {
            objCopydefault = null;
        }
        List<MemeCurrencyBean> list = (List) objCopydefault;
        if (list != null) {
            zsXlph().EZpvd(dexMultiTokenInfoBean2.getChainId(), list);
        }
        boolean zCopydefault = copydefault(kxm);
        if (EZpvd(kxm) && zCopydefault) {
            KWHzl(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, tokenBase, kxm, function2);
            copydefault(false);
        } else {
            copydefault(true);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(TokenBase tokenBase) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MemeModeTransactionViewModel$refreshCurrencyListSilently$1(this, tokenBase, null), 3, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.heR.Application.getSupportSingleChainList$default(o.heR, java.lang.String, boolean, int, java.lang.Object):o.ywX */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(String str, Continuation<? super Unit> continuation) throws Throwable {
        MemeModeTransactionViewModel$ensureChainListData$1 memeModeTransactionViewModel$ensureChainListData$1;
        if (continuation instanceof MemeModeTransactionViewModel$ensureChainListData$1) {
            memeModeTransactionViewModel$ensureChainListData$1 = (MemeModeTransactionViewModel$ensureChainListData$1) continuation;
            int i = memeModeTransactionViewModel$ensureChainListData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeModeTransactionViewModel$ensureChainListData$1.label = i - Integer.MIN_VALUE;
            } else {
                memeModeTransactionViewModel$ensureChainListData$1 = new MemeModeTransactionViewModel$ensureChainListData$1(this, continuation);
            }
        }
        Object objAwaitFirst = memeModeTransactionViewModel$ensureChainListData$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeModeTransactionViewModel$ensureChainListData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwaitFirst);
                Result.Application application = Result.Companion;
                AbstractC58185ywX supportSingleChainList$default = InterfaceC22387heR.Application.getSupportSingleChainList$default(C22380heK.OLrzqt.copydefault(str).AkhnZx(), "3", false, 2, null);
                memeModeTransactionViewModel$ensureChainListData$1.label = 1;
                objAwaitFirst = AwaitKt.awaitFirst(supportSingleChainList$default, memeModeTransactionViewModel$ensureChainListData$1);
                if (objAwaitFirst == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAwaitFirst);
            }
            Result.m7377constructorimpl((List) objAwaitFirst);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    public final String KWHzl(TokenBase tokenBase, String str) {
        String tokenContractAddress;
        return (tokenBase == null || (tokenContractAddress = tokenBase.getTokenContractAddress()) == null) ? this.RJOkX.AEQbTJ(str) : tokenContractAddress;
    }

    public final boolean AEQbTJ(TokenBase tokenBase) {
        return !copydefault(tokenBase);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(String str, String str2, String str3, Continuation<? super Result<Pair<DexMultiTokenInfoBean, DexMultiTokenInfoBean>>> continuation) throws Throwable {
        MemeModeTransactionViewModel$searchTokensForConfig$1 memeModeTransactionViewModel$searchTokensForConfig$1;
        if (continuation instanceof MemeModeTransactionViewModel$searchTokensForConfig$1) {
            memeModeTransactionViewModel$searchTokensForConfig$1 = (MemeModeTransactionViewModel$searchTokensForConfig$1) continuation;
            int i = memeModeTransactionViewModel$searchTokensForConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeModeTransactionViewModel$searchTokensForConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                memeModeTransactionViewModel$searchTokensForConfig$1 = new MemeModeTransactionViewModel$searchTokensForConfig$1(this, continuation);
            }
        }
        Object obj = memeModeTransactionViewModel$searchTokensForConfig$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeModeTransactionViewModel$searchTokensForConfig$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        if (!(!Intrinsics.EZpvd((Object) str3, (Object) str2))) {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        memeModeTransactionViewModel$searchTokensForConfig$1.label = 1;
        Object objKWHzl = KWHzl(str, str2, str3, memeModeTransactionViewModel$searchTokensForConfig$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    public final Object copydefault(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, TokenBase tokenBase, String str, String str2, yHO<? super TokenBase, ? super TokenBase, ? super String, Unit> yho, Continuation<? super Unit> continuation) throws Throwable {
        if (!Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.getChainId(), (Object) str)) {
            Object objKWHzl = KWHzl(str, tokenBase, true, (Function2<? super TokenBase, ? super TokenBase, Unit>) EZpvd(yho, str2), continuation);
            return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
        }
        AEQbTJ(dexMultiTokenInfoBean, tokenBase, str);
        Object objKWHzl2 = KWHzl(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, tokenBase, EZpvd(yho, str2), continuation);
        return objKWHzl2 == C56442yFn.copydefault() ? objKWHzl2 : Unit.INSTANCE;
    }

    public final void AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean, TokenBase tokenBase, String str) {
        if (C59449zhJ.gEmmrt(dexMultiTokenInfoBean.getTokenContractAddress(), tokenBase.getTokenContractAddress(), !Intrinsics.EZpvd((Object) str, (Object) "501"))) {
            return;
        }
        if (tokenBase.getTokenContractAddress().length() == 0 && dexMultiTokenInfoBean.isMainChainCoin()) {
            pUU.KWHzl("MemeModeTransactionViewModel", "Address change due to native token");
            return;
        }
        pUU.copydefault("MemeModeTransactionViewModel", "Address changed: " + tokenBase.getTokenContractAddress() + " -> " + dexMultiTokenInfoBean.getTokenContractAddress());
    }

    public static final Unit KWHzl(yHO yho, String str, TokenBase tokenBase, TokenBase tokenBase2) {
        Intrinsics.checkNotNullParameter(tokenBase, "");
        yho.invoke(tokenBase, tokenBase2, str);
        return Unit.INSTANCE;
    }

    public final Function2<TokenBase, TokenBase, Unit> EZpvd(final yHO<? super TokenBase, ? super TokenBase, ? super String, Unit> yho, final String str) {
        return new Function2() { // from class: o.kXO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return MemeModeTransactionViewModel.KWHzl(yho, str, (TokenBase) obj, (TokenBase) obj2);
            }
        };
    }

    public final void copydefault(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String strEZpvd = C23311hvo.EZpvd(str, str2, z);
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAkhnZx = C23317hvu.AkhnZx();
        if (Intrinsics.EZpvd((Object) (dexMultiTokenInfoBeanAkhnZx != null ? dexMultiTokenInfoBeanAkhnZx.getUniqueId() : null), (Object) strEZpvd)) {
            return;
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new MemeModeTransactionViewModel$validateTokens$1(this, new ValidateTokensRequest(str, null, null, null, str2, 14, null), str, strEZpvd, null), 3, null);
    }

    public final Object KWHzl(String str, TokenBase tokenBase, boolean z, Function2<? super TokenBase, ? super TokenBase, Unit> function2, Continuation<? super Unit> continuation) throws Throwable {
        pUU.copydefault("MemeModeTransactionViewModel", "requestMemeModeConfig chainId not support: " + str);
        Object objEZpvd = EZpvd(new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.MediaDescriptionCompatBuilder), null, new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.MediaDescriptionCompatBuilder), null, null, 13, null), 5, null), tokenBase, z, null, null, function2, continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [561=4] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, TokenBase tokenBase, Function2<? super TokenBase, ? super TokenBase, Unit> function2, Continuation<? super Unit> continuation) throws Throwable {
        MemeModeTransactionViewModel$handleSearchResult$1 memeModeTransactionViewModel$handleSearchResult$1;
        DexMultiTokenInfoBean dexMultiTokenInfoBean3;
        TokenBase tokenBase2;
        MemeModeTransactionViewModel memeModeTransactionViewModel;
        DexMultiTokenInfoBean dexMultiTokenInfoBean4;
        Function2<? super TokenBase, ? super TokenBase, Unit> function22;
        String str;
        DexMultiTokenInfoBean dexMultiTokenInfoBean5;
        TokenBase tokenBase3;
        Function2<? super TokenBase, ? super TokenBase, Unit> function23;
        MemeModeTransactionViewModel memeModeTransactionViewModel2;
        TokenBase tokenBase4;
        DexMultiTokenInfoBean dexMultiTokenInfoBean6;
        DexMultiTokenInfoBean dexMultiTokenInfoBean7;
        kXM kxm;
        if (continuation instanceof MemeModeTransactionViewModel$handleSearchResult$1) {
            memeModeTransactionViewModel$handleSearchResult$1 = (MemeModeTransactionViewModel$handleSearchResult$1) continuation;
            int i = memeModeTransactionViewModel$handleSearchResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeModeTransactionViewModel$handleSearchResult$1.label = i - Integer.MIN_VALUE;
            } else {
                memeModeTransactionViewModel$handleSearchResult$1 = new MemeModeTransactionViewModel$handleSearchResult$1(this, continuation);
            }
        }
        Object objCopydefault = memeModeTransactionViewModel$handleSearchResult$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = memeModeTransactionViewModel$handleSearchResult$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            kKG kkg = this.QfsBiF;
            memeModeTransactionViewModel$handleSearchResult$1.L$0 = this;
            memeModeTransactionViewModel$handleSearchResult$1.L$1 = dexMultiTokenInfoBean;
            dexMultiTokenInfoBean3 = dexMultiTokenInfoBean2;
            memeModeTransactionViewModel$handleSearchResult$1.L$2 = dexMultiTokenInfoBean3;
            tokenBase2 = tokenBase;
            memeModeTransactionViewModel$handleSearchResult$1.L$3 = tokenBase2;
            memeModeTransactionViewModel$handleSearchResult$1.L$4 = function2;
            memeModeTransactionViewModel$handleSearchResult$1.label = 1;
            objCopydefault = kkg.copydefault(memeModeTransactionViewModel$handleSearchResult$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            memeModeTransactionViewModel = this;
            dexMultiTokenInfoBean4 = dexMultiTokenInfoBean;
            function22 = function2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Function2<? super TokenBase, ? super TokenBase, Unit> function24 = (Function2) memeModeTransactionViewModel$handleSearchResult$1.L$4;
                    TokenBase tokenBase5 = (TokenBase) memeModeTransactionViewModel$handleSearchResult$1.L$3;
                    DexMultiTokenInfoBean dexMultiTokenInfoBean8 = (DexMultiTokenInfoBean) memeModeTransactionViewModel$handleSearchResult$1.L$2;
                    DexMultiTokenInfoBean dexMultiTokenInfoBean9 = (DexMultiTokenInfoBean) memeModeTransactionViewModel$handleSearchResult$1.L$1;
                    memeModeTransactionViewModel2 = (MemeModeTransactionViewModel) memeModeTransactionViewModel$handleSearchResult$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    function23 = function24;
                    tokenBase4 = tokenBase5;
                    dexMultiTokenInfoBean6 = dexMultiTokenInfoBean8;
                    dexMultiTokenInfoBean7 = dexMultiTokenInfoBean9;
                    kxm = (kXM) objCopydefault;
                    boolean zCopydefault = memeModeTransactionViewModel2.copydefault(kxm);
                    if (memeModeTransactionViewModel2.EZpvd(kxm) || !zCopydefault) {
                        memeModeTransactionViewModel2.copydefault(true);
                    } else {
                        memeModeTransactionViewModel2.KWHzl(dexMultiTokenInfoBean7, dexMultiTokenInfoBean6, tokenBase4, kxm, function23);
                        memeModeTransactionViewModel2.copydefault(false);
                    }
                    return Unit.INSTANCE;
                }
                String str2 = (String) memeModeTransactionViewModel$handleSearchResult$1.L$5;
                Function2<? super TokenBase, ? super TokenBase, Unit> function25 = (Function2) memeModeTransactionViewModel$handleSearchResult$1.L$4;
                tokenBase3 = (TokenBase) memeModeTransactionViewModel$handleSearchResult$1.L$3;
                dexMultiTokenInfoBean5 = (DexMultiTokenInfoBean) memeModeTransactionViewModel$handleSearchResult$1.L$2;
                dexMultiTokenInfoBean4 = (DexMultiTokenInfoBean) memeModeTransactionViewModel$handleSearchResult$1.L$1;
                memeModeTransactionViewModel = (MemeModeTransactionViewModel) memeModeTransactionViewModel$handleSearchResult$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                str = str2;
                function22 = function25;
                String chainId = tokenBase3.getChainId();
                memeModeTransactionViewModel$handleSearchResult$1.L$0 = memeModeTransactionViewModel;
                memeModeTransactionViewModel$handleSearchResult$1.L$1 = dexMultiTokenInfoBean4;
                memeModeTransactionViewModel$handleSearchResult$1.L$2 = dexMultiTokenInfoBean5;
                memeModeTransactionViewModel$handleSearchResult$1.L$3 = tokenBase3;
                memeModeTransactionViewModel$handleSearchResult$1.L$4 = function22;
                memeModeTransactionViewModel$handleSearchResult$1.L$5 = null;
                memeModeTransactionViewModel$handleSearchResult$1.label = 3;
                objCopydefault = memeModeTransactionViewModel.OLrzqt(chainId, (String) objCopydefault, str, memeModeTransactionViewModel$handleSearchResult$1);
                if (objCopydefault != objCopydefault2) {
                    return objCopydefault2;
                }
                function23 = function22;
                memeModeTransactionViewModel2 = memeModeTransactionViewModel;
                tokenBase4 = tokenBase3;
                DexMultiTokenInfoBean dexMultiTokenInfoBean10 = dexMultiTokenInfoBean4;
                dexMultiTokenInfoBean6 = dexMultiTokenInfoBean5;
                dexMultiTokenInfoBean7 = dexMultiTokenInfoBean10;
                kxm = (kXM) objCopydefault;
                boolean zCopydefault2 = memeModeTransactionViewModel2.copydefault(kxm);
                if (memeModeTransactionViewModel2.EZpvd(kxm)) {
                    memeModeTransactionViewModel2.copydefault(true);
                }
                return Unit.INSTANCE;
            }
            function22 = (Function2) memeModeTransactionViewModel$handleSearchResult$1.L$4;
            TokenBase tokenBase6 = (TokenBase) memeModeTransactionViewModel$handleSearchResult$1.L$3;
            DexMultiTokenInfoBean dexMultiTokenInfoBean11 = (DexMultiTokenInfoBean) memeModeTransactionViewModel$handleSearchResult$1.L$2;
            dexMultiTokenInfoBean4 = (DexMultiTokenInfoBean) memeModeTransactionViewModel$handleSearchResult$1.L$1;
            memeModeTransactionViewModel = (MemeModeTransactionViewModel) memeModeTransactionViewModel$handleSearchResult$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            tokenBase2 = tokenBase6;
            dexMultiTokenInfoBean3 = dexMultiTokenInfoBean11;
        }
        String str3 = (String) objCopydefault;
        kKG kkg2 = memeModeTransactionViewModel.QfsBiF;
        memeModeTransactionViewModel$handleSearchResult$1.L$0 = memeModeTransactionViewModel;
        memeModeTransactionViewModel$handleSearchResult$1.L$1 = dexMultiTokenInfoBean4;
        memeModeTransactionViewModel$handleSearchResult$1.L$2 = dexMultiTokenInfoBean3;
        memeModeTransactionViewModel$handleSearchResult$1.L$3 = tokenBase2;
        memeModeTransactionViewModel$handleSearchResult$1.L$4 = function22;
        memeModeTransactionViewModel$handleSearchResult$1.L$5 = str3;
        memeModeTransactionViewModel$handleSearchResult$1.label = 2;
        Object objAEQbTJ = kkg2.AEQbTJ(memeModeTransactionViewModel$handleSearchResult$1);
        if (objAEQbTJ == objCopydefault2) {
            return objCopydefault2;
        }
        str = str3;
        objCopydefault = objAEQbTJ;
        TokenBase tokenBase7 = tokenBase2;
        dexMultiTokenInfoBean5 = dexMultiTokenInfoBean3;
        tokenBase3 = tokenBase7;
        String chainId2 = tokenBase3.getChainId();
        memeModeTransactionViewModel$handleSearchResult$1.L$0 = memeModeTransactionViewModel;
        memeModeTransactionViewModel$handleSearchResult$1.L$1 = dexMultiTokenInfoBean4;
        memeModeTransactionViewModel$handleSearchResult$1.L$2 = dexMultiTokenInfoBean5;
        memeModeTransactionViewModel$handleSearchResult$1.L$3 = tokenBase3;
        memeModeTransactionViewModel$handleSearchResult$1.L$4 = function22;
        memeModeTransactionViewModel$handleSearchResult$1.L$5 = null;
        memeModeTransactionViewModel$handleSearchResult$1.label = 3;
        objCopydefault = memeModeTransactionViewModel.OLrzqt(chainId2, (String) objCopydefault, str, memeModeTransactionViewModel$handleSearchResult$1);
        if (objCopydefault != objCopydefault2) {
        }
    }

    public final boolean copydefault(kXM kxm) {
        if (!this.fJNWhG.EZpvd().isEmpty()) {
            return true;
        }
        Object objOLrzqt = kxm.OLrzqt();
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        List list = (List) objOLrzqt;
        return list != null && (list.isEmpty() ^ true);
    }

    public final void KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, TokenBase tokenBase, kXM kxm, Function2<? super TokenBase, ? super TokenBase, Unit> function2) {
        C23317hvu.OLrzqt(dexMultiTokenInfoBean);
        String chainId = tokenBase.getChainId();
        Object objAEQbTJ = kxm.AEQbTJ();
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
            objAEQbTJ = null;
        }
        copydefault(chainId, EZpvd((DexPresetResultVO) objAEQbTJ));
        function2.invoke(DexMultiTokenInfoBean.transTokenBase$default(dexMultiTokenInfoBean, tokenBase.getSource(), null, null, false, 14, null), DexMultiTokenInfoBean.transTokenBase$default(dexMultiTokenInfoBean2, tokenBase.getSource(), null, null, false, 14, null));
        this.RJOkX.KWHzl(dexMultiTokenInfoBean2.getChainId(), dexMultiTokenInfoBean2.getTokenContractAddress());
    }

    public final DexMultiTokenInfoBean OLrzqt(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.zuBGHE.OLrzqt(str, str2);
    }

    public final Pair<InterfaceC28268kVc, InterfaceC28268kVc> KWHzl(@NotNull TokenBase tokenBase) {
        Intrinsics.checkNotNullParameter(tokenBase, "");
        TransactionType value = this.zLjUOn.getValue();
        if (value == null) {
            value = TransactionType.Buy;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOLrzqt = OLrzqt(tokenBase.getChainId(), tokenBase.getTokenContractAddress());
        if (dexMultiTokenInfoBeanOLrzqt == null) {
            String str = null;
            return new Pair<>(new C28267kVb(new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str, str, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null)), new C28269kVd(tokenBase));
        }
        int i = Application.copydefault[value.ordinal()];
        if (i == 1) {
            return C56390yDp.OLrzqt(new C28267kVb(dexMultiTokenInfoBeanOLrzqt), new C28269kVd(tokenBase));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C56390yDp.OLrzqt(new C28269kVd(tokenBase), new C28267kVb(dexMultiTokenInfoBeanOLrzqt));
    }

    public final void uzCIH() {
        this.EZpvd.setValue(Boolean.TRUE);
    }

    public final Object OLrzqt(String str, String str2, String str3, Continuation<? super kXM> continuation) {
        return CoroutineScopeKt.coroutineScope(new MemeModeTransactionViewModel$requestConfig$2(this, str, str2, str3, null), continuation);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (this.fIwbmz.AEQbTJ(str, this.QfsBiF.copydefault(str)).length() == 0) {
            this.fIwbmz.AEQbTJ(str, this.QfsBiF.copydefault(str), str2);
        }
    }

    public final String EZpvd(DexPresetResultVO dexPresetResultVO) {
        List listAhwBna;
        if (dexPresetResultVO == null || (listAhwBna = dexPresetResultVO.getDexPresetResultVOList()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        PresetUserConfigBean presetUserConfigBean = (PresetUserConfigBean) CollectionsKt___CollectionsKt.firstOrNull(listAhwBna);
        String presetType = presetUserConfigBean != null ? presetUserConfigBean.getPresetType() : null;
        return presetType == null ? "" : presetType;
    }

    public final void EZpvd(Exception exc, TokenBase tokenBase) {
        this.values.setValue(Boolean.TRUE);
        KWHzl(exc, tokenBase);
    }

    public final void KWHzl(Throwable th, TokenBase tokenBase) {
        if ((th instanceof OKServerException) && (((OKServerException) th).getOrigin() instanceof OKServerException)) {
            if (copydefault(tokenBase)) {
                C55326xho.toast$default(C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.getTitle, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chain", tokenBase.getChainName()))), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            } else {
                C55326xho.toast$default(C23274hvD.Fragment.MediaDescriptionCompatBuilder, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            }
        }
    }

    public final boolean copydefault(TokenBase tokenBase) {
        List<DefiChainInfo> listEZpvd = this.fJNWhG.EZpvd();
        if (!listEZpvd.isEmpty()) {
            if ((listEZpvd instanceof Collection) && listEZpvd.isEmpty()) {
                return true;
            }
            Iterator<T> it = listEZpvd.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((Object) ((DefiChainInfo) it.next()).getChainId(), (Object) tokenBase.getChainId())) {
                }
            }
            return true;
        }
        return false;
    }

    public final Object EZpvd(Throwable th, TokenBase tokenBase, boolean z, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, Function2<? super TokenBase, ? super TokenBase, Unit> function2, Continuation<? super Unit> continuation) throws Throwable {
        KWHzl(th, tokenBase);
        if (!z) {
            copydefault(true);
            return Unit.INSTANCE;
        }
        Object objCopydefault = copydefault(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, function2, continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, Function2<? super TokenBase, ? super TokenBase, Unit> function2, Continuation<? super Unit> continuation) throws Throwable {
        MemeModeTransactionViewModel$attemptFallbackRecovery$1 memeModeTransactionViewModel$attemptFallbackRecovery$1;
        Object objCopydefault;
        MemeModeTransactionViewModel memeModeTransactionViewModel;
        if (continuation instanceof MemeModeTransactionViewModel$attemptFallbackRecovery$1) {
            memeModeTransactionViewModel$attemptFallbackRecovery$1 = (MemeModeTransactionViewModel$attemptFallbackRecovery$1) continuation;
            int i = memeModeTransactionViewModel$attemptFallbackRecovery$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeModeTransactionViewModel$attemptFallbackRecovery$1.label = i - Integer.MIN_VALUE;
            } else {
                memeModeTransactionViewModel$attemptFallbackRecovery$1 = new MemeModeTransactionViewModel$attemptFallbackRecovery$1(this, continuation);
            }
        }
        MemeModeTransactionViewModel$attemptFallbackRecovery$1 memeModeTransactionViewModel$attemptFallbackRecovery$12 = memeModeTransactionViewModel$attemptFallbackRecovery$1;
        Object obj = memeModeTransactionViewModel$attemptFallbackRecovery$12.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = memeModeTransactionViewModel$attemptFallbackRecovery$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            memeModeTransactionViewModel$attemptFallbackRecovery$12.L$0 = this;
            memeModeTransactionViewModel$attemptFallbackRecovery$12.L$1 = dexMultiTokenInfoBean2;
            memeModeTransactionViewModel$attemptFallbackRecovery$12.L$2 = function2;
            memeModeTransactionViewModel$attemptFallbackRecovery$12.label = 1;
            objCopydefault = copydefault(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, memeModeTransactionViewModel$attemptFallbackRecovery$12);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            memeModeTransactionViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            function2 = (Function2) memeModeTransactionViewModel$attemptFallbackRecovery$12.L$2;
            dexMultiTokenInfoBean2 = (DexMultiTokenInfoBean) memeModeTransactionViewModel$attemptFallbackRecovery$12.L$1;
            MemeModeTransactionViewModel memeModeTransactionViewModel2 = (MemeModeTransactionViewModel) memeModeTransactionViewModel$attemptFallbackRecovery$12.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
            memeModeTransactionViewModel = memeModeTransactionViewModel2;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean3 = dexMultiTokenInfoBean2;
        Function2<? super TokenBase, ? super TokenBase, Unit> function22 = function2;
        if (Result.m7380exceptionOrNullimpl(objCopydefault) == null) {
            Pair pair = (Pair) objCopydefault;
            DexMultiTokenInfoBean dexMultiTokenInfoBean4 = (DexMultiTokenInfoBean) pair.component1();
            DexMultiTokenInfoBean dexMultiTokenInfoBean5 = (DexMultiTokenInfoBean) pair.component2();
            memeModeTransactionViewModel$attemptFallbackRecovery$12.L$0 = null;
            memeModeTransactionViewModel$attemptFallbackRecovery$12.L$1 = null;
            memeModeTransactionViewModel$attemptFallbackRecovery$12.L$2 = null;
            memeModeTransactionViewModel$attemptFallbackRecovery$12.label = 2;
            if (memeModeTransactionViewModel.AEQbTJ(dexMultiTokenInfoBean4, dexMultiTokenInfoBean5, dexMultiTokenInfoBean3, function22, memeModeTransactionViewModel$attemptFallbackRecovery$12) == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            memeModeTransactionViewModel.copydefault(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, Continuation<? super Result<Pair<DexMultiTokenInfoBean, DexMultiTokenInfoBean>>> continuation) throws Throwable {
        MemeModeTransactionViewModel$getFallbackTokenPair$1 memeModeTransactionViewModel$getFallbackTokenPair$1;
        if (continuation instanceof MemeModeTransactionViewModel$getFallbackTokenPair$1) {
            memeModeTransactionViewModel$getFallbackTokenPair$1 = (MemeModeTransactionViewModel$getFallbackTokenPair$1) continuation;
            int i = memeModeTransactionViewModel$getFallbackTokenPair$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeModeTransactionViewModel$getFallbackTokenPair$1.label = i - Integer.MIN_VALUE;
            } else {
                memeModeTransactionViewModel$getFallbackTokenPair$1 = new MemeModeTransactionViewModel$getFallbackTokenPair$1(this, continuation);
            }
        }
        Object obj = memeModeTransactionViewModel$getFallbackTokenPair$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeModeTransactionViewModel$getFallbackTokenPair$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        if (dexMultiTokenInfoBean != null) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C56390yDp.OLrzqt(dexMultiTokenInfoBean, dexMultiTokenInfoBean2));
        }
        memeModeTransactionViewModel$getFallbackTokenPair$1.label = 1;
        Object objEZpvd = EZpvd(memeModeTransactionViewModel$getFallbackTokenPair$1);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(Continuation<? super Result<Pair<DexMultiTokenInfoBean, DexMultiTokenInfoBean>>> continuation) throws Throwable {
        MemeModeTransactionViewModel$searchCachedMemeToken$1 memeModeTransactionViewModel$searchCachedMemeToken$1;
        if (continuation instanceof MemeModeTransactionViewModel$searchCachedMemeToken$1) {
            memeModeTransactionViewModel$searchCachedMemeToken$1 = (MemeModeTransactionViewModel$searchCachedMemeToken$1) continuation;
            int i = memeModeTransactionViewModel$searchCachedMemeToken$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeModeTransactionViewModel$searchCachedMemeToken$1.label = i - Integer.MIN_VALUE;
            } else {
                memeModeTransactionViewModel$searchCachedMemeToken$1 = new MemeModeTransactionViewModel$searchCachedMemeToken$1(this, continuation);
            }
        }
        Object obj = memeModeTransactionViewModel$searchCachedMemeToken$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeModeTransactionViewModel$searchCachedMemeToken$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAkhnZx = C23317hvu.AkhnZx();
        String chainId = dexMultiTokenInfoBeanAkhnZx != null ? dexMultiTokenInfoBeanAkhnZx.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        String tokenContractAddress = dexMultiTokenInfoBeanAkhnZx != null ? dexMultiTokenInfoBeanAkhnZx.getTokenContractAddress() : null;
        String str = tokenContractAddress != null ? tokenContractAddress : "";
        memeModeTransactionViewModel$searchCachedMemeToken$1.label = 1;
        Object objKWHzl = KWHzl(chainId, str, (String) null, memeModeTransactionViewModel$searchCachedMemeToken$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [834=4] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, DexMultiTokenInfoBean dexMultiTokenInfoBean3, Function2<? super TokenBase, ? super TokenBase, Unit> function2, Continuation<? super Unit> continuation) throws Throwable {
        MemeModeTransactionViewModel$processFallbackTokenConfig$1 memeModeTransactionViewModel$processFallbackTokenConfig$1;
        DexMultiTokenInfoBean dexMultiTokenInfoBean4;
        DexMultiTokenInfoBean dexMultiTokenInfoBean5;
        MemeModeTransactionViewModel memeModeTransactionViewModel;
        DexMultiTokenInfoBean dexMultiTokenInfoBean6;
        Function2<? super TokenBase, ? super TokenBase, Unit> function22;
        String str;
        DexMultiTokenInfoBean dexMultiTokenInfoBean7;
        DexMultiTokenInfoBean dexMultiTokenInfoBean8;
        Function2<? super TokenBase, ? super TokenBase, Unit> function23;
        MemeModeTransactionViewModel memeModeTransactionViewModel2;
        DexMultiTokenInfoBean dexMultiTokenInfoBean9;
        DexMultiTokenInfoBean dexMultiTokenInfoBean10;
        DexMultiTokenInfoBean dexMultiTokenInfoBean11;
        kXM kxm;
        if (continuation instanceof MemeModeTransactionViewModel$processFallbackTokenConfig$1) {
            memeModeTransactionViewModel$processFallbackTokenConfig$1 = (MemeModeTransactionViewModel$processFallbackTokenConfig$1) continuation;
            int i = memeModeTransactionViewModel$processFallbackTokenConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeModeTransactionViewModel$processFallbackTokenConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                memeModeTransactionViewModel$processFallbackTokenConfig$1 = new MemeModeTransactionViewModel$processFallbackTokenConfig$1(this, continuation);
            }
        }
        Object objCopydefault = memeModeTransactionViewModel$processFallbackTokenConfig$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = memeModeTransactionViewModel$processFallbackTokenConfig$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            kKG kkg = this.QfsBiF;
            memeModeTransactionViewModel$processFallbackTokenConfig$1.L$0 = this;
            memeModeTransactionViewModel$processFallbackTokenConfig$1.L$1 = dexMultiTokenInfoBean;
            dexMultiTokenInfoBean4 = dexMultiTokenInfoBean2;
            memeModeTransactionViewModel$processFallbackTokenConfig$1.L$2 = dexMultiTokenInfoBean4;
            dexMultiTokenInfoBean5 = dexMultiTokenInfoBean3;
            memeModeTransactionViewModel$processFallbackTokenConfig$1.L$3 = dexMultiTokenInfoBean5;
            memeModeTransactionViewModel$processFallbackTokenConfig$1.L$4 = function2;
            memeModeTransactionViewModel$processFallbackTokenConfig$1.label = 1;
            objCopydefault = kkg.copydefault(memeModeTransactionViewModel$processFallbackTokenConfig$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            memeModeTransactionViewModel = this;
            dexMultiTokenInfoBean6 = dexMultiTokenInfoBean;
            function22 = function2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Function2<? super TokenBase, ? super TokenBase, Unit> function24 = (Function2) memeModeTransactionViewModel$processFallbackTokenConfig$1.L$4;
                    DexMultiTokenInfoBean dexMultiTokenInfoBean12 = (DexMultiTokenInfoBean) memeModeTransactionViewModel$processFallbackTokenConfig$1.L$3;
                    DexMultiTokenInfoBean dexMultiTokenInfoBean13 = (DexMultiTokenInfoBean) memeModeTransactionViewModel$processFallbackTokenConfig$1.L$2;
                    DexMultiTokenInfoBean dexMultiTokenInfoBean14 = (DexMultiTokenInfoBean) memeModeTransactionViewModel$processFallbackTokenConfig$1.L$1;
                    memeModeTransactionViewModel2 = (MemeModeTransactionViewModel) memeModeTransactionViewModel$processFallbackTokenConfig$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    function23 = function24;
                    dexMultiTokenInfoBean9 = dexMultiTokenInfoBean12;
                    dexMultiTokenInfoBean10 = dexMultiTokenInfoBean13;
                    dexMultiTokenInfoBean11 = dexMultiTokenInfoBean14;
                    kxm = (kXM) objCopydefault;
                    if (memeModeTransactionViewModel2.EZpvd(kxm)) {
                        memeModeTransactionViewModel2.copydefault(true);
                    } else {
                        memeModeTransactionViewModel2.OLrzqt(dexMultiTokenInfoBean11, dexMultiTokenInfoBean10, dexMultiTokenInfoBean9, kxm, function23);
                        memeModeTransactionViewModel2.copydefault(false);
                    }
                    return Unit.INSTANCE;
                }
                String str2 = (String) memeModeTransactionViewModel$processFallbackTokenConfig$1.L$5;
                Function2<? super TokenBase, ? super TokenBase, Unit> function25 = (Function2) memeModeTransactionViewModel$processFallbackTokenConfig$1.L$4;
                dexMultiTokenInfoBean8 = (DexMultiTokenInfoBean) memeModeTransactionViewModel$processFallbackTokenConfig$1.L$3;
                dexMultiTokenInfoBean7 = (DexMultiTokenInfoBean) memeModeTransactionViewModel$processFallbackTokenConfig$1.L$2;
                dexMultiTokenInfoBean6 = (DexMultiTokenInfoBean) memeModeTransactionViewModel$processFallbackTokenConfig$1.L$1;
                memeModeTransactionViewModel = (MemeModeTransactionViewModel) memeModeTransactionViewModel$processFallbackTokenConfig$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                str = str2;
                function22 = function25;
                String chainId = dexMultiTokenInfoBean6.getChainId();
                memeModeTransactionViewModel$processFallbackTokenConfig$1.L$0 = memeModeTransactionViewModel;
                memeModeTransactionViewModel$processFallbackTokenConfig$1.L$1 = dexMultiTokenInfoBean6;
                memeModeTransactionViewModel$processFallbackTokenConfig$1.L$2 = dexMultiTokenInfoBean7;
                memeModeTransactionViewModel$processFallbackTokenConfig$1.L$3 = dexMultiTokenInfoBean8;
                memeModeTransactionViewModel$processFallbackTokenConfig$1.L$4 = function22;
                memeModeTransactionViewModel$processFallbackTokenConfig$1.L$5 = null;
                memeModeTransactionViewModel$processFallbackTokenConfig$1.label = 3;
                objCopydefault = memeModeTransactionViewModel.OLrzqt(chainId, (String) objCopydefault, str, memeModeTransactionViewModel$processFallbackTokenConfig$1);
                if (objCopydefault != objCopydefault2) {
                    return objCopydefault2;
                }
                function23 = function22;
                memeModeTransactionViewModel2 = memeModeTransactionViewModel;
                dexMultiTokenInfoBean9 = dexMultiTokenInfoBean8;
                DexMultiTokenInfoBean dexMultiTokenInfoBean15 = dexMultiTokenInfoBean6;
                dexMultiTokenInfoBean10 = dexMultiTokenInfoBean7;
                dexMultiTokenInfoBean11 = dexMultiTokenInfoBean15;
                kxm = (kXM) objCopydefault;
                if (memeModeTransactionViewModel2.EZpvd(kxm)) {
                }
                return Unit.INSTANCE;
            }
            function22 = (Function2) memeModeTransactionViewModel$processFallbackTokenConfig$1.L$4;
            DexMultiTokenInfoBean dexMultiTokenInfoBean16 = (DexMultiTokenInfoBean) memeModeTransactionViewModel$processFallbackTokenConfig$1.L$3;
            DexMultiTokenInfoBean dexMultiTokenInfoBean17 = (DexMultiTokenInfoBean) memeModeTransactionViewModel$processFallbackTokenConfig$1.L$2;
            dexMultiTokenInfoBean6 = (DexMultiTokenInfoBean) memeModeTransactionViewModel$processFallbackTokenConfig$1.L$1;
            memeModeTransactionViewModel = (MemeModeTransactionViewModel) memeModeTransactionViewModel$processFallbackTokenConfig$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            dexMultiTokenInfoBean5 = dexMultiTokenInfoBean16;
            dexMultiTokenInfoBean4 = dexMultiTokenInfoBean17;
        }
        String str3 = (String) objCopydefault;
        kKG kkg2 = memeModeTransactionViewModel.QfsBiF;
        memeModeTransactionViewModel$processFallbackTokenConfig$1.L$0 = memeModeTransactionViewModel;
        memeModeTransactionViewModel$processFallbackTokenConfig$1.L$1 = dexMultiTokenInfoBean6;
        memeModeTransactionViewModel$processFallbackTokenConfig$1.L$2 = dexMultiTokenInfoBean4;
        memeModeTransactionViewModel$processFallbackTokenConfig$1.L$3 = dexMultiTokenInfoBean5;
        memeModeTransactionViewModel$processFallbackTokenConfig$1.L$4 = function22;
        memeModeTransactionViewModel$processFallbackTokenConfig$1.L$5 = str3;
        memeModeTransactionViewModel$processFallbackTokenConfig$1.label = 2;
        Object objAEQbTJ = kkg2.AEQbTJ(memeModeTransactionViewModel$processFallbackTokenConfig$1);
        if (objAEQbTJ == objCopydefault2) {
            return objCopydefault2;
        }
        str = str3;
        objCopydefault = objAEQbTJ;
        DexMultiTokenInfoBean dexMultiTokenInfoBean18 = dexMultiTokenInfoBean5;
        dexMultiTokenInfoBean7 = dexMultiTokenInfoBean4;
        dexMultiTokenInfoBean8 = dexMultiTokenInfoBean18;
        String chainId2 = dexMultiTokenInfoBean6.getChainId();
        memeModeTransactionViewModel$processFallbackTokenConfig$1.L$0 = memeModeTransactionViewModel;
        memeModeTransactionViewModel$processFallbackTokenConfig$1.L$1 = dexMultiTokenInfoBean6;
        memeModeTransactionViewModel$processFallbackTokenConfig$1.L$2 = dexMultiTokenInfoBean7;
        memeModeTransactionViewModel$processFallbackTokenConfig$1.L$3 = dexMultiTokenInfoBean8;
        memeModeTransactionViewModel$processFallbackTokenConfig$1.L$4 = function22;
        memeModeTransactionViewModel$processFallbackTokenConfig$1.L$5 = null;
        memeModeTransactionViewModel$processFallbackTokenConfig$1.label = 3;
        objCopydefault = memeModeTransactionViewModel.OLrzqt(chainId2, (String) objCopydefault, str, memeModeTransactionViewModel$processFallbackTokenConfig$1);
        if (objCopydefault != objCopydefault2) {
        }
    }

    public final boolean EZpvd(kXM kxm) {
        return Result.m7384isSuccessimpl(kxm.copydefault()) && Result.m7384isSuccessimpl(kxm.KWHzl()) && Result.m7384isSuccessimpl(kxm.AEQbTJ());
    }

    public final void OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, DexMultiTokenInfoBean dexMultiTokenInfoBean3, kXM kxm, Function2<? super TokenBase, ? super TokenBase, Unit> function2) {
        C23317hvu.OLrzqt(dexMultiTokenInfoBean);
        String chainId = dexMultiTokenInfoBean.getChainId();
        Object objAEQbTJ = kxm.AEQbTJ();
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
            objAEQbTJ = null;
        }
        copydefault(chainId, EZpvd((DexPresetResultVO) objAEQbTJ));
        if (dexMultiTokenInfoBean3 != null) {
            this.RJOkX.KWHzl(dexMultiTokenInfoBean3.getChainId(), dexMultiTokenInfoBean3.getTokenContractAddress());
        }
        function2.invoke(DexMultiTokenInfoBean.transTokenBase$default(dexMultiTokenInfoBean, "meme_mode", null, null, false, 14, null), dexMultiTokenInfoBean2 != null ? DexMultiTokenInfoBean.transTokenBase$default(dexMultiTokenInfoBean2, "meme_mode", null, null, false, 14, null) : null);
    }

    public final void copydefault(boolean z) {
        this.values.setValue(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.trade.features.home.meme.viewmodel.transaction.MemeModeTransactionViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkWallet$default(MemeModeTransactionViewModel memeModeTransactionViewModel, String str, FragmentActivity fragmentActivity, String str2, Function0 function0, int i, Object obj) {
        if ((i & 8) != 0) {
            function0 = null;
        }
        memeModeTransactionViewModel.OLrzqt(str, fragmentActivity, str2, (Function0<Unit>) function0);
    }

    public final void OLrzqt(@NotNull String str, @NotNull FragmentActivity fragmentActivity, @NotNull String str2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Job job = this.QUSxYX;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.QUSxYX = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MemeModeTransactionViewModel$checkWallet$1(str, fragmentActivity, str2, this, function0, null), 3, null);
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.DTwDnp.setValue(Boolean.TRUE);
        AbstractC58185ywX<MemeTokenInfo> abstractC58185ywXAEQbTJ = C22380heK.OLrzqt.copydefault(str).AkhnZx().AEQbTJ(str2, str3);
        final Function1 function1 = new Function1() { // from class: o.kXN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionViewModel.OLrzqt(this.OLrzqt, (MemeTokenInfo) obj);
            }
        };
        InterfaceC58227yxM<? super MemeTokenInfo> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.kXS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MemeModeTransactionViewModel.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.kXQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionViewModel.KWHzl(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.kXT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MemeModeTransactionViewModel.EZpvd(function12, obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(MemeModeTransactionViewModel memeModeTransactionViewModel, MemeTokenInfo memeTokenInfo) {
        memeModeTransactionViewModel.AuCTelauCTel.setValue(memeTokenInfo);
        memeModeTransactionViewModel.DTwDnp.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(MemeModeTransactionViewModel memeModeTransactionViewModel, Throwable th) {
        memeModeTransactionViewModel.DTwDnp.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MemeModeTransactionViewModel$searchTokenPair$1(this, str2, str, str3, null), 3, null);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MemeModeTransactionViewModel$searchMemeModeTokenByPaste$1(this, str, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(String str, String str2, String str3, Continuation<? super Result<Pair<DexMultiTokenInfoBean, DexMultiTokenInfoBean>>> continuation) throws Throwable {
        MemeModeTransactionViewModel$searchMemeTokens$1 memeModeTransactionViewModel$searchMemeTokens$1;
        kVU kvu;
        Object objAEQbTJ;
        MemeModeTransactionViewModel memeModeTransactionViewModel;
        String str4;
        String str5;
        kVU kvu2;
        String str6;
        Object objOLrzqt;
        if (continuation instanceof MemeModeTransactionViewModel$searchMemeTokens$1) {
            memeModeTransactionViewModel$searchMemeTokens$1 = (MemeModeTransactionViewModel$searchMemeTokens$1) continuation;
            int i = memeModeTransactionViewModel$searchMemeTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeModeTransactionViewModel$searchMemeTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                memeModeTransactionViewModel$searchMemeTokens$1 = new MemeModeTransactionViewModel$searchMemeTokens$1(this, continuation);
            }
        }
        MemeModeTransactionViewModel$searchMemeTokens$1 memeModeTransactionViewModel$searchMemeTokens$12 = memeModeTransactionViewModel$searchMemeTokens$1;
        Object obj = memeModeTransactionViewModel$searchMemeTokens$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeModeTransactionViewModel$searchMemeTokens$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("MemeModeTransactionViewModel", "checkTokenPair: " + str + ": " + str2 + ", " + str3);
            kvu = this.AubY;
            kKG kkg = this.QfsBiF;
            memeModeTransactionViewModel$searchMemeTokens$12.L$0 = this;
            memeModeTransactionViewModel$searchMemeTokens$12.L$1 = str2;
            memeModeTransactionViewModel$searchMemeTokens$12.L$2 = str3;
            memeModeTransactionViewModel$searchMemeTokens$12.L$3 = kvu;
            memeModeTransactionViewModel$searchMemeTokens$12.L$4 = str;
            memeModeTransactionViewModel$searchMemeTokens$12.label = 1;
            objAEQbTJ = kkg.AEQbTJ(memeModeTransactionViewModel$searchMemeTokens$12);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            memeModeTransactionViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objOLrzqt = ((Result) obj).m7386unboximpl();
                    if (Result.m7384isSuccessimpl(objOLrzqt)) {
                        Result.Application application = Result.Companion;
                        ValidateTokensResponse validateTokensResponse = (ValidateTokensResponse) objOLrzqt;
                        objOLrzqt = C56390yDp.OLrzqt(validateTokensResponse.getToTokenInfo(), validateTokensResponse.getFromTokenInfo());
                    }
                    return Result.m7377constructorimpl(objOLrzqt);
                }
                String str7 = (String) memeModeTransactionViewModel$searchMemeTokens$12.L$4;
                String str8 = (String) memeModeTransactionViewModel$searchMemeTokens$12.L$3;
                kvu2 = (kVU) memeModeTransactionViewModel$searchMemeTokens$12.L$2;
                str5 = (String) memeModeTransactionViewModel$searchMemeTokens$12.L$1;
                String str9 = (String) memeModeTransactionViewModel$searchMemeTokens$12.L$0;
                C56391yDq.AEQbTJ(obj);
                str4 = str9;
                str6 = str7;
                str = str8;
                String str10 = (String) obj;
                String str11 = str5 != null ? "" : str5;
                memeModeTransactionViewModel$searchMemeTokens$12.L$0 = null;
                memeModeTransactionViewModel$searchMemeTokens$12.L$1 = null;
                memeModeTransactionViewModel$searchMemeTokens$12.L$2 = null;
                memeModeTransactionViewModel$searchMemeTokens$12.L$3 = null;
                memeModeTransactionViewModel$searchMemeTokens$12.L$4 = null;
                memeModeTransactionViewModel$searchMemeTokens$12.label = 3;
                objOLrzqt = kvu2.OLrzqt(str, str6, str10, str4, str11, memeModeTransactionViewModel$searchMemeTokens$12);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                if (Result.m7384isSuccessimpl(objOLrzqt)) {
                }
                return Result.m7377constructorimpl(objOLrzqt);
            }
            str = (String) memeModeTransactionViewModel$searchMemeTokens$12.L$4;
            kVU kvu3 = (kVU) memeModeTransactionViewModel$searchMemeTokens$12.L$3;
            str3 = (String) memeModeTransactionViewModel$searchMemeTokens$12.L$2;
            String str12 = (String) memeModeTransactionViewModel$searchMemeTokens$12.L$1;
            memeModeTransactionViewModel = (MemeModeTransactionViewModel) memeModeTransactionViewModel$searchMemeTokens$12.L$0;
            C56391yDq.AEQbTJ(obj);
            kvu = kvu3;
            str2 = str12;
            objAEQbTJ = obj;
        }
        String str13 = (String) objAEQbTJ;
        kKG kkg2 = memeModeTransactionViewModel.QfsBiF;
        memeModeTransactionViewModel$searchMemeTokens$12.L$0 = str2;
        memeModeTransactionViewModel$searchMemeTokens$12.L$1 = str3;
        memeModeTransactionViewModel$searchMemeTokens$12.L$2 = kvu;
        memeModeTransactionViewModel$searchMemeTokens$12.L$3 = str;
        memeModeTransactionViewModel$searchMemeTokens$12.L$4 = str13;
        memeModeTransactionViewModel$searchMemeTokens$12.label = 2;
        Object objCopydefault2 = kkg2.copydefault(memeModeTransactionViewModel$searchMemeTokens$12);
        if (objCopydefault2 == objCopydefault) {
            return objCopydefault;
        }
        str4 = str2;
        str5 = str3;
        kvu2 = kvu;
        obj = objCopydefault2;
        str6 = str13;
        String str102 = (String) obj;
        if (str5 != null) {
        }
        memeModeTransactionViewModel$searchMemeTokens$12.L$0 = null;
        memeModeTransactionViewModel$searchMemeTokens$12.L$1 = null;
        memeModeTransactionViewModel$searchMemeTokens$12.L$2 = null;
        memeModeTransactionViewModel$searchMemeTokens$12.L$3 = null;
        memeModeTransactionViewModel$searchMemeTokens$12.L$4 = null;
        memeModeTransactionViewModel$searchMemeTokens$12.label = 3;
        objOLrzqt = kvu2.OLrzqt(str, str6, str102, str4, str11, memeModeTransactionViewModel$searchMemeTokens$12);
        if (objOLrzqt == objCopydefault) {
        }
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
        }
        return Result.m7377constructorimpl(objOLrzqt);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.DbNXlk.AEQbTJ(str, str2, str3);
    }

    public final void getNewProxyInstance() {
        this.DbNXlk.EZpvd(new Function1() { // from class: o.kXP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeModeTransactionViewModel.EZpvd(this.copydefault, (MarketTxWsInfoItemBean) obj);
            }
        });
    }

    public static final Unit EZpvd(MemeModeTransactionViewModel memeModeTransactionViewModel, MarketTxWsInfoItemBean marketTxWsInfoItemBean) {
        Intrinsics.checkNotNullParameter(marketTxWsInfoItemBean, "");
        memeModeTransactionViewModel.getNewProxyInstance.setValue(marketTxWsInfoItemBean);
        return Unit.INSTANCE;
    }

    public final void wlaJM() {
        this.DbNXlk.AEQbTJ();
    }

    public static /* synthetic */ TokenBase updateTokenInfo$default(MemeModeTransactionViewModel memeModeTransactionViewModel, DexMultiTokenInfoBean dexMultiTokenInfoBean, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        return memeModeTransactionViewModel.AEQbTJ(dexMultiTokenInfoBean, str, str2, str3, z);
    }

    public final TokenBase AEQbTJ(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        TokenBase tokenBaseTransTokenBase$default = DexMultiTokenInfoBean.transTokenBase$default(dexMultiTokenInfoBean, str2, str3, null, false, 4, null);
        if (z) {
            OLrzqt(str, tokenBaseTransTokenBase$default.getChainId(), tokenBaseTransTokenBase$default.getTokenContractAddress());
        }
        C23317hvu.OLrzqt(dexMultiTokenInfoBean);
        this.gEmmrt.setValue(dexMultiTokenInfoBean);
        wlaJM();
        copydefault(str, tokenBaseTransTokenBase$default.getTokenContractAddress(), tokenBaseTransTokenBase$default.getChainId());
        if (z) {
            getNewProxyInstance();
        }
        return tokenBaseTransTokenBase$default;
    }

    public final void AEQbTJ(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        DexPresetResultVO dexPresetResultVOKWHzl = KWHzl(dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getTokenContractAddress());
        if (dexPresetResultVOKWHzl != null) {
            EZpvd(dexMultiTokenInfoBean, dexPresetResultVOKWHzl, true);
        } else {
            copydefault(dexMultiTokenInfoBean);
        }
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MemeModeTransactionViewModel$preCheck$1(this, str, null), 3, null);
    }

    public final PreCheckBean copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.gHZMYf.copydefault(str);
    }

    public final DexPresetResultVO KWHzl(String str, String str2) {
        List<MemeCurrencyBean> listEZpvd = zsXlph().EZpvd(str, str2);
        DexPresetResultVO dexPresetResultVOAEQbTJ = this.QOLQEE.AEQbTJ(str);
        if (dexPresetResultVOAEQbTJ == null || !(!listEZpvd.isEmpty())) {
            return null;
        }
        return dexPresetResultVOAEQbTJ;
    }

    public final void copydefault(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MemeModeTransactionViewModel$requestPresetConfigAndCurrencyList$1(this, dexMultiTokenInfoBean, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(String str, String str2, Continuation<? super Unit> continuation) throws Throwable {
        MemeModeTransactionViewModel$ensureCurrencyListAvailable$1 memeModeTransactionViewModel$ensureCurrencyListAvailable$1;
        kVP kvpZsXlph;
        String str3;
        Object objAEQbTJ;
        MemeModeTransactionViewModel memeModeTransactionViewModel;
        String str4;
        String str5;
        if (continuation instanceof MemeModeTransactionViewModel$ensureCurrencyListAvailable$1) {
            memeModeTransactionViewModel$ensureCurrencyListAvailable$1 = (MemeModeTransactionViewModel$ensureCurrencyListAvailable$1) continuation;
            int i = memeModeTransactionViewModel$ensureCurrencyListAvailable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeModeTransactionViewModel$ensureCurrencyListAvailable$1.label = i - Integer.MIN_VALUE;
            } else {
                memeModeTransactionViewModel$ensureCurrencyListAvailable$1 = new MemeModeTransactionViewModel$ensureCurrencyListAvailable$1(this, continuation);
            }
        }
        MemeModeTransactionViewModel$ensureCurrencyListAvailable$1 memeModeTransactionViewModel$ensureCurrencyListAvailable$12 = memeModeTransactionViewModel$ensureCurrencyListAvailable$1;
        Object obj = memeModeTransactionViewModel$ensureCurrencyListAvailable$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeModeTransactionViewModel$ensureCurrencyListAvailable$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (zsXlph().copydefault(str, str2) == null) {
                kvpZsXlph = zsXlph();
                kKG kkg = this.QfsBiF;
                memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$0 = this;
                memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$1 = kvpZsXlph;
                memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$2 = str;
                str3 = "1";
                memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$3 = "1";
                memeModeTransactionViewModel$ensureCurrencyListAvailable$12.label = 1;
                objAEQbTJ = kkg.AEQbTJ(memeModeTransactionViewModel$ensureCurrencyListAvailable$12);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                memeModeTransactionViewModel = this;
            } else {
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    ((Result) obj).m7386unboximpl();
                    return Unit.INSTANCE;
                }
                String str6 = (String) memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$3;
                String str7 = (String) memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$2;
                String str8 = (String) memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$1;
                kVP kvp = (kVP) memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$0;
                C56391yDq.AEQbTJ(obj);
                str4 = str6;
                str = str8;
                kvpZsXlph = kvp;
                str5 = str7;
                memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$0 = null;
                memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$1 = null;
                memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$2 = null;
                memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$3 = null;
                memeModeTransactionViewModel$ensureCurrencyListAvailable$12.label = 3;
                if (kvpZsXlph.copydefault(str, str5, str4, (String) obj, memeModeTransactionViewModel$ensureCurrencyListAvailable$12) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            String str9 = (String) memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$3;
            String str10 = (String) memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$2;
            kvpZsXlph = (kVP) memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$1;
            memeModeTransactionViewModel = (MemeModeTransactionViewModel) memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$0;
            C56391yDq.AEQbTJ(obj);
            str3 = str9;
            str = str10;
            objAEQbTJ = obj;
        }
        String str11 = (String) objAEQbTJ;
        kKG kkg2 = memeModeTransactionViewModel.QfsBiF;
        memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$0 = kvpZsXlph;
        memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$1 = str;
        memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$2 = str3;
        memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$3 = str11;
        memeModeTransactionViewModel$ensureCurrencyListAvailable$12.label = 2;
        Object objCopydefault2 = kkg2.copydefault(memeModeTransactionViewModel$ensureCurrencyListAvailable$12);
        if (objCopydefault2 == objCopydefault) {
            return objCopydefault;
        }
        str4 = str11;
        str5 = str3;
        obj = objCopydefault2;
        memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$0 = null;
        memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$1 = null;
        memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$2 = null;
        memeModeTransactionViewModel$ensureCurrencyListAvailable$12.L$3 = null;
        memeModeTransactionViewModel$ensureCurrencyListAvailable$12.label = 3;
        if (kvpZsXlph.copydefault(str, str5, str4, (String) obj, memeModeTransactionViewModel$ensureCurrencyListAvailable$12) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }

    public final boolean EZpvd(String str, String str2, Object obj) {
        return Result.m7384isSuccessimpl(obj) && zsXlph().copydefault(str, str2) != null;
    }

    public final void EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexPresetResultVO dexPresetResultVO, boolean z) {
        this.KWHzl.setValue(new MemePresetConfigAndToken(z, dexPresetResultVO, dexMultiTokenInfoBean));
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MemeModeTransactionViewModel$getMemePresetConfig$1(this, str, null), 3, null);
    }

    public final void copydefault() {
        this.QOLQEE.KWHzl();
    }

    public final String KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.QfsBiF.copydefault(str);
    }

    public final boolean getFieldNames() {
        InterfaceC9738bbJ interfaceC9738bbJValueOf = this.QfsBiF.valueOf();
        return interfaceC9738bbJValueOf != null && interfaceC9738bbJValueOf.RJOkX() && this.isConnected.valueOf();
    }

    public static /* synthetic */ void trackDexTradeHomeFullPageClick$default(MemeModeTransactionViewModel memeModeTransactionViewModel, String str, String str2, String str3, String str4, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = EventPageNameType.MEME.getPageName();
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = BusinessType.MEME.getValue();
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = TrackOrderType.SWAP.getType();
        }
        memeModeTransactionViewModel.OLrzqt(str, str5, str6, str4, (Map<String, String>) map);
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.fetchVPNInfo.copydefault(new AbstractC22401hef.TaskDescription(str, str2, str3, this.zLjUOn.getValue() == TransactionType.Buy ? TrackTransactionDirection.BUY.getValue() : TrackTransactionDirection.SELL.getValue(), str4, map, null, 64, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.okinc.business.trade.features.home.meme.viewmodel.transaction.MemeModeTransactionViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackDexTradeHomeFullPageView$default(MemeModeTransactionViewModel memeModeTransactionViewModel, String str, String str2, String str3, String str4, Map map, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = TrackOrderType.SWAP.getType();
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str4 = BusinessType.MEME.getValue();
        }
        String str6 = str4;
        if ((i & 16) != 0) {
            map = null;
        }
        Map map2 = map;
        if ((i & 32) != 0) {
            list = yDY.AhwBna();
        }
        memeModeTransactionViewModel.KWHzl(str, str5, str3, str6, map2, list);
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, Map<String, String> map, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.fetchVPNInfo.copydefault(new AbstractC22401hef.StateListAnimator(str, str3, str4, this.zLjUOn.getValue() == TransactionType.Buy ? TrackTransactionDirection.BUY.getValue() : TrackTransactionDirection.SELL.getValue(), str2, map, list));
    }

    public final String KWHzl(int i) {
        return (C31172lox.KWHzl(i, C31172lox.Companion.KWHzl()) ? BusinessType.MEME : BusinessType.QUICK).getValue();
    }

    public final String OLrzqt(int i) {
        return (C31172lox.KWHzl(i, C31172lox.Companion.KWHzl()) ? EventPageNameType.MEME : EventPageNameType.QUICK).getPageName();
    }

    public final String AEQbTJ(int i) {
        return C31172lox.KWHzl(i, C31172lox.Companion.KWHzl()) ? "" : MemeQuickPopUpSource.Companion.EZpvd().getSource();
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        zsXlph().KWHzl(str, str2, str3);
    }

    public final DexMultiTokenInfoBean AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return zsXlph().AEQbTJ(str, str2);
    }

    public final boolean EZpvd(@NotNull String str, @NotNull String str2) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean zDjBIcL = this.QKVWgx.djBIcL();
        Iterator<T> it = C22380heK.OLrzqt.copydefault(str).AkhnZx().EZpvd().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((DefiChainInfo) next).getChainId(), (Object) str2)) {
                break;
            }
        }
        DefiChainInfo defiChainInfo = (DefiChainInfo) next;
        gLQ glqAEQbTJ = this.AkhnZx.AEQbTJ(str2, defiChainInfo != null && defiChainInfo.getSupportSmartAccount(), false);
        return zDjBIcL && (glqAEQbTJ != null && glqAEQbTJ.AEQbTJ());
    }

    public final void EZpvd(int i) {
        this.zsXlph.AEQbTJ(this.fARcdN, i);
    }
}
