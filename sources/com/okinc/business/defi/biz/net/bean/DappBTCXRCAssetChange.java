package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DappBTCXRCAssetChange implements Parcelable {
    private String amount;
    private Integer direction;
    private String logo;
    private String symbol;
    private String usdAmount;
    private Integer vdecimal;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DappBTCXRCAssetChange> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DappBTCXRCAssetChange> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappBTCXRCAssetChange createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DappBTCXRCAssetChange(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappBTCXRCAssetChange[] newArray(int i) {
            return new DappBTCXRCAssetChange[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DappBTCXRCAssetChange() {
        this((Integer) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DappBTCXRCAssetChange copy$default(DappBTCXRCAssetChange dappBTCXRCAssetChange, Integer num, String str, String str2, Integer num2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = dappBTCXRCAssetChange.direction;
        }
        if ((i & 2) != 0) {
            str = dappBTCXRCAssetChange.amount;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = dappBTCXRCAssetChange.usdAmount;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            num2 = dappBTCXRCAssetChange.vdecimal;
        }
        Integer num3 = num2;
        if ((i & 16) != 0) {
            str3 = dappBTCXRCAssetChange.symbol;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = dappBTCXRCAssetChange.logo;
        }
        return dappBTCXRCAssetChange.copy(num, str5, str6, num3, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.vdecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappBTCXRCAssetChange copy(Integer num, String str, String str2, Integer num2, String str3, String str4) {
        return new DappBTCXRCAssetChange(num, str, str2, num2, str3, str4);
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
        if (!(obj instanceof DappBTCXRCAssetChange)) {
            return false;
        }
        DappBTCXRCAssetChange dappBTCXRCAssetChange = (DappBTCXRCAssetChange) obj;
        return Intrinsics.EZpvd(this.direction, dappBTCXRCAssetChange.direction) && Intrinsics.EZpvd((Object) this.amount, (Object) dappBTCXRCAssetChange.amount) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) dappBTCXRCAssetChange.usdAmount) && Intrinsics.EZpvd(this.vdecimal, dappBTCXRCAssetChange.vdecimal) && Intrinsics.EZpvd((Object) this.symbol, (Object) dappBTCXRCAssetChange.symbol) && Intrinsics.EZpvd((Object) this.logo, (Object) dappBTCXRCAssetChange.logo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdAmount() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getVdecimal() {
        return this.vdecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.direction;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.amount;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.usdAmount;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.vdecimal;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        String str3 = this.symbol;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.logo;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(Integer num) {
        this.direction = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogo(String str) {
        this.logo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(String str) {
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdAmount(String str) {
        this.usdAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVdecimal(Integer num) {
        this.vdecimal = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappBTCXRCAssetChange(direction=" + this.direction + ", amount=" + this.amount + ", usdAmount=" + this.usdAmount + ", vdecimal=" + this.vdecimal + ", symbol=" + this.symbol + ", logo=" + this.logo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.direction;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.amount);
        parcel.writeString(this.usdAmount);
        Integer num2 = this.vdecimal;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.symbol);
        parcel.writeString(this.logo);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.DappBTCXRCAssetChange.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DappBTCXRCAssetChange> serializer() {
            return DappBTCXRCAssetChange$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DappBTCXRCAssetChange(int i, Integer num, String str, String str2, Integer num2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.direction = null;
        } else {
            this.direction = num;
        }
        if ((i & 2) == 0) {
            this.amount = null;
        } else {
            this.amount = str;
        }
        if ((i & 4) == 0) {
            this.usdAmount = null;
        } else {
            this.usdAmount = str2;
        }
        if ((i & 8) == 0) {
            this.vdecimal = null;
        } else {
            this.vdecimal = num2;
        }
        if ((i & 16) == 0) {
            this.symbol = null;
        } else {
            this.symbol = str3;
        }
        if ((i & 32) == 0) {
            this.logo = null;
        } else {
            this.logo = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(DappBTCXRCAssetChange dappBTCXRCAssetChange, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dappBTCXRCAssetChange.direction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, dappBTCXRCAssetChange.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dappBTCXRCAssetChange.amount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, dappBTCXRCAssetChange.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dappBTCXRCAssetChange.usdAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, dappBTCXRCAssetChange.usdAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dappBTCXRCAssetChange.vdecimal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, dappBTCXRCAssetChange.vdecimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || dappBTCXRCAssetChange.symbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, dappBTCXRCAssetChange.symbol);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && dappBTCXRCAssetChange.logo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, dappBTCXRCAssetChange.logo);
    }

    public DappBTCXRCAssetChange(Integer num, String str, String str2, Integer num2, String str3, String str4) {
        this.direction = num;
        this.amount = str;
        this.usdAmount = str2;
        this.vdecimal = num2;
        this.symbol = str3;
        this.logo = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String):void (m)] (LINE:1632) call: com.okinc.business.defi.biz.net.bean.DappBTCXRCAssetChange.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DappBTCXRCAssetChange(Integer num, String str, String str2, Integer num2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
