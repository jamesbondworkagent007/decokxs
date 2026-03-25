package o;

import com.ibm.icu.util.TimeZoneRule;

/* JADX INFO: renamed from: o.agW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7261agW {
    public final TimeZoneRule AEQbTJ;
    public final long EZpvd;
    public final TimeZoneRule copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TimeZoneRule EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TimeZoneRule OLrzqt() {
        return this.AEQbTJ;
    }

    public C7261agW(long j, TimeZoneRule timeZoneRule, TimeZoneRule timeZoneRule2) {
        this.EZpvd = j;
        this.copydefault = timeZoneRule;
        this.AEQbTJ = timeZoneRule2;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("time=" + this.EZpvd);
        sb.append(", from={" + this.copydefault + "}");
        sb.append(", to={" + this.AEQbTJ + "}");
        return sb.toString();
    }
}
