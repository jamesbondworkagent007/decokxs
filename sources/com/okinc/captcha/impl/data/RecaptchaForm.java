package com.okinc.captcha.impl.data;

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
public final class RecaptchaForm {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String siteKey;
    public final String token;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecaptchaForm copy$default(RecaptchaForm recaptchaForm, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recaptchaForm.siteKey;
        }
        if ((i & 2) != 0) {
            str2 = recaptchaForm.token;
        }
        return recaptchaForm.KWHzl(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecaptchaForm KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new RecaptchaForm(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecaptchaForm)) {
            return false;
        }
        RecaptchaForm recaptchaForm = (RecaptchaForm) obj;
        return Intrinsics.EZpvd((Object) this.siteKey, (Object) recaptchaForm.siteKey) && Intrinsics.EZpvd((Object) this.token, (Object) recaptchaForm.token);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.siteKey.hashCode() * 31) + this.token.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecaptchaForm(siteKey=" + this.siteKey + ", token=" + this.token + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.captcha.impl.data.RecaptchaForm.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecaptchaForm> serializer() {
            return RecaptchaForm$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecaptchaForm(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, RecaptchaForm$$serializer.INSTANCE.getDescriptor());
        }
        this.siteKey = str;
        this.token = str2;
    }

    public static final /* synthetic */ void EZpvd(RecaptchaForm recaptchaForm, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, recaptchaForm.siteKey);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, recaptchaForm.token);
    }

    public RecaptchaForm(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.siteKey = str;
        this.token = str2;
    }
}
