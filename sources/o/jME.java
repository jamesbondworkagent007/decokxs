package o;

import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.data.model.PnlDetailPo;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.domain.usecase.RequestPnlDetailUseCase$onExecute$1;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.domain.usecase.RequestPnlDetailUseCase$poToVo$1;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailVo;
import com.okinc.market.ext.UpDownColor;
import com.okinc.network.okg.response.ResponseData;
import java.math.BigDecimal;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C25962jMv;
import o.C25963jMw;
import o.InterfaceC49371unL;
import o.jMB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jME extends AbstractC49400uno<Activity, InterfaceC49371unL<? extends PnlDetailVo>> {
    public final InterfaceC8218ayb AEQbTJ;
    public final C25965jMy AhwBna;
    public final C25963jMw EZpvd;
    public final jMB KWHzl;
    public final C25962jMv OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final C25959jMs djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    public static final class Activity {
        public final java.lang.Integer AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.Boolean OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Boolean bool, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = activity.KWHzl;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                num = activity.AEQbTJ;
            }
            java.lang.Integer num2 = num;
            if ((i & 8) != 0) {
                bool = activity.OLrzqt;
            }
            java.lang.Boolean bool2 = bool;
            if ((i & 16) != 0) {
                str3 = activity.copydefault;
            }
            return activity.KWHzl(str, str4, num2, bool2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Boolean bool, java.lang.String str3) {
            return new Activity(str, str2, num, bool, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.EZpvd;
            int iHashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.KWHzl;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.Integer num = this.AEQbTJ;
            int iHashCode3 = num == null ? 0 : num.hashCode();
            java.lang.Boolean bool = this.OLrzqt;
            int iHashCode4 = bool == null ? 0 : bool.hashCode();
            java.lang.String str3 = this.copydefault;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RequestPnlDetailUseCaseParams(valuationUnit=" + this.EZpvd + ", costPriceType=" + this.KWHzl + ", type=" + this.AEQbTJ + ", hideLowValueCcy=" + this.OLrzqt + ", uid=" + this.copydefault + ")";
        }

        public Activity(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Boolean bool, java.lang.String str3) {
            this.EZpvd = str;
            this.KWHzl = str2;
            this.AEQbTJ = num;
            this.OLrzqt = bool;
            this.copydefault = str3;
        }
    }

    @yCM
    public jME(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C25959jMs c25959jMs, @NotNull C25963jMw c25963jMw, @NotNull C25962jMv c25962jMv, @NotNull jMB jmb, @NotNull C25965jMy c25965jMy, @NotNull InterfaceC8218ayb interfaceC8218ayb) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c25959jMs, "");
        Intrinsics.checkNotNullParameter(c25963jMw, "");
        Intrinsics.checkNotNullParameter(c25962jMv, "");
        Intrinsics.checkNotNullParameter(jmb, "");
        Intrinsics.checkNotNullParameter(c25965jMy, "");
        Intrinsics.checkNotNullParameter(interfaceC8218ayb, "");
        this.copydefault = coroutineDispatcher;
        this.djBIcL = c25959jMs;
        this.EZpvd = c25963jMw;
        this.OLrzqt = c25962jMv;
        this.KWHzl = jmb;
        this.AhwBna = c25965jMy;
        this.AEQbTJ = interfaceC8218ayb;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Activity activity, @NotNull Continuation<? super InterfaceC49371unL<PnlDetailVo>> continuation) throws java.lang.Throwable {
        RequestPnlDetailUseCase$onExecute$1 requestPnlDetailUseCase$onExecute$1;
        java.lang.Throwable th;
        jME jme;
        java.lang.Object objM7377constructorimpl;
        java.util.List list;
        java.util.List list2;
        PnlDetailPo pnlDetailPo;
        java.util.List<PnlDetailPo.PnlListItem> pnlList;
        java.util.List list3;
        if (continuation instanceof RequestPnlDetailUseCase$onExecute$1) {
            requestPnlDetailUseCase$onExecute$1 = (RequestPnlDetailUseCase$onExecute$1) continuation;
            int i = requestPnlDetailUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                requestPnlDetailUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                requestPnlDetailUseCase$onExecute$1 = new RequestPnlDetailUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = requestPnlDetailUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = requestPnlDetailUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            try {
                Result.Application application = Result.Companion;
                C25959jMs c25959jMs = this.djBIcL;
                java.lang.Integer numAEQbTJ = activity.AEQbTJ();
                java.lang.String strEZpvd = activity.EZpvd();
                java.lang.String strEZpvd2 = EZpvd(activity.OLrzqt());
                java.lang.Boolean boolKWHzl = activity.KWHzl();
                java.lang.String strCopydefault = activity.copydefault();
                requestPnlDetailUseCase$onExecute$1.L$0 = this;
                requestPnlDetailUseCase$onExecute$1.label = 1;
                objOLrzqt = c25959jMs.OLrzqt(numAEQbTJ, strEZpvd, strEZpvd2, boolKWHzl, strCopydefault, requestPnlDetailUseCase$onExecute$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                jme = this;
            } catch (java.lang.Throwable th2) {
                th = th2;
                jme = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
                return new InterfaceC49371unL.Activity(objOLrzqt);
            }
            jme = (jME) requestPnlDetailUseCase$onExecute$1.L$0;
            try {
                C56391yDq.AEQbTJ(objOLrzqt);
            } catch (java.lang.Throwable th3) {
                th = th3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((ResponseData) objOLrzqt);
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            ResponseData responseData = (ResponseData) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            if (responseData != null && responseData.getCode() == 0 && responseData.getData() != null) {
                ResponseData responseData2 = (ResponseData) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                if (responseData2 != null && (list = (java.util.List) responseData2.getData()) != null && (!list.isEmpty())) {
                    ResponseData responseData3 = (ResponseData) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                    if (responseData3 != null && (list2 = (java.util.List) responseData3.getData()) != null && (pnlDetailPo = (PnlDetailPo) CollectionsKt___CollectionsKt.AuCTelauCTel(list2)) != null && (pnlList = pnlDetailPo.getPnlList()) != null && (!pnlList.isEmpty())) {
                        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                            objM7377constructorimpl = null;
                        }
                        ResponseData responseData4 = (ResponseData) objM7377constructorimpl;
                        PnlDetailPo pnlDetailPo2 = (responseData4 == null || (list3 = (java.util.List) responseData4.getData()) == null) ? null : (PnlDetailPo) CollectionsKt___CollectionsKt.AuCTelauCTel(list3);
                        Intrinsics.copydefault(pnlDetailPo2);
                        requestPnlDetailUseCase$onExecute$1.L$0 = null;
                        requestPnlDetailUseCase$onExecute$1.label = 2;
                        objOLrzqt = jme.AEQbTJ(pnlDetailPo2, requestPnlDetailUseCase$onExecute$1);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        return new InterfaceC49371unL.Activity(objOLrzqt);
                    }
                }
            }
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            Intrinsics.copydefault(thM7380exceptionOrNullimpl);
            return new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
        }
        return new InterfaceC49371unL.TaskDescription(null, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [58=5] */
    /* JADX WARN: Path cross not found for [B:33:0x0210, B:28:0x0203], limit reached: 60 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0253 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x030a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x038e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x038f -> B:57:0x03ae). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(PnlDetailPo pnlDetailPo, Continuation<? super PnlDetailVo> continuation) throws java.lang.Throwable {
        RequestPnlDetailUseCase$poToVo$1 requestPnlDetailUseCase$poToVo$1;
        java.lang.String unit;
        java.lang.String symbol;
        java.lang.String holdingPnl;
        java.util.Collection arrayList;
        java.util.Iterator it;
        jME jme;
        java.lang.String str;
        java.util.Collection collection;
        java.lang.Object obj;
        java.lang.String str2;
        java.util.Collection collection2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        UpDownColor upDownColor;
        java.lang.String str8;
        UpDownColor upDownColorAEQbTJ;
        java.lang.String str9;
        PnlDetailPo.PnlListItem pnlListItem;
        java.lang.String str10;
        jME jme2;
        java.lang.Object objEZpvd;
        java.lang.Object obj2;
        java.lang.String str11;
        java.lang.String balance;
        PnlDetailPo.PnlListItem pnlListItem2;
        java.lang.String str12;
        java.lang.Object obj3;
        java.lang.String str13;
        UpDownColor upDownColor2;
        jME jme3;
        java.util.Iterator it2;
        java.lang.String str14;
        java.lang.Object obj4;
        java.lang.Object objEZpvd2;
        java.lang.String str15;
        java.util.Collection collection3;
        java.lang.Object objEZpvd3;
        java.lang.String strValueOf;
        java.lang.String name;
        java.lang.Object objEZpvd4;
        if (continuation instanceof RequestPnlDetailUseCase$poToVo$1) {
            requestPnlDetailUseCase$poToVo$1 = (RequestPnlDetailUseCase$poToVo$1) continuation;
            int i = requestPnlDetailUseCase$poToVo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                requestPnlDetailUseCase$poToVo$1.label = i - Integer.MIN_VALUE;
            } else {
                requestPnlDetailUseCase$poToVo$1 = new RequestPnlDetailUseCase$poToVo$1(this, continuation);
            }
        }
        java.lang.Object obj5 = requestPnlDetailUseCase$poToVo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = requestPnlDetailUseCase$poToVo$1.label;
        java.lang.String str16 = "";
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj5);
            unit = this.AEQbTJ.OLrzqt().getValue().getUnit();
            symbol = this.AEQbTJ.OLrzqt().getValue().getSymbol();
            holdingPnl = pnlDetailPo.getHoldingPnl();
            java.util.List<PnlDetailPo.PnlListItem> pnlList = pnlDetailPo.getPnlList();
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(pnlList, 10));
            it = pnlList.iterator();
            jme = this;
            if (!it.hasNext()) {
            }
        } else if (i2 == 1) {
            java.util.Collection collection4 = (java.util.Collection) requestPnlDetailUseCase$poToVo$1.L$9;
            holdingPnl = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$8;
            java.lang.String str17 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$7;
            java.lang.String str18 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$6;
            PnlDetailPo.PnlListItem pnlListItem3 = (PnlDetailPo.PnlListItem) requestPnlDetailUseCase$poToVo$1.L$5;
            java.util.Iterator it3 = (java.util.Iterator) requestPnlDetailUseCase$poToVo$1.L$4;
            java.util.Collection collection5 = (java.util.Collection) requestPnlDetailUseCase$poToVo$1.L$3;
            java.lang.String str19 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$2;
            str4 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$1;
            jME jme4 = (jME) requestPnlDetailUseCase$poToVo$1.L$0;
            C56391yDq.AEQbTJ(obj5);
            collection3 = collection5;
            str15 = str19;
            str12 = str18;
            pnlListItem2 = pnlListItem3;
            arrayList = collection4;
            jme3 = jme4;
            str7 = str17;
            it = it3;
            str13 = (java.lang.String) obj5;
            UpDownColor upDownColorAEQbTJ2 = UpDownColor.Companion.AEQbTJ(pnlListItem2.getBalance());
            balance = pnlListItem2.getBalance();
            str11 = str16;
            C25962jMv c25962jMv = jme3.OLrzqt;
            java.lang.Object obj6 = objCopydefault;
            C25962jMv.ActionBar actionBar = new C25962jMv.ActionBar(pnlListItem2.getPnl(), str4, str15);
            requestPnlDetailUseCase$poToVo$1.L$0 = jme3;
            requestPnlDetailUseCase$poToVo$1.L$1 = str4;
            requestPnlDetailUseCase$poToVo$1.L$2 = str15;
            requestPnlDetailUseCase$poToVo$1.L$3 = collection3;
            requestPnlDetailUseCase$poToVo$1.L$4 = it;
            requestPnlDetailUseCase$poToVo$1.L$5 = pnlListItem2;
            requestPnlDetailUseCase$poToVo$1.L$6 = str12;
            requestPnlDetailUseCase$poToVo$1.L$7 = str7;
            requestPnlDetailUseCase$poToVo$1.L$8 = str13;
            requestPnlDetailUseCase$poToVo$1.L$9 = balance;
            requestPnlDetailUseCase$poToVo$1.L$10 = upDownColorAEQbTJ2;
            requestPnlDetailUseCase$poToVo$1.L$11 = holdingPnl;
            requestPnlDetailUseCase$poToVo$1.L$12 = arrayList;
            requestPnlDetailUseCase$poToVo$1.label = 2;
            objEZpvd3 = c25962jMv.EZpvd(actionBar, requestPnlDetailUseCase$poToVo$1);
            obj3 = obj6;
            if (objEZpvd3 != obj3) {
            }
        } else if (i2 == 2) {
            java.util.Collection collection6 = (java.util.Collection) requestPnlDetailUseCase$poToVo$1.L$12;
            holdingPnl = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$11;
            upDownColor2 = (UpDownColor) requestPnlDetailUseCase$poToVo$1.L$10;
            java.lang.String str20 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$9;
            str13 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$8;
            str7 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$7;
            str12 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$6;
            pnlListItem2 = (PnlDetailPo.PnlListItem) requestPnlDetailUseCase$poToVo$1.L$5;
            java.util.Iterator it4 = (java.util.Iterator) requestPnlDetailUseCase$poToVo$1.L$4;
            java.util.Collection collection7 = (java.util.Collection) requestPnlDetailUseCase$poToVo$1.L$3;
            java.lang.String str21 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$2;
            java.lang.String str22 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$1;
            jme3 = (jME) requestPnlDetailUseCase$poToVo$1.L$0;
            C56391yDq.AEQbTJ(obj5);
            str14 = str21;
            collection2 = collection7;
            balance = str20;
            arrayList = collection6;
            str11 = "";
            obj3 = objCopydefault;
            it2 = it4;
            str4 = str22;
            java.lang.String str23 = (java.lang.String) obj5;
            obj4 = obj3;
            java.util.Collection collection8 = arrayList;
            upDownColorAEQbTJ = UpDownColor.Companion.AEQbTJ(pnlListItem2.getPnl());
            java.lang.String pnl = pnlListItem2.getPnl();
            java.lang.String str24 = holdingPnl;
            C25965jMy c25965jMy = jme3.AhwBna;
            java.lang.String pnlRate = pnlListItem2.getPnlRate();
            if (pnlRate != null) {
            }
            requestPnlDetailUseCase$poToVo$1.L$0 = jme3;
            requestPnlDetailUseCase$poToVo$1.L$1 = str4;
            requestPnlDetailUseCase$poToVo$1.L$2 = str14;
            requestPnlDetailUseCase$poToVo$1.L$3 = collection2;
            requestPnlDetailUseCase$poToVo$1.L$4 = it2;
            requestPnlDetailUseCase$poToVo$1.L$5 = pnlListItem2;
            requestPnlDetailUseCase$poToVo$1.L$6 = str12;
            requestPnlDetailUseCase$poToVo$1.L$7 = str7;
            requestPnlDetailUseCase$poToVo$1.L$8 = str13;
            requestPnlDetailUseCase$poToVo$1.L$9 = balance;
            requestPnlDetailUseCase$poToVo$1.L$10 = upDownColor2;
            requestPnlDetailUseCase$poToVo$1.L$11 = str23;
            requestPnlDetailUseCase$poToVo$1.L$12 = pnl;
            requestPnlDetailUseCase$poToVo$1.L$13 = upDownColorAEQbTJ;
            java.lang.String str25 = str14;
            requestPnlDetailUseCase$poToVo$1.L$14 = str24;
            requestPnlDetailUseCase$poToVo$1.L$15 = collection8;
            requestPnlDetailUseCase$poToVo$1.label = 3;
            objEZpvd2 = c25965jMy.EZpvd(str, requestPnlDetailUseCase$poToVo$1);
            if (objEZpvd2 != obj4) {
            }
        } else if (i2 == 3) {
            java.util.Collection collection9 = (java.util.Collection) requestPnlDetailUseCase$poToVo$1.L$15;
            java.lang.String str26 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$14;
            UpDownColor upDownColor3 = (UpDownColor) requestPnlDetailUseCase$poToVo$1.L$13;
            java.lang.String str27 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$12;
            str8 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$11;
            UpDownColor upDownColor4 = (UpDownColor) requestPnlDetailUseCase$poToVo$1.L$10;
            str6 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$9;
            str5 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$8;
            java.lang.String str28 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$7;
            str3 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$6;
            PnlDetailPo.PnlListItem pnlListItem4 = (PnlDetailPo.PnlListItem) requestPnlDetailUseCase$poToVo$1.L$5;
            java.util.Iterator it5 = (java.util.Iterator) requestPnlDetailUseCase$poToVo$1.L$4;
            java.util.Collection collection10 = (java.util.Collection) requestPnlDetailUseCase$poToVo$1.L$3;
            java.lang.String str29 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$2;
            java.lang.String str30 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$1;
            jME jme5 = (jME) requestPnlDetailUseCase$poToVo$1.L$0;
            C56391yDq.AEQbTJ(obj5);
            jme2 = jme5;
            pnlListItem = pnlListItem4;
            collection2 = collection10;
            obj = objCopydefault;
            str10 = str29;
            collection = collection9;
            str = str26;
            str9 = str27;
            upDownColorAEQbTJ = upDownColor3;
            it = it5;
            str2 = "";
            upDownColor = upDownColor4;
            str7 = str28;
            str4 = str30;
            java.lang.String str31 = (java.lang.String) obj5;
            UpDownColor upDownColor5 = upDownColorAEQbTJ;
            UpDownColor upDownColorAEQbTJ3 = UpDownColor.Companion.AEQbTJ(pnlListItem.getPnlRate());
            java.lang.String pnlRate2 = pnlListItem.getPnlRate();
            jMB jmb = jme2.KWHzl;
            jMB.Application application = new jMB.Application(pnlListItem.getPositionMarketValue(), str4, str10);
            requestPnlDetailUseCase$poToVo$1.L$0 = jme2;
            requestPnlDetailUseCase$poToVo$1.L$1 = str4;
            requestPnlDetailUseCase$poToVo$1.L$2 = str10;
            requestPnlDetailUseCase$poToVo$1.L$3 = collection2;
            requestPnlDetailUseCase$poToVo$1.L$4 = it;
            requestPnlDetailUseCase$poToVo$1.L$5 = pnlListItem;
            requestPnlDetailUseCase$poToVo$1.L$6 = str3;
            requestPnlDetailUseCase$poToVo$1.L$7 = str7;
            requestPnlDetailUseCase$poToVo$1.L$8 = str5;
            requestPnlDetailUseCase$poToVo$1.L$9 = str6;
            requestPnlDetailUseCase$poToVo$1.L$10 = upDownColor;
            requestPnlDetailUseCase$poToVo$1.L$11 = str8;
            requestPnlDetailUseCase$poToVo$1.L$12 = str9;
            requestPnlDetailUseCase$poToVo$1.L$13 = upDownColor5;
            jME jme6 = jme2;
            requestPnlDetailUseCase$poToVo$1.L$14 = str31;
            requestPnlDetailUseCase$poToVo$1.L$15 = pnlRate2;
            requestPnlDetailUseCase$poToVo$1.L$16 = upDownColorAEQbTJ3;
            requestPnlDetailUseCase$poToVo$1.L$17 = str;
            requestPnlDetailUseCase$poToVo$1.L$18 = collection;
            requestPnlDetailUseCase$poToVo$1.label = 4;
            objEZpvd = jmb.EZpvd(application, requestPnlDetailUseCase$poToVo$1);
            obj2 = obj;
            if (objEZpvd != obj2) {
            }
        } else {
            if (i2 != 4) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.util.Collection collection11 = (java.util.Collection) requestPnlDetailUseCase$poToVo$1.L$18;
            java.lang.String str32 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$17;
            UpDownColor upDownColor6 = (UpDownColor) requestPnlDetailUseCase$poToVo$1.L$16;
            java.lang.String str33 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$15;
            java.lang.String str34 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$14;
            UpDownColor upDownColor7 = (UpDownColor) requestPnlDetailUseCase$poToVo$1.L$13;
            java.lang.String str35 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$12;
            java.lang.String str36 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$11;
            UpDownColor upDownColor8 = (UpDownColor) requestPnlDetailUseCase$poToVo$1.L$10;
            java.lang.String str37 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$9;
            java.lang.String str38 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$8;
            java.lang.String str39 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$7;
            java.lang.String str40 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$6;
            PnlDetailPo.PnlListItem pnlListItem5 = (PnlDetailPo.PnlListItem) requestPnlDetailUseCase$poToVo$1.L$5;
            java.util.Iterator it6 = (java.util.Iterator) requestPnlDetailUseCase$poToVo$1.L$4;
            java.util.Collection collection12 = (java.util.Collection) requestPnlDetailUseCase$poToVo$1.L$3;
            java.lang.String str41 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$2;
            java.lang.String str42 = (java.lang.String) requestPnlDetailUseCase$poToVo$1.L$1;
            jME jme7 = (jME) requestPnlDetailUseCase$poToVo$1.L$0;
            C56391yDq.AEQbTJ(obj5);
            java.util.Collection collection13 = collection11;
            UpDownColor upDownColor9 = upDownColor6;
            java.lang.String str43 = str33;
            java.lang.String str44 = str34;
            UpDownColor upDownColor10 = upDownColor7;
            java.lang.String str45 = str35;
            collection2 = collection12;
            str4 = str42;
            java.lang.String str46 = str36;
            UpDownColor upDownColor11 = upDownColor8;
            holdingPnl = str32;
            it = it6;
            java.lang.String str47 = str38;
            jme = jme7;
            pnlListItem = pnlListItem5;
            java.lang.String str48 = str40;
            java.lang.String str49 = str39;
            obj2 = objCopydefault;
            str10 = str41;
            java.lang.String str50 = str37;
            collection13.add(new PnlDetailVo.PnlListItem(str49, str48, str47, upDownColor11, str50, str46, upDownColor10, str45, str44, upDownColor9, str43, (java.lang.String) obj5, UpDownColor.Companion.AEQbTJ(pnlListItem.getPositionMarketValue()), pnlListItem.getPositionMarketValue(), pnlListItem.getCostPrice()));
            symbol = str10;
            objCopydefault = obj2;
            unit = str4;
            arrayList = collection2;
            if (!it.hasNext()) {
                return new PnlDetailVo(holdingPnl, (java.util.List) arrayList);
            }
            PnlDetailPo.PnlListItem pnlListItem6 = (PnlDetailPo.PnlListItem) it.next();
            java.lang.String name2 = pnlListItem6.getName();
            if (name2 == null) {
                name2 = "--";
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                java.lang.String name3 = pnlListItem6.getName();
                if (name3 == null) {
                    name3 = str16;
                }
                strValueOf = interfaceC54581xNrOLrzqt.valueOf(name3);
                if (strValueOf == null) {
                }
                C25963jMw c25963jMw = jme.EZpvd;
                java.lang.String balance2 = pnlListItem6.getBalance();
                name = pnlListItem6.getName();
                if (name == null) {
                    name = str16;
                }
                C25963jMw.StateListAnimator stateListAnimator = new C25963jMw.StateListAnimator(balance2, name);
                requestPnlDetailUseCase$poToVo$1.L$0 = jme;
                requestPnlDetailUseCase$poToVo$1.L$1 = unit;
                requestPnlDetailUseCase$poToVo$1.L$2 = symbol;
                requestPnlDetailUseCase$poToVo$1.L$3 = arrayList;
                requestPnlDetailUseCase$poToVo$1.L$4 = it;
                requestPnlDetailUseCase$poToVo$1.L$5 = pnlListItem6;
                requestPnlDetailUseCase$poToVo$1.L$6 = strValueOf;
                requestPnlDetailUseCase$poToVo$1.L$7 = name2;
                requestPnlDetailUseCase$poToVo$1.L$8 = holdingPnl;
                requestPnlDetailUseCase$poToVo$1.L$9 = arrayList;
                requestPnlDetailUseCase$poToVo$1.L$10 = null;
                requestPnlDetailUseCase$poToVo$1.L$11 = null;
                requestPnlDetailUseCase$poToVo$1.L$12 = null;
                requestPnlDetailUseCase$poToVo$1.L$13 = null;
                requestPnlDetailUseCase$poToVo$1.L$14 = null;
                requestPnlDetailUseCase$poToVo$1.L$15 = null;
                requestPnlDetailUseCase$poToVo$1.L$16 = null;
                requestPnlDetailUseCase$poToVo$1.L$17 = null;
                requestPnlDetailUseCase$poToVo$1.L$18 = null;
                requestPnlDetailUseCase$poToVo$1.label = 1;
                objEZpvd4 = c25963jMw.EZpvd(stateListAnimator, requestPnlDetailUseCase$poToVo$1);
                if (objEZpvd4 != objCopydefault) {
                    return objCopydefault;
                }
                str4 = unit;
                str15 = symbol;
                jme3 = jme;
                obj5 = objEZpvd4;
                collection3 = arrayList;
                java.lang.String str51 = strValueOf;
                pnlListItem2 = pnlListItem6;
                str7 = name2;
                str12 = str51;
                str13 = (java.lang.String) obj5;
                UpDownColor upDownColorAEQbTJ22 = UpDownColor.Companion.AEQbTJ(pnlListItem2.getBalance());
                balance = pnlListItem2.getBalance();
                str11 = str16;
                C25962jMv c25962jMv2 = jme3.OLrzqt;
                java.lang.Object obj62 = objCopydefault;
                C25962jMv.ActionBar actionBar2 = new C25962jMv.ActionBar(pnlListItem2.getPnl(), str4, str15);
                requestPnlDetailUseCase$poToVo$1.L$0 = jme3;
                requestPnlDetailUseCase$poToVo$1.L$1 = str4;
                requestPnlDetailUseCase$poToVo$1.L$2 = str15;
                requestPnlDetailUseCase$poToVo$1.L$3 = collection3;
                requestPnlDetailUseCase$poToVo$1.L$4 = it;
                requestPnlDetailUseCase$poToVo$1.L$5 = pnlListItem2;
                requestPnlDetailUseCase$poToVo$1.L$6 = str12;
                requestPnlDetailUseCase$poToVo$1.L$7 = str7;
                requestPnlDetailUseCase$poToVo$1.L$8 = str13;
                requestPnlDetailUseCase$poToVo$1.L$9 = balance;
                requestPnlDetailUseCase$poToVo$1.L$10 = upDownColorAEQbTJ22;
                requestPnlDetailUseCase$poToVo$1.L$11 = holdingPnl;
                requestPnlDetailUseCase$poToVo$1.L$12 = arrayList;
                requestPnlDetailUseCase$poToVo$1.label = 2;
                objEZpvd3 = c25962jMv2.EZpvd(actionBar2, requestPnlDetailUseCase$poToVo$1);
                obj3 = obj62;
                if (objEZpvd3 != obj3) {
                    return obj3;
                }
                java.lang.String str52 = str15;
                collection2 = collection3;
                str14 = str52;
                java.util.Iterator it7 = it;
                upDownColor2 = upDownColorAEQbTJ22;
                obj5 = objEZpvd3;
                it2 = it7;
                java.lang.String str232 = (java.lang.String) obj5;
                obj4 = obj3;
                java.util.Collection collection82 = arrayList;
                upDownColorAEQbTJ = UpDownColor.Companion.AEQbTJ(pnlListItem2.getPnl());
                java.lang.String pnl2 = pnlListItem2.getPnl();
                java.lang.String str242 = holdingPnl;
                C25965jMy c25965jMy2 = jme3.AhwBna;
                java.lang.String pnlRate3 = pnlListItem2.getPnlRate();
                java.lang.String str53 = pnlRate3 != null ? str11 : pnlRate3;
                requestPnlDetailUseCase$poToVo$1.L$0 = jme3;
                requestPnlDetailUseCase$poToVo$1.L$1 = str4;
                requestPnlDetailUseCase$poToVo$1.L$2 = str14;
                requestPnlDetailUseCase$poToVo$1.L$3 = collection2;
                requestPnlDetailUseCase$poToVo$1.L$4 = it2;
                requestPnlDetailUseCase$poToVo$1.L$5 = pnlListItem2;
                requestPnlDetailUseCase$poToVo$1.L$6 = str12;
                requestPnlDetailUseCase$poToVo$1.L$7 = str7;
                requestPnlDetailUseCase$poToVo$1.L$8 = str13;
                requestPnlDetailUseCase$poToVo$1.L$9 = balance;
                requestPnlDetailUseCase$poToVo$1.L$10 = upDownColor2;
                requestPnlDetailUseCase$poToVo$1.L$11 = str232;
                requestPnlDetailUseCase$poToVo$1.L$12 = pnl2;
                requestPnlDetailUseCase$poToVo$1.L$13 = upDownColorAEQbTJ;
                java.lang.String str252 = str14;
                requestPnlDetailUseCase$poToVo$1.L$14 = str242;
                requestPnlDetailUseCase$poToVo$1.L$15 = collection82;
                requestPnlDetailUseCase$poToVo$1.label = 3;
                objEZpvd2 = c25965jMy2.EZpvd(str53, requestPnlDetailUseCase$poToVo$1);
                if (objEZpvd2 != obj4) {
                    return obj4;
                }
                str2 = str11;
                obj5 = objEZpvd2;
                jme2 = jme3;
                pnlListItem = pnlListItem2;
                str5 = str13;
                str8 = str232;
                UpDownColor upDownColor12 = upDownColor2;
                it = it2;
                str10 = str252;
                str = str242;
                collection = collection82;
                obj = obj4;
                str9 = pnl2;
                upDownColor = upDownColor12;
                java.lang.String str54 = balance;
                str3 = str12;
                str6 = str54;
                java.lang.String str312 = (java.lang.String) obj5;
                UpDownColor upDownColor52 = upDownColorAEQbTJ;
                UpDownColor upDownColorAEQbTJ32 = UpDownColor.Companion.AEQbTJ(pnlListItem.getPnlRate());
                java.lang.String pnlRate22 = pnlListItem.getPnlRate();
                jMB jmb2 = jme2.KWHzl;
                jMB.Application application2 = new jMB.Application(pnlListItem.getPositionMarketValue(), str4, str10);
                requestPnlDetailUseCase$poToVo$1.L$0 = jme2;
                requestPnlDetailUseCase$poToVo$1.L$1 = str4;
                requestPnlDetailUseCase$poToVo$1.L$2 = str10;
                requestPnlDetailUseCase$poToVo$1.L$3 = collection2;
                requestPnlDetailUseCase$poToVo$1.L$4 = it;
                requestPnlDetailUseCase$poToVo$1.L$5 = pnlListItem;
                requestPnlDetailUseCase$poToVo$1.L$6 = str3;
                requestPnlDetailUseCase$poToVo$1.L$7 = str7;
                requestPnlDetailUseCase$poToVo$1.L$8 = str5;
                requestPnlDetailUseCase$poToVo$1.L$9 = str6;
                requestPnlDetailUseCase$poToVo$1.L$10 = upDownColor;
                requestPnlDetailUseCase$poToVo$1.L$11 = str8;
                requestPnlDetailUseCase$poToVo$1.L$12 = str9;
                requestPnlDetailUseCase$poToVo$1.L$13 = upDownColor52;
                jME jme62 = jme2;
                requestPnlDetailUseCase$poToVo$1.L$14 = str312;
                requestPnlDetailUseCase$poToVo$1.L$15 = pnlRate22;
                requestPnlDetailUseCase$poToVo$1.L$16 = upDownColorAEQbTJ32;
                requestPnlDetailUseCase$poToVo$1.L$17 = str;
                requestPnlDetailUseCase$poToVo$1.L$18 = collection;
                requestPnlDetailUseCase$poToVo$1.label = 4;
                objEZpvd = jmb2.EZpvd(application2, requestPnlDetailUseCase$poToVo$1);
                obj2 = obj;
                if (objEZpvd != obj2) {
                    return obj2;
                }
                str44 = str312;
                str45 = str9;
                str46 = str8;
                str49 = str7;
                holdingPnl = str;
                jme = jme62;
                upDownColor9 = upDownColorAEQbTJ32;
                str43 = pnlRate22;
                upDownColor10 = upDownColor52;
                upDownColor11 = upDownColor;
                str50 = str6;
                str47 = str5;
                str16 = str2;
                obj5 = objEZpvd;
                collection13 = collection;
                str48 = str3;
                collection13.add(new PnlDetailVo.PnlListItem(str49, str48, str47, upDownColor11, str50, str46, upDownColor10, str45, str44, upDownColor9, str43, (java.lang.String) obj5, UpDownColor.Companion.AEQbTJ(pnlListItem.getPositionMarketValue()), pnlListItem.getPositionMarketValue(), pnlListItem.getCostPrice()));
                symbol = str10;
                objCopydefault = obj2;
                unit = str4;
                arrayList = collection2;
                if (!it.hasNext()) {
                }
            }
            strValueOf = str16;
            C25963jMw c25963jMw2 = jme.EZpvd;
            java.lang.String balance22 = pnlListItem6.getBalance();
            name = pnlListItem6.getName();
            if (name == null) {
            }
            C25963jMw.StateListAnimator stateListAnimator2 = new C25963jMw.StateListAnimator(balance22, name);
            requestPnlDetailUseCase$poToVo$1.L$0 = jme;
            requestPnlDetailUseCase$poToVo$1.L$1 = unit;
            requestPnlDetailUseCase$poToVo$1.L$2 = symbol;
            requestPnlDetailUseCase$poToVo$1.L$3 = arrayList;
            requestPnlDetailUseCase$poToVo$1.L$4 = it;
            requestPnlDetailUseCase$poToVo$1.L$5 = pnlListItem6;
            requestPnlDetailUseCase$poToVo$1.L$6 = strValueOf;
            requestPnlDetailUseCase$poToVo$1.L$7 = name2;
            requestPnlDetailUseCase$poToVo$1.L$8 = holdingPnl;
            requestPnlDetailUseCase$poToVo$1.L$9 = arrayList;
            requestPnlDetailUseCase$poToVo$1.L$10 = null;
            requestPnlDetailUseCase$poToVo$1.L$11 = null;
            requestPnlDetailUseCase$poToVo$1.L$12 = null;
            requestPnlDetailUseCase$poToVo$1.L$13 = null;
            requestPnlDetailUseCase$poToVo$1.L$14 = null;
            requestPnlDetailUseCase$poToVo$1.L$15 = null;
            requestPnlDetailUseCase$poToVo$1.L$16 = null;
            requestPnlDetailUseCase$poToVo$1.L$17 = null;
            requestPnlDetailUseCase$poToVo$1.L$18 = null;
            requestPnlDetailUseCase$poToVo$1.label = 1;
            objEZpvd4 = c25963jMw2.EZpvd(stateListAnimator2, requestPnlDetailUseCase$poToVo$1);
            if (objEZpvd4 != objCopydefault) {
            }
        }
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        BigDecimal bigDecimalAdd;
        if (str == null || (bigDecimalAdd = new BigDecimal(str).add(new BigDecimal(1))) == null) {
            return null;
        }
        return bigDecimalAdd.toPlainString();
    }
}
