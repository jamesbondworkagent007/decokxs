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
public final class AddressAllAssetToken implements Parcelable {
    private final int currentPage;
    private final int pageSize;
    private final List<AddressTokenAsset> tokenlist;
    private final int total;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressAllAssetToken> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(AddressTokenAsset$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<AddressAllAssetToken> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressAllAssetToken createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList2.add(AddressTokenAsset.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new AddressAllAssetToken(i, i2, i3, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressAllAssetToken[] newArray(int i) {
            return new AddressAllAssetToken[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddressAllAssetToken() {
        this(0, 0, 0, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.AddressAllAssetToken */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressAllAssetToken copy$default(AddressAllAssetToken addressAllAssetToken, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = addressAllAssetToken.total;
        }
        if ((i4 & 2) != 0) {
            i2 = addressAllAssetToken.pageSize;
        }
        if ((i4 & 4) != 0) {
            i3 = addressAllAssetToken.currentPage;
        }
        if ((i4 & 8) != 0) {
            list = addressAllAssetToken.tokenlist;
        }
        return addressAllAssetToken.copy(i, i2, i3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.currentPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressTokenAsset> component4() {
        return this.tokenlist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressAllAssetToken copy(int i, int i2, int i3, List<AddressTokenAsset> list) {
        return new AddressAllAssetToken(i, i2, i3, list);
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
        if (!(obj instanceof AddressAllAssetToken)) {
            return false;
        }
        AddressAllAssetToken addressAllAssetToken = (AddressAllAssetToken) obj;
        return this.total == addressAllAssetToken.total && this.pageSize == addressAllAssetToken.pageSize && this.currentPage == addressAllAssetToken.currentPage && Intrinsics.EZpvd(this.tokenlist, addressAllAssetToken.tokenlist);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressTokenAsset> getTokenlist() {
        return this.tokenlist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.total);
        int iHashCode2 = Integer.hashCode(this.pageSize);
        int iHashCode3 = Integer.hashCode(this.currentPage);
        List<AddressTokenAsset> list = this.tokenlist;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressAllAssetToken(total=" + this.total + ", pageSize=" + this.pageSize + ", currentPage=" + this.currentPage + ", tokenlist=" + this.tokenlist + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.total);
        parcel.writeInt(this.pageSize);
        parcel.writeInt(this.currentPage);
        List<AddressTokenAsset> list = this.tokenlist;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<AddressTokenAsset> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AddressAllAssetToken.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressAllAssetToken> serializer() {
            return AddressAllAssetToken$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressAllAssetToken(int i, int i2, int i3, int i4, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.total = 0;
        } else {
            this.total = i2;
        }
        if ((i & 2) == 0) {
            this.pageSize = 0;
        } else {
            this.pageSize = i3;
        }
        if ((i & 4) == 0) {
            this.currentPage = 0;
        } else {
            this.currentPage = i4;
        }
        if ((i & 8) == 0) {
            this.tokenlist = null;
        } else {
            this.tokenlist = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AddressAllAssetToken addressAllAssetToken, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || addressAllAssetToken.total != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, addressAllAssetToken.total);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || addressAllAssetToken.pageSize != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, addressAllAssetToken.pageSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || addressAllAssetToken.currentPage != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, addressAllAssetToken.currentPage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && addressAllAssetToken.tokenlist == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], addressAllAssetToken.tokenlist);
    }

    public AddressAllAssetToken(int i, int i2, int i3, List<AddressTokenAsset> list) {
        this.total = i;
        this.pageSize = i2;
        this.currentPage = i3;
        this.tokenlist = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(int, int, int, java.util.List<com.okinc.business.defi.biz.net.bean.AddressTokenAsset>):void (m)] (LINE:1684) call: com.okinc.business.defi.biz.net.bean.AddressAllAssetToken.<init>(int, int, int, java.util.List):void type: THIS */
    public /* synthetic */ AddressAllAssetToken(int i, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? null : list);
    }
}
