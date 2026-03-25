package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class StrategyHistoryListReq extends StrategyPendingListReq {
    private String state;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(String str) {
        this.state = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrategyHistoryListReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyHistoryListReq> serializer() {
            return StrategyHistoryListReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyHistoryListReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z, boolean z2, String str18, boolean z3, String str19, String str20, String str21, String str22, SerializationConstructorMarker serializationConstructorMarker) {
        StrategyHistoryListReq strategyHistoryListReq;
        String str23;
        super(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, z, z2, str18, z3, str19, str20, str21, serializationConstructorMarker);
        if ((i & 16777216) == 0) {
            str23 = null;
            strategyHistoryListReq = this;
        } else {
            strategyHistoryListReq = this;
            str23 = str22;
        }
        strategyHistoryListReq.state = str23;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyHistoryListReq strategyHistoryListReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StrategyPendingListReq.write$Self(strategyHistoryListReq, compositeEncoder, serialDescriptor);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) && strategyHistoryListReq.state == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, strategyHistoryListReq.state);
    }

    public StrategyHistoryListReq() {
    }

    @Override // com.okinc.unify_trade.biz.StrategyPendingListReq
    public String toString() {
        return super.toString() + " StrategyHistoryListReq(state=" + this.state + ")";
    }
}
