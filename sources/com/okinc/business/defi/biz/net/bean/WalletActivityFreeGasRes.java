package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletActivityFreeGasRes implements Parcelable {
    private ArrayList<FreeGasValuationLimit> activityConfig;
    private Integer activityId;
    private Integer activityStatus;
    private String activitySymbol;
    private long beginTime;
    private long currentTime;
    private long endTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletActivityFreeGasRes> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(FreeGasValuationLimit$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<WalletActivityFreeGasRes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletActivityFreeGasRes createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(FreeGasValuationLimit.CREATOR.createFromParcel(parcel));
                }
            }
            return new WalletActivityFreeGasRes(numValueOf, string, numValueOf2, j, j2, j3, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletActivityFreeGasRes[] newArray(int i) {
            return new WalletActivityFreeGasRes[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletActivityFreeGasRes() {
        this((Integer) null, (String) null, (Integer) null, 0L, 0L, 0L, (ArrayList) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.activityId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.activitySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.activityStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.beginTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.currentTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<FreeGasValuationLimit> component7() {
        return this.activityConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletActivityFreeGasRes copy(Integer num, String str, Integer num2, long j, long j2, long j3, ArrayList<FreeGasValuationLimit> arrayList) {
        return new WalletActivityFreeGasRes(num, str, num2, j, j2, j3, arrayList);
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
        if (!(obj instanceof WalletActivityFreeGasRes)) {
            return false;
        }
        WalletActivityFreeGasRes walletActivityFreeGasRes = (WalletActivityFreeGasRes) obj;
        return Intrinsics.EZpvd(this.activityId, walletActivityFreeGasRes.activityId) && Intrinsics.EZpvd((Object) this.activitySymbol, (Object) walletActivityFreeGasRes.activitySymbol) && Intrinsics.EZpvd(this.activityStatus, walletActivityFreeGasRes.activityStatus) && this.beginTime == walletActivityFreeGasRes.beginTime && this.endTime == walletActivityFreeGasRes.endTime && this.currentTime == walletActivityFreeGasRes.currentTime && Intrinsics.EZpvd(this.activityConfig, walletActivityFreeGasRes.activityConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<FreeGasValuationLimit> getActivityConfig() {
        return this.activityConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getActivityId() {
        return this.activityId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getActivityStatus() {
        return this.activityStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivitySymbol() {
        return this.activitySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getBeginTime() {
        return this.beginTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCurrentTime() {
        return this.currentTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.activityId;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.activitySymbol;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num2 = this.activityStatus;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        int iHashCode4 = Long.hashCode(this.beginTime);
        int iHashCode5 = Long.hashCode(this.endTime);
        int iHashCode6 = Long.hashCode(this.currentTime);
        ArrayList<FreeGasValuationLimit> arrayList = this.activityConfig;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivityConfig(ArrayList<FreeGasValuationLimit> arrayList) {
        this.activityConfig = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivityId(Integer num) {
        this.activityId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivityStatus(Integer num) {
        this.activityStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivitySymbol(String str) {
        this.activitySymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBeginTime(long j) {
        this.beginTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentTime(long j) {
        this.currentTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEndTime(long j) {
        this.endTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletActivityFreeGasRes(activityId=" + this.activityId + ", activitySymbol=" + this.activitySymbol + ", activityStatus=" + this.activityStatus + ", beginTime=" + this.beginTime + ", endTime=" + this.endTime + ", currentTime=" + this.currentTime + ", activityConfig=" + this.activityConfig + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.activityId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.activitySymbol);
        Integer num2 = this.activityStatus;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeLong(this.beginTime);
        parcel.writeLong(this.endTime);
        parcel.writeLong(this.currentTime);
        ArrayList<FreeGasValuationLimit> arrayList = this.activityConfig;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<FreeGasValuationLimit> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.WalletActivityFreeGasRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletActivityFreeGasRes> serializer() {
            return WalletActivityFreeGasRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletActivityFreeGasRes(int i, Integer num, String str, Integer num2, long j, long j2, long j3, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.activityId = null;
        } else {
            this.activityId = num;
        }
        if ((i & 2) == 0) {
            this.activitySymbol = "";
        } else {
            this.activitySymbol = str;
        }
        if ((i & 4) == 0) {
            this.activityStatus = 0;
        } else {
            this.activityStatus = num2;
        }
        if ((i & 8) == 0) {
            this.beginTime = 0L;
        } else {
            this.beginTime = j;
        }
        if ((i & 16) == 0) {
            this.endTime = 0L;
        } else {
            this.endTime = j2;
        }
        if ((i & 32) == 0) {
            this.currentTime = 0L;
        } else {
            this.currentTime = j3;
        }
        if ((i & 64) == 0) {
            this.activityConfig = null;
        } else {
            this.activityConfig = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletActivityFreeGasRes walletActivityFreeGasRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || walletActivityFreeGasRes.activityId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, walletActivityFreeGasRes.activityId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) walletActivityFreeGasRes.activitySymbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, walletActivityFreeGasRes.activitySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || (num = walletActivityFreeGasRes.activityStatus) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, walletActivityFreeGasRes.activityStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || walletActivityFreeGasRes.beginTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 3, walletActivityFreeGasRes.beginTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || walletActivityFreeGasRes.endTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 4, walletActivityFreeGasRes.endTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || walletActivityFreeGasRes.currentTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 5, walletActivityFreeGasRes.currentTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && walletActivityFreeGasRes.activityConfig == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], walletActivityFreeGasRes.activityConfig);
    }

    public WalletActivityFreeGasRes(Integer num, String str, Integer num2, long j, long j2, long j3, ArrayList<FreeGasValuationLimit> arrayList) {
        this.activityId = num;
        this.activitySymbol = str;
        this.activityStatus = num2;
        this.beginTime = j;
        this.endTime = j2;
        this.currentTime = j3;
        this.activityConfig = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0046: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r12v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0010: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r14v0 java.lang.Integer))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001b: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r15v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0024: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r17v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002c: ARITH (r22v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r19v0 long) : (0 long))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0033: ARITH (r22v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.util.ArrayList) : (null java.util.ArrayList))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.Integer, long, long, long, java.util.ArrayList<com.okinc.business.defi.biz.net.bean.FreeGasValuationLimit>):void (m)] (LINE:397) call: com.okinc.business.defi.biz.net.bean.WalletActivityFreeGasRes.<init>(java.lang.Integer, java.lang.String, java.lang.Integer, long, long, long, java.util.ArrayList):void type: THIS */
    public /* synthetic */ WalletActivityFreeGasRes(Integer num, String str, Integer num2, long j, long j2, long j3, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0 : num2, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? 0L : j2, (i & 32) == 0 ? j3 : 0L, (i & 64) == 0 ? arrayList : null);
    }
}
