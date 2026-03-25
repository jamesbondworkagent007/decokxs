package o;

import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public abstract class qFL {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public float KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qFL.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ qFL(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract float AEQbTJ();

    public abstract java.lang.String EZpvd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(float f) {
        this.KWHzl = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault() {
        this.KWHzl = 14.0f;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qFL.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    private qFL() {
    }

    public final float KWHzl() {
        return AEQbTJ() + this.KWHzl;
    }

    public static final class VoiceInteractor extends qFL {
        public final float AEQbTJ;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor() {
            this(0.0f, null, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public float AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (12.003f float) : (r1v0 float))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("SPOT") : (r2v0 java.lang.String))
 A[MD:(float, java.lang.String):void (m)] (LINE:76) call: o.qFL.VoiceInteractor.<init>(float, java.lang.String):void type: THIS */
        public /* synthetic */ VoiceInteractor(float f, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 12.003f : f, (i & 2) != 0 ? "SPOT" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VoiceInteractor(float f, @NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = f;
            this.copydefault = str;
        }
    }

    public static final class FragmentManager extends qFL {
        public final float OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
            this(0.0f, null, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public float AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (12.002f float) : (r1v0 float))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("FUTURES") : (r2v0 java.lang.String))
 A[MD:(float, java.lang.String):void (m)] (LINE:82) call: o.qFL.FragmentManager.<init>(float, java.lang.String):void type: THIS */
        public /* synthetic */ FragmentManager(float f, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 12.002f : f, (i & 2) != 0 ? "FUTURES" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentManager(float f, @NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = f;
            this.copydefault = str;
        }
    }

    public static final class StateListAnimator extends qFL {
        public final float AEQbTJ;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(0.0f, null, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public float AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (12.001f float) : (r1v0 float))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("DEX") : (r2v0 java.lang.String))
 A[MD:(float, java.lang.String):void (m)] (LINE:88) call: o.qFL.StateListAnimator.<init>(float, java.lang.String):void type: THIS */
        public /* synthetic */ StateListAnimator(float f, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 12.001f : f, (i & 2) != 0 ? "DEX" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(float f, @NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = f;
            this.OLrzqt = str;
        }
    }

    public static final class TaskStackBuilder extends qFL {
        public final float OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder() {
            this(0.0f, null, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public float AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (11.0f float) : (r1v0 float))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x000a: SGET  A[WRAPPED] com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData.SERVICE_NAME_P2P java.lang.String) : (r2v0 java.lang.String))
 A[MD:(float, java.lang.String):void (m)] (LINE:94) call: o.qFL.TaskStackBuilder.<init>(float, java.lang.String):void type: THIS */
        public /* synthetic */ TaskStackBuilder(float f, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 11.0f : f, (i & 2) != 0 ? CustomMessageData.SERVICE_NAME_P2P : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskStackBuilder(float f, @NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = f;
            this.copydefault = str;
        }
    }

    public static final class PendingIntent extends qFL {
        public final float AEQbTJ;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
            this(0.0f, null, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public float AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (10.0f float) : (r1v0 float))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("OPTION") : (r2v0 java.lang.String))
 A[MD:(float, java.lang.String):void (m)] (LINE:100) call: o.qFL.PendingIntent.<init>(float, java.lang.String):void type: THIS */
        public /* synthetic */ PendingIntent(float f, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 10.0f : f, (i & 2) != 0 ? "OPTION" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(float f, @NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = f;
            this.copydefault = str;
        }
    }

    public static final class Dialog extends qFL {
        public final float AEQbTJ;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
            this(0.0f, null, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public float AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (9.0f float) : (r1v0 float))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("EARN") : (r2v0 java.lang.String))
 A[MD:(float, java.lang.String):void (m)] (LINE:106) call: o.qFL.Dialog.<init>(float, java.lang.String):void type: THIS */
        public /* synthetic */ Dialog(float f, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 9.0f : f, (i & 2) != 0 ? "EARN" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(float f, @NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = f;
            this.OLrzqt = str;
        }
    }

    public static final class TaskDescription extends qFL {
        public final java.lang.String AEQbTJ;
        public final float OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(0.0f, null, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public float AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (8.0f float) : (r1v0 float))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("BOT") : (r2v0 java.lang.String))
 A[MD:(float, java.lang.String):void (m)] (LINE:112) call: o.qFL.TaskDescription.<init>(float, java.lang.String):void type: THIS */
        public /* synthetic */ TaskDescription(float f, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 8.0f : f, (i & 2) != 0 ? "BOT" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(float f, @NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = f;
            this.AEQbTJ = str;
        }
    }

    public static final class SharedElementCallback extends qFL {
        public final java.lang.String AEQbTJ;
        public final float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback() {
            this(0.0f, null, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public float AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (7.0f float) : (r1v0 float))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("TRADER") : (r2v0 java.lang.String))
 A[MD:(float, java.lang.String):void (m)] (LINE:118) call: o.qFL.SharedElementCallback.<init>(float, java.lang.String):void type: THIS */
        public /* synthetic */ SharedElementCallback(float f, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 7.0f : f, (i & 2) != 0 ? "TRADER" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SharedElementCallback(float f, @NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = f;
            this.AEQbTJ = str;
        }
    }

    public static final class Fragment extends qFL {
        public final java.lang.String AEQbTJ;
        public final float OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
            this(0.0f, null, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public float AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (6.0f float) : (r1v0 float))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("FEED") : (r2v0 java.lang.String))
 A[MD:(float, java.lang.String):void (m)] (LINE:124) call: o.qFL.Fragment.<init>(float, java.lang.String):void type: THIS */
        public /* synthetic */ Fragment(float f, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 6.0f : f, (i & 2) != 0 ? "FEED" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fragment(float f, @NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = f;
            this.AEQbTJ = str;
        }
    }

    public static final class LoaderManager extends qFL {
        public final java.lang.String AEQbTJ;
        public final float OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
            this(0.0f, null, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public float AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (5.0f float) : (r1v0 float))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x000a: SGET  A[WRAPPED] com.okinc.p2p.api.OtcExtraKeys.IM java.lang.String) : (r2v0 java.lang.String))
 A[MD:(float, java.lang.String):void (m)] (LINE:130) call: o.qFL.LoaderManager.<init>(float, java.lang.String):void type: THIS */
        public /* synthetic */ LoaderManager(float f, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 5.0f : f, (i & 2) != 0 ? OtcExtraKeys.IM : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoaderManager(float f, @NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = f;
            this.AEQbTJ = str;
        }
    }

    public static final class Application extends qFL {
        public final java.lang.String AEQbTJ;
        public final float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(0.0f, null, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public float AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (4.0f float) : (r1v0 float))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x000a: SGET  A[WRAPPED] com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData.SERVICE_NAME_CAMPAIGN java.lang.String) : (r2v0 java.lang.String))
 A[MD:(float, java.lang.String):void (m)] (LINE:135) call: o.qFL.Application.<init>(float, java.lang.String):void type: THIS */
        public /* synthetic */ Application(float f, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 4.0f : f, (i & 2) != 0 ? CustomMessageData.SERVICE_NAME_CAMPAIGN : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(float f, @NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = f;
            this.AEQbTJ = str;
        }
    }

    public static final class ActionBar extends qFL {
        public final float OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(0.0f, null, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public float AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.qFL
        public java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (3.0f float) : (r1v0 float))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("Announcement") : (r2v0 java.lang.String))
 A[MD:(float, java.lang.String):void (m)] (LINE:141) call: o.qFL.ActionBar.<init>(float, java.lang.String):void type: THIS */
        public /* synthetic */ ActionBar(float f, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 3.0f : f, (i & 2) != 0 ? "Announcement" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(float f, @NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = f;
            this.copydefault = str;
        }
    }
}
