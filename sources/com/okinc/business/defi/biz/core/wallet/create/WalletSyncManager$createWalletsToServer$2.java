package com.okinc.business.defi.biz.core.wallet.create;

import android.graphics.drawable.Drawable;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.business.defi.biz.constant.WalletSyncStatus;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$createWalletsToServer$2;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressSegWitEntity;
import com.okinc.business.defi.biz.database.wallet.entity.MPCWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.CreateWalletReqNew;
import com.okinc.business.defi.biz.net.bean.CreateWalletReqs;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC43419rot;
import o.C10545bqV;
import o.C10604brb;
import o.C11291cIu;
import o.C11600cUg;
import o.C13058cyg;
import o.C13062cyk;
import o.C13934dbu;
import o.C33129mqd;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.cSX;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletSyncManager$createWalletsToServer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C13062cyk.StateListAnimator<List<? extends WalletEntity>>>, Object> {
    final /* synthetic */ String $from;
    final /* synthetic */ boolean $isDelay;
    final /* synthetic */ C13062cyk.LoaderManager $waitType;
    final /* synthetic */ List<WalletEntity> $wallets;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ C13062cyk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSyncManager$createWalletsToServer$2(C13062cyk c13062cyk, List<WalletEntity> list, boolean z, C13062cyk.LoaderManager loaderManager, String str, Continuation<? super WalletSyncManager$createWalletsToServer$2> continuation) {
        super(2, continuation);
        this.this$0 = c13062cyk;
        this.$wallets = list;
        this.$isDelay = z;
        this.$waitType = loaderManager;
        this.$from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletSyncManager$createWalletsToServer$2 walletSyncManager$createWalletsToServer$2 = new WalletSyncManager$createWalletsToServer$2(this.this$0, this.$wallets, this.$isDelay, this.$waitType, this.$from, continuation);
        walletSyncManager$createWalletsToServer$2.L$0 = obj;
        return walletSyncManager$createWalletsToServer$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super C13062cyk.StateListAnimator<List<? extends WalletEntity>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super C13062cyk.StateListAnimator<List<WalletEntity>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super C13062cyk.StateListAnimator<List<WalletEntity>>> continuation) {
        return ((WalletSyncManager$createWalletsToServer$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1618=7] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0301 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0324 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0348 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x037c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Object objOLrzqt;
        List listFJNWhG;
        Deferred deferred;
        Object objAwait;
        List list;
        List<WalletEntity> list2;
        List list3;
        Deferred deferred2;
        String str;
        Deferred deferred3;
        Deferred deferred4;
        Object next;
        Object objAwait2;
        Deferred deferred5;
        Map map;
        Deferred deferred6;
        Object objAwait3;
        String str2;
        Map map2;
        Deferred deferred7;
        Deferred deferred8;
        Object objAwait4;
        Map map3;
        Map map4;
        Map map5;
        Deferred deferred9;
        String str3;
        Map map6;
        Object objAwait5;
        HashMap map7;
        String str4;
        String str5;
        Iterator it;
        List list4;
        Object objAEQbTJ;
        Object obj2;
        List<WalletEntity> list5;
        Object next2;
        MPCWalletEntity mPCWalletEntity;
        String mpcId;
        List list6;
        C13062cyk c13062cyk;
        Map map8;
        Iterator it2;
        Map map9;
        Object next3;
        AbstractC43419rot abstractC43419rot;
        int i;
        Object obj3;
        Object objDjBIcL;
        List list7;
        List list8;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                C13058cyg c13058cyg = this.this$0.AkhnZx;
                List<WalletEntity> list9 = this.$wallets;
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list9, 10));
                Iterator<T> it3 = list9.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((WalletEntity) it3.next()).getId());
                }
                this.L$0 = coroutineScope;
                this.label = 1;
                objOLrzqt = c13058cyg.OLrzqt(arrayList, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                List list10 = (List) objOLrzqt;
                List<WalletEntity> list11 = this.$wallets;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list11) {
                    WalletEntity walletEntity = (WalletEntity) obj4;
                    Iterator it4 = list10.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (Intrinsics.EZpvd((Object) ((C11291cIu) next).AEQbTJ(), (Object) walletEntity.getId())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    C11291cIu c11291cIu = (C11291cIu) next;
                    boolean zKWHzl = C33129mqd.KWHzl((Collection) (c11291cIu != null ? c11291cIu.copydefault() : null));
                    if (walletEntity.getSyncStatus() < WalletSyncStatus.HasCreate.getValue() && zKWHzl) {
                        arrayList2.add(obj4);
                    }
                }
                listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList2);
                if (!listFJNWhG.isEmpty()) {
                    return new C13062cyk.StateListAnimator(this.$wallets, 0, null, 6, null);
                }
                List listGEmmrt = CollectionsKt___CollectionsKt.gEmmrt((Iterable) this.$wallets, (Iterable) CollectionsKt___CollectionsKt.OqFWZa(listFJNWhG));
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : listFJNWhG) {
                    if (((WalletEntity) obj5).getType() == WalletType.MPCWallet.ordinal()) {
                        arrayList3.add(obj5);
                    }
                }
                ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(listFJNWhG, 10));
                Iterator it5 = listFJNWhG.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(((WalletEntity) it5.next()).getId());
                }
                ArrayList arrayList5 = new ArrayList();
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new WalletSyncManager$createWalletsToServer$2$mpcDef$1(arrayList3, this.this$0, null), 3, null);
                arrayList5.add(deferredAsync$default);
                Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new WalletSyncManager$createWalletsToServer$2$rootWalletDef$1(this.this$0, listFJNWhG, null), 3, null);
                arrayList5.add(deferredAsync$default2);
                Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new WalletSyncManager$createWalletsToServer$2$chainAddressDef$1(this.this$0, arrayList4, null), 3, null);
                arrayList5.add(deferredAsync$default3);
                CoroutineScope coroutineScope2 = coroutineScope;
                Deferred deferredAsync$default4 = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new WalletSyncManager$createWalletsToServer$2$chainIdAllAddressDef$1(this.this$0, arrayList4, null), 3, null);
                arrayList5.add(deferredAsync$default4);
                Deferred deferredAsync$default5 = BuildersKt__Builders_commonKt.async$default(coroutineScope2, Dispatchers.getIO(), null, new WalletSyncManager$createWalletsToServer$2$channelDef$1(null), 2, null);
                arrayList5.add(deferredAsync$default5);
                String strAhwBna = WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).AhwBna();
                this.L$0 = list10;
                this.L$1 = listFJNWhG;
                this.L$2 = listGEmmrt;
                this.L$3 = deferredAsync$default2;
                deferred = deferredAsync$default3;
                this.L$4 = deferred;
                this.L$5 = deferredAsync$default4;
                this.L$6 = deferredAsync$default5;
                this.L$7 = strAhwBna;
                this.label = 2;
                objAwait = deferredAsync$default.await(this);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                list = list10;
                list2 = listFJNWhG;
                list3 = listGEmmrt;
                deferred2 = deferredAsync$default5;
                str = strAhwBna;
                deferred3 = deferredAsync$default4;
                deferred4 = deferredAsync$default2;
                Map map10 = (Map) objAwait;
                this.L$0 = list;
                this.L$1 = list2;
                this.L$2 = list3;
                this.L$3 = deferred;
                this.L$4 = deferred3;
                this.L$5 = deferred2;
                this.L$6 = str;
                this.L$7 = map10;
                this.label = 3;
                objAwait2 = deferred4.await(this);
                if (objAwait2 != objCopydefault) {
                    return objCopydefault;
                }
                Deferred deferred10 = deferred3;
                deferred5 = deferred2;
                map = map10;
                deferred6 = deferred10;
                Map map11 = (Map) objAwait2;
                this.L$0 = list;
                this.L$1 = list2;
                this.L$2 = list3;
                this.L$3 = deferred6;
                this.L$4 = deferred5;
                this.L$5 = str;
                this.L$6 = map;
                this.L$7 = map11;
                this.label = 4;
                objAwait3 = deferred.await(this);
                if (objAwait3 != objCopydefault) {
                    return objCopydefault;
                }
                Deferred deferred11 = deferred5;
                str2 = str;
                map2 = map11;
                deferred7 = deferred6;
                deferred8 = deferred11;
                Map map12 = (Map) objAwait3;
                this.L$0 = list;
                this.L$1 = list2;
                this.L$2 = list3;
                this.L$3 = deferred8;
                this.L$4 = str2;
                this.L$5 = map;
                this.L$6 = map2;
                this.L$7 = map12;
                this.label = 5;
                objAwait4 = deferred7.await(this);
                if (objAwait4 != objCopydefault) {
                    return objCopydefault;
                }
                map3 = map;
                map4 = map12;
                String str6 = str2;
                map5 = map2;
                deferred9 = deferred8;
                str3 = str6;
                map6 = (Map) objAwait4;
                this.L$0 = list;
                this.L$1 = list2;
                this.L$2 = list3;
                this.L$3 = str3;
                this.L$4 = map3;
                this.L$5 = map5;
                this.L$6 = map4;
                this.L$7 = map6;
                this.label = 6;
                objAwait5 = deferred9.await(this);
                if (objAwait5 == objCopydefault) {
                    return objCopydefault;
                }
                map7 = (HashMap) ((ResponseData) objAwait5).getData();
                if (map7 == null || (str4 = (String) map7.get(RemoteMessageConst.Notification.CHANNEL_ID)) == null) {
                    str4 = "";
                }
                ArrayList arrayList6 = new ArrayList();
                C13062cyk c13062cyk2 = this.this$0;
                str5 = "";
                ArrayList arrayList7 = new ArrayList(C56403yEb.AYXKKw(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    WalletEntity walletEntity2 = (WalletEntity) it.next();
                    Iterator it6 = it;
                    ArrayList arrayList8 = new ArrayList();
                    Object obj6 = objCopydefault;
                    List list12 = (List) map4.get(walletEntity2.getId());
                    Map map13 = map4;
                    if (list12 != null) {
                        ArrayList<ChainAddressEntity> arrayList9 = new ArrayList();
                        for (Object obj7 : list12) {
                            List list13 = list3;
                            ChainAddressEntity chainAddressEntity = (ChainAddressEntity) obj7;
                            if (c13062cyk2.KWHzl(walletEntity2) || chainAddressEntity.getAddress().length() > 0) {
                                arrayList9.add(obj7);
                            }
                            list3 = list13;
                        }
                        list6 = list3;
                        c13062cyk = c13062cyk2;
                        ArrayList arrayList10 = new ArrayList(C56403yEb.AYXKKw(arrayList9, 10));
                        for (ChainAddressEntity chainAddressEntity2 : arrayList9) {
                            arrayList10.add(new ChainAddress(chainAddressEntity2.getChainId(), chainAddressEntity2.getAddress(), chainAddressEntity2.getAddressType(), chainAddressEntity2.getProxyAddress(), chainAddressEntity2.getEoaAddress(), C11600cUg.KWHzl(walletEntity2.getFromCreate()), chainAddressEntity2.getPublicKey(), ""));
                        }
                        C56443yFo.KWHzl(arrayList8.addAll(arrayList10));
                    } else {
                        list6 = list3;
                        c13062cyk = c13062cyk2;
                    }
                    List list14 = (List) map6.get(walletEntity2.getId());
                    if (list14 != null) {
                        Iterator it7 = list14.iterator();
                        while (it7.hasNext()) {
                            ChainAddressSegWitEntity chainAddressSegWitEntity = (ChainAddressSegWitEntity) it7.next();
                            Iterator it8 = arrayList8.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next3 = it8.next();
                                    ChainAddress chainAddress = (ChainAddress) next3;
                                    it2 = it7;
                                    map9 = map6;
                                    if (!Intrinsics.EZpvd((Object) chainAddress.getAddress(), (Object) chainAddressSegWitEntity.getAddress()) || chainAddress.getCoinId() != chainAddressSegWitEntity.getChainId()) {
                                        it7 = it2;
                                        map6 = map9;
                                    }
                                } else {
                                    it2 = it7;
                                    map9 = map6;
                                    next3 = null;
                                }
                            }
                            if (next3 == null) {
                                arrayList8.add(new ChainAddress(chainAddressSegWitEntity.getChainId(), chainAddressSegWitEntity.getAddress(), chainAddressSegWitEntity.getAddressType(), null, null, false, chainAddressSegWitEntity.getPublicKey(), "", 24, null));
                            }
                            it7 = it2;
                            map6 = map9;
                        }
                        map8 = map6;
                        Unit unit = Unit.INSTANCE;
                    } else {
                        map8 = map6;
                    }
                    arrayList7.add(C56390yDp.OLrzqt(walletEntity2, arrayList8));
                    it = it6;
                    objCopydefault = obj6;
                    map4 = map13;
                    list3 = list6;
                    c13062cyk2 = c13062cyk;
                    map6 = map8;
                }
                Object obj8 = objCopydefault;
                List list15 = list3;
                C13062cyk c13062cyk3 = this.this$0;
                ArrayList<Pair> arrayList11 = new ArrayList();
                for (Object obj9 : arrayList7) {
                    Pair pair = (Pair) obj9;
                    WalletEntity walletEntity3 = (WalletEntity) pair.getFirst();
                    ArrayList arrayList12 = (ArrayList) pair.getSecond();
                    boolean z = false;
                    boolean z2 = walletEntity3.getType() == WalletType.TrackingWallet.ordinal() && c13062cyk3.KWHzl.contains(walletEntity3.getId());
                    if ((!arrayList12.isEmpty()) && !z2) {
                        z = true;
                    }
                    if (!z) {
                        arrayList6.add(walletEntity3);
                    }
                    if (z) {
                        arrayList11.add(obj9);
                    }
                }
                C13062cyk c13062cyk4 = this.this$0;
                ArrayList arrayList13 = new ArrayList(C56403yEb.AYXKKw(arrayList11, 10));
                for (Pair pair2 : arrayList11) {
                    WalletEntity walletEntity4 = (WalletEntity) pair2.getFirst();
                    ArrayList arrayList14 = (ArrayList) pair2.getSecond();
                    String id = walletEntity4.getId();
                    String xpub = walletEntity4.getXpub();
                    String name = walletEntity4.getName();
                    WalletType.Application application = WalletType.Companion;
                    cSX csx = (cSX) map5.get(walletEntity4.getRootWalletId());
                    int iEZpvd = application.EZpvd(walletEntity4, csx != null ? csx.fARcdN() : null);
                    List list16 = (List) map3.get(walletEntity4.getRootWalletId());
                    String str7 = (list16 == null || (mPCWalletEntity = (MPCWalletEntity) CollectionsKt___CollectionsKt.firstOrNull(list16)) == null || (mpcId = mPCWalletEntity.getMpcId()) == null) ? str5 : mpcId;
                    Iterator it9 = list.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next2 = it9.next();
                            if (Intrinsics.EZpvd((Object) ((C11291cIu) next2).AEQbTJ(), (Object) walletEntity4.getId())) {
                            }
                        } else {
                            next2 = null;
                        }
                        break;
                    }
                    arrayList13.add(c13062cyk4.OLrzqt(id, xpub, name, arrayList14, iEZpvd, str7, (C11291cIu) next2, !c13062cyk4.KWHzl(walletEntity4), walletEntity4.getCreateAt()));
                }
                list2.removeAll(arrayList6);
                if (!list2.isEmpty()) {
                    return new C13062cyk.StateListAnimator(this.$wallets, 0, null, 6, null);
                }
                WalletEntity walletEntity5 = (WalletEntity) CollectionsKt___CollectionsKt.AuCTelauCTel(list2);
                HashMap map14 = new HashMap();
                for (WalletEntity walletEntity6 : list2) {
                    map14.put(walletEntity6.getId(), walletEntity6);
                }
                C13934dbu c13934dbu = this.this$0.gEmmrt;
                String xpriv = walletEntity5.getXpriv();
                String id2 = walletEntity5.getId();
                boolean z3 = this.$isDelay;
                ArrayList arrayList15 = new ArrayList();
                for (Object obj10 : arrayList13) {
                    if (!((CreateWalletReqNew) obj10).getAddresses().isEmpty()) {
                        arrayList15.add(obj10);
                    }
                }
                CreateWalletReqs createWalletReqs = new CreateWalletReqs(str3, str4, z3, arrayList15);
                this.L$0 = list2;
                list4 = list15;
                this.L$1 = list4;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.label = 7;
                objAEQbTJ = c13934dbu.AEQbTJ(xpriv, id2, createWalletReqs, this);
                obj2 = obj8;
                if (objAEQbTJ == obj2) {
                    return obj2;
                }
                list5 = list2;
                abstractC43419rot = (AbstractC43419rot) objAEQbTJ;
                if (!abstractC43419rot.EZpvd()) {
                    C13062cyk c13062cyk5 = this.this$0;
                    for (WalletEntity walletEntity7 : list5) {
                        walletEntity7.setSyncStatus(WalletSyncStatus.HasCreate.getValue());
                        c13062cyk5.KWHzl.remove(walletEntity7.getId());
                    }
                    C13062cyk c13062cyk6 = this.this$0;
                    this.L$0 = list5;
                    this.L$1 = list4;
                    this.label = 8;
                    objDjBIcL = c13062cyk6.djBIcL(list5, this);
                    if (objDjBIcL == obj2) {
                        return obj2;
                    }
                    list7 = list5;
                    list8 = list4;
                    if (((Number) objDjBIcL).intValue() > 0) {
                        return new C13062cyk.StateListAnimator(list8, 0, null, 6, null);
                    }
                    List listFJNWhG2 = CollectionsKt___CollectionsKt.fJNWhG((Collection) list7);
                    listFJNWhG2.addAll(list8);
                    Unit unit2 = Unit.INSTANCE;
                    return new C13062cyk.StateListAnimator(listFJNWhG2, 0, null, 6, null);
                }
                final C13062cyk.StateListAnimator stateListAnimatorEZpvd = this.this$0.EZpvd((AbstractC43419rot<?, OKServerException>) abstractC43419rot, list4);
                C13062cyk.LoaderManager loaderManager = this.$waitType;
                List<WalletEntity> list17 = this.$wallets;
                C13062cyk c13062cyk7 = this.this$0;
                String str8 = this.$from;
                if (stateListAnimatorEZpvd.copydefault() != 900003 || !(loaderManager instanceof C13062cyk.LoaderManager.TaskDescription)) {
                    if (stateListAnimatorEZpvd.copydefault() == 10007) {
                        if (c13062cyk7.copydefault(str8)) {
                            c13062cyk7.EZpvd().post(new Runnable() { // from class: o.cys
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    WalletSyncManager$createWalletsToServer$2.invokeSuspend$lambda$27$lambda$25(stateListAnimatorEZpvd);
                                }
                            });
                        }
                        c13062cyk7.AEQbTJ();
                        return stateListAnimatorEZpvd;
                    }
                    if (stateListAnimatorEZpvd.copydefault() != 1 && stateListAnimatorEZpvd.copydefault() != 10001) {
                        return stateListAnimatorEZpvd;
                    }
                    for (WalletEntity walletEntity8 : list5) {
                        if (walletEntity8.getType() == WalletType.TrackingWallet.ordinal()) {
                            c13062cyk7.KWHzl.add(walletEntity8.getId());
                        }
                    }
                    return stateListAnimatorEZpvd;
                }
                Iterator<T> it10 = list17.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        Object next4 = it10.next();
                        i = 1;
                        if (((WalletEntity) next4).getMain() == 1) {
                            obj3 = next4;
                        }
                    } else {
                        i = 1;
                        obj3 = null;
                    }
                }
                WalletEntity walletEntity9 = (WalletEntity) obj3;
                if (walletEntity9 == null || walletEntity9.getSyncStatus() != WalletSyncStatus.NotSync.getValue()) {
                    return stateListAnimatorEZpvd;
                }
                C10545bqV c10545bqVKWHzl = C10604brb.Application.getInstance$default(C10604brb.Companion, null, i, null).KWHzl();
                String strEZpvd = stateListAnimatorEZpvd.EZpvd();
                if (strEZpvd == null) {
                    strEZpvd = str5;
                }
                c10545bqVKWHzl.AEQbTJ(null, strEZpvd);
                return stateListAnimatorEZpvd;
            case 1:
                coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj;
                List list102 = (List) objOLrzqt;
                List<WalletEntity> list112 = this.$wallets;
                ArrayList arrayList22 = new ArrayList();
                while (r8.hasNext()) {
                }
                listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList22);
                if (!listFJNWhG.isEmpty()) {
                }
                break;
            case 2:
                str = (String) this.L$7;
                deferred2 = (Deferred) this.L$6;
                deferred3 = (Deferred) this.L$5;
                deferred = (Deferred) this.L$4;
                Deferred deferred12 = (Deferred) this.L$3;
                list3 = (List) this.L$2;
                list2 = (List) this.L$1;
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                deferred4 = deferred12;
                objAwait = obj;
                Map map102 = (Map) objAwait;
                this.L$0 = list;
                this.L$1 = list2;
                this.L$2 = list3;
                this.L$3 = deferred;
                this.L$4 = deferred3;
                this.L$5 = deferred2;
                this.L$6 = str;
                this.L$7 = map102;
                this.label = 3;
                objAwait2 = deferred4.await(this);
                if (objAwait2 != objCopydefault) {
                }
                break;
            case 3:
                Map map15 = (Map) this.L$7;
                String str9 = (String) this.L$6;
                deferred5 = (Deferred) this.L$5;
                Deferred deferred13 = (Deferred) this.L$4;
                Deferred deferred14 = (Deferred) this.L$3;
                list3 = (List) this.L$2;
                list2 = (List) this.L$1;
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAwait2 = obj;
                map = map15;
                str = str9;
                deferred6 = deferred13;
                deferred = deferred14;
                Map map112 = (Map) objAwait2;
                this.L$0 = list;
                this.L$1 = list2;
                this.L$2 = list3;
                this.L$3 = deferred6;
                this.L$4 = deferred5;
                this.L$5 = str;
                this.L$6 = map;
                this.L$7 = map112;
                this.label = 4;
                objAwait3 = deferred.await(this);
                if (objAwait3 != objCopydefault) {
                }
                break;
            case 4:
                map2 = (Map) this.L$7;
                map = (Map) this.L$6;
                str2 = (String) this.L$5;
                Deferred deferred15 = (Deferred) this.L$4;
                Deferred deferred16 = (Deferred) this.L$3;
                list3 = (List) this.L$2;
                list2 = (List) this.L$1;
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAwait3 = obj;
                deferred7 = deferred16;
                deferred8 = deferred15;
                Map map122 = (Map) objAwait3;
                this.L$0 = list;
                this.L$1 = list2;
                this.L$2 = list3;
                this.L$3 = deferred8;
                this.L$4 = str2;
                this.L$5 = map;
                this.L$6 = map2;
                this.L$7 = map122;
                this.label = 5;
                objAwait4 = deferred7.await(this);
                if (objAwait4 != objCopydefault) {
                }
                break;
            case 5:
                Map map16 = (Map) this.L$7;
                Map map17 = (Map) this.L$6;
                Map map18 = (Map) this.L$5;
                String str10 = (String) this.L$4;
                Deferred deferred17 = (Deferred) this.L$3;
                list3 = (List) this.L$2;
                list2 = (List) this.L$1;
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAwait4 = obj;
                map4 = map16;
                deferred9 = deferred17;
                str3 = str10;
                map3 = map18;
                map5 = map17;
                map6 = (Map) objAwait4;
                this.L$0 = list;
                this.L$1 = list2;
                this.L$2 = list3;
                this.L$3 = str3;
                this.L$4 = map3;
                this.L$5 = map5;
                this.L$6 = map4;
                this.L$7 = map6;
                this.label = 6;
                objAwait5 = deferred9.await(this);
                if (objAwait5 == objCopydefault) {
                }
                map7 = (HashMap) ((ResponseData) objAwait5).getData();
                if (map7 == null) {
                    str4 = "";
                    ArrayList arrayList62 = new ArrayList();
                    C13062cyk c13062cyk22 = this.this$0;
                    str5 = "";
                    ArrayList arrayList72 = new ArrayList(C56403yEb.AYXKKw(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                    }
                    Object obj82 = objCopydefault;
                    List list152 = list3;
                    C13062cyk c13062cyk32 = this.this$0;
                    ArrayList<Pair> arrayList112 = new ArrayList();
                    while (r4.hasNext()) {
                    }
                    C13062cyk c13062cyk42 = this.this$0;
                    ArrayList arrayList132 = new ArrayList(C56403yEb.AYXKKw(arrayList112, 10));
                    while (r3.hasNext()) {
                    }
                    list2.removeAll(arrayList62);
                    if (!list2.isEmpty()) {
                    }
                }
                if (((Number) objDjBIcL).intValue() > 0) {
                }
                break;
            case 6:
                Map map19 = (Map) this.L$7;
                map4 = (Map) this.L$6;
                map5 = (Map) this.L$5;
                map3 = (Map) this.L$4;
                str3 = (String) this.L$3;
                list3 = (List) this.L$2;
                list2 = (List) this.L$1;
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                map6 = map19;
                objAwait5 = obj;
                map7 = (HashMap) ((ResponseData) objAwait5).getData();
                if (map7 == null) {
                }
                if (((Number) objDjBIcL).intValue() > 0) {
                }
                break;
            case 7:
                List list18 = (List) this.L$1;
                list5 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                list4 = list18;
                str5 = "";
                obj2 = objCopydefault;
                objAEQbTJ = obj;
                abstractC43419rot = (AbstractC43419rot) objAEQbTJ;
                if (!abstractC43419rot.EZpvd()) {
                }
                break;
            case 8:
                List list19 = (List) this.L$1;
                list7 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                list8 = list19;
                objDjBIcL = obj;
                if (((Number) objDjBIcL).intValue() > 0) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$27$lambda$25(C13062cyk.StateListAnimator stateListAnimator) {
        String strEZpvd = stateListAnimator.EZpvd();
        if (strEZpvd != null) {
            C55326xho.toast$default(strEZpvd, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        }
    }
}
