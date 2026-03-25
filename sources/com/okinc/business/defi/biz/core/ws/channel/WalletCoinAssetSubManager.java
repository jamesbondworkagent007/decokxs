package com.okinc.business.defi.biz.core.ws.channel;

import com.okinc.business.defi.biz.core.ws.channel.WalletCoinAssetSubManager;
import com.okinc.business.defi.biz.core.ws.channel.WalletPnlSubManager;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.TokenAsset;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.api.bean.AddressType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C10407bnq;
import o.C10525bqB;
import o.C10541bqR;
import o.C10856bwO;
import o.C10954byG;
import o.C11205cFp;
import o.C11607cUn;
import o.C12827cuN;
import o.C33129mqd;
import o.C54862xYb;
import o.C56390yDp;
import o.C56402yEa;
import o.C56403yEb;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC58261yxu;
import o.InterfaceC9738bbJ;
import o.xXI;
import o.xZA;
import o.xZF;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletCoinAssetSubManager extends xZF<SubResponse> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final HashMap EZpvd(HashMap map, Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return map;
    }

    public WalletCoinAssetSubManager() {
        super("wallet-asset-v2", true, false, 0L, SubResponse.Companion.serializer(), C11205cFp.EZpvd.QOLQEE());
    }

    public static final InterfaceC58261yxu AuCTel(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    @Override // o.xZF
    public boolean OLrzqt(@NotNull List<SubResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<Activity> abstractC58260yxtKWHzl = KWHzl(list);
        final Function1 function1 = new Function1() { // from class: o.cFV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletCoinAssetSubManager.copydefault(this.copydefault, (WalletCoinAssetSubManager.Activity) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.cFU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletCoinAssetSubManager.AuCTel(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cFG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletCoinAssetSubManager.OLrzqt(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cFF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                WalletCoinAssetSubManager.fARcdN(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.cFK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletCoinAssetSubManager.KWHzl((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cFJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                WalletCoinAssetSubManager.ejfBZ(function13, obj);
            }
        });
        return true;
    }

    public static final InterfaceC58261yxu copydefault(WalletCoinAssetSubManager walletCoinAssetSubManager, final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if ((!activity.EZpvd().isEmpty()) || (!activity.AEQbTJ().isEmpty())) {
            AbstractC58260yxt<List<SubResponse>> abstractC58260yxtCopydefault = walletCoinAssetSubManager.copydefault(activity.EZpvd(), activity.AEQbTJ());
            final Function1 function1 = new Function1() { // from class: o.cFR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return WalletCoinAssetSubManager.AEQbTJ(activity, (java.util.List) obj);
                }
            };
            return abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.cFS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return WalletCoinAssetSubManager.fetchVPNInfo(function1, obj);
                }
            });
        }
        return AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(yDY.AhwBna(), activity.KWHzl()));
    }

    public static final Pair fetchVPNInfo(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Pair) function1.invoke(obj);
    }

    public static final Pair AEQbTJ(Activity activity, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C56390yDp.OLrzqt(list, activity.KWHzl());
    }

    public static final void fARcdN(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(WalletCoinAssetSubManager walletCoinAssetSubManager, Pair pair) {
        Object first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "");
        walletCoinAssetSubManager.EZpvd((List<SubResponse>) first);
        walletCoinAssetSubManager.AEQbTJ((List<SubResponse>) pair.getSecond());
        return Unit.INSTANCE;
    }

    public static final void ejfBZ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Throwable th) {
        return Unit.INSTANCE;
    }

    public final void EZpvd(List<SubResponse> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList<xZF.TaskDescription<SubResponse>> arrayListAEQbTJ = AEQbTJ();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListAEQbTJ) {
            xZF.TaskDescription taskDescription = (xZF.TaskDescription) obj;
            if ((taskDescription instanceof TaskDescription) && !((TaskDescription) taskDescription).AEQbTJ()) {
                arrayList.add(obj);
            }
        }
        djBIcL(list, arrayList);
        RxBus.AEQbTJ(new xXI());
    }

    public final void AEQbTJ(List<SubResponse> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList<xZF.TaskDescription<SubResponse>> arrayListAEQbTJ = AEQbTJ();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListAEQbTJ) {
            xZF.TaskDescription taskDescription = (xZF.TaskDescription) obj;
            if ((taskDescription instanceof TaskDescription) && ((TaskDescription) taskDescription).AEQbTJ()) {
                arrayList.add(obj);
            }
        }
        djBIcL(list, arrayList);
    }

    public final AbstractC58260yxt<Activity> KWHzl(final List<SubResponse> list) {
        AbstractC58260yxt abstractC58260yxtCopydefault;
        if (C11205cFp.EZpvd.QUSxYX()) {
            abstractC58260yxtCopydefault = C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null);
        } else {
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault2 = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
            final Function1 function1 = new Function1() { // from class: o.cFC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return WalletCoinAssetSubManager.AEQbTJ((AbstractC12782ctV) obj);
                }
            };
            abstractC58260yxtCopydefault = abstractC58260yxtCopydefault2.copydefault(new InterfaceC58229yxO() { // from class: o.cFE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return WalletCoinAssetSubManager.values(function1, obj);
                }
            });
        }
        final Function1 function12 = new Function1() { // from class: o.cFM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletCoinAssetSubManager.EZpvd(list, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<Activity> abstractC58260yxtCopydefault3 = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.cFO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletCoinAssetSubManager.AkhnZx(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault3, "");
        return abstractC58260yxtCopydefault3;
    }

    public static final List values(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static final List AEQbTJ(AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return C56402yEa.EZpvd(abstractC12782ctV);
    }

    public static final Activity AkhnZx(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Activity) function1.invoke(obj);
    }

    public static final Activity EZpvd(List list, List list2) {
        Object next;
        String str;
        String address;
        String str2 = "";
        Intrinsics.checkNotNullParameter(list2, "");
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) it.next();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList<ChainAddress> arrayListIsConnected = abstractC12782ctV.isConnected();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                SubResponse subResponse = (SubResponse) it2.next();
                Iterator<T> it3 = arrayListIsConnected.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    if (Intrinsics.EZpvd((Object) ((ChainAddress) next).getAddress(), (Object) subResponse.getAddress())) {
                        break;
                    }
                }
                if (next != null) {
                    Long chainId = subResponse.getChainId();
                    str = str2;
                    ChainAddress chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV, chainId != null ? chainId.longValue() : -1L, null, 2, null);
                    if (chainAddress == null || (address = chainAddress.getAddress()) == null) {
                        address = str;
                    }
                    subResponse.setWalletDefaultAddress(address);
                    arrayList2.add(subResponse);
                    if (C10954byG.EZpvd.valueOf().KWHzl(subResponse.getCoinId()) == null) {
                        Long coinId = subResponse.getCoinId();
                        arrayList3.add(Long.valueOf(coinId != null ? coinId.longValue() : 0L));
                    }
                } else {
                    str = str2;
                }
                str2 = str;
            }
            String str3 = str2;
            if (!arrayList2.isEmpty()) {
                map.put(abstractC12782ctV, arrayList2);
                try {
                    arrayList.removeAll(arrayList2);
                } catch (Exception e) {
                    C10856bwO.copydefault("WalletCoinAssetSubManager", -1, "not int current wallet error: " + e);
                }
            }
            if (!arrayList3.isEmpty()) {
                map2.put(abstractC12782ctV.DbNXlk(), arrayList3);
            }
            str2 = str3;
        }
        return new Activity(map2, map, arrayList);
    }

    public final AbstractC58260yxt<List<SubResponse>> copydefault(HashMap<String, ArrayList<Long>> map, final HashMap<AbstractC12782ctV, ArrayList<SubResponse>> map2) {
        AbstractC58260yxt abstractC58260yxtCopydefault;
        if (!map.isEmpty()) {
            AbstractC58260yxt<Boolean> abstractC58260yxtGEmmrt = C10954byG.EZpvd.AYXKKw().OLrzqt(false, (Map<String, ? extends List<Long>>) map).gEmmrt();
            final Function1 function1 = new Function1() { // from class: o.cFI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return WalletCoinAssetSubManager.EZpvd(map2, (java.lang.Boolean) obj);
                }
            };
            abstractC58260yxtCopydefault = abstractC58260yxtGEmmrt.copydefault(new InterfaceC58229yxO() { // from class: o.cFH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return WalletCoinAssetSubManager.djBIcL(function1, obj);
                }
            });
        } else {
            abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(map2);
        }
        final Function1 function12 = new Function1() { // from class: o.cFL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletCoinAssetSubManager.EZpvd((java.util.HashMap) obj);
            }
        };
        AbstractC58260yxt<List<SubResponse>> abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.cFQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletCoinAssetSubManager.DbNXlk(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final HashMap djBIcL(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (HashMap) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu DbNXlk(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(HashMap map) {
        Intrinsics.checkNotNullParameter(map, "");
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        final HashSet hashSet = new HashSet();
        for (Map.Entry entry : map.entrySet()) {
            hashSet.addAll((Collection) entry.getValue());
            C10407bnq instance$default = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null);
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((SubResponse) it.next()).convertToTokenAsset((AbstractC12782ctV) entry.getKey()));
            }
            listSynchronizedList.add(instance$default.KWHzl(abstractC12782ctV, (List<TokenAsset>) arrayList, false, false, true));
        }
        Intrinsics.copydefault(listSynchronizedList);
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(listSynchronizedList);
        final Function1 function1 = new Function1() { // from class: o.cFN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletCoinAssetSubManager.OLrzqt(hashSet, (java.util.List) obj);
            }
        };
        return abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.cFP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletCoinAssetSubManager.isConnected(function1, obj);
            }
        });
    }

    public static final List isConnected(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static final List OLrzqt(HashSet hashSet, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(hashSet);
    }

    @Override // o.xZF
    public void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        super.OLrzqt(str);
    }

    @Override // o.xZF
    public void AEQbTJ(@NotNull xZF.TaskDescription<SubResponse> taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        super.AEQbTJ(taskDescription);
    }

    @Serializable
    public static final class SubResponse extends xZF.ActionBar {
        private final String address;
        private final String availableBalance;
        private final Long chainId;
        private final String coinAmount;
        private final String coinAmountDec;
        private final String coinAmountOriginalDec;
        private final Long coinId;
        private String currencyAmountNew;
        private final Boolean isAptosMainCoinAssetChanged;
        private final Boolean isBaseCoin;
        private final String tokenAddress;
        private final String transferableBalance;
        private final Boolean voucherToken;
        private String walletDefaultAddress;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SubResponse() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }

        @SerialName("addr")
        public static /* synthetic */ void getAddress$annotations() {
        }

        @SerialName("ab")
        public static /* synthetic */ void getAvailableBalance$annotations() {
        }

        @SerialName("chId")
        public static /* synthetic */ void getChainId$annotations() {
        }

        @SerialName("amt")
        public static /* synthetic */ void getCoinAmount$annotations() {
        }

        @SerialName("amtD")
        public static /* synthetic */ void getCoinAmountDec$annotations() {
        }

        @SerialName("amtO")
        public static /* synthetic */ void getCoinAmountOriginalDec$annotations() {
        }

        @SerialName("cId")
        public static /* synthetic */ void getCoinId$annotations() {
        }

        @SerialName("cAmtN")
        public static /* synthetic */ void getCurrencyAmountNew$annotations() {
        }

        @SerialName("tAd")
        public static /* synthetic */ void getTokenAddress$annotations() {
        }

        @SerialName("tab")
        public static /* synthetic */ void getTransferableBalance$annotations() {
        }

        @SerialName("vtk")
        public static /* synthetic */ void getVoucherToken$annotations() {
        }

        @SerialName("aptMCAC")
        public static /* synthetic */ void isAptosMainCoinAssetChanged$annotations() {
        }

        @SerialName("bc")
        public static /* synthetic */ void isBaseCoin$annotations() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component10() {
            return this.voucherToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component11() {
            return this.transferableBalance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component12() {
            return this.availableBalance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component13() {
            return this.isAptosMainCoinAssetChanged;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component3() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component4() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.coinAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.coinAmountDec;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.coinAmountOriginalDec;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.currencyAmountNew;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component9() {
            return this.isBaseCoin;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubResponse copy(String str, String str2, Long l, Long l2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, Boolean bool3) {
            return new SubResponse(str, str2, l, l2, str3, str4, str5, str6, bool, bool2, str7, str8, bool3);
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
            return Intrinsics.EZpvd((Object) this.address, (Object) subResponse.address) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) subResponse.tokenAddress) && Intrinsics.EZpvd(this.coinId, subResponse.coinId) && Intrinsics.EZpvd(this.chainId, subResponse.chainId) && Intrinsics.EZpvd((Object) this.coinAmount, (Object) subResponse.coinAmount) && Intrinsics.EZpvd((Object) this.coinAmountDec, (Object) subResponse.coinAmountDec) && Intrinsics.EZpvd((Object) this.coinAmountOriginalDec, (Object) subResponse.coinAmountOriginalDec) && Intrinsics.EZpvd((Object) this.currencyAmountNew, (Object) subResponse.currencyAmountNew) && Intrinsics.EZpvd(this.isBaseCoin, subResponse.isBaseCoin) && Intrinsics.EZpvd(this.voucherToken, subResponse.voucherToken) && Intrinsics.EZpvd((Object) this.transferableBalance, (Object) subResponse.transferableBalance) && Intrinsics.EZpvd((Object) this.availableBalance, (Object) subResponse.availableBalance) && Intrinsics.EZpvd(this.isAptosMainCoinAssetChanged, subResponse.isAptosMainCoinAssetChanged);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAvailableBalance() {
            return this.availableBalance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCoinAmount() {
            return this.coinAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCoinAmountDec() {
            return this.coinAmountDec;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCoinAmountOriginalDec() {
            return this.coinAmountOriginalDec;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getCoinId() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCurrencyAmountNew() {
            return this.currencyAmountNew;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.xZF.ActionBar
        public String getMAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenAddress() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTransferableBalance() {
            return this.transferableBalance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getVoucherToken() {
            return this.voucherToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getWalletDefaultAddress() {
            return this.walletDefaultAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.address;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.tokenAddress;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            Long l = this.coinId;
            int iHashCode3 = l == null ? 0 : l.hashCode();
            Long l2 = this.chainId;
            int iHashCode4 = l2 == null ? 0 : l2.hashCode();
            String str3 = this.coinAmount;
            int iHashCode5 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.coinAmountDec;
            int iHashCode6 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.coinAmountOriginalDec;
            int iHashCode7 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.currencyAmountNew;
            int iHashCode8 = str6 == null ? 0 : str6.hashCode();
            Boolean bool = this.isBaseCoin;
            int iHashCode9 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.voucherToken;
            int iHashCode10 = bool2 == null ? 0 : bool2.hashCode();
            String str7 = this.transferableBalance;
            int iHashCode11 = str7 == null ? 0 : str7.hashCode();
            String str8 = this.availableBalance;
            int iHashCode12 = str8 == null ? 0 : str8.hashCode();
            Boolean bool3 = this.isAptosMainCoinAssetChanged;
            return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (bool3 != null ? bool3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean isAptosMainCoinAssetChanged() {
            return this.isAptosMainCoinAssetChanged;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean isBaseCoin() {
            return this.isBaseCoin;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCurrencyAmountNew(String str) {
            this.currencyAmountNew = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setWalletDefaultAddress(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.walletDefaultAddress = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubResponse(address=" + this.address + ", tokenAddress=" + this.tokenAddress + ", coinId=" + this.coinId + ", chainId=" + this.chainId + ", coinAmount=" + this.coinAmount + ", coinAmountDec=" + this.coinAmountDec + ", coinAmountOriginalDec=" + this.coinAmountOriginalDec + ", currencyAmountNew=" + this.currencyAmountNew + ", isBaseCoin=" + this.isBaseCoin + ", voucherToken=" + this.voucherToken + ", transferableBalance=" + this.transferableBalance + ", availableBalance=" + this.availableBalance + ", isAptosMainCoinAssetChanged=" + this.isAptosMainCoinAssetChanged + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.WalletCoinAssetSubManager.SubResponse.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SubResponse> serializer() {
                return WalletCoinAssetSubManager$SubResponse$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SubResponse(int i, String str, String str2, Long l, Long l2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, Boolean bool3, String str9, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.address = null;
            } else {
                this.address = str;
            }
            if ((i & 2) == 0) {
                this.tokenAddress = null;
            } else {
                this.tokenAddress = str2;
            }
            if ((i & 4) == 0) {
                this.coinId = null;
            } else {
                this.coinId = l;
            }
            if ((i & 8) == 0) {
                this.chainId = null;
            } else {
                this.chainId = l2;
            }
            if ((i & 16) == 0) {
                this.coinAmount = null;
            } else {
                this.coinAmount = str3;
            }
            if ((i & 32) == 0) {
                this.coinAmountDec = null;
            } else {
                this.coinAmountDec = str4;
            }
            if ((i & 64) == 0) {
                this.coinAmountOriginalDec = null;
            } else {
                this.coinAmountOriginalDec = str5;
            }
            if ((i & 128) == 0) {
                this.currencyAmountNew = null;
            } else {
                this.currencyAmountNew = str6;
            }
            if ((i & 256) == 0) {
                this.isBaseCoin = null;
            } else {
                this.isBaseCoin = bool;
            }
            if ((i & 512) == 0) {
                this.voucherToken = null;
            } else {
                this.voucherToken = bool2;
            }
            if ((i & 1024) == 0) {
                this.transferableBalance = null;
            } else {
                this.transferableBalance = str7;
            }
            if ((i & 2048) == 0) {
                this.availableBalance = null;
            } else {
                this.availableBalance = str8;
            }
            if ((i & 4096) == 0) {
                this.isAptosMainCoinAssetChanged = null;
            } else {
                this.isAptosMainCoinAssetChanged = bool3;
            }
            this.walletDefaultAddress = (i & 8192) == 0 ? "" : str9;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SubResponse subResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subResponse.address != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, subResponse.address);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || subResponse.tokenAddress != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, subResponse.tokenAddress);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || subResponse.coinId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, subResponse.coinId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || subResponse.chainId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, subResponse.chainId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || subResponse.coinAmount != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, subResponse.coinAmount);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || subResponse.coinAmountDec != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, subResponse.coinAmountDec);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || subResponse.coinAmountOriginalDec != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, subResponse.coinAmountOriginalDec);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || subResponse.currencyAmountNew != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, subResponse.currencyAmountNew);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || subResponse.isBaseCoin != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, subResponse.isBaseCoin);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || subResponse.voucherToken != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, subResponse.voucherToken);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || subResponse.transferableBalance != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, subResponse.transferableBalance);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || subResponse.availableBalance != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, subResponse.availableBalance);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || subResponse.isAptosMainCoinAssetChanged != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, subResponse.isAptosMainCoinAssetChanged);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd((Object) subResponse.walletDefaultAddress, (Object) "")) {
                return;
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 13, subResponse.walletDefaultAddress);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0084: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0012: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r17v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x001a: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r18v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0042: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004a: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0062: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.Boolean) : (null java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:210) call: com.okinc.business.defi.biz.core.ws.channel.WalletCoinAssetSubManager.SubResponse.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
        public /* synthetic */ SubResponse(String str, String str2, Long l, Long l2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) == 0 ? bool3 : null);
        }

        public SubResponse(String str, String str2, Long l, Long l2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, Boolean bool3) {
            this.address = str;
            this.tokenAddress = str2;
            this.coinId = l;
            this.chainId = l2;
            this.coinAmount = str3;
            this.coinAmountDec = str4;
            this.coinAmountOriginalDec = str5;
            this.currencyAmountNew = str6;
            this.isBaseCoin = bool;
            this.voucherToken = bool2;
            this.transferableBalance = str7;
            this.availableBalance = str8;
            this.isAptosMainCoinAssetChanged = bool3;
            this.walletDefaultAddress = "";
        }

        @Override // o.xZF.ActionBar
        public String getMUniqueId() {
            Object obj = this.coinId;
            if (obj == null) {
                obj = "";
            }
            return String.valueOf(obj);
        }

        public final boolean isDefaultAddress() {
            return Intrinsics.EZpvd((Object) this.walletDefaultAddress, (Object) this.address);
        }

        public final TokenAsset convertToTokenAsset(@NotNull AbstractC12782ctV abstractC12782ctV) {
            String holdAvgPrice;
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            Long l = this.coinId;
            long jLongValue = l != null ? l.longValue() : 0L;
            String str = this.address;
            String str2 = str == null ? "" : str;
            if (str == null) {
                str = "";
            }
            ChainAddress chainAddressAddressFromAddress$default = AbstractC12782ctV.addressFromAddress$default(abstractC12782ctV, str, null, 2, null);
            int addressType = chainAddressAddressFromAddress$default != null ? chainAddressAddressFromAddress$default.getAddressType() : AddressType.Legacy.getValue();
            String str3 = this.coinAmount;
            String str4 = str3 == null ? "" : str3;
            String str5 = this.coinAmountDec;
            String str6 = str5 == null ? "" : str5;
            String str7 = this.currencyAmountNew;
            String str8 = str7 == null ? "" : str7;
            Boolean bool = this.voucherToken;
            TokenAsset tokenAsset = new TokenAsset(jLongValue, str2, addressType, str4, str6, str8, bool != null ? bool.booleanValue() : false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8064, (DefaultConstructorMarker) null);
            C10525bqB c10525bqBEZpvd = abstractC12782ctV.EZpvd(tokenAsset.getCoinId(), tokenAsset.getAddress());
            if (c10525bqBEZpvd != null) {
                WalletPnlSubManager.SubResponse.PnlPushData pnlPushDataKWHzl = C11205cFp.EZpvd.sSMYrx().KWHzl(tokenAsset.getAddress(), c10525bqBEZpvd.gEmmrt(), this.tokenAddress);
                String spotBalance = pnlPushDataKWHzl != null ? pnlPushDataKWHzl.getSpotBalance() : null;
                if (spotBalance != null && spotBalance.length() != 0 && (holdAvgPrice = pnlPushDataKWHzl.getHoldAvgPrice()) != null && holdAvgPrice.length() != 0) {
                    BigDecimal bigDecimalDivB$default = C54862xYb.divB$default(this.currencyAmountNew, this.coinAmountDec, 0, null, 6, null);
                    if (C33129mqd.AEQbTJ(bigDecimalDivB$default, "0")) {
                        Pair<String, String> pairCopydefault = C10541bqR.OLrzqt.copydefault("subAsset", tokenAsset.getCoinAmountDec(), pnlPushDataKWHzl.getSpotBalance(), C54862xYb.convertToString$default(bigDecimalDivB$default, false, null, null, 7, null), pnlPushDataKWHzl.getHoldAvgPrice());
                        tokenAsset.setUnPnl(pairCopydefault.getFirst());
                        tokenAsset.setUnPnlYield(pairCopydefault.getSecond());
                        tokenAsset.setSpotBalance(pnlPushDataKWHzl.getSpotBalance());
                        tokenAsset.setHoldAvgPrice(pnlPushDataKWHzl.getHoldAvgPrice());
                    } else {
                        tokenAsset.setUnPnl(c10525bqBEZpvd.sSMYrx());
                        tokenAsset.setUnPnlYield(c10525bqBEZpvd.gHZMYf());
                        tokenAsset.setSpotBalance(c10525bqBEZpvd.zsXlph());
                        tokenAsset.setHoldAvgPrice(c10525bqBEZpvd.zLjUOn());
                    }
                } else {
                    tokenAsset.setUnPnl(c10525bqBEZpvd.sSMYrx());
                    tokenAsset.setUnPnlYield(c10525bqBEZpvd.gHZMYf());
                    tokenAsset.setSpotBalance(c10525bqBEZpvd.zsXlph());
                    tokenAsset.setHoldAvgPrice(c10525bqBEZpvd.zLjUOn());
                }
            }
            return tokenAsset;
        }
    }

    public static abstract class TaskDescription extends xZF.TaskDescription<SubResponse> {
        public xZA AhwBna;
        public final List<Long> KWHzl;
        public final boolean djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:o.xZA:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.xZA) : (r3v0 o.xZA))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(java.lang.String, o.xZA, java.util.List<java.lang.Long>, boolean):void (m)] (LINE:290) call: com.okinc.business.defi.biz.core.ws.channel.WalletCoinAssetSubManager.TaskDescription.<init>(java.lang.String, o.xZA, java.util.List, boolean):void type: THIS */
        public /* synthetic */ TaskDescription(String str, xZA xza, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : xza, (i & 4) != 0 ? null : list, (i & 8) != 0 ? false : z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull String str, xZA xza, List<Long> list, boolean z) {
            super(str, xza);
            Intrinsics.checkNotNullParameter(str, "");
            this.AhwBna = xza;
            this.KWHzl = list;
            this.djBIcL = z;
        }

        @Override // o.xZF.TaskDescription
        public void copydefault(@NotNull List<SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            List<Long> list2 = this.KWHzl;
            if (list2 == null || list2.isEmpty()) {
                super.copydefault(list);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends Long>) ((Iterable<? extends Object>) this.KWHzl), ((SubResponse) obj).getCoinId())) {
                    arrayList.add(obj);
                }
            }
            super.copydefault(arrayList);
        }
    }

    public static final class Activity {
        public final HashMap<AbstractC12782ctV, ArrayList<SubResponse>> AEQbTJ;
        public final ArrayList<SubResponse> KWHzl;
        public final HashMap<String, ArrayList<Long>> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.core.ws.channel.WalletCoinAssetSubManager$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, HashMap map, HashMap map2, ArrayList arrayList, int i, Object obj) {
            if ((i & 1) != 0) {
                map = activity.copydefault;
            }
            if ((i & 2) != 0) {
                map2 = activity.AEQbTJ;
            }
            if ((i & 4) != 0) {
                arrayList = activity.KWHzl;
            }
            return activity.EZpvd(map, map2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HashMap<AbstractC12782ctV, ArrayList<SubResponse>> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull HashMap<String, ArrayList<Long>> map, @NotNull HashMap<AbstractC12782ctV, ArrayList<SubResponse>> map2, @NotNull ArrayList<SubResponse> arrayList) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            return new Activity(map, map2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HashMap<String, ArrayList<Long>> EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ArrayList<SubResponse> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.copydefault, activity.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ResponseData(walletIdAndCoinIds=" + this.copydefault + ", walletAndResponses=" + this.AEQbTJ + ", notIntCurrentWalletsResponseList=" + this.KWHzl + ")";
        }

        public Activity(@NotNull HashMap<String, ArrayList<Long>> map, @NotNull HashMap<AbstractC12782ctV, ArrayList<SubResponse>> map2, @NotNull ArrayList<SubResponse> arrayList) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.copydefault = map;
            this.AEQbTJ = map2;
            this.KWHzl = arrayList;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.HashMap:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:311) call: java.util.HashMap.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.HashMap))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0009: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.HashMap:0x000f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:312) call: java.util.HashMap.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.HashMap))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0012: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0018: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:313) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r3v0 java.util.ArrayList))
 A[MD:(java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.Long>>, java.util.HashMap<o.ctV, java.util.ArrayList<com.okinc.business.defi.biz.core.ws.channel.WalletCoinAssetSubManager$SubResponse>>, java.util.ArrayList<com.okinc.business.defi.biz.core.ws.channel.WalletCoinAssetSubManager$SubResponse>):void (m)] (LINE:310) call: com.okinc.business.defi.biz.core.ws.channel.WalletCoinAssetSubManager.Activity.<init>(java.util.HashMap, java.util.HashMap, java.util.ArrayList):void type: THIS */
        public /* synthetic */ Activity(HashMap map, HashMap map2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new HashMap() : map, (i & 2) != 0 ? new HashMap() : map2, (i & 4) != 0 ? new ArrayList() : arrayList);
        }
    }
}
