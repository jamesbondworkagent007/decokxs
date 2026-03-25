package com.okinc.business.defi.wallet.tx.send;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.segwit.bean.AddressData;
import com.okinc.business.defi.biz.model.ChainAddress;
import java.util.ArrayList;
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
import o.AbstractC12784ctX;
import o.AbstractC58260yxt;
import o.C10539bqP;
import o.C10854bwM;
import o.C19565gHb;
import o.C19574gHk;
import o.C19577gHn;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletSelectReceiveAddressForAAViewModel$loadAddressList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C19565gHb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSelectReceiveAddressForAAViewModel$loadAddressList$1(C19565gHb c19565gHb, Continuation<? super WalletSelectReceiveAddressForAAViewModel$loadAddressList$1> continuation) {
        super(2, continuation);
        this.this$0 = c19565gHb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSelectReceiveAddressForAAViewModel$loadAddressList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSelectReceiveAddressForAAViewModel$loadAddressList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<AbstractC12784ctX> listAhwBna;
        String address;
        Object objAwait;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC58260yxt<List<AbstractC12784ctX>> abstractC58260yxtEZpvd = this.this$0.gEmmrt.EZpvd(true, true);
                this.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtEZpvd, this);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAwait = obj;
            }
            listAhwBna = (List) objAwait;
        } catch (Exception unused) {
            listAhwBna = yDY.AhwBna();
        }
        ArrayList arrayList = new ArrayList(12);
        Intrinsics.copydefault(listAhwBna);
        C19565gHb c19565gHb = this.this$0;
        for (AbstractC12784ctX abstractC12784ctX : listAhwBna) {
            if (abstractC12784ctX.fJNWhG() == WalletType.HDWallet && abstractC12784ctX.AEQbTJ() && !abstractC12784ctX.AuCTelauCTel()) {
                ArrayList arrayList2 = new ArrayList();
                for (AbstractC12782ctV abstractC12782ctV : abstractC12784ctX.KWHzl()) {
                    C10854bwM c10854bwMOLrzqt = c19565gHb.OLrzqt();
                    if (c10854bwMOLrzqt != null && c10854bwMOLrzqt.DarRvM()) {
                        C10854bwM c10854bwMOLrzqt2 = c19565gHb.OLrzqt();
                        ChainAddress chainAddressOLrzqt = abstractC12782ctV.OLrzqt(c10854bwMOLrzqt2 != null ? C56443yFo.KWHzl(c10854bwMOLrzqt2.AhwBna()) : null);
                        if (chainAddressOLrzqt == null || (address = chainAddressOLrzqt.getAddress()) == null) {
                        }
                    } else {
                        C10854bwM c10854bwMOLrzqt3 = c19565gHb.OLrzqt();
                        ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwMOLrzqt3 != null ? c10854bwMOLrzqt3.AEQbTJ() : 0L, null, 2, null);
                        if (chainAddressAddressFromChainId$default == null || (address = chainAddressAddressFromChainId$default.getAddress()) == null) {
                            address = "";
                        }
                    }
                    String str = address;
                    if (str.length() != 0) {
                        C10854bwM c10854bwMOLrzqt4 = c19565gHb.OLrzqt();
                        if (c10854bwMOLrzqt4 != null && c10854bwMOLrzqt4.dxcTrN()) {
                            ArrayList arrayList3 = new ArrayList();
                            for (ChainAddress chainAddress : abstractC12782ctV.gGvvIC()) {
                                C10854bwM c10854bwMOLrzqt5 = c19565gHb.OLrzqt();
                                if (c10854bwMOLrzqt5 != null && c10854bwMOLrzqt5.AhwBna() == chainAddress.getCoinId()) {
                                    arrayList3.add(new C19577gHn(abstractC12782ctV.AkhnZx(), chainAddress.getAddress(), abstractC12782ctV.AYXKKw(), false, new AddressData(chainAddress.getAddressType(), false, false, null, 14, null).getAddressFormat(), chainAddress.getAddressType(), false, abstractC12782ctV.getFieldNames(), abstractC12782ctV.DbNXlk(), 4, null, 1024, null));
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList3, C10539bqP.AEQbTJ);
                                ((C19577gHn) CollectionsKt___CollectionsKt.AuCTelauCTel(listEZpvd)).OLrzqt(true);
                                arrayList2.addAll(listEZpvd);
                                ((C19577gHn) CollectionsKt___CollectionsKt.AubY(arrayList2)).copydefault(true);
                            }
                        } else {
                            C56443yFo.KWHzl(arrayList2.add(new C19577gHn(abstractC12782ctV.AkhnZx(), str, abstractC12782ctV.AYXKKw(), false, null, 0, false, abstractC12782ctV.getFieldNames(), abstractC12782ctV.DbNXlk(), 4, null, 1144, null)));
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new C19574gHk(4, abstractC12784ctX.AuCTel(), arrayList2));
                }
            }
        }
        this.this$0.copydefault(arrayList);
        return Unit.INSTANCE;
    }
}
