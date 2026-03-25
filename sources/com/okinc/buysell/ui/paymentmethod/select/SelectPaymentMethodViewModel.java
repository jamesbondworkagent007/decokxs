package com.okinc.buysell.ui.paymentmethod.select;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.buysell.data.BannerFlowType;
import com.okinc.buysell.data.BannerPageNames;
import com.okinc.buysell.ui.paymentmethod.data.BuySellParameter;
import com.okinc.buysell.ui.paymentmethod.data.SelectPaymentMethodParameter;
import com.okinc.buysell.ui.paymentmethod.data.SelectionRow;
import com.okinc.buysell.ui.paymentmethod.select.SelectPaymentMethodViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.management.Account;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import com.okinc.okpaymentapi.data.remote.model.management.EarnOption;
import com.okinc.okpaymentapi.data.remote.model.management.LimitInfo;
import com.okinc.okpaymentapi.data.remote.model.management.Localization;
import com.okinc.okpaymentapi.data.remote.model.management.LocalizationHighlightStyle;
import com.okinc.okpaymentapi.data.remote.model.management.OrderType;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethodCategory;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.service.DexTokenParameters;
import com.okinc.okx.paymentapi.tracking.PaymentsReporterProperty;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC30126lMw;
import o.AbstractC30156lNz;
import o.C30326lUf;
import o.C31349lsO;
import o.C31351lsQ;
import o.C31354lsT;
import o.C31661lzi;
import o.C31662lzj;
import o.C32866mlf;
import o.C32868mlh;
import o.C32989mnw;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C34754niS;
import o.C38307pTy;
import o.C43251rlk;
import o.C46876tfT;
import o.C56390yDp;
import o.C56403yEb;
import o.C56423yEv;
import o.InterfaceC30133lNc;
import o.InterfaceC31670lzr;
import o.lMD;
import o.lyG;
import o.lyI;
import o.lyM;
import o.lzT;
import o.mHA;
import o.pTB;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SelectPaymentMethodViewModel extends lzT {
    public final MutableLiveData<C32989mnw<Boolean>> AYXKKw;
    public final MutableLiveData<C32989mnw<List<SelectionRow>>> AhwBna;
    public final List<SelectionRow> AkhnZx;
    public boolean AuCTel;
    public final MutableLiveData<C32989mnw<Boolean>> DbNXlk;
    public final MutableLiveData<C32989mnw<Boolean>> EZpvd;
    public final MutableLiveData<C32989mnw<AbstractC30126lMw<List<Channel>, OKServerException>>> djBIcL;
    public BannerFlowType ejfBZ;
    public final lyI fARcdN;
    public final lyM fIwbmz;
    public boolean fJNWhG;
    public final lyG fetchVPNInfo;
    public final MutableLiveData<C32989mnw<lMD<PaymentMethod, OKServerException>>> gEmmrt;
    public List<? extends AbstractC30156lNz> getNewProxyInstance;
    public List<? extends InterfaceC30133lNc> hDKMBd;
    public final LiveData<C32989mnw<Boolean>> isConnected;
    public SelectPaymentMethodParameter iwGUEr;
    public String uzCIH;
    public final MutableLiveData<C32989mnw<List<Channel>>> valueOf;
    public final LiveData<C32989mnw<Boolean>> values;

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
                iArr[TradeType.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TradeType.DEPOSIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TradeType.WITHDRAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TradeType.TOPUP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TradeType.ADDFUNDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TradeType.STABLECOIN_DEPOSIT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(@NotNull Channel channel, @NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(channel, "");
        Intrinsics.checkNotNullParameter(paymentMethod, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SelectionRow> AkhnZx() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<lMD<PaymentMethod, OKServerException>>> AuCTel() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.AuCTel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzT
    public String KWHzl() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull BannerFlowType bannerFlowType) {
        Intrinsics.checkNotNullParameter(bannerFlowType, "");
        this.ejfBZ = bannerFlowType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzT
    public BannerFlowType copydefault() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uzCIH = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(@NotNull List<? extends AbstractC30156lNz> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.getNewProxyInstance = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.lNc>, java.util.List<o.lNc> */
    public final List<InterfaceC30133lNc> ejfBZ() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.lNz>, java.util.List<o.lNz> */
    public final List<AbstractC30156lNz> fARcdN() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<List<Channel>>> fIwbmz() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(@NotNull List<? extends InterfaceC30133lNc> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.hDKMBd = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> getNewProxyInstance() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<List<SelectionRow>>> hDKMBd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<AbstractC30126lMw<List<Channel>, OKServerException>>> isConnected() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelectPaymentMethodParameter uzCIH() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> values() {
        return this.isConnected;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public SelectPaymentMethodViewModel(@NotNull lyI lyi, @NotNull lyG lyg, @NotNull lyM lym) {
        super(lym);
        Intrinsics.checkNotNullParameter(lyi, "");
        Intrinsics.checkNotNullParameter(lyg, "");
        Intrinsics.checkNotNullParameter(lym, "");
        this.fARcdN = lyi;
        this.fetchVPNInfo = lyg;
        this.fIwbmz = lym;
        this.uzCIH = BannerPageNames.DEPOSIT_WITHDRAW_METHOD_SELECTION.getPageName();
        this.ejfBZ = BannerFlowType.DEPOSIT;
        this.iwGUEr = new SelectPaymentMethodParameter((String) null, (String) null, (String) null, (TradeType) null, (BuySellParameter) null, 0, false, false, (List) null, false, false, (Channel) null, (PaymentMethod) null, (List) null, (DexTokenParameters) null, 32767, (DefaultConstructorMarker) null);
        this.valueOf = new MutableLiveData<>();
        MutableLiveData<C32989mnw<Boolean>> mutableLiveData = new MutableLiveData<>();
        this.DbNXlk = mutableLiveData;
        this.values = mutableLiveData;
        this.hDKMBd = yDY.AhwBna();
        this.getNewProxyInstance = yDY.AhwBna();
        this.gEmmrt = new MutableLiveData<>();
        this.djBIcL = new MutableLiveData<>();
        this.AkhnZx = new ArrayList();
        MutableLiveData<C32989mnw<Boolean>> mutableLiveData2 = new MutableLiveData<>();
        this.EZpvd = mutableLiveData2;
        this.isConnected = mutableLiveData2;
        this.AhwBna = new MutableLiveData<>();
        this.AYXKKw = new MutableLiveData<>();
    }

    public static /* synthetic */ void getPaymentChannels$default(SelectPaymentMethodViewModel selectPaymentMethodViewModel, boolean z, SelectPaymentMethodParameter selectPaymentMethodParameter, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        selectPaymentMethodViewModel.copydefault(z, selectPaymentMethodParameter);
    }

    public final void copydefault(boolean z, @NotNull SelectPaymentMethodParameter selectPaymentMethodParameter) {
        Intrinsics.checkNotNullParameter(selectPaymentMethodParameter, "");
        this.iwGUEr = selectPaymentMethodParameter;
        if (z) {
            KWHzl(selectPaymentMethodParameter.getCachedChannelList());
        } else {
            fJNWhG();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.buysell.ui.paymentmethod.select.SelectPaymentMethodViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getBuySellPaymentChannelsV3$default(SelectPaymentMethodViewModel selectPaymentMethodViewModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        selectPaymentMethodViewModel.KWHzl((List<Channel>) list);
    }

    public final void KWHzl(List<Channel> list) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SelectPaymentMethodViewModel$getBuySellPaymentChannelsV3$1(this, list, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: o.lUf */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.buysell.ui.paymentmethod.select.SelectPaymentMethodViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(final List<Channel> list) {
        List arrayList;
        final String str;
        final String str2;
        if (this.AuCTel) {
            arrayList = OLrzqt(list);
        } else {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Channel) obj).getCategoryCode() != ChannelCategoryCode.THIRD_PARTY) {
                    arrayList.add(obj);
                }
            }
        }
        mHA mha = mHA.OLrzqt;
        mha.OLrzqt(this.valueOf, arrayList);
        this.fJNWhG = C30326lUf.KWHzl.copydefault((List<Channel>) arrayList);
        List<SelectionRow> listAEQbTJ = AEQbTJ((List<Channel>) arrayList);
        mha.OLrzqt(this.AhwBna, listAEQbTJ);
        switch (ActionBar.copydefault[this.iwGUEr.getTradeType().ordinal()]) {
            case 1:
                str = "buy";
                break;
            case 2:
                str = "sell";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                str = "unknown";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if ((listAEQbTJ instanceof Collection) && listAEQbTJ.isEmpty()) {
            str2 = "no";
        } else {
            for (SelectionRow selectionRow : listAEQbTJ) {
                if ((selectionRow instanceof SelectionRow.PaymentMethodStablecoinItem) && C33129mqd.OLrzqt((CharSequence) ((SelectionRow.PaymentMethodStablecoinItem) selectionRow).AhwBna())) {
                    str2 = "yes";
                }
            }
            str2 = "no";
        }
        if (this.fJNWhG) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("PaymentMethod_ReturnUsers_BottomSheet_View", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lMU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return SelectPaymentMethodViewModel.OLrzqt(str, list, str2, (EventParamsList) obj2);
                }
            });
        } else {
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("PaymentMethod_NewUsers_BottomSheet_View", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lMX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return SelectPaymentMethodViewModel.AEQbTJ(str, list, str2, (EventParamsList) obj2);
                }
            });
        }
    }

    public static final Unit OLrzqt(String str, List list, String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "flow", str, false, 4, null);
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Channel) it.next()).getDepositName());
        }
        EventParamsList.put$default(eventParamsList, "payment_methods", C33129mqd.gEmmrt(CollectionsKt___CollectionsKt.QbewEr(arrayList)), false, 4, null);
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Channel) it2.next()).getSupportCurrency());
        }
        EventParamsList.put$default(eventParamsList, "currency", C33129mqd.gEmmrt(CollectionsKt___CollectionsKt.QbewEr(arrayList2)), false, 4, null);
        EventParamsList.put$default(eventParamsList, "stablecoin_upsell", C33129mqd.gEmmrt(str2), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(String str, List list, String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "flow", str, false, 4, null);
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Channel) it.next()).getDepositName());
        }
        EventParamsList.put$default(eventParamsList, "payment_methods", C33129mqd.gEmmrt(CollectionsKt___CollectionsKt.QbewEr(arrayList)), false, 4, null);
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Channel) it2.next()).getSupportCurrency());
        }
        EventParamsList.put$default(eventParamsList, "currency", C33129mqd.gEmmrt(CollectionsKt___CollectionsKt.QbewEr(arrayList2)), false, 4, null);
        EventParamsList.put$default(eventParamsList, "stablecoin_upsell", C33129mqd.gEmmrt(str2), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull final Channel channel, boolean z) {
        final String str;
        Intrinsics.checkNotNullParameter(channel, "");
        switch (ActionBar.copydefault[this.iwGUEr.getTradeType().ordinal()]) {
            case 1:
                str = "buy";
                break;
            case 2:
                str = "sell";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                str = "unknown";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        final String str2 = z ? "yes" : "no";
        if (this.fJNWhG) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("PaymentMethod_ReturnUsers_BottomSheet_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lMS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SelectPaymentMethodViewModel.KWHzl(str, channel, str2, (EventParamsList) obj);
                }
            });
        } else {
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("PaymentMethod_NewUsers_BottomSheet_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lMQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SelectPaymentMethodViewModel.copydefault(str, channel, str2, (EventParamsList) obj);
                }
            });
        }
    }

    public static final Unit KWHzl(String str, Channel channel, String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "flow", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.EXTRA_PAYMENT_METHOD, channel.getDepositName(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "currency", channel.getSupportCurrency(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "stablecoin_upsell", str2, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(String str, Channel channel, String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "flow", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.EXTRA_PAYMENT_METHOD, channel.getDepositName(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "currency", channel.getSupportCurrency(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "stablecoin_upsell", str2, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void fJNWhG() {
        mHA.OLrzqt.OLrzqt(this.djBIcL, AbstractC30126lMw.ActionBar.AEQbTJ);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SelectPaymentMethodViewModel$getPaymentChannels$1(this, null), 3, null);
    }

    public final boolean copydefault(Channel channel) {
        Channel userSelectedChannel;
        if (this.iwGUEr.isRecurringEdit() && (userSelectedChannel = this.iwGUEr.getUserSelectedChannel()) != null) {
            return (Intrinsics.EZpvd((Object) channel.getSupportCurrency(), (Object) userSelectedChannel.getSupportCurrency()) ^ true) || (channel.getPaymentMethodCategory() != userSelectedChannel.getPaymentMethodCategory());
        }
        return false;
    }

    public final Channel AEQbTJ(@NotNull String str, @NotNull String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32989mnw<List<Channel>> value = this.valueOf.getValue();
        Object obj = null;
        List<Channel> listOLrzqt = value != null ? value.OLrzqt() : null;
        if (listOLrzqt == null) {
            listOLrzqt = yDY.AhwBna();
        }
        for (Object obj2 : listOLrzqt) {
            Channel channel = (Channel) obj2;
            boolean zEZpvd = Intrinsics.EZpvd((Object) channel.getDepositPlatformCode(), (Object) ChannelPlatformCode.BALANCE.getCode());
            if (z) {
                if (C31662lzj.gEmmrt(channel) && Intrinsics.EZpvd((Object) channel.getDepositPlatformCode(), (Object) str) && (!zEZpvd || Intrinsics.EZpvd((Object) channel.getSupportCurrency(), (Object) str2))) {
                    obj = obj2;
                    break;
                }
            } else if (z2) {
                if (C31662lzj.AhwBna(channel) && Intrinsics.EZpvd((Object) channel.getDepositPlatformCode(), (Object) str) && (!zEZpvd || Intrinsics.EZpvd((Object) channel.getSupportCurrency(), (Object) str2))) {
                    obj = obj2;
                    break;
                }
            } else if (channel.getPaymentMethodCategory() == PaymentMethodCategory.CASH && Intrinsics.EZpvd((Object) channel.getDepositPlatformCode(), (Object) str) && (!zEZpvd || Intrinsics.EZpvd((Object) channel.getSupportCurrency(), (Object) str2))) {
                obj = obj2;
                break;
            }
        }
        Channel channel2 = (Channel) obj;
        return channel2 == null ? (Channel) CollectionsKt___CollectionsKt.firstOrNull(listOLrzqt) : channel2;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SelectionRow.PaymentMethodItem copydefault(Channel channel, PaymentMethod paymentMethod) {
        String brand;
        String str;
        String bankAccountType;
        String str2;
        Account account;
        Account account2 = paymentMethod.getAccount();
        String bankName = account2 != null ? account2.getBankName() : null;
        if (bankName == null || bankName.length() == 0) {
            if (Intrinsics.EZpvd((Object) channel.getDepositPlatformCode(), (Object) ChannelPlatformCode.BUY_IDEAL.getCode()) || Intrinsics.EZpvd((Object) channel.getDepositPlatformCode(), (Object) ChannelPlatformCode.GOOGLE_PAY.getCode()) || Intrinsics.EZpvd((Object) channel.getDepositPlatformCode(), (Object) ChannelPlatformCode.BLIK_BUY.getCode()) || Intrinsics.EZpvd((Object) channel.getDepositPlatformCode(), (Object) ChannelPlatformCode.GRAB_PAY.getCode())) {
                brand = channel.getDisplayName();
            } else {
                Account account3 = paymentMethod.getAccount();
                if (account3 != null) {
                    brand = account3.getBrand();
                }
                str = null;
            }
            str = brand;
        } else {
            Account account4 = paymentMethod.getAccount();
            if (account4 != null) {
                brand = account4.getBankName();
                str = brand;
            }
            str = null;
        }
        Account account5 = paymentMethod.getAccount();
        String last4 = account5 != null ? account5.getLast4() : null;
        String str3 = last4 == null ? "" : last4;
        if (Intrinsics.EZpvd((Object) channel.getDepositPlatformCode(), (Object) ChannelPlatformCode.BUY_PAYPAL.getCode())) {
            bankAccountType = C30326lUf.KWHzl.OLrzqt(channel, paymentMethod, true);
        } else {
            String depositPlatformCode = channel.getDepositPlatformCode();
            ChannelPlatformCode channelPlatformCode = ChannelPlatformCode.GOOGLE_PAY;
            if (Intrinsics.EZpvd((Object) depositPlatformCode, (Object) channelPlatformCode.getCode()) && channel.getGooglePaySupportedButNotSetup()) {
                bankAccountType = C33070mpX.AYXKKw(C31351lsQ.Activity.fiXcQa);
            } else if (Intrinsics.EZpvd((Object) channel.getDepositPlatformCode(), (Object) channelPlatformCode.getCode()) && (account = paymentMethod.getAccount()) != null && !account.getAllowCreditCard()) {
                bankAccountType = C33070mpX.AYXKKw(C31351lsQ.Activity.ExKek);
            } else {
                Account account6 = paymentMethod.getAccount();
                bankAccountType = account6 != null ? account6.getBankAccountType() : null;
                if (bankAccountType == null) {
                    str2 = "";
                }
                C30326lUf c30326lUf = C30326lUf.KWHzl;
                String strCopydefault = c30326lUf.copydefault(channel, paymentMethod);
                String strAEQbTJ = c30326lUf.AEQbTJ(channel, paymentMethod, false, 2, channel.getSupportCurrency());
                String strEZpvd = c30326lUf.EZpvd(channel);
                String depositPlatformCode2 = channel.getDepositPlatformCode();
                int code = channel.getCategoryCode().getCode();
                boolean z = channel.getLimitInfo() == null;
                Account account7 = paymentMethod.getAccount();
                return new SelectionRow.PaymentMethodItem(str, str3, str2, strCopydefault, strAEQbTJ, strEZpvd, false, depositPlatformCode2, code, z, account7 != null ? account7.getPaymentAccountId() : null, channel.getSupportCurrency(), channel.getGooglePaySupportedButNotSetup(), copydefault(channel));
            }
        }
        str2 = bankAccountType;
        C30326lUf c30326lUf2 = C30326lUf.KWHzl;
        String strCopydefault2 = c30326lUf2.copydefault(channel, paymentMethod);
        String strAEQbTJ2 = c30326lUf2.AEQbTJ(channel, paymentMethod, false, 2, channel.getSupportCurrency());
        String strEZpvd2 = c30326lUf2.EZpvd(channel);
        String depositPlatformCode22 = channel.getDepositPlatformCode();
        int code2 = channel.getCategoryCode().getCode();
        if (channel.getLimitInfo() == null) {
        }
        Account account72 = paymentMethod.getAccount();
        return new SelectionRow.PaymentMethodItem(str, str3, str2, strCopydefault2, strAEQbTJ2, strEZpvd2, false, depositPlatformCode22, code2, z, account72 != null ? account72.getPaymentAccountId() : null, channel.getSupportCurrency(), channel.getGooglePaySupportedButNotSetup(), copydefault(channel));
    }

    public final SelectionRow.CardVerificationItem OLrzqt(Channel channel, PaymentMethod paymentMethod) {
        Account account = paymentMethod.getAccount();
        String brand = account != null ? account.getBrand() : null;
        Account account2 = paymentMethod.getAccount();
        String last4 = account2 != null ? account2.getLast4() : null;
        if (last4 == null) {
            last4 = "";
        }
        String str = last4;
        String strCopydefault = C30326lUf.KWHzl.copydefault(channel, paymentMethod);
        String depositPlatformCode = channel.getDepositPlatformCode();
        Account account3 = paymentMethod.getAccount();
        return new SelectionRow.CardVerificationItem(brand, str, "", strCopydefault, "", depositPlatformCode, false, account3 != null ? account3.getPaymentAccountId() : null, channel, 64, null);
    }

    public final SelectionRow.AchRelinkItem EZpvd(Channel channel, PaymentMethod paymentMethod) {
        String brand;
        String str;
        Account account = paymentMethod.getAccount();
        String bankName = account != null ? account.getBankName() : null;
        if (bankName != null && bankName.length() != 0) {
            Account account2 = paymentMethod.getAccount();
            if (account2 != null) {
                brand = account2.getBankName();
                str = brand;
            }
            str = null;
        } else {
            Account account3 = paymentMethod.getAccount();
            if (account3 != null) {
                brand = account3.getBrand();
                str = brand;
            }
            str = null;
        }
        Account account4 = paymentMethod.getAccount();
        String last4 = account4 != null ? account4.getLast4() : null;
        String str2 = last4 == null ? "" : last4;
        Account account5 = paymentMethod.getAccount();
        String bankAccountType = account5 != null ? account5.getBankAccountType() : null;
        String str3 = bankAccountType == null ? "" : bankAccountType;
        String strCopydefault = C30326lUf.KWHzl.copydefault(channel, paymentMethod);
        String depositPlatformCode = channel.getDepositPlatformCode();
        Account account6 = paymentMethod.getAccount();
        return new SelectionRow.AchRelinkItem(str, str2, str3, strCopydefault, "", depositPlatformCode, false, account6 != null ? account6.getPaymentAccountId() : null, channel, 64, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SelectionRow.AddPaymentMethodItem EZpvd(Channel channel) {
        String singleTransactionMax;
        String strCopydefault;
        String str;
        Localization localization = channel.getLocalization();
        if (C33129mqd.OLrzqt((CharSequence) (localization != null ? localization.getSingleTransactionLimitForDisplay() : null))) {
            Localization localization2 = channel.getLocalization();
            if (localization2 == null) {
                str = null;
                String displayName = channel.getDisplayName();
                Localization localization3 = channel.getLocalization();
                String feeRateForDisplay = localization3 == null ? localization3.getFeeRateForDisplay() : null;
                String strCopydefault2 = C30326lUf.KWHzl.copydefault(channel);
                LocalizationHighlightStyle localizationHighlightStyle = channel.getLocalizationHighlightStyle();
                String feeRateForDisplay2 = localizationHighlightStyle == null ? localizationHighlightStyle.getFeeRateForDisplay() : null;
                LocalizationHighlightStyle localizationHighlightStyle2 = channel.getLocalizationHighlightStyle();
                return new SelectionRow.AddPaymentMethodItem(displayName, feeRateForDisplay, str, strCopydefault2, feeRateForDisplay2, localizationHighlightStyle2 != null ? localizationHighlightStyle2.getSingleTransactionLimitForDisplay() : null, channel.getDepositPlatformCode(), channel);
            }
            strCopydefault = localization2.getSingleTransactionLimitForDisplay();
        } else {
            if (C33129mqd.OLrzqt((CharSequence) channel.getMaxLimitAmount())) {
                singleTransactionMax = channel.getMaxLimitAmount();
            } else {
                LimitInfo limitInfo = channel.getLimitInfo();
                if (limitInfo == null || (singleTransactionMax = limitInfo.getSingleTransactionMax()) == null) {
                    singleTransactionMax = "";
                }
            }
            strCopydefault = C33069mpW.copydefault(C31351lsQ.Activity.gUEfcq, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C31661lzi.prependFiatSymbol$default(C33129mqd.gEmmrt(singleTransactionMax), channel.getSupportCurrency(), channel.getCurrencySymbol(), C38307pTy.Companion.AEQbTJ(2), null, false, 24, null))));
        }
        str = strCopydefault;
        String displayName2 = channel.getDisplayName();
        Localization localization32 = channel.getLocalization();
        if (localization32 == null) {
        }
        String strCopydefault22 = C30326lUf.KWHzl.copydefault(channel);
        LocalizationHighlightStyle localizationHighlightStyle3 = channel.getLocalizationHighlightStyle();
        if (localizationHighlightStyle3 == null) {
        }
        LocalizationHighlightStyle localizationHighlightStyle22 = channel.getLocalizationHighlightStyle();
        return new SelectionRow.AddPaymentMethodItem(displayName2, feeRateForDisplay, str, strCopydefault22, feeRateForDisplay2, localizationHighlightStyle22 != null ? localizationHighlightStyle22.getSingleTransactionLimitForDisplay() : null, channel.getDepositPlatformCode(), channel);
    }

    public final SelectionRow.PaymentMethodCashItem AEQbTJ(Channel channel, PaymentMethod paymentMethod) {
        C30326lUf c30326lUf = C30326lUf.KWHzl;
        String strOLrzqt = c30326lUf.OLrzqt(channel, paymentMethod, true);
        String strCopydefault = c30326lUf.copydefault(channel, paymentMethod);
        String strAEQbTJ = c30326lUf.AEQbTJ(channel, paymentMethod, false, 2, channel.getSupportCurrency());
        String strEZpvd = c30326lUf.EZpvd(channel);
        String depositPlatformCode = channel.getDepositPlatformCode();
        int code = channel.getCategoryCode().getCode();
        PaymentMethodCategory paymentMethodCategory = channel.getPaymentMethodCategory();
        boolean zIwGUEr = iwGUEr();
        String supportCurrency = channel.getSupportCurrency();
        Integer supportCurrencyScale = channel.getSupportCurrencyScale();
        int iIntValue = supportCurrencyScale != null ? supportCurrencyScale.intValue() : 2;
        boolean z = this.iwGUEr.getTradeType() == TradeType.BUY;
        boolean z2 = this.iwGUEr.getDexTokenParameters() != null;
        Account account = paymentMethod.getAccount();
        String availableBalance = account != null ? account.getAvailableBalance() : null;
        String str = availableBalance == null ? "" : availableBalance;
        Account account2 = paymentMethod.getAccount();
        String unavailableBalance = account2 != null ? account2.getUnavailableBalance() : null;
        String str2 = unavailableBalance == null ? "" : unavailableBalance;
        Account account3 = paymentMethod.getAccount();
        String totalBalance = account3 != null ? account3.getTotalBalance() : null;
        return new SelectionRow.PaymentMethodCashItem(strOLrzqt, strCopydefault, strAEQbTJ, strEZpvd, false, depositPlatformCode, code, paymentMethodCategory, zIwGUEr, supportCurrency, iIntValue, z, z2, str, str2, totalBalance == null ? "" : totalBalance, copydefault(channel));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SelectionRow.PaymentMethodStablecoinItem OLrzqt(Channel channel, PaymentMethod paymentMethod, List<Channel> list) {
        String str;
        int i;
        int iIntValue;
        String strCopydefault;
        Integer rewardType;
        String peggedCurrency = channel.getSupportCurrencyInfo().getPeggedCurrency();
        C30326lUf c30326lUf = C30326lUf.KWHzl;
        boolean zCopydefault = c30326lUf.copydefault(peggedCurrency, list);
        if (zCopydefault && C33129mqd.OLrzqt((CharSequence) peggedCurrency)) {
            if (this.iwGUEr.getTradeType() == TradeType.SELL) {
                EarnOption earnOption = channel.getEarnOption();
                if (earnOption != null && (rewardType = earnOption.getRewardType()) != null && rewardType.intValue() == 1) {
                    String strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.hdpuIA);
                    EarnOption earnOption2 = channel.getEarnOption();
                    strCopydefault = C33069mpW.OLrzqt(strAYXKKw, C56423yEv.EZpvd(C56390yDp.OLrzqt("usdgRate", pTB.formatICUPercent$default(C33129mqd.copydefault(earnOption2 != null ? earnOption2.getEarnRate() : null), null, C38307pTy.Companion.AEQbTJ(2), null, null, null, 29, null))));
                }
                str = "";
            } else {
                strCopydefault = C33069mpW.copydefault(C31351lsQ.Activity.sbu, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, peggedCurrency)));
            }
            str = strCopydefault;
        } else {
            str = "";
        }
        if (zCopydefault) {
            iIntValue = channel.getSupportCurrencyInfo().getPeggedCurrencyScale();
        } else {
            Integer supportCurrencyScale = channel.getSupportCurrencyScale();
            if (supportCurrencyScale == null) {
                i = 8;
                String supportCurrency = channel.getSupportCurrency();
                String strCopydefault2 = c30326lUf.copydefault(channel, paymentMethod);
                boolean zCopydefault2 = c30326lUf.copydefault(peggedCurrency, list);
                Integer supportCurrencyScale2 = channel.getSupportCurrencyScale();
                String strAEQbTJ = c30326lUf.AEQbTJ(channel, paymentMethod, zCopydefault2, supportCurrencyScale2 == null ? supportCurrencyScale2.intValue() : 8, channel.getSupportCurrency());
                String strEZpvd = c30326lUf.EZpvd(channel);
                String depositPlatformCode = channel.getDepositPlatformCode();
                int code = channel.getCategoryCode().getCode();
                PaymentMethodCategory paymentMethodCategory = channel.getPaymentMethodCategory();
                boolean zIwGUEr = iwGUEr();
                String supportCurrency2 = channel.getSupportCurrency();
                boolean z = this.iwGUEr.getTradeType() != TradeType.BUY;
                boolean z2 = this.iwGUEr.getDexTokenParameters() == null;
                Account account = paymentMethod.getAccount();
                String availableBalance = account == null ? account.getAvailableBalance() : null;
                String str2 = availableBalance != null ? "" : availableBalance;
                Account account2 = paymentMethod.getAccount();
                String unavailableBalance = account2 == null ? account2.getUnavailableBalance() : null;
                String str3 = unavailableBalance != null ? "" : unavailableBalance;
                Account account3 = paymentMethod.getAccount();
                String totalBalance = account3 != null ? account3.getTotalBalance() : null;
                return new SelectionRow.PaymentMethodStablecoinItem(supportCurrency, strCopydefault2, strAEQbTJ, strEZpvd, false, depositPlatformCode, code, paymentMethodCategory, zIwGUEr, supportCurrency2, i, z, z2, peggedCurrency, str, str2, str3, totalBalance != null ? "" : totalBalance, copydefault(channel));
            }
            iIntValue = supportCurrencyScale.intValue();
        }
        i = iIntValue;
        String supportCurrency3 = channel.getSupportCurrency();
        String strCopydefault22 = c30326lUf.copydefault(channel, paymentMethod);
        boolean zCopydefault22 = c30326lUf.copydefault(peggedCurrency, list);
        Integer supportCurrencyScale22 = channel.getSupportCurrencyScale();
        String strAEQbTJ2 = c30326lUf.AEQbTJ(channel, paymentMethod, zCopydefault22, supportCurrencyScale22 == null ? supportCurrencyScale22.intValue() : 8, channel.getSupportCurrency());
        String strEZpvd2 = c30326lUf.EZpvd(channel);
        String depositPlatformCode2 = channel.getDepositPlatformCode();
        int code2 = channel.getCategoryCode().getCode();
        PaymentMethodCategory paymentMethodCategory2 = channel.getPaymentMethodCategory();
        boolean zIwGUEr2 = iwGUEr();
        String supportCurrency22 = channel.getSupportCurrency();
        if (this.iwGUEr.getTradeType() != TradeType.BUY) {
        }
        if (this.iwGUEr.getDexTokenParameters() == null) {
        }
        Account account4 = paymentMethod.getAccount();
        if (account4 == null) {
        }
        if (availableBalance != null) {
        }
        Account account22 = paymentMethod.getAccount();
        if (account22 == null) {
        }
        if (unavailableBalance != null) {
        }
        Account account32 = paymentMethod.getAccount();
        if (account32 != null) {
        }
        return new SelectionRow.PaymentMethodStablecoinItem(supportCurrency3, strCopydefault22, strAEQbTJ2, strEZpvd2, false, depositPlatformCode2, code2, paymentMethodCategory2, zIwGUEr2, supportCurrency22, i, z, z2, peggedCurrency, str, str2, str3, totalBalance != null ? "" : totalBalance, copydefault(channel));
    }

    public final SelectionRow.PaymentMethodCryptoItem KWHzl(Channel channel, PaymentMethod paymentMethod) {
        int iIntValue;
        String supportCurrency;
        if (channel.getSupportCurrencyInfo().getPeggedCurrencyTradeable()) {
            iIntValue = channel.getSupportCurrencyInfo().getPeggedCurrencyScale();
        } else {
            Integer supportCurrencyScale = channel.getSupportCurrencyScale();
            iIntValue = supportCurrencyScale != null ? supportCurrencyScale.intValue() : 8;
        }
        int i = iIntValue;
        if (channel.getSupportCurrencyInfo().getPeggedCurrencyTradeable()) {
            supportCurrency = channel.getSupportCurrencyInfo().getPeggedCurrency();
        } else {
            supportCurrency = channel.getSupportCurrency();
        }
        String str = supportCurrency;
        String supportCurrency2 = channel.getSupportCurrency();
        C30326lUf c30326lUf = C30326lUf.KWHzl;
        String strCopydefault = c30326lUf.copydefault(channel, paymentMethod);
        String strAEQbTJ = c30326lUf.AEQbTJ(channel, paymentMethod, channel.getSupportCurrencyInfo().getPeggedCurrencyTradeable(), i, channel.getSupportCurrency());
        String depositPlatformCode = channel.getDepositPlatformCode();
        int code = channel.getCategoryCode().getCode();
        PaymentMethodCategory paymentMethodCategory = channel.getPaymentMethodCategory();
        boolean zIwGUEr = iwGUEr();
        String supportCurrency3 = channel.getSupportCurrency();
        boolean z = this.iwGUEr.getTradeType() == TradeType.BUY;
        boolean z2 = this.iwGUEr.getDexTokenParameters() != null;
        Account account = paymentMethod.getAccount();
        String availableBalance = account != null ? account.getAvailableBalance() : null;
        String str2 = availableBalance == null ? "" : availableBalance;
        Account account2 = paymentMethod.getAccount();
        String unavailableBalance = account2 != null ? account2.getUnavailableBalance() : null;
        String str3 = unavailableBalance == null ? "" : unavailableBalance;
        Account account3 = paymentMethod.getAccount();
        String totalBalance = account3 != null ? account3.getTotalBalance() : null;
        return new SelectionRow.PaymentMethodCryptoItem(supportCurrency2, strCopydefault, strAEQbTJ, "", false, depositPlatformCode, code, paymentMethodCategory, zIwGUEr, supportCurrency3, i, z, z2, str, "", str2, str3, totalBalance == null ? "" : totalBalance, channel.getSupportCurrencyInfo().getPeggedCurrencyTradeable(), copydefault(channel));
    }

    public final List<SelectionRow> AEQbTJ(List<Channel> list) {
        Account account;
        Account account2;
        boolean z = this.fJNWhG;
        List<SelectionRow> arrayList = new ArrayList<>();
        Iterator<Channel> it = list.iterator();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().getBestChannel()) {
                break;
            }
            i++;
        }
        if (!list.isEmpty()) {
            List<Channel> arrayList2 = new ArrayList<>();
            for (Channel channel : list) {
                List<PaymentMethod> paymentMethods = channel.getPaymentMethods();
                if (paymentMethods == null) {
                    paymentMethods = yDY.AhwBna();
                }
                for (PaymentMethod paymentMethod : paymentMethods) {
                    if (C31662lzj.OLrzqt(channel)) {
                        arrayList2.add(channel);
                    }
                }
            }
            List<SelectionRow> arrayList3 = new ArrayList<>();
            List<SelectionRow> arrayList4 = new ArrayList<>();
            List<SelectionRow> arrayList5 = new ArrayList<>();
            for (Channel channel2 : list) {
                List<PaymentMethod> paymentMethods2 = channel2.getPaymentMethods();
                if (paymentMethods2 == null) {
                    paymentMethods2 = yDY.AhwBna();
                }
                for (PaymentMethod paymentMethod2 : paymentMethods2) {
                    if (this.iwGUEr.isRecurring()) {
                        if (C46876tfT.EZpvd(channel2)) {
                            if (C31662lzj.AEQbTJ(channel2)) {
                                if (C31662lzj.djBIcL(channel2)) {
                                    arrayList3.add(OLrzqt(channel2, paymentMethod2, arrayList2));
                                } else {
                                    arrayList5.add(AEQbTJ(channel2, paymentMethod2));
                                    arrayList.add(AEQbTJ(channel2, paymentMethod2));
                                }
                            } else {
                                Account account3 = paymentMethod2.getAccount();
                                if (account3 != null && C31662lzj.copydefault(account3)) {
                                    arrayList.add(OLrzqt(channel2, paymentMethod2));
                                } else if (C31662lzj.KWHzl(channel2) && (account = paymentMethod2.getAccount()) != null && C31662lzj.KWHzl(account)) {
                                    arrayList.add(EZpvd(channel2, paymentMethod2));
                                } else {
                                    arrayList.add(copydefault(channel2, paymentMethod2));
                                }
                            }
                        }
                    } else if (C31662lzj.AEQbTJ(channel2)) {
                        if (C31662lzj.djBIcL(channel2)) {
                            arrayList3.add(OLrzqt(channel2, paymentMethod2, arrayList2));
                        } else if (C31662lzj.AhwBna(channel2)) {
                            arrayList4.add(KWHzl(channel2, paymentMethod2));
                        } else {
                            arrayList5.add(AEQbTJ(channel2, paymentMethod2));
                            arrayList.add(AEQbTJ(channel2, paymentMethod2));
                        }
                    } else if (!C31662lzj.AhwBna(channel2)) {
                        Account account4 = paymentMethod2.getAccount();
                        if (account4 != null && C31662lzj.copydefault(account4)) {
                            arrayList.add(OLrzqt(channel2, paymentMethod2));
                        } else if (C31662lzj.KWHzl(channel2) && (account2 = paymentMethod2.getAccount()) != null && C31662lzj.KWHzl(account2)) {
                            arrayList.add(EZpvd(channel2, paymentMethod2));
                        } else {
                            arrayList.add(copydefault(channel2, paymentMethod2));
                        }
                    }
                }
            }
            EZpvd(arrayList, arrayList3, arrayList5);
            copydefault(arrayList, arrayList4, arrayList5);
            AEQbTJ(arrayList, i);
            ArrayList arrayList6 = new ArrayList();
            for (Channel channel3 : list) {
                if (C46876tfT.OLrzqt(channel3, this.iwGUEr.isRecurring())) {
                    arrayList6.add(EZpvd(channel3));
                }
            }
            this.AkhnZx.clear();
            this.AkhnZx.addAll(arrayList6);
            boolean z3 = !z;
            if (z3 && (!arrayList6.isEmpty())) {
                arrayList.add(new SelectionRow.SectionHeader(DbNXlk(C31351lsQ.Activity.RzdrRQ), true, true));
                arrayList.addAll(arrayList6);
            }
            mHA mha = mHA.OLrzqt;
            MutableLiveData<C32989mnw<Boolean>> mutableLiveData = this.EZpvd;
            if (!z3 && (!arrayList6.isEmpty())) {
                z2 = true;
            }
            mha.OLrzqt(mutableLiveData, Boolean.valueOf(z2));
        }
        return arrayList;
    }

    public final void EZpvd(List<SelectionRow> list, List<SelectionRow> list2, List<SelectionRow> list3) {
        if (!list2.isEmpty()) {
            if (!list3.isEmpty()) {
                list.add(0, new SelectionRow.SectionHeader(C33070mpX.AYXKKw(C31351lsQ.Activity.DcMfJKsuEgdN), false, true));
                list.add(new SelectionRow.SectionHeader(C33070mpX.AYXKKw(C31351lsQ.Activity.glVQsU), false, true));
            }
            list.addAll(list2);
        }
    }

    public final void copydefault(List<SelectionRow> list, List<SelectionRow> list2, List<SelectionRow> list3) {
        if (!list2.isEmpty()) {
            if (!list3.isEmpty()) {
                list.add(0, new SelectionRow.SectionHeader(C33070mpX.AYXKKw(C31351lsQ.Activity.DcMfJKsuEgdN), false, true));
            }
            list.add(new SelectionRow.SectionHeader(C33070mpX.AYXKKw(C31351lsQ.Activity.DGUQLIekVPG), false, true));
            list.addAll(list2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(List<SelectionRow> list, int i) {
        PaymentMethod userSelectedPaymentMethod;
        Channel userSelectedChannel = this.iwGUEr.getUserSelectedChannel();
        if (userSelectedChannel == null || (userSelectedPaymentMethod = this.iwGUEr.getUserSelectedPaymentMethod()) == null) {
            return;
        }
        Iterator<SelectionRow> it = list.iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                SelectionRow next = it.next();
                if (next instanceof SelectionRow.PaymentMethodCashItem) {
                    if (C31662lzj.OLrzqt(userSelectedChannel)) {
                        SelectionRow.PaymentMethodCashItem paymentMethodCashItem = (SelectionRow.PaymentMethodCashItem) next;
                        paymentMethodCashItem.AEQbTJ(Intrinsics.EZpvd((Object) paymentMethodCashItem.gEmmrt(), (Object) userSelectedChannel.getSupportCurrency()));
                    }
                } else if (next instanceof SelectionRow.PaymentMethodStablecoinItem) {
                    if (C31662lzj.djBIcL(userSelectedChannel) || C31662lzj.AhwBna(userSelectedChannel)) {
                        SelectionRow.PaymentMethodStablecoinItem paymentMethodStablecoinItem = (SelectionRow.PaymentMethodStablecoinItem) next;
                        paymentMethodStablecoinItem.AEQbTJ(Intrinsics.EZpvd((Object) paymentMethodStablecoinItem.AYXKKw(), (Object) userSelectedChannel.getSupportCurrency()));
                    }
                } else if (next instanceof SelectionRow.PaymentMethodCryptoItem) {
                    if (C31662lzj.djBIcL(userSelectedChannel) || C31662lzj.AhwBna(userSelectedChannel)) {
                        SelectionRow.PaymentMethodCryptoItem paymentMethodCryptoItem = (SelectionRow.PaymentMethodCryptoItem) next;
                        paymentMethodCryptoItem.KWHzl(Intrinsics.EZpvd((Object) paymentMethodCryptoItem.AhwBna(), (Object) userSelectedChannel.getSupportCurrency()));
                    }
                } else if (next instanceof SelectionRow.PaymentMethodItem) {
                    if (!Intrinsics.EZpvd((Object) userSelectedChannel.getDepositPlatformCode(), (Object) ChannelPlatformCode.BALANCE.getCode())) {
                        SelectionRow.PaymentMethodItem paymentMethodItem = (SelectionRow.PaymentMethodItem) next;
                        if (!Intrinsics.EZpvd((Object) userSelectedChannel.getDepositPlatformCode(), (Object) paymentMethodItem.gEmmrt())) {
                            z = false;
                            paymentMethodItem.copydefault(z);
                        } else {
                            Account account = userSelectedPaymentMethod.getAccount();
                            if (!Intrinsics.EZpvd((Object) (account != null ? account.getPaymentAccountId() : null), (Object) paymentMethodItem.KWHzl())) {
                            }
                            paymentMethodItem.copydefault(z);
                        }
                    }
                } else if (!(next instanceof SelectionRow.AddPaymentMethodItem) && !(next instanceof SelectionRow.CardVerificationItem) && !(next instanceof SelectionRow.AchRelinkItem) && !(next instanceof SelectionRow.SectionHeader)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (!list.isEmpty()) {
                    for (SelectionRow selectionRow : list) {
                        if ((selectionRow instanceof SelectionRow.PaymentMethodItem) && ((SelectionRow.PaymentMethodItem) selectionRow).isConnected()) {
                            return;
                        }
                        if ((selectionRow instanceof SelectionRow.PaymentMethodCashItem) && ((SelectionRow.PaymentMethodCashItem) selectionRow).isConnected()) {
                            return;
                        }
                        if ((selectionRow instanceof SelectionRow.PaymentMethodStablecoinItem) && ((SelectionRow.PaymentMethodStablecoinItem) selectionRow).AkhnZx()) {
                            return;
                        }
                        if ((selectionRow instanceof SelectionRow.PaymentMethodCryptoItem) && ((SelectionRow.PaymentMethodCryptoItem) selectionRow).AkhnZx()) {
                            return;
                        }
                    }
                }
                SelectionRow selectionRow2 = (SelectionRow) CollectionsKt___CollectionsKt.AkhnZx(list, i);
                if (selectionRow2 != null) {
                    if (selectionRow2 instanceof SelectionRow.PaymentMethodItem) {
                        ((SelectionRow.PaymentMethodItem) selectionRow2).copydefault(true);
                        return;
                    } else {
                        if (selectionRow2 instanceof SelectionRow.PaymentMethodCashItem) {
                            ((SelectionRow.PaymentMethodCashItem) selectionRow2).AEQbTJ(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.buysell.ui.paymentmethod.select.SelectPaymentMethodViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackPageView$default(SelectPaymentMethodViewModel selectPaymentMethodViewModel, String str, List list, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            list = yDY.AhwBna();
        }
        if ((i & 4) != 0) {
            list2 = yDY.AhwBna();
        }
        selectPaymentMethodViewModel.copydefault(str, (List<String>) list, (List<String>) list2);
    }

    public final void copydefault(@NotNull final String str, @NotNull final List<String> list, @NotNull final List<String> list2) {
        String type;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("PaymentMethod_Full_Page_View", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lMP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SelectPaymentMethodViewModel.KWHzl(this.copydefault, str, list, list2, (EventParamsList) obj);
            }
        });
        C31349lsO c31349lsO = C31349lsO.EZpvd;
        String type2 = PaymentsReporterProperty.PaymentsReportAttrPage.PAYMENT_LIST.getType();
        if (this.iwGUEr.getTradeType() == TradeType.BUY) {
            type = PaymentsReporterProperty.PaymentsReportAttrType.BUY.getType();
        } else {
            type = PaymentsReporterProperty.PaymentsReportAttrType.SELL.getType();
        }
        c31349lsO.AEQbTJ(type2, type);
    }

    public static final Unit KWHzl(SelectPaymentMethodViewModel selectPaymentMethodViewModel, String str, List list, List list2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("flow", selectPaymentMethodViewModel.iwGUEr.getTradeType() == TradeType.BUY ? "buy" : "sell", true);
        BuySellParameter buySellParameter = selectPaymentMethodViewModel.iwGUEr.getBuySellParameter();
        String strAEQbTJ = buySellParameter != null ? buySellParameter.AEQbTJ() : null;
        EventParamsList.put$default(eventParamsList, "currency", strAEQbTJ == null ? "" : strAEQbTJ, false, 4, null);
        BuySellParameter buySellParameter2 = selectPaymentMethodViewModel.iwGUEr.getBuySellParameter();
        String strEZpvd = buySellParameter2 != null ? buySellParameter2.EZpvd() : null;
        EventParamsList.put$default(eventParamsList, "token", strEZpvd == null ? "" : strEZpvd, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "payment_channels", list.toString(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "payment_methods", list2.toString(), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(String str, String str2, String str3) {
        BuySellParameter buySellParameter = this.iwGUEr.getBuySellParameter();
        C31354lsT c31354lsT = C31354lsT.KWHzl;
        TradeType tradeType = this.iwGUEr.getTradeType();
        String strEZpvd = buySellParameter != null ? buySellParameter.EZpvd() : null;
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        String strAEQbTJ = buySellParameter != null ? buySellParameter.AEQbTJ() : null;
        c31354lsT.KWHzl(tradeType, strEZpvd, strAEQbTJ != null ? strAEQbTJ : "", (8 & 8) != 0 ? "" : null, C34754niS.AEQbTJ.KWHzl(), "fail", str2, str, str3);
    }

    public final boolean iwGUEr() {
        return ((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AYXKKw();
    }

    public final List<Channel> OLrzqt(@NotNull List<Channel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            List<String> supportedOrderTypes = ((Channel) obj).getSupportedOrderTypes();
            if (supportedOrderTypes != null && supportedOrderTypes.contains(OrderType.RECURRING.getTxt())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean valueOf(List<Channel> list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((Object) ((Channel) it.next()).getDepositPlatformCode(), (Object) ChannelPlatformCode.ACH_BUY.getCode())) {
                    return true;
                }
            }
        }
        return false;
    }
}
