package o;

import com.okinc.account.api.model.security.otp.OtpState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C32113mPz;
import o.C52761wXj;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aTX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC6659aTX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final int AEQbTJ;
    public int EZpvd;
    public final int OLrzqt;
    public final int copydefault;
    public final java.lang.String djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int), (r2v0 int), (r3v0 java.lang.String), (r4v0 int), (r5v0 int) A[MD:(int, int, java.lang.String, int, int):void (m)] call: o.aTX.<init>(int, int, java.lang.String, int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC6659aTX(int i, int i2, java.lang.String str, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.djBIcL;
    }

    public AbstractC6659aTX(int i, int i2, java.lang.String str, int i3, int i4) {
        this.AEQbTJ = i;
        this.OLrzqt = i2;
        this.djBIcL = str;
        this.EZpvd = i3;
        this.copydefault = i4;
    }

    /* JADX INFO: renamed from: o.aTX$StateListAnimator */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aTX.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.aTX$TaskDescription */
    public static final class TaskDescription extends AbstractC6659aTX {
        public final int AYXKKw;
        public final int AhwBna;
        public int AkhnZx;
        public final int AuCTel;
        public final Function1<OtpState.NewError, java.lang.Boolean> DbNXlk;
        public final int ejfBZ;
        public final Function1<OtpState.NewError, Unit> fARcdN;
        public final int fIwbmz;
        public final int fJNWhG;
        public final boolean fetchVPNInfo;
        public final int gEmmrt;
        public final int getFieldNames;
        public final int hDKMBd;
        public boolean isConnected;
        public final int iwGUEr;
        public final int valueOf;
        public boolean values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, false, false, 0, null, null, 131071, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AYXKKw() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AhwBna() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AkhnZx() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AuCTel() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int DbNXlk() {
            return this.hDKMBd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(boolean z) {
            this.isConnected = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(int i) {
            this.AkhnZx = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(boolean z) {
            this.values = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int djBIcL() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<OtpState.NewError, java.lang.Boolean> fJNWhG() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int fetchVPNInfo() {
            return this.iwGUEr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int gEmmrt() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isConnected() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<OtpState.NewError, Unit> valueOf() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean values() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c0: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] o.ayP.Dialog.RZNAhV int) : (r20v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r37v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000f: SGET  A[WRAPPED] o.wXj.LoaderManager.giSNqX int) : (r21v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0014: ARITH (r37v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: SGET  A[WRAPPED] o.ayP.Dialog.ihnvzI int) : (r22v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001d: ARITH (r37v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0021: SGET  A[WRAPPED] o.ayP.Dialog.zOIQXb int) : (r23v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0026: ARITH (r37v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002a: SGET  A[WRAPPED] o.ayP.Dialog.call int) : (r24v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002f: ARITH (r37v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: SGET  A[WRAPPED] o.ayP.Dialog.call int) : (r25v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0038: ARITH (r37v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003c: SGET  A[WRAPPED] o.mPz.LoaderManager.OLrzqt int) : (r26v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0041: ARITH (r37v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0045: SGET  A[WRAPPED] o.mPz.LoaderManager.EZpvd int) : (r27v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004a: ARITH (r37v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004e: SGET  A[WRAPPED] o.ayP.Dialog.WS int) : (r28v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0053: ARITH (r37v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0057: SGET  A[WRAPPED] o.ayP.Dialog.KDccX int) : (r29v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005c: ARITH (r37v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r30v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0065: ARITH (r37v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r31v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006d: ARITH (r37v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0075: ARITH (r37v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r33v0 boolean) : false)
  (wrap:int:?: TERNARY null = ((wrap:int:0x007c: ARITH (r37v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0080: SGET  A[WRAPPED] o.wXj.TaskDescription.valueOf int) : (r34v0 int))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0088: ARITH (r37v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r35v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0095: ARITH (r37v0 int) & (65536 int) A[WRAPPED]) == (0 int)) ? (r36v0 kotlin.jvm.functions.Function1) : (null kotlin.jvm.functions.Function1))
 A[MD:(int, int, int, int, int, int, int, int, int, int, boolean, int, boolean, boolean, int, kotlin.jvm.functions.Function1<? super com.okinc.account.api.model.security.otp.OtpState$NewError, java.lang.Boolean>, kotlin.jvm.functions.Function1<? super com.okinc.account.api.model.security.otp.OtpState$NewError, kotlin.Unit>):void (m)] (LINE:33) call: o.aTX.TaskDescription.<init>(int, int, int, int, int, int, int, int, int, int, boolean, int, boolean, boolean, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
        public /* synthetic */ TaskDescription(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z, int i11, boolean z2, boolean z3, int i12, Function1 function1, Function1 function12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? C8206ayP.Dialog.RZNAhV : i, (i13 & 2) != 0 ? C52761wXj.LoaderManager.giSNqX : i2, (i13 & 4) != 0 ? C8206ayP.Dialog.ihnvzI : i3, (i13 & 8) != 0 ? C8206ayP.Dialog.zOIQXb : i4, (i13 & 16) != 0 ? C8206ayP.Dialog.call : i5, (i13 & 32) != 0 ? C8206ayP.Dialog.call : i6, (i13 & 64) != 0 ? C32113mPz.LoaderManager.OLrzqt : i7, (i13 & 128) != 0 ? C32113mPz.LoaderManager.EZpvd : i8, (i13 & 256) != 0 ? C8206ayP.Dialog.WS : i9, (i13 & 512) != 0 ? C8206ayP.Dialog.KDccX : i10, (i13 & 1024) != 0 ? false : z, (i13 & 2048) != 0 ? 0 : i11, (i13 & 4096) != 0 ? false : z2, (i13 & 8192) == 0 ? z3 : false, (i13 & 16384) != 0 ? C52761wXj.TaskDescription.valueOf : i12, (i13 & 32768) != 0 ? null : function1, (i13 & 65536) == 0 ? function12 : null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r24v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.account.api.model.security.otp.OtpState$NewError, java.lang.Boolean> */
        /* JADX DEBUG: Multi-variable search result rejected for r25v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.account.api.model.security.otp.OtpState$NewError, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z, int i11, boolean z2, boolean z3, int i12, Function1<? super OtpState.NewError, java.lang.Boolean> function1, Function1<? super OtpState.NewError, Unit> function12) {
            super(i, i3, "TAG_NEW_MOBILE", i2, i12, null);
            this.iwGUEr = i;
            this.getFieldNames = i2;
            this.gEmmrt = i3;
            this.hDKMBd = i4;
            this.AuCTel = i5;
            this.ejfBZ = i6;
            this.fJNWhG = i7;
            this.fIwbmz = i8;
            this.AhwBna = i9;
            this.AYXKKw = i10;
            this.fetchVPNInfo = z;
            this.AkhnZx = i11;
            this.values = z2;
            this.isConnected = z3;
            this.valueOf = i12;
            this.DbNXlk = function1;
            this.fARcdN = function12;
        }
    }

    /* JADX INFO: renamed from: o.aTX$Activity */
    public static final class Activity extends AbstractC6659aTX {
        public final Function1<OtpState.NewError, java.lang.Boolean> AYXKKw;
        public final int AhwBna;
        public final int AkhnZx;
        public final int gEmmrt;
        public final int isConnected;
        public final Function1<OtpState.NewError, Unit> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(0, 0, 0, 0, null, null, 63, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<OtpState.NewError, Unit> EZpvd() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<OtpState.NewError, java.lang.Boolean> KWHzl() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.ayP.Dialog.iHkeWl int) : (r5v0 int))
  (wrap:int:0x000c: TERNARY null = ((wrap:int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x000a: SGET  A[WRAPPED] o.wXj.LoaderManager.giSNqX int) : (r6v0 int))
  (wrap:int:0x0013: TERNARY null = ((wrap:int:0x000d: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0011: SGET  A[WRAPPED] o.ayP.Dialog.ihnvzI int) : (r7v0 int))
  (wrap:int:0x001a: TERNARY null = ((wrap:int:0x0014: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0018: SGET  A[WRAPPED] o.wXj.TaskDescription.valueOf int) : (r8v0 int))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x001b: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r9v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0023: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r10v0 kotlin.jvm.functions.Function1))
 A[MD:(int, int, int, int, kotlin.jvm.functions.Function1<? super com.okinc.account.api.model.security.otp.OtpState$NewError, java.lang.Boolean>, kotlin.jvm.functions.Function1<? super com.okinc.account.api.model.security.otp.OtpState$NewError, kotlin.Unit>):void (m)] (LINE:60) call: o.aTX.Activity.<init>(int, int, int, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
        public /* synthetic */ Activity(int i, int i2, int i3, int i4, Function1 function1, Function1 function12, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? C8206ayP.Dialog.iHkeWl : i, (i5 & 2) != 0 ? C52761wXj.LoaderManager.giSNqX : i2, (i5 & 4) != 0 ? C8206ayP.Dialog.ihnvzI : i3, (i5 & 8) != 0 ? C52761wXj.TaskDescription.valueOf : i4, (i5 & 16) != 0 ? null : function1, (i5 & 32) != 0 ? null : function12);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.account.api.model.security.otp.OtpState$NewError, java.lang.Boolean> */
        /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.account.api.model.security.otp.OtpState$NewError, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(int i, int i2, int i3, int i4, Function1<? super OtpState.NewError, java.lang.Boolean> function1, Function1<? super OtpState.NewError, Unit> function12) {
            super(i, i3, "TAG_NEW_EMAIL", i2, i4, null);
            this.isConnected = i;
            this.AkhnZx = i2;
            this.gEmmrt = i3;
            this.AhwBna = i4;
            this.AYXKKw = function1;
            this.valueOf = function12;
        }
    }

    /* JADX INFO: renamed from: o.aTX$ActionBar */
    public static final class ActionBar extends AbstractC6659aTX {
        public final int AYXKKw;
        public final int AhwBna;
        public final int gEmmrt;
        public final int valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(0, 0, 0, 0, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.ayP.Dialog.UccSpe int) : (r1v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x000a: SGET  A[WRAPPED] o.wXj.LoaderManager.giSNqX int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0010: SGET  A[WRAPPED] o.ayP.Dialog.ihnvzI int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0016: SGET  A[WRAPPED] o.wXj.TaskDescription.valueOf int) : (r4v0 int))
 A[MD:(int, int, int, int):void (m)] (LINE:76) call: o.aTX.ActionBar.<init>(int, int, int, int):void type: THIS */
        public /* synthetic */ ActionBar(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? C8206ayP.Dialog.UccSpe : i, (i5 & 2) != 0 ? C52761wXj.LoaderManager.giSNqX : i2, (i5 & 4) != 0 ? C8206ayP.Dialog.ihnvzI : i3, (i5 & 8) != 0 ? C52761wXj.TaskDescription.valueOf : i4);
        }

        public ActionBar(int i, int i2, int i3, int i4) {
            super(i, i3, "TAG_NEW_GOOGLE", i2, i4, null);
            this.valueOf = i;
            this.AYXKKw = i2;
            this.AhwBna = i3;
            this.gEmmrt = i4;
        }
    }
}
