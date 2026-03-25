package com.okinc.buysell.ui.paymentmethod;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.okinc.buysell.ui.paymentmethod.PaymentMethodSelectionViewModel;
import com.okinc.buysell.ui.paymentmethod.data.AvailableBalanceParameter;
import com.okinc.buysell.ui.paymentmethod.data.SelectPaymentMethodParameter;
import com.okinc.buysell.ui.paymentmethod.data.SelectPaymentMethodResult;
import com.okinc.buysell.ui.paymentmethod.data.SelectionRow;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.presentation.PaymentAddAccountResult;
import com.okinc.okx.paymentapi.tracking.PaymentsReporterProperty;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC30126lMw;
import o.C31349lsO;
import o.C31351lsQ;
import o.C32866mlf;
import o.C32868mlh;
import o.C32989mnw;
import o.C33070mpX;
import o.C33129mqd;
import o.C43251rlk;
import o.InterfaceC30133lNc;
import o.InterfaceC31430ltq;
import o.InterfaceC47251tmX;
import o.lKA;
import o.lKX;
import o.mHA;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class PaymentMethodSelectionViewModel extends ViewModel {
    public final MutableLiveData<C32989mnw<Pair<Channel, PaymentMethod>>> AkhnZx;
    public final MutableLiveData<C32989mnw<Unit>> AuCTel;
    public final LiveData<C32989mnw<Unit>> AuCTelauCTel;
    public final LiveData<C32989mnw<Unit>> AubY;
    public Channel AwvSrB;
    public PaymentMethod AxsJAY;
    public final LiveData<C32989mnw<Pair<List<SelectionRow>, Fragment>>> DTwDnp;
    public final MutableLiveData<C32989mnw<Boolean>> DbNXlk;
    public final MutableLiveData<C32989mnw<Channel>> KWHzl;
    public ActivityResultLauncher<Intent> OLrzqt;
    public boolean ORxRYg;
    public final LiveData<C32989mnw<AvailableBalanceParameter>> OcIXYQ;
    public final LiveData<C32989mnw<Unit>> QKVWgx;
    public final LiveData<C32989mnw<Channel>> QOLQEE;
    public final LiveData<C32989mnw<Pair<Channel, Fragment>>> QUSxYX;
    public final MutableLiveData<C32989mnw<Channel>> ejfBZ;
    public final MutableLiveData<SelectPaymentMethodResult> fIwbmz;
    public final MutableLiveData<C32989mnw<Unit>> fetchVPNInfo;
    public final LiveData<C32989mnw<Channel>> gHZMYf;
    public final MutableLiveData<C32989mnw<AvailableBalanceParameter>> getNewProxyInstance;
    public final MutableLiveData<C32989mnw<Channel>> hDKMBd;
    public final MutableLiveData<C32989mnw<Pair<List<SelectionRow>, Fragment>>> iwGUEr;
    public final LiveData<SelectPaymentMethodResult> sSMYrx;
    public final MutableLiveData<C32989mnw<Pair<Channel, Fragment>>> uzCIH;
    public final MutableLiveData<C32989mnw<Unit>> valueOf;
    public final LiveData<C32989mnw<Channel>> wlaJM;
    public boolean zLjUOn;
    public final LiveData<C32989mnw<Boolean>> zsXlph;
    public final MutableLiveData<C32989mnw<AbstractC30126lMw<List<Channel>, OKServerException>>> EZpvd = new MutableLiveData<>();
    public final Map<String, Channel> zuBGHE = new LinkedHashMap();
    public final MutableLiveData<C32989mnw<lKX>> fJNWhG = new MutableLiveData<>();
    public final MutableLiveData<C32989mnw<Boolean>> isConnected = new MutableLiveData<>();
    public final MutableLiveData<C32989mnw<InterfaceC31430ltq>> AEQbTJ = new MutableLiveData<>();
    public final MutableLiveData<C32989mnw<ActivityResult>> copydefault = new MutableLiveData<>();
    public final MutableLiveData<C32989mnw<PaymentMethod>> values = new MutableLiveData<>();
    public final MutableLiveData<C32989mnw<SelectPaymentMethodParameter>> fARcdN = new MutableLiveData<>();
    public final MutableLiveData<C32989mnw<ActivityResult>> djBIcL = new MutableLiveData<>();
    public final MutableLiveData<C32989mnw<Unit>> AYXKKw = new MutableLiveData<>();
    public final MutableLiveData<C32989mnw<String>> getFieldNames = new MutableLiveData<>();
    public final MutableLiveData<C32989mnw<Boolean>> gEmmrt = new MutableLiveData<>();
    public final MutableLiveData<C32989mnw<Boolean>> AhwBna = new MutableLiveData<>();

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradeType.values().length];
            try {
                iArr[TradeType.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TradeType.DEPOSIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TradeType.WITHDRAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TradeType.SELL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TradeType.TOPUP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TradeType.STABLECOIN_DEPOSIT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TradeType.ADDFUNDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<AbstractC30126lMw<List<Channel>, OKServerException>>> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> AYXKKw() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Channel>> AkhnZx() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentMethod AuCTel() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Channel>> EZpvd() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.zLjUOn = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(ActivityResultLauncher<Intent> activityResultLauncher) {
        this.OLrzqt = activityResultLauncher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<InterfaceC31430ltq>> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<ActivityResult>> djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<SelectPaymentMethodResult> ejfBZ() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Channel fARcdN() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<lKX>> fIwbmz() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> fJNWhG() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> fetchVPNInfo() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Pair<Channel, PaymentMethod>>> gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Pair<List<SelectionRow>, Fragment>>> getFieldNames() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<AvailableBalanceParameter>> getNewProxyInstance() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Channel>> hDKMBd() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> isConnected() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Pair<Channel, Fragment>>> iwGUEr() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> valueOf() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<SelectPaymentMethodParameter>> values() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zLjUOn() {
        return this.zLjUOn;
    }

    @yCM
    public PaymentMethodSelectionViewModel() {
        MutableLiveData<C32989mnw<Channel>> mutableLiveData = new MutableLiveData<>();
        this.KWHzl = mutableLiveData;
        this.wlaJM = mutableLiveData;
        MutableLiveData<SelectPaymentMethodResult> mutableLiveData2 = new MutableLiveData<>();
        this.fIwbmz = mutableLiveData2;
        this.sSMYrx = mutableLiveData2;
        MutableLiveData<C32989mnw<Channel>> mutableLiveData3 = new MutableLiveData<>();
        this.hDKMBd = mutableLiveData3;
        this.QOLQEE = mutableLiveData3;
        MutableLiveData<C32989mnw<Pair<Channel, Fragment>>> mutableLiveData4 = new MutableLiveData<>();
        this.uzCIH = mutableLiveData4;
        this.QUSxYX = mutableLiveData4;
        MutableLiveData<C32989mnw<Pair<List<SelectionRow>, Fragment>>> mutableLiveData5 = new MutableLiveData<>();
        this.iwGUEr = mutableLiveData5;
        this.DTwDnp = mutableLiveData5;
        MutableLiveData<C32989mnw<Unit>> mutableLiveData6 = new MutableLiveData<>();
        this.fetchVPNInfo = mutableLiveData6;
        this.AuCTelauCTel = mutableLiveData6;
        MutableLiveData<C32989mnw<Channel>> mutableLiveData7 = new MutableLiveData<>();
        this.ejfBZ = mutableLiveData7;
        this.gHZMYf = mutableLiveData7;
        MutableLiveData<C32989mnw<Unit>> mutableLiveData8 = new MutableLiveData<>();
        this.AuCTel = mutableLiveData8;
        this.QKVWgx = mutableLiveData8;
        MutableLiveData<C32989mnw<AvailableBalanceParameter>> mutableLiveData9 = new MutableLiveData<>();
        this.getNewProxyInstance = mutableLiveData9;
        this.OcIXYQ = mutableLiveData9;
        MutableLiveData<C32989mnw<Unit>> mutableLiveData10 = new MutableLiveData<>();
        this.valueOf = mutableLiveData10;
        this.AubY = mutableLiveData10;
        this.AkhnZx = new MutableLiveData<>();
        MutableLiveData<C32989mnw<Boolean>> mutableLiveData11 = new MutableLiveData<>();
        this.DbNXlk = mutableLiveData11;
        this.zsXlph = mutableLiveData11;
    }

    public final TradeType uzCIH() {
        TradeType tradeType;
        SelectPaymentMethodParameter selectPaymentMethodParameter = (SelectPaymentMethodParameter) mHA.OLrzqt.AEQbTJ(this.fARcdN);
        return (selectPaymentMethodParameter == null || (tradeType = selectPaymentMethodParameter.getTradeType()) == null) ? TradeType.BUY : tradeType;
    }

    public final void AuCTelauCTel() {
        mHA.OLrzqt.OLrzqt(this.fetchVPNInfo, Unit.INSTANCE);
    }

    public final void AEQbTJ(boolean z) {
        mHA.OLrzqt.OLrzqt(this.DbNXlk, Boolean.valueOf(z));
    }

    public final void EZpvd(Channel channel) {
        mHA.OLrzqt.OLrzqt(this.ejfBZ, channel);
    }

    public final void AEQbTJ(@NotNull SelectPaymentMethodResult selectPaymentMethodResult) {
        Intrinsics.checkNotNullParameter(selectPaymentMethodResult, "");
        this.zLjUOn = true;
        this.fIwbmz.setValue(selectPaymentMethodResult);
    }

    public final void OLrzqt() {
        mHA.OLrzqt.OLrzqt(this.valueOf, Unit.INSTANCE);
    }

    public final void AubY() {
        mHA.OLrzqt.OLrzqt(this.AuCTel, Unit.INSTANCE);
    }

    public final void EZpvd(@NotNull AvailableBalanceParameter availableBalanceParameter) {
        Intrinsics.checkNotNullParameter(availableBalanceParameter, "");
        mHA.OLrzqt.OLrzqt(this.getNewProxyInstance, availableBalanceParameter);
    }

    public final void KWHzl(@NotNull Channel channel, @NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(channel, "");
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        mHA.OLrzqt.OLrzqt(this.AkhnZx, new Pair(channel, paymentMethod));
    }

    public final void AEQbTJ(@NotNull Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "");
        mHA.OLrzqt.OLrzqt(this.hDKMBd, channel);
    }

    public final void copydefault(@NotNull Channel channel, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(channel, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        mHA.OLrzqt.OLrzqt(this.uzCIH, new Pair(channel, fragment));
    }

    public final void OLrzqt(List<? extends SelectionRow> list, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        mHA mha = mHA.OLrzqt;
        MutableLiveData<C32989mnw<Pair<List<SelectionRow>, Fragment>>> mutableLiveData = this.iwGUEr;
        if (list == null) {
            list = yDY.AhwBna();
        }
        mha.OLrzqt(mutableLiveData, new Pair(list, fragment));
    }

    public final void wlaJM() {
        mHA.OLrzqt.OLrzqt(this.isConnected, Boolean.TRUE);
    }

    public final void zsXlph() {
        this.ORxRYg = true;
        mHA.OLrzqt.OLrzqt(this.AhwBna, Boolean.TRUE);
    }

    public final void AEQbTJ(@NotNull InterfaceC31430ltq interfaceC31430ltq) {
        Intrinsics.checkNotNullParameter(interfaceC31430ltq, "");
        mHA.OLrzqt.OLrzqt(this.AEQbTJ, interfaceC31430ltq);
    }

    public final void EZpvd(@NotNull AbstractC30126lMw<? extends List<Channel>, OKServerException> abstractC30126lMw) {
        Intrinsics.checkNotNullParameter(abstractC30126lMw, "");
        mHA.OLrzqt.OLrzqt(this.EZpvd, abstractC30126lMw);
    }

    public final void OLrzqt(Channel channel) {
        if (channel != null) {
            mHA.OLrzqt.OLrzqt(this.KWHzl, channel);
        }
    }

    public final void copydefault(Channel channel) {
        Channel channel2 = this.AwvSrB;
        if (!Intrinsics.EZpvd((Object) (channel2 != null ? channel2.getDepositPlatformCode() : null), (Object) (channel != null ? channel.getDepositPlatformCode() : null))) {
            this.AxsJAY = null;
        }
        this.AwvSrB = channel;
        if (channel == null) {
            this.AxsJAY = null;
            this.fJNWhG.setValue(new C32989mnw<>(new lKX(null, null)));
        }
    }

    public final String KWHzl() {
        String depositName;
        Channel channel = this.AwvSrB;
        return (channel == null || (depositName = channel.getDepositName()) == null) ? "" : depositName;
    }

    public final void KWHzl(PaymentMethod paymentMethod) {
        if (paymentMethod == null) {
            this.fJNWhG.setValue(new C32989mnw<>(new lKX(this.AwvSrB, null)));
        } else {
            this.fJNWhG.setValue(new C32989mnw<>(new lKX(this.AwvSrB, paymentMethod)));
        }
        this.AxsJAY = paymentMethod;
    }

    public final String DbNXlk() {
        String paymentMethod;
        PaymentMethod paymentMethod2 = this.AxsJAY;
        return (paymentMethod2 == null || (paymentMethod = paymentMethod2.getPaymentMethod()) == null) ? "" : paymentMethod;
    }

    public final void OLrzqt(@NotNull ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(activityResult, "");
        mHA.OLrzqt.OLrzqt(this.copydefault, activityResult);
    }

    public final void KWHzl(@NotNull SelectPaymentMethodParameter selectPaymentMethodParameter) {
        Intrinsics.checkNotNullParameter(selectPaymentMethodParameter, "");
        mHA.OLrzqt.OLrzqt(this.fARcdN, selectPaymentMethodParameter);
    }

    public static /* synthetic */ void startPayPalFlow$default(PaymentMethodSelectionViewModel paymentMethodSelectionViewModel, Context context, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        paymentMethodSelectionViewModel.KWHzl(context, str, z);
    }

    public final void KWHzl(@NotNull Context context, @NotNull String str, final boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class)).EZpvd(context, str, new Function1() { // from class: o.lKT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return PaymentMethodSelectionViewModel.copydefault(this.copydefault, z, (PaymentAddAccountResult.ThirdPartyFinalState) obj);
            }
        });
    }

    public static final Unit copydefault(PaymentMethodSelectionViewModel paymentMethodSelectionViewModel, boolean z, PaymentAddAccountResult.ThirdPartyFinalState thirdPartyFinalState) {
        Intrinsics.checkNotNullParameter(thirdPartyFinalState, "");
        if (thirdPartyFinalState instanceof PaymentAddAccountResult.ThirdPartyFinalState.Exit) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.onEvent$default("DepositFiatAddAccountQuit_Sheet_FullPage_View", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (Object) null);
        } else if (thirdPartyFinalState instanceof PaymentAddAccountResult.ThirdPartyFinalState.Success) {
            paymentMethodSelectionViewModel.AEQbTJ(InterfaceC31430ltq.TaskDescription.EZpvd);
        } else if (thirdPartyFinalState instanceof PaymentAddAccountResult.ThirdPartyFinalState.Failure) {
            paymentMethodSelectionViewModel.AEQbTJ(new InterfaceC31430ltq.PendingIntent(((PaymentAddAccountResult.ThirdPartyFinalState.Failure) thirdPartyFinalState).EZpvd().OLrzqt()));
        }
        if (z) {
            paymentMethodSelectionViewModel.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull TradeType tradeType, @NotNull Function1<? super lKA, Unit> function1, @NotNull Function1<? super lKA, Unit> function12) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        switch (ActionBar.copydefault[tradeType.ordinal()]) {
            case 1:
            case 2:
            case 3:
                if (this.ORxRYg || this.AxsJAY == null) {
                    function12.invoke(lKA.Application.copydefault);
                    this.ORxRYg = false;
                } else {
                    function1.invoke(lKA.ActionBar.KWHzl);
                }
                this.ORxRYg = false;
                return;
            case 4:
                function1.invoke(lKA.ActionBar.KWHzl);
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void OLrzqt(@NotNull List<Channel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            EZpvd(new AbstractC30126lMw.Application(list));
        } else {
            EZpvd(new AbstractC30126lMw.Application(list));
        }
    }

    public final int copydefault(@NotNull List<? extends InterfaceC30133lNc> list) {
        Object obj;
        Object next;
        Intrinsics.checkNotNullParameter(list, "");
        Channel channelFARcdN = fARcdN();
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            InterfaceC30133lNc interfaceC30133lNc = (InterfaceC30133lNc) next;
            if (interfaceC30133lNc.fARcdN().getBestChannel() && interfaceC30133lNc.gEmmrt()) {
                break;
            }
        }
        InterfaceC30133lNc interfaceC30133lNc2 = (InterfaceC30133lNc) next;
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (Intrinsics.EZpvd((Object) ((InterfaceC30133lNc) next2).fARcdN().getDepositPlatformCode(), (Object) (channelFARcdN != null ? channelFARcdN.getDepositPlatformCode() : null))) {
                obj = next2;
                break;
            }
        }
        InterfaceC30133lNc interfaceC30133lNc3 = (InterfaceC30133lNc) obj;
        if (channelFARcdN != null && interfaceC30133lNc3 != null) {
            return list.indexOf(interfaceC30133lNc3);
        }
        if (interfaceC30133lNc2 != null) {
            return list.indexOf(interfaceC30133lNc2);
        }
        Iterator<? extends InterfaceC30133lNc> it3 = list.iterator();
        int i = 0;
        while (it3.hasNext()) {
            if (it3.next().gEmmrt()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void KWHzl(@NotNull Channel channel) {
        String type = "";
        Intrinsics.checkNotNullParameter(channel, "");
        SelectPaymentMethodParameter selectPaymentMethodParameter = (SelectPaymentMethodParameter) mHA.OLrzqt.AEQbTJ(this.fARcdN);
        TradeType tradeType = selectPaymentMethodParameter != null ? selectPaymentMethodParameter.getTradeType() : null;
        int i = tradeType == null ? -1 : ActionBar.copydefault[tradeType.ordinal()];
        if (i == 2) {
            type = PaymentsReporterProperty.PaymentsReportAttrType.DEPOSIT.getType();
        } else if (i == 3) {
            type = PaymentsReporterProperty.PaymentsReportAttrType.WITHDRAW.getType();
        }
        if (C33129mqd.OLrzqt((CharSequence) type)) {
            C31349lsO.EZpvd.AEQbTJ(PaymentsReporterProperty.PaymentsReportAttrPage.PAYMENT_LIST.getType(), type, channel.getDepositName());
        }
    }

    public final void KWHzl(@NotNull final String str) {
        final String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        SelectPaymentMethodParameter selectPaymentMethodParameter = (SelectPaymentMethodParameter) mHA.OLrzqt.AEQbTJ(this.fARcdN);
        TradeType tradeType = selectPaymentMethodParameter != null ? selectPaymentMethodParameter.getTradeType() : null;
        int i = tradeType == null ? -1 : ActionBar.copydefault[tradeType.ordinal()];
        if (i == 1) {
            str2 = "buy";
        } else if (i == 4) {
            str2 = "sell";
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("PaymentMethod_Full_Button_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lKS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return PaymentMethodSelectionViewModel.AEQbTJ(this.copydefault, str, str2, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(PaymentMethodSelectionViewModel paymentMethodSelectionViewModel, String str, String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("payment_channel", paymentMethodSelectionViewModel.KWHzl(), false);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str, true);
        eventParamsList.put("flow", str2, false);
        return Unit.INSTANCE;
    }

    public final Pair<String, Integer> EZpvd(@NotNull InterfaceC31430ltq interfaceC31430ltq) {
        String strAYXKKw;
        lKX lkxOLrzqt;
        Channel channelEZpvd;
        String strAYXKKw2 = "";
        Intrinsics.checkNotNullParameter(interfaceC31430ltq, "");
        int i = 2;
        if (interfaceC31430ltq instanceof InterfaceC31430ltq.TaskDescription) {
            C32989mnw<lKX> value = fIwbmz().getValue();
            if (value != null && (lkxOLrzqt = value.OLrzqt()) != null && (channelEZpvd = lkxOLrzqt.EZpvd()) != null) {
                channelEZpvd.getDepositName();
            }
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.run);
        } else if (interfaceC31430ltq instanceof InterfaceC31430ltq.Activity) {
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.iHkeWl);
        } else if (interfaceC31430ltq instanceof InterfaceC31430ltq.ActionBar) {
            strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.DCUTEIdCUTEI);
        } else {
            if (interfaceC31430ltq instanceof InterfaceC31430ltq.Application) {
                strAYXKKw2 = ((InterfaceC31430ltq.Application) interfaceC31430ltq).copydefault();
                if (strAYXKKw2 == null) {
                    strAYXKKw2 = C33070mpX.AYXKKw(C31351lsQ.Activity.fHqPtx);
                }
            } else if (interfaceC31430ltq instanceof InterfaceC31430ltq.StateListAnimator) {
                strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.giSNqX);
            } else if (interfaceC31430ltq instanceof InterfaceC31430ltq.LoaderManager) {
                strAYXKKw2 = C33070mpX.AYXKKw(C31351lsQ.Activity.fHqPtx);
            } else if (interfaceC31430ltq instanceof InterfaceC31430ltq.FragmentManager) {
                strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.DGOPHZ);
            } else if (interfaceC31430ltq instanceof InterfaceC31430ltq.Dialog) {
                strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.DCUTEIddSDPG);
            } else {
                if (!(interfaceC31430ltq instanceof InterfaceC31430ltq.PendingIntent)) {
                    throw new NoWhenBranchMatchedException();
                }
                String strOLrzqt = ((InterfaceC31430ltq.PendingIntent) interfaceC31430ltq).OLrzqt();
                if (strOLrzqt != null) {
                    strAYXKKw2 = strOLrzqt;
                }
            }
            i = 5;
            strAYXKKw = strAYXKKw2;
        }
        return new Pair<>(strAYXKKw, Integer.valueOf(i));
    }
}
