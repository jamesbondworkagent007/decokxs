package com.okinc.unify_trade.manager;

import android.os.Parcel;
import android.os.Parcelable;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class CoinLoanCheckBoxBean implements Parcelable {
    private Boolean buyCheckBox;
    private Boolean record;
    private Boolean sellCheckBox;
    private List<TradeQuoteCcyLoan> tradeQuoteCcyList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CoinLoanCheckBoxBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(TradeQuoteCcyLoan$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<CoinLoanCheckBoxBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinLoanCheckBoxBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList = null;
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(TradeQuoteCcyLoan.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new CoinLoanCheckBoxBean(boolValueOf, boolValueOf2, boolValueOf3, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinLoanCheckBoxBean[] newArray(int i) {
            return new CoinLoanCheckBoxBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinLoanCheckBoxBean() {
        this((Boolean) null, (Boolean) null, (Boolean) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.manager.CoinLoanCheckBoxBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoinLoanCheckBoxBean copy$default(CoinLoanCheckBoxBean coinLoanCheckBoxBean, Boolean bool, Boolean bool2, Boolean bool3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = coinLoanCheckBoxBean.buyCheckBox;
        }
        if ((i & 2) != 0) {
            bool2 = coinLoanCheckBoxBean.sellCheckBox;
        }
        if ((i & 4) != 0) {
            bool3 = coinLoanCheckBoxBean.record;
        }
        if ((i & 8) != 0) {
            list = coinLoanCheckBoxBean.tradeQuoteCcyList;
        }
        return coinLoanCheckBoxBean.copy(bool, bool2, bool3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.buyCheckBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.sellCheckBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.record;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeQuoteCcyLoan> component4() {
        return this.tradeQuoteCcyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinLoanCheckBoxBean copy(Boolean bool, Boolean bool2, Boolean bool3, List<TradeQuoteCcyLoan> list) {
        return new CoinLoanCheckBoxBean(bool, bool2, bool3, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinLoanCheckBoxBean)) {
            return false;
        }
        CoinLoanCheckBoxBean coinLoanCheckBoxBean = (CoinLoanCheckBoxBean) obj;
        return Intrinsics.EZpvd(this.buyCheckBox, coinLoanCheckBoxBean.buyCheckBox) && Intrinsics.EZpvd(this.sellCheckBox, coinLoanCheckBoxBean.sellCheckBox) && Intrinsics.EZpvd(this.record, coinLoanCheckBoxBean.record) && Intrinsics.EZpvd(this.tradeQuoteCcyList, coinLoanCheckBoxBean.tradeQuoteCcyList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getBuyCheckBox() {
        return this.buyCheckBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getRecord() {
        return this.record;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSellCheckBox() {
        return this.sellCheckBox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeQuoteCcyLoan> getTradeQuoteCcyList() {
        return this.tradeQuoteCcyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.buyCheckBox;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.sellCheckBox;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.record;
        int iHashCode3 = bool3 == null ? 0 : bool3.hashCode();
        List<TradeQuoteCcyLoan> list = this.tradeQuoteCcyList;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuyCheckBox(Boolean bool) {
        this.buyCheckBox = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecord(Boolean bool) {
        this.record = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellCheckBox(Boolean bool) {
        this.sellCheckBox = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeQuoteCcyList(List<TradeQuoteCcyLoan> list) {
        this.tradeQuoteCcyList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinLoanCheckBoxBean(buyCheckBox=" + this.buyCheckBox + ", sellCheckBox=" + this.sellCheckBox + ", record=" + this.record + ", tradeQuoteCcyList=" + this.tradeQuoteCcyList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.buyCheckBox;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.sellCheckBox;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.record;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        List<TradeQuoteCcyLoan> list = this.tradeQuoteCcyList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<TradeQuoteCcyLoan> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.manager.CoinLoanCheckBoxBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinLoanCheckBoxBean> serializer() {
            return CoinLoanCheckBoxBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinLoanCheckBoxBean(int i, Boolean bool, Boolean bool2, Boolean bool3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.buyCheckBox = null;
        } else {
            this.buyCheckBox = bool;
        }
        if ((i & 2) == 0) {
            this.sellCheckBox = null;
        } else {
            this.sellCheckBox = bool2;
        }
        if ((i & 4) == 0) {
            this.record = null;
        } else {
            this.record = bool3;
        }
        if ((i & 8) == 0) {
            this.tradeQuoteCcyList = null;
        } else {
            this.tradeQuoteCcyList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(CoinLoanCheckBoxBean coinLoanCheckBoxBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || coinLoanCheckBoxBean.buyCheckBox != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, coinLoanCheckBoxBean.buyCheckBox);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || coinLoanCheckBoxBean.sellCheckBox != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, coinLoanCheckBoxBean.sellCheckBox);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || coinLoanCheckBoxBean.record != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, coinLoanCheckBoxBean.record);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && coinLoanCheckBoxBean.tradeQuoteCcyList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], coinLoanCheckBoxBean.tradeQuoteCcyList);
    }

    public CoinLoanCheckBoxBean(Boolean bool, Boolean bool2, Boolean bool3, List<TradeQuoteCcyLoan> list) {
        this.buyCheckBox = bool;
        this.sellCheckBox = bool2;
        this.record = bool3;
        this.tradeQuoteCcyList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r2v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r4v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.util.List<com.okinc.unify_trade.manager.TradeQuoteCcyLoan>):void (m)] (LINE:13) call: com.okinc.unify_trade.manager.CoinLoanCheckBoxBean.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.util.List):void type: THIS */
    public /* synthetic */ CoinLoanCheckBoxBean(Boolean bool, Boolean bool2, Boolean bool3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : list);
    }
}
