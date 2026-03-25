package com.okinc.okex.center.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class SupportLandingTransactionsResponse {
    private final List<LandingTransactionItemBean> list;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(LandingTransactionItemBean$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SupportLandingTransactionsResponse() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.center.bean.SupportLandingTransactionsResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportLandingTransactionsResponse copy$default(SupportLandingTransactionsResponse supportLandingTransactionsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = supportLandingTransactionsResponse.list;
        }
        return supportLandingTransactionsResponse.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LandingTransactionItemBean> component1() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportLandingTransactionsResponse copy(List<LandingTransactionItemBean> list) {
        return new SupportLandingTransactionsResponse(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SupportLandingTransactionsResponse) && Intrinsics.EZpvd(this.list, ((SupportLandingTransactionsResponse) obj).list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LandingTransactionItemBean> getList() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<LandingTransactionItemBean> list = this.list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportLandingTransactionsResponse(list=" + this.list + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.SupportLandingTransactionsResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SupportLandingTransactionsResponse> serializer() {
            return SupportLandingTransactionsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SupportLandingTransactionsResponse(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.list = null;
        } else {
            this.list = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(SupportLandingTransactionsResponse supportLandingTransactionsResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && supportLandingTransactionsResponse.list == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], supportLandingTransactionsResponse.list);
    }

    public SupportLandingTransactionsResponse(List<LandingTransactionItemBean> list) {
        this.list = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.okex.center.bean.LandingTransactionItemBean>):void (m)] (LINE:10) call: com.okinc.okex.center.bean.SupportLandingTransactionsResponse.<init>(java.util.List):void type: THIS */
    public /* synthetic */ SupportLandingTransactionsResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
