package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.okinc.ok_kyc_core.data.amani.AmaniNFCParams;
import com.okinc.ok_kyc_core.data.amani.AmaniVideoCallParams;
import com.okinc.ok_kyc_core.data.eop.VendorConfig;
import com.okinc.ok_kyc_core.util.OKComplianceJumpUtil$getDefaultJumioActivityIntent$1;
import com.okinc.ok_kyc_core.util.OKComplianceJumpUtil$openAmani$1;
import com.okinc.ok_kyc_core.util.OKComplianceJumpUtil$openAmaniNFC$1;
import com.okinc.ok_kyc_core.util.OKComplianceJumpUtil$openAmaniVideoCall$1;
import com.okinc.ok_kyc_core.util.OKComplianceJumpUtil$openEopCard$1;
import com.okinc.ok_kyc_core.util.OKComplianceJumpUtil$openEopFaceVerifyForDeepLink$1;
import com.okinc.ok_kyc_core.util.OKComplianceJumpUtil$openEopLiveness$1;
import com.okinc.ok_kyc_core_api.ComplianceTheme;
import com.okinc.ok_kyc_core_api.Playbook;
import com.okinc.ok_kyc_core_api.model.CompliancePostOnboardingModel;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.ActivityC42162rIq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rTM {
    public static final rTM KWHzl = new rTM();

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ComplianceTheme.values().length];
            try {
                iArr[ComplianceTheme.OKX.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ComplianceTheme.OKX_LITE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    private rTM() {
    }

    public final void EZpvd(@NotNull android.content.Context context, @NotNull LifecycleCoroutineScope lifecycleCoroutineScope, @NotNull java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> map, ActivityResultLauncher<android.content.Intent> activityResultLauncher, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lifecycleCoroutineScope, "");
        Intrinsics.checkNotNullParameter(str, "");
        ActivityC42162rIq.TaskDescription taskDescription = ActivityC42162rIq.Companion;
        taskDescription.AEQbTJ(context, lifecycleCoroutineScope, str, taskDescription.EZpvd(str), map == null ? new java.util.HashMap<>() : map, activityResultLauncher, (128 & 64) != 0 ? null : function0, (128 & 128) != 0 ? null : null);
    }

    public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> map, ActivityResultLauncher<android.content.Intent> activityResultLauncher, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        ActivityC42162rIq.TaskDescription taskDescription = ActivityC42162rIq.Companion;
        java.lang.String strEZpvd = taskDescription.EZpvd(str);
        if (map == null) {
            map = new java.util.HashMap<>();
        }
        taskDescription.copydefault(context, str, strEZpvd, map, activityResultLauncher, function0, function02);
    }

    public final void copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull CompliancePostOnboardingModel compliancePostOnboardingModel) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(compliancePostOnboardingModel, "");
        ActivityC42162rIq.Companion.OLrzqt(fragmentActivity, (58 & 2) != 0 ? null : null, compliancePostOnboardingModel, (58 & 8) != 0 ? new LinkedHashMap() : null, (58 & 16) != 0 ? null : null, (58 & 32) != 0 ? null : null);
    }

    public final void copydefault(@NotNull android.app.Activity activity, @NotNull Playbook playbook, java.util.HashMap<java.lang.String, java.lang.String> map, ActivityResultLauncher<android.content.Intent> activityResultLauncher, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(playbook, "");
        pUU.EZpvd("qjf", "profileAndCollectNew------>");
        ActivityC42162rIq.Companion.copydefault(activity, playbook.getValue(), playbook.getFeatureUri(), (java.util.HashMap<java.lang.String, java.lang.String>) (map == null ? new java.util.HashMap<>() : map), (ActivityResultLauncher<android.content.Intent>) activityResultLauncher, (Function0<Unit>) ((64 & 32) != 0 ? null : function0), (Function0<Unit>) ((64 & 64) != 0 ? null : null));
    }

    public final void EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        ActivityC42162rIq.Companion.EZpvd(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull android.content.Context context, VendorConfig vendorConfig, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.Integer> list, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher, ActivityResultLauncher<android.content.Intent> activityResultLauncher2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKComplianceJumpUtil$openEopCard$1 oKComplianceJumpUtil$openEopCard$1;
        java.lang.String str3;
        java.util.List<java.lang.Integer> list2;
        ActivityResultLauncher<android.content.Intent> activityResultLauncher3;
        ActivityResultLauncher<android.content.Intent> activityResultLauncher4;
        java.lang.String str4;
        VendorConfig vendorConfig2;
        android.content.Context context2 = context;
        if (continuation instanceof OKComplianceJumpUtil$openEopCard$1) {
            oKComplianceJumpUtil$openEopCard$1 = (OKComplianceJumpUtil$openEopCard$1) continuation;
            int i = oKComplianceJumpUtil$openEopCard$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKComplianceJumpUtil$openEopCard$1.label = i - Integer.MIN_VALUE;
            } else {
                oKComplianceJumpUtil$openEopCard$1 = new OKComplianceJumpUtil$openEopCard$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = oKComplianceJumpUtil$openEopCard$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKComplianceJumpUtil$openEopCard$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C42467rTy c42467rTy = C42467rTy.KWHzl;
            oKComplianceJumpUtil$openEopCard$1.L$0 = context2;
            oKComplianceJumpUtil$openEopCard$1.L$1 = vendorConfig;
            str3 = str;
            oKComplianceJumpUtil$openEopCard$1.L$2 = str3;
            oKComplianceJumpUtil$openEopCard$1.L$3 = str2;
            list2 = list;
            oKComplianceJumpUtil$openEopCard$1.L$4 = list2;
            activityResultLauncher3 = activityResultLauncher;
            oKComplianceJumpUtil$openEopCard$1.L$5 = activityResultLauncher3;
            activityResultLauncher4 = activityResultLauncher2;
            oKComplianceJumpUtil$openEopCard$1.L$6 = activityResultLauncher4;
            oKComplianceJumpUtil$openEopCard$1.label = 1;
            objEZpvd = c42467rTy.EZpvd(context, oKComplianceJumpUtil$openEopCard$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            str4 = str2;
            vendorConfig2 = vendorConfig;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ActivityResultLauncher<android.content.Intent> activityResultLauncher5 = (ActivityResultLauncher) oKComplianceJumpUtil$openEopCard$1.L$6;
            ActivityResultLauncher<android.content.Intent> activityResultLauncher6 = (ActivityResultLauncher) oKComplianceJumpUtil$openEopCard$1.L$5;
            java.util.List<java.lang.Integer> list3 = (java.util.List) oKComplianceJumpUtil$openEopCard$1.L$4;
            str4 = (java.lang.String) oKComplianceJumpUtil$openEopCard$1.L$3;
            str3 = (java.lang.String) oKComplianceJumpUtil$openEopCard$1.L$2;
            vendorConfig2 = (VendorConfig) oKComplianceJumpUtil$openEopCard$1.L$1;
            android.content.Context context3 = (android.content.Context) oKComplianceJumpUtil$openEopCard$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            activityResultLauncher4 = activityResultLauncher5;
            context2 = context3;
            activityResultLauncher3 = activityResultLauncher6;
            list2 = list3;
        }
        if (((java.lang.Boolean) objEZpvd).booleanValue()) {
            pUU.KWHzl("qjf", "KycDynamicUtil:before call iniDetectionConfig---------->");
            rSC rsc = (rSC) C43251rlk.OLrzqt(rSC.class);
            if (rsc != null) {
                rsc.KWHzl(null);
            }
            pUU.KWHzl("qjf", "KycDynamicUtil:after call iniDetectionConfig---------->");
            rSC rsc2 = (rSC) C43251rlk.OLrzqt(rSC.class);
            if (rsc2 != null) {
                rsc2.KWHzl(context2, vendorConfig2, str3, str4, list2, activityResultLauncher3, activityResultLauncher4);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull android.app.Activity activity, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKComplianceJumpUtil$openAmani$1 oKComplianceJumpUtil$openAmani$1;
        InterfaceC42433rSr interfaceC42433rSr;
        if (continuation instanceof OKComplianceJumpUtil$openAmani$1) {
            oKComplianceJumpUtil$openAmani$1 = (OKComplianceJumpUtil$openAmani$1) continuation;
            int i = oKComplianceJumpUtil$openAmani$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKComplianceJumpUtil$openAmani$1.label = i - Integer.MIN_VALUE;
            } else {
                oKComplianceJumpUtil$openAmani$1 = new OKComplianceJumpUtil$openAmani$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = oKComplianceJumpUtil$openAmani$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKComplianceJumpUtil$openAmani$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C42467rTy c42467rTy = C42467rTy.KWHzl;
            oKComplianceJumpUtil$openAmani$1.L$0 = activity;
            oKComplianceJumpUtil$openAmani$1.L$1 = activityResultLauncher;
            oKComplianceJumpUtil$openAmani$1.L$2 = str;
            oKComplianceJumpUtil$openAmani$1.L$3 = str2;
            oKComplianceJumpUtil$openAmani$1.label = 1;
            objKWHzl = c42467rTy.KWHzl(activity, oKComplianceJumpUtil$openAmani$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (java.lang.String) oKComplianceJumpUtil$openAmani$1.L$3;
            str = (java.lang.String) oKComplianceJumpUtil$openAmani$1.L$2;
            activityResultLauncher = (ActivityResultLauncher) oKComplianceJumpUtil$openAmani$1.L$1;
            activity = (android.app.Activity) oKComplianceJumpUtil$openAmani$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        if (((java.lang.Boolean) objKWHzl).booleanValue() && (interfaceC42433rSr = (InterfaceC42433rSr) C43251rlk.OLrzqt(InterfaceC42433rSr.class)) != null) {
            interfaceC42433rSr.EZpvd(activity, activityResultLauncher, str, str2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull android.content.Context context, @NotNull AmaniVideoCallParams amaniVideoCallParams, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKComplianceJumpUtil$openAmaniVideoCall$1 oKComplianceJumpUtil$openAmaniVideoCall$1;
        InterfaceC42433rSr interfaceC42433rSr;
        if (continuation instanceof OKComplianceJumpUtil$openAmaniVideoCall$1) {
            oKComplianceJumpUtil$openAmaniVideoCall$1 = (OKComplianceJumpUtil$openAmaniVideoCall$1) continuation;
            int i = oKComplianceJumpUtil$openAmaniVideoCall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKComplianceJumpUtil$openAmaniVideoCall$1.label = i - Integer.MIN_VALUE;
            } else {
                oKComplianceJumpUtil$openAmaniVideoCall$1 = new OKComplianceJumpUtil$openAmaniVideoCall$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = oKComplianceJumpUtil$openAmaniVideoCall$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKComplianceJumpUtil$openAmaniVideoCall$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C42467rTy c42467rTy = C42467rTy.KWHzl;
            oKComplianceJumpUtil$openAmaniVideoCall$1.L$0 = context;
            oKComplianceJumpUtil$openAmaniVideoCall$1.L$1 = amaniVideoCallParams;
            oKComplianceJumpUtil$openAmaniVideoCall$1.L$2 = activityResultLauncher;
            oKComplianceJumpUtil$openAmaniVideoCall$1.label = 1;
            objKWHzl = c42467rTy.KWHzl(context, oKComplianceJumpUtil$openAmaniVideoCall$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activityResultLauncher = (ActivityResultLauncher) oKComplianceJumpUtil$openAmaniVideoCall$1.L$2;
            amaniVideoCallParams = (AmaniVideoCallParams) oKComplianceJumpUtil$openAmaniVideoCall$1.L$1;
            context = (android.content.Context) oKComplianceJumpUtil$openAmaniVideoCall$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        if (((java.lang.Boolean) objKWHzl).booleanValue() && (interfaceC42433rSr = (InterfaceC42433rSr) C43251rlk.OLrzqt(InterfaceC42433rSr.class)) != null) {
            interfaceC42433rSr.copydefault(context, amaniVideoCallParams, activityResultLauncher);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull android.content.Context context, @NotNull AmaniNFCParams amaniNFCParams, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKComplianceJumpUtil$openAmaniNFC$1 oKComplianceJumpUtil$openAmaniNFC$1;
        InterfaceC42433rSr interfaceC42433rSr;
        if (continuation instanceof OKComplianceJumpUtil$openAmaniNFC$1) {
            oKComplianceJumpUtil$openAmaniNFC$1 = (OKComplianceJumpUtil$openAmaniNFC$1) continuation;
            int i = oKComplianceJumpUtil$openAmaniNFC$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKComplianceJumpUtil$openAmaniNFC$1.label = i - Integer.MIN_VALUE;
            } else {
                oKComplianceJumpUtil$openAmaniNFC$1 = new OKComplianceJumpUtil$openAmaniNFC$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = oKComplianceJumpUtil$openAmaniNFC$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKComplianceJumpUtil$openAmaniNFC$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C42467rTy c42467rTy = C42467rTy.KWHzl;
            oKComplianceJumpUtil$openAmaniNFC$1.L$0 = context;
            oKComplianceJumpUtil$openAmaniNFC$1.L$1 = amaniNFCParams;
            oKComplianceJumpUtil$openAmaniNFC$1.L$2 = activityResultLauncher;
            oKComplianceJumpUtil$openAmaniNFC$1.label = 1;
            objKWHzl = c42467rTy.KWHzl(context, oKComplianceJumpUtil$openAmaniNFC$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activityResultLauncher = (ActivityResultLauncher) oKComplianceJumpUtil$openAmaniNFC$1.L$2;
            amaniNFCParams = (AmaniNFCParams) oKComplianceJumpUtil$openAmaniNFC$1.L$1;
            context = (android.content.Context) oKComplianceJumpUtil$openAmaniNFC$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        if (((java.lang.Boolean) objKWHzl).booleanValue() && (interfaceC42433rSr = (InterfaceC42433rSr) C43251rlk.OLrzqt(InterfaceC42433rSr.class)) != null) {
            interfaceC42433rSr.EZpvd(context, amaniNFCParams, activityResultLauncher);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull android.content.Context context, @NotNull VendorConfig vendorConfig, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKComplianceJumpUtil$openEopLiveness$1 oKComplianceJumpUtil$openEopLiveness$1;
        rSB rsb;
        if (continuation instanceof OKComplianceJumpUtil$openEopLiveness$1) {
            oKComplianceJumpUtil$openEopLiveness$1 = (OKComplianceJumpUtil$openEopLiveness$1) continuation;
            int i = oKComplianceJumpUtil$openEopLiveness$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKComplianceJumpUtil$openEopLiveness$1.label = i - Integer.MIN_VALUE;
            } else {
                oKComplianceJumpUtil$openEopLiveness$1 = new OKComplianceJumpUtil$openEopLiveness$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = oKComplianceJumpUtil$openEopLiveness$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKComplianceJumpUtil$openEopLiveness$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            C42467rTy c42467rTy = C42467rTy.KWHzl;
            oKComplianceJumpUtil$openEopLiveness$1.L$0 = context;
            oKComplianceJumpUtil$openEopLiveness$1.L$1 = vendorConfig;
            oKComplianceJumpUtil$openEopLiveness$1.L$2 = str;
            oKComplianceJumpUtil$openEopLiveness$1.L$3 = str2;
            oKComplianceJumpUtil$openEopLiveness$1.L$4 = activityResultLauncher;
            oKComplianceJumpUtil$openEopLiveness$1.label = 1;
            objOLrzqt = c42467rTy.OLrzqt(context, oKComplianceJumpUtil$openEopLiveness$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activityResultLauncher = (ActivityResultLauncher) oKComplianceJumpUtil$openEopLiveness$1.L$4;
            str2 = (java.lang.String) oKComplianceJumpUtil$openEopLiveness$1.L$3;
            str = (java.lang.String) oKComplianceJumpUtil$openEopLiveness$1.L$2;
            vendorConfig = (VendorConfig) oKComplianceJumpUtil$openEopLiveness$1.L$1;
            context = (android.content.Context) oKComplianceJumpUtil$openEopLiveness$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        android.content.Context context2 = context;
        VendorConfig vendorConfig2 = vendorConfig;
        java.lang.String str3 = str;
        java.lang.String str4 = str2;
        ActivityResultLauncher<android.content.Intent> activityResultLauncher2 = activityResultLauncher;
        if (((java.lang.Boolean) objOLrzqt).booleanValue() && (rsb = (rSB) C43251rlk.OLrzqt(rSB.class)) != null) {
            rsb.EZpvd(context2, vendorConfig2, str3, str4, activityResultLauncher2);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new OKComplianceJumpUtil$openEopFaceVerifyForDeepLink$1(context, str, null), 3, null);
    }

    public final void EZpvd(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        rSF rsf = (rSF) C43251rlk.copydefault(rSF.class);
        int i = ActionBar.copydefault[rsf.copydefault().ordinal()];
        if (i == 1) {
            rsf.KWHzl(fragmentActivity);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            rsf.copydefault(fragmentActivity);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, @NotNull Continuation<? super android.content.Intent> continuation) throws java.lang.Throwable {
        OKComplianceJumpUtil$getDefaultJumioActivityIntent$1 oKComplianceJumpUtil$getDefaultJumioActivityIntent$1;
        if (continuation instanceof OKComplianceJumpUtil$getDefaultJumioActivityIntent$1) {
            oKComplianceJumpUtil$getDefaultJumioActivityIntent$1 = (OKComplianceJumpUtil$getDefaultJumioActivityIntent$1) continuation;
            int i = oKComplianceJumpUtil$getDefaultJumioActivityIntent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKComplianceJumpUtil$getDefaultJumioActivityIntent$1.label = i - Integer.MIN_VALUE;
            } else {
                oKComplianceJumpUtil$getDefaultJumioActivityIntent$1 = new OKComplianceJumpUtil$getDefaultJumioActivityIntent$1(this, continuation);
            }
        }
        java.lang.Object objValueOf = oKComplianceJumpUtil$getDefaultJumioActivityIntent$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKComplianceJumpUtil$getDefaultJumioActivityIntent$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objValueOf);
            if (context instanceof AppCompatActivity) {
                pUU.KWHzl("qjf", "getDefaultJumioActivityIntent---->");
                C42467rTy c42467rTy = C42467rTy.KWHzl;
                oKComplianceJumpUtil$getDefaultJumioActivityIntent$1.L$0 = context;
                oKComplianceJumpUtil$getDefaultJumioActivityIntent$1.L$1 = str;
                oKComplianceJumpUtil$getDefaultJumioActivityIntent$1.L$2 = str2;
                oKComplianceJumpUtil$getDefaultJumioActivityIntent$1.label = 1;
                objValueOf = c42467rTy.valueOf(context, oKComplianceJumpUtil$getDefaultJumioActivityIntent$1);
                if (objValueOf == objCopydefault) {
                    return objCopydefault;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = (java.lang.String) oKComplianceJumpUtil$getDefaultJumioActivityIntent$1.L$2;
        str = (java.lang.String) oKComplianceJumpUtil$getDefaultJumioActivityIntent$1.L$1;
        context = (android.content.Context) oKComplianceJumpUtil$getDefaultJumioActivityIntent$1.L$0;
        C56391yDq.AEQbTJ(objValueOf);
        if (((java.lang.Boolean) objValueOf).booleanValue()) {
            return ((rSE) C43251rlk.copydefault(rSE.class)).KWHzl(context, str, str2);
        }
        return null;
    }
}
