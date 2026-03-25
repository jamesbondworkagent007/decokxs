package com.okinc.planet.biz_create_centre.data;

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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class EarningsHistoryInfo implements Parcelable {
    private final List<HistoryData> history;
    private final String nextCursor;
    private final String totalPaidOutUsd;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EarningsHistoryInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(HistoryData$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<EarningsHistoryInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarningsHistoryInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(HistoryData.CREATOR.createFromParcel(parcel));
            }
            return new EarningsHistoryInfo(string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarningsHistoryInfo[] newArray(int i) {
            return new EarningsHistoryInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EarningsHistoryInfo() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.planet.biz_create_centre.data.EarningsHistoryInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EarningsHistoryInfo copy$default(EarningsHistoryInfo earningsHistoryInfo, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = earningsHistoryInfo.totalPaidOutUsd;
        }
        if ((i & 2) != 0) {
            str2 = earningsHistoryInfo.nextCursor;
        }
        if ((i & 4) != 0) {
            list = earningsHistoryInfo.history;
        }
        return earningsHistoryInfo.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalPaidOutUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nextCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HistoryData> component3() {
        return this.history;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarningsHistoryInfo copy(@NotNull String str, @NotNull String str2, @NotNull List<HistoryData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new EarningsHistoryInfo(str, str2, list);
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
        if (!(obj instanceof EarningsHistoryInfo)) {
            return false;
        }
        EarningsHistoryInfo earningsHistoryInfo = (EarningsHistoryInfo) obj;
        return Intrinsics.EZpvd((Object) this.totalPaidOutUsd, (Object) earningsHistoryInfo.totalPaidOutUsd) && Intrinsics.EZpvd((Object) this.nextCursor, (Object) earningsHistoryInfo.nextCursor) && Intrinsics.EZpvd(this.history, earningsHistoryInfo.history);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HistoryData> getHistory() {
        return this.history;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPaidOutUsd() {
        return this.totalPaidOutUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.totalPaidOutUsd.hashCode() * 31) + this.nextCursor.hashCode()) * 31) + this.history.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarningsHistoryInfo(totalPaidOutUsd=" + this.totalPaidOutUsd + ", nextCursor=" + this.nextCursor + ", history=" + this.history + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.totalPaidOutUsd);
        parcel.writeString(this.nextCursor);
        List<HistoryData> list = this.history;
        parcel.writeInt(list.size());
        Iterator<HistoryData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_create_centre.data.EarningsHistoryInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EarningsHistoryInfo> serializer() {
            return EarningsHistoryInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EarningsHistoryInfo(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.totalPaidOutUsd = "";
        } else {
            this.totalPaidOutUsd = str;
        }
        if ((i & 2) == 0) {
            this.nextCursor = "";
        } else {
            this.nextCursor = str2;
        }
        if ((i & 4) == 0) {
            this.history = yDY.AhwBna();
        } else {
            this.history = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(EarningsHistoryInfo earningsHistoryInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) earningsHistoryInfo.totalPaidOutUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, earningsHistoryInfo.totalPaidOutUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) earningsHistoryInfo.nextCursor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, earningsHistoryInfo.nextCursor);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(earningsHistoryInfo.history, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], earningsHistoryInfo.history);
    }

    public EarningsHistoryInfo(@NotNull String str, @NotNull String str2, @NotNull List<HistoryData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.totalPaidOutUsd = str;
        this.nextCursor = str2;
        this.history = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:14)) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.planet.biz_create_centre.data.HistoryData>):void (m)] (LINE:11) call: com.okinc.planet.biz_create_centre.data.EarningsHistoryInfo.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ EarningsHistoryInfo(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? yDY.AhwBna() : list);
    }
}
