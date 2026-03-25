package com.okinc.buysell.ui.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.appsflyer.AppsFlyerProperties;
import com.okinc.buysell.ui.bsc.BaseBuySellViewModel;
import com.okinc.buysell.ui.bsc.util.InputType;
import com.okinc.buysell.util.ABTestFeatureFlag;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.crcore.coreapi.net.responsebean.bsc.PaymentMethodResponseBean;
import com.okinc.crcore.shared.net.responsebean.B2CQuotePriceBean;
import com.okinc.crcore.shared.net.responsebean.DexQuoteBean;
import com.okinc.crcore.shared.net.responsebean.bsc.B2CQuoteBean;
import com.okinc.crcore.shared.net.responsebean.bsc.ChannelBean;
import com.okinc.crcore.shared.net.responsebean.bsc.DexInfoBean;
import com.okinc.crcore.shared.net.responsebean.bsc.TradeSuggestionBean;
import com.okinc.fiat.api.bean.CoinType;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.experience.BuySellCurrency;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import com.okinc.okpaymentapi.data.remote.model.experience.DexInfo;
import com.okinc.okpaymentapi.data.remote.model.management.Account;
import com.okinc.okpaymentapi.data.remote.model.management.BalanceAccountType;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import com.okinc.okpaymentapi.data.remote.model.management.EarnOption;
import com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency;
import com.okinc.okpaymentapi.data.remote.model.management.OrderType;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.SellerReceiptAccount;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.presentation.BSCLevel;
import com.okinc.okx.paymentapi.service.TargetTab;
import com.okinc.okx.paymentapi.tracking.PaymentsReporterProperty;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C30322lUb;
import o.C30326lUf;
import o.C30327lUg;
import o.C31349lsO;
import o.C31351lsQ;
import o.C31354lsT;
import o.C31657lze;
import o.C31659lzg;
import o.C31662lzj;
import o.C31667lzo;
import o.C32866mlf;
import o.C32868mlh;
import o.C32989mnw;
import o.C33070mpX;
import o.C33129mqd;
import o.C34703nhO;
import o.C34745niJ;
import o.C34754niS;
import o.C43251rlk;
import o.C46871tfO;
import o.C56390yDp;
import o.C56403yEb;
import o.C56406yEe;
import o.C56444yFp;
import o.InterfaceC31422lti;
import o.InterfaceC31670lzr;
import o.InterfaceC31764mDa;
import o.InterfaceC47278tmy;
import o.InterfaceC56445yFq;
import o.lMD;
import o.lyC;
import o.lyI;
import o.lyM;
import o.lyN;
import o.lyR;
import o.lyT;
import o.lyX;
import o.lzT;
import o.mHA;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseBuySellViewModel extends lzT {
    public static final Companion Companion = new Companion(null);
    public static final int EZpvd = 8;
    public final MutableLiveData<C32989mnw<Pair<String, String>>> AYXKKw;
    public final MutableLiveData<C32989mnw<lyN.TaskDescription.Application>> AhwBna;
    public final MutableLiveData<C32989mnw<Pair<Channel, PaymentMethod>>> AkhnZx;
    public final MutableLiveData<C32989mnw<Boolean>> AuCTel;
    public final MutableLiveData<C32989mnw<Pair<ActionBar, Pair<Channel, PaymentMethod>>>> AuCTelauCTel;
    public List<Channel> AubY;
    public Pair<Channel, PaymentMethod> AwvSrB;
    public final InterfaceC31764mDa AxsJAY;
    public final C31659lzg AxsJAYaxsJAY;
    public final lyR DTwDnp;
    public final MutableLiveData<C32989mnw<ActionBar>> DbNXlk;
    public boolean ORxRYg;
    public Companion.ActionBar OcIXYQ;
    public final lyI QKVWgx;
    public final InterfaceC47278tmy QKudOq;
    public String QOLQEE;
    public final MutableStateFlow<Boolean> QUSxYX;
    public final lyX QVAiDq;
    public final lyM QbewEr;
    public final lyT QfsBiF;
    public final MutableStateFlow<Boolean> RJOkX;
    public final C30322lUb RcXXUw;
    public String UeEOUB;
    public long aKErDB;
    public final MutableStateFlow<Boolean> dNCPSb;
    public final MutableLiveData<C32989mnw<Pair<Channel, lMD<PaymentMethod, OKServerException>>>> djBIcL;
    public boolean djSkpj;
    public String dvKsVJ;
    public String dxcTrN;
    public final MutableLiveData<C32989mnw<Boolean>> ejfBZ;
    public final MutableLiveData<C32989mnw<Boolean>> fARcdN;
    public PreviewPageParameters fFgQHt;
    public final MutableLiveData<C32989mnw<Boolean>> fIwbmz;
    public final MutableLiveData<C32989mnw<Boolean>> fJNWhG;
    public final C31657lze fZBcTu;
    public final MutableLiveData<C32989mnw<TaskDescription>> fetchVPNInfo;
    public String finit;
    public DexInfo flVtFt;
    public long fvQaOB;
    public MutableLiveData<C32989mnw<Boolean>> gEmmrt;
    public boolean gGvvIC;
    public String gHZMYf;
    public Channel gasjUx;
    public MutableLiveData<C32989mnw<Unit>> getFieldNames;
    public final MutableLiveData<C32989mnw<Pair<ChannelCategoryCode, B2CQuoteBean>>> getNewProxyInstance;
    public String giSNqX;
    public boolean gkJEwt;
    public MutableLiveData<C32989mnw<Unit>> hDKMBd;
    public boolean hUfVAv;
    public boolean iRxXKY;
    public boolean iZzfmt;
    public final MutableLiveData<List<Channel>> isConnected;
    public final MutableLiveData<C32989mnw<Boolean>> iwGUEr;
    public String sSMYrx;
    public MutableLiveData<C32989mnw<Unit>> uzCIH;
    public MutableLiveData<C32989mnw<Unit>> valueOf;
    public MutableLiveData<C32989mnw<Unit>> values;
    public List<Channel> wlaJM;
    public List<Channel> zLjUOn;
    public MutableLiveData<C32989mnw<Unit>> zsXlph;
    public String zuBGHE;

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChannelCategoryCode.values().length];
            try {
                iArr[ChannelCategoryCode.THIRD_PARTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChannelCategoryCode.BALANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChannelCategoryCode.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(long j) {
        this.aKErDB = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.UeEOUB = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.djSkpj = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Channel> AkhnZx() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<TaskDescription>> AubY() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Channel AwvSrB() {
        return this.gasjUx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AxsJAY() {
        return this.dvKsVJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<Boolean> AxsJAYaxsJAY() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AxsJAYsNCnLh() {
        this.finit = "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DTwDnp() {
        return this.giSNqX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.QOLQEE = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.gGvvIC = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull DexInfo dexInfo) {
        Intrinsics.checkNotNullParameter(dexInfo, "");
        this.flVtFt = dexInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.zuBGHE = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dxcTrN = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.iZzfmt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexInfo ORxRYg() {
        return this.flVtFt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<ActionBar>> QOLQEE() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> QUSxYX() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean QVAiDq() {
        return this.gGvvIC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> QbewEr() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> QfsBiF() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> RJOkX() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> RcXXUw() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> UeEOUB() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> aKErDB() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void accept() {
        this.dxcTrN = "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sSMYrx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean dNCPSb() {
        return this.iRxXKY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dvKsVJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> djSkpj() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Pair<ChannelCategoryCode, B2CQuoteBean>>> dvKsVJ() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean dxcTrN() {
        return this.hUfVAv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ejfBZ() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final lyR fARcdN() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> fFgQHt() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Companion.ActionBar fIwbmz() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fJNWhG() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> fZBcTu() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Boolean>> finit() {
        return this.iwGUEr;
    }

    public abstract TradeType flVtFt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Pair<ActionBar, Pair<Channel, PaymentMethod>>>> fvQaOB() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.giSNqX = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<Boolean> gGvvIC() {
        return this.RJOkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31657lze gHZMYf() {
        return this.fZBcTu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Pair<String, String>>> getFieldNames() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C30322lUb getNewProxyInstance() {
        return this.RcXXUw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<Boolean> hDKMBd() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean iRxXKY() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<lyN.TaskDescription.Application>> isConnected() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final lyX iwGUEr() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Pair<Channel, PaymentMethod>>> sSMYrx() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Pair<Channel, lMD<PaymentMethod, OKServerException>>>> uzCIH() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.finit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> values() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreviewPageParameters wlaJM() {
        return this.fFgQHt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String zLjUOn() {
        return this.UeEOUB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBuySellViewModel(@NotNull C31659lzg c31659lzg, @NotNull C31657lze c31657lze, @NotNull lyX lyx, @NotNull lyT lyt, @NotNull lyI lyi, @NotNull InterfaceC31764mDa interfaceC31764mDa, @NotNull lyM lym, @NotNull lyR lyr, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        super(lym);
        Intrinsics.checkNotNullParameter(c31659lzg, "");
        Intrinsics.checkNotNullParameter(c31657lze, "");
        Intrinsics.checkNotNullParameter(lyx, "");
        Intrinsics.checkNotNullParameter(lyt, "");
        Intrinsics.checkNotNullParameter(lyi, "");
        Intrinsics.checkNotNullParameter(interfaceC31764mDa, "");
        Intrinsics.checkNotNullParameter(lym, "");
        Intrinsics.checkNotNullParameter(lyr, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.AxsJAYaxsJAY = c31659lzg;
        this.fZBcTu = c31657lze;
        this.QVAiDq = lyx;
        this.QfsBiF = lyt;
        this.QKVWgx = lyi;
        this.AxsJAY = interfaceC31764mDa;
        this.QbewEr = lym;
        this.DTwDnp = lyr;
        this.QKudOq = interfaceC47278tmy;
        this.RcXXUw = new C30322lUb(interfaceC47278tmy);
        this.fetchVPNInfo = new MutableLiveData<>();
        this.DbNXlk = new MutableLiveData<>();
        this.AkhnZx = new MutableLiveData<>();
        this.AuCTelauCTel = new MutableLiveData<>();
        this.AYXKKw = new MutableLiveData<>();
        this.getNewProxyInstance = new MutableLiveData<>();
        this.iwGUEr = new MutableLiveData<>();
        this.fIwbmz = new MutableLiveData<>();
        this.ejfBZ = new MutableLiveData<>();
        this.fARcdN = new MutableLiveData<>();
        this.fJNWhG = new MutableLiveData<>();
        this.AuCTel = new MutableLiveData<>();
        this.djBIcL = new MutableLiveData<>();
        this.isConnected = new MutableLiveData<>();
        this.gEmmrt = new MutableLiveData<>();
        this.valueOf = new MutableLiveData<>();
        this.values = new MutableLiveData<>();
        this.uzCIH = new MutableLiveData<>();
        this.getFieldNames = new MutableLiveData<>();
        this.hDKMBd = new MutableLiveData<>();
        this.zsXlph = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        this.AubY = yDY.AhwBna();
        this.iRxXKY = C30327lUg.AEQbTJ(ABTestFeatureFlag.PAYMENT_BOTTOMSHEET);
        this.wlaJM = yDY.AhwBna();
        this.OcIXYQ = new Companion.ActionBar(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        this.zLjUOn = yDY.AhwBna();
        this.dxcTrN = "";
        this.UeEOUB = "";
        this.finit = "";
        this.flVtFt = new DexInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, false, false, (String) null, 65535, (DefaultConstructorMarker) null);
        this.dvKsVJ = "";
        this.giSNqX = "";
        this.QOLQEE = "";
        Boolean bool = Boolean.FALSE;
        this.dNCPSb = StateFlowKt.MutableStateFlow(bool);
        this.QUSxYX = StateFlowKt.MutableStateFlow(bool);
        this.RJOkX = StateFlowKt.MutableStateFlow(bool);
        this.sSMYrx = "0";
        this.zuBGHE = "0";
        this.ORxRYg = true;
        this.fFgQHt = new PreviewPageParameters((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
        this.gHZMYf = "USDT";
    }

    public final void djBIcL(boolean z) {
        mHA.OLrzqt.OLrzqt(this.fARcdN, Boolean.valueOf(z));
    }

    public final void AYXKKw(boolean z) {
        mHA.OLrzqt.OLrzqt(this.ejfBZ, Boolean.valueOf(z));
    }

    public final void OLrzqt(@NotNull lyN.TaskDescription.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        mHA.OLrzqt.OLrzqt(this.AhwBna, application);
    }

    public final void KWHzl(boolean z) {
        this.hUfVAv = z;
        mHA.OLrzqt.OLrzqt(this.iwGUEr, Boolean.valueOf(z));
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class ActionBar {
        public static final int AEQbTJ = CurrencyToken.$stable | BuySellCurrency.$stable;
        public final BuySellCurrency EZpvd;
        public final CurrencyToken copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, BuySellCurrency buySellCurrency, CurrencyToken currencyToken, int i, Object obj) {
            if ((i & 1) != 0) {
                buySellCurrency = actionBar.EZpvd;
            }
            if ((i & 2) != 0) {
                currencyToken = actionBar.copydefault;
            }
            return actionBar.EZpvd(buySellCurrency, currencyToken);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BuySellCurrency AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull BuySellCurrency buySellCurrency, @NotNull CurrencyToken currencyToken) {
            Intrinsics.checkNotNullParameter(buySellCurrency, "");
            Intrinsics.checkNotNullParameter(currencyToken, "");
            return new ActionBar(buySellCurrency, currencyToken);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CurrencyToken copydefault() {
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
            return Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd) && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SelectedCurrencyCrypto(selectedCurrency=" + this.EZpvd + ", selectedCrypto=" + this.copydefault + ")";
        }

        public ActionBar(@NotNull BuySellCurrency buySellCurrency, @NotNull CurrencyToken currencyToken) {
            Intrinsics.checkNotNullParameter(buySellCurrency, "");
            Intrinsics.checkNotNullParameter(currencyToken, "");
            this.EZpvd = buySellCurrency;
            this.copydefault = currencyToken;
        }
    }

    public final boolean DAIeex() {
        return System.currentTimeMillis() - this.aKErDB > this.fvQaOB * ((long) 1000);
    }

    public static /* synthetic */ void getTradeSuggestionData$default(BaseBuySellViewModel baseBuySellViewModel, CurrencyToken currencyToken, String str, String str2, String str3, String str4, int i, boolean z, int i2, Object obj) {
        CurrencyToken currencyToken2;
        CurrencyToken currencyToken3;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTradeSuggestionData");
        }
        if ((i2 & 1) != 0) {
            ActionBar actionBar = (ActionBar) mHA.OLrzqt.AEQbTJ(baseBuySellViewModel.QOLQEE());
            if (actionBar == null || (currencyToken3 = actionBar.copydefault()) == null) {
                currencyToken3 = new CurrencyToken((String) null, false, (List) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, 0, (List) null, 0, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, (String) null, (String) null, (EarnOption) null, (List) null, (String) null, (Pair) null, false, false, baseBuySellViewModel.flVtFt, 33554431, (DefaultConstructorMarker) null);
            }
            currencyToken2 = currencyToken3;
        } else {
            currencyToken2 = currencyToken;
        }
        baseBuySellViewModel.AEQbTJ(currencyToken2, (i2 & 2) != 0 ? baseBuySellViewModel.zuBGHE() : str, (i2 & 4) != 0 ? baseBuySellViewModel.OcIXYQ() : str2, str3, str4, i, z);
    }

    public final void AEQbTJ(@NotNull CurrencyToken currencyToken, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, boolean z) {
        Intrinsics.checkNotNullParameter(currencyToken, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.djSkpj = true;
        if (z) {
            if (flVtFt() == TradeType.BUY) {
                mHA.OLrzqt.KWHzl(this.uzCIH);
            } else {
                mHA.OLrzqt.KWHzl(this.hDKMBd);
            }
        }
        if (hUfVAv()) {
            OLrzqt(currencyToken, str2, i);
        } else {
            OLrzqt(str, str2, str3, str4, i);
        }
    }

    public final void OLrzqt(CurrencyToken currencyToken, String str, int i) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseBuySellViewModel$getTradeSuggestionDataForDexToken$1(yDY.AhwBna(BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this), null, null, new BaseBuySellViewModel$getTradeSuggestionDataForDexToken$asyncTasks$1(this, currencyToken, str, i, null), 3, null), BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this), null, null, new BaseBuySellViewModel$getTradeSuggestionDataForDexToken$asyncTasks$2(this, currencyToken, null), 3, null), BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this), null, null, new BaseBuySellViewModel$getTradeSuggestionDataForDexToken$asyncTasks$3(this, currencyToken, null), 3, null)), this, currencyToken, null), 3, null);
    }

    public static /* synthetic */ void getTradeSuggestionDataForCefi$default(BaseBuySellViewModel baseBuySellViewModel, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTradeSuggestionDataForCefi");
        }
        if ((i2 & 1) != 0) {
            str = baseBuySellViewModel.zuBGHE();
        }
        String str5 = str;
        if ((i2 & 2) != 0) {
            str2 = baseBuySellViewModel.OcIXYQ();
        }
        baseBuySellViewModel.OLrzqt(str5, str2, str3, str4, i);
    }

    public final void OLrzqt(String str, String str2, String str3, String str4, int i) {
        this.flVtFt = new DexInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, false, false, (String) null, 65535, (DefaultConstructorMarker) null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseBuySellViewModel$getTradeSuggestionDataForCefi$1(this, str, str2, str3, str4, i, null), 3, null);
    }

    public final void AEQbTJ(TradeSuggestionBean tradeSuggestionBean) {
        List<ChannelBean> paymentChannels = tradeSuggestionBean.getPaymentChannels();
        ArrayList arrayList = new ArrayList();
        for (Object obj : paymentChannels) {
            List<String> supportedOrderTypes = ((ChannelBean) obj).getSupportedOrderTypes();
            if (supportedOrderTypes != null && supportedOrderTypes.contains(OrderType.RECURRING.getTxt())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(lyC.AEQbTJ.AEQbTJ((ChannelBean) it.next()));
        }
        this.isConnected.postValue(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(TradeSuggestionBean tradeSuggestionBean) {
        PaymentMethod paymentMethod;
        Object next;
        String paymentAccountId;
        String paymentAccountId2;
        mHA mha = mHA.OLrzqt;
        MutableLiveData<C32989mnw<Boolean>> mutableLiveData = this.gEmmrt;
        List<ChannelBean> paymentChannels = tradeSuggestionBean.getPaymentChannels();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = paymentChannels.iterator();
        while (it.hasNext()) {
            List<PaymentMethodResponseBean> paymentMethods = ((ChannelBean) it.next()).getPaymentMethods();
            if (paymentMethods == null) {
                paymentMethods = yDY.AhwBna();
            }
            C56406yEe.KWHzl(arrayList, paymentMethods);
        }
        mha.OLrzqt(mutableLiveData, Boolean.valueOf(arrayList.size() >= 2));
        mHA mha2 = mHA.OLrzqt;
        Pair pair = (Pair) mha2.AEQbTJ(this.AkhnZx);
        Channel channel = pair != null ? (Channel) pair.getFirst() : null;
        Pair pair2 = (Pair) mha2.AEQbTJ(this.AkhnZx);
        Pair pairOLrzqt = C56390yDp.OLrzqt(channel, pair2 != null ? (PaymentMethod) pair2.getSecond() : null);
        Channel channel2 = (Channel) pairOLrzqt.component1();
        PaymentMethod paymentMethod2 = (PaymentMethod) pairOLrzqt.component2();
        Channel channelEZpvd = C31667lzo.EZpvd(tradeSuggestionBean, channel2, paymentMethod2, this.iZzfmt);
        if (Intrinsics.EZpvd((Object) (channel2 != null ? channel2.getDepositPlatformCode() : null), (Object) ChannelPlatformCode.BUY_PAYPAL.getCode())) {
            List<PaymentMethod> paymentMethods2 = channel2.getPaymentMethods();
            if (paymentMethods2 == null) {
                C31349lsO.EZpvd.KWHzl(PaymentsReporterProperty.PaymentsReportAttrPage.PAYPAL.getType(), "0", "selectedChannel " + channel2.getPaymentMethods());
                break;
            }
            if (!paymentMethods2.isEmpty()) {
                Iterator<T> it2 = paymentMethods2.iterator();
                while (it2.hasNext()) {
                    Account account = ((PaymentMethod) it2.next()).getAccount();
                    if (!((account == null || (paymentAccountId2 = account.getPaymentAccountId()) == null || StringsKt__StringsKt.fARcdN((CharSequence) paymentAccountId2)) ? false : true)) {
                        C31349lsO.EZpvd.KWHzl(PaymentsReporterProperty.PaymentsReportAttrPage.PAYPAL.getType(), "0", "selectedChannel " + channel2.getPaymentMethods());
                        break;
                    }
                }
            }
        }
        if (Intrinsics.EZpvd((Object) channelEZpvd.getDepositPlatformCode(), (Object) ChannelPlatformCode.BUY_PAYPAL.getCode())) {
            List<PaymentMethod> paymentMethods3 = channelEZpvd.getPaymentMethods();
            if (paymentMethods3 == null) {
                C31349lsO.EZpvd.KWHzl(PaymentsReporterProperty.PaymentsReportAttrPage.PAYPAL.getType(), "0", "matchedOrFirstChannel " + channelEZpvd.getPaymentMethods());
                break;
            }
            if (!paymentMethods3.isEmpty()) {
                Iterator<T> it3 = paymentMethods3.iterator();
                while (it3.hasNext()) {
                    Account account2 = ((PaymentMethod) it3.next()).getAccount();
                    if (!((account2 == null || (paymentAccountId = account2.getPaymentAccountId()) == null || StringsKt__StringsKt.fARcdN((CharSequence) paymentAccountId)) ? false : true)) {
                        C31349lsO.EZpvd.KWHzl(PaymentsReporterProperty.PaymentsReportAttrPage.PAYPAL.getType(), "0", "matchedOrFirstChannel " + channelEZpvd.getPaymentMethods());
                        break;
                    }
                }
            }
        }
        BuySellCurrency buySellCurrencyAhwBna = C31667lzo.AhwBna(tradeSuggestionBean);
        CurrencyToken currencyTokenAYXKKw = C31667lzo.AYXKKw(tradeSuggestionBean);
        channelEZpvd.setQuoteCurrency(buySellCurrencyAhwBna.getCurrency());
        channelEZpvd.setBaseCurrency(currencyTokenAYXKKw.getCurrency());
        this.AubY = C31667lzo.EZpvd(tradeSuggestionBean);
        this.sSMYrx = C31667lzo.OLrzqt(tradeSuggestionBean);
        this.zuBGHE = C31667lzo.copydefault(tradeSuggestionBean, channelEZpvd.getSupportCurrency());
        this.zLjUOn = C31667lzo.copydefault(tradeSuggestionBean);
        List<PaymentMethod> paymentMethods4 = channelEZpvd.getPaymentMethods();
        if (paymentMethods4 != null) {
            Iterator<T> it4 = paymentMethods4.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
                PaymentMethod paymentMethod3 = (PaymentMethod) next;
                if (Intrinsics.EZpvd((Object) paymentMethod3.getPaymentMethod(), (Object) (paymentMethod2 != null ? paymentMethod2.getPaymentMethod() : null))) {
                    Account account3 = paymentMethod3.getAccount();
                    String paymentAccountId3 = account3 != null ? account3.getPaymentAccountId() : null;
                    Account account4 = paymentMethod2.getAccount();
                    if (Intrinsics.EZpvd((Object) paymentAccountId3, (Object) (account4 != null ? account4.getPaymentAccountId() : null))) {
                        break;
                    }
                }
            }
            paymentMethod = (PaymentMethod) next;
            if (paymentMethod == null) {
                List<PaymentMethod> paymentMethods5 = channelEZpvd.getPaymentMethods();
                PaymentMethod paymentMethod4 = paymentMethods5 != null ? (PaymentMethod) CollectionsKt___CollectionsKt.firstOrNull(paymentMethods5) : null;
                paymentMethod = paymentMethod4 == null ? new PaymentMethod((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, false, (Account) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, false, (SellerReceiptAccount) null, (String) null, (String) null, (String) null, false, (List) null, 0, 536870911, (DefaultConstructorMarker) null) : paymentMethod4;
            }
        }
        if (this.iRxXKY && tradeSuggestionBean.getMultipleCurrencyEnabled()) {
            KWHzl(false);
        } else {
            KWHzl(tradeSuggestionBean.getQuoteCurrency().getMultipleQuoteCurrency());
        }
        mHA.OLrzqt.OLrzqt(this.AuCTelauCTel, new Pair(new ActionBar(buySellCurrencyAhwBna, currencyTokenAYXKKw), new Pair(channelEZpvd, paymentMethod)));
    }

    public final void copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        mHA.OLrzqt.OLrzqt(this.AYXKKw, new Pair(str, str2));
    }

    public final void copydefault(@NotNull ChannelCategoryCode channelCategoryCode, @NotNull B2CQuoteBean b2CQuoteBean) {
        Intrinsics.checkNotNullParameter(channelCategoryCode, "");
        Intrinsics.checkNotNullParameter(b2CQuoteBean, "");
        mHA.OLrzqt.OLrzqt(this.getNewProxyInstance, new Pair(channelCategoryCode, b2CQuoteBean));
    }

    public final void copydefault(@NotNull ActionBar actionBar) {
        CoinType coinType;
        Intrinsics.checkNotNullParameter(actionBar, "");
        if (flVtFt() == TradeType.BUY) {
            coinType = CoinType.COIN_TYPE_BUY;
        } else {
            coinType = CoinType.COIN_TYPE_SELL;
        }
        C34745niJ c34745niJ = C34745niJ.AEQbTJ;
        c34745niJ.OLrzqt(coinType, actionBar.AEQbTJ().getCurrency(), actionBar.copydefault().getCurrency());
        c34745niJ.EZpvd(coinType, C46871tfO.OLrzqt(actionBar.AEQbTJ()));
        mHA.OLrzqt.OLrzqt(this.DbNXlk, actionBar);
    }

    public final void QKudOq() {
        mHA.OLrzqt.OLrzqt(this.DbNXlk, null);
    }

    public final void gEmmrt(boolean z) {
        mHA.OLrzqt.OLrzqt(this.fIwbmz, Boolean.valueOf(z));
    }

    public final void OLrzqt(DexInfoBean dexInfoBean) {
        DexInfo dexInfoCopy;
        if (dexInfoBean.getUniqueId().length() == 0) {
            dexInfoCopy = new DexInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, false, false, (String) null, 65535, (DefaultConstructorMarker) null);
        } else if (this.flVtFt.getChainLogo().length() == 0) {
            DexInfo dexInfo = this.flVtFt;
            String chainLogo = dexInfoBean.getChainLogo();
            if (chainLogo == null) {
                chainLogo = "";
            }
            dexInfoCopy = dexInfo.copy((65527 & 1) != 0 ? dexInfo.uniqueId : null, (65527 & 2) != 0 ? dexInfo.chainIndex : null, (65527 & 4) != 0 ? dexInfo.chainName : null, (65527 & 8) != 0 ? dexInfo.chainLogo : chainLogo, (65527 & 16) != 0 ? dexInfo.tokenAddress : null, (65527 & 32) != 0 ? dexInfo.price : null, (65527 & 64) != 0 ? dexInfo.liquidity : null, (65527 & 128) != 0 ? dexInfo.marketCap : null, (65527 & 256) != 0 ? dexInfo.riskLevel : null, (65527 & 512) != 0 ? dexInfo.balanceTag : 0, (65527 & 1024) != 0 ? dexInfo.decimal : 0, (65527 & 2048) != 0 ? dexInfo.balance : null, (65527 & 4096) != 0 ? dexInfo.balanceUsd : null, (65527 & 8192) != 0 ? dexInfo.communityRecognized : false, (65527 & 16384) != 0 ? dexInfo.cexListing : false, (65527 & 32768) != 0 ? dexInfo.cefiId : null);
        } else {
            dexInfoCopy = this.flVtFt;
        }
        this.flVtFt = dexInfoCopy;
    }

    public final void OLrzqt(@NotNull Channel channel, @NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(channel, "");
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        this.gasjUx = channel;
        if (channel.getCategoryCode() == ChannelCategoryCode.BALANCE) {
            this.AwvSrB = new Pair<>(channel, paymentMethod);
        }
        mHA.OLrzqt.OLrzqt(this.AkhnZx, new Pair(channel, paymentMethod));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseBuySellViewModel$updateSelectedChannelAndPaymentData$1(this, null), 3, null);
        Account account = paymentMethod.getAccount();
        gEmmrt(Intrinsics.EZpvd((Object) (account != null ? account.getBalanceAccountType() : null), (Object) BalanceAccountType.TRADING.getValue()));
    }

    public final boolean iZzfmt() {
        return ((InterfaceC31422lti) C43251rlk.copydefault(InterfaceC31422lti.class)).OLrzqt();
    }

    public final boolean AEQbTJ(Channel channel) {
        return (channel != null ? channel.getTradingAgentInfo() : null) != null;
    }

    public final boolean gkJEwt() {
        return C30327lUg.AEQbTJ(ABTestFeatureFlag.OEX_OTC_AGENT_ENTRY);
    }

    public final String OcIXYQ() {
        BuySellCurrency buySellCurrencyAEQbTJ;
        ActionBar actionBar = (ActionBar) mHA.OLrzqt.AEQbTJ(this.DbNXlk);
        String currency = (actionBar == null || (buySellCurrencyAEQbTJ = actionBar.AEQbTJ()) == null) ? null : buySellCurrencyAEQbTJ.getCurrency();
        return currency == null ? "" : currency;
    }

    public final String zuBGHE() {
        CurrencyToken currencyTokenCopydefault;
        ActionBar actionBar = (ActionBar) mHA.OLrzqt.AEQbTJ(this.DbNXlk);
        String currency = (actionBar == null || (currencyTokenCopydefault = actionBar.copydefault()) == null) ? null : currencyTokenCopydefault.getCurrency();
        return currency == null ? "" : currency;
    }

    public final String QKVWgx() {
        BuySellCurrency buySellCurrencyAEQbTJ;
        ActionBar actionBar = (ActionBar) mHA.OLrzqt.AEQbTJ(this.DbNXlk);
        String symbol = (actionBar == null || (buySellCurrencyAEQbTJ = actionBar.AEQbTJ()) == null) ? null : buySellCurrencyAEQbTJ.getSymbol();
        return symbol == null ? "" : symbol;
    }

    public final String zsXlph() {
        String str = this.dxcTrN;
        if (!C33129mqd.OLrzqt((CharSequence) str)) {
            str = null;
        }
        return str == null ? zuBGHE() : str;
    }

    public final String AuCTelauCTel() {
        String str = this.finit;
        if (!C33129mqd.OLrzqt((CharSequence) str)) {
            str = null;
        }
        return str == null ? OcIXYQ() : str;
    }

    public final boolean gasjUx() {
        return C33129mqd.OLrzqt((CharSequence) OcIXYQ()) && C33129mqd.OLrzqt((CharSequence) zuBGHE());
    }

    public final boolean hUfVAv() {
        return C33129mqd.OLrzqt((CharSequence) this.flVtFt.getUniqueId());
    }

    public final boolean giSNqX() {
        return this.AubY.size() > 1;
    }

    public final boolean RlQdEF() {
        return ((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AhwBna() && this.gkJEwt;
    }

    public final boolean copydefault(Channel channel) {
        if (channel != null && C31662lzj.djBIcL(channel)) {
            return C30326lUf.KWHzl.copydefault(channel.getSupportCurrencyInfo().getPeggedCurrency(), this.zLjUOn);
        }
        if (channel == null || !C31662lzj.AhwBna(channel)) {
            return false;
        }
        if (this.zLjUOn.isEmpty()) {
            return channel.getSupportCurrencyInfo().getPeggedCurrencyTradeable();
        }
        return C30326lUf.KWHzl.copydefault(channel.getSupportCurrencyInfo().getPeggedCurrency(), this.zLjUOn);
    }

    @Serializable
    public static final class PreviewPageParameters implements Parcelable {
        private String p2pAmount;
        private String p2pBasePrice;
        private String p2pConvertBaseAmount;
        private String p2pConvertBaseCurrency;
        private String p2pOrderTotal;
        private String p2pPayment;
        private String p2pQPAmount;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<PreviewPageParameters> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<PreviewPageParameters> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreviewPageParameters createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new PreviewPageParameters(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreviewPageParameters[] newArray(int i) {
                return new PreviewPageParameters[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PreviewPageParameters() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PreviewPageParameters copy$default(PreviewPageParameters previewPageParameters, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = previewPageParameters.p2pBasePrice;
            }
            if ((i & 2) != 0) {
                str2 = previewPageParameters.p2pConvertBaseAmount;
            }
            String str8 = str2;
            if ((i & 4) != 0) {
                str3 = previewPageParameters.p2pConvertBaseCurrency;
            }
            String str9 = str3;
            if ((i & 8) != 0) {
                str4 = previewPageParameters.p2pOrderTotal;
            }
            String str10 = str4;
            if ((i & 16) != 0) {
                str5 = previewPageParameters.p2pAmount;
            }
            String str11 = str5;
            if ((i & 32) != 0) {
                str6 = previewPageParameters.p2pQPAmount;
            }
            String str12 = str6;
            if ((i & 64) != 0) {
                str7 = previewPageParameters.p2pPayment;
            }
            return previewPageParameters.copy(str, str8, str9, str10, str11, str12, str7);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.p2pBasePrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.p2pConvertBaseAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.p2pConvertBaseCurrency;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.p2pOrderTotal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.p2pAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.p2pQPAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.p2pPayment;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PreviewPageParameters copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            return new PreviewPageParameters(str, str2, str3, str4, str5, str6, str7);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreviewPageParameters)) {
                return false;
            }
            PreviewPageParameters previewPageParameters = (PreviewPageParameters) obj;
            return Intrinsics.EZpvd((Object) this.p2pBasePrice, (Object) previewPageParameters.p2pBasePrice) && Intrinsics.EZpvd((Object) this.p2pConvertBaseAmount, (Object) previewPageParameters.p2pConvertBaseAmount) && Intrinsics.EZpvd((Object) this.p2pConvertBaseCurrency, (Object) previewPageParameters.p2pConvertBaseCurrency) && Intrinsics.EZpvd((Object) this.p2pOrderTotal, (Object) previewPageParameters.p2pOrderTotal) && Intrinsics.EZpvd((Object) this.p2pAmount, (Object) previewPageParameters.p2pAmount) && Intrinsics.EZpvd((Object) this.p2pQPAmount, (Object) previewPageParameters.p2pQPAmount) && Intrinsics.EZpvd((Object) this.p2pPayment, (Object) previewPageParameters.p2pPayment);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getP2pAmount() {
            return this.p2pAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getP2pBasePrice() {
            return this.p2pBasePrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getP2pConvertBaseAmount() {
            return this.p2pConvertBaseAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getP2pConvertBaseCurrency() {
            return this.p2pConvertBaseCurrency;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getP2pOrderTotal() {
            return this.p2pOrderTotal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getP2pPayment() {
            return this.p2pPayment;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getP2pQPAmount() {
            return this.p2pQPAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((this.p2pBasePrice.hashCode() * 31) + this.p2pConvertBaseAmount.hashCode()) * 31) + this.p2pConvertBaseCurrency.hashCode()) * 31) + this.p2pOrderTotal.hashCode()) * 31) + this.p2pAmount.hashCode()) * 31) + this.p2pQPAmount.hashCode()) * 31) + this.p2pPayment.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setP2pAmount(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.p2pAmount = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setP2pBasePrice(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.p2pBasePrice = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setP2pConvertBaseAmount(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.p2pConvertBaseAmount = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setP2pConvertBaseCurrency(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.p2pConvertBaseCurrency = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setP2pOrderTotal(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.p2pOrderTotal = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setP2pPayment(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.p2pPayment = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setP2pQPAmount(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.p2pQPAmount = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PreviewPageParameters(p2pBasePrice=" + this.p2pBasePrice + ", p2pConvertBaseAmount=" + this.p2pConvertBaseAmount + ", p2pConvertBaseCurrency=" + this.p2pConvertBaseCurrency + ", p2pOrderTotal=" + this.p2pOrderTotal + ", p2pAmount=" + this.p2pAmount + ", p2pQPAmount=" + this.p2pQPAmount + ", p2pPayment=" + this.p2pPayment + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.p2pBasePrice);
            parcel.writeString(this.p2pConvertBaseAmount);
            parcel.writeString(this.p2pConvertBaseCurrency);
            parcel.writeString(this.p2pOrderTotal);
            parcel.writeString(this.p2pAmount);
            parcel.writeString(this.p2pQPAmount);
            parcel.writeString(this.p2pPayment);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.bsc.BaseBuySellViewModel.PreviewPageParameters.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<PreviewPageParameters> serializer() {
                return BaseBuySellViewModel$PreviewPageParameters$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ PreviewPageParameters(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.p2pBasePrice = "";
            } else {
                this.p2pBasePrice = str;
            }
            if ((i & 2) == 0) {
                this.p2pConvertBaseAmount = "";
            } else {
                this.p2pConvertBaseAmount = str2;
            }
            if ((i & 4) == 0) {
                this.p2pConvertBaseCurrency = "";
            } else {
                this.p2pConvertBaseCurrency = str3;
            }
            if ((i & 8) == 0) {
                this.p2pOrderTotal = "";
            } else {
                this.p2pOrderTotal = str4;
            }
            if ((i & 16) == 0) {
                this.p2pAmount = "";
            } else {
                this.p2pAmount = str5;
            }
            if ((i & 32) == 0) {
                this.p2pQPAmount = "";
            } else {
                this.p2pQPAmount = str6;
            }
            if ((i & 64) == 0) {
                this.p2pPayment = "";
            } else {
                this.p2pPayment = str7;
            }
        }

        public static final /* synthetic */ void write$Self$OKBuySell_buysell_impl(PreviewPageParameters previewPageParameters, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) previewPageParameters.p2pBasePrice, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, previewPageParameters.p2pBasePrice);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) previewPageParameters.p2pConvertBaseAmount, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 1, previewPageParameters.p2pConvertBaseAmount);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) previewPageParameters.p2pConvertBaseCurrency, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 2, previewPageParameters.p2pConvertBaseCurrency);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) previewPageParameters.p2pOrderTotal, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 3, previewPageParameters.p2pOrderTotal);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) previewPageParameters.p2pAmount, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 4, previewPageParameters.p2pAmount);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) previewPageParameters.p2pQPAmount, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 5, previewPageParameters.p2pQPAmount);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) previewPageParameters.p2pPayment, (Object) "")) {
                return;
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 6, previewPageParameters.p2pPayment);
        }

        public PreviewPageParameters(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            this.p2pBasePrice = str;
            this.p2pConvertBaseAmount = str2;
            this.p2pConvertBaseCurrency = str3;
            this.p2pOrderTotal = str4;
            this.p2pAmount = str5;
            this.p2pQPAmount = str6;
            this.p2pPayment = str7;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:840) call: com.okinc.buysell.ui.bsc.BaseBuySellViewModel.PreviewPageParameters.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ PreviewPageParameters(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
        }
    }

    public static /* synthetic */ void getQuotedPrice$default(BaseBuySellViewModel baseBuySellViewModel, String str, String str2, String str3, InputBaseViewModel inputBaseViewModel, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getQuotedPrice");
        }
        baseBuySellViewModel.KWHzl(str, str2, str3, inputBaseViewModel, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull InputBaseViewModel inputBaseViewModel, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(inputBaseViewModel, "");
        if (this.ORxRYg || z || flVtFt() == TradeType.SELL || flVtFt() == TradeType.BUY) {
            this.ORxRYg = false;
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseBuySellViewModel$getQuotedPrice$1(this, str3, inputBaseViewModel, z2, str, str2, inputBaseViewModel.KWHzl() == InputType.FIAT_INPUT ? 1 : 0, null), 3, null);
        }
    }

    public final void EZpvd(@NotNull Channel channel, @NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(channel, "");
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        mHA.OLrzqt.OLrzqt(this.fJNWhG, Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseBuySellViewModel$removePaymentMethod$1(this, channel, paymentMethod, null), 3, null);
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.bsc.BaseBuySellViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Application extends TaskDescription {
            public static final int copydefault = DexQuoteBean.$stable | B2CQuotePriceBean.$stable;
            public final DexQuoteBean EZpvd;
            public final QuoteType KWHzl;
            public final B2CQuotePriceBean OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, QuoteType quoteType, B2CQuotePriceBean b2CQuotePriceBean, DexQuoteBean dexQuoteBean, int i, Object obj) {
                if ((i & 1) != 0) {
                    quoteType = application.KWHzl;
                }
                if ((i & 2) != 0) {
                    b2CQuotePriceBean = application.OLrzqt;
                }
                if ((i & 4) != 0) {
                    dexQuoteBean = application.EZpvd;
                }
                return application.EZpvd(quoteType, b2CQuotePriceBean, dexQuoteBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DexQuoteBean AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application EZpvd(@NotNull QuoteType quoteType, B2CQuotePriceBean b2CQuotePriceBean, DexQuoteBean dexQuoteBean) {
                Intrinsics.checkNotNullParameter(quoteType, "");
                return new Application(quoteType, b2CQuotePriceBean, dexQuoteBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final B2CQuotePriceBean OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public QuoteType copydefault() {
                return this.KWHzl;
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
                return this.KWHzl == application.KWHzl && Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, application.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.KWHzl.hashCode();
                B2CQuotePriceBean b2CQuotePriceBean = this.OLrzqt;
                int iHashCode2 = b2CQuotePriceBean == null ? 0 : b2CQuotePriceBean.hashCode();
                DexQuoteBean dexQuoteBean = this.EZpvd;
                return (((iHashCode * 31) + iHashCode2) * 31) + (dexQuoteBean != null ? dexQuoteBean.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Success(quoteType=" + this.KWHzl + ", regularTarget=" + this.OLrzqt + ", dexTarget=" + this.EZpvd + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 com.okinc.buysell.ui.bsc.BaseBuySellViewModel$QuoteType)
  (wrap:com.okinc.crcore.shared.net.responsebean.B2CQuotePriceBean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.shared.net.responsebean.B2CQuotePriceBean) : (r3v0 com.okinc.crcore.shared.net.responsebean.B2CQuotePriceBean))
  (wrap:com.okinc.crcore.shared.net.responsebean.DexQuoteBean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.shared.net.responsebean.DexQuoteBean) : (r4v0 com.okinc.crcore.shared.net.responsebean.DexQuoteBean))
 A[MD:(com.okinc.buysell.ui.bsc.BaseBuySellViewModel$QuoteType, com.okinc.crcore.shared.net.responsebean.B2CQuotePriceBean, com.okinc.crcore.shared.net.responsebean.DexQuoteBean):void (m)] (LINE:1004) call: com.okinc.buysell.ui.bsc.BaseBuySellViewModel.TaskDescription.Application.<init>(com.okinc.buysell.ui.bsc.BaseBuySellViewModel$QuoteType, com.okinc.crcore.shared.net.responsebean.B2CQuotePriceBean, com.okinc.crcore.shared.net.responsebean.DexQuoteBean):void type: THIS */
            public /* synthetic */ Application(QuoteType quoteType, B2CQuotePriceBean b2CQuotePriceBean, DexQuoteBean dexQuoteBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(quoteType, (i & 2) != 0 ? null : b2CQuotePriceBean, (i & 4) != 0 ? null : dexQuoteBean);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull QuoteType quoteType, B2CQuotePriceBean b2CQuotePriceBean, DexQuoteBean dexQuoteBean) {
                super(null);
                Intrinsics.checkNotNullParameter(quoteType, "");
                this.KWHzl = quoteType;
                this.OLrzqt = b2CQuotePriceBean;
                this.EZpvd = dexQuoteBean;
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class ActionBar extends TaskDescription {
            public final QuoteType AEQbTJ;
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, QuoteType quoteType, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    quoteType = actionBar.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    str = actionBar.copydefault;
                }
                return actionBar.OLrzqt(quoteType, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public QuoteType OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar OLrzqt(@NotNull QuoteType quoteType, @NotNull String str) {
                Intrinsics.checkNotNullParameter(quoteType, "");
                Intrinsics.checkNotNullParameter(str, "");
                return new ActionBar(quoteType, str);
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
                return this.AEQbTJ == actionBar.AEQbTJ && Intrinsics.EZpvd((Object) this.copydefault, (Object) actionBar.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Fail(quoteType=" + this.AEQbTJ + ", message=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull QuoteType quoteType, @NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(quoteType, "");
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = quoteType;
                this.copydefault = str;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class QuoteType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ QuoteType[] $VALUES;
        public static final QuoteType REGULAR = new QuoteType("REGULAR", 0);
        public static final QuoteType DEX = new QuoteType("DEX", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ QuoteType[] $values() {
            return new QuoteType[]{REGULAR, DEX};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<QuoteType> getEntries() {
            return $ENTRIES;
        }

        private QuoteType(String str, int i) {
        }

        static {
            QuoteType[] quoteTypeArr$values = $values();
            $VALUES = quoteTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(quoteTypeArr$values);
        }

        public static QuoteType valueOf(String str) {
            return (QuoteType) Enum.valueOf(QuoteType.class, str);
        }

        public static QuoteType[] values() {
            return (QuoteType[]) $VALUES.clone();
        }
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.fFgQHt = new PreviewPageParameters((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
        Channel channel = this.gasjUx;
        if (channel != null) {
            int i2 = Activity.copydefault[channel.getCategoryCode().ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                copydefault(str, str2);
            } else if (channel.isConvert()) {
                KWHzl("qp_flow_third", str, str2);
                mHA.OLrzqt.OLrzqt(this.fJNWhG, Boolean.TRUE);
                copydefault(channel.getCategoryCode(), str, str2, i);
            } else {
                KWHzl("third", str, str2);
                copydefault(str, str2);
            }
        }
    }

    public final void copydefault(ChannelCategoryCode channelCategoryCode, String str, String str2, int i) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseBuySellViewModel$getQuoteAndShowQPDialog$1(this, str, str2, i, channelCategoryCode, null), 3, null);
    }

    public final void KWHzl(@NotNull final String str, @NotNull final String str2, @NotNull final String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Channel channel = this.gasjUx;
        ChannelCategoryCode categoryCode = channel != null ? channel.getCategoryCode() : null;
        int i = categoryCode == null ? -1 : Activity.copydefault[categoryCode.ordinal()];
        final String str4 = i != 1 ? i != 2 ? i != 3 ? "unknown" : "native" : "balance" : "third";
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("app_buycrypto_card_confirm_click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lAB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseBuySellViewModel.KWHzl(this.AEQbTJ, str3, str2, str, str4, (EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(BaseBuySellViewModel baseBuySellViewModel, String str, String str2, String str3, String str4, EventParamsList eventParamsList) {
        String currency;
        BuySellCurrency buySellCurrencyAEQbTJ;
        String currency2;
        CurrencyToken currencyTokenCopydefault;
        String str5 = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("device_type", "Android", true);
        mHA mha = mHA.OLrzqt;
        ActionBar actionBar = (ActionBar) mha.AEQbTJ(baseBuySellViewModel.QOLQEE());
        if (actionBar == null || (currencyTokenCopydefault = actionBar.copydefault()) == null || (currency = currencyTokenCopydefault.getCurrency()) == null) {
            currency = baseBuySellViewModel.gHZMYf;
        }
        eventParamsList.put("crypto_currency", currency, false);
        ActionBar actionBar2 = (ActionBar) mha.AEQbTJ(baseBuySellViewModel.QOLQEE());
        if (actionBar2 != null && (buySellCurrencyAEQbTJ = actionBar2.AEQbTJ()) != null && (currency2 = buySellCurrencyAEQbTJ.getCurrency()) != null) {
            str5 = currency2;
        }
        eventParamsList.put("fiat_currency", str5, false);
        eventParamsList.put("type", baseBuySellViewModel.flVtFt().getType(), true);
        eventParamsList.put("fiat_currency_money", str, false);
        eventParamsList.put("crypto_currency_money", str2, false);
        eventParamsList.put("jump_to", str3, false);
        eventParamsList.put(AppsFlyerProperties.CHANNEL, str4, false);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackOrderPreviewButtonClick$default(BaseBuySellViewModel baseBuySellViewModel, OrderType orderType, OrderFrequency orderFrequency, BSCLevel bSCLevel, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackOrderPreviewButtonClick");
        }
        if ((i & 1) != 0) {
            orderType = OrderType.OTHERS;
        }
        if ((i & 2) != 0) {
            orderFrequency = OrderFrequency.NO_FREQ;
        }
        baseBuySellViewModel.KWHzl(orderType, orderFrequency, bSCLevel);
    }

    public final void KWHzl(@NotNull OrderType orderType, @NotNull OrderFrequency orderFrequency, @NotNull BSCLevel bSCLevel) {
        Channel channel;
        CurrencyToken currencyTokenCopydefault;
        BuySellCurrency buySellCurrencyAEQbTJ;
        Intrinsics.checkNotNullParameter(orderType, "");
        Intrinsics.checkNotNullParameter(orderFrequency, "");
        Intrinsics.checkNotNullParameter(bSCLevel, "");
        C31354lsT c31354lsT = C31354lsT.KWHzl;
        TargetTab targetTab = flVtFt() == TradeType.BUY ? TargetTab.BUY : TargetTab.SELL;
        mHA mha = mHA.OLrzqt;
        ActionBar actionBar = (ActionBar) mha.AEQbTJ(QOLQEE());
        String depositName = null;
        String currency = (actionBar == null || (buySellCurrencyAEQbTJ = actionBar.AEQbTJ()) == null) ? null : buySellCurrencyAEQbTJ.getCurrency();
        if (currency == null) {
            currency = "";
        }
        ActionBar actionBar2 = (ActionBar) mha.AEQbTJ(QOLQEE());
        String currency2 = (actionBar2 == null || (currencyTokenCopydefault = actionBar2.copydefault()) == null) ? null : currencyTokenCopydefault.getCurrency();
        if (currency2 == null) {
            currency2 = "";
        }
        Pair pair = (Pair) mha.AEQbTJ(sSMYrx());
        if (pair != null && (channel = (Channel) pair.getFirst()) != null) {
            depositName = channel.getDepositName();
        }
        if (depositName == null) {
            depositName = "";
        }
        c31354lsT.OLrzqt(targetTab, (48 & 2) != 0 ? "" : currency, (48 & 4) != 0 ? "" : currency2, (48 & 8) != 0 ? "" : depositName, (48 & 16) != 0 ? "" : null, (48 & 32) != 0 ? "" : null, (48 & 64) != 0 ? OrderType.OTHERS : orderType, (48 & 128) != 0 ? OrderFrequency.NO_FREQ : orderFrequency, bSCLevel);
    }

    public final void OLrzqt(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            C31354lsT.KWHzl.OLrzqt(str);
        }
    }

    public final void AYXKKw(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C31354lsT.KWHzl.AEQbTJ(flVtFt(), str);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C31354lsT.KWHzl.OLrzqt(flVtFt(), str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(String str, String str2, String str3) {
        String currency;
        String currency2;
        BuySellCurrency buySellCurrencyAEQbTJ;
        CurrencyToken currencyTokenCopydefault;
        C31354lsT c31354lsT = C31354lsT.KWHzl;
        TradeType tradeTypeFlVtFt = flVtFt();
        mHA mha = mHA.OLrzqt;
        ActionBar actionBar = (ActionBar) mha.AEQbTJ(QOLQEE());
        if (actionBar == null || (currencyTokenCopydefault = actionBar.copydefault()) == null || (currency = currencyTokenCopydefault.getCurrency()) == null) {
            currency = this.gHZMYf;
        }
        ActionBar actionBar2 = (ActionBar) mha.AEQbTJ(QOLQEE());
        if (actionBar2 == null || (buySellCurrencyAEQbTJ = actionBar2.AEQbTJ()) == null || (currency2 = buySellCurrencyAEQbTJ.getCurrency()) == null) {
            currency2 = "";
        }
        c31354lsT.KWHzl(tradeTypeFlVtFt, currency, currency2, (8 & 8) != 0 ? "" : null, C34754niS.AEQbTJ.KWHzl(), "fail", str2, str, str3);
    }

    public static /* synthetic */ void trackAIChatbotEvent$default(BaseBuySellViewModel baseBuySellViewModel, String str, InputBaseViewModel inputBaseViewModel, Boolean bool, boolean z, boolean z2, Boolean bool2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackAIChatbotEvent");
        }
        baseBuySellViewModel.OLrzqt(str, inputBaseViewModel, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : bool2);
    }

    public final void OLrzqt(@NotNull String str, @NotNull InputBaseViewModel inputBaseViewModel, final Boolean bool, final boolean z, final boolean z2, final Boolean bool2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(inputBaseViewModel, "");
        final ActionBar actionBar = (ActionBar) mHA.OLrzqt.AEQbTJ(QOLQEE());
        if (actionBar != null) {
            final String str2 = actionBar.copydefault().getCurrency() + " " + actionBar.AEQbTJ().getCurrency();
            final String strDjBIcL = inputBaseViewModel.djBIcL();
            final String strOLrzqt = inputBaseViewModel.OLrzqt(inputBaseViewModel.valueOf(), actionBar);
            C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.lAC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return BaseBuySellViewModel.AEQbTJ(str2, strDjBIcL, strOLrzqt, z, actionBar, z2, bool, bool2, (EventParamsList) obj);
                }
            }, 1, (Object) null);
        }
    }

    public static final Unit AEQbTJ(String str, String str2, String str3, boolean z, ActionBar actionBar, boolean z2, Boolean bool, Boolean bool2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "trade_pair", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "quantity_entered", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.BASE_CURRENCY, str3, false, 4, null);
        if (z) {
            boolean z3 = C33129mqd.AEQbTJ(actionBar.AEQbTJ().getAvailableBalance()) >= C33129mqd.AEQbTJ(str2);
            EventParamsList.put$default(eventParamsList, "chatbot_active", z2 ? "Y" : "N", false, 4, null);
            EventParamsList.put$default(eventParamsList, "has_balance", z3 ? "Y" : "N", false, 4, null);
        }
        if (bool != null) {
            EventParamsList.put$default(eventParamsList, OtcExtraKeys.SIDE, bool.booleanValue() ? "buy" : "sell", false, 4, null);
        }
        if (bool2 != null) {
            EventParamsList.put$default(eventParamsList, "is_first_time", bool2.booleanValue() ? "true" : "false", false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Mode {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode BUY = new Mode("BUY", 0, "buy");
        public static final Mode SELL = new Mode("SELL", 1, "sell");
        private final String type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{BUY, SELL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Mode> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        private Mode(String str, int i, String str2) {
            this.type = str2;
        }

        static {
            Mode[] modeArr$values = $values();
            $VALUES = modeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(modeArr$values);
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.bsc.BaseBuySellViewModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class ActionBar {
            public final DexTradeStatus AEQbTJ;
            public final String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, String str, DexTradeStatus dexTradeStatus, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = actionBar.KWHzl;
                }
                if ((i & 2) != 0) {
                    dexTradeStatus = actionBar.AEQbTJ;
                }
                return actionBar.copydefault(str, dexTradeStatus);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar copydefault(@NotNull String str, @NotNull DexTradeStatus dexTradeStatus) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(dexTradeStatus, "");
                return new ActionBar(str, dexTradeStatus);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DexTradeStatus copydefault() {
                return this.AEQbTJ;
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
                return Intrinsics.EZpvd((Object) this.KWHzl, (Object) actionBar.KWHzl) && this.AEQbTJ == actionBar.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "DexTradeStatusInfo(errorMessage=" + this.KWHzl + ", dexTradeStatus=" + this.AEQbTJ + ")";
            }

            public ActionBar(@NotNull String str, @NotNull DexTradeStatus dexTradeStatus) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(dexTradeStatus, "");
                this.KWHzl = str;
                this.AEQbTJ = dexTradeStatus;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:com.okinc.buysell.ui.bsc.BaseBuySellViewModel$Companion$DexTradeStatus:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.buysell.ui.bsc.BaseBuySellViewModel$Companion$DexTradeStatus:0x000a: SGET  A[WRAPPED] (LINE:1220) com.okinc.buysell.ui.bsc.BaseBuySellViewModel.Companion.DexTradeStatus.NO_ERROR com.okinc.buysell.ui.bsc.BaseBuySellViewModel$Companion$DexTradeStatus) : (r2v0 com.okinc.buysell.ui.bsc.BaseBuySellViewModel$Companion$DexTradeStatus))
 A[MD:(java.lang.String, com.okinc.buysell.ui.bsc.BaseBuySellViewModel$Companion$DexTradeStatus):void (m)] (LINE:1218) call: com.okinc.buysell.ui.bsc.BaseBuySellViewModel.Companion.ActionBar.<init>(java.lang.String, com.okinc.buysell.ui.bsc.BaseBuySellViewModel$Companion$DexTradeStatus):void type: THIS */
            public /* synthetic */ ActionBar(String str, DexTradeStatus dexTradeStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? DexTradeStatus.NO_ERROR : dexTradeStatus);
            }
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class DexTradeStatus {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ DexTradeStatus[] $VALUES;
            public static final Activity Companion;
            public static final DexTradeStatus DEX_COIN_RISK_LEVEL_IS_3;
            public static final DexTradeStatus DEX_COIN_RISK_LEVEL_IS_4;
            public static final DexTradeStatus DEX_COIN_RISK_LEVEL_IS_5;
            public static final DexTradeStatus DEX_EMAIL_NOT_ON_CHAIN;
            public static final DexTradeStatus DEX_EMAIL_SUFFIX_ILLEGAL;
            public static final DexTradeStatus DEX_FEATURE_NOT_AVAILABLE;
            public static final DexTradeStatus DEX_PASSKEY_DELETED;
            public static final DexTradeStatus DEX_PASSKEY_EMAIL_ON_THE_CHAIN;
            public static final DexTradeStatus DEX_PASSKEY_NOT_ON_CHAIN;
            public static final DexTradeStatus DEX_PUBLIC_CHAIN_MAINTENANCE;
            public static final DexTradeStatus DEX_WALLET_CHAIN_ADDRESS_NOT_EXIST;
            public static final DexTradeStatus DEX_WALLET_NEED_ESCAPING;
            public static final DexTradeStatus DEX_WALLET_PRE_CHECK_FAIL;
            public static final DexTradeStatus DEX_ZK_EMAIL_RECOVERING;
            public static final DexTradeStatus DEX_ZK_EMAIL_RECOVER_FAIL;
            public static final DexTradeStatus PASSKEY_INCOMPATIBLE;
            public static final DexTradeStatus UNKNOWN;
            private final String code;
            private final String cta;
            public static final DexTradeStatus NO_ERROR = new DexTradeStatus("NO_ERROR", 0, "0", "");
            public static final DexTradeStatus INVALID_DEX_TOKEN = new DexTradeStatus("INVALID_DEX_TOKEN", 1, "106047", "");
            public static final DexTradeStatus DEX_USER_ACCOUNT_NOT_DEPLOY = new DexTradeStatus("DEX_USER_ACCOUNT_NOT_DEPLOY", 2, "106014", "");
            public static final DexTradeStatus SYSTEM_ERROR_USER = new DexTradeStatus("SYSTEM_ERROR_USER", 3, "106026", "");
            public static final DexTradeStatus DEX_ONLY_SUPPORT_SELL_BECAUSE_CEFI_LISTING = new DexTradeStatus("DEX_ONLY_SUPPORT_SELL_BECAUSE_CEFI_LISTING", 4, "106003", "");
            public static final DexTradeStatus DEX_NOT_SUPPORT_TRADE_BECAUSE_FROM_OUTSIDE = new DexTradeStatus("DEX_NOT_SUPPORT_TRADE_BECAUSE_FROM_OUTSIDE", 5, "106004", "");
            public static final DexTradeStatus DEX_WALLET_NOT_EXIST = new DexTradeStatus("DEX_WALLET_NOT_EXIST", 6, "106005", "");
            public static final DexTradeStatus DEX_WALLET_ESCAPED = new DexTradeStatus("DEX_WALLET_ESCAPED", 7, "106006", "");

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ DexTradeStatus[] $values() {
                return new DexTradeStatus[]{NO_ERROR, INVALID_DEX_TOKEN, DEX_USER_ACCOUNT_NOT_DEPLOY, SYSTEM_ERROR_USER, DEX_ONLY_SUPPORT_SELL_BECAUSE_CEFI_LISTING, DEX_NOT_SUPPORT_TRADE_BECAUSE_FROM_OUTSIDE, DEX_WALLET_NOT_EXIST, DEX_WALLET_ESCAPED, DEX_WALLET_NEED_ESCAPING, DEX_WALLET_CHAIN_ADDRESS_NOT_EXIST, DEX_WALLET_PRE_CHECK_FAIL, DEX_EMAIL_SUFFIX_ILLEGAL, DEX_ZK_EMAIL_RECOVERING, DEX_ZK_EMAIL_RECOVER_FAIL, DEX_PUBLIC_CHAIN_MAINTENANCE, DEX_PASSKEY_NOT_ON_CHAIN, DEX_COIN_RISK_LEVEL_IS_3, DEX_COIN_RISK_LEVEL_IS_4, DEX_COIN_RISK_LEVEL_IS_5, DEX_EMAIL_NOT_ON_CHAIN, DEX_PASSKEY_DELETED, DEX_PASSKEY_EMAIL_ON_THE_CHAIN, DEX_FEATURE_NOT_AVAILABLE, PASSKEY_INCOMPATIBLE, UNKNOWN};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<DexTradeStatus> getEntries() {
                return $ENTRIES;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getCode() {
                return this.code;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getCta() {
                return this.cta;
            }

            private DexTradeStatus(String str, int i, String str2, String str3) {
                this.code = str2;
                this.cta = str3;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 int)
  (r3v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String):void (m)] (LINE:1223) call: com.okinc.buysell.ui.bsc.BaseBuySellViewModel.Companion.DexTradeStatus.<init>(java.lang.String, int, java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ DexTradeStatus(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, str2, (i2 & 2) != 0 ? "" : str3);
            }

            static {
                DEX_WALLET_NEED_ESCAPING = new DexTradeStatus("DEX_WALLET_NEED_ESCAPING", 8, "106007", C34703nhO.AEQbTJ() ? "" : C33070mpX.AYXKKw(C31351lsQ.Activity.DTg));
                DEX_WALLET_CHAIN_ADDRESS_NOT_EXIST = new DexTradeStatus("DEX_WALLET_CHAIN_ADDRESS_NOT_EXIST", 9, "106008", C33070mpX.AYXKKw(C31351lsQ.Activity.DGUQLIDGUQLI));
                DEX_WALLET_PRE_CHECK_FAIL = new DexTradeStatus("DEX_WALLET_PRE_CHECK_FAIL", 10, "106013", C33070mpX.AYXKKw(C31351lsQ.Activity.DGUQLIDGUQLI));
                DEX_EMAIL_SUFFIX_ILLEGAL = new DexTradeStatus("DEX_EMAIL_SUFFIX_ILLEGAL", 11, "106017", C33070mpX.AYXKKw(C31351lsQ.Activity.getLabel));
                DEX_ZK_EMAIL_RECOVERING = new DexTradeStatus("DEX_ZK_EMAIL_RECOVERING", 12, "106018", "");
                DEX_ZK_EMAIL_RECOVER_FAIL = new DexTradeStatus("DEX_ZK_EMAIL_RECOVER_FAIL", 13, "106019", C33070mpX.AYXKKw(C31351lsQ.Activity.DGUQLIOvDItG));
                DEX_PUBLIC_CHAIN_MAINTENANCE = new DexTradeStatus("DEX_PUBLIC_CHAIN_MAINTENANCE", 14, "106020", "");
                DEX_PASSKEY_NOT_ON_CHAIN = new DexTradeStatus("DEX_PASSKEY_NOT_ON_CHAIN", 15, "106021", C33070mpX.AYXKKw(C31351lsQ.Activity.zSsVtY));
                DEX_COIN_RISK_LEVEL_IS_3 = new DexTradeStatus("DEX_COIN_RISK_LEVEL_IS_3", 16, "106023", "");
                DEX_COIN_RISK_LEVEL_IS_4 = new DexTradeStatus("DEX_COIN_RISK_LEVEL_IS_4", 17, "106024", "");
                DEX_COIN_RISK_LEVEL_IS_5 = new DexTradeStatus("DEX_COIN_RISK_LEVEL_IS_5", 18, "106025", "");
                DEX_EMAIL_NOT_ON_CHAIN = new DexTradeStatus("DEX_EMAIL_NOT_ON_CHAIN", 19, "106044", C33070mpX.AYXKKw(C31351lsQ.Activity.zSsVtY));
                DEX_PASSKEY_DELETED = new DexTradeStatus("DEX_PASSKEY_DELETED", 20, "106045", C33070mpX.AYXKKw(C31351lsQ.Activity.getPriority));
                DEX_PASSKEY_EMAIL_ON_THE_CHAIN = new DexTradeStatus("DEX_PASSKEY_EMAIL_ON_THE_CHAIN", 21, "106046", "");
                DEX_FEATURE_NOT_AVAILABLE = new DexTradeStatus("DEX_FEATURE_NOT_AVAILABLE", 22, "106048", "");
                PASSKEY_INCOMPATIBLE = new DexTradeStatus("PASSKEY_INCOMPATIBLE", 23, "-9999", "");
                UNKNOWN = new DexTradeStatus("UNKNOWN", 24, "unknown", "");
                DexTradeStatus[] dexTradeStatusArr$values = $values();
                $VALUES = dexTradeStatusArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(dexTradeStatusArr$values);
                Companion = new Activity(null);
            }

            public static final class Activity {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.bsc.BaseBuySellViewModel.Companion.DexTradeStatus.Activity.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Activity() {
                }

                public final DexTradeStatus KWHzl(@NotNull String str) {
                    DexTradeStatus next;
                    Intrinsics.checkNotNullParameter(str, "");
                    Iterator<DexTradeStatus> it = DexTradeStatus.getEntries().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.EZpvd((Object) next.getCode(), (Object) str)) {
                            break;
                        }
                    }
                    DexTradeStatus dexTradeStatus = next;
                    return dexTradeStatus == null ? DexTradeStatus.UNKNOWN : dexTradeStatus;
                }
            }

            public static DexTradeStatus valueOf(String str) {
                return (DexTradeStatus) Enum.valueOf(DexTradeStatus.class, str);
            }

            public static DexTradeStatus[] values() {
                return (DexTradeStatus[]) $VALUES.clone();
            }
        }
    }
}
