package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class PlatformCoinCDNUrlBean implements Parcelable {
    private Boolean isDowngrade;
    private Long latestTime;
    private String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PlatformCoinCDNUrlBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PlatformCoinCDNUrlBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlatformCoinCDNUrlBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            Boolean boolValueOf = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PlatformCoinCDNUrlBean(string, lValueOf, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlatformCoinCDNUrlBean[] newArray(int i) {
            return new PlatformCoinCDNUrlBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlatformCoinCDNUrlBean() {
        this((String) null, (Long) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PlatformCoinCDNUrlBean copy$default(PlatformCoinCDNUrlBean platformCoinCDNUrlBean, String str, Long l, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = platformCoinCDNUrlBean.url;
        }
        if ((i & 2) != 0) {
            l = platformCoinCDNUrlBean.latestTime;
        }
        if ((i & 4) != 0) {
            bool = platformCoinCDNUrlBean.isDowngrade;
        }
        return platformCoinCDNUrlBean.copy(str, l, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.latestTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.isDowngrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformCoinCDNUrlBean copy(String str, Long l, Boolean bool) {
        return new PlatformCoinCDNUrlBean(str, l, bool);
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
        if (!(obj instanceof PlatformCoinCDNUrlBean)) {
            return false;
        }
        PlatformCoinCDNUrlBean platformCoinCDNUrlBean = (PlatformCoinCDNUrlBean) obj;
        return Intrinsics.EZpvd((Object) this.url, (Object) platformCoinCDNUrlBean.url) && Intrinsics.EZpvd(this.latestTime, platformCoinCDNUrlBean.latestTime) && Intrinsics.EZpvd(this.isDowngrade, platformCoinCDNUrlBean.isDowngrade);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getLatestTime() {
        return this.latestTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.url;
        int iHashCode = str == null ? 0 : str.hashCode();
        Long l = this.latestTime;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Boolean bool = this.isDowngrade;
        return (((iHashCode * 31) + iHashCode2) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isDowngrade() {
        return this.isDowngrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDowngrade(Boolean bool) {
        this.isDowngrade = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLatestTime(Long l) {
        this.latestTime = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(String str) {
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PlatformCoinCDNUrlBean(url=" + this.url + ", latestTime=" + this.latestTime + ", isDowngrade=" + this.isDowngrade + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.url);
        Long l = this.latestTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Boolean bool = this.isDowngrade;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.PlatformCoinCDNUrlBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PlatformCoinCDNUrlBean> serializer() {
            return PlatformCoinCDNUrlBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PlatformCoinCDNUrlBean(int i, String str, Long l, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        this.url = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.latestTime = null;
        } else {
            this.latestTime = l;
        }
        if ((i & 4) == 0) {
            this.isDowngrade = Boolean.FALSE;
        } else {
            this.isDowngrade = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(PlatformCoinCDNUrlBean platformCoinCDNUrlBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) platformCoinCDNUrlBean.url, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, platformCoinCDNUrlBean.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || platformCoinCDNUrlBean.latestTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, platformCoinCDNUrlBean.latestTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(platformCoinCDNUrlBean.isDowngrade, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, platformCoinCDNUrlBean.isDowngrade);
    }

    public PlatformCoinCDNUrlBean(String str, Long l, Boolean bool) {
        this.url = str;
        this.latestTime = l;
        this.isDowngrade = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x000f: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r3v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.Long, java.lang.Boolean):void (m)] (LINE:25) call: com.okinc.business.defi.biz.net.bean.PlatformCoinCDNUrlBean.<init>(java.lang.String, java.lang.Long, java.lang.Boolean):void type: THIS */
    public /* synthetic */ PlatformCoinCDNUrlBean(String str, Long l, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? Boolean.FALSE : bool);
    }
}
