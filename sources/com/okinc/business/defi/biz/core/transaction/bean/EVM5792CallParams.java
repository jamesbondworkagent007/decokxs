package com.okinc.business.defi.biz.core.transaction.bean;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class EVM5792CallParams {
    private final Map<String, JsonObject> capabilities;
    private final String data;
    private final String to;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, JsonObjectSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.core.transaction.bean.EVM5792CallParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EVM5792CallParams copy$default(EVM5792CallParams eVM5792CallParams, String str, String str2, String str3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eVM5792CallParams.to;
        }
        if ((i & 2) != 0) {
            str2 = eVM5792CallParams.data;
        }
        if ((i & 4) != 0) {
            str3 = eVM5792CallParams.value;
        }
        if ((i & 8) != 0) {
            map = eVM5792CallParams.capabilities;
        }
        return eVM5792CallParams.copy(str, str2, str3, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, JsonObject> component4() {
        return this.capabilities;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EVM5792CallParams copy(String str, String str2, String str3, Map<String, JsonObject> map) {
        return new EVM5792CallParams(str, str2, str3, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EVM5792CallParams)) {
            return false;
        }
        EVM5792CallParams eVM5792CallParams = (EVM5792CallParams) obj;
        return Intrinsics.EZpvd((Object) this.to, (Object) eVM5792CallParams.to) && Intrinsics.EZpvd((Object) this.data, (Object) eVM5792CallParams.data) && Intrinsics.EZpvd((Object) this.value, (Object) eVM5792CallParams.value) && Intrinsics.EZpvd(this.capabilities, eVM5792CallParams.capabilities);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, JsonObject> getCapabilities() {
        return this.capabilities;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.to;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.data;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.value;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Map<String, JsonObject> map = this.capabilities;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (map != null ? map.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EVM5792CallParams(to=" + this.to + ", data=" + this.data + ", value=" + this.value + ", capabilities=" + this.capabilities + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.bean.EVM5792CallParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EVM5792CallParams> serializer() {
            return EVM5792CallParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EVM5792CallParams(int i, String str, String str2, String str3, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, EVM5792CallParams$$serializer.INSTANCE.getDescriptor());
        }
        this.to = str;
        this.data = str2;
        this.value = str3;
        this.capabilities = map;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EVM5792CallParams eVM5792CallParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, eVM5792CallParams.to);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, eVM5792CallParams.data);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, eVM5792CallParams.value);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], eVM5792CallParams.capabilities);
    }

    public EVM5792CallParams(String str, String str2, String str3, Map<String, JsonObject> map) {
        this.to = str;
        this.data = str2;
        this.value = str3;
        this.capabilities = map;
    }
}
