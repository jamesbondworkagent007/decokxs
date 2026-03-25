package com.okinc.business.dex.tee.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C33070mpX;
import o.C59442zhC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class TransactionIntentData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TransactionIntentData> CREATOR = new Creator();
    private final String chainIndex;
    private final String createdAt;
    private final String expiredAt;
    private final String fromAmount;
    private final String fromToken;
    private final String minReturnAmount;
    private final String recipient;
    private final String referrerAddress;
    private final String referrerCode;
    private final StrategyType strategyType;
    private final String timestamp;
    private final String toToken;

    public static final class Creator implements Parcelable.Creator<TransactionIntentData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionIntentData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TransactionIntentData(parcel.readString(), StrategyType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionIntentData[] newArray(int i) {
            return new TransactionIntentData[i];
        }
    }

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[StrategyType.values().length];
            try {
                iArr[StrategyType.StrategyLimitOrderUBased.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StrategyType.StrategyTrailingTPSLUBased.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionIntentData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.referrerAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.referrerCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyType component2() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.recipient;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.createdAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.expiredAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.minReturnAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionIntentData copy(@NotNull String str, @NotNull StrategyType strategyType, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strategyType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new TransactionIntentData(str, strategyType, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
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
        if (!(obj instanceof TransactionIntentData)) {
            return false;
        }
        TransactionIntentData transactionIntentData = (TransactionIntentData) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) transactionIntentData.chainIndex) && this.strategyType == transactionIntentData.strategyType && Intrinsics.EZpvd((Object) this.recipient, (Object) transactionIntentData.recipient) && Intrinsics.EZpvd((Object) this.createdAt, (Object) transactionIntentData.createdAt) && Intrinsics.EZpvd((Object) this.expiredAt, (Object) transactionIntentData.expiredAt) && Intrinsics.EZpvd((Object) this.fromToken, (Object) transactionIntentData.fromToken) && Intrinsics.EZpvd((Object) this.toToken, (Object) transactionIntentData.toToken) && Intrinsics.EZpvd((Object) this.fromAmount, (Object) transactionIntentData.fromAmount) && Intrinsics.EZpvd((Object) this.minReturnAmount, (Object) transactionIntentData.minReturnAmount) && Intrinsics.EZpvd((Object) this.referrerAddress, (Object) transactionIntentData.referrerAddress) && Intrinsics.EZpvd((Object) this.referrerCode, (Object) transactionIntentData.referrerCode) && Intrinsics.EZpvd((Object) this.timestamp, (Object) transactionIntentData.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpiredAt() {
        return this.expiredAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromToken() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinReturnAmount() {
        return this.minReturnAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecipient() {
        return this.recipient;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferrerAddress() {
        return this.referrerAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferrerCode() {
        return this.referrerCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyType getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToToken() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((this.chainIndex.hashCode() * 31) + this.strategyType.hashCode()) * 31) + this.recipient.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.expiredAt.hashCode()) * 31) + this.fromToken.hashCode()) * 31) + this.toToken.hashCode()) * 31) + this.fromAmount.hashCode()) * 31) + this.minReturnAmount.hashCode()) * 31) + this.referrerAddress.hashCode()) * 31) + this.referrerCode.hashCode()) * 31) + this.timestamp.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionIntentData(chainIndex=" + this.chainIndex + ", strategyType=" + this.strategyType + ", recipient=" + this.recipient + ", createdAt=" + this.createdAt + ", expiredAt=" + this.expiredAt + ", fromToken=" + this.fromToken + ", toToken=" + this.toToken + ", fromAmount=" + this.fromAmount + ", minReturnAmount=" + this.minReturnAmount + ", referrerAddress=" + this.referrerAddress + ", referrerCode=" + this.referrerCode + ", timestamp=" + this.timestamp + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainIndex);
        parcel.writeString(this.strategyType.name());
        parcel.writeString(this.recipient);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.expiredAt);
        parcel.writeString(this.fromToken);
        parcel.writeString(this.toToken);
        parcel.writeString(this.fromAmount);
        parcel.writeString(this.minReturnAmount);
        parcel.writeString(this.referrerAddress);
        parcel.writeString(this.referrerCode);
        parcel.writeString(this.timestamp);
    }

    public TransactionIntentData(@NotNull String str, @NotNull StrategyType strategyType, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strategyType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.chainIndex = str;
        this.strategyType = strategyType;
        this.recipient = str2;
        this.createdAt = str3;
        this.expiredAt = str4;
        this.fromToken = str5;
        this.toToken = str6;
        this.fromAmount = str7;
        this.minReturnAmount = str8;
        this.referrerAddress = str9;
        this.referrerCode = str10;
        this.timestamp = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:com.okinc.business.dex.tee.domain.model.StrategyType:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000f: SGET  A[WRAPPED] (LINE:23) com.okinc.business.dex.tee.domain.model.StrategyType.StrategySwap com.okinc.business.dex.tee.domain.model.StrategyType) : (r15v0 com.okinc.business.dex.tee.domain.model.StrategyType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (""))
 A[MD:(java.lang.String, com.okinc.business.dex.tee.domain.model.StrategyType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:21) call: com.okinc.business.dex.tee.domain.model.TransactionIntentData.<init>(java.lang.String, com.okinc.business.dex.tee.domain.model.StrategyType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TransactionIntentData(String str, StrategyType strategyType, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? StrategyType.StrategySwap : strategyType, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) == 0 ? str11 : "");
    }

    public final String getLimitIntentData() {
        int i = StateListAnimator.OLrzqt[this.strategyType.ordinal()];
        if (i == 1 || i == 2) {
            return this.referrerAddress.length() == 0 ? generateLimitUIntentData() : generateReferrerLimitUIntentData();
        }
        return getMarketIntentData();
    }

    public final String getMarketIntentData() {
        return this.referrerAddress.length() == 0 ? generateIntentData() : generateReferrerIntentData();
    }

    public final String generateIntentData() {
        return C59442zhC.fJNWhG("\n        " + C33070mpX.AYXKKw(C23274hvD.Fragment.fromQueueItemList) + "\n        \n        Chain Index: " + this.chainIndex + "\n        Strategy Type: " + this.strategyType.getCommand() + "\n        Recipient: " + this.recipient + "\n        Created At: " + this.createdAt + "\n        Expired At: " + this.expiredAt + "\n        From Token: " + this.fromToken + "\n        To Token: " + this.toToken + "\n        From Amount: " + this.fromAmount + "\n        Min Return Amount: " + this.minReturnAmount + "\n        Timestamp: " + this.timestamp + "\n    ");
    }

    public final String generateReferrerIntentData() {
        return C59442zhC.fJNWhG("\n        " + C33070mpX.AYXKKw(C23274hvD.Fragment.fromQueueItemList) + "\n        \n        Chain Index: " + this.chainIndex + "\n        Strategy Type: " + this.strategyType.getCommand() + "\n        Recipient: " + this.recipient + "\n        Created At: " + this.createdAt + "\n        Expired At: " + this.expiredAt + "\n        From Token: " + this.fromToken + "\n        To Token: " + this.toToken + "\n        From Amount: " + this.fromAmount + "\n        Min Return Amount: " + this.minReturnAmount + "\n        Referrer Address: " + this.referrerAddress + "\n        Referrer Code: " + this.referrerCode + "\n        Timestamp: " + this.timestamp + "\n    ");
    }

    public final String generateLimitUIntentData() {
        return C59442zhC.fJNWhG("\n        " + C33070mpX.AYXKKw(C23274hvD.Fragment.fromQueueItemList) + "\n        \n        Chain Index: " + this.chainIndex + "\n        Strategy Type: " + this.strategyType.getCommand() + "\n        Recipient: " + this.recipient + "\n        Created At: " + this.createdAt + "\n        Expired At: " + this.expiredAt + "\n        From Token: " + this.fromToken + "\n        To Token: " + this.toToken + "\n        From Amount: " + this.fromAmount + "\n        Timestamp: " + this.timestamp + "\n    ");
    }

    public final String generateReferrerLimitUIntentData() {
        return C59442zhC.fJNWhG("\n        " + C33070mpX.AYXKKw(C23274hvD.Fragment.fromQueueItemList) + "\n        \n        Chain Index: " + this.chainIndex + "\n        Strategy Type: " + this.strategyType.getCommand() + "\n        Recipient: " + this.recipient + "\n        Created At: " + this.createdAt + "\n        Expired At: " + this.expiredAt + "\n        From Token: " + this.fromToken + "\n        To Token: " + this.toToken + "\n        From Amount: " + this.fromAmount + "\n        Referrer Address: " + this.referrerAddress + "\n        Referrer Code: " + this.referrerCode + "\n        Timestamp: " + this.timestamp + "\n    ");
    }

    public final String generateCopyTradeIntentData() {
        StringBuilder sb = new StringBuilder();
        sb.append(C33070mpX.AYXKKw(C23274hvD.Fragment.fromQueueItemList));
        sb.append('\n');
        sb.append('\n');
        sb.append("Chain Index: ");
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append(this.chainIndex);
        sb.append('\n');
        sb.append("Strategy Type: ");
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append(this.strategyType.getCommand());
        sb.append('\n');
        sb.append("Recipient: ");
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append(this.recipient);
        sb.append('\n');
        sb.append("Created At: ");
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append(this.createdAt);
        sb.append('\n');
        sb.append("Expired At: ");
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append(this.expiredAt);
        sb.append('\n');
        if (this.referrerAddress.length() > 0) {
            sb.append("Referrer Address: ");
            Intrinsics.checkNotNullExpressionValue(sb, "");
            sb.append(this.referrerAddress);
            sb.append('\n');
        }
        if (this.referrerCode.length() > 0) {
            sb.append("Referrer Code: ");
            Intrinsics.checkNotNullExpressionValue(sb, "");
            sb.append(this.referrerCode);
            sb.append('\n');
        }
        sb.append("Timestamp: ");
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append(this.timestamp);
        sb.append('\n');
        return sb.toString();
    }
}
