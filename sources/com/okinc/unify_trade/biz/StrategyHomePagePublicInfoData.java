package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class StrategyHomePagePublicInfoData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String totalPnl;
    private final String totalStgy;
    private final String totalUserCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StrategyHomePagePublicInfoData copy$default(StrategyHomePagePublicInfoData strategyHomePagePublicInfoData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = strategyHomePagePublicInfoData.totalPnl;
        }
        if ((i & 2) != 0) {
            str2 = strategyHomePagePublicInfoData.totalStgy;
        }
        if ((i & 4) != 0) {
            str3 = strategyHomePagePublicInfoData.totalUserCount;
        }
        return strategyHomePagePublicInfoData.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.totalStgy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.totalUserCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyHomePagePublicInfoData copy(String str, String str2, String str3) {
        return new StrategyHomePagePublicInfoData(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyHomePagePublicInfoData)) {
            return false;
        }
        StrategyHomePagePublicInfoData strategyHomePagePublicInfoData = (StrategyHomePagePublicInfoData) obj;
        return Intrinsics.EZpvd((Object) this.totalPnl, (Object) strategyHomePagePublicInfoData.totalPnl) && Intrinsics.EZpvd((Object) this.totalStgy, (Object) strategyHomePagePublicInfoData.totalStgy) && Intrinsics.EZpvd((Object) this.totalUserCount, (Object) strategyHomePagePublicInfoData.totalUserCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalStgy() {
        return this.totalStgy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalUserCount() {
        return this.totalUserCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.totalPnl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.totalStgy;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.totalUserCount;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyHomePagePublicInfoData(totalPnl=" + this.totalPnl + ", totalStgy=" + this.totalStgy + ", totalUserCount=" + this.totalUserCount + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrategyHomePagePublicInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyHomePagePublicInfoData> serializer() {
            return StrategyHomePagePublicInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StrategyHomePagePublicInfoData(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, StrategyHomePagePublicInfoData$$serializer.INSTANCE.getDescriptor());
        }
        this.totalPnl = str;
        this.totalStgy = str2;
        this.totalUserCount = str3;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StrategyHomePagePublicInfoData strategyHomePagePublicInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, strategyHomePagePublicInfoData.totalPnl);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, strategyHomePagePublicInfoData.totalStgy);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, strategyHomePagePublicInfoData.totalUserCount);
    }

    public StrategyHomePagePublicInfoData(String str, String str2, String str3) {
        this.totalPnl = str;
        this.totalStgy = str2;
        this.totalUserCount = str3;
    }
}
