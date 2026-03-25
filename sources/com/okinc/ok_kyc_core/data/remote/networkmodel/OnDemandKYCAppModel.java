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
public final class OnDemandKYCAppModel implements Parcelable {
    private boolean compliant;
    private boolean onDemandFeatureFlagEnabled;
    private PageComponentProfile profile;
    private PageComponentAppModel viewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OnDemandKYCAppModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, PageComponentAppModel.Companion.serializer()};

    public static final class Creator implements Parcelable.Creator<OnDemandKYCAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnDemandKYCAppModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OnDemandKYCAppModel(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : PageComponentProfile.CREATOR.createFromParcel(parcel), (PageComponentAppModel) parcel.readParcelable(OnDemandKYCAppModel.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnDemandKYCAppModel[] newArray(int i) {
            return new OnDemandKYCAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OnDemandKYCAppModel() {
        this(false, false, (PageComponentProfile) null, (PageComponentAppModel) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OnDemandKYCAppModel copy$default(OnDemandKYCAppModel onDemandKYCAppModel, boolean z, boolean z2, PageComponentProfile pageComponentProfile, PageComponentAppModel pageComponentAppModel, int i, Object obj) {
        if ((i & 1) != 0) {
            z = onDemandKYCAppModel.compliant;
        }
        if ((i & 2) != 0) {
            z2 = onDemandKYCAppModel.onDemandFeatureFlagEnabled;
        }
        if ((i & 4) != 0) {
            pageComponentProfile = onDemandKYCAppModel.profile;
        }
        if ((i & 8) != 0) {
            pageComponentAppModel = onDemandKYCAppModel.viewModel;
        }
        return onDemandKYCAppModel.copy(z, z2, pageComponentProfile, pageComponentAppModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.compliant;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.onDemandFeatureFlagEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PageComponentProfile component3() {
        return this.profile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PageComponentAppModel component4() {
        return this.viewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnDemandKYCAppModel copy(boolean z, boolean z2, PageComponentProfile pageComponentProfile, PageComponentAppModel pageComponentAppModel) {
        return new OnDemandKYCAppModel(z, z2, pageComponentProfile, pageComponentAppModel);
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
        if (!(obj instanceof OnDemandKYCAppModel)) {
            return false;
        }
        OnDemandKYCAppModel onDemandKYCAppModel = (OnDemandKYCAppModel) obj;
        return this.compliant == onDemandKYCAppModel.compliant && this.onDemandFeatureFlagEnabled == onDemandKYCAppModel.onDemandFeatureFlagEnabled && Intrinsics.EZpvd(this.profile, onDemandKYCAppModel.profile) && Intrinsics.EZpvd(this.viewModel, onDemandKYCAppModel.viewModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCompliant() {
        return this.compliant;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getOnDemandFeatureFlagEnabled() {
        return this.onDemandFeatureFlagEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PageComponentProfile getProfile() {
        return this.profile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PageComponentAppModel getViewModel() {
        return this.viewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.compliant);
        int iHashCode2 = Boolean.hashCode(this.onDemandFeatureFlagEnabled);
        PageComponentProfile pageComponentProfile = this.profile;
        int iHashCode3 = pageComponentProfile == null ? 0 : pageComponentProfile.hashCode();
        PageComponentAppModel pageComponentAppModel = this.viewModel;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (pageComponentAppModel != null ? pageComponentAppModel.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCompliant(boolean z) {
        this.compliant = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnDemandFeatureFlagEnabled(boolean z) {
        this.onDemandFeatureFlagEnabled = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfile(PageComponentProfile pageComponentProfile) {
        this.profile = pageComponentProfile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewModel(PageComponentAppModel pageComponentAppModel) {
        this.viewModel = pageComponentAppModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OnDemandKYCAppModel(compliant=" + this.compliant + ", onDemandFeatureFlagEnabled=" + this.onDemandFeatureFlagEnabled + ", profile=" + this.profile + ", viewModel=" + this.viewModel + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.compliant ? 1 : 0);
        parcel.writeInt(this.onDemandFeatureFlagEnabled ? 1 : 0);
        PageComponentProfile pageComponentProfile = this.profile;
        if (pageComponentProfile == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pageComponentProfile.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.viewModel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnDemandKYCAppModel> serializer() {
            return OnDemandKYCAppModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OnDemandKYCAppModel(int i, boolean z, boolean z2, PageComponentProfile pageComponentProfile, PageComponentAppModel pageComponentAppModel, SerializationConstructorMarker serializationConstructorMarker) {
        this.compliant = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.onDemandFeatureFlagEnabled = true;
        } else {
            this.onDemandFeatureFlagEnabled = z2;
        }
        if ((i & 4) == 0) {
            this.profile = null;
        } else {
            this.profile = pageComponentProfile;
        }
        if ((i & 8) == 0) {
            this.viewModel = null;
        } else {
            this.viewModel = pageComponentAppModel;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(OnDemandKYCAppModel onDemandKYCAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || onDemandKYCAppModel.compliant) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, onDemandKYCAppModel.compliant);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !onDemandKYCAppModel.onDemandFeatureFlagEnabled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, onDemandKYCAppModel.onDemandFeatureFlagEnabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || onDemandKYCAppModel.profile != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, PageComponentProfile$$serializer.INSTANCE, onDemandKYCAppModel.profile);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && onDemandKYCAppModel.viewModel == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], onDemandKYCAppModel.viewModel);
    }

    public OnDemandKYCAppModel(boolean z, boolean z2, PageComponentProfile pageComponentProfile, PageComponentAppModel pageComponentAppModel) {
        this.compliant = z;
        this.onDemandFeatureFlagEnabled = z2;
        this.profile = pageComponentProfile;
        this.viewModel = pageComponentAppModel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile:?: TERNARY null = ((wrap:int:0x000a: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile) : (r4v0 com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel) : (r5v0 com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel))
 A[MD:(boolean, boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile, com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel):void (m)] (LINE:57) call: com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel.<init>(boolean, boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile, com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel):void type: THIS */
    public /* synthetic */ OnDemandKYCAppModel(boolean z, boolean z2, PageComponentProfile pageComponentProfile, PageComponentAppModel pageComponentAppModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? null : pageComponentProfile, (i & 8) != 0 ? null : pageComponentAppModel);
    }
}
