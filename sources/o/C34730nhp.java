package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nhp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34730nhp {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public long AEQbTJ;
    public java.lang.String EZpvd;
    public int KWHzl;
    public long copydefault;
    public final java.util.List<java.lang.String> djBIcL;
    public long valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C34730nhp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(long j) {
        this.valueOf = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.KWHzl = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(long j) {
        this.copydefault = j;
    }

    public C34730nhp(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.djBIcL = new java.util.ArrayList();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:7) call: o.nhp.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ C34730nhp(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public final void AEQbTJ() {
        this.AEQbTJ = java.lang.System.currentTimeMillis();
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL.add(str);
    }

    public final void copydefault() {
        reportEvent$default(this, "0", null, 2, null);
    }

    public final void copydefault(java.lang.Throwable th) {
        OLrzqt("1", th != null ? th.getMessage() : null);
    }

    public final void OLrzqt() {
        reportEvent$default(this, "2", null, 2, null);
    }

    public static /* synthetic */ void reportEvent$default(C34730nhp c34730nhp, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        c34730nhp.OLrzqt(str, str2);
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2) {
        EventData eventData = new EventData();
        eventData.setAct("feature_delivery");
        eventData.setSource(this.EZpvd);
        eventData.setTime(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        eventData.setCode(str);
        if (str2 != null) {
            eventData.setMsg(str2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.AEQbTJ > 0) {
            linkedHashMap.put("duration", java.lang.String.valueOf(java.lang.System.currentTimeMillis() - this.AEQbTJ));
        }
        linkedHashMap.put("attr_1", java.lang.String.valueOf(this.KWHzl));
        linkedHashMap.put("attr_2", CollectionsKt___CollectionsKt.joinToString$default(this.djBIcL, ",", null, null, 0, null, null, 62, null));
        linkedHashMap.put("attr_3", java.lang.String.valueOf(this.copydefault));
        linkedHashMap.put("attr_4", java.lang.String.valueOf(this.valueOf));
        eventData.setAttrs(linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
        pUU.EZpvd("FeatureTracker", "reportEvent: " + eventData);
    }

    /* JADX INFO: renamed from: o.nhp$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nhp.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
