package com.okinc.business.defi.biz.core.ws.channel;

import com.okinc.business.defi.biz.core.ws.channel.WalletDefiAssetSubManager;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.Portfolio;
import com.okinc.business.defi.biz.net.bean.TokenAsset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C10407bnq;
import o.C10527bqD;
import o.C10854bwM;
import o.C10948byA;
import o.C10954byG;
import o.C11205cFp;
import o.C12827cuN;
import o.C14085dem;
import o.C56390yDp;
import o.C56403yEb;
import o.C58266yxz;
import o.C9678baC;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC58261yxu;
import o.cQM;
import o.xZF;
import o.yBP;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletDefiAssetSubManager extends xZF<SubResponse> {
    public WalletDefiAssetSubManager() {
        super("invest-DeFi", true, false, 0L, SubResponse.Companion.serializer(), C11205cFp.EZpvd.QOLQEE());
    }

    @Override // o.xZF
    public boolean OLrzqt(@NotNull final List<SubResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtKWHzl = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl(false).KWHzl(yBP.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.cGm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletDefiAssetSubManager.AEQbTJ(list, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.cGn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletDefiAssetSubManager.valueOf(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cGo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletDefiAssetSubManager.copydefault((kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.cGp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletDefiAssetSubManager.EZpvd(function12, obj);
            }
        }).OLrzqt(C58266yxz.OLrzqt());
        final Function1 function13 = new Function1() { // from class: o.cGl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletDefiAssetSubManager.AEQbTJ(this.KWHzl, list, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cGr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                WalletDefiAssetSubManager.AhwBna(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.cGu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletDefiAssetSubManager.KWHzl(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cGt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                WalletDefiAssetSubManager.AYXKKw(function14, obj);
            }
        });
        return true;
    }

    public static final Pair valueOf(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Pair) function1.invoke(obj);
    }

    public static final Pair AEQbTJ(List list, AbstractC12782ctV abstractC12782ctV) {
        VersionInfo versionInfo;
        String minVersion;
        String maxVersion;
        Object next;
        Object next2;
        String balance;
        List<LPTokenInfo> lpTokenAddressList;
        List<VersionInfo> versionList;
        Object next3;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        ArrayList<ChainAddress> arrayListIsConnected = abstractC12782ctV.isConnected();
        List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) abstractC12782ctV.RdAHlO());
        C9678baC.Activity activity = C9678baC.Companion;
        String str = activity.AEQbTJ().getPackageManager().getPackageInfo(activity.AEQbTJ().getPackageName(), 0).versionName;
        if (str == null) {
            str = "";
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SubResponse subResponse = (SubResponse) it.next();
            SubResponseData data = subResponse.getData();
            if (data == null || (versionList = data.getVersionList()) == null) {
                versionInfo = null;
            } else {
                Iterator<T> it2 = versionList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it2.next();
                    Integer clientTypeCode = ((VersionInfo) next3).getClientTypeCode();
                    if (clientTypeCode != null && clientTypeCode.intValue() == 3) {
                        break;
                    }
                }
                versionInfo = (VersionInfo) next3;
            }
            C14085dem c14085dem = C14085dem.copydefault;
            if (versionInfo == null || (minVersion = versionInfo.getMinVersion()) == null) {
                minVersion = "";
            }
            int iKWHzl = c14085dem.KWHzl(str, minVersion);
            if (versionInfo == null || (maxVersion = versionInfo.getMaxVersion()) == null) {
                maxVersion = "";
            }
            int iKWHzl2 = c14085dem.KWHzl(str, maxVersion);
            if (versionInfo == null || ((iKWHzl != 1 && iKWHzl != 0) || (iKWHzl2 != -1 && iKWHzl2 != 0))) {
                Iterator<T> it3 = arrayListIsConnected.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    if (Intrinsics.EZpvd((Object) ((ChainAddress) next).getAddress(), (Object) subResponse.getMAddress())) {
                        break;
                    }
                }
                if (next != null) {
                    SubResponseData data2 = subResponse.getData();
                    if (data2 != null && (lpTokenAddressList = data2.getLpTokenAddressList()) != null) {
                        for (LPTokenInfo lPTokenInfo : lpTokenAddressList) {
                            C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
                            String tokenAddress = lPTokenInfo.getTokenAddress();
                            if (tokenAddress == null) {
                                tokenAddress = "";
                            }
                            Long chainId = lPTokenInfo.getChainId();
                            C10854bwM c10854bwMEZpvd = c10948byAValueOf.EZpvd(tokenAddress, chainId != null ? chainId.longValue() : 0L);
                            if (c10854bwMEZpvd != null) {
                                long jAhwBna = c10854bwMEZpvd.AhwBna();
                                List<TokenAsset> listOLrzqt = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).copydefault().OLrzqt(abstractC12782ctV.DbNXlk(), jAhwBna);
                                if (listOLrzqt != null) {
                                    Iterator<T> it4 = listOLrzqt.iterator();
                                    while (it4.hasNext()) {
                                        ((TokenAsset) it4.next()).setVoucherToken(true);
                                    }
                                }
                                C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).AEQbTJ(jAhwBna);
                            }
                        }
                    }
                    Iterator it5 = listFJNWhG.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it5.next();
                        C10527bqD c10527bqD = (C10527bqD) next2;
                        if (Intrinsics.EZpvd((Object) (c10527bqD.gEmmrt() + ":" + c10527bqD.valueOf()), (Object) subResponse.getMUniqueId())) {
                            break;
                        }
                    }
                    C10527bqD c10527bqD2 = (C10527bqD) next2;
                    Integer type = subResponse.getType();
                    if (type != null && type.intValue() == 0) {
                        if (c10527bqD2 != null) {
                            listFJNWhG.remove(c10527bqD2);
                        }
                    } else if (c10527bqD2 == null) {
                        SubResponseData data3 = subResponse.getData();
                        String platform = data3 != null ? data3.getPlatform() : null;
                        SubResponseData data4 = subResponse.getData();
                        String analysisPlatformId = data4 != null ? data4.getAnalysisPlatformId() : null;
                        SubResponseData data5 = subResponse.getData();
                        Long chainId2 = data5 != null ? data5.getChainId() : null;
                        SubResponseData data6 = subResponse.getData();
                        String chainName = data6 != null ? data6.getChainName() : null;
                        SubResponseData data7 = subResponse.getData();
                        String network = data7 != null ? data7.getNetwork() : null;
                        SubResponseData data8 = subResponse.getData();
                        String logo = data8 != null ? data8.getLogo() : null;
                        SubResponseData data9 = subResponse.getData();
                        listFJNWhG.add(new C10527bqD(new Portfolio(platform, analysisPlatformId, chainId2, chainName, network, logo, data9 != null ? data9.getBalance() : null), abstractC12782ctV));
                    } else {
                        SubResponseData data10 = subResponse.getData();
                        if (data10 == null || (balance = data10.getBalance()) == null) {
                            balance = "";
                        }
                        c10527bqD2.EZpvd(balance);
                    }
                }
            }
        }
        return C56390yDp.OLrzqt(abstractC12782ctV, listFJNWhG);
    }

    public static final InterfaceC58261yxu EZpvd(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        cQM cqmAhwBna = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AhwBna();
        String strDbNXlk = ((AbstractC12782ctV) pair.getFirst()).DbNXlk();
        Iterable iterable = (Iterable) pair.getSecond();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C10527bqD) it.next()).EZpvd());
        }
        return cqmAhwBna.OLrzqt(strDbNXlk, arrayList);
    }

    public static final void AhwBna(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(WalletDefiAssetSubManager walletDefiAssetSubManager, List list, List list2) {
        xZF.notifySubListener$default(walletDefiAssetSubManager, list, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(WalletDefiAssetSubManager walletDefiAssetSubManager, Throwable th) {
        xZF.notifySubListener$default(walletDefiAssetSubManager, yDY.AhwBna(), null, 2, null);
        return Unit.INSTANCE;
    }

    @Serializable
    public static final class SubResponse extends xZF.ActionBar {
        private final SubResponseData data;
        private final Integer type;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SubResponse() {
            this((Integer) null, (SubResponseData) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SubResponse copy$default(SubResponse subResponse, Integer num, SubResponseData subResponseData, int i, Object obj) {
            if ((i & 1) != 0) {
                num = subResponse.type;
            }
            if ((i & 2) != 0) {
                subResponseData = subResponse.data;
            }
            return subResponse.copy(num, subResponseData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component1() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubResponseData component2() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubResponse copy(Integer num, SubResponseData subResponseData) {
            return new SubResponse(num, subResponseData);
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
            return Intrinsics.EZpvd(this.type, subResponse.type) && Intrinsics.EZpvd(this.data, subResponse.data);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubResponseData getData() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Integer num = this.type;
            int iHashCode = num == null ? 0 : num.hashCode();
            SubResponseData subResponseData = this.data;
            return (iHashCode * 31) + (subResponseData != null ? subResponseData.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubResponse(type=" + this.type + ", data=" + this.data + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.WalletDefiAssetSubManager.SubResponse.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SubResponse> serializer() {
                return WalletDefiAssetSubManager$SubResponse$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SubResponse(int i, Integer num, SubResponseData subResponseData, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.type = null;
            } else {
                this.type = num;
            }
            if ((i & 2) == 0) {
                this.data = null;
            } else {
                this.data = subResponseData;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SubResponse subResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subResponse.type != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, subResponse.type);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && subResponse.data == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, WalletDefiAssetSubManager$SubResponseData$$serializer.INSTANCE, subResponse.data);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:com.okinc.business.defi.biz.core.ws.channel.WalletDefiAssetSubManager$SubResponseData:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.core.ws.channel.WalletDefiAssetSubManager$SubResponseData) : (r3v0 com.okinc.business.defi.biz.core.ws.channel.WalletDefiAssetSubManager$SubResponseData))
 A[MD:(java.lang.Integer, com.okinc.business.defi.biz.core.ws.channel.WalletDefiAssetSubManager$SubResponseData):void (m)] (LINE:123) call: com.okinc.business.defi.biz.core.ws.channel.WalletDefiAssetSubManager.SubResponse.<init>(java.lang.Integer, com.okinc.business.defi.biz.core.ws.channel.WalletDefiAssetSubManager$SubResponseData):void type: THIS */
        public /* synthetic */ SubResponse(Integer num, SubResponseData subResponseData, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : subResponseData);
        }

        public SubResponse(Integer num, SubResponseData subResponseData) {
            this.type = num;
            this.data = subResponseData;
        }

        @Override // o.xZF.ActionBar
        public String getMAddress() {
            SubResponseData subResponseData = this.data;
            if (subResponseData != null) {
                return subResponseData.getAddress();
            }
            return null;
        }

        @Override // o.xZF.ActionBar
        public String getMUniqueId() {
            SubResponseData subResponseData = this.data;
            Long chainId = subResponseData != null ? subResponseData.getChainId() : null;
            SubResponseData subResponseData2 = this.data;
            return chainId + ":" + (subResponseData2 != null ? subResponseData2.getAnalysisPlatformId() : null);
        }
    }

    @Serializable
    public static final class SubResponseData {
        private final String address;
        private final String analysisPlatformId;
        private final String balance;
        private final Long chainId;
        private final String chainName;
        private final String logo;
        private final List<LPTokenInfo> lpTokenAddressList;
        private final String network;
        private final String platform;
        private final List<VersionInfo> versionList;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(WalletDefiAssetSubManager$LPTokenInfo$$serializer.INSTANCE), new ArrayListSerializer(WalletDefiAssetSubManager$VersionInfo$$serializer.INSTANCE)};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SubResponseData() {
            this((String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (List) null, (List) null, 1023, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<VersionInfo> component10() {
            return this.versionList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.analysisPlatformId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.platform;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.logo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component5() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.chainName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.balance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.network;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<LPTokenInfo> component9() {
            return this.lpTokenAddressList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubResponseData copy(String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, List<LPTokenInfo> list, List<VersionInfo> list2) {
            return new SubResponseData(str, str2, str3, str4, l, str5, str6, str7, list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubResponseData)) {
                return false;
            }
            SubResponseData subResponseData = (SubResponseData) obj;
            return Intrinsics.EZpvd((Object) this.address, (Object) subResponseData.address) && Intrinsics.EZpvd((Object) this.analysisPlatformId, (Object) subResponseData.analysisPlatformId) && Intrinsics.EZpvd((Object) this.platform, (Object) subResponseData.platform) && Intrinsics.EZpvd((Object) this.logo, (Object) subResponseData.logo) && Intrinsics.EZpvd(this.chainId, subResponseData.chainId) && Intrinsics.EZpvd((Object) this.chainName, (Object) subResponseData.chainName) && Intrinsics.EZpvd((Object) this.balance, (Object) subResponseData.balance) && Intrinsics.EZpvd((Object) this.network, (Object) subResponseData.network) && Intrinsics.EZpvd(this.lpTokenAddressList, subResponseData.lpTokenAddressList) && Intrinsics.EZpvd(this.versionList, subResponseData.versionList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAnalysisPlatformId() {
            return this.analysisPlatformId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBalance() {
            return this.balance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainName() {
            return this.chainName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLogo() {
            return this.logo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<LPTokenInfo> getLpTokenAddressList() {
            return this.lpTokenAddressList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNetwork() {
            return this.network;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPlatform() {
            return this.platform;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<VersionInfo> getVersionList() {
            return this.versionList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.address;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.analysisPlatformId;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.platform;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.logo;
            int iHashCode4 = str4 == null ? 0 : str4.hashCode();
            Long l = this.chainId;
            int iHashCode5 = l == null ? 0 : l.hashCode();
            String str5 = this.chainName;
            int iHashCode6 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.balance;
            int iHashCode7 = str6 == null ? 0 : str6.hashCode();
            String str7 = this.network;
            int iHashCode8 = str7 == null ? 0 : str7.hashCode();
            List<LPTokenInfo> list = this.lpTokenAddressList;
            int iHashCode9 = list == null ? 0 : list.hashCode();
            List<VersionInfo> list2 = this.versionList;
            return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (list2 != null ? list2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubResponseData(address=" + this.address + ", analysisPlatformId=" + this.analysisPlatformId + ", platform=" + this.platform + ", logo=" + this.logo + ", chainId=" + this.chainId + ", chainName=" + this.chainName + ", balance=" + this.balance + ", network=" + this.network + ", lpTokenAddressList=" + this.lpTokenAddressList + ", versionList=" + this.versionList + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.WalletDefiAssetSubManager.SubResponseData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SubResponseData> serializer() {
                return WalletDefiAssetSubManager$SubResponseData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SubResponseData(int i, String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.address = null;
            } else {
                this.address = str;
            }
            if ((i & 2) == 0) {
                this.analysisPlatformId = null;
            } else {
                this.analysisPlatformId = str2;
            }
            if ((i & 4) == 0) {
                this.platform = null;
            } else {
                this.platform = str3;
            }
            if ((i & 8) == 0) {
                this.logo = null;
            } else {
                this.logo = str4;
            }
            if ((i & 16) == 0) {
                this.chainId = null;
            } else {
                this.chainId = l;
            }
            if ((i & 32) == 0) {
                this.chainName = null;
            } else {
                this.chainName = str5;
            }
            if ((i & 64) == 0) {
                this.balance = null;
            } else {
                this.balance = str6;
            }
            if ((i & 128) == 0) {
                this.network = null;
            } else {
                this.network = str7;
            }
            if ((i & 256) == 0) {
                this.lpTokenAddressList = null;
            } else {
                this.lpTokenAddressList = list;
            }
            if ((i & 512) == 0) {
                this.versionList = null;
            } else {
                this.versionList = list2;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SubResponseData subResponseData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subResponseData.address != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, subResponseData.address);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || subResponseData.analysisPlatformId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, subResponseData.analysisPlatformId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || subResponseData.platform != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, subResponseData.platform);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || subResponseData.logo != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, subResponseData.logo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || subResponseData.chainId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, subResponseData.chainId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || subResponseData.chainName != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, subResponseData.chainName);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || subResponseData.balance != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, subResponseData.balance);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || subResponseData.network != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, subResponseData.network);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || subResponseData.lpTokenAddressList != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], subResponseData.lpTokenAddressList);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && subResponseData.versionList == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], subResponseData.versionList);
        }

        public SubResponseData(String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, List<LPTokenInfo> list, List<VersionInfo> list2) {
            this.address = str;
            this.analysisPlatformId = str2;
            this.platform = str3;
            this.logo = str4;
            this.chainId = l;
            this.chainName = str5;
            this.balance = str6;
            this.network = str7;
            this.lpTokenAddressList = list;
            this.versionList = list2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r16v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r20v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.util.List) : (null java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.defi.biz.core.ws.channel.WalletDefiAssetSubManager$LPTokenInfo>, java.util.List<com.okinc.business.defi.biz.core.ws.channel.WalletDefiAssetSubManager$VersionInfo>):void (m)] (LINE:136) call: com.okinc.business.defi.biz.core.ws.channel.WalletDefiAssetSubManager.SubResponseData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List):void type: THIS */
        public /* synthetic */ SubResponseData(String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : list, (i & 512) == 0 ? list2 : null);
        }
    }

    @Serializable
    public static final class LPTokenInfo {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final Long chainId;
        private final String tokenAddress;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LPTokenInfo() {
            this((Long) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LPTokenInfo copy$default(LPTokenInfo lPTokenInfo, Long l, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                l = lPTokenInfo.chainId;
            }
            if ((i & 2) != 0) {
                str = lPTokenInfo.tokenAddress;
            }
            return lPTokenInfo.copy(l, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component1() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LPTokenInfo copy(Long l, String str) {
            return new LPTokenInfo(l, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LPTokenInfo)) {
                return false;
            }
            LPTokenInfo lPTokenInfo = (LPTokenInfo) obj;
            return Intrinsics.EZpvd(this.chainId, lPTokenInfo.chainId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) lPTokenInfo.tokenAddress);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenAddress() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Long l = this.chainId;
            int iHashCode = l == null ? 0 : l.hashCode();
            String str = this.tokenAddress;
            return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "LPTokenInfo(chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.WalletDefiAssetSubManager.LPTokenInfo.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<LPTokenInfo> serializer() {
                return WalletDefiAssetSubManager$LPTokenInfo$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ LPTokenInfo(int i, Long l, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.chainId = null;
            } else {
                this.chainId = l;
            }
            if ((i & 2) == 0) {
                this.tokenAddress = null;
            } else {
                this.tokenAddress = str;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(LPTokenInfo lPTokenInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || lPTokenInfo.chainId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, lPTokenInfo.chainId);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && lPTokenInfo.tokenAddress == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, lPTokenInfo.tokenAddress);
        }

        public LPTokenInfo(Long l, String str) {
            this.chainId = l;
            this.tokenAddress = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String):void (m)] (LINE:151) call: com.okinc.business.defi.biz.core.ws.channel.WalletDefiAssetSubManager.LPTokenInfo.<init>(java.lang.Long, java.lang.String):void type: THIS */
        public /* synthetic */ LPTokenInfo(Long l, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str);
        }
    }

    @Serializable
    public static final class VersionInfo {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final Integer clientTypeCode;
        private final String maxVersion;
        private final String minVersion;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VersionInfo() {
            this((Integer) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ VersionInfo copy$default(VersionInfo versionInfo, Integer num, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                num = versionInfo.clientTypeCode;
            }
            if ((i & 2) != 0) {
                str = versionInfo.minVersion;
            }
            if ((i & 4) != 0) {
                str2 = versionInfo.maxVersion;
            }
            return versionInfo.copy(num, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component1() {
            return this.clientTypeCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.minVersion;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.maxVersion;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VersionInfo copy(Integer num, String str, String str2) {
            return new VersionInfo(num, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VersionInfo)) {
                return false;
            }
            VersionInfo versionInfo = (VersionInfo) obj;
            return Intrinsics.EZpvd(this.clientTypeCode, versionInfo.clientTypeCode) && Intrinsics.EZpvd((Object) this.minVersion, (Object) versionInfo.minVersion) && Intrinsics.EZpvd((Object) this.maxVersion, (Object) versionInfo.maxVersion);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getClientTypeCode() {
            return this.clientTypeCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMaxVersion() {
            return this.maxVersion;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMinVersion() {
            return this.minVersion;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Integer num = this.clientTypeCode;
            int iHashCode = num == null ? 0 : num.hashCode();
            String str = this.minVersion;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.maxVersion;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "VersionInfo(clientTypeCode=" + this.clientTypeCode + ", minVersion=" + this.minVersion + ", maxVersion=" + this.maxVersion + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.WalletDefiAssetSubManager.VersionInfo.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<VersionInfo> serializer() {
                return WalletDefiAssetSubManager$VersionInfo$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ VersionInfo(int i, Integer num, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.clientTypeCode = null;
            } else {
                this.clientTypeCode = num;
            }
            if ((i & 2) == 0) {
                this.minVersion = null;
            } else {
                this.minVersion = str;
            }
            if ((i & 4) == 0) {
                this.maxVersion = null;
            } else {
                this.maxVersion = str2;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(VersionInfo versionInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || versionInfo.clientTypeCode != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, versionInfo.clientTypeCode);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || versionInfo.minVersion != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, versionInfo.minVersion);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && versionInfo.maxVersion == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, versionInfo.maxVersion);
        }

        public VersionInfo(Integer num, String str, String str2) {
            this.clientTypeCode = num;
            this.minVersion = str;
            this.maxVersion = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String):void (m)] (LINE:158) call: com.okinc.business.defi.biz.core.ws.channel.WalletDefiAssetSubManager.VersionInfo.<init>(java.lang.Integer, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ VersionInfo(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }
    }
}
