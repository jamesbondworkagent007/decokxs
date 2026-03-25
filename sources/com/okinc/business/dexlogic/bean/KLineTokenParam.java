package com.okinc.business.dexlogic.bean;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class KLineTokenParam implements Parcelable {
    private final String fromChainId;
    private final String fromTokenAddress;
    private boolean isCoinPair;
    private final String scale;
    private final String toChainId;
    private final String toTokenAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<KLineTokenParam> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<KLineTokenParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KLineTokenParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new KLineTokenParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KLineTokenParam[] newArray(int i) {
            return new KLineTokenParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KLineTokenParam copy$default(KLineTokenParam kLineTokenParam, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kLineTokenParam.fromChainId;
        }
        if ((i & 2) != 0) {
            str2 = kLineTokenParam.fromTokenAddress;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = kLineTokenParam.toChainId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = kLineTokenParam.toTokenAddress;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = kLineTokenParam.scale;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            z = kLineTokenParam.isCoinPair;
        }
        return kLineTokenParam.copy(str, str6, str7, str8, str9, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fromChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.scale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isCoinPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KLineTokenParam copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new KLineTokenParam(str, str2, str3, str4, str5, z);
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
        if (!(obj instanceof KLineTokenParam)) {
            return false;
        }
        KLineTokenParam kLineTokenParam = (KLineTokenParam) obj;
        return Intrinsics.EZpvd((Object) this.fromChainId, (Object) kLineTokenParam.fromChainId) && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) kLineTokenParam.fromTokenAddress) && Intrinsics.EZpvd((Object) this.toChainId, (Object) kLineTokenParam.toChainId) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) kLineTokenParam.toTokenAddress) && Intrinsics.EZpvd((Object) this.scale, (Object) kLineTokenParam.scale) && this.isCoinPair == kLineTokenParam.isCoinPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromChainId() {
        return this.fromChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScale() {
        return this.scale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainId() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.fromChainId.hashCode() * 31) + this.fromTokenAddress.hashCode()) * 31) + this.toChainId.hashCode()) * 31) + this.toTokenAddress.hashCode()) * 31) + this.scale.hashCode()) * 31) + Boolean.hashCode(this.isCoinPair);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCoinPair() {
        return this.isCoinPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinPair(boolean z) {
        this.isCoinPair = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KLineTokenParam(fromChainId=" + this.fromChainId + ", fromTokenAddress=" + this.fromTokenAddress + ", toChainId=" + this.toChainId + ", toTokenAddress=" + this.toTokenAddress + ", scale=" + this.scale + ", isCoinPair=" + this.isCoinPair + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.fromChainId);
        parcel.writeString(this.fromTokenAddress);
        parcel.writeString(this.toChainId);
        parcel.writeString(this.toTokenAddress);
        parcel.writeString(this.scale);
        parcel.writeInt(this.isCoinPair ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.KLineTokenParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KLineTokenParam> serializer() {
            return KLineTokenParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KLineTokenParam(int i, String str, String str2, String str3, String str4, String str5, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, KLineTokenParam$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.fromChainId = "";
        } else {
            this.fromChainId = str;
        }
        this.fromTokenAddress = str2;
        if ((i & 4) == 0) {
            this.toChainId = "";
        } else {
            this.toChainId = str3;
        }
        if ((i & 8) == 0) {
            this.toTokenAddress = "";
        } else {
            this.toTokenAddress = str4;
        }
        if ((i & 16) == 0) {
            this.scale = "";
        } else {
            this.scale = str5;
        }
        if ((i & 32) == 0) {
            this.isCoinPair = false;
        } else {
            this.isCoinPair = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(KLineTokenParam kLineTokenParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) kLineTokenParam.fromChainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, kLineTokenParam.fromChainId);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, kLineTokenParam.fromTokenAddress);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) kLineTokenParam.toChainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, kLineTokenParam.toChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) kLineTokenParam.toTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, kLineTokenParam.toTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) kLineTokenParam.scale, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, kLineTokenParam.scale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || kLineTokenParam.isCoinPair) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, kLineTokenParam.isCoinPair);
        }
    }

    public KLineTokenParam(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.fromChainId = str;
        this.fromTokenAddress = str2;
        this.toChainId = str3;
        this.toTokenAddress = str4;
        this.scale = str5;
        this.isCoinPair = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (r11v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001e: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:50) call: com.okinc.business.dexlogic.bean.KLineTokenParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ KLineTokenParam(String str, String str2, String str3, String str4, String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? false : z);
    }
}
