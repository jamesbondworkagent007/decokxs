package o;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.AppNotificationBizType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.rXQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rYf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C42583rYf implements InterfaceC43234rlT {
    public final rXQ AEQbTJ;

    @yCM
    public C42583rYf(@NotNull rXQ rxq) {
        Intrinsics.checkNotNullParameter(rxq, "");
        this.AEQbTJ = rxq;
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (map.containsKey("categoryType")) {
            int iAhwBna = C33129mqd.AhwBna(map.get("categoryType"));
            if (iAhwBna != 0) {
                this.AEQbTJ.copydefault(context, iAhwBna, AppNotificationBizType.CEFI, 0, new Function1() { // from class: o.rYi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C42583rYf.OLrzqt((java.lang.Throwable) obj);
                    }
                });
                return;
            } else {
                rXQ.Activity.startAppPushAdvancedSettingsPageForResult$default(this.AEQbTJ, context, AppNotificationBizType.CEFI, 0, null, 8, null);
                return;
            }
        }
        rXQ.Activity.startAppPushAdvancedSettingsPageForResult$default(this.AEQbTJ, context, AppNotificationBizType.CEFI, 0, null, 8, null);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }
}
