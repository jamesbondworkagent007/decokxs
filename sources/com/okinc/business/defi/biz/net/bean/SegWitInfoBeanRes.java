package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.wallet.api.bean.AddressType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class SegWitInfoBeanRes implements Parcelable {
    public String accountId;
    public String address;
    public Integer addressType;
    public Long coinId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SegWitInfoBeanRes> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SegWitInfoBeanRes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SegWitInfoBeanRes createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SegWitInfoBeanRes(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SegWitInfoBeanRes[] newArray(int i) {
            return new SegWitInfoBeanRes[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SegWitInfoBeanRes() {
        this((String) null, (Long) null, (String) null, (Integer) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SegWitInfoBeanRes copy$default(SegWitInfoBeanRes segWitInfoBeanRes, String str, Long l, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = segWitInfoBeanRes.accountId;
        }
        if ((i & 2) != 0) {
            l = segWitInfoBeanRes.coinId;
        }
        if ((i & 4) != 0) {
            str2 = segWitInfoBeanRes.address;
        }
        if ((i & 8) != 0) {
            num = segWitInfoBeanRes.addressType;
        }
        return segWitInfoBeanRes.OLrzqt(str, l, str2, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long AEQbTJ() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer KWHzl() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SegWitInfoBeanRes OLrzqt(String str, Long l, String str2, Integer num) {
        return new SegWitInfoBeanRes(str, l, str2, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.accountId;
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
        if (!(obj instanceof SegWitInfoBeanRes)) {
            return false;
        }
        SegWitInfoBeanRes segWitInfoBeanRes = (SegWitInfoBeanRes) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) segWitInfoBeanRes.accountId) && Intrinsics.EZpvd(this.coinId, segWitInfoBeanRes.coinId) && Intrinsics.EZpvd((Object) this.address, (Object) segWitInfoBeanRes.address) && Intrinsics.EZpvd(this.addressType, segWitInfoBeanRes.addressType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.accountId;
        int iHashCode = str == null ? 0 : str.hashCode();
        Long l = this.coinId;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        String str2 = this.address;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.addressType;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SegWitInfoBeanRes(accountId=" + this.accountId + ", coinId=" + this.coinId + ", address=" + this.address + ", addressType=" + this.addressType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        Long l = this.coinId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.address);
        Integer num = this.addressType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.SegWitInfoBeanRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SegWitInfoBeanRes> serializer() {
            return SegWitInfoBeanRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SegWitInfoBeanRes(int i, String str, Long l, String str2, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str;
        }
        if ((i & 2) == 0) {
            this.coinId = 0L;
        } else {
            this.coinId = l;
        }
        if ((i & 4) == 0) {
            this.address = "";
        } else {
            this.address = str2;
        }
        if ((i & 8) == 0) {
            this.addressType = Integer.valueOf(AddressType.Legacy.getValue());
        } else {
            this.addressType = num;
        }
    }

    public static final /* synthetic */ void copydefault(SegWitInfoBeanRes segWitInfoBeanRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) segWitInfoBeanRes.accountId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, segWitInfoBeanRes.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || (l = segWitInfoBeanRes.coinId) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, segWitInfoBeanRes.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) segWitInfoBeanRes.address, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, segWitInfoBeanRes.address);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3)) {
            Integer num = segWitInfoBeanRes.addressType;
            int value = AddressType.Legacy.getValue();
            if (num != null && num.intValue() == value) {
                return;
            }
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, segWitInfoBeanRes.addressType);
    }

    public SegWitInfoBeanRes(String str, Long l, String str2, Integer num) {
        this.accountId = str;
        this.coinId = l;
        this.address = str2;
        this.addressType = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0024: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r8v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0007: ARITH (r8v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r5v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r8v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r8v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Integer:0x0020: INVOKE 
  (wrap:int:0x001c: INVOKE 
  (wrap:com.okinc.wallet.api.bean.AddressType:0x001a: SGET  A[WRAPPED] (LINE:683) com.okinc.wallet.api.bean.AddressType.Legacy com.okinc.wallet.api.bean.AddressType)
 VIRTUAL call: com.okinc.wallet.api.bean.AddressType.getValue():int A[MD:():int (m), WRAPPED] (LINE:683))
 STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:683)) : (r7v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer):void (m)] (LINE:679) call: com.okinc.business.defi.biz.net.bean.SegWitInfoBeanRes.<init>(java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ SegWitInfoBeanRes(String str, Long l, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : l, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? Integer.valueOf(AddressType.Legacy.getValue()) : num);
    }
}
