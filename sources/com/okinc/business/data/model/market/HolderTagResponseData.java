package com.okinc.business.data.model.market;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class HolderTagResponseData implements Parcelable {
    public static final int $stable = 0;
    private final String creator;
    private final String dev;
    private final String liquidityPool;
    private final String smartMoney;
    private final String snipers;
    private final String suspicious;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<HolderTagResponseData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<HolderTagResponseData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HolderTagResponseData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HolderTagResponseData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HolderTagResponseData[] newArray(int i) {
            return new HolderTagResponseData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HolderTagResponseData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HolderTagResponseData copy$default(HolderTagResponseData holderTagResponseData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = holderTagResponseData.suspicious;
        }
        if ((i & 2) != 0) {
            str2 = holderTagResponseData.snipers;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = holderTagResponseData.liquidityPool;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = holderTagResponseData.creator;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = holderTagResponseData.dev;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = holderTagResponseData.smartMoney;
        }
        return holderTagResponseData.copy(str, str7, str8, str9, str10, str6);
    }

    @SerialName("creator")
    public static /* synthetic */ void getCreator$annotations() {
    }

    @SerialName("dev")
    public static /* synthetic */ void getDev$annotations() {
    }

    @SerialName("liquidityPool")
    public static /* synthetic */ void getLiquidityPool$annotations() {
    }

    @SerialName("smartMoney")
    public static /* synthetic */ void getSmartMoney$annotations() {
    }

    @SerialName("snipers")
    public static /* synthetic */ void getSnipers$annotations() {
    }

    @SerialName("suspicious")
    public static /* synthetic */ void getSuspicious$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.suspicious;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.snipers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.liquidityPool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.creator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.dev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.smartMoney;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderTagResponseData copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new HolderTagResponseData(str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof HolderTagResponseData)) {
            return false;
        }
        HolderTagResponseData holderTagResponseData = (HolderTagResponseData) obj;
        return Intrinsics.EZpvd((Object) this.suspicious, (Object) holderTagResponseData.suspicious) && Intrinsics.EZpvd((Object) this.snipers, (Object) holderTagResponseData.snipers) && Intrinsics.EZpvd((Object) this.liquidityPool, (Object) holderTagResponseData.liquidityPool) && Intrinsics.EZpvd((Object) this.creator, (Object) holderTagResponseData.creator) && Intrinsics.EZpvd((Object) this.dev, (Object) holderTagResponseData.dev) && Intrinsics.EZpvd((Object) this.smartMoney, (Object) holderTagResponseData.smartMoney);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreator() {
        return this.creator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDev() {
        return this.dev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiquidityPool() {
        return this.liquidityPool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSmartMoney() {
        return this.smartMoney;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSnipers() {
        return this.snipers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuspicious() {
        return this.suspicious;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.suspicious;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.snipers;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.liquidityPool;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.creator;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.dev;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.smartMoney;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HolderTagResponseData(suspicious=" + this.suspicious + ", snipers=" + this.snipers + ", liquidityPool=" + this.liquidityPool + ", creator=" + this.creator + ", dev=" + this.dev + ", smartMoney=" + this.smartMoney + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.suspicious);
        parcel.writeString(this.snipers);
        parcel.writeString(this.liquidityPool);
        parcel.writeString(this.creator);
        parcel.writeString(this.dev);
        parcel.writeString(this.smartMoney);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.data.model.market.HolderTagResponseData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HolderTagResponseData> serializer() {
            return HolderTagResponseData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HolderTagResponseData(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.suspicious = "";
        } else {
            this.suspicious = str;
        }
        if ((i & 2) == 0) {
            this.snipers = "";
        } else {
            this.snipers = str2;
        }
        if ((i & 4) == 0) {
            this.liquidityPool = "";
        } else {
            this.liquidityPool = str3;
        }
        if ((i & 8) == 0) {
            this.creator = "";
        } else {
            this.creator = str4;
        }
        if ((i & 16) == 0) {
            this.dev = "";
        } else {
            this.dev = str5;
        }
        if ((i & 32) == 0) {
            this.smartMoney = "";
        } else {
            this.smartMoney = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(HolderTagResponseData holderTagResponseData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) holderTagResponseData.suspicious, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, holderTagResponseData.suspicious);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) holderTagResponseData.snipers, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, holderTagResponseData.snipers);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) holderTagResponseData.liquidityPool, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, holderTagResponseData.liquidityPool);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) holderTagResponseData.creator, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, holderTagResponseData.creator);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) holderTagResponseData.dev, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, holderTagResponseData.dev);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) holderTagResponseData.smartMoney, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, holderTagResponseData.smartMoney);
    }

    public HolderTagResponseData(String str, String str2, String str3, String str4, String str5, String str6) {
        this.suspicious = str;
        this.snipers = str2;
        this.liquidityPool = str3;
        this.creator = str4;
        this.dev = str5;
        this.smartMoney = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:194) call: com.okinc.business.data.model.market.HolderTagResponseData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HolderTagResponseData(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
