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
public final class ListChainResponse implements Parcelable {
    private Long chainIndex;
    private String chainName;
    private String imageUrl;
    private String seoChainFullName;
    private String seoUrlNaming;
    private String symbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ListChainResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ListChainResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ListChainResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ListChainResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ListChainResponse[] newArray(int i) {
            return new ListChainResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ListChainResponse() {
        this((String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ListChainResponse copy$default(ListChainResponse listChainResponse, String str, String str2, String str3, String str4, Long l, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listChainResponse.chainName;
        }
        if ((i & 2) != 0) {
            str2 = listChainResponse.symbol;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = listChainResponse.imageUrl;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = listChainResponse.seoUrlNaming;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            l = listChainResponse.chainIndex;
        }
        Long l2 = l;
        if ((i & 32) != 0) {
            str5 = listChainResponse.seoChainFullName;
        }
        return listChainResponse.copy(str, str6, str7, str8, l2, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.seoUrlNaming;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component5() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.seoChainFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ListChainResponse copy(String str, String str2, String str3, String str4, Long l, String str5) {
        return new ListChainResponse(str, str2, str3, str4, l, str5);
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
        if (!(obj instanceof ListChainResponse)) {
            return false;
        }
        ListChainResponse listChainResponse = (ListChainResponse) obj;
        return Intrinsics.EZpvd((Object) this.chainName, (Object) listChainResponse.chainName) && Intrinsics.EZpvd((Object) this.symbol, (Object) listChainResponse.symbol) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) listChainResponse.imageUrl) && Intrinsics.EZpvd((Object) this.seoUrlNaming, (Object) listChainResponse.seoUrlNaming) && Intrinsics.EZpvd(this.chainIndex, listChainResponse.chainIndex) && Intrinsics.EZpvd((Object) this.seoChainFullName, (Object) listChainResponse.seoChainFullName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSeoChainFullName() {
        return this.seoChainFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSeoUrlNaming() {
        return this.seoUrlNaming;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.chainName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.symbol;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.imageUrl;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.seoUrlNaming;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        Long l = this.chainIndex;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        String str5 = this.seoChainFullName;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIndex(Long l) {
        this.chainIndex = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(String str) {
        this.chainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSeoChainFullName(String str) {
        this.seoChainFullName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSeoUrlNaming(String str) {
        this.seoUrlNaming = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(String str) {
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ListChainResponse(chainName=" + this.chainName + ", symbol=" + this.symbol + ", imageUrl=" + this.imageUrl + ", seoUrlNaming=" + this.seoUrlNaming + ", chainIndex=" + this.chainIndex + ", seoChainFullName=" + this.seoChainFullName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainName);
        parcel.writeString(this.symbol);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.seoUrlNaming);
        Long l = this.chainIndex;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.seoChainFullName);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.ListChainResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ListChainResponse> serializer() {
            return ListChainResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ListChainResponse(int i, String str, String str2, String str3, String str4, Long l, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str;
        }
        if ((i & 2) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str2;
        }
        if ((i & 4) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str3;
        }
        if ((i & 8) == 0) {
            this.seoUrlNaming = "";
        } else {
            this.seoUrlNaming = str4;
        }
        if ((i & 16) == 0) {
            this.chainIndex = 0L;
        } else {
            this.chainIndex = l;
        }
        if ((i & 32) == 0) {
            this.seoChainFullName = "";
        } else {
            this.seoChainFullName = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ListChainResponse listChainResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) listChainResponse.chainName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, listChainResponse.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) listChainResponse.symbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, listChainResponse.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) listChainResponse.imageUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, listChainResponse.imageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) listChainResponse.seoUrlNaming, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, listChainResponse.seoUrlNaming);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || (l = listChainResponse.chainIndex) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, listChainResponse.chainIndex);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) listChainResponse.seoChainFullName, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, listChainResponse.seoChainFullName);
    }

    public ListChainResponse(String str, String str2, String str3, String str4, Long l, String str5) {
        this.chainName = str;
        this.symbol = str2;
        this.imageUrl = str3;
        this.seoUrlNaming = str4;
        this.chainIndex = l;
        this.seoChainFullName = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.Long:0x0028: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r10v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String):void (m)] (LINE:254) call: com.okinc.business.defi.biz.net.bean.ListChainResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String):void type: THIS */
    public /* synthetic */ ListChainResponse(String str, String str2, String str3, String str4, Long l, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? 0L : l, (i & 32) != 0 ? "" : str5);
    }
}
