package com.okinc.planet.domain.remote.dto;

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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class LinkAnalysisResp {
    public final List<LinkInfo> linkInfoList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(LinkInfo$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LinkAnalysisResp() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.planet.domain.remote.dto.LinkAnalysisResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkAnalysisResp copy$default(LinkAnalysisResp linkAnalysisResp, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = linkAnalysisResp.linkInfoList;
        }
        return linkAnalysisResp.OLrzqt(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LinkInfo> KWHzl() {
        return this.linkInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkAnalysisResp OLrzqt(@NotNull List<LinkInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new LinkAnalysisResp(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LinkAnalysisResp) && Intrinsics.EZpvd(this.linkInfoList, ((LinkAnalysisResp) obj).linkInfoList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.linkInfoList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LinkAnalysisResp(linkInfoList=" + this.linkInfoList + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.remote.dto.LinkAnalysisResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LinkAnalysisResp> serializer() {
            return LinkAnalysisResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LinkAnalysisResp(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.linkInfoList = yDY.AhwBna();
        } else {
            this.linkInfoList = list;
        }
    }

    public static final /* synthetic */ void EZpvd(LinkAnalysisResp linkAnalysisResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(linkAnalysisResp.linkInfoList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], linkAnalysisResp.linkInfoList);
    }

    public LinkAnalysisResp(@NotNull List<LinkInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.linkInfoList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:9)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.planet.domain.remote.dto.LinkInfo>):void (m)] (LINE:7) call: com.okinc.planet.domain.remote.dto.LinkAnalysisResp.<init>(java.util.List):void type: THIS */
    public /* synthetic */ LinkAnalysisResp(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
