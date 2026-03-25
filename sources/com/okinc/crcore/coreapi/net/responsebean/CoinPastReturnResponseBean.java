package com.okinc.crcore.coreapi.net.responsebean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class CoinPastReturnResponseBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String coinYearReturn;
    private final String marketYearReturn;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinPastReturnResponseBean() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CoinPastReturnResponseBean copy$default(CoinPastReturnResponseBean coinPastReturnResponseBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coinPastReturnResponseBean.coinYearReturn;
        }
        if ((i & 2) != 0) {
            str2 = coinPastReturnResponseBean.marketYearReturn;
        }
        return coinPastReturnResponseBean.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coinYearReturn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.marketYearReturn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinPastReturnResponseBean copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CoinPastReturnResponseBean(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinPastReturnResponseBean)) {
            return false;
        }
        CoinPastReturnResponseBean coinPastReturnResponseBean = (CoinPastReturnResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.coinYearReturn, (Object) coinPastReturnResponseBean.coinYearReturn) && Intrinsics.EZpvd((Object) this.marketYearReturn, (Object) coinPastReturnResponseBean.marketYearReturn);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinYearReturn() {
        return this.coinYearReturn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketYearReturn() {
        return this.marketYearReturn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.coinYearReturn.hashCode() * 31) + this.marketYearReturn.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinPastReturnResponseBean(coinYearReturn=" + this.coinYearReturn + ", marketYearReturn=" + this.marketYearReturn + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.CoinPastReturnResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinPastReturnResponseBean> serializer() {
            return CoinPastReturnResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinPastReturnResponseBean(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinYearReturn = "";
        } else {
            this.coinYearReturn = str;
        }
        if ((i & 2) == 0) {
            this.marketYearReturn = "";
        } else {
            this.marketYearReturn = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(CoinPastReturnResponseBean coinPastReturnResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) coinPastReturnResponseBean.coinYearReturn, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, coinPastReturnResponseBean.coinYearReturn);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) coinPastReturnResponseBean.marketYearReturn, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, coinPastReturnResponseBean.marketYearReturn);
    }

    public CoinPastReturnResponseBean(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.coinYearReturn = str;
        this.marketYearReturn = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.crcore.coreapi.net.responsebean.CoinPastReturnResponseBean.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CoinPastReturnResponseBean(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
