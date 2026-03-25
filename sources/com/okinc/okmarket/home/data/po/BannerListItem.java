package com.okinc.okmarket.home.data.po;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class BannerListItem {
    public static final int $stable = 0;
    private final NewCoinData newCoinData;
    private final OkpData okpData;
    private final BannerType type;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {BannerType.Companion.serializer(), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BannerListItem copy$default(BannerListItem bannerListItem, BannerType bannerType, NewCoinData newCoinData, OkpData okpData, int i, Object obj) {
        if ((i & 1) != 0) {
            bannerType = bannerListItem.type;
        }
        if ((i & 2) != 0) {
            newCoinData = bannerListItem.newCoinData;
        }
        if ((i & 4) != 0) {
            okpData = bannerListItem.okpData;
        }
        return bannerListItem.copy(bannerType, newCoinData, okpData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerType component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewCoinData component2() {
        return this.newCoinData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkpData component3() {
        return this.okpData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerListItem copy(@NotNull BannerType bannerType, NewCoinData newCoinData, OkpData okpData) {
        Intrinsics.checkNotNullParameter(bannerType, "");
        return new BannerListItem(bannerType, newCoinData, okpData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerListItem)) {
            return false;
        }
        BannerListItem bannerListItem = (BannerListItem) obj;
        return this.type == bannerListItem.type && Intrinsics.EZpvd(this.newCoinData, bannerListItem.newCoinData) && Intrinsics.EZpvd(this.okpData, bannerListItem.okpData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewCoinData getNewCoinData() {
        return this.newCoinData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkpData getOkpData() {
        return this.okpData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.type.hashCode();
        NewCoinData newCoinData = this.newCoinData;
        int iHashCode2 = newCoinData == null ? 0 : newCoinData.hashCode();
        OkpData okpData = this.okpData;
        return (((iHashCode * 31) + iHashCode2) * 31) + (okpData != null ? okpData.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BannerListItem(type=" + this.type + ", newCoinData=" + this.newCoinData + ", okpData=" + this.okpData + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okmarket.home.data.po.BannerListItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BannerListItem> serializer() {
            return BannerListItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BannerListItem(int i, BannerType bannerType, NewCoinData newCoinData, OkpData okpData, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, BannerListItem$$serializer.INSTANCE.getDescriptor());
        }
        this.type = bannerType;
        if ((i & 2) == 0) {
            this.newCoinData = null;
        } else {
            this.newCoinData = newCoinData;
        }
        if ((i & 4) == 0) {
            this.okpData = null;
        } else {
            this.okpData = okpData;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_impl(BannerListItem bannerListItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], bannerListItem.type);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || bannerListItem.newCoinData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, NewCoinData$$serializer.INSTANCE, bannerListItem.newCoinData);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && bannerListItem.okpData == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, OkpData$$serializer.INSTANCE, bannerListItem.okpData);
    }

    public BannerListItem(@NotNull BannerType bannerType, NewCoinData newCoinData, OkpData okpData) {
        Intrinsics.checkNotNullParameter(bannerType, "");
        this.type = bannerType;
        this.newCoinData = newCoinData;
        this.okpData = okpData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 com.okinc.okmarket.home.data.po.BannerType)
  (wrap:com.okinc.okmarket.home.data.po.NewCoinData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okmarket.home.data.po.NewCoinData) : (r3v0 com.okinc.okmarket.home.data.po.NewCoinData))
  (wrap:com.okinc.okmarket.home.data.po.OkpData:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okmarket.home.data.po.OkpData) : (r4v0 com.okinc.okmarket.home.data.po.OkpData))
 A[MD:(com.okinc.okmarket.home.data.po.BannerType, com.okinc.okmarket.home.data.po.NewCoinData, com.okinc.okmarket.home.data.po.OkpData):void (m)] (LINE:25) call: com.okinc.okmarket.home.data.po.BannerListItem.<init>(com.okinc.okmarket.home.data.po.BannerType, com.okinc.okmarket.home.data.po.NewCoinData, com.okinc.okmarket.home.data.po.OkpData):void type: THIS */
    public /* synthetic */ BannerListItem(BannerType bannerType, NewCoinData newCoinData, OkpData okpData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerType, (i & 2) != 0 ? null : newCoinData, (i & 4) != 0 ? null : okpData);
    }
}
