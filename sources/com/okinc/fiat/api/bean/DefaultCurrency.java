package com.okinc.fiat.api.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class DefaultCurrency {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String buy;
    private final String sell;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefaultCurrency() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DefaultCurrency copy$default(DefaultCurrency defaultCurrency, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = defaultCurrency.buy;
        }
        if ((i & 2) != 0) {
            str2 = defaultCurrency.sell;
        }
        return defaultCurrency.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.buy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.sell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefaultCurrency copy(String str, String str2) {
        return new DefaultCurrency(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultCurrency)) {
            return false;
        }
        DefaultCurrency defaultCurrency = (DefaultCurrency) obj;
        return Intrinsics.EZpvd((Object) this.buy, (Object) defaultCurrency.buy) && Intrinsics.EZpvd((Object) this.sell, (Object) defaultCurrency.sell);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuy() {
        return this.buy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSell() {
        return this.sell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.buy;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.sell;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DefaultCurrency(buy=" + this.buy + ", sell=" + this.sell + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.fiat.api.bean.DefaultCurrency.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DefaultCurrency> serializer() {
            return DefaultCurrency$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DefaultCurrency(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.buy = null;
        } else {
            this.buy = str;
        }
        if ((i & 2) == 0) {
            this.sell = null;
        } else {
            this.sell = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(DefaultCurrency defaultCurrency, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || defaultCurrency.buy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, defaultCurrency.buy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && defaultCurrency.sell == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, defaultCurrency.sell);
    }

    public DefaultCurrency(String str, String str2) {
        this.buy = str;
        this.sell = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.fiat.api.bean.DefaultCurrency.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DefaultCurrency(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
