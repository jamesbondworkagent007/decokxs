package com.okinc.okex.lite_market_api.bean;

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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class MarketItemQuote implements Parcelable {
    private String baseCurrency;
    private String instId;
    private String instType;
    private boolean isWatch;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MarketItemQuote> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<MarketItemQuote> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketItemQuote createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MarketItemQuote(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketItemQuote[] newArray(int i) {
            return new MarketItemQuote[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MarketItemQuote copy$default(MarketItemQuote marketItemQuote, String str, boolean z, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketItemQuote.baseCurrency;
        }
        if ((i & 2) != 0) {
            z = marketItemQuote.isWatch;
        }
        if ((i & 4) != 0) {
            str2 = marketItemQuote.instType;
        }
        if ((i & 8) != 0) {
            str3 = marketItemQuote.instId;
        }
        return marketItemQuote.copy(str, z, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isWatch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketItemQuote copy(@NotNull String str, boolean z, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new MarketItemQuote(str, z, str2, str3);
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
        if (!(obj instanceof MarketItemQuote)) {
            return false;
        }
        MarketItemQuote marketItemQuote = (MarketItemQuote) obj;
        return Intrinsics.EZpvd((Object) this.baseCurrency, (Object) marketItemQuote.baseCurrency) && this.isWatch == marketItemQuote.isWatch && Intrinsics.EZpvd((Object) this.instType, (Object) marketItemQuote.instType) && Intrinsics.EZpvd((Object) this.instId, (Object) marketItemQuote.instId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrency() {
        return this.baseCurrency;
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
    public int hashCode() {
        return (((((this.baseCurrency.hashCode() * 31) + Boolean.hashCode(this.isWatch)) * 31) + this.instType.hashCode()) * 31) + this.instId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isWatch() {
        return this.isWatch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWatch(boolean z) {
        this.isWatch = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketItemQuote(baseCurrency=" + this.baseCurrency + ", isWatch=" + this.isWatch + ", instType=" + this.instType + ", instId=" + this.instId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.baseCurrency);
        parcel.writeInt(this.isWatch ? 1 : 0);
        parcel.writeString(this.instType);
        parcel.writeString(this.instId);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite_market_api.bean.MarketItemQuote.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MarketItemQuote> serializer() {
            return MarketItemQuote$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MarketItemQuote(int i, String str, boolean z, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (12 != (i & 12)) {
            PluginExceptionsKt.throwMissingFieldException(i, 12, MarketItemQuote$$serializer.INSTANCE.getDescriptor());
        }
        this.baseCurrency = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.isWatch = false;
        } else {
            this.isWatch = z;
        }
        this.instType = str2;
        this.instId = str3;
    }

    public static final /* synthetic */ void write$Self$OKMarketLite_market_lite_api(MarketItemQuote marketItemQuote, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) marketItemQuote.baseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, marketItemQuote.baseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || marketItemQuote.isWatch) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, marketItemQuote.isWatch);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, marketItemQuote.instType);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, marketItemQuote.instId);
    }

    public MarketItemQuote(@NotNull String str, boolean z, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.baseCurrency = str;
        this.isWatch = z;
        this.instType = str2;
        this.instId = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
 A[MD:(java.lang.String, boolean, java.lang.String, java.lang.String):void (m)] (LINE:14) call: com.okinc.okex.lite_market_api.bean.MarketItemQuote.<init>(java.lang.String, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MarketItemQuote(String str, boolean z, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, str2, str3);
    }
}
