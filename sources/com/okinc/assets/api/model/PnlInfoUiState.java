package com.okinc.assets.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.assets.api.utils.Message;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class PnlInfoUiState implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PnlInfoUiState> CREATOR = new Creator();
    private final String depositValuation;
    private final String endAssetValuation;
    private final String endDate;
    private final String netInflowValuation;
    private final String otherNetTransferValuation;
    private final boolean showNetInflow;
    private final String startAssetValuation;
    private final String startDate;
    private final Message title;
    private final String totalPnl;
    private final BigDecimal totalPnlAmount;
    private final String withdrawValuation;

    public static final class Creator implements Parcelable.Creator<PnlInfoUiState> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PnlInfoUiState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PnlInfoUiState(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0, (Message) parcel.readParcelable(PnlInfoUiState.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PnlInfoUiState[] newArray(int i) {
            return new PnlInfoUiState[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.startDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal component10() {
        return this.totalPnlAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.showNetInflow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Message component12() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.endDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.startAssetValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.endAssetValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.depositValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.withdrawValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.otherNetTransferValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.netInflowValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnlInfoUiState copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull BigDecimal bigDecimal, boolean z, @NotNull Message message) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(message, "");
        return new PnlInfoUiState(str, str2, str3, str4, str5, str6, str7, str8, str9, bigDecimal, z, message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PnlInfoUiState)) {
            return false;
        }
        PnlInfoUiState pnlInfoUiState = (PnlInfoUiState) obj;
        return Intrinsics.EZpvd((Object) this.startDate, (Object) pnlInfoUiState.startDate) && Intrinsics.EZpvd((Object) this.endDate, (Object) pnlInfoUiState.endDate) && Intrinsics.EZpvd((Object) this.startAssetValuation, (Object) pnlInfoUiState.startAssetValuation) && Intrinsics.EZpvd((Object) this.endAssetValuation, (Object) pnlInfoUiState.endAssetValuation) && Intrinsics.EZpvd((Object) this.depositValuation, (Object) pnlInfoUiState.depositValuation) && Intrinsics.EZpvd((Object) this.withdrawValuation, (Object) pnlInfoUiState.withdrawValuation) && Intrinsics.EZpvd((Object) this.otherNetTransferValuation, (Object) pnlInfoUiState.otherNetTransferValuation) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) pnlInfoUiState.totalPnl) && Intrinsics.EZpvd((Object) this.netInflowValuation, (Object) pnlInfoUiState.netInflowValuation) && Intrinsics.EZpvd(this.totalPnlAmount, pnlInfoUiState.totalPnlAmount) && this.showNetInflow == pnlInfoUiState.showNetInflow && Intrinsics.EZpvd(this.title, pnlInfoUiState.title);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositValuation() {
        return this.depositValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndAssetValuation() {
        return this.endAssetValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndDate() {
        return this.endDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetInflowValuation() {
        return this.netInflowValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOtherNetTransferValuation() {
        return this.otherNetTransferValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowNetInflow() {
        return this.showNetInflow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartAssetValuation() {
        return this.startAssetValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartDate() {
        return this.startDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Message getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal getTotalPnlAmount() {
        return this.totalPnlAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWithdrawValuation() {
        return this.withdrawValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((this.startDate.hashCode() * 31) + this.endDate.hashCode()) * 31) + this.startAssetValuation.hashCode()) * 31) + this.endAssetValuation.hashCode()) * 31) + this.depositValuation.hashCode()) * 31) + this.withdrawValuation.hashCode()) * 31) + this.otherNetTransferValuation.hashCode()) * 31) + this.totalPnl.hashCode()) * 31) + this.netInflowValuation.hashCode()) * 31) + this.totalPnlAmount.hashCode()) * 31) + Boolean.hashCode(this.showNetInflow)) * 31) + this.title.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PnlInfoUiState(startDate=" + this.startDate + ", endDate=" + this.endDate + ", startAssetValuation=" + this.startAssetValuation + ", endAssetValuation=" + this.endAssetValuation + ", depositValuation=" + this.depositValuation + ", withdrawValuation=" + this.withdrawValuation + ", otherNetTransferValuation=" + this.otherNetTransferValuation + ", totalPnl=" + this.totalPnl + ", netInflowValuation=" + this.netInflowValuation + ", totalPnlAmount=" + this.totalPnlAmount + ", showNetInflow=" + this.showNetInflow + ", title=" + this.title + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.startDate);
        parcel.writeString(this.endDate);
        parcel.writeString(this.startAssetValuation);
        parcel.writeString(this.endAssetValuation);
        parcel.writeString(this.depositValuation);
        parcel.writeString(this.withdrawValuation);
        parcel.writeString(this.otherNetTransferValuation);
        parcel.writeString(this.totalPnl);
        parcel.writeString(this.netInflowValuation);
        parcel.writeSerializable(this.totalPnlAmount);
        parcel.writeInt(this.showNetInflow ? 1 : 0);
        parcel.writeParcelable(this.title, i);
    }

    public PnlInfoUiState(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull BigDecimal bigDecimal, boolean z, @NotNull Message message) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(message, "");
        this.startDate = str;
        this.endDate = str2;
        this.startAssetValuation = str3;
        this.endAssetValuation = str4;
        this.depositValuation = str5;
        this.withdrawValuation = str6;
        this.otherNetTransferValuation = str7;
        this.totalPnl = str8;
        this.netInflowValuation = str9;
        this.totalPnlAmount = bigDecimal;
        this.showNetInflow = z;
        this.title = message;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r29v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r29v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (r26v0 java.math.BigDecimal)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004c: ARITH (r29v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? true : (r27v0 boolean))
  (r28v0 com.okinc.assets.api.utils.Message)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, boolean, com.okinc.assets.api.utils.Message):void (m)] (LINE:11) call: com.okinc.assets.api.model.PnlInfoUiState.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, boolean, com.okinc.assets.api.utils.Message):void type: THIS */
    public /* synthetic */ PnlInfoUiState(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, BigDecimal bigDecimal, boolean z, Message message, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, bigDecimal, (i & 1024) != 0 ? true : z, message);
    }
}
