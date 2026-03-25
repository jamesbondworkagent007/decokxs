package com.okinc.ok_kyc_core.presentation.base;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.common.Constant;
import com.okinc.ok_kyc_core.data.eop.VendorConfig;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
import com.okinc.ok_kyc_core.ocrvendor.VendorEvent;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCFragment$eopCardLauncher$1$1;
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
import o.AbstractC42060rEw;
import o.ActivityC42162rIq;
import o.C32866mlf;
import o.C32868mlh;
import o.C33129mqd;
import o.C42467rTy;
import o.C43251rlk;
import o.C43701ruJ;
import o.C43734ruq;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.rFR;
import o.rSF;
import o.rTM;

/* JADX INFO: loaded from: classes23.dex */
public final class BaseKYCFragment$eopCardLauncher$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ActivityResult $result;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AbstractC42060rEw<BINDING, VM> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseKYCFragment$eopCardLauncher$1$1(AbstractC42060rEw<BINDING, VM> abstractC42060rEw, ActivityResult activityResult, Continuation<? super BaseKYCFragment$eopCardLauncher$1$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC42060rEw;
        this.$result = activityResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseKYCFragment$eopCardLauncher$1$1(this.this$0, this.$result, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseKYCFragment$eopCardLauncher$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:(1:(5:6|55|59|60|61)(2:7|8))(1:9))(4:10|(2:14|(2:18|(1:20)))|60|61)|62|21|(1:23)(1:27)|(4:29|(9:31|(1:37)(1:36)|38|(1:44)|45|(2:48|46)|64|49|(2:51|(1:53)(3:54|55|59))(1:56))(1:57)|58|59)|60|61) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        o.pUU.copydefault("kyc_in_house", "analyzeEopData e=" + r0);
        r2 = o.C32868mlh.OLrzqt.copydefault();
        o.C32866mlf.EZpvd("fd_eop_crash", (com.okinc.components.track.TrackChannel[]) java.util.Arrays.copyOf(r2, r2.length), (kotlin.jvm.functions.Function1<? super com.okinc.components.track.bean.EventParamsList, kotlin.Unit>) new o.C42066rFb(r0));
     */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        final EopUiModel eopUiModelCopydefault;
        Ref.ObjectRef objectRef;
        AbstractC42060rEw abstractC42060rEw;
        final AbstractC42060rEw abstractC42060rEw2;
        final Ref.ObjectRef objectRef2;
        VendorConfig vendorConfig;
        EopUiModel eopUiModel;
        Ref.ObjectRef objectRef3;
        AbstractC42060rEw abstractC42060rEw3;
        rFR rfrKWHzl;
        String countryOfResidence;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.getActivity() != null && (this.this$0.getActivity() instanceof ActivityC42162rIq)) {
                C42467rTy c42467rTy = C42467rTy.KWHzl;
                if (c42467rTy.QKVWgx() && c42467rTy.ORxRYg()) {
                    FragmentActivity activity = this.this$0.getActivity();
                    Intrinsics.copydefault(activity, "");
                    this.label = 1;
                    if (c42467rTy.EZpvd((ActivityC42162rIq) activity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef3 = (Ref.ObjectRef) this.L$2;
            abstractC42060rEw3 = (AbstractC42060rEw) this.L$1;
            eopUiModel = (EopUiModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objectRef2 = objectRef3;
            abstractC42060rEw2 = abstractC42060rEw3;
            eopUiModelCopydefault = eopUiModel;
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("OKCard_SDK_Finish_Status", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rFg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return BaseKYCFragment$eopCardLauncher$1$1.invokeSuspend$lambda$3$lambda$2(objectRef2, eopUiModelCopydefault, abstractC42060rEw2, (EventParamsList) obj2);
                }
            });
            return Unit.INSTANCE;
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
            AbstractC42060rEw abstractC42060rEw4 = this.this$0;
            Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
            objectRef4.element = "";
            if (eopUiModelCopydefault.isSuccess()) {
                pUU.KWHzl("qjf", "eopCardLauncher---success----->");
                PageComponentProfile pageComponentProfileAhwBna = abstractC42060rEw4.AhwBna();
                String str = (pageComponentProfileAhwBna == null || (countryOfResidence = pageComponentProfileAhwBna.getCountryOfResidence()) == null) ? "" : countryOfResidence;
                C43734ruq<rFR> value = abstractC42060rEw4.fetchVPNInfo().AhwBna().getValue();
                if (value == null || (rfrKWHzl = value.KWHzl()) == null || (vendorConfig = rfrKWHzl.djBIcL()) == null) {
                    vendorConfig = new VendorConfig((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 1048575, (DefaultConstructorMarker) null);
                }
                VendorConfig vendorConfig2 = vendorConfig;
                pUU.KWHzl("qjf", "vendorConfig = " + vendorConfig2);
                ArrayList<EopImageInfo> arrayList = new ArrayList<>();
                for (EopResultImageInfo eopResultImageInfo : eopUiModelCopydefault.getEopResultList()) {
                    arrayList.add(new EopImageInfo(eopResultImageInfo.getImageId(), eopResultImageInfo.getImageType(), eopResultImageInfo.getName(), (String) null, (String) null, 24, (DefaultConstructorMarker) null));
                }
                C43701ruJ.EZpvd.AEQbTJ(arrayList);
                if (abstractC42060rEw4.EZpvd().AEQbTJ().contains(C56443yFo.AEQbTJ(Constant.UploadFileType.LIVE_FACE.getImageTypeVal()))) {
                    rTM rtm = rTM.KWHzl;
                    FragmentActivity fragmentActivityRequireActivity = abstractC42060rEw4.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    String sessionId = eopUiModelCopydefault.getSessionId();
                    ActivityResultLauncher<Intent> activityResultLauncher = abstractC42060rEw4.gEmmrt;
                    this.L$0 = eopUiModelCopydefault;
                    this.L$1 = abstractC42060rEw4;
                    this.L$2 = objectRef4;
                    this.label = 2;
                    if (rtm.OLrzqt(fragmentActivityRequireActivity, vendorConfig2, sessionId, str, activityResultLauncher, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    eopUiModel = eopUiModelCopydefault;
                    objectRef3 = objectRef4;
                    abstractC42060rEw3 = abstractC42060rEw4;
                    objectRef2 = objectRef3;
                    abstractC42060rEw2 = abstractC42060rEw3;
                    eopUiModelCopydefault = eopUiModel;
                    TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.EZpvd("OKCard_SDK_Finish_Status", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rFg
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return BaseKYCFragment$eopCardLauncher$1$1.invokeSuspend$lambda$3$lambda$2(objectRef2, eopUiModelCopydefault, abstractC42060rEw2, (EventParamsList) obj2);
                        }
                    });
                } else {
                    objectRef = objectRef4;
                    abstractC42060rEw = abstractC42060rEw4;
                    AbstractC42060rEw.vendorSuccessResult$default(abstractC42060rEw4, Constant.VendorType.EOP.getVendorType(), eopUiModelCopydefault.getVerifyType(), eopUiModelCopydefault.getSessionId(), arrayList, null, null, 48, null);
                }
            } else {
                objectRef = objectRef4;
                abstractC42060rEw = abstractC42060rEw4;
                pUU.KWHzl("qjf", "eopCardLauncher---failed----->");
                objectRef.element = eopUiModelCopydefault.getMessage();
                abstractC42060rEw.KWHzl(VendorEvent.VENDOR_CANCELLED_BY_USER, eopUiModelCopydefault.getMessage());
            }
            abstractC42060rEw2 = abstractC42060rEw;
            objectRef2 = objectRef;
            TrackChannel[] trackChannelArrCopydefault22 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("OKCard_SDK_Finish_Status", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault22, trackChannelArrCopydefault22.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rFg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return BaseKYCFragment$eopCardLauncher$1$1.invokeSuspend$lambda$3$lambda$2(objectRef2, eopUiModelCopydefault, abstractC42060rEw2, (EventParamsList) obj2);
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
    public static final Unit invokeSuspend$lambda$3$lambda$2(Ref.ObjectRef objectRef, EopUiModel eopUiModel, AbstractC42060rEw abstractC42060rEw, EventParamsList eventParamsList) {
        eventParamsList.put(EopTrackEvent.KEY_ERROR_MESSAGE, (String) objectRef.element, false);
        eventParamsList.put("type", eopUiModel.getVendorType(), false);
        eventParamsList.put("flow_source", C33129mqd.gEmmrt(abstractC42060rEw.fetchVPNInfo().getFieldNames().getValue()), false);
        eventParamsList.put(EopTrackEvent.KEY_SOURCE_CODE, abstractC42060rEw.fetchVPNInfo().OLrzqt(abstractC42060rEw.valueOf()), false);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }
}
