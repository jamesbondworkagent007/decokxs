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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class AddCoinAddrReq implements Parcelable {
    private final List<WalletCoinAddrRegisterBean> coinAddrRegisterList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddCoinAddrReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(WalletCoinAddrRegisterBean$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<AddCoinAddrReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddCoinAddrReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(WalletCoinAddrRegisterBean.CREATOR.createFromParcel(parcel));
            }
            return new AddCoinAddrReq(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddCoinAddrReq[] newArray(int i) {
            return new AddCoinAddrReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.AddCoinAddrReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddCoinAddrReq copy$default(AddCoinAddrReq addCoinAddrReq, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = addCoinAddrReq.coinAddrRegisterList;
        }
        return addCoinAddrReq.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WalletCoinAddrRegisterBean> component1() {
        return this.coinAddrRegisterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddCoinAddrReq copy(@NotNull List<WalletCoinAddrRegisterBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new AddCoinAddrReq(list);
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
        return (obj instanceof AddCoinAddrReq) && Intrinsics.EZpvd(this.coinAddrRegisterList, ((AddCoinAddrReq) obj).coinAddrRegisterList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WalletCoinAddrRegisterBean> getCoinAddrRegisterList() {
        return this.coinAddrRegisterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.coinAddrRegisterList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddCoinAddrReq(coinAddrRegisterList=" + this.coinAddrRegisterList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<WalletCoinAddrRegisterBean> list = this.coinAddrRegisterList;
        parcel.writeInt(list.size());
        Iterator<WalletCoinAddrRegisterBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AddCoinAddrReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddCoinAddrReq> serializer() {
            return AddCoinAddrReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddCoinAddrReq(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, AddCoinAddrReq$$serializer.INSTANCE.getDescriptor());
        }
        this.coinAddrRegisterList = list;
    }

    public AddCoinAddrReq(@NotNull List<WalletCoinAddrRegisterBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.coinAddrRegisterList = list;
    }
}
