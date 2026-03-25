package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.okcomponents.feature.okwalletdefi.standalone.mock.external.impl.account.OKXWeb3DependencyException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.scs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44755scs extends AbstractC43215rlA implements InterfaceC8109awY {
    public final java.lang.String copydefault = C44755scs.class.getSimpleName();

    @Override // o.InterfaceC8109awY
    public void OLrzqt(@NotNull android.content.Context context, @NotNull LifecycleOwner lifecycleOwner, java.lang.String str, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        java.lang.String str2 = this.copydefault;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str2));
    }
}
