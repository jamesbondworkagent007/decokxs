package o;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.fragment.app.FragmentActivity;
import com.okinc.account.api.model.usercenter.EditProfileScenario;
import com.okinc.account.api.model.usercenter.LinkXResult;
import com.okinc.account.api.model.usercenter.UnlinkXInput;
import com.okinc.account.api.model.usercenter.UnlinkXResult;
import com.okinc.account.api.service.UserInfoService;
import com.okinc.okcomponents.feature.okwalletdefi.standalone.mock.external.impl.account.OKXWeb3DependencyException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.scu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44757scu extends AbstractC43215rlA implements UserInfoService {
    public final java.lang.String copydefault = C44757scu.class.getSimpleName();

    @Override // com.okinc.account.api.service.UserInfoService
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull UserInfoService.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        java.lang.String str2 = this.copydefault;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str2));
    }

    @Override // com.okinc.account.api.service.UserInfoService
    public void copydefault(java.lang.String str, java.lang.String str2, @NotNull UserInfoService.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        java.lang.String str3 = this.copydefault;
        Intrinsics.checkNotNullExpressionValue(str3, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str3));
    }

    @Override // com.okinc.account.api.service.UserInfoService
    public ActivityResultContract<Unit, LinkXResult> copydefault() {
        java.lang.String str = this.copydefault;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
        return new StateListAnimator();
    }

    /* JADX INFO: renamed from: o.scu$StateListAnimator */
    public static final class StateListAnimator extends ActivityResultContract<Unit, LinkXResult> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, Unit unit) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(unit, "");
            return new android.content.Intent();
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public LinkXResult parseResult(int i, android.content.Intent intent) {
            return new LinkXResult.Error("Mocked implementation");
        }
    }

    @Override // com.okinc.account.api.service.UserInfoService
    public ActivityResultContract<UnlinkXInput, UnlinkXResult> KWHzl() {
        java.lang.String str = this.copydefault;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
        return new ActionBar();
    }

    /* JADX INFO: renamed from: o.scu$ActionBar */
    public static final class ActionBar extends ActivityResultContract<UnlinkXInput, UnlinkXResult> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, UnlinkXInput unlinkXInput) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(unlinkXInput, "");
            return new android.content.Intent();
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public UnlinkXResult parseResult(int i, android.content.Intent intent) {
            return new UnlinkXResult.Error("Mocked implementation");
        }
    }

    @Override // com.okinc.account.api.service.UserInfoService
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<java.lang.Boolean>> continuation) {
        java.lang.String str = this.copydefault;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
        Result.Application application = Result.Companion;
        java.lang.String str2 = this.copydefault;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return Result.m7377constructorimpl(C56391yDq.EZpvd(new OKXWeb3DependencyException(str2)));
    }

    @Override // com.okinc.account.api.service.UserInfoService
    public void AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull EditProfileScenario editProfileScenario, @NotNull UserInfoService.ActionBar actionBar, @NotNull UserInfoService.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(editProfileScenario, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(activity, "");
        java.lang.String str4 = this.copydefault;
        Intrinsics.checkNotNullExpressionValue(str4, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str4));
    }
}
