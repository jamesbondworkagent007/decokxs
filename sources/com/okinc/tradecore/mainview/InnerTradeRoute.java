package com.okinc.tradecore.mainview;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class InnerTradeRoute {
    private String instId;
    private String instType;
    private final boolean isManual;
    private final String strategyType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InnerTradeRoute copy$default(InnerTradeRoute innerTradeRoute, boolean z, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = innerTradeRoute.isManual;
        }
        if ((i & 2) != 0) {
            str = innerTradeRoute.strategyType;
        }
        if ((i & 4) != 0) {
            str2 = innerTradeRoute.instId;
        }
        if ((i & 8) != 0) {
            str3 = innerTradeRoute.instType;
        }
        return innerTradeRoute.copy(z, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isManual;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InnerTradeRoute copy(boolean z, String str, String str2, String str3) {
        return new InnerTradeRoute(z, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerTradeRoute)) {
            return false;
        }
        InnerTradeRoute innerTradeRoute = (InnerTradeRoute) obj;
        return this.isManual == innerTradeRoute.isManual && Intrinsics.EZpvd((Object) this.strategyType, (Object) innerTradeRoute.strategyType) && Intrinsics.EZpvd((Object) this.instId, (Object) innerTradeRoute.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) innerTradeRoute.instType);
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
    public final String getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isManual);
        String str = this.strategyType;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.instId;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.instType;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isManual() {
        return this.isManual;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(String str) {
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(String str) {
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InnerTradeRoute(isManual=" + this.isManual + ", strategyType=" + this.strategyType + ", instId=" + this.instId + ", instType=" + this.instType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradecore.mainview.InnerTradeRoute.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InnerTradeRoute> serializer() {
            return InnerTradeRoute$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InnerTradeRoute(int i, boolean z, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, InnerTradeRoute$$serializer.INSTANCE.getDescriptor());
        }
        this.isManual = z;
        this.strategyType = str;
        this.instId = str2;
        this.instType = str3;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(InnerTradeRoute innerTradeRoute, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, innerTradeRoute.isManual);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, innerTradeRoute.strategyType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, innerTradeRoute.instId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, innerTradeRoute.instType);
    }

    public InnerTradeRoute(boolean z, String str, String str2, String str3) {
        this.isManual = z;
        this.strategyType = str;
        this.instId = str2;
        this.instType = str3;
    }
}
