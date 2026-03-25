package com.okinc.business.defi.biz.core.wallet.create;

import com.okinc.business.defi.biz.constant.WalletSyncOperation;
import com.okinc.business.defi.biz.constant.WalletSyncStatus;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.core.util.SPUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C11283cIm;
import o.C11288cIr;
import o.C13058cyg;
import o.C13062cyk;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.cQM;
import o.yDY;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletSignManager$suppleSyncDataIfNeed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<AbstractC12782ctV> $wallets;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C13058cyg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends o.ctV> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletSignManager$suppleSyncDataIfNeed$1(List<? extends AbstractC12782ctV> list, C13058cyg c13058cyg, Continuation<? super WalletSignManager$suppleSyncDataIfNeed$1> continuation) {
        super(2, continuation);
        this.$wallets = list;
        this.this$0 = c13058cyg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSignManager$suppleSyncDataIfNeed$1(this.$wallets, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSignManager$suppleSyncDataIfNeed$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0149  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List arrayList;
        Object objAwait;
        List list;
        Object objKWHzl;
        List list2;
        List list3;
        C13058cyg c13058cyg;
        Iterator it;
        Object obj2;
        Object next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<AbstractC12782ctV> list4 = this.$wallets;
            C13058cyg c13058cyg2 = this.this$0;
            arrayList = new ArrayList();
            for (Object obj3 : list4) {
                AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj3;
                if (!abstractC12782ctV.zblBkD() && !c13058cyg2.KWHzl(abstractC12782ctV)) {
                    if (!SPUtils.getBoolean("has_supple_sync_data_" + abstractC12782ctV.DbNXlk(), false, "wallet_biz_sp_file")) {
                        arrayList.add(obj3);
                    }
                }
            }
            cQM cqm = this.this$0.copydefault;
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((AbstractC12782ctV) it2.next()).DbNXlk());
            }
            AbstractC58260yxt<List<WalletEntity>> abstractC58260yxtCopydefault = cqm.copydefault(arrayList2);
            this.L$0 = arrayList;
            this.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    list = (List) this.L$1;
                    List list5 = (List) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    list2 = list5;
                    objKWHzl = obj;
                    list3 = (List) objKWHzl;
                    Intrinsics.copydefault(list);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : list) {
                        WalletEntity walletEntity = (WalletEntity) obj4;
                        if (walletEntity.getSyncStatus() >= WalletSyncStatus.HasCreate.getValue() && C13062cyk.Companion.EZpvd(walletEntity, WalletSyncOperation.UpgradeAddress)) {
                            arrayList3.add(obj4);
                        }
                    }
                    C13058cyg c13058cyg3 = this.this$0;
                    Iterator it3 = arrayList3.iterator();
                    c13058cyg = c13058cyg3;
                    it = it3;
                    while (it.hasNext()) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$3;
                c13058cyg = (C13058cyg) this.L$2;
                list3 = (List) this.L$1;
                list2 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                while (it.hasNext()) {
                    WalletEntity walletEntity2 = (WalletEntity) it.next();
                    Iterator it4 = list3.iterator();
                    while (true) {
                        obj2 = null;
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it4.next();
                        if (Intrinsics.EZpvd((Object) ((C11288cIr) next).AEQbTJ(), (Object) walletEntity2.getId())) {
                            break;
                        }
                    }
                    C11288cIr c11288cIr = (C11288cIr) next;
                    List<C11283cIm> listKWHzl = c11288cIr != null ? c11288cIr.KWHzl() : null;
                    if (listKWHzl == null || listKWHzl.isEmpty()) {
                        Iterator it5 = list2.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                break;
                            }
                            Object next2 = it5.next();
                            if (Intrinsics.EZpvd((Object) ((AbstractC12782ctV) next2).DbNXlk(), (Object) walletEntity2.getId())) {
                                obj2 = next2;
                                break;
                            }
                        }
                        AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) obj2;
                        if (abstractC12782ctV2 == null) {
                            continue;
                        } else {
                            HashSet hashSet = new HashSet();
                            for (ChainAddress chainAddress : abstractC12782ctV2.EZpvd()) {
                                hashSet.add(new C11283cIm(chainAddress.getAddressType(), chainAddress.getChainId(), "", null, null, 24, null));
                            }
                            if (!hashSet.isEmpty()) {
                                SPUtils.commit("has_supple_sync_data_" + abstractC12782ctV2.DbNXlk(), C56443yFo.KWHzl(true), "wallet_biz_sp_file");
                                String id = walletEntity2.getId();
                                List<C11283cIm> listAhwBna = yDY.AhwBna();
                                List<C11283cIm> listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(hashSet);
                                this.L$0 = list2;
                                this.L$1 = list3;
                                this.L$2 = c13058cyg;
                                this.L$3 = it;
                                this.label = 3;
                                if (c13058cyg.copydefault(id, listAhwBna, listAxsJAYsNCnLh, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            List list6 = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            arrayList = list6;
            objAwait = obj;
        }
        list = (List) objAwait;
        C13058cyg c13058cyg4 = this.this$0;
        ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList4.add(((AbstractC12782ctV) it6.next()).DbNXlk());
        }
        this.L$0 = arrayList;
        this.L$1 = list;
        this.label = 2;
        objKWHzl = c13058cyg4.KWHzl(arrayList4, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        list2 = arrayList;
        list3 = (List) objKWHzl;
        Intrinsics.copydefault(list);
        ArrayList arrayList32 = new ArrayList();
        while (r2.hasNext()) {
        }
        C13058cyg c13058cyg32 = this.this$0;
        Iterator it32 = arrayList32.iterator();
        c13058cyg = c13058cyg32;
        it = it32;
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
