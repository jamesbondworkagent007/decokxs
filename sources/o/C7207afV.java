package o;

import com.ibm.icu.util.Currency;
import java.util.Collections;
import java.util.Date;

/* JADX INFO: renamed from: o.afV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7207afV {

    @java.lang.Deprecated
    public static final TaskDescription AEQbTJ = new TaskDescription(2, 0);
    public static final boolean KWHzl;
    public static final C7207afV copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static C7207afV OLrzqt() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TaskDescription copydefault(java.lang.String str, Currency.CurrencyUsage currencyUsage) {
        return AEQbTJ;
    }

    @java.lang.Deprecated
    public C7207afV() {
    }

    /* JADX INFO: renamed from: o.afV$ActionBar */
    public static final class ActionBar {
        public static final ActionBar AEQbTJ = new ActionBar(null, null, Long.MIN_VALUE, Long.MAX_VALUE, false);
        public final java.lang.String EZpvd;
        public final long KWHzl;

        @java.lang.Deprecated
        public final boolean OLrzqt;
        public final java.lang.String copydefault;
        public final long valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static ActionBar copydefault() {
            return AEQbTJ;
        }

        public ActionBar(java.lang.String str, java.lang.String str2, long j, long j2, boolean z) {
            this.copydefault = str;
            this.EZpvd = str2;
            this.KWHzl = j;
            this.valueOf = j2;
            this.OLrzqt = z;
        }

        public static ActionBar KWHzl() {
            return AEQbTJ.AEQbTJ(new Date());
        }

        public static ActionBar EZpvd(java.lang.String str) {
            return AEQbTJ.AEQbTJ(str);
        }

        public static ActionBar EZpvd(Date date) {
            return AEQbTJ.AEQbTJ(date);
        }

        public static ActionBar AEQbTJ(Date date, Date date2) {
            return AEQbTJ.EZpvd(date, date2);
        }

        public ActionBar AEQbTJ(java.lang.String str) {
            return new ActionBar(str, this.EZpvd, this.KWHzl, this.valueOf, this.OLrzqt);
        }

        public ActionBar copydefault(java.lang.String str) {
            return new ActionBar(this.copydefault, str, this.KWHzl, this.valueOf, this.OLrzqt);
        }

        public ActionBar AEQbTJ(Date date) {
            return new ActionBar(this.copydefault, this.EZpvd, date.getTime(), date.getTime(), this.OLrzqt);
        }

        public ActionBar EZpvd(Date date, Date date2) {
            return new ActionBar(this.copydefault, this.EZpvd, date == null ? Long.MIN_VALUE : date.getTime(), date2 == null ? Long.MAX_VALUE : date2.getTime(), this.OLrzqt);
        }

        public ActionBar OLrzqt() {
            return new ActionBar(this.copydefault, this.EZpvd, this.KWHzl, this.valueOf, true);
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof ActionBar) && EZpvd((ActionBar) obj);
        }

        public boolean EZpvd(ActionBar actionBar) {
            return C7045acS.AEQbTJ(this, actionBar) || (actionBar != null && copydefault(this.copydefault, actionBar.copydefault) && copydefault(this.EZpvd, actionBar.EZpvd) && this.KWHzl == actionBar.KWHzl && this.valueOf == actionBar.valueOf && this.OLrzqt == actionBar.OLrzqt);
        }

        public int hashCode() {
            java.lang.String str = this.copydefault;
            int iHashCode = str != null ? str.hashCode() : 0;
            java.lang.String str2 = this.EZpvd;
            if (str2 != null) {
                iHashCode = (iHashCode * 31) + str2.hashCode();
            }
            long j = this.KWHzl;
            long j2 = this.valueOf;
            return (((((((((iHashCode * 31) + ((int) j)) * 31) + ((int) (j >>> 32))) * 31) + ((int) j2)) * 31) + ((int) (j2 >>> 32))) * 31) + (this.OLrzqt ? 1 : 0);
        }

        public java.lang.String toString() {
            return C7207afV.KWHzl(this);
        }

        public static boolean copydefault(java.lang.String str, java.lang.String str2) {
            return C7045acS.AEQbTJ(str, str2) || (str != null && str.equals(str2));
        }
    }

    /* JADX INFO: renamed from: o.afV$TaskDescription */
    public static final class TaskDescription {
        public final int EZpvd;
        public final int copydefault;

        public TaskDescription(int i, int i2) {
            this.EZpvd = i;
            this.copydefault = i2;
        }

        public java.lang.String toString() {
            return C7207afV.KWHzl(this);
        }
    }

    public java.util.List<java.lang.String> copydefault(ActionBar actionBar) {
        return Collections.emptyList();
    }

    static {
        C7207afV c7207afV;
        boolean z = false;
        try {
            c7207afV = (C7207afV) C7025abZ.class.newInstance();
            z = true;
        } catch (java.lang.Throwable unused) {
            c7207afV = new C7207afV();
        }
        copydefault = c7207afV;
        KWHzl = z;
    }

    public static java.lang.String EZpvd(long j) {
        if (j == Long.MAX_VALUE || j == Long.MIN_VALUE) {
            return null;
        }
        return C7019abT.AEQbTJ(j);
    }

    public static java.lang.String KWHzl(java.lang.Object obj) {
        java.lang.String strValueOf;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            for (java.lang.reflect.Field field : obj.getClass().getFields()) {
                java.lang.Object obj2 = field.get(obj);
                if (obj2 != null) {
                    if (obj2 instanceof Date) {
                        strValueOf = EZpvd(((Date) obj2).getTime());
                    } else if (obj2 instanceof java.lang.Long) {
                        strValueOf = EZpvd(((java.lang.Long) obj2).longValue());
                    } else {
                        strValueOf = java.lang.String.valueOf(obj2);
                    }
                    if (strValueOf != null) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        sb.append(field.getName());
                        sb.append("='");
                        sb.append(strValueOf);
                        sb.append("'");
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        sb.insert(0, obj.getClass().getSimpleName() + "(");
        sb.append(")");
        return sb.toString();
    }
}
