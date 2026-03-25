package com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.assets.api.model.ValuationCurrency;
import com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod;
import com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.data.model.CumulativePnlPo;
import com.okinc.market.common.bean.PayloadPeriod;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.AbstractC49411unz;
import o.C25950jMj;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.InterfaceC8218ayb;
import o.jLQ;
import o.jLS;
import o.jLT;
import o.jLU;
import o.jMF;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SpotAnalysisCumulativePnlViewModel extends AbstractC49411unz<C25950jMj> {
    public Job AEQbTJ;
    public final jMF AhwBna;
    public final InterfaceC8218ayb EZpvd;
    public final jLS KWHzl;
    public final jLU OLrzqt;
    public final jLT copydefault;
    public final jLQ gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC8218ayb EZpvd() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public SpotAnalysisCumulativePnlViewModel(@NotNull jLQ jlq, @NotNull InterfaceC8218ayb interfaceC8218ayb, @NotNull jMF jmf, @NotNull jLT jlt, @NotNull jLU jlu, @NotNull jLS jls) {
        super(new C25950jMj(false, null, interfaceC8218ayb.OLrzqt().getValue(), null, null, null, 59, null));
        Intrinsics.checkNotNullParameter(jlq, "");
        Intrinsics.checkNotNullParameter(interfaceC8218ayb, "");
        Intrinsics.checkNotNullParameter(jmf, "");
        Intrinsics.checkNotNullParameter(jlt, "");
        Intrinsics.checkNotNullParameter(jlu, "");
        Intrinsics.checkNotNullParameter(jls, "");
        this.gEmmrt = jlq;
        this.EZpvd = interfaceC8218ayb;
        this.AhwBna = jmf;
        this.copydefault = jlt;
        this.OLrzqt = jlu;
        this.KWHzl = jls;
    }

    public final Object KWHzl(InterfaceC49371unL<CumulativePnlPo> interfaceC49371unL, Continuation<? super Unit> continuation) {
        Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.viewmodel.SpotAnalysisCumulativePnlViewModel$updateCumulativePnl$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((C25950jMj) obj).copydefault();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((C25950jMj) obj).AEQbTJ((InterfaceC49371unL<CumulativePnlPo>) obj2);
            }
        }, interfaceC49371unL, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object KWHzl(@NotNull AnalysisOverviewPeriod analysisOverviewPeriod, @NotNull Continuation<? super Unit> continuation) {
        Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.viewmodel.SpotAnalysisCumulativePnlViewModel$updateValuationPeriod$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((C25950jMj) obj).EZpvd();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((C25950jMj) obj).AEQbTJ((AnalysisOverviewPeriod) obj2);
            }
        }, analysisOverviewPeriod, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object copydefault(@NotNull InterfaceC49371unL<Unit> interfaceC49371unL, @NotNull Continuation<? super Unit> continuation) {
        Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.viewmodel.SpotAnalysisCumulativePnlViewModel$updatePageState$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((C25950jMj) obj).AEQbTJ();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((C25950jMj) obj).copydefault((InterfaceC49371unL) obj2);
            }
        }, interfaceC49371unL, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object copydefault(@NotNull ValuationCurrency valuationCurrency, @NotNull Continuation<? super Unit> continuation) {
        Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.ui.viewmodel.SpotAnalysisCumulativePnlViewModel$updateValuationCurrency$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((C25950jMj) obj).KWHzl();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((C25950jMj) obj).KWHzl((ValuationCurrency) obj2);
            }
        }, valuationCurrency, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public static /* synthetic */ Object requestCumulativePnl$default(SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModel, String str, PayloadPeriod payloadPeriod, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return spotAnalysisCumulativePnlViewModel.EZpvd(str, payloadPeriod, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0193 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0177 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0186 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(String str, @NotNull PayloadPeriod payloadPeriod, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        SpotAnalysisCumulativePnlViewModel$requestCumulativePnl$1 spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1;
        SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModel;
        Throwable th;
        SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModel2;
        Object objM7377constructorimpl;
        InterfaceC49371unL<CumulativePnlPo> taskDescription;
        List list;
        List list2;
        CumulativePnlPo cumulativePnlPo;
        List<CumulativePnlPo.EveryTimeStepPnlList> everyTimeStepPnlList;
        if (continuation instanceof SpotAnalysisCumulativePnlViewModel$requestCumulativePnl$1) {
            spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1 = (SpotAnalysisCumulativePnlViewModel$requestCumulativePnl$1) continuation;
            int i = spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.label = i - Integer.MIN_VALUE;
            } else {
                spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1 = new SpotAnalysisCumulativePnlViewModel$requestCumulativePnl$1(this, continuation);
            }
        }
        Object objOLrzqt = spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$0 = this;
            spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$1 = str;
            spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$2 = payloadPeriod;
            spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.label = 1;
            objOLrzqt = OLrzqt(this, spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            spotAnalysisCumulativePnlViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C56391yDq.AEQbTJ(objOLrzqt);
                            return Unit.INSTANCE;
                        }
                        spotAnalysisCumulativePnlViewModel2 = (SpotAnalysisCumulativePnlViewModel) spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$0;
                        C56391yDq.AEQbTJ(objOLrzqt);
                        spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$0 = null;
                        spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.label = 5;
                        if (spotAnalysisCumulativePnlViewModel2.copydefault((InterfaceC49371unL<Unit>) objOLrzqt, spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    InterfaceC49371unL<CumulativePnlPo> interfaceC49371unL = (InterfaceC49371unL) spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$1;
                    SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModel3 = (SpotAnalysisCumulativePnlViewModel) spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$0;
                    C56391yDq.AEQbTJ(objOLrzqt);
                    taskDescription = interfaceC49371unL;
                    spotAnalysisCumulativePnlViewModel2 = spotAnalysisCumulativePnlViewModel3;
                    jMF jmf = spotAnalysisCumulativePnlViewModel2.AhwBna;
                    spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$0 = spotAnalysisCumulativePnlViewModel2;
                    spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$1 = null;
                    spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.label = 4;
                    objOLrzqt = jmf.EZpvd(taskDescription, (Continuation) spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$0 = null;
                    spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.label = 5;
                    if (spotAnalysisCumulativePnlViewModel2.copydefault((InterfaceC49371unL<Unit>) objOLrzqt, spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                }
                spotAnalysisCumulativePnlViewModel2 = (SpotAnalysisCumulativePnlViewModel) spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objOLrzqt);
                    objM7377constructorimpl = Result.m7377constructorimpl((ResponseData) objOLrzqt);
                } catch (Throwable th2) {
                    th = th2;
                    spotAnalysisCumulativePnlViewModel = spotAnalysisCumulativePnlViewModel2;
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    spotAnalysisCumulativePnlViewModel2 = spotAnalysisCumulativePnlViewModel;
                }
                if (!Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        Intrinsics.copydefault(thM7380exceptionOrNullimpl);
                        taskDescription = new InterfaceC49371unL.Application<>(thM7380exceptionOrNullimpl, null, 2, null);
                    } else {
                        taskDescription = new InterfaceC49371unL.TaskDescription(null, 1, null);
                    }
                    spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$0 = spotAnalysisCumulativePnlViewModel2;
                    spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$1 = taskDescription;
                    spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$2 = null;
                    spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.label = 3;
                    if (spotAnalysisCumulativePnlViewModel2.KWHzl(taskDescription, spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    jMF jmf2 = spotAnalysisCumulativePnlViewModel2.AhwBna;
                    spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$0 = spotAnalysisCumulativePnlViewModel2;
                    spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$1 = null;
                    spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.label = 4;
                    objOLrzqt = jmf2.EZpvd(taskDescription, (Continuation) spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1);
                    if (objOLrzqt == objCopydefault) {
                    }
                    spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$0 = null;
                    spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.label = 5;
                    if (spotAnalysisCumulativePnlViewModel2.copydefault((InterfaceC49371unL<Unit>) objOLrzqt, spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1) == objCopydefault) {
                    }
                } else {
                    ResponseData responseData = (ResponseData) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                    if (responseData != null && responseData.getCode() == 0 && responseData.getData() != null) {
                        ResponseData responseData2 = (ResponseData) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                        if (responseData2 != null && (list = (List) responseData2.getData()) != null && (!list.isEmpty())) {
                            ResponseData responseData3 = (ResponseData) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                            if (responseData3 != null && (list2 = (List) responseData3.getData()) != null && (cumulativePnlPo = (CumulativePnlPo) CollectionsKt___CollectionsKt.AuCTelauCTel(list2)) != null && (everyTimeStepPnlList = cumulativePnlPo.getEveryTimeStepPnlList()) != null && (!everyTimeStepPnlList.isEmpty())) {
                                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                                    objM7377constructorimpl = null;
                                }
                                ResponseData responseData4 = (ResponseData) objM7377constructorimpl;
                                List list3 = responseData4 != null ? (List) responseData4.getData() : null;
                                Intrinsics.copydefault(list3);
                                taskDescription = new InterfaceC49371unL.Activity<>(CollectionsKt___CollectionsKt.AuCTelauCTel(list3));
                            }
                            spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$0 = spotAnalysisCumulativePnlViewModel2;
                            spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$1 = taskDescription;
                            spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$2 = null;
                            spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.label = 3;
                            if (spotAnalysisCumulativePnlViewModel2.KWHzl(taskDescription, spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1) == objCopydefault) {
                            }
                            jMF jmf22 = spotAnalysisCumulativePnlViewModel2.AhwBna;
                            spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$0 = spotAnalysisCumulativePnlViewModel2;
                            spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$1 = null;
                            spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.label = 4;
                            objOLrzqt = jmf22.EZpvd(taskDescription, (Continuation) spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1);
                            if (objOLrzqt == objCopydefault) {
                            }
                            spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$0 = null;
                            spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.label = 5;
                            if (spotAnalysisCumulativePnlViewModel2.copydefault((InterfaceC49371unL<Unit>) objOLrzqt, spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1) == objCopydefault) {
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            payloadPeriod = (PayloadPeriod) spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$2;
            str = (String) spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$1;
            spotAnalysisCumulativePnlViewModel = (SpotAnalysisCumulativePnlViewModel) spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        if (str == null || str.length() == 0) {
            return Unit.INSTANCE;
        }
        try {
            Result.Application application2 = Result.Companion;
            jLQ jlq = spotAnalysisCumulativePnlViewModel.gEmmrt;
            String unit = spotAnalysisCumulativePnlViewModel.EZpvd.OLrzqt().getValue().getUnit();
            spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$0 = spotAnalysisCumulativePnlViewModel;
            spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$1 = null;
            spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.L$2 = null;
            spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1.label = 2;
            objOLrzqt = jlq.EZpvd(payloadPeriod, unit, str, spotAnalysisCumulativePnlViewModel$requestCumulativePnl$1);
        } catch (Throwable th3) {
            th = th3;
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            spotAnalysisCumulativePnlViewModel2 = spotAnalysisCumulativePnlViewModel;
        }
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        spotAnalysisCumulativePnlViewModel2 = spotAnalysisCumulativePnlViewModel;
        objM7377constructorimpl = Result.m7377constructorimpl((ResponseData) objOLrzqt);
        if (!Result.m7384isSuccessimpl(objM7377constructorimpl)) {
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void requestCumulativePnlWithDebounce$default(SpotAnalysisCumulativePnlViewModel spotAnalysisCumulativePnlViewModel, String str, PayloadPeriod payloadPeriod, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            j = 100;
        }
        spotAnalysisCumulativePnlViewModel.OLrzqt(str, payloadPeriod, j);
    }

    public final void OLrzqt(String str, @NotNull PayloadPeriod payloadPeriod, long j) {
        Intrinsics.checkNotNullParameter(payloadPeriod, "");
        Job job = this.AEQbTJ;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.AEQbTJ = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SpotAnalysisCumulativePnlViewModel$requestCumulativePnlWithDebounce$1(j, this, str, payloadPeriod, null), 3, null);
    }

    public final String KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) this.KWHzl.KWHzl((Object) new jLS.StateListAnimator(this.EZpvd.OLrzqt().getValue(), str));
    }

    public final Object OLrzqt(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        return this.copydefault.EZpvd(new jLT.Application(this.EZpvd.OLrzqt().getValue(), str), continuation);
    }

    public final Object KWHzl(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        return this.OLrzqt.EZpvd(new jLU.Application(this.EZpvd.OLrzqt().getValue(), str), continuation);
    }
}
