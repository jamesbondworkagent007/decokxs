package o;

import com.okinc.dexkline.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mQY extends mQU {
    public final InterfaceC32156mRo AYXKKw;
    public final java.lang.String djBIcL;
    public final java.lang.String isConnected;
    public final java.lang.String values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AhwBna = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mQY(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull InterfaceC32156mRo interfaceC32156mRo) {
        super("dex-market", str3, str2);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(interfaceC32156mRo, "");
        this.isConnected = str;
        this.values = str2;
        this.djBIcL = str3;
        this.AYXKKw = interfaceC32156mRo;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mQY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.mQU
    public void KWHzl(@NotNull MarketTxWsInfoItemBean marketTxWsInfoItemBean) {
        Intrinsics.checkNotNullParameter(marketTxWsInfoItemBean, "");
        this.AYXKKw.KWHzl(marketTxWsInfoItemBean);
    }
}
