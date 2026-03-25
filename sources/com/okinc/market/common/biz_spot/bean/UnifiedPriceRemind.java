package com.okinc.market.common.biz_spot.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class UnifiedPriceRemind implements Parcelable {
    private String coinName;
    private String displayId;
    private String instrumentId;
    private String instrumentType;
    private String jumpFrom;
    private String localPrice;
    private String price;
    private int sourceType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UnifiedPriceRemind> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UnifiedPriceRemind> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnifiedPriceRemind createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UnifiedPriceRemind(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnifiedPriceRemind[] newArray(int i) {
            return new UnifiedPriceRemind[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instrumentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instrumentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.localPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.jumpFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnifiedPriceRemind copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new UnifiedPriceRemind(str, str2, str3, str4, str5, str6, str7, i);
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
        if (!(obj instanceof UnifiedPriceRemind)) {
            return false;
        }
        UnifiedPriceRemind unifiedPriceRemind = (UnifiedPriceRemind) obj;
        return Intrinsics.EZpvd((Object) this.coinName, (Object) unifiedPriceRemind.coinName) && Intrinsics.EZpvd((Object) this.instrumentType, (Object) unifiedPriceRemind.instrumentType) && Intrinsics.EZpvd((Object) this.instrumentId, (Object) unifiedPriceRemind.instrumentId) && Intrinsics.EZpvd((Object) this.displayId, (Object) unifiedPriceRemind.displayId) && Intrinsics.EZpvd((Object) this.price, (Object) unifiedPriceRemind.price) && Intrinsics.EZpvd((Object) this.localPrice, (Object) unifiedPriceRemind.localPrice) && Intrinsics.EZpvd((Object) this.jumpFrom, (Object) unifiedPriceRemind.jumpFrom) && this.sourceType == unifiedPriceRemind.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinName() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstrumentId() {
        return this.instrumentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstrumentType() {
        return this.instrumentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJumpFrom() {
        return this.jumpFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLocalPrice() {
        return this.localPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSourceType() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.coinName.hashCode() * 31) + this.instrumentType.hashCode()) * 31) + this.instrumentId.hashCode()) * 31) + this.displayId.hashCode()) * 31) + this.price.hashCode()) * 31) + this.localPrice.hashCode()) * 31) + this.jumpFrom.hashCode()) * 31) + Integer.hashCode(this.sourceType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.displayId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstrumentId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instrumentId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstrumentType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instrumentType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setJumpFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.jumpFrom = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.localPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceType(int i) {
        this.sourceType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnifiedPriceRemind(coinName=" + this.coinName + ", instrumentType=" + this.instrumentType + ", instrumentId=" + this.instrumentId + ", displayId=" + this.displayId + ", price=" + this.price + ", localPrice=" + this.localPrice + ", jumpFrom=" + this.jumpFrom + ", sourceType=" + this.sourceType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.coinName);
        parcel.writeString(this.instrumentType);
        parcel.writeString(this.instrumentId);
        parcel.writeString(this.displayId);
        parcel.writeString(this.price);
        parcel.writeString(this.localPrice);
        parcel.writeString(this.jumpFrom);
        parcel.writeInt(this.sourceType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.market.common.biz_spot.bean.UnifiedPriceRemind.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UnifiedPriceRemind> serializer() {
            return UnifiedPriceRemind$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UnifiedPriceRemind(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, UnifiedPriceRemind$$serializer.INSTANCE.getDescriptor());
        }
        this.coinName = str;
        if ((i & 2) == 0) {
            this.instrumentType = "";
        } else {
            this.instrumentType = str2;
        }
        if ((i & 4) == 0) {
            this.instrumentId = "";
        } else {
            this.instrumentId = str3;
        }
        if ((i & 8) == 0) {
            this.displayId = "";
        } else {
            this.displayId = str4;
        }
        if ((i & 16) == 0) {
            this.price = "";
        } else {
            this.price = str5;
        }
        if ((i & 32) == 0) {
            this.localPrice = "";
        } else {
            this.localPrice = str6;
        }
        if ((i & 64) == 0) {
            this.jumpFrom = "";
        } else {
            this.jumpFrom = str7;
        }
        if ((i & 128) == 0) {
            this.sourceType = 1;
        } else {
            this.sourceType = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_api(UnifiedPriceRemind unifiedPriceRemind, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, unifiedPriceRemind.coinName);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) unifiedPriceRemind.instrumentType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, unifiedPriceRemind.instrumentType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) unifiedPriceRemind.instrumentId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, unifiedPriceRemind.instrumentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) unifiedPriceRemind.displayId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, unifiedPriceRemind.displayId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) unifiedPriceRemind.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, unifiedPriceRemind.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) unifiedPriceRemind.localPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, unifiedPriceRemind.localPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) unifiedPriceRemind.jumpFrom, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, unifiedPriceRemind.jumpFrom);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && unifiedPriceRemind.sourceType == 1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 7, unifiedPriceRemind.sourceType);
    }

    public UnifiedPriceRemind(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.coinName = str;
        this.instrumentType = str2;
        this.instrumentId = str3;
        this.displayId = str4;
        this.price = str5;
        this.localPrice = str6;
        this.jumpFrom = str7;
        this.sourceType = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0041: CONSTRUCTOR 
  (r9v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r17v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002d: ARITH (r17v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r16v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:123) call: com.okinc.market.common.biz_spot.bean.UnifiedPriceRemind.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ UnifiedPriceRemind(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) == 0 ? str7 : "", (i2 & 128) != 0 ? 1 : i);
    }
}
