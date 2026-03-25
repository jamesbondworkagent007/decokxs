package com.okinc.ok_kyc_core.presentation.base;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentActivity;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.ocrvendor.VendorEvent;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCFragment$amaniForResultLauncher$1$1;
import com.okinc.ok_kyc_core_api.amani.AmaniUiModel;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC42060rEw;
import o.AbstractC42074rFj;
import o.ActivityC42162rIq;
import o.C32866mlf;
import o.C32868mlh;
import o.C33129mqd;
import o.C42467rTy;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.rSF;

/* JADX INFO: loaded from: classes23.dex */
public final class BaseKYCFragment$amaniForResultLauncher$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ActivityResult $result;
    int label;
    final /* synthetic */ AbstractC42060rEw<BINDING, VM> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseKYCFragment$amaniForResultLauncher$1$1(ActivityResult activityResult, AbstractC42060rEw<BINDING, VM> abstractC42060rEw, Continuation<? super BaseKYCFragment$amaniForResultLauncher$1$1> continuation) {
        super(2, continuation);
        this.$result = activityResult;
        this.this$0 = abstractC42060rEw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseKYCFragment$amaniForResultLauncher$1$1(this.$result, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseKYCFragment$amaniForResultLauncher$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        final AmaniUiModel amaniUiModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$result.getResultCode() == -1) {
                if (this.this$0.getActivity() != null && (this.this$0.getActivity() instanceof ActivityC42162rIq)) {
                    C42467rTy c42467rTy = C42467rTy.KWHzl;
                    if (c42467rTy.sSMYrx() && c42467rTy.AxsJAY()) {
                        FragmentActivity activity = this.this$0.getActivity();
                        Intrinsics.copydefault(activity, "");
                        this.label = 1;
                        if (c42467rTy.KWHzl((ActivityC42162rIq) activity, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
            } else {
                AbstractC42060rEw.finishWithErrorResult$default(this.this$0, VendorEvent.VENDOR_CANCELLED_BY_USER, null, 2, null);
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
            amaniUiModel = (AmaniUiModel) objAEQbTJ;
            if (!Intrinsics.EZpvd((Object) amaniUiModel.AEQbTJ(), (Object) "APPROVED")) {
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                TrackChannel[] trackChannelArr = (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length);
                final AbstractC42060rEw<BINDING, VM> abstractC42060rEw = this.this$0;
                C32866mlf.EZpvd("TRKYC_Vendor_Success_View", trackChannelArr, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rEZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return BaseKYCFragment$amaniForResultLauncher$1$1.invokeSuspend$lambda$0(abstractC42060rEw, (EventParamsList) obj2);
                    }
                });
                AbstractC42074rFj.navigateToOcrVendor$default(this.this$0.fetchVPNInfo(), this.this$0.values, this.this$0.fARcdN, this.this$0.fIwbmz, null, this.this$0.EZpvd().valueOf(), C56443yFo.AEQbTJ(this.this$0.EZpvd().AhwBna()), this.this$0.EZpvd().gEmmrt(), null, this.this$0.KWHzl().fetchVPNInfo(), this.this$0.KWHzl().AhwBna(), this.this$0.AhwBna(), null, null, 6280, null);
            } else {
                TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
                TrackChannel[] trackChannelArr2 = (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length);
                final AbstractC42060rEw<BINDING, VM> abstractC42060rEw2 = this.this$0;
                C32866mlf.EZpvd("TRKYC_Vendor_Failed_View", trackChannelArr2, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rFa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return BaseKYCFragment$amaniForResultLauncher$1$1.invokeSuspend$lambda$1(amaniUiModel, abstractC42060rEw2, (EventParamsList) obj2);
                    }
                });
                AbstractC42060rEw<BINDING, VM> abstractC42060rEw3 = this.this$0;
                VendorEvent vendorEvent = VendorEvent.VENDOR_CANCELLED_BY_USER;
                Throwable thKWHzl = amaniUiModel.KWHzl();
                abstractC42060rEw3.KWHzl(vendorEvent, thKWHzl != null ? thKWHzl.getMessage() : null);
            }
            return Unit.INSTANCE;
        }
        C56391yDq.AEQbTJ(obj);
        rSF rsf = (rSF) C43251rlk.copydefault(rSF.class);
        FragmentActivity activity2 = this.this$0.getActivity();
        Intrinsics.copydefault(activity2, "");
        Intent data = this.$result.getData();
        this.label = 2;
        objAEQbTJ = rsf.AEQbTJ((ActivityC42162rIq) activity2, data, this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        amaniUiModel = (AmaniUiModel) objAEQbTJ;
        if (!Intrinsics.EZpvd((Object) amaniUiModel.AEQbTJ(), (Object) "APPROVED")) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(AbstractC42060rEw abstractC42060rEw, EventParamsList eventParamsList) {
        eventParamsList.put("flow_source", C33129mqd.gEmmrt(abstractC42060rEw.KWHzl().values().getValue()), false);
        eventParamsList.put(EopTrackEvent.KEY_SOURCE_CODE, abstractC42060rEw.fetchVPNInfo().OLrzqt(abstractC42060rEw.valueOf()), false);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(AmaniUiModel amaniUiModel, AbstractC42060rEw abstractC42060rEw, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, "httpErrorCode", C33129mqd.gEmmrt(amaniUiModel.copydefault()), false, 4, null);
        Throwable thKWHzl = amaniUiModel.KWHzl();
        EventParamsList.put$default(eventParamsList, "generalException", C33129mqd.gEmmrt(thKWHzl != null ? thKWHzl.getMessage() : null), false, 4, null);
        eventParamsList.put("flow_source", C33129mqd.gEmmrt(abstractC42060rEw.KWHzl().values().getValue()), false);
        eventParamsList.put(EopTrackEvent.KEY_SOURCE_CODE, abstractC42060rEw.fetchVPNInfo().OLrzqt(abstractC42060rEw.valueOf()), false);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }
}
