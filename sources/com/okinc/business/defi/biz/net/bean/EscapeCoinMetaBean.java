package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class EscapeCoinMetaBean implements Parcelable {
    private Long chainId;
    private String chainImageUrl;
    private String chainName;
    private int coinType;
    private FactionInfo factionInfo;
    private String imageUrl;
    private int rank;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EscapeCoinMetaBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EscapeCoinMetaBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeCoinMetaBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EscapeCoinMetaBean(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? FactionInfo.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeCoinMetaBean[] newArray(int i) {
            return new EscapeCoinMetaBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EscapeCoinMetaBean() {
        this((Long) null, (FactionInfo) null, (String) null, (String) null, (String) null, 0, 0, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EscapeCoinMetaBean copy$default(EscapeCoinMetaBean escapeCoinMetaBean, Long l, FactionInfo factionInfo, String str, String str2, String str3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            l = escapeCoinMetaBean.chainId;
        }
        if ((i3 & 2) != 0) {
            factionInfo = escapeCoinMetaBean.factionInfo;
        }
        FactionInfo factionInfo2 = factionInfo;
        if ((i3 & 4) != 0) {
            str = escapeCoinMetaBean.imageUrl;
        }
        String str4 = str;
        if ((i3 & 8) != 0) {
            str2 = escapeCoinMetaBean.chainImageUrl;
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            str3 = escapeCoinMetaBean.chainName;
        }
        String str6 = str3;
        if ((i3 & 32) != 0) {
            i = escapeCoinMetaBean.rank;
        }
        int i4 = i;
        if ((i3 & 64) != 0) {
            i2 = escapeCoinMetaBean.coinType;
        }
        return escapeCoinMetaBean.copy(l, factionInfo2, str4, str5, str6, i4, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FactionInfo component2() {
        return this.factionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.rank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.coinType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeCoinMetaBean copy(Long l, FactionInfo factionInfo, String str, String str2, String str3, int i, int i2) {
        return new EscapeCoinMetaBean(l, factionInfo, str, str2, str3, i, i2);
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
        if (!(obj instanceof EscapeCoinMetaBean)) {
            return false;
        }
        EscapeCoinMetaBean escapeCoinMetaBean = (EscapeCoinMetaBean) obj;
        return Intrinsics.EZpvd(this.chainId, escapeCoinMetaBean.chainId) && Intrinsics.EZpvd(this.factionInfo, escapeCoinMetaBean.factionInfo) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) escapeCoinMetaBean.imageUrl) && Intrinsics.EZpvd((Object) this.chainImageUrl, (Object) escapeCoinMetaBean.chainImageUrl) && Intrinsics.EZpvd((Object) this.chainName, (Object) escapeCoinMetaBean.chainName) && this.rank == escapeCoinMetaBean.rank && this.coinType == escapeCoinMetaBean.coinType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainImageUrl() {
        return this.chainImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCoinType() {
        return this.coinType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FactionInfo getFactionInfo() {
        return this.factionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRank() {
        return this.rank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.chainId;
        int iHashCode = l == null ? 0 : l.hashCode();
        FactionInfo factionInfo = this.factionInfo;
        int iHashCode2 = factionInfo == null ? 0 : factionInfo.hashCode();
        String str = this.imageUrl;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.chainImageUrl;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.chainName;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.coinType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(Long l) {
        this.chainId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainImageUrl(String str) {
        this.chainImageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(String str) {
        this.chainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinType(int i) {
        this.coinType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFactionInfo(FactionInfo factionInfo) {
        this.factionInfo = factionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRank(int i) {
        this.rank = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapeCoinMetaBean(chainId=" + this.chainId + ", factionInfo=" + this.factionInfo + ", imageUrl=" + this.imageUrl + ", chainImageUrl=" + this.chainImageUrl + ", chainName=" + this.chainName + ", rank=" + this.rank + ", coinType=" + this.coinType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.chainId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        FactionInfo factionInfo = this.factionInfo;
        if (factionInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            factionInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.chainImageUrl);
        parcel.writeString(this.chainName);
        parcel.writeInt(this.rank);
        parcel.writeInt(this.coinType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.EscapeCoinMetaBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EscapeCoinMetaBean> serializer() {
            return EscapeCoinMetaBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EscapeCoinMetaBean(int i, Long l, FactionInfo factionInfo, String str, String str2, String str3, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? -1L : l;
        if ((i & 2) == 0) {
            this.factionInfo = null;
        } else {
            this.factionInfo = factionInfo;
        }
        if ((i & 4) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str;
        }
        if ((i & 8) == 0) {
            this.chainImageUrl = null;
        } else {
            this.chainImageUrl = str2;
        }
        if ((i & 16) == 0) {
            this.chainName = null;
        } else {
            this.chainName = str3;
        }
        if ((i & 32) == 0) {
            this.rank = -1;
        } else {
            this.rank = i2;
        }
        if ((i & 64) == 0) {
            this.coinType = 0;
        } else {
            this.coinType = i3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EscapeCoinMetaBean escapeCoinMetaBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (l = escapeCoinMetaBean.chainId) == null || l.longValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, escapeCoinMetaBean.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || escapeCoinMetaBean.factionInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, FactionInfo$$serializer.INSTANCE, escapeCoinMetaBean.factionInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || escapeCoinMetaBean.imageUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, escapeCoinMetaBean.imageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || escapeCoinMetaBean.chainImageUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, escapeCoinMetaBean.chainImageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || escapeCoinMetaBean.chainName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, escapeCoinMetaBean.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || escapeCoinMetaBean.rank != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, escapeCoinMetaBean.rank);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && escapeCoinMetaBean.coinType == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 6, escapeCoinMetaBean.coinType);
    }

    public EscapeCoinMetaBean(Long l, FactionInfo factionInfo, String str, String str2, String str3, int i, int i2) {
        this.chainId = l;
        this.factionInfo = factionInfo;
        this.imageUrl = str;
        this.chainImageUrl = str2;
        this.chainName = str3;
        this.rank = i;
        this.coinType = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r6v0 java.lang.Long))
  (wrap:com.okinc.business.defi.biz.net.bean.FactionInfo:?: TERNARY null = ((wrap:int:0x000a: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.FactionInfo) : (r7v0 com.okinc.business.defi.biz.net.bean.FactionInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r13v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r10v0 java.lang.String) : (null java.lang.String))
  (wrap:int:0x002b: TERNARY null = ((wrap:int:0x0026: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r11v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002c: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
 A[MD:(java.lang.Long, com.okinc.business.defi.biz.net.bean.FactionInfo, java.lang.String, java.lang.String, java.lang.String, int, int):void (m)] (LINE:1193) call: com.okinc.business.defi.biz.net.bean.EscapeCoinMetaBean.<init>(java.lang.Long, com.okinc.business.defi.biz.net.bean.FactionInfo, java.lang.String, java.lang.String, java.lang.String, int, int):void type: THIS */
    public /* synthetic */ EscapeCoinMetaBean(Long l, FactionInfo factionInfo, String str, String str2, String str3, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1L : l, (i3 & 2) != 0 ? null : factionInfo, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : str2, (i3 & 16) == 0 ? str3 : null, (i3 & 32) != 0 ? -1 : i, (i3 & 64) != 0 ? 0 : i2);
    }
}
