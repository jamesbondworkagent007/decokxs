package com.okinc.business.defi.biz.core.wallet;

import com.okinc.business.defi.biz.model.ChainAddress;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C10854bwM;
import o.C12827cuN;
import o.C56391yDq;
import o.C56442yFn;
import o.C59449zhJ;
import o.cQM;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletManager$getWalletByAddress$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LinkedHashMap<String, AbstractC12782ctV>>, Object> {
    final /* synthetic */ Set<String> $addressList;
    final /* synthetic */ C10854bwM $chainMeta;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C12827cuN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletManager$getWalletByAddress$3(Set<String> set, C12827cuN c12827cuN, C10854bwM c10854bwM, Continuation<? super WalletManager$getWalletByAddress$3> continuation) {
        super(2, continuation);
        this.$addressList = set;
        this.this$0 = c12827cuN;
        this.$chainMeta = c10854bwM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletManager$getWalletByAddress$3 walletManager$getWalletByAddress$3 = new WalletManager$getWalletByAddress$3(this.$addressList, this.this$0, this.$chainMeta, continuation);
        walletManager$getWalletByAddress$3.L$0 = obj;
        return walletManager$getWalletByAddress$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LinkedHashMap<String, AbstractC12782ctV>> continuation) {
        return ((WalletManager$getWalletByAddress$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.IntRef intRef;
        LinkedHashMap linkedHashMap;
        Set<String> set;
        C10854bwM c10854bwM;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c10854bwM = (C10854bwM) this.L$3;
            set = (Set) this.L$2;
            linkedHashMap = (LinkedHashMap) this.L$1;
            intRef = (Ref.IntRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            intRef = new Ref.IntRef();
            intRef.element = this.$addressList.size();
            linkedHashMap = new LinkedHashMap();
            C12827cuN c12827cuN = this.this$0;
            set = this.$addressList;
            C10854bwM c10854bwM2 = this.$chainMeta;
            cQM cqmAhwBna = c12827cuN.AhwBna();
            this.L$0 = intRef;
            this.L$1 = linkedHashMap;
            this.L$2 = set;
            this.L$3 = c10854bwM2;
            this.label = 1;
            obj = cqmAhwBna.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            c10854bwM = c10854bwM2;
        }
        loop0: for (AbstractC12782ctV abstractC12782ctV : (Iterable) obj) {
            for (ChainAddress chainAddress : abstractC12782ctV.EZpvd()) {
                for (String str : set) {
                    if (chainAddress.getChainId() == c10854bwM.fetchVPNInfo() && C59449zhJ.gEmmrt(chainAddress.getAddress(), str, c10854bwM.finit())) {
                        linkedHashMap.put(str, abstractC12782ctV);
                        int i2 = intRef.element - 1;
                        intRef.element = i2;
                        if (i2 == 0) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }
}
