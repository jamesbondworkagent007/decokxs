package com.okinc.business.dexlogic.bean;

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
public final class DexBridgeOrderInfoVo implements Parcelable {
    public static final int $stable = 0;
    private final String bridgeId;
    private final String bridgeName;
    private final String bridgeOrderId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DexBridgeOrderInfoVo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DexBridgeOrderInfoVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexBridgeOrderInfoVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexBridgeOrderInfoVo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexBridgeOrderInfoVo[] newArray(int i) {
            return new DexBridgeOrderInfoVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexBridgeOrderInfoVo() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexBridgeOrderInfoVo copy$default(DexBridgeOrderInfoVo dexBridgeOrderInfoVo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dexBridgeOrderInfoVo.bridgeId;
        }
        if ((i & 2) != 0) {
            str2 = dexBridgeOrderInfoVo.bridgeName;
        }
        if ((i & 4) != 0) {
            str3 = dexBridgeOrderInfoVo.bridgeOrderId;
        }
        return dexBridgeOrderInfoVo.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.bridgeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.bridgeOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexBridgeOrderInfoVo copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new DexBridgeOrderInfoVo(str, str2, str3);
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
        if (!(obj instanceof DexBridgeOrderInfoVo)) {
            return false;
        }
        DexBridgeOrderInfoVo dexBridgeOrderInfoVo = (DexBridgeOrderInfoVo) obj;
        return Intrinsics.EZpvd((Object) this.bridgeId, (Object) dexBridgeOrderInfoVo.bridgeId) && Intrinsics.EZpvd((Object) this.bridgeName, (Object) dexBridgeOrderInfoVo.bridgeName) && Intrinsics.EZpvd((Object) this.bridgeOrderId, (Object) dexBridgeOrderInfoVo.bridgeOrderId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeId() {
        return this.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeName() {
        return this.bridgeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeOrderId() {
        return this.bridgeOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.bridgeId.hashCode() * 31) + this.bridgeName.hashCode()) * 31) + this.bridgeOrderId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexBridgeOrderInfoVo(bridgeId=" + this.bridgeId + ", bridgeName=" + this.bridgeName + ", bridgeOrderId=" + this.bridgeOrderId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.bridgeId);
        parcel.writeString(this.bridgeName);
        parcel.writeString(this.bridgeOrderId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.DexBridgeOrderInfoVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexBridgeOrderInfoVo> serializer() {
            return DexBridgeOrderInfoVo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexBridgeOrderInfoVo(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.bridgeId = "";
        } else {
            this.bridgeId = str;
        }
        if ((i & 2) == 0) {
            this.bridgeName = "";
        } else {
            this.bridgeName = str2;
        }
        if ((i & 4) == 0) {
            this.bridgeOrderId = "";
        } else {
            this.bridgeOrderId = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DexBridgeOrderInfoVo dexBridgeOrderInfoVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexBridgeOrderInfoVo.bridgeId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexBridgeOrderInfoVo.bridgeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexBridgeOrderInfoVo.bridgeName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexBridgeOrderInfoVo.bridgeName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) dexBridgeOrderInfoVo.bridgeOrderId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, dexBridgeOrderInfoVo.bridgeOrderId);
    }

    public DexBridgeOrderInfoVo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.bridgeId = str;
        this.bridgeName = str2;
        this.bridgeOrderId = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:827) call: com.okinc.business.dexlogic.bean.DexBridgeOrderInfoVo.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DexBridgeOrderInfoVo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
