package com.okinc.business.defi.wallet.imported;

import com.okinc.business.defi.biz.constant.WalletType;
import java.util.ArrayList;
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
import o.C12827cuN;
import o.C18374fhG;
import o.C54909xZv;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.xXW;

/* JADX INFO: loaded from: classes18.dex */
public final class GetSupportedChainsForPrivateKeyUseCase$getExistingChainIds$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Long>>, Object> {
    final /* synthetic */ List<Long> $evmChainIds;
    final /* synthetic */ List<Long> $nonEvmChainIds;
    final /* synthetic */ String $password;
    final /* synthetic */ String $privateKey;
    Object L$0;
    int label;
    final /* synthetic */ C18374fhG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSupportedChainsForPrivateKeyUseCase$getExistingChainIds$2(C18374fhG c18374fhG, String str, List<Long> list, List<Long> list2, String str2, Continuation<? super GetSupportedChainsForPrivateKeyUseCase$getExistingChainIds$2> continuation) {
        super(2, continuation);
        this.this$0 = c18374fhG;
        this.$password = str;
        this.$evmChainIds = list;
        this.$nonEvmChainIds = list2;
        this.$privateKey = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetSupportedChainsForPrivateKeyUseCase$getExistingChainIds$2(this.this$0, this.$password, this.$evmChainIds, this.$nonEvmChainIds, this.$privateKey, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Long>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<Long>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<Long>> continuation) {
        return ((GetSupportedChainsForPrivateKeyUseCase$getExistingChainIds$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAwait;
        Object objAwait2;
        List<AbstractC12782ctV> list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(this.this$0.AYXKKw, false, false, false, 7, null);
            this.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtFetchAllWallets$default, this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAwait2 = obj;
                String str = (String) objAwait2;
                String str2 = this.$password;
                List<Long> list2 = this.$evmChainIds;
                List<Long> list3 = this.$nonEvmChainIds;
                C18374fhG c18374fhG = this.this$0;
                String str3 = this.$privateKey;
                List listOLrzqt = C56402yEa.OLrzqt();
                for (AbstractC12782ctV abstractC12782ctV : list) {
                    xXW xxw = xXW.OLrzqt;
                    Intrinsics.copydefault((Object) str);
                    String strAEQbTJ = xxw.AEQbTJ(str2, str, abstractC12782ctV.RlQdEF(), z);
                    Long l = (Long) CollectionsKt___CollectionsKt.firstOrNull(list2);
                    if (l != null) {
                        long jLongValue = l.longValue();
                        String strKWHzl = c18374fhG.KWHzl(abstractC12782ctV, jLongValue, strAEQbTJ);
                        if (strKWHzl != null && C54909xZv.OLrzqt.copydefault(c18374fhG.KWHzl, strKWHzl, str3) && abstractC12782ctV.AhwBna(C56443yFo.KWHzl(jLongValue))) {
                            listOLrzqt.addAll(list2);
                        }
                    }
                    Iterator<Long> it = list3.iterator();
                    while (it.hasNext()) {
                        long jLongValue2 = it.next().longValue();
                        String strKWHzl2 = c18374fhG.KWHzl(abstractC12782ctV, jLongValue2, strAEQbTJ);
                        if (strKWHzl2 != null) {
                            if (C54909xZv.OLrzqt.copydefault(c18374fhG.KWHzl, strKWHzl2, str3) && abstractC12782ctV.AhwBna(C56443yFo.KWHzl(jLongValue2))) {
                                listOLrzqt.add(C56443yFo.KWHzl(jLongValue2));
                            }
                        }
                    }
                    z = true;
                }
                return C56402yEa.fARcdN(listOLrzqt);
            }
            C56391yDq.AEQbTJ(obj);
            objAwait = obj;
        }
        List list4 = (List) objAwait;
        Intrinsics.copydefault(list4);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list4) {
            AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) obj2;
            if (abstractC12782ctV2.getNewProxyInstance() == WalletType.KeyWallet.ordinal() || abstractC12782ctV2.getNewProxyInstance() == WalletType.HDWallet.ordinal()) {
                arrayList.add(obj2);
            }
        }
        AbstractC58260yxt<String> abstractC58260yxtAhwBna = this.this$0.valueOf.AhwBna(this.$password);
        this.L$0 = arrayList;
        this.label = 2;
        objAwait2 = RxAwaitKt.await(abstractC58260yxtAhwBna, this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        list = arrayList;
        String str4 = (String) objAwait2;
        String str22 = this.$password;
        List<Long> list22 = this.$evmChainIds;
        List<Long> list32 = this.$nonEvmChainIds;
        C18374fhG c18374fhG2 = this.this$0;
        String str32 = this.$privateKey;
        List listOLrzqt2 = C56402yEa.OLrzqt();
        while (r1.hasNext()) {
        }
        return C56402yEa.fARcdN(listOLrzqt2);
    }
}
