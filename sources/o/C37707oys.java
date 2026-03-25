package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.im.imui.tracking.model.MediaType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37707oys {
    public static final C37707oys EZpvd = new C37707oys();

    private C37707oys() {
    }

    public final void AEQbTJ(boolean z, @NotNull C37710oyv c37710oyv) {
        Intrinsics.checkNotNullParameter(c37710oyv, "");
        java.lang.String str = z ? "Media_Load" : "Media_Download";
        sEF sef = sEF.OLrzqt;
        EventData eventDataAEQbTJ = sef.AEQbTJ();
        eventDataAEQbTJ.setMsg(str);
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        pairArr[0] = C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(c37710oyv.KWHzl()));
        pairArr[1] = C56390yDp.OLrzqt("attr_2", C33129mqd.gEmmrt(c37710oyv.OLrzqt().name()));
        pairArr[2] = C56390yDp.OLrzqt("attr_3", C33129mqd.gEmmrt(c37710oyv.copydefault()));
        MediaType mediaTypeAEQbTJ = c37710oyv.AEQbTJ();
        pairArr[3] = C56390yDp.OLrzqt("attr_4", C33129mqd.gEmmrt(mediaTypeAEQbTJ != null ? mediaTypeAEQbTJ.name() : null));
        eventDataAEQbTJ.setAttrs(C56424yEw.djBIcL(pairArr));
        sef.EZpvd(ReportManager.AEQbTJ, eventDataAEQbTJ);
    }
}
