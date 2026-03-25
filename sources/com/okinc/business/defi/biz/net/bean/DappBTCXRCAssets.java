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
public final class DappBTCXRCAssets implements Parcelable {
    private String amount;
    private String logo;
    private Integer protocolId;
    private String protocolName;
    private Integer protocolType;
    private String symbol;
    private Integer vdecimal;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DappBTCXRCAssets> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DappBTCXRCAssets> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappBTCXRCAssets createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DappBTCXRCAssets(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappBTCXRCAssets[] newArray(int i) {
            return new DappBTCXRCAssets[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DappBTCXRCAssets() {
        this((String) null, (String) null, (Integer) null, (String) null, (Integer) null, (Integer) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DappBTCXRCAssets copy$default(DappBTCXRCAssets dappBTCXRCAssets, String str, String str2, Integer num, String str3, Integer num2, Integer num3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dappBTCXRCAssets.symbol;
        }
        if ((i & 2) != 0) {
            str2 = dappBTCXRCAssets.amount;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            num = dappBTCXRCAssets.vdecimal;
        }
        Integer num4 = num;
        if ((i & 8) != 0) {
            str3 = dappBTCXRCAssets.protocolName;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            num2 = dappBTCXRCAssets.protocolId;
        }
        Integer num5 = num2;
        if ((i & 32) != 0) {
            num3 = dappBTCXRCAssets.protocolType;
        }
        Integer num6 = num3;
        if ((i & 64) != 0) {
            str4 = dappBTCXRCAssets.logo;
        }
        return dappBTCXRCAssets.copy(str, str5, num4, str6, num5, num6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.vdecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.protocolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.protocolType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappBTCXRCAssets copy(String str, String str2, Integer num, String str3, Integer num2, Integer num3, String str4) {
        return new DappBTCXRCAssets(str, str2, num, str3, num2, num3, str4);
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
        if (!(obj instanceof DappBTCXRCAssets)) {
            return false;
        }
        DappBTCXRCAssets dappBTCXRCAssets = (DappBTCXRCAssets) obj;
        return Intrinsics.EZpvd((Object) this.symbol, (Object) dappBTCXRCAssets.symbol) && Intrinsics.EZpvd((Object) this.amount, (Object) dappBTCXRCAssets.amount) && Intrinsics.EZpvd(this.vdecimal, dappBTCXRCAssets.vdecimal) && Intrinsics.EZpvd((Object) this.protocolName, (Object) dappBTCXRCAssets.protocolName) && Intrinsics.EZpvd(this.protocolId, dappBTCXRCAssets.protocolId) && Intrinsics.EZpvd(this.protocolType, dappBTCXRCAssets.protocolType) && Intrinsics.EZpvd((Object) this.logo, (Object) dappBTCXRCAssets.logo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProtocolId() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProtocolName() {
        return this.protocolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProtocolType() {
        return this.protocolType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getVdecimal() {
        return this.vdecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.symbol;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.amount;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.vdecimal;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str3 = this.protocolName;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Integer num2 = this.protocolId;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.protocolType;
        int iHashCode6 = num3 == null ? 0 : num3.hashCode();
        String str4 = this.logo;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogo(String str) {
        this.logo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProtocolId(Integer num) {
        this.protocolId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProtocolName(String str) {
        this.protocolName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProtocolType(Integer num) {
        this.protocolType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(String str) {
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVdecimal(Integer num) {
        this.vdecimal = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappBTCXRCAssets(symbol=" + this.symbol + ", amount=" + this.amount + ", vdecimal=" + this.vdecimal + ", protocolName=" + this.protocolName + ", protocolId=" + this.protocolId + ", protocolType=" + this.protocolType + ", logo=" + this.logo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.symbol);
        parcel.writeString(this.amount);
        Integer num = this.vdecimal;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.protocolName);
        Integer num2 = this.protocolId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.protocolType;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.logo);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.DappBTCXRCAssets.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DappBTCXRCAssets> serializer() {
            return DappBTCXRCAssets$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DappBTCXRCAssets(int i, String str, String str2, Integer num, String str3, Integer num2, Integer num3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.symbol = null;
        } else {
            this.symbol = str;
        }
        if ((i & 2) == 0) {
            this.amount = null;
        } else {
            this.amount = str2;
        }
        if ((i & 4) == 0) {
            this.vdecimal = null;
        } else {
            this.vdecimal = num;
        }
        if ((i & 8) == 0) {
            this.protocolName = null;
        } else {
            this.protocolName = str3;
        }
        if ((i & 16) == 0) {
            this.protocolId = null;
        } else {
            this.protocolId = num2;
        }
        if ((i & 32) == 0) {
            this.protocolType = null;
        } else {
            this.protocolType = num3;
        }
        if ((i & 64) == 0) {
            this.logo = null;
        } else {
            this.logo = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(DappBTCXRCAssets dappBTCXRCAssets, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dappBTCXRCAssets.symbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, dappBTCXRCAssets.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dappBTCXRCAssets.amount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, dappBTCXRCAssets.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dappBTCXRCAssets.vdecimal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, dappBTCXRCAssets.vdecimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dappBTCXRCAssets.protocolName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, dappBTCXRCAssets.protocolName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || dappBTCXRCAssets.protocolId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, dappBTCXRCAssets.protocolId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || dappBTCXRCAssets.protocolType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, dappBTCXRCAssets.protocolType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && dappBTCXRCAssets.logo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, dappBTCXRCAssets.logo);
    }

    public DappBTCXRCAssets(String str, String str2, Integer num, String str3, Integer num2, Integer num3, String str4) {
        this.symbol = str;
        this.amount = str2;
        this.vdecimal = num;
        this.protocolName = str3;
        this.protocolId = num2;
        this.protocolType = num3;
        this.logo = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r12v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String):void (m)] (LINE:1619) call: com.okinc.business.defi.biz.net.bean.DappBTCXRCAssets.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ DappBTCXRCAssets(String str, String str2, Integer num, String str3, Integer num2, Integer num3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : str4);
    }
}
