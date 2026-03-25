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
public final class OnboardingButton {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @SerializedName("href")
    private final String href;

    @SerializedName("text")
    private final String text;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OnboardingButton copy$default(OnboardingButton onboardingButton, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingButton.text;
        }
        if ((i & 2) != 0) {
            str2 = onboardingButton.href;
        }
        return onboardingButton.KWHzl(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnboardingButton KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new OnboardingButton(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingButton)) {
            return false;
        }
        OnboardingButton onboardingButton = (OnboardingButton) obj;
        return Intrinsics.EZpvd((Object) this.text, (Object) onboardingButton.text) && Intrinsics.EZpvd((Object) this.href, (Object) onboardingButton.href);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.text.hashCode() * 31) + this.href.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OnboardingButton(text=" + this.text + ", href=" + this.href + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.OnboardingButton.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnboardingButton> serializer() {
            return OnboardingButton$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OnboardingButton(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, OnboardingButton$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        this.href = str2;
    }

    public static final /* synthetic */ void AEQbTJ(OnboardingButton onboardingButton, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, onboardingButton.text);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, onboardingButton.href);
    }

    public OnboardingButton(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.text = str;
        this.href = str2;
    }
}
