package com.okinc.tradingbot.impl.market_place.bot_copy.itembinder;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class CoinTipsData implements Parcelable {
    public final boolean isDefaultExpand;
    public final String tip1;
    public final String tip2;
    public float topMargin;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CoinTipsData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CoinTipsData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinTipsData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CoinTipsData(parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinTipsData[] newArray(int i) {
            return new CoinTipsData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinTipsData() {
        this((String) null, (String) null, 0.0f, false, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CoinTipsData copy$default(CoinTipsData coinTipsData, String str, String str2, float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coinTipsData.tip1;
        }
        if ((i & 2) != 0) {
            str2 = coinTipsData.tip2;
        }
        if ((i & 4) != 0) {
            f = coinTipsData.topMargin;
        }
        if ((i & 8) != 0) {
            z = coinTipsData.isDefaultExpand;
        }
        return coinTipsData.OLrzqt(str, str2, f, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.topMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.tip1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.isDefaultExpand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinTipsData OLrzqt(@NotNull String str, @NotNull String str2, float f, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CoinTipsData(str, str2, f, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.tip2;
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
        if (!(obj instanceof CoinTipsData)) {
            return false;
        }
        CoinTipsData coinTipsData = (CoinTipsData) obj;
        return Intrinsics.EZpvd((Object) this.tip1, (Object) coinTipsData.tip1) && Intrinsics.EZpvd((Object) this.tip2, (Object) coinTipsData.tip2) && Float.compare(this.topMargin, coinTipsData.topMargin) == 0 && this.isDefaultExpand == coinTipsData.isDefaultExpand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.tip1.hashCode() * 31) + this.tip2.hashCode()) * 31) + Float.hashCode(this.topMargin)) * 31) + Boolean.hashCode(this.isDefaultExpand);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinTipsData(tip1=" + this.tip1 + ", tip2=" + this.tip2 + ", topMargin=" + this.topMargin + ", isDefaultExpand=" + this.isDefaultExpand + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tip1);
        parcel.writeString(this.tip2);
        parcel.writeFloat(this.topMargin);
        parcel.writeInt(this.isDefaultExpand ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.CoinTipsData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinTipsData> serializer() {
            return CoinTipsData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinTipsData(int i, String str, String str2, float f, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tip1 = "";
        } else {
            this.tip1 = str;
        }
        if ((i & 2) == 0) {
            this.tip2 = "";
        } else {
            this.tip2 = str2;
        }
        if ((i & 4) == 0) {
            this.topMargin = 16.0f;
        } else {
            this.topMargin = f;
        }
        if ((i & 8) == 0) {
            this.isDefaultExpand = false;
        } else {
            this.isDefaultExpand = z;
        }
    }

    public static final /* synthetic */ void OLrzqt(CoinTipsData coinTipsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) coinTipsData.tip1, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, coinTipsData.tip1);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) coinTipsData.tip2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, coinTipsData.tip2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || Float.compare(coinTipsData.topMargin, 16.0f) != 0) {
            compositeEncoder.encodeFloatElement(serialDescriptor, 2, coinTipsData.topMargin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || coinTipsData.isDefaultExpand) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, coinTipsData.isDefaultExpand);
        }
    }

    public CoinTipsData(@NotNull String str, @NotNull String str2, float f, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.tip1 = str;
        this.tip2 = str2;
        this.topMargin = f;
        this.isDefaultExpand = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:float:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (16.0f float) : (r4v0 float))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(java.lang.String, java.lang.String, float, boolean):void (m)] (LINE:80) call: com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.CoinTipsData.<init>(java.lang.String, java.lang.String, float, boolean):void type: THIS */
    public /* synthetic */ CoinTipsData(String str, String str2, float f, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 16.0f : f, (i & 8) != 0 ? false : z);
    }
}
