package o;

import com.okinc.business.featureflag.FeatureFlag;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aZy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7002aZy {
    @yCM
    public C7002aZy() {
    }

    public final void EZpvd(@NotNull FeatureFlag featureFlag, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(featureFlag, "");
        Intrinsics.checkNotNullParameter(str, "");
        EventData eventData = new EventData();
        eventData.setAct(featureFlag.getKey());
        eventData.setMsg(str);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }
}
