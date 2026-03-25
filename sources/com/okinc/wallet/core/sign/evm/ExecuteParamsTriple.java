package com.okinc.wallet.core.sign.evm;

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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class ExecuteParamsTriple implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<ExecuteParams> paymasterExecuteParams;
    private final List<ExecuteParams> upgradeExecuteParams;
    private final List<ExecuteParams> userExecuteParams;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ExecuteParamsTriple> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ExecuteParamsTriple> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExecuteParamsTriple createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ExecuteParams.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(ExecuteParams.CREATOR.createFromParcel(parcel));
                }
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(ExecuteParams.CREATOR.createFromParcel(parcel));
            }
            return new ExecuteParamsTriple(arrayList, arrayList2, arrayList3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExecuteParamsTriple[] newArray(int i) {
            return new ExecuteParamsTriple[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ExecuteParams> getPaymasterExecuteParams() {
        return this.paymasterExecuteParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ExecuteParams> getUpgradeExecuteParams() {
        return this.upgradeExecuteParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ExecuteParams> getUserExecuteParams() {
        return this.userExecuteParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<ExecuteParams> list = this.paymasterExecuteParams;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ExecuteParams> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<ExecuteParams> list2 = this.upgradeExecuteParams;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<ExecuteParams> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        List<ExecuteParams> list3 = this.userExecuteParams;
        parcel.writeInt(list3.size());
        Iterator<ExecuteParams> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.evm.ExecuteParamsTriple.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ExecuteParamsTriple> serializer() {
            return ExecuteParamsTriple$$serializer.INSTANCE;
        }
    }

    static {
        ExecuteParams$$serializer executeParams$$serializer = ExecuteParams$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(executeParams$$serializer), new ArrayListSerializer(executeParams$$serializer), new ArrayListSerializer(executeParams$$serializer)};
    }

    public /* synthetic */ ExecuteParamsTriple(int i, List list, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, ExecuteParamsTriple$$serializer.INSTANCE.getDescriptor());
        }
        this.paymasterExecuteParams = list;
        this.upgradeExecuteParams = list2;
        this.userExecuteParams = list3;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(ExecuteParamsTriple executeParamsTriple, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], executeParamsTriple.paymasterExecuteParams);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], executeParamsTriple.upgradeExecuteParams);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], executeParamsTriple.userExecuteParams);
    }

    public ExecuteParamsTriple(List<ExecuteParams> list, List<ExecuteParams> list2, @NotNull List<ExecuteParams> list3) {
        Intrinsics.checkNotNullParameter(list3, "");
        this.paymasterExecuteParams = list;
        this.upgradeExecuteParams = list2;
        this.userExecuteParams = list3;
    }
}
