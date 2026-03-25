package com.okinc.crcore.coreapi.net.responsebean;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class FollowRankListResponseBean {
    private final ArrayList<FollowRankResponseBean> ranks;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(FollowRankResponseBean$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FollowRankListResponseBean() {
        this((ArrayList) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.FollowRankListResponseBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FollowRankListResponseBean copy$default(FollowRankListResponseBean followRankListResponseBean, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = followRankListResponseBean.ranks;
        }
        return followRankListResponseBean.copy(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<FollowRankResponseBean> component1() {
        return this.ranks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FollowRankListResponseBean copy(@NotNull ArrayList<FollowRankResponseBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new FollowRankListResponseBean(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FollowRankListResponseBean) && Intrinsics.EZpvd(this.ranks, ((FollowRankListResponseBean) obj).ranks);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<FollowRankResponseBean> getRanks() {
        return this.ranks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.ranks.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FollowRankListResponseBean(ranks=" + this.ranks + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.FollowRankListResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FollowRankListResponseBean> serializer() {
            return FollowRankListResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FollowRankListResponseBean(int i, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ranks = new ArrayList<>();
        } else {
            this.ranks = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(FollowRankListResponseBean followRankListResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(followRankListResponseBean.ranks, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], followRankListResponseBean.ranks);
    }

    public FollowRankListResponseBean(@NotNull ArrayList<FollowRankResponseBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.ranks = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:11) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.ArrayList))
 A[MD:(java.util.ArrayList<com.okinc.crcore.coreapi.net.responsebean.FollowRankResponseBean>):void (m)] (LINE:10) call: com.okinc.crcore.coreapi.net.responsebean.FollowRankListResponseBean.<init>(java.util.ArrayList):void type: THIS */
    public /* synthetic */ FollowRankListResponseBean(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList);
    }
}
