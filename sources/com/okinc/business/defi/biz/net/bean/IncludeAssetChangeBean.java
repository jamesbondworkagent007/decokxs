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
public final class IncludeAssetChangeBean implements Parcelable {
    private String amount;
    private boolean brc20Coin;
    private String direction;
    private String icon;
    private String name;
    private Integer protocolId;
    private String protocolName;
    private Integer vdecimalNum;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<IncludeAssetChangeBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<IncludeAssetChangeBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IncludeAssetChangeBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new IncludeAssetChangeBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IncludeAssetChangeBean[] newArray(int i) {
            return new IncludeAssetChangeBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IncludeAssetChangeBean() {
        this((String) null, (String) null, (String) null, (Integer) null, false, (String) null, (Integer) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.vdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.brc20Coin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.protocolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IncludeAssetChangeBean copy(String str, String str2, String str3, Integer num, boolean z, String str4, Integer num2, String str5) {
        return new IncludeAssetChangeBean(str, str2, str3, num, z, str4, num2, str5);
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
        if (!(obj instanceof IncludeAssetChangeBean)) {
            return false;
        }
        IncludeAssetChangeBean includeAssetChangeBean = (IncludeAssetChangeBean) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) includeAssetChangeBean.amount) && Intrinsics.EZpvd((Object) this.direction, (Object) includeAssetChangeBean.direction) && Intrinsics.EZpvd((Object) this.name, (Object) includeAssetChangeBean.name) && Intrinsics.EZpvd(this.vdecimalNum, includeAssetChangeBean.vdecimalNum) && this.brc20Coin == includeAssetChangeBean.brc20Coin && Intrinsics.EZpvd((Object) this.protocolName, (Object) includeAssetChangeBean.protocolName) && Intrinsics.EZpvd(this.protocolId, includeAssetChangeBean.protocolId) && Intrinsics.EZpvd((Object) this.icon, (Object) includeAssetChangeBean.icon);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBrc20Coin() {
        return this.brc20Coin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
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
    public final Integer getVdecimalNum() {
        return this.vdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.amount;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.direction;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.name;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.vdecimalNum;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        int iHashCode5 = Boolean.hashCode(this.brc20Coin);
        String str4 = this.protocolName;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        Integer num2 = this.protocolId;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        String str5 = this.icon;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBrc20Coin(boolean z) {
        this.brc20Coin = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(String str) {
        this.direction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcon(String str) {
        this.icon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(String str) {
        this.name = str;
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
    public final void setVdecimalNum(Integer num) {
        this.vdecimalNum = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IncludeAssetChangeBean(amount=" + this.amount + ", direction=" + this.direction + ", name=" + this.name + ", vdecimalNum=" + this.vdecimalNum + ", brc20Coin=" + this.brc20Coin + ", protocolName=" + this.protocolName + ", protocolId=" + this.protocolId + ", icon=" + this.icon + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.amount);
        parcel.writeString(this.direction);
        parcel.writeString(this.name);
        Integer num = this.vdecimalNum;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.brc20Coin ? 1 : 0);
        parcel.writeString(this.protocolName);
        Integer num2 = this.protocolId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.icon);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.IncludeAssetChangeBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IncludeAssetChangeBean> serializer() {
            return IncludeAssetChangeBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IncludeAssetChangeBean(int i, String str, String str2, String str3, Integer num, boolean z, String str4, Integer num2, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.amount = null;
        } else {
            this.amount = str;
        }
        if ((i & 2) == 0) {
            this.direction = "";
        } else {
            this.direction = str2;
        }
        if ((i & 4) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
        if ((i & 8) == 0) {
            this.vdecimalNum = 0;
        } else {
            this.vdecimalNum = num;
        }
        if ((i & 16) == 0) {
            this.brc20Coin = false;
        } else {
            this.brc20Coin = z;
        }
        if ((i & 32) == 0) {
            this.protocolName = null;
        } else {
            this.protocolName = str4;
        }
        if ((i & 64) == 0) {
            this.protocolId = 0;
        } else {
            this.protocolId = num2;
        }
        if ((i & 128) == 0) {
            this.icon = null;
        } else {
            this.icon = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(IncludeAssetChangeBean includeAssetChangeBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || includeAssetChangeBean.amount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, includeAssetChangeBean.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) includeAssetChangeBean.direction, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, includeAssetChangeBean.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || includeAssetChangeBean.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, includeAssetChangeBean.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || (num2 = includeAssetChangeBean.vdecimalNum) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, includeAssetChangeBean.vdecimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || includeAssetChangeBean.brc20Coin) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, includeAssetChangeBean.brc20Coin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || includeAssetChangeBean.protocolName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, includeAssetChangeBean.protocolName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || (num = includeAssetChangeBean.protocolId) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, includeAssetChangeBean.protocolId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && includeAssetChangeBean.icon == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, includeAssetChangeBean.icon);
    }

    public IncludeAssetChangeBean(String str, String str2, String str3, Integer num, boolean z, String str4, Integer num2, String str5) {
        this.amount = str;
        this.direction = str2;
        this.name = str3;
        this.vdecimalNum = num;
        this.brc20Coin = z;
        this.protocolName = str4;
        this.protocolId = num2;
        this.icon = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0052: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0019: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r14v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r19v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r19v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0033: ARITH (r19v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r17v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r19v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, boolean, java.lang.String, java.lang.Integer, java.lang.String):void (m)] (LINE:222) call: com.okinc.business.defi.biz.net.bean.IncludeAssetChangeBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, boolean, java.lang.String, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ IncludeAssetChangeBean(String str, String str2, String str3, Integer num, boolean z, String str4, Integer num2, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? 0 : num, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? 0 : num2, (i & 128) == 0 ? str5 : null);
    }
}
