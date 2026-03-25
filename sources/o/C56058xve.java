package o;

import com.appsflyer.AppsFlyerProperties;
import com.okinc.tradeapi.bean.RouteData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@yCR
public final class C56058xve {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final yDQ<Activity> EZpvd = new yDQ<>();
    public boolean OLrzqt;
    public java.util.HashMap<java.lang.String, java.lang.String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.util.HashMap<java.lang.String, java.lang.String> map) {
        this.copydefault = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.String, java.lang.String> OLrzqt() {
        java.util.HashMap<java.lang.String, java.lang.String> map = this.copydefault;
        this.copydefault = null;
        return map;
    }

    public final void copydefault() {
    }

    @yCM
    public C56058xve() {
    }

    /* JADX INFO: renamed from: o.xve$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xve.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C56058xve copydefault() {
            return ((InterfaceC55864xrw) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC55864xrw.class)).init();
        }
    }

    public final void KWHzl(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        java.lang.String str8;
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str4)) {
            str8 = "push: channel: " + str + ", channelDetails: " + str2 + ", activityId: " + str3 + ", utmMedium: " + str4 + ", utmSource: " + str5 + ", utmTerm: " + str6 + ", strategyType: " + str7;
        } else {
            str8 = "push: channel: " + str + ", channelDetails: " + str2 + ", activityId: " + str3;
        }
        pUU.EZpvd("BotChannelStackRepo", str8);
        this.EZpvd.addLast(new Activity(str, str2, str3, null, null, str4, str5, str6, str7, 24, null));
        copydefault();
    }

    public final void AEQbTJ(@NotNull Activity activity) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(activity, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) activity.djBIcL())) {
            str = "push: channel: " + activity.copydefault() + ", channelDetails: " + activity.KWHzl() + ", activityId: " + activity.AEQbTJ() + ", utmMedium: " + activity.djBIcL() + ", utmSource: " + activity.AYXKKw() + ", utmTerm: " + activity.valueOf() + ", strategyType: " + activity.EZpvd();
        } else {
            str = "push: channel: " + activity.copydefault() + ", channelDetails: " + activity.KWHzl() + ", activityId: " + activity.AEQbTJ();
        }
        pUU.EZpvd("BotChannelStackRepo", str);
        this.EZpvd.addLast(activity);
        copydefault();
    }

    public final void KWHzl() {
        if (this.OLrzqt) {
            this.OLrzqt = false;
        } else {
            this.EZpvd.clear();
            pUU.EZpvd("BotChannelStackRepo", "clear all channels");
        }
    }

    public final Activity EZpvd() {
        return this.EZpvd.EZpvd();
    }

    /* JADX INFO: renamed from: o.xve$Activity */
    public static final class Activity {
        public static final StateListAnimator Companion = new StateListAnimator(null);
        public final java.lang.Integer AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String AhwBna;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String djBIcL;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(str, str2, str3, str4, num, str5, str6, str7, str8);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) activity.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) activity.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) activity.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) activity.valueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            java.lang.String str = this.EZpvd;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.KWHzl;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.copydefault;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            java.lang.Integer num = this.AEQbTJ;
            int iHashCode5 = num == null ? 0 : num.hashCode();
            java.lang.String str4 = this.djBIcL;
            int iHashCode6 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.AhwBna;
            int iHashCode7 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.AYXKKw;
            int iHashCode8 = str6 == null ? 0 : str6.hashCode();
            java.lang.String str7 = this.valueOf;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str7 != null ? str7.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Props(channel=" + this.OLrzqt + ", channelDetails=" + this.EZpvd + ", activityId=" + this.KWHzl + ", cardId=" + this.copydefault + ", position=" + this.AEQbTJ + ", utmMedium=" + this.djBIcL + ", utmSource=" + this.AhwBna + ", utmTerm=" + this.AYXKKw + ", strategyType=" + this.valueOf + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AYXKKw;
        }

        public Activity(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
            this.EZpvd = str2;
            this.KWHzl = str3;
            this.copydefault = str4;
            this.AEQbTJ = num;
            this.djBIcL = str5;
            this.AhwBna = str6;
            this.AYXKKw = str7;
            this.valueOf = str8;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004c: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0018: ARITH (r19v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r14v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r19v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r19v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r19v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r19v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:137) call: o.xve.Activity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Activity(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) == 0 ? str8 : null);
        }

        /* JADX INFO: renamed from: o.xve$Activity$StateListAnimator */
        public static final class StateListAnimator {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xve.Activity.StateListAnimator.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private StateListAnimator() {
            }

            public final Activity copydefault(@NotNull android.os.Bundle bundle) {
                Intrinsics.checkNotNullParameter(bundle, "");
                java.lang.String string = bundle.getString(AppsFlyerProperties.CHANNEL);
                if (string == null) {
                    string = "";
                }
                if (string.length() == 0) {
                    java.lang.String string2 = bundle.getString(RouteData.FROM_PAGE_SUB_SOURCE);
                    string = string2 != null ? string2 : "";
                }
                if (string.length() == 0) {
                    string = "trade_bot_main_page";
                }
                java.lang.String str = string;
                java.lang.String string3 = bundle.getString("channel_details");
                java.lang.String string4 = bundle.getString("card_id");
                java.lang.Object obj = bundle.get("card_position");
                java.lang.Integer numValueOf = obj != null ? java.lang.Integer.valueOf(C33129mqd.AhwBna(obj)) : null;
                java.lang.Object obj2 = bundle.get("activity_id");
                java.lang.String strGEmmrt = obj2 != null ? C33129mqd.gEmmrt(obj2) : null;
                java.lang.Object obj3 = bundle.get("utm_medium");
                java.lang.String strGEmmrt2 = obj3 != null ? C33129mqd.gEmmrt(obj3) : null;
                java.lang.Object obj4 = bundle.get("utm_source");
                java.lang.String strGEmmrt3 = obj4 != null ? C33129mqd.gEmmrt(obj4) : null;
                java.lang.Object obj5 = bundle.get("utm_term");
                return new Activity(str, string3, strGEmmrt, string4, numValueOf, strGEmmrt2, strGEmmrt3, obj5 != null ? C33129mqd.gEmmrt(obj5) : null, null, 256, null);
            }
        }
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str) {
        int iNextIndex;
        Intrinsics.checkNotNullParameter(str, "");
        yDQ<Activity> ydq = this.EZpvd;
        java.util.ListIterator<Activity> listIterator = ydq.listIterator(ydq.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (Intrinsics.EZpvd((java.lang.Object) listIterator.previous().copydefault(), (java.lang.Object) str)) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex == -1) {
            return false;
        }
        this.EZpvd.remove(iNextIndex);
        pUU.EZpvd("BotChannelStackRepo", "removed channel: " + str);
        copydefault();
        return true;
    }
}
