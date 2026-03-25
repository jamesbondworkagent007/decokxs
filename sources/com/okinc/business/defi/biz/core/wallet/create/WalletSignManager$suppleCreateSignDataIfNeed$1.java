package com.okinc.business.defi.biz.core.wallet.create;

import com.okinc.business.defi.biz.constant.WalletSyncStatus;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.core.util.SPUtils;
import com.okinc.wallet.core.mpc.CoinAddressBean;
import com.okinc.wallet.core.mpc.WalletAddressList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C11283cIm;
import o.C11291cIu;
import o.C13058cyg;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletSignManager$suppleCreateSignDataIfNeed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Pair<String, AbstractC12782ctV>> $wallets;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C13058cyg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends kotlin.Pair<java.lang.String, ? extends o.ctV>> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletSignManager$suppleCreateSignDataIfNeed$1(List<? extends Pair<String, ? extends AbstractC12782ctV>> list, C13058cyg c13058cyg, Continuation<? super WalletSignManager$suppleCreateSignDataIfNeed$1> continuation) {
        super(2, continuation);
        this.$wallets = list;
        this.this$0 = c13058cyg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSignManager$suppleCreateSignDataIfNeed$1(this.$wallets, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSignManager$suppleCreateSignDataIfNeed$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0201  */
    /* JADX WARN: Type inference failed for: r6v6, types: [T, com.okinc.business.defi.biz.model.ChainAddress] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0120 -> B:74:0x01fe). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01fb -> B:74:0x01fe). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List arrayList;
        Object objOLrzqt;
        C13058cyg c13058cyg;
        List list;
        Iterator it;
        Object next;
        Object next2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<Pair<String, AbstractC12782ctV>> list2 = this.$wallets;
            C13058cyg c13058cyg2 = this.this$0;
            arrayList = new ArrayList();
            for (Object obj2 : list2) {
                AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) ((Pair) obj2).component2();
                if (abstractC12782ctV.QCjLjM() < WalletSyncStatus.HasCreate.getValue() && c13058cyg2.KWHzl(abstractC12782ctV) && !abstractC12782ctV.zblBkD()) {
                    if (!SPUtils.getBoolean("has_supple_create_data_" + abstractC12782ctV.DbNXlk(), false, "wallet_biz_sp_file")) {
                        arrayList.add(obj2);
                    }
                }
            }
            C13058cyg c13058cyg3 = this.this$0;
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((AbstractC12782ctV) ((Pair) it2.next()).component2()).DbNXlk());
            }
            this.L$0 = arrayList;
            this.label = 1;
            objOLrzqt = c13058cyg3.OLrzqt(arrayList2, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else if (i == 1) {
            List list3 = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            arrayList = list3;
            objOLrzqt = obj;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$2;
            c13058cyg = (C13058cyg) this.L$1;
            list = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            if (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str = (String) pair.component1();
                AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) pair.component2();
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    if (Intrinsics.EZpvd((Object) ((C11291cIu) next).AEQbTJ(), (Object) abstractC12782ctV2.DbNXlk())) {
                        break;
                    }
                }
                C11291cIu c11291cIu = (C11291cIu) next;
                List<C11283cIm> listCopydefault = c11291cIu != null ? c11291cIu.copydefault() : null;
                if (listCopydefault == null || listCopydefault.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    HashSet<ChainAddress> hashSetQKudOq = CollectionsKt___CollectionsKt.QKudOq(abstractC12782ctV2.EZpvd());
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    for (WalletAddressList walletAddressList : c13058cyg.copydefault(abstractC12782ctV2, str, hashSetQKudOq)) {
                        int i2 = 0;
                        for (Object obj3 : walletAddressList.getAddressList()) {
                            if (i2 < 0) {
                                yDY.AYXKKw();
                            }
                            CoinAddressBean coinAddressBean = (CoinAddressBean) obj3;
                            Iterator<T> it4 = hashSetQKudOq.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it4.next();
                                ChainAddress chainAddress = (ChainAddress) next2;
                                if (chainAddress.getChainId() == walletAddressList.getChainId() && chainAddress.getAddressType() == coinAddressBean.getType()) {
                                    break;
                                }
                            }
                            ?? r6 = (ChainAddress) next2;
                            if (r6 != 0) {
                                objectRef.element = r6;
                                hashSet.add(new C11283cIm(((ChainAddress) objectRef.element).getAddressType(), ((ChainAddress) objectRef.element).getChainId(), walletAddressList.getSignature(), null, null, 24, null));
                            }
                            i2++;
                        }
                    }
                    SPUtils.commit("has_supple_create_data_" + abstractC12782ctV2.DbNXlk(), C56443yFo.KWHzl(true), "wallet_biz_sp_file");
                    List<C11291cIu> listEZpvd = C56402yEa.EZpvd(new C11291cIu(abstractC12782ctV2.DbNXlk(), CollectionsKt___CollectionsKt.AxsJAYsNCnLh(hashSet)));
                    this.L$0 = list;
                    this.L$1 = c13058cyg;
                    this.L$2 = it;
                    this.label = 2;
                    if (c13058cyg.AEQbTJ(listEZpvd, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                if (it.hasNext()) {
                    return Unit.INSTANCE;
                }
            }
        }
        c13058cyg = this.this$0;
        Iterator it5 = arrayList.iterator();
        list = (List) objOLrzqt;
        it = it5;
        if (it.hasNext()) {
        }
    }
}
