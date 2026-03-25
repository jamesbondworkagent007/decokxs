package com.okinc.business.market.data.model.alert;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class AlertDeleteRequest {
    public static final KSerializer<Object>[] $childSerializers;
    public final String deviceId;
    public final List<Integer> mCapRuleIds;
    public final List<Integer> ruleIds;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.alert.AlertDeleteRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlertDeleteRequest copy$default(AlertDeleteRequest alertDeleteRequest, List list, List list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = alertDeleteRequest.mCapRuleIds;
        }
        if ((i & 2) != 0) {
            list2 = alertDeleteRequest.ruleIds;
        }
        if ((i & 4) != 0) {
            str = alertDeleteRequest.deviceId;
        }
        return alertDeleteRequest.OLrzqt((List<Integer>) list, (List<Integer>) list2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> KWHzl() {
        return this.ruleIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertDeleteRequest OLrzqt(@NotNull List<Integer> list, @NotNull List<Integer> list2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new AlertDeleteRequest(list, list2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> OLrzqt() {
        return this.mCapRuleIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.deviceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertDeleteRequest)) {
            return false;
        }
        AlertDeleteRequest alertDeleteRequest = (AlertDeleteRequest) obj;
        return Intrinsics.EZpvd(this.mCapRuleIds, alertDeleteRequest.mCapRuleIds) && Intrinsics.EZpvd(this.ruleIds, alertDeleteRequest.ruleIds) && Intrinsics.EZpvd((Object) this.deviceId, (Object) alertDeleteRequest.deviceId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.mCapRuleIds.hashCode() * 31) + this.ruleIds.hashCode()) * 31) + this.deviceId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AlertDeleteRequest(mCapRuleIds=" + this.mCapRuleIds + ", ruleIds=" + this.ruleIds + ", deviceId=" + this.deviceId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.alert.AlertDeleteRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AlertDeleteRequest> serializer() {
            return AlertDeleteRequest$$serializer.INSTANCE;
        }
    }

    static {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(intSerializer), new ArrayListSerializer(intSerializer), null};
    }

    public /* synthetic */ AlertDeleteRequest(int i, List list, List list2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, AlertDeleteRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.mCapRuleIds = list;
        this.ruleIds = list2;
        this.deviceId = str;
    }

    public static final /* synthetic */ void OLrzqt(AlertDeleteRequest alertDeleteRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], alertDeleteRequest.mCapRuleIds);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], alertDeleteRequest.ruleIds);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, alertDeleteRequest.deviceId);
    }

    public AlertDeleteRequest(@NotNull List<Integer> list, @NotNull List<Integer> list2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.mCapRuleIds = list;
        this.ruleIds = list2;
        this.deviceId = str;
    }
}
