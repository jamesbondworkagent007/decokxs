package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
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
public final class ApproveListReq implements Parcelable {
    private final List<String> accountIds;
    private final Integer isRisky;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ApproveListReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<ApproveListReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApproveListReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ApproveListReq(parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApproveListReq[] newArray(int i) {
            return new ApproveListReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ApproveListReq() {
        this((List) null, (Integer) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.ApproveListReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApproveListReq copy$default(ApproveListReq approveListReq, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = approveListReq.accountIds;
        }
        if ((i & 2) != 0) {
            num = approveListReq.isRisky;
        }
        return approveListReq.copy(list, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.accountIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.isRisky;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveListReq copy(@NotNull List<String> list, Integer num) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ApproveListReq(list, num);
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
        if (!(obj instanceof ApproveListReq)) {
            return false;
        }
        ApproveListReq approveListReq = (ApproveListReq) obj;
        return Intrinsics.EZpvd(this.accountIds, approveListReq.accountIds) && Intrinsics.EZpvd(this.isRisky, approveListReq.isRisky);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAccountIds() {
        return this.accountIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountIds.hashCode();
        Integer num = this.isRisky;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isRisky() {
        return this.isRisky;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ApproveListReq(accountIds=" + this.accountIds + ", isRisky=" + this.isRisky + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.accountIds);
        Integer num = this.isRisky;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.ApproveListReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ApproveListReq> serializer() {
            return ApproveListReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ApproveListReq(int i, List list, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        this.accountIds = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.isRisky = null;
        } else {
            this.isRisky = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ApproveListReq approveListReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(approveListReq.accountIds, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], approveListReq.accountIds);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && approveListReq.isRisky == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, approveListReq.isRisky);
    }

    public ApproveListReq(@NotNull List<String> list, Integer num) {
        Intrinsics.checkNotNullParameter(list, "");
        this.accountIds = list;
        this.isRisky = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:240)) : (r1v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
 A[MD:(java.util.List<java.lang.String>, java.lang.Integer):void (m)] (LINE:239) call: com.okinc.business.defi.biz.net.bean.ApproveListReq.<init>(java.util.List, java.lang.Integer):void type: THIS */
    public /* synthetic */ ApproveListReq(List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? null : num);
    }
}
