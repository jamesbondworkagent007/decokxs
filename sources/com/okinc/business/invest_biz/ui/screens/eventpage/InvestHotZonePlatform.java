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
public final class InvestHotZonePlatform implements Parcelable {
    private final String platformName;
    private final List<InvestHotZoneType> typeInfoList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestHotZonePlatform> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(InvestHotZoneType$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<InvestHotZonePlatform> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestHotZonePlatform createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InvestHotZoneType.CREATOR.createFromParcel(parcel));
            }
            return new InvestHotZonePlatform(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestHotZonePlatform[] newArray(int i) {
            return new InvestHotZonePlatform[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestHotZonePlatform() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.screens.eventpage.InvestHotZonePlatform */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestHotZonePlatform copy$default(InvestHotZonePlatform investHotZonePlatform, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investHotZonePlatform.platformName;
        }
        if ((i & 2) != 0) {
            list = investHotZonePlatform.typeInfoList;
        }
        return investHotZonePlatform.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestHotZoneType> component2() {
        return this.typeInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestHotZonePlatform copy(@NotNull String str, @NotNull List<InvestHotZoneType> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new InvestHotZonePlatform(str, list);
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
        if (!(obj instanceof InvestHotZonePlatform)) {
            return false;
        }
        InvestHotZonePlatform investHotZonePlatform = (InvestHotZonePlatform) obj;
        return Intrinsics.EZpvd((Object) this.platformName, (Object) investHotZonePlatform.platformName) && Intrinsics.EZpvd(this.typeInfoList, investHotZonePlatform.typeInfoList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformName() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestHotZoneType> getTypeInfoList() {
        return this.typeInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.platformName.hashCode() * 31) + this.typeInfoList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestHotZonePlatform(platformName=" + this.platformName + ", typeInfoList=" + this.typeInfoList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.platformName);
        List<InvestHotZoneType> list = this.typeInfoList;
        parcel.writeInt(list.size());
        Iterator<InvestHotZoneType> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.eventpage.InvestHotZonePlatform.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestHotZonePlatform> serializer() {
            return InvestHotZonePlatform$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestHotZonePlatform(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.platformName = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.typeInfoList = yDY.AhwBna();
        } else {
            this.typeInfoList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestHotZonePlatform investHotZonePlatform, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investHotZonePlatform.platformName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, investHotZonePlatform.platformName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(investHotZonePlatform.typeInfoList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], investHotZonePlatform.typeInfoList);
    }

    public InvestHotZonePlatform(@NotNull String str, @NotNull List<InvestHotZoneType> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.platformName = str;
        this.typeInfoList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:31)) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.invest_biz.ui.screens.eventpage.InvestHotZoneType>):void (m)] (LINE:29) call: com.okinc.business.invest_biz.ui.screens.eventpage.InvestHotZonePlatform.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ InvestHotZonePlatform(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
