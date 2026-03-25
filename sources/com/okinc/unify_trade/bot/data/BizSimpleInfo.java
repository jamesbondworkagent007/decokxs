package com.okinc.unify_trade.bot.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class BizSimpleInfo {
    private final String instId;
    private String instType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BizSimpleInfo copy$default(BizSimpleInfo bizSimpleInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bizSimpleInfo.instType;
        }
        if ((i & 2) != 0) {
            str2 = bizSimpleInfo.instId;
        }
        return bizSimpleInfo.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizSimpleInfo copy(String str, String str2) {
        return new BizSimpleInfo(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BizSimpleInfo)) {
            return false;
        }
        BizSimpleInfo bizSimpleInfo = (BizSimpleInfo) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) bizSimpleInfo.instType) && Intrinsics.EZpvd((Object) this.instId, (Object) bizSimpleInfo.instId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.instType;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.instId;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(String str) {
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BizSimpleInfo(instType=" + this.instType + ", instId=" + this.instId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.data.BizSimpleInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BizSimpleInfo> serializer() {
            return BizSimpleInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BizSimpleInfo(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, BizSimpleInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.instType = str;
        this.instId = str2;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BizSimpleInfo bizSimpleInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, bizSimpleInfo.instType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, bizSimpleInfo.instId);
    }

    public BizSimpleInfo(String str, String str2) {
        this.instType = str;
        this.instId = str2;
    }
}
