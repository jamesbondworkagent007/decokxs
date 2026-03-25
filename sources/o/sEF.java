package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sEF {
    public static final sEF OLrzqt = new sEF();

    private sEF() {
    }

    public final EventData AEQbTJ() {
        EventData eventData = new EventData();
        eventData.setAct("event_im");
        return eventData;
    }

    public final void EZpvd(@NotNull ReportManager reportManager, @NotNull EventData eventData) {
        Intrinsics.checkNotNullParameter(reportManager, "");
        Intrinsics.checkNotNullParameter(eventData, "");
        try {
            Result.Application application = Result.Companion;
            reportManager.EZpvd(eventData);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
