package com.okinc.okimcore.model.im.inhouseim.ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMResponse {
    public final int code;
    public final JsonObject data;
    public final String msg;
    public final String requestId;
    public final InHouseIMCommand websocketCommand;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, InHouseIMCommand.Companion.serializer(), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InHouseIMResponse copy$default(InHouseIMResponse inHouseIMResponse, int i, String str, InHouseIMCommand inHouseIMCommand, String str2, JsonObject jsonObject, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = inHouseIMResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = inHouseIMResponse.msg;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            inHouseIMCommand = inHouseIMResponse.websocketCommand;
        }
        InHouseIMCommand inHouseIMCommand2 = inHouseIMCommand;
        if ((i2 & 8) != 0) {
            str2 = inHouseIMResponse.requestId;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            jsonObject = inHouseIMResponse.data;
        }
        return inHouseIMResponse.copydefault(i, str3, inHouseIMCommand2, str4, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMCommand AYXKKw() {
        return this.websocketCommand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject OLrzqt() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMResponse copydefault(int i, String str, @NotNull InHouseIMCommand inHouseIMCommand, String str2, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(inHouseIMCommand, "");
        return new InHouseIMResponse(i, str, inHouseIMCommand, str2, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMResponse)) {
            return false;
        }
        InHouseIMResponse inHouseIMResponse = (InHouseIMResponse) obj;
        return this.code == inHouseIMResponse.code && Intrinsics.EZpvd((Object) this.msg, (Object) inHouseIMResponse.msg) && this.websocketCommand == inHouseIMResponse.websocketCommand && Intrinsics.EZpvd((Object) this.requestId, (Object) inHouseIMResponse.requestId) && Intrinsics.EZpvd(this.data, inHouseIMResponse.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code);
        String str = this.msg;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.websocketCommand.hashCode();
        String str2 = this.requestId;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        JsonObject jsonObject = this.data;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMResponse(code=" + this.code + ", msg=" + this.msg + ", websocketCommand=" + this.websocketCommand + ", requestId=" + this.requestId + ", data=" + this.data + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMResponse> serializer() {
            return InHouseIMResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMResponse(int i, int i2, String str, InHouseIMCommand inHouseIMCommand, String str2, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, InHouseIMResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.code = i2;
        this.msg = str;
        this.websocketCommand = inHouseIMCommand;
        this.requestId = str2;
        this.data = jsonObject;
    }

    public static final /* synthetic */ void AEQbTJ(InHouseIMResponse inHouseIMResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, inHouseIMResponse.code);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, inHouseIMResponse.msg);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], inHouseIMResponse.websocketCommand);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, inHouseIMResponse.requestId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, JsonObjectSerializer.INSTANCE, inHouseIMResponse.data);
    }

    public InHouseIMResponse(int i, String str, @NotNull InHouseIMCommand inHouseIMCommand, String str2, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(inHouseIMCommand, "");
        this.code = i;
        this.msg = str;
        this.websocketCommand = inHouseIMCommand;
        this.requestId = str2;
        this.data = jsonObject;
    }
}
