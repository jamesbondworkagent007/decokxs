package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationButtonStyle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class CtaButtonStyle implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    public static final int $stable = 0;
    private final NotificationButtonStyle primaryButton;
    private final NotificationButtonStyle secondaryButton;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CtaButtonStyle> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CtaButtonStyle> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaButtonStyle createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CtaButtonStyle(parcel.readInt() == 0 ? null : NotificationButtonStyle.valueOf(parcel.readString()), parcel.readInt() != 0 ? NotificationButtonStyle.valueOf(parcel.readString()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaButtonStyle[] newArray(int i) {
            return new CtaButtonStyle[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CtaButtonStyle() {
        this((NotificationButtonStyle) null, (NotificationButtonStyle) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CtaButtonStyle copy$default(CtaButtonStyle ctaButtonStyle, NotificationButtonStyle notificationButtonStyle, NotificationButtonStyle notificationButtonStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            notificationButtonStyle = ctaButtonStyle.primaryButton;
        }
        if ((i & 2) != 0) {
            notificationButtonStyle2 = ctaButtonStyle.secondaryButton;
        }
        return ctaButtonStyle.copy(notificationButtonStyle, notificationButtonStyle2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationButtonStyle component1() {
        return this.primaryButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationButtonStyle component2() {
        return this.secondaryButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaButtonStyle copy(NotificationButtonStyle notificationButtonStyle, NotificationButtonStyle notificationButtonStyle2) {
        return new CtaButtonStyle(notificationButtonStyle, notificationButtonStyle2);
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
        if (!(obj instanceof CtaButtonStyle)) {
            return false;
        }
        CtaButtonStyle ctaButtonStyle = (CtaButtonStyle) obj;
        return this.primaryButton == ctaButtonStyle.primaryButton && this.secondaryButton == ctaButtonStyle.secondaryButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationButtonStyle getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationButtonStyle getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        NotificationButtonStyle notificationButtonStyle = this.primaryButton;
        int iHashCode = notificationButtonStyle == null ? 0 : notificationButtonStyle.hashCode();
        NotificationButtonStyle notificationButtonStyle2 = this.secondaryButton;
        return (iHashCode * 31) + (notificationButtonStyle2 != null ? notificationButtonStyle2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CtaButtonStyle(primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        NotificationButtonStyle notificationButtonStyle = this.primaryButton;
        if (notificationButtonStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(notificationButtonStyle.name());
        }
        NotificationButtonStyle notificationButtonStyle2 = this.secondaryButton;
        if (notificationButtonStyle2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(notificationButtonStyle2.name());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaButtonStyle.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CtaButtonStyle> serializer() {
            return CtaButtonStyle$$serializer.INSTANCE;
        }
    }

    static {
        NotificationButtonStyle.Companion companion = NotificationButtonStyle.Companion;
        $childSerializers = new KSerializer[]{companion.serializer(), companion.serializer()};
    }

    public /* synthetic */ CtaButtonStyle(int i, NotificationButtonStyle notificationButtonStyle, NotificationButtonStyle notificationButtonStyle2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.primaryButton = null;
        } else {
            this.primaryButton = notificationButtonStyle;
        }
        if ((i & 2) == 0) {
            this.secondaryButton = null;
        } else {
            this.secondaryButton = notificationButtonStyle2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CtaButtonStyle ctaButtonStyle, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || ctaButtonStyle.primaryButton != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], ctaButtonStyle.primaryButton);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && ctaButtonStyle.secondaryButton == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], ctaButtonStyle.secondaryButton);
    }

    public CtaButtonStyle(NotificationButtonStyle notificationButtonStyle, NotificationButtonStyle notificationButtonStyle2) {
        this.primaryButton = notificationButtonStyle;
        this.secondaryButton = notificationButtonStyle2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationButtonStyle:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationButtonStyle) : (r2v0 com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationButtonStyle))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationButtonStyle:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationButtonStyle) : (r3v0 com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationButtonStyle))
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationButtonStyle, com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationButtonStyle):void (m)] (LINE:253) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaButtonStyle.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationButtonStyle, com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationButtonStyle):void type: THIS */
    public /* synthetic */ CtaButtonStyle(NotificationButtonStyle notificationButtonStyle, NotificationButtonStyle notificationButtonStyle2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : notificationButtonStyle, (i & 2) != 0 ? null : notificationButtonStyle2);
    }
}
