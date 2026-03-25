package com.okinc.okpaymentapi.data.remote.model.experience;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class CryptoListModel {
    private static final KSerializer<Object>[] $childSerializers;

    @SerializedName("balanceAccountType")
    private final String balanceAccountType;

    @SerializedName("baseCurrencies")
    private final List<CurrencyToken> buyCryptoList;

    @SerializedName("quoteCurrencies")
    private final List<BuySellCurrency> buyCurrencyList;

    @SerializedName("sellSupportQuoteCurrencies")
    private final List<BuySellCurrency> sellCurrencyList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CryptoListModel() {
        this((List) null, (List) null, (List) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okpaymentapi.data.remote.model.experience.CryptoListModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoListModel copy$default(CryptoListModel cryptoListModel, List list, List list2, List list3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cryptoListModel.buyCryptoList;
        }
        if ((i & 2) != 0) {
            list2 = cryptoListModel.buyCurrencyList;
        }
        if ((i & 4) != 0) {
            list3 = cryptoListModel.sellCurrencyList;
        }
        if ((i & 8) != 0) {
            str = cryptoListModel.balanceAccountType;
        }
        return cryptoListModel.copy(list, list2, list3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CurrencyToken> component1() {
        return this.buyCryptoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BuySellCurrency> component2() {
        return this.buyCurrencyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BuySellCurrency> component3() {
        return this.sellCurrencyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.balanceAccountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CryptoListModel copy(@NotNull List<CurrencyToken> list, @NotNull List<BuySellCurrency> list2, @NotNull List<BuySellCurrency> list3, String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new CryptoListModel(list, list2, list3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoListModel)) {
            return false;
        }
        CryptoListModel cryptoListModel = (CryptoListModel) obj;
        return Intrinsics.EZpvd(this.buyCryptoList, cryptoListModel.buyCryptoList) && Intrinsics.EZpvd(this.buyCurrencyList, cryptoListModel.buyCurrencyList) && Intrinsics.EZpvd(this.sellCurrencyList, cryptoListModel.sellCurrencyList) && Intrinsics.EZpvd((Object) this.balanceAccountType, (Object) cryptoListModel.balanceAccountType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalanceAccountType() {
        return this.balanceAccountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CurrencyToken> getBuyCryptoList() {
        return this.buyCryptoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BuySellCurrency> getBuyCurrencyList() {
        return this.buyCurrencyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BuySellCurrency> getSellCurrencyList() {
        return this.sellCurrencyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.buyCryptoList.hashCode();
        int iHashCode2 = this.buyCurrencyList.hashCode();
        int iHashCode3 = this.sellCurrencyList.hashCode();
        String str = this.balanceAccountType;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CryptoListModel(buyCryptoList=" + this.buyCryptoList + ", buyCurrencyList=" + this.buyCurrencyList + ", sellCurrencyList=" + this.sellCurrencyList + ", balanceAccountType=" + this.balanceAccountType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.CryptoListModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CryptoListModel> serializer() {
            return CryptoListModel$$serializer.INSTANCE;
        }
    }

    static {
        BuySellCurrency$$serializer buySellCurrency$$serializer = BuySellCurrency$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(CurrencyToken$$serializer.INSTANCE), new ArrayListSerializer(buySellCurrency$$serializer), new ArrayListSerializer(buySellCurrency$$serializer), null};
    }

    public /* synthetic */ CryptoListModel(int i, List list, List list2, List list3, String str, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.balanceAccountType = null;
        } else {
            this.balanceAccountType = str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [11=4] */
    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(CryptoListModel cryptoListModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(cryptoListModel.buyCryptoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], cryptoListModel.buyCryptoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(cryptoListModel.buyCurrencyList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], cryptoListModel.buyCurrencyList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(cryptoListModel.sellCurrencyList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], cryptoListModel.sellCurrencyList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && cryptoListModel.balanceAccountType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, cryptoListModel.balanceAccountType);
    }

    public CryptoListModel(@NotNull List<CurrencyToken> list, @NotNull List<BuySellCurrency> list2, @NotNull List<BuySellCurrency> list3, String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.buyCryptoList = list;
        this.buyCurrencyList = list2;
        this.sellCurrencyList = list3;
        this.balanceAccountType = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:19)) : (r3v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken>, java.util.List<com.okinc.okpaymentapi.data.remote.model.experience.BuySellCurrency>, java.util.List<com.okinc.okpaymentapi.data.remote.model.experience.BuySellCurrency>, java.lang.String):void (m)] (LINE:13) call: com.okinc.okpaymentapi.data.remote.model.experience.CryptoListModel.<init>(java.util.List, java.util.List, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ CryptoListModel(List list, List list2, List list3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? yDY.AhwBna() : list3, (i & 8) != 0 ? null : str);
    }
}
