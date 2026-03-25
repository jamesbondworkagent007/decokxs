package com.okinc.okex.center.bean;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class TxnCurrencyBean {
    private final List<NetworkChain> chains;
    private final String fullName;
    private final String icon;
    private final int id;
    private final String symbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(NetworkChain$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TxnCurrencyBean() {
        this(0, (String) null, (String) null, (String) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.okex.center.bean.TxnCurrencyBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TxnCurrencyBean copy$default(TxnCurrencyBean txnCurrencyBean, int i, String str, String str2, String str3, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = txnCurrencyBean.id;
        }
        if ((i2 & 2) != 0) {
            str = txnCurrencyBean.symbol;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = txnCurrencyBean.fullName;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = txnCurrencyBean.icon;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            list = txnCurrencyBean.chains;
        }
        return txnCurrencyBean.copy(i, str4, str5, str6, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NetworkChain> component5() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxnCurrencyBean copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<NetworkChain> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new TxnCurrencyBean(i, str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TxnCurrencyBean)) {
            return false;
        }
        TxnCurrencyBean txnCurrencyBean = (TxnCurrencyBean) obj;
        return this.id == txnCurrencyBean.id && Intrinsics.EZpvd((Object) this.symbol, (Object) txnCurrencyBean.symbol) && Intrinsics.EZpvd((Object) this.fullName, (Object) txnCurrencyBean.fullName) && Intrinsics.EZpvd((Object) this.icon, (Object) txnCurrencyBean.icon) && Intrinsics.EZpvd(this.chains, txnCurrencyBean.chains);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NetworkChain> getChains() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Integer.hashCode(this.id) * 31) + this.symbol.hashCode()) * 31) + this.fullName.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.chains.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TxnCurrencyBean(id=" + this.id + ", symbol=" + this.symbol + ", fullName=" + this.fullName + ", icon=" + this.icon + ", chains=" + this.chains + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.TxnCurrencyBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TxnCurrencyBean> serializer() {
            return TxnCurrencyBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TxnCurrencyBean(int i, int i2, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.id = (i & 1) == 0 ? -1 : i2;
        if ((i & 2) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str;
        }
        if ((i & 4) == 0) {
            this.fullName = "";
        } else {
            this.fullName = str2;
        }
        if ((i & 8) == 0) {
            this.icon = "";
        } else {
            this.icon = str3;
        }
        if ((i & 16) == 0) {
            this.chains = yDY.AhwBna();
        } else {
            this.chains = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(TxnCurrencyBean txnCurrencyBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || txnCurrencyBean.id != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, txnCurrencyBean.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) txnCurrencyBean.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, txnCurrencyBean.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) txnCurrencyBean.fullName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, txnCurrencyBean.fullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) txnCurrencyBean.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, txnCurrencyBean.icon);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd(txnCurrencyBean.chains, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], txnCurrencyBean.chains);
    }

    public TxnCurrencyBean(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<NetworkChain> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.id = i;
        this.symbol = str;
        this.fullName = str2;
        this.icon = str3;
        this.chains = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r4v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001b: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:13)) : (r8v0 java.util.List))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.okex.center.bean.NetworkChain>):void (m)] (LINE:8) call: com.okinc.okex.center.bean.TxnCurrencyBean.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ TxnCurrencyBean(int i, String str, String str2, String str3, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) == 0 ? str3 : "", (i2 & 16) != 0 ? yDY.AhwBna() : list);
    }
}
