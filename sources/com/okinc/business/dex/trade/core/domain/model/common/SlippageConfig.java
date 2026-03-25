package com.okinc.business.dex.trade.core.domain.model.common;

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
public final class SlippageConfig implements Parcelable {
    public static final int $stable = 0;
    private final String maxSlippage;
    private final String slippage;
    private final String slippageType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SlippageConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SlippageConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SlippageConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SlippageConfig(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SlippageConfig[] newArray(int i) {
            return new SlippageConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SlippageConfig copy$default(SlippageConfig slippageConfig, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slippageConfig.maxSlippage;
        }
        if ((i & 2) != 0) {
            str2 = slippageConfig.slippage;
        }
        if ((i & 4) != 0) {
            str3 = slippageConfig.slippageType;
        }
        return slippageConfig.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageConfig copy(String str, String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        return new SlippageConfig(str, str2, str3);
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
        if (!(obj instanceof SlippageConfig)) {
            return false;
        }
        SlippageConfig slippageConfig = (SlippageConfig) obj;
        return Intrinsics.EZpvd((Object) this.maxSlippage, (Object) slippageConfig.maxSlippage) && Intrinsics.EZpvd((Object) this.slippage, (Object) slippageConfig.slippage) && Intrinsics.EZpvd((Object) this.slippageType, (Object) slippageConfig.slippageType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSlippage() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageType() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.maxSlippage;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.slippage;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.slippageType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SlippageConfig(maxSlippage=" + this.maxSlippage + ", slippage=" + this.slippage + ", slippageType=" + this.slippageType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.maxSlippage);
        parcel.writeString(this.slippage);
        parcel.writeString(this.slippageType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SlippageConfig> serializer() {
            return SlippageConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SlippageConfig(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i & 4)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4, SlippageConfig$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.maxSlippage = null;
        } else {
            this.maxSlippage = str;
        }
        if ((i & 2) == 0) {
            this.slippage = null;
        } else {
            this.slippage = str2;
        }
        this.slippageType = str3;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(SlippageConfig slippageConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || slippageConfig.maxSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, slippageConfig.maxSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || slippageConfig.slippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, slippageConfig.slippage);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, slippageConfig.slippageType);
    }

    public SlippageConfig(String str, String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        this.maxSlippage = str;
        this.slippage = str2;
        this.slippageType = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (r4v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:54) call: com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SlippageConfig(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3);
    }
}
