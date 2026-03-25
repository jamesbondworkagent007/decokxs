package o;

/* JADX INFO: renamed from: o.adO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7094adO {
    public java.lang.String AEQbTJ;
    public volatile transient int OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;
    public java.lang.String valueOf;
    public static final StateListAnimator KWHzl = new StateListAnimator();
    public static final C7094adO EZpvd = AEQbTJ("", "", "", "");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String copydefault() {
        return this.djBIcL;
    }

    public C7094adO(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.AEQbTJ = "";
        this.valueOf = "";
        this.copydefault = "";
        this.djBIcL = "";
        this.OLrzqt = 0;
        if (str != null) {
            this.AEQbTJ = C7090adK.AEQbTJ(str).intern();
        }
        if (str2 != null) {
            this.valueOf = C7090adK.copydefault(str2).intern();
        }
        if (str3 != null) {
            this.copydefault = C7090adK.valueOf(str3).intern();
        }
        if (str4 != null) {
            this.djBIcL = C7090adK.valueOf(str4).intern();
        }
    }

    public static C7094adO AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return KWHzl.copydefault(new Activity(str, str2, str3, str4));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7094adO)) {
            return false;
        }
        C7094adO c7094adO = (C7094adO) obj;
        return hashCode() == c7094adO.hashCode() && this.AEQbTJ.equals(c7094adO.AEQbTJ) && this.valueOf.equals(c7094adO.valueOf) && this.copydefault.equals(c7094adO.copydefault) && this.djBIcL.equals(c7094adO.djBIcL);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.AEQbTJ.length() > 0) {
            sb.append("language=");
            sb.append(this.AEQbTJ);
        }
        if (this.valueOf.length() > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("script=");
            sb.append(this.valueOf);
        }
        if (this.copydefault.length() > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("region=");
            sb.append(this.copydefault);
        }
        if (this.djBIcL.length() > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("variant=");
            sb.append(this.djBIcL);
        }
        return sb.toString();
    }

    public int hashCode() {
        int iCharAt = this.OLrzqt;
        if (iCharAt == 0) {
            for (int i = 0; i < this.AEQbTJ.length(); i++) {
                iCharAt = (iCharAt * 31) + this.AEQbTJ.charAt(i);
            }
            for (int i2 = 0; i2 < this.valueOf.length(); i2++) {
                iCharAt = (iCharAt * 31) + this.valueOf.charAt(i2);
            }
            for (int i3 = 0; i3 < this.copydefault.length(); i3++) {
                iCharAt = (iCharAt * 31) + this.copydefault.charAt(i3);
            }
            for (int i4 = 0; i4 < this.djBIcL.length(); i4++) {
                iCharAt = (iCharAt * 31) + this.djBIcL.charAt(i4);
            }
            this.OLrzqt = iCharAt;
        }
        return iCharAt;
    }

    /* JADX INFO: renamed from: o.adO$Activity */
    public static class Activity implements java.lang.Comparable<Activity> {
        public volatile int AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;

        public Activity(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            this.OLrzqt = "";
            this.EZpvd = "";
            this.copydefault = "";
            this.KWHzl = "";
            if (str != null) {
                this.OLrzqt = str;
            }
            if (str2 != null) {
                this.EZpvd = str2;
            }
            if (str3 != null) {
                this.copydefault = str3;
            }
            if (str4 != null) {
                this.KWHzl = str4;
            }
        }

        public boolean equals(java.lang.Object obj) {
            if (this != obj) {
                if (obj instanceof Activity) {
                    Activity activity = (Activity) obj;
                    if (!C7090adK.copydefault(activity.OLrzqt, this.OLrzqt) || !C7090adK.copydefault(activity.EZpvd, this.EZpvd) || !C7090adK.copydefault(activity.copydefault, this.copydefault) || !C7090adK.copydefault(activity.KWHzl, this.KWHzl)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
        public int compareTo(Activity activity) {
            int iOLrzqt = C7090adK.OLrzqt(this.OLrzqt, activity.OLrzqt);
            if (iOLrzqt != 0) {
                return iOLrzqt;
            }
            int iOLrzqt2 = C7090adK.OLrzqt(this.EZpvd, activity.EZpvd);
            if (iOLrzqt2 != 0) {
                return iOLrzqt2;
            }
            int iOLrzqt3 = C7090adK.OLrzqt(this.copydefault, activity.copydefault);
            return iOLrzqt3 == 0 ? C7090adK.OLrzqt(this.KWHzl, activity.KWHzl) : iOLrzqt3;
        }

        public int hashCode() {
            int iAEQbTJ = this.AEQbTJ;
            if (iAEQbTJ == 0) {
                for (int i = 0; i < this.OLrzqt.length(); i++) {
                    iAEQbTJ = (iAEQbTJ * 31) + C7090adK.AEQbTJ(this.OLrzqt.charAt(i));
                }
                for (int i2 = 0; i2 < this.EZpvd.length(); i2++) {
                    iAEQbTJ = (iAEQbTJ * 31) + C7090adK.AEQbTJ(this.EZpvd.charAt(i2));
                }
                for (int i3 = 0; i3 < this.copydefault.length(); i3++) {
                    iAEQbTJ = (iAEQbTJ * 31) + C7090adK.AEQbTJ(this.copydefault.charAt(i3));
                }
                for (int i4 = 0; i4 < this.KWHzl.length(); i4++) {
                    iAEQbTJ = (iAEQbTJ * 31) + C7090adK.AEQbTJ(this.KWHzl.charAt(i4));
                }
                this.AEQbTJ = iAEQbTJ;
            }
            return iAEQbTJ;
        }

        public static Activity AEQbTJ(Activity activity) {
            return new Activity(C7090adK.AEQbTJ(activity.OLrzqt).intern(), C7090adK.copydefault(activity.EZpvd).intern(), C7090adK.valueOf(activity.copydefault).intern(), C7090adK.valueOf(activity.KWHzl).intern());
        }
    }

    /* JADX INFO: renamed from: o.adO$StateListAnimator */
    public static class StateListAnimator extends AbstractC7097adR<Activity, C7094adO> {
        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.AbstractC7097adR
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public Activity EZpvd(Activity activity) {
            return Activity.AEQbTJ(activity);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.AbstractC7097adR
        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public C7094adO KWHzl(Activity activity) {
            return new C7094adO(activity.OLrzqt, activity.EZpvd, activity.copydefault, activity.KWHzl);
        }
    }
}
