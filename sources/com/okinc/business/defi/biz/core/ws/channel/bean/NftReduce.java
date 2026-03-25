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
public final class NftReduce {
    private CollectionItem collectionItem;
    private int count;
    private NFTItem nftItem;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NftReduce() {
        this((CollectionItem) null, (NFTItem) null, 0, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NftReduce copy$default(NftReduce nftReduce, CollectionItem collectionItem, NFTItem nFTItem, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            collectionItem = nftReduce.collectionItem;
        }
        if ((i2 & 2) != 0) {
            nFTItem = nftReduce.nftItem;
        }
        if ((i2 & 4) != 0) {
            i = nftReduce.count;
        }
        return nftReduce.copy(collectionItem, nFTItem, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CollectionItem component1() {
        return this.collectionItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NFTItem component2() {
        return this.nftItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NftReduce copy(CollectionItem collectionItem, NFTItem nFTItem, int i) {
        return new NftReduce(collectionItem, nFTItem, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NftReduce)) {
            return false;
        }
        NftReduce nftReduce = (NftReduce) obj;
        return Intrinsics.EZpvd(this.collectionItem, nftReduce.collectionItem) && Intrinsics.EZpvd(this.nftItem, nftReduce.nftItem) && this.count == nftReduce.count;
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
        CollectionItem collectionItem = this.collectionItem;
        int iHashCode = collectionItem == null ? 0 : collectionItem.hashCode();
        NFTItem nFTItem = this.nftItem;
        return (((iHashCode * 31) + (nFTItem != null ? nFTItem.hashCode() : 0)) * 31) + Integer.hashCode(this.count);
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
        return "NftReduce(collectionItem=" + this.collectionItem + ", nftItem=" + this.nftItem + ", count=" + this.count + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.bean.NftReduce.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NftReduce> serializer() {
            return NftReduce$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NftReduce(int i, CollectionItem collectionItem, NFTItem nFTItem, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.collectionItem = null;
        } else {
            this.collectionItem = collectionItem;
        }
        if ((i & 2) == 0) {
            this.nftItem = null;
        } else {
            this.nftItem = nFTItem;
        }
        if ((i & 4) == 0) {
            this.count = 0;
        } else {
            this.count = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(NftReduce nftReduce, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || nftReduce.collectionItem != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, CollectionItem$$serializer.INSTANCE, nftReduce.collectionItem);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || nftReduce.nftItem != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, NFTItem$$serializer.INSTANCE, nftReduce.nftItem);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && nftReduce.count == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, nftReduce.count);
    }

    public NftReduce(CollectionItem collectionItem, NFTItem nFTItem, int i) {
        this.collectionItem = collectionItem;
        this.nftItem = nFTItem;
        this.count = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.biz.core.ws.channel.bean.CollectionItem:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.core.ws.channel.bean.CollectionItem) : (r2v0 com.okinc.business.defi.biz.core.ws.channel.bean.CollectionItem))
  (wrap:com.okinc.business.defi.biz.core.ws.channel.bean.NFTItem:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.core.ws.channel.bean.NFTItem) : (r3v0 com.okinc.business.defi.biz.core.ws.channel.bean.NFTItem))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(com.okinc.business.defi.biz.core.ws.channel.bean.CollectionItem, com.okinc.business.defi.biz.core.ws.channel.bean.NFTItem, int):void (m)] (LINE:64) call: com.okinc.business.defi.biz.core.ws.channel.bean.NftReduce.<init>(com.okinc.business.defi.biz.core.ws.channel.bean.CollectionItem, com.okinc.business.defi.biz.core.ws.channel.bean.NFTItem, int):void type: THIS */
    public /* synthetic */ NftReduce(CollectionItem collectionItem, NFTItem nFTItem, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : collectionItem, (i2 & 2) != 0 ? null : nFTItem, (i2 & 4) != 0 ? 0 : i);
    }
}
