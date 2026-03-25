package o;

import com.okinc.core.util.SPUtils;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.NotificationCenterManager$markAllNotificationsAsRead$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C44639sai {
    public final C42605rZa AYXKKw;
    public final CoroutineScope EZpvd;
    public final SharedFlow<java.lang.Boolean> KWHzl;
    public final MutableSharedFlow<java.lang.Boolean> OLrzqt;
    public final MutableStateFlow<java.lang.Boolean> copydefault;
    public final rXY djBIcL;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.sai$Application */
    public interface Application {
        C44639sai run();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.lang.Boolean> KWHzl() {
        return this.KWHzl;
    }

    @yCM
    public C44639sai(@NotNull rXY rxy, @NotNull C42605rZa c42605rZa) {
        Intrinsics.checkNotNullParameter(rxy, "");
        Intrinsics.checkNotNullParameter(c42605rZa, "");
        this.djBIcL = rxy;
        this.AYXKKw = c42605rZa;
        this.EZpvd = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getMain().getImmediate()));
        MutableSharedFlow<java.lang.Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.KWHzl = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.copydefault = StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
    }

    /* JADX INFO: renamed from: o.sai$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sai.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C44639sai KWHzl() {
            android.content.Context applicationContext = C43246rlf.OLrzqt.valueOf().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            return ((Application) C58114yvF.OLrzqt(applicationContext, Application.class)).run();
        }
    }

    public final void AEQbTJ(java.lang.String str) {
        this.djBIcL.copydefault(str);
    }

    public final Job copydefault(java.lang.String str) {
        return BuildersKt__Builders_commonKt.launch$default(this.EZpvd, null, null, new NotificationCenterManager$markAllNotificationsAsRead$1(this, str, null), 3, null);
    }

    public final void OLrzqt(boolean z) {
        if ((z | SPUtils.getBoolean("KEY_NOTIFICATION_PERMISSION_STATE", false)) && (!SPUtils.getBoolean("didDisplayBrushCoachMark", false))) {
            this.copydefault.setValue(java.lang.Boolean.TRUE);
        }
    }
}
