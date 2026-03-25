package com.okinc.ok_kyc_core.presentation.base;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentActivity;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.common.Constant;
import com.okinc.ok_kyc_core.data.eop.VendorConfig;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
import com.okinc.ok_kyc_core.ocrvendor.VendorEvent;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCFragment$jumioForResultLauncher$1$1;
import java.util.Arrays;
import java.util.HashMap;
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
import o.AbstractC42074rFj;
import o.ActivityC42162rIq;
import o.C32866mlf;
import o.C32868mlh;
import o.C33129mqd;
import o.C42467rTy;
import o.C42487rUr;
import o.C43251rlk;
import o.C43734ruq;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.rFR;
import o.rSF;

/* JADX INFO: loaded from: classes23.dex */
public final class BaseKYCFragment$jumioForResultLauncher$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ActivityResult $result;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ AbstractC42060rEw<BINDING, VM> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseKYCFragment$jumioForResultLauncher$1$1(AbstractC42060rEw<BINDING, VM> abstractC42060rEw, ActivityResult activityResult, Continuation<? super BaseKYCFragment$jumioForResultLauncher$1$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC42060rEw;
        this.$result = activityResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseKYCFragment$jumioForResultLauncher$1$1(this.this$0, this.$result, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseKYCFragment$jumioForResultLauncher$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0221  */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        C42487rUr c42487rUr;
        final Ref.ObjectRef objectRef;
        final Ref.ObjectRef objectRef2;
        AbstractC42060rEw abstractC42060rEw;
        C42487rUr c42487rUr2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        AbstractC42060rEw abstractC42060rEw2;
        VendorConfig vendorConfig;
        rFR rfrKWHzl;
        String countryOfResidence;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.getActivity() != null && (this.this$0.getActivity() instanceof ActivityC42162rIq)) {
                C42467rTy c42467rTy = C42467rTy.KWHzl;
                if (c42467rTy.QbewEr() && c42467rTy.QUSxYX()) {
                    FragmentActivity activity = this.this$0.getActivity();
                    Intrinsics.copydefault(activity, "");
                    this.label = 1;
                    if (c42467rTy.valueOf((ActivityC42162rIq) activity, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c42487rUr2 = (C42487rUr) this.L$3;
                abstractC42060rEw2 = (AbstractC42060rEw) this.L$2;
                objectRef4 = (Ref.ObjectRef) this.L$1;
                objectRef3 = (Ref.ObjectRef) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objectRef4.element = C33129mqd.gEmmrt(c42487rUr2.EZpvd());
                C55326xho.toast$default(c42487rUr2.EZpvd(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                c42487rUr = c42487rUr2;
                abstractC42060rEw = abstractC42060rEw2;
                objectRef2 = objectRef4;
                objectRef = objectRef3;
                abstractC42060rEw.KWHzl(VendorEvent.VENDOR_CANCELLED_BY_USER, c42487rUr.EZpvd());
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                TrackChannel[] trackChannelArr = (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length);
                final AbstractC42060rEw<BINDING, VM> abstractC42060rEw3 = this.this$0;
                C32866mlf.EZpvd("OKCard_Get_JumioSDK_Result", trackChannelArr, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rFd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return BaseKYCFragment$jumioForResultLauncher$1$1.invokeSuspend$lambda$1(objectRef, abstractC42060rEw3, objectRef2, (EventParamsList) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
            c42487rUr = (C42487rUr) objCopydefault;
            objectRef = new Ref.ObjectRef();
            objectRef2 = new Ref.ObjectRef();
            objectRef2.element = "";
            if (!c42487rUr.OLrzqt()) {
                objectRef.element = "success";
                if (c42487rUr.copydefault()) {
                    this.this$0.EZpvd().KWHzl(2);
                }
                if (this.this$0.EZpvd().AEQbTJ().contains(C56443yFo.AEQbTJ(Constant.UploadFileType.LIVE_FACE.getImageTypeVal()))) {
                    PageComponentProfile pageComponentProfileAhwBna = this.this$0.AhwBna();
                    String str = (pageComponentProfileAhwBna == null || (countryOfResidence = pageComponentProfileAhwBna.getCountryOfResidence()) == null) ? "" : countryOfResidence;
                    C43734ruq<rFR> value = this.this$0.fetchVPNInfo().AhwBna().getValue();
                    if (value == null || (rfrKWHzl = value.KWHzl()) == null || (vendorConfig = rfrKWHzl.djBIcL()) == null) {
                        vendorConfig = new VendorConfig((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 1048575, (DefaultConstructorMarker) null);
                    }
                    pUU.KWHzl("qjf", "vendorConfig = " + vendorConfig);
                    AbstractC42074rFj abstractC42074rFjFetchVPNInfo = this.this$0.fetchVPNInfo();
                    String str2 = this.this$0.values;
                    String str3 = this.this$0.fARcdN;
                    HashMap<String, String> map = this.this$0.fIwbmz;
                    String strGEmmrt = this.this$0.EZpvd().gEmmrt();
                    String str4 = strGEmmrt == null ? "" : strGEmmrt;
                    String strKWHzl = this.this$0.EZpvd().KWHzl();
                    abstractC42074rFjFetchVPNInfo.EZpvd(str2, str3, map, str, vendorConfig, str4, strKWHzl == null ? "" : strKWHzl, this.this$0.EZpvd().valueOf(), this.this$0.EZpvd().AhwBna(), this.this$0.AYXKKw(), this.this$0.valueOf(), this.this$0.AhwBna());
                } else {
                    AbstractC42074rFj.navigateToOcrVendor$default(this.this$0.fetchVPNInfo(), this.this$0.values, this.this$0.fARcdN, this.this$0.fIwbmz, null, this.this$0.EZpvd().valueOf(), C56443yFo.AEQbTJ(this.this$0.EZpvd().AhwBna()), this.this$0.EZpvd().gEmmrt(), null, this.this$0.KWHzl().fetchVPNInfo(), this.this$0.KWHzl().AhwBna(), this.this$0.AhwBna(), null, null, 6280, null);
                }
                TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
                TrackChannel[] trackChannelArr2 = (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length);
                final AbstractC42060rEw abstractC42060rEw32 = this.this$0;
                C32866mlf.EZpvd("OKCard_Get_JumioSDK_Result", trackChannelArr2, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rFd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return BaseKYCFragment$jumioForResultLauncher$1$1.invokeSuspend$lambda$1(objectRef, abstractC42060rEw32, objectRef2, (EventParamsList) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
            abstractC42060rEw = this.this$0;
            if (Intrinsics.EZpvd((Object) "G000000", (Object) c42487rUr.AEQbTJ())) {
                objectRef.element = OtpEventTracker.OTP_EVENT_VALUE_CANCEL;
                abstractC42060rEw.KWHzl(VendorEvent.VENDOR_CANCELLED_BY_USER, c42487rUr.EZpvd());
                TrackChannel[] trackChannelArrCopydefault22 = C32868mlh.OLrzqt.copydefault();
                TrackChannel[] trackChannelArr22 = (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault22, trackChannelArrCopydefault22.length);
                final AbstractC42060rEw abstractC42060rEw322 = this.this$0;
                C32866mlf.EZpvd("OKCard_Get_JumioSDK_Result", trackChannelArr22, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rFd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return BaseKYCFragment$jumioForResultLauncher$1$1.invokeSuspend$lambda$1(objectRef, abstractC42060rEw322, objectRef2, (EventParamsList) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
            objectRef.element = EopTrackEvent.KEY_RESULT_FAILED;
            AbstractC42074rFj abstractC42074rFjFetchVPNInfo2 = abstractC42060rEw.fetchVPNInfo();
            String strAYXKKw = abstractC42060rEw.AYXKKw();
            HashMap<String, String> mapValueOf = abstractC42060rEw.valueOf();
            String strGEmmrt2 = abstractC42060rEw.EZpvd().gEmmrt();
            if (strGEmmrt2 == null) {
                strGEmmrt2 = "";
            }
            String strKWHzl2 = abstractC42060rEw.EZpvd().KWHzl();
            String str5 = strKWHzl2 != null ? strKWHzl2 : "";
            String str6 = "{\"classifyCode\":\"" + c42487rUr.AEQbTJ() + "\",\"errorMsg\":\"" + c42487rUr.EZpvd() + "\"}";
            this.L$0 = objectRef;
            this.L$1 = objectRef2;
            this.L$2 = abstractC42060rEw;
            this.L$3 = c42487rUr;
            this.label = 3;
            if (abstractC42074rFjFetchVPNInfo2.EZpvd(strAYXKKw, mapValueOf, strGEmmrt2, str5, str6, this) == objCopydefault2) {
                return objCopydefault2;
            }
            c42487rUr2 = c42487rUr;
            objectRef3 = objectRef;
            objectRef4 = objectRef2;
            abstractC42060rEw2 = abstractC42060rEw;
            objectRef4.element = C33129mqd.gEmmrt(c42487rUr2.EZpvd());
            C55326xho.toast$default(c42487rUr2.EZpvd(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            c42487rUr = c42487rUr2;
            abstractC42060rEw = abstractC42060rEw2;
            objectRef2 = objectRef4;
            objectRef = objectRef3;
            abstractC42060rEw.KWHzl(VendorEvent.VENDOR_CANCELLED_BY_USER, c42487rUr.EZpvd());
            TrackChannel[] trackChannelArrCopydefault222 = C32868mlh.OLrzqt.copydefault();
            TrackChannel[] trackChannelArr222 = (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault222, trackChannelArrCopydefault222.length);
            final AbstractC42060rEw abstractC42060rEw3222 = this.this$0;
            C32866mlf.EZpvd("OKCard_Get_JumioSDK_Result", trackChannelArr222, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rFd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return BaseKYCFragment$jumioForResultLauncher$1$1.invokeSuspend$lambda$1(objectRef, abstractC42060rEw3222, objectRef2, (EventParamsList) obj2);
                }
            });
            return Unit.INSTANCE;
        }
        C56391yDq.AEQbTJ(obj);
        rSF rsf = (rSF) C43251rlk.copydefault(rSF.class);
        FragmentActivity activity2 = this.this$0.getActivity();
        Intrinsics.copydefault(activity2, "");
        Intent data = this.$result.getData();
        this.label = 2;
        objCopydefault = rsf.copydefault((ActivityC42162rIq) activity2, data, this);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        c42487rUr = (C42487rUr) objCopydefault;
        objectRef = new Ref.ObjectRef();
        objectRef2 = new Ref.ObjectRef();
        objectRef2.element = "";
        if (!c42487rUr.OLrzqt()) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit invokeSuspend$lambda$1(Ref.ObjectRef objectRef, AbstractC42060rEw abstractC42060rEw, Ref.ObjectRef objectRef2, EventParamsList eventParamsList) {
        eventParamsList.put("result", (String) objectRef.element, true);
        eventParamsList.put("flow_source", C33129mqd.gEmmrt(abstractC42060rEw.KWHzl().values().getValue()), false);
        eventParamsList.put(EopTrackEvent.KEY_SOURCE_CODE, abstractC42060rEw.fetchVPNInfo().OLrzqt(abstractC42060rEw.valueOf()), false);
        eventParamsList.put(EopTrackEvent.KEY_ERROR_MESSAGE, (String) objectRef2.element, false);
        String strZsXlph = ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph();
        if (strZsXlph == null) {
            strZsXlph = "";
        }
        eventParamsList.put(EopTrackEvent.KEY_COR, strZsXlph, false);
        return Unit.INSTANCE;
    }
}
