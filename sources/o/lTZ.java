package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lTZ {
    public static final lTZ KWHzl = new lTZ();

    private lTZ() {
    }

    public static /* synthetic */ void showNotification$default(lTZ ltz, android.content.Context context, int i, int i2, boolean z, long j, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 2;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i3 & 16) != 0) {
            j = 3000;
        }
        ltz.OLrzqt(context, i, i4, z2, j);
    }

    public final void OLrzqt(@NotNull android.content.Context context, int i, int i2, boolean z, long j) {
        Intrinsics.checkNotNullParameter(context, "");
        C55097xdX c55097xdX = new C55097xdX(context, null, 0, 6, null);
        c55097xdX.setState(i2);
        c55097xdX.setTitle(C33070mpX.AYXKKw(i));
        c55097xdX.setCloseBtnShow(z);
        c55097xdX.setOnCloseCallback(new Function0() { // from class: o.lUc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return lTZ.KWHzl();
            }
        });
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, j, 48, 0, 0, 24, null);
    }

    public static final Unit KWHzl() {
        C57656ymY.OLrzqt.AhwBna();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showNotification$default(lTZ ltz, android.content.Context context, java.lang.String str, int i, boolean z, long j, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 2;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            j = 3000;
        }
        ltz.KWHzl(context, str, i3, z2, j);
    }

    public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, int i, boolean z, long j) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        C55097xdX c55097xdX = new C55097xdX(context, null, 0, 6, null);
        c55097xdX.setState(i);
        c55097xdX.setTitle(str);
        c55097xdX.setCloseBtnShow(z);
        c55097xdX.setOnCloseCallback(new Function0() { // from class: o.lUd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return lTZ.copydefault();
            }
        });
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, j, 48, 0, 0, 24, null);
    }

    public static final Unit copydefault() {
        C57656ymY.OLrzqt.AhwBna();
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, boolean z, long j) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C55097xdX c55097xdX = new C55097xdX(context, null, 0, 6, null);
        c55097xdX.setState(i);
        c55097xdX.setTitle(str);
        c55097xdX.setMessage(str2);
        c55097xdX.setCloseBtnShow(z);
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, j, 48, 0, 0, 24, null);
    }

    public final void OLrzqt(@NotNull android.content.Context context, int i, int i2, int i3, boolean z, long j) {
        Intrinsics.checkNotNullParameter(context, "");
        C55097xdX c55097xdX = new C55097xdX(context, null, 0, 6, null);
        c55097xdX.setState(i3);
        c55097xdX.setTitle(C33070mpX.AYXKKw(i));
        c55097xdX.setMessage(C33070mpX.AYXKKw(i2));
        c55097xdX.setCloseBtnShow(z);
        c55097xdX.setOnCloseCallback(new Function0() { // from class: o.lUa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return lTZ.valueOf();
            }
        });
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, j, 48, 0, 0, 24, null);
    }

    public static final Unit valueOf() {
        C57656ymY.OLrzqt.AhwBna();
        return Unit.INSTANCE;
    }
}
