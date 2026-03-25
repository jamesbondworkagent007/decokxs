package com.okinc.wallet.core.formatter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WalletCurrencyBean implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<WalletCurrencyBean> CREATOR = new Creator();
    private final String isoCode;
    private final int maxPrecision;
    private final int minPrecision;
    private final String sign;
    private final double usdToThisRate;

    public static final class Creator implements Parcelable.Creator<WalletCurrencyBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletCurrencyBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletCurrencyBean(parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletCurrencyBean[] newArray(int i) {
            return new WalletCurrencyBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletCurrencyBean() {
        this(null, null, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIsoCode() {
        return this.isoCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMaxPrecision() {
        return this.maxPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMinPrecision() {
        return this.minPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSign() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getUsdToThisRate() {
        return this.usdToThisRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.isoCode);
        parcel.writeString(this.sign);
        parcel.writeDouble(this.usdToThisRate);
        parcel.writeInt(this.minPrecision);
        parcel.writeInt(this.maxPrecision);
    }

    public WalletCurrencyBean(@NotNull String str, @NotNull String str2, double d, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.isoCode = str;
        this.sign = str2;
        this.usdToThisRate = d;
        this.minPrecision = i;
        this.maxPrecision = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("USD") : (r5v0 java.lang.String))
  (wrap:java.lang.String:0x000c: TERNARY null = ((wrap:int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("$") : (r6v0 java.lang.String))
  (wrap:double:0x0013: TERNARY null = ((wrap:int:0x000d: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (1.0d double) : (r7v0 double))
  (wrap:int:0x0019: TERNARY null = ((wrap:int:0x0014: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r9v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001a: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (12 int) : (r10v0 int))
 A[MD:(java.lang.String, java.lang.String, double, int, int):void (m)] (LINE:47) call: com.okinc.wallet.core.formatter.WalletCurrencyBean.<init>(java.lang.String, java.lang.String, double, int, int):void type: THIS */
    public /* synthetic */ WalletCurrencyBean(String str, String str2, double d, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "USD" : str, (i3 & 2) != 0 ? "$" : str2, (i3 & 4) != 0 ? 1.0d : d, (i3 & 8) != 0 ? 2 : i, (i3 & 16) != 0 ? 12 : i2);
    }
}
