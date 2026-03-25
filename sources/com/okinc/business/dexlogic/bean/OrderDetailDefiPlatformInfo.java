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
public final class OrderDetailDefiPlatformInfo implements Parcelable {
    public static final int $stable = 0;
    private final String id;
    private final String logo;
    private final String name;
    private final int offlineType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OrderDetailDefiPlatformInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OrderDetailDefiPlatformInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderDetailDefiPlatformInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OrderDetailDefiPlatformInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderDetailDefiPlatformInfo[] newArray(int i) {
            return new OrderDetailDefiPlatformInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrderDetailDefiPlatformInfo() {
        this((String) null, (String) null, (String) null, 0, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OrderDetailDefiPlatformInfo copy$default(OrderDetailDefiPlatformInfo orderDetailDefiPlatformInfo, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = orderDetailDefiPlatformInfo.name;
        }
        if ((i2 & 2) != 0) {
            str2 = orderDetailDefiPlatformInfo.id;
        }
        if ((i2 & 4) != 0) {
            str3 = orderDetailDefiPlatformInfo.logo;
        }
        if ((i2 & 8) != 0) {
            i = orderDetailDefiPlatformInfo.offlineType;
        }
        return orderDetailDefiPlatformInfo.copy(str, str2, str3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.offlineType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderDetailDefiPlatformInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new OrderDetailDefiPlatformInfo(str, str2, str3, i);
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
        if (!(obj instanceof OrderDetailDefiPlatformInfo)) {
            return false;
        }
        OrderDetailDefiPlatformInfo orderDetailDefiPlatformInfo = (OrderDetailDefiPlatformInfo) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) orderDetailDefiPlatformInfo.name) && Intrinsics.EZpvd((Object) this.id, (Object) orderDetailDefiPlatformInfo.id) && Intrinsics.EZpvd((Object) this.logo, (Object) orderDetailDefiPlatformInfo.logo) && this.offlineType == orderDetailDefiPlatformInfo.offlineType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOfflineType() {
        return this.offlineType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.id.hashCode()) * 31) + this.logo.hashCode()) * 31) + Integer.hashCode(this.offlineType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderDetailDefiPlatformInfo(name=" + this.name + ", id=" + this.id + ", logo=" + this.logo + ", offlineType=" + this.offlineType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.name);
        parcel.writeString(this.id);
        parcel.writeString(this.logo);
        parcel.writeInt(this.offlineType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.OrderDetailDefiPlatformInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrderDetailDefiPlatformInfo> serializer() {
            return OrderDetailDefiPlatformInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrderDetailDefiPlatformInfo(int i, String str, String str2, String str3, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.id = "";
        } else {
            this.id = str2;
        }
        if ((i & 4) == 0) {
            this.logo = "";
        } else {
            this.logo = str3;
        }
        if ((i & 8) == 0) {
            this.offlineType = 0;
        } else {
            this.offlineType = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(OrderDetailDefiPlatformInfo orderDetailDefiPlatformInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) orderDetailDefiPlatformInfo.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, orderDetailDefiPlatformInfo.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) orderDetailDefiPlatformInfo.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, orderDetailDefiPlatformInfo.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) orderDetailDefiPlatformInfo.logo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, orderDetailDefiPlatformInfo.logo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && orderDetailDefiPlatformInfo.offlineType == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, orderDetailDefiPlatformInfo.offlineType);
    }

    public OrderDetailDefiPlatformInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.name = str;
        this.id = str2;
        this.logo = str3;
        this.offlineType = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:879) call: com.okinc.business.dexlogic.bean.OrderDetailDefiPlatformInfo.<init>(java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ OrderDetailDefiPlatformInfo(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i);
    }
}
