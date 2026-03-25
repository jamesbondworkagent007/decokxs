package com.okinc.business.dex.api.bean;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class DexMarketCheckTokenDetailInfo implements Parcelable {
    public static final int $stable = 0;
    private final String chainId;
    private final String supportDetail;
    private final String tokenContractAddress;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DexMarketCheckTokenDetailInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DexMarketCheckTokenDetailInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexMarketCheckTokenDetailInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexMarketCheckTokenDetailInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexMarketCheckTokenDetailInfo[] newArray(int i) {
            return new DexMarketCheckTokenDetailInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexMarketCheckTokenDetailInfo() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexMarketCheckTokenDetailInfo copy$default(DexMarketCheckTokenDetailInfo dexMarketCheckTokenDetailInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dexMarketCheckTokenDetailInfo.chainId;
        }
        if ((i & 2) != 0) {
            str2 = dexMarketCheckTokenDetailInfo.supportDetail;
        }
        if ((i & 4) != 0) {
            str3 = dexMarketCheckTokenDetailInfo.tokenContractAddress;
        }
        return dexMarketCheckTokenDetailInfo.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.supportDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMarketCheckTokenDetailInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new DexMarketCheckTokenDetailInfo(str, str2, str3);
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
        if (!(obj instanceof DexMarketCheckTokenDetailInfo)) {
            return false;
        }
        DexMarketCheckTokenDetailInfo dexMarketCheckTokenDetailInfo = (DexMarketCheckTokenDetailInfo) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) dexMarketCheckTokenDetailInfo.chainId) && Intrinsics.EZpvd((Object) this.supportDetail, (Object) dexMarketCheckTokenDetailInfo.supportDetail) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) dexMarketCheckTokenDetailInfo.tokenContractAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupportDetail() {
        return this.supportDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.chainId.hashCode() * 31) + this.supportDetail.hashCode()) * 31) + this.tokenContractAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexMarketCheckTokenDetailInfo(chainId=" + this.chainId + ", supportDetail=" + this.supportDetail + ", tokenContractAddress=" + this.tokenContractAddress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        parcel.writeString(this.supportDetail);
        parcel.writeString(this.tokenContractAddress);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.api.bean.DexMarketCheckTokenDetailInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexMarketCheckTokenDetailInfo> serializer() {
            return DexMarketCheckTokenDetailInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexMarketCheckTokenDetailInfo(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.supportDetail = "";
        } else {
            this.supportDetail = str2;
        }
        if ((i & 4) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_api(DexMarketCheckTokenDetailInfo dexMarketCheckTokenDetailInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexMarketCheckTokenDetailInfo.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexMarketCheckTokenDetailInfo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexMarketCheckTokenDetailInfo.supportDetail, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexMarketCheckTokenDetailInfo.supportDetail);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) dexMarketCheckTokenDetailInfo.tokenContractAddress, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, dexMarketCheckTokenDetailInfo.tokenContractAddress);
    }

    public DexMarketCheckTokenDetailInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.chainId = str;
        this.supportDetail = str2;
        this.tokenContractAddress = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:82) call: com.okinc.business.dex.api.bean.DexMarketCheckTokenDetailInfo.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DexMarketCheckTokenDetailInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public final boolean isSupportDetail() {
        return Intrinsics.EZpvd((Object) this.supportDetail, (Object) "1");
    }
}
