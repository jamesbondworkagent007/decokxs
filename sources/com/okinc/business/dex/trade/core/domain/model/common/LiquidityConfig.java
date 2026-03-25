package com.okinc.business.dex.trade.core.domain.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class LiquidityConfig implements Parcelable {
    public static final int $stable = 0;
    private final String defiPlatformIds;
    private final String excludedDefiPlatformIds;
    private final String excludedDexIds;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LiquidityConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LiquidityConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiquidityConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LiquidityConfig(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiquidityConfig[] newArray(int i) {
            return new LiquidityConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LiquidityConfig() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LiquidityConfig copy$default(LiquidityConfig liquidityConfig, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liquidityConfig.excludedDexIds;
        }
        if ((i & 2) != 0) {
            str2 = liquidityConfig.excludedDefiPlatformIds;
        }
        if ((i & 4) != 0) {
            str3 = liquidityConfig.defiPlatformIds;
        }
        return liquidityConfig.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.excludedDexIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.excludedDefiPlatformIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.defiPlatformIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiquidityConfig copy(String str, String str2, String str3) {
        return new LiquidityConfig(str, str2, str3);
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
        if (!(obj instanceof LiquidityConfig)) {
            return false;
        }
        LiquidityConfig liquidityConfig = (LiquidityConfig) obj;
        return Intrinsics.EZpvd((Object) this.excludedDexIds, (Object) liquidityConfig.excludedDexIds) && Intrinsics.EZpvd((Object) this.excludedDefiPlatformIds, (Object) liquidityConfig.excludedDefiPlatformIds) && Intrinsics.EZpvd((Object) this.defiPlatformIds, (Object) liquidityConfig.defiPlatformIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefiPlatformIds() {
        return this.defiPlatformIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExcludedDefiPlatformIds() {
        return this.excludedDefiPlatformIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExcludedDexIds() {
        return this.excludedDexIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.excludedDexIds;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.excludedDefiPlatformIds;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.defiPlatformIds;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiquidityConfig(excludedDexIds=" + this.excludedDexIds + ", excludedDefiPlatformIds=" + this.excludedDefiPlatformIds + ", defiPlatformIds=" + this.defiPlatformIds + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.excludedDexIds);
        parcel.writeString(this.excludedDefiPlatformIds);
        parcel.writeString(this.defiPlatformIds);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LiquidityConfig> serializer() {
            return LiquidityConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LiquidityConfig(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.excludedDexIds = null;
        } else {
            this.excludedDexIds = str;
        }
        if ((i & 2) == 0) {
            this.excludedDefiPlatformIds = null;
        } else {
            this.excludedDefiPlatformIds = str2;
        }
        if ((i & 4) == 0) {
            this.defiPlatformIds = null;
        } else {
            this.defiPlatformIds = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(LiquidityConfig liquidityConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || liquidityConfig.excludedDexIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, liquidityConfig.excludedDexIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || liquidityConfig.excludedDefiPlatformIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, liquidityConfig.excludedDefiPlatformIds);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && liquidityConfig.defiPlatformIds == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, liquidityConfig.defiPlatformIds);
    }

    public LiquidityConfig(String str, String str2, String str3) {
        this.excludedDexIds = str;
        this.excludedDefiPlatformIds = str2;
        this.defiPlatformIds = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:73) call: com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LiquidityConfig(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
