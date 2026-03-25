package com.okinc.network.okg.log;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.network.okg.dns.DohTypeEnum;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C43372rnz;
import o.C43396roW;
import o.C43466rpn;
import okhttp3.Protocol;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class NetEventData {
    private static final KSerializer<Object>[] $childSerializers;
    private DohTypeEnum _dohType;
    private final long _nano2Ms;
    private long _startConnectTime;
    private String appStatus;
    private HashMap<String, String> attributes;
    private long connect_duration;
    private final String connect_type;
    private String dest_domain;
    private String dest_ip;
    private long duration;
    private String error_code;
    private String operator_type;
    private String protocol;
    private long startTime;
    private long time;
    private final String url_path;
    private boolean useDoh;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppStatus() {
        return this.appStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getAttribute() {
        return this.attributes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getConnect_duration() {
        return this.connect_duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConnect_type() {
        return this.connect_type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDest_domain() {
        return this.dest_domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDest_ip() {
        return this.dest_ip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DohTypeEnum getDohType() {
        return this._dohType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getError_code() {
        return this.error_code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOperator_type() {
        return this.operator_type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProtocol() {
        return this.protocol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl_path() {
        return this.url_path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUseDoh() {
        return this.useDoh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCallEnd() {
        return this.duration > 0 && this.time > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAppStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.appStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttribute(HashMap<String, String> map) {
        this.attributes = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConnect_duration(long j) {
        this.connect_duration = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDest_domain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dest_domain = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDest_ip(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dest_ip = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDohType(DohTypeEnum dohTypeEnum) {
        this._dohType = dohTypeEnum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDuration(long j) {
        this.duration = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setError_code(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.error_code = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOperator_type(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.operator_type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProtocol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.protocol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStartTime(long j) {
        this.startTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTime(long j) {
        this.time = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUseDoh(boolean z) {
        this.useDoh = z;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.log.NetEventData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NetEventData> serializer() {
            return NetEventData$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, new HashMapSerializer(stringSerializer, stringSerializer), null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.network.okg.dns.DohTypeEnum", DohTypeEnum.values())};
    }

    public /* synthetic */ NetEventData(int i, String str, String str2, String str3, String str4, String str5, long j, long j2, long j3, String str6, String str7, boolean z, String str8, HashMap map, long j4, long j5, long j6, DohTypeEnum dohTypeEnum, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, NetEventData$$serializer.INSTANCE.getDescriptor());
        }
        this.connect_type = str;
        this.url_path = str2;
        if ((i & 4) == 0) {
            this.dest_domain = "";
        } else {
            this.dest_domain = str3;
        }
        if ((i & 8) == 0) {
            this.dest_ip = "";
        } else {
            this.dest_ip = str4;
        }
        this.error_code = (i & 16) == 0 ? MultiTransferSignData.DEFAULT_INTERVAL : str5;
        if ((i & 32) == 0) {
            this.duration = 0L;
        } else {
            this.duration = j;
        }
        if ((i & 64) == 0) {
            this.connect_duration = 0L;
        } else {
            this.connect_duration = j2;
        }
        if ((i & 128) == 0) {
            this.time = 0L;
        } else {
            this.time = j3;
        }
        if ((i & 256) == 0) {
            this.operator_type = "";
        } else {
            this.operator_type = str6;
        }
        if ((i & 512) == 0) {
            this.protocol = "";
        } else {
            this.protocol = str7;
        }
        this.useDoh = (i & 1024) == 0 ? true : z;
        this.appStatus = (i & 2048) == 0 ? "0" : str8;
        if ((i & 4096) == 0) {
            this.attributes = null;
        } else {
            this.attributes = map;
        }
        if ((i & 8192) == 0) {
            this.startTime = 0L;
        } else {
            this.startTime = j4;
        }
        this._startConnectTime = (i & 16384) != 0 ? j5 : 0L;
        this._nano2Ms = (32768 & i) == 0 ? 1000000L : j6;
        if ((i & 65536) == 0) {
            this._dohType = null;
        } else {
            this._dohType = dohTypeEnum;
        }
    }

    public static final /* synthetic */ void write$Self$OKNetwork_network(NetEventData netEventData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, netEventData.connect_type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, netEventData.url_path);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) netEventData.dest_domain, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, netEventData.dest_domain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) netEventData.dest_ip, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, netEventData.dest_ip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) netEventData.error_code, (Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, netEventData.error_code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || netEventData.duration != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 5, netEventData.duration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || netEventData.connect_duration != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 6, netEventData.connect_duration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || netEventData.time != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 7, netEventData.time);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) netEventData.operator_type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, netEventData.operator_type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) netEventData.protocol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, netEventData.protocol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !netEventData.useDoh) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, netEventData.useDoh);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) netEventData.appStatus, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, netEventData.appStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || netEventData.attributes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], netEventData.attributes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || netEventData.startTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 13, netEventData.startTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || netEventData._startConnectTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 14, netEventData._startConnectTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || netEventData._nano2Ms != 1000000) {
            compositeEncoder.encodeLongElement(serialDescriptor, 15, netEventData._nano2Ms);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && netEventData._dohType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr[16], netEventData._dohType);
    }

    public NetEventData(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.connect_type = str;
        this.url_path = str2;
        this.dest_domain = "";
        this.dest_ip = "";
        this.error_code = MultiTransferSignData.DEFAULT_INTERVAL;
        this.operator_type = "";
        this.protocol = "";
        this.useDoh = true;
        this.appStatus = "0";
        this._nano2Ms = 1000000L;
    }

    public final void callStart() {
        this.startTime = System.nanoTime();
        this.appStatus = C43466rpn.OLrzqt.AEQbTJ();
    }

    public final void callEnd(Response response) {
        long jNanoTime;
        String strName;
        Protocol protocol;
        if (response != null) {
            jNanoTime = response.receivedResponseAtMillis() - response.sentRequestAtMillis();
        } else {
            jNanoTime = (System.nanoTime() - this.startTime) / this._nano2Ms;
        }
        this.duration = jNanoTime;
        this.time = System.currentTimeMillis();
        if (response == null || (protocol = response.protocol()) == null || (strName = protocol.name()) == null) {
            strName = "";
        }
        this.protocol = strName;
        buildOperatorType();
        appendErrorAttribute("is_vpn", C43396roW.EZpvd().AhwBna() ? "1" : "0");
    }

    public final void connectStart() {
        this._startConnectTime = System.nanoTime();
    }

    public final void connectEnd() {
        this.connect_duration = (System.nanoTime() - this._startConnectTime) / this._nano2Ms;
    }

    public final boolean isRespCodeNoChanged() {
        return Intrinsics.EZpvd((Object) this.error_code, (Object) MultiTransferSignData.DEFAULT_INTERVAL);
    }

    public final void appendErrorAttribute(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        checkAttributeInit();
        HashMap<String, String> map = this.attributes;
        if (map != null) {
            map.put(str, str2);
        }
    }

    public final boolean isDestDomainInitValue() {
        if (this.dest_domain.length() != 0) {
            String str = this.dest_domain;
            C43372rnz c43372rnz = C43372rnz.copydefault;
            if (!Intrinsics.EZpvd((Object) str, (Object) c43372rnz.EZpvd(DohTypeEnum.HTTP)) && !Intrinsics.EZpvd((Object) this.dest_domain, (Object) c43372rnz.EZpvd(DohTypeEnum.V5)) && !Intrinsics.EZpvd((Object) this.dest_domain, (Object) c43372rnz.EZpvd(DohTypeEnum.DEXPRI))) {
                return false;
            }
        }
        return true;
    }

    private final void buildOperatorType() {
        this.operator_type = C43396roW.EZpvd().djBIcL() + "," + C43396roW.EZpvd().copydefault();
    }

    private final void checkAttributeInit() {
        if (this.attributes == null) {
            this.attributes = new HashMap<>(3);
        }
    }

    public String toString() {
        return "NetEventData(connect_type: " + this.connect_type + ", url_path='" + this.url_path + "', appStatus: " + this.appStatus + ", dest_domain='" + this.dest_domain + "', dest_ip='" + this.dest_ip + "', error_code='" + this.error_code + "', duration=" + this.duration + ", protocol='" + this.protocol + "', useDoh=" + this.useDoh + ", connect_duration=" + this.connect_duration + ", time=" + this.time + ", operator_type: " + this.operator_type + "),attributes: " + this.attributes + ", dohType: " + this._dohType;
    }
}
