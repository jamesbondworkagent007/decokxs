package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.market.data.model.alert.AlertCreateRequest;
import com.okinc.business.market.data.model.alert.AlertCreateResponse;
import com.okinc.business.market.data.model.alert.AlertDataUiItem;
import com.okinc.business.market.data.model.alert.AlertPromptType;
import com.okinc.business.market.data.model.alert.AlertRepeatType;
import com.okinc.business.market.data.model.alert.AlertType;
import com.okinc.business.market.data.model.alert.EditAlertRequest;
import com.okinc.business.market.data.model.alert.TokenInfoForAlert;
import com.okinc.business.market.features.alert.create.coinselect.tokenlist.data.AlertMarketCapUnit;
import com.okinc.business.market.features.alert.create.ui.Web3NewOrModifyAlertViewModel$addAlert$1;
import com.okinc.business.market.features.alert.create.ui.Web3NewOrModifyAlertViewModel$checkTokenSupported$1;
import com.okinc.business.market.features.alert.create.ui.Web3NewOrModifyAlertViewModel$deleteAlert$1$1;
import com.okinc.business.market.features.alert.create.ui.Web3NewOrModifyAlertViewModel$editAlert$1;
import com.okinc.business.market.features.alert.create.ui.Web3NewOrModifyAlertViewModel$fetchAndUpdateMarketInfo$1;
import com.okinc.business.market.features.alert.create.ui.Web3NewOrModifyAlertViewModel$init$3;
import com.okinc.business.market.features.alert.create.ui.Web3NewOrModifyAlertViewModel$subscribeToLivePrice$1;
import com.okinc.business.market.features.alert.create.ui.Web3NewOrModifyAlertViewModel$tryCreatingNewAlert$1;
import com.okinc.business.market.features.alert.create.ui.Web3NewOrModifyAlertViewModel$tryEditingTheAlert$1;
import com.okinc.business.market.features.alert.create.ui.Web3NewOrModifyAlertViewModel$updateTokenInfo$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC25800jGv;
import o.jGI;
import o.jGT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class jGX extends ViewModel {
    public final StateFlow<jGT> AEQbTJ;
    public EditAlertRequest AYXKKw;
    public AlertCreateRequest AhwBna;
    public AlertDataUiItem AkhnZx;
    public final StateFlow<InterfaceC25800jGv> AuCTel;
    public TokenInfoForAlert DbNXlk;
    public final MutableStateFlow<java.lang.String> EZpvd;
    public final MutableStateFlow<java.lang.String> KWHzl;
    public final MutableStateFlow<InterfaceC25800jGv> OLrzqt;
    public final MutableStateFlow<jGT> copydefault;
    public final jGH djBIcL;
    public final StateFlow<java.lang.String> fJNWhG;
    public final StateFlow<java.lang.String> fetchVPNInfo;
    public final C25802jGx gEmmrt;
    public final C27629jym isConnected;
    public jGT.Fragment valueOf;
    public kotlin.Pair<TokenInfoForAlert, AlertDataUiItem> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfoForAlert AYXKKw() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.String> AhwBna() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<jGT> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.String> djBIcL() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC25800jGv> gEmmrt() {
        return this.AuCTel;
    }

    public jGX(@NotNull C25802jGx c25802jGx, @NotNull C27629jym c27629jym, @NotNull jGH jgh) {
        Intrinsics.checkNotNullParameter(c25802jGx, "");
        Intrinsics.checkNotNullParameter(c27629jym, "");
        Intrinsics.checkNotNullParameter(jgh, "");
        this.gEmmrt = c25802jGx;
        this.isConnected = c27629jym;
        this.djBIcL = jgh;
        MutableStateFlow<jGT> MutableStateFlow = StateFlowKt.MutableStateFlow(jGT.ActionBar.KWHzl);
        this.copydefault = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<java.lang.String> MutableStateFlow2 = StateFlowKt.MutableStateFlow("");
        this.EZpvd = MutableStateFlow2;
        this.fJNWhG = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<java.lang.String> MutableStateFlow3 = StateFlowKt.MutableStateFlow("");
        this.KWHzl = MutableStateFlow3;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<InterfaceC25800jGv> MutableStateFlow4 = StateFlowKt.MutableStateFlow(InterfaceC25800jGv.TaskDescription.KWHzl);
        this.OLrzqt = MutableStateFlow4;
        this.AuCTel = FlowKt.asStateFlow(MutableStateFlow4);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(TokenInfoForAlert tokenInfoForAlert, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        Web3NewOrModifyAlertViewModel$fetchAndUpdateMarketInfo$1 web3NewOrModifyAlertViewModel$fetchAndUpdateMarketInfo$1;
        java.lang.Object objAEQbTJ;
        jGX jgx;
        TokenInfoForAlert tokenInfoForAlert2;
        if (continuation instanceof Web3NewOrModifyAlertViewModel$fetchAndUpdateMarketInfo$1) {
            web3NewOrModifyAlertViewModel$fetchAndUpdateMarketInfo$1 = (Web3NewOrModifyAlertViewModel$fetchAndUpdateMarketInfo$1) continuation;
            int i = web3NewOrModifyAlertViewModel$fetchAndUpdateMarketInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                web3NewOrModifyAlertViewModel$fetchAndUpdateMarketInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                web3NewOrModifyAlertViewModel$fetchAndUpdateMarketInfo$1 = new Web3NewOrModifyAlertViewModel$fetchAndUpdateMarketInfo$1(this, continuation);
            }
        }
        java.lang.Object obj = web3NewOrModifyAlertViewModel$fetchAndUpdateMarketInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = web3NewOrModifyAlertViewModel$fetchAndUpdateMarketInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C27629jym c27629jym = this.isConnected;
            java.lang.String strValueOf = tokenInfoForAlert.valueOf();
            java.lang.String strCopydefault = tokenInfoForAlert.copydefault();
            web3NewOrModifyAlertViewModel$fetchAndUpdateMarketInfo$1.L$0 = this;
            web3NewOrModifyAlertViewModel$fetchAndUpdateMarketInfo$1.L$1 = tokenInfoForAlert;
            web3NewOrModifyAlertViewModel$fetchAndUpdateMarketInfo$1.label = 1;
            objAEQbTJ = c27629jym.AEQbTJ(strValueOf, strCopydefault, web3NewOrModifyAlertViewModel$fetchAndUpdateMarketInfo$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            jgx = this;
            tokenInfoForAlert2 = tokenInfoForAlert;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TokenInfoForAlert tokenInfoForAlert3 = (TokenInfoForAlert) web3NewOrModifyAlertViewModel$fetchAndUpdateMarketInfo$1.L$1;
            jgx = (jGX) web3NewOrModifyAlertViewModel$fetchAndUpdateMarketInfo$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
            tokenInfoForAlert2 = tokenInfoForAlert3;
        }
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            LatestMarketInfoBean latestMarketInfoBean = (LatestMarketInfoBean) objAEQbTJ;
            tokenInfoForAlert2.OLrzqt(latestMarketInfoBean.getPrice());
            tokenInfoForAlert2.AEQbTJ(latestMarketInfoBean.getMarketCap());
            MutableStateFlow<java.lang.String> mutableStateFlow = jgx.EZpvd;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), latestMarketInfoBean.getPrice())) {
            }
            MutableStateFlow<java.lang.String> mutableStateFlow2 = jgx.KWHzl;
            while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), latestMarketInfoBean.getMarketCap())) {
            }
            jgx.DbNXlk = tokenInfoForAlert2.EZpvd((831 & 1) != 0 ? tokenInfoForAlert2.OLrzqt : null, (831 & 2) != 0 ? tokenInfoForAlert2.KWHzl : null, (831 & 4) != 0 ? tokenInfoForAlert2.djBIcL : null, (831 & 8) != 0 ? tokenInfoForAlert2.AYXKKw : null, (831 & 16) != 0 ? tokenInfoForAlert2.copydefault : null, (831 & 32) != 0 ? tokenInfoForAlert2.values : null, (831 & 64) != 0 ? tokenInfoForAlert2.valueOf : latestMarketInfoBean.getPrice(), (831 & 128) != 0 ? tokenInfoForAlert2.AhwBna : latestMarketInfoBean.getMarketCap(), (831 & 256) != 0 ? tokenInfoForAlert2.AEQbTJ : null, (831 & 512) != 0 ? tokenInfoForAlert2.gEmmrt : false);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void updateInputs$default(jGX jgx, AlertPromptType alertPromptType, AlertType alertType, java.lang.String str, AlertRepeatType alertRepeatType, AlertMarketCapUnit alertMarketCapUnit, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            alertPromptType = null;
        }
        if ((i & 2) != 0) {
            alertType = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            alertRepeatType = null;
        }
        if ((i & 16) != 0) {
            alertMarketCapUnit = null;
        }
        jgx.OLrzqt(alertPromptType, alertType, str, alertRepeatType, alertMarketCapUnit);
    }

    public final void OLrzqt(AlertPromptType alertPromptType, AlertType alertType, java.lang.String str, AlertRepeatType alertRepeatType, AlertMarketCapUnit alertMarketCapUnit) {
        jGT value;
        AlertPromptType alertPromptTypeEZpvd;
        java.lang.String strOLrzqt;
        AlertRepeatType alertRepeatTypeAEQbTJ;
        AlertType alertTypeCopydefault;
        AlertMarketCapUnit alertMarketCapUnitAYXKKw;
        jGT.Fragment fragment;
        if (this.copydefault.getValue() instanceof jGT.Fragment) {
            jGT value2 = this.copydefault.getValue();
            Intrinsics.copydefault(value2, "");
            jGT.Fragment fragment2 = (jGT.Fragment) value2;
            MutableStateFlow<jGT> mutableStateFlow = this.copydefault;
            do {
                value = mutableStateFlow.getValue();
                jGT jgt = value;
                alertPromptTypeEZpvd = alertPromptType == null ? fragment2.EZpvd() : alertPromptType;
                strOLrzqt = str == null ? fragment2.OLrzqt() : str;
                alertRepeatTypeAEQbTJ = alertRepeatType == null ? fragment2.AEQbTJ() : alertRepeatType;
                alertTypeCopydefault = alertType == null ? fragment2.copydefault() : alertType;
                alertMarketCapUnitAYXKKw = alertMarketCapUnit == null ? fragment2.AYXKKw() : alertMarketCapUnit;
                if (alertPromptType != null) {
                    EZpvd(alertPromptType);
                }
                Intrinsics.copydefault(jgt, "");
                fragment = (jGT.Fragment) jgt;
            } while (!mutableStateFlow.compareAndSet(value, fragment.copydefault((9 & 1) != 0 ? fragment.AYXKKw : null, (9 & 2) != 0 ? fragment.copydefault : alertTypeCopydefault, (9 & 4) != 0 ? fragment.EZpvd : alertPromptTypeEZpvd, (9 & 8) != 0 ? fragment.valueOf : null, (9 & 16) != 0 ? fragment.gEmmrt : strOLrzqt, (9 & 32) != 0 ? fragment.OLrzqt : alertRepeatTypeAEQbTJ, (9 & 64) != 0 ? fragment.djBIcL : KWHzl(alertPromptTypeEZpvd, strOLrzqt, alertRepeatTypeAEQbTJ), (9 & 128) != 0 ? fragment.KWHzl : C33129mqd.AEQbTJ(strOLrzqt, 0), (9 & 256) != 0 ? fragment.AhwBna : alertMarketCapUnitAYXKKw)));
        }
    }

    public final void AEQbTJ() {
        this.gEmmrt.copydefault();
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new Web3NewOrModifyAlertViewModel$addAlert$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(AlertCreateRequest alertCreateRequest, TokenInfoForAlert tokenInfoForAlert, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        Web3NewOrModifyAlertViewModel$tryCreatingNewAlert$1 web3NewOrModifyAlertViewModel$tryCreatingNewAlert$1;
        TokenInfoForAlert tokenInfoForAlert2;
        java.lang.Object objKWHzl;
        jGX jgx;
        jGT value;
        int iCopydefault;
        AlertCreateRequest alertCreateRequest2 = alertCreateRequest;
        if (continuation instanceof Web3NewOrModifyAlertViewModel$tryCreatingNewAlert$1) {
            web3NewOrModifyAlertViewModel$tryCreatingNewAlert$1 = (Web3NewOrModifyAlertViewModel$tryCreatingNewAlert$1) continuation;
            int i = web3NewOrModifyAlertViewModel$tryCreatingNewAlert$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                web3NewOrModifyAlertViewModel$tryCreatingNewAlert$1.label = i - Integer.MIN_VALUE;
            } else {
                web3NewOrModifyAlertViewModel$tryCreatingNewAlert$1 = new Web3NewOrModifyAlertViewModel$tryCreatingNewAlert$1(this, continuation);
            }
        }
        java.lang.Object obj = web3NewOrModifyAlertViewModel$tryCreatingNewAlert$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = web3NewOrModifyAlertViewModel$tryCreatingNewAlert$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C25802jGx c25802jGx = this.gEmmrt;
            web3NewOrModifyAlertViewModel$tryCreatingNewAlert$1.L$0 = this;
            web3NewOrModifyAlertViewModel$tryCreatingNewAlert$1.L$1 = alertCreateRequest2;
            tokenInfoForAlert2 = tokenInfoForAlert;
            web3NewOrModifyAlertViewModel$tryCreatingNewAlert$1.L$2 = tokenInfoForAlert2;
            web3NewOrModifyAlertViewModel$tryCreatingNewAlert$1.label = 1;
            objKWHzl = c25802jGx.KWHzl(alertCreateRequest2, web3NewOrModifyAlertViewModel$tryCreatingNewAlert$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            jgx = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TokenInfoForAlert tokenInfoForAlert3 = (TokenInfoForAlert) web3NewOrModifyAlertViewModel$tryCreatingNewAlert$1.L$2;
            AlertCreateRequest alertCreateRequest3 = (AlertCreateRequest) web3NewOrModifyAlertViewModel$tryCreatingNewAlert$1.L$1;
            jgx = (jGX) web3NewOrModifyAlertViewModel$tryCreatingNewAlert$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
            tokenInfoForAlert2 = tokenInfoForAlert3;
            alertCreateRequest2 = alertCreateRequest3;
        }
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            AlertCreateResponse alertCreateResponse = (AlertCreateResponse) objKWHzl;
            MutableStateFlow<jGT> mutableStateFlow = jgx.copydefault;
            do {
                value = mutableStateFlow.getValue();
                iCopydefault = alertCreateResponse.copydefault();
            } while (!mutableStateFlow.compareAndSet(value, new jGT.StateListAnimator(new AlertDataUiItem(java.lang.String.valueOf(iCopydefault), tokenInfoForAlert2.copydefault(), tokenInfoForAlert2.valueOf(), tokenInfoForAlert2.djBIcL(), alertCreateRequest2.AEQbTJ(), alertCreateRequest2.KWHzl(), alertCreateRequest2.AYXKKw(), alertCreateRequest2.djBIcL(), true, false, false, 1536, null))));
        }
        if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
            MutableStateFlow<jGT> mutableStateFlow2 = jgx.copydefault;
            while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), jGT.Activity.EZpvd)) {
            }
        }
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        this.gEmmrt.copydefault();
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new Web3NewOrModifyAlertViewModel$editAlert$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(EditAlertRequest editAlertRequest, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        Web3NewOrModifyAlertViewModel$tryEditingTheAlert$1 web3NewOrModifyAlertViewModel$tryEditingTheAlert$1;
        java.lang.Object objEZpvd;
        jGX jgx;
        jGT value;
        AlertDataUiItem alertDataUiItemAEQbTJ;
        EditAlertRequest editAlertRequest2 = editAlertRequest;
        if (continuation instanceof Web3NewOrModifyAlertViewModel$tryEditingTheAlert$1) {
            web3NewOrModifyAlertViewModel$tryEditingTheAlert$1 = (Web3NewOrModifyAlertViewModel$tryEditingTheAlert$1) continuation;
            int i = web3NewOrModifyAlertViewModel$tryEditingTheAlert$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                web3NewOrModifyAlertViewModel$tryEditingTheAlert$1.label = i - Integer.MIN_VALUE;
            } else {
                web3NewOrModifyAlertViewModel$tryEditingTheAlert$1 = new Web3NewOrModifyAlertViewModel$tryEditingTheAlert$1(this, continuation);
            }
        }
        java.lang.Object obj = web3NewOrModifyAlertViewModel$tryEditingTheAlert$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = web3NewOrModifyAlertViewModel$tryEditingTheAlert$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C25802jGx c25802jGx = this.gEmmrt;
            web3NewOrModifyAlertViewModel$tryEditingTheAlert$1.L$0 = this;
            web3NewOrModifyAlertViewModel$tryEditingTheAlert$1.L$1 = editAlertRequest2;
            web3NewOrModifyAlertViewModel$tryEditingTheAlert$1.label = 1;
            objEZpvd = c25802jGx.EZpvd(editAlertRequest2, web3NewOrModifyAlertViewModel$tryEditingTheAlert$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            jgx = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            editAlertRequest2 = (EditAlertRequest) web3NewOrModifyAlertViewModel$tryEditingTheAlert$1.L$1;
            jgx = (jGX) web3NewOrModifyAlertViewModel$tryEditingTheAlert$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            ((java.lang.Number) objEZpvd).intValue();
            MutableStateFlow<jGT> mutableStateFlow = jgx.copydefault;
            do {
                value = mutableStateFlow.getValue();
                AlertDataUiItem alertDataUiItem = jgx.AkhnZx;
                if (alertDataUiItem == null) {
                    break;
                }
                alertDataUiItemAEQbTJ = alertDataUiItem.AEQbTJ((1023 & 1) != 0 ? alertDataUiItem.AEQbTJ : null, (1023 & 2) != 0 ? alertDataUiItem.copydefault : null, (1023 & 4) != 0 ? alertDataUiItem.gEmmrt : null, (1023 & 8) != 0 ? alertDataUiItem.AkhnZx : null, (1023 & 16) != 0 ? alertDataUiItem.OLrzqt : null, (1023 & 32) != 0 ? alertDataUiItem.valueOf : editAlertRequest2.AEQbTJ(), (1023 & 64) != 0 ? alertDataUiItem.AhwBna : editAlertRequest2.copydefault(), (1023 & 128) != 0 ? alertDataUiItem.djBIcL : editAlertRequest2.gEmmrt(), (1023 & 256) != 0 ? alertDataUiItem.EZpvd : false, (1023 & 512) != 0 ? alertDataUiItem.KWHzl : false, (1023 & 1024) != 0 ? alertDataUiItem.AYXKKw : false);
                if (alertDataUiItemAEQbTJ == null) {
                    break;
                }
            } while (!mutableStateFlow.compareAndSet(value, new jGT.StateListAnimator(alertDataUiItemAEQbTJ)));
        }
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
            MutableStateFlow<jGT> mutableStateFlow2 = jgx.copydefault;
            while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), jGT.Activity.EZpvd)) {
            }
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull TokenInfoForAlert tokenInfoForAlert) {
        Intrinsics.checkNotNullParameter(tokenInfoForAlert, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new Web3NewOrModifyAlertViewModel$checkTokenSupported$1(this, tokenInfoForAlert, null), 3, null);
    }

    public final void valueOf() {
        jGT value;
        jGT.Fragment fragment;
        if ((this.copydefault.getValue() instanceof jGT.Activity) || (this.copydefault.getValue() instanceof jGT.TaskDescription)) {
            MutableStateFlow<jGT> mutableStateFlow = this.copydefault;
            do {
                value = mutableStateFlow.getValue();
                fragment = this.valueOf;
                if (fragment == null) {
                    return;
                }
            } while (!mutableStateFlow.compareAndSet(value, fragment));
        }
    }

    public final void OLrzqt(@NotNull TokenInfoForAlert tokenInfoForAlert) {
        Intrinsics.checkNotNullParameter(tokenInfoForAlert, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new Web3NewOrModifyAlertViewModel$updateTokenInfo$1(this, tokenInfoForAlert, null), 3, null);
    }

    public final void KWHzl(@NotNull TokenInfoForAlert tokenInfoForAlert) {
        jGT value;
        jGI.TaskDescription taskDescription;
        Intrinsics.checkNotNullParameter(tokenInfoForAlert, "");
        AlertDataUiItem alertDataUiItem = this.AkhnZx;
        if (alertDataUiItem != null) {
            EZpvd(alertDataUiItem.copydefault());
            MutableStateFlow<jGT> mutableStateFlow = this.copydefault;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new jGT.Fragment(tokenInfoForAlert, alertDataUiItem.AEQbTJ(), alertDataUiItem.copydefault(), tokenInfoForAlert.AhwBna(), alertDataUiItem.djBIcL(), alertDataUiItem.valueOf(), false, true, EZpvd(alertDataUiItem.djBIcL())))) {
            }
            return;
        }
        EZpvd(jGI.Companion.AEQbTJ());
        MutableStateFlow<jGT> mutableStateFlow2 = this.copydefault;
        do {
            value = mutableStateFlow2.getValue();
            taskDescription = jGI.Companion;
        } while (!mutableStateFlow2.compareAndSet(value, new jGT.Fragment(tokenInfoForAlert, taskDescription.copydefault(), taskDescription.AEQbTJ(), tokenInfoForAlert.AhwBna(), "", AlertRepeatType.REPEAT, false, false, EZpvd(tokenInfoForAlert.OLrzqt()))));
    }

    public final void EZpvd() {
        AlertDataUiItem alertDataUiItem = this.AkhnZx;
        if (alertDataUiItem != null) {
            C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new Web3NewOrModifyAlertViewModel$deleteAlert$1$1(this, alertDataUiItem, null), 3, null);
        }
    }

    public final java.util.List<C55276xgr> copydefault(@NotNull AlertPromptType alertPromptType) {
        Intrinsics.checkNotNullParameter(alertPromptType, "");
        return this.djBIcL.KWHzl(alertPromptType);
    }

    public static /* synthetic */ java.util.List getTypeSelectionData$default(jGX jgx, AlertPromptType alertPromptType, AlertType alertType, AlertType alertType2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            alertType2 = null;
        }
        return jgx.KWHzl(alertPromptType, alertType, alertType2);
    }

    public final java.util.List<C55276xgr> KWHzl(@NotNull AlertPromptType alertPromptType, @NotNull AlertType alertType, AlertType alertType2) {
        Intrinsics.checkNotNullParameter(alertPromptType, "");
        Intrinsics.checkNotNullParameter(alertType, "");
        return this.djBIcL.copydefault(alertPromptType, alertType, alertType2);
    }

    public final java.util.List<C55276xgr> KWHzl(@NotNull AlertMarketCapUnit alertMarketCapUnit) {
        Intrinsics.checkNotNullParameter(alertMarketCapUnit, "");
        return this.djBIcL.KWHzl(alertMarketCapUnit);
    }

    public final int KWHzl() {
        jGT value = this.copydefault.getValue();
        jGT.Fragment fragment = value instanceof jGT.Fragment ? (jGT.Fragment) value : null;
        if (fragment == null) {
            return 1;
        }
        return fragment.AYXKKw().getMultiplier();
    }

    public final AlertMarketCapUnit EZpvd(java.lang.String str) {
        double dAEQbTJ = C33129mqd.AEQbTJ(str);
        AlertMarketCapUnit alertMarketCapUnit = AlertMarketCapUnit.B;
        if (dAEQbTJ >= alertMarketCapUnit.getMultiplier()) {
            return alertMarketCapUnit;
        }
        AlertMarketCapUnit alertMarketCapUnit2 = AlertMarketCapUnit.M;
        if (dAEQbTJ >= alertMarketCapUnit2.getMultiplier()) {
            return alertMarketCapUnit2;
        }
        AlertMarketCapUnit alertMarketCapUnit3 = AlertMarketCapUnit.K;
        alertMarketCapUnit3.getMultiplier();
        return alertMarketCapUnit3;
    }

    public final void EZpvd(@NotNull AlertMarketCapUnit alertMarketCapUnit) {
        Intrinsics.checkNotNullParameter(alertMarketCapUnit, "");
        jGT value = this.copydefault.getValue();
        jGT.Fragment fragment = value instanceof jGT.Fragment ? (jGT.Fragment) value : null;
        if (fragment == null) {
            return;
        }
        updateInputs$default(this, null, null, C23313hvq.mulCheckS$default(C23313hvq.divCheckS$default(fragment.OLrzqt(), java.lang.Integer.valueOf(KWHzl()), null, null, null, 14, null), java.lang.Integer.valueOf(alertMarketCapUnit.getMultiplier()), null, null, null, 14, null), null, alertMarketCapUnit, 11, null);
    }

    public final boolean KWHzl(AlertPromptType alertPromptType, java.lang.String str, AlertRepeatType alertRepeatType) {
        kotlin.Pair<TokenInfoForAlert, AlertDataUiItem> pair = this.values;
        if (pair != null) {
            java.lang.String strValueOf = pair.getFirst().valueOf();
            TokenInfoForAlert tokenInfoForAlert = this.DbNXlk;
            java.lang.String strValueOf2 = tokenInfoForAlert != null ? tokenInfoForAlert.valueOf() : null;
            if (strValueOf2 == null) {
                strValueOf2 = "";
            }
            if (!Intrinsics.EZpvd((java.lang.Object) strValueOf, (java.lang.Object) strValueOf2) || pair.getSecond().copydefault() != alertPromptType || !C33129mqd.OLrzqt(pair.getSecond().djBIcL(), str) || pair.getSecond().valueOf() != alertRepeatType) {
                return true;
            }
        }
        return false;
    }

    public final void EZpvd(AlertPromptType alertPromptType) {
        if (yDY.gEmmrt(AlertPromptType.PRICE_REACHES, AlertPromptType.PRICE_MOVE_BELOW, AlertPromptType.PRICE_MOVE_ABOVE).contains(alertPromptType)) {
            if (this.DbNXlk != null) {
                values();
            } else {
                this.gEmmrt.copydefault();
            }
        }
    }

    public final void values() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new Web3NewOrModifyAlertViewModel$subscribeToLivePrice$1(this, null), 3, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.gEmmrt.copydefault();
    }

    public final void copydefault(@NotNull TokenInfoForAlert tokenInfoForAlert, AlertDataUiItem alertDataUiItem) {
        AlertDataUiItem alertDataUiItem2 = alertDataUiItem;
        Intrinsics.checkNotNullParameter(tokenInfoForAlert, "");
        this.DbNXlk = tokenInfoForAlert;
        this.AkhnZx = alertDataUiItem2;
        MutableStateFlow<java.lang.String> mutableStateFlow = this.EZpvd;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), tokenInfoForAlert.AhwBna())) {
        }
        MutableStateFlow<java.lang.String> mutableStateFlow2 = this.KWHzl;
        while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), tokenInfoForAlert.OLrzqt())) {
        }
        if (alertDataUiItem2 == null) {
            jGI.TaskDescription taskDescription = jGI.Companion;
            alertDataUiItem2 = new AlertDataUiItem("", tokenInfoForAlert.copydefault(), tokenInfoForAlert.valueOf(), tokenInfoForAlert.djBIcL(), taskDescription.copydefault(), taskDescription.AEQbTJ(), AlertRepeatType.REPEAT, "", true, false, false, 1536, null);
        }
        this.values = C56390yDp.OLrzqt(tokenInfoForAlert, alertDataUiItem2);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new Web3NewOrModifyAlertViewModel$init$3(tokenInfoForAlert, this, null), 3, null);
        KWHzl(tokenInfoForAlert);
    }

    public final void isConnected() {
        MutableStateFlow<InterfaceC25800jGv> mutableStateFlow = this.OLrzqt;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), InterfaceC25800jGv.TaskDescription.KWHzl)) {
        }
    }
}
