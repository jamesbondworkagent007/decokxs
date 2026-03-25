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
public final class EditAlertActiveRequest {
    public static final int $stable = 0;
    public final int active;
    public final AlertType alertType;
    public final String deviceId;
    public final int ruleId;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {AlertType.Companion.serializer(), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EditAlertActiveRequest copy$default(EditAlertActiveRequest editAlertActiveRequest, AlertType alertType, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            alertType = editAlertActiveRequest.alertType;
        }
        if ((i3 & 2) != 0) {
            str = editAlertActiveRequest.deviceId;
        }
        if ((i3 & 4) != 0) {
            i = editAlertActiveRequest.ruleId;
        }
        if ((i3 & 8) != 0) {
            i2 = editAlertActiveRequest.active;
        }
        return editAlertActiveRequest.KWHzl(alertType, str, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertType AEQbTJ() {
        return this.alertType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditAlertActiveRequest KWHzl(@NotNull AlertType alertType, @NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(alertType, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new EditAlertActiveRequest(alertType, str, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.deviceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.active;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditAlertActiveRequest)) {
            return false;
        }
        EditAlertActiveRequest editAlertActiveRequest = (EditAlertActiveRequest) obj;
        return this.alertType == editAlertActiveRequest.alertType && Intrinsics.EZpvd((Object) this.deviceId, (Object) editAlertActiveRequest.deviceId) && this.ruleId == editAlertActiveRequest.ruleId && this.active == editAlertActiveRequest.active;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.alertType.hashCode() * 31) + this.deviceId.hashCode()) * 31) + Integer.hashCode(this.ruleId)) * 31) + Integer.hashCode(this.active);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EditAlertActiveRequest(alertType=" + this.alertType + ", deviceId=" + this.deviceId + ", ruleId=" + this.ruleId + ", active=" + this.active + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.alert.EditAlertActiveRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EditAlertActiveRequest> serializer() {
            return EditAlertActiveRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EditAlertActiveRequest(int i, AlertType alertType, String str, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, EditAlertActiveRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.alertType = alertType;
        this.deviceId = str;
        this.ruleId = i2;
        this.active = i3;
    }

    public static final /* synthetic */ void EZpvd(EditAlertActiveRequest editAlertActiveRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], editAlertActiveRequest.alertType);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, editAlertActiveRequest.deviceId);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, editAlertActiveRequest.ruleId);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, editAlertActiveRequest.active);
    }

    public EditAlertActiveRequest(@NotNull AlertType alertType, @NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(alertType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.alertType = alertType;
        this.deviceId = str;
        this.ruleId = i;
        this.active = i2;
    }
}
