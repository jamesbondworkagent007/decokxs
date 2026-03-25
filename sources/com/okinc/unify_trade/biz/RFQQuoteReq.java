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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class RFQQuoteReq implements Parcelable {
    private final ArrayList<RFQQuoteLegReq> legs;
    private final String quoteId;
    private final String rfqId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RFQQuoteReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(RFQQuoteLegReq$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<RFQQuoteReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RFQQuoteReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(RFQQuoteLegReq.CREATOR.createFromParcel(parcel));
            }
            return new RFQQuoteReq(string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RFQQuoteReq[] newArray(int i) {
            return new RFQQuoteReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RFQQuoteReq() {
        this((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.RFQQuoteReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RFQQuoteReq copy$default(RFQQuoteReq rFQQuoteReq, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rFQQuoteReq.rfqId;
        }
        if ((i & 2) != 0) {
            str2 = rFQQuoteReq.quoteId;
        }
        if ((i & 4) != 0) {
            arrayList = rFQQuoteReq.legs;
        }
        return rFQQuoteReq.copy(str, str2, arrayList);
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
    public final ArrayList<RFQQuoteLegReq> component3() {
        return this.legs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RFQQuoteReq copy(@NotNull String str, @NotNull String str2, @NotNull ArrayList<RFQQuoteLegReq> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new RFQQuoteReq(str, str2, arrayList);
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
        if (!(obj instanceof RFQQuoteReq)) {
            return false;
        }
        RFQQuoteReq rFQQuoteReq = (RFQQuoteReq) obj;
        return Intrinsics.EZpvd((Object) this.rfqId, (Object) rFQQuoteReq.rfqId) && Intrinsics.EZpvd((Object) this.quoteId, (Object) rFQQuoteReq.quoteId) && Intrinsics.EZpvd(this.legs, rFQQuoteReq.legs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<RFQQuoteLegReq> getLegs() {
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
        return (((this.rfqId.hashCode() * 31) + this.quoteId.hashCode()) * 31) + this.legs.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RFQQuoteReq(rfqId=" + this.rfqId + ", quoteId=" + this.quoteId + ", legs=" + this.legs + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.rfqId);
        parcel.writeString(this.quoteId);
        ArrayList<RFQQuoteLegReq> arrayList = this.legs;
        parcel.writeInt(arrayList.size());
        Iterator<RFQQuoteLegReq> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.RFQQuoteReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RFQQuoteReq> serializer() {
            return RFQQuoteReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RFQQuoteReq(int i, String str, String str2, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.rfqId = "";
        } else {
            this.rfqId = str;
        }
        if ((i & 2) == 0) {
            this.quoteId = "";
        } else {
            this.quoteId = str2;
        }
        if ((i & 4) == 0) {
            this.legs = new ArrayList<>();
        } else {
            this.legs = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(RFQQuoteReq rFQQuoteReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) rFQQuoteReq.rfqId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, rFQQuoteReq.rfqId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) rFQQuoteReq.quoteId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, rFQQuoteReq.quoteId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(rFQQuoteReq.legs, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], rFQQuoteReq.legs);
    }

    public RFQQuoteReq(@NotNull String str, @NotNull String str2, @NotNull ArrayList<RFQQuoteLegReq> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.rfqId = str;
        this.quoteId = str2;
        this.legs = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0012: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:5252) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r4v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.RFQQuoteLegReq>):void (m)] (LINE:5249) call: com.okinc.unify_trade.biz.RFQQuoteReq.<init>(java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ RFQQuoteReq(String str, String str2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new ArrayList() : arrayList);
    }
}
