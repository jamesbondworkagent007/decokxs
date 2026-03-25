package com.okinc.business.invest_biz.data.bean.request;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestTokenDetailsReq {
    private final List<String> investmentIdList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.request.InvestTokenDetailsReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestTokenDetailsReq copy$default(InvestTokenDetailsReq investTokenDetailsReq, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = investTokenDetailsReq.investmentIdList;
        }
        return investTokenDetailsReq.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.investmentIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenDetailsReq copy(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new InvestTokenDetailsReq(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InvestTokenDetailsReq) && Intrinsics.EZpvd(this.investmentIdList, ((InvestTokenDetailsReq) obj).investmentIdList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getInvestmentIdList() {
        return this.investmentIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.investmentIdList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestTokenDetailsReq(investmentIdList=" + this.investmentIdList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.InvestTokenDetailsReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestTokenDetailsReq> serializer() {
            return InvestTokenDetailsReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestTokenDetailsReq(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, InvestTokenDetailsReq$$serializer.INSTANCE.getDescriptor());
        }
        this.investmentIdList = list;
    }

    public InvestTokenDetailsReq(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.investmentIdList = list;
    }
}
