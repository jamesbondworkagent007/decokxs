package o;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.NotificationCategory;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationCenterActivity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rZy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42629rZy extends AbstractC43215rlA implements rXT {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final C42596rYs AEQbTJ;
    public final InterfaceC47278tmy EZpvd;
    public final yHO<android.content.Context, java.lang.Integer, java.lang.String, Unit> copydefault;

    @Override // o.rXT
    public void KWHzl() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super android.content.Context, ? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C42629rZy(@NotNull yHO<? super android.content.Context, ? super java.lang.Integer, ? super java.lang.String, Unit> yho, @NotNull C42596rYs c42596rYs, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(c42596rYs, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.copydefault = yho;
        this.AEQbTJ = c42596rYs;
        this.EZpvd = interfaceC47278tmy;
    }

    @Override // o.rXT
    public android.content.Intent AEQbTJ(@NotNull android.content.Context context, java.lang.String str, NotificationCategory notificationCategory) {
        Intrinsics.checkNotNullParameter(context, "");
        return NotificationCenterActivity.Activity.createIntent$default(NotificationCenterActivity.Companion, context, str, notificationCategory, null, 8, null);
    }

    @Override // o.rXT
    public void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        rXU rxu;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List listKWHzl = C43251rlk.KWHzl(rXU.class);
        if (listKWHzl == null || (rxu = (rXU) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null) {
            return;
        }
        rxu.EZpvd(context, str);
    }

    /* JADX INFO: renamed from: o.rZy$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rZy.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
