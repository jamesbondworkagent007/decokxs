package com.okinc.okex.lite.home.bean;

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
public final class OnboardingTrackingProperties {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @SerializedName("account_state")
    private final String accountState;

    @SerializedName("button")
    private final String button;

    @SerializedName("reward_available")
    private final String rewardAvailable;

    @SerializedName("reward_type")
    private final String rewardType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OnboardingTrackingProperties copy$default(OnboardingTrackingProperties onboardingTrackingProperties, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingTrackingProperties.accountState;
        }
        if ((i & 2) != 0) {
            str2 = onboardingTrackingProperties.rewardAvailable;
        }
        if ((i & 4) != 0) {
            str3 = onboardingTrackingProperties.rewardType;
        }
        if ((i & 8) != 0) {
            str4 = onboardingTrackingProperties.button;
        }
        return onboardingTrackingProperties.EZpvd(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnboardingTrackingProperties EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new OnboardingTrackingProperties(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingTrackingProperties)) {
            return false;
        }
        OnboardingTrackingProperties onboardingTrackingProperties = (OnboardingTrackingProperties) obj;
        return Intrinsics.EZpvd((Object) this.accountState, (Object) onboardingTrackingProperties.accountState) && Intrinsics.EZpvd((Object) this.rewardAvailable, (Object) onboardingTrackingProperties.rewardAvailable) && Intrinsics.EZpvd((Object) this.rewardType, (Object) onboardingTrackingProperties.rewardType) && Intrinsics.EZpvd((Object) this.button, (Object) onboardingTrackingProperties.button);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.accountState.hashCode() * 31) + this.rewardAvailable.hashCode()) * 31) + this.rewardType.hashCode()) * 31) + this.button.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OnboardingTrackingProperties(accountState=" + this.accountState + ", rewardAvailable=" + this.rewardAvailable + ", rewardType=" + this.rewardType + ", button=" + this.button + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.OnboardingTrackingProperties.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnboardingTrackingProperties> serializer() {
            return OnboardingTrackingProperties$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OnboardingTrackingProperties(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, OnboardingTrackingProperties$$serializer.INSTANCE.getDescriptor());
        }
        this.accountState = str;
        this.rewardAvailable = str2;
        this.rewardType = str3;
        this.button = str4;
    }

    public static final /* synthetic */ void OLrzqt(OnboardingTrackingProperties onboardingTrackingProperties, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, onboardingTrackingProperties.accountState);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, onboardingTrackingProperties.rewardAvailable);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, onboardingTrackingProperties.rewardType);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, onboardingTrackingProperties.button);
    }

    public OnboardingTrackingProperties(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.accountState = str;
        this.rewardAvailable = str2;
        this.rewardType = str3;
        this.button = str4;
    }
}
