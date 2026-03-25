package com.okinc.business.defi.biz.core.wallet.create;

import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.core.util.SPUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
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
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.cQM;
import o.yDY;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletSignManager$suppleSyncSignDataIfNeed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Pair<String, AbstractC12782ctV>> $wallets;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C13058cyg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends kotlin.Pair<java.lang.String, ? extends o.ctV>> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletSignManager$suppleSyncSignDataIfNeed$1(List<? extends Pair<String, ? extends AbstractC12782ctV>> list, C13058cyg c13058cyg, Continuation<? super WalletSignManager$suppleSyncSignDataIfNeed$1> continuation) {
        super(2, continuation);
        this.$wallets = list;
        this.this$0 = c13058cyg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSignManager$suppleSyncSignDataIfNeed$1(this.$wallets, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSignManager$suppleSyncSignDataIfNeed$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x012e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        List list2;
        List list3;
        List list4;
        C13058cyg c13058cyg;
        Iterator it;
        Object obj2;
        Object next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<Pair<String, AbstractC12782ctV>> list5 = this.$wallets;
            C13058cyg c13058cyg2 = this.this$0;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list5) {
                AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) ((Pair) obj3).component2();
                if (c13058cyg2.KWHzl(abstractC12782ctV) && !abstractC12782ctV.zblBkD() && c13058cyg2.AEQbTJ(abstractC12782ctV.accept(), "6.101.0") < 0) {
                    if (!SPUtils.getBoolean("has_supple_sync_data_" + abstractC12782ctV.DbNXlk(), false, "wallet_biz_sp_file")) {
                        arrayList.add(obj3);
                    }
                }
            }
            cQM cqm = this.this$0.copydefault;
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((AbstractC12782ctV) ((Pair) it2.next()).getSecond()).DbNXlk());
            }
            AbstractC58260yxt<List<WalletEntity>> abstractC58260yxtCopydefault = cqm.copydefault(arrayList2);
            this.L$0 = arrayList;
            this.label = 1;
            obj = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            list = arrayList;
        } else {
            if (i != 1) {
                if (i == 2) {
                    list3 = (List) this.L$1;
                    List list6 = (List) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    list2 = list6;
                    list4 = (List) obj;
                    Intrinsics.copydefault(list3);
                    c13058cyg = this.this$0;
                    it = list3.iterator();
                    while (it.hasNext()) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$3;
                c13058cyg = (C13058cyg) this.L$2;
                list4 = (List) this.L$1;
                list2 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                while (it.hasNext()) {
                    WalletEntity walletEntity = (WalletEntity) it.next();
                    Iterator it3 = list4.iterator();
                    while (true) {
                        obj2 = null;
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                        if (Intrinsics.EZpvd((Object) ((C11288cIr) next).AEQbTJ(), (Object) walletEntity.getId())) {
                            break;
                        }
                    }
                    C11288cIr c11288cIr = (C11288cIr) next;
                    List<C11283cIm> listKWHzl = c11288cIr != null ? c11288cIr.KWHzl() : null;
                    if (listKWHzl == null || listKWHzl.isEmpty()) {
                        Iterator it4 = list2.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            Object next2 = it4.next();
                            if (Intrinsics.EZpvd((Object) ((AbstractC12782ctV) ((Pair) next2).getSecond()).DbNXlk(), (Object) walletEntity.getId())) {
                                obj2 = next2;
                                break;
                            }
                        }
                        Pair pair = (Pair) obj2;
                        if (pair == null) {
                            continue;
                        } else {
                            SPUtils.commit("has_supple_sync_data_" + walletEntity.getId(), C56443yFo.KWHzl(true), "wallet_biz_sp_file");
                            List<C11283cIm> listEZpvd = c13058cyg.EZpvd((AbstractC12782ctV) pair.getSecond(), (String) pair.getFirst(), CollectionsKt___CollectionsKt.QKudOq(((AbstractC12782ctV) pair.getSecond()).EZpvd()));
                            String id = walletEntity.getId();
                            List<C11283cIm> listAhwBna = yDY.AhwBna();
                            this.L$0 = list2;
                            this.L$1 = list4;
                            this.L$2 = c13058cyg;
                            this.L$3 = it;
                            this.label = 3;
                            if (c13058cyg.copydefault(id, listAhwBna, listEZpvd, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            list = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        List list7 = (List) obj;
        C13058cyg c13058cyg3 = this.this$0;
        ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            arrayList3.add(((AbstractC12782ctV) ((Pair) it5.next()).getSecond()).DbNXlk());
        }
        this.L$0 = list;
        this.L$1 = list7;
        this.label = 2;
        Object objKWHzl = c13058cyg3.KWHzl(arrayList3, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        list2 = list;
        list3 = list7;
        obj = objKWHzl;
        list4 = (List) obj;
        Intrinsics.copydefault(list3);
        c13058cyg = this.this$0;
        it = list3.iterator();
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
