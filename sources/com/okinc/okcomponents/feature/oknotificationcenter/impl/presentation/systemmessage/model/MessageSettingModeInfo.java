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
public final class MessageSettingModeInfo implements Parcelable {
    private final String darkModeIconUrl;
    private final String enName;
    private boolean isSelected;
    private final String lightModeIconUrl;
    private final String modeDescription;
    private final String modeName;
    private final List<ModeSwitchGroupInfo> switchDetailInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MessageSettingModeInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(ModeSwitchGroupInfo$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<MessageSettingModeInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MessageSettingModeInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ModeSwitchGroupInfo.CREATOR.createFromParcel(parcel));
            }
            return new MessageSettingModeInfo(string, string2, string3, string4, string5, z, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MessageSettingModeInfo[] newArray(int i) {
            return new MessageSettingModeInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MessageSettingModeInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, false, (List) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model.MessageSettingModeInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageSettingModeInfo copy$default(MessageSettingModeInfo messageSettingModeInfo, String str, String str2, String str3, String str4, String str5, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageSettingModeInfo.modeName;
        }
        if ((i & 2) != 0) {
            str2 = messageSettingModeInfo.enName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = messageSettingModeInfo.modeDescription;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = messageSettingModeInfo.darkModeIconUrl;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = messageSettingModeInfo.lightModeIconUrl;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            z = messageSettingModeInfo.isSelected;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            list = messageSettingModeInfo.switchDetailInfo;
        }
        return messageSettingModeInfo.copy(str, str6, str7, str8, str9, z2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.modeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.enName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.modeDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.darkModeIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.lightModeIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ModeSwitchGroupInfo> component7() {
        return this.switchDetailInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MessageSettingModeInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, @NotNull List<ModeSwitchGroupInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new MessageSettingModeInfo(str, str2, str3, str4, str5, z, list);
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
        if (!(obj instanceof MessageSettingModeInfo)) {
            return false;
        }
        MessageSettingModeInfo messageSettingModeInfo = (MessageSettingModeInfo) obj;
        return Intrinsics.EZpvd((Object) this.modeName, (Object) messageSettingModeInfo.modeName) && Intrinsics.EZpvd((Object) this.enName, (Object) messageSettingModeInfo.enName) && Intrinsics.EZpvd((Object) this.modeDescription, (Object) messageSettingModeInfo.modeDescription) && Intrinsics.EZpvd((Object) this.darkModeIconUrl, (Object) messageSettingModeInfo.darkModeIconUrl) && Intrinsics.EZpvd((Object) this.lightModeIconUrl, (Object) messageSettingModeInfo.lightModeIconUrl) && this.isSelected == messageSettingModeInfo.isSelected && Intrinsics.EZpvd(this.switchDetailInfo, messageSettingModeInfo.switchDetailInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDarkModeIconUrl() {
        return this.darkModeIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnName() {
        return this.enName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLightModeIconUrl() {
        return this.lightModeIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModeDescription() {
        return this.modeDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModeName() {
        return this.modeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ModeSwitchGroupInfo> getSwitchDetailInfo() {
        return this.switchDetailInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.modeName.hashCode() * 31) + this.enName.hashCode()) * 31) + this.modeDescription.hashCode()) * 31) + this.darkModeIconUrl.hashCode()) * 31) + this.lightModeIconUrl.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31) + this.switchDetailInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MessageSettingModeInfo(modeName=" + this.modeName + ", enName=" + this.enName + ", modeDescription=" + this.modeDescription + ", darkModeIconUrl=" + this.darkModeIconUrl + ", lightModeIconUrl=" + this.lightModeIconUrl + ", isSelected=" + this.isSelected + ", switchDetailInfo=" + this.switchDetailInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.modeName);
        parcel.writeString(this.enName);
        parcel.writeString(this.modeDescription);
        parcel.writeString(this.darkModeIconUrl);
        parcel.writeString(this.lightModeIconUrl);
        parcel.writeInt(this.isSelected ? 1 : 0);
        List<ModeSwitchGroupInfo> list = this.switchDetailInfo;
        parcel.writeInt(list.size());
        Iterator<ModeSwitchGroupInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model.MessageSettingModeInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MessageSettingModeInfo> serializer() {
            return MessageSettingModeInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MessageSettingModeInfo(int i, String str, String str2, String str3, String str4, String str5, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.modeName = "";
        } else {
            this.modeName = str;
        }
        if ((i & 2) == 0) {
            this.enName = "";
        } else {
            this.enName = str2;
        }
        if ((i & 4) == 0) {
            this.modeDescription = "";
        } else {
            this.modeDescription = str3;
        }
        if ((i & 8) == 0) {
            this.darkModeIconUrl = "";
        } else {
            this.darkModeIconUrl = str4;
        }
        if ((i & 16) == 0) {
            this.lightModeIconUrl = "";
        } else {
            this.lightModeIconUrl = str5;
        }
        if ((i & 32) == 0) {
            this.isSelected = false;
        } else {
            this.isSelected = z;
        }
        if ((i & 64) == 0) {
            this.switchDetailInfo = yDY.AhwBna();
        } else {
            this.switchDetailInfo = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKNotificationCenter_oknotificationcenter_impl(MessageSettingModeInfo messageSettingModeInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) messageSettingModeInfo.modeName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, messageSettingModeInfo.modeName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) messageSettingModeInfo.enName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, messageSettingModeInfo.enName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) messageSettingModeInfo.modeDescription, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, messageSettingModeInfo.modeDescription);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) messageSettingModeInfo.darkModeIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, messageSettingModeInfo.darkModeIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) messageSettingModeInfo.lightModeIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, messageSettingModeInfo.lightModeIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || messageSettingModeInfo.isSelected) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, messageSettingModeInfo.isSelected);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd(messageSettingModeInfo.switchDetailInfo, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], messageSettingModeInfo.switchDetailInfo);
    }

    public MessageSettingModeInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, @NotNull List<ModeSwitchGroupInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.modeName = str;
        this.enName = str2;
        this.modeDescription = str3;
        this.darkModeIconUrl = str4;
        this.lightModeIconUrl = str5;
        this.isSelected = z;
        this.switchDetailInfo = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r10v0 java.lang.String) : (""))
  (wrap:boolean:0x0029: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x002e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:51)) : (r12v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List<com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model.ModeSwitchGroupInfo>):void (m)] (LINE:17) call: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model.MessageSettingModeInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List):void type: THIS */
    public /* synthetic */ MessageSettingModeInfo(String str, String str2, String str3, String str4, String str5, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? false : z, (i & 64) != 0 ? yDY.AhwBna() : list);
    }
}
