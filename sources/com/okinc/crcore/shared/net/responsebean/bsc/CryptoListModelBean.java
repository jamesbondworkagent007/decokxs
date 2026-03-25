package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.crcore.coreapi.net.responsebean.bsc.BuySellCurrencyResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.CryptoListModelResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.CurrencyTokenResponseBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class CryptoListModelBean {
    private static final KSerializer<Object>[] $childSerializers;
    private final String balanceAccountType;
    private final List<CurrencyTokenBean> buyCryptoList;
    private final List<BuySellCurrencyBean> buyCurrencyList;
    private final List<BuySellCurrencyBean> sellCurrencyList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CryptoListModelBean() {
        this((List) null, (List) null, (List) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.shared.net.responsebean.bsc.CryptoListModelBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoListModelBean copy$default(CryptoListModelBean cryptoListModelBean, List list, List list2, List list3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cryptoListModelBean.buyCryptoList;
        }
        if ((i & 2) != 0) {
            list2 = cryptoListModelBean.buyCurrencyList;
        }
        if ((i & 4) != 0) {
            list3 = cryptoListModelBean.sellCurrencyList;
        }
        if ((i & 8) != 0) {
            str = cryptoListModelBean.balanceAccountType;
        }
        return cryptoListModelBean.copy(list, list2, list3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CurrencyTokenBean> component1() {
        return this.buyCryptoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BuySellCurrencyBean> component2() {
        return this.buyCurrencyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BuySellCurrencyBean> component3() {
        return this.sellCurrencyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.balanceAccountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CryptoListModelBean copy(@NotNull List<CurrencyTokenBean> list, @NotNull List<BuySellCurrencyBean> list2, @NotNull List<BuySellCurrencyBean> list3, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new CryptoListModelBean(list, list2, list3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoListModelBean)) {
            return false;
        }
        CryptoListModelBean cryptoListModelBean = (CryptoListModelBean) obj;
        return Intrinsics.EZpvd(this.buyCryptoList, cryptoListModelBean.buyCryptoList) && Intrinsics.EZpvd(this.buyCurrencyList, cryptoListModelBean.buyCurrencyList) && Intrinsics.EZpvd(this.sellCurrencyList, cryptoListModelBean.sellCurrencyList) && Intrinsics.EZpvd((Object) this.balanceAccountType, (Object) cryptoListModelBean.balanceAccountType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalanceAccountType() {
        return this.balanceAccountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CurrencyTokenBean> getBuyCryptoList() {
        return this.buyCryptoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BuySellCurrencyBean> getBuyCurrencyList() {
        return this.buyCurrencyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BuySellCurrencyBean> getSellCurrencyList() {
        return this.sellCurrencyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.buyCryptoList.hashCode() * 31) + this.buyCurrencyList.hashCode()) * 31) + this.sellCurrencyList.hashCode()) * 31) + this.balanceAccountType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CryptoListModelBean(buyCryptoList=" + this.buyCryptoList + ", buyCurrencyList=" + this.buyCurrencyList + ", sellCurrencyList=" + this.sellCurrencyList + ", balanceAccountType=" + this.balanceAccountType + ")";
    }

    public /* synthetic */ CryptoListModelBean(int i, List list, List list2, List list3, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.buyCryptoList = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.buyCurrencyList = yDY.AhwBna();
        } else {
            this.buyCurrencyList = list2;
        }
        if ((i & 4) == 0) {
            this.sellCurrencyList = yDY.AhwBna();
        } else {
            this.sellCurrencyList = list3;
        }
        if ((i & 8) == 0) {
            this.balanceAccountType = "";
        } else {
            this.balanceAccountType = str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [7=4] */
    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(CryptoListModelBean cryptoListModelBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(cryptoListModelBean.buyCryptoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], cryptoListModelBean.buyCryptoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(cryptoListModelBean.buyCurrencyList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], cryptoListModelBean.buyCurrencyList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(cryptoListModelBean.sellCurrencyList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], cryptoListModelBean.sellCurrencyList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) cryptoListModelBean.balanceAccountType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, cryptoListModelBean.balanceAccountType);
    }

    public CryptoListModelBean(@NotNull List<CurrencyTokenBean> list, @NotNull List<BuySellCurrencyBean> list2, @NotNull List<BuySellCurrencyBean> list3, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.buyCryptoList = list;
        this.buyCurrencyList = list2;
        this.sellCurrencyList = list3;
        this.balanceAccountType = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:10)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r3v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.crcore.shared.net.responsebean.bsc.CurrencyTokenBean>, java.util.List<com.okinc.crcore.shared.net.responsebean.bsc.BuySellCurrencyBean>, java.util.List<com.okinc.crcore.shared.net.responsebean.bsc.BuySellCurrencyBean>, java.lang.String):void (m)] (LINE:9) call: com.okinc.crcore.shared.net.responsebean.bsc.CryptoListModelBean.<init>(java.util.List, java.util.List, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ CryptoListModelBean(List list, List list2, List list3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? yDY.AhwBna() : list3, (i & 8) != 0 ? "" : str);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.CryptoListModelBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CryptoListModelBean> serializer() {
            return CryptoListModelBean$$serializer.INSTANCE;
        }

        public final CryptoListModelBean AEQbTJ(@NotNull CryptoListModelResponseBean cryptoListModelResponseBean) {
            Intrinsics.checkNotNullParameter(cryptoListModelResponseBean, "");
            List<CurrencyTokenResponseBean> baseCurrencies = cryptoListModelResponseBean.getBaseCurrencies();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(baseCurrencies, 10));
            Iterator<T> it = baseCurrencies.iterator();
            while (it.hasNext()) {
                arrayList.add(CurrencyTokenBean.Companion.OLrzqt((CurrencyTokenResponseBean) it.next()));
            }
            List<BuySellCurrencyResponseBean> quoteCurrencies = cryptoListModelResponseBean.getQuoteCurrencies();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(quoteCurrencies, 10));
            Iterator<T> it2 = quoteCurrencies.iterator();
            while (it2.hasNext()) {
                arrayList2.add(BuySellCurrencyBean.Companion.AEQbTJ((BuySellCurrencyResponseBean) it2.next()));
            }
            List<BuySellCurrencyResponseBean> sellSupportQuoteCurrencies = cryptoListModelResponseBean.getSellSupportQuoteCurrencies();
            ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(sellSupportQuoteCurrencies, 10));
            Iterator<T> it3 = sellSupportQuoteCurrencies.iterator();
            while (it3.hasNext()) {
                arrayList3.add(BuySellCurrencyBean.Companion.AEQbTJ((BuySellCurrencyResponseBean) it3.next()));
            }
            return new CryptoListModelBean(arrayList, arrayList2, arrayList3, cryptoListModelResponseBean.getBalanceAccountType());
        }
    }

    static {
        BuySellCurrencyBean$$serializer buySellCurrencyBean$$serializer = BuySellCurrencyBean$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(CurrencyTokenBean$$serializer.INSTANCE), new ArrayListSerializer(buySellCurrencyBean$$serializer), new ArrayListSerializer(buySellCurrencyBean$$serializer), null};
    }
}
