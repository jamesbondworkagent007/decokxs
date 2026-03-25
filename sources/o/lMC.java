package o;

import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lMC {
    public static final lMC EZpvd = new lMC();

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChannelCategoryCode.values().length];
            try {
                iArr[ChannelCategoryCode.BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ChannelCategoryCode.THIRD_PARTY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ChannelCategoryCode.NATIVE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[TradeType.values().length];
            try {
                iArr2[TradeType.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[TradeType.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[TradeType.DEPOSIT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[TradeType.WITHDRAW.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[TradeType.TOPUP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[TradeType.ADDFUNDS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[TradeType.STABLECOIN_DEPOSIT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            OLrzqt = iArr2;
        }
    }

    private lMC() {
    }

    public static /* synthetic */ InterfaceC30133lNc createChannelItem$default(lMC lmc, TradeType tradeType, com.okinc.okpaymentapi.data.remote.model.management.Channel channel, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return lmc.copydefault(tradeType, channel, z);
    }

    public final InterfaceC30133lNc copydefault(@NotNull TradeType tradeType, @NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel, boolean z) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(channel, "");
        switch (TaskDescription.OLrzqt[tradeType.ordinal()]) {
            case 1:
                int i = TaskDescription.EZpvd[channel.getCategoryCode().ordinal()];
                if (i == 1) {
                    return new C30145lNo(channel, z);
                }
                if (i == 2) {
                    return new C30151lNu(channel, z);
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                java.lang.String depositPlatformCode = channel.getDepositPlatformCode();
                if (Intrinsics.EZpvd((java.lang.Object) depositPlatformCode, (java.lang.Object) ChannelPlatformCode.CARD.getCode())) {
                    return new C30146lNp(channel, z);
                }
                if (Intrinsics.EZpvd((java.lang.Object) depositPlatformCode, (java.lang.Object) ChannelPlatformCode.BUY_IDEAL.getCode())) {
                    return new C30147lNq(channel, z);
                }
                if (Intrinsics.EZpvd((java.lang.Object) depositPlatformCode, (java.lang.Object) ChannelPlatformCode.ACH_BUY.getCode())) {
                    return new C30141lNk(channel, z);
                }
                if (Intrinsics.EZpvd((java.lang.Object) depositPlatformCode, (java.lang.Object) ChannelPlatformCode.BUY_PAYPAL.getCode())) {
                    return new C30144lNn(channel, z);
                }
                if (Intrinsics.EZpvd((java.lang.Object) depositPlatformCode, (java.lang.Object) ChannelPlatformCode.GOOGLE_PAY.getCode())) {
                    return new C30148lNr(channel, z);
                }
                return new C30142lNl(channel, z);
            case 2:
                int i2 = TaskDescription.EZpvd[channel.getCategoryCode().ordinal()];
                if (i2 == 1) {
                    return new C30152lNv(channel, z);
                }
                if (i2 == 2) {
                    return new C30153lNw(channel, z);
                }
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return new C30150lNt(channel, z);
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return new C30150lNt(channel, z);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
