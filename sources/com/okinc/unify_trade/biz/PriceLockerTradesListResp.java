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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class PriceLockerTradesListResp implements Parcelable {
    private String page;
    private String reqId;
    private String totalCount;
    private ArrayList<PriceLockerTradeBean> trades;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PriceLockerTradesListResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(PriceLockerTradeBean$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<PriceLockerTradesListResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceLockerTradesListResp createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(PriceLockerTradeBean.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new PriceLockerTradesListResp(string, string2, string3, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceLockerTradesListResp[] newArray(int i) {
            return new PriceLockerTradesListResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PriceLockerTradesListResp() {
        this((String) null, (String) null, (String) null, (ArrayList) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.PriceLockerTradesListResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PriceLockerTradesListResp copy$default(PriceLockerTradesListResp priceLockerTradesListResp, String str, String str2, String str3, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = priceLockerTradesListResp.page;
        }
        if ((i & 2) != 0) {
            str2 = priceLockerTradesListResp.totalCount;
        }
        if ((i & 4) != 0) {
            str3 = priceLockerTradesListResp.reqId;
        }
        if ((i & 8) != 0) {
            arrayList = priceLockerTradesListResp.trades;
        }
        return priceLockerTradesListResp.copy(str, str2, str3, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.reqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<PriceLockerTradeBean> component4() {
        return this.trades;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceLockerTradesListResp copy(String str, String str2, String str3, ArrayList<PriceLockerTradeBean> arrayList) {
        return new PriceLockerTradesListResp(str, str2, str3, arrayList);
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
        if (!(obj instanceof PriceLockerTradesListResp)) {
            return false;
        }
        PriceLockerTradesListResp priceLockerTradesListResp = (PriceLockerTradesListResp) obj;
        return Intrinsics.EZpvd((Object) this.page, (Object) priceLockerTradesListResp.page) && Intrinsics.EZpvd((Object) this.totalCount, (Object) priceLockerTradesListResp.totalCount) && Intrinsics.EZpvd((Object) this.reqId, (Object) priceLockerTradesListResp.reqId) && Intrinsics.EZpvd(this.trades, priceLockerTradesListResp.trades);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPage() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReqId() {
        return this.reqId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalCount() {
        return this.totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<PriceLockerTradeBean> getTrades() {
        return this.trades;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.page;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.totalCount;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.reqId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        ArrayList<PriceLockerTradeBean> arrayList = this.trades;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPage(String str) {
        this.page = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReqId(String str) {
        this.reqId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalCount(String str) {
        this.totalCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrades(ArrayList<PriceLockerTradeBean> arrayList) {
        this.trades = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PriceLockerTradesListResp(page=" + this.page + ", totalCount=" + this.totalCount + ", reqId=" + this.reqId + ", trades=" + this.trades + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.page);
        parcel.writeString(this.totalCount);
        parcel.writeString(this.reqId);
        ArrayList<PriceLockerTradeBean> arrayList = this.trades;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<PriceLockerTradeBean> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.PriceLockerTradesListResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PriceLockerTradesListResp> serializer() {
            return PriceLockerTradesListResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PriceLockerTradesListResp(int i, String str, String str2, String str3, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.page = null;
        } else {
            this.page = str;
        }
        if ((i & 2) == 0) {
            this.totalCount = null;
        } else {
            this.totalCount = str2;
        }
        if ((i & 4) == 0) {
            this.reqId = null;
        } else {
            this.reqId = str3;
        }
        if ((i & 8) == 0) {
            this.trades = null;
        } else {
            this.trades = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(PriceLockerTradesListResp priceLockerTradesListResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || priceLockerTradesListResp.page != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, priceLockerTradesListResp.page);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || priceLockerTradesListResp.totalCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, priceLockerTradesListResp.totalCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || priceLockerTradesListResp.reqId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, priceLockerTradesListResp.reqId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && priceLockerTradesListResp.trades == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], priceLockerTradesListResp.trades);
    }

    public PriceLockerTradesListResp(String str, String str2, String str3, ArrayList<PriceLockerTradeBean> arrayList) {
        this.page = str;
        this.totalCount = str2;
        this.reqId = str3;
        this.trades = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r5v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.unify_trade.biz.PriceLockerTradeBean>):void (m)] (LINE:209) call: com.okinc.unify_trade.biz.PriceLockerTradesListResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ PriceLockerTradesListResp(String str, String str2, String str3, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : arrayList);
    }
}
