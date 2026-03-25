package com.okinc.business.dex.trade.core.domain.model;

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
public final class DexPairInfo implements Parcelable {
    public static final int $stable = 0;
    private final String dexName;
    private final String okLinkUrl;
    private final String percent;
    private final String poolAddress;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DexPairInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DexPairInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexPairInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexPairInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexPairInfo[] newArray(int i) {
            return new DexPairInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexPairInfo copy$default(DexPairInfo dexPairInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dexPairInfo.poolAddress;
        }
        if ((i & 2) != 0) {
            str2 = dexPairInfo.okLinkUrl;
        }
        if ((i & 4) != 0) {
            str3 = dexPairInfo.percent;
        }
        if ((i & 8) != 0) {
            str4 = dexPairInfo.dexName;
        }
        return dexPairInfo.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.poolAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.okLinkUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.percent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.dexName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexPairInfo copy(String str, String str2, String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str4, "");
        return new DexPairInfo(str, str2, str3, str4);
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
        if (!(obj instanceof DexPairInfo)) {
            return false;
        }
        DexPairInfo dexPairInfo = (DexPairInfo) obj;
        return Intrinsics.EZpvd((Object) this.poolAddress, (Object) dexPairInfo.poolAddress) && Intrinsics.EZpvd((Object) this.okLinkUrl, (Object) dexPairInfo.okLinkUrl) && Intrinsics.EZpvd((Object) this.percent, (Object) dexPairInfo.percent) && Intrinsics.EZpvd((Object) this.dexName, (Object) dexPairInfo.dexName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexName() {
        return this.dexName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOkLinkUrl() {
        return this.okLinkUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercent() {
        return this.percent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPoolAddress() {
        return this.poolAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.poolAddress;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.okLinkUrl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.percent;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.dexName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexPairInfo(poolAddress=" + this.poolAddress + ", okLinkUrl=" + this.okLinkUrl + ", percent=" + this.percent + ", dexName=" + this.dexName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.poolAddress);
        parcel.writeString(this.okLinkUrl);
        parcel.writeString(this.percent);
        parcel.writeString(this.dexName);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.DexPairInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexPairInfo> serializer() {
            return DexPairInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexPairInfo(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (8 != (i & 8)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8, DexPairInfo$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.poolAddress = null;
        } else {
            this.poolAddress = str;
        }
        if ((i & 2) == 0) {
            this.okLinkUrl = null;
        } else {
            this.okLinkUrl = str2;
        }
        if ((i & 4) == 0) {
            this.percent = null;
        } else {
            this.percent = str3;
        }
        this.dexName = str4;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DexPairInfo dexPairInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dexPairInfo.poolAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, dexPairInfo.poolAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dexPairInfo.okLinkUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, dexPairInfo.okLinkUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dexPairInfo.percent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, dexPairInfo.percent);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, dexPairInfo.dexName);
    }

    public DexPairInfo(String str, String str2, String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str4, "");
        this.poolAddress = str;
        this.okLinkUrl = str2;
        this.percent = str3;
        this.dexName = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (r5v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:267) call: com.okinc.business.dex.trade.core.domain.model.DexPairInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DexPairInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4);
    }
}
