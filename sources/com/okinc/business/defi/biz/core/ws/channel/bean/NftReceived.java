package com.okinc.business.defi.biz.core.ws.channel.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class NftReceived {
    private CollectionItem collectionItem;
    private int count;
    private NFTItem nftItem;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NftReceived() {
        this((NFTItem) null, 0, (CollectionItem) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NftReceived copy$default(NftReceived nftReceived, NFTItem nFTItem, int i, CollectionItem collectionItem, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            nFTItem = nftReceived.nftItem;
        }
        if ((i2 & 2) != 0) {
            i = nftReceived.count;
        }
        if ((i2 & 4) != 0) {
            collectionItem = nftReceived.collectionItem;
        }
        return nftReceived.copy(nFTItem, i, collectionItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NFTItem component1() {
        return this.nftItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CollectionItem component3() {
        return this.collectionItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NftReceived copy(NFTItem nFTItem, int i, CollectionItem collectionItem) {
        return new NftReceived(nFTItem, i, collectionItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NftReceived)) {
            return false;
        }
        NftReceived nftReceived = (NftReceived) obj;
        return Intrinsics.EZpvd(this.nftItem, nftReceived.nftItem) && this.count == nftReceived.count && Intrinsics.EZpvd(this.collectionItem, nftReceived.collectionItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CollectionItem getCollectionItem() {
        return this.collectionItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NFTItem getNftItem() {
        return this.nftItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        NFTItem nFTItem = this.nftItem;
        int iHashCode = nFTItem == null ? 0 : nFTItem.hashCode();
        int iHashCode2 = Integer.hashCode(this.count);
        CollectionItem collectionItem = this.collectionItem;
        return (((iHashCode * 31) + iHashCode2) * 31) + (collectionItem != null ? collectionItem.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCollectionItem(CollectionItem collectionItem) {
        this.collectionItem = collectionItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCount(int i) {
        this.count = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftItem(NFTItem nFTItem) {
        this.nftItem = nFTItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NftReceived(nftItem=" + this.nftItem + ", count=" + this.count + ", collectionItem=" + this.collectionItem + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.bean.NftReceived.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NftReceived> serializer() {
            return NftReceived$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NftReceived(int i, NFTItem nFTItem, int i2, CollectionItem collectionItem, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.nftItem = null;
        } else {
            this.nftItem = nFTItem;
        }
        if ((i & 2) == 0) {
            this.count = 0;
        } else {
            this.count = i2;
        }
        if ((i & 4) == 0) {
            this.collectionItem = null;
        } else {
            this.collectionItem = collectionItem;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(NftReceived nftReceived, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || nftReceived.nftItem != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, NFTItem$$serializer.INSTANCE, nftReceived.nftItem);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || nftReceived.count != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, nftReceived.count);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && nftReceived.collectionItem == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, CollectionItem$$serializer.INSTANCE, nftReceived.collectionItem);
    }

    public NftReceived(NFTItem nFTItem, int i, CollectionItem collectionItem) {
        this.nftItem = nFTItem;
        this.count = i;
        this.collectionItem = collectionItem;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.biz.core.ws.channel.bean.NFTItem:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.core.ws.channel.bean.NFTItem) : (r2v0 com.okinc.business.defi.biz.core.ws.channel.bean.NFTItem))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:com.okinc.business.defi.biz.core.ws.channel.bean.CollectionItem:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.core.ws.channel.bean.CollectionItem) : (r4v0 com.okinc.business.defi.biz.core.ws.channel.bean.CollectionItem))
 A[MD:(com.okinc.business.defi.biz.core.ws.channel.bean.NFTItem, int, com.okinc.business.defi.biz.core.ws.channel.bean.CollectionItem):void (m)] (LINE:8) call: com.okinc.business.defi.biz.core.ws.channel.bean.NftReceived.<init>(com.okinc.business.defi.biz.core.ws.channel.bean.NFTItem, int, com.okinc.business.defi.biz.core.ws.channel.bean.CollectionItem):void type: THIS */
    public /* synthetic */ NftReceived(NFTItem nFTItem, int i, CollectionItem collectionItem, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : nFTItem, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : collectionItem);
    }
}
