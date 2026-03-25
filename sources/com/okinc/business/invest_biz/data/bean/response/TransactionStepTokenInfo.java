package com.okinc.business.invest_biz.data.bean.response;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TransactionStepTokenInfo implements Parcelable {
    public static final int $stable = 0;
    public final long chainId;
    public final String coinAmount;
    public final String currencyAmount;
    public final String expectTokenAddress;
    public final String tokenAddress;
    public final String tokenId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TransactionStepTokenInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TransactionStepTokenInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionStepTokenInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TransactionStepTokenInfo(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionStepTokenInfo[] newArray(int i) {
            return new TransactionStepTokenInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionStepTokenInfo() {
        this(0L, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.expectTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionStepTokenInfo copydefault(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new TransactionStepTokenInfo(j, str, str2, str3, str4, str5);
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
        if (!(obj instanceof TransactionStepTokenInfo)) {
            return false;
        }
        TransactionStepTokenInfo transactionStepTokenInfo = (TransactionStepTokenInfo) obj;
        return this.chainId == transactionStepTokenInfo.chainId && Intrinsics.EZpvd((Object) this.coinAmount, (Object) transactionStepTokenInfo.coinAmount) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) transactionStepTokenInfo.currencyAmount) && Intrinsics.EZpvd((Object) this.expectTokenAddress, (Object) transactionStepTokenInfo.expectTokenAddress) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) transactionStepTokenInfo.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenId, (Object) transactionStepTokenInfo.tokenId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Long.hashCode(this.chainId) * 31) + this.coinAmount.hashCode()) * 31) + this.currencyAmount.hashCode()) * 31) + this.expectTokenAddress.hashCode()) * 31) + this.tokenAddress.hashCode()) * 31) + this.tokenId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionStepTokenInfo(chainId=" + this.chainId + ", coinAmount=" + this.coinAmount + ", currencyAmount=" + this.currencyAmount + ", expectTokenAddress=" + this.expectTokenAddress + ", tokenAddress=" + this.tokenAddress + ", tokenId=" + this.tokenId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.chainId);
        parcel.writeString(this.coinAmount);
        parcel.writeString(this.currencyAmount);
        parcel.writeString(this.expectTokenAddress);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.tokenId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.TransactionStepTokenInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionStepTokenInfo> serializer() {
            return TransactionStepTokenInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransactionStepTokenInfo(int i, long j, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.coinAmount = "";
        } else {
            this.coinAmount = str;
        }
        if ((i & 4) == 0) {
            this.currencyAmount = "";
        } else {
            this.currencyAmount = str2;
        }
        if ((i & 8) == 0) {
            this.expectTokenAddress = "";
        } else {
            this.expectTokenAddress = str3;
        }
        if ((i & 16) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str4;
        }
        if ((i & 32) == 0) {
            this.tokenId = "";
        } else {
            this.tokenId = str5;
        }
    }

    public static final /* synthetic */ void EZpvd(TransactionStepTokenInfo transactionStepTokenInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || transactionStepTokenInfo.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, transactionStepTokenInfo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) transactionStepTokenInfo.coinAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, transactionStepTokenInfo.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) transactionStepTokenInfo.currencyAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, transactionStepTokenInfo.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) transactionStepTokenInfo.expectTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, transactionStepTokenInfo.expectTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) transactionStepTokenInfo.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, transactionStepTokenInfo.tokenAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) transactionStepTokenInfo.tokenId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, transactionStepTokenInfo.tokenId);
    }

    public TransactionStepTokenInfo(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.chainId = j;
        this.coinAmount = str;
        this.currencyAmount = str2;
        this.expectTokenAddress = str3;
        this.tokenAddress = str4;
        this.tokenId = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r9v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r16v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : (""))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:52) call: com.okinc.business.invest_biz.data.bean.response.TransactionStepTokenInfo.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TransactionStepTokenInfo(long j, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) == 0 ? str5 : "");
    }
}
