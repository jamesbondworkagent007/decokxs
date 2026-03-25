package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.FA;
import o.FO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class FM {
    public final boolean AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.util.Map<FA.Application, java.lang.String> EZpvd;
    public final java.util.Map<FA.Application, java.lang.String> KWHzl;
    public final int OLrzqt;
    public final java.util.List<FO> copydefault;
    public final FA.Application gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FA.Application AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.OLrzqt;
    }

    public FM(boolean z, int i, @NotNull FA.Application application, @NotNull java.util.Map<FA.Application, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.AEQbTJ = z;
        this.OLrzqt = i;
        this.gEmmrt = application;
        this.KWHzl = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.EZpvd = linkedHashMap;
        this.copydefault = new java.util.ArrayList();
        this.AhwBna = C59449zhJ.copydefault("    ", i);
        this.AYXKKw = C59449zhJ.copydefault("    ", i + 1);
        linkedHashMap.putAll(map);
    }

    public final void AEQbTJ(@NotNull FA.Application application, java.lang.String str) {
        Intrinsics.checkNotNullParameter(application, "");
        this.EZpvd.put(application, str);
    }

    public final void KWHzl(@NotNull FM fm) {
        Intrinsics.checkNotNullParameter(fm, "");
        this.copydefault.add(new FO.TaskDescription(fm));
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.add(new FO.Application(str));
    }

    public final void KWHzl(@NotNull java.lang.StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "");
        java.lang.StringBuilder sbEZpvd = EZpvd(sb, this.AhwBna);
        sbEZpvd.append('<');
        sbEZpvd.append(this.gEmmrt);
        for (Map.Entry<FA.Application, java.lang.String> entry : this.EZpvd.entrySet()) {
            sb.append(' ');
            sb.append(entry.getKey());
            sb.append("=\"");
            java.lang.String value = entry.getValue();
            if (value != null) {
                KWHzl(sb, value);
            }
            sb.append('\"');
        }
        if (this.copydefault.isEmpty()) {
            java.lang.StringBuilder sbEZpvd2 = EZpvd(sb, " ");
            sbEZpvd2.append("/>");
            Intrinsics.checkNotNullExpressionValue(sbEZpvd2, "");
            AEQbTJ(sbEZpvd2);
            return;
        }
        if (this.copydefault.size() == 1 && (CollectionsKt___CollectionsKt.AuCTelauCTel(this.copydefault) instanceof FO.Application)) {
            sb.append('>');
            Intrinsics.checkNotNullExpressionValue(sb, "");
            java.lang.Object objAuCTelauCTel = CollectionsKt___CollectionsKt.AuCTelauCTel(this.copydefault);
            Intrinsics.copydefault(objAuCTelauCTel, "");
            java.lang.StringBuilder sbOLrzqt = OLrzqt(sb, ((FO.Application) objAuCTelauCTel).AEQbTJ());
            sbOLrzqt.append("</");
            sbOLrzqt.append(this.gEmmrt);
            sbOLrzqt.append('>');
            Intrinsics.checkNotNullExpressionValue(sbOLrzqt, "");
            AEQbTJ(sbOLrzqt);
            return;
        }
        sb.append('>');
        Intrinsics.checkNotNullExpressionValue(sb, "");
        AEQbTJ(sb);
        for (FO fo : this.copydefault) {
            if (fo instanceof FO.Application) {
                AEQbTJ(OLrzqt(EZpvd(sb, this.AYXKKw), ((FO.Application) fo).AEQbTJ()));
            } else if (fo instanceof FO.TaskDescription) {
                ((FO.TaskDescription) fo).OLrzqt().KWHzl(sb);
            }
        }
        java.lang.StringBuilder sbEZpvd3 = EZpvd(sb, this.AhwBna);
        sbEZpvd3.append("</");
        sbEZpvd3.append(this.gEmmrt);
        sbEZpvd3.append('>');
        Intrinsics.checkNotNullExpressionValue(sbEZpvd3, "");
        AEQbTJ(sbEZpvd3);
    }

    public final java.lang.StringBuilder EZpvd(java.lang.StringBuilder sb, java.lang.String str) {
        if (this.AEQbTJ) {
            sb.append(str);
        }
        return sb;
    }

    public final java.lang.StringBuilder AEQbTJ(java.lang.StringBuilder sb) {
        if (this.AEQbTJ) {
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "");
        }
        return sb;
    }

    public final java.lang.StringBuilder OLrzqt(java.lang.StringBuilder sb, java.lang.String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '<') {
                sb.append("&lt;");
            } else if (cCharAt == '>') {
                sb.append("&gt;");
            } else if (cCharAt == '&') {
                sb.append("&amp;");
            } else if (cCharAt >= 0 && cCharAt < ' ') {
                sb.append("&#x" + FN.OLrzqt(cCharAt) + ';');
            } else if (cCharAt == 133) {
                sb.append("&#x85;");
            } else if (cCharAt == 8232) {
                sb.append("&#x2028;");
            } else {
                sb.append(cCharAt);
            }
        }
        return sb;
    }

    public final java.lang.StringBuilder KWHzl(java.lang.StringBuilder sb, java.lang.String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '<') {
                sb.append("&lt;");
            } else if (cCharAt == '>') {
                sb.append("&gt;");
            } else if (cCharAt == '&') {
                sb.append("&amp;");
            } else if (cCharAt == '\"') {
                sb.append("&quot;");
            } else if (cCharAt >= 0 && cCharAt < ' ') {
                sb.append("&#x" + FN.OLrzqt(cCharAt) + ';');
            } else if (cCharAt == 133) {
                sb.append("&#x85;");
            } else if (cCharAt == 8232) {
                sb.append("&#x2028;");
            } else {
                sb.append(cCharAt);
            }
        }
        return sb;
    }
}
