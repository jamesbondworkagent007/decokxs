package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class PopupTextContent implements Parcelable {
    private ButtonDialog dialog;
    private final LinkTextStyle style;
    private final String text;
    private final Boolean underline;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PopupTextContent> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PopupTextContent> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PopupTextContent createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            LinkTextStyle linkTextStyleCreateFromParcel = parcel.readInt() == 0 ? null : LinkTextStyle.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PopupTextContent(string, linkTextStyleCreateFromParcel, boolValueOf, parcel.readInt() != 0 ? ButtonDialog.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PopupTextContent[] newArray(int i) {
            return new PopupTextContent[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PopupTextContent() {
        this((String) null, (LinkTextStyle) null, (Boolean) null, (ButtonDialog) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PopupTextContent copy$default(PopupTextContent popupTextContent, String str, LinkTextStyle linkTextStyle, Boolean bool, ButtonDialog buttonDialog, int i, Object obj) {
        if ((i & 1) != 0) {
            str = popupTextContent.text;
        }
        if ((i & 2) != 0) {
            linkTextStyle = popupTextContent.style;
        }
        if ((i & 4) != 0) {
            bool = popupTextContent.underline;
        }
        if ((i & 8) != 0) {
            buttonDialog = popupTextContent.dialog;
        }
        return popupTextContent.copy(str, linkTextStyle, bool, buttonDialog);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkTextStyle component2() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.underline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonDialog component4() {
        return this.dialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PopupTextContent copy(String str, LinkTextStyle linkTextStyle, Boolean bool, ButtonDialog buttonDialog) {
        return new PopupTextContent(str, linkTextStyle, bool, buttonDialog);
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
        if (!(obj instanceof PopupTextContent)) {
            return false;
        }
        PopupTextContent popupTextContent = (PopupTextContent) obj;
        return Intrinsics.EZpvd((Object) this.text, (Object) popupTextContent.text) && Intrinsics.EZpvd(this.style, popupTextContent.style) && Intrinsics.EZpvd(this.underline, popupTextContent.underline) && Intrinsics.EZpvd(this.dialog, popupTextContent.dialog);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonDialog getDialog() {
        return this.dialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkTextStyle getStyle() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getUnderline() {
        return this.underline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.text;
        int iHashCode = str == null ? 0 : str.hashCode();
        LinkTextStyle linkTextStyle = this.style;
        int iHashCode2 = linkTextStyle == null ? 0 : linkTextStyle.hashCode();
        Boolean bool = this.underline;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        ButtonDialog buttonDialog = this.dialog;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (buttonDialog != null ? buttonDialog.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDialog(ButtonDialog buttonDialog) {
        this.dialog = buttonDialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PopupTextContent(text=" + this.text + ", style=" + this.style + ", underline=" + this.underline + ", dialog=" + this.dialog + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.text);
        LinkTextStyle linkTextStyle = this.style;
        if (linkTextStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkTextStyle.writeToParcel(parcel, i);
        }
        Boolean bool = this.underline;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        ButtonDialog buttonDialog = this.dialog;
        if (buttonDialog == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonDialog.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.PopupTextContent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PopupTextContent> serializer() {
            return PopupTextContent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PopupTextContent(int i, String str, LinkTextStyle linkTextStyle, Boolean bool, ButtonDialog buttonDialog, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
        if ((i & 2) == 0) {
            this.style = null;
        } else {
            this.style = linkTextStyle;
        }
        if ((i & 4) == 0) {
            this.underline = Boolean.TRUE;
        } else {
            this.underline = bool;
        }
        if ((i & 8) == 0) {
            this.dialog = null;
        } else {
            this.dialog = buttonDialog;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(PopupTextContent popupTextContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || popupTextContent.text != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, popupTextContent.text);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || popupTextContent.style != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LinkTextStyle$$serializer.INSTANCE, popupTextContent.style);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(popupTextContent.underline, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, popupTextContent.underline);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && popupTextContent.dialog == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, ButtonDialog$$serializer.INSTANCE, popupTextContent.dialog);
    }

    public PopupTextContent(String str, LinkTextStyle linkTextStyle, Boolean bool, ButtonDialog buttonDialog) {
        this.text = str;
        this.style = linkTextStyle;
        this.underline = bool;
        this.dialog = buttonDialog;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle) : (r3v0 com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x000f: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r4v0 java.lang.Boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog) : (r5v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog))
 A[MD:(java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog):void (m)] (LINE:1976) call: com.okinc.ok_kyc_core.data.remote.networkmodel.PopupTextContent.<init>(java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog):void type: THIS */
    public /* synthetic */ PopupTextContent(String str, LinkTextStyle linkTextStyle, Boolean bool, ButtonDialog buttonDialog, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : linkTextStyle, (i & 4) != 0 ? Boolean.TRUE : bool, (i & 8) != 0 ? null : buttonDialog);
    }
}
