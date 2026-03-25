package com.okinc.planet.biz_content.leaderboard.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class SpotlightToken implements Parcelable {
    public static final int $stable = 0;
    private final String chainId;
    private final Double change24h;
    private final Double changeUtc0;
    private final Double changeUtc8;
    private final String coinName;
    private final String icon;
    private final String instId;
    private final String instType;
    private final Double last;
    private final Double open24h;
    private final Double sodUtc0;
    private final Double sodUtc8;
    private final String tokenContractAddress;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SpotlightToken> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SpotlightToken> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotlightToken createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SpotlightToken(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotlightToken[] newArray(int i) {
            return new SpotlightToken[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotlightToken() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component10() {
        return this.sodUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component11() {
        return this.sodUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component12() {
        return this.changeUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component13() {
        return this.changeUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component14() {
        return this.change24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component8() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component9() {
        return this.open24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotlightToken copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7) {
        return new SpotlightToken(str, str2, str3, str4, str5, str6, str7, d, d2, d3, d4, d5, d6, d7);
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
        if (!(obj instanceof SpotlightToken)) {
            return false;
        }
        SpotlightToken spotlightToken = (SpotlightToken) obj;
        return Intrinsics.EZpvd((Object) this.coinName, (Object) spotlightToken.coinName) && Intrinsics.EZpvd((Object) this.icon, (Object) spotlightToken.icon) && Intrinsics.EZpvd((Object) this.chainId, (Object) spotlightToken.chainId) && Intrinsics.EZpvd((Object) this.instId, (Object) spotlightToken.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) spotlightToken.instType) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) spotlightToken.tokenContractAddress) && Intrinsics.EZpvd((Object) this.type, (Object) spotlightToken.type) && Intrinsics.EZpvd(this.last, spotlightToken.last) && Intrinsics.EZpvd(this.open24h, spotlightToken.open24h) && Intrinsics.EZpvd(this.sodUtc0, spotlightToken.sodUtc0) && Intrinsics.EZpvd(this.sodUtc8, spotlightToken.sodUtc8) && Intrinsics.EZpvd(this.changeUtc0, spotlightToken.changeUtc0) && Intrinsics.EZpvd(this.changeUtc8, spotlightToken.changeUtc8) && Intrinsics.EZpvd(this.change24h, spotlightToken.change24h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getChange24h() {
        return this.change24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getChangeUtc0() {
        return this.changeUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getChangeUtc8() {
        return this.changeUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinName() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getLast() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getOpen24h() {
        return this.open24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getSodUtc0() {
        return this.sodUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getSodUtc8() {
        return this.sodUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.coinName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.icon;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.chainId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.instId;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.instType;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tokenContractAddress;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.type;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        Double d = this.last;
        int iHashCode8 = d == null ? 0 : d.hashCode();
        Double d2 = this.open24h;
        int iHashCode9 = d2 == null ? 0 : d2.hashCode();
        Double d3 = this.sodUtc0;
        int iHashCode10 = d3 == null ? 0 : d3.hashCode();
        Double d4 = this.sodUtc8;
        int iHashCode11 = d4 == null ? 0 : d4.hashCode();
        Double d5 = this.changeUtc0;
        int iHashCode12 = d5 == null ? 0 : d5.hashCode();
        Double d6 = this.changeUtc8;
        int iHashCode13 = d6 == null ? 0 : d6.hashCode();
        Double d7 = this.change24h;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (d7 != null ? d7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotlightToken(coinName=" + this.coinName + ", icon=" + this.icon + ", chainId=" + this.chainId + ", instId=" + this.instId + ", instType=" + this.instType + ", tokenContractAddress=" + this.tokenContractAddress + ", type=" + this.type + ", last=" + this.last + ", open24h=" + this.open24h + ", sodUtc0=" + this.sodUtc0 + ", sodUtc8=" + this.sodUtc8 + ", changeUtc0=" + this.changeUtc0 + ", changeUtc8=" + this.changeUtc8 + ", change24h=" + this.change24h + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.coinName);
        parcel.writeString(this.icon);
        parcel.writeString(this.chainId);
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeString(this.tokenContractAddress);
        parcel.writeString(this.type);
        Double d = this.last;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.open24h;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        Double d3 = this.sodUtc0;
        if (d3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d3.doubleValue());
        }
        Double d4 = this.sodUtc8;
        if (d4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d4.doubleValue());
        }
        Double d5 = this.changeUtc0;
        if (d5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d5.doubleValue());
        }
        Double d6 = this.changeUtc8;
        if (d6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d6.doubleValue());
        }
        Double d7 = this.change24h;
        if (d7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d7.doubleValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_content.leaderboard.bean.SpotlightToken.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotlightToken> serializer() {
            return SpotlightToken$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotlightToken(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinName = null;
        } else {
            this.coinName = str;
        }
        if ((i & 2) == 0) {
            this.icon = null;
        } else {
            this.icon = str2;
        }
        if ((i & 4) == 0) {
            this.chainId = null;
        } else {
            this.chainId = str3;
        }
        if ((i & 8) == 0) {
            this.instId = null;
        } else {
            this.instId = str4;
        }
        if ((i & 16) == 0) {
            this.instType = null;
        } else {
            this.instType = str5;
        }
        if ((i & 32) == 0) {
            this.tokenContractAddress = null;
        } else {
            this.tokenContractAddress = str6;
        }
        if ((i & 64) == 0) {
            this.type = null;
        } else {
            this.type = str7;
        }
        if ((i & 128) == 0) {
            this.last = null;
        } else {
            this.last = d;
        }
        if ((i & 256) == 0) {
            this.open24h = null;
        } else {
            this.open24h = d2;
        }
        if ((i & 512) == 0) {
            this.sodUtc0 = null;
        } else {
            this.sodUtc0 = d3;
        }
        if ((i & 1024) == 0) {
            this.sodUtc8 = null;
        } else {
            this.sodUtc8 = d4;
        }
        if ((i & 2048) == 0) {
            this.changeUtc0 = null;
        } else {
            this.changeUtc0 = d5;
        }
        if ((i & 4096) == 0) {
            this.changeUtc8 = null;
        } else {
            this.changeUtc8 = d6;
        }
        if ((i & 8192) == 0) {
            this.change24h = null;
        } else {
            this.change24h = d7;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(SpotlightToken spotlightToken, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || spotlightToken.coinName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, spotlightToken.coinName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || spotlightToken.icon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, spotlightToken.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || spotlightToken.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, spotlightToken.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || spotlightToken.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, spotlightToken.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || spotlightToken.instType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, spotlightToken.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || spotlightToken.tokenContractAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, spotlightToken.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || spotlightToken.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, spotlightToken.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || spotlightToken.last != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, DoubleSerializer.INSTANCE, spotlightToken.last);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || spotlightToken.open24h != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, DoubleSerializer.INSTANCE, spotlightToken.open24h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || spotlightToken.sodUtc0 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, DoubleSerializer.INSTANCE, spotlightToken.sodUtc0);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || spotlightToken.sodUtc8 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, DoubleSerializer.INSTANCE, spotlightToken.sodUtc8);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || spotlightToken.changeUtc0 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, DoubleSerializer.INSTANCE, spotlightToken.changeUtc0);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || spotlightToken.changeUtc8 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, DoubleSerializer.INSTANCE, spotlightToken.changeUtc8);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && spotlightToken.change24h == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, DoubleSerializer.INSTANCE, spotlightToken.change24h);
    }

    public SpotlightToken(String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7) {
        this.coinName = str;
        this.icon = str2;
        this.chainId = str3;
        this.instId = str4;
        this.instType = str5;
        this.tokenContractAddress = str6;
        this.type = str7;
        this.last = d;
        this.open24h = d2;
        this.sodUtc0 = d3;
        this.sodUtc8 = d4;
        this.changeUtc0 = d5;
        this.changeUtc8 = d6;
        this.change24h = d7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0090: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x003b: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r23v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0043: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r24v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x004b: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r25v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0053: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r26v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x005b: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r27v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0063: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r28v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x006b: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.Double) : (null java.lang.Double))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double):void (m)] (LINE:70) call: com.okinc.planet.biz_content.leaderboard.bean.SpotlightToken.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double):void type: THIS */
    public /* synthetic */ SpotlightToken(String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : d, (i & 256) != 0 ? null : d2, (i & 512) != 0 ? null : d3, (i & 1024) != 0 ? null : d4, (i & 2048) != 0 ? null : d5, (i & 4096) != 0 ? null : d6, (i & 8192) == 0 ? d7 : null);
    }
}
