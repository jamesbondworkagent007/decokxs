package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.veu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51010veu {
    public static final C51010veu OLrzqt = new C51010veu();

    private C51010veu() {
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (C55697xoo.OLrzqt.isConnected()) {
            function0.invoke();
            return;
        }
        InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
        if (interfaceC8104awT != null) {
            InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, context, null, 2, null);
        }
    }
}
