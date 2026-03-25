package com.okinc.okex.lite.home.bean;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class NUBOnboardingResponse {

    @SerializedName("bottomSheet")
    private final RewardBottomSheet bottomSheet;

    @SerializedName("completedSteps")
    private final int completedSteps;

    @SerializedName("description")
    private final OnboardingDescription description;

    @SerializedName(TtmlNode.TAG_LAYOUT)
    private final OnboardingCardLayoutType layout;

    @SerializedName("needPoll")
    private final Boolean needPoll;

    @SerializedName("onboardingCard")
    private final OnboardingCard onboardingCard;

    @SerializedName("pollInterval")
    private final Integer pollInterval;

    @SerializedName("title")
    private final String title;

    @SerializedName("totalSteps")
    private final int totalSteps;

    @SerializedName("trackingProperties")
    private final OnboardingTrackingProperties trackingProperties;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, OnboardingCardLayoutType.Companion.serializer(), null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NUBOnboardingResponse AEQbTJ(@NotNull String str, @NotNull OnboardingDescription onboardingDescription, @NotNull OnboardingCardLayoutType onboardingCardLayoutType, int i, int i2, OnboardingCard onboardingCard, RewardBottomSheet rewardBottomSheet, @NotNull OnboardingTrackingProperties onboardingTrackingProperties, Boolean bool, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onboardingDescription, "");
        Intrinsics.checkNotNullParameter(onboardingCardLayoutType, "");
        Intrinsics.checkNotNullParameter(onboardingTrackingProperties, "");
        return new NUBOnboardingResponse(str, onboardingDescription, onboardingCardLayoutType, i, i2, onboardingCard, rewardBottomSheet, onboardingTrackingProperties, bool, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NUBOnboardingResponse)) {
            return false;
        }
        NUBOnboardingResponse nUBOnboardingResponse = (NUBOnboardingResponse) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) nUBOnboardingResponse.title) && Intrinsics.EZpvd(this.description, nUBOnboardingResponse.description) && this.layout == nUBOnboardingResponse.layout && this.completedSteps == nUBOnboardingResponse.completedSteps && this.totalSteps == nUBOnboardingResponse.totalSteps && Intrinsics.EZpvd(this.onboardingCard, nUBOnboardingResponse.onboardingCard) && Intrinsics.EZpvd(this.bottomSheet, nUBOnboardingResponse.bottomSheet) && Intrinsics.EZpvd(this.trackingProperties, nUBOnboardingResponse.trackingProperties) && Intrinsics.EZpvd(this.needPoll, nUBOnboardingResponse.needPoll) && Intrinsics.EZpvd(this.pollInterval, nUBOnboardingResponse.pollInterval);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.title.hashCode();
        int iHashCode2 = this.description.hashCode();
        int iHashCode3 = this.layout.hashCode();
        int iHashCode4 = Integer.hashCode(this.completedSteps);
        int iHashCode5 = Integer.hashCode(this.totalSteps);
        OnboardingCard onboardingCard = this.onboardingCard;
        int iHashCode6 = onboardingCard == null ? 0 : onboardingCard.hashCode();
        RewardBottomSheet rewardBottomSheet = this.bottomSheet;
        int iHashCode7 = rewardBottomSheet == null ? 0 : rewardBottomSheet.hashCode();
        int iHashCode8 = this.trackingProperties.hashCode();
        Boolean bool = this.needPoll;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        Integer num = this.pollInterval;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NUBOnboardingResponse(title=" + this.title + ", description=" + this.description + ", layout=" + this.layout + ", completedSteps=" + this.completedSteps + ", totalSteps=" + this.totalSteps + ", onboardingCard=" + this.onboardingCard + ", bottomSheet=" + this.bottomSheet + ", trackingProperties=" + this.trackingProperties + ", needPoll=" + this.needPoll + ", pollInterval=" + this.pollInterval + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NUBOnboardingResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NUBOnboardingResponse> serializer() {
            return NUBOnboardingResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NUBOnboardingResponse(int i, String str, OnboardingDescription onboardingDescription, OnboardingCardLayoutType onboardingCardLayoutType, int i2, int i3, OnboardingCard onboardingCard, RewardBottomSheet rewardBottomSheet, OnboardingTrackingProperties onboardingTrackingProperties, Boolean bool, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (155 != (i & CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA)) {
            PluginExceptionsKt.throwMissingFieldException(i, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA, NUBOnboardingResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.description = onboardingDescription;
        if ((i & 4) == 0) {
            this.layout = OnboardingCardLayoutType.NONE;
        } else {
            this.layout = onboardingCardLayoutType;
        }
        this.completedSteps = i2;
        this.totalSteps = i3;
        if ((i & 32) == 0) {
            this.onboardingCard = null;
        } else {
            this.onboardingCard = onboardingCard;
        }
        if ((i & 64) == 0) {
            this.bottomSheet = null;
        } else {
            this.bottomSheet = rewardBottomSheet;
        }
        this.trackingProperties = onboardingTrackingProperties;
        if ((i & 256) == 0) {
            this.needPoll = Boolean.FALSE;
        } else {
            this.needPoll = bool;
        }
        if ((i & 512) == 0) {
            this.pollInterval = null;
        } else {
            this.pollInterval = num;
        }
    }

    public static final /* synthetic */ void AEQbTJ(NUBOnboardingResponse nUBOnboardingResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, nUBOnboardingResponse.title);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, OnboardingDescription$$serializer.INSTANCE, nUBOnboardingResponse.description);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || nUBOnboardingResponse.layout != OnboardingCardLayoutType.NONE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], nUBOnboardingResponse.layout);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, nUBOnboardingResponse.completedSteps);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, nUBOnboardingResponse.totalSteps);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || nUBOnboardingResponse.onboardingCard != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, OnboardingCard$$serializer.INSTANCE, nUBOnboardingResponse.onboardingCard);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || nUBOnboardingResponse.bottomSheet != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, RewardBottomSheet$$serializer.INSTANCE, nUBOnboardingResponse.bottomSheet);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, OnboardingTrackingProperties$$serializer.INSTANCE, nUBOnboardingResponse.trackingProperties);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(nUBOnboardingResponse.needPoll, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, nUBOnboardingResponse.needPoll);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && nUBOnboardingResponse.pollInterval == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, nUBOnboardingResponse.pollInterval);
    }

    public NUBOnboardingResponse(@NotNull String str, @NotNull OnboardingDescription onboardingDescription, @NotNull OnboardingCardLayoutType onboardingCardLayoutType, int i, int i2, OnboardingCard onboardingCard, RewardBottomSheet rewardBottomSheet, @NotNull OnboardingTrackingProperties onboardingTrackingProperties, Boolean bool, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onboardingDescription, "");
        Intrinsics.checkNotNullParameter(onboardingCardLayoutType, "");
        Intrinsics.checkNotNullParameter(onboardingTrackingProperties, "");
        this.title = str;
        this.description = onboardingDescription;
        this.layout = onboardingCardLayoutType;
        this.completedSteps = i;
        this.totalSteps = i2;
        this.onboardingCard = onboardingCard;
        this.bottomSheet = rewardBottomSheet;
        this.trackingProperties = onboardingTrackingProperties;
        this.needPoll = bool;
        this.pollInterval = num;
    }
}
