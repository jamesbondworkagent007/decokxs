package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class uLQ {
    public static final uLQ AEQbTJ;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final uLQ EZpvd;
    public static final uLQ KWHzl;
    public static final uLQ OLrzqt;
    public static final uLQ copydefault;
    public final java.lang.String AhwBna;
    public final java.lang.String djBIcL;
    public final java.lang.String gEmmrt;

    public uLQ(java.lang.String str, java.lang.String str2) {
        this.AhwBna = str;
        this.gEmmrt = str2;
        this.djBIcL = "/cdn/mobile/resources/lottie/tradingbot";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("_night") : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:14) call: o.uLQ.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ uLQ(java.lang.String str, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "_night" : str2);
    }

    public final java.lang.String valueOf() {
        return Companion.copydefault(this.djBIcL + "/" + this.AhwBna + ".lottie");
    }

    public final java.lang.String gEmmrt() {
        return Companion.copydefault(this.djBIcL + "/" + this.AhwBna + this.gEmmrt + ".lottie");
    }

    public final java.lang.String AhwBna() {
        return C33492mxV.OLrzqt() ? gEmmrt() : valueOf();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uLQ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final uLQ KWHzl() {
            return uLQ.OLrzqt;
        }

        public final uLQ AEQbTJ() {
            return uLQ.copydefault;
        }

        public final uLQ copydefault() {
            return uLQ.AEQbTJ;
        }

        public final uLQ OLrzqt() {
            return uLQ.KWHzl;
        }

        public final uLQ EZpvd() {
            return uLQ.EZpvd;
        }

        public final java.lang.String copydefault(java.lang.String str) {
            return C43386roM.EZpvd.EZpvd() + str;
        }
    }

    static {
        int i = 2;
        OLrzqt = new uLQ("bot_backtest_progress_view", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        copydefault = new uLQ("bot_dcd_pnl_greater", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        AEQbTJ = new uLQ("bot_dcd_pnl_less_than", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        KWHzl = new uLQ("bot_mp_order_waiting_signal", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        EZpvd = new uLQ("bot_result_page_processing", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
    }
}
