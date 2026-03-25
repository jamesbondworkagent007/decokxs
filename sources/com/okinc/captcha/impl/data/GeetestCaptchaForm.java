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
public final class GeetestCaptchaForm {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String captchaOutput;
    public final String genTime;
    public final String lotNumber;
    public final String passToken;
    public final String scene;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GeetestCaptchaForm copy$default(GeetestCaptchaForm geetestCaptchaForm, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = geetestCaptchaForm.lotNumber;
        }
        if ((i & 2) != 0) {
            str2 = geetestCaptchaForm.captchaOutput;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = geetestCaptchaForm.passToken;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = geetestCaptchaForm.genTime;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = geetestCaptchaForm.scene;
        }
        return geetestCaptchaForm.EZpvd(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GeetestCaptchaForm EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new GeetestCaptchaForm(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeetestCaptchaForm)) {
            return false;
        }
        GeetestCaptchaForm geetestCaptchaForm = (GeetestCaptchaForm) obj;
        return Intrinsics.EZpvd((Object) this.lotNumber, (Object) geetestCaptchaForm.lotNumber) && Intrinsics.EZpvd((Object) this.captchaOutput, (Object) geetestCaptchaForm.captchaOutput) && Intrinsics.EZpvd((Object) this.passToken, (Object) geetestCaptchaForm.passToken) && Intrinsics.EZpvd((Object) this.genTime, (Object) geetestCaptchaForm.genTime) && Intrinsics.EZpvd((Object) this.scene, (Object) geetestCaptchaForm.scene);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.lotNumber.hashCode() * 31) + this.captchaOutput.hashCode()) * 31) + this.passToken.hashCode()) * 31) + this.genTime.hashCode()) * 31) + this.scene.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GeetestCaptchaForm(lotNumber=" + this.lotNumber + ", captchaOutput=" + this.captchaOutput + ", passToken=" + this.passToken + ", genTime=" + this.genTime + ", scene=" + this.scene + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.captcha.impl.data.GeetestCaptchaForm.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GeetestCaptchaForm> serializer() {
            return GeetestCaptchaForm$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GeetestCaptchaForm(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, GeetestCaptchaForm$$serializer.INSTANCE.getDescriptor());
        }
        this.lotNumber = str;
        this.captchaOutput = str2;
        this.passToken = str3;
        this.genTime = str4;
        this.scene = str5;
    }

    public static final /* synthetic */ void EZpvd(GeetestCaptchaForm geetestCaptchaForm, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, geetestCaptchaForm.lotNumber);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, geetestCaptchaForm.captchaOutput);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, geetestCaptchaForm.passToken);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, geetestCaptchaForm.genTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, geetestCaptchaForm.scene);
    }

    public GeetestCaptchaForm(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.lotNumber = str;
        this.captchaOutput = str2;
        this.passToken = str3;
        this.genTime = str4;
        this.scene = str5;
    }
}
