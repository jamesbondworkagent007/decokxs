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
public final class CtaLink implements Parcelable {
    private final CTAButtonAppModel cta;
    private final LinkTextStyle style;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CtaLink> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CtaLink> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaLink createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CtaLink(parcel.readInt() == 0 ? null : CTAButtonAppModel.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LinkTextStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CtaLink[] newArray(int i) {
            return new CtaLink[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CtaLink() {
        this((CTAButtonAppModel) null, (LinkTextStyle) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CtaLink copy$default(CtaLink ctaLink, CTAButtonAppModel cTAButtonAppModel, LinkTextStyle linkTextStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            cTAButtonAppModel = ctaLink.cta;
        }
        if ((i & 2) != 0) {
            linkTextStyle = ctaLink.style;
        }
        return ctaLink.copy(cTAButtonAppModel, linkTextStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel component1() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkTextStyle component2() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaLink copy(CTAButtonAppModel cTAButtonAppModel, LinkTextStyle linkTextStyle) {
        return new CtaLink(cTAButtonAppModel, linkTextStyle);
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
        if (!(obj instanceof CtaLink)) {
            return false;
        }
        CtaLink ctaLink = (CtaLink) obj;
        return Intrinsics.EZpvd(this.cta, ctaLink.cta) && Intrinsics.EZpvd(this.style, ctaLink.style);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkTextStyle getStyle() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        CTAButtonAppModel cTAButtonAppModel = this.cta;
        int iHashCode = cTAButtonAppModel == null ? 0 : cTAButtonAppModel.hashCode();
        LinkTextStyle linkTextStyle = this.style;
        return (iHashCode * 31) + (linkTextStyle != null ? linkTextStyle.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CtaLink(cta=" + this.cta + ", style=" + this.style + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        CTAButtonAppModel cTAButtonAppModel = this.cta;
        if (cTAButtonAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButtonAppModel.writeToParcel(parcel, i);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaLink.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CtaLink> serializer() {
            return CtaLink$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CtaLink(int i, CTAButtonAppModel cTAButtonAppModel, LinkTextStyle linkTextStyle, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.cta = null;
        } else {
            this.cta = cTAButtonAppModel;
        }
        if ((i & 2) == 0) {
            this.style = null;
        } else {
            this.style = linkTextStyle;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CtaLink ctaLink, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || ctaLink.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, CTAButtonAppModel$$serializer.INSTANCE, ctaLink.cta);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && ctaLink.style == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LinkTextStyle$$serializer.INSTANCE, ctaLink.style);
    }

    public CtaLink(CTAButtonAppModel cTAButtonAppModel, LinkTextStyle linkTextStyle) {
        this.cta = cTAButtonAppModel;
        this.style = linkTextStyle;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel) : (r2v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle) : (r3v0 com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle))
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle):void (m)] (LINE:356) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CtaLink.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle):void type: THIS */
    public /* synthetic */ CtaLink(CTAButtonAppModel cTAButtonAppModel, LinkTextStyle linkTextStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cTAButtonAppModel, (i & 2) != 0 ? null : linkTextStyle);
    }
}
