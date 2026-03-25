package com.okinc.okex.lite.home.bean;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OnboardingDescription {

    @SerializedName("templateParams")
    private final List<TemplateParam> templateParams;

    @SerializedName("text")
    private final String text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(TemplateParam$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.lite.home.bean.OnboardingDescription */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnboardingDescription copy$default(OnboardingDescription onboardingDescription, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingDescription.text;
        }
        if ((i & 2) != 0) {
            list = onboardingDescription.templateParams;
        }
        return onboardingDescription.AEQbTJ(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnboardingDescription AEQbTJ(@NotNull String str, @NotNull List<TemplateParam> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new OnboardingDescription(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingDescription)) {
            return false;
        }
        OnboardingDescription onboardingDescription = (OnboardingDescription) obj;
        return Intrinsics.EZpvd((Object) this.text, (Object) onboardingDescription.text) && Intrinsics.EZpvd(this.templateParams, onboardingDescription.templateParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.text.hashCode() * 31) + this.templateParams.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OnboardingDescription(text=" + this.text + ", templateParams=" + this.templateParams + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.OnboardingDescription.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnboardingDescription> serializer() {
            return OnboardingDescription$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OnboardingDescription(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, OnboardingDescription$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        this.templateParams = list;
    }

    public static final /* synthetic */ void OLrzqt(OnboardingDescription onboardingDescription, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, onboardingDescription.text);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], onboardingDescription.templateParams);
    }

    public OnboardingDescription(@NotNull String str, @NotNull List<TemplateParam> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.text = str;
        this.templateParams = list;
    }
}
