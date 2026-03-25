package com.okinc.okex.lite.earn.bean;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class UserAssetLiteResponse implements Parcelable {
    private List<EarnUserOrderList> earnUserOrderList;
    private boolean hasEarnHistory;
    private List<UserAssetLiteRewardProgram> rewardProgramList;
    private final String totalBalance;
    private final float totalEarnings;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UserAssetLiteResponse> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(EarnUserOrderList$$serializer.INSTANCE), new ArrayListSerializer(UserAssetLiteRewardProgram$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<UserAssetLiteResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserAssetLiteResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            float f = parcel.readFloat();
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(EarnUserOrderList.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(UserAssetLiteRewardProgram.CREATOR.createFromParcel(parcel));
            }
            return new UserAssetLiteResponse(string, f, z, arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserAssetLiteResponse[] newArray(int i) {
            return new UserAssetLiteResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.okex.lite.earn.bean.UserAssetLiteResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserAssetLiteResponse copy$default(UserAssetLiteResponse userAssetLiteResponse, String str, float f, boolean z, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userAssetLiteResponse.totalBalance;
        }
        if ((i & 2) != 0) {
            f = userAssetLiteResponse.totalEarnings;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            z = userAssetLiteResponse.hasEarnHistory;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            list = userAssetLiteResponse.earnUserOrderList;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = userAssetLiteResponse.rewardProgramList;
        }
        return userAssetLiteResponse.copy(str, f2, z2, list3, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component2() {
        return this.totalEarnings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.hasEarnHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EarnUserOrderList> component4() {
        return this.earnUserOrderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UserAssetLiteRewardProgram> component5() {
        return this.rewardProgramList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserAssetLiteResponse copy(@NotNull String str, float f, boolean z, @NotNull List<EarnUserOrderList> list, @NotNull List<UserAssetLiteRewardProgram> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new UserAssetLiteResponse(str, f, z, list, list2);
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
        if (!(obj instanceof UserAssetLiteResponse)) {
            return false;
        }
        UserAssetLiteResponse userAssetLiteResponse = (UserAssetLiteResponse) obj;
        return Intrinsics.EZpvd((Object) this.totalBalance, (Object) userAssetLiteResponse.totalBalance) && Float.compare(this.totalEarnings, userAssetLiteResponse.totalEarnings) == 0 && this.hasEarnHistory == userAssetLiteResponse.hasEarnHistory && Intrinsics.EZpvd(this.earnUserOrderList, userAssetLiteResponse.earnUserOrderList) && Intrinsics.EZpvd(this.rewardProgramList, userAssetLiteResponse.rewardProgramList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EarnUserOrderList> getEarnUserOrderList() {
        return this.earnUserOrderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasEarnHistory() {
        return this.hasEarnHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UserAssetLiteRewardProgram> getRewardProgramList() {
        return this.rewardProgramList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getTotalEarnings() {
        return this.totalEarnings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.totalBalance.hashCode() * 31) + Float.hashCode(this.totalEarnings)) * 31) + Boolean.hashCode(this.hasEarnHistory)) * 31) + this.earnUserOrderList.hashCode()) * 31) + this.rewardProgramList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarnUserOrderList(@NotNull List<EarnUserOrderList> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.earnUserOrderList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasEarnHistory(boolean z) {
        this.hasEarnHistory = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRewardProgramList(@NotNull List<UserAssetLiteRewardProgram> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.rewardProgramList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserAssetLiteResponse(totalBalance=" + this.totalBalance + ", totalEarnings=" + this.totalEarnings + ", hasEarnHistory=" + this.hasEarnHistory + ", earnUserOrderList=" + this.earnUserOrderList + ", rewardProgramList=" + this.rewardProgramList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.totalBalance);
        parcel.writeFloat(this.totalEarnings);
        parcel.writeInt(this.hasEarnHistory ? 1 : 0);
        List<EarnUserOrderList> list = this.earnUserOrderList;
        parcel.writeInt(list.size());
        Iterator<EarnUserOrderList> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<UserAssetLiteRewardProgram> list2 = this.rewardProgramList;
        parcel.writeInt(list2.size());
        Iterator<UserAssetLiteRewardProgram> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.earn.bean.UserAssetLiteResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserAssetLiteResponse> serializer() {
            return UserAssetLiteResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserAssetLiteResponse(int i, String str, float f, boolean z, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, UserAssetLiteResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.totalBalance = str;
        this.totalEarnings = f;
        if ((i & 4) == 0) {
            this.hasEarnHistory = false;
        } else {
            this.hasEarnHistory = z;
        }
        if ((i & 8) == 0) {
            this.earnUserOrderList = yDY.AhwBna();
        } else {
            this.earnUserOrderList = list;
        }
        if ((i & 16) == 0) {
            this.rewardProgramList = yDY.AhwBna();
        } else {
            this.rewardProgramList = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKFinance_finance_api(UserAssetLiteResponse userAssetLiteResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, userAssetLiteResponse.totalBalance);
        compositeEncoder.encodeFloatElement(serialDescriptor, 1, userAssetLiteResponse.totalEarnings);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || userAssetLiteResponse.hasEarnHistory) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, userAssetLiteResponse.hasEarnHistory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(userAssetLiteResponse.earnUserOrderList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], userAssetLiteResponse.earnUserOrderList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd(userAssetLiteResponse.rewardProgramList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], userAssetLiteResponse.rewardProgramList);
    }

    public UserAssetLiteResponse(@NotNull String str, float f, boolean z, @NotNull List<EarnUserOrderList> list, @NotNull List<UserAssetLiteRewardProgram> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.totalBalance = str;
        this.totalEarnings = f;
        this.hasEarnHistory = z;
        this.earnUserOrderList = list;
        this.rewardProgramList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 float)
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:java.util.List:0x000e: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r10v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0013: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:16)) : (r11v0 java.util.List))
 A[MD:(java.lang.String, float, boolean, java.util.List<com.okinc.okex.lite.earn.bean.EarnUserOrderList>, java.util.List<com.okinc.okex.lite.earn.bean.UserAssetLiteRewardProgram>):void (m)] (LINE:11) call: com.okinc.okex.lite.earn.bean.UserAssetLiteResponse.<init>(java.lang.String, float, boolean, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ UserAssetLiteResponse(String str, float f, boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, (i & 4) != 0 ? false : z, (i & 8) != 0 ? yDY.AhwBna() : list, (i & 16) != 0 ? yDY.AhwBna() : list2);
    }
}
