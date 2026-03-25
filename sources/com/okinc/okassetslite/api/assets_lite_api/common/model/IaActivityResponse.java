package com.okinc.okassetslite.api.assets_lite_api.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class IaActivityResponse implements Parcelable {

    @SerializedName("activities")
    private final List<ActivityHistoryVO> activities;

    @SerializedName("recordNum")
    private final Integer recordNum;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<IaActivityResponse> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(ActivityHistoryVO$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<IaActivityResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IaActivityResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(ActivityHistoryVO.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new IaActivityResponse(numValueOf, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IaActivityResponse[] newArray(int i) {
            return new IaActivityResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IaActivityResponse() {
        this((Integer) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okassetslite.api.assets_lite_api.common.model.IaActivityResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IaActivityResponse copy$default(IaActivityResponse iaActivityResponse, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = iaActivityResponse.recordNum;
        }
        if ((i & 2) != 0) {
            list = iaActivityResponse.activities;
        }
        return iaActivityResponse.copy(num, list);
    }

    @SerialName("activities")
    public static /* synthetic */ void getActivities$annotations() {
    }

    @SerialName("recordNum")
    public static /* synthetic */ void getRecordNum$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.recordNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ActivityHistoryVO> component2() {
        return this.activities;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IaActivityResponse copy(Integer num, List<ActivityHistoryVO> list) {
        return new IaActivityResponse(num, list);
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
        if (!(obj instanceof IaActivityResponse)) {
            return false;
        }
        IaActivityResponse iaActivityResponse = (IaActivityResponse) obj;
        return Intrinsics.EZpvd(this.recordNum, iaActivityResponse.recordNum) && Intrinsics.EZpvd(this.activities, iaActivityResponse.activities);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ActivityHistoryVO> getActivities() {
        return this.activities;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRecordNum() {
        return this.recordNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.recordNum;
        int iHashCode = num == null ? 0 : num.hashCode();
        List<ActivityHistoryVO> list = this.activities;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IaActivityResponse(recordNum=" + this.recordNum + ", activities=" + this.activities + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.recordNum;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<ActivityHistoryVO> list = this.activities;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<ActivityHistoryVO> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okassetslite.api.assets_lite_api.common.model.IaActivityResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IaActivityResponse> serializer() {
            return IaActivityResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IaActivityResponse(int i, Integer num, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.recordNum = (i & 1) == 0 ? 0 : num;
        if ((i & 2) == 0) {
            this.activities = yDY.AhwBna();
        } else {
            this.activities = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssetsLite_assets_lite_api(IaActivityResponse iaActivityResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num = iaActivityResponse.recordNum) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, iaActivityResponse.recordNum);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(iaActivityResponse.activities, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], iaActivityResponse.activities);
    }

    public IaActivityResponse(Integer num, List<ActivityHistoryVO> list) {
        this.recordNum = num;
        this.activities = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0009: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:20)) : (r2v0 java.util.List))
 A[MD:(java.lang.Integer, java.util.List<com.okinc.okassetslite.api.assets_lite_api.common.model.ActivityHistoryVO>):void (m)] (LINE:14) call: com.okinc.okassetslite.api.assets_lite_api.common.model.IaActivityResponse.<init>(java.lang.Integer, java.util.List):void type: THIS */
    public /* synthetic */ IaActivityResponse(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
