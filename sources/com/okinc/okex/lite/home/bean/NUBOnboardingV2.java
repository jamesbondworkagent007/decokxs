package com.okinc.okex.lite.home.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class NUBOnboardingV2 {

    @SerializedName("bottomSheet")
    private final RewardBottomSheet bottomSheet;

    @SerializedName("button")
    private final OnboardingButton button;

    @SerializedName("completedSteps")
    private final int completedSteps;

    @SerializedName("description")
    private final OnboardingDescription description;

    @SerializedName(TtmlNode.TAG_LAYOUT)
    private final OnboardingCardLayoutType layout;

    @SerializedName("title")
    private final String title;

    @SerializedName("totalSteps")
    private final int totalSteps;

    @SerializedName("trackingProperties")
    private final TrackingProperties trackingProperties;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, OnboardingCardLayoutType.Companion.serializer(), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NUBOnboardingV2 OLrzqt(RewardBottomSheet rewardBottomSheet, @NotNull OnboardingButton onboardingButton, int i, OnboardingDescription onboardingDescription, @NotNull OnboardingCardLayoutType onboardingCardLayoutType, @NotNull String str, int i2, @NotNull TrackingProperties trackingProperties) {
        Intrinsics.checkNotNullParameter(onboardingButton, "");
        Intrinsics.checkNotNullParameter(onboardingCardLayoutType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trackingProperties, "");
        return new NUBOnboardingV2(rewardBottomSheet, onboardingButton, i, onboardingDescription, onboardingCardLayoutType, str, i2, trackingProperties);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NUBOnboardingV2)) {
            return false;
        }
        NUBOnboardingV2 nUBOnboardingV2 = (NUBOnboardingV2) obj;
        return Intrinsics.EZpvd(this.bottomSheet, nUBOnboardingV2.bottomSheet) && Intrinsics.EZpvd(this.button, nUBOnboardingV2.button) && this.completedSteps == nUBOnboardingV2.completedSteps && Intrinsics.EZpvd(this.description, nUBOnboardingV2.description) && this.layout == nUBOnboardingV2.layout && Intrinsics.EZpvd((Object) this.title, (Object) nUBOnboardingV2.title) && this.totalSteps == nUBOnboardingV2.totalSteps && Intrinsics.EZpvd(this.trackingProperties, nUBOnboardingV2.trackingProperties);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        RewardBottomSheet rewardBottomSheet = this.bottomSheet;
        int iHashCode = rewardBottomSheet == null ? 0 : rewardBottomSheet.hashCode();
        int iHashCode2 = this.button.hashCode();
        int iHashCode3 = Integer.hashCode(this.completedSteps);
        OnboardingDescription onboardingDescription = this.description;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (onboardingDescription != null ? onboardingDescription.hashCode() : 0)) * 31) + this.layout.hashCode()) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.totalSteps)) * 31) + this.trackingProperties.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NUBOnboardingV2(bottomSheet=" + this.bottomSheet + ", button=" + this.button + ", completedSteps=" + this.completedSteps + ", description=" + this.description + ", layout=" + this.layout + ", title=" + this.title + ", totalSteps=" + this.totalSteps + ", trackingProperties=" + this.trackingProperties + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NUBOnboardingV2.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NUBOnboardingV2> serializer() {
            return NUBOnboardingV2$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NUBOnboardingV2(int i, RewardBottomSheet rewardBottomSheet, OnboardingButton onboardingButton, int i2, OnboardingDescription onboardingDescription, OnboardingCardLayoutType onboardingCardLayoutType, String str, int i3, TrackingProperties trackingProperties, SerializationConstructorMarker serializationConstructorMarker) {
        if (238 != (i & 238)) {
            PluginExceptionsKt.throwMissingFieldException(i, 238, NUBOnboardingV2$$serializer.INSTANCE.getDescriptor());
        }
        this.bottomSheet = (i & 1) == 0 ? null : rewardBottomSheet;
        this.button = onboardingButton;
        this.completedSteps = i2;
        this.description = onboardingDescription;
        if ((i & 16) == 0) {
            this.layout = OnboardingCardLayoutType.NONE;
        } else {
            this.layout = onboardingCardLayoutType;
        }
        this.title = str;
        this.totalSteps = i3;
        this.trackingProperties = trackingProperties;
    }

    public static final /* synthetic */ void copydefault(NUBOnboardingV2 nUBOnboardingV2, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || nUBOnboardingV2.bottomSheet != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, RewardBottomSheet$$serializer.INSTANCE, nUBOnboardingV2.bottomSheet);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, OnboardingButton$$serializer.INSTANCE, nUBOnboardingV2.button);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, nUBOnboardingV2.completedSteps);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, OnboardingDescription$$serializer.INSTANCE, nUBOnboardingV2.description);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || nUBOnboardingV2.layout != OnboardingCardLayoutType.NONE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], nUBOnboardingV2.layout);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, nUBOnboardingV2.title);
        compositeEncoder.encodeIntElement(serialDescriptor, 6, nUBOnboardingV2.totalSteps);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, NUBOnboardingV2$TrackingProperties$$serializer.INSTANCE, nUBOnboardingV2.trackingProperties);
    }

    public NUBOnboardingV2(RewardBottomSheet rewardBottomSheet, @NotNull OnboardingButton onboardingButton, int i, OnboardingDescription onboardingDescription, @NotNull OnboardingCardLayoutType onboardingCardLayoutType, @NotNull String str, int i2, @NotNull TrackingProperties trackingProperties) {
        Intrinsics.checkNotNullParameter(onboardingButton, "");
        Intrinsics.checkNotNullParameter(onboardingCardLayoutType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trackingProperties, "");
        this.bottomSheet = rewardBottomSheet;
        this.button = onboardingButton;
        this.completedSteps = i;
        this.description = onboardingDescription;
        this.layout = onboardingCardLayoutType;
        this.title = str;
        this.totalSteps = i2;
        this.trackingProperties = trackingProperties;
    }

    @Serializable
    public static final class TrackingProperties implements Parcelable {
        public static final int $stable = 0;

        @SerializedName("account_state")
        private final String accountState;

        @SerializedName("button")
        private final String button;

        @SerializedName("reward_available")
        private final String rewardAvailable;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<TrackingProperties> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<TrackingProperties> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TrackingProperties createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new TrackingProperties(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TrackingProperties[] newArray(int i) {
                return new TrackingProperties[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TrackingProperties copy$default(TrackingProperties trackingProperties, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = trackingProperties.accountState;
            }
            if ((i & 2) != 0) {
                str2 = trackingProperties.rewardAvailable;
            }
            if ((i & 4) != 0) {
                str3 = trackingProperties.button;
            }
            return trackingProperties.OLrzqt(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TrackingProperties OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new TrackingProperties(str, str2, str3);
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
            if (!(obj instanceof TrackingProperties)) {
                return false;
            }
            TrackingProperties trackingProperties = (TrackingProperties) obj;
            return Intrinsics.EZpvd((Object) this.accountState, (Object) trackingProperties.accountState) && Intrinsics.EZpvd((Object) this.rewardAvailable, (Object) trackingProperties.rewardAvailable) && Intrinsics.EZpvd((Object) this.button, (Object) trackingProperties.button);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.accountState.hashCode() * 31) + this.rewardAvailable.hashCode()) * 31) + this.button.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TrackingProperties(accountState=" + this.accountState + ", rewardAvailable=" + this.rewardAvailable + ", button=" + this.button + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.accountState);
            parcel.writeString(this.rewardAvailable);
            parcel.writeString(this.button);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NUBOnboardingV2.TrackingProperties.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<TrackingProperties> serializer() {
                return NUBOnboardingV2$TrackingProperties$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ TrackingProperties(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, NUBOnboardingV2$TrackingProperties$$serializer.INSTANCE.getDescriptor());
            }
            this.accountState = str;
            this.rewardAvailable = str2;
            this.button = str3;
        }

        public static final /* synthetic */ void KWHzl(TrackingProperties trackingProperties, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, trackingProperties.accountState);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, trackingProperties.rewardAvailable);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, trackingProperties.button);
        }

        public TrackingProperties(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.accountState = str;
            this.rewardAvailable = str2;
            this.button = str3;
        }
    }
}
