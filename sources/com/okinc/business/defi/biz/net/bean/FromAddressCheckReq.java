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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class FromAddressCheckReq implements Parcelable {
    private final boolean rpcChain;
    private final List<AddressCheck> txList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FromAddressCheckReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(AddressCheck$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<FromAddressCheckReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FromAddressCheckReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(AddressCheck.CREATOR.createFromParcel(parcel));
            }
            return new FromAddressCheckReq(z, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FromAddressCheckReq[] newArray(int i) {
            return new FromAddressCheckReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.FromAddressCheckReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FromAddressCheckReq copy$default(FromAddressCheckReq fromAddressCheckReq, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fromAddressCheckReq.rpcChain;
        }
        if ((i & 2) != 0) {
            list = fromAddressCheckReq.txList;
        }
        return fromAddressCheckReq.copy(z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.rpcChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressCheck> component2() {
        return this.txList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FromAddressCheckReq copy(boolean z, @NotNull List<AddressCheck> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new FromAddressCheckReq(z, list);
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
        if (!(obj instanceof FromAddressCheckReq)) {
            return false;
        }
        FromAddressCheckReq fromAddressCheckReq = (FromAddressCheckReq) obj;
        return this.rpcChain == fromAddressCheckReq.rpcChain && Intrinsics.EZpvd(this.txList, fromAddressCheckReq.txList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRpcChain() {
        return this.rpcChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressCheck> getTxList() {
        return this.txList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.rpcChain) * 31) + this.txList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FromAddressCheckReq(rpcChain=" + this.rpcChain + ", txList=" + this.txList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.rpcChain ? 1 : 0);
        List<AddressCheck> list = this.txList;
        parcel.writeInt(list.size());
        Iterator<AddressCheck> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.FromAddressCheckReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FromAddressCheckReq> serializer() {
            return FromAddressCheckReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FromAddressCheckReq(int i, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, FromAddressCheckReq$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.rpcChain = false;
        } else {
            this.rpcChain = z;
        }
        this.txList = list;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(FromAddressCheckReq fromAddressCheckReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || fromAddressCheckReq.rpcChain) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, fromAddressCheckReq.rpcChain);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], fromAddressCheckReq.txList);
    }

    public FromAddressCheckReq(boolean z, @NotNull List<AddressCheck> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.rpcChain = z;
        this.txList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (r2v0 java.util.List)
 A[MD:(boolean, java.util.List<com.okinc.business.defi.biz.net.bean.AddressCheck>):void (m)] (LINE:11) call: com.okinc.business.defi.biz.net.bean.FromAddressCheckReq.<init>(boolean, java.util.List):void type: THIS */
    public /* synthetic */ FromAddressCheckReq(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, list);
    }
}
