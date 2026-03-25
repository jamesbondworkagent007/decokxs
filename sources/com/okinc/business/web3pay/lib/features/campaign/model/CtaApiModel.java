package com.okinc.business.web3pay.lib.features.campaign.model;

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
public final class CtaApiModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String deepLink;
    private final String text;
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CtaApiModel copy$default(CtaApiModel ctaApiModel, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ctaApiModel.text;
        }
        if ((i2 & 2) != 0) {
            str2 = ctaApiModel.deepLink;
        }
        if ((i2 & 4) != 0) {
            i = ctaApiModel.type;
        }
        return ctaApiModel.copy(str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.deepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaApiModel copy(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CtaApiModel(str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CtaApiModel)) {
            return false;
        }
        CtaApiModel ctaApiModel = (CtaApiModel) obj;
        return Intrinsics.EZpvd((Object) this.text, (Object) ctaApiModel.text) && Intrinsics.EZpvd((Object) this.deepLink, (Object) ctaApiModel.deepLink) && this.type == ctaApiModel.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeepLink() {
        return this.deepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.deepLink.hashCode()) * 31) + Integer.hashCode(this.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CtaApiModel(text=" + this.text + ", deepLink=" + this.deepLink + ", type=" + this.type + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.campaign.model.CtaApiModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CtaApiModel> serializer() {
            return CtaApiModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CtaApiModel(int i, String str, String str2, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, CtaApiModel$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        this.deepLink = str2;
        this.type = i2;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(CtaApiModel ctaApiModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, ctaApiModel.text);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, ctaApiModel.deepLink);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, ctaApiModel.type);
    }

    public CtaApiModel(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.text = str;
        this.deepLink = str2;
        this.type = i;
    }
}
