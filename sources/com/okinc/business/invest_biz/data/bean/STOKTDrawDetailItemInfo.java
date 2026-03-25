package com.okinc.business.invest_biz.data.bean;

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
public final class STOKTDrawDetailItemInfo implements Parcelable {
    private final List<STOKTDrawDetailRecordInfo> stOktDrawRecords;
    private final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<STOKTDrawDetailItemInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(STOKTDrawDetailRecordInfo$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<STOKTDrawDetailItemInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final STOKTDrawDetailItemInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(STOKTDrawDetailRecordInfo.CREATOR.createFromParcel(parcel));
            }
            return new STOKTDrawDetailItemInfo(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final STOKTDrawDetailItemInfo[] newArray(int i) {
            return new STOKTDrawDetailItemInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public STOKTDrawDetailItemInfo() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.STOKTDrawDetailItemInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ STOKTDrawDetailItemInfo copy$default(STOKTDrawDetailItemInfo sTOKTDrawDetailItemInfo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sTOKTDrawDetailItemInfo.walletAddress;
        }
        if ((i & 2) != 0) {
            list = sTOKTDrawDetailItemInfo.stOktDrawRecords;
        }
        return sTOKTDrawDetailItemInfo.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<STOKTDrawDetailRecordInfo> component2() {
        return this.stOktDrawRecords;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final STOKTDrawDetailItemInfo copy(@NotNull String str, @NotNull List<STOKTDrawDetailRecordInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new STOKTDrawDetailItemInfo(str, list);
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
        if (!(obj instanceof STOKTDrawDetailItemInfo)) {
            return false;
        }
        STOKTDrawDetailItemInfo sTOKTDrawDetailItemInfo = (STOKTDrawDetailItemInfo) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) sTOKTDrawDetailItemInfo.walletAddress) && Intrinsics.EZpvd(this.stOktDrawRecords, sTOKTDrawDetailItemInfo.stOktDrawRecords);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<STOKTDrawDetailRecordInfo> getStOktDrawRecords() {
        return this.stOktDrawRecords;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.walletAddress.hashCode() * 31) + this.stOktDrawRecords.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "STOKTDrawDetailItemInfo(walletAddress=" + this.walletAddress + ", stOktDrawRecords=" + this.stOktDrawRecords + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.walletAddress);
        List<STOKTDrawDetailRecordInfo> list = this.stOktDrawRecords;
        parcel.writeInt(list.size());
        Iterator<STOKTDrawDetailRecordInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.STOKTDrawDetailItemInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<STOKTDrawDetailItemInfo> serializer() {
            return STOKTDrawDetailItemInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ STOKTDrawDetailItemInfo(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.walletAddress = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.stOktDrawRecords = yDY.AhwBna();
        } else {
            this.stOktDrawRecords = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(STOKTDrawDetailItemInfo sTOKTDrawDetailItemInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) sTOKTDrawDetailItemInfo.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, sTOKTDrawDetailItemInfo.walletAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(sTOKTDrawDetailItemInfo.stOktDrawRecords, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], sTOKTDrawDetailItemInfo.stOktDrawRecords);
    }

    public STOKTDrawDetailItemInfo(@NotNull String str, @NotNull List<STOKTDrawDetailRecordInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.walletAddress = str;
        this.stOktDrawRecords = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:312)) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.STOKTDrawDetailRecordInfo>):void (m)] (LINE:310) call: com.okinc.business.invest_biz.data.bean.STOKTDrawDetailItemInfo.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ STOKTDrawDetailItemInfo(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
