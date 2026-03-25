package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class CardChoicesIcon implements Parcelable {
    private final String graphic;
    private String height;
    private String position;
    private final String renderColor;
    private String width;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CardChoicesIcon> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CardChoicesIcon> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardChoicesIcon createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CardChoicesIcon(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardChoicesIcon[] newArray(int i) {
            return new CardChoicesIcon[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CardChoicesIcon() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CardChoicesIcon copy$default(CardChoicesIcon cardChoicesIcon, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardChoicesIcon.graphic;
        }
        if ((i & 2) != 0) {
            str2 = cardChoicesIcon.width;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = cardChoicesIcon.height;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = cardChoicesIcon.position;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = cardChoicesIcon.renderColor;
        }
        return cardChoicesIcon.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.graphic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.renderColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardChoicesIcon copy(String str, String str2, String str3, String str4, String str5) {
        return new CardChoicesIcon(str, str2, str3, str4, str5);
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
        if (!(obj instanceof CardChoicesIcon)) {
            return false;
        }
        CardChoicesIcon cardChoicesIcon = (CardChoicesIcon) obj;
        return Intrinsics.EZpvd((Object) this.graphic, (Object) cardChoicesIcon.graphic) && Intrinsics.EZpvd((Object) this.width, (Object) cardChoicesIcon.width) && Intrinsics.EZpvd((Object) this.height, (Object) cardChoicesIcon.height) && Intrinsics.EZpvd((Object) this.position, (Object) cardChoicesIcon.position) && Intrinsics.EZpvd((Object) this.renderColor, (Object) cardChoicesIcon.renderColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGraphic() {
        return this.graphic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHeight() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRenderColor() {
        return this.renderColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWidth() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.graphic;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.width;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.height;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.position;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.renderColor;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeight(String str) {
        this.height = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosition(String str) {
        this.position = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWidth(String str) {
        this.width = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardChoicesIcon(graphic=" + this.graphic + ", width=" + this.width + ", height=" + this.height + ", position=" + this.position + ", renderColor=" + this.renderColor + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.graphic);
        parcel.writeString(this.width);
        parcel.writeString(this.height);
        parcel.writeString(this.position);
        parcel.writeString(this.renderColor);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesIcon.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CardChoicesIcon> serializer() {
            return CardChoicesIcon$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CardChoicesIcon(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.graphic = null;
        } else {
            this.graphic = str;
        }
        if ((i & 2) == 0) {
            this.width = null;
        } else {
            this.width = str2;
        }
        if ((i & 4) == 0) {
            this.height = null;
        } else {
            this.height = str3;
        }
        if ((i & 8) == 0) {
            this.position = null;
        } else {
            this.position = str4;
        }
        if ((i & 16) == 0) {
            this.renderColor = null;
        } else {
            this.renderColor = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CardChoicesIcon cardChoicesIcon, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || cardChoicesIcon.graphic != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, cardChoicesIcon.graphic);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || cardChoicesIcon.width != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, cardChoicesIcon.width);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || cardChoicesIcon.height != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, cardChoicesIcon.height);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || cardChoicesIcon.position != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, cardChoicesIcon.position);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && cardChoicesIcon.renderColor == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, cardChoicesIcon.renderColor);
    }

    public CardChoicesIcon(String str, String str2, String str3, String str4, String str5) {
        this.graphic = str;
        this.width = str2;
        this.height = str3;
        this.position = str4;
        this.renderColor = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:3181) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CardChoicesIcon.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CardChoicesIcon(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
