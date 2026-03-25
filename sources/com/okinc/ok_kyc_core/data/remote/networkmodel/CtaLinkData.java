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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class CtaLinkData implements Parcelable {
    private final CTAButton cta;
    private final LinkTextStyle style;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CtaLinkData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CtaLinkData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaLinkData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CtaLinkData(parcel.readInt() == 0 ? null : CTAButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LinkTextStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaLinkData[] newArray(int i) {
            return new CtaLinkData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CtaLinkData() {
        this((CTAButton) null, (LinkTextStyle) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CtaLinkData copy$default(CtaLinkData ctaLinkData, CTAButton cTAButton, LinkTextStyle linkTextStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            cTAButton = ctaLinkData.cta;
        }
        if ((i & 2) != 0) {
            linkTextStyle = ctaLinkData.style;
        }
        return ctaLinkData.copy(cTAButton, linkTextStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton component1() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkTextStyle component2() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaLinkData copy(CTAButton cTAButton, LinkTextStyle linkTextStyle) {
        return new CtaLinkData(cTAButton, linkTextStyle);
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
        if (!(obj instanceof CtaLinkData)) {
            return false;
        }
        CtaLinkData ctaLinkData = (CtaLinkData) obj;
        return Intrinsics.EZpvd(this.cta, ctaLinkData.cta) && Intrinsics.EZpvd(this.style, ctaLinkData.style);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkTextStyle getStyle() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        CTAButton cTAButton = this.cta;
        int iHashCode = cTAButton == null ? 0 : cTAButton.hashCode();
        LinkTextStyle linkTextStyle = this.style;
        return (iHashCode * 31) + (linkTextStyle != null ? linkTextStyle.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CtaLinkData(cta=" + this.cta + ", style=" + this.style + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        CTAButton cTAButton = this.cta;
        if (cTAButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButton.writeToParcel(parcel, i);
        }
        LinkTextStyle linkTextStyle = this.style;
        if (linkTextStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkTextStyle.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaLinkData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CtaLinkData> serializer() {
            return CtaLinkData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CtaLinkData(int i, CTAButton cTAButton, LinkTextStyle linkTextStyle, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.cta = null;
        } else {
            this.cta = cTAButton;
        }
        if ((i & 2) == 0) {
            this.style = null;
        } else {
            this.style = linkTextStyle;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CtaLinkData ctaLinkData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || ctaLinkData.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, CTAButton$$serializer.INSTANCE, ctaLinkData.cta);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && ctaLinkData.style == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LinkTextStyle$$serializer.INSTANCE, ctaLinkData.style);
    }

    public CtaLinkData(CTAButton cTAButton, LinkTextStyle linkTextStyle) {
        this.cta = cTAButton;
        this.style = linkTextStyle;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton) : (r2v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle) : (r3v0 com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle))
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle):void (m)] (LINE:364) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaLinkData.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle):void type: THIS */
    public /* synthetic */ CtaLinkData(CTAButton cTAButton, LinkTextStyle linkTextStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cTAButton, (i & 2) != 0 ? null : linkTextStyle);
    }
}
