package com.okinc.business.invest_biz.ui.screens.eventpage;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestHotZoneType implements Parcelable {
    private final List<InvestMultiTabEventPageProductDetailData> investmentInfo;
    private final String typeName;
    private final int typeOrder;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestHotZoneType> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(InvestMultiTabEventPageProductDetailData$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<InvestHotZoneType> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestHotZoneType createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(InvestMultiTabEventPageProductDetailData.CREATOR.createFromParcel(parcel));
            }
            return new InvestHotZoneType(string, i, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestHotZoneType[] newArray(int i) {
            return new InvestHotZoneType[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestHotZoneType() {
        this((String) null, 0, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.screens.eventpage.InvestHotZoneType */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestHotZoneType copy$default(InvestHotZoneType investHotZoneType, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = investHotZoneType.typeName;
        }
        if ((i2 & 2) != 0) {
            i = investHotZoneType.typeOrder;
        }
        if ((i2 & 4) != 0) {
            list = investHotZoneType.investmentInfo;
        }
        return investHotZoneType.copy(str, i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.typeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.typeOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestMultiTabEventPageProductDetailData> component3() {
        return this.investmentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestHotZoneType copy(@NotNull String str, int i, @NotNull List<InvestMultiTabEventPageProductDetailData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new InvestHotZoneType(str, i, list);
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
        if (!(obj instanceof InvestHotZoneType)) {
            return false;
        }
        InvestHotZoneType investHotZoneType = (InvestHotZoneType) obj;
        return Intrinsics.EZpvd((Object) this.typeName, (Object) investHotZoneType.typeName) && this.typeOrder == investHotZoneType.typeOrder && Intrinsics.EZpvd(this.investmentInfo, investHotZoneType.investmentInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestMultiTabEventPageProductDetailData> getInvestmentInfo() {
        return this.investmentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTypeName() {
        return this.typeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTypeOrder() {
        return this.typeOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.typeName.hashCode() * 31) + Integer.hashCode(this.typeOrder)) * 31) + this.investmentInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestHotZoneType(typeName=" + this.typeName + ", typeOrder=" + this.typeOrder + ", investmentInfo=" + this.investmentInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.typeName);
        parcel.writeInt(this.typeOrder);
        List<InvestMultiTabEventPageProductDetailData> list = this.investmentInfo;
        parcel.writeInt(list.size());
        Iterator<InvestMultiTabEventPageProductDetailData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.eventpage.InvestHotZoneType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestHotZoneType> serializer() {
            return InvestHotZoneType$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestHotZoneType(int i, String str, int i2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.typeName = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.typeOrder = 0;
        } else {
            this.typeOrder = i2;
        }
        if ((i & 4) == 0) {
            this.investmentInfo = yDY.AhwBna();
        } else {
            this.investmentInfo = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestHotZoneType investHotZoneType, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investHotZoneType.typeName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, investHotZoneType.typeName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investHotZoneType.typeOrder != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, investHotZoneType.typeOrder);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(investHotZoneType.investmentInfo, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], investHotZoneType.investmentInfo);
    }

    public InvestHotZoneType(@NotNull String str, int i, @NotNull List<InvestMultiTabEventPageProductDetailData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.typeName = str;
        this.typeOrder = i;
        this.investmentInfo = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:41)) : (r3v0 java.util.List))
 A[MD:(java.lang.String, int, java.util.List<com.okinc.business.invest_biz.ui.screens.eventpage.InvestMultiTabEventPageProductDetailData>):void (m)] (LINE:38) call: com.okinc.business.invest_biz.ui.screens.eventpage.InvestHotZoneType.<init>(java.lang.String, int, java.util.List):void type: THIS */
    public /* synthetic */ InvestHotZoneType(String str, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? yDY.AhwBna() : list);
    }
}
