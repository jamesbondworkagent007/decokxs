package o;

import androidx.activity.result.contract.ActivityResultContract;
import com.okinc.okcomponents.feature.okwalletdefi.standalone.mock.external.impl.account.OKXWeb3DependencyException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.scp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44752scp extends AbstractC43215rlA implements InterfaceC8106awV {
    public final java.lang.String KWHzl = C44752scp.class.getSimpleName();

    @Override // o.InterfaceC8106awV
    public void OLrzqt(@NotNull android.content.Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String str = this.KWHzl;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
    }

    @Override // o.InterfaceC8106awV
    public ActivityResultContract<android.content.Context, java.lang.Boolean> OLrzqt(boolean z) {
        java.lang.String str = this.KWHzl;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
        return new StateListAnimator();
    }

    /* JADX INFO: renamed from: o.scp$StateListAnimator */
    public static final class StateListAnimator extends ActivityResultContract<android.content.Context, java.lang.Boolean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean parseResult(int i, android.content.Intent intent) {
            return java.lang.Boolean.FALSE;
        }

        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, android.content.Context context2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(context2, "");
            return new android.content.Intent();
        }
    }
}
