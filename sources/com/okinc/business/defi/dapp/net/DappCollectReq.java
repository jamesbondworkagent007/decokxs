package com.okinc.business.defi.dapp.net;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DappCollectReq implements Parcelable {
    private Integer category;
    private int collectFlag;
    private long dappId;
    private String domain;
    private String logo;
    private String name;
    private int type;
    private String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DappCollectReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DappCollectReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappCollectReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DappCollectReq(parcel.readLong(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappCollectReq[] newArray(int i) {
            return new DappCollectReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DappCollectReq() {
        this(0L, 0, (Integer) null, (String) null, (String) null, (String) null, (String) null, 0, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.dappId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.collectFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappCollectReq copy(long j, int i, Integer num, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new DappCollectReq(j, i, num, str, str2, str3, str4, i2);
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
        if (!(obj instanceof DappCollectReq)) {
            return false;
        }
        DappCollectReq dappCollectReq = (DappCollectReq) obj;
        return this.dappId == dappCollectReq.dappId && this.type == dappCollectReq.type && Intrinsics.EZpvd(this.category, dappCollectReq.category) && Intrinsics.EZpvd((Object) this.domain, (Object) dappCollectReq.domain) && Intrinsics.EZpvd((Object) this.name, (Object) dappCollectReq.name) && Intrinsics.EZpvd((Object) this.logo, (Object) dappCollectReq.logo) && Intrinsics.EZpvd((Object) this.url, (Object) dappCollectReq.url) && this.collectFlag == dappCollectReq.collectFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCollectFlag() {
        return this.collectFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getDappId() {
        return this.dappId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDomain() {
        return this.domain;
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
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.dappId);
        int iHashCode2 = Integer.hashCode(this.type);
        Integer num = this.category;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.domain.hashCode()) * 31) + this.name.hashCode()) * 31) + this.logo.hashCode()) * 31) + this.url.hashCode()) * 31) + Integer.hashCode(this.collectFlag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCategory(Integer num) {
        this.category = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCollectFlag(int i) {
        this.collectFlag = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDappId(long j) {
        this.dappId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDomain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.domain = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.logo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.type = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappCollectReq(dappId=" + this.dappId + ", type=" + this.type + ", category=" + this.category + ", domain=" + this.domain + ", name=" + this.name + ", logo=" + this.logo + ", url=" + this.url + ", collectFlag=" + this.collectFlag + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.dappId);
        parcel.writeInt(this.type);
        Integer num = this.category;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.domain);
        parcel.writeString(this.name);
        parcel.writeString(this.logo);
        parcel.writeString(this.url);
        parcel.writeInt(this.collectFlag);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.DappCollectReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DappCollectReq> serializer() {
            return DappCollectReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DappCollectReq(int i, long j, int i2, Integer num, String str, String str2, String str3, String str4, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        this.dappId = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.type = 0;
        } else {
            this.type = i2;
        }
        if ((i & 4) == 0) {
            this.category = null;
        } else {
            this.category = num;
        }
        if ((i & 8) == 0) {
            this.domain = "";
        } else {
            this.domain = str;
        }
        if ((i & 16) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 32) == 0) {
            this.logo = "";
        } else {
            this.logo = str3;
        }
        if ((i & 64) == 0) {
            this.url = "";
        } else {
            this.url = str4;
        }
        if ((i & 128) == 0) {
            this.collectFlag = 0;
        } else {
            this.collectFlag = i3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(DappCollectReq dappCollectReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dappCollectReq.dappId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, dappCollectReq.dappId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dappCollectReq.type != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, dappCollectReq.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dappCollectReq.category != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, dappCollectReq.category);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dappCollectReq.domain, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dappCollectReq.domain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dappCollectReq.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dappCollectReq.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dappCollectReq.logo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dappCollectReq.logo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) dappCollectReq.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, dappCollectReq.url);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && dappCollectReq.collectFlag == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 7, dappCollectReq.collectFlag);
    }

    public DappCollectReq(long j, int i, Integer num, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.dappId = j;
        this.type = i;
        this.category = num;
        this.domain = str;
        this.name = str2;
        this.logo = str3;
        this.url = str4;
        this.collectFlag = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0050: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r12v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000a: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r14v0 int))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0012: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r15v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r21v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003a: ARITH (r21v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r20v0 int) : (0 int))
 A[MD:(long, int, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:36) call: com.okinc.business.defi.dapp.net.DappCollectReq.<init>(long, int, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ DappCollectReq(long j, int i, Integer num, String str, String str2, String str3, String str4, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? "" : str3, (i3 & 64) == 0 ? str4 : "", (i3 & 128) == 0 ? i2 : 0);
    }
}
