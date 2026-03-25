package o;

import com.okinc.tradingbot.impl.market_place.home.list.BotSquareType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.voj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51529voj implements InterfaceC47982uAp {
    public final BotSquareType KWHzl;
    public final java.util.Map<java.lang.String, java.lang.String> copydefault;

    /* JADX INFO: renamed from: o.voj$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BotSquareType.values().length];
            try {
                iArr[BotSquareType.BOT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BotSquareType.SIGNAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[BotSquareType.NMP_BOT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotSquareType EZpvd() {
        return this.KWHzl;
    }

    public C51529voj(@NotNull BotSquareType botSquareType, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(botSquareType, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.KWHzl = botSquareType;
        this.copydefault = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 com.okinc.tradingbot.impl.market_place.home.list.BotSquareType)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0004: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:20)) : (r2v0 java.util.Map))
 A[MD:(com.okinc.tradingbot.impl.market_place.home.list.BotSquareType, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:18) call: o.voj.<init>(com.okinc.tradingbot.impl.market_place.home.list.BotSquareType, java.util.Map):void type: THIS */
    public /* synthetic */ C51529voj(BotSquareType botSquareType, java.util.Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(botSquareType, (i & 2) != 0 ? C56424yEw.KWHzl() : map);
    }

    @Override // o.InterfaceC47982uAp
    public androidx.fragment.app.Fragment getFragment(java.lang.Object obj) {
        int i = StateListAnimator.KWHzl[this.KWHzl.ordinal()];
        if (i == 1) {
            return new C51554vpH();
        }
        if (i == 2) {
            return new C51572vpZ();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return ((InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class)).copydefault(false, this.copydefault);
    }
}
