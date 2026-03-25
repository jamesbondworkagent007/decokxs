package com.okinc.business.market.data.model.alert;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class EditAlertRequest {
    public static final int $stable = 0;
    public final AlertType alertType;
    public final String deviceId;
    public final AlertPromptType promptType;
    public final AlertRepeatType repeatType;
    public final int ruleId;
    public final String threshold;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {AlertType.Companion.serializer(), null, AlertPromptType.Companion.serializer(), null, AlertRepeatType.Companion.serializer(), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EditAlertRequest copy$default(EditAlertRequest editAlertRequest, AlertType alertType, int i, AlertPromptType alertPromptType, String str, AlertRepeatType alertRepeatType, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            alertType = editAlertRequest.alertType;
        }
        if ((i2 & 2) != 0) {
            i = editAlertRequest.ruleId;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            alertPromptType = editAlertRequest.promptType;
        }
        AlertPromptType alertPromptType2 = alertPromptType;
        if ((i2 & 8) != 0) {
            str = editAlertRequest.threshold;
        }
        String str3 = str;
        if ((i2 & 16) != 0) {
            alertRepeatType = editAlertRequest.repeatType;
        }
        AlertRepeatType alertRepeatType2 = alertRepeatType;
        if ((i2 & 32) != 0) {
            str2 = editAlertRequest.deviceId;
        }
        return editAlertRequest.OLrzqt(alertType, i3, alertPromptType2, str3, alertRepeatType2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertPromptType AEQbTJ() {
        return this.promptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.deviceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertType OLrzqt() {
        return this.alertType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditAlertRequest OLrzqt(@NotNull AlertType alertType, int i, @NotNull AlertPromptType alertPromptType, @NotNull String str, @NotNull AlertRepeatType alertRepeatType, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(alertType, "");
        Intrinsics.checkNotNullParameter(alertPromptType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(alertRepeatType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new EditAlertRequest(alertType, i, alertPromptType, str, alertRepeatType, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertRepeatType copydefault() {
        return this.repeatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditAlertRequest)) {
            return false;
        }
        EditAlertRequest editAlertRequest = (EditAlertRequest) obj;
        return this.alertType == editAlertRequest.alertType && this.ruleId == editAlertRequest.ruleId && this.promptType == editAlertRequest.promptType && Intrinsics.EZpvd((Object) this.threshold, (Object) editAlertRequest.threshold) && this.repeatType == editAlertRequest.repeatType && Intrinsics.EZpvd((Object) this.deviceId, (Object) editAlertRequest.deviceId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.threshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.alertType.hashCode() * 31) + Integer.hashCode(this.ruleId)) * 31) + this.promptType.hashCode()) * 31) + this.threshold.hashCode()) * 31) + this.repeatType.hashCode()) * 31) + this.deviceId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EditAlertRequest(alertType=" + this.alertType + ", ruleId=" + this.ruleId + ", promptType=" + this.promptType + ", threshold=" + this.threshold + ", repeatType=" + this.repeatType + ", deviceId=" + this.deviceId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.alert.EditAlertRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EditAlertRequest> serializer() {
            return EditAlertRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EditAlertRequest(int i, AlertType alertType, int i2, AlertPromptType alertPromptType, String str, AlertRepeatType alertRepeatType, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, EditAlertRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.alertType = alertType;
        this.ruleId = i2;
        this.promptType = alertPromptType;
        this.threshold = str;
        this.repeatType = alertRepeatType;
        this.deviceId = str2;
    }

    public static final /* synthetic */ void KWHzl(EditAlertRequest editAlertRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], editAlertRequest.alertType);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, editAlertRequest.ruleId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], editAlertRequest.promptType);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, editAlertRequest.threshold);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], editAlertRequest.repeatType);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, editAlertRequest.deviceId);
    }

    public EditAlertRequest(@NotNull AlertType alertType, int i, @NotNull AlertPromptType alertPromptType, @NotNull String str, @NotNull AlertRepeatType alertRepeatType, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(alertType, "");
        Intrinsics.checkNotNullParameter(alertPromptType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(alertRepeatType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.alertType = alertType;
        this.ruleId = i;
        this.promptType = alertPromptType;
        this.threshold = str;
        this.repeatType = alertRepeatType;
        this.deviceId = str2;
    }
}
