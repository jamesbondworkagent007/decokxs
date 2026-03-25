package com.okinc.buysell.ui.result.view;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class BSCConvertDetailBannerItem implements Parcelable {
    public static final int $stable = 0;
    private final Integer arrowBackground;
    private final String coinName;
    private final String coinUrl;
    private final String convertBannerType;
    private final Integer currencyId;
    private final String description;
    private final String percentage;
    private final String productName;
    private final Integer tagBackground;
    private final String tagTitle;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BSCConvertDetailBannerItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BSCConvertDetailBannerItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BSCConvertDetailBannerItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BSCConvertDetailBannerItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BSCConvertDetailBannerItem[] newArray(int i) {
            return new BSCConvertDetailBannerItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BSCConvertDetailBannerItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (Integer) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.productName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.coinUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.percentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tagTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.tagBackground;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.arrowBackground;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.convertBannerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BSCConvertDetailBannerItem copy(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, String str7, Integer num3) {
        return new BSCConvertDetailBannerItem(str, str2, str3, str4, str5, str6, num, num2, str7, num3);
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
        if (!(obj instanceof BSCConvertDetailBannerItem)) {
            return false;
        }
        BSCConvertDetailBannerItem bSCConvertDetailBannerItem = (BSCConvertDetailBannerItem) obj;
        return Intrinsics.EZpvd((Object) this.productName, (Object) bSCConvertDetailBannerItem.productName) && Intrinsics.EZpvd((Object) this.coinUrl, (Object) bSCConvertDetailBannerItem.coinUrl) && Intrinsics.EZpvd((Object) this.coinName, (Object) bSCConvertDetailBannerItem.coinName) && Intrinsics.EZpvd((Object) this.description, (Object) bSCConvertDetailBannerItem.description) && Intrinsics.EZpvd((Object) this.percentage, (Object) bSCConvertDetailBannerItem.percentage) && Intrinsics.EZpvd((Object) this.tagTitle, (Object) bSCConvertDetailBannerItem.tagTitle) && Intrinsics.EZpvd(this.tagBackground, bSCConvertDetailBannerItem.tagBackground) && Intrinsics.EZpvd(this.arrowBackground, bSCConvertDetailBannerItem.arrowBackground) && Intrinsics.EZpvd((Object) this.convertBannerType, (Object) bSCConvertDetailBannerItem.convertBannerType) && Intrinsics.EZpvd(this.currencyId, bSCConvertDetailBannerItem.currencyId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getArrowBackground() {
        return this.arrowBackground;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinName() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinUrl() {
        return this.coinUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConvertBannerType() {
        return this.convertBannerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercentage() {
        return this.percentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProductName() {
        return this.productName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTagBackground() {
        return this.tagBackground;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTagTitle() {
        return this.tagTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.productName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.coinUrl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.coinName;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.description;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.percentage;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tagTitle;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        Integer num = this.tagBackground;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        Integer num2 = this.arrowBackground;
        int iHashCode8 = num2 == null ? 0 : num2.hashCode();
        String str7 = this.convertBannerType;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        Integer num3 = this.currencyId;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (num3 != null ? num3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BSCConvertDetailBannerItem(productName=" + this.productName + ", coinUrl=" + this.coinUrl + ", coinName=" + this.coinName + ", description=" + this.description + ", percentage=" + this.percentage + ", tagTitle=" + this.tagTitle + ", tagBackground=" + this.tagBackground + ", arrowBackground=" + this.arrowBackground + ", convertBannerType=" + this.convertBannerType + ", currencyId=" + this.currencyId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.productName);
        parcel.writeString(this.coinUrl);
        parcel.writeString(this.coinName);
        parcel.writeString(this.description);
        parcel.writeString(this.percentage);
        parcel.writeString(this.tagTitle);
        Integer num = this.tagBackground;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.arrowBackground;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.convertBannerType);
        Integer num3 = this.currencyId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.result.view.BSCConvertDetailBannerItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BSCConvertDetailBannerItem> serializer() {
            return BSCConvertDetailBannerItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BSCConvertDetailBannerItem(int i, String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, String str7, Integer num3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.productName = "";
        } else {
            this.productName = str;
        }
        if ((i & 2) == 0) {
            this.coinUrl = "";
        } else {
            this.coinUrl = str2;
        }
        if ((i & 4) == 0) {
            this.coinName = "";
        } else {
            this.coinName = str3;
        }
        if ((i & 8) == 0) {
            this.description = "";
        } else {
            this.description = str4;
        }
        if ((i & 16) == 0) {
            this.percentage = "";
        } else {
            this.percentage = str5;
        }
        if ((i & 32) == 0) {
            this.tagTitle = "";
        } else {
            this.tagTitle = str6;
        }
        if ((i & 64) == 0) {
            this.tagBackground = 0;
        } else {
            this.tagBackground = num;
        }
        if ((i & 128) == 0) {
            this.arrowBackground = 0;
        } else {
            this.arrowBackground = num2;
        }
        if ((i & 256) == 0) {
            this.convertBannerType = "";
        } else {
            this.convertBannerType = str7;
        }
        if ((i & 512) == 0) {
            this.currencyId = null;
        } else {
            this.currencyId = num3;
        }
    }

    public static final /* synthetic */ void write$Self$OKBuySell_buysell_impl(BSCConvertDetailBannerItem bSCConvertDetailBannerItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) bSCConvertDetailBannerItem.productName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, bSCConvertDetailBannerItem.productName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) bSCConvertDetailBannerItem.coinUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, bSCConvertDetailBannerItem.coinUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) bSCConvertDetailBannerItem.coinName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, bSCConvertDetailBannerItem.coinName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) bSCConvertDetailBannerItem.description, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, bSCConvertDetailBannerItem.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) bSCConvertDetailBannerItem.percentage, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, bSCConvertDetailBannerItem.percentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) bSCConvertDetailBannerItem.tagTitle, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, bSCConvertDetailBannerItem.tagTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || (num2 = bSCConvertDetailBannerItem.tagBackground) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, bSCConvertDetailBannerItem.tagBackground);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || (num = bSCConvertDetailBannerItem.arrowBackground) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, bSCConvertDetailBannerItem.arrowBackground);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) bSCConvertDetailBannerItem.convertBannerType, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, bSCConvertDetailBannerItem.convertBannerType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && bSCConvertDetailBannerItem.currencyId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, bSCConvertDetailBannerItem.currencyId);
    }

    public BSCConvertDetailBannerItem(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, String str7, Integer num3) {
        this.productName = str;
        this.coinUrl = str2;
        this.coinName = str3;
        this.description = str4;
        this.percentage = str5;
        this.tagTitle = str6;
        this.tagBackground = num;
        this.arrowBackground = num2;
        this.convertBannerType = str7;
        this.currencyId = num3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0068: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r18v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003c: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r19v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (""))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004e: ARITH (r22v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r21v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer):void (m)] (LINE:11) call: com.okinc.buysell.ui.result.view.BSCConvertDetailBannerItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ BSCConvertDetailBannerItem(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, String str7, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? 0 : num, (i & 128) != 0 ? 0 : num2, (i & 256) == 0 ? str7 : "", (i & 512) != 0 ? null : num3);
    }
}
