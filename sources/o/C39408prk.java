package o;

import androidx.lifecycle.ViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.ui.earn.CoinEarnViewModel$getCoinInfo$1;
import com.okinc.kline.ui.earn.CoinEarnViewModel$getCoinInfo$result$1$content$2;
import com.okinc.market.common.service.KlineBizMarketService;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C35964oKf;
import o.InterfaceC43294rma;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.prk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C39408prk extends ViewModel {
    public java.lang.String AEQbTJ;
    public final java.lang.String EZpvd = C33070mpX.AYXKKw(C35964oKf.Fragment.DGUQLIOvDItG);
    public final java.lang.String copydefault = C33070mpX.AYXKKw(C35964oKf.Fragment.htlTjW);
    public final java.lang.String KWHzl = C33070mpX.AYXKKw(C35964oKf.Fragment.QwvEab);
    public final java.lang.String OLrzqt = C33070mpX.AYXKKw(C35964oKf.Fragment.fdOvFl);
    public final InterfaceC47278tmy djBIcL = ((InterfaceC47230tmC) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC47230tmC.class)).fmB();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.String str) {
        this.AEQbTJ = str;
    }

    public final java.lang.String AEQbTJ(java.lang.Integer num) {
        return (num != null && num.intValue() == 1) ? this.copydefault : (num != null && num.intValue() == 2) ? this.KWHzl : (num != null && num.intValue() == 3) ? this.OLrzqt : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<C39417pru>> continuation) throws java.lang.Throwable {
        CoinEarnViewModel$getCoinInfo$1 coinEarnViewModel$getCoinInfo$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        java.util.Collection collectionAhwBna;
        if (continuation instanceof CoinEarnViewModel$getCoinInfo$1) {
            coinEarnViewModel$getCoinInfo$1 = (CoinEarnViewModel$getCoinInfo$1) continuation;
            int i = coinEarnViewModel$getCoinInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                coinEarnViewModel$getCoinInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                coinEarnViewModel$getCoinInfo$1 = new CoinEarnViewModel$getCoinInfo$1(this, continuation);
            }
        }
        java.lang.Object recommendEarnProduct$default = coinEarnViewModel$getCoinInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = coinEarnViewModel$getCoinInfo$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(recommendEarnProduct$default);
            Result.Application application2 = Result.Companion;
            KlineBizMarketService klineBizMarketService = (KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null);
            coinEarnViewModel$getCoinInfo$1.label = 1;
            recommendEarnProduct$default = KlineBizMarketService.StateListAnimator.getRecommendEarnProduct$default(klineBizMarketService, str, null, coinEarnViewModel$getCoinInfo$1, 2, null);
            if (recommendEarnProduct$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(recommendEarnProduct$default);
                collectionAhwBna = yDY.AhwBna();
                objM7377constructorimpl = Result.m7377constructorimpl(collectionAhwBna);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("CoinEarnViewModel", "getCoinInfo error", thM7380exceptionOrNullimpl);
                }
                return Result.m7383isFailureimpl(objM7377constructorimpl) ? yDY.AhwBna() : objM7377constructorimpl;
            }
            C56391yDq.AEQbTJ(recommendEarnProduct$default);
        }
        ResponseData responseData = (ResponseData) recommendEarnProduct$default;
        if (responseData.getCode() == 0) {
            java.util.List list = (java.util.List) responseData.getData();
            if (list == null) {
                collectionAhwBna = yDY.AhwBna();
            } else {
                collectionAhwBna = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    collectionAhwBna.add(obj);
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(collectionAhwBna);
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            }
        } else {
            MainCoroutineDispatcher main = Dispatchers.getMain();
            CoinEarnViewModel$getCoinInfo$result$1$content$2 coinEarnViewModel$getCoinInfo$result$1$content$2 = new CoinEarnViewModel$getCoinInfo$result$1$content$2(responseData, null);
            coinEarnViewModel$getCoinInfo$1.label = 2;
            if (BuildersKt.withContext(main, coinEarnViewModel$getCoinInfo$result$1$content$2, coinEarnViewModel$getCoinInfo$1) == objCopydefault) {
                return objCopydefault;
            }
            collectionAhwBna = yDY.AhwBna();
            objM7377constructorimpl = Result.m7377constructorimpl(collectionAhwBna);
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            }
        }
    }

    public final java.util.List<java.lang.Object> copydefault(@NotNull C39417pru c39417pru) {
        java.lang.Object objM7377constructorimpl;
        java.util.List<java.lang.String> listOLrzqt;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Integer num;
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(c39417pru, "");
        try {
            Result.Application application = Result.Companion;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<C39412prp> listOLrzqt2 = c39417pru.OLrzqt();
            if (listOLrzqt2 != null) {
                for (C39412prp c39412prp : listOLrzqt2) {
                    java.util.List<C39377prE> listKWHzl = c39412prp.KWHzl();
                    if (listKWHzl != null && C33129mqd.KWHzl((java.util.Collection) listKWHzl)) {
                        java.lang.String strCopydefault = c39412prp.copydefault();
                        if (strCopydefault == null) {
                            strCopydefault = "";
                        }
                        arrayList.add(strCopydefault);
                        for (final C39377prE c39377prE : c39412prp.KWHzl()) {
                            C39379prG c39379prGCopydefault = c39377prE.copydefault();
                            java.lang.String str3 = (c39379prGCopydefault == null || (strKWHzl = C39381prI.KWHzl(c39379prGCopydefault)) == null) ? "" : strKWHzl;
                            java.lang.String str4 = this.EZpvd;
                            java.util.List<java.lang.Integer> listAEQbTJ = c39377prE.AEQbTJ();
                            java.lang.String strAEQbTJ = AEQbTJ(java.lang.Integer.valueOf((listAEQbTJ == null || (num = (java.lang.Integer) CollectionsKt___CollectionsKt.firstOrNull(listAEQbTJ)) == null) ? 0 : num.intValue()));
                            java.util.List<java.lang.String> listOLrzqt3 = c39377prE.OLrzqt();
                            java.lang.String str5 = (listOLrzqt3 == null || (str2 = (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(listOLrzqt3)) == null) ? "" : str2;
                            java.util.List<java.lang.String> listOLrzqt4 = c39377prE.OLrzqt();
                            arrayList.add(new C39420prx(str3, str4, strAEQbTJ, str5, (listOLrzqt4 == null || listOLrzqt4.size() < 2 || (listOLrzqt = c39377prE.OLrzqt()) == null || (str = listOLrzqt.get(1)) == null) ? "" : str, new Function1() { // from class: o.prt
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C39408prk.KWHzl(this.KWHzl, c39377prE, (android.content.Context) obj);
                                }
                            }));
                        }
                    }
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.util.List listAhwBna = yDY.AhwBna();
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = listAhwBna;
        }
        return (java.util.List) objM7377constructorimpl;
    }

    public static final Unit KWHzl(final C39408prk c39408prk, final C39377prE c39377prE, android.content.Context context) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(context, "");
        C32866mlf.onEvent$default("Token_Earn_ProductsSelect_Click", (TrackChannel[]) null, new Function1() { // from class: o.prr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39408prk.KWHzl(this.EZpvd, c39377prE, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (!c39408prk.djBIcL.values()) {
            InterfaceC8104awT.StateListAnimator.routeLogin$default((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class), context, null, 2, null);
        } else {
            java.lang.String strEZpvd = c39377prE.EZpvd();
            if (strEZpvd != null) {
                try {
                    Result.Application application = Result.Companion;
                    java.util.List<java.lang.String> queryParameters = android.net.Uri.parse(strEZpvd).getQueryParameters("pageurl");
                    Intrinsics.copydefault(queryParameters);
                    java.lang.String str = queryParameters.isEmpty() ^ true ? (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(queryParameters) : "";
                    android.net.Uri uri = android.net.Uri.parse(strEZpvd);
                    Intrinsics.checkNotNullExpressionValue(uri, "");
                    android.net.Uri uriAEQbTJ = C39415prs.AEQbTJ(uri, "pageurl", str + "&from=trade&page=token");
                    objM7377constructorimpl = Result.m7377constructorimpl(uriAEQbTJ != null ? uriAEQbTJ.toString() : null);
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = strEZpvd;
                }
                java.lang.String str2 = (java.lang.String) objM7377constructorimpl;
                InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), context, str2 == null ? strEZpvd : str2, null, new Function1() { // from class: o.prq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C39408prk.copydefault((AbstractC43238rlX) obj);
                    }
                }, 4, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C39408prk c39408prk, C39377prE c39377prE, EventParamsList eventParamsList) {
        java.lang.Integer numEZpvd;
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String str2 = c39408prk.AEQbTJ;
        if (str2 == null) {
            str2 = "";
        }
        eventParamsList.put("token", str2, true);
        C39376prD c39376prDKWHzl = c39377prE.KWHzl();
        if (c39376prDKWHzl != null && (numEZpvd = c39376prDKWHzl.EZpvd()) != null && (string = numEZpvd.toString()) != null) {
            str = string;
        }
        eventParamsList.put("product_type", str, true);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }
}
