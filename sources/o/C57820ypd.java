package o;

import com.onesignal.OSTrigger;
import com.onesignal.OneSignal;
import java.text.DecimalFormat;
import java.util.concurrent.ConcurrentHashMap;
import o.C57710ynZ;

/* JADX INFO: renamed from: o.ypd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57820ypd {
    public C57710ynZ EZpvd;
    public final ConcurrentHashMap<java.lang.String, java.lang.Object> copydefault = new ConcurrentHashMap<>();

    public C57820ypd(C57710ynZ.ActionBar actionBar) {
        this.EZpvd = new C57710ynZ(actionBar);
    }

    public boolean EZpvd(@androidx.annotation.NonNull C57776yom c57776yom) {
        if (c57776yom.fetchVPNInfo.size() == 0) {
            return true;
        }
        java.util.Iterator<java.util.ArrayList<OSTrigger>> it = c57776yom.fetchVPNInfo.iterator();
        while (it.hasNext()) {
            if (OLrzqt(it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean OLrzqt(@androidx.annotation.NonNull java.util.ArrayList<OSTrigger> arrayList) {
        java.util.Iterator<OSTrigger> it = arrayList.iterator();
        while (it.hasNext()) {
            if (!copydefault(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean copydefault(@androidx.annotation.NonNull OSTrigger oSTrigger) {
        OSTrigger.OSTriggerKind oSTriggerKind = oSTrigger.AEQbTJ;
        if (oSTriggerKind == OSTrigger.OSTriggerKind.UNKNOWN) {
            return false;
        }
        if (oSTriggerKind != OSTrigger.OSTriggerKind.CUSTOM) {
            return this.EZpvd.copydefault(oSTrigger);
        }
        OSTrigger.OSTriggerOperator oSTriggerOperator = oSTrigger.OLrzqt;
        java.lang.Object obj = this.copydefault.get(oSTrigger.EZpvd);
        if (obj == null) {
            if (oSTriggerOperator == OSTrigger.OSTriggerOperator.NOT_EXISTS) {
                return true;
            }
            return oSTriggerOperator == OSTrigger.OSTriggerOperator.NOT_EQUAL_TO && oSTrigger.copydefault != null;
        }
        if (oSTriggerOperator == OSTrigger.OSTriggerOperator.EXISTS) {
            return true;
        }
        if (oSTriggerOperator == OSTrigger.OSTriggerOperator.NOT_EXISTS) {
            return false;
        }
        if (oSTriggerOperator == OSTrigger.OSTriggerOperator.CONTAINS) {
            return (obj instanceof java.util.Collection) && ((java.util.Collection) obj).contains(oSTrigger.copydefault);
        }
        if (obj instanceof java.lang.String) {
            java.lang.Object obj2 = oSTrigger.copydefault;
            if ((obj2 instanceof java.lang.String) && OLrzqt((java.lang.String) obj2, (java.lang.String) obj, oSTriggerOperator)) {
                return true;
            }
        }
        java.lang.Object obj3 = oSTrigger.copydefault;
        return ((obj3 instanceof java.lang.Number) && (obj instanceof java.lang.Number) && EZpvd((java.lang.Number) obj3, (java.lang.Number) obj, oSTriggerOperator)) || OLrzqt(oSTrigger.copydefault, obj, oSTriggerOperator);
    }

    /* JADX INFO: renamed from: o.ypd$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] EZpvd;

        static {
            int[] iArr = new int[OSTrigger.OSTriggerOperator.values().length];
            EZpvd = iArr;
            try {
                iArr[OSTrigger.OSTriggerOperator.EQUAL_TO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                EZpvd[OSTrigger.OSTriggerOperator.NOT_EQUAL_TO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                EZpvd[OSTrigger.OSTriggerOperator.EXISTS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                EZpvd[OSTrigger.OSTriggerOperator.CONTAINS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                EZpvd[OSTrigger.OSTriggerOperator.NOT_EXISTS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                EZpvd[OSTrigger.OSTriggerOperator.LESS_THAN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                EZpvd[OSTrigger.OSTriggerOperator.GREATER_THAN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                EZpvd[OSTrigger.OSTriggerOperator.LESS_THAN_OR_EQUAL_TO.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                EZpvd[OSTrigger.OSTriggerOperator.GREATER_THAN_OR_EQUAL_TO.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
        }
    }

    public final boolean OLrzqt(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.lang.String str2, @androidx.annotation.NonNull OSTrigger.OSTriggerOperator oSTriggerOperator) {
        int i = AnonymousClass2.EZpvd[oSTriggerOperator.ordinal()];
        if (i == 1) {
            return str.equals(str2);
        }
        if (i == 2) {
            return !str.equals(str2);
        }
        OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.ERROR, "Attempted to use an invalid operator for a string trigger comparison: " + oSTriggerOperator.toString());
        return false;
    }

    public final boolean OLrzqt(@androidx.annotation.Nullable java.lang.Object obj, @androidx.annotation.NonNull java.lang.Object obj2, @androidx.annotation.NonNull OSTrigger.OSTriggerOperator oSTriggerOperator) {
        if (obj == null) {
            return false;
        }
        if (oSTriggerOperator.checksEquality()) {
            java.lang.String string = obj.toString();
            java.lang.String string2 = obj2.toString();
            if (obj2 instanceof java.lang.Number) {
                string2 = new DecimalFormat("0.#").format(obj2);
            }
            return OLrzqt(string, string2, oSTriggerOperator);
        }
        if ((obj2 instanceof java.lang.String) && (obj instanceof java.lang.Number)) {
            return KWHzl((java.lang.Number) obj, (java.lang.String) obj2, oSTriggerOperator);
        }
        return false;
    }

    public final boolean KWHzl(@androidx.annotation.NonNull java.lang.Number number, @androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull OSTrigger.OSTriggerOperator oSTriggerOperator) {
        try {
            return EZpvd(java.lang.Double.valueOf(number.doubleValue()), java.lang.Double.valueOf(java.lang.Double.parseDouble(str)), oSTriggerOperator);
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }

    public final boolean EZpvd(@androidx.annotation.NonNull java.lang.Number number, @androidx.annotation.NonNull java.lang.Number number2, @androidx.annotation.NonNull OSTrigger.OSTriggerOperator oSTriggerOperator) {
        double dDoubleValue = number.doubleValue();
        double dDoubleValue2 = number2.doubleValue();
        switch (AnonymousClass2.EZpvd[oSTriggerOperator.ordinal()]) {
            case 1:
                return dDoubleValue2 == dDoubleValue;
            case 2:
                return dDoubleValue2 != dDoubleValue;
            case 3:
            case 4:
            case 5:
                OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.ERROR, "Attempted to use an invalid operator with a numeric value: " + oSTriggerOperator.toString());
                return false;
            case 6:
                return dDoubleValue2 < dDoubleValue;
            case 7:
                return dDoubleValue2 > dDoubleValue;
            case 8:
                return dDoubleValue2 < dDoubleValue || dDoubleValue2 == dDoubleValue;
            case 9:
                return dDoubleValue2 > dDoubleValue || dDoubleValue2 == dDoubleValue;
            default:
                return false;
        }
    }

    public boolean KWHzl(C57776yom c57776yom, java.util.Collection<java.lang.String> collection) {
        if (c57776yom.fetchVPNInfo == null) {
            return false;
        }
        for (java.lang.String str : collection) {
            java.util.Iterator<java.util.ArrayList<OSTrigger>> it = c57776yom.fetchVPNInfo.iterator();
            while (it.hasNext()) {
                for (OSTrigger oSTrigger : it.next()) {
                    if (str.equals(oSTrigger.EZpvd) || str.equals(oSTrigger.KWHzl)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean OLrzqt(C57776yom c57776yom) {
        java.util.ArrayList<java.util.ArrayList<OSTrigger>> arrayList = c57776yom.fetchVPNInfo;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        java.util.Iterator<java.util.ArrayList<OSTrigger>> it = c57776yom.fetchVPNInfo.iterator();
        while (it.hasNext()) {
            java.util.Iterator<OSTrigger> it2 = it.next().iterator();
            while (it2.hasNext()) {
                OSTrigger.OSTriggerKind oSTriggerKind = it2.next().AEQbTJ;
                if (oSTriggerKind == OSTrigger.OSTriggerKind.CUSTOM || oSTriggerKind == OSTrigger.OSTriggerKind.UNKNOWN) {
                    return false;
                }
            }
        }
        return true;
    }
}
