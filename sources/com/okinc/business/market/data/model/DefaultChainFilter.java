package com.okinc.business.market.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.common.constants.TimeIntervalType;
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
public final class DefaultChainFilter implements Parcelable {
    public static final int $stable = 0;
    public final String chainId;
    public final boolean enable;
    public final TimeIntervalType periodType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DefaultChainFilter> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, TimeIntervalType.Companion.serializer()};

    public static final class Creator implements Parcelable.Creator<DefaultChainFilter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefaultChainFilter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DefaultChainFilter(parcel.readString(), parcel.readInt() != 0, TimeIntervalType.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefaultChainFilter[] newArray(int i) {
            return new DefaultChainFilter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefaultChainFilter() {
        this((String) null, false, (TimeIntervalType) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DefaultChainFilter copy$default(DefaultChainFilter defaultChainFilter, String str, boolean z, TimeIntervalType timeIntervalType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = defaultChainFilter.chainId;
        }
        if ((i & 2) != 0) {
            z = defaultChainFilter.enable;
        }
        if ((i & 4) != 0) {
            timeIntervalType = defaultChainFilter.periodType;
        }
        return defaultChainFilter.copydefault(str, z, timeIntervalType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeIntervalType KWHzl() {
        return this.periodType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.enable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefaultChainFilter copydefault(@NotNull String str, boolean z, @NotNull TimeIntervalType timeIntervalType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(timeIntervalType, "");
        return new DefaultChainFilter(str, z, timeIntervalType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.chainId;
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
        if (!(obj instanceof DefaultChainFilter)) {
            return false;
        }
        DefaultChainFilter defaultChainFilter = (DefaultChainFilter) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) defaultChainFilter.chainId) && this.enable == defaultChainFilter.enable && this.periodType == defaultChainFilter.periodType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.chainId.hashCode() * 31) + Boolean.hashCode(this.enable)) * 31) + this.periodType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DefaultChainFilter(chainId=" + this.chainId + ", enable=" + this.enable + ", periodType=" + this.periodType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        parcel.writeInt(this.enable ? 1 : 0);
        parcel.writeString(this.periodType.name());
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.DefaultChainFilter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DefaultChainFilter> serializer() {
            return DefaultChainFilter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DefaultChainFilter(int i, String str, boolean z, TimeIntervalType timeIntervalType, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.enable = true;
        } else {
            this.enable = z;
        }
        if ((i & 4) == 0) {
            this.periodType = TimeIntervalType.ONE_HOUR;
        } else {
            this.periodType = timeIntervalType;
        }
    }

    public static final /* synthetic */ void KWHzl(DefaultChainFilter defaultChainFilter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) defaultChainFilter.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, defaultChainFilter.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !defaultChainFilter.enable) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, defaultChainFilter.enable);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && defaultChainFilter.periodType == TimeIntervalType.ONE_HOUR) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], defaultChainFilter.periodType);
    }

    public DefaultChainFilter(@NotNull String str, boolean z, @NotNull TimeIntervalType timeIntervalType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(timeIntervalType, "");
        this.chainId = str;
        this.enable = z;
        this.periodType = timeIntervalType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (wrap:com.okinc.business.market.common.constants.TimeIntervalType:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.common.constants.TimeIntervalType:0x000f: SGET  A[WRAPPED] (LINE:17) com.okinc.business.market.common.constants.TimeIntervalType.ONE_HOUR com.okinc.business.market.common.constants.TimeIntervalType) : (r3v0 com.okinc.business.market.common.constants.TimeIntervalType))
 A[MD:(java.lang.String, boolean, com.okinc.business.market.common.constants.TimeIntervalType):void (m)] (LINE:11) call: com.okinc.business.market.data.model.DefaultChainFilter.<init>(java.lang.String, boolean, com.okinc.business.market.common.constants.TimeIntervalType):void type: THIS */
    public /* synthetic */ DefaultChainFilter(String str, boolean z, TimeIntervalType timeIntervalType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? TimeIntervalType.ONE_HOUR : timeIntervalType);
    }
}
