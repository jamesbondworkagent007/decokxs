package com.okinc.unify_trade.biz;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class MinInvestReq implements Parcelable {
    private String investCcy;
    private List<CoinRatioParam> recurringList;
    private String tradeQuoteCcy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MinInvestReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(CoinRatioParam$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<MinInvestReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MinInvestReq createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(CoinRatioParam.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new MinInvestReq(string, arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MinInvestReq[] newArray(int i) {
            return new MinInvestReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.MinInvestReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MinInvestReq copy$default(MinInvestReq minInvestReq, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = minInvestReq.investCcy;
        }
        if ((i & 2) != 0) {
            list = minInvestReq.recurringList;
        }
        if ((i & 4) != 0) {
            str2 = minInvestReq.tradeQuoteCcy;
        }
        return minInvestReq.copy(str, list, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinRatioParam> component2() {
        return this.recurringList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MinInvestReq copy(@NotNull String str, List<CoinRatioParam> list, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new MinInvestReq(str, list, str2);
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
        if (!(obj instanceof MinInvestReq)) {
            return false;
        }
        MinInvestReq minInvestReq = (MinInvestReq) obj;
        return Intrinsics.EZpvd((Object) this.investCcy, (Object) minInvestReq.investCcy) && Intrinsics.EZpvd(this.recurringList, minInvestReq.recurringList) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) minInvestReq.tradeQuoteCcy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestCcy() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinRatioParam> getRecurringList() {
        return this.recurringList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeQuoteCcy() {
        return this.tradeQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.investCcy.hashCode();
        List<CoinRatioParam> list = this.recurringList;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str = this.tradeQuoteCcy;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.investCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecurringList(List<CoinRatioParam> list) {
        this.recurringList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeQuoteCcy(String str) {
        this.tradeQuoteCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MinInvestReq(investCcy=" + this.investCcy + ", recurringList=" + this.recurringList + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.investCcy);
        List<CoinRatioParam> list = this.recurringList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<CoinRatioParam> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.tradeQuoteCcy);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MinInvestReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MinInvestReq> serializer() {
            return MinInvestReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MinInvestReq(int i, String str, List list, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, MinInvestReq$$serializer.INSTANCE.getDescriptor());
        }
        this.investCcy = str;
        if ((i & 2) == 0) {
            this.recurringList = null;
        } else {
            this.recurringList = list;
        }
        if ((i & 4) == 0) {
            this.tradeQuoteCcy = null;
        } else {
            this.tradeQuoteCcy = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MinInvestReq minInvestReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, minInvestReq.investCcy);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || minInvestReq.recurringList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], minInvestReq.recurringList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && minInvestReq.tradeQuoteCcy == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, minInvestReq.tradeQuoteCcy);
    }

    public MinInvestReq(@NotNull String str, List<CoinRatioParam> list, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.investCcy = str;
        this.recurringList = list;
        this.tradeQuoteCcy = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.util.List<com.okinc.unify_trade.biz.CoinRatioParam>, java.lang.String):void (m)] (LINE:33) call: com.okinc.unify_trade.biz.MinInvestReq.<init>(java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ MinInvestReq(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2);
    }
}
