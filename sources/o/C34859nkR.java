package o;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.okinc.find_ui.data.AssetDistributionData;
import com.okinc.find_ui.data.ContractLongShortRatioData;
import com.okinc.find_ui.data.InterestAndTradingUnionItem;
import com.okinc.find_ui.data.KlineBuySellData;
import com.okinc.find_ui.data.KlineCapitalFlowData;
import com.okinc.find_ui.data.KlineFundingRateData;
import com.okinc.find_ui.data.LongShortRatioData;
import com.okinc.market.common.service.BizMarketService;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nkR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34859nkR extends AndroidViewModel {
    public MutableLiveData<KlineBuySellData> AEQbTJ;
    public MutableLiveData<java.util.ArrayList<InterestAndTradingUnionItem>> AYXKKw;
    public MutableLiveData<java.util.ArrayList<ContractLongShortRatioData>> AhwBna;
    public java.lang.String EZpvd;
    public MutableLiveData<java.util.ArrayList<LongShortRatioData>> KWHzl;
    public MutableLiveData<java.util.ArrayList<KlineCapitalFlowData>> OLrzqt;
    public MutableLiveData<AssetDistributionData> copydefault;
    public MutableLiveData<java.util.ArrayList<LongShortRatioData>> djBIcL;
    public final MutableLiveData<java.util.ArrayList<ContractLongShortRatioData>> gEmmrt;
    public MutableLiveData<java.util.ArrayList<KlineFundingRateData>> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.ArrayList<LongShortRatioData>> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.ArrayList<LongShortRatioData>> AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.ArrayList<KlineFundingRateData>> AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.ArrayList<ContractLongShortRatioData>> EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.ArrayList<KlineCapitalFlowData>> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<AssetDistributionData> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<KlineBuySellData> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.ArrayList<InterestAndTradingUnionItem>> valueOf() {
        return this.AYXKKw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34859nkR(@NotNull android.app.Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "");
        this.EZpvd = "KAssetDistributionViewModel";
        this.copydefault = new MutableLiveData<>();
        this.OLrzqt = new MutableLiveData<>();
        this.djBIcL = new MutableLiveData<>();
        this.KWHzl = new MutableLiveData<>();
        this.AYXKKw = new MutableLiveData<>();
        this.valueOf = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        this.gEmmrt = new MutableLiveData<>();
        this.AEQbTJ = new MutableLiveData<>();
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C33024moe.subscribeOnIO$default(((BizMarketService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizMarketService.class))).getAssetDistribution(str, str2), new Function1() { // from class: o.nlb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34859nkR.AhwBna(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.nle
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34859nkR.AhwBna(this.OLrzqt, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit AhwBna(C34859nkR c34859nkR, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        c34859nkR.copydefault.postValue(null);
        C43296rmc.KWHzl(c34859nkR.EZpvd, "获取现货资金分布数据: onError:" + th.getMessage());
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C33024moe.subscribeOnIO$default(((BizMarketService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizMarketService.class))).getLongShortRatio(str, str2), new Function1() { // from class: o.nkX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34859nkR.fetchVPNInfo(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.nla
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34859nkR.OLrzqt(this.EZpvd, str3, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit fetchVPNInfo(C34859nkR c34859nkR, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        c34859nkR.djBIcL.postValue(null);
        c34859nkR.KWHzl.postValue(null);
        C43296rmc.KWHzl(c34859nkR.EZpvd, "获取杠杆多空比: onError:" + th.getMessage());
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C33024moe.subscribeOnIO$default(((BizMarketService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizMarketService.class))).getCapitalFlow(str, str2), new Function1() { // from class: o.nkZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34859nkR.gEmmrt(this.KWHzl, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.nlc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34859nkR.AYXKKw(this.EZpvd, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit gEmmrt(C34859nkR c34859nkR, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        c34859nkR.OLrzqt.postValue(null);
        C43296rmc.KWHzl(c34859nkR.EZpvd, "获取资金趋势: onError:" + th.getMessage());
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C33024moe.subscribeOnIO$default(((BizMarketService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizMarketService.class))).getInterestAndTrading(str, str2), new Function1() { // from class: o.nld
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34859nkR.AkhnZx(this.KWHzl, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.nlf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34859nkR.gEmmrt(this.copydefault, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit AkhnZx(C34859nkR c34859nkR, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        c34859nkR.AYXKKw.postValue(null);
        C43296rmc.KWHzl(c34859nkR.EZpvd, "获取合约交易量持仓量: onError:" + th.getMessage());
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C33024moe.subscribeOnIO$default(((BizMarketService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizMarketService.class))).getFundingRate(str), new Function1() { // from class: o.nkW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34859nkR.values(this.OLrzqt, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.nkY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34859nkR.djBIcL(this.KWHzl, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit values(C34859nkR c34859nkR, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        c34859nkR.valueOf.postValue(null);
        C43296rmc.KWHzl(c34859nkR.EZpvd, "获取合约资金费率: onError:" + th.getMessage());
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C33024moe.subscribeOnIO$default(((BizMarketService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizMarketService.class))).getContractLongShortRatio(str, str2), new Function1() { // from class: o.nkU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34859nkR.DbNXlk(this.EZpvd, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.nkV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34859nkR.AEQbTJ(this.EZpvd, str3, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit DbNXlk(C34859nkR c34859nkR, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        c34859nkR.gEmmrt.postValue(null);
        c34859nkR.AhwBna.postValue(null);
        C43296rmc.KWHzl(c34859nkR.EZpvd, "获取合约多空比: onError:" + th.getMessage());
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C33024moe.subscribeOnIO$default(((BizMarketService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizMarketService.class))).getBuyAndSell(str, str2, str3), new Function1() { // from class: o.nkS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34859nkR.djBIcL(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.nkT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34859nkR.valueOf(this.copydefault, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit djBIcL(C34859nkR c34859nkR, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        c34859nkR.AEQbTJ.postValue(null);
        C43296rmc.KWHzl(c34859nkR.EZpvd, "获取合约主动买卖: onError:" + th.getMessage());
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C34859nkR c34859nkR, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            AssetDistributionData assetDistributionData = (AssetDistributionData) responseData.getData();
            if (assetDistributionData != null) {
                c34859nkR.copydefault.postValue(assetDistributionData);
            }
        } else {
            c34859nkR.copydefault.postValue(new AssetDistributionData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 2097151, (DefaultConstructorMarker) null));
            C43296rmc.KWHzl(c34859nkR.EZpvd, "获取现货资金分布数据:数据为空 " + responseData.getMsg());
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C34859nkR c34859nkR, java.lang.String str, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.ArrayList<LongShortRatioData> arrayList = (java.util.ArrayList) responseData.getData();
            if (arrayList != null) {
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "margin_ratio_chart")) {
                    c34859nkR.djBIcL.postValue(arrayList);
                } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "margin_borrow_chart")) {
                    c34859nkR.KWHzl.postValue(arrayList);
                } else {
                    c34859nkR.djBIcL.postValue(arrayList);
                    c34859nkR.KWHzl.postValue(arrayList);
                }
            }
        } else {
            c34859nkR.djBIcL.postValue(null);
            c34859nkR.KWHzl.postValue(null);
            C43296rmc.KWHzl(c34859nkR.EZpvd, "获取杠杆多空比:数据为空 " + responseData.getMsg());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C34859nkR c34859nkR, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.ArrayList<KlineCapitalFlowData> arrayList = (java.util.ArrayList) responseData.getData();
            if (arrayList != null) {
                c34859nkR.OLrzqt.postValue(arrayList);
            }
        } else {
            c34859nkR.OLrzqt.postValue(null);
            C43296rmc.KWHzl(c34859nkR.EZpvd, "获取资金趋势:数据为空 " + responseData.getMsg());
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C34859nkR c34859nkR, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.ArrayList<InterestAndTradingUnionItem> arrayList = (java.util.ArrayList) responseData.getData();
            if (arrayList != null) {
                c34859nkR.AYXKKw.postValue(arrayList);
            }
        } else {
            c34859nkR.AYXKKw.postValue(null);
            C43296rmc.KWHzl(c34859nkR.EZpvd, "获取合约交易量持仓量:数据为空 " + responseData.getMsg());
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C34859nkR c34859nkR, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.ArrayList<KlineFundingRateData> arrayList = (java.util.ArrayList) responseData.getData();
            if (arrayList != null) {
                c34859nkR.valueOf.postValue(arrayList);
            }
        } else {
            c34859nkR.valueOf.postValue(null);
            C43296rmc.KWHzl(c34859nkR.EZpvd, "获取合约资金费率:数据为空 " + responseData.getMsg());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C34859nkR c34859nkR, java.lang.String str, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.ArrayList<ContractLongShortRatioData> arrayList = (java.util.ArrayList) responseData.getData();
            if (arrayList != null) {
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "futures_ratio_chart")) {
                    c34859nkR.AhwBna.postValue(arrayList);
                } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "futures_account_chart")) {
                    c34859nkR.gEmmrt.postValue(arrayList);
                } else {
                    c34859nkR.AhwBna.postValue(arrayList);
                    c34859nkR.gEmmrt.postValue(arrayList);
                }
            }
        } else {
            c34859nkR.gEmmrt.postValue(null);
            c34859nkR.AhwBna.postValue(null);
            C43296rmc.KWHzl(c34859nkR.EZpvd, "获取合约多空比:数据为空 " + responseData.getMsg());
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C34859nkR c34859nkR, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            KlineBuySellData klineBuySellData = (KlineBuySellData) responseData.getData();
            if (klineBuySellData != null) {
                c34859nkR.AEQbTJ.postValue(klineBuySellData);
            }
        } else {
            c34859nkR.AEQbTJ.postValue(null);
            C43296rmc.KWHzl(c34859nkR.EZpvd, "获取合约主动买卖:数据为空 " + responseData.getMsg());
        }
        return Unit.INSTANCE;
    }
}
