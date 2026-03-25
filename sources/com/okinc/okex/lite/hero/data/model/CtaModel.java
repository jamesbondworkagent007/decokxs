package com.okinc.okex.lite.hero.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class CtaModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String link;
    public final String text;
    public final String trackingKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CtaModel copy$default(CtaModel ctaModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ctaModel.trackingKey;
        }
        if ((i & 2) != 0) {
            str2 = ctaModel.text;
        }
        if ((i & 4) != 0) {
            str3 = ctaModel.link;
        }
        return ctaModel.copydefault(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.trackingKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaModel copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CtaModel(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CtaModel)) {
            return false;
        }
        CtaModel ctaModel = (CtaModel) obj;
        return Intrinsics.EZpvd((Object) this.trackingKey, (Object) ctaModel.trackingKey) && Intrinsics.EZpvd((Object) this.text, (Object) ctaModel.text) && Intrinsics.EZpvd((Object) this.link, (Object) ctaModel.link);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.trackingKey.hashCode() * 31) + this.text.hashCode()) * 31) + this.link.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CtaModel(trackingKey=" + this.trackingKey + ", text=" + this.text + ", link=" + this.link + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.hero.data.model.CtaModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CtaModel> serializer() {
            return CtaModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CtaModel(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, CtaModel$$serializer.INSTANCE.getDescriptor());
        }
        this.trackingKey = str;
        this.text = str2;
        this.link = str3;
    }

    public static final /* synthetic */ void copydefault(CtaModel ctaModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, ctaModel.trackingKey);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, ctaModel.text);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, ctaModel.link);
    }

    public CtaModel(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.trackingKey = str;
        this.text = str2;
        this.link = str3;
    }
}
