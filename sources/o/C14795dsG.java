package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.dapp.bridge.KtHelper$registerCedefiHashStatus$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dsG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C14795dsG {
    public static final C14795dsG AEQbTJ = new C14795dsG();

    private C14795dsG() {
    }

    public final void EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super C9767bbm, Unit> function1) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new KtHelper$registerCedefiHashStatus$1(function1, null), 3, null);
    }
}
