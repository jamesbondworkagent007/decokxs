package com.okinc.ok_kyc_core.presentation.base;

import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AlifaceResultResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCViewModel$checkResultWithAliGlobal$1;
import com.okinc.ok_kyc_core_api.ComplianceTheme;
import java.util.Arrays;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC42074rFj;
import o.AbstractC43728ruk;
import o.C32866mlf;
import o.C32868mlh;
import o.C33129mqd;
import o.C41957rBa;
import o.C41968rBl;
import o.C43251rlk;
import o.C43739ruv;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class BaseKYCViewModel$checkResultWithAliGlobal$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ CTAButtonAppModel $ctaModel;
    final /* synthetic */ Map<String, String> $ctaValue;
    final /* synthetic */ String $featureUri;
    final /* synthetic */ String $id;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ String $playbook;
    final /* synthetic */ String $target;
    final /* synthetic */ ComplianceTheme $theme;
    final /* synthetic */ String $transactionId;
    final /* synthetic */ C52794wYp $view;
    int label;
    final /* synthetic */ AbstractC42074rFj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseKYCViewModel$checkResultWithAliGlobal$1(AbstractC42074rFj abstractC42074rFj, C52794wYp c52794wYp, FragmentActivity fragmentActivity, CTAButtonAppModel cTAButtonAppModel, ComplianceTheme complianceTheme, String str, String str2, Map<String, String> map, String str3, String str4, Map<String, String> map2, String str5, Continuation<? super BaseKYCViewModel$checkResultWithAliGlobal$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC42074rFj;
        this.$view = c52794wYp;
        this.$activity = fragmentActivity;
        this.$ctaModel = cTAButtonAppModel;
        this.$theme = complianceTheme;
        this.$transactionId = str;
        this.$target = str2;
        this.$ctaValue = map;
        this.$playbook = str3;
        this.$featureUri = str4;
        this.$params = map2;
        this.$id = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseKYCViewModel$checkResultWithAliGlobal$1(this.this$0, this.$view, this.$activity, this.$ctaModel, this.$theme, this.$transactionId, this.$target, this.$ctaValue, this.$playbook, this.$featureUri, this.$params, this.$id, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseKYCViewModel$checkResultWithAliGlobal$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.EZpvd(this.$view, this.$activity, this.$ctaModel.getStyle(), this.$theme);
            C41968rBl c41968rBlOLrzqt = this.this$0.values().OLrzqt();
            String str = this.$transactionId;
            this.label = 1;
            objCopydefault = c41968rBlOLrzqt.copydefault(str, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
        }
        AbstractC43728ruk abstractC43728ruk = (AbstractC43728ruk) objCopydefault;
        final String str2 = this.$playbook;
        final Map<String, String> map = this.$params;
        if (abstractC43728ruk instanceof AbstractC43728ruk.ActionBar) {
            final AlifaceResultResp alifaceResultResp = (AlifaceResultResp) ((AbstractC43728ruk.ActionBar) abstractC43728ruk).KWHzl();
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("KYC_China_Aliface_Submit", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rFQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return BaseKYCViewModel$checkResultWithAliGlobal$1.invokeSuspend$lambda$1$lambda$0(alifaceResultResp, str2, map, (EventParamsList) obj2);
                }
            });
        }
        AbstractC42074rFj.postOnboarding$default(this.this$0, this.$view, this.$target, this.$ctaValue, this.$playbook, this.$featureUri, new C41957rBa(), this.$params, this.$id, this.$activity, null, null, null, null, new Function1() { // from class: o.rFV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return BaseKYCViewModel$checkResultWithAliGlobal$1.invokeSuspend$lambda$3((java.lang.String) obj2);
            }
        }, null, null, 56832, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(AlifaceResultResp alifaceResultResp, String str, Map map, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, "faceStatus", C33129mqd.gEmmrt(alifaceResultResp.getFaceStatus()), false, 4, null);
        eventParamsList.put("playbook", new C43739ruv().KWHzl(str), false);
        String json = new Gson().toJson(map);
        Intrinsics.checkNotNullExpressionValue(json, "");
        eventParamsList.put("action_params", json, false);
        eventParamsList.put("refresh_type", C33129mqd.gEmmrt(map.get("refreshType")), false);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(String str) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("app_compliance_ali_post_error", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rFP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BaseKYCViewModel$checkResultWithAliGlobal$1.invokeSuspend$lambda$3$lambda$2((EventParamsList) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$2(EventParamsList eventParamsList) {
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }
}
