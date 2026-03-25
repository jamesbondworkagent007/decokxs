package o;

import com.okinc.kline.data.BotPendingLineVo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.oRz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36173oRz extends AbstractC49408unw<C36173oRz> {
    public BotPendingLineVo KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C36173oRz() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C36173oRz copy$default(C36173oRz c36173oRz, BotPendingLineVo botPendingLineVo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            botPendingLineVo = c36173oRz.KWHzl;
        }
        return c36173oRz.copydefault(botPendingLineVo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36173oRz copydefault(BotPendingLineVo botPendingLineVo) {
        return new C36173oRz(botPendingLineVo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36173oRz) && Intrinsics.EZpvd(this.KWHzl, ((C36173oRz) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        BotPendingLineVo botPendingLineVo = this.KWHzl;
        if (botPendingLineVo == null) {
            return 0;
        }
        return botPendingLineVo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "KlineQuoteUiState(botPendingLineVo=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.kline.data.BotPendingLineVo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.data.BotPendingLineVo) : (r1v0 com.okinc.kline.data.BotPendingLineVo))
 A[MD:(com.okinc.kline.data.BotPendingLineVo):void (m)] (LINE:110) call: o.oRz.<init>(com.okinc.kline.data.BotPendingLineVo):void type: THIS */
    public /* synthetic */ C36173oRz(BotPendingLineVo botPendingLineVo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : botPendingLineVo);
    }

    public C36173oRz(BotPendingLineVo botPendingLineVo) {
        super(new Function1() { // from class: o.oRx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36173oRz.AEQbTJ((C36173oRz) obj);
            }
        });
        this.KWHzl = botPendingLineVo;
    }

    public static final C36173oRz AEQbTJ(C36173oRz c36173oRz) {
        Intrinsics.checkNotNullParameter(c36173oRz, "");
        return copy$default(c36173oRz, null, 1, null);
    }
}
