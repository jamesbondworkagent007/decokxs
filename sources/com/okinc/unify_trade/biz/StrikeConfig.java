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
public final class StrikeConfig implements Parcelable {
    private String limitCurrency;
    private String strikeMax;
    private String strikeMin;
    private String strikeStep;
    private String underlyingIndex;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<StrikeConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<StrikeConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrikeConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new StrikeConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StrikeConfig[] newArray(int i) {
            return new StrikeConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StrikeConfig copy$default(StrikeConfig strikeConfig, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = strikeConfig.limitCurrency;
        }
        if ((i & 2) != 0) {
            str2 = strikeConfig.strikeMax;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = strikeConfig.strikeMin;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = strikeConfig.strikeStep;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = strikeConfig.underlyingIndex;
        }
        return strikeConfig.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.limitCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.strikeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.strikeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.strikeStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.underlyingIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrikeConfig copy(String str, String str2, String str3, String str4, String str5) {
        return new StrikeConfig(str, str2, str3, str4, str5);
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
        if (!(obj instanceof StrikeConfig)) {
            return false;
        }
        StrikeConfig strikeConfig = (StrikeConfig) obj;
        return Intrinsics.EZpvd((Object) this.limitCurrency, (Object) strikeConfig.limitCurrency) && Intrinsics.EZpvd((Object) this.strikeMax, (Object) strikeConfig.strikeMax) && Intrinsics.EZpvd((Object) this.strikeMin, (Object) strikeConfig.strikeMin) && Intrinsics.EZpvd((Object) this.strikeStep, (Object) strikeConfig.strikeStep) && Intrinsics.EZpvd((Object) this.underlyingIndex, (Object) strikeConfig.underlyingIndex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitCurrency() {
        return this.limitCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrikeMax() {
        return this.strikeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrikeMin() {
        return this.strikeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrikeStep() {
        return this.strikeStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnderlyingIndex() {
        return this.underlyingIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.limitCurrency;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.strikeMax;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.strikeMin;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.strikeStep;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.underlyingIndex;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLimitCurrency(String str) {
        this.limitCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrikeMax(String str) {
        this.strikeMax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrikeMin(String str) {
        this.strikeMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrikeStep(String str) {
        this.strikeStep = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnderlyingIndex(String str) {
        this.underlyingIndex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrikeConfig(limitCurrency=" + this.limitCurrency + ", strikeMax=" + this.strikeMax + ", strikeMin=" + this.strikeMin + ", strikeStep=" + this.strikeStep + ", underlyingIndex=" + this.underlyingIndex + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.limitCurrency);
        parcel.writeString(this.strikeMax);
        parcel.writeString(this.strikeMin);
        parcel.writeString(this.strikeStep);
        parcel.writeString(this.underlyingIndex);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrikeConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrikeConfig> serializer() {
            return StrikeConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrikeConfig(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, StrikeConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.limitCurrency = str;
        this.strikeMax = str2;
        this.strikeMin = str3;
        this.strikeStep = str4;
        this.underlyingIndex = str5;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrikeConfig strikeConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, strikeConfig.limitCurrency);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, strikeConfig.strikeMax);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, strikeConfig.strikeMin);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, strikeConfig.strikeStep);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, strikeConfig.underlyingIndex);
    }

    public StrikeConfig(String str, String str2, String str3, String str4, String str5) {
        this.limitCurrency = str;
        this.strikeMax = str2;
        this.strikeMin = str3;
        this.strikeStep = str4;
        this.underlyingIndex = str5;
    }
}
