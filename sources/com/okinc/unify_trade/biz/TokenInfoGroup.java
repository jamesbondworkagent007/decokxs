package com.okinc.unify_trade.biz;

import com.okinc.tradeapi.bean.TradeGroupData;
import com.okinc.tradeapi.bean.TradeGroupData$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class TokenInfoGroup {
    private List<OldCoinInfo> oldCoinList;
    private List<TradeGroupData> tradeGroup;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(TradeGroupData$$serializer.INSTANCE), new ArrayListSerializer(OldCoinInfo$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenInfoGroup() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.TokenInfoGroup */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TokenInfoGroup copy$default(TokenInfoGroup tokenInfoGroup, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tokenInfoGroup.tradeGroup;
        }
        if ((i & 2) != 0) {
            list2 = tokenInfoGroup.oldCoinList;
        }
        return tokenInfoGroup.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeGroupData> component1() {
        return this.tradeGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<OldCoinInfo> component2() {
        return this.oldCoinList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfoGroup copy(List<TradeGroupData> list, List<OldCoinInfo> list2) {
        return new TokenInfoGroup(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenInfoGroup)) {
            return false;
        }
        TokenInfoGroup tokenInfoGroup = (TokenInfoGroup) obj;
        return Intrinsics.EZpvd(this.tradeGroup, tokenInfoGroup.tradeGroup) && Intrinsics.EZpvd(this.oldCoinList, tokenInfoGroup.oldCoinList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<OldCoinInfo> getOldCoinList() {
        return this.oldCoinList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeGroupData> getTradeGroup() {
        return this.tradeGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<TradeGroupData> list = this.tradeGroup;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<OldCoinInfo> list2 = this.oldCoinList;
        return (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOldCoinList(List<OldCoinInfo> list) {
        this.oldCoinList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeGroup(List<TradeGroupData> list) {
        this.tradeGroup = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenInfoGroup(tradeGroup=" + this.tradeGroup + ", oldCoinList=" + this.oldCoinList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TokenInfoGroup.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenInfoGroup> serializer() {
            return TokenInfoGroup$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenInfoGroup(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tradeGroup = null;
        } else {
            this.tradeGroup = list;
        }
        if ((i & 2) == 0) {
            this.oldCoinList = null;
        } else {
            this.oldCoinList = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TokenInfoGroup tokenInfoGroup, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tokenInfoGroup.tradeGroup != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], tokenInfoGroup.tradeGroup);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && tokenInfoGroup.oldCoinList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], tokenInfoGroup.oldCoinList);
    }

    public TokenInfoGroup(List<TradeGroupData> list, List<OldCoinInfo> list2) {
        this.tradeGroup = list;
        this.oldCoinList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.tradeapi.bean.TradeGroupData>, java.util.List<com.okinc.unify_trade.biz.OldCoinInfo>):void (m)] (LINE:34) call: com.okinc.unify_trade.biz.TokenInfoGroup.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ TokenInfoGroup(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
