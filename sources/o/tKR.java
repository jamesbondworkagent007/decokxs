package o;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.account.api.model.usercenter.LinkXResult;
import com.okinc.account.api.model.usercenter.UnlinkXInput;
import com.okinc.account.api.model.usercenter.UnlinkXResult;
import com.okinc.account.api.service.UserInfoService;
import com.okinc.planet.biz_userprofile.common.LinkXUtil$isAccountLinkedX$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tKR {
    public static final tKR KWHzl = new tKR();

    private tKR() {
    }

    public final ActivityResultLauncher<Unit> copydefault(@NotNull final FragmentActivity fragmentActivity, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        ActivityResultLauncher<Unit> activityResultLauncherRegisterForActivityResult = fragmentActivity.registerForActivityResult(((UserInfoService) C43251rlk.copydefault(UserInfoService.class)).copydefault(), new ActivityResultCallback() { // from class: o.tKQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                tKR.EZpvd(fragmentActivity, function0, (LinkXResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        return activityResultLauncherRegisterForActivityResult;
    }

    public static final void EZpvd(FragmentActivity fragmentActivity, Function0 function0, LinkXResult linkXResult) {
        if (Intrinsics.EZpvd(linkXResult, LinkXResult.Cancel.INSTANCE)) {
            return;
        }
        if (linkXResult instanceof LinkXResult.Error) {
            KWHzl.EZpvd(fragmentActivity, ((LinkXResult.Error) linkXResult).getMessage());
        } else {
            if (!Intrinsics.EZpvd(linkXResult, LinkXResult.Success.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            function0.invoke();
        }
    }

    public final ActivityResultLauncher<UnlinkXInput> copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull final Function1<? super UnlinkXResult, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ActivityResultLauncher<UnlinkXInput> activityResultLauncherRegisterForActivityResult = fragmentActivity.registerForActivityResult(((UserInfoService) C43251rlk.copydefault(UserInfoService.class)).KWHzl(), new ActivityResultCallback() { // from class: o.tKP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                tKR.KWHzl(function1, (UnlinkXResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        return activityResultLauncherRegisterForActivityResult;
    }

    public static final void KWHzl(Function1 function1, UnlinkXResult unlinkXResult) {
        Intrinsics.copydefault(unlinkXResult);
        function1.invoke(unlinkXResult);
    }

    public final void EZpvd(FragmentActivity fragmentActivity, java.lang.String str) {
        pUU.KWHzl("LinkX error", str == null ? "" : str);
        C46154tJv.Companion.AEQbTJ("link_x_fail", str).show(fragmentActivity.getSupportFragmentManager(), "LinkXFailDialogFragment");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<java.lang.Boolean>> continuation) {
        LinkXUtil$isAccountLinkedX$1 linkXUtil$isAccountLinkedX$1;
        if (continuation instanceof LinkXUtil$isAccountLinkedX$1) {
            linkXUtil$isAccountLinkedX$1 = (LinkXUtil$isAccountLinkedX$1) continuation;
            int i = linkXUtil$isAccountLinkedX$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                linkXUtil$isAccountLinkedX$1.label = i - Integer.MIN_VALUE;
            } else {
                linkXUtil$isAccountLinkedX$1 = new LinkXUtil$isAccountLinkedX$1(this, continuation);
            }
        }
        java.lang.Object obj = linkXUtil$isAccountLinkedX$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = linkXUtil$isAccountLinkedX$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        UserInfoService userInfoService = (UserInfoService) C43251rlk.copydefault(UserInfoService.class);
        linkXUtil$isAccountLinkedX$1.label = 1;
        java.lang.Object objAEQbTJ = userInfoService.AEQbTJ(linkXUtil$isAccountLinkedX$1);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }
}
