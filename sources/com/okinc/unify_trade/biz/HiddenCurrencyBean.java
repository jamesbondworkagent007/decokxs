package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class HiddenCurrencyBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Boolean searchLimit;
    private final String symbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HiddenCurrencyBean copy$default(HiddenCurrencyBean hiddenCurrencyBean, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hiddenCurrencyBean.symbol;
        }
        if ((i & 2) != 0) {
            bool = hiddenCurrencyBean.searchLimit;
        }
        return hiddenCurrencyBean.copy(str, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.searchLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HiddenCurrencyBean copy(String str, Boolean bool) {
        return new HiddenCurrencyBean(str, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiddenCurrencyBean)) {
            return false;
        }
        HiddenCurrencyBean hiddenCurrencyBean = (HiddenCurrencyBean) obj;
        return Intrinsics.EZpvd((Object) this.symbol, (Object) hiddenCurrencyBean.symbol) && Intrinsics.EZpvd(this.searchLimit, hiddenCurrencyBean.searchLimit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSearchLimit() {
        return this.searchLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.symbol;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.searchLimit;
        return (iHashCode * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HiddenCurrencyBean(symbol=" + this.symbol + ", searchLimit=" + this.searchLimit + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.HiddenCurrencyBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HiddenCurrencyBean> serializer() {
            return HiddenCurrencyBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HiddenCurrencyBean(int i, String str, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, HiddenCurrencyBean$$serializer.INSTANCE.getDescriptor());
        }
        this.symbol = str;
        this.searchLimit = bool;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(HiddenCurrencyBean hiddenCurrencyBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, hiddenCurrencyBean.symbol);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, hiddenCurrencyBean.searchLimit);
    }

    public HiddenCurrencyBean(String str, Boolean bool) {
        this.symbol = str;
        this.searchLimit = bool;
    }
}
