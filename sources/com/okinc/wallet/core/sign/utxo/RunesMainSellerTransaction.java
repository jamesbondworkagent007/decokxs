package com.okinc.wallet.core.sign.utxo;

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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class RunesMainSellerTransaction implements Parcelable {
    private String address;
    private List<RunesMainTxIn> inputs;
    private String price;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RunesMainSellerTransaction> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(RunesMainTxIn$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<RunesMainSellerTransaction> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RunesMainSellerTransaction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(RunesMainTxIn.CREATOR.createFromParcel(parcel));
            }
            return new RunesMainSellerTransaction(string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RunesMainSellerTransaction[] newArray(int i) {
            return new RunesMainSellerTransaction[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.wallet.core.sign.utxo.RunesMainSellerTransaction */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RunesMainSellerTransaction copy$default(RunesMainSellerTransaction runesMainSellerTransaction, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = runesMainSellerTransaction.price;
        }
        if ((i & 2) != 0) {
            str2 = runesMainSellerTransaction.address;
        }
        if ((i & 4) != 0) {
            list = runesMainSellerTransaction.inputs;
        }
        return runesMainSellerTransaction.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RunesMainTxIn> component3() {
        return this.inputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RunesMainSellerTransaction copy(@NotNull String str, @NotNull String str2, @NotNull List<RunesMainTxIn> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new RunesMainSellerTransaction(str, str2, list);
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
        if (!(obj instanceof RunesMainSellerTransaction)) {
            return false;
        }
        RunesMainSellerTransaction runesMainSellerTransaction = (RunesMainSellerTransaction) obj;
        return Intrinsics.EZpvd((Object) this.price, (Object) runesMainSellerTransaction.price) && Intrinsics.EZpvd((Object) this.address, (Object) runesMainSellerTransaction.address) && Intrinsics.EZpvd(this.inputs, runesMainSellerTransaction.inputs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RunesMainTxIn> getInputs() {
        return this.inputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.price.hashCode() * 31) + this.address.hashCode()) * 31) + this.inputs.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputs(@NotNull List<RunesMainTxIn> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.inputs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RunesMainSellerTransaction(price=" + this.price + ", address=" + this.address + ", inputs=" + this.inputs + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.price);
        parcel.writeString(this.address);
        List<RunesMainTxIn> list = this.inputs;
        parcel.writeInt(list.size());
        Iterator<RunesMainTxIn> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.RunesMainSellerTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RunesMainSellerTransaction> serializer() {
            return RunesMainSellerTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RunesMainSellerTransaction(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, RunesMainSellerTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.price = str;
        this.address = str2;
        this.inputs = list;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(RunesMainSellerTransaction runesMainSellerTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, runesMainSellerTransaction.price);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, runesMainSellerTransaction.address);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], runesMainSellerTransaction.inputs);
    }

    public RunesMainSellerTransaction(@NotNull String str, @NotNull String str2, @NotNull List<RunesMainTxIn> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.price = str;
        this.address = str2;
        this.inputs = list;
    }
}
