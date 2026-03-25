package com.okinc.account.api.model.device;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class DeviceMessage {
    private final JsonObject data;
    private final String event;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DeviceMessage copy$default(DeviceMessage deviceMessage, String str, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceMessage.event;
        }
        if ((i & 2) != 0) {
            jsonObject = deviceMessage.data;
        }
        return deviceMessage.copy(str, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.event;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component2() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeviceMessage copy(@NotNull String str, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        return new DeviceMessage(str, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceMessage)) {
            return false;
        }
        DeviceMessage deviceMessage = (DeviceMessage) obj;
        return Intrinsics.EZpvd((Object) this.event, (Object) deviceMessage.event) && Intrinsics.EZpvd(this.data, deviceMessage.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEvent() {
        return this.event;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.event.hashCode() * 31) + this.data.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeviceMessage(event=" + this.event + ", data=" + this.data + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.device.DeviceMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeviceMessage> serializer() {
            return DeviceMessage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeviceMessage(int i, String str, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, DeviceMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.event = str;
        this.data = jsonObject;
    }

    public static final /* synthetic */ void write$Self$OKAccount_account_api(DeviceMessage deviceMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, deviceMessage.event);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, JsonObjectSerializer.INSTANCE, deviceMessage.data);
    }

    public DeviceMessage(@NotNull String str, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        this.event = str;
        this.data = jsonObject;
    }
}
