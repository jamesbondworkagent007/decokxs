package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class OrderQuoteBean implements Parcelable {
    private String coinType;
    private ArrayList<DebtReferBean> debtList;
    private String repayCcy;
    private String repaySz;
    private int source;
    private long time;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OrderQuoteBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(DebtReferBean$$serializer.INSTANCE), null, null, null};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<OrderQuoteBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderQuoteBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(DebtReferBean.CREATOR.createFromParcel(parcel));
            }
            return new OrderQuoteBean(string, string2, arrayList, parcel.readInt(), parcel.readLong(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderQuoteBean[] newArray(int i) {
            return new OrderQuoteBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrderQuoteBean() {
        this((String) null, (String) null, (ArrayList) null, 0, 0L, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.unify_trade.biz.OrderQuoteBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderQuoteBean copy$default(OrderQuoteBean orderQuoteBean, String str, String str2, ArrayList arrayList, int i, long j, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = orderQuoteBean.repayCcy;
        }
        if ((i2 & 2) != 0) {
            str2 = orderQuoteBean.repaySz;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            arrayList = orderQuoteBean.debtList;
        }
        ArrayList arrayList2 = arrayList;
        if ((i2 & 8) != 0) {
            i = orderQuoteBean.source;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            j = orderQuoteBean.time;
        }
        long j2 = j;
        if ((i2 & 32) != 0) {
            str3 = orderQuoteBean.coinType;
        }
        return orderQuoteBean.copy(str, str4, arrayList2, i3, j2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.repayCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.repaySz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DebtReferBean> component3() {
        return this.debtList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.coinType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderQuoteBean copy(@NotNull String str, @NotNull String str2, @NotNull ArrayList<DebtReferBean> arrayList, int i, long j, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new OrderQuoteBean(str, str2, arrayList, i, j, str3);
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
        if (!(obj instanceof OrderQuoteBean)) {
            return false;
        }
        OrderQuoteBean orderQuoteBean = (OrderQuoteBean) obj;
        return Intrinsics.EZpvd((Object) this.repayCcy, (Object) orderQuoteBean.repayCcy) && Intrinsics.EZpvd((Object) this.repaySz, (Object) orderQuoteBean.repaySz) && Intrinsics.EZpvd(this.debtList, orderQuoteBean.debtList) && this.source == orderQuoteBean.source && this.time == orderQuoteBean.time && Intrinsics.EZpvd((Object) this.coinType, (Object) orderQuoteBean.coinType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinType() {
        return this.coinType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DebtReferBean> getDebtList() {
        return this.debtList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRepayCcy() {
        return this.repayCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRepaySz() {
        return this.repaySz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.repayCcy.hashCode() * 31) + this.repaySz.hashCode()) * 31) + this.debtList.hashCode()) * 31) + Integer.hashCode(this.source)) * 31) + Long.hashCode(this.time)) * 31) + this.coinType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDebtList(@NotNull ArrayList<DebtReferBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.debtList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRepayCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.repayCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRepaySz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.repaySz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSource(int i) {
        this.source = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTime(long j) {
        this.time = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderQuoteBean(repayCcy=" + this.repayCcy + ", repaySz=" + this.repaySz + ", debtList=" + this.debtList + ", source=" + this.source + ", time=" + this.time + ", coinType=" + this.coinType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.repayCcy);
        parcel.writeString(this.repaySz);
        ArrayList<DebtReferBean> arrayList = this.debtList;
        parcel.writeInt(arrayList.size());
        Iterator<DebtReferBean> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.source);
        parcel.writeLong(this.time);
        parcel.writeString(this.coinType);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.OrderQuoteBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrderQuoteBean> serializer() {
            return OrderQuoteBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrderQuoteBean(int i, String str, String str2, ArrayList arrayList, int i2, long j, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.repayCcy = "";
        } else {
            this.repayCcy = str;
        }
        if ((i & 2) == 0) {
            this.repaySz = "";
        } else {
            this.repaySz = str2;
        }
        if ((i & 4) == 0) {
            this.debtList = new ArrayList<>();
        } else {
            this.debtList = arrayList;
        }
        if ((i & 8) == 0) {
            this.source = 0;
        } else {
            this.source = i2;
        }
        if ((i & 16) == 0) {
            this.time = 0L;
        } else {
            this.time = j;
        }
        if ((i & 32) == 0) {
            this.coinType = "";
        } else {
            this.coinType = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OrderQuoteBean orderQuoteBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) orderQuoteBean.repayCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, orderQuoteBean.repayCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) orderQuoteBean.repaySz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, orderQuoteBean.repaySz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(orderQuoteBean.debtList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], orderQuoteBean.debtList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || orderQuoteBean.source != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, orderQuoteBean.source);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || orderQuoteBean.time != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 4, orderQuoteBean.time);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) orderQuoteBean.coinType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, orderQuoteBean.coinType);
    }

    public OrderQuoteBean(@NotNull String str, @NotNull String str2, @NotNull ArrayList<DebtReferBean> arrayList, int i, long j, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.repayCcy = str;
        this.repaySz = str2;
        this.debtList = arrayList;
        this.source = i;
        this.time = j;
        this.coinType = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.util.ArrayList:0x0019: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0016: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:79) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r9v0 java.util.ArrayList))
  (wrap:int:0x001f: TERNARY null = ((wrap:int:0x001a: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
  (wrap:long:0x0026: TERNARY null = ((wrap:int:0x0020: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r11v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.DebtReferBean>, int, long, java.lang.String):void (m)] (LINE:76) call: com.okinc.unify_trade.biz.OrderQuoteBean.<init>(java.lang.String, java.lang.String, java.util.ArrayList, int, long, java.lang.String):void type: THIS */
    public /* synthetic */ OrderQuoteBean(String str, String str2, ArrayList arrayList, int i, long j, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? new ArrayList() : arrayList, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? 0L : j, (i2 & 32) != 0 ? "" : str3);
    }
}
