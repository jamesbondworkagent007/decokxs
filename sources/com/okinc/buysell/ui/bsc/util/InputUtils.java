package com.okinc.buysell.ui.bsc.util;

import android.text.TextUtils;
import androidx.camera.video.AudioStats;
import com.okinc.fiat.api.bean.FiatCryptoRange;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.C31661lzi;
import o.C33129mqd;
import o.C46876tfT;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class InputUtils {
    public static final InputUtils AEQbTJ = new InputUtils();

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InputType.values().length];
            try {
                iArr[InputType.FIAT_INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputType.CRYPTO_INPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[TradeType.values().length];
            try {
                iArr2[TradeType.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TradeType.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            KWHzl = iArr2;
        }
    }

    private InputUtils() {
    }

    public final String EZpvd(@NotNull InputType inputType, @NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(inputType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        int i2 = ActionBar.OLrzqt[inputType.ordinal()];
        if (i2 == 1) {
            return C31661lzi.appendCryptoSymbol$default(str3, str, i, null, null, null, 28, null);
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C31661lzi.appendFiatSymbol$default(str3, str2, i, null, null, null, 28, null);
    }

    public final boolean copydefault(boolean z, boolean z2, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return (z || z2) && C33129mqd.AEQbTJ(str) > AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.AEQbTJ(str2) > AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public final String copydefault(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33129mqd.OLrzqt(str, str2, Integer.valueOf(i), Boolean.TRUE, RoundingMode.DOWN);
    }

    public final String EZpvd(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33129mqd.gEmmrt(str, str2, Integer.valueOf(i), Boolean.TRUE, RoundingMode.DOWN);
    }

    public final String AEQbTJ(@NotNull TradeType tradeType, @NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int i2 = ActionBar.KWHzl[tradeType.ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? "" : C33129mqd.gEmmrt(str, str2, 0, Boolean.TRUE, RoundingMode.UP);
        }
        return C33129mqd.OLrzqt(str, str2, Integer.valueOf(i), Boolean.TRUE, RoundingMode.UP);
    }

    public final String copydefault(@NotNull TradeType tradeType, @NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int i2 = ActionBar.KWHzl[tradeType.ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? "" : C33129mqd.gEmmrt(str, str2, 0, Boolean.TRUE, RoundingMode.DOWN);
        }
        return C33129mqd.OLrzqt(str, str2, Integer.valueOf(i), Boolean.TRUE, RoundingMode.DOWN);
    }

    public final boolean OLrzqt(@NotNull FiatCryptoRange fiatCryptoRange, double d) {
        Intrinsics.checkNotNullParameter(fiatCryptoRange, "");
        if (!fiatCryptoRange.isLeftClose() || d >= C33129mqd.AEQbTJ(fiatCryptoRange.getMin())) {
            return !fiatCryptoRange.isLeftClose() && d <= C33129mqd.AEQbTJ(fiatCryptoRange.getMin());
        }
        return true;
    }

    public final boolean EZpvd(@NotNull FiatCryptoRange fiatCryptoRange, double d) {
        Intrinsics.checkNotNullParameter(fiatCryptoRange, "");
        if (!fiatCryptoRange.isRightClose() || d <= C33129mqd.AEQbTJ(fiatCryptoRange.getMax())) {
            return !fiatCryptoRange.isRightClose() && d >= C33129mqd.AEQbTJ(fiatCryptoRange.getMax());
        }
        return true;
    }

    public final FiatCryptoRange EZpvd(Channel channel) {
        if (channel != null) {
            return new FiatCryptoRange(channel.getMinLimitAmount(), C33129mqd.gEmmrt(C46876tfT.KWHzl(channel)), true, true);
        }
        return null;
    }

    public final Pair<Double, String> EZpvd(@NotNull Pair<Double, String> pair, @NotNull String str) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(str, "");
        return TextUtils.isDigitsOnly(pair.getSecond()) ? new Pair<>(pair.getFirst(), str) : pair;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ChipType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ChipType[] $VALUES;
        public static final ChipType QUICK_AMOUNT = new ChipType("QUICK_AMOUNT", 0);
        public static final ChipType PERCENTAGE = new ChipType("PERCENTAGE", 1);
        public static final ChipType INSUFFICIENT_BALANCE = new ChipType("INSUFFICIENT_BALANCE", 2);
        public static final ChipType BUY_MAX = new ChipType("BUY_MAX", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ChipType[] $values() {
            return new ChipType[]{QUICK_AMOUNT, PERCENTAGE, INSUFFICIENT_BALANCE, BUY_MAX};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ChipType> getEntries() {
            return $ENTRIES;
        }

        private ChipType(String str, int i) {
        }

        static {
            ChipType[] chipTypeArr$values = $values();
            $VALUES = chipTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(chipTypeArr$values);
        }

        public static ChipType valueOf(String str) {
            return (ChipType) Enum.valueOf(ChipType.class, str);
        }

        public static ChipType[] values() {
            return (ChipType[]) $VALUES.clone();
        }
    }
}
