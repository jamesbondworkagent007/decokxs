package o;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.okinc.okapm.Apm;
import com.okinc.okapm.common.AppStartMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rVV implements rWL {
    public final java.lang.String KWHzl = "Monitor.APM";
    public rWC copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.rWM
    public void EZpvd(@NotNull rWC rwc) {
        Intrinsics.checkNotNullParameter(rwc, "");
        this.copydefault = rwc;
    }

    @Override // o.rWL
    public void KWHzl() {
        Apm.TaskDescription.Activity activity = Apm.TaskDescription.Companion;
        java.lang.String value = AppStartMode.OnLaunch.getValue();
        Apm.TaskDescription taskDescriptionOLrzqt = activity.OLrzqt(Apm.EventGroupType.APP_LIFECYCLE.getValue(), Apm.EventType.APP_START.getValue(), value, C56424yEw.gEmmrt(C56390yDp.OLrzqt("start_mode", AppStartMode.OnResume.getValue()), C56390yDp.OLrzqt(MetricsSQLiteCacheKt.METRICS_START_TIME, java.lang.String.valueOf(java.lang.System.currentTimeMillis()))));
        rWC rwc = this.copydefault;
        if (rwc != null) {
            rwc.copydefault(taskDescriptionOLrzqt);
        }
    }

    @Override // o.rWL
    public void AEQbTJ() {
        Apm.TaskDescription.Activity activity = Apm.TaskDescription.Companion;
        java.lang.String value = AppStartMode.OnLifecycle.getValue();
        Apm.TaskDescription taskDescriptionOLrzqt = activity.OLrzqt(Apm.EventGroupType.APP_LIFECYCLE.getValue(), Apm.EventType.APP_END.getValue(), value, C56424yEw.gEmmrt(C56390yDp.OLrzqt("start_mode", AppStartMode.OnResume.getValue()), C56390yDp.OLrzqt(MetricsSQLiteCacheKt.METRICS_START_TIME, java.lang.String.valueOf(java.lang.System.currentTimeMillis()))));
        rWC rwc = this.copydefault;
        if (rwc != null) {
            rwc.copydefault(taskDescriptionOLrzqt);
        }
    }
}
