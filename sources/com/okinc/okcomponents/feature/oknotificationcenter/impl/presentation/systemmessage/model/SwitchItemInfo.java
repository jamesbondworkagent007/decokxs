package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class SwitchItemInfo implements Parcelable {
    private final String enName;
    private boolean isOpen;
    private final boolean isShow;

    @SerializedName("subItems")
    private List<SwitchItemInfo> subItems;
    private final String switchDescription;
    private final String switchName;
    private final int switchType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SwitchItemInfo> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<SwitchItemInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SwitchItemInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(SwitchItemInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new SwitchItemInfo(i, string, string2, string3, z, z2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SwitchItemInfo[] newArray(int i) {
            return new SwitchItemInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SwitchItemInfo() {
        this(0, (String) null, (String) null, (String) null, false, false, (List) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model.SwitchItemInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SwitchItemInfo copy$default(SwitchItemInfo switchItemInfo, int i, String str, String str2, String str3, boolean z, boolean z2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = switchItemInfo.switchType;
        }
        if ((i2 & 2) != 0) {
            str = switchItemInfo.switchName;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = switchItemInfo.enName;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = switchItemInfo.switchDescription;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            z = switchItemInfo.isShow;
        }
        boolean z3 = z;
        if ((i2 & 32) != 0) {
            z2 = switchItemInfo.isOpen;
        }
        boolean z4 = z2;
        if ((i2 & 64) != 0) {
            list = switchItemInfo.subItems;
        }
        return switchItemInfo.copy(i, str4, str5, str6, z3, z4, list);
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
    public final String component4() {
        return this.switchDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isOpen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SwitchItemInfo> component7() {
        return this.subItems;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwitchItemInfo copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2, List<SwitchItemInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SwitchItemInfo(i, str, str2, str3, z, z2, list);
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
        if (!(obj instanceof SwitchItemInfo)) {
            return false;
        }
        SwitchItemInfo switchItemInfo = (SwitchItemInfo) obj;
        return this.switchType == switchItemInfo.switchType && Intrinsics.EZpvd((Object) this.switchName, (Object) switchItemInfo.switchName) && Intrinsics.EZpvd((Object) this.enName, (Object) switchItemInfo.enName) && Intrinsics.EZpvd((Object) this.switchDescription, (Object) switchItemInfo.switchDescription) && this.isShow == switchItemInfo.isShow && this.isOpen == switchItemInfo.isOpen && Intrinsics.EZpvd(this.subItems, switchItemInfo.subItems);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnName() {
        return this.enName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SwitchItemInfo> getSubItems() {
        return this.subItems;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwitchDescription() {
        return this.switchDescription;
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
        int iHashCode = Integer.hashCode(this.switchType);
        int iHashCode2 = this.switchName.hashCode();
        int iHashCode3 = this.enName.hashCode();
        int iHashCode4 = this.switchDescription.hashCode();
        int iHashCode5 = Boolean.hashCode(this.isShow);
        int iHashCode6 = Boolean.hashCode(this.isOpen);
        List<SwitchItemInfo> list = this.subItems;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOpen() {
        return this.isOpen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShow() {
        return this.isShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpen(boolean z) {
        this.isOpen = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubItems(List<SwitchItemInfo> list) {
        this.subItems = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SwitchItemInfo(switchType=" + this.switchType + ", switchName=" + this.switchName + ", enName=" + this.enName + ", switchDescription=" + this.switchDescription + ", isShow=" + this.isShow + ", isOpen=" + this.isOpen + ", subItems=" + this.subItems + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.switchType);
        parcel.writeString(this.switchName);
        parcel.writeString(this.enName);
        parcel.writeString(this.switchDescription);
        parcel.writeInt(this.isShow ? 1 : 0);
        parcel.writeInt(this.isOpen ? 1 : 0);
        List<SwitchItemInfo> list = this.subItems;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model.SwitchItemInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SwitchItemInfo> serializer() {
            return SwitchItemInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SwitchItemInfo(int i, int i2, String str, String str2, String str3, boolean z, boolean z2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.switchType = 0;
        } else {
            this.switchType = i2;
        }
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
            this.switchDescription = "";
        } else {
            this.switchDescription = str3;
        }
        if ((i & 16) == 0) {
            this.isShow = true;
        } else {
            this.isShow = z;
        }
        if ((i & 32) == 0) {
            this.isOpen = false;
        } else {
            this.isOpen = z2;
        }
        if ((i & 64) == 0) {
            this.subItems = null;
        } else {
            this.subItems = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKNotificationCenter_oknotificationcenter_impl(SwitchItemInfo switchItemInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || switchItemInfo.switchType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, switchItemInfo.switchType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) switchItemInfo.switchName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, switchItemInfo.switchName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) switchItemInfo.enName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, switchItemInfo.enName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) switchItemInfo.switchDescription, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, switchItemInfo.switchDescription);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !switchItemInfo.isShow) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, switchItemInfo.isShow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || switchItemInfo.isOpen) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, switchItemInfo.isOpen);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && switchItemInfo.subItems == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, new ArrayListSerializer(SwitchItemInfo$$serializer.INSTANCE), switchItemInfo.subItems);
    }

    public SwitchItemInfo(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2, List<SwitchItemInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.switchType = i;
        this.switchName = str;
        this.enName = str2;
        this.switchDescription = str3;
        this.isShow = z;
        this.isOpen = z2;
        this.subItems = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0037: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r13v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:boolean:0x0023: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r10v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 boolean) : false)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.util.List<com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model.SwitchItemInfo>):void (m)] (LINE:18) call: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model.SwitchItemInfo.<init>(int, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.util.List):void type: THIS */
    public /* synthetic */ SwitchItemInfo(int i, String str, String str2, String str3, boolean z, boolean z2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) == 0 ? str3 : "", (i2 & 16) != 0 ? true : z, (i2 & 32) == 0 ? z2 : false, (i2 & 64) != 0 ? null : list);
    }
}
