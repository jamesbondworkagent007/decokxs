package o;

import com.okinc.unify_trade.api.subscribe.TradeNotifyMessage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xpa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55736xpa {
    public java.lang.String KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC55736xpa() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public abstract void EZpvd(@NotNull TradeNotifyMessage tradeNotifyMessage);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    public AbstractC55736xpa(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.KWHzl = "TradeMessageNotifyListener";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x000c: INVOKE 
  (wrap:java.lang.Long:0x0008: INVOKE (wrap:long:0x0004: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:10)) STATIC call: java.lang.Long.valueOf(long):java.lang.Long A[MD:(long):java.lang.Long (c), WRAPPED] (LINE:10))
 STATIC call: o.mqd.gEmmrt(java.lang.Object):java.lang.String A[MD:(java.lang.Object):java.lang.String (m), WRAPPED] (LINE:10)) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:10) call: o.xpa.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ AbstractC55736xpa(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())) : str);
    }
}
