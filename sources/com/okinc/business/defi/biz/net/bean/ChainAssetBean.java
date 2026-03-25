package com.okinc.business.defi.biz.net.bean;

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

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class ChainAssetBean implements Parcelable {
    public static final int $stable = 0;
    private final String chainImageUrl;
    private final long chainIndex;
    private final String chainName;
    private final String currencyAmount;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ChainAssetBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ChainAssetBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChainAssetBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ChainAssetBean(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChainAssetBean[] newArray(int i) {
            return new ChainAssetBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChainAssetBean() {
        this(0L, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChainAssetBean copy$default(ChainAssetBean chainAssetBean, long j, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = chainAssetBean.chainIndex;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = chainAssetBean.chainName;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = chainAssetBean.chainImageUrl;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = chainAssetBean.currencyAmount;
        }
        return chainAssetBean.copy(j2, str4, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChainAssetBean copy(long j, String str, String str2, String str3) {
        return new ChainAssetBean(j, str, str2, str3);
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
        if (!(obj instanceof ChainAssetBean)) {
            return false;
        }
        ChainAssetBean chainAssetBean = (ChainAssetBean) obj;
        return this.chainIndex == chainAssetBean.chainIndex && Intrinsics.EZpvd((Object) this.chainName, (Object) chainAssetBean.chainName) && Intrinsics.EZpvd((Object) this.chainImageUrl, (Object) chainAssetBean.chainImageUrl) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) chainAssetBean.currencyAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainImageUrl() {
        return this.chainImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.chainIndex);
        String str = this.chainName;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.chainImageUrl;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.currencyAmount;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChainAssetBean(chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", chainImageUrl=" + this.chainImageUrl + ", currencyAmount=" + this.currencyAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.chainIndex);
        parcel.writeString(this.chainName);
        parcel.writeString(this.chainImageUrl);
        parcel.writeString(this.currencyAmount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.ChainAssetBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChainAssetBean> serializer() {
            return ChainAssetBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChainAssetBean(int i, long j, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainIndex = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str;
        }
        if ((i & 4) == 0) {
            this.chainImageUrl = "";
        } else {
            this.chainImageUrl = str2;
        }
        if ((i & 8) == 0) {
            this.currencyAmount = "";
        } else {
            this.currencyAmount = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ChainAssetBean chainAssetBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || chainAssetBean.chainIndex != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, chainAssetBean.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) chainAssetBean.chainName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, chainAssetBean.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) chainAssetBean.chainImageUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, chainAssetBean.chainImageUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) chainAssetBean.currencyAmount, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, chainAssetBean.currencyAmount);
    }

    public ChainAssetBean(long j, String str, String str2, String str3) {
        this.chainIndex = j;
        this.chainName = str;
        this.chainImageUrl = str2;
        this.currencyAmount = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (wrap:long:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r7v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1699) call: com.okinc.business.defi.biz.net.bean.ChainAssetBean.<init>(long, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ChainAssetBean(long j, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
