package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kjB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28879kjB {
    public static final void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        C55097xdX c55097xdX = new C55097xdX(context, null, 0, 4, null);
        c55097xdX.setState(2);
        c55097xdX.setCloseBtnShow(true);
        c55097xdX.setMessage(str);
        c55097xdX.setOnCloseCallback(new Function0() { // from class: o.kjC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28879kjB.KWHzl();
            }
        });
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
    }

    public static final Unit KWHzl() {
        C57656ymY.OLrzqt.AhwBna();
        return Unit.INSTANCE;
    }
}
