package o;

import androidx.lifecycle.MutableLiveData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.localization.util.currency.Notation;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.traderadar.data.po.TradeRadarPo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.traderadar.domain.usecase.RequestTradeRadarDateUseCase$onExecute$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.traderadar.ui.model.TradeRadarType;
import com.okinc.market.ext.UpDownColor;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C40901qgg;
import o.C52761wXj;
import o.InterfaceC49371unL;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qgi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40903qgi extends AbstractC49400uno<Activity, InterfaceC49371unL<? extends java.util.List<? extends C40871qgC>>> {
    public final C40898qgd AEQbTJ;
    public final InterfaceC54577xNn EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final C40901qgg copydefault;

    /* JADX INFO: renamed from: o.qgi$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradeRadarType.values().length];
            try {
                iArr[TradeRadarType.WHALE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TradeRadarType.PRICE_SURGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TradeRadarType.TRADERS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[TradeRadarType.UNLOCKS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((Activity) obj, (Continuation<? super InterfaceC49371unL<? extends java.util.List<C40871qgC>>>) continuation);
    }

    /* JADX INFO: renamed from: o.qgi$Activity */
    public static final class Activity {
        public final int AEQbTJ;
        public final int EZpvd;
        public final TradeRadarType KWHzl;
        public final InterfaceC49371unL<java.util.List<C40871qgC>> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qgi$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, TradeRadarType tradeRadarType, int i, int i2, InterfaceC49371unL interfaceC49371unL, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                tradeRadarType = activity.KWHzl;
            }
            if ((i3 & 2) != 0) {
                i = activity.EZpvd;
            }
            if ((i3 & 4) != 0) {
                i2 = activity.AEQbTJ;
            }
            if ((i3 & 8) != 0) {
                interfaceC49371unL = activity.copydefault;
            }
            return activity.KWHzl(tradeRadarType, i, i2, interfaceC49371unL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC49371unL<java.util.List<C40871qgC>> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TradeRadarType KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull TradeRadarType tradeRadarType, int i, int i2, @NotNull InterfaceC49371unL<? extends java.util.List<C40871qgC>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(tradeRadarType, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            return new Activity(tradeRadarType, i, i2, interfaceC49371unL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.AEQbTJ;
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
            return this.KWHzl == activity.KWHzl && this.EZpvd == activity.EZpvd && this.AEQbTJ == activity.AEQbTJ && Intrinsics.EZpvd(this.copydefault, activity.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.KWHzl.hashCode() * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Params(type=" + this.KWHzl + ", pageSize=" + this.EZpvd + ", pageNum=" + this.AEQbTJ + ", originDataList=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.unL<? extends java.util.List<o.qgC>> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(@NotNull TradeRadarType tradeRadarType, int i, int i2, @NotNull InterfaceC49371unL<? extends java.util.List<C40871qgC>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(tradeRadarType, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.KWHzl = tradeRadarType;
            this.EZpvd = i;
            this.AEQbTJ = i2;
            this.copydefault = interfaceC49371unL;
        }
    }

    @yCM
    public C40903qgi(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn, @NotNull C40898qgd c40898qgd, @NotNull C40901qgg c40901qgg) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40898qgd, "");
        Intrinsics.checkNotNullParameter(c40901qgg, "");
        this.KWHzl = coroutineDispatcher;
        this.EZpvd = interfaceC54577xNn;
        this.AEQbTJ = c40898qgd;
        this.copydefault = c40901qgg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0111, code lost:
    
        if (r7.isEmpty() == true) goto L56;
     */
    /* JADX WARN: Path cross not found for [B:95:0x0216, B:101:0x0226], limit reached: 126 */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x01f9 -> B:93:0x020c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Activity activity, @NotNull Continuation<? super InterfaceC49371unL<? extends java.util.List<C40871qgC>>> continuation) throws java.lang.Throwable {
        RequestTradeRadarDateUseCase$onExecute$1 requestTradeRadarDateUseCase$onExecute$1;
        Activity activity2;
        C40903qgi c40903qgi;
        Activity activity3;
        C40898qgd c40898qgd;
        java.lang.String requestValue;
        int iOLrzqt;
        int iCopydefault;
        java.lang.Object objM7377constructorimpl;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        int i;
        java.util.ArrayList arrayList2;
        int i2;
        java.util.List listAhwBna;
        java.lang.String str;
        java.lang.Integer numAEQbTJ;
        java.lang.Object obj;
        java.lang.Long l;
        C40901qgg c40901qgg;
        int i3;
        java.lang.Long l2;
        TradeRadarType tradeRadarTypeCopydefault;
        TradeRadarType tradeRadarTypeCopydefault2;
        java.lang.String trackName;
        if (continuation instanceof RequestTradeRadarDateUseCase$onExecute$1) {
            requestTradeRadarDateUseCase$onExecute$1 = (RequestTradeRadarDateUseCase$onExecute$1) continuation;
            int i4 = requestTradeRadarDateUseCase$onExecute$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                requestTradeRadarDateUseCase$onExecute$1.label = i4 - Integer.MIN_VALUE;
            } else {
                requestTradeRadarDateUseCase$onExecute$1 = new RequestTradeRadarDateUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = requestTradeRadarDateUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = requestTradeRadarDateUseCase$onExecute$1.label;
        java.lang.String str2 = "";
        if (i5 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            try {
                Result.Application application = Result.Companion;
                c40898qgd = this.AEQbTJ;
                requestValue = activity.KWHzl().getRequestValue();
                iOLrzqt = activity.OLrzqt();
                iCopydefault = activity.copydefault();
                requestTradeRadarDateUseCase$onExecute$1.L$0 = this;
                activity2 = activity;
            } catch (java.lang.Throwable th) {
                th = th;
                activity2 = activity;
            }
            try {
                requestTradeRadarDateUseCase$onExecute$1.L$1 = activity2;
                requestTradeRadarDateUseCase$onExecute$1.label = 1;
                objAEQbTJ = c40898qgd.AEQbTJ(requestValue, iOLrzqt, iCopydefault, requestTradeRadarDateUseCase$onExecute$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                c40903qgi = this;
                activity3 = activity2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                c40903qgi = this;
                activity3 = activity2;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else if (i5 == 1) {
            activity3 = (Activity) requestTradeRadarDateUseCase$onExecute$1.L$1;
            c40903qgi = (C40903qgi) requestTradeRadarDateUseCase$onExecute$1.L$0;
            try {
                C56391yDq.AEQbTJ(objAEQbTJ);
            } catch (java.lang.Throwable th3) {
                th = th3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i5 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = requestTradeRadarDateUseCase$onExecute$1.I$1;
            int i7 = requestTradeRadarDateUseCase$onExecute$1.I$0;
            java.util.ArrayList arrayList3 = (java.util.ArrayList) requestTradeRadarDateUseCase$onExecute$1.L$11;
            java.lang.CharSequence charSequence = (java.lang.CharSequence) requestTradeRadarDateUseCase$onExecute$1.L$10;
            java.lang.String str3 = (java.lang.String) requestTradeRadarDateUseCase$onExecute$1.L$9;
            java.lang.String str4 = (java.lang.String) requestTradeRadarDateUseCase$onExecute$1.L$8;
            UpDownColor upDownColor = (UpDownColor) requestTradeRadarDateUseCase$onExecute$1.L$7;
            java.lang.String str5 = (java.lang.String) requestTradeRadarDateUseCase$onExecute$1.L$6;
            java.lang.Integer num = (java.lang.Integer) requestTradeRadarDateUseCase$onExecute$1.L$5;
            TradeRadarPo tradeRadarPo = (TradeRadarPo) requestTradeRadarDateUseCase$onExecute$1.L$4;
            java.util.Iterator it2 = (java.util.Iterator) requestTradeRadarDateUseCase$onExecute$1.L$3;
            java.util.ArrayList arrayList4 = (java.util.ArrayList) requestTradeRadarDateUseCase$onExecute$1.L$2;
            Activity activity4 = (Activity) requestTradeRadarDateUseCase$onExecute$1.L$1;
            C40903qgi c40903qgi2 = (C40903qgi) requestTradeRadarDateUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
            java.lang.Integer num2 = num;
            java.util.ArrayList arrayList5 = arrayList3;
            java.lang.CharSequence charSequence2 = charSequence;
            java.lang.String str6 = str3;
            java.lang.String str7 = str4;
            UpDownColor upDownColor2 = upDownColor;
            java.lang.String str8 = str5;
            arrayList2 = arrayList4;
            c40903qgi = c40903qgi2;
            int i8 = i7;
            activity3 = activity4;
            int i9 = i6;
            java.lang.Object obj2 = objCopydefault;
            java.lang.String str9 = (java.lang.String) objAEQbTJ;
            java.lang.String type = tradeRadarPo.getType();
            java.lang.String str10 = (type != null || (tradeRadarTypeCopydefault2 = C40875qgG.copydefault(type)) == null || (trackName = tradeRadarTypeCopydefault2.getTrackName()) == null) ? str2 : trackName;
            java.lang.String instId = tradeRadarPo.getInstId();
            java.lang.String str11 = instId != null ? str2 : instId;
            java.lang.String instType = tradeRadarPo.getInstType();
            arrayList5.add(new C40871qgC(i9, charSequence2, str6, str7, upDownColor2, str8, num2, str9, str10, str11, instType != null ? str2 : instType));
            it = it2;
            objCopydefault = obj2;
            i = i8;
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                i8 = i + 1;
                if (i < 0) {
                    yDY.AYXKKw();
                }
                tradeRadarPo = (TradeRadarPo) next;
                java.lang.String instId2 = tradeRadarPo.getInstId();
                if (instId2 == null) {
                    instId2 = str2;
                }
                java.lang.CharSequence charSequenceCopydefault = c40903qgi.copydefault(instId2);
                java.lang.String icon = tradeRadarPo.getIcon();
                java.lang.String strEZpvd = c40903qgi.EZpvd(tradeRadarPo.getChangPercent());
                UpDownColor upDownColorAEQbTJ = UpDownColor.Companion.AEQbTJ(tradeRadarPo.getChangPercent());
                java.lang.String strAEQbTJ = c40903qgi.AEQbTJ(tradeRadarPo);
                java.lang.String type2 = tradeRadarPo.getType();
                if (type2 == null || (tradeRadarTypeCopydefault = C40875qgG.copydefault(type2)) == null) {
                    str = str2;
                    numAEQbTJ = null;
                } else {
                    str = str2;
                    numAEQbTJ = C56443yFo.AEQbTJ(tradeRadarTypeCopydefault.getTagNameResId());
                }
                C40901qgg c40901qgg2 = c40903qgi.copydefault;
                java.lang.String timeStamp = tradeRadarPo.getTimeStamp();
                if (timeStamp != null) {
                    java.lang.Long lKWHzl = C56443yFo.KWHzl(java.lang.Long.parseLong(timeStamp));
                    obj = objCopydefault;
                    l = lKWHzl;
                } else {
                    obj = objCopydefault;
                    l = null;
                }
                java.lang.String currentTimeStamp = tradeRadarPo.getCurrentTimeStamp();
                if (currentTimeStamp != null) {
                    java.lang.Long lKWHzl2 = C56443yFo.KWHzl(java.lang.Long.parseLong(currentTimeStamp));
                    i3 = i;
                    c40901qgg = c40901qgg2;
                    l2 = lKWHzl2;
                } else {
                    c40901qgg = c40901qgg2;
                    i3 = i;
                    l2 = null;
                }
                C40901qgg.Application application3 = new C40901qgg.Application(l, l2);
                requestTradeRadarDateUseCase$onExecute$1.L$0 = c40903qgi;
                requestTradeRadarDateUseCase$onExecute$1.L$1 = activity3;
                requestTradeRadarDateUseCase$onExecute$1.L$2 = arrayList2;
                requestTradeRadarDateUseCase$onExecute$1.L$3 = it;
                requestTradeRadarDateUseCase$onExecute$1.L$4 = tradeRadarPo;
                requestTradeRadarDateUseCase$onExecute$1.L$5 = numAEQbTJ;
                requestTradeRadarDateUseCase$onExecute$1.L$6 = strAEQbTJ;
                requestTradeRadarDateUseCase$onExecute$1.L$7 = upDownColorAEQbTJ;
                requestTradeRadarDateUseCase$onExecute$1.L$8 = strEZpvd;
                requestTradeRadarDateUseCase$onExecute$1.L$9 = icon;
                requestTradeRadarDateUseCase$onExecute$1.L$10 = charSequenceCopydefault;
                requestTradeRadarDateUseCase$onExecute$1.L$11 = arrayList2;
                requestTradeRadarDateUseCase$onExecute$1.I$0 = i8;
                int i10 = i3;
                requestTradeRadarDateUseCase$onExecute$1.I$1 = i10;
                requestTradeRadarDateUseCase$onExecute$1.label = 2;
                java.lang.Object objEZpvd = c40901qgg.EZpvd(application3, requestTradeRadarDateUseCase$onExecute$1);
                obj2 = obj;
                if (objEZpvd == obj2) {
                    return obj2;
                }
                num2 = numAEQbTJ;
                i9 = i10;
                upDownColor2 = upDownColorAEQbTJ;
                arrayList5 = arrayList2;
                charSequence2 = charSequenceCopydefault;
                str6 = icon;
                str7 = strEZpvd;
                str8 = strAEQbTJ;
                it2 = it;
                objAEQbTJ = objEZpvd;
                str2 = str;
                java.lang.String str92 = (java.lang.String) objAEQbTJ;
                java.lang.String type3 = tradeRadarPo.getType();
                if (type3 != null) {
                }
                java.lang.String instId3 = tradeRadarPo.getInstId();
                if (instId3 != null) {
                }
                java.lang.String instType2 = tradeRadarPo.getInstType();
                arrayList5.add(new C40871qgC(i9, charSequence2, str6, str7, upDownColor2, str8, num2, str92, str10, str11, instType2 != null ? str2 : instType2));
                it = it2;
                objCopydefault = obj2;
                i = i8;
                if (it.hasNext()) {
                    arrayList = arrayList2;
                    if (activity3.copydefault() != 1) {
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        InterfaceC49371unL<java.util.List<C40871qgC>> interfaceC49371unLAEQbTJ = activity3.AEQbTJ();
                        InterfaceC49371unL.Activity activity5 = interfaceC49371unLAEQbTJ instanceof InterfaceC49371unL.Activity ? (InterfaceC49371unL.Activity) interfaceC49371unLAEQbTJ : null;
                        if (activity5 == null || (listAhwBna = (java.util.List) activity5.copydefault()) == null) {
                            listAhwBna = yDY.AhwBna();
                        }
                        arrayList6.addAll(listAhwBna);
                        arrayList6.addAll(arrayList);
                        arrayList = arrayList6;
                    }
                    return new InterfaceC49371unL.Activity(arrayList);
                }
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objAEQbTJ);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            Intrinsics.copydefault(thM7380exceptionOrNullimpl);
            return new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null);
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            if ((Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl) != null) {
                java.util.List list = (java.util.List) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                i2 = list != null ? 1 : 1;
            }
            if (activity3.copydefault() == i2) {
                return new InterfaceC49371unL.TaskDescription(null, i2, null);
            }
            return activity3.AEQbTJ();
        }
        arrayList = new java.util.ArrayList();
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        java.util.List list2 = (java.util.List) objM7377constructorimpl;
        if (list2 != null) {
            it = list2.iterator();
            i = 0;
            arrayList2 = arrayList;
            if (it.hasNext()) {
            }
        }
        if (activity3.copydefault() != 1) {
        }
        return new InterfaceC49371unL.Activity(arrayList);
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        return (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? "--" : pTB.formatICUCompact$default(C33129mqd.EZpvd(str), RoundingMode.UP, C38307pTy.Companion.KWHzl(0, 2), null, null, 12, null);
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        return (str == null || str.length() == 0) ? "--" : pTB.formatICUNumber$default(C33129mqd.EZpvd(str), null, C38307pTy.Companion.KWHzl(0, C54573xNj.copydefault.AEQbTJ(java.lang.Math.abs(C33129mqd.AEQbTJ(str)))), null, null, 13, null);
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        java.lang.String safeString$default;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        ValuationCurrencyData value;
        java.lang.String isoCode;
        C54536xML c54536xMLIsConnected;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        if (str == null || str.length() == 0) {
            return "--";
        }
        InterfaceC54577xNn interfaceC54577xNn = this.EZpvd;
        xMW xmwKWHzl = (interfaceC54577xNn == null || (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn.OLrzqt()) == null) ? null : interfaceC54581xNrOLrzqt2.KWHzl();
        C54536xML c54536xMLAYXKKw = xmwKWHzl != null ? xmwKWHzl.AYXKKw(str) : null;
        if (c54536xMLAYXKKw == null || (c54536xMLIsConnected = c54536xMLAYXKKw.isConnected()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLIsConnected, false, 1, null)) == null) {
            safeString$default = "";
        }
        try {
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(safeString$default);
            InterfaceC54577xNn interfaceC54577xNn2 = this.EZpvd;
            return C38305pTw.formatFiatSymbol$default(bigDecimalEZpvd, (interfaceC54577xNn2 == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn2.OLrzqt()) == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (mutableLiveDataBG_ = newProxyInstance.bG_()) == null || (value = mutableLiveDataBG_.getValue()) == null || (isoCode = value.getIsoCode()) == null) ? "" : isoCode, RoundingMode.HALF_DOWN, C38307pTy.Companion.KWHzl(0, 2), DisplaySign.AUTO, Notation.COMPACT_SHORT, null, 32, null);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return "--";
        }
    }

    public final java.lang.String AEQbTJ(TradeRadarPo tradeRadarPo) {
        java.lang.String ptc;
        java.lang.String type = tradeRadarPo.getType();
        TradeRadarType tradeRadarTypeCopydefault = type != null ? C40875qgG.copydefault(type) : null;
        int i = tradeRadarTypeCopydefault == null ? -1 : StateListAnimator.copydefault[tradeRadarTypeCopydefault.ordinal()];
        if (i != 1) {
            if (i == 2) {
                java.lang.String ptc2 = tradeRadarPo.getPtc();
                if (ptc2 == null || ptc2.length() == 0) {
                    return "--";
                }
                if (C33129mqd.gEmmrt(tradeRadarPo.getPtc(), BigDecimal.ZERO)) {
                    return C33069mpW.copydefault(qZH.PendingIntent.invokespecialdPnHjp, C56423yEv.EZpvd(C56390yDp.OLrzqt("pct", EZpvd(tradeRadarPo.getPtc()))));
                }
                return C33069mpW.copydefault(qZH.PendingIntent.invokespecialhlXVux, C56423yEv.EZpvd(C56390yDp.OLrzqt("pct", EZpvd(tradeRadarPo.getPtc()))));
            }
            if (i == 3) {
                java.lang.String ccy = tradeRadarPo.getCcy();
                return (ccy == null || ccy.length() == 0) ? "--" : C33069mpW.copydefault(qZH.PendingIntent.invokespecialhOMIpD, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", tradeRadarPo.getCcy())));
            }
            if (i != 4 || (ptc = tradeRadarPo.getPtc()) == null || ptc.length() == 0) {
                return "--";
            }
            if (C33129mqd.gEmmrt(tradeRadarPo.getPtc(), BigDecimal.ZERO)) {
                return C33069mpW.copydefault(qZH.PendingIntent.ROgMPW, C56423yEv.EZpvd(C56390yDp.OLrzqt("pct", EZpvd(tradeRadarPo.getPtc()))));
            }
            return C33069mpW.copydefault(qZH.PendingIntent.DaTmkG, C56423yEv.EZpvd(C56390yDp.OLrzqt("pct", EZpvd(tradeRadarPo.getPtc()))));
        }
        if (Intrinsics.EZpvd((java.lang.Object) tradeRadarPo.getBuySell(), (java.lang.Object) "bought")) {
            int i2 = qZH.PendingIntent.DPHOMC;
            kotlin.Pair[] pairArr = new kotlin.Pair[4];
            pairArr[0] = C56390yDp.OLrzqt("vol", copydefault(tradeRadarPo.getVol(), tradeRadarPo.getCcy()));
            java.lang.String ccy2 = tradeRadarPo.getCcy();
            pairArr[1] = C56390yDp.OLrzqt("ccy", ccy2 != null ? ccy2 : "");
            pairArr[2] = C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, KWHzl(tradeRadarPo.getPrice()));
            pairArr[3] = C56390yDp.OLrzqt("turnover", AEQbTJ(tradeRadarPo.getTurnover()));
            return C33069mpW.copydefault(i2, C56424yEw.gEmmrt(pairArr));
        }
        if (!Intrinsics.EZpvd((java.lang.Object) tradeRadarPo.getBuySell(), (java.lang.Object) "sold")) {
            return "--";
        }
        int i3 = qZH.PendingIntent.ODCBUN;
        kotlin.Pair[] pairArr2 = new kotlin.Pair[4];
        pairArr2[0] = C56390yDp.OLrzqt("vol", copydefault(tradeRadarPo.getVol(), tradeRadarPo.getCcy()));
        java.lang.String ccy3 = tradeRadarPo.getCcy();
        pairArr2[1] = C56390yDp.OLrzqt("ccy", ccy3 != null ? ccy3 : "");
        pairArr2[2] = C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, KWHzl(tradeRadarPo.getPrice()));
        pairArr2[3] = C56390yDp.OLrzqt("turnover", AEQbTJ(tradeRadarPo.getTurnover()));
        return C33069mpW.copydefault(i3, C56424yEw.gEmmrt(pairArr2));
    }

    private final java.lang.String EZpvd(java.lang.String str) {
        return (str == null || str.length() == 0) ? "--" : xMR.formatICUPercent$default(xMR.copydefault, C33129mqd.EZpvd(str), null, null, DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 38, null);
    }

    public final java.lang.CharSequence copydefault(java.lang.String str) {
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() < 2) {
            return str;
        }
        java.lang.String str2 = (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(listSplit$default);
        java.lang.String str3 = (java.lang.String) listSplit$default.get(1);
        final android.app.Application applicationValueOf = C43246rlf.OLrzqt.valueOf();
        return C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(str2, new java.lang.String[]{str2}, 0, null, false, new Function1() { // from class: o.qgl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40903qgi.KWHzl(applicationValueOf, (java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{str3}, 0, null, false, new Function1() { // from class: o.qgh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40903qgi.AEQbTJ(applicationValueOf, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit KWHzl(android.app.Application application, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(application, C52761wXj.LoaderManager.AwvSrB));
        list.add(new android.text.style.AbsoluteSizeSpan(C55298xhM.dp2px$default(16.0f, null, 1, null)));
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(android.app.Application application, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(application, C52761wXj.LoaderManager.QOLQEE));
        list.add(new android.text.style.AbsoluteSizeSpan(C55298xhM.dp2px$default(12.0f, null, 1, null)));
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)));
        return Unit.INSTANCE;
    }
}
