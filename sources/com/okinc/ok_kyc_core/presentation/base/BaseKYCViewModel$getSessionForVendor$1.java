package com.okinc.ok_kyc_core.presentation.base;

import androidx.fragment.app.FragmentActivity;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.common.Constant;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CreateSessionIdRequest;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CreateSessionIdResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorTokenResp;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCViewModel$getSessionForVendor$1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC42074rFj;
import o.AbstractC43419rot;
import o.AbstractC43728ruk;
import o.C32866mlf;
import o.C32868mlh;
import o.C33129mqd;
import o.C41978rBv;
import o.C43251rlk;
import o.C43401rob;
import o.C43422row;
import o.C43693ruB;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC43709ruR;
import o.pUU;
import o.rTN;

/* JADX INFO: loaded from: classes10.dex */
public final class BaseKYCViewModel$getSessionForVendor$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ Map<String, String> $ctaValue;
    final /* synthetic */ List<Integer> $featureList;
    final /* synthetic */ String $featureUri;
    final /* synthetic */ String $id;
    final /* synthetic */ Boolean $isLoadingPage;
    final /* synthetic */ Function2<MultiVendorTokenResp, CreateSessionIdResponse, Unit> $openVendorCallBack;
    final /* synthetic */ HashMap<String, String> $params;
    final /* synthetic */ String $playbook;
    final /* synthetic */ String $target;
    final /* synthetic */ Integer $vendorType;
    final /* synthetic */ C52794wYp $view;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ AbstractC42074rFj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorTokenResp, ? super com.okinc.ok_kyc_core.data.remote.networkmodel.CreateSessionIdResponse, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseKYCViewModel$getSessionForVendor$1(AbstractC42074rFj abstractC42074rFj, List<Integer> list, Function2<? super MultiVendorTokenResp, ? super CreateSessionIdResponse, Unit> function2, C52794wYp c52794wYp, FragmentActivity fragmentActivity, String str, Map<String, String> map, String str2, String str3, String str4, HashMap<String, String> map2, Boolean bool, Integer num, Continuation<? super BaseKYCViewModel$getSessionForVendor$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC42074rFj;
        this.$featureList = list;
        this.$openVendorCallBack = function2;
        this.$view = c52794wYp;
        this.$activity = fragmentActivity;
        this.$target = str;
        this.$ctaValue = map;
        this.$playbook = str2;
        this.$featureUri = str3;
        this.$id = str4;
        this.$params = map2;
        this.$isLoadingPage = bool;
        this.$vendorType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseKYCViewModel$getSessionForVendor$1 baseKYCViewModel$getSessionForVendor$1 = new BaseKYCViewModel$getSessionForVendor$1(this.this$0, this.$featureList, this.$openVendorCallBack, this.$view, this.$activity, this.$target, this.$ctaValue, this.$playbook, this.$featureUri, this.$id, this.$params, this.$isLoadingPage, this.$vendorType, continuation);
        baseKYCViewModel$getSessionForVendor$1.L$0 = obj;
        return baseKYCViewModel$getSessionForVendor$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseKYCViewModel$getSessionForVendor$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01dd A[Catch: all -> 0x0225, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0225, blocks: (B:40:0x01b6, B:48:0x01dd), top: B:97:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        AbstractC43728ruk abstractC43728ruk;
        final AbstractC42074rFj abstractC42074rFj;
        FragmentActivity fragmentActivity;
        String str;
        String str2;
        String str3;
        String str4;
        final HashMap<String, String> map;
        String str5;
        String str6;
        String str7;
        String str8;
        MultiVendorTokenResp multiVendorTokenResp;
        Map<String, String> map2;
        String str9;
        Boolean bool;
        String str10;
        AbstractC43728ruk abstractC43728ruk2;
        MultiVendorTokenResp multiVendorTokenResp2;
        C52794wYp c52794wYp;
        String str11;
        AbstractC43728ruk abstractC43728ruk3;
        Map<String, String> map3;
        String str12;
        Boolean bool2;
        Function2<MultiVendorTokenResp, CreateSessionIdResponse, Unit> function2;
        InterfaceC43709ruR interfaceC43709ruRAEQbTJ;
        CreateSessionIdRequest createSessionIdRequest;
        Object objAEQbTJ;
        FragmentActivity fragmentActivity2;
        Map<String, String> map4;
        AbstractC42074rFj abstractC42074rFj2;
        String str13;
        Boolean bool3;
        HashMap<String, String> map5;
        Function2<MultiVendorTokenResp, CreateSessionIdResponse, Unit> function22;
        AbstractC43728ruk abstractC43728ruk4;
        Function2 function23;
        Map<String, String> map6;
        String str14;
        final AbstractC42074rFj abstractC42074rFj3;
        String str15;
        Object obj2;
        String str16;
        Boolean bool4;
        String str17;
        final HashMap<String, String> map7;
        AbstractC43728ruk abstractC43728ruk5;
        String str18;
        ResponseData responseData;
        Object stateListAnimator;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        String str19 = "Error: ";
        String str20 = AbstractC43419rot.TAG;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            C41978rBv c41978rBvKWHzl = this.this$0.DbNXlk().KWHzl();
            this.L$0 = coroutineScope;
            this.label = 1;
            objEZpvd = c41978rBvKWHzl.EZpvd(this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                multiVendorTokenResp = (MultiVendorTokenResp) this.L$12;
                abstractC43728ruk3 = (AbstractC43728ruk) this.L$11;
                bool3 = (Boolean) this.L$10;
                map5 = (HashMap) this.L$9;
                str12 = (String) this.L$8;
                str13 = (String) this.L$7;
                str11 = (String) this.L$6;
                map4 = (Map) this.L$5;
                str = (String) this.L$4;
                fragmentActivity2 = (FragmentActivity) this.L$3;
                c52794wYp = (C52794wYp) this.L$2;
                abstractC42074rFj2 = (AbstractC42074rFj) this.L$1;
                Function2<MultiVendorTokenResp, CreateSessionIdResponse, Unit> function24 = (Function2) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    objAEQbTJ = obj;
                    str4 = ",message=";
                    str6 = "Error: ";
                    str5 = AbstractC43419rot.TAG;
                    function22 = function24;
                    str3 = " ";
                    try {
                        responseData = (ResponseData) objAEQbTJ;
                        if (responseData.getCode() != 0) {
                            try {
                                if (responseData.getData() != null) {
                                    Object data = responseData.getData();
                                    Intrinsics.copydefault(data);
                                    stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    str19 = str6;
                                    try {
                                        sb.append(str19);
                                        sb.append(responseData);
                                        str20 = str5;
                                        try {
                                            pUU.copydefault(str20, sb.toString());
                                            stateListAnimator = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                                        } catch (Throwable th) {
                                            th = th;
                                            multiVendorTokenResp2 = multiVendorTokenResp;
                                            str9 = str20;
                                            bool2 = bool3;
                                            str2 = str13;
                                            abstractC42074rFj = abstractC42074rFj2;
                                            HashMap<String, String> map8 = map5;
                                            function2 = function22;
                                            map = map8;
                                            FragmentActivity fragmentActivity3 = fragmentActivity2;
                                            map3 = map4;
                                            fragmentActivity = fragmentActivity3;
                                            pUU.copydefault(str9, str19 + th);
                                            AbstractC43419rot.ActionBar actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                                            multiVendorTokenResp = multiVendorTokenResp2;
                                            function23 = function2;
                                            map6 = map3;
                                            str14 = str2;
                                            abstractC42074rFj3 = abstractC42074rFj;
                                            fragmentActivity2 = fragmentActivity;
                                            str15 = str12;
                                            obj2 = actionBar;
                                            str16 = str;
                                            bool4 = bool2;
                                            str17 = str11;
                                            map7 = map;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        str20 = str5;
                                    }
                                }
                                function23 = function22;
                                str17 = str11;
                                map6 = map4;
                                map7 = map5;
                                str14 = str13;
                                str15 = str12;
                                obj2 = stateListAnimator;
                                str16 = str;
                                bool4 = bool3;
                                abstractC42074rFj3 = abstractC42074rFj2;
                            } catch (Throwable th3) {
                                th = th3;
                                multiVendorTokenResp2 = multiVendorTokenResp;
                                bool2 = bool3;
                                str2 = str13;
                                abstractC42074rFj = abstractC42074rFj2;
                                str9 = str5;
                                str19 = str6;
                                HashMap<String, String> map82 = map5;
                                function2 = function22;
                                map = map82;
                                FragmentActivity fragmentActivity32 = fragmentActivity2;
                                map3 = map4;
                                fragmentActivity = fragmentActivity32;
                                pUU.copydefault(str9, str19 + th);
                                AbstractC43419rot.ActionBar actionBar2 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                                multiVendorTokenResp = multiVendorTokenResp2;
                                function23 = function2;
                                map6 = map3;
                                str14 = str2;
                                abstractC42074rFj3 = abstractC42074rFj;
                                fragmentActivity2 = fragmentActivity;
                                str15 = str12;
                                obj2 = actionBar2;
                                str16 = str;
                                bool4 = bool2;
                                str17 = str11;
                                map7 = map;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        str20 = str5;
                        str19 = str6;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    str4 = ",message=";
                    function22 = function24;
                    str3 = " ";
                    multiVendorTokenResp2 = multiVendorTokenResp;
                    str9 = str20;
                    bool2 = bool3;
                    str2 = str13;
                    abstractC42074rFj = abstractC42074rFj2;
                    HashMap<String, String> map822 = map5;
                    function2 = function22;
                    map = map822;
                    FragmentActivity fragmentActivity322 = fragmentActivity2;
                    map3 = map4;
                    fragmentActivity = fragmentActivity322;
                    pUU.copydefault(str9, str19 + th);
                    AbstractC43419rot.ActionBar actionBar22 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    multiVendorTokenResp = multiVendorTokenResp2;
                    function23 = function2;
                    map6 = map3;
                    str14 = str2;
                    abstractC42074rFj3 = abstractC42074rFj;
                    fragmentActivity2 = fragmentActivity;
                    str15 = str12;
                    obj2 = actionBar22;
                    str16 = str;
                    bool4 = bool2;
                    str17 = str11;
                    map7 = map;
                    if (!(obj2 instanceof AbstractC43419rot.StateListAnimator)) {
                    }
                    str7 = str18;
                    abstractC43728ruk = abstractC43728ruk5;
                    AbstractC42074rFj abstractC42074rFj4 = this.this$0;
                    String str21 = this.$target;
                    Map<String, String> map9 = this.$ctaValue;
                    String str22 = this.$playbook;
                    String str23 = this.$featureUri;
                    String str24 = this.$id;
                    HashMap<String, String> map10 = this.$params;
                    C52794wYp c52794wYp2 = this.$view;
                    FragmentActivity fragmentActivity4 = this.$activity;
                    Boolean bool5 = this.$isLoadingPage;
                    if (abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription) {
                    }
                    return Unit.INSTANCE;
                }
                if (!(obj2 instanceof AbstractC43419rot.StateListAnimator)) {
                    AbstractC42074rFj.cancelLoading$default(abstractC42074rFj3, c52794wYp, fragmentActivity2, false, 4, null);
                    function23.invoke(multiVendorTokenResp, ((AbstractC43419rot.StateListAnimator) obj2).copydefault());
                    abstractC43728ruk5 = abstractC43728ruk3;
                    str18 = str3;
                    str8 = str4;
                } else if (obj2 instanceof AbstractC43419rot.ActionBar) {
                    String str25 = abstractC42074rFj3.KWHzl;
                    AbstractC43419rot.ActionBar actionBar3 = (AbstractC43419rot.ActionBar) obj2;
                    int code = ((OKServerException) actionBar3.KWHzl()).getCode();
                    String message = ((OKServerException) actionBar3.KWHzl()).getMessage();
                    StringBuilder sb2 = new StringBuilder();
                    abstractC43728ruk5 = abstractC43728ruk3;
                    sb2.append("createSessionId code=");
                    sb2.append(code);
                    str8 = str4;
                    sb2.append(str8);
                    sb2.append(message);
                    str18 = str3;
                    sb2.append(str18);
                    pUU.KWHzl(str25, sb2.toString());
                    final String message2 = ((OKServerException) actionBar3.KWHzl()).getMessage();
                    TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.EZpvd("OKCard_Get_Router_Result", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rFT
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return BaseKYCViewModel$getSessionForVendor$1.invokeSuspend$lambda$5$lambda$4$lambda$3(abstractC42074rFj3, map7, message2, (EventParamsList) obj3);
                        }
                    });
                    abstractC42074rFj3.AEQbTJ(((OKServerException) actionBar3.KWHzl()).getMessage(), str16, (Map<String, String>) map6, str17, str14, str15, (HashMap<String, String>) map7, c52794wYp, fragmentActivity2, bool4);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                str7 = str18;
                abstractC43728ruk = abstractC43728ruk5;
                AbstractC42074rFj abstractC42074rFj42 = this.this$0;
                String str212 = this.$target;
                Map<String, String> map92 = this.$ctaValue;
                String str222 = this.$playbook;
                String str232 = this.$featureUri;
                String str242 = this.$id;
                HashMap<String, String> map102 = this.$params;
                C52794wYp c52794wYp22 = this.$view;
                FragmentActivity fragmentActivity42 = this.$activity;
                Boolean bool52 = this.$isLoadingPage;
                if (abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription) {
                    ResponseFailedException responseFailedException = (ResponseFailedException) ((AbstractC43728ruk.TaskDescription) abstractC43728ruk).OLrzqt();
                    pUU.KWHzl(abstractC42074rFj42.KWHzl, "getSessionError code=" + responseFailedException.getCode() + str8 + responseFailedException.getMessage() + str7);
                    C43693ruB.EZpvd("KYC_Vendor_session_Error", C33129mqd.gEmmrt(responseFailedException.getMessage()));
                    abstractC42074rFj42.AEQbTJ(responseFailedException.getMessage(), str212, (Map<String, String>) map92, str222, str232, str242, (HashMap<String, String>) map102, c52794wYp22, fragmentActivity42, bool52);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
        }
        abstractC43728ruk = (AbstractC43728ruk) objEZpvd;
        List<Integer> list = this.$featureList;
        Function2<MultiVendorTokenResp, CreateSessionIdResponse, Unit> function25 = this.$openVendorCallBack;
        abstractC42074rFj = this.this$0;
        C52794wYp c52794wYp3 = this.$view;
        fragmentActivity = this.$activity;
        str = this.$target;
        Map<String, String> map11 = this.$ctaValue;
        String str26 = this.$playbook;
        str2 = this.$featureUri;
        str3 = " ";
        String str27 = this.$id;
        str4 = ",message=";
        map = this.$params;
        str5 = AbstractC43419rot.TAG;
        Boolean bool6 = this.$isLoadingPage;
        str6 = "Error: ";
        final Integer num = this.$vendorType;
        if (abstractC43728ruk instanceof AbstractC43728ruk.ActionBar) {
            multiVendorTokenResp = (MultiVendorTokenResp) ((AbstractC43728ruk.ActionBar) abstractC43728ruk).KWHzl();
            C32868mlh c32868mlh = C32868mlh.OLrzqt;
            TrackChannel[] trackChannelArrCopydefault2 = c32868mlh.copydefault();
            C32866mlf.EZpvd("KYC_Vendor_GetSession_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rFS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return BaseKYCViewModel$getSessionForVendor$1.invokeSuspend$lambda$5$lambda$4$lambda$0(num, abstractC42074rFj, map, (EventParamsList) obj3);
                }
            });
            Integer vendorType = multiVendorTokenResp.getVendorType();
            int vendorType2 = Constant.VendorType.EOP.getVendorType();
            if (vendorType != null && vendorType.intValue() == vendorType2) {
                final boolean zContains = list.contains(C56443yFo.AEQbTJ(Constant.UploadFileType.LIVE_FACE.getImageTypeVal()));
                TrackChannel[] trackChannelArrCopydefault3 = c32868mlh.copydefault();
                C32866mlf.EZpvd("MultiVendor_SDK_Start_MainFlow", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault3, trackChannelArrCopydefault3.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rFU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj3) {
                        return BaseKYCViewModel$getSessionForVendor$1.invokeSuspend$lambda$5$lambda$4$lambda$1(zContains, abstractC42074rFj, map, (EventParamsList) obj3);
                    }
                });
                if (list.size() == 1 && zContains) {
                    function25.invoke(multiVendorTokenResp, null);
                    abstractC43728ruk4 = abstractC43728ruk;
                    str7 = str3;
                    str8 = str4;
                } else {
                    rTN rtn = rTN.KWHzl;
                    pUU.KWHzl("qjf", "createSessionId->isNfcEnabled = " + rtn.OLrzqt());
                    try {
                        interfaceC43709ruRAEQbTJ = InterfaceC43709ruR.Companion.AEQbTJ(str26, map);
                        createSessionIdRequest = new CreateSessionIdRequest(C33129mqd.gEmmrt(multiVendorTokenResp.getSessionId()), rtn.OLrzqt());
                        this.L$0 = function25;
                        this.L$1 = abstractC42074rFj;
                        this.L$2 = c52794wYp3;
                        this.L$3 = fragmentActivity;
                        this.L$4 = str;
                        this.L$5 = map11;
                        this.L$6 = str26;
                        this.L$7 = str2;
                        str10 = str27;
                        try {
                            this.L$8 = str10;
                            this.L$9 = map;
                            bool = bool6;
                        } catch (Throwable th6) {
                            th = th6;
                            map2 = map11;
                            str9 = str5;
                            str19 = str6;
                            bool = bool6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        map2 = map11;
                        str9 = str5;
                        str19 = str6;
                        bool = bool6;
                        str10 = str27;
                    }
                    try {
                        this.L$10 = bool;
                        map2 = map11;
                        abstractC43728ruk2 = abstractC43728ruk;
                        try {
                            this.L$11 = abstractC43728ruk2;
                            this.L$12 = multiVendorTokenResp;
                            this.label = 2;
                            objAEQbTJ = interfaceC43709ruRAEQbTJ.AEQbTJ(createSessionIdRequest, this);
                        } catch (Throwable th8) {
                            th = th8;
                            str9 = str5;
                            str19 = str6;
                            multiVendorTokenResp2 = multiVendorTokenResp;
                            c52794wYp = c52794wYp3;
                            str11 = str26;
                            abstractC43728ruk3 = abstractC43728ruk2;
                            map3 = map2;
                            str12 = str10;
                            bool2 = bool;
                            function2 = function25;
                            pUU.copydefault(str9, str19 + th);
                            AbstractC43419rot.ActionBar actionBar222 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                            multiVendorTokenResp = multiVendorTokenResp2;
                            function23 = function2;
                            map6 = map3;
                            str14 = str2;
                            abstractC42074rFj3 = abstractC42074rFj;
                            fragmentActivity2 = fragmentActivity;
                            str15 = str12;
                            obj2 = actionBar222;
                            str16 = str;
                            bool4 = bool2;
                            str17 = str11;
                            map7 = map;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        map2 = map11;
                        str9 = str5;
                        str19 = str6;
                        abstractC43728ruk2 = abstractC43728ruk;
                        multiVendorTokenResp2 = multiVendorTokenResp;
                        c52794wYp = c52794wYp3;
                        str11 = str26;
                        abstractC43728ruk3 = abstractC43728ruk2;
                        map3 = map2;
                        str12 = str10;
                        bool2 = bool;
                        function2 = function25;
                        pUU.copydefault(str9, str19 + th);
                        AbstractC43419rot.ActionBar actionBar2222 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                        multiVendorTokenResp = multiVendorTokenResp2;
                        function23 = function2;
                        map6 = map3;
                        str14 = str2;
                        abstractC42074rFj3 = abstractC42074rFj;
                        fragmentActivity2 = fragmentActivity;
                        str15 = str12;
                        obj2 = actionBar2222;
                        str16 = str;
                        bool4 = bool2;
                        str17 = str11;
                        map7 = map;
                        if (!(obj2 instanceof AbstractC43419rot.StateListAnimator)) {
                        }
                        str7 = str18;
                        abstractC43728ruk = abstractC43728ruk5;
                        AbstractC42074rFj abstractC42074rFj422 = this.this$0;
                        String str2122 = this.$target;
                        Map<String, String> map922 = this.$ctaValue;
                        String str2222 = this.$playbook;
                        String str2322 = this.$featureUri;
                        String str2422 = this.$id;
                        HashMap<String, String> map1022 = this.$params;
                        C52794wYp c52794wYp222 = this.$view;
                        FragmentActivity fragmentActivity422 = this.$activity;
                        Boolean bool522 = this.$isLoadingPage;
                        if (abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    c52794wYp = c52794wYp3;
                    str11 = str26;
                    abstractC43728ruk3 = abstractC43728ruk2;
                    fragmentActivity2 = fragmentActivity;
                    map4 = map2;
                    abstractC42074rFj2 = abstractC42074rFj;
                    str13 = str2;
                    bool3 = bool;
                    map5 = map;
                    function22 = function25;
                    str12 = str10;
                    responseData = (ResponseData) objAEQbTJ;
                    if (responseData.getCode() != 0) {
                    }
                    if (!(obj2 instanceof AbstractC43419rot.StateListAnimator)) {
                    }
                    str7 = str18;
                    abstractC43728ruk = abstractC43728ruk5;
                }
            } else {
                str7 = str3;
                str8 = str4;
                abstractC43728ruk4 = abstractC43728ruk;
                AbstractC42074rFj.cancelLoading$default(abstractC42074rFj, c52794wYp3, fragmentActivity, false, 4, null);
                function25.invoke(multiVendorTokenResp, null);
            }
            abstractC43728ruk = abstractC43728ruk4;
        } else {
            str7 = str3;
            str8 = str4;
        }
        AbstractC42074rFj abstractC42074rFj4222 = this.this$0;
        String str21222 = this.$target;
        Map<String, String> map9222 = this.$ctaValue;
        String str22222 = this.$playbook;
        String str23222 = this.$featureUri;
        String str24222 = this.$id;
        HashMap<String, String> map10222 = this.$params;
        C52794wYp c52794wYp2222 = this.$view;
        FragmentActivity fragmentActivity4222 = this.$activity;
        Boolean bool5222 = this.$isLoadingPage;
        if (abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$5$lambda$4$lambda$0(Integer num, AbstractC42074rFj abstractC42074rFj, HashMap map, EventParamsList eventParamsList) {
        eventParamsList.put("type", C33129mqd.gEmmrt(num), false);
        eventParamsList.put("flow_source", C33129mqd.gEmmrt(abstractC42074rFj.getFieldNames().getValue()), false);
        eventParamsList.put(EopTrackEvent.KEY_SOURCE_CODE, abstractC42074rFj.OLrzqt((HashMap<String, String>) map), false);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$5$lambda$4$lambda$1(boolean z, AbstractC42074rFj abstractC42074rFj, HashMap map, EventParamsList eventParamsList) {
        eventParamsList.put("have_face", C33129mqd.gEmmrt(Boolean.valueOf(z)), false);
        eventParamsList.put("flow_source", C33129mqd.gEmmrt(abstractC42074rFj.getFieldNames().getValue()), false);
        eventParamsList.put(EopTrackEvent.KEY_SOURCE_CODE, abstractC42074rFj.OLrzqt((HashMap<String, String>) map), false);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$5$lambda$4$lambda$3(AbstractC42074rFj abstractC42074rFj, HashMap map, String str, EventParamsList eventParamsList) {
        eventParamsList.put("result", EopTrackEvent.KEY_RESULT_FAILED, false);
        eventParamsList.put("flow_source", C33129mqd.gEmmrt(abstractC42074rFj.getFieldNames().getValue()), false);
        eventParamsList.put(EopTrackEvent.KEY_SOURCE_CODE, abstractC42074rFj.OLrzqt((HashMap<String, String>) map), false);
        eventParamsList.put(EopTrackEvent.KEY_ERROR_MESSAGE, C33129mqd.gEmmrt(str), false);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }
}
