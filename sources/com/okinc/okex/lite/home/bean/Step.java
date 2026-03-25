package com.okinc.okex.lite.home.bean;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class Step {
    public static final int $stable = 0;

    @SerializedName("badgeLabel")
    private final String badgeLabel;

    @SerializedName("description")
    private final String description;

    @SerializedName("rewardText")
    private final String rewardText;

    @SerializedName("secondaryIcon")
    private final String secondaryIcon;

    @SerializedName("stepType")
    private final StepStyle stepType;

    @SerializedName(TtmlNode.TAG_STYLE)
    private final Style style;

    @SerializedName("title")
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {StepStyle.Companion.serializer(), null, null, null, null, null, Style.Companion.serializer()};

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.Step.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Step> serializer() {
            return Step$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Step(int i, StepStyle stepStyle, String str, String str2, String str3, String str4, String str5, Style style, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, Step$$serializer.INSTANCE.getDescriptor());
        }
        this.stepType = (i & 1) == 0 ? StepStyle.UPCOMING : stepStyle;
        this.title = str;
        if ((i & 4) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        if ((i & 8) == 0) {
            this.rewardText = null;
        } else {
            this.rewardText = str3;
        }
        if ((i & 16) == 0) {
            this.badgeLabel = null;
        } else {
            this.badgeLabel = str4;
        }
        if ((i & 32) == 0) {
            this.secondaryIcon = null;
        } else {
            this.secondaryIcon = str5;
        }
        if ((i & 64) == 0) {
            this.style = Style.NEUTRAL;
        } else {
            this.style = style;
        }
    }

    public static final /* synthetic */ void KWHzl(Step step, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || step.stepType != StepStyle.UPCOMING) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], step.stepType);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, step.title);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || step.description != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, step.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || step.rewardText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, step.rewardText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || step.badgeLabel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, step.badgeLabel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || step.secondaryIcon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, step.secondaryIcon);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && step.style == Style.NEUTRAL) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], step.style);
    }
}
