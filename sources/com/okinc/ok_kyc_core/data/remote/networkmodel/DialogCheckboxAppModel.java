package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class DialogCheckboxAppModel implements Parcelable {
    public static final int $stable = 0;
    private final Integer fontSize;
    private final String fontWeight;
    private final Float lineHeight;
    private final String text;
    private final String textColor;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DialogCheckboxAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DialogCheckboxAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DialogCheckboxAppModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DialogCheckboxAppModel(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DialogCheckboxAppModel[] newArray(int i) {
            return new DialogCheckboxAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DialogCheckboxAppModel copy$default(DialogCheckboxAppModel dialogCheckboxAppModel, String str, Integer num, String str2, String str3, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dialogCheckboxAppModel.text;
        }
        if ((i & 2) != 0) {
            num = dialogCheckboxAppModel.fontSize;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            str2 = dialogCheckboxAppModel.textColor;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = dialogCheckboxAppModel.fontWeight;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            f = dialogCheckboxAppModel.lineHeight;
        }
        return dialogCheckboxAppModel.copy(str, num2, str4, str5, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.fontSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.textColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fontWeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component5() {
        return this.lineHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DialogCheckboxAppModel copy(@NotNull String str, Integer num, String str2, String str3, Float f) {
        Intrinsics.checkNotNullParameter(str, "");
        return new DialogCheckboxAppModel(str, num, str2, str3, f);
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
        if (!(obj instanceof DialogCheckboxAppModel)) {
            return false;
        }
        DialogCheckboxAppModel dialogCheckboxAppModel = (DialogCheckboxAppModel) obj;
        return Intrinsics.EZpvd((Object) this.text, (Object) dialogCheckboxAppModel.text) && Intrinsics.EZpvd(this.fontSize, dialogCheckboxAppModel.fontSize) && Intrinsics.EZpvd((Object) this.textColor, (Object) dialogCheckboxAppModel.textColor) && Intrinsics.EZpvd((Object) this.fontWeight, (Object) dialogCheckboxAppModel.fontWeight) && Intrinsics.EZpvd(this.lineHeight, dialogCheckboxAppModel.lineHeight);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFontSize() {
        return this.fontSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFontWeight() {
        return this.fontWeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getLineHeight() {
        return this.lineHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTextColor() {
        return this.textColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.text.hashCode();
        Integer num = this.fontSize;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str = this.textColor;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.fontWeight;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        Float f = this.lineHeight;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (f != null ? f.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DialogCheckboxAppModel(text=" + this.text + ", fontSize=" + this.fontSize + ", textColor=" + this.textColor + ", fontWeight=" + this.fontWeight + ", lineHeight=" + this.lineHeight + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.text);
        Integer num = this.fontSize;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.textColor);
        parcel.writeString(this.fontWeight);
        Float f = this.lineHeight;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCheckboxAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DialogCheckboxAppModel> serializer() {
            return DialogCheckboxAppModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DialogCheckboxAppModel(int i, String str, Integer num, String str2, String str3, Float f, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, DialogCheckboxAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        if ((i & 2) == 0) {
            this.fontSize = null;
        } else {
            this.fontSize = num;
        }
        if ((i & 4) == 0) {
            this.textColor = null;
        } else {
            this.textColor = str2;
        }
        if ((i & 8) == 0) {
            this.fontWeight = null;
        } else {
            this.fontWeight = str3;
        }
        if ((i & 16) == 0) {
            this.lineHeight = null;
        } else {
            this.lineHeight = f;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(DialogCheckboxAppModel dialogCheckboxAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, dialogCheckboxAppModel.text);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dialogCheckboxAppModel.fontSize != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, dialogCheckboxAppModel.fontSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dialogCheckboxAppModel.textColor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, dialogCheckboxAppModel.textColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dialogCheckboxAppModel.fontWeight != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, dialogCheckboxAppModel.fontWeight);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && dialogCheckboxAppModel.lineHeight == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, FloatSerializer.INSTANCE, dialogCheckboxAppModel.lineHeight);
    }

    public DialogCheckboxAppModel(@NotNull String str, Integer num, String str2, String str3, Float f) {
        Intrinsics.checkNotNullParameter(str, "");
        this.text = str;
        this.fontSize = num;
        this.textColor = str2;
        this.fontWeight = str3;
        this.lineHeight = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r12v0 java.lang.Float))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Float):void (m)] (LINE:1486) call: com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCheckboxAppModel.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Float):void type: THIS */
    public /* synthetic */ DialogCheckboxAppModel(String str, Integer num, String str2, String str3, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : f);
    }
}
