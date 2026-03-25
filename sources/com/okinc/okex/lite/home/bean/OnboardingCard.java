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
public final class OnboardingCard {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @SerializedName("button")
    private final OnboardingButton button;

    @SerializedName("text")
    private final String content;

    @SerializedName("darkIcon")
    private final String darkIcon;

    @SerializedName("lightIcon")
    private final String lightIcon;

    @SerializedName("title")
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OnboardingCard copy$default(OnboardingCard onboardingCard, String str, String str2, String str3, String str4, OnboardingButton onboardingButton, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingCard.title;
        }
        if ((i & 2) != 0) {
            str2 = onboardingCard.content;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = onboardingCard.lightIcon;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = onboardingCard.darkIcon;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            onboardingButton = onboardingCard.button;
        }
        return onboardingCard.AEQbTJ(str, str5, str6, str7, onboardingButton);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnboardingCard AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, OnboardingButton onboardingButton) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new OnboardingCard(str, str2, str3, str4, onboardingButton);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingCard)) {
            return false;
        }
        OnboardingCard onboardingCard = (OnboardingCard) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) onboardingCard.title) && Intrinsics.EZpvd((Object) this.content, (Object) onboardingCard.content) && Intrinsics.EZpvd((Object) this.lightIcon, (Object) onboardingCard.lightIcon) && Intrinsics.EZpvd((Object) this.darkIcon, (Object) onboardingCard.darkIcon) && Intrinsics.EZpvd(this.button, onboardingCard.button);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.title.hashCode();
        int iHashCode2 = this.content.hashCode();
        int iHashCode3 = this.lightIcon.hashCode();
        int iHashCode4 = this.darkIcon.hashCode();
        OnboardingButton onboardingButton = this.button;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (onboardingButton == null ? 0 : onboardingButton.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OnboardingCard(title=" + this.title + ", content=" + this.content + ", lightIcon=" + this.lightIcon + ", darkIcon=" + this.darkIcon + ", button=" + this.button + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.OnboardingCard.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnboardingCard> serializer() {
            return OnboardingCard$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OnboardingCard(int i, String str, String str2, String str3, String str4, OnboardingButton onboardingButton, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, OnboardingCard$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.content = str2;
        this.lightIcon = str3;
        this.darkIcon = str4;
        if ((i & 16) == 0) {
            this.button = null;
        } else {
            this.button = onboardingButton;
        }
    }

    public static final /* synthetic */ void AEQbTJ(OnboardingCard onboardingCard, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, onboardingCard.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, onboardingCard.content);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, onboardingCard.lightIcon);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, onboardingCard.darkIcon);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && onboardingCard.button == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, OnboardingButton$$serializer.INSTANCE, onboardingCard.button);
    }

    public OnboardingCard(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, OnboardingButton onboardingButton) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.title = str;
        this.content = str2;
        this.lightIcon = str3;
        this.darkIcon = str4;
        this.button = onboardingButton;
    }
}
