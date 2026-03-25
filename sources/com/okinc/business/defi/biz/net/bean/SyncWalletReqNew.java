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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class SyncWalletReqNew implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private String accountId;
    private List<InternalChainAddressNew> addAddresses;
    private List<InternalChainAddressNew> updateAddresses;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SyncWalletReqNew> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SyncWalletReqNew> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SyncWalletReqNew createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InternalChainAddressNew.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(InternalChainAddressNew.CREATOR.createFromParcel(parcel));
            }
            return new SyncWalletReqNew(string, arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SyncWalletReqNew[] newArray(int i) {
            return new SyncWalletReqNew[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SyncWalletReqNew() {
        this((String) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.SyncWalletReqNew */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyncWalletReqNew copy$default(SyncWalletReqNew syncWalletReqNew, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = syncWalletReqNew.accountId;
        }
        if ((i & 2) != 0) {
            list = syncWalletReqNew.updateAddresses;
        }
        if ((i & 4) != 0) {
            list2 = syncWalletReqNew.addAddresses;
        }
        return syncWalletReqNew.copy(str, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InternalChainAddressNew> component2() {
        return this.updateAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InternalChainAddressNew> component3() {
        return this.addAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SyncWalletReqNew copy(@NotNull String str, @NotNull List<InternalChainAddressNew> list, @NotNull List<InternalChainAddressNew> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new SyncWalletReqNew(str, list, list2);
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
        if (!(obj instanceof SyncWalletReqNew)) {
            return false;
        }
        SyncWalletReqNew syncWalletReqNew = (SyncWalletReqNew) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) syncWalletReqNew.accountId) && Intrinsics.EZpvd(this.updateAddresses, syncWalletReqNew.updateAddresses) && Intrinsics.EZpvd(this.addAddresses, syncWalletReqNew.addAddresses);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InternalChainAddressNew> getAddAddresses() {
        return this.addAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InternalChainAddressNew> getUpdateAddresses() {
        return this.updateAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.accountId.hashCode() * 31) + this.updateAddresses.hashCode()) * 31) + this.addAddresses.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddAddresses(@NotNull List<InternalChainAddressNew> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.addAddresses = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpdateAddresses(@NotNull List<InternalChainAddressNew> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.updateAddresses = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SyncWalletReqNew(accountId=" + this.accountId + ", updateAddresses=" + this.updateAddresses + ", addAddresses=" + this.addAddresses + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        List<InternalChainAddressNew> list = this.updateAddresses;
        parcel.writeInt(list.size());
        Iterator<InternalChainAddressNew> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<InternalChainAddressNew> list2 = this.addAddresses;
        parcel.writeInt(list2.size());
        Iterator<InternalChainAddressNew> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.SyncWalletReqNew.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SyncWalletReqNew> serializer() {
            return SyncWalletReqNew$$serializer.INSTANCE;
        }
    }

    static {
        InternalChainAddressNew$$serializer internalChainAddressNew$$serializer = InternalChainAddressNew$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(internalChainAddressNew$$serializer), new ArrayListSerializer(internalChainAddressNew$$serializer)};
    }

    public /* synthetic */ SyncWalletReqNew(int i, String str, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.accountId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.updateAddresses = new ArrayList();
        } else {
            this.updateAddresses = list;
        }
        if ((i & 4) == 0) {
            this.addAddresses = new ArrayList();
        } else {
            this.addAddresses = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SyncWalletReqNew syncWalletReqNew, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) syncWalletReqNew.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, syncWalletReqNew.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(syncWalletReqNew.updateAddresses, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], syncWalletReqNew.updateAddresses);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(syncWalletReqNew.addAddresses, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], syncWalletReqNew.addAddresses);
    }

    public SyncWalletReqNew(@NotNull String str, @NotNull List<InternalChainAddressNew> list, @NotNull List<InternalChainAddressNew> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.accountId = str;
        this.updateAddresses = list;
        this.addAddresses = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:193) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0015: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:194) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r3v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.InternalChainAddressNew>, java.util.List<com.okinc.business.defi.biz.net.bean.InternalChainAddressNew>):void (m)] (LINE:191) call: com.okinc.business.defi.biz.net.bean.SyncWalletReqNew.<init>(java.lang.String, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ SyncWalletReqNew(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? new ArrayList() : list2);
    }
}
