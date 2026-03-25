package com.okinc.kline.data;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import kotlin.jvm.internal.Intrinsics;
import o.C32392mcI;
import o.C33070mpX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class TimeIntervalItem {
    public static final int $stable = 8;
    private boolean isSelected;
    private String timeIndex;
    public int timeInterval;
    private String timeKLine;
    private String timeMarkPrice;
    private String tradingType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeIndex() {
        return this.timeIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeKLine() {
        return this.timeKLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeMarkPrice() {
        return this.timeMarkPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradingType() {
        return this.tradingType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeIndex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.timeIndex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeKLine(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.timeKLine = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeMarkPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.timeMarkPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradingType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradingType = str;
    }

    public TimeIntervalItem() {
        this.timeIndex = "";
        this.timeKLine = "";
        this.timeMarkPrice = "";
        this.tradingType = "";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimeIntervalItem(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this();
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.timeInterval = i;
        this.timeIndex = str;
        this.timeKLine = str2;
        this.timeMarkPrice = str3;
        this.tradingType = str4;
    }

    public final String getDisplayName() {
        int i = this.timeInterval;
        if (i == 3) {
            return C33070mpX.AYXKKw(C32392mcI.Dialog.QKVWgx);
        }
        if (i != 5) {
            if (i == -5) {
                return C33070mpX.AYXKKw(C32392mcI.Dialog.RJOkX);
            }
            if (i == -1) {
                return C33070mpX.AYXKKw(C32392mcI.Dialog.dvKsVJ);
            }
            if (i == 0) {
                return C33070mpX.AYXKKw(C32392mcI.Dialog.DCJXGO);
            }
            if (i != 1) {
                switch (i) {
                    case -30:
                        return C33070mpX.AYXKKw(C32392mcI.Dialog.OcIXYQ);
                    case -15:
                        return C33070mpX.AYXKKw(C32392mcI.Dialog.AuCTelauCTel);
                    case 5:
                        break;
                    case 15:
                        return C33070mpX.AYXKKw(C32392mcI.Dialog.AuCTel);
                    case 30:
                        return C33070mpX.AYXKKw(C32392mcI.Dialog.ORxRYg);
                    case 60:
                        return C33070mpX.AYXKKw(C32392mcI.Dialog.iwGUEr);
                    case 120:
                        return C33070mpX.AYXKKw(C32392mcI.Dialog.sSMYrx);
                    case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                        return C33070mpX.AYXKKw(C32392mcI.Dialog.hDKMBd);
                    case 360:
                        return C33070mpX.AYXKKw(C32392mcI.Dialog.QVAiDq);
                    case 720:
                        return C33070mpX.AYXKKw(C32392mcI.Dialog.wlaJM);
                    case 1440:
                        return C33070mpX.AYXKKw(C32392mcI.Dialog.getNewProxyInstance);
                    case 2880:
                        return C33070mpX.AYXKKw(C32392mcI.Dialog.AxsJAY);
                    case 4320:
                        return C33070mpX.AYXKKw(C32392mcI.Dialog.DTwDnp);
                    case 7200:
                        return C33070mpX.AYXKKw(C32392mcI.Dialog.QbewEr);
                    case 10080:
                        return C33070mpX.AYXKKw(C32392mcI.Dialog.zuBGHE);
                    case 44640:
                        return C33070mpX.AYXKKw(C32392mcI.Dialog.AwvSrB);
                    case 133920:
                        return C33070mpX.AYXKKw(C32392mcI.Dialog.QOLQEE);
                    case 267840:
                        return C33070mpX.AYXKKw(C32392mcI.Dialog.QUSxYX);
                    default:
                        return C33070mpX.AYXKKw(C32392mcI.Dialog.gHZMYf);
                }
            } else {
                return C33070mpX.AYXKKw(C32392mcI.Dialog.zsXlph);
            }
        }
        return C33070mpX.AYXKKw(C32392mcI.Dialog.QfsBiF);
    }
}
