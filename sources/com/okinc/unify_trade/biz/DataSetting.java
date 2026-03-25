package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class DataSetting implements Parcelable {
    private final String aiThinkingInterval;
    private final List<String> kLineLevels;
    private final List<TechnicalIndex> technicalIndexes;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DataSetting> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), new ArrayListSerializer(TechnicalIndex$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<DataSetting> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataSetting createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TechnicalIndex.CREATOR.createFromParcel(parcel));
            }
            return new DataSetting(string, arrayListCreateStringArrayList, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataSetting[] newArray(int i) {
            return new DataSetting[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DataSetting() {
        this((String) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.DataSetting */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataSetting copy$default(DataSetting dataSetting, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataSetting.aiThinkingInterval;
        }
        if ((i & 2) != 0) {
            list = dataSetting.kLineLevels;
        }
        if ((i & 4) != 0) {
            list2 = dataSetting.technicalIndexes;
        }
        return dataSetting.copy(str, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.aiThinkingInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.kLineLevels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TechnicalIndex> component3() {
        return this.technicalIndexes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DataSetting copy(@NotNull String str, @NotNull List<String> list, @NotNull List<TechnicalIndex> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new DataSetting(str, list, list2);
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
        if (!(obj instanceof DataSetting)) {
            return false;
        }
        DataSetting dataSetting = (DataSetting) obj;
        return Intrinsics.EZpvd((Object) this.aiThinkingInterval, (Object) dataSetting.aiThinkingInterval) && Intrinsics.EZpvd(this.kLineLevels, dataSetting.kLineLevels) && Intrinsics.EZpvd(this.technicalIndexes, dataSetting.technicalIndexes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAiThinkingInterval() {
        return this.aiThinkingInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getKLineLevels() {
        return this.kLineLevels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TechnicalIndex> getTechnicalIndexes() {
        return this.technicalIndexes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.aiThinkingInterval.hashCode() * 31) + this.kLineLevels.hashCode()) * 31) + this.technicalIndexes.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DataSetting(aiThinkingInterval=" + this.aiThinkingInterval + ", kLineLevels=" + this.kLineLevels + ", technicalIndexes=" + this.technicalIndexes + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.aiThinkingInterval);
        parcel.writeStringList(this.kLineLevels);
        List<TechnicalIndex> list = this.technicalIndexes;
        parcel.writeInt(list.size());
        Iterator<TechnicalIndex> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ DataSetting(int i, String str, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.aiThinkingInterval = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.kLineLevels = yDY.AhwBna();
        } else {
            this.kLineLevels = list;
        }
        if ((i & 4) == 0) {
            this.technicalIndexes = yDY.AhwBna();
        } else {
            this.technicalIndexes = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DataSetting dataSetting, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dataSetting.aiThinkingInterval, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dataSetting.aiThinkingInterval);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(dataSetting.kLineLevels, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], dataSetting.kLineLevels);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(dataSetting.technicalIndexes, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], dataSetting.technicalIndexes);
    }

    public DataSetting(@NotNull String str, @NotNull List<String> list, @NotNull List<TechnicalIndex> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.aiThinkingInterval = str;
        this.kLineLevels = list;
        this.technicalIndexes = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:33)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000e: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0012: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:34)) : (r3v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.util.List<com.okinc.unify_trade.biz.TechnicalIndex>):void (m)] (LINE:31) call: com.okinc.unify_trade.biz.DataSetting.<init>(java.lang.String, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ DataSetting(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? yDY.AhwBna() : list2);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.DataSetting.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DataSetting> serializer() {
            return DataSetting$$serializer.INSTANCE;
        }

        public final DataSetting AEQbTJ(DataSetting dataSetting, @NotNull String str, @NotNull List<String> list, @NotNull List<TechnicalIndex> list2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            String aiThinkingInterval = dataSetting != null ? dataSetting.getAiThinkingInterval() : null;
            if (aiThinkingInterval != null && aiThinkingInterval.length() != 0 && !StringsKt__StringsKt.fARcdN((CharSequence) aiThinkingInterval)) {
                str = aiThinkingInterval;
            }
            List<String> kLineLevels = dataSetting != null ? dataSetting.getKLineLevels() : null;
            if (kLineLevels == null) {
                kLineLevels = yDY.AhwBna();
            }
            if (!kLineLevels.isEmpty()) {
                list = kLineLevels;
            }
            List<TechnicalIndex> technicalIndexes = dataSetting != null ? dataSetting.getTechnicalIndexes() : null;
            if (technicalIndexes == null) {
                technicalIndexes = yDY.AhwBna();
            }
            if (!technicalIndexes.isEmpty()) {
                list2 = technicalIndexes;
            }
            return new DataSetting(str, list, list2);
        }
    }
}
