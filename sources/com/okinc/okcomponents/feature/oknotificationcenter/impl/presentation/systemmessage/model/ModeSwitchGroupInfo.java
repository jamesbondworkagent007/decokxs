package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model;

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
public final class ModeSwitchGroupInfo implements Parcelable {
    private final List<SwitchItemInfo> childSwitchItemList;
    private final String enName;
    private final String switchName;
    private final int switchType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ModeSwitchGroupInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(SwitchItemInfo$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<ModeSwitchGroupInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ModeSwitchGroupInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(SwitchItemInfo.CREATOR.createFromParcel(parcel));
            }
            return new ModeSwitchGroupInfo(i, string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ModeSwitchGroupInfo[] newArray(int i) {
            return new ModeSwitchGroupInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ModeSwitchGroupInfo() {
        this(0, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model.ModeSwitchGroupInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModeSwitchGroupInfo copy$default(ModeSwitchGroupInfo modeSwitchGroupInfo, int i, String str, String str2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = modeSwitchGroupInfo.switchType;
        }
        if ((i2 & 2) != 0) {
            str = modeSwitchGroupInfo.switchName;
        }
        if ((i2 & 4) != 0) {
            str2 = modeSwitchGroupInfo.enName;
        }
        if ((i2 & 8) != 0) {
            list = modeSwitchGroupInfo.childSwitchItemList;
        }
        return modeSwitchGroupInfo.copy(i, str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.switchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.switchName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.enName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SwitchItemInfo> component4() {
        return this.childSwitchItemList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ModeSwitchGroupInfo copy(int i, @NotNull String str, @NotNull String str2, @NotNull List<SwitchItemInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new ModeSwitchGroupInfo(i, str, str2, list);
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
        if (!(obj instanceof ModeSwitchGroupInfo)) {
            return false;
        }
        ModeSwitchGroupInfo modeSwitchGroupInfo = (ModeSwitchGroupInfo) obj;
        return this.switchType == modeSwitchGroupInfo.switchType && Intrinsics.EZpvd((Object) this.switchName, (Object) modeSwitchGroupInfo.switchName) && Intrinsics.EZpvd((Object) this.enName, (Object) modeSwitchGroupInfo.enName) && Intrinsics.EZpvd(this.childSwitchItemList, modeSwitchGroupInfo.childSwitchItemList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SwitchItemInfo> getChildSwitchItemList() {
        return this.childSwitchItemList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnName() {
        return this.enName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwitchName() {
        return this.switchName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSwitchType() {
        return this.switchType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.switchType) * 31) + this.switchName.hashCode()) * 31) + this.enName.hashCode()) * 31) + this.childSwitchItemList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ModeSwitchGroupInfo(switchType=" + this.switchType + ", switchName=" + this.switchName + ", enName=" + this.enName + ", childSwitchItemList=" + this.childSwitchItemList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.switchType);
        parcel.writeString(this.switchName);
        parcel.writeString(this.enName);
        List<SwitchItemInfo> list = this.childSwitchItemList;
        parcel.writeInt(list.size());
        Iterator<SwitchItemInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model.ModeSwitchGroupInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ModeSwitchGroupInfo> serializer() {
            return ModeSwitchGroupInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ModeSwitchGroupInfo(int i, int i2, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.switchType = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.switchName = "";
        } else {
            this.switchName = str;
        }
        if ((i & 4) == 0) {
            this.enName = "";
        } else {
            this.enName = str2;
        }
        if ((i & 8) == 0) {
            this.childSwitchItemList = yDY.AhwBna();
        } else {
            this.childSwitchItemList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKNotificationCenter_oknotificationcenter_impl(ModeSwitchGroupInfo modeSwitchGroupInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || modeSwitchGroupInfo.switchType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, modeSwitchGroupInfo.switchType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) modeSwitchGroupInfo.switchName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, modeSwitchGroupInfo.switchName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) modeSwitchGroupInfo.enName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, modeSwitchGroupInfo.enName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(modeSwitchGroupInfo.childSwitchItemList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], modeSwitchGroupInfo.childSwitchItemList);
    }

    public ModeSwitchGroupInfo(int i, @NotNull String str, @NotNull String str2, @NotNull List<SwitchItemInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.switchType = i;
        this.switchName = str;
        this.enName = str2;
        this.childSwitchItemList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0015: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:36)) : (r5v0 java.util.List))
 A[MD:(int, java.lang.String, java.lang.String, java.util.List<com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model.SwitchItemInfo>):void (m)] (LINE:17) call: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model.ModeSwitchGroupInfo.<init>(int, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ ModeSwitchGroupInfo(int i, String str, String str2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? yDY.AhwBna() : list);
    }
}
