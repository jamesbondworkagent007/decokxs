package o;

import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lMt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30123lMt {
    public static final C30123lMt KWHzl = new C30123lMt();

    /* JADX INFO: renamed from: o.lMt$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradeType.values().length];
            try {
                iArr[TradeType.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TradeType.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    private C30123lMt() {
    }

    public final InterfaceC30115lMl copydefault(com.okinc.okpaymentapi.data.remote.model.management.Channel channel, @NotNull PaymentMethod paymentMethod, @NotNull TradeType tradeType) {
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        int i = StateListAnimator.EZpvd[tradeType.ordinal()];
        if (i == 1) {
            return (channel == null || !C31662lzj.KWHzl(channel)) ? (channel == null || !C31662lzj.EZpvd(channel)) ? (channel == null || !C31662lzj.AYXKKw(channel)) ? new C30122lMs(paymentMethod) : new C30125lMv(paymentMethod) : new C30124lMu(paymentMethod) : new C30128lMy(paymentMethod);
        }
        if (i == 2) {
            return new C30127lMx(paymentMethod);
        }
        return new C30127lMx(paymentMethod);
    }
}
