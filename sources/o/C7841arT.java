package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.mln.miniapp.MiniAppUpdateError;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.arT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7841arT {
    public long AEQbTJ;
    public java.lang.String EZpvd;
    public long KWHzl;
    public java.lang.String OLrzqt;
    public long copydefault;
    public java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7841arT() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.String str) {
        this.EZpvd = str;
    }

    public C7841arT(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.djBIcL = "";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:46) call: o.arT.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ C7841arT(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public final void EZpvd() {
        this.KWHzl = java.lang.System.currentTimeMillis();
        reportEvent$default(this, 1, null, 2, null);
    }

    public final void OLrzqt() {
        this.AEQbTJ = java.lang.System.currentTimeMillis();
        pUU.EZpvd("MiniAppUpdateTracker", "realStartDownload:");
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
        this.copydefault = java.lang.System.currentTimeMillis();
    }

    public final void AEQbTJ() {
        reportEvent$default(this, 200, null, 2, null);
    }

    public final void KWHzl(java.lang.Throwable th) {
        EZpvd(th instanceof MiniAppUpdateError ? ((MiniAppUpdateError) th).getCode() : 301, th != null ? th.getMessage() : null);
    }

    public static /* synthetic */ void reportEvent$default(C7841arT c7841arT, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        c7841arT.EZpvd(i, str);
    }

    public final void EZpvd(int i, java.lang.String str) {
        EventData eventData = new EventData();
        eventData.setAct("miniapp_update");
        eventData.setSource(this.OLrzqt);
        eventData.setTime(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        eventData.setCode(java.lang.String.valueOf(i));
        if (str != null) {
            eventData.setMsg(str);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.lang.String str2 = this.EZpvd;
        if (str2 != null) {
            linkedHashMap.put("bundleVer", str2);
        }
        if (this.KWHzl > 0) {
            linkedHashMap.put("duration", java.lang.String.valueOf(java.lang.System.currentTimeMillis() - this.KWHzl));
        }
        if (this.AEQbTJ > 0) {
            linkedHashMap.put("attr_1", java.lang.String.valueOf(java.lang.System.currentTimeMillis() - this.AEQbTJ));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.djBIcL)) {
            linkedHashMap.put("attr_2", this.djBIcL);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) C43396roW.EZpvd().copydefault())) {
            java.lang.String strCopydefault = C43396roW.EZpvd().copydefault();
            Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
            linkedHashMap.put("attr_3", strCopydefault);
        }
        long j = this.AEQbTJ;
        if (j > 0) {
            long j2 = this.copydefault;
            if (j2 > 0) {
                linkedHashMap.put("attr_4", java.lang.String.valueOf(j2 - j));
            }
        }
        linkedHashMap.put("attr_5", C43457rpe.OLrzqt(C54819xWm.KWHzl().AEQbTJ()).OLrzqt() ? "1" : "0");
        eventData.setAttrs(linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
        pUU.EZpvd("MiniAppUpdateTracker", "reportEvent: " + eventData);
    }
}
