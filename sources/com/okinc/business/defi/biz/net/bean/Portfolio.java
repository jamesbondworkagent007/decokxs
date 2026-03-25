package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class Portfolio implements Parcelable {
    private String balance;
    private Long chainId;
    private String chainName;
    private String logo;
    private String network;
    private String platform;
    private String platformId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Portfolio> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Portfolio> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Portfolio createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Portfolio(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Portfolio[] newArray(int i) {
            return new Portfolio[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Portfolio() {
        this((String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Portfolio copy$default(Portfolio portfolio, String str, String str2, Long l, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = portfolio.platform;
        }
        if ((i & 2) != 0) {
            str2 = portfolio.platformId;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            l = portfolio.chainId;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            str3 = portfolio.chainName;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = portfolio.network;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = portfolio.logo;
        }
        String str10 = str5;
        if ((i & 64) != 0) {
            str6 = portfolio.balance;
        }
        return portfolio.copy(str, str7, l2, str8, str9, str10, str6);
    }

    @SerialName("bal")
    public static /* synthetic */ void getBalance$annotations() {
    }

    @SerialName("chId")
    public static /* synthetic */ void getChainId$annotations() {
    }

    @SerialName("chN")
    public static /* synthetic */ void getChainName$annotations() {
    }

    @SerialName("lg")
    public static /* synthetic */ void getLogo$annotations() {
    }

    @SerialName("net")
    public static /* synthetic */ void getNetwork$annotations() {
    }

    @SerialName(TtmlNode.TAG_P)
    public static /* synthetic */ void getPlatform$annotations() {
    }

    @SerialName("pid")
    public static /* synthetic */ void getPlatformId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.platformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Portfolio copy(String str, String str2, Long l, String str3, String str4, String str5, String str6) {
        return new Portfolio(str, str2, l, str3, str4, str5, str6);
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
        if (!(obj instanceof Portfolio)) {
            return false;
        }
        Portfolio portfolio = (Portfolio) obj;
        return Intrinsics.EZpvd((Object) this.platform, (Object) portfolio.platform) && Intrinsics.EZpvd((Object) this.platformId, (Object) portfolio.platformId) && Intrinsics.EZpvd(this.chainId, portfolio.chainId) && Intrinsics.EZpvd((Object) this.chainName, (Object) portfolio.chainName) && Intrinsics.EZpvd((Object) this.network, (Object) portfolio.network) && Intrinsics.EZpvd((Object) this.logo, (Object) portfolio.logo) && Intrinsics.EZpvd((Object) this.balance, (Object) portfolio.balance);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
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
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformId() {
        return this.platformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.platform;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.platformId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Long l = this.chainId;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        String str3 = this.chainName;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.network;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.logo;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.balance;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalance(String str) {
        this.balance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(Long l) {
        this.chainId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(String str) {
        this.chainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogo(String str) {
        this.logo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetwork(String str) {
        this.network = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlatform(String str) {
        this.platform = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlatformId(String str) {
        this.platformId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Portfolio(platform=" + this.platform + ", platformId=" + this.platformId + ", chainId=" + this.chainId + ", chainName=" + this.chainName + ", network=" + this.network + ", logo=" + this.logo + ", balance=" + this.balance + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.platform);
        parcel.writeString(this.platformId);
        Long l = this.chainId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.chainName);
        parcel.writeString(this.network);
        parcel.writeString(this.logo);
        parcel.writeString(this.balance);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.Portfolio.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Portfolio> serializer() {
            return Portfolio$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Portfolio(int i, String str, String str2, Long l, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.platform = "";
        } else {
            this.platform = str;
        }
        if ((i & 2) == 0) {
            this.platformId = "";
        } else {
            this.platformId = str2;
        }
        if ((i & 4) == 0) {
            this.chainId = 0L;
        } else {
            this.chainId = l;
        }
        if ((i & 8) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str3;
        }
        if ((i & 16) == 0) {
            this.network = "";
        } else {
            this.network = str4;
        }
        if ((i & 32) == 0) {
            this.logo = "";
        } else {
            this.logo = str5;
        }
        if ((i & 64) == 0) {
            this.balance = "0";
        } else {
            this.balance = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Portfolio portfolio, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) portfolio.platform, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, portfolio.platform);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) portfolio.platformId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, portfolio.platformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || (l = portfolio.chainId) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, portfolio.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) portfolio.chainName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, portfolio.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) portfolio.network, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, portfolio.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) portfolio.logo, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, portfolio.logo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) portfolio.balance, (Object) "0")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, portfolio.balance);
    }

    public Portfolio(String str, String str2, Long l, String str3, String str4, String str5, String str6) {
        this.platform = str;
        this.platformId = str2;
        this.chainId = l;
        this.chainName = str3;
        this.network = str4;
        this.logo = str5;
        this.balance = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.Long:0x001a: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r8v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("0") : (r12v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:18) call: com.okinc.business.defi.biz.net.bean.Portfolio.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ Portfolio(String str, String str2, Long l, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : l, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) == 0 ? str5 : "", (i & 64) != 0 ? "0" : str6);
    }
}
