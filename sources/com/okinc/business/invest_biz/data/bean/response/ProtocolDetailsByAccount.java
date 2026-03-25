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
public final class ProtocolDetailsByAccount {
    public final String accountId;
    public final List<InvestedToken> investments;
    public final List<MarketInvestTokenInfo> marketInvestments;
    public final ProtocolExtraData protocolExtraData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(InvestedToken$$serializer.INSTANCE), new ArrayListSerializer(MarketInvestTokenInfo$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProtocolDetailsByAccount() {
        this((String) null, (List) null, (List) null, (ProtocolExtraData) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.response.ProtocolDetailsByAccount */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProtocolDetailsByAccount copy$default(ProtocolDetailsByAccount protocolDetailsByAccount, String str, List list, List list2, ProtocolExtraData protocolExtraData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = protocolDetailsByAccount.accountId;
        }
        if ((i & 2) != 0) {
            list = protocolDetailsByAccount.investments;
        }
        if ((i & 4) != 0) {
            list2 = protocolDetailsByAccount.marketInvestments;
        }
        if ((i & 8) != 0) {
            protocolExtraData = protocolDetailsByAccount.protocolExtraData;
        }
        return protocolDetailsByAccount.KWHzl(str, list, list2, protocolExtraData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestedToken> AEQbTJ() {
        return this.investments;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProtocolDetailsByAccount KWHzl(@NotNull String str, @NotNull List<InvestedToken> list, @NotNull List<MarketInvestTokenInfo> list2, ProtocolExtraData protocolExtraData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new ProtocolDetailsByAccount(str, list, list2, protocolExtraData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProtocolExtraData KWHzl() {
        return this.protocolExtraData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MarketInvestTokenInfo> OLrzqt() {
        return this.marketInvestments;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtocolDetailsByAccount)) {
            return false;
        }
        ProtocolDetailsByAccount protocolDetailsByAccount = (ProtocolDetailsByAccount) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) protocolDetailsByAccount.accountId) && Intrinsics.EZpvd(this.investments, protocolDetailsByAccount.investments) && Intrinsics.EZpvd(this.marketInvestments, protocolDetailsByAccount.marketInvestments) && Intrinsics.EZpvd(this.protocolExtraData, protocolDetailsByAccount.protocolExtraData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountId.hashCode();
        int iHashCode2 = this.investments.hashCode();
        int iHashCode3 = this.marketInvestments.hashCode();
        ProtocolExtraData protocolExtraData = this.protocolExtraData;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (protocolExtraData == null ? 0 : protocolExtraData.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProtocolDetailsByAccount(accountId=" + this.accountId + ", investments=" + this.investments + ", marketInvestments=" + this.marketInvestments + ", protocolExtraData=" + this.protocolExtraData + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.ProtocolDetailsByAccount.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProtocolDetailsByAccount> serializer() {
            return ProtocolDetailsByAccount$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProtocolDetailsByAccount(int i, String str, List list, List list2, ProtocolExtraData protocolExtraData, SerializationConstructorMarker serializationConstructorMarker) {
        this.accountId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.investments = yDY.AhwBna();
        } else {
            this.investments = list;
        }
        if ((i & 4) == 0) {
            this.marketInvestments = yDY.AhwBna();
        } else {
            this.marketInvestments = list2;
        }
        if ((i & 8) == 0) {
            this.protocolExtraData = null;
        } else {
            this.protocolExtraData = protocolExtraData;
        }
    }

    public static final /* synthetic */ void copydefault(ProtocolDetailsByAccount protocolDetailsByAccount, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) protocolDetailsByAccount.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, protocolDetailsByAccount.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(protocolDetailsByAccount.investments, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], protocolDetailsByAccount.investments);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(protocolDetailsByAccount.marketInvestments, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], protocolDetailsByAccount.marketInvestments);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && protocolDetailsByAccount.protocolExtraData == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, ProtocolExtraData$$serializer.INSTANCE, protocolDetailsByAccount.protocolExtraData);
    }

    public ProtocolDetailsByAccount(@NotNull String str, @NotNull List<InvestedToken> list, @NotNull List<MarketInvestTokenInfo> list2, ProtocolExtraData protocolExtraData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.accountId = str;
        this.investments = list;
        this.marketInvestments = list2;
        this.protocolExtraData = protocolExtraData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:47)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000e: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0012: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:49)) : (r3v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.response.ProtocolExtraData:?: TERNARY null = ((wrap:int:0x0016: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.response.ProtocolExtraData) : (r4v0 com.okinc.business.invest_biz.data.bean.response.ProtocolExtraData))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.response.InvestedToken>, java.util.List<com.okinc.business.invest_biz.data.bean.response.MarketInvestTokenInfo>, com.okinc.business.invest_biz.data.bean.response.ProtocolExtraData):void (m)] (LINE:43) call: com.okinc.business.invest_biz.data.bean.response.ProtocolDetailsByAccount.<init>(java.lang.String, java.util.List, java.util.List, com.okinc.business.invest_biz.data.bean.response.ProtocolExtraData):void type: THIS */
    public /* synthetic */ ProtocolDetailsByAccount(String str, List list, List list2, ProtocolExtraData protocolExtraData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? yDY.AhwBna() : list2, (i & 8) != 0 ? null : protocolExtraData);
    }
}
