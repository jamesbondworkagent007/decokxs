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
public final class TencentCaptchaForm {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final long captchaAppId;
    public final String randomString;
    public final String ticket;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TencentCaptchaForm copy$default(TencentCaptchaForm tencentCaptchaForm, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tencentCaptchaForm.ticket;
        }
        if ((i & 2) != 0) {
            str2 = tencentCaptchaForm.randomString;
        }
        if ((i & 4) != 0) {
            j = tencentCaptchaForm.captchaAppId;
        }
        return tencentCaptchaForm.AEQbTJ(str, str2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TencentCaptchaForm AEQbTJ(@NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TencentCaptchaForm(str, str2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TencentCaptchaForm)) {
            return false;
        }
        TencentCaptchaForm tencentCaptchaForm = (TencentCaptchaForm) obj;
        return Intrinsics.EZpvd((Object) this.ticket, (Object) tencentCaptchaForm.ticket) && Intrinsics.EZpvd((Object) this.randomString, (Object) tencentCaptchaForm.randomString) && this.captchaAppId == tencentCaptchaForm.captchaAppId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.ticket.hashCode() * 31) + this.randomString.hashCode()) * 31) + Long.hashCode(this.captchaAppId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TencentCaptchaForm(ticket=" + this.ticket + ", randomString=" + this.randomString + ", captchaAppId=" + this.captchaAppId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.captcha.impl.data.TencentCaptchaForm.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TencentCaptchaForm> serializer() {
            return TencentCaptchaForm$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TencentCaptchaForm(int i, String str, String str2, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, TencentCaptchaForm$$serializer.INSTANCE.getDescriptor());
        }
        this.ticket = str;
        this.randomString = str2;
        this.captchaAppId = j;
    }

    public static final /* synthetic */ void EZpvd(TencentCaptchaForm tencentCaptchaForm, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tencentCaptchaForm.ticket);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tencentCaptchaForm.randomString);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, tencentCaptchaForm.captchaAppId);
    }

    public TencentCaptchaForm(@NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.ticket = str;
        this.randomString = str2;
        this.captchaAppId = j;
    }
}
