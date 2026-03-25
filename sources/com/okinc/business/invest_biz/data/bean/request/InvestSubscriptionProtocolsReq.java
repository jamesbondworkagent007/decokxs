package com.okinc.business.invest_biz.data.bean.request;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class InvestSubscriptionProtocolsReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accountId;
    private final long investmentId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestSubscriptionProtocolsReq copy$default(InvestSubscriptionProtocolsReq investSubscriptionProtocolsReq, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = investSubscriptionProtocolsReq.investmentId;
        }
        if ((i & 2) != 0) {
            str = investSubscriptionProtocolsReq.accountId;
        }
        return investSubscriptionProtocolsReq.copy(j, str);
    }

    @SerialName("accountId")
    public static /* synthetic */ void getAccountId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestSubscriptionProtocolsReq copy(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InvestSubscriptionProtocolsReq(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestSubscriptionProtocolsReq)) {
            return false;
        }
        InvestSubscriptionProtocolsReq investSubscriptionProtocolsReq = (InvestSubscriptionProtocolsReq) obj;
        return this.investmentId == investSubscriptionProtocolsReq.investmentId && Intrinsics.EZpvd((Object) this.accountId, (Object) investSubscriptionProtocolsReq.accountId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.investmentId) * 31) + this.accountId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestSubscriptionProtocolsReq(investmentId=" + this.investmentId + ", accountId=" + this.accountId + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionProtocolsReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestSubscriptionProtocolsReq> serializer() {
            return InvestSubscriptionProtocolsReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestSubscriptionProtocolsReq(int i, long j, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, InvestSubscriptionProtocolsReq$$serializer.INSTANCE.getDescriptor());
        }
        this.investmentId = j;
        this.accountId = str;
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestSubscriptionProtocolsReq investSubscriptionProtocolsReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, investSubscriptionProtocolsReq.investmentId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, investSubscriptionProtocolsReq.accountId);
    }

    public InvestSubscriptionProtocolsReq(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.investmentId = j;
        this.accountId = str;
    }
}
