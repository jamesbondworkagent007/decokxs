package o;

import com.fasterxml.jackson.core.JsonPointer;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import java.util.Collections;
import o.C7062acj;

/* JADX INFO: renamed from: o.acg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7059acg extends C7062acj {
    public ULocale OLrzqt;
    public java.lang.String copydefault;

    public C7059acg() {
    }

    public C7059acg(java.lang.String str) {
        super(str);
    }

    public java.lang.Object EZpvd(ULocale uLocale) {
        return copydefault(uLocale, -1, null);
    }

    public java.lang.Object OLrzqt(ULocale uLocale, ULocale[] uLocaleArr) {
        return copydefault(uLocale, -1, uLocaleArr);
    }

    public java.lang.Object copydefault(ULocale uLocale, int i, ULocale[] uLocaleArr) {
        C7062acj.StateListAnimator stateListAnimatorEZpvd = EZpvd(uLocale, i);
        if (uLocaleArr == null) {
            return KWHzl(stateListAnimatorEZpvd);
        }
        java.lang.String[] strArr = new java.lang.String[1];
        java.lang.Object objAEQbTJ = AEQbTJ(stateListAnimatorEZpvd, strArr);
        if (objAEQbTJ != null) {
            int iIndexOf = strArr[0].indexOf("/");
            if (iIndexOf >= 0) {
                strArr[0] = strArr[0].substring(iIndexOf + 1);
            }
            uLocaleArr[0] = new ULocale(strArr[0]);
        }
        return objAEQbTJ;
    }

    public C7062acj.TaskDescription copydefault(java.lang.Object obj, ULocale uLocale) {
        return OLrzqt(obj, uLocale, -1, true);
    }

    public C7062acj.TaskDescription OLrzqt(java.lang.Object obj, ULocale uLocale, int i, boolean z) {
        return copydefault(new Application(obj, uLocale, i, z));
    }

    public java.util.Locale[] AEQbTJ() {
        java.util.Set<java.lang.String> setDjBIcL = djBIcL();
        java.util.Locale[] localeArr = new java.util.Locale[setDjBIcL.size()];
        java.util.Iterator<java.lang.String> it = setDjBIcL.iterator();
        int i = 0;
        while (it.hasNext()) {
            localeArr[i] = C7066acn.copydefault(it.next());
            i++;
        }
        return localeArr;
    }

    public ULocale[] EZpvd() {
        java.util.Set<java.lang.String> setDjBIcL = djBIcL();
        ULocale[] uLocaleArr = new ULocale[setDjBIcL.size()];
        java.util.Iterator<java.lang.String> it = setDjBIcL.iterator();
        int i = 0;
        while (it.hasNext()) {
            uLocaleArr[i] = new ULocale(it.next());
            i++;
        }
        return uLocaleArr;
    }

    /* JADX INFO: renamed from: o.acg$Activity */
    public static class Activity extends C7062acj.StateListAnimator {
        public int AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public int OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C7062acj.StateListAnimator
        public java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C7062acj.StateListAnimator
        public java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int djBIcL() {
            return this.AEQbTJ;
        }

        public static Activity OLrzqt(java.lang.String str, java.lang.String str2) {
            return EZpvd(str, str2, -1);
        }

        public static Activity EZpvd(java.lang.String str, java.lang.String str2, int i) {
            if (str == null) {
                return null;
            }
            return new Activity(str, ULocale.getName(str), str2, i);
        }

        public static Activity OLrzqt(ULocale uLocale, java.lang.String str, int i) {
            if (uLocale == null) {
                return null;
            }
            java.lang.String name = uLocale.getName();
            return new Activity(name, name, str, i);
        }

        public Activity(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
            super(str);
            this.AEQbTJ = i;
            if (str2 == null || str2.equalsIgnoreCase("root")) {
                this.EZpvd = "";
                this.copydefault = null;
            } else {
                int iIndexOf = str2.indexOf(64);
                if (iIndexOf == 4 && str2.regionMatches(true, 0, "root", 0, 4)) {
                    this.EZpvd = str2.substring(4);
                    this.OLrzqt = 0;
                    this.copydefault = null;
                } else {
                    this.EZpvd = str2;
                    this.OLrzqt = iIndexOf;
                    if (str3 == null || str2.equals(str3)) {
                        this.copydefault = "";
                    } else {
                        this.copydefault = str3;
                    }
                }
            }
            int i2 = this.OLrzqt;
            this.KWHzl = i2 == -1 ? this.EZpvd : this.EZpvd.substring(0, i2);
        }

        public java.lang.String gEmmrt() {
            if (this.AEQbTJ == -1) {
                return null;
            }
            return java.lang.Integer.toString(djBIcL());
        }

        @Override // o.C7062acj.StateListAnimator
        public java.lang.String KWHzl() {
            java.lang.String strOLrzqt = OLrzqt();
            if (strOLrzqt == null) {
                return strOLrzqt;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.AEQbTJ != -1) {
                sb.append(gEmmrt());
            }
            sb.append(JsonPointer.SEPARATOR);
            sb.append(strOLrzqt);
            int i = this.OLrzqt;
            if (i != -1) {
                java.lang.String str = this.EZpvd;
                sb.append(str.substring(i, str.length()));
            }
            return sb.toString();
        }

        public ULocale EZpvd() {
            return new ULocale(this.EZpvd);
        }

        public ULocale AEQbTJ() {
            if (this.OLrzqt == -1) {
                return new ULocale(this.KWHzl);
            }
            return new ULocale(this.KWHzl + this.EZpvd.substring(this.OLrzqt));
        }

        @Override // o.C7062acj.StateListAnimator
        public boolean AYXKKw() {
            int iLastIndexOf = this.KWHzl.lastIndexOf(95);
            if (iLastIndexOf != -1) {
                while (true) {
                    int i = iLastIndexOf - 1;
                    if (i < 0 || this.KWHzl.charAt(i) != '_') {
                        break;
                    }
                    iLastIndexOf = i;
                }
                this.KWHzl = this.KWHzl.substring(0, iLastIndexOf);
                return true;
            }
            java.lang.String str = this.copydefault;
            if (str == null) {
                this.KWHzl = null;
                return false;
            }
            this.KWHzl = str;
            if (str.length() == 0) {
                this.copydefault = null;
            } else {
                this.copydefault = "";
            }
            return true;
        }

        @Override // o.C7062acj.StateListAnimator
        public boolean EZpvd(java.lang.String str) {
            return C7066acn.copydefault(copydefault(), str);
        }
    }

    /* JADX INFO: renamed from: o.acg$ActionBar */
    public static abstract class ActionBar implements C7062acj.TaskDescription {
        public final java.lang.String AEQbTJ;
        public final boolean EZpvd;

        public java.lang.Object OLrzqt(ULocale uLocale, int i, C7062acj c7062acj) {
            return null;
        }

        public ActionBar(boolean z) {
            this.EZpvd = z;
            this.AEQbTJ = null;
        }

        public ActionBar(boolean z, java.lang.String str) {
            this.EZpvd = z;
            this.AEQbTJ = str;
        }

        @Override // o.C7062acj.TaskDescription
        public java.lang.Object AEQbTJ(C7062acj.StateListAnimator stateListAnimator, C7062acj c7062acj) {
            if (!KWHzl(stateListAnimator)) {
                return null;
            }
            Activity activity = (Activity) stateListAnimator;
            return OLrzqt(activity.AEQbTJ(), activity.djBIcL(), c7062acj);
        }

        public boolean KWHzl(C7062acj.StateListAnimator stateListAnimator) {
            if (stateListAnimator == null) {
                return false;
            }
            return AEQbTJ().contains(stateListAnimator.OLrzqt());
        }

        @Override // o.C7062acj.TaskDescription
        public void copydefault(java.util.Map<java.lang.String, C7062acj.TaskDescription> map) {
            for (java.lang.String str : AEQbTJ()) {
                if (this.EZpvd) {
                    map.put(str, this);
                } else {
                    map.remove(str);
                }
            }
        }

        public java.util.Set<java.lang.String> AEQbTJ() {
            return Collections.emptySet();
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(super.toString());
            if (this.AEQbTJ != null) {
                sb.append(", name: ");
                sb.append(this.AEQbTJ);
            }
            sb.append(", visible: ");
            sb.append(this.EZpvd);
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: o.acg$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public static class Application extends ActionBar {
        public final java.lang.Object KWHzl;
        public final java.lang.String OLrzqt;
        public final int copydefault;

        public Application(java.lang.Object obj, ULocale uLocale, int i, boolean z) {
            this(obj, uLocale, i, z, null);
        }

        public Application(java.lang.Object obj, ULocale uLocale, int i, boolean z, java.lang.String str) {
            super(z, str);
            this.KWHzl = obj;
            this.OLrzqt = uLocale.getBaseName();
            this.copydefault = i;
        }

        @Override // o.C7059acg.ActionBar, o.C7062acj.TaskDescription
        public java.lang.Object AEQbTJ(C7062acj.StateListAnimator stateListAnimator, C7062acj c7062acj) {
            if (!(stateListAnimator instanceof Activity)) {
                return null;
            }
            Activity activity = (Activity) stateListAnimator;
            int i = this.copydefault;
            if ((i == -1 || i == activity.djBIcL()) && this.OLrzqt.equals(activity.OLrzqt())) {
                return this.KWHzl;
            }
            return null;
        }

        @Override // o.C7059acg.ActionBar, o.C7062acj.TaskDescription
        public void copydefault(java.util.Map<java.lang.String, C7062acj.TaskDescription> map) {
            if (this.EZpvd) {
                map.put(this.OLrzqt, this);
            } else {
                map.remove(this.OLrzqt);
            }
        }

        @Override // o.C7059acg.ActionBar
        public java.lang.String toString() {
            return super.toString() + ", id: " + this.OLrzqt + ", kind: " + this.copydefault;
        }
    }

    /* JADX INFO: renamed from: o.acg$StateListAnimator */
    public static class StateListAnimator extends ActionBar {
        public final java.lang.String KWHzl;

        public StateListAnimator() {
            this("com/ibm/icu/impl/data/icudt68b");
        }

        public StateListAnimator(java.lang.String str) {
            super(true);
            this.KWHzl = str;
        }

        @Override // o.C7059acg.ActionBar
        public java.util.Set<java.lang.String> AEQbTJ() {
            return ICUResourceBundle.AhwBna(this.KWHzl, KWHzl());
        }

        @Override // o.C7059acg.ActionBar, o.C7062acj.TaskDescription
        public void copydefault(java.util.Map<java.lang.String, C7062acj.TaskDescription> map) {
            java.util.Iterator<java.lang.String> it = ICUResourceBundle.gEmmrt(this.KWHzl, KWHzl()).iterator();
            while (it.hasNext()) {
                map.put(it.next(), this);
            }
        }

        @Override // o.C7059acg.ActionBar
        public java.lang.Object OLrzqt(ULocale uLocale, int i, C7062acj c7062acj) {
            return UResourceBundle.copydefault(this.KWHzl, uLocale, KWHzl());
        }

        public java.lang.ClassLoader KWHzl() {
            return C7016abQ.EZpvd(getClass());
        }

        @Override // o.C7059acg.ActionBar
        public java.lang.String toString() {
            return super.toString() + ", bundle: " + this.KWHzl;
        }
    }

    public java.lang.String KWHzl() {
        ULocale uLocale = ULocale.getDefault();
        if (uLocale != this.OLrzqt) {
            synchronized (this) {
                if (uLocale != this.OLrzqt) {
                    this.OLrzqt = uLocale;
                    this.copydefault = uLocale.getBaseName();
                    gEmmrt();
                }
            }
        }
        return this.copydefault;
    }

    @Override // o.C7062acj
    public C7062acj.StateListAnimator AEQbTJ(java.lang.String str) {
        return Activity.OLrzqt(str, KWHzl());
    }

    public C7062acj.StateListAnimator EZpvd(ULocale uLocale, int i) {
        return Activity.OLrzqt(uLocale, KWHzl(), i);
    }
}
