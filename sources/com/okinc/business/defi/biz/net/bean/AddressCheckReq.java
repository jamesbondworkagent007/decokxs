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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class AddressCheckReq implements Parcelable {
    public String address;
    public List<Long> coinIdList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressCheckReq> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(LongSerializer.INSTANCE)};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<AddressCheckReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressCheckReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new AddressCheckReq(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressCheckReq[] newArray(int i) {
            return new AddressCheckReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddressCheckReq() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.AddressCheckReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressCheckReq copy$default(AddressCheckReq addressCheckReq, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressCheckReq.address;
        }
        if ((i & 2) != 0) {
            list = addressCheckReq.coinIdList;
        }
        return addressCheckReq.AEQbTJ(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressCheckReq AEQbTJ(@NotNull String str, @NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new AddressCheckReq(str, list);
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
        if (!(obj instanceof AddressCheckReq)) {
            return false;
        }
        AddressCheckReq addressCheckReq = (AddressCheckReq) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) addressCheckReq.address) && Intrinsics.EZpvd(this.coinIdList, addressCheckReq.coinIdList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.address.hashCode() * 31) + this.coinIdList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressCheckReq(address=" + this.address + ", coinIdList=" + this.coinIdList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        List<Long> list = this.coinIdList;
        parcel.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeLong(it.next().longValue());
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AddressCheckReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressCheckReq> serializer() {
            return AddressCheckReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressCheckReq(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.address = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.coinIdList = new ArrayList();
        } else {
            this.coinIdList = list;
        }
    }

    public static final /* synthetic */ void KWHzl(AddressCheckReq addressCheckReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) addressCheckReq.address, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, addressCheckReq.address);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(addressCheckReq.coinIdList, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], addressCheckReq.coinIdList);
    }

    public AddressCheckReq(@NotNull String str, @NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.address = str;
        this.coinIdList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:650) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<java.lang.Long>):void (m)] (LINE:648) call: com.okinc.business.defi.biz.net.bean.AddressCheckReq.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ AddressCheckReq(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list);
    }
}
