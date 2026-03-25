package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class BtcNftMintSignData implements Parcelable {
    public static final int EARN_BRC20S_TYPE_CLAIM = 7;
    public static final int EARN_BRC20S_TYPE_DEPLOY = 8;
    public static final int EARN_BRC20S_TYPE_REDEEM = 6;
    public static final int EARN_BRC20S_TYPE_STAKE = 5;
    public static final int INSCRIBE_TYPE_DEPLOY = 2;
    public static final int INSCRIBE_TYPE_IMAGE = 0;
    public static final int INSCRIBE_TYPE_MINT = 3;
    public static final int INSCRIBE_TYPE_MINT_BRC20S_TRANSFER = 10;
    public static final int INSCRIBE_TYPE_MINT_BRC20_TRANSFER = 9;
    public static final int INSCRIBE_TYPE_MINT_RUNES_MAIN = 11;
    public static final int INSCRIBE_TYPE_TEXT = 1;
    public static final int INSCRIBE_TYPE_TRANSFER = 4;
    private String coinAmount;
    private Long coinId;
    private String from;
    private Integer gasRate;
    private List<BtcNftInscribeData> inscribeList;
    private String inscribeOutputSat;
    private int inscribeType;
    private Integer protocolId;
    private String to;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BtcNftMintSignData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(BtcNftInscribeData$$serializer.INSTANCE), null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<BtcNftMintSignData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BtcNftMintSignData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(BtcNftInscribeData.CREATOR.createFromParcel(parcel));
            }
            return new BtcNftMintSignData(string, string2, i, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BtcNftMintSignData[] newArray(int i) {
            return new BtcNftMintSignData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.inscribeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BtcNftInscribeData> component4() {
        return this.inscribeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.inscribeOutputSat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.gasRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BtcNftMintSignData copy(@NotNull String str, @NotNull String str2, int i, @NotNull List<BtcNftInscribeData> list, String str3, Long l, String str4, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new BtcNftMintSignData(str, str2, i, list, str3, l, str4, num, num2);
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
        if (!(obj instanceof BtcNftMintSignData)) {
            return false;
        }
        BtcNftMintSignData btcNftMintSignData = (BtcNftMintSignData) obj;
        return Intrinsics.EZpvd((Object) this.from, (Object) btcNftMintSignData.from) && Intrinsics.EZpvd((Object) this.to, (Object) btcNftMintSignData.to) && this.inscribeType == btcNftMintSignData.inscribeType && Intrinsics.EZpvd(this.inscribeList, btcNftMintSignData.inscribeList) && Intrinsics.EZpvd((Object) this.inscribeOutputSat, (Object) btcNftMintSignData.inscribeOutputSat) && Intrinsics.EZpvd(this.coinId, btcNftMintSignData.coinId) && Intrinsics.EZpvd((Object) this.coinAmount, (Object) btcNftMintSignData.coinAmount) && Intrinsics.EZpvd(this.gasRate, btcNftMintSignData.gasRate) && Intrinsics.EZpvd(this.protocolId, btcNftMintSignData.protocolId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoinId() {
        return this.coinId;
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
    public final List<BtcNftInscribeData> getInscribeList() {
        return this.inscribeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInscribeOutputSat() {
        return this.inscribeOutputSat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getInscribeType() {
        return this.inscribeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProtocolId() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.from.hashCode();
        int iHashCode2 = this.to.hashCode();
        int iHashCode3 = Integer.hashCode(this.inscribeType);
        int iHashCode4 = this.inscribeList.hashCode();
        String str = this.inscribeOutputSat;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        Long l = this.coinId;
        int iHashCode6 = l == null ? 0 : l.hashCode();
        String str2 = this.coinAmount;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.gasRate;
        int iHashCode8 = num == null ? 0 : num.hashCode();
        Integer num2 = this.protocolId;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinAmount(String str) {
        this.coinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(Long l) {
        this.coinId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasRate(Integer num) {
        this.gasRate = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInscribeList(@NotNull List<BtcNftInscribeData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.inscribeList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInscribeOutputSat(String str) {
        this.inscribeOutputSat = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInscribeType(int i) {
        this.inscribeType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProtocolId(Integer num) {
        this.protocolId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.to = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BtcNftMintSignData(from=" + this.from + ", to=" + this.to + ", inscribeType=" + this.inscribeType + ", inscribeList=" + this.inscribeList + ", inscribeOutputSat=" + this.inscribeOutputSat + ", coinId=" + this.coinId + ", coinAmount=" + this.coinAmount + ", gasRate=" + this.gasRate + ", protocolId=" + this.protocolId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.from);
        parcel.writeString(this.to);
        parcel.writeInt(this.inscribeType);
        List<BtcNftInscribeData> list = this.inscribeList;
        parcel.writeInt(list.size());
        Iterator<BtcNftInscribeData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.inscribeOutputSat);
        Long l = this.coinId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.coinAmount);
        Integer num = this.gasRate;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.protocolId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public /* synthetic */ BtcNftMintSignData(int i, String str, String str2, int i2, List list, String str3, Long l, String str4, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, BtcNftMintSignData$$serializer.INSTANCE.getDescriptor());
        }
        this.from = str;
        this.to = str2;
        this.inscribeType = i2;
        this.inscribeList = list;
        if ((i & 16) == 0) {
            this.inscribeOutputSat = null;
        } else {
            this.inscribeOutputSat = str3;
        }
        if ((i & 32) == 0) {
            this.coinId = null;
        } else {
            this.coinId = l;
        }
        if ((i & 64) == 0) {
            this.coinAmount = null;
        } else {
            this.coinAmount = str4;
        }
        if ((i & 128) == 0) {
            this.gasRate = null;
        } else {
            this.gasRate = num;
        }
        if ((i & 256) == 0) {
            this.protocolId = null;
        } else {
            this.protocolId = num2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(BtcNftMintSignData btcNftMintSignData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, btcNftMintSignData.from);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, btcNftMintSignData.to);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, btcNftMintSignData.inscribeType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], btcNftMintSignData.inscribeList);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || btcNftMintSignData.inscribeOutputSat != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, btcNftMintSignData.inscribeOutputSat);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || btcNftMintSignData.coinId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, btcNftMintSignData.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || btcNftMintSignData.coinAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, btcNftMintSignData.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || btcNftMintSignData.gasRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, btcNftMintSignData.gasRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && btcNftMintSignData.protocolId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, btcNftMintSignData.protocolId);
    }

    public BtcNftMintSignData(@NotNull String str, @NotNull String str2, int i, @NotNull List<BtcNftInscribeData> list, String str3, Long l, String str4, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.from = str;
        this.to = str2;
        this.inscribeType = i;
        this.inscribeList = list;
        this.inscribeOutputSat = str3;
        this.coinId = l;
        this.coinAmount = str4;
        this.gasRate = num;
        this.protocolId = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 int)
  (r17v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r19v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001b: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r21v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0023: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r22v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, int, java.util.List<com.okinc.business.defi.api.bean.BtcNftInscribeData>, java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.Integer):void (m)] (LINE:180) call: com.okinc.business.defi.api.bean.BtcNftMintSignData.<init>(java.lang.String, java.lang.String, int, java.util.List, java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ BtcNftMintSignData(String str, String str2, int i, List list, String str3, Long l, String str4, Integer num, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, list, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : l, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : num, (i2 & 256) != 0 ? null : num2);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.BtcNftMintSignData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BtcNftMintSignData> serializer() {
            return BtcNftMintSignData$$serializer.INSTANCE;
        }
    }
}
