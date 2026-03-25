package o;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aUt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6733aUt {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aUt.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC6733aUt(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.aUt$StateListAnimator */
    public static final class StateListAnimator extends AbstractC6733aUt {
        public static final StateListAnimator KWHzl = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    private AbstractC6733aUt() {
    }

    /* JADX INFO: renamed from: o.aUt$Activity */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class Activity extends AbstractC6733aUt {
        public int AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final OtpEventTracker.OtpEventType OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, OtpEventTracker.OtpEventType otpEventType, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = activity.KWHzl;
            }
            if ((i2 & 2) != 0) {
                str2 = activity.copydefault;
            }
            java.lang.String str5 = str2;
            if ((i2 & 4) != 0) {
                str3 = activity.AYXKKw;
            }
            java.lang.String str6 = str3;
            if ((i2 & 8) != 0) {
                str4 = activity.EZpvd;
            }
            java.lang.String str7 = str4;
            if ((i2 & 16) != 0) {
                otpEventType = activity.OLrzqt;
            }
            OtpEventTracker.OtpEventType otpEventType2 = otpEventType;
            if ((i2 & 32) != 0) {
                i = activity.AEQbTJ;
            }
            return activity.copydefault(str, str5, str6, str7, otpEventType2, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull OtpEventTracker.OtpEventType otpEventType, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(otpEventType, "");
            return new Activity(str, str2, str3, str4, otpEventType, i);
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
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) activity.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && this.OLrzqt == activity.OLrzqt && this.AEQbTJ == activity.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.KWHzl.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ForgetPassword(email=" + this.KWHzl + ", areaCode=" + this.copydefault + ", phone=" + this.AYXKKw + ", okToken=" + this.EZpvd + ", otpEventType=" + this.OLrzqt + ", msgType=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull OtpEventTracker.OtpEventType otpEventType, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(otpEventType, "");
            this.KWHzl = str;
            this.copydefault = str2;
            this.AYXKKw = str3;
            this.EZpvd = str4;
            this.OLrzqt = otpEventType;
            this.AEQbTJ = i;
        }
    }

    /* JADX INFO: renamed from: o.aUt$PendingIntent */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class PendingIntent extends AbstractC6733aUt {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pendingIntent.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = pendingIntent.KWHzl;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = pendingIntent.copydefault;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = pendingIntent.AEQbTJ;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = pendingIntent.EZpvd;
            }
            return pendingIntent.EZpvd(str, str6, str7, str8, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new PendingIntent(str, str2, str3, str4, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PendingIntent)) {
                return false;
            }
            PendingIntent pendingIntent = (PendingIntent) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) pendingIntent.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) pendingIntent.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) pendingIntent.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) pendingIntent.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) pendingIntent.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            int iHashCode2 = this.KWHzl.hashCode();
            int iHashCode3 = this.copydefault.hashCode();
            int iHashCode4 = this.AEQbTJ.hashCode();
            java.lang.String str = this.EZpvd;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Rebind2fa(email=" + this.OLrzqt + ", token=" + this.KWHzl + ", areaCode=" + this.copydefault + ", phone=" + this.AEQbTJ + ", userId=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:113) call: o.aUt.PendingIntent.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ PendingIntent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? null : str5);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.OLrzqt = str;
            this.KWHzl = str2;
            this.copydefault = str3;
            this.AEQbTJ = str4;
            this.EZpvd = str5;
        }
    }

    /* JADX INFO: renamed from: o.aUt$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class Application extends AbstractC6733aUt {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = application.KWHzl;
            }
            java.lang.String str7 = str2;
            if ((i & 4) != 0) {
                str3 = application.AEQbTJ;
            }
            java.lang.String str8 = str3;
            if ((i & 8) != 0) {
                str4 = application.EZpvd;
            }
            java.lang.String str9 = str4;
            if ((i & 16) != 0) {
                str5 = application.valueOf;
            }
            java.lang.String str10 = str5;
            if ((i & 32) != 0) {
                str6 = application.copydefault;
            }
            return application.AEQbTJ(str, str7, str8, str9, str10, str6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, @NotNull java.lang.String str6) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return new Application(str, str2, str3, str4, str5, str6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) application.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            int iHashCode2 = this.KWHzl.hashCode();
            int iHashCode3 = this.AEQbTJ.hashCode();
            int iHashCode4 = this.EZpvd.hashCode();
            java.lang.String str = this.valueOf;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ForgetPasswordRebind2fa(email=" + this.OLrzqt + ", token=" + this.KWHzl + ", areaCode=" + this.AEQbTJ + ", phone=" + this.EZpvd + ", userId=" + this.valueOf + ", loginName=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:0x0023: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:121) call: o.aUt.Application.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Application(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? "" : str6);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, @NotNull java.lang.String str6) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.OLrzqt = str;
            this.KWHzl = str2;
            this.AEQbTJ = str3;
            this.EZpvd = str4;
            this.valueOf = str5;
            this.copydefault = str6;
        }
    }

    /* JADX INFO: renamed from: o.aUt$ActionBar */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class ActionBar extends AbstractC6733aUt {
        public final java.lang.String AEQbTJ;
        public final java.lang.Integer EZpvd;
        public final java.lang.String KWHzl;
        public final int OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = actionBar.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                str = actionBar.AEQbTJ;
            }
            java.lang.String str4 = str;
            if ((i2 & 4) != 0) {
                str2 = actionBar.KWHzl;
            }
            java.lang.String str5 = str2;
            if ((i2 & 8) != 0) {
                str3 = actionBar.copydefault;
            }
            java.lang.String str6 = str3;
            if ((i2 & 16) != 0) {
                num = actionBar.EZpvd;
            }
            return actionBar.AEQbTJ(i, str4, str5, str6, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new ActionBar(i, str, str2, str3, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.OLrzqt == actionBar.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault) && Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Integer.hashCode(this.OLrzqt);
            int iHashCode2 = this.AEQbTJ.hashCode();
            int iHashCode3 = this.KWHzl.hashCode();
            int iHashCode4 = this.copydefault.hashCode();
            java.lang.Integer num = this.EZpvd;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num == null ? 0 : num.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CombineAccountKyc(behavior=" + this.OLrzqt + ", email=" + this.AEQbTJ + ", areaCode=" + this.KWHzl + ", phone=" + this.copydefault + ", ticketId=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.OLrzqt = i;
            this.AEQbTJ = str;
            this.KWHzl = str2;
            this.copydefault = str3;
            this.EZpvd = num;
        }
    }

    /* JADX INFO: renamed from: o.aUt$TaskDescription */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class TaskDescription extends AbstractC6733aUt {
        public final OtpEventTracker.OtpEventType OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, OtpEventTracker.OtpEventType otpEventType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                otpEventType = taskDescription.OLrzqt;
            }
            return taskDescription.OLrzqt(otpEventType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull OtpEventTracker.OtpEventType otpEventType) {
            Intrinsics.checkNotNullParameter(otpEventType, "");
            return new TaskDescription(otpEventType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && this.OLrzqt == ((TaskDescription) obj).OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ChangePhoneOption(otpEventType=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull OtpEventTracker.OtpEventType otpEventType) {
            super(null);
            Intrinsics.checkNotNullParameter(otpEventType, "");
            this.OLrzqt = otpEventType;
        }
    }
}
