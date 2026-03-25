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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class DialogCtaButton implements Parcelable {
    private String action;
    private HomeActionParams actionParams;
    private final HomeButtonDialog dialog;
    private final Boolean enabled;
    private String playbook;
    private final String style;
    private final String text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DialogCtaButton> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DialogCtaButton> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DialogCtaButton createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DialogCtaButton(boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : HomeActionParams.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? HomeButtonDialog.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DialogCtaButton[] newArray(int i) {
            return new DialogCtaButton[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DialogCtaButton() {
        this((Boolean) null, (String) null, (String) null, (String) null, (HomeActionParams) null, (String) null, (HomeButtonDialog) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DialogCtaButton copy$default(DialogCtaButton dialogCtaButton, Boolean bool, String str, String str2, String str3, HomeActionParams homeActionParams, String str4, HomeButtonDialog homeButtonDialog, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = dialogCtaButton.enabled;
        }
        if ((i & 2) != 0) {
            str = dialogCtaButton.text;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = dialogCtaButton.playbook;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = dialogCtaButton.action;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            homeActionParams = dialogCtaButton.actionParams;
        }
        HomeActionParams homeActionParams2 = homeActionParams;
        if ((i & 32) != 0) {
            str4 = dialogCtaButton.style;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            homeButtonDialog = dialogCtaButton.dialog;
        }
        return dialogCtaButton.copy(bool, str5, str6, str7, homeActionParams2, str8, homeButtonDialog);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.playbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeActionParams component5() {
        return this.actionParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeButtonDialog component7() {
        return this.dialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DialogCtaButton copy(Boolean bool, String str, String str2, String str3, HomeActionParams homeActionParams, String str4, HomeButtonDialog homeButtonDialog) {
        return new DialogCtaButton(bool, str, str2, str3, homeActionParams, str4, homeButtonDialog);
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
        if (!(obj instanceof DialogCtaButton)) {
            return false;
        }
        DialogCtaButton dialogCtaButton = (DialogCtaButton) obj;
        return Intrinsics.EZpvd(this.enabled, dialogCtaButton.enabled) && Intrinsics.EZpvd((Object) this.text, (Object) dialogCtaButton.text) && Intrinsics.EZpvd((Object) this.playbook, (Object) dialogCtaButton.playbook) && Intrinsics.EZpvd((Object) this.action, (Object) dialogCtaButton.action) && Intrinsics.EZpvd(this.actionParams, dialogCtaButton.actionParams) && Intrinsics.EZpvd((Object) this.style, (Object) dialogCtaButton.style) && Intrinsics.EZpvd(this.dialog, dialogCtaButton.dialog);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAction() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeActionParams getActionParams() {
        return this.actionParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeButtonDialog getDialog() {
        return this.dialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlaybook() {
        return this.playbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStyle() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.enabled;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.text;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.playbook;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.action;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        HomeActionParams homeActionParams = this.actionParams;
        int iHashCode5 = homeActionParams == null ? 0 : homeActionParams.hashCode();
        String str4 = this.style;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        HomeButtonDialog homeButtonDialog = this.dialog;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (homeButtonDialog != null ? homeButtonDialog.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAction(String str) {
        this.action = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActionParams(HomeActionParams homeActionParams) {
        this.actionParams = homeActionParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlaybook(String str) {
        this.playbook = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DialogCtaButton(enabled=" + this.enabled + ", text=" + this.text + ", playbook=" + this.playbook + ", action=" + this.action + ", actionParams=" + this.actionParams + ", style=" + this.style + ", dialog=" + this.dialog + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.enabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.text);
        parcel.writeString(this.playbook);
        parcel.writeString(this.action);
        HomeActionParams homeActionParams = this.actionParams;
        if (homeActionParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            homeActionParams.writeToParcel(parcel, i);
        }
        parcel.writeString(this.style);
        HomeButtonDialog homeButtonDialog = this.dialog;
        if (homeButtonDialog == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            homeButtonDialog.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCtaButton.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DialogCtaButton> serializer() {
            return DialogCtaButton$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DialogCtaButton(int i, Boolean bool, String str, String str2, String str3, HomeActionParams homeActionParams, String str4, HomeButtonDialog homeButtonDialog, SerializationConstructorMarker serializationConstructorMarker) {
        this.enabled = (i & 1) == 0 ? Boolean.TRUE : bool;
        if ((i & 2) == 0) {
            this.text = "";
        } else {
            this.text = str;
        }
        if ((i & 4) == 0) {
            this.playbook = "";
        } else {
            this.playbook = str2;
        }
        if ((i & 8) == 0) {
            this.action = "";
        } else {
            this.action = str3;
        }
        if ((i & 16) == 0) {
            this.actionParams = null;
        } else {
            this.actionParams = homeActionParams;
        }
        if ((i & 32) == 0) {
            this.style = null;
        } else {
            this.style = str4;
        }
        if ((i & 64) == 0) {
            this.dialog = null;
        } else {
            this.dialog = homeButtonDialog;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(DialogCtaButton dialogCtaButton, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(dialogCtaButton.enabled, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, dialogCtaButton.enabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dialogCtaButton.text, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, dialogCtaButton.text);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dialogCtaButton.playbook, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, dialogCtaButton.playbook);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dialogCtaButton.action, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, dialogCtaButton.action);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || dialogCtaButton.actionParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, HomeActionParams$$serializer.INSTANCE, dialogCtaButton.actionParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || dialogCtaButton.style != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, dialogCtaButton.style);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && dialogCtaButton.dialog == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, HomeButtonDialog$$serializer.INSTANCE, dialogCtaButton.dialog);
    }

    public DialogCtaButton(Boolean bool, String str, String str2, String str3, HomeActionParams homeActionParams, String str4, HomeButtonDialog homeButtonDialog) {
        this.enabled = bool;
        this.text = str;
        this.playbook = str2;
        this.action = str3;
        this.actionParams = homeActionParams;
        this.style = str4;
        this.dialog = homeButtonDialog;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r6v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.HomeActionParams:?: TERNARY null = ((wrap:int:0x001c: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.HomeActionParams) : (r10v0 com.okinc.ok_kyc_core.data.remote.networkmodel.HomeActionParams))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.HomeButtonDialog:?: TERNARY null = ((wrap:int:0x002b: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.HomeButtonDialog) : (r12v0 com.okinc.ok_kyc_core.data.remote.networkmodel.HomeButtonDialog))
 A[MD:(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.HomeActionParams, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.HomeButtonDialog):void (m)] (LINE:42) call: com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCtaButton.<init>(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.HomeActionParams, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.HomeButtonDialog):void type: THIS */
    public /* synthetic */ DialogCtaButton(Boolean bool, String str, String str2, String str3, HomeActionParams homeActionParams, String str4, HomeButtonDialog homeButtonDialog, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.TRUE : bool, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? null : homeActionParams, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : homeButtonDialog);
    }
}
