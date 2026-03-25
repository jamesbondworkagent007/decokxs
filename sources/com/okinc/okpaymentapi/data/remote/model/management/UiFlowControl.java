package com.okinc.okpaymentapi.data.remote.model.management;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class UiFlowControl implements Parcelable {
    public static final int $stable = 0;
    private final boolean allowManualAdditionInfoPage;
    private final boolean showInformationBox;
    private final boolean showTOC;
    private final boolean showWarningBox;
    private final boolean showWithdrawAccountsForDeposit;
    private final boolean showWithdrawHoldScreen;
    private final Boolean skipManagementSingleChannelSelectionScreen;
    private final boolean skipTwoFactorAuth;
    private final boolean skipWireEducation;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<UiFlowControl> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UiFlowControl> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiFlowControl createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            boolean z6 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UiFlowControl(z, z2, z3, z4, z5, z6, boolValueOf, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiFlowControl[] newArray(int i) {
            return new UiFlowControl[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UiFlowControl() {
        this(false, false, false, false, false, false, (Boolean) null, false, false, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.showTOC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.showWarningBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.showInformationBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.skipTwoFactorAuth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.skipWireEducation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.allowManualAdditionInfoPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.skipManagementSingleChannelSelectionScreen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.showWithdrawAccountsForDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.showWithdrawHoldScreen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UiFlowControl copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Boolean bool, boolean z7, boolean z8) {
        return new UiFlowControl(z, z2, z3, z4, z5, z6, bool, z7, z8);
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
        if (!(obj instanceof UiFlowControl)) {
            return false;
        }
        UiFlowControl uiFlowControl = (UiFlowControl) obj;
        return this.showTOC == uiFlowControl.showTOC && this.showWarningBox == uiFlowControl.showWarningBox && this.showInformationBox == uiFlowControl.showInformationBox && this.skipTwoFactorAuth == uiFlowControl.skipTwoFactorAuth && this.skipWireEducation == uiFlowControl.skipWireEducation && this.allowManualAdditionInfoPage == uiFlowControl.allowManualAdditionInfoPage && Intrinsics.EZpvd(this.skipManagementSingleChannelSelectionScreen, uiFlowControl.skipManagementSingleChannelSelectionScreen) && this.showWithdrawAccountsForDeposit == uiFlowControl.showWithdrawAccountsForDeposit && this.showWithdrawHoldScreen == uiFlowControl.showWithdrawHoldScreen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAllowManualAdditionInfoPage() {
        return this.allowManualAdditionInfoPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowInformationBox() {
        return this.showInformationBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowTOC() {
        return this.showTOC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowWarningBox() {
        return this.showWarningBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowWithdrawAccountsForDeposit() {
        return this.showWithdrawAccountsForDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowWithdrawHoldScreen() {
        return this.showWithdrawHoldScreen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSkipManagementSingleChannelSelectionScreen() {
        return this.skipManagementSingleChannelSelectionScreen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSkipTwoFactorAuth() {
        return this.skipTwoFactorAuth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSkipWireEducation() {
        return this.skipWireEducation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.showTOC);
        int iHashCode2 = Boolean.hashCode(this.showWarningBox);
        int iHashCode3 = Boolean.hashCode(this.showInformationBox);
        int iHashCode4 = Boolean.hashCode(this.skipTwoFactorAuth);
        int iHashCode5 = Boolean.hashCode(this.skipWireEducation);
        int iHashCode6 = Boolean.hashCode(this.allowManualAdditionInfoPage);
        Boolean bool = this.skipManagementSingleChannelSelectionScreen;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.showWithdrawAccountsForDeposit)) * 31) + Boolean.hashCode(this.showWithdrawHoldScreen);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UiFlowControl(showTOC=" + this.showTOC + ", showWarningBox=" + this.showWarningBox + ", showInformationBox=" + this.showInformationBox + ", skipTwoFactorAuth=" + this.skipTwoFactorAuth + ", skipWireEducation=" + this.skipWireEducation + ", allowManualAdditionInfoPage=" + this.allowManualAdditionInfoPage + ", skipManagementSingleChannelSelectionScreen=" + this.skipManagementSingleChannelSelectionScreen + ", showWithdrawAccountsForDeposit=" + this.showWithdrawAccountsForDeposit + ", showWithdrawHoldScreen=" + this.showWithdrawHoldScreen + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v22 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.showTOC ? 1 : 0);
        parcel.writeInt(this.showWarningBox ? 1 : 0);
        parcel.writeInt(this.showInformationBox ? 1 : 0);
        parcel.writeInt(this.skipTwoFactorAuth ? 1 : 0);
        parcel.writeInt(this.skipWireEducation ? 1 : 0);
        parcel.writeInt(this.allowManualAdditionInfoPage ? 1 : 0);
        Boolean bool = this.skipManagementSingleChannelSelectionScreen;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeInt(this.showWithdrawAccountsForDeposit ? 1 : 0);
        parcel.writeInt(this.showWithdrawHoldScreen ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.UiFlowControl.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UiFlowControl> serializer() {
            return UiFlowControl$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UiFlowControl(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Boolean bool, boolean z7, boolean z8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.showTOC = false;
        } else {
            this.showTOC = z;
        }
        if ((i & 2) == 0) {
            this.showWarningBox = false;
        } else {
            this.showWarningBox = z2;
        }
        if ((i & 4) == 0) {
            this.showInformationBox = false;
        } else {
            this.showInformationBox = z3;
        }
        if ((i & 8) == 0) {
            this.skipTwoFactorAuth = false;
        } else {
            this.skipTwoFactorAuth = z4;
        }
        if ((i & 16) == 0) {
            this.skipWireEducation = true;
        } else {
            this.skipWireEducation = z5;
        }
        if ((i & 32) == 0) {
            this.allowManualAdditionInfoPage = false;
        } else {
            this.allowManualAdditionInfoPage = z6;
        }
        if ((i & 64) == 0) {
            this.skipManagementSingleChannelSelectionScreen = null;
        } else {
            this.skipManagementSingleChannelSelectionScreen = bool;
        }
        if ((i & 128) == 0) {
            this.showWithdrawAccountsForDeposit = false;
        } else {
            this.showWithdrawAccountsForDeposit = z7;
        }
        if ((i & 256) == 0) {
            this.showWithdrawHoldScreen = false;
        } else {
            this.showWithdrawHoldScreen = z8;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(UiFlowControl uiFlowControl, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || uiFlowControl.showTOC) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, uiFlowControl.showTOC);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || uiFlowControl.showWarningBox) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, uiFlowControl.showWarningBox);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || uiFlowControl.showInformationBox) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, uiFlowControl.showInformationBox);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || uiFlowControl.skipTwoFactorAuth) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, uiFlowControl.skipTwoFactorAuth);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !uiFlowControl.skipWireEducation) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, uiFlowControl.skipWireEducation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || uiFlowControl.allowManualAdditionInfoPage) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, uiFlowControl.allowManualAdditionInfoPage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || uiFlowControl.skipManagementSingleChannelSelectionScreen != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, uiFlowControl.skipManagementSingleChannelSelectionScreen);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || uiFlowControl.showWithdrawAccountsForDeposit) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, uiFlowControl.showWithdrawAccountsForDeposit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || uiFlowControl.showWithdrawHoldScreen) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, uiFlowControl.showWithdrawHoldScreen);
        }
    }

    public UiFlowControl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Boolean bool, boolean z7, boolean z8) {
        this.showTOC = z;
        this.showWarningBox = z2;
        this.showInformationBox = z3;
        this.skipTwoFactorAuth = z4;
        this.skipWireEducation = z5;
        this.allowManualAdditionInfoPage = z6;
        this.skipManagementSingleChannelSelectionScreen = bool;
        this.showWithdrawAccountsForDeposit = z7;
        this.showWithdrawHoldScreen = z8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r15v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r17v0 java.lang.Boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 boolean) : false)
 A[MD:(boolean, boolean, boolean, boolean, boolean, boolean, java.lang.Boolean, boolean, boolean):void (m)] (LINE:332) call: com.okinc.okpaymentapi.data.remote.model.management.UiFlowControl.<init>(boolean, boolean, boolean, boolean, boolean, boolean, java.lang.Boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ UiFlowControl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Boolean bool, boolean z7, boolean z8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? true : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? false : z7, (i & 256) == 0 ? z8 : false);
    }
}
