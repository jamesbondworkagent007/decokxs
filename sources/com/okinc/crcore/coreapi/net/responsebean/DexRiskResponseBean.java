package com.okinc.crcore.coreapi.net.responsebean;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class DexRiskResponseBean implements Parcelable {
    public static final int $stable = 0;
    private final int chain;
    private final String contractAddress;
    private final String newRiskTotalLevel;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DexRiskResponseBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<DexRiskResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexRiskResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexRiskResponseBean(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexRiskResponseBean[] newArray(int i) {
            return new DexRiskResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexRiskResponseBean() {
        this(0, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexRiskResponseBean copy$default(DexRiskResponseBean dexRiskResponseBean, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dexRiskResponseBean.chain;
        }
        if ((i2 & 2) != 0) {
            str = dexRiskResponseBean.contractAddress;
        }
        if ((i2 & 4) != 0) {
            str2 = dexRiskResponseBean.newRiskTotalLevel;
        }
        return dexRiskResponseBean.copy(i, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.chain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.newRiskTotalLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexRiskResponseBean copy(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DexRiskResponseBean(i, str, str2);
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
        if (!(obj instanceof DexRiskResponseBean)) {
            return false;
        }
        DexRiskResponseBean dexRiskResponseBean = (DexRiskResponseBean) obj;
        return this.chain == dexRiskResponseBean.chain && Intrinsics.EZpvd((Object) this.contractAddress, (Object) dexRiskResponseBean.contractAddress) && Intrinsics.EZpvd((Object) this.newRiskTotalLevel, (Object) dexRiskResponseBean.newRiskTotalLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChain() {
        return this.chain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewRiskTotalLevel() {
        return this.newRiskTotalLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.chain) * 31) + this.contractAddress.hashCode()) * 31) + this.newRiskTotalLevel.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexRiskResponseBean(chain=" + this.chain + ", contractAddress=" + this.contractAddress + ", newRiskTotalLevel=" + this.newRiskTotalLevel + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.chain);
        parcel.writeString(this.contractAddress);
        parcel.writeString(this.newRiskTotalLevel);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.DexRiskResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexRiskResponseBean> serializer() {
            return DexRiskResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexRiskResponseBean(int i, int i2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.chain = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.contractAddress = "";
        } else {
            this.contractAddress = str;
        }
        if ((i & 4) == 0) {
            this.newRiskTotalLevel = "";
        } else {
            this.newRiskTotalLevel = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DexRiskResponseBean dexRiskResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dexRiskResponseBean.chain != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, dexRiskResponseBean.chain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexRiskResponseBean.contractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexRiskResponseBean.contractAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) dexRiskResponseBean.newRiskTotalLevel, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, dexRiskResponseBean.newRiskTotalLevel);
    }

    public DexRiskResponseBean(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.chain = i;
        this.contractAddress = str;
        this.newRiskTotalLevel = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String):void (m)] (LINE:15) call: com.okinc.crcore.coreapi.net.responsebean.DexRiskResponseBean.<init>(int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DexRiskResponseBean(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }
}
