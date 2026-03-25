package com.okinc.business.market.features.filter.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.common.constants.TokenAgeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class PriceRangeFilter implements Parcelable {
    public static final int $stable = 0;
    public final String defaultValue;
    public final transient String displayEndValue;
    public final transient String displayStartValue;
    public final String endValue;
    public final transient boolean shouldShowDash;
    public final String startValue;
    public final TokenAgeType tokenAgeType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PriceRangeFilter> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, TokenAgeType.Companion.serializer(), null, null, null, null};

    public static final class Creator implements Parcelable.Creator<PriceRangeFilter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceRangeFilter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PriceRangeFilter(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TokenAgeType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceRangeFilter[] newArray(int i) {
            return new PriceRangeFilter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PriceRangeFilter() {
        this((String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PriceRangeFilter copy$default(PriceRangeFilter priceRangeFilter, String str, String str2, TokenAgeType tokenAgeType, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = priceRangeFilter.startValue;
        }
        if ((i & 2) != 0) {
            str2 = priceRangeFilter.endValue;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            tokenAgeType = priceRangeFilter.tokenAgeType;
        }
        TokenAgeType tokenAgeType2 = tokenAgeType;
        if ((i & 8) != 0) {
            str3 = priceRangeFilter.defaultValue;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = priceRangeFilter.displayStartValue;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = priceRangeFilter.displayEndValue;
        }
        String str9 = str5;
        if ((i & 64) != 0) {
            z = priceRangeFilter.shouldShowDash;
        }
        return priceRangeFilter.OLrzqt(str, str6, tokenAgeType2, str7, str8, str9, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.displayEndValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.startValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.shouldShowDash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.endValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeFilter OLrzqt(@NotNull String str, @NotNull String str2, TokenAgeType tokenAgeType, String str3, @NotNull String str4, @NotNull String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new PriceRangeFilter(str, str2, tokenAgeType, str3, str4, str5, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.displayStartValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenAgeType djBIcL() {
        return this.tokenAgeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceRangeFilter)) {
            return false;
        }
        PriceRangeFilter priceRangeFilter = (PriceRangeFilter) obj;
        return Intrinsics.EZpvd((Object) this.startValue, (Object) priceRangeFilter.startValue) && Intrinsics.EZpvd((Object) this.endValue, (Object) priceRangeFilter.endValue) && this.tokenAgeType == priceRangeFilter.tokenAgeType && Intrinsics.EZpvd((Object) this.defaultValue, (Object) priceRangeFilter.defaultValue) && Intrinsics.EZpvd((Object) this.displayStartValue, (Object) priceRangeFilter.displayStartValue) && Intrinsics.EZpvd((Object) this.displayEndValue, (Object) priceRangeFilter.displayEndValue) && this.shouldShowDash == priceRangeFilter.shouldShowDash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.startValue.hashCode();
        int iHashCode2 = this.endValue.hashCode();
        TokenAgeType tokenAgeType = this.tokenAgeType;
        int iHashCode3 = tokenAgeType == null ? 0 : tokenAgeType.hashCode();
        String str = this.defaultValue;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.displayStartValue.hashCode()) * 31) + this.displayEndValue.hashCode()) * 31) + Boolean.hashCode(this.shouldShowDash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PriceRangeFilter(startValue=" + this.startValue + ", endValue=" + this.endValue + ", tokenAgeType=" + this.tokenAgeType + ", defaultValue=" + this.defaultValue + ", displayStartValue=" + this.displayStartValue + ", displayEndValue=" + this.displayEndValue + ", shouldShowDash=" + this.shouldShowDash + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.startValue);
        parcel.writeString(this.endValue);
        TokenAgeType tokenAgeType = this.tokenAgeType;
        if (tokenAgeType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(tokenAgeType.name());
        }
        parcel.writeString(this.defaultValue);
        parcel.writeString(this.displayStartValue);
        parcel.writeString(this.displayEndValue);
        parcel.writeInt(this.shouldShowDash ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.filter.domain.PriceRangeFilter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PriceRangeFilter> serializer() {
            return PriceRangeFilter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PriceRangeFilter(int i, String str, String str2, TokenAgeType tokenAgeType, String str3, String str4, String str5, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.startValue = "";
        } else {
            this.startValue = str;
        }
        if ((i & 2) == 0) {
            this.endValue = "";
        } else {
            this.endValue = str2;
        }
        if ((i & 4) == 0) {
            this.tokenAgeType = null;
        } else {
            this.tokenAgeType = tokenAgeType;
        }
        if ((i & 8) == 0) {
            this.defaultValue = null;
        } else {
            this.defaultValue = str3;
        }
        if ((i & 16) == 0) {
            this.displayStartValue = "";
        } else {
            this.displayStartValue = str4;
        }
        if ((i & 32) == 0) {
            this.displayEndValue = "";
        } else {
            this.displayEndValue = str5;
        }
        if ((i & 64) == 0) {
            this.shouldShowDash = true;
        } else {
            this.shouldShowDash = z;
        }
    }

    public static final /* synthetic */ void KWHzl(PriceRangeFilter priceRangeFilter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) priceRangeFilter.startValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, priceRangeFilter.startValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) priceRangeFilter.endValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, priceRangeFilter.endValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || priceRangeFilter.tokenAgeType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], priceRangeFilter.tokenAgeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || priceRangeFilter.defaultValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, priceRangeFilter.defaultValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) priceRangeFilter.displayStartValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, priceRangeFilter.displayStartValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) priceRangeFilter.displayEndValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, priceRangeFilter.displayEndValue);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && priceRangeFilter.shouldShowDash) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 6, priceRangeFilter.shouldShowDash);
    }

    public PriceRangeFilter(@NotNull String str, @NotNull String str2, TokenAgeType tokenAgeType, String str3, @NotNull String str4, @NotNull String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.startValue = str;
        this.endValue = str2;
        this.tokenAgeType = tokenAgeType;
        this.defaultValue = str3;
        this.displayStartValue = str4;
        this.displayEndValue = str5;
        this.shouldShowDash = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.common.constants.TokenAgeType) : (r8v0 com.okinc.business.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r12v0 boolean))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:11) call: com.okinc.business.market.features.filter.domain.PriceRangeFilter.<init>(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ PriceRangeFilter(String str, String str2, TokenAgeType tokenAgeType, String str3, String str4, String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : tokenAgeType, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? "" : str4, (i & 32) == 0 ? str5 : "", (i & 64) != 0 ? true : z);
    }

    public final boolean gEmmrt() {
        return StringsKt__StringsKt.fARcdN((CharSequence) this.startValue) && StringsKt__StringsKt.fARcdN((CharSequence) this.endValue);
    }
}
