package com.okinc.find_ui.data;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32392mcI;
import o.C33070mpX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class BigDataTimeIntervalItem {
    public static final int $stable = 8;
    private String barType;
    private boolean select;
    public int timeInterval;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBarType() {
        return this.barType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSelect() {
        return this.select;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBarType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.barType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelect(boolean z) {
        this.select = z;
    }

    public BigDataTimeIntervalItem() {
        this.barType = "";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BigDataTimeIntervalItem(int i, @NotNull String str, Boolean bool) {
        this();
        Intrinsics.checkNotNullParameter(str, "");
        this.timeInterval = i;
        this.barType = str;
        this.select = bool != null ? bool.booleanValue() : false;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r3v0 java.lang.Boolean))
 A[MD:(int, java.lang.String, java.lang.Boolean):void (m)] (LINE:20) call: com.okinc.find_ui.data.BigDataTimeIntervalItem.<init>(int, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ BigDataTimeIntervalItem(int i, String str, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? Boolean.FALSE : bool);
    }

    public final String getDisplayName() {
        int i = this.timeInterval;
        if (i == 3) {
            return C33070mpX.AYXKKw(C32392mcI.Dialog.QKVWgx);
        }
        if (i != 5) {
            if (i == -1) {
                return C33070mpX.AYXKKw(C32392mcI.Dialog.dvKsVJ);
            }
            if (i == 0) {
                return C33070mpX.AYXKKw(C32392mcI.Dialog.DCJXGO);
            }
            if (i == 1) {
                return C33070mpX.AYXKKw(C32392mcI.Dialog.zsXlph);
            }
            switch (i) {
                case -44640:
                    return C33070mpX.AYXKKw(C32392mcI.Dialog.zDUObI);
                case -10080:
                    return C33070mpX.AYXKKw(C32392mcI.Dialog.zKcAg);
                case -1440:
                    return C33070mpX.AYXKKw(C32392mcI.Dialog.vLaW);
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
        }
        return C33070mpX.AYXKKw(C32392mcI.Dialog.QfsBiF);
    }
}
