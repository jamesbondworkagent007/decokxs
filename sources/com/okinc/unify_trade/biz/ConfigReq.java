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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class ConfigReq implements Parcelable {
    private String alternativeCurrency;
    private String currency;
    private String expiryTime;
    private String requestTime;
    private String strike;
    private String tradeSide;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ConfigReq> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<ConfigReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfigReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ConfigReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfigReq[] newArray(int i) {
            return new ConfigReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ConfigReq copy$default(ConfigReq configReq, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = configReq.alternativeCurrency;
        }
        if ((i & 2) != 0) {
            str2 = configReq.currency;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = configReq.expiryTime;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = configReq.requestTime;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = configReq.strike;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = configReq.tradeSide;
        }
        return configReq.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.alternativeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.expiryTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.requestTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tradeSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConfigReq copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new ConfigReq(str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof ConfigReq)) {
            return false;
        }
        ConfigReq configReq = (ConfigReq) obj;
        return Intrinsics.EZpvd((Object) this.alternativeCurrency, (Object) configReq.alternativeCurrency) && Intrinsics.EZpvd((Object) this.currency, (Object) configReq.currency) && Intrinsics.EZpvd((Object) this.expiryTime, (Object) configReq.expiryTime) && Intrinsics.EZpvd((Object) this.requestTime, (Object) configReq.requestTime) && Intrinsics.EZpvd((Object) this.strike, (Object) configReq.strike) && Intrinsics.EZpvd((Object) this.tradeSide, (Object) configReq.tradeSide);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlternativeCurrency() {
        return this.alternativeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpiryTime() {
        return this.expiryTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestTime() {
        return this.requestTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrike() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeSide() {
        return this.tradeSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.alternativeCurrency;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.currency;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.expiryTime;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.requestTime;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.strike;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tradeSide;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlternativeCurrency(String str) {
        this.alternativeCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(String str) {
        this.currency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpiryTime(String str) {
        this.expiryTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequestTime(String str) {
        this.requestTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrike(String str) {
        this.strike = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeSide(String str) {
        this.tradeSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConfigReq(alternativeCurrency=" + this.alternativeCurrency + ", currency=" + this.currency + ", expiryTime=" + this.expiryTime + ", requestTime=" + this.requestTime + ", strike=" + this.strike + ", tradeSide=" + this.tradeSide + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.alternativeCurrency);
        parcel.writeString(this.currency);
        parcel.writeString(this.expiryTime);
        parcel.writeString(this.requestTime);
        parcel.writeString(this.strike);
        parcel.writeString(this.tradeSide);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ConfigReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConfigReq> serializer() {
            return ConfigReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConfigReq(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (47 != (i & 47)) {
            PluginExceptionsKt.throwMissingFieldException(i, 47, ConfigReq$$serializer.INSTANCE.getDescriptor());
        }
        this.alternativeCurrency = str;
        this.currency = str2;
        this.expiryTime = str3;
        this.requestTime = str4;
        if ((i & 16) == 0) {
            this.strike = null;
        } else {
            this.strike = str5;
        }
        this.tradeSide = str6;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ConfigReq configReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, configReq.alternativeCurrency);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, configReq.currency);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, configReq.expiryTime);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, configReq.requestTime);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || configReq.strike != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, configReq.strike);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, configReq.tradeSide);
    }

    public ConfigReq(String str, String str2, String str3, String str4, String str5, String str6) {
        this.alternativeCurrency = str;
        this.currency = str2;
        this.expiryTime = str3;
        this.requestTime = str4;
        this.strike = str5;
        this.tradeSide = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (r13v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:47) call: com.okinc.unify_trade.biz.ConfigReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ConfigReq(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, str6);
    }
}
