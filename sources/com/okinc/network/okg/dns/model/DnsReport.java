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
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class DnsReport {
    private BasicInfo basicInfo;
    private List<Link> links;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(Link$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DnsReport() {
        this((BasicInfo) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.network.okg.dns.model.DnsReport */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DnsReport copy$default(DnsReport dnsReport, BasicInfo basicInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            basicInfo = dnsReport.basicInfo;
        }
        if ((i & 2) != 0) {
            list = dnsReport.links;
        }
        return dnsReport.copy(basicInfo, list);
    }

    @SerialName("basic_info")
    public static /* synthetic */ void getBasicInfo$annotations() {
    }

    @SerialName("links")
    public static /* synthetic */ void getLinks$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BasicInfo component1() {
        return this.basicInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Link> component2() {
        return this.links;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DnsReport copy(BasicInfo basicInfo, List<Link> list) {
        return new DnsReport(basicInfo, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DnsReport)) {
            return false;
        }
        DnsReport dnsReport = (DnsReport) obj;
        return Intrinsics.EZpvd(this.basicInfo, dnsReport.basicInfo) && Intrinsics.EZpvd(this.links, dnsReport.links);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BasicInfo getBasicInfo() {
        return this.basicInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Link> getLinks() {
        return this.links;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        BasicInfo basicInfo = this.basicInfo;
        int iHashCode = basicInfo == null ? 0 : basicInfo.hashCode();
        List<Link> list = this.links;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBasicInfo(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinks(List<Link> list) {
        this.links = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DnsReport(basicInfo=" + this.basicInfo + ", links=" + this.links + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.dns.model.DnsReport.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DnsReport> serializer() {
            return DnsReport$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DnsReport(int i, BasicInfo basicInfo, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.basicInfo = null;
        } else {
            this.basicInfo = basicInfo;
        }
        if ((i & 2) == 0) {
            this.links = null;
        } else {
            this.links = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKNetwork_network(DnsReport dnsReport, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dnsReport.basicInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BasicInfo$$serializer.INSTANCE, dnsReport.basicInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && dnsReport.links == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], dnsReport.links);
    }

    public DnsReport(BasicInfo basicInfo, List<Link> list) {
        this.basicInfo = basicInfo;
        this.links = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.network.okg.dns.model.BasicInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.network.okg.dns.model.BasicInfo) : (r2v0 com.okinc.network.okg.dns.model.BasicInfo))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(com.okinc.network.okg.dns.model.BasicInfo, java.util.List<com.okinc.network.okg.dns.model.Link>):void (m)] (LINE:16) call: com.okinc.network.okg.dns.model.DnsReport.<init>(com.okinc.network.okg.dns.model.BasicInfo, java.util.List):void type: THIS */
    public /* synthetic */ DnsReport(BasicInfo basicInfo, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : basicInfo, (i & 2) != 0 ? null : list);
    }
}
