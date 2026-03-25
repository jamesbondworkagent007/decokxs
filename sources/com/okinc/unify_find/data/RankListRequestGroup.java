package com.okinc.unify_find.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class RankListRequestGroup {
    private final boolean needHttp;
    private final boolean needWs;
    private final RankListRequest request;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RankListRequestGroup copy$default(RankListRequestGroup rankListRequestGroup, boolean z, boolean z2, RankListRequest rankListRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rankListRequestGroup.needWs;
        }
        if ((i & 2) != 0) {
            z2 = rankListRequestGroup.needHttp;
        }
        if ((i & 4) != 0) {
            rankListRequest = rankListRequestGroup.request;
        }
        return rankListRequestGroup.copy(z, z2, rankListRequest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.needWs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.needHttp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankListRequest component3() {
        return this.request;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankListRequestGroup copy(boolean z, boolean z2, @NotNull RankListRequest rankListRequest) {
        Intrinsics.checkNotNullParameter(rankListRequest, "");
        return new RankListRequestGroup(z, z2, rankListRequest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RankListRequestGroup)) {
            return false;
        }
        RankListRequestGroup rankListRequestGroup = (RankListRequestGroup) obj;
        return this.needWs == rankListRequestGroup.needWs && this.needHttp == rankListRequestGroup.needHttp && Intrinsics.EZpvd(this.request, rankListRequestGroup.request);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedHttp() {
        return this.needHttp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedWs() {
        return this.needWs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankListRequest getRequest() {
        return this.request;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.needWs) * 31) + Boolean.hashCode(this.needHttp)) * 31) + this.request.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RankListRequestGroup(needWs=" + this.needWs + ", needHttp=" + this.needHttp + ", request=" + this.request + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_find.data.RankListRequestGroup.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RankListRequestGroup> serializer() {
            return RankListRequestGroup$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RankListRequestGroup(int i, boolean z, boolean z2, RankListRequest rankListRequest, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i & 4)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4, RankListRequestGroup$$serializer.INSTANCE.getDescriptor());
        }
        this.needWs = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.needHttp = true;
        } else {
            this.needHttp = z2;
        }
        this.request = rankListRequest;
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_impl(RankListRequestGroup rankListRequestGroup, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || rankListRequestGroup.needWs) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, rankListRequestGroup.needWs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !rankListRequestGroup.needHttp) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, rankListRequestGroup.needHttp);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, RankListRequest$$serializer.INSTANCE, rankListRequestGroup.request);
    }

    public RankListRequestGroup(boolean z, boolean z2, @NotNull RankListRequest rankListRequest) {
        Intrinsics.checkNotNullParameter(rankListRequest, "");
        this.needWs = z;
        this.needHttp = z2;
        this.request = rankListRequest;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (r3v0 com.okinc.unify_find.data.RankListRequest)
 A[MD:(boolean, boolean, com.okinc.unify_find.data.RankListRequest):void (m)] (LINE:67) call: com.okinc.unify_find.data.RankListRequestGroup.<init>(boolean, boolean, com.okinc.unify_find.data.RankListRequest):void type: THIS */
    public /* synthetic */ RankListRequestGroup(boolean z, boolean z2, RankListRequest rankListRequest, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, rankListRequest);
    }
}
