package com.okinc.business.defi.dapp.net;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.dapp.bean.DappChains;
import com.okinc.dapp.bean.DappChains$$serializer;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class OKAAWalletChainList implements Parcelable {
    private List<DappChains> dappAAWalletChainList;
    private String dappNftId;
    private List<OKDapp> dappOkxList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OKAAWalletChainList> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(DappChains$$serializer.INSTANCE), null, new ArrayListSerializer(OKDapp$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<OKAAWalletChainList> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKAAWalletChainList createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(parcel.readParcelable(OKAAWalletChainList.class.getClassLoader()));
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList3.add(OKDapp.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList3;
            }
            return new OKAAWalletChainList(arrayList2, string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKAAWalletChainList[] newArray(int i) {
            return new OKAAWalletChainList[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.dapp.net.OKAAWalletChainList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OKAAWalletChainList copy$default(OKAAWalletChainList oKAAWalletChainList, List list, String str, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = oKAAWalletChainList.dappAAWalletChainList;
        }
        if ((i & 2) != 0) {
            str = oKAAWalletChainList.dappNftId;
        }
        if ((i & 4) != 0) {
            list2 = oKAAWalletChainList.dappOkxList;
        }
        return oKAAWalletChainList.copy(list, str, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DappChains> component1() {
        return this.dappAAWalletChainList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.dappNftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<OKDapp> component3() {
        return this.dappOkxList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKAAWalletChainList copy(@NotNull List<DappChains> list, String str, List<OKDapp> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new OKAAWalletChainList(list, str, list2);
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
        if (!(obj instanceof OKAAWalletChainList)) {
            return false;
        }
        OKAAWalletChainList oKAAWalletChainList = (OKAAWalletChainList) obj;
        return Intrinsics.EZpvd(this.dappAAWalletChainList, oKAAWalletChainList.dappAAWalletChainList) && Intrinsics.EZpvd((Object) this.dappNftId, (Object) oKAAWalletChainList.dappNftId) && Intrinsics.EZpvd(this.dappOkxList, oKAAWalletChainList.dappOkxList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DappChains> getDappAAWalletChainList() {
        return this.dappAAWalletChainList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDappNftId() {
        return this.dappNftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<OKDapp> getDappOkxList() {
        return this.dappOkxList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.dappAAWalletChainList.hashCode();
        String str = this.dappNftId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        List<OKDapp> list = this.dappOkxList;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDappAAWalletChainList(@NotNull List<DappChains> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.dappAAWalletChainList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDappNftId(String str) {
        this.dappNftId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDappOkxList(List<OKDapp> list) {
        this.dappOkxList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKAAWalletChainList(dappAAWalletChainList=" + this.dappAAWalletChainList + ", dappNftId=" + this.dappNftId + ", dappOkxList=" + this.dappOkxList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<DappChains> list = this.dappAAWalletChainList;
        parcel.writeInt(list.size());
        Iterator<DappChains> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeString(this.dappNftId);
        List<OKDapp> list2 = this.dappOkxList;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<OKDapp> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.net.OKAAWalletChainList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKAAWalletChainList> serializer() {
            return OKAAWalletChainList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OKAAWalletChainList(int i, List list, String str, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, OKAAWalletChainList$$serializer.INSTANCE.getDescriptor());
        }
        this.dappAAWalletChainList = list;
        if ((i & 2) == 0) {
            this.dappNftId = "";
        } else {
            this.dappNftId = str;
        }
        if ((i & 4) == 0) {
            this.dappOkxList = null;
        } else {
            this.dappOkxList = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDiscover_discover_impl(OKAAWalletChainList oKAAWalletChainList, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], oKAAWalletChainList.dappAAWalletChainList);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) oKAAWalletChainList.dappNftId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, oKAAWalletChainList.dappNftId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && oKAAWalletChainList.dappOkxList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], oKAAWalletChainList.dappOkxList);
    }

    public OKAAWalletChainList(@NotNull List<DappChains> list, String str, List<OKDapp> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.dappAAWalletChainList = list;
        this.dappNftId = str;
        this.dappOkxList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.dapp.bean.DappChains>, java.lang.String, java.util.List<com.okinc.business.defi.dapp.net.OKDapp>):void (m)] (LINE:102) call: com.okinc.business.defi.dapp.net.OKAAWalletChainList.<init>(java.util.List, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ OKAAWalletChainList(List list, String str, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : list2);
    }
}
