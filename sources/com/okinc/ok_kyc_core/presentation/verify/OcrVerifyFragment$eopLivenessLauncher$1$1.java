package com.okinc.ok_kyc_core.presentation.verify;

import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentActivity;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.presentation.verify.OcrVerifyFragment$eopLivenessLauncher$1$1;
import com.okinc.ok_kyc_core.service.EopImageInfo;
import com.okinc.ok_kyc_core_api.eop.EopResultImageInfo;
import com.okinc.ok_kyc_core_api.eop.EopUiModel;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC42162rIq;
import o.C32866mlf;
import o.C32868mlh;
import o.C33129mqd;
import o.C42467rTy;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.rJF;
import o.rSF;

/* JADX INFO: loaded from: classes23.dex */
public final class OcrVerifyFragment$eopLivenessLauncher$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ActivityResult $result;
    int label;
    final /* synthetic */ rJF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcrVerifyFragment$eopLivenessLauncher$1$1(rJF rjf, ActivityResult activityResult, Continuation<? super OcrVerifyFragment$eopLivenessLauncher$1$1> continuation) {
        super(2, continuation);
        this.this$0 = rjf;
        this.$result = activityResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OcrVerifyFragment$eopLivenessLauncher$1$1(this.this$0, this.$result, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OcrVerifyFragment$eopLivenessLauncher$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:(1:5)(2:6|7))(4:8|(2:12|(2:16|(1:18)))|36|37)|38|19|(1:21)(1:25)|(3:27|(4:29|(2:32|30)|40|33)(1:34)|35)|36|37) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        o.pUU.copydefault("kyc_in_house", "analyzeEopData e=" + r0);
        r3 = o.C32868mlh.OLrzqt.copydefault();
        o.C32866mlf.EZpvd("fd_eop_crash", (com.okinc.components.track.TrackChannel[]) java.util.Arrays.copyOf(r3, r3.length), (kotlin.jvm.functions.Function1<? super com.okinc.components.track.bean.EventParamsList, kotlin.Unit>) new o.rJX(r0));
     */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        final EopUiModel eopUiModelCopydefault;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.getActivity() != null && (this.this$0.getActivity() instanceof ActivityC42162rIq)) {
                C42467rTy c42467rTy = C42467rTy.KWHzl;
                if (c42467rTy.DTwDnp() && c42467rTy.QOLQEE()) {
                    FragmentActivity activity = this.this$0.getActivity();
                    Intrinsics.copydefault(activity, "");
                    this.label = 1;
                    if (c42467rTy.OLrzqt((ActivityC42162rIq) activity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        rSF rsf = (rSF) C43251rlk.OLrzqt(rSF.class);
        if (rsf != null) {
            FragmentActivity activity2 = this.this$0.getActivity();
            Intrinsics.copydefault(activity2, "");
            eopUiModelCopydefault = rsf.copydefault((ActivityC42162rIq) activity2, this.$result.getData());
        } else {
            eopUiModelCopydefault = null;
        }
        if (eopUiModelCopydefault != null) {
            final rJF rjf = this.this$0;
            pUU.KWHzl("kyc_in_house", "eopResult = " + eopUiModelCopydefault);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            if (eopUiModelCopydefault.isSuccess()) {
                ArrayList arrayList = new ArrayList();
                for (EopResultImageInfo eopResultImageInfo : eopUiModelCopydefault.getEopResultList()) {
                    arrayList.add(new EopImageInfo(eopResultImageInfo.getImageId(), eopResultImageInfo.getImageType(), eopResultImageInfo.getName(), (String) null, (String) null, 24, (DefaultConstructorMarker) null));
                }
                rjf.EZpvd(arrayList, rjf.OcIXYQ, rjf.QOLQEE, rjf.DTwDnp);
            } else {
                objectRef.element = eopUiModelCopydefault.getMessage();
                rjf.fetchVPNInfo().wlaJM();
            }
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("OKFace_SDK_Finish_Status", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rJT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return OcrVerifyFragment$eopLivenessLauncher$1$1.invokeSuspend$lambda$3$lambda$2(objectRef, eopUiModelCopydefault, rjf, (EventParamsList) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(Exception exc, EventParamsList eventParamsList) {
        eventParamsList.put("message", String.valueOf(exc), false);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit invokeSuspend$lambda$3$lambda$2(Ref.ObjectRef objectRef, EopUiModel eopUiModel, rJF rjf, EventParamsList eventParamsList) {
        eventParamsList.put(EopTrackEvent.KEY_ERROR_MESSAGE, (String) objectRef.element, true);
        eventParamsList.put("type", eopUiModel.getVendorType(), true);
        eventParamsList.put("flow_source", C33129mqd.gEmmrt(rjf.fetchVPNInfo().getFieldNames().getValue()), false);
        eventParamsList.put(EopTrackEvent.KEY_SOURCE_CODE, rjf.fetchVPNInfo().OLrzqt(rjf.valueOf()), false);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }
}
