package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10168bjP {

    /* JADX INFO: renamed from: o.bjP$LoaderManager */
    public static final class LoaderManager extends AbstractC10168bjP {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bjP.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC10168bjP(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC10168bjP() {
    }

    /* JADX INFO: renamed from: o.bjP$StateListAnimator */
    public static final class StateListAnimator extends AbstractC10168bjP {
        public final java.lang.String AEQbTJ;
        public final java.lang.CharSequence copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence KWHzl() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.CharSequence charSequence) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.AEQbTJ = str;
            this.copydefault = charSequence;
        }
    }

    /* JADX INFO: renamed from: o.bjP$TaskDescription */
    public static final class TaskDescription extends AbstractC10168bjP {
        public final java.lang.String AEQbTJ;
        public final boolean AYXKKw;
        public final boolean AhwBna;
        public final java.lang.String AkhnZx;
        public final int DbNXlk;
        public final long EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final int copydefault;
        public final java.lang.String djBIcL;
        public final boolean fetchVPNInfo;
        public final boolean gEmmrt;
        public final boolean valueOf;
        public final int values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AYXKKw() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AkhnZx() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int DbNXlk() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean fetchVPNInfo() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isConnected() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int valueOf() {
            return this.values;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005d: CONSTRUCTOR 
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r35v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r26v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0013: ARITH (r35v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r27v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r35v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r29v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0035: ARITH (r35v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r31v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x003d: ARITH (r35v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r32v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0048: ARITH (r35v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, int, boolean, boolean, java.lang.String, int, long, boolean):void (m)] (LINE:867) call: o.bjP.TaskDescription.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, int, boolean, boolean, java.lang.String, int, long, boolean):void type: THIS */
        public /* synthetic */ TaskDescription(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, boolean z, boolean z2, int i2, boolean z3, boolean z4, java.lang.String str5, int i3, long j, boolean z5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, i, (i4 & 32) != 0 ? false : z, (i4 & 64) != 0 ? false : z2, (i4 & 128) != 0 ? 0 : i2, (i4 & 256) != 0 ? false : z3, (i4 & 512) != 0 ? false : z4, (i4 & 1024) != 0 ? "" : str5, (i4 & 2048) != 0 ? 0 : i3, (i4 & 4096) != 0 ? -1L : j, (i4 & 8192) != 0 ? false : z5);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @androidx.annotation.ColorInt int i, boolean z, boolean z2, int i2, boolean z3, boolean z4, @NotNull java.lang.String str5, int i3, long j, boolean z5) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.djBIcL = str;
            this.OLrzqt = str2;
            this.KWHzl = str3;
            this.AEQbTJ = str4;
            this.copydefault = i;
            this.valueOf = z;
            this.AYXKKw = z2;
            this.DbNXlk = i2;
            this.gEmmrt = z3;
            this.AhwBna = z4;
            this.AkhnZx = str5;
            this.values = i3;
            this.EZpvd = j;
            this.fetchVPNInfo = z5;
        }
    }

    /* JADX INFO: renamed from: o.bjP$Application */
    public static final class Application extends AbstractC10168bjP {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.CharSequence KWHzl;
        public final float OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.CharSequence gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence KWHzl() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull java.lang.String str, float f, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.AEQbTJ = str;
            this.OLrzqt = f;
            this.gEmmrt = charSequence;
            this.KWHzl = charSequence2;
            this.EZpvd = str2;
            this.copydefault = str3;
        }
    }

    /* JADX INFO: renamed from: o.bjP$Activity */
    public static final class Activity extends AbstractC10168bjP {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AYXKKw;
        public final int AhwBna;
        public final java.lang.CharSequence EZpvd;
        public final long KWHzl;
        public final java.lang.CharSequence OLrzqt;
        public final boolean copydefault;
        public final java.lang.String gEmmrt;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.valueOf;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.CharSequence)
  (r17v0 java.lang.String)
  (r18v0 java.lang.CharSequence)
  (r19v0 int)
  (r20v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : (r23v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.CharSequence, java.lang.String, java.lang.CharSequence, int, long, java.lang.String, boolean):void (m)] (LINE:891) call: o.bjP.Activity.<init>(java.lang.String, java.lang.String, java.lang.CharSequence, java.lang.String, java.lang.CharSequence, int, long, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ Activity(java.lang.String str, java.lang.String str2, java.lang.CharSequence charSequence, java.lang.String str3, java.lang.CharSequence charSequence2, int i, long j, java.lang.String str4, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, charSequence, str3, charSequence2, i, j, (i2 & 128) != 0 ? "" : str4, (i2 & 256) != 0 ? true : z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String str3, @NotNull java.lang.CharSequence charSequence2, @androidx.annotation.ColorInt int i, long j, @NotNull java.lang.String str4, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(charSequence2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.gEmmrt = str;
            this.valueOf = str2;
            this.EZpvd = charSequence;
            this.AEQbTJ = str3;
            this.OLrzqt = charSequence2;
            this.AhwBna = i;
            this.KWHzl = j;
            this.AYXKKw = str4;
            this.copydefault = z;
        }
    }

    /* JADX INFO: renamed from: o.bjP$ActionBar */
    public static final class ActionBar extends AbstractC10168bjP {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = str;
            this.EZpvd = str2;
        }
    }
}
