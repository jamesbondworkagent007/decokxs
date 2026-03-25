package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.kyc.api.biz.bean.FacialExtParams;
import com.okinc.ok_kyc_core.data.efr.EFRData;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfig;
import com.okinc.ok_kyc_core.data.travel_rule.InnerSignCheckResponseBean;
import com.okinc.ok_kyc_core.data.travel_rule.InnerSignRequestBean;
import com.okinc.ok_kyc_core_api.ComplianceTheme;
import com.okinc.ok_kyc_core_api.amani.AmaniUiModel;
import com.okinc.ok_kyc_core_api.eop.EopUiModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface rSF extends InterfaceC43217rlC {
    android.content.Intent AEQbTJ(@NotNull android.content.Context context);

    java.lang.Object AEQbTJ(@NotNull android.app.Activity activity, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object AEQbTJ(@NotNull android.content.Context context, @NotNull Continuation<? super java.lang.String[]> continuation);

    java.lang.Object AEQbTJ(@NotNull AppCompatActivity appCompatActivity, android.content.Intent intent, @NotNull Continuation<? super AmaniUiModel> continuation);

    void AEQbTJ(@NotNull android.content.Context context, @NotNull InnerSignRequestBean innerSignRequestBean, @NotNull Function1<? super InnerSignCheckResponseBean, Unit> function1);

    void AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, int i, @NotNull Function1<? super java.lang.Boolean, Unit> function1);

    void EZpvd(@NotNull android.app.Activity activity, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2);

    java.lang.Object KWHzl(@NotNull android.content.Context context, LcaSdkLivenessConfig lcaSdkLivenessConfig, java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, FacialExtParams facialExtParams, @NotNull InterfaceC42441rSz interfaceC42441rSz, @NotNull Continuation<? super Unit> continuation);

    void KWHzl(@NotNull android.content.Context context);

    void KWHzl(@NotNull android.content.Context context, android.os.Bundle bundle);

    void KWHzl(@NotNull android.content.Context context, @NotNull InnerSignRequestBean innerSignRequestBean, @NotNull Function1<? super InnerSignCheckResponseBean, Unit> function1);

    void KWHzl(@NotNull FragmentActivity fragmentActivity);

    java.lang.Object OLrzqt(@NotNull android.app.Activity activity, @NotNull EFRData eFRData, @NotNull InterfaceC42438rSw interfaceC42438rSw, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object OLrzqt(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, @NotNull Continuation<? super android.content.Intent> continuation);

    AbstractC58185ywX<java.lang.Integer> OLrzqt(int i);

    void OLrzqt(@NotNull CoroutineScope coroutineScope, Function1<? super java.lang.Boolean, Unit> function1);

    ComplianceTheme copydefault();

    EopUiModel copydefault(@NotNull AppCompatActivity appCompatActivity, android.content.Intent intent);

    java.lang.Object copydefault(@NotNull AppCompatActivity appCompatActivity, android.content.Intent intent, @NotNull Continuation<? super C42487rUr> continuation);

    AbstractC58185ywX<InnerSignCheckResponseBean> copydefault(@NotNull java.lang.String str, int i);

    void copydefault(@NotNull android.content.Context context, @NotNull InnerSignRequestBean innerSignRequestBean, @NotNull Function1<? super InnerSignCheckResponseBean, Unit> function1);

    void copydefault(@NotNull FragmentActivity fragmentActivity);

    public static final class Application {
        public static /* synthetic */ void gotoMain$default(rSF rsf, android.content.Context context, android.os.Bundle bundle, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoMain");
            }
            if ((i & 2) != 0) {
                bundle = null;
            }
            rsf.KWHzl(context, bundle);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rSF */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void refreshFeatureRestrictionRepository$default(rSF rsf, CoroutineScope coroutineScope, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshFeatureRestrictionRepository");
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            rsf.OLrzqt(coroutineScope, function1);
        }

        public static /* synthetic */ void postFinalConsent$default(rSF rsf, LifecycleOwner lifecycleOwner, int i, Function1 function1, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postFinalConsent");
            }
            if ((i2 & 2) != 0) {
                i = 2;
            }
            rsf.AEQbTJ(lifecycleOwner, i, (Function1<? super java.lang.Boolean, Unit>) function1);
        }
    }
}
