package com.okinc.business.invest_biz.data.bean.request;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class InvestTokenBalanceReq {
    private final String accountId;
    private final String address;
    private final long chainId;
    private final List<String> tokenAddressList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.invest_biz.data.bean.request.InvestTokenBalanceReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestTokenBalanceReq copy$default(InvestTokenBalanceReq investTokenBalanceReq, String str, long j, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investTokenBalanceReq.address;
        }
        if ((i & 2) != 0) {
            j = investTokenBalanceReq.chainId;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            list = investTokenBalanceReq.tokenAddressList;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str2 = investTokenBalanceReq.accountId;
        }
        return investTokenBalanceReq.copy(str, j2, list2, str2);
    }

    @SerialName("accountId")
    public static /* synthetic */ void getAccountId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.tokenAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenBalanceReq copy(@NotNull String str, long j, @NotNull List<String> list, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new InvestTokenBalanceReq(str, j, list, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestTokenBalanceReq)) {
            return false;
        }
        InvestTokenBalanceReq investTokenBalanceReq = (InvestTokenBalanceReq) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) investTokenBalanceReq.address) && this.chainId == investTokenBalanceReq.chainId && Intrinsics.EZpvd(this.tokenAddressList, investTokenBalanceReq.tokenAddressList) && Intrinsics.EZpvd((Object) this.accountId, (Object) investTokenBalanceReq.accountId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTokenAddressList() {
        return this.tokenAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.address.hashCode() * 31) + Long.hashCode(this.chainId)) * 31) + this.tokenAddressList.hashCode()) * 31) + this.accountId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestTokenBalanceReq(address=" + this.address + ", chainId=" + this.chainId + ", tokenAddressList=" + this.tokenAddressList + ", accountId=" + this.accountId + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.InvestTokenBalanceReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestTokenBalanceReq> serializer() {
            return InvestTokenBalanceReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestTokenBalanceReq(int i, String str, long j, List list, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, InvestTokenBalanceReq$$serializer.INSTANCE.getDescriptor());
        }
        this.address = str;
        this.chainId = j;
        this.tokenAddressList = list;
        this.accountId = str2;
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestTokenBalanceReq investTokenBalanceReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, investTokenBalanceReq.address);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, investTokenBalanceReq.chainId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], investTokenBalanceReq.tokenAddressList);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, investTokenBalanceReq.accountId);
    }

    public InvestTokenBalanceReq(@NotNull String str, long j, @NotNull List<String> list, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.address = str;
        this.chainId = j;
        this.tokenAddressList = list;
        this.accountId = str2;
    }
}
