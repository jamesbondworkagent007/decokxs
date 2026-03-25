package com.okinc.business.defi.biz.core.wallet;

import com.okinc.business.defi.biz.model.ChainAddress;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C11283cIm;
import o.C12827cuN;
import o.C13058cyg;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletManager$updateDefaultAddress$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Long>>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ AbstractC12782ctV $it;
    final /* synthetic */ String $walletId;
    int label;
    final /* synthetic */ C12827cuN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletManager$updateDefaultAddress$1$1(C12827cuN c12827cuN, String str, AbstractC12782ctV abstractC12782ctV, long j, Continuation<? super WalletManager$updateDefaultAddress$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c12827cuN;
        this.$walletId = str;
        this.$it = abstractC12782ctV;
        this.$chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletManager$updateDefaultAddress$1$1(this.this$0, this.$walletId, this.$it, this.$chainId, continuation);
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
        return ((WalletManager$updateDefaultAddress$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return obj;
        }
        C56391yDq.AEQbTJ(obj);
        C13058cyg c13058cyg = this.this$0.fetchVPNInfo;
        String str = this.$walletId;
        ArrayList<ChainAddress> arrayListGGvvIC = this.$it.gGvvIC();
        long j = this.$chainId;
        ArrayList<ChainAddress> arrayList = new ArrayList();
        for (Object obj2 : arrayListGGvvIC) {
            if (((ChainAddress) obj2).getCoinId() == j) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (ChainAddress chainAddress : arrayList) {
            arrayList2.add(new C11283cIm(chainAddress.getAddressType(), chainAddress.getChainId(), "", null, null, 24, null));
        }
        List<C11283cIm> listAhwBna = yDY.AhwBna();
        this.label = 1;
        Object objCopydefault2 = c13058cyg.copydefault(str, arrayList2, listAhwBna, this);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }
}
