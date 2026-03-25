package o;

import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.okinc.barcode.ScanType;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aUH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6696aUH {
    public static final void OLrzqt(@NotNull ScanType scanType) {
        Intrinsics.checkNotNullParameter(scanType, "");
        copydefault(1, scanType);
    }

    public static final void EZpvd(@NotNull ScanType scanType) {
        Intrinsics.checkNotNullParameter(scanType, "");
        copydefault(0, scanType);
    }

    public static final void copydefault(int i, ScanType scanType) {
        EventData eventData = new EventData();
        eventData.setAct(OptionalModuleUtils.BARCODE);
        eventData.setCode(java.lang.String.valueOf(i));
        eventData.setMsg(scanType.getValue());
        ReportManager.AEQbTJ.EZpvd(eventData);
    }
}
