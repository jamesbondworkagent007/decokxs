package com.okinc.business.defi.wallet.mine.search.banner.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class WalletBannerEventData {
    private final List<WalletBannerEventItem> items;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(WalletBannerEventItem$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletBannerEventData() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.mine.search.banner.data.model.WalletBannerEventData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletBannerEventData copy$default(WalletBannerEventData walletBannerEventData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = walletBannerEventData.items;
        }
        return walletBannerEventData.copy(list);
    }

    @SerialName("items")
    public static /* synthetic */ void getItems$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WalletBannerEventItem> component1() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletBannerEventData copy(List<WalletBannerEventItem> list) {
        return new WalletBannerEventData(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WalletBannerEventData) && Intrinsics.EZpvd(this.items, ((WalletBannerEventData) obj).items);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WalletBannerEventItem> getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<WalletBannerEventItem> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletBannerEventData(items=" + this.items + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.banner.data.model.WalletBannerEventData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletBannerEventData> serializer() {
            return WalletBannerEventData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletBannerEventData(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.items = null;
        } else {
            this.items = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletBannerEventData walletBannerEventData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && walletBannerEventData.items == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], walletBannerEventData.items);
    }

    public WalletBannerEventData(List<WalletBannerEventItem> list) {
        this.items = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.defi.wallet.mine.search.banner.data.model.WalletBannerEventItem>):void (m)] (LINE:9) call: com.okinc.business.defi.wallet.mine.search.banner.data.model.WalletBannerEventData.<init>(java.util.List):void type: THIS */
    public /* synthetic */ WalletBannerEventData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
