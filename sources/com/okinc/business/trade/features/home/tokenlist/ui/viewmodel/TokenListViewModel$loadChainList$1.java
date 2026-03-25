package com.okinc.business.trade.features.home.tokenlist.ui.viewmodel;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.trade.features.home.domain.model.ChainBizType;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C29709kyk;
import o.C30384laD;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28377kZd;
import o.kUH;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenListViewModel$loadChainList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $selectedChainId;
    int label;
    final /* synthetic */ C30384laD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenListViewModel$loadChainList$1(C30384laD c30384laD, String str, Continuation<? super TokenListViewModel$loadChainList$1> continuation) {
        super(2, continuation);
        this.this$0 = c30384laD;
        this.$selectedChainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenListViewModel$loadChainList$1(this.this$0, this.$selectedChainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenListViewModel$loadChainList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot abstractC43419rot;
        Object next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C29709kyk c29709kyk = this.this$0.AYXKKw;
            this.label = 1;
            if (c29709kyk.AEQbTJ(this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = (AbstractC43419rot) obj;
                if (!abstractC43419rot.OLrzqt()) {
                    this.this$0.KWHzl.setValue(InterfaceC28377kZd.StateListAnimator.AEQbTJ);
                    return Unit.INSTANCE;
                }
                C30384laD c30384laD = this.this$0;
                List listAhwBna = (List) abstractC43419rot.copydefault();
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                List<DefiChainInfo> listAEQbTJ = c30384laD.AEQbTJ((List<DefiChainInfo>) listAhwBna);
                if (listAEQbTJ.isEmpty()) {
                    this.this$0.KWHzl.setValue(InterfaceC28377kZd.StateListAnimator.AEQbTJ);
                    return Unit.INSTANCE;
                }
                if (!this.this$0.AEQbTJ() || listAEQbTJ.size() == 1) {
                    String str = this.$selectedChainId;
                    Iterator it = listAEQbTJ.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.EZpvd((Object) ((DefiChainInfo) next).getChainId(), (Object) str)) {
                            break;
                        }
                    }
                    DefiChainInfo defiChainInfo = (DefiChainInfo) next;
                    if (defiChainInfo != null) {
                        this.this$0.KWHzl.setValue(new InterfaceC28377kZd.TaskDescription(defiChainInfo));
                    }
                    return Unit.INSTANCE;
                }
                C30384laD c30384laD2 = this.this$0;
                String str2 = this.$selectedChainId;
                this.label = 3;
                if (c30384laD2.KWHzl(listAEQbTJ, str2, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        kUH kuh = this.this$0.djBIcL;
        C30384laD c30384laD3 = this.this$0;
        ChainBizType chainBizTypeEZpvd = c30384laD3.EZpvd(c30384laD3.OLrzqt());
        this.label = 2;
        obj = kuh.EZpvd(chainBizTypeEZpvd, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        abstractC43419rot = (AbstractC43419rot) obj;
        if (!abstractC43419rot.OLrzqt()) {
        }
    }
}
