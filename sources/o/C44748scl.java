package o;

import androidx.activity.result.contract.ActivityResultContract;
import com.okinc.account.api.model.wallet.BindWalletCheckResult;
import com.okinc.account.api.model.wallet.BindWalletInput;
import com.okinc.account.api.model.wallet.BindWalletPreCheckResult;
import com.okinc.account.api.model.wallet.BindWalletResult;
import com.okinc.account.api.model.wallet.BoundWalletAccountsResult;
import com.okinc.account.api.model.wallet.UnbindWalletResult;
import com.okinc.account.api.model.wallet.WalletAccount;
import com.okinc.okcomponents.feature.okwalletdefi.standalone.mock.external.impl.account.OKXWeb3DependencyException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.scl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44748scl extends AbstractC43215rlA implements InterfaceC8107awW {
    public final java.lang.String KWHzl = C44748scl.class.getSimpleName();

    @Override // o.InterfaceC8107awW
    public boolean OLrzqt() {
        return false;
    }

    @Override // o.InterfaceC8107awW
    public java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Result<BoundWalletAccountsResult>> continuation) {
        java.lang.String str = this.KWHzl;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
        Result.Application application = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception("")));
    }

    @Override // o.InterfaceC8107awW
    public java.lang.Object EZpvd(@NotNull Continuation<? super Result<Unit>> continuation) {
        java.lang.String str = this.KWHzl;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
        Result.Application application = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception("")));
    }

    @Override // o.InterfaceC8107awW
    public java.lang.Object OLrzqt(boolean z, @NotNull Continuation<? super Result<? extends BindWalletPreCheckResult>> continuation) {
        java.lang.String str = this.KWHzl;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
        Result.Application application = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception("")));
    }

    @Override // o.InterfaceC8107awW
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends BindWalletCheckResult>> continuation) {
        java.lang.String str2 = this.KWHzl;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str2));
        Result.Application application = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception("")));
    }

    @Override // o.InterfaceC8107awW
    public ActivityResultContract<BindWalletInput, BindWalletResult> EZpvd() {
        java.lang.String str = this.KWHzl;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
        return new ActionBar();
    }

    /* JADX INFO: renamed from: o.scl$ActionBar */
    public static final class ActionBar extends ActivityResultContract<BindWalletInput, BindWalletResult> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, BindWalletInput bindWalletInput) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(bindWalletInput, "");
            return new android.content.Intent();
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public BindWalletResult parseResult(int i, android.content.Intent intent) {
            return BindWalletResult.Cancel.INSTANCE;
        }
    }

    @Override // o.InterfaceC8107awW
    public ActivityResultContract<WalletAccount, UnbindWalletResult> AEQbTJ() {
        java.lang.String str = this.KWHzl;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
        return new Application();
    }

    /* JADX INFO: renamed from: o.scl$Application */
    public static final class Application extends ActivityResultContract<WalletAccount, UnbindWalletResult> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, WalletAccount walletAccount) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(walletAccount, "");
            return new android.content.Intent();
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public UnbindWalletResult parseResult(int i, android.content.Intent intent) {
            return UnbindWalletResult.Cancel.INSTANCE;
        }
    }

    @Override // o.InterfaceC8107awW
    public ActivityResultContract<BindWalletInput, BindWalletResult> copydefault() {
        java.lang.String str = this.KWHzl;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
        return new Activity();
    }

    /* JADX INFO: renamed from: o.scl$Activity */
    public static final class Activity extends ActivityResultContract<BindWalletInput, BindWalletResult> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, BindWalletInput bindWalletInput) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(bindWalletInput, "");
            return new android.content.Intent();
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public BindWalletResult parseResult(int i, android.content.Intent intent) {
            return BindWalletResult.Cancel.INSTANCE;
        }
    }
}
