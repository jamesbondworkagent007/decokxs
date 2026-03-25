package com.okinc.okex.common.bean;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class UnifiedEntranceRequest {
    private final JsonObject context;
    private final String entranceId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UnifiedEntranceRequest copy$default(UnifiedEntranceRequest unifiedEntranceRequest, String str, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unifiedEntranceRequest.entranceId;
        }
        if ((i & 2) != 0) {
            jsonObject = unifiedEntranceRequest.context;
        }
        return unifiedEntranceRequest.copy(str, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.entranceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component2() {
        return this.context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnifiedEntranceRequest copy(@NotNull String str, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        return new UnifiedEntranceRequest(str, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnifiedEntranceRequest)) {
            return false;
        }
        UnifiedEntranceRequest unifiedEntranceRequest = (UnifiedEntranceRequest) obj;
        return Intrinsics.EZpvd((Object) this.entranceId, (Object) unifiedEntranceRequest.entranceId) && Intrinsics.EZpvd(this.context, unifiedEntranceRequest.context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getContext() {
        return this.context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEntranceId() {
        return this.entranceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.entranceId.hashCode();
        JsonObject jsonObject = this.context;
        return (iHashCode * 31) + (jsonObject == null ? 0 : jsonObject.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnifiedEntranceRequest(entranceId=" + this.entranceId + ", context=" + this.context + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.common.bean.UnifiedEntranceRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UnifiedEntranceRequest> serializer() {
            return UnifiedEntranceRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UnifiedEntranceRequest(int i, String str, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, UnifiedEntranceRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.entranceId = str;
        if ((i & 2) == 0) {
            this.context = null;
        } else {
            this.context = jsonObject;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(UnifiedEntranceRequest unifiedEntranceRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, unifiedEntranceRequest.entranceId);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && unifiedEntranceRequest.context == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, JsonObjectSerializer.INSTANCE, unifiedEntranceRequest.context);
    }

    public UnifiedEntranceRequest(@NotNull String str, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        this.entranceId = str;
        this.context = jsonObject;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:kotlinx.serialization.json.JsonObject:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonObject) : (r2v0 kotlinx.serialization.json.JsonObject))
 A[MD:(java.lang.String, kotlinx.serialization.json.JsonObject):void (m)] (LINE:9) call: com.okinc.okex.common.bean.UnifiedEntranceRequest.<init>(java.lang.String, kotlinx.serialization.json.JsonObject):void type: THIS */
    public /* synthetic */ UnifiedEntranceRequest(String str, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : jsonObject);
    }
}
