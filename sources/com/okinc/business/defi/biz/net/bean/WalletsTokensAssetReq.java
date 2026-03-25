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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletsTokensAssetReq implements Parcelable {
    private List<String> accountIds;
    private List<Long> coinIds;
    private Boolean needPnl;
    private String userUniqueId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletsTokensAssetReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), new ArrayListSerializer(LongSerializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<WalletsTokensAssetReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletsTokensAssetReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new WalletsTokensAssetReq(arrayListCreateStringArrayList, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletsTokensAssetReq[] newArray(int i) {
            return new WalletsTokensAssetReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletsTokensAssetReq() {
        this((List) null, (List) null, (String) null, (Boolean) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.WalletsTokensAssetReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletsTokensAssetReq copy$default(WalletsTokensAssetReq walletsTokensAssetReq, List list, List list2, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = walletsTokensAssetReq.accountIds;
        }
        if ((i & 2) != 0) {
            list2 = walletsTokensAssetReq.coinIds;
        }
        if ((i & 4) != 0) {
            str = walletsTokensAssetReq.userUniqueId;
        }
        if ((i & 8) != 0) {
            bool = walletsTokensAssetReq.needPnl;
        }
        return walletsTokensAssetReq.copy(list, list2, str, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.accountIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component2() {
        return this.coinIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.needPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletsTokensAssetReq copy(@NotNull List<String> list, @NotNull List<Long> list2, @NotNull String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new WalletsTokensAssetReq(list, list2, str, bool);
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
        if (!(obj instanceof WalletsTokensAssetReq)) {
            return false;
        }
        WalletsTokensAssetReq walletsTokensAssetReq = (WalletsTokensAssetReq) obj;
        return Intrinsics.EZpvd(this.accountIds, walletsTokensAssetReq.accountIds) && Intrinsics.EZpvd(this.coinIds, walletsTokensAssetReq.coinIds) && Intrinsics.EZpvd((Object) this.userUniqueId, (Object) walletsTokensAssetReq.userUniqueId) && Intrinsics.EZpvd(this.needPnl, walletsTokensAssetReq.needPnl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAccountIds() {
        return this.accountIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getCoinIds() {
        return this.coinIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getNeedPnl() {
        return this.needPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserUniqueId() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountIds.hashCode();
        int iHashCode2 = this.coinIds.hashCode();
        int iHashCode3 = this.userUniqueId.hashCode();
        Boolean bool = this.needPnl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountIds(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.accountIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinIds(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.coinIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedPnl(Boolean bool) {
        this.needPnl = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserUniqueId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userUniqueId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletsTokensAssetReq(accountIds=" + this.accountIds + ", coinIds=" + this.coinIds + ", userUniqueId=" + this.userUniqueId + ", needPnl=" + this.needPnl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.accountIds);
        List<Long> list = this.coinIds;
        parcel.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeLong(it.next().longValue());
        }
        parcel.writeString(this.userUniqueId);
        Boolean bool = this.needPnl;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.WalletsTokensAssetReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletsTokensAssetReq> serializer() {
            return WalletsTokensAssetReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletsTokensAssetReq(int i, List list, List list2, String str, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        this.accountIds = (i & 1) == 0 ? new ArrayList() : list;
        if ((i & 2) == 0) {
            this.coinIds = new ArrayList();
        } else {
            this.coinIds = list2;
        }
        if ((i & 4) == 0) {
            this.userUniqueId = "";
        } else {
            this.userUniqueId = str;
        }
        if ((i & 8) == 0) {
            this.needPnl = null;
        } else {
            this.needPnl = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletsTokensAssetReq walletsTokensAssetReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(walletsTokensAssetReq.accountIds, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], walletsTokensAssetReq.accountIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(walletsTokensAssetReq.coinIds, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], walletsTokensAssetReq.coinIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) walletsTokensAssetReq.userUniqueId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, walletsTokensAssetReq.userUniqueId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && walletsTokensAssetReq.needPnl == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, walletsTokensAssetReq.needPnl);
    }

    public WalletsTokensAssetReq(@NotNull List<String> list, @NotNull List<Long> list2, @NotNull String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.accountIds = list;
        this.coinIds = list2;
        this.userUniqueId = str;
        this.needPnl = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:282) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0009: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:283) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r4v0 java.lang.Boolean))
 A[MD:(java.util.List<java.lang.String>, java.util.List<java.lang.Long>, java.lang.String, java.lang.Boolean):void (m)] (LINE:281) call: com.okinc.business.defi.biz.net.bean.WalletsTokensAssetReq.<init>(java.util.List, java.util.List, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ WalletsTokensAssetReq(List list, List list2, String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : bool);
    }
}
