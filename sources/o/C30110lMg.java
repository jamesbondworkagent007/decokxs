package o;

import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lMg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30110lMg {
    public static final C30110lMg EZpvd = new C30110lMg();

    /* JADX INFO: renamed from: o.lMg$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChannelCategoryCode.values().length];
            try {
                iArr[ChannelCategoryCode.THIRD_PARTY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[TradeType.values().length];
            try {
                iArr2[TradeType.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr2[TradeType.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[TradeType.DEPOSIT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[TradeType.WITHDRAW.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[TradeType.TOPUP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[TradeType.ADDFUNDS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[TradeType.STABLECOIN_DEPOSIT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            KWHzl = iArr2;
        }
    }

    private C30110lMg() {
    }

    public final InterfaceC30116lMm AEQbTJ(com.okinc.okpaymentapi.data.remote.model.management.Channel channel, @NotNull TradeType tradeType) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        switch (Application.KWHzl[tradeType.ordinal()]) {
            case 1:
                return (channel == null || !C31662lzj.KWHzl(channel)) ? (channel == null || !C31662lzj.EZpvd(channel)) ? (channel == null || !C31662lzj.AYXKKw(channel)) ? new lLQ() : new lLY() : new lLV() : new lLQ();
            case 2:
                ChannelCategoryCode categoryCode = channel != null ? channel.getCategoryCode() : null;
                if (categoryCode != null && Application.EZpvd[categoryCode.ordinal()] == 1) {
                    return new C30117lMn();
                }
                return new C30117lMn();
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return new C30117lMn();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
