package com.okinc.network.okg.dns.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class GetConfig {
    private final long duration;
    private final int errorCode;
    private final List<GetConfigResult> getConfigResult;
    private final String host;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(GetConfigResult$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.network.okg.dns.model.GetConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetConfig copy$default(GetConfig getConfig, String str, long j, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getConfig.host;
        }
        if ((i2 & 2) != 0) {
            j = getConfig.duration;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            i = getConfig.errorCode;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            list = getConfig.getConfigResult;
        }
        return getConfig.copy(str, j2, i3, list);
    }

    @SerialName("duration")
    public static /* synthetic */ void getDuration$annotations() {
    }

    @SerialName("error_code")
    public static /* synthetic */ void getErrorCode$annotations() {
    }

    @SerialName("results")
    public static /* synthetic */ void getGetConfigResult$annotations() {
    }

    @SerialName("host")
    public static /* synthetic */ void getHost$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.host;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GetConfigResult> component4() {
        return this.getConfigResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetConfig copy(String str, long j, int i, List<GetConfigResult> list) {
        return new GetConfig(str, j, i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetConfig)) {
            return false;
        }
        GetConfig getConfig = (GetConfig) obj;
        return Intrinsics.EZpvd((Object) this.host, (Object) getConfig.host) && this.duration == getConfig.duration && this.errorCode == getConfig.errorCode && Intrinsics.EZpvd(this.getConfigResult, getConfig.getConfigResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GetConfigResult> getGetConfigResult() {
        return this.getConfigResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHost() {
        return this.host;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.host;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = Long.hashCode(this.duration);
        int iHashCode3 = Integer.hashCode(this.errorCode);
        List<GetConfigResult> list = this.getConfigResult;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetConfig(host=" + this.host + ", duration=" + this.duration + ", errorCode=" + this.errorCode + ", getConfigResult=" + this.getConfigResult + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.dns.model.GetConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetConfig> serializer() {
            return GetConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetConfig(int i, String str, long j, int i2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, GetConfig$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.host = null;
        } else {
            this.host = str;
        }
        this.duration = j;
        if ((i & 4) == 0) {
            this.errorCode = 0;
        } else {
            this.errorCode = i2;
        }
        if ((i & 8) == 0) {
            this.getConfigResult = null;
        } else {
            this.getConfigResult = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKNetwork_network(GetConfig getConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || getConfig.host != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, getConfig.host);
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 1, getConfig.duration);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || getConfig.errorCode != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, getConfig.errorCode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && getConfig.getConfigResult == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], getConfig.getConfigResult);
    }

    public GetConfig(String str, long j, int i, List<GetConfigResult> list) {
        this.host = str;
        this.duration = j;
        this.errorCode = i;
        this.getConfigResult = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (r9v0 long)
  (wrap:int:0x000d: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000e: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
 A[MD:(java.lang.String, long, int, java.util.List<com.okinc.network.okg.dns.model.GetConfigResult>):void (m)] (LINE:104) call: com.okinc.network.okg.dns.model.GetConfig.<init>(java.lang.String, long, int, java.util.List):void type: THIS */
    public /* synthetic */ GetConfig(String str, long j, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, j, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : list);
    }
}
