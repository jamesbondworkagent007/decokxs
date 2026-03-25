package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class MoreFunctionInfo implements Parcelable {
    public static final int MODE_DEX = 1;
    public static final int MODE_NORMAL = 0;
    public static final int URL_TYPE_DEEPLINK = 1;
    public static final int URL_TYPE_WEBVIEW = 2;
    private final String dayIcon;
    private final int id;
    private final int jumpType;
    private final String jumpUrl;
    private final Integer localeBuildEnum;
    private final String name;
    private final String nightIcon;
    private final Integer projectCount;
    private final String projectCountText;
    private final boolean recommendFlag;
    private final List<Integer> supportWalletType;
    private final Integer walletMode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MoreFunctionInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<MoreFunctionInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MoreFunctionInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new MoreFunctionInfo(i, string, string2, string3, string4, i2, arrayList, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MoreFunctionInfo[] newArray(int i) {
            return new MoreFunctionInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MoreFunctionInfo() {
        this(0, (String) null, (String) null, (String) null, (String) null, 0, (List) null, false, (Integer) null, (String) null, (Integer) null, (Integer) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.projectCountText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component11() {
        return this.localeBuildEnum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.walletMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.dayIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.nightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.jumpUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.jumpType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component7() {
        return this.supportWalletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.recommendFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.projectCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MoreFunctionInfo copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i2, @NotNull List<Integer> list, boolean z, Integer num, String str5, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new MoreFunctionInfo(i, str, str2, str3, str4, i2, list, z, num, str5, num2, num3);
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
        if (!(obj instanceof MoreFunctionInfo)) {
            return false;
        }
        MoreFunctionInfo moreFunctionInfo = (MoreFunctionInfo) obj;
        return this.id == moreFunctionInfo.id && Intrinsics.EZpvd((Object) this.name, (Object) moreFunctionInfo.name) && Intrinsics.EZpvd((Object) this.dayIcon, (Object) moreFunctionInfo.dayIcon) && Intrinsics.EZpvd((Object) this.nightIcon, (Object) moreFunctionInfo.nightIcon) && Intrinsics.EZpvd((Object) this.jumpUrl, (Object) moreFunctionInfo.jumpUrl) && this.jumpType == moreFunctionInfo.jumpType && Intrinsics.EZpvd(this.supportWalletType, moreFunctionInfo.supportWalletType) && this.recommendFlag == moreFunctionInfo.recommendFlag && Intrinsics.EZpvd(this.projectCount, moreFunctionInfo.projectCount) && Intrinsics.EZpvd((Object) this.projectCountText, (Object) moreFunctionInfo.projectCountText) && Intrinsics.EZpvd(this.localeBuildEnum, moreFunctionInfo.localeBuildEnum) && Intrinsics.EZpvd(this.walletMode, moreFunctionInfo.walletMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDayIcon() {
        return this.dayIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getJumpType() {
        return this.jumpType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getLocaleBuildEnum() {
        return this.localeBuildEnum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNightIcon() {
        return this.nightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProjectCount() {
        return this.projectCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProjectCountText() {
        return this.projectCountText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRecommendFlag() {
        return this.recommendFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getSupportWalletType() {
        return this.supportWalletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getWalletMode() {
        return this.walletMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id);
        int iHashCode2 = this.name.hashCode();
        int iHashCode3 = this.dayIcon.hashCode();
        int iHashCode4 = this.nightIcon.hashCode();
        int iHashCode5 = this.jumpUrl.hashCode();
        int iHashCode6 = Integer.hashCode(this.jumpType);
        int iHashCode7 = this.supportWalletType.hashCode();
        int iHashCode8 = Boolean.hashCode(this.recommendFlag);
        Integer num = this.projectCount;
        int iHashCode9 = num == null ? 0 : num.hashCode();
        String str = this.projectCountText;
        int iHashCode10 = str == null ? 0 : str.hashCode();
        Integer num2 = this.localeBuildEnum;
        int iHashCode11 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.walletMode;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (num3 != null ? num3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MoreFunctionInfo(id=" + this.id + ", name=" + this.name + ", dayIcon=" + this.dayIcon + ", nightIcon=" + this.nightIcon + ", jumpUrl=" + this.jumpUrl + ", jumpType=" + this.jumpType + ", supportWalletType=" + this.supportWalletType + ", recommendFlag=" + this.recommendFlag + ", projectCount=" + this.projectCount + ", projectCountText=" + this.projectCountText + ", localeBuildEnum=" + this.localeBuildEnum + ", walletMode=" + this.walletMode + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.dayIcon);
        parcel.writeString(this.nightIcon);
        parcel.writeString(this.jumpUrl);
        parcel.writeInt(this.jumpType);
        List<Integer> list = this.supportWalletType;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
        parcel.writeInt(this.recommendFlag ? 1 : 0);
        Integer num = this.projectCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.projectCountText);
        Integer num2 = this.localeBuildEnum;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.walletMode;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public /* synthetic */ MoreFunctionInfo(int i, int i2, String str, String str2, String str3, String str4, int i3, List list, boolean z, Integer num, String str5, Integer num2, Integer num3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = 0;
        } else {
            this.id = i2;
        }
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 4) == 0) {
            this.dayIcon = "";
        } else {
            this.dayIcon = str2;
        }
        if ((i & 8) == 0) {
            this.nightIcon = "";
        } else {
            this.nightIcon = str3;
        }
        if ((i & 16) == 0) {
            this.jumpUrl = "";
        } else {
            this.jumpUrl = str4;
        }
        if ((i & 32) == 0) {
            this.jumpType = 1;
        } else {
            this.jumpType = i3;
        }
        if ((i & 64) == 0) {
            this.supportWalletType = yDY.AhwBna();
        } else {
            this.supportWalletType = list;
        }
        if ((i & 128) == 0) {
            this.recommendFlag = false;
        } else {
            this.recommendFlag = z;
        }
        if ((i & 256) == 0) {
            this.projectCount = null;
        } else {
            this.projectCount = num;
        }
        if ((i & 512) == 0) {
            this.projectCountText = null;
        } else {
            this.projectCountText = str5;
        }
        if ((i & 1024) == 0) {
            this.localeBuildEnum = null;
        } else {
            this.localeBuildEnum = num2;
        }
        if ((i & 2048) == 0) {
            this.walletMode = null;
        } else {
            this.walletMode = num3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(MoreFunctionInfo moreFunctionInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || moreFunctionInfo.id != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, moreFunctionInfo.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) moreFunctionInfo.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, moreFunctionInfo.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) moreFunctionInfo.dayIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, moreFunctionInfo.dayIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) moreFunctionInfo.nightIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, moreFunctionInfo.nightIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) moreFunctionInfo.jumpUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, moreFunctionInfo.jumpUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || moreFunctionInfo.jumpType != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, moreFunctionInfo.jumpType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(moreFunctionInfo.supportWalletType, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], moreFunctionInfo.supportWalletType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || moreFunctionInfo.recommendFlag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, moreFunctionInfo.recommendFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || moreFunctionInfo.projectCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, moreFunctionInfo.projectCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || moreFunctionInfo.projectCountText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, moreFunctionInfo.projectCountText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || moreFunctionInfo.localeBuildEnum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, moreFunctionInfo.localeBuildEnum);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && moreFunctionInfo.walletMode == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, moreFunctionInfo.walletMode);
    }

    public MoreFunctionInfo(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i2, @NotNull List<Integer> list, boolean z, Integer num, String str5, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.id = i;
        this.name = str;
        this.dayIcon = str2;
        this.nightIcon = str3;
        this.jumpUrl = str4;
        this.jumpType = i2;
        this.supportWalletType = list;
        this.recommendFlag = z;
        this.projectCount = num;
        this.projectCountText = str5;
        this.localeBuildEnum = num2;
        this.walletMode = num3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007c: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r14v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r26v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002a: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r19v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0032: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0036: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:773)) : (r20v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003d: ARITH (r26v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r21v0 boolean) : false)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0044: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r22v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0055: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r24v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x005d: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.Integer) : (null java.lang.Integer))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.util.List<java.lang.Integer>, boolean, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer):void (m)] (LINE:765) call: com.okinc.business.defi.biz.net.bean.MoreFunctionInfo.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.util.List, boolean, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ MoreFunctionInfo(int i, String str, String str2, String str3, String str4, int i2, List list, boolean z, Integer num, String str5, Integer num2, Integer num3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) == 0 ? str4 : "", (i3 & 32) != 0 ? 1 : i2, (i3 & 64) != 0 ? yDY.AhwBna() : list, (i3 & 128) == 0 ? z : false, (i3 & 256) != 0 ? null : num, (i3 & 512) != 0 ? null : str5, (i3 & 1024) != 0 ? null : num2, (i3 & 2048) == 0 ? num3 : null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.MoreFunctionInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MoreFunctionInfo> serializer() {
            return MoreFunctionInfo$$serializer.INSTANCE;
        }
    }
}
