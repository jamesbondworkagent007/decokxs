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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class BotLeadUserOrderPendingSummaryModel implements Parcelable {
    private String page;
    private List<BotLeadUserOrderPendingModel> strategies;
    private String totalCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotLeadUserOrderPendingSummaryModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(BotLeadUserOrderPendingModel$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<BotLeadUserOrderPendingSummaryModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadUserOrderPendingSummaryModel createFromParcel(Parcel parcel) {
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
                    arrayList2.add(BotLeadUserOrderPendingModel.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new BotLeadUserOrderPendingSummaryModel(string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadUserOrderPendingSummaryModel[] newArray(int i) {
            return new BotLeadUserOrderPendingSummaryModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotLeadUserOrderPendingSummaryModel() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.BotLeadUserOrderPendingSummaryModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BotLeadUserOrderPendingSummaryModel copy$default(BotLeadUserOrderPendingSummaryModel botLeadUserOrderPendingSummaryModel, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botLeadUserOrderPendingSummaryModel.totalCount;
        }
        if ((i & 2) != 0) {
            str2 = botLeadUserOrderPendingSummaryModel.page;
        }
        if ((i & 4) != 0) {
            list = botLeadUserOrderPendingSummaryModel.strategies;
        }
        return botLeadUserOrderPendingSummaryModel.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BotLeadUserOrderPendingModel> component3() {
        return this.strategies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotLeadUserOrderPendingSummaryModel copy(String str, String str2, List<BotLeadUserOrderPendingModel> list) {
        return new BotLeadUserOrderPendingSummaryModel(str, str2, list);
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
        if (!(obj instanceof BotLeadUserOrderPendingSummaryModel)) {
            return false;
        }
        BotLeadUserOrderPendingSummaryModel botLeadUserOrderPendingSummaryModel = (BotLeadUserOrderPendingSummaryModel) obj;
        return Intrinsics.EZpvd((Object) this.totalCount, (Object) botLeadUserOrderPendingSummaryModel.totalCount) && Intrinsics.EZpvd((Object) this.page, (Object) botLeadUserOrderPendingSummaryModel.page) && Intrinsics.EZpvd(this.strategies, botLeadUserOrderPendingSummaryModel.strategies);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPage() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BotLeadUserOrderPendingModel> getStrategies() {
        return this.strategies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalCount() {
        return this.totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.totalCount;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.page;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        List<BotLeadUserOrderPendingModel> list = this.strategies;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPage(String str) {
        this.page = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrategies(List<BotLeadUserOrderPendingModel> list) {
        this.strategies = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalCount(String str) {
        this.totalCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotLeadUserOrderPendingSummaryModel(totalCount=" + this.totalCount + ", page=" + this.page + ", strategies=" + this.strategies + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.totalCount);
        parcel.writeString(this.page);
        List<BotLeadUserOrderPendingModel> list = this.strategies;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<BotLeadUserOrderPendingModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BotLeadUserOrderPendingSummaryModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotLeadUserOrderPendingSummaryModel> serializer() {
            return BotLeadUserOrderPendingSummaryModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotLeadUserOrderPendingSummaryModel(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.totalCount = null;
        } else {
            this.totalCount = str;
        }
        if ((i & 2) == 0) {
            this.page = null;
        } else {
            this.page = str2;
        }
        if ((i & 4) == 0) {
            this.strategies = yDY.AhwBna();
        } else {
            this.strategies = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotLeadUserOrderPendingSummaryModel botLeadUserOrderPendingSummaryModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || botLeadUserOrderPendingSummaryModel.totalCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, botLeadUserOrderPendingSummaryModel.totalCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || botLeadUserOrderPendingSummaryModel.page != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, botLeadUserOrderPendingSummaryModel.page);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(botLeadUserOrderPendingSummaryModel.strategies, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], botLeadUserOrderPendingSummaryModel.strategies);
    }

    public BotLeadUserOrderPendingSummaryModel(String str, String str2, List<BotLeadUserOrderPendingModel> list) {
        this.totalCount = str;
        this.page = str2;
        this.strategies = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:3714)) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.BotLeadUserOrderPendingModel>):void (m)] (LINE:3711) call: com.okinc.unify_trade.biz.BotLeadUserOrderPendingSummaryModel.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ BotLeadUserOrderPendingSummaryModel(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? yDY.AhwBna() : list);
    }
}
