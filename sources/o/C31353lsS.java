package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lsS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C31353lsS {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public java.lang.String gEmmrt = "";
    public java.lang.String AEQbTJ = "";
    public java.lang.String EZpvd = "";
    public java.lang.String valueOf = "";
    public java.lang.String KWHzl = "";
    public java.lang.String copydefault = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31353lsS copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        return this;
    }

    /* JADX INFO: renamed from: o.lsS$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lsS.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void EZpvd() {
        EventData eventDataAEQbTJ = AEQbTJ(this.gEmmrt, this.AEQbTJ, this.EZpvd, this.valueOf, this.KWHzl, this.copydefault);
        pUU.EZpvd("Grafana.Common", "Tracking event:" + KWHzl(this.gEmmrt, this.AEQbTJ, this.EZpvd, this.valueOf, this.KWHzl, this.copydefault));
        ReportManager.AEQbTJ.EZpvd(eventDataAEQbTJ);
    }

    public final EventData AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        EventData eventData = new EventData();
        eventData.setAct("cr_simple_trade");
        eventData.setCode(str6);
        eventData.setSource(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page", str2);
        linkedHashMap.put("click", str3);
        linkedHashMap.put("attr_2", str5);
        linkedHashMap.put("attr_1", str4);
        eventData.setAttrs(linkedHashMap);
        return eventData;
    }

    public final java.lang.String KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (str.length() > 0) {
            sb.append("source: " + str + ", ");
            sb.append('\n');
        }
        sb.append("currentPage: " + str2);
        sb.append('\n');
        if (str3.length() > 0) {
            sb.append("click: " + str3);
            sb.append('\n');
        }
        if (str4.length() > 0) {
            sb.append("token: " + str4);
            sb.append('\n');
        }
        sb.append("time: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.getDefault()).format(new Date(java.lang.System.currentTimeMillis())));
        sb.append('\n');
        if (str5.length() > 0) {
            sb.append("log: " + str5);
            sb.append('\n');
        }
        if (str6.length() > 0) {
            sb.append("errorCode: " + str6);
            sb.append('\n');
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
