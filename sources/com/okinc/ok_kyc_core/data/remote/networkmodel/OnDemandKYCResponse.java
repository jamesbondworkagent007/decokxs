package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class OnDemandKYCResponse implements Parcelable {
    private boolean compliant;
    private boolean onDemandFeatureFlagEnabled;
    private PageComponentProfile profile;
    private JsonObject viewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OnDemandKYCResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OnDemandKYCResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnDemandKYCResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OnDemandKYCResponse(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : PageComponentProfile.CREATOR.createFromParcel(parcel), (JsonObject) parcel.readValue(OnDemandKYCResponse.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnDemandKYCResponse[] newArray(int i) {
            return new OnDemandKYCResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OnDemandKYCResponse() {
        this(false, false, (PageComponentProfile) null, (JsonObject) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OnDemandKYCResponse copy$default(OnDemandKYCResponse onDemandKYCResponse, boolean z, boolean z2, PageComponentProfile pageComponentProfile, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            z = onDemandKYCResponse.compliant;
        }
        if ((i & 2) != 0) {
            z2 = onDemandKYCResponse.onDemandFeatureFlagEnabled;
        }
        if ((i & 4) != 0) {
            pageComponentProfile = onDemandKYCResponse.profile;
        }
        if ((i & 8) != 0) {
            jsonObject = onDemandKYCResponse.viewModel;
        }
        return onDemandKYCResponse.copy(z, z2, pageComponentProfile, jsonObject);
    }

    @SerialName("rolledOut")
    public static /* synthetic */ void getOnDemandFeatureFlagEnabled$annotations() {
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
    public final JsonObject component4() {
        return this.viewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnDemandKYCResponse copy(boolean z, boolean z2, PageComponentProfile pageComponentProfile, JsonObject jsonObject) {
        return new OnDemandKYCResponse(z, z2, pageComponentProfile, jsonObject);
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
        if (!(obj instanceof OnDemandKYCResponse)) {
            return false;
        }
        OnDemandKYCResponse onDemandKYCResponse = (OnDemandKYCResponse) obj;
        return this.compliant == onDemandKYCResponse.compliant && this.onDemandFeatureFlagEnabled == onDemandKYCResponse.onDemandFeatureFlagEnabled && Intrinsics.EZpvd(this.profile, onDemandKYCResponse.profile) && Intrinsics.EZpvd(this.viewModel, onDemandKYCResponse.viewModel);
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
    public final JsonObject getViewModel() {
        return this.viewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.compliant);
        int iHashCode2 = Boolean.hashCode(this.onDemandFeatureFlagEnabled);
        PageComponentProfile pageComponentProfile = this.profile;
        int iHashCode3 = pageComponentProfile == null ? 0 : pageComponentProfile.hashCode();
        JsonObject jsonObject = this.viewModel;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (jsonObject != null ? jsonObject.hashCode() : 0);
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
    public final void setViewModel(JsonObject jsonObject) {
        this.viewModel = jsonObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OnDemandKYCResponse(compliant=" + this.compliant + ", onDemandFeatureFlagEnabled=" + this.onDemandFeatureFlagEnabled + ", profile=" + this.profile + ", viewModel=" + this.viewModel + ")";
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
        parcel.writeValue(this.viewModel);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnDemandKYCResponse> serializer() {
            return OnDemandKYCResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OnDemandKYCResponse(int i, boolean z, boolean z2, PageComponentProfile pageComponentProfile, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.viewModel = jsonObject;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(OnDemandKYCResponse onDemandKYCResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || onDemandKYCResponse.compliant) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, onDemandKYCResponse.compliant);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !onDemandKYCResponse.onDemandFeatureFlagEnabled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, onDemandKYCResponse.onDemandFeatureFlagEnabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || onDemandKYCResponse.profile != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, PageComponentProfile$$serializer.INSTANCE, onDemandKYCResponse.profile);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && onDemandKYCResponse.viewModel == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, JsonObjectSerializer.INSTANCE, onDemandKYCResponse.viewModel);
    }

    public OnDemandKYCResponse(boolean z, boolean z2, PageComponentProfile pageComponentProfile, JsonObject jsonObject) {
        this.compliant = z;
        this.onDemandFeatureFlagEnabled = z2;
        this.profile = pageComponentProfile;
        this.viewModel = jsonObject;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile:?: TERNARY null = ((wrap:int:0x000a: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile) : (r4v0 com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile))
  (wrap:kotlinx.serialization.json.JsonObject:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonObject) : (r5v0 kotlinx.serialization.json.JsonObject))
 A[MD:(boolean, boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile, kotlinx.serialization.json.JsonObject):void (m)] (LINE:46) call: com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCResponse.<init>(boolean, boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile, kotlinx.serialization.json.JsonObject):void type: THIS */
    public /* synthetic */ OnDemandKYCResponse(boolean z, boolean z2, PageComponentProfile pageComponentProfile, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? null : pageComponentProfile, (i & 8) != 0 ? null : jsonObject);
    }
}
