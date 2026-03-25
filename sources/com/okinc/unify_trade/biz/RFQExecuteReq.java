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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class RFQExecuteReq implements Parcelable {
    private List<RFQCreateLeg> legs;
    private String quoteId;
    private String rfqId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RFQExecuteReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(RFQCreateLeg$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<RFQExecuteReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RFQExecuteReq createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(RFQCreateLeg.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new RFQExecuteReq(string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RFQExecuteReq[] newArray(int i) {
            return new RFQExecuteReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RFQExecuteReq() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.RFQExecuteReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RFQExecuteReq copy$default(RFQExecuteReq rFQExecuteReq, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rFQExecuteReq.rfqId;
        }
        if ((i & 2) != 0) {
            str2 = rFQExecuteReq.quoteId;
        }
        if ((i & 4) != 0) {
            list = rFQExecuteReq.legs;
        }
        return rFQExecuteReq.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.rfqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RFQCreateLeg> component3() {
        return this.legs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RFQExecuteReq copy(String str, String str2, List<RFQCreateLeg> list) {
        return new RFQExecuteReq(str, str2, list);
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
        if (!(obj instanceof RFQExecuteReq)) {
            return false;
        }
        RFQExecuteReq rFQExecuteReq = (RFQExecuteReq) obj;
        return Intrinsics.EZpvd((Object) this.rfqId, (Object) rFQExecuteReq.rfqId) && Intrinsics.EZpvd((Object) this.quoteId, (Object) rFQExecuteReq.quoteId) && Intrinsics.EZpvd(this.legs, rFQExecuteReq.legs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RFQCreateLeg> getLegs() {
        return this.legs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteId() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRfqId() {
        return this.rfqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.rfqId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.quoteId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        List<RFQCreateLeg> list = this.legs;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLegs(List<RFQCreateLeg> list) {
        this.legs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteId(String str) {
        this.quoteId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRfqId(String str) {
        this.rfqId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RFQExecuteReq(rfqId=" + this.rfqId + ", quoteId=" + this.quoteId + ", legs=" + this.legs + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.rfqId);
        parcel.writeString(this.quoteId);
        List<RFQCreateLeg> list = this.legs;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<RFQCreateLeg> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.RFQExecuteReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RFQExecuteReq> serializer() {
            return RFQExecuteReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RFQExecuteReq(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.rfqId = null;
        } else {
            this.rfqId = str;
        }
        if ((i & 2) == 0) {
            this.quoteId = null;
        } else {
            this.quoteId = str2;
        }
        if ((i & 4) == 0) {
            this.legs = null;
        } else {
            this.legs = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(RFQExecuteReq rFQExecuteReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || rFQExecuteReq.rfqId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, rFQExecuteReq.rfqId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || rFQExecuteReq.quoteId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, rFQExecuteReq.quoteId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && rFQExecuteReq.legs == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], rFQExecuteReq.legs);
    }

    public RFQExecuteReq(String str, String str2, List<RFQCreateLeg> list) {
        this.rfqId = str;
        this.quoteId = str2;
        this.legs = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.RFQCreateLeg>):void (m)] (LINE:5172) call: com.okinc.unify_trade.biz.RFQExecuteReq.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ RFQExecuteReq(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
