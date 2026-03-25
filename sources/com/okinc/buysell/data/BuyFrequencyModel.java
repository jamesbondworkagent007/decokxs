package com.okinc.buysell.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class BuyFrequencyModel {
    public static final int $stable = 0;
    private final int code;
    private final String frequency;
    private final String localizedName;
    private final String nextPurchaseTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BuyFrequencyModel copy$default(BuyFrequencyModel buyFrequencyModel, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = buyFrequencyModel.code;
        }
        if ((i2 & 2) != 0) {
            str = buyFrequencyModel.frequency;
        }
        if ((i2 & 4) != 0) {
            str2 = buyFrequencyModel.localizedName;
        }
        if ((i2 & 8) != 0) {
            str3 = buyFrequencyModel.nextPurchaseTime;
        }
        return buyFrequencyModel.copy(i, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.localizedName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.nextPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuyFrequencyModel copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new BuyFrequencyModel(i, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuyFrequencyModel)) {
            return false;
        }
        BuyFrequencyModel buyFrequencyModel = (BuyFrequencyModel) obj;
        return this.code == buyFrequencyModel.code && Intrinsics.EZpvd((Object) this.frequency, (Object) buyFrequencyModel.frequency) && Intrinsics.EZpvd((Object) this.localizedName, (Object) buyFrequencyModel.localizedName) && Intrinsics.EZpvd((Object) this.nextPurchaseTime, (Object) buyFrequencyModel.nextPurchaseTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrequency() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLocalizedName() {
        return this.localizedName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextPurchaseTime() {
        return this.nextPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.code) * 31) + this.frequency.hashCode()) * 31) + this.localizedName.hashCode()) * 31) + this.nextPurchaseTime.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BuyFrequencyModel(code=" + this.code + ", frequency=" + this.frequency + ", localizedName=" + this.localizedName + ", nextPurchaseTime=" + this.nextPurchaseTime + ")";
    }

    public BuyFrequencyModel(int i, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.code = i;
        this.frequency = str;
        this.localizedName = str2;
        this.nextPurchaseTime = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r2v0 int)
  (r3v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:100) call: com.okinc.buysell.data.BuyFrequencyModel.<init>(int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BuyFrequencyModel(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }
}
