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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletMarketReq implements Parcelable {
    private List<Long> coinIds;
    private String currency;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletMarketReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(LongSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<WalletMarketReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletMarketReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new WalletMarketReq(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletMarketReq[] newArray(int i) {
            return new WalletMarketReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletMarketReq() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.WalletMarketReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletMarketReq copy$default(WalletMarketReq walletMarketReq, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletMarketReq.currency;
        }
        if ((i & 2) != 0) {
            list = walletMarketReq.coinIds;
        }
        return walletMarketReq.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component2() {
        return this.coinIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletMarketReq copy(@NotNull String str, @NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new WalletMarketReq(str, list);
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
        if (!(obj instanceof WalletMarketReq)) {
            return false;
        }
        WalletMarketReq walletMarketReq = (WalletMarketReq) obj;
        return Intrinsics.EZpvd((Object) this.currency, (Object) walletMarketReq.currency) && Intrinsics.EZpvd(this.coinIds, walletMarketReq.coinIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getCoinIds() {
        return this.coinIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.currency.hashCode() * 31) + this.coinIds.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinIds(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.coinIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletMarketReq(currency=" + this.currency + ", coinIds=" + this.coinIds + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.currency);
        List<Long> list = this.coinIds;
        parcel.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeLong(it.next().longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.WalletMarketReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletMarketReq> serializer() {
            return WalletMarketReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletMarketReq(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.currency = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.coinIds = new ArrayList();
        } else {
            this.coinIds = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletMarketReq walletMarketReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) walletMarketReq.currency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, walletMarketReq.currency);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(walletMarketReq.coinIds, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], walletMarketReq.coinIds);
    }

    public WalletMarketReq(@NotNull String str, @NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.currency = str;
        this.coinIds = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:211) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<java.lang.Long>):void (m)] (LINE:209) call: com.okinc.business.defi.biz.net.bean.WalletMarketReq.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ WalletMarketReq(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list);
    }
}
