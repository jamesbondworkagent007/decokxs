package com.okinc.liveness.eop.activity;

import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.eop.activity.EopLivenessActivity$setListener$4$1;
import com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.data.efr.EFRData;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC38205pQc;
import o.C32866mlf;
import o.C32868mlh;
import o.C33129mqd;
import o.C43251rlk;
import o.C43693ruB;
import o.C45508srO;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.InterfaceC42438rSw;
import o.pUU;
import o.rSF;

/* JADX INFO: loaded from: classes19.dex */
public final class EopLivenessActivity$setListener$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EFRData $data;
    int label;
    final /* synthetic */ ActivityC38205pQc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EopLivenessActivity$setListener$4$1(ActivityC38205pQc activityC38205pQc, EFRData eFRData, Continuation<? super EopLivenessActivity$setListener$4$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC38205pQc;
        this.$data = eFRData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EopLivenessActivity$setListener$4$1(this.this$0, this.$data, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EopLivenessActivity$setListener$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            TrackChannel[] trackChannelArr = (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length);
            final ActivityC38205pQc activityC38205pQc = this.this$0;
            C32866mlf.EZpvd("FaceLiveness_Router_EFR_Click", trackChannelArr, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pQw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return EopLivenessActivity$setListener$4$1.invokeSuspend$lambda$0(activityC38205pQc, (EventParamsList) obj2);
                }
            });
            ReportManager reportManager = ReportManager.AEQbTJ;
            EventData eventData = new EventData();
            ActivityC38205pQc activityC38205pQc2 = this.this$0;
            eventData.setAct("compliance_logs");
            eventData.setSource("FaceLiveness_Router_EFR_Click");
            eventData.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("attr_1", activityC38205pQc2.fIwbmz()), C56390yDp.OLrzqt("attr_2", activityC38205pQc2.AuCTel()), C56390yDp.OLrzqt("attr_3", activityC38205pQc2.fARcdN())));
            reportManager.EZpvd(eventData);
            rSF rsf = (rSF) C43251rlk.OLrzqt(rSF.class);
            if (rsf != null) {
                ActivityC38205pQc activityC38205pQc3 = this.this$0;
                EFRData eFRData = this.$data;
                Intrinsics.copydefault(eFRData);
                final ActivityC38205pQc activityC38205pQc4 = this.this$0;
                final EFRData eFRData2 = this.$data;
                InterfaceC42438rSw interfaceC42438rSw = new InterfaceC42438rSw() { // from class: com.okinc.liveness.eop.activity.EopLivenessActivity$setListener$4$1.2
                    @Override // o.InterfaceC42438rSw
                    public void copydefault(int i2, String str) {
                        pUU.copydefault("qjf", "errCode = " + i2 + " ,reason = " + str);
                        HashMap mapAYXKKw = C56424yEw.AYXKKw(C56390yDp.OLrzqt("result", EopTrackEvent.KEY_RESULT_FAILED), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_MESSAGE, C33129mqd.gEmmrt(str)));
                        ActivityC38205pQc activityC38205pQc5 = activityC38205pQc4;
                        mapAYXKKw.putAll(activityC38205pQc5.copydefault((Context) activityC38205pQc5));
                        C43693ruB.copydefault("EFR_SDK_Init_View", mapAYXKKw);
                        ReportManager reportManager2 = ReportManager.AEQbTJ;
                        EventData eventData2 = new EventData();
                        eventData2.setAct("compliance_logs");
                        eventData2.setSource("EFR_SDK_Init_View");
                        eventData2.setCode("1");
                        eventData2.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(str))));
                        reportManager2.EZpvd(eventData2);
                        C55326xho.toastWithFailedIcon$default(C45508srO.Application.DbNXlk, 0, 1, (Object) null);
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC38205pQc4), null, null, new EopLivenessActivity$setListener$4$1$3$onError$2(activityC38205pQc4, i2, str, null), 3, null);
                        EopLivenessBasicViewModel eopLivenessBasicViewModel = activityC38205pQc4.KWHzl;
                        if (eopLivenessBasicViewModel != null) {
                            eopLivenessBasicViewModel.djBIcL();
                        }
                    }

                    @Override // o.InterfaceC42438rSw
                    public void OLrzqt(int i2) {
                        pUU.KWHzl("qjf", "initEFR success");
                        C43693ruB.copydefault("EFR_SDK_Init_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("result", "success"), C56390yDp.OLrzqt("times", String.valueOf(i2))));
                        ReportManager reportManager2 = ReportManager.AEQbTJ;
                        EventData eventData2 = new EventData();
                        eventData2.setAct("compliance_logs");
                        eventData2.setSource("EFR_SDK_Init_View");
                        eventData2.setCode("0");
                        eventData2.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", String.valueOf(i2))));
                        reportManager2.EZpvd(eventData2);
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC38205pQc4), null, null, new EopLivenessActivity$setListener$4$1$3$onSuccess$2(activityC38205pQc4, eFRData2, null), 3, null);
                    }
                };
                this.label = 1;
                if (rsf.OLrzqt(activityC38205pQc3, eFRData, interfaceC42438rSw, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(ActivityC38205pQc activityC38205pQc, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, activityC38205pQc.fIwbmz(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", activityC38205pQc.AuCTel(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, activityC38205pQc.fARcdN(), false, 4, null);
        return Unit.INSTANCE;
    }
}
