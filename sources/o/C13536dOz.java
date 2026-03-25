package o;

import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dOz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13536dOz extends AbstractC43215rlA implements InterfaceC9775bbu {
    public final void EZpvd(int i) {
        RxBus.AEQbTJ(new xXQ(i));
    }

    @Override // o.InterfaceC9775bbu
    public void AEQbTJ(@NotNull android.content.Context context, final java.lang.Integer num, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function0, "");
        dJJ.copydefault.OLrzqt(context, "", map, ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).fIwbmz());
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: o.dOx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C13536dOz.KWHzl(num, function0, this);
            }
        }, 500L);
    }

    public static final void KWHzl(java.lang.Integer num, Function0 function0, C13536dOz c13536dOz) {
        if (num != null) {
            num.intValue();
            c13536dOz.EZpvd(num.intValue());
        }
        function0.invoke();
    }

    @Override // o.InterfaceC9775bbu
    public void copydefault(@NotNull android.content.Context context, final java.lang.Integer num, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, long j, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function0, "");
        dJJ.copydefault.OLrzqt(context, "", map, ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).fIwbmz());
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: o.dOy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C13536dOz.EZpvd(num, function0, this);
            }
        }, j);
    }

    public static final void EZpvd(java.lang.Integer num, Function0 function0, C13536dOz c13536dOz) {
        if (num != null) {
            num.intValue();
            c13536dOz.EZpvd(num.intValue());
        }
        function0.invoke();
    }
}
