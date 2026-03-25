package com.okinc.ok_kyc_core.presentation.verify;

import androidx.fragment.app.Fragment;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorResultResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
import com.okinc.ok_kyc_core.data.remote.networkmodel.VendorVerifyRequest;
import com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase;
import com.okinc.ok_kyc_core.presentation.verify.OcrVerifyViewModel$postEncryptVerify$1;
import com.okinc.ok_kyc_core.service.EopImageInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.AbstractC43728ruk;
import o.C32866mlf;
import o.C32868mlh;
import o.C41982rBz;
import o.C42203rKd;
import o.C43251rlk;
import o.C43693ruB;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class OcrVerifyViewModel$postEncryptVerify$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C42203rKd.StateListAnimator $eopVerifyCallback;
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ String $mrz;
    final /* synthetic */ HashMap<String, String> $playbookParams;
    final /* synthetic */ PageComponentProfile $profile;
    final /* synthetic */ String $source;
    final /* synthetic */ VendorVerifyRequest $verifyRequest;
    Object L$0;
    int label;
    final /* synthetic */ C42203rKd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcrVerifyViewModel$postEncryptVerify$1(VendorVerifyRequest vendorVerifyRequest, C42203rKd c42203rKd, Fragment fragment, PageComponentProfile pageComponentProfile, HashMap<String, String> map, String str, String str2, C42203rKd.StateListAnimator stateListAnimator, Continuation<? super OcrVerifyViewModel$postEncryptVerify$1> continuation) {
        super(2, continuation);
        this.$verifyRequest = vendorVerifyRequest;
        this.this$0 = c42203rKd;
        this.$fragment = fragment;
        this.$profile = pageComponentProfile;
        this.$playbookParams = map;
        this.$mrz = str;
        this.$source = str2;
        this.$eopVerifyCallback = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OcrVerifyViewModel$postEncryptVerify$1(this.$verifyRequest, this.this$0, this.$fragment, this.$profile, this.$playbookParams, this.$mrz, this.$source, this.$eopVerifyCallback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OcrVerifyViewModel$postEncryptVerify$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0108  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        AbstractC43728ruk abstractC43728ruk;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ArrayList arrayList = new ArrayList();
            for (EopImageInfo eopImageInfo : this.$verifyRequest.getImageFiles()) {
                arrayList.add(new SingleFileUploadUseCase.UploadedFile(eopImageInfo.getImageId(), eopImageInfo.getName(), eopImageInfo.getImageType(), "", eopImageInfo.getWidth(), eopImageInfo.getHeight()));
            }
            C43693ruB.OLrzqt("TRKYC_Encrypt_Verify_Start");
            C41982rBz c41982rBzCopydefault = this.this$0.DbNXlk().copydefault();
            long bizId = this.$verifyRequest.getBizId();
            Integer vendorType = this.$verifyRequest.getVendorType();
            Integer verifyType = this.$verifyRequest.getVerifyType();
            String sessionId = this.$verifyRequest.getSessionId();
            Fragment fragment = this.$fragment;
            PageComponentProfile pageComponentProfile = this.$profile;
            HashMap<String, String> map = this.$playbookParams;
            String str = this.$mrz;
            this.label = 1;
            objCopydefault = c41982rBzCopydefault.copydefault(bizId, arrayList, vendorType, verifyType, sessionId, fragment, pageComponentProfile, map, str, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                abstractC43728ruk = (AbstractC43728ruk) this.L$0;
                C56391yDq.AEQbTJ(obj);
                C42203rKd.StateListAnimator stateListAnimator = this.$eopVerifyCallback;
                C42203rKd c42203rKd = this.this$0;
                VendorVerifyRequest vendorVerifyRequest = this.$verifyRequest;
                String str2 = this.$source;
                if (abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription) {
                    ResponseFailedException responseFailedException = (ResponseFailedException) ((AbstractC43728ruk.TaskDescription) abstractC43728ruk).OLrzqt();
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    OcrVerifyViewModel$postEncryptVerify$1$3$1 ocrVerifyViewModel$postEncryptVerify$1$3$1 = new OcrVerifyViewModel$postEncryptVerify$1$3$1(stateListAnimator, c42203rKd, vendorVerifyRequest, responseFailedException, str2, null);
                    this.L$0 = abstractC43728ruk;
                    this.label = 3;
                    if (BuildersKt.withContext(main, ocrVerifyViewModel$postEncryptVerify$1$3$1, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
        }
        abstractC43728ruk = (AbstractC43728ruk) objCopydefault;
        final String str3 = this.$source;
        C42203rKd.StateListAnimator stateListAnimator2 = this.$eopVerifyCallback;
        C42203rKd c42203rKd2 = this.this$0;
        VendorVerifyRequest vendorVerifyRequest2 = this.$verifyRequest;
        if (abstractC43728ruk instanceof AbstractC43728ruk.ActionBar) {
            MultiVendorResultResp multiVendorResultResp = (MultiVendorResultResp) ((AbstractC43728ruk.ActionBar) abstractC43728ruk).KWHzl();
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("TRKYC_Encrypt_Verify_Result", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rKm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return OcrVerifyViewModel$postEncryptVerify$1.invokeSuspend$lambda$2$lambda$1(str3, (EventParamsList) obj2);
                }
            });
            MainCoroutineDispatcher main2 = Dispatchers.getMain();
            OcrVerifyViewModel$postEncryptVerify$1$2$2 ocrVerifyViewModel$postEncryptVerify$1$2$2 = new OcrVerifyViewModel$postEncryptVerify$1$2$2(stateListAnimator2, c42203rKd2, multiVendorResultResp, vendorVerifyRequest2, null);
            this.L$0 = abstractC43728ruk;
            this.label = 2;
            if (BuildersKt.withContext(main2, ocrVerifyViewModel$postEncryptVerify$1$2$2, this) == objCopydefault2) {
                return objCopydefault2;
            }
        }
        C42203rKd.StateListAnimator stateListAnimator3 = this.$eopVerifyCallback;
        C42203rKd c42203rKd3 = this.this$0;
        VendorVerifyRequest vendorVerifyRequest3 = this.$verifyRequest;
        String str22 = this.$source;
        if (abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$1(String str, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, "result", "success", false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", str, false, 4, null);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }
}
