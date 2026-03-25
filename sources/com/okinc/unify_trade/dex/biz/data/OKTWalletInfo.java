package com.okinc.unify_trade.dex.biz.data;

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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class OKTWalletInfo implements Parcelable {
    private final String accountId;
    private final boolean hasWalletAddress;
    private final String status;
    private final List<WalletInfo> wallets;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OKTWalletInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(WalletInfo$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<OKTWalletInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKTWalletInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(WalletInfo.CREATOR.createFromParcel(parcel));
            }
            return new OKTWalletInfo(string, string2, z, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKTWalletInfo[] newArray(int i) {
            return new OKTWalletInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKTWalletInfo() {
        this((String) null, (String) null, false, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.dex.biz.data.OKTWalletInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OKTWalletInfo copy$default(OKTWalletInfo oKTWalletInfo, String str, String str2, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oKTWalletInfo.accountId;
        }
        if ((i & 2) != 0) {
            str2 = oKTWalletInfo.status;
        }
        if ((i & 4) != 0) {
            z = oKTWalletInfo.hasWalletAddress;
        }
        if ((i & 8) != 0) {
            list = oKTWalletInfo.wallets;
        }
        return oKTWalletInfo.copy(str, str2, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.hasWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WalletInfo> component4() {
        return this.wallets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKTWalletInfo copy(@NotNull String str, @NotNull String str2, boolean z, @NotNull List<WalletInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new OKTWalletInfo(str, str2, z, list);
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
        if (!(obj instanceof OKTWalletInfo)) {
            return false;
        }
        OKTWalletInfo oKTWalletInfo = (OKTWalletInfo) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) oKTWalletInfo.accountId) && Intrinsics.EZpvd((Object) this.status, (Object) oKTWalletInfo.status) && this.hasWalletAddress == oKTWalletInfo.hasWalletAddress && Intrinsics.EZpvd(this.wallets, oKTWalletInfo.wallets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasWalletAddress() {
        return this.hasWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WalletInfo> getWallets() {
        return this.wallets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.accountId.hashCode() * 31) + this.status.hashCode()) * 31) + Boolean.hashCode(this.hasWalletAddress)) * 31) + this.wallets.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKTWalletInfo(accountId=" + this.accountId + ", status=" + this.status + ", hasWalletAddress=" + this.hasWalletAddress + ", wallets=" + this.wallets + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        parcel.writeString(this.status);
        parcel.writeInt(this.hasWalletAddress ? 1 : 0);
        List<WalletInfo> list = this.wallets;
        parcel.writeInt(list.size());
        Iterator<WalletInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.dex.biz.data.OKTWalletInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKTWalletInfo> serializer() {
            return OKTWalletInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OKTWalletInfo(int i, String str, String str2, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str;
        }
        if ((i & 2) == 0) {
            this.status = "";
        } else {
            this.status = str2;
        }
        if ((i & 4) == 0) {
            this.hasWalletAddress = false;
        } else {
            this.hasWalletAddress = z;
        }
        if ((i & 8) == 0) {
            this.wallets = yDY.AhwBna();
        } else {
            this.wallets = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OKTWalletInfo oKTWalletInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) oKTWalletInfo.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, oKTWalletInfo.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) oKTWalletInfo.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, oKTWalletInfo.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || oKTWalletInfo.hasWalletAddress) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, oKTWalletInfo.hasWalletAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(oKTWalletInfo.wallets, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], oKTWalletInfo.wallets);
    }

    public OKTWalletInfo(@NotNull String str, @NotNull String str2, boolean z, @NotNull List<WalletInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.accountId = str;
        this.status = str2;
        this.hasWalletAddress = z;
        this.wallets = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0015: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:18)) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, boolean, java.util.List<com.okinc.unify_trade.dex.biz.data.WalletInfo>):void (m)] (LINE:14) call: com.okinc.unify_trade.dex.biz.data.OKTWalletInfo.<init>(java.lang.String, java.lang.String, boolean, java.util.List):void type: THIS */
    public /* synthetic */ OKTWalletInfo(String str, String str2, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? yDY.AhwBna() : list);
    }
}
