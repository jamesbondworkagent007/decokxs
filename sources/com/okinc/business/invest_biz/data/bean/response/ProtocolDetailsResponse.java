package com.okinc.business.invest_biz.data.bean.response;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class ProtocolDetailsResponse {
    public final long analysisPlatformId;
    public final long chainId;
    public final boolean isSupportInvest;
    public final String network;
    public final List<ProtocolDetailsByAccount> protocolDetails;
    public final String protocolLogo;
    public final String protocolName;
    public final String protocolUrl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(ProtocolDetailsByAccount$$serializer.INSTANCE), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProtocolDetailsResponse() {
        this(0L, 0L, (String) null, (List) null, false, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.protocolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ProtocolDetailsByAccount> EZpvd() {
        return this.protocolDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProtocolDetailsResponse OLrzqt(long j, long j2, @NotNull String str, @NotNull List<ProtocolDetailsByAccount> list, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new ProtocolDetailsResponse(j, j2, str, list, z, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.isSupportInvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtocolDetailsResponse)) {
            return false;
        }
        ProtocolDetailsResponse protocolDetailsResponse = (ProtocolDetailsResponse) obj;
        return this.analysisPlatformId == protocolDetailsResponse.analysisPlatformId && this.chainId == protocolDetailsResponse.chainId && Intrinsics.EZpvd((Object) this.network, (Object) protocolDetailsResponse.network) && Intrinsics.EZpvd(this.protocolDetails, protocolDetailsResponse.protocolDetails) && this.isSupportInvest == protocolDetailsResponse.isSupportInvest && Intrinsics.EZpvd((Object) this.protocolLogo, (Object) protocolDetailsResponse.protocolLogo) && Intrinsics.EZpvd((Object) this.protocolName, (Object) protocolDetailsResponse.protocolName) && Intrinsics.EZpvd((Object) this.protocolUrl, (Object) protocolDetailsResponse.protocolUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.protocolLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((Long.hashCode(this.analysisPlatformId) * 31) + Long.hashCode(this.chainId)) * 31) + this.network.hashCode()) * 31) + this.protocolDetails.hashCode()) * 31) + Boolean.hashCode(this.isSupportInvest)) * 31) + this.protocolLogo.hashCode()) * 31) + this.protocolName.hashCode()) * 31) + this.protocolUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProtocolDetailsResponse(analysisPlatformId=" + this.analysisPlatformId + ", chainId=" + this.chainId + ", network=" + this.network + ", protocolDetails=" + this.protocolDetails + ", isSupportInvest=" + this.isSupportInvest + ", protocolLogo=" + this.protocolLogo + ", protocolName=" + this.protocolName + ", protocolUrl=" + this.protocolUrl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.protocolUrl;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.ProtocolDetailsResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProtocolDetailsResponse> serializer() {
            return ProtocolDetailsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProtocolDetailsResponse(int i, long j, long j2, String str, List list, boolean z, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.analysisPlatformId = 0L;
        } else {
            this.analysisPlatformId = j;
        }
        if ((i & 2) == 0) {
            this.chainId = 0L;
        } else {
            this.chainId = j2;
        }
        if ((i & 4) == 0) {
            this.network = "";
        } else {
            this.network = str;
        }
        if ((i & 8) == 0) {
            this.protocolDetails = yDY.AhwBna();
        } else {
            this.protocolDetails = list;
        }
        if ((i & 16) == 0) {
            this.isSupportInvest = false;
        } else {
            this.isSupportInvest = z;
        }
        if ((i & 32) == 0) {
            this.protocolLogo = "";
        } else {
            this.protocolLogo = str2;
        }
        if ((i & 64) == 0) {
            this.protocolName = "";
        } else {
            this.protocolName = str3;
        }
        if ((i & 128) == 0) {
            this.protocolUrl = "";
        } else {
            this.protocolUrl = str4;
        }
    }

    public static final /* synthetic */ void EZpvd(ProtocolDetailsResponse protocolDetailsResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || protocolDetailsResponse.analysisPlatformId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, protocolDetailsResponse.analysisPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || protocolDetailsResponse.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, protocolDetailsResponse.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) protocolDetailsResponse.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, protocolDetailsResponse.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(protocolDetailsResponse.protocolDetails, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], protocolDetailsResponse.protocolDetails);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || protocolDetailsResponse.isSupportInvest) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, protocolDetailsResponse.isSupportInvest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) protocolDetailsResponse.protocolLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, protocolDetailsResponse.protocolLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) protocolDetailsResponse.protocolName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, protocolDetailsResponse.protocolName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) protocolDetailsResponse.protocolUrl, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, protocolDetailsResponse.protocolUrl);
    }

    public ProtocolDetailsResponse(long j, long j2, @NotNull String str, @NotNull List<ProtocolDetailsByAccount> list, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.analysisPlatformId = j;
        this.chainId = j2;
        this.network = str;
        this.protocolDetails = list;
        this.isSupportInvest = z;
        this.protocolLogo = str2;
        this.protocolName = str3;
        this.protocolUrl = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r12v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r14v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001b: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:31)) : (r17v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r22v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(long, long, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.response.ProtocolDetailsByAccount>, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:23) call: com.okinc.business.invest_biz.data.bean.response.ProtocolDetailsResponse.<init>(long, long, java.lang.String, java.util.List, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ProtocolDetailsResponse(long j, long j2, String str, List list, boolean z, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) == 0 ? j2 : 0L, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? yDY.AhwBna() : list, (i & 16) != 0 ? false : z, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? "" : str3, (i & 128) == 0 ? str4 : "");
    }
}
