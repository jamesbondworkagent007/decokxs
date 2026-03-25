package com.okinc.business.defi.biz.core.wallet.create;

import android.graphics.drawable.Drawable;
import com.okinc.business.defi.biz.constant.WalletMustSyncOperation;
import com.okinc.business.defi.biz.constant.WalletSyncOperation;
import com.okinc.business.defi.biz.constant.WalletSyncStatus;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$syncWalletAddressList$2;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressSegWitEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.SyncWalletReqNew;
import com.okinc.business.defi.biz.net.bean.SyncWalletReqs;
import com.okinc.network.okg.response.OKServerException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
import o.AbstractC43419rot;
import o.C10545bqV;
import o.C10604brb;
import o.C10954byG;
import o.C11288cIr;
import o.C11600cUg;
import o.C13058cyg;
import o.C13062cyk;
import o.C13934dbu;
import o.C33129mqd;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.C56548yJl;
import o.C6777aVl;
import o.yDY;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletSyncManager$syncWalletAddressList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C13062cyk.StateListAnimator<Pair<? extends List<? extends Pair<? extends WalletEntity, ? extends SyncWalletReqNew>>, ? extends Map<String, ? extends List<? extends ChainAddress>>>>>, Object> {
    final /* synthetic */ String $from;
    final /* synthetic */ boolean $isDelay;
    final /* synthetic */ boolean $isUploadDefaultAddress;
    final /* synthetic */ List<WalletEntity> $originWallets;
    final /* synthetic */ C13062cyk.LoaderManager $waitType;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C13062cyk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSyncManager$syncWalletAddressList$2(C13062cyk c13062cyk, List<WalletEntity> list, boolean z, boolean z2, C13062cyk.LoaderManager loaderManager, String str, Continuation<? super WalletSyncManager$syncWalletAddressList$2> continuation) {
        super(2, continuation);
        this.this$0 = c13062cyk;
        this.$originWallets = list;
        this.$isUploadDefaultAddress = z;
        this.$isDelay = z2;
        this.$waitType = loaderManager;
        this.$from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletSyncManager$syncWalletAddressList$2 walletSyncManager$syncWalletAddressList$2 = new WalletSyncManager$syncWalletAddressList$2(this.this$0, this.$originWallets, this.$isUploadDefaultAddress, this.$isDelay, this.$waitType, this.$from, continuation);
        walletSyncManager$syncWalletAddressList$2.L$0 = obj;
        return walletSyncManager$syncWalletAddressList$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super C13062cyk.StateListAnimator<Pair<? extends List<? extends Pair<? extends WalletEntity, ? extends SyncWalletReqNew>>, ? extends Map<String, ? extends List<? extends ChainAddress>>>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super C13062cyk.StateListAnimator<Pair<List<Pair<WalletEntity, SyncWalletReqNew>>, Map<String, List<ChainAddress>>>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super C13062cyk.StateListAnimator<Pair<List<Pair<WalletEntity, SyncWalletReqNew>>, Map<String, List<ChainAddress>>>>> continuation) {
        return ((WalletSyncManager$syncWalletAddressList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1315=5] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0302 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Object objKWHzl;
        Map linkedHashMap;
        Deferred deferredAsync$default;
        Object objAwait;
        HashMap map;
        List list;
        List list2;
        Object next;
        boolean z;
        Object objAwait2;
        HashMap map2;
        Map map3;
        List<WalletEntity> list3;
        List list4;
        List list5;
        Object obj2;
        List list6;
        ArrayList<SyncWalletReqNew> arrayList;
        AbstractC43419rot abstractC43419rot;
        WalletEntity walletEntity;
        Object objCopydefault;
        HashMap map4;
        Map map5;
        Object next2;
        Object obj3;
        final AbstractC43419rot.ActionBar actionBar;
        Object next3;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        Object obj4 = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            C13058cyg c13058cyg = this.this$0.AkhnZx;
            List<WalletEntity> list7 = this.$originWallets;
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list7, 10));
            Iterator<T> it = list7.iterator();
            while (it.hasNext()) {
                arrayList2.add(((WalletEntity) it.next()).getId());
            }
            this.L$0 = coroutineScope;
            this.label = 1;
            objKWHzl = c13058cyg.KWHzl(arrayList2, this);
            if (objKWHzl == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    deferredAsync$default = (Deferred) this.L$4;
                    map = (HashMap) this.L$3;
                    linkedHashMap = (Map) this.L$2;
                    list2 = (List) this.L$1;
                    list = (List) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objAwait = obj;
                    C13062cyk c13062cyk = this.this$0;
                    boolean z2 = this.$isUploadDefaultAddress;
                    for (Map.Entry entry : ((Map) objAwait).entrySet()) {
                        List listAEQbTJ = c13062cyk.AEQbTJ((HashMap<String, List<ChainAddress>>) map, (String) entry.getKey());
                        if (!((Collection) entry.getValue()).isEmpty()) {
                            for (ChainAddressEntity chainAddressEntity : (Iterable) entry.getValue()) {
                                String address = chainAddressEntity.getAddress();
                                if (address == null || address.length() == 0) {
                                    list6 = list;
                                } else {
                                    list6 = list;
                                    if (C10954byG.EZpvd.valueOf().KWHzl(chainAddressEntity.getChainId()) != null) {
                                        listAEQbTJ.add(new ChainAddress(chainAddressEntity.getChainId(), chainAddressEntity.getAddress(), chainAddressEntity.getAddressType(), chainAddressEntity.getProxyAddress(), chainAddressEntity.getEoaAddress(), z2, chainAddressEntity.getPublicKey(), ""));
                                    }
                                }
                                list = list6;
                            }
                            list5 = list;
                            Unit unit = Unit.INSTANCE;
                        } else {
                            list5 = list;
                            WalletEntity walletEntity2 = (WalletEntity) linkedHashMap.get(entry.getKey());
                            if (walletEntity2 != null) {
                                obj2 = null;
                                C6777aVl.Companion.copydefault(new OKWException("chainAddresses is empty of WalletSyncManager", null), C56424yEw.gEmmrt(C56390yDp.OLrzqt("isUploadDefaultAddress", String.valueOf(z2)), C56390yDp.OLrzqt("walletId", walletEntity2.getId()), C56390yDp.OLrzqt("walletType", String.valueOf(walletEntity2.getType()))), null);
                                Unit unit2 = Unit.INSTANCE;
                            }
                            obj4 = obj2;
                            list = list5;
                        }
                        obj2 = null;
                        obj4 = obj2;
                        list = list5;
                    }
                    this.L$0 = list;
                    this.L$1 = list2;
                    this.L$2 = linkedHashMap;
                    this.L$3 = map;
                    this.L$4 = obj4;
                    this.label = 3;
                    objAwait2 = deferredAsync$default.await(this);
                    if (objAwait2 != objCopydefault2) {
                        return objCopydefault2;
                    }
                    map2 = map;
                    map3 = linkedHashMap;
                    list3 = list2;
                    list4 = list;
                    C13062cyk c13062cyk2 = this.this$0;
                    while (r0.hasNext()) {
                    }
                    arrayList = new ArrayList();
                    C13062cyk c13062cyk3 = this.this$0;
                    while (r1.hasNext()) {
                    }
                    if (!arrayList.isEmpty()) {
                    }
                    abstractC43419rot = null;
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    if (abstractC43419rot == null) {
                    }
                    if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                    }
                    if (actionBar != null) {
                    }
                    return this.this$0.EZpvd((AbstractC43419rot<?, OKServerException>) abstractC43419rot, C56390yDp.OLrzqt(yDY.AhwBna(), C56424yEw.KWHzl()));
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        abstractC43419rot = (AbstractC43419rot) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        Unit unit3 = Unit.INSTANCE;
                        return this.this$0.EZpvd((AbstractC43419rot<?, OKServerException>) abstractC43419rot, C56390yDp.OLrzqt(yDY.AhwBna(), C56424yEw.KWHzl()));
                    }
                    ArrayList arrayList5 = (ArrayList) this.L$2;
                    map4 = (HashMap) this.L$1;
                    map5 = (Map) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    arrayList = arrayList5;
                    objCopydefault = obj;
                    abstractC43419rot = (AbstractC43419rot) objCopydefault;
                    map2 = map4;
                    map3 = map5;
                    ArrayList arrayList32 = new ArrayList();
                    ArrayList arrayList42 = new ArrayList();
                    if (abstractC43419rot == null && abstractC43419rot.EZpvd()) {
                        for (SyncWalletReqNew syncWalletReqNew : arrayList) {
                            WalletEntity walletEntity3 = (WalletEntity) map3.get(syncWalletReqNew.getAccountId());
                            if (walletEntity3 != null) {
                                arrayList32.add(C56390yDp.OLrzqt(walletEntity3, syncWalletReqNew));
                                Unit unit4 = Unit.INSTANCE;
                            }
                        }
                        return new C13062cyk.StateListAnimator(C56390yDp.OLrzqt(arrayList32, map2), 0, null, 6, null);
                    }
                    actionBar = !(abstractC43419rot instanceof AbstractC43419rot.ActionBar) ? (AbstractC43419rot.ActionBar) abstractC43419rot : null;
                    if (actionBar != null) {
                        List<WalletEntity> list8 = this.$originWallets;
                        C13062cyk.LoaderManager loaderManager = this.$waitType;
                        C13062cyk c13062cyk4 = this.this$0;
                        String str = this.$from;
                        int code = ((OKServerException) actionBar.KWHzl()).getCode();
                        if (code == 10002) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                WalletEntity walletEntity4 = (WalletEntity) map3.get(((SyncWalletReqNew) it2.next()).getAccountId());
                                if (walletEntity4 != null) {
                                    arrayList42.add(walletEntity4);
                                    Unit unit5 = Unit.INSTANCE;
                                }
                            }
                            this.L$0 = abstractC43419rot;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 5;
                            if (c13062cyk4.copydefault((List<WalletEntity>) arrayList42, (Continuation<? super Unit>) this) == objCopydefault2) {
                                return objCopydefault2;
                            }
                        } else if (code == 10007) {
                            if (c13062cyk4.copydefault(str)) {
                                c13062cyk4.EZpvd().post(new Runnable() { // from class: o.cyu
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        WalletSyncManager$syncWalletAddressList$2.invokeSuspend$lambda$20$lambda$19(actionBar);
                                    }
                                });
                            }
                            c13062cyk4.AEQbTJ();
                        } else if (code == 900003) {
                            Iterator<T> it3 = list8.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                next3 = it3.next();
                                if (((WalletEntity) next3).getMain() == 1) {
                                    break;
                                }
                            }
                            WalletEntity walletEntity5 = (WalletEntity) next3;
                            if (walletEntity5 != null && walletEntity5.getSyncStatus() < WalletSyncStatus.HasSync.getValue() && (loaderManager instanceof C13062cyk.LoaderManager.TaskDescription)) {
                                C10545bqV c10545bqVKWHzl = C10604brb.Application.getInstance$default(C10604brb.Companion, null, 1, null).KWHzl();
                                String message = ((OKServerException) actionBar.KWHzl()).getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                c10545bqVKWHzl.AEQbTJ(null, message);
                            }
                        }
                        Unit unit32 = Unit.INSTANCE;
                    }
                    return this.this$0.EZpvd((AbstractC43419rot<?, OKServerException>) abstractC43419rot, C56390yDp.OLrzqt(yDY.AhwBna(), C56424yEw.KWHzl()));
                }
                HashMap map6 = (HashMap) this.L$3;
                Map map7 = (Map) this.L$2;
                list3 = (List) this.L$1;
                list4 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                map2 = map6;
                map3 = map7;
                objAwait2 = obj;
                C13062cyk c13062cyk22 = this.this$0;
                for (Map.Entry entry2 : ((Map) objAwait2).entrySet()) {
                    List listAEQbTJ2 = c13062cyk22.AEQbTJ((HashMap<String, List<ChainAddress>>) map2, (String) entry2.getKey());
                    for (ChainAddressSegWitEntity chainAddressSegWitEntity : (Iterable) entry2.getValue()) {
                        Iterator it4 = listAEQbTJ2.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            Object next4 = it4.next();
                            ChainAddress chainAddress = (ChainAddress) next4;
                            if (Intrinsics.EZpvd((Object) chainAddress.getAddress(), (Object) chainAddressSegWitEntity.getAddress()) && chainAddress.getCoinId() == chainAddressSegWitEntity.getChainId()) {
                                obj3 = next4;
                                break;
                            }
                        }
                        if (obj3 == null && C10954byG.EZpvd.valueOf().KWHzl(chainAddressSegWitEntity.getChainId()) != null) {
                            listAEQbTJ2.add(new ChainAddress(chainAddressSegWitEntity.getChainId(), chainAddressSegWitEntity.getAddress(), chainAddressSegWitEntity.getAddressType(), null, null, false, chainAddressSegWitEntity.getPublicKey(), "", 24, null));
                        }
                    }
                }
                arrayList = new ArrayList();
                C13062cyk c13062cyk32 = this.this$0;
                for (WalletEntity walletEntity6 : list3) {
                    Iterator it5 = list4.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it5.next();
                        if (Intrinsics.EZpvd((Object) ((C11288cIr) next2).AEQbTJ(), (Object) walletEntity6.getId())) {
                            break;
                        }
                    }
                    C11288cIr c11288cIr = (C11288cIr) next2;
                    if (c11288cIr != null) {
                        List list9 = (List) map2.get(c11288cIr.AEQbTJ());
                        List listSuppleAndGroupSignData$default = C13058cyg.suppleAndGroupSignData$default(c13062cyk32.AkhnZx, c11288cIr.AEQbTJ(), list9, c11288cIr.EZpvd(), false, 8, null);
                        List listSuppleAndGroupSignData$default2 = C13058cyg.suppleAndGroupSignData$default(c13062cyk32.AkhnZx, c11288cIr.AEQbTJ(), list9, c11288cIr.KWHzl(), false, 8, null);
                        if (C33129mqd.KWHzl((Collection) listSuppleAndGroupSignData$default2) || C33129mqd.KWHzl((Collection) listSuppleAndGroupSignData$default)) {
                            arrayList.add(new SyncWalletReqNew(c11288cIr.AEQbTJ(), listSuppleAndGroupSignData$default, listSuppleAndGroupSignData$default2));
                        }
                    }
                }
                if ((!arrayList.isEmpty()) || (walletEntity = (WalletEntity) CollectionsKt___CollectionsKt.firstOrNull(list3)) == null) {
                    abstractC43419rot = null;
                    ArrayList arrayList322 = new ArrayList();
                    ArrayList arrayList422 = new ArrayList();
                    if (abstractC43419rot == null) {
                    }
                    if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                    }
                    if (actionBar != null) {
                    }
                    return this.this$0.EZpvd((AbstractC43419rot<?, OKServerException>) abstractC43419rot, C56390yDp.OLrzqt(yDY.AhwBna(), C56424yEw.KWHzl()));
                }
                C13062cyk c13062cyk5 = this.this$0;
                boolean z3 = this.$isDelay;
                C13934dbu c13934dbu = c13062cyk5.gEmmrt;
                String id = walletEntity.getId();
                String xpriv = walletEntity.getXpriv();
                SyncWalletReqs syncWalletReqs = new SyncWalletReqs(WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).AhwBna(), z3, arrayList);
                String xpub = walletEntity.getXpub();
                this.L$0 = map3;
                this.L$1 = map2;
                this.L$2 = arrayList;
                this.L$3 = null;
                this.label = 4;
                objCopydefault = c13934dbu.copydefault(id, xpriv, syncWalletReqs, xpub, this);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                map4 = map2;
                map5 = map3;
                abstractC43419rot = (AbstractC43419rot) objCopydefault;
                map2 = map4;
                map3 = map5;
                ArrayList arrayList3222 = new ArrayList();
                ArrayList arrayList4222 = new ArrayList();
                if (abstractC43419rot == null) {
                }
                if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                }
                if (actionBar != null) {
                }
                return this.this$0.EZpvd((AbstractC43419rot<?, OKServerException>) abstractC43419rot, C56390yDp.OLrzqt(yDY.AhwBna(), C56424yEw.KWHzl()));
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        }
        List list10 = (List) objKWHzl;
        List<WalletEntity> list11 = this.$originWallets;
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : list11) {
            WalletEntity walletEntity7 = (WalletEntity) obj5;
            Iterator it6 = list10.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    next = null;
                    break;
                }
                next = it6.next();
                if (Intrinsics.EZpvd((Object) ((C11288cIr) next).AEQbTJ(), (Object) walletEntity7.getId())) {
                    break;
                }
            }
            C11288cIr c11288cIr2 = (C11288cIr) next;
            if (C33129mqd.KWHzl((Collection) (c11288cIr2 != null ? c11288cIr2.EZpvd() : null))) {
                z = true;
            } else if (!C33129mqd.KWHzl((Collection) (c11288cIr2 != null ? c11288cIr2.KWHzl() : null))) {
                z = false;
            }
            if (C11600cUg.KWHzl(walletEntity7.getFromCreate())) {
                C13062cyk.Application application = C13062cyk.Companion;
                if (application.EZpvd(walletEntity7, WalletSyncOperation.UpdateDefaultAddress) || application.EZpvd(walletEntity7, WalletSyncOperation.UpgradeAddress) || walletEntity7.getSyncStatus() < WalletSyncStatus.HasSync.getValue() || ((walletEntity7.getType() == WalletType.HDWallet.ordinal() && !C11600cUg.KWHzl(walletEntity7.getFromCreate()) && !application.AEQbTJ(walletEntity7, WalletMustSyncOperation.HasRequestSegwit)) || (!C11600cUg.KWHzl(walletEntity7.getFromCreate()) && !application.AEQbTJ(walletEntity7, WalletMustSyncOperation.HasRequestEosInfo)))) {
                    if (z) {
                        arrayList6.add(obj5);
                    }
                }
            }
        }
        ArrayList arrayList7 = new ArrayList(C56403yEb.AYXKKw(arrayList6, 10));
        Iterator it7 = arrayList6.iterator();
        while (it7.hasNext()) {
            arrayList7.add(((WalletEntity) it7.next()).getId());
        }
        linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList6, 10)), 16));
        for (Object obj6 : arrayList6) {
            linkedHashMap.put(((WalletEntity) obj6).getId(), obj6);
        }
        HashMap map8 = new HashMap();
        Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new WalletSyncManager$syncWalletAddressList$2$queryChainDef$1(this.this$0, arrayList7, null), 3, null);
        deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new WalletSyncManager$syncWalletAddressList$2$getWalletAllAddress$1(this.this$0, arrayList7, null), 3, null);
        this.L$0 = list10;
        this.L$1 = arrayList6;
        this.L$2 = linkedHashMap;
        this.L$3 = map8;
        this.L$4 = deferredAsync$default;
        this.label = 2;
        objAwait = deferredAsync$default2.await(this);
        if (objAwait == objCopydefault2) {
            return objCopydefault2;
        }
        map = map8;
        list = list10;
        list2 = arrayList6;
        C13062cyk c13062cyk6 = this.this$0;
        boolean z22 = this.$isUploadDefaultAddress;
        while (r1.hasNext()) {
        }
        this.L$0 = list;
        this.L$1 = list2;
        this.L$2 = linkedHashMap;
        this.L$3 = map;
        this.L$4 = obj4;
        this.label = 3;
        objAwait2 = deferredAsync$default.await(this);
        if (objAwait2 != objCopydefault2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$20$lambda$19(AbstractC43419rot.ActionBar actionBar) {
        C55326xho.toast$default(((OKServerException) actionBar.KWHzl()).getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
    }
}
