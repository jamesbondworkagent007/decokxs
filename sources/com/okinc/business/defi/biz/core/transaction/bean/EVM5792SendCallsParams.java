package com.okinc.business.defi.biz.core.transaction.bean;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class EVM5792SendCallsParams {
    private final Boolean atomicRequired;
    private final List<EVM5792CallParams> calls;
    private final Map<String, JsonObject> capabilities;
    private final String chainId;
    private final String from;
    private final String id;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(EVM5792CallParams$$serializer.INSTANCE), new LinkedHashMapSerializer(StringSerializer.INSTANCE, JsonObjectSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.defi.biz.core.transaction.bean.EVM5792SendCallsParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EVM5792SendCallsParams copy$default(EVM5792SendCallsParams eVM5792SendCallsParams, String str, String str2, String str3, String str4, Boolean bool, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eVM5792SendCallsParams.version;
        }
        if ((i & 2) != 0) {
            str2 = eVM5792SendCallsParams.id;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = eVM5792SendCallsParams.from;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = eVM5792SendCallsParams.chainId;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            bool = eVM5792SendCallsParams.atomicRequired;
        }
        Boolean bool2 = bool;
        if ((i & 32) != 0) {
            list = eVM5792SendCallsParams.calls;
        }
        List list2 = list;
        if ((i & 64) != 0) {
            map = eVM5792SendCallsParams.capabilities;
        }
        return eVM5792SendCallsParams.copy(str, str5, str6, str7, bool2, list2, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.atomicRequired;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EVM5792CallParams> component6() {
        return this.calls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, JsonObject> component7() {
        return this.capabilities;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EVM5792SendCallsParams copy(String str, String str2, String str3, String str4, Boolean bool, @NotNull List<EVM5792CallParams> list, Map<String, JsonObject> map) {
        Intrinsics.checkNotNullParameter(list, "");
        return new EVM5792SendCallsParams(str, str2, str3, str4, bool, list, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EVM5792SendCallsParams)) {
            return false;
        }
        EVM5792SendCallsParams eVM5792SendCallsParams = (EVM5792SendCallsParams) obj;
        return Intrinsics.EZpvd((Object) this.version, (Object) eVM5792SendCallsParams.version) && Intrinsics.EZpvd((Object) this.id, (Object) eVM5792SendCallsParams.id) && Intrinsics.EZpvd((Object) this.from, (Object) eVM5792SendCallsParams.from) && Intrinsics.EZpvd((Object) this.chainId, (Object) eVM5792SendCallsParams.chainId) && Intrinsics.EZpvd(this.atomicRequired, eVM5792SendCallsParams.atomicRequired) && Intrinsics.EZpvd(this.calls, eVM5792SendCallsParams.calls) && Intrinsics.EZpvd(this.capabilities, eVM5792SendCallsParams.capabilities);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAtomicRequired() {
        return this.atomicRequired;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EVM5792CallParams> getCalls() {
        return this.calls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, JsonObject> getCapabilities() {
        return this.capabilities;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.version;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.id;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.from;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.chainId;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        Boolean bool = this.atomicRequired;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        int iHashCode6 = this.calls.hashCode();
        Map<String, JsonObject> map = this.capabilities;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (map != null ? map.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EVM5792SendCallsParams(version=" + this.version + ", id=" + this.id + ", from=" + this.from + ", chainId=" + this.chainId + ", atomicRequired=" + this.atomicRequired + ", calls=" + this.calls + ", capabilities=" + this.capabilities + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.bean.EVM5792SendCallsParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EVM5792SendCallsParams> serializer() {
            return EVM5792SendCallsParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EVM5792SendCallsParams(int i, String str, String str2, String str3, String str4, Boolean bool, List list, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, EVM5792SendCallsParams$$serializer.INSTANCE.getDescriptor());
        }
        this.version = str;
        this.id = str2;
        this.from = str3;
        this.chainId = str4;
        this.atomicRequired = bool;
        this.calls = list;
        this.capabilities = map;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EVM5792SendCallsParams eVM5792SendCallsParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, eVM5792SendCallsParams.version);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, eVM5792SendCallsParams.id);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, eVM5792SendCallsParams.from);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, eVM5792SendCallsParams.chainId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, eVM5792SendCallsParams.atomicRequired);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], eVM5792SendCallsParams.calls);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], eVM5792SendCallsParams.capabilities);
    }

    public EVM5792SendCallsParams(String str, String str2, String str3, String str4, Boolean bool, @NotNull List<EVM5792CallParams> list, Map<String, JsonObject> map) {
        Intrinsics.checkNotNullParameter(list, "");
        this.version = str;
        this.id = str2;
        this.from = str3;
        this.chainId = str4;
        this.atomicRequired = bool;
        this.calls = list;
        this.capabilities = map;
    }
}
