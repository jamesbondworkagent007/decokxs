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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class RFQCreateReq implements Parcelable {
    private List<String> counterparties;
    private List<RFQCreateLeg> legs;
    private final Boolean reduceOnly;
    private String strategy;
    private String tag;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RFQCreateReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null, new ArrayListSerializer(RFQCreateLeg$$serializer.INSTANCE), null, null};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<RFQCreateReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RFQCreateReq createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(RFQCreateLeg.CREATOR.createFromParcel(parcel));
                }
            }
            return new RFQCreateReq(arrayListCreateStringArrayList, string, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RFQCreateReq[] newArray(int i) {
            return new RFQCreateReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RFQCreateReq() {
        this((List) null, (String) null, (List) null, (String) null, (Boolean) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.unify_trade.biz.RFQCreateReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RFQCreateReq copy$default(RFQCreateReq rFQCreateReq, List list, String str, List list2, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = rFQCreateReq.counterparties;
        }
        if ((i & 2) != 0) {
            str = rFQCreateReq.tag;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            list2 = rFQCreateReq.legs;
        }
        List list3 = list2;
        if ((i & 8) != 0) {
            str2 = rFQCreateReq.strategy;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            bool = rFQCreateReq.reduceOnly;
        }
        return rFQCreateReq.copy(list, str3, list3, str4, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.counterparties;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RFQCreateLeg> component3() {
        return this.legs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.strategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RFQCreateReq copy(List<String> list, String str, List<RFQCreateLeg> list2, @NotNull String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str2, "");
        return new RFQCreateReq(list, str, list2, str2, bool);
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
        if (!(obj instanceof RFQCreateReq)) {
            return false;
        }
        RFQCreateReq rFQCreateReq = (RFQCreateReq) obj;
        return Intrinsics.EZpvd(this.counterparties, rFQCreateReq.counterparties) && Intrinsics.EZpvd((Object) this.tag, (Object) rFQCreateReq.tag) && Intrinsics.EZpvd(this.legs, rFQCreateReq.legs) && Intrinsics.EZpvd((Object) this.strategy, (Object) rFQCreateReq.strategy) && Intrinsics.EZpvd(this.reduceOnly, rFQCreateReq.reduceOnly);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCounterparties() {
        return this.counterparties;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RFQCreateLeg> getLegs() {
        return this.legs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getReduceOnly() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategy() {
        return this.strategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<String> list = this.counterparties;
        int iHashCode = list == null ? 0 : list.hashCode();
        String str = this.tag;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        List<RFQCreateLeg> list2 = this.legs;
        int iHashCode3 = list2 == null ? 0 : list2.hashCode();
        int iHashCode4 = this.strategy.hashCode();
        Boolean bool = this.reduceOnly;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCounterparties(List<String> list) {
        this.counterparties = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLegs(List<RFQCreateLeg> list) {
        this.legs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrategy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.strategy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(String str) {
        this.tag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RFQCreateReq(counterparties=" + this.counterparties + ", tag=" + this.tag + ", legs=" + this.legs + ", strategy=" + this.strategy + ", reduceOnly=" + this.reduceOnly + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.counterparties);
        parcel.writeString(this.tag);
        List<RFQCreateLeg> list = this.legs;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<RFQCreateLeg> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.strategy);
        Boolean bool = this.reduceOnly;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.RFQCreateReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RFQCreateReq> serializer() {
            return RFQCreateReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RFQCreateReq(int i, List list, String str, List list2, String str2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.counterparties = null;
        } else {
            this.counterparties = list;
        }
        if ((i & 2) == 0) {
            this.tag = null;
        } else {
            this.tag = str;
        }
        if ((i & 4) == 0) {
            this.legs = null;
        } else {
            this.legs = list2;
        }
        if ((i & 8) == 0) {
            this.strategy = "";
        } else {
            this.strategy = str2;
        }
        if ((i & 16) == 0) {
            this.reduceOnly = null;
        } else {
            this.reduceOnly = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(RFQCreateReq rFQCreateReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || rFQCreateReq.counterparties != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], rFQCreateReq.counterparties);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || rFQCreateReq.tag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, rFQCreateReq.tag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || rFQCreateReq.legs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], rFQCreateReq.legs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) rFQCreateReq.strategy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, rFQCreateReq.strategy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && rFQCreateReq.reduceOnly == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, rFQCreateReq.reduceOnly);
    }

    public RFQCreateReq(List<String> list, String str, List<RFQCreateLeg> list2, @NotNull String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.counterparties = list;
        this.tag = str;
        this.legs = list2;
        this.strategy = str2;
        this.reduceOnly = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r7v0 java.util.List))
  (wrap:java.lang.String:0x001c: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r9v0 java.lang.Boolean))
 A[MD:(java.util.List<java.lang.String>, java.lang.String, java.util.List<com.okinc.unify_trade.biz.RFQCreateLeg>, java.lang.String, java.lang.Boolean):void (m)] (LINE:5106) call: com.okinc.unify_trade.biz.RFQCreateReq.<init>(java.util.List, java.lang.String, java.util.List, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ RFQCreateReq(List list, String str, List list2, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : bool);
    }
}
