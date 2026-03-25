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
public final class BotLeadUserOrderHistorySummaryModel implements Parcelable {
    private String page;
    private List<BotLeadUserOrderHistoryModel> strategies;
    private String totalCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotLeadUserOrderHistorySummaryModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(BotLeadUserOrderHistoryModel$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<BotLeadUserOrderHistorySummaryModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadUserOrderHistorySummaryModel createFromParcel(Parcel parcel) {
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
                    arrayList2.add(BotLeadUserOrderHistoryModel.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new BotLeadUserOrderHistorySummaryModel(string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadUserOrderHistorySummaryModel[] newArray(int i) {
            return new BotLeadUserOrderHistorySummaryModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotLeadUserOrderHistorySummaryModel() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.BotLeadUserOrderHistorySummaryModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BotLeadUserOrderHistorySummaryModel copy$default(BotLeadUserOrderHistorySummaryModel botLeadUserOrderHistorySummaryModel, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botLeadUserOrderHistorySummaryModel.totalCount;
        }
        if ((i & 2) != 0) {
            str2 = botLeadUserOrderHistorySummaryModel.page;
        }
        if ((i & 4) != 0) {
            list = botLeadUserOrderHistorySummaryModel.strategies;
        }
        return botLeadUserOrderHistorySummaryModel.copy(str, str2, list);
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
    public final List<BotLeadUserOrderHistoryModel> component3() {
        return this.strategies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotLeadUserOrderHistorySummaryModel copy(String str, String str2, List<BotLeadUserOrderHistoryModel> list) {
        return new BotLeadUserOrderHistorySummaryModel(str, str2, list);
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
        if (!(obj instanceof BotLeadUserOrderHistorySummaryModel)) {
            return false;
        }
        BotLeadUserOrderHistorySummaryModel botLeadUserOrderHistorySummaryModel = (BotLeadUserOrderHistorySummaryModel) obj;
        return Intrinsics.EZpvd((Object) this.totalCount, (Object) botLeadUserOrderHistorySummaryModel.totalCount) && Intrinsics.EZpvd((Object) this.page, (Object) botLeadUserOrderHistorySummaryModel.page) && Intrinsics.EZpvd(this.strategies, botLeadUserOrderHistorySummaryModel.strategies);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPage() {
        return this.page;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BotLeadUserOrderHistoryModel> getStrategies() {
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
        List<BotLeadUserOrderHistoryModel> list = this.strategies;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPage(String str) {
        this.page = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrategies(List<BotLeadUserOrderHistoryModel> list) {
        this.strategies = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalCount(String str) {
        this.totalCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotLeadUserOrderHistorySummaryModel(totalCount=" + this.totalCount + ", page=" + this.page + ", strategies=" + this.strategies + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.totalCount);
        parcel.writeString(this.page);
        List<BotLeadUserOrderHistoryModel> list = this.strategies;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<BotLeadUserOrderHistoryModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BotLeadUserOrderHistorySummaryModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotLeadUserOrderHistorySummaryModel> serializer() {
            return BotLeadUserOrderHistorySummaryModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotLeadUserOrderHistorySummaryModel(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.strategies = null;
        } else {
            this.strategies = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotLeadUserOrderHistorySummaryModel botLeadUserOrderHistorySummaryModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || botLeadUserOrderHistorySummaryModel.totalCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, botLeadUserOrderHistorySummaryModel.totalCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || botLeadUserOrderHistorySummaryModel.page != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, botLeadUserOrderHistorySummaryModel.page);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && botLeadUserOrderHistorySummaryModel.strategies == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], botLeadUserOrderHistorySummaryModel.strategies);
    }

    public BotLeadUserOrderHistorySummaryModel(String str, String str2, List<BotLeadUserOrderHistoryModel> list) {
        this.totalCount = str;
        this.page = str2;
        this.strategies = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.BotLeadUserOrderHistoryModel>):void (m)] (LINE:3675) call: com.okinc.unify_trade.biz.BotLeadUserOrderHistorySummaryModel.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ BotLeadUserOrderHistorySummaryModel(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
