package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.account.api.model.account.KycCombineAccountRequest;
import com.okinc.assets.backend.api.WithdrawEntryPoint;
import com.okinc.business.defi.api.bean.SignCheckResponseBean;
import com.okinc.business.defi.api.bean.SignDataResultBean;
import com.okinc.kyc.api.biz.bean.FacialExtParams;
import com.okinc.kyc.api.biz.callback.ExtParams;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.common.Constant;
import com.okinc.ok_kyc_core.data.EopSessionError;
import com.okinc.ok_kyc_core.data.efr.EFRData;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfig;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CheckUKRiskStatusResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FinalConsentReq;
import com.okinc.ok_kyc_core.data.remote.networkmodel.RiskStatus;
import com.okinc.ok_kyc_core.data.travel_rule.InnerSignCheckResponseBean;
import com.okinc.ok_kyc_core.data.travel_rule.InnerSignDataResultBean;
import com.okinc.ok_kyc_core.data.travel_rule.InnerSignRequestBean;
import com.okinc.ok_kyc_core.impl.OKComplianceServiceImpl$analyzeAmaniData$1;
import com.okinc.ok_kyc_core.impl.OKComplianceServiceImpl$analyzeJumioData$1;
import com.okinc.ok_kyc_core.impl.OKComplianceServiceImpl$decryptPdf$1;
import com.okinc.ok_kyc_core.impl.OKComplianceServiceImpl$decryptPdf$2;
import com.okinc.ok_kyc_core.impl.OKComplianceServiceImpl$getJumioMissingPermissions$1;
import com.okinc.ok_kyc_core.impl.OKComplianceServiceImpl$hasJumioAllRequiredPermissions$1;
import com.okinc.ok_kyc_core.impl.OKComplianceServiceImpl$initEFR$1;
import com.okinc.ok_kyc_core.impl.OKComplianceServiceImpl$isPdfEncrypted$1;
import com.okinc.ok_kyc_core.impl.OKComplianceServiceImpl$isPdfEncrypted$2;
import com.okinc.ok_kyc_core.impl.OKComplianceServiceImpl$showPermissionConsent$1;
import com.okinc.ok_kyc_core.impl.OKComplianceServiceImpl$startAliFacialVerification$1;
import com.okinc.ok_kyc_core.impl.OKComplianceServiceImpl$startEFR$1;
import com.okinc.ok_kyc_core.impl.OKComplianceServiceImpl$startLca$1;
import com.okinc.ok_kyc_core.impl.OKComplianceServiceImpl$startOKFace$1;
import com.okinc.ok_kyc_core.impl.OKComplianceServiceImpl$startOKFace$2;
import com.okinc.ok_kyc_core.service.EopImageInfo;
import com.okinc.ok_kyc_core_api.ComplianceTheme;
import com.okinc.ok_kyc_core_api.Playbook;
import com.okinc.ok_kyc_core_api.ResultBackStatus;
import com.okinc.ok_kyc_core_api.amani.AmaniUiModel;
import com.okinc.ok_kyc_core_api.eop.EopResultImageInfo;
import com.okinc.ok_kyc_core_api.eop.EopUiModel;
import com.okinc.ok_kyc_core_api.facial.FacialInfoResult;
import com.okinc.ok_kyc_core_api.model.FeatureRestrictionDialogType;
import com.okinc.ok_kyc_core_api.model.UrlVendorTokenResp;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import o.ActivityC42454rTl;
import o.InterfaceC33171mrS;
import o.InterfaceC42439rSx;
import o.InterfaceC43702ruK;
import o.InterfaceC8104awT;
import o.InterfaceC8224ayh;
import o.rAO;
import o.rTU;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class rCV extends AbstractC43215rlA implements rTU, rSF {
    public static final Activity Companion = new Activity(null);
    public final rDL AEQbTJ;
    public final rDG KWHzl;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RiskStatus.values().length];
            try {
                iArr[RiskStatus.GoToKyc.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RiskStatus.COOLING_PERIOD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[RiskStatus.REDIRECTION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[RiskStatus.VERIFY_CENTER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[RiskStatus.EXIT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[RiskStatus.QUESTION.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[RiskStatus.NORestrict.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[RiskStatus.FINAL_CONSENT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[RiskStatus.NO_DIALOG_QUESTION.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[FeatureRestrictionDialogType.values().length];
            try {
                iArr2[FeatureRestrictionDialogType.REGISTER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[FeatureRestrictionDialogType.LOGIN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            copydefault = iArr2;
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rCV.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @yCM
    public rCV(@NotNull rDG rdg, @NotNull rDL rdl) {
        Intrinsics.checkNotNullParameter(rdg, "");
        Intrinsics.checkNotNullParameter(rdl, "");
        this.KWHzl = rdg;
        this.AEQbTJ = rdl;
    }

    @Override // o.rTU
    public void AEQbTJ(@NotNull android.app.Activity activity, @NotNull Playbook playbook, java.util.HashMap<java.lang.String, java.lang.String> map, ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(playbook, "");
        rTM.KWHzl.copydefault(activity, playbook, (java.util.HashMap<java.lang.String, java.lang.String>) map, (ActivityResultLauncher<android.content.Intent>) ((16 & 8) != 0 ? null : activityResultLauncher), (Function0<Unit>) ((16 & 16) != 0 ? null : null));
    }

    @Override // o.rTU
    public void OLrzqt(@NotNull android.app.Activity activity, @NotNull java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> map, ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        rTM.KWHzl.KWHzl(activity, str, map, (16 & 8) != 0 ? null : activityResultLauncher, (16 & 16) != 0 ? null : null, (16 & 32) != 0 ? null : null);
    }

    @Override // o.rTU
    public void EZpvd(@NotNull android.app.Activity activity, @NotNull java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> map, ActivityResultLauncher<android.content.Intent> activityResultLauncher, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        rTM.KWHzl.KWHzl(activity, str, map, (16 & 8) != 0 ? null : activityResultLauncher, (16 & 16) != 0 ? null : null, (16 & 32) != 0 ? null : function0);
    }

    @Override // o.rTU
    public void EZpvd(@NotNull android.content.Context context, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(context, "");
        if (copydefault(context)) {
            rTM.KWHzl.EZpvd(context);
        } else {
            EZpvd(context);
        }
    }

    @Override // o.rTU
    public void EZpvd(@NotNull android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        if (map != null) {
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(map.get("playbook"));
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt)) {
                java.util.HashMap map2 = new java.util.HashMap();
                for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
                    if (!Intrinsics.EZpvd((java.lang.Object) entry.getKey(), (java.lang.Object) "playbook")) {
                        map2.put(entry.getKey(), C33129mqd.gEmmrt(entry.getValue()));
                    }
                }
                if (copydefault(context)) {
                    rTM.KWHzl.KWHzl(context, strGEmmrt, map2, (16 & 8) != 0 ? null : null, (16 & 16) != 0 ? null : null, (16 & 32) != 0 ? null : null);
                    return;
                } else {
                    EZpvd(context);
                    return;
                }
            }
            EZpvd(context, java.lang.Boolean.FALSE);
            return;
        }
        EZpvd(context, java.lang.Boolean.FALSE);
    }

    @Override // o.rTU
    public void KWHzl(@NotNull android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        if (map != null) {
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(map.get(OtcExtraKeys.SESSIONID));
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt)) {
                rTM.KWHzl.KWHzl(context, strGEmmrt);
            }
        }
    }

    @Override // o.rTU
    public FacialInfoResult EZpvd(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        return (FacialInfoResult) bundle.getParcelable("EXTRA_FACIAL_VERIFICATION_DATA");
    }

    @Override // o.rTU
    public void AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull java.lang.String str, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher, FacialExtParams facialExtParams) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new OKComplianceServiceImpl$startOKFace$1(fragmentActivity, str, activityResultLauncher, facialExtParams, null), 3, null);
    }

    @Override // o.rTU
    public void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, FacialExtParams facialExtParams) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new OKComplianceServiceImpl$startOKFace$2(context, str, facialExtParams, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // o.rSF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull android.content.Context context, LcaSdkLivenessConfig lcaSdkLivenessConfig, java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, FacialExtParams facialExtParams, @NotNull InterfaceC42441rSz interfaceC42441rSz, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKComplianceServiceImpl$startLca$1 oKComplianceServiceImpl$startLca$1;
        LcaSdkLivenessConfig lcaSdkLivenessConfig2;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        InterfaceC42441rSz interfaceC42441rSz2;
        java.lang.String str12;
        FacialExtParams facialExtParams2;
        android.content.Context context2 = context;
        if (continuation instanceof OKComplianceServiceImpl$startLca$1) {
            oKComplianceServiceImpl$startLca$1 = (OKComplianceServiceImpl$startLca$1) continuation;
            int i = oKComplianceServiceImpl$startLca$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKComplianceServiceImpl$startLca$1.label = i - Integer.MIN_VALUE;
            } else {
                oKComplianceServiceImpl$startLca$1 = new OKComplianceServiceImpl$startLca$1(this, continuation);
            }
        }
        java.lang.Object objAYXKKw = oKComplianceServiceImpl$startLca$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKComplianceServiceImpl$startLca$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAYXKKw);
            C42467rTy c42467rTy = C42467rTy.KWHzl;
            oKComplianceServiceImpl$startLca$1.L$0 = context2;
            lcaSdkLivenessConfig2 = lcaSdkLivenessConfig;
            oKComplianceServiceImpl$startLca$1.L$1 = lcaSdkLivenessConfig2;
            str7 = str;
            oKComplianceServiceImpl$startLca$1.L$2 = str7;
            str8 = str2;
            oKComplianceServiceImpl$startLca$1.L$3 = str8;
            str9 = str3;
            oKComplianceServiceImpl$startLca$1.L$4 = str9;
            str10 = str4;
            oKComplianceServiceImpl$startLca$1.L$5 = str10;
            oKComplianceServiceImpl$startLca$1.L$6 = str5;
            str11 = str6;
            oKComplianceServiceImpl$startLca$1.L$7 = str11;
            oKComplianceServiceImpl$startLca$1.L$8 = facialExtParams;
            interfaceC42441rSz2 = interfaceC42441rSz;
            oKComplianceServiceImpl$startLca$1.L$9 = interfaceC42441rSz2;
            oKComplianceServiceImpl$startLca$1.label = 1;
            objAYXKKw = c42467rTy.AYXKKw(context2, oKComplianceServiceImpl$startLca$1);
            if (objAYXKKw == objCopydefault) {
                return objCopydefault;
            }
            str12 = str5;
            facialExtParams2 = facialExtParams;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC42441rSz interfaceC42441rSz3 = (InterfaceC42441rSz) oKComplianceServiceImpl$startLca$1.L$9;
            facialExtParams2 = (FacialExtParams) oKComplianceServiceImpl$startLca$1.L$8;
            java.lang.String str13 = (java.lang.String) oKComplianceServiceImpl$startLca$1.L$7;
            str12 = (java.lang.String) oKComplianceServiceImpl$startLca$1.L$6;
            java.lang.String str14 = (java.lang.String) oKComplianceServiceImpl$startLca$1.L$5;
            java.lang.String str15 = (java.lang.String) oKComplianceServiceImpl$startLca$1.L$4;
            java.lang.String str16 = (java.lang.String) oKComplianceServiceImpl$startLca$1.L$3;
            java.lang.String str17 = (java.lang.String) oKComplianceServiceImpl$startLca$1.L$2;
            LcaSdkLivenessConfig lcaSdkLivenessConfig3 = (LcaSdkLivenessConfig) oKComplianceServiceImpl$startLca$1.L$1;
            android.content.Context context3 = (android.content.Context) oKComplianceServiceImpl$startLca$1.L$0;
            C56391yDq.AEQbTJ(objAYXKKw);
            interfaceC42441rSz2 = interfaceC42441rSz3;
            context2 = context3;
            str11 = str13;
            lcaSdkLivenessConfig2 = lcaSdkLivenessConfig3;
            str10 = str14;
            str7 = str17;
            str9 = str15;
            str8 = str16;
        }
        boolean zBooleanValue = ((java.lang.Boolean) objAYXKKw).booleanValue();
        pUU.KWHzl("qjf", "OKComplianceServiceImpl-launchLca-->loadSuccess=" + zBooleanValue);
        if (zBooleanValue) {
            interfaceC42441rSz2.copydefault();
            ((rSA) C43251rlk.copydefault(rSA.class)).startLca(context2, lcaSdkLivenessConfig2, str7, str8, str9, str10, str12, str11, facialExtParams2, interfaceC42441rSz2);
            pUU.KWHzl("qjf", "OKComplianceServiceImpl-launchLca---->");
        } else {
            interfaceC42441rSz2.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    @Override // o.rTU
    public void EZpvd(@NotNull FragmentActivity fragmentActivity, ActivityResultLauncher<android.content.Intent> activityResultLauncher, int i, @NotNull Function1<? super java.lang.Boolean, Unit> function1, @NotNull Function1<? super java.lang.Integer, Unit> function12, @NotNull Function1<? super java.lang.String, Unit> function13) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        rTU.Application.checkUKRiskStatus$default(this, fragmentActivity, function1, null, java.lang.Integer.valueOf(i), activityResultLauncher, function12, function13, null, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, null);
    }

    @Override // o.rTU
    public void AEQbTJ(@NotNull final FragmentActivity fragmentActivity, @NotNull final Function1<? super java.lang.Boolean, Unit> function1, final boolean z, @NotNull java.lang.String str, @NotNull final Function1<? super ResultBackStatus, Unit> function12, @NotNull final Function1<? super java.lang.String, Unit> function13, final ActivityResultLauncher<android.content.Intent> activityResultLauncher, @NotNull final Function1<? super java.lang.Integer, Unit> function14, java.lang.Boolean bool, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function14, "");
        AbstractC58185ywX<CheckUKRiskStatusResponse> abstractC58185ywXEZpvd = this.AEQbTJ.copydefault(fragmentActivity, bool, num != null ? C33129mqd.gEmmrt(num) : null, true, str).EZpvd(1L);
        final Function1 function15 = new Function1() { // from class: o.rCS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rCV.copydefault(this.KWHzl, z, fragmentActivity, function1, function14, function12, activityResultLauncher, (CheckUKRiskStatusResponse) obj);
            }
        };
        InterfaceC58227yxM<? super CheckUKRiskStatusResponse> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rCU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rCV.getNewProxyInstance(function15, obj);
            }
        };
        final Function1 function16 = new Function1() { // from class: o.rDe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rCV.copydefault(this.AEQbTJ, z, fragmentActivity, function1, function13, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rDu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rCV.uzCIH(function16, obj);
            }
        });
    }

    public static final void getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(rCV rcv, boolean z, FragmentActivity fragmentActivity, Function1 function1, Function1 function12, Function1 function13, ActivityResultLauncher activityResultLauncher, CheckUKRiskStatusResponse checkUKRiskStatusResponse) {
        Intrinsics.copydefault(checkUKRiskStatusResponse);
        rcv.copydefault(java.lang.Boolean.valueOf(z), fragmentActivity, checkUKRiskStatusResponse, function1, function12, function13, activityResultLauncher);
        return Unit.INSTANCE;
    }

    public static final void uzCIH(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(rCV rcv, boolean z, FragmentActivity fragmentActivity, Function1 function1, Function1 function12, java.lang.Throwable th) {
        Intrinsics.copydefault(th);
        rcv.EZpvd(th, java.lang.Boolean.valueOf(z), fragmentActivity, (Function1<? super java.lang.Boolean, Unit>) function1, (Function1<? super java.lang.String, Unit>) function12);
        return Unit.INSTANCE;
    }

    @Override // o.rSF
    public EopUiModel copydefault(@NotNull AppCompatActivity appCompatActivity, android.content.Intent intent) {
        int code;
        java.lang.String message;
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        EopUiModel eopUiModel = new EopUiModel(false, (java.util.ArrayList) null, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, 255, (DefaultConstructorMarker) null);
        java.lang.Boolean boolValueOf = intent != null ? java.lang.Boolean.valueOf(intent.getBooleanExtra("EXTRA_RESULT_SUCCESS", false)) : null;
        eopUiModel.setSuccess(boolValueOf != null ? boolValueOf.booleanValue() : false);
        if (Intrinsics.EZpvd(boolValueOf, java.lang.Boolean.TRUE)) {
            eopUiModel.setEopResultList(new java.util.ArrayList<>());
            java.util.ArrayList<EopImageInfo> parcelableArrayListExtra = intent.getParcelableArrayListExtra("EXTRA_RESULT_IMAGE_LIST");
            if (parcelableArrayListExtra != null) {
                for (EopImageInfo eopImageInfo : parcelableArrayListExtra) {
                    int imageType = eopImageInfo.getImageType();
                    Constant.UploadFileType uploadFileType = Constant.UploadFileType.LIVE_FACE_AWS;
                    if (imageType != uploadFileType.getImageTypeVal()) {
                        eopUiModel.getEopResultList().add(new EopResultImageInfo(eopImageInfo.getImageId(), eopImageInfo.getImageType(), eopImageInfo.getName(), eopImageInfo.getWidth(), eopImageInfo.getHeight()));
                    }
                    if (eopImageInfo.getImageType() == Constant.UploadFileType.LIVE_FACE.getImageTypeVal() || eopImageInfo.getImageType() == uploadFileType.getImageTypeVal()) {
                        eopUiModel.setVerifyType(2);
                    }
                }
            }
            eopUiModel.setVendorType(C33129mqd.gEmmrt(intent.getStringExtra("EXTRA_RESULT_VENDOR_TYPE")));
            eopUiModel.setMrz(C33129mqd.gEmmrt(intent.getStringExtra("EXTRA_NFC_MRZ")));
            java.lang.String stringExtra = intent.getStringExtra("EXTRA_SESSION_ID");
            eopUiModel.setSessionId(stringExtra != null ? stringExtra : "");
        } else {
            if (intent != null) {
                code = intent.getIntExtra("EXTRA_RESULT_CODE", EopSessionError.CANCELLED_BY_USER.getCode());
            } else {
                code = EopSessionError.CANCELLED_BY_USER.getCode();
            }
            eopUiModel.setCode(code);
            if (intent == null || (message = intent.getStringExtra("EXTRA_RESULT_MESSAGE")) == null) {
                message = EopSessionError.CANCELLED_BY_USER.getMessage();
            }
            eopUiModel.setMessage(message);
        }
        return eopUiModel;
    }

    @Override // o.rSF
    public ComplianceTheme copydefault() {
        InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC33171mrS.class));
        if (interfaceC33171mrS != null && interfaceC33171mrS.ejfBZ()) {
            return ComplianceTheme.OKX_LITE;
        }
        return ComplianceTheme.OKX;
    }

    @Override // o.rSF
    public void KWHzl(@NotNull android.content.Context context, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        InterfaceC33172mrT interfaceC33172mrT = (InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class);
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        interfaceC33172mrT.copydefault(context, bundle);
    }

    public void EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        InterfaceC8104awT.StateListAnimator.routeLogin$default((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class), context, null, 2, null);
    }

    @Override // o.rSF
    public android.content.Intent AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class)).EZpvd(context, null, null, null, null);
    }

    @Override // o.rSF
    public void EZpvd(@NotNull android.app.Activity activity, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class)).KWHzl(activity, z, new KycCombineAccountRequest(str, str2));
    }

    public boolean copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return rTQ.OLrzqt.copydefault().values();
    }

    @Override // o.rSF
    public void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        InterfaceC33171mrS.Activity.switchToAppMode$default((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class), context, 2, true, 0, null, null, 48, null);
    }

    @Override // o.rSF
    public void OLrzqt(@NotNull CoroutineScope coroutineScope, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).EZpvd(coroutineScope, function1);
    }

    @Override // o.rSF
    public void copydefault(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        InterfaceC8224ayh.TaskDescription.goToWithdraw$default((InterfaceC8224ayh) C43251rlk.copydefault(InterfaceC8224ayh.class), fragmentActivity, WithdrawEntryPoint.SelectCoin.INSTANCE, null, null, 12, null);
    }

    @Override // o.rSF
    public void KWHzl(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        InterfaceC8224ayh.TaskDescription.goToWithdraw$default((InterfaceC8224ayh) C43251rlk.copydefault(InterfaceC8224ayh.class), fragmentActivity, WithdrawEntryPoint.SelectCoin.INSTANCE, null, null, 12, null);
    }

    @Override // o.rSF
    public void AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, int i, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(C33527myD.KWHzl(C58156yvv.EZpvd(InterfaceC43702ruK.Activity.getInstance$default(InterfaceC43702ruK.Companion, null, null, 3, null).EZpvd(new FinalConsentReq(i)), lifecycleOwner)), (Function1) null, 1, (java.lang.Object) null);
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rDA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rCV.zuBGHE(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.rDy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rCV.copydefault(function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rDx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rCV.AwvSrB(function12, obj);
            }
        });
    }

    public static final void zuBGHE(Function1 function1, java.lang.Object obj) {
        pUU.EZpvd("qjf", "finalConsent data = " + obj);
        function1.invoke(java.lang.Boolean.TRUE);
    }

    public static final void AwvSrB(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Function1 function1, java.lang.Throwable th) {
        pUU.copydefault("qjf", "finalConsent fail msg = " + th.getMessage());
        function1.invoke(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    @Override // o.rSF
    public AbstractC58185ywX<java.lang.Integer> OLrzqt(int i) {
        return ((InterfaceC9856bdV) C43251rlk.copydefault(InterfaceC9856bdV.class)).AEQbTJ(i);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.ok_kyc_core.data.travel_rule.InnerSignCheckResponseBean> */
    @Override // o.rSF
    public AbstractC58185ywX<InnerSignCheckResponseBean> copydefault(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<SignCheckResponseBean> abstractC58185ywXAEQbTJ = ((InterfaceC9856bdV) C43251rlk.copydefault(InterfaceC9856bdV.class)).AEQbTJ(str, i);
        final Function1 function1 = new Function1() { // from class: o.rDz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rCV.EZpvd(this.copydefault, (SignCheckResponseBean) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.rDC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return rCV.AuCTel(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AuCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(rCV rcv, SignCheckResponseBean signCheckResponseBean) {
        Intrinsics.checkNotNullParameter(signCheckResponseBean, "");
        return AbstractC58185ywX.KWHzl(rcv.OLrzqt(signCheckResponseBean));
    }

    public final InnerSignCheckResponseBean OLrzqt(SignCheckResponseBean signCheckResponseBean) {
        if (signCheckResponseBean == null) {
            return null;
        }
        return new InnerSignCheckResponseBean(signCheckResponseBean.getSignErrorCode(), signCheckResponseBean.getWalletId(), AEQbTJ(signCheckResponseBean.getSignDataResultBean()));
    }

    public final InnerSignDataResultBean AEQbTJ(SignDataResultBean signDataResultBean) {
        if (signDataResultBean == null) {
            return null;
        }
        return new InnerSignDataResultBean(signDataResultBean.getSignature(), signDataResultBean.getPublicKey(), signDataResultBean.getFullMessage());
    }

    @Override // o.rSF
    public void KWHzl(@NotNull android.content.Context context, @NotNull InnerSignRequestBean innerSignRequestBean, @NotNull final Function1<? super InnerSignCheckResponseBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(innerSignRequestBean, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ((InterfaceC9856bdV) C43251rlk.copydefault(InterfaceC9856bdV.class)).KWHzl(context, innerSignRequestBean.convertSignRequestBean(), new Function1() { // from class: o.rDf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rCV.copydefault(function1, this, (SignCheckResponseBean) obj);
            }
        });
    }

    public static final Unit copydefault(Function1 function1, rCV rcv, SignCheckResponseBean signCheckResponseBean) {
        function1.invoke(rcv.OLrzqt(signCheckResponseBean));
        return Unit.INSTANCE;
    }

    @Override // o.rSF
    public void AEQbTJ(@NotNull android.content.Context context, @NotNull InnerSignRequestBean innerSignRequestBean, @NotNull final Function1<? super InnerSignCheckResponseBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(innerSignRequestBean, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ((InterfaceC9856bdV) C43251rlk.copydefault(InterfaceC9856bdV.class)).copydefault(context, innerSignRequestBean.convertSignRequestBean(), new Function1() { // from class: o.rDs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rCV.KWHzl(function1, this, (SignCheckResponseBean) obj);
            }
        });
    }

    public static final Unit KWHzl(Function1 function1, rCV rcv, SignCheckResponseBean signCheckResponseBean) {
        function1.invoke(rcv.OLrzqt(signCheckResponseBean));
        return Unit.INSTANCE;
    }

    @Override // o.rSF
    public void copydefault(@NotNull android.content.Context context, @NotNull InnerSignRequestBean innerSignRequestBean, @NotNull final Function1<? super InnerSignCheckResponseBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(innerSignRequestBean, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ((InterfaceC9856bdV) C43251rlk.copydefault(InterfaceC9856bdV.class)).AEQbTJ(context, innerSignRequestBean.convertSignRequestBean(), new Function1() { // from class: o.rDa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rCV.AhwBna(function1, this, (SignCheckResponseBean) obj);
            }
        });
    }

    public static final Unit AhwBna(Function1 function1, rCV rcv, SignCheckResponseBean signCheckResponseBean) {
        function1.invoke(rcv.OLrzqt(signCheckResponseBean));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // o.rSF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull android.app.Activity activity, @NotNull EFRData eFRData, @NotNull InterfaceC42438rSw interfaceC42438rSw, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKComplianceServiceImpl$initEFR$1 oKComplianceServiceImpl$initEFR$1;
        android.app.Activity activity2;
        EFRData eFRData2;
        InterfaceC42438rSw interfaceC42438rSw2;
        if (continuation instanceof OKComplianceServiceImpl$initEFR$1) {
            oKComplianceServiceImpl$initEFR$1 = (OKComplianceServiceImpl$initEFR$1) continuation;
            int i = oKComplianceServiceImpl$initEFR$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKComplianceServiceImpl$initEFR$1.label = i - Integer.MIN_VALUE;
            } else {
                oKComplianceServiceImpl$initEFR$1 = new OKComplianceServiceImpl$initEFR$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = oKComplianceServiceImpl$initEFR$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = oKComplianceServiceImpl$initEFR$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C42467rTy c42467rTy = C42467rTy.KWHzl;
            oKComplianceServiceImpl$initEFR$1.L$0 = activity;
            oKComplianceServiceImpl$initEFR$1.L$1 = eFRData;
            oKComplianceServiceImpl$initEFR$1.L$2 = interfaceC42438rSw;
            oKComplianceServiceImpl$initEFR$1.label = 1;
            objCopydefault = c42467rTy.copydefault(activity, oKComplianceServiceImpl$initEFR$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            activity2 = activity;
            eFRData2 = eFRData;
            interfaceC42438rSw2 = interfaceC42438rSw;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC42438rSw interfaceC42438rSw3 = (InterfaceC42438rSw) oKComplianceServiceImpl$initEFR$1.L$2;
            eFRData2 = (EFRData) oKComplianceServiceImpl$initEFR$1.L$1;
            android.app.Activity activity3 = (android.app.Activity) oKComplianceServiceImpl$initEFR$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            interfaceC42438rSw2 = interfaceC42438rSw3;
            activity2 = activity3;
        }
        boolean zBooleanValue = ((java.lang.Boolean) objCopydefault).booleanValue();
        pUU.KWHzl("kyc_in_house", "initEFR loadSuccess=" + zBooleanValue);
        if (zBooleanValue) {
            InterfaceC42439rSx.StateListAnimator.initSDK$default((InterfaceC42439rSx) C43251rlk.copydefault(InterfaceC42439rSx.class), activity2, eFRData2.getConfigData(), eFRData2.getCode(), eFRData2.getValue(), eFRData2.getExpiry(), interfaceC42438rSw2, 0, 64, null);
        } else {
            interfaceC42438rSw2.copydefault(-1002, "FD_LOAD_ERROR");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.rSF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull android.app.Activity activity, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKComplianceServiceImpl$startEFR$1 oKComplianceServiceImpl$startEFR$1;
        if (continuation instanceof OKComplianceServiceImpl$startEFR$1) {
            oKComplianceServiceImpl$startEFR$1 = (OKComplianceServiceImpl$startEFR$1) continuation;
            int i = oKComplianceServiceImpl$startEFR$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKComplianceServiceImpl$startEFR$1.label = i - Integer.MIN_VALUE;
            } else {
                oKComplianceServiceImpl$startEFR$1 = new OKComplianceServiceImpl$startEFR$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = oKComplianceServiceImpl$startEFR$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = oKComplianceServiceImpl$startEFR$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C42467rTy c42467rTy = C42467rTy.KWHzl;
            oKComplianceServiceImpl$startEFR$1.L$0 = activity;
            oKComplianceServiceImpl$startEFR$1.L$1 = str;
            oKComplianceServiceImpl$startEFR$1.L$2 = str2;
            oKComplianceServiceImpl$startEFR$1.L$3 = activityResultLauncher;
            oKComplianceServiceImpl$startEFR$1.label = 1;
            objCopydefault = c42467rTy.copydefault(activity, oKComplianceServiceImpl$startEFR$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activityResultLauncher = (ActivityResultLauncher) oKComplianceServiceImpl$startEFR$1.L$3;
            str2 = (java.lang.String) oKComplianceServiceImpl$startEFR$1.L$2;
            str = (java.lang.String) oKComplianceServiceImpl$startEFR$1.L$1;
            activity = (android.app.Activity) oKComplianceServiceImpl$startEFR$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        boolean zBooleanValue = ((java.lang.Boolean) objCopydefault).booleanValue();
        pUU.KWHzl("kyc_in_house", "startEFR loadSuccess=" + zBooleanValue);
        if (zBooleanValue) {
            ((InterfaceC42439rSx) C43251rlk.copydefault(InterfaceC42439rSx.class)).OLrzqt(activity, str, str2, activityResultLauncher);
            pUU.KWHzl("kyc_in_house", "startEFR success");
        } else {
            pUU.KWHzl("qjf", "OKComplianceServiceImpl-startEFR-fd_load_error--->");
        }
        return Unit.INSTANCE;
    }

    @Override // o.rTU
    public void EZpvd(@NotNull final FragmentActivity fragmentActivity, @NotNull final Function1<? super java.lang.Boolean, Unit> function1, final java.lang.Boolean bool, java.lang.Integer num, final ActivityResultLauncher<android.content.Intent> activityResultLauncher, @NotNull final Function1<? super java.lang.Integer, Unit> function12, @NotNull final Function1<? super java.lang.String, Unit> function13, @NotNull final Function1<? super ResultBackStatus, Unit> function14) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function14, "");
        if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            return;
        }
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) && (fragmentActivity instanceof AbstractActivityC33041mov)) {
            ((AbstractActivityC33041mov) fragmentActivity).showLoadingAtOnce();
        }
        AbstractC58185ywX<CheckUKRiskStatusResponse> abstractC58185ywXKWHzl = this.AEQbTJ.KWHzl(fragmentActivity, java.lang.Boolean.FALSE, num != null ? C33129mqd.gEmmrt(num) : null);
        final Function1 function15 = new Function1() { // from class: o.rDc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rCV.OLrzqt(this.OLrzqt, bool, fragmentActivity, function1, function12, function14, activityResultLauncher, (CheckUKRiskStatusResponse) obj);
            }
        };
        InterfaceC58227yxM<? super CheckUKRiskStatusResponse> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rDg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rCV.hDKMBd(function15, obj);
            }
        };
        final Function1 function16 = new Function1() { // from class: o.rDd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rCV.OLrzqt(this.EZpvd, bool, fragmentActivity, function1, function13, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rDk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rCV.getFieldNames(function16, obj);
            }
        });
    }

    public static final void hDKMBd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(rCV rcv, java.lang.Boolean bool, FragmentActivity fragmentActivity, Function1 function1, Function1 function12, Function1 function13, ActivityResultLauncher activityResultLauncher, CheckUKRiskStatusResponse checkUKRiskStatusResponse) {
        Intrinsics.copydefault(checkUKRiskStatusResponse);
        rcv.copydefault(bool, fragmentActivity, checkUKRiskStatusResponse, function1, function12, function13, activityResultLauncher);
        return Unit.INSTANCE;
    }

    public static final void getFieldNames(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(rCV rcv, java.lang.Boolean bool, FragmentActivity fragmentActivity, Function1 function1, Function1 function12, java.lang.Throwable th) {
        Intrinsics.copydefault(th);
        rcv.EZpvd(th, bool, fragmentActivity, (Function1<? super java.lang.Boolean, Unit>) function1, (Function1<? super java.lang.String, Unit>) function12);
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.Throwable th, java.lang.Boolean bool, FragmentActivity fragmentActivity, Function1<? super java.lang.Boolean, Unit> function1, Function1<? super java.lang.String, Unit> function12) {
        pUU.copydefault("qjf", "checkUKRiskStatus exception = " + th.getMessage());
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(bool, bool2) && (fragmentActivity instanceof AbstractActivityC33041mov)) {
            ((AbstractActivityC33041mov) fragmentActivity).dismissLoading();
        }
        function1.invoke(bool2);
        function12.invoke(th.getMessage());
    }

    public final void copydefault(java.lang.Boolean bool, FragmentActivity fragmentActivity, CheckUKRiskStatusResponse checkUKRiskStatusResponse, Function1<? super java.lang.Boolean, Unit> function1, Function1<? super java.lang.Integer, Unit> function12, Function1<? super ResultBackStatus, Unit> function13, ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(bool, bool2) && (fragmentActivity instanceof AbstractActivityC33041mov)) {
            ((AbstractActivityC33041mov) fragmentActivity).dismissLoading();
        }
        switch (ActionBar.AEQbTJ[checkUKRiskStatusResponse.getAction().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                function1.invoke(bool2);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putSerializable("EXTRA_ACTION", checkUKRiskStatusResponse.getAction());
                bundle.putParcelable("EXTRA_PAGES", checkUKRiskStatusResponse);
                rAR rarOLrzqt = rAR.Companion.OLrzqt(bundle);
                androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                rarOLrzqt.show(supportFragmentManager);
                rarOLrzqt.EZpvd(new PendingIntent(function12, function13));
                return;
            case 6:
                function1.invoke(bool2);
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putSerializable("EXTRA_ACTION", checkUKRiskStatusResponse.getAction());
                bundle2.putParcelable("EXTRA_PAGES", checkUKRiskStatusResponse);
                rAN ranAEQbTJ = rAN.Companion.AEQbTJ(bundle2);
                androidx.fragment.app.FragmentManager supportFragmentManager2 = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                ranAEQbTJ.show(supportFragmentManager2);
                ranAEQbTJ.AEQbTJ(new Dialog(function12, function13));
                return;
            case 7:
                function1.invoke(java.lang.Boolean.FALSE);
                return;
            case 8:
                function1.invoke(bool2);
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putSerializable("EXTRA_ACTION", checkUKRiskStatusResponse.getAction());
                bundle3.putParcelable("EXTRA_PAGES", checkUKRiskStatusResponse);
                rAN ranAEQbTJ2 = rAN.Companion.AEQbTJ(bundle3);
                androidx.fragment.app.FragmentManager supportFragmentManager3 = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
                ranAEQbTJ2.show(supportFragmentManager3);
                ranAEQbTJ2.AEQbTJ(new FragmentManager(function12, function1));
                return;
            case 9:
                function1.invoke(bool2);
                java.lang.String playbook = checkUKRiskStatusResponse.getPlaybook();
                if (playbook != null) {
                    OLrzqt(fragmentActivity, playbook, checkUKRiskStatusResponse.getPlaybookParams(), activityResultLauncher);
                    return;
                }
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final class PendingIntent implements rAO {
        public final /* synthetic */ Function1<java.lang.Integer, Unit> AEQbTJ;
        public final /* synthetic */ Function1<ResultBackStatus, Unit> KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core_api.ResultBackStatus, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public PendingIntent(Function1<? super java.lang.Integer, Unit> function1, Function1<? super ResultBackStatus, Unit> function12) {
            this.AEQbTJ = function1;
            this.KWHzl = function12;
        }

        @Override // o.rAO
        public void copydefault() {
            rAO.ActionBar.KWHzl(this);
        }

        @Override // o.rAO
        public void KWHzl(int i) {
            pUU.KWHzl("qjf", "onStepperClose--->actionType = " + i);
            this.AEQbTJ.invoke(java.lang.Integer.valueOf(i));
        }

        @Override // o.rAO
        public void copydefault(ResultBackStatus resultBackStatus) {
            this.KWHzl.invoke(resultBackStatus);
        }
    }

    public static final class Dialog implements rAO {
        public final /* synthetic */ Function1<ResultBackStatus, Unit> EZpvd;
        public final /* synthetic */ Function1<java.lang.Integer, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core_api.ResultBackStatus, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Dialog(Function1<? super java.lang.Integer, Unit> function1, Function1<? super ResultBackStatus, Unit> function12) {
            this.copydefault = function1;
            this.EZpvd = function12;
        }

        @Override // o.rAO
        public void copydefault() {
            rAO.ActionBar.KWHzl(this);
        }

        @Override // o.rAO
        public void KWHzl(int i) {
            pUU.KWHzl("qjf", "onStepperClose--->actionType=" + i);
            this.copydefault.invoke(java.lang.Integer.valueOf(i));
        }

        @Override // o.rAO
        public void copydefault(ResultBackStatus resultBackStatus) {
            this.EZpvd.invoke(resultBackStatus);
        }
    }

    public static final class FragmentManager implements rAO {
        public final /* synthetic */ Function1<java.lang.Boolean, Unit> KWHzl;
        public final /* synthetic */ Function1<java.lang.Integer, Unit> copydefault;

        @Override // o.rAO
        public void copydefault(ResultBackStatus resultBackStatus) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public FragmentManager(Function1<? super java.lang.Integer, Unit> function1, Function1<? super java.lang.Boolean, Unit> function12) {
            this.copydefault = function1;
            this.KWHzl = function12;
        }

        @Override // o.rAO
        public void KWHzl(int i) {
            pUU.KWHzl("qjf", "onStepperClose--->actionType=" + i);
            this.copydefault.invoke(java.lang.Integer.valueOf(i));
        }

        @Override // o.rAO
        public void copydefault() {
            pUU.KWHzl("qjf", "onFinalConsentFinish--->");
            this.KWHzl.invoke(java.lang.Boolean.FALSE);
        }
    }

    @Override // o.rTU
    public void EZpvd(@NotNull final FragmentActivity fragmentActivity, @NotNull final Function0<Unit> function0, final java.lang.Boolean bool, @NotNull final Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            return;
        }
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) && (fragmentActivity instanceof AbstractActivityC33041mov)) {
            ((AbstractActivityC33041mov) fragmentActivity).showLoadingAtOnce();
        }
        AbstractC58185ywX<CheckUKRiskStatusResponse> abstractC58185ywXKWHzl = this.AEQbTJ.KWHzl(fragmentActivity, java.lang.Boolean.FALSE, "");
        final Function1 function12 = new Function1() { // from class: o.rCY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rCV.EZpvd(bool, fragmentActivity, function0, function1, (CheckUKRiskStatusResponse) obj);
            }
        };
        InterfaceC58227yxM<? super CheckUKRiskStatusResponse> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rDb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rCV.fARcdN(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.rCX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rCV.OLrzqt(bool, fragmentActivity, function0, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rCZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rCV.fIwbmz(function13, obj);
            }
        });
    }

    public static final void fARcdN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Boolean bool, FragmentActivity fragmentActivity, Function0 function0, Function1 function1, CheckUKRiskStatusResponse checkUKRiskStatusResponse) {
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) && (fragmentActivity instanceof AbstractActivityC33041mov)) {
            ((AbstractActivityC33041mov) fragmentActivity).dismissLoading();
        }
        function0.invoke();
        if (checkUKRiskStatusResponse.getAction() == RiskStatus.FINAL_CONSENT) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putSerializable("EXTRA_ACTION", checkUKRiskStatusResponse.getAction());
            bundle.putParcelable("EXTRA_PAGES", checkUKRiskStatusResponse);
            rAN ranAEQbTJ = rAN.Companion.AEQbTJ(bundle);
            androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            ranAEQbTJ.show(supportFragmentManager);
            ranAEQbTJ.AEQbTJ(new StateListAnimator(function1));
        }
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements rAO {
        public final /* synthetic */ Function1<java.lang.Integer, Unit> KWHzl;

        @Override // o.rAO
        public void copydefault(ResultBackStatus resultBackStatus) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(Function1<? super java.lang.Integer, Unit> function1) {
            this.KWHzl = function1;
        }

        @Override // o.rAO
        public void KWHzl(int i) {
            pUU.KWHzl("qjf", "onStepperClose--->actionType=" + i);
            this.KWHzl.invoke(java.lang.Integer.valueOf(i));
        }

        @Override // o.rAO
        public void copydefault() {
            pUU.KWHzl("qjf", "onFinalConsentFinish--->");
        }
    }

    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Boolean bool, FragmentActivity fragmentActivity, Function0 function0, java.lang.Throwable th) {
        pUU.copydefault("qjf", "checkFinalConsentStatus exception = " + th.getMessage());
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) && (fragmentActivity instanceof AbstractActivityC33041mov)) {
            ((AbstractActivityC33041mov) fragmentActivity).dismissLoading();
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    @Override // o.rTU
    public void EZpvd(@NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super java.lang.Boolean, Unit> function1, java.lang.Boolean bool, @NotNull Function1<? super java.lang.Integer, Unit> function12, @NotNull Function1<? super java.lang.String, Unit> function13, @NotNull Function1<? super ResultBackStatus, Unit> function14) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function14, "");
        EZpvd(fragmentActivity, function1, bool, null, null, function12, function13, function14);
    }

    @Override // o.rTU
    public void OLrzqt(@NotNull final FragmentActivity fragmentActivity, java.lang.Boolean bool, final java.lang.Boolean bool2, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super java.lang.Integer, Unit> function1, @NotNull final Function1<? super ResultBackStatus, Unit> function12) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            return;
        }
        if (Intrinsics.EZpvd(bool2, java.lang.Boolean.TRUE) && (fragmentActivity instanceof AbstractActivityC33041mov)) {
            ((AbstractActivityC33041mov) fragmentActivity).showLoadingAtOnce();
        }
        AbstractC58185ywX<CheckUKRiskStatusResponse> abstractC58185ywXKWHzl = this.AEQbTJ.KWHzl(fragmentActivity, bool, "");
        final Function1 function13 = new Function1() { // from class: o.rDr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rCV.AEQbTJ(bool2, fragmentActivity, function0, this, function1, function12, (CheckUKRiskStatusResponse) obj);
            }
        };
        InterfaceC58227yxM<? super CheckUKRiskStatusResponse> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rDv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rCV.iwGUEr(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.rDt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rCV.AEQbTJ(function0, bool2, fragmentActivity, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rDw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rCV.wlaJM(function14, obj);
            }
        });
    }

    public static final void iwGUEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Boolean bool, FragmentActivity fragmentActivity, Function0 function0, rCV rcv, Function1 function1, Function1 function12, CheckUKRiskStatusResponse checkUKRiskStatusResponse) {
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) && (fragmentActivity instanceof AbstractActivityC33041mov)) {
            ((AbstractActivityC33041mov) fragmentActivity).dismissLoading();
        }
        function0.invoke();
        int i = ActionBar.AEQbTJ[checkUKRiskStatusResponse.getAction().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putSerializable("EXTRA_ACTION", checkUKRiskStatusResponse.getAction());
            bundle.putParcelable("EXTRA_PAGES", checkUKRiskStatusResponse);
            rAR rarOLrzqt = rAR.Companion.OLrzqt(bundle);
            androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            rarOLrzqt.show(supportFragmentManager);
            rarOLrzqt.EZpvd(new TaskDescription(function1, function12));
        } else {
            rcv.EZpvd(fragmentActivity, java.lang.Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription implements rAO {
        public final /* synthetic */ Function1<ResultBackStatus, Unit> OLrzqt;
        public final /* synthetic */ Function1<java.lang.Integer, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core_api.ResultBackStatus, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(Function1<? super java.lang.Integer, Unit> function1, Function1<? super ResultBackStatus, Unit> function12) {
            this.copydefault = function1;
            this.OLrzqt = function12;
        }

        @Override // o.rAO
        public void copydefault() {
            rAO.ActionBar.KWHzl(this);
        }

        @Override // o.rAO
        public void KWHzl(int i) {
            pUU.KWHzl("qjf", "onStepperClose--->actionType = " + i);
            this.copydefault.invoke(java.lang.Integer.valueOf(i));
        }

        @Override // o.rAO
        public void copydefault(ResultBackStatus resultBackStatus) {
            this.OLrzqt.invoke(resultBackStatus);
        }
    }

    public static final void wlaJM(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(Function0 function0, java.lang.Boolean bool, FragmentActivity fragmentActivity, java.lang.Throwable th) {
        pUU.copydefault("qjf", "goToKycOnboarding exception = " + th.getMessage());
        function0.invoke();
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) && (fragmentActivity instanceof AbstractActivityC33041mov)) {
            ((AbstractActivityC33041mov) fragmentActivity).dismissLoading();
        }
        if (th instanceof ResponseFailedException) {
            C55326xho.toast$default(((ResponseFailedException) th).getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.rTU
    public void copydefault(@NotNull final FragmentActivity fragmentActivity, final boolean z, @NotNull final Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2, @NotNull final Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            return;
        }
        if (z && (fragmentActivity instanceof AbstractActivityC33041mov)) {
            ((AbstractActivityC33041mov) fragmentActivity).showLoadingAtOnce();
        }
        AbstractC58185ywX<CheckUKRiskStatusResponse> abstractC58185ywXKWHzl = this.AEQbTJ.KWHzl(fragmentActivity, java.lang.Boolean.FALSE, "");
        final Function1 function12 = new Function1() { // from class: o.rDj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rCV.KWHzl(z, fragmentActivity, function2, function1, this, (CheckUKRiskStatusResponse) obj);
            }
        };
        InterfaceC58227yxM<? super CheckUKRiskStatusResponse> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rDi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rCV.zsXlph(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.rDh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rCV.KWHzl(z, fragmentActivity, function2, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rDm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rCV.AubY(function13, obj);
            }
        });
    }

    public static final void zsXlph(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(boolean z, FragmentActivity fragmentActivity, Function2 function2, Function1 function1, rCV rcv, CheckUKRiskStatusResponse checkUKRiskStatusResponse) {
        if (z && (fragmentActivity instanceof AbstractActivityC33041mov)) {
            ((AbstractActivityC33041mov) fragmentActivity).dismissLoading();
        }
        function2.invoke(java.lang.Boolean.TRUE, "");
        int i = ActionBar.AEQbTJ[checkUKRiskStatusResponse.getAction().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
            function1.invoke(1);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putSerializable("EXTRA_ACTION", checkUKRiskStatusResponse.getAction());
            bundle.putParcelable("EXTRA_PAGES", checkUKRiskStatusResponse);
            rAR rarOLrzqt = rAR.Companion.OLrzqt(bundle);
            androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            rarOLrzqt.show(supportFragmentManager);
            rarOLrzqt.EZpvd(new Application(function1));
        } else {
            function1.invoke(0);
            rcv.EZpvd(fragmentActivity, java.lang.Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    public static final class Application implements rAO {
        public final /* synthetic */ Function1<java.lang.Integer, Unit> OLrzqt;

        @Override // o.rAO
        public void copydefault(ResultBackStatus resultBackStatus) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Function1<? super java.lang.Integer, Unit> function1) {
            this.OLrzqt = function1;
        }

        @Override // o.rAO
        public void copydefault() {
            rAO.ActionBar.KWHzl(this);
        }

        @Override // o.rAO
        public void KWHzl(int i) {
            pUU.KWHzl("qjf", "onStepperClose--->actionType = " + i);
            this.OLrzqt.invoke(2);
        }
    }

    public static final void AubY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(boolean z, FragmentActivity fragmentActivity, Function2 function2, java.lang.Throwable th) {
        java.lang.String message;
        pUU.copydefault("qjf", "gotoKycOnboardingFromLua exception = " + th.getMessage());
        if (z && (fragmentActivity instanceof AbstractActivityC33041mov)) {
            ((AbstractActivityC33041mov) fragmentActivity).dismissLoading();
        }
        if (!(th instanceof ResponseFailedException) || (message = ((ResponseFailedException) th).getMessage()) == null) {
            message = "";
        }
        function2.invoke(java.lang.Boolean.FALSE, message);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.rTU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull android.content.Context context, @NotNull pHD phd, java.lang.Integer num, ExtParams extParams, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKComplianceServiceImpl$startAliFacialVerification$1 oKComplianceServiceImpl$startAliFacialVerification$1;
        if (continuation instanceof OKComplianceServiceImpl$startAliFacialVerification$1) {
            oKComplianceServiceImpl$startAliFacialVerification$1 = (OKComplianceServiceImpl$startAliFacialVerification$1) continuation;
            int i = oKComplianceServiceImpl$startAliFacialVerification$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKComplianceServiceImpl$startAliFacialVerification$1.label = i - Integer.MIN_VALUE;
            } else {
                oKComplianceServiceImpl$startAliFacialVerification$1 = new OKComplianceServiceImpl$startAliFacialVerification$1(this, continuation);
            }
        }
        OKComplianceServiceImpl$startAliFacialVerification$1 oKComplianceServiceImpl$startAliFacialVerification$12 = oKComplianceServiceImpl$startAliFacialVerification$1;
        java.lang.Object objAEQbTJ = oKComplianceServiceImpl$startAliFacialVerification$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKComplianceServiceImpl$startAliFacialVerification$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            C42467rTy c42467rTy = C42467rTy.KWHzl;
            oKComplianceServiceImpl$startAliFacialVerification$12.L$0 = context;
            oKComplianceServiceImpl$startAliFacialVerification$12.L$1 = phd;
            oKComplianceServiceImpl$startAliFacialVerification$12.L$2 = num;
            oKComplianceServiceImpl$startAliFacialVerification$12.L$3 = extParams;
            oKComplianceServiceImpl$startAliFacialVerification$12.label = 1;
            objAEQbTJ = c42467rTy.AEQbTJ(context, oKComplianceServiceImpl$startAliFacialVerification$12);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
                return Unit.INSTANCE;
            }
            extParams = (ExtParams) oKComplianceServiceImpl$startAliFacialVerification$12.L$3;
            num = (java.lang.Integer) oKComplianceServiceImpl$startAliFacialVerification$12.L$2;
            phd = (pHD) oKComplianceServiceImpl$startAliFacialVerification$12.L$1;
            context = (android.content.Context) oKComplianceServiceImpl$startAliFacialVerification$12.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        pHD phd2 = phd;
        java.lang.Integer num2 = num;
        ExtParams extParams2 = extParams;
        if (!((java.lang.Boolean) objAEQbTJ).booleanValue()) {
            return Unit.INSTANCE;
        }
        InterfaceC42440rSy interfaceC42440rSy = (InterfaceC42440rSy) C43251rlk.copydefault(InterfaceC42440rSy.class);
        oKComplianceServiceImpl$startAliFacialVerification$12.L$0 = null;
        oKComplianceServiceImpl$startAliFacialVerification$12.L$1 = null;
        oKComplianceServiceImpl$startAliFacialVerification$12.L$2 = null;
        oKComplianceServiceImpl$startAliFacialVerification$12.L$3 = null;
        oKComplianceServiceImpl$startAliFacialVerification$12.label = 2;
        if (interfaceC42440rSy.OLrzqt(context, phd2, num2, extParams2, oKComplianceServiceImpl$startAliFacialVerification$12) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    @Override // o.rSF
    public java.lang.Object OLrzqt(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, @NotNull Continuation<? super android.content.Intent> continuation) {
        return rTM.KWHzl.AEQbTJ(context, str, str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.rSF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull AppCompatActivity appCompatActivity, android.content.Intent intent, @NotNull Continuation<? super C42487rUr> continuation) throws java.lang.Throwable {
        OKComplianceServiceImpl$analyzeJumioData$1 oKComplianceServiceImpl$analyzeJumioData$1;
        android.content.Intent intent2;
        if (continuation instanceof OKComplianceServiceImpl$analyzeJumioData$1) {
            oKComplianceServiceImpl$analyzeJumioData$1 = (OKComplianceServiceImpl$analyzeJumioData$1) continuation;
            int i = oKComplianceServiceImpl$analyzeJumioData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKComplianceServiceImpl$analyzeJumioData$1.label = i - Integer.MIN_VALUE;
            } else {
                oKComplianceServiceImpl$analyzeJumioData$1 = new OKComplianceServiceImpl$analyzeJumioData$1(this, continuation);
            }
        }
        java.lang.Object objValueOf = oKComplianceServiceImpl$analyzeJumioData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKComplianceServiceImpl$analyzeJumioData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objValueOf);
            C42467rTy c42467rTy = C42467rTy.KWHzl;
            oKComplianceServiceImpl$analyzeJumioData$1.L$0 = intent;
            oKComplianceServiceImpl$analyzeJumioData$1.label = 1;
            objValueOf = c42467rTy.valueOf(appCompatActivity, oKComplianceServiceImpl$analyzeJumioData$1);
            if (objValueOf == objCopydefault) {
                return objCopydefault;
            }
            intent2 = intent;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intent2 = (android.content.Intent) oKComplianceServiceImpl$analyzeJumioData$1.L$0;
            C56391yDq.AEQbTJ(objValueOf);
        }
        if (((java.lang.Boolean) objValueOf).booleanValue()) {
            return ((rSE) C43251rlk.copydefault(rSE.class)).KWHzl(intent2);
        }
        return new C42487rUr(false, false, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.rSF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull AppCompatActivity appCompatActivity, android.content.Intent intent, @NotNull Continuation<? super AmaniUiModel> continuation) throws java.lang.Throwable {
        OKComplianceServiceImpl$analyzeAmaniData$1 oKComplianceServiceImpl$analyzeAmaniData$1;
        if (continuation instanceof OKComplianceServiceImpl$analyzeAmaniData$1) {
            oKComplianceServiceImpl$analyzeAmaniData$1 = (OKComplianceServiceImpl$analyzeAmaniData$1) continuation;
            int i = oKComplianceServiceImpl$analyzeAmaniData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKComplianceServiceImpl$analyzeAmaniData$1.label = i - Integer.MIN_VALUE;
            } else {
                oKComplianceServiceImpl$analyzeAmaniData$1 = new OKComplianceServiceImpl$analyzeAmaniData$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = oKComplianceServiceImpl$analyzeAmaniData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKComplianceServiceImpl$analyzeAmaniData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C42467rTy c42467rTy = C42467rTy.KWHzl;
            oKComplianceServiceImpl$analyzeAmaniData$1.L$0 = intent;
            oKComplianceServiceImpl$analyzeAmaniData$1.label = 1;
            objKWHzl = c42467rTy.KWHzl(appCompatActivity, oKComplianceServiceImpl$analyzeAmaniData$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intent = (android.content.Intent) oKComplianceServiceImpl$analyzeAmaniData$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        if (((java.lang.Boolean) objKWHzl).booleanValue()) {
            return ((InterfaceC42433rSr) C43251rlk.copydefault(InterfaceC42433rSr.class)).EZpvd(intent);
        }
        return new AmaniUiModel(null, null, null, 7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull android.content.Context context, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        OKComplianceServiceImpl$hasJumioAllRequiredPermissions$1 oKComplianceServiceImpl$hasJumioAllRequiredPermissions$1;
        if (continuation instanceof OKComplianceServiceImpl$hasJumioAllRequiredPermissions$1) {
            oKComplianceServiceImpl$hasJumioAllRequiredPermissions$1 = (OKComplianceServiceImpl$hasJumioAllRequiredPermissions$1) continuation;
            int i = oKComplianceServiceImpl$hasJumioAllRequiredPermissions$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKComplianceServiceImpl$hasJumioAllRequiredPermissions$1.label = i - Integer.MIN_VALUE;
            } else {
                oKComplianceServiceImpl$hasJumioAllRequiredPermissions$1 = new OKComplianceServiceImpl$hasJumioAllRequiredPermissions$1(this, continuation);
            }
        }
        java.lang.Object objValueOf = oKComplianceServiceImpl$hasJumioAllRequiredPermissions$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKComplianceServiceImpl$hasJumioAllRequiredPermissions$1.label;
        boolean zCopydefault = false;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objValueOf);
            if (context instanceof AppCompatActivity) {
                C42467rTy c42467rTy = C42467rTy.KWHzl;
                oKComplianceServiceImpl$hasJumioAllRequiredPermissions$1.L$0 = context;
                oKComplianceServiceImpl$hasJumioAllRequiredPermissions$1.label = 1;
                objValueOf = c42467rTy.valueOf(context, oKComplianceServiceImpl$hasJumioAllRequiredPermissions$1);
                if (objValueOf == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                return C56443yFo.KWHzl(false);
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = (android.content.Context) oKComplianceServiceImpl$hasJumioAllRequiredPermissions$1.L$0;
            C56391yDq.AEQbTJ(objValueOf);
        }
        if (((java.lang.Boolean) objValueOf).booleanValue()) {
            zCopydefault = ((rSE) C43251rlk.copydefault(rSE.class)).copydefault(context);
            pUU.KWHzl("qjf", "hasJumioAllRequiredPermissions loadSuccess--hasJumioAllRequiredPermissions=" + zCopydefault);
        }
        return C56443yFo.KWHzl(zCopydefault);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.rSF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull android.content.Context context, @NotNull Continuation<? super java.lang.String[]> continuation) throws java.lang.Throwable {
        OKComplianceServiceImpl$getJumioMissingPermissions$1 oKComplianceServiceImpl$getJumioMissingPermissions$1;
        java.lang.String[] strArrKWHzl;
        if (continuation instanceof OKComplianceServiceImpl$getJumioMissingPermissions$1) {
            oKComplianceServiceImpl$getJumioMissingPermissions$1 = (OKComplianceServiceImpl$getJumioMissingPermissions$1) continuation;
            int i = oKComplianceServiceImpl$getJumioMissingPermissions$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKComplianceServiceImpl$getJumioMissingPermissions$1.label = i - Integer.MIN_VALUE;
            } else {
                oKComplianceServiceImpl$getJumioMissingPermissions$1 = new OKComplianceServiceImpl$getJumioMissingPermissions$1(this, continuation);
            }
        }
        java.lang.Object objValueOf = oKComplianceServiceImpl$getJumioMissingPermissions$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKComplianceServiceImpl$getJumioMissingPermissions$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objValueOf);
            pUU.KWHzl("qjf", "getJumioMissingPermissions-------->");
            strArrKWHzl = new java.lang.String[0];
            if (context instanceof AppCompatActivity) {
                C42467rTy c42467rTy = C42467rTy.KWHzl;
                oKComplianceServiceImpl$getJumioMissingPermissions$1.L$0 = context;
                oKComplianceServiceImpl$getJumioMissingPermissions$1.label = 1;
                objValueOf = c42467rTy.valueOf(context, oKComplianceServiceImpl$getJumioMissingPermissions$1);
                if (objValueOf == objCopydefault) {
                    return objCopydefault;
                }
            }
            pUU.KWHzl("qjf", "getJumioMissingPermissions end--permissionsSize = " + strArrKWHzl.length);
            return strArrKWHzl;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        context = (android.content.Context) oKComplianceServiceImpl$getJumioMissingPermissions$1.L$0;
        C56391yDq.AEQbTJ(objValueOf);
        boolean zBooleanValue = ((java.lang.Boolean) objValueOf).booleanValue();
        pUU.KWHzl("qjf", "getJumioMissingPermissions-->loadSuccess=" + zBooleanValue);
        if (zBooleanValue) {
            strArrKWHzl = ((rSE) C43251rlk.copydefault(rSE.class)).KWHzl(context);
            pUU.KWHzl("qjf", "getJumioMissingPermissions-->jumioMissingPermissions=" + yDV.AwvSrB(strArrKWHzl));
        } else {
            strArrKWHzl = new java.lang.String[0];
        }
        pUU.KWHzl("qjf", "getJumioMissingPermissions end--permissionsSize = " + strArrKWHzl.length);
        return strArrKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.rTU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull android.content.Context context, @NotNull android.net.Uri uri, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        OKComplianceServiceImpl$decryptPdf$1 oKComplianceServiceImpl$decryptPdf$1;
        if (continuation instanceof OKComplianceServiceImpl$decryptPdf$1) {
            oKComplianceServiceImpl$decryptPdf$1 = (OKComplianceServiceImpl$decryptPdf$1) continuation;
            int i = oKComplianceServiceImpl$decryptPdf$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKComplianceServiceImpl$decryptPdf$1.label = i - Integer.MIN_VALUE;
            } else {
                oKComplianceServiceImpl$decryptPdf$1 = new OKComplianceServiceImpl$decryptPdf$1(this, continuation);
            }
        }
        java.lang.Object objDjBIcL = oKComplianceServiceImpl$decryptPdf$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKComplianceServiceImpl$decryptPdf$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objDjBIcL);
            C42467rTy c42467rTy = C42467rTy.KWHzl;
            oKComplianceServiceImpl$decryptPdf$1.L$0 = uri;
            oKComplianceServiceImpl$decryptPdf$1.L$1 = str;
            oKComplianceServiceImpl$decryptPdf$1.L$2 = str2;
            oKComplianceServiceImpl$decryptPdf$1.label = 1;
            objDjBIcL = c42467rTy.djBIcL(context, oKComplianceServiceImpl$decryptPdf$1);
            if (objDjBIcL == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (java.lang.String) oKComplianceServiceImpl$decryptPdf$1.L$2;
            str = (java.lang.String) oKComplianceServiceImpl$decryptPdf$1.L$1;
            uri = (android.net.Uri) oKComplianceServiceImpl$decryptPdf$1.L$0;
            C56391yDq.AEQbTJ(objDjBIcL);
        }
        if (((java.lang.Boolean) objDjBIcL).booleanValue()) {
            return C56443yFo.KWHzl(((rSD) C43251rlk.copydefault(rSD.class)).KWHzl(uri, str, str2));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.rTU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull android.content.Context context, @NotNull android.net.Uri uri, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        OKComplianceServiceImpl$isPdfEncrypted$1 oKComplianceServiceImpl$isPdfEncrypted$1;
        if (continuation instanceof OKComplianceServiceImpl$isPdfEncrypted$1) {
            oKComplianceServiceImpl$isPdfEncrypted$1 = (OKComplianceServiceImpl$isPdfEncrypted$1) continuation;
            int i = oKComplianceServiceImpl$isPdfEncrypted$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKComplianceServiceImpl$isPdfEncrypted$1.label = i - Integer.MIN_VALUE;
            } else {
                oKComplianceServiceImpl$isPdfEncrypted$1 = new OKComplianceServiceImpl$isPdfEncrypted$1(this, continuation);
            }
        }
        java.lang.Object objDjBIcL = oKComplianceServiceImpl$isPdfEncrypted$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKComplianceServiceImpl$isPdfEncrypted$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objDjBIcL);
            C42467rTy c42467rTy = C42467rTy.KWHzl;
            oKComplianceServiceImpl$isPdfEncrypted$1.L$0 = uri;
            oKComplianceServiceImpl$isPdfEncrypted$1.label = 1;
            objDjBIcL = c42467rTy.djBIcL(context, oKComplianceServiceImpl$isPdfEncrypted$1);
            if (objDjBIcL == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uri = (android.net.Uri) oKComplianceServiceImpl$isPdfEncrypted$1.L$0;
            C56391yDq.AEQbTJ(objDjBIcL);
        }
        if (((java.lang.Boolean) objDjBIcL).booleanValue()) {
            return C56443yFo.KWHzl(((rSD) C43251rlk.copydefault(rSD.class)).EZpvd(uri));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.rTU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        OKComplianceServiceImpl$decryptPdf$2 oKComplianceServiceImpl$decryptPdf$2;
        if (continuation instanceof OKComplianceServiceImpl$decryptPdf$2) {
            oKComplianceServiceImpl$decryptPdf$2 = (OKComplianceServiceImpl$decryptPdf$2) continuation;
            int i = oKComplianceServiceImpl$decryptPdf$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKComplianceServiceImpl$decryptPdf$2.label = i - Integer.MIN_VALUE;
            } else {
                oKComplianceServiceImpl$decryptPdf$2 = new OKComplianceServiceImpl$decryptPdf$2(this, continuation);
            }
        }
        java.lang.Object objDjBIcL = oKComplianceServiceImpl$decryptPdf$2.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKComplianceServiceImpl$decryptPdf$2.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objDjBIcL);
            C42467rTy c42467rTy = C42467rTy.KWHzl;
            oKComplianceServiceImpl$decryptPdf$2.L$0 = str;
            oKComplianceServiceImpl$decryptPdf$2.L$1 = str2;
            oKComplianceServiceImpl$decryptPdf$2.L$2 = str3;
            oKComplianceServiceImpl$decryptPdf$2.label = 1;
            objDjBIcL = c42467rTy.djBIcL(context, oKComplianceServiceImpl$decryptPdf$2);
            if (objDjBIcL == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (java.lang.String) oKComplianceServiceImpl$decryptPdf$2.L$2;
            str2 = (java.lang.String) oKComplianceServiceImpl$decryptPdf$2.L$1;
            str = (java.lang.String) oKComplianceServiceImpl$decryptPdf$2.L$0;
            C56391yDq.AEQbTJ(objDjBIcL);
        }
        if (((java.lang.Boolean) objDjBIcL).booleanValue()) {
            return C56443yFo.KWHzl(((rSD) C43251rlk.copydefault(rSD.class)).EZpvd(str, str2, str3));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.rTU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        OKComplianceServiceImpl$isPdfEncrypted$2 oKComplianceServiceImpl$isPdfEncrypted$2;
        if (continuation instanceof OKComplianceServiceImpl$isPdfEncrypted$2) {
            oKComplianceServiceImpl$isPdfEncrypted$2 = (OKComplianceServiceImpl$isPdfEncrypted$2) continuation;
            int i = oKComplianceServiceImpl$isPdfEncrypted$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKComplianceServiceImpl$isPdfEncrypted$2.label = i - Integer.MIN_VALUE;
            } else {
                oKComplianceServiceImpl$isPdfEncrypted$2 = new OKComplianceServiceImpl$isPdfEncrypted$2(this, continuation);
            }
        }
        java.lang.Object objDjBIcL = oKComplianceServiceImpl$isPdfEncrypted$2.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKComplianceServiceImpl$isPdfEncrypted$2.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objDjBIcL);
            C42467rTy c42467rTy = C42467rTy.KWHzl;
            oKComplianceServiceImpl$isPdfEncrypted$2.L$0 = str;
            oKComplianceServiceImpl$isPdfEncrypted$2.label = 1;
            objDjBIcL = c42467rTy.djBIcL(context, oKComplianceServiceImpl$isPdfEncrypted$2);
            if (objDjBIcL == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) oKComplianceServiceImpl$isPdfEncrypted$2.L$0;
            C56391yDq.AEQbTJ(objDjBIcL);
        }
        if (((java.lang.Boolean) objDjBIcL).booleanValue()) {
            return C56443yFo.KWHzl(((rSD) C43251rlk.copydefault(rSD.class)).OLrzqt(str));
        }
        return null;
    }

    @Override // o.rTU
    public void KWHzl(@NotNull java.lang.String str, @NotNull final FragmentActivity fragmentActivity, final ActivityResultLauncher<android.content.Intent> activityResultLauncher, @NotNull final Function1<? super java.lang.String, Unit> function1, final java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            return;
        }
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) && (fragmentActivity instanceof AbstractActivityC33041mov)) {
            ((AbstractActivityC33041mov) fragmentActivity).showLoadingAtOnce();
        }
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(C33527myD.KWHzl(C58156yvv.EZpvd(InterfaceC43702ruK.Activity.getInstance$default(InterfaceC43702ruK.Companion, null, null, 3, null).OLrzqt(str), fragmentActivity)), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function12 = new Function1() { // from class: o.rDq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rCV.KWHzl(bool, fragmentActivity, function1, activityResultLauncher, (UrlVendorTokenResp) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rDp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rCV.AuCTelauCTel(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.rDn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rCV.OLrzqt(bool, fragmentActivity, function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rDo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rCV.zLjUOn(function13, obj);
            }
        });
    }

    public static final void AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Boolean bool, FragmentActivity fragmentActivity, Function1 function1, ActivityResultLauncher activityResultLauncher, UrlVendorTokenResp urlVendorTokenResp) {
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) && (fragmentActivity instanceof AbstractActivityC33041mov)) {
            ((AbstractActivityC33041mov) fragmentActivity).dismissLoading();
        }
        function1.invoke("");
        if (Intrinsics.EZpvd((java.lang.Object) urlVendorTokenResp.getMode(), (java.lang.Object) "url") && C33129mqd.OLrzqt((java.lang.CharSequence) urlVendorTokenResp.getUrl())) {
            ActivityC42454rTl.Application application = ActivityC42454rTl.Companion;
            Intrinsics.copydefault(urlVendorTokenResp);
            application.EZpvd(fragmentActivity, urlVendorTokenResp, activityResultLauncher);
        }
        return Unit.INSTANCE;
    }

    public static final void zLjUOn(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Boolean bool, FragmentActivity fragmentActivity, Function1 function1, java.lang.Throwable th) {
        pUU.copydefault("OKComplianceServiceImpl", "openUrlVendor exception = " + th.getMessage());
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) && (fragmentActivity instanceof AbstractActivityC33041mov)) {
            ((AbstractActivityC33041mov) fragmentActivity).dismissLoading();
        }
        java.lang.String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        function1.invoke(message);
        return Unit.INSTANCE;
    }

    @Override // o.rTU
    public void EZpvd(@NotNull java.lang.String str, @NotNull final FragmentActivity fragmentActivity, @NotNull final Function2<? super java.lang.String, ? super UrlVendorTokenResp, Unit> function2, final java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            return;
        }
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) && (fragmentActivity instanceof AbstractActivityC33041mov)) {
            ((AbstractActivityC33041mov) fragmentActivity).showLoadingAtOnce();
        }
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(C33527myD.KWHzl(C58156yvv.EZpvd(InterfaceC43702ruK.Activity.getInstance$default(InterfaceC43702ruK.Companion, null, null, 3, null).OLrzqt(str), fragmentActivity)), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.rDF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rCV.EZpvd(bool, fragmentActivity, function2, (UrlVendorTokenResp) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rDE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rCV.AxsJAY(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.rDB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rCV.KWHzl(bool, fragmentActivity, function2, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rCW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                rCV.sSMYrx(function12, obj);
            }
        });
    }

    public static final void AxsJAY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Boolean bool, FragmentActivity fragmentActivity, Function2 function2, UrlVendorTokenResp urlVendorTokenResp) {
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) && (fragmentActivity instanceof AbstractActivityC33041mov)) {
            ((AbstractActivityC33041mov) fragmentActivity).dismissLoading();
        }
        if (Intrinsics.EZpvd((java.lang.Object) urlVendorTokenResp.getMode(), (java.lang.Object) "url") && C33129mqd.OLrzqt((java.lang.CharSequence) urlVendorTokenResp.getUrl())) {
            function2.invoke("", urlVendorTokenResp);
            ActivityC42454rTl.Application application = ActivityC42454rTl.Companion;
            Intrinsics.copydefault(urlVendorTokenResp);
            application.EZpvd(fragmentActivity, urlVendorTokenResp);
        } else {
            function2.invoke("", null);
        }
        return Unit.INSTANCE;
    }

    public static final void sSMYrx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Boolean bool, FragmentActivity fragmentActivity, Function2 function2, java.lang.Throwable th) {
        pUU.copydefault("OKComplianceServiceImpl", "openUrlVendor exception = " + th.getMessage());
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) && (fragmentActivity instanceof AbstractActivityC33041mov)) {
            ((AbstractActivityC33041mov) fragmentActivity).dismissLoading();
        }
        java.lang.String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        function2.invoke(message, null);
        return Unit.INSTANCE;
    }

    @Override // o.rTU
    public void EZpvd(@NotNull final FragmentActivity fragmentActivity, @NotNull FeatureRestrictionDialogType featureRestrictionDialogType, final Function1<? super java.lang.Boolean, Unit> function1, final Function0<Unit> function0) {
        OKComplianceRestrictionService.Feature feature;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(featureRestrictionDialogType, "");
        pUU.KWHzl("OKComplianceServiceImpl", "showRegisterOrLoginRestrictionDialog");
        int i = ActionBar.copydefault[featureRestrictionDialogType.ordinal()];
        if (i == 1) {
            feature = OKComplianceRestrictionService.Feature.REGISTER;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            feature = OKComplianceRestrictionService.Feature.LOGIN;
        }
        this.KWHzl.EZpvd(fragmentActivity, feature, new yHO() { // from class: o.rDl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return rCV.EZpvd(function1, fragmentActivity, function0, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Boolean) obj2).booleanValue(), (FeatureRestrictionInfo) obj3);
            }
        });
    }

    public static final Unit EZpvd(Function1 function1, FragmentActivity fragmentActivity, Function0 function0, boolean z, boolean z2, FeatureRestrictionInfo featureRestrictionInfo) {
        if (function1 != null) {
        }
        if (z) {
            rCG.AEQbTJ.KWHzl(fragmentActivity, featureRestrictionInfo, java.lang.Boolean.valueOf(z2), function0);
        }
        return Unit.INSTANCE;
    }

    @Override // o.rTU
    public void AEQbTJ(FragmentActivity fragmentActivity, ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        RxBus.AEQbTJ("event_home_page_created").subscribe(new OKComplianceServiceImpl$showPermissionConsent$1(this, fragmentActivity, activityResultLauncher));
    }
}
