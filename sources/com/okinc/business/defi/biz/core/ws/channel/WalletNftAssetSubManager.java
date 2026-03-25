package com.okinc.business.defi.biz.core.ws.channel;

import com.okinc.business.defi.api.bean.NftPrice;
import com.okinc.business.defi.biz.core.ws.channel.WalletNftAssetSubManager;
import com.okinc.business.defi.biz.core.ws.channel.bean.CollectionItem;
import com.okinc.business.defi.biz.core.ws.channel.bean.NftReceived;
import com.okinc.business.defi.biz.core.ws.channel.bean.NftReceived$$serializer;
import com.okinc.business.defi.biz.core.ws.channel.bean.NftReduce;
import com.okinc.business.defi.biz.core.ws.channel.bean.NftReduce$$serializer;
import com.okinc.business.defi.biz.core.ws.channel.bean.PriceDetail;
import com.okinc.business.defi.biz.net.bean.NftBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C10528bqE;
import o.C11205cFp;
import o.C11607cUn;
import o.C12827cuN;
import o.C33129mqd;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC58261yxu;
import o.xZF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletNftAssetSubManager extends xZF<SubResponse> {
    public WalletNftAssetSubManager() {
        super("wallet-nft", true, false, 0L, SubResponse.Companion.serializer(), C11205cFp.EZpvd.QOLQEE());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC58261yxu copydefault(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    @Override // o.xZF
    public boolean OLrzqt(@NotNull final List<SubResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.cGA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletNftAssetSubManager.KWHzl(list, this, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.cGE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletNftAssetSubManager.copydefault(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cGC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletNftAssetSubManager.EZpvd(this.OLrzqt, list, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cGB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                WalletNftAssetSubManager.EZpvd(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.cGJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletNftAssetSubManager.AEQbTJ(this.AEQbTJ, list, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cGH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                WalletNftAssetSubManager.AYXKKw(function13, obj);
            }
        });
        return true;
    }

    public static final InterfaceC58261yxu KWHzl(List list, final WalletNftAssetSubManager walletNftAssetSubManager, final AbstractC12782ctV abstractC12782ctV) {
        PriceDetail floorSalePrice;
        PriceDetail floorSalePrice2;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        List<C10528bqE> listFARcdN = abstractC12782ctV.fARcdN();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SubResponse subResponse = (SubResponse) it.next();
            String address = subResponse.getAddress();
            if (address == null) {
                address = "";
            }
            if (abstractC12782ctV.DbNXlk(address)) {
                if (subResponse.getReceive() != null) {
                    NftReceived receive = subResponse.getReceive();
                    Intrinsics.copydefault(receive);
                    CollectionItem collectionItem = receive.getCollectionItem();
                    if (collectionItem != null) {
                        String strAYXKKw = C33129mqd.AYXKKw(Integer.valueOf(collectionItem.getProject()));
                        NftReceived receive2 = subResponse.getReceive();
                        Intrinsics.copydefault(receive2);
                        map.put(strAYXKKw, receive2);
                    }
                }
                if (subResponse.getReduce() != null) {
                    NftReduce reduce = subResponse.getReduce();
                    Intrinsics.copydefault(reduce);
                    CollectionItem collectionItem2 = reduce.getCollectionItem();
                    if (collectionItem2 != null) {
                        String strAYXKKw2 = C33129mqd.AYXKKw(Integer.valueOf(collectionItem2.getProject()));
                        NftReduce reduce2 = subResponse.getReduce();
                        Intrinsics.copydefault(reduce2);
                        map2.put(strAYXKKw2, reduce2);
                    }
                }
            }
        }
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C10528bqE c10528bqE : listFARcdN) {
            String usdPrice = null;
            if (map.containsKey(c10528bqE.fetchVPNInfo())) {
                Object objRemove = map.remove(c10528bqE.fetchVPNInfo());
                Intrinsics.copydefault(objRemove);
                NftReceived nftReceived = (NftReceived) objRemove;
                c10528bqE.AEQbTJ(c10528bqE.AkhnZx() + nftReceived.getCount());
                c10528bqE.valueOf().setTotal(Integer.valueOf(c10528bqE.AkhnZx()));
                NftPrice nftPriceAYXKKw = c10528bqE.AYXKKw();
                if (nftPriceAYXKKw != null) {
                    CollectionItem collectionItem3 = nftReceived.getCollectionItem();
                    if (collectionItem3 != null && (floorSalePrice = collectionItem3.getFloorSalePrice()) != null) {
                        usdPrice = floorSalePrice.getUsdPrice();
                    }
                    nftPriceAYXKKw.setUsdPrice(usdPrice);
                }
                arrayList.add(c10528bqE);
            } else if (map2.containsKey(c10528bqE.fetchVPNInfo())) {
                Object objRemove2 = map2.remove(c10528bqE.fetchVPNInfo());
                Intrinsics.copydefault(objRemove2);
                NftReduce nftReduce = (NftReduce) objRemove2;
                c10528bqE.AEQbTJ(c10528bqE.AkhnZx() - nftReduce.getCount());
                c10528bqE.valueOf().setTotal(Integer.valueOf(c10528bqE.AkhnZx()));
                NftPrice nftPriceAYXKKw2 = c10528bqE.AYXKKw();
                if (nftPriceAYXKKw2 != null) {
                    CollectionItem collectionItem4 = nftReduce.getCollectionItem();
                    if (collectionItem4 != null && (floorSalePrice2 = collectionItem4.getFloorSalePrice()) != null) {
                        usdPrice = floorSalePrice2.getUsdPrice();
                    }
                    nftPriceAYXKKw2.setUsdPrice(usdPrice);
                }
                if (c10528bqE.AkhnZx() > 0) {
                    arrayList.add(c10528bqE);
                } else {
                    arrayList2.add(c10528bqE);
                }
            }
        }
        final Function2 function2 = new Function2() { // from class: o.cGy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return WalletNftAssetSubManager.AEQbTJ(this.AEQbTJ, abstractC12782ctV, arrayList, (java.lang.String) obj, (NftReceived) obj2);
            }
        };
        map.forEach(new BiConsumer() { // from class: o.cGD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                WalletNftAssetSubManager.EZpvd(function2, obj, obj2);
            }
        });
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(abstractC12782ctV.KWHzl(((C10528bqE) it2.next()).EZpvd()));
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(abstractC12782ctV.AYXKKw(((C10528bqE) it3.next()).djBIcL()));
        }
        return C11607cUn.KWHzl(arrayList3);
    }

    public static final void EZpvd(Function2 function2, Object obj, Object obj2) {
        function2.invoke(obj, obj2);
    }

    public static final Unit AEQbTJ(WalletNftAssetSubManager walletNftAssetSubManager, AbstractC12782ctV abstractC12782ctV, ArrayList arrayList, String str, NftReceived nftReceived) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(nftReceived, "");
        CollectionItem collectionItem = nftReceived.getCollectionItem();
        if (collectionItem != null) {
            NftBean nftBeanOLrzqt = walletNftAssetSubManager.OLrzqt(collectionItem, nftReceived.getCount(), false);
            Intrinsics.copydefault(abstractC12782ctV);
            arrayList.add(new C10528bqE(nftBeanOLrzqt, abstractC12782ctV));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(WalletNftAssetSubManager walletNftAssetSubManager, List list, List list2) {
        xZF.notifySubListener$default(walletNftAssetSubManager, list, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AYXKKw(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(WalletNftAssetSubManager walletNftAssetSubManager, List list, Throwable th) {
        xZF.notifySubListener$default(walletNftAssetSubManager, list, null, 2, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ NftBean convertCollectionItem2NftBean$default(WalletNftAssetSubManager walletNftAssetSubManager, CollectionItem collectionItem, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return walletNftAssetSubManager.OLrzqt(collectionItem, i, z);
    }

    public final NftBean OLrzqt(CollectionItem collectionItem, int i, boolean z) {
        String name;
        String str = (collectionItem == null || (name = collectionItem.getName()) == null) ? "" : name;
        long chainId = collectionItem.getChainId();
        String network = collectionItem.getNetwork();
        String str2 = network == null ? "" : network;
        String logo = collectionItem.getLogo();
        String str3 = logo == null ? "" : logo;
        PriceDetail floorSalePrice = collectionItem.getFloorSalePrice();
        return new NftBean(Integer.valueOf(collectionItem.getProject()), str, str2, str3, chainId, new NftPrice(floorSalePrice != null ? floorSalePrice.getUsdPrice() : null), Integer.valueOf(i), Integer.valueOf(i), (Boolean) null, 256, (DefaultConstructorMarker) null);
    }

    @Serializable
    public static final class SubResponse extends xZF.ActionBar {
        private final String address;
        private NftReceived receive;
        private NftReduce reduce;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SubResponse() {
            this((String) null, (NftReceived) null, (NftReduce) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SubResponse copy$default(SubResponse subResponse, String str, NftReceived nftReceived, NftReduce nftReduce, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subResponse.address;
            }
            if ((i & 2) != 0) {
                nftReceived = subResponse.receive;
            }
            if ((i & 4) != 0) {
                nftReduce = subResponse.reduce;
            }
            return subResponse.copy(str, nftReceived, nftReduce);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NftReceived component2() {
            return this.receive;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NftReduce component3() {
            return this.reduce;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubResponse copy(String str, NftReceived nftReceived, NftReduce nftReduce) {
            return new SubResponse(str, nftReceived, nftReduce);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubResponse)) {
                return false;
            }
            SubResponse subResponse = (SubResponse) obj;
            return Intrinsics.EZpvd((Object) this.address, (Object) subResponse.address) && Intrinsics.EZpvd(this.receive, subResponse.receive) && Intrinsics.EZpvd(this.reduce, subResponse.reduce);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.xZF.ActionBar
        public String getMAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NftReceived getReceive() {
            return this.receive;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NftReduce getReduce() {
            return this.reduce;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.address;
            int iHashCode = str == null ? 0 : str.hashCode();
            NftReceived nftReceived = this.receive;
            int iHashCode2 = nftReceived == null ? 0 : nftReceived.hashCode();
            NftReduce nftReduce = this.reduce;
            return (((iHashCode * 31) + iHashCode2) * 31) + (nftReduce != null ? nftReduce.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setReceive(NftReceived nftReceived) {
            this.receive = nftReceived;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setReduce(NftReduce nftReduce) {
            this.reduce = nftReduce;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubResponse(address=" + this.address + ", receive=" + this.receive + ", reduce=" + this.reduce + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.WalletNftAssetSubManager.SubResponse.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SubResponse> serializer() {
                return WalletNftAssetSubManager$SubResponse$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SubResponse(int i, String str, NftReceived nftReceived, NftReduce nftReduce, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.address = null;
            } else {
                this.address = str;
            }
            if ((i & 2) == 0) {
                this.receive = null;
            } else {
                this.receive = nftReceived;
            }
            if ((i & 4) == 0) {
                this.reduce = null;
            } else {
                this.reduce = nftReduce;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SubResponse subResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subResponse.address != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, subResponse.address);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || subResponse.receive != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, NftReceived$$serializer.INSTANCE, subResponse.receive);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && subResponse.reduce == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, NftReduce$$serializer.INSTANCE, subResponse.reduce);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:com.okinc.business.defi.biz.core.ws.channel.bean.NftReceived:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.core.ws.channel.bean.NftReceived) : (r3v0 com.okinc.business.defi.biz.core.ws.channel.bean.NftReceived))
  (wrap:com.okinc.business.defi.biz.core.ws.channel.bean.NftReduce:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.core.ws.channel.bean.NftReduce) : (r4v0 com.okinc.business.defi.biz.core.ws.channel.bean.NftReduce))
 A[MD:(java.lang.String, com.okinc.business.defi.biz.core.ws.channel.bean.NftReceived, com.okinc.business.defi.biz.core.ws.channel.bean.NftReduce):void (m)] (LINE:180) call: com.okinc.business.defi.biz.core.ws.channel.WalletNftAssetSubManager.SubResponse.<init>(java.lang.String, com.okinc.business.defi.biz.core.ws.channel.bean.NftReceived, com.okinc.business.defi.biz.core.ws.channel.bean.NftReduce):void type: THIS */
        public /* synthetic */ SubResponse(String str, NftReceived nftReceived, NftReduce nftReduce, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : nftReceived, (i & 4) != 0 ? null : nftReduce);
        }

        public SubResponse(String str, NftReceived nftReceived, NftReduce nftReduce) {
            this.address = str;
            this.receive = nftReceived;
            this.reduce = nftReduce;
        }

        @Override // o.xZF.ActionBar
        public String getMUniqueId() {
            return toString();
        }
    }
}
