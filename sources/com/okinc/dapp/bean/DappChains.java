package com.okinc.dapp.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class DappChains extends BaseOptionsBean implements Parcelable {
    private long chainId;
    private String dayTimeIcon;
    private boolean hotFlag;
    private long id;
    private String logo;
    private String network;
    private String nightIcon;
    private String slug;
    private int sort;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DappChains> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DappChains> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappChains createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DappChains(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappChains[] newArray(int i) {
            return new DappChains[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DappChains() {
        this(0L, null, null, null, 0, 0L, false, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.sort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.hotFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.dayTimeIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.nightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappChains copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, int i, long j2, boolean z, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new DappChains(j, str, str2, str3, i, j2, z, str4, str5);
    }

    @Override // com.okinc.dapp.bean.BaseOptionsBean, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DappChains)) {
            return false;
        }
        DappChains dappChains = (DappChains) obj;
        return this.id == dappChains.id && Intrinsics.EZpvd((Object) this.logo, (Object) dappChains.logo) && Intrinsics.EZpvd((Object) this.slug, (Object) dappChains.slug) && Intrinsics.EZpvd((Object) this.network, (Object) dappChains.network) && this.sort == dappChains.sort && this.chainId == dappChains.chainId && this.hotFlag == dappChains.hotFlag && Intrinsics.EZpvd((Object) this.dayTimeIcon, (Object) dappChains.dayTimeIcon) && Intrinsics.EZpvd((Object) this.nightIcon, (Object) dappChains.nightIcon);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDayTimeIcon() {
        return this.dayTimeIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHotFlag() {
        return this.hotFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNightIcon() {
        return this.nightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlug() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSort() {
        return this.sort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((Long.hashCode(this.id) * 31) + this.logo.hashCode()) * 31) + this.slug.hashCode()) * 31) + this.network.hashCode()) * 31) + Integer.hashCode(this.sort)) * 31) + Long.hashCode(this.chainId)) * 31) + Boolean.hashCode(this.hotFlag)) * 31) + this.dayTimeIcon.hashCode()) * 31) + this.nightIcon.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(long j) {
        this.chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDayTimeIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dayTimeIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHotFlag(boolean z) {
        this.hotFlag = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(long j) {
        this.id = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.logo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetwork(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.network = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNightIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nightIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlug(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slug = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSort(int i) {
        this.sort = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappChains(id=" + this.id + ", logo=" + this.logo + ", slug=" + this.slug + ", network=" + this.network + ", sort=" + this.sort + ", chainId=" + this.chainId + ", hotFlag=" + this.hotFlag + ", dayTimeIcon=" + this.dayTimeIcon + ", nightIcon=" + this.nightIcon + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.dapp.bean.BaseOptionsBean, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.id);
        parcel.writeString(this.logo);
        parcel.writeString(this.slug);
        parcel.writeString(this.network);
        parcel.writeInt(this.sort);
        parcel.writeLong(this.chainId);
        parcel.writeInt(this.hotFlag ? 1 : 0);
        parcel.writeString(this.dayTimeIcon);
        parcel.writeString(this.nightIcon);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dapp.bean.DappChains.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DappChains> serializer() {
            return DappChains$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DappChains(int i, boolean z, long j, String str, String str2, String str3, int i2, long j2, boolean z2, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, z, serializationConstructorMarker);
        if ((i & 2) == 0) {
            this.id = 0L;
        } else {
            this.id = j;
        }
        if ((i & 4) == 0) {
            this.logo = "";
        } else {
            this.logo = str;
        }
        if ((i & 8) == 0) {
            this.slug = "";
        } else {
            this.slug = str2;
        }
        if ((i & 16) == 0) {
            this.network = "";
        } else {
            this.network = str3;
        }
        if ((i & 32) == 0) {
            this.sort = 0;
        } else {
            this.sort = i2;
        }
        if ((i & 64) == 0) {
            this.chainId = 0L;
        } else {
            this.chainId = j2;
        }
        if ((i & 128) == 0) {
            this.hotFlag = false;
        } else {
            this.hotFlag = z2;
        }
        if ((i & 256) == 0) {
            this.dayTimeIcon = "";
        } else {
            this.dayTimeIcon = str4;
        }
        if ((i & 512) == 0) {
            this.nightIcon = "";
        } else {
            this.nightIcon = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKDiscover_discover_api(DappChains dappChains, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BaseOptionsBean.write$Self(dappChains, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dappChains.id != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, dappChains.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dappChains.logo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dappChains.logo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dappChains.slug, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dappChains.slug);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dappChains.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dappChains.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || dappChains.sort != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, dappChains.sort);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || dappChains.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 6, dappChains.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || dappChains.hotFlag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, dappChains.hotFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) dappChains.dayTimeIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, dappChains.dayTimeIcon);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) dappChains.nightIcon, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, dappChains.nightIcon);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005c: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r13v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0024: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r18v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002d: ARITH (r24v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r19v0 long) : (0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0034: ARITH (r24v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r21v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r24v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, int, long, boolean, java.lang.String, java.lang.String):void (m)] (LINE:30) call: com.okinc.dapp.bean.DappChains.<init>(long, java.lang.String, java.lang.String, java.lang.String, int, long, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DappChains(long j, String str, String str2, String str3, int i, long j2, boolean z, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? 0 : i, (i2 & 32) == 0 ? j2 : 0L, (i2 & 64) == 0 ? z : false, (i2 & 128) != 0 ? "" : str4, (i2 & 256) == 0 ? str5 : "");
    }

    public DappChains(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, int i, long j2, boolean z, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.id = j;
        this.logo = str;
        this.slug = str2;
        this.network = str3;
        this.sort = i;
        this.chainId = j2;
        this.hotFlag = z;
        this.dayTimeIcon = str4;
        this.nightIcon = str5;
    }
}
