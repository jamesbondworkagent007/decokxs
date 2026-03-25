package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.defi.api.bean.BTCDappSignData;
import com.okinc.business.defi.api.bean.SignData;
import com.okinc.business.defi.api.bean.SuiSignData;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33489mxS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestCallData implements Parcelable {
    public static final int $stable = 0;
    private final String checkSum;
    private final String cosmosData;
    private final String data;
    private final String from;
    private final Integer gasRate;
    private final String orderId;
    private final String providerPubkey;
    private final String serializedData;
    private final String to;
    private final String txOptions;
    private final String txSerialize;
    private final String unsignedTx;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestCallData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestCallData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestCallData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestCallData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestCallData[] newArray(int i) {
            return new InvestCallData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestCallData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    @SerialName("checkSum")
    public static /* synthetic */ void getCheckSum$annotations() {
    }

    @SerialName("cosmosData")
    public static /* synthetic */ void getCosmosData$annotations() {
    }

    @SerialName("data")
    public static /* synthetic */ void getData$annotations() {
    }

    @SerialName("orderId")
    public static /* synthetic */ void getOrderId$annotations() {
    }

    @SerialName("providerPubkey")
    public static /* synthetic */ void getProviderPubkey$annotations() {
    }

    @SerialName("serializedData")
    public static /* synthetic */ void getSerializedData$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.checkSum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.serializedData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.providerPubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.gasRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.txSerialize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.txOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.cosmosData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestCallData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, Integer num, @NotNull String str6, String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        return new InvestCallData(str, str2, str3, str4, str5, num, str6, str7, str8, str9, str10, str11, str12);
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
        if (!(obj instanceof InvestCallData)) {
            return false;
        }
        InvestCallData investCallData = (InvestCallData) obj;
        return Intrinsics.EZpvd((Object) this.from, (Object) investCallData.from) && Intrinsics.EZpvd((Object) this.to, (Object) investCallData.to) && Intrinsics.EZpvd((Object) this.data, (Object) investCallData.data) && Intrinsics.EZpvd((Object) this.value, (Object) investCallData.value) && Intrinsics.EZpvd((Object) this.unsignedTx, (Object) investCallData.unsignedTx) && Intrinsics.EZpvd(this.gasRate, investCallData.gasRate) && Intrinsics.EZpvd((Object) this.txSerialize, (Object) investCallData.txSerialize) && Intrinsics.EZpvd((Object) this.txOptions, (Object) investCallData.txOptions) && Intrinsics.EZpvd((Object) this.cosmosData, (Object) investCallData.cosmosData) && Intrinsics.EZpvd((Object) this.checkSum, (Object) investCallData.checkSum) && Intrinsics.EZpvd((Object) this.orderId, (Object) investCallData.orderId) && Intrinsics.EZpvd((Object) this.serializedData, (Object) investCallData.serializedData) && Intrinsics.EZpvd((Object) this.providerPubkey, (Object) investCallData.providerPubkey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCheckSum() {
        return this.checkSum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCosmosData() {
        return this.cosmosData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getGasRate() {
        return this.gasRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProviderPubkey() {
        return this.providerPubkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSerializedData() {
        return this.serializedData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxOptions() {
        return this.txOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxSerialize() {
        return this.txSerialize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnsignedTx() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.from.hashCode();
        int iHashCode2 = this.to.hashCode();
        int iHashCode3 = this.data.hashCode();
        int iHashCode4 = this.value.hashCode();
        int iHashCode5 = this.unsignedTx.hashCode();
        Integer num = this.gasRate;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        int iHashCode7 = this.txSerialize.hashCode();
        String str = this.txOptions;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.cosmosData.hashCode()) * 31) + this.checkSum.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.serializedData.hashCode()) * 31) + this.providerPubkey.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestCallData(from=" + this.from + ", to=" + this.to + ", data=" + this.data + ", value=" + this.value + ", unsignedTx=" + this.unsignedTx + ", gasRate=" + this.gasRate + ", txSerialize=" + this.txSerialize + ", txOptions=" + this.txOptions + ", cosmosData=" + this.cosmosData + ", checkSum=" + this.checkSum + ", orderId=" + this.orderId + ", serializedData=" + this.serializedData + ", providerPubkey=" + this.providerPubkey + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.from);
        parcel.writeString(this.to);
        parcel.writeString(this.data);
        parcel.writeString(this.value);
        parcel.writeString(this.unsignedTx);
        Integer num = this.gasRate;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.txSerialize);
        parcel.writeString(this.txOptions);
        parcel.writeString(this.cosmosData);
        parcel.writeString(this.checkSum);
        parcel.writeString(this.orderId);
        parcel.writeString(this.serializedData);
        parcel.writeString(this.providerPubkey);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestCallData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestCallData> serializer() {
            return InvestCallData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestCallData(int i, String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.from = "";
        } else {
            this.from = str;
        }
        if ((i & 2) == 0) {
            this.to = "";
        } else {
            this.to = str2;
        }
        if ((i & 4) == 0) {
            this.data = "";
        } else {
            this.data = str3;
        }
        if ((i & 8) == 0) {
            this.value = "";
        } else {
            this.value = str4;
        }
        if ((i & 16) == 0) {
            this.unsignedTx = "";
        } else {
            this.unsignedTx = str5;
        }
        if ((i & 32) == 0) {
            this.gasRate = null;
        } else {
            this.gasRate = num;
        }
        if ((i & 64) == 0) {
            this.txSerialize = "";
        } else {
            this.txSerialize = str6;
        }
        if ((i & 128) == 0) {
            this.txOptions = null;
        } else {
            this.txOptions = str7;
        }
        if ((i & 256) == 0) {
            this.cosmosData = "";
        } else {
            this.cosmosData = str8;
        }
        if ((i & 512) == 0) {
            this.checkSum = "";
        } else {
            this.checkSum = str9;
        }
        if ((i & 1024) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str10;
        }
        if ((i & 2048) == 0) {
            this.serializedData = "";
        } else {
            this.serializedData = str11;
        }
        if ((i & 4096) == 0) {
            this.providerPubkey = "";
        } else {
            this.providerPubkey = str12;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestCallData investCallData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investCallData.from, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, investCallData.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investCallData.to, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investCallData.to);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investCallData.data, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investCallData.data);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investCallData.value, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, investCallData.value);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) investCallData.unsignedTx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, investCallData.unsignedTx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investCallData.gasRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, investCallData.gasRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investCallData.txSerialize, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, investCallData.txSerialize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || investCallData.txOptions != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, investCallData.txOptions);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) investCallData.cosmosData, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, investCallData.cosmosData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) investCallData.checkSum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, investCallData.checkSum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) investCallData.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, investCallData.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) investCallData.serializedData, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, investCallData.serializedData);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd((Object) investCallData.providerPubkey, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 12, investCallData.providerPubkey);
    }

    public InvestCallData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, Integer num, @NotNull String str6, String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.from = str;
        this.to = str2;
        this.data = str3;
        this.value = str4;
        this.unsignedTx = str5;
        this.gasRate = num;
        this.txSerialize = str6;
        this.txOptions = str7;
        this.cosmosData = str8;
        this.checkSum = str9;
        this.orderId = str10;
        this.serializedData = str11;
        this.providerPubkey = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0085: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002b: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r20v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r28v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:631) call: com.okinc.business.invest_biz.data.bean.InvestCallData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestCallData(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : num, (i & 64) != 0 ? "" : str6, (i & 128) == 0 ? str7 : null, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) == 0 ? str12 : "");
    }

    public final String getSuiSignDataString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33489mxS.KWHzl.KWHzl(SuiSignData.Companion.serializer(), new SuiSignData(this.from, this.to, str, this.txSerialize, this.data));
    }

    public final String getSignDataString(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33489mxS.KWHzl.KWHzl(SignData.Companion.serializer(), new SignData((String) null, (String) null, (String) null, str, this.to, this.data, this.from, (String) null, Integer.valueOf(i), (List) null, 647, (DefaultConstructorMarker) null));
    }

    public final String getBTCSignDataString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33489mxS.KWHzl.KWHzl(BTCDappSignData.Companion.serializer(), new BTCDappSignData((String) null, str, (List) null, this.from, (String) null, 21, (DefaultConstructorMarker) null));
    }
}
