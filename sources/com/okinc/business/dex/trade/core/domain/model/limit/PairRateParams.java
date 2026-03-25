package com.okinc.business.dex.trade.core.domain.model.limit;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class PairRateParams implements Parcelable {
    public static final int $stable = 0;
    private final String accountId;
    private final long chainId;
    private final String dexIds;
    private final String fromAmount;
    private final String fromTokenAddress;
    private final String refCode;
    private final String toTokenAddress;
    private final String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PairRateParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PairRateParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PairRateParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PairRateParams(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PairRateParams[] newArray(int i) {
            return new PairRateParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.dexIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.refCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PairRateParams copy(long j, @NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new PairRateParams(j, str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof PairRateParams)) {
            return false;
        }
        PairRateParams pairRateParams = (PairRateParams) obj;
        return this.chainId == pairRateParams.chainId && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) pairRateParams.fromTokenAddress) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) pairRateParams.toTokenAddress) && Intrinsics.EZpvd((Object) this.fromAmount, (Object) pairRateParams.fromAmount) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) pairRateParams.userWalletAddress) && Intrinsics.EZpvd((Object) this.dexIds, (Object) pairRateParams.dexIds) && Intrinsics.EZpvd((Object) this.refCode, (Object) pairRateParams.refCode) && Intrinsics.EZpvd((Object) this.accountId, (Object) pairRateParams.accountId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexIds() {
        return this.dexIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRefCode() {
        return this.refCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.chainId);
        int iHashCode2 = this.fromTokenAddress.hashCode();
        int iHashCode3 = this.toTokenAddress.hashCode();
        String str = this.fromAmount;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.userWalletAddress;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.dexIds;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.refCode;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.accountId;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PairRateParams(chainId=" + this.chainId + ", fromTokenAddress=" + this.fromTokenAddress + ", toTokenAddress=" + this.toTokenAddress + ", fromAmount=" + this.fromAmount + ", userWalletAddress=" + this.userWalletAddress + ", dexIds=" + this.dexIds + ", refCode=" + this.refCode + ", accountId=" + this.accountId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.chainId);
        parcel.writeString(this.fromTokenAddress);
        parcel.writeString(this.toTokenAddress);
        parcel.writeString(this.fromAmount);
        parcel.writeString(this.userWalletAddress);
        parcel.writeString(this.dexIds);
        parcel.writeString(this.refCode);
        parcel.writeString(this.accountId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.limit.PairRateParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PairRateParams> serializer() {
            return PairRateParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PairRateParams(int i, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, PairRateParams$$serializer.INSTANCE.getDescriptor());
        }
        this.chainId = j;
        this.fromTokenAddress = str;
        this.toTokenAddress = str2;
        if ((i & 8) == 0) {
            this.fromAmount = "";
        } else {
            this.fromAmount = str3;
        }
        if ((i & 16) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str4;
        }
        if ((i & 32) == 0) {
            this.dexIds = null;
        } else {
            this.dexIds = str5;
        }
        if ((i & 64) == 0) {
            this.refCode = "";
        } else {
            this.refCode = str6;
        }
        if ((i & 128) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(PairRateParams pairRateParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, pairRateParams.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, pairRateParams.fromTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, pairRateParams.toTokenAddress);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) pairRateParams.fromAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, pairRateParams.fromAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) pairRateParams.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, pairRateParams.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || pairRateParams.dexIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, pairRateParams.dexIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) pairRateParams.refCode, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, pairRateParams.refCode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) pairRateParams.accountId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, pairRateParams.accountId);
    }

    public PairRateParams(long j, @NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.chainId = j;
        this.fromTokenAddress = str;
        this.toTokenAddress = str2;
        this.fromAmount = str3;
        this.userWalletAddress = str4;
        this.dexIds = str5;
        this.refCode = str6;
        this.accountId = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0033: CONSTRUCTOR 
  (r14v0 long)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:58) call: com.okinc.business.dex.trade.core.domain.model.limit.PairRateParams.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PairRateParams(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7);
    }
}
