package o;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.kline.data.KlineCoinInfo;
import com.okinc.kline.data.SocialMediaItem;
import com.okinc.market.common.biz_spot.CoinDataInfo;
import com.okinc.market.common.biz_spot.Members;
import com.okinc.market.common.biz_spot.bean.TokenTradeInfoData;
import com.okinc.market.common.service.KlineBizMarketService;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.SubHelper;
import com.okinc.search.bean.SearchResultContentPo;
import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.unify_trade.net.BizApiService;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oLF {
    public static final oLF EZpvd = new oLF();
    public static java.lang.Object copydefault = new java.lang.Object();
    public static final int OLrzqt = 8;

    private oLF() {
    }

    public final void EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, final Function1<? super java.lang.Boolean, Unit> function1, final Function1<? super CoinDataInfo, Unit> function12, @NotNull final Function1<? super java.util.List<? extends java.lang.Object>, Unit> function13) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function13, "");
        C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null)).getCoinDataInfo(str), lifecycleOwner), new Function1() { // from class: o.oLI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oLF.AEQbTJ(function1, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.oLJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oLF.KWHzl(function12, function13, function1, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(Function1 function1, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public final java.util.List<java.lang.Object> copydefault(CoinDataInfo coinDataInfo) {
        java.lang.Object objM7377constructorimpl;
        java.lang.String issuePrice;
        java.lang.String flowTotal;
        java.lang.Long issueTime;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new C38569pbs(C33070mpX.AYXKKw(C35964oKf.Fragment.QCjLjM), pTA.formatSimpleDate$default(new Date((coinDataInfo == null || (issueTime = coinDataInfo.getIssueTime()) == null) ? 0L : issueTime.longValue()), null, 1, null)));
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (coinDataInfo != null ? coinDataInfo.getIssuePrice() : null))) {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl((coinDataInfo == null || (issuePrice = coinDataInfo.getIssuePrice()) == null) ? null : java.lang.Double.valueOf(java.lang.Double.parseDouble(issuePrice)));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            java.lang.Double d = (java.lang.Double) objM7377constructorimpl;
            if (d == null || Intrinsics.EZpvd(d, AudioStats.AUDIO_AMPLITUDE_NONE)) {
                arrayList.add(new C38569pbs(C33070mpX.AYXKKw(C35964oKf.Fragment.OxVOHk), "--"));
            } else {
                arrayList.add(new C38569pbs(C33070mpX.AYXKKw(C35964oKf.Fragment.OxVOHk), EZpvd.copydefault(new BigDecimal(coinDataInfo != null ? coinDataInfo.getIssuePrice() : null))));
            }
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (coinDataInfo != null ? coinDataInfo.getHigh_price() : null))) {
            arrayList.add(new C38569pbs(C33070mpX.AYXKKw(C35964oKf.Fragment.OHqIaq), EZpvd.copydefault(new BigDecimal(coinDataInfo != null ? coinDataInfo.getHigh_price() : null))));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (coinDataInfo != null ? coinDataInfo.getVol() : null))) {
            arrayList.add(new C38569pbs(C33070mpX.AYXKKw(C35964oKf.Fragment.QVsKAR), EZpvd.EZpvd(new BigDecimal(coinDataInfo != null ? coinDataInfo.getVol() : null))));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (coinDataInfo != null ? coinDataInfo.getMarketCap() : null))) {
            arrayList.add(new C38569pbs(C33070mpX.AYXKKw(C35964oKf.Fragment.OJuSTm), EZpvd.EZpvd(new BigDecimal(coinDataInfo != null ? coinDataInfo.getMarketCap() : null))));
        }
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.OFhtUX);
        if (coinDataInfo == null || (flowTotal = coinDataInfo.getFlowTotal()) == null) {
            flowTotal = "0";
        }
        arrayList.add(new C38569pbs(strAYXKKw, pTB.toLocalizationStringWithMaxPrecision$default(flowTotal, 0, RoundingMode.DOWN, null, 4, null)));
        return arrayList;
    }

    public final java.lang.String copydefault(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        BigDecimal bigDecimalOLrzqt = OLrzqt(bigDecimal);
        java.lang.String strRJOkX = ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).RJOkX();
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(bigDecimalOLrzqt);
        return strRJOkX + ((java.lang.Object) pTB.formatRoundToFixed$default(bigDecimalEZpvd, C54573xNj.copydefault.AEQbTJ(bigDecimalEZpvd.doubleValue()), null, 2, null));
    }

    public final java.lang.String EZpvd(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        java.lang.String strKWHzl = pDM.KWHzl(java.lang.Double.valueOf(C33129mqd.AEQbTJ(OLrzqt(bigDecimal).setScale(C54573xNj.copydefault.AEQbTJ(C33129mqd.AEQbTJ(bigDecimal)), RoundingMode.HALF_UP))));
        Intrinsics.checkNotNullExpressionValue(strKWHzl, "");
        return strKWHzl;
    }

    public final BigDecimal OLrzqt(@NotNull BigDecimal bigDecimal) {
        xMW xmwKWHzl;
        java.lang.String strAhwBna;
        BigDecimal bigDecimalEZpvd;
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (xmwKWHzl = interfaceC54581xNrOLrzqt.KWHzl()) == null || (strAhwBna = xmwKWHzl.AhwBna(C33129mqd.gEmmrt(bigDecimal))) == null || (bigDecimalEZpvd = C33129mqd.EZpvd(strAhwBna)) == null) ? new BigDecimal("0") : bigDecimalEZpvd;
    }

    public final java.util.List<java.lang.Object> KWHzl(KlineCoinInfo klineCoinInfo) {
        java.util.ArrayList<SocialMediaItem> socialMediaList;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (klineCoinInfo != null && (socialMediaList = klineCoinInfo.getSocialMediaList()) != null) {
            for (SocialMediaItem socialMediaItem : socialMediaList) {
                java.lang.String url = socialMediaItem.getUrl();
                oLF olf = EZpvd;
                OLrzqt(url, arrayList2, olf.AEQbTJ(socialMediaItem.getName()), olf.OLrzqt(socialMediaItem.getName()));
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new C38918piW(arrayList2));
        }
        if (C33129mqd.KWHzl((java.util.Collection) (klineCoinInfo != null ? klineCoinInfo.getMembers() : null))) {
            arrayList.add(C33070mpX.AYXKKw(C35964oKf.Fragment.RKDWNf));
            java.util.ArrayList<Members> members = klineCoinInfo != null ? klineCoinInfo.getMembers() : null;
            Intrinsics.copydefault(members);
            arrayList.addAll(members);
        }
        return arrayList;
    }

    public static final void OLrzqt(java.lang.String str, java.util.ArrayList<C38920piY> arrayList, java.lang.String str2, int i) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            arrayList.add(new C38920piY(i, str2, str));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [168=8] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String AEQbTJ(java.lang.String str) {
        switch (str.hashCode()) {
            case -1360467711:
                if (str.equals("telegram")) {
                    return C33070mpX.AYXKKw(C35964oKf.Fragment.registerKeyboardTarget);
                }
                return "";
            case -1245635613:
                if (str.equals("github")) {
                    return C33070mpX.AYXKKw(C35964oKf.Fragment.dvKsVJ);
                }
                return "";
            case -1060419964:
                if (str.equals("officialUrl")) {
                    return C33070mpX.AYXKKw(C35964oKf.Fragment.dxcTrN);
                }
                return "";
            case -916346253:
                if (str.equals(SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_TWITTER)) {
                    return C33070mpX.AYXKKw(C35964oKf.Fragment.setCurrentKeyboardTarget);
                }
                return "";
            case -601803301:
                if (str.equals("blockBrowser")) {
                    return C33070mpX.AYXKKw(C35964oKf.Fragment.fFgQHt);
                }
                return "";
            case 244156131:
                if (str.equals("whitePaper")) {
                    return C33070mpX.AYXKKw(C35964oKf.Fragment.gasjUx);
                }
                return "";
            case 497130182:
                if (str.equals("facebook")) {
                    return C33070mpX.AYXKKw(C35964oKf.Fragment.clearCurrentKeyboardTarget);
                }
                return "";
            default:
                return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int OLrzqt(java.lang.String str) {
        switch (str.hashCode()) {
            case -1360467711:
                if (str.equals("telegram")) {
                    return C52761wXj.TaskDescription.SaJVGb;
                }
                return 0;
            case -1245635613:
                if (str.equals("github")) {
                    return C52761wXj.TaskDescription.sbu;
                }
                return 0;
            case -1060419964:
                if (str.equals("officialUrl")) {
                    return C52761wXj.TaskDescription.ikIEnW;
                }
                return 0;
            case -916346253:
                if (str.equals(SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_TWITTER)) {
                    return C52761wXj.TaskDescription.ICustomTabsServiceDefault;
                }
                return 0;
            case -601803301:
                if (str.equals("blockBrowser")) {
                    return C52761wXj.TaskDescription.cancel;
                }
                return 0;
            case 244156131:
                if (str.equals("whitePaper")) {
                    return C52761wXj.TaskDescription.receiveFile;
                }
                return 0;
            case 497130182:
                if (str.equals("facebook")) {
                    return C52761wXj.TaskDescription.invokespecialsiEkQe;
                }
                return 0;
            default:
                return 0;
        }
    }

    public final void AEQbTJ() {
        SubHelper.AEQbTJ(copydefault);
    }

    public final LiveData<TokenTradeInfoData> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        final MutableLiveData mutableLiveData = new MutableLiveData();
        C33024moe.subscribeOnIO$default(((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null)).getTokenTradeData(str, str2), new Function1() { // from class: o.oLK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oLF.KWHzl(mutableLiveData, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.oLL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oLF.EZpvd(mutableLiveData, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
        return mutableLiveData;
    }

    public static final Unit KWHzl(MutableLiveData mutableLiveData, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C55326xho.toast$default(C35964oKf.Fragment.DGUQLIDGUQLI, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        mutableLiveData.postValue(null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ LiveData getIndexTickers$default(oLF olf, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return olf.EZpvd(str, str2);
    }

    public final LiveData<IndexTickersData> EZpvd(final java.lang.String str, java.lang.String str2) {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        C33024moe.subscribeOnIO$default(((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).getIndexTickers(str2, str), new Function1() { // from class: o.oLE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oLF.KWHzl((java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.oLH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oLF.copydefault(mutableLiveData, str, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
        return mutableLiveData;
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C55326xho.toast$default(th.getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull final Function2<? super KlineCoinInfo, ? super java.util.List<? extends java.lang.Object>, Unit> function2) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null)).getCoinInvestment(str), lifecycleOwner), (Function1) null, (Function0) null, new Function1() { // from class: o.oLM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oLF.EZpvd(function2, (ResponseData) obj);
            }
        }, 3, (java.lang.Object) null);
    }

    public final java.lang.String KWHzl(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        java.lang.String strKWHzl = pDM.KWHzl(java.lang.Double.valueOf(C33129mqd.AEQbTJ(OLrzqt(bigDecimal))));
        Intrinsics.checkNotNullExpressionValue(strKWHzl, "");
        return strKWHzl;
    }

    public static /* synthetic */ java.lang.String getKFormatAmountWithCurrency2$default(oLF olf, BigDecimal bigDecimal, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 20;
        }
        return olf.KWHzl(bigDecimal, i);
    }

    public final java.lang.String KWHzl(@NotNull BigDecimal bigDecimal, int i) {
        java.lang.String roundToFixed$default;
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        BigDecimal bigDecimalOLrzqt = OLrzqt(bigDecimal);
        java.lang.String strRJOkX = ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).RJOkX();
        if (bigDecimalOLrzqt.compareTo(new BigDecimal(1)) < 0) {
            roundToFixed$default = pTB.formatRoundToMax$default(pTB.OLrzqt(bigDecimalOLrzqt), i, null, 2, null);
        } else {
            roundToFixed$default = pTB.formatRoundToFixed$default(pTB.OLrzqt(bigDecimalOLrzqt), 2, null, 2, null);
        }
        return strRJOkX + roundToFixed$default;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        xMW xmwKWHzl;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLValues;
        C54536xML c54536xMLAkhnZx;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLAEQbTJ;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (xmwKWHzl = interfaceC54581xNrOLrzqt.KWHzl()) == null || (c54536xMLAYXKKw = xmwKWHzl.AYXKKw(str)) == null || (c54536xMLValues = c54536xMLAYXKKw.values()) == null || (c54536xMLAkhnZx = c54536xMLValues.AkhnZx()) == null || (c54536xMLIsConnected = c54536xMLAkhnZx.isConnected()) == null || (c54536xMLAEQbTJ = c54536xMLIsConnected.AEQbTJ(true)) == null || (c54536xMLDjBIcL = c54536xMLAEQbTJ.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) ? "" : safeString$default;
    }

    public static final Unit KWHzl(Function1 function1, Function1 function12, Function1 function13, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            if (responseData.getData() != null) {
                if (function1 != null) {
                    try {
                        function1.invoke(responseData.getData());
                    } catch (java.lang.Exception unused) {
                    }
                }
                function12.invoke(EZpvd.copydefault((CoinDataInfo) responseData.getData()));
            }
        } else if (function13 != null) {
            function13.invoke(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(MutableLiveData mutableLiveData, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getData() != null) {
            mutableLiveData.postValue((TokenTradeInfoData) responseData.getData());
        } else {
            C55326xho.toast$default(C35964oKf.Fragment.DGUQLIDGUQLI, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            mutableLiveData.postValue(null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(MutableLiveData mutableLiveData, java.lang.String str, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.lang.Object obj = null;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.List list = (java.util.List) responseData.getData();
            if (list != null) {
                java.util.Iterator it = list.iterator();
                boolean z = false;
                java.lang.Object obj2 = null;
                while (true) {
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        if (Intrinsics.EZpvd((java.lang.Object) ((IndexTickersData) next).getInstId(), (java.lang.Object) str)) {
                            if (z) {
                                break;
                            }
                            z = true;
                            obj2 = next;
                        }
                    } else if (z) {
                        obj = obj2;
                    }
                }
                obj = (IndexTickersData) obj;
            }
            mutableLiveData.postValue(obj);
        } else {
            mutableLiveData.postValue(null);
            C55326xho.toast$default(C35964oKf.Fragment.DWgRXt, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function2 function2, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            function2.invoke(data, EZpvd.KWHzl((KlineCoinInfo) responseData.getData()));
        }
        return Unit.INSTANCE;
    }
}
