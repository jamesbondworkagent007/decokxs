package com.okinc.unify_trade.biz;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class TradeSizeConfig implements Parcelable {
    private String limitCurrency;
    private String tradeSizeMax;
    private String tradeSizeMin;
    private String tradeStepSize;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeSizeConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TradeSizeConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeSizeConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TradeSizeConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeSizeConfig[] newArray(int i) {
            return new TradeSizeConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TradeSizeConfig copy$default(TradeSizeConfig tradeSizeConfig, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradeSizeConfig.limitCurrency;
        }
        if ((i & 2) != 0) {
            str2 = tradeSizeConfig.tradeSizeMax;
        }
        if ((i & 4) != 0) {
            str3 = tradeSizeConfig.tradeSizeMin;
        }
        if ((i & 8) != 0) {
            str4 = tradeSizeConfig.tradeStepSize;
        }
        return tradeSizeConfig.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.limitCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tradeSizeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tradeSizeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tradeStepSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeSizeConfig copy(String str, String str2, String str3, String str4) {
        return new TradeSizeConfig(str, str2, str3, str4);
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
        if (!(obj instanceof TradeSizeConfig)) {
            return false;
        }
        TradeSizeConfig tradeSizeConfig = (TradeSizeConfig) obj;
        return Intrinsics.EZpvd((Object) this.limitCurrency, (Object) tradeSizeConfig.limitCurrency) && Intrinsics.EZpvd((Object) this.tradeSizeMax, (Object) tradeSizeConfig.tradeSizeMax) && Intrinsics.EZpvd((Object) this.tradeSizeMin, (Object) tradeSizeConfig.tradeSizeMin) && Intrinsics.EZpvd((Object) this.tradeStepSize, (Object) tradeSizeConfig.tradeStepSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitCurrency() {
        return this.limitCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeSizeMax() {
        return this.tradeSizeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeSizeMin() {
        return this.tradeSizeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeStepSize() {
        return this.tradeStepSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.limitCurrency;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tradeSizeMax;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tradeSizeMin;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tradeStepSize;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLimitCurrency(String str) {
        this.limitCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeSizeMax(String str) {
        this.tradeSizeMax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeSizeMin(String str) {
        this.tradeSizeMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeStepSize(String str) {
        this.tradeStepSize = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeSizeConfig(limitCurrency=" + this.limitCurrency + ", tradeSizeMax=" + this.tradeSizeMax + ", tradeSizeMin=" + this.tradeSizeMin + ", tradeStepSize=" + this.tradeStepSize + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.limitCurrency);
        parcel.writeString(this.tradeSizeMax);
        parcel.writeString(this.tradeSizeMin);
        parcel.writeString(this.tradeStepSize);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TradeSizeConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeSizeConfig> serializer() {
            return TradeSizeConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeSizeConfig(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, TradeSizeConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.limitCurrency = str;
        this.tradeSizeMax = str2;
        this.tradeSizeMin = str3;
        this.tradeStepSize = str4;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeSizeConfig tradeSizeConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, tradeSizeConfig.limitCurrency);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, tradeSizeConfig.tradeSizeMax);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, tradeSizeConfig.tradeSizeMin);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, tradeSizeConfig.tradeStepSize);
    }

    public TradeSizeConfig(String str, String str2, String str3, String str4) {
        this.limitCurrency = str;
        this.tradeSizeMax = str2;
        this.tradeSizeMin = str3;
        this.tradeStepSize = str4;
    }
}
