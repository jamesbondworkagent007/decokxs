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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletPnlTokenListResponse implements Parcelable {
    private final Boolean hasNext;
    private final Integer offset;
    private final List<WalletPnlTokenBean> tokenList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletPnlTokenListResponse> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(WalletPnlTokenBean$$serializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<WalletPnlTokenListResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletPnlTokenListResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(WalletPnlTokenBean.CREATOR.createFromParcel(parcel));
                }
            }
            return new WalletPnlTokenListResponse(arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletPnlTokenListResponse[] newArray(int i) {
            return new WalletPnlTokenListResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletPnlTokenListResponse() {
        this((List) null, (Boolean) null, (Integer) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.WalletPnlTokenListResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletPnlTokenListResponse copy$default(WalletPnlTokenListResponse walletPnlTokenListResponse, List list, Boolean bool, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = walletPnlTokenListResponse.tokenList;
        }
        if ((i & 2) != 0) {
            bool = walletPnlTokenListResponse.hasNext;
        }
        if ((i & 4) != 0) {
            num = walletPnlTokenListResponse.offset;
        }
        return walletPnlTokenListResponse.copy(list, bool, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WalletPnlTokenBean> component1() {
        return this.tokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.hasNext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.offset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletPnlTokenListResponse copy(List<WalletPnlTokenBean> list, Boolean bool, Integer num) {
        return new WalletPnlTokenListResponse(list, bool, num);
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
        if (!(obj instanceof WalletPnlTokenListResponse)) {
            return false;
        }
        WalletPnlTokenListResponse walletPnlTokenListResponse = (WalletPnlTokenListResponse) obj;
        return Intrinsics.EZpvd(this.tokenList, walletPnlTokenListResponse.tokenList) && Intrinsics.EZpvd(this.hasNext, walletPnlTokenListResponse.hasNext) && Intrinsics.EZpvd(this.offset, walletPnlTokenListResponse.offset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasNext() {
        return this.hasNext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOffset() {
        return this.offset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WalletPnlTokenBean> getTokenList() {
        return this.tokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<WalletPnlTokenBean> list = this.tokenList;
        int iHashCode = list == null ? 0 : list.hashCode();
        Boolean bool = this.hasNext;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        Integer num = this.offset;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletPnlTokenListResponse(tokenList=" + this.tokenList + ", hasNext=" + this.hasNext + ", offset=" + this.offset + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<WalletPnlTokenBean> list = this.tokenList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<WalletPnlTokenBean> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.hasNext;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.offset;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.WalletPnlTokenListResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletPnlTokenListResponse> serializer() {
            return WalletPnlTokenListResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletPnlTokenListResponse(int i, List list, Boolean bool, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        this.tokenList = (i & 1) == 0 ? null : list;
        if ((i & 2) == 0) {
            this.hasNext = Boolean.FALSE;
        } else {
            this.hasNext = bool;
        }
        if ((i & 4) == 0) {
            this.offset = 0;
        } else {
            this.offset = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletPnlTokenListResponse walletPnlTokenListResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || walletPnlTokenListResponse.tokenList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], walletPnlTokenListResponse.tokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(walletPnlTokenListResponse.hasNext, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, walletPnlTokenListResponse.hasNext);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || (num = walletPnlTokenListResponse.offset) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, walletPnlTokenListResponse.offset);
        }
    }

    public WalletPnlTokenListResponse(List<WalletPnlTokenBean> list, Boolean bool, Integer num) {
        this.tokenList = list;
        this.hasNext = bool;
        this.offset = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0009: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r2v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 java.lang.Integer))
 A[MD:(java.util.List<com.okinc.business.defi.biz.net.bean.WalletPnlTokenBean>, java.lang.Boolean, java.lang.Integer):void (m)] (LINE:30) call: com.okinc.business.defi.biz.net.bean.WalletPnlTokenListResponse.<init>(java.util.List, java.lang.Boolean, java.lang.Integer):void type: THIS */
    public /* synthetic */ WalletPnlTokenListResponse(List list, Boolean bool, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? 0 : num);
    }
}
