package com.okinc.business.defi.biz.core.transaction.sign.evm;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.api.model.tx.signdata.EVM5792ContractSignData;
import com.okinc.business.defi.biz.net.bean.EIP7702ChainStatusResp;
import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702ChainStatus;
import com.okinc.network.okg.response.OKServerException;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.AbstractC43419rot;
import o.C10857bwP;
import o.C13934dbu;
import o.C15290eCw;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes4.dex */
public final class OKWEVMSignEIP5792Helper$Companion$checkNeedUpgrade7702$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ Function0<Unit> $errorCallback;
    final /* synthetic */ long $generalChainId;
    final /* synthetic */ EVM5792ContractSignData $signData;
    final /* synthetic */ Function0<Unit> $successCallback;
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKWEVMSignEIP5792Helper$Companion$checkNeedUpgrade7702$1(AbstractC12782ctV abstractC12782ctV, Function0<Unit> function0, Function0<Unit> function02, FragmentActivity fragmentActivity, EVM5792ContractSignData eVM5792ContractSignData, long j, Continuation<? super OKWEVMSignEIP5792Helper$Companion$checkNeedUpgrade7702$1> continuation) {
        super(2, continuation);
        this.$wallet = abstractC12782ctV;
        this.$errorCallback = function0;
        this.$successCallback = function02;
        this.$activity = fragmentActivity;
        this.$signData = eVM5792ContractSignData;
        this.$generalChainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKWEVMSignEIP5792Helper$Companion$checkNeedUpgrade7702$1(this.$wallet, this.$errorCallback, this.$successCallback, this.$activity, this.$signData, this.$generalChainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKWEVMSignEIP5792Helper$Companion$checkNeedUpgrade7702$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C13934dbu c13934dbu = new C13934dbu();
            String strDbNXlk = this.$wallet.DbNXlk();
            this.label = 1;
            obj = c13934dbu.gEmmrt(strDbNXlk, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        boolean z = abstractC43419rot instanceof AbstractC43419rot.ActionBar;
        if (z) {
            C10857bwP.copydefault("OKWEVMSignEIP5792Helper", (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
        }
        long j = this.$generalChainId;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            Iterator<T> it = ((EIP7702ChainStatusResp) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).getChainList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((EIP7702ChainStatusResp.ChainStatusItem) next).getChainIndex() == j) {
                    break;
                }
            }
            actionBar = new AbstractC43419rot.StateListAnimator((EIP7702ChainStatusResp.ChainStatusItem) next);
        } else {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            actionBar = new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
        }
        EIP7702ChainStatusResp.ChainStatusItem chainStatusItem = (EIP7702ChainStatusResp.ChainStatusItem) actionBar.copydefault();
        if (chainStatusItem == null) {
            this.$errorCallback.invoke();
            return Unit.INSTANCE;
        }
        if (EIP7702ChainStatus.Companion.copydefault(C56443yFo.AEQbTJ(chainStatusItem.getStatus())) == EIP7702ChainStatus.UpgradedOKX) {
            this.$successCallback.invoke();
        } else if (!this.$activity.getSupportFragmentManager().isStateSaved()) {
            C15290eCw c15290eCw = new C15290eCw();
            FragmentManager supportFragmentManager = this.$activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c15290eCw.EZpvd(supportFragmentManager, this.$wallet, this.$signData, chainStatusItem, this.$successCallback, this.$errorCallback);
        } else {
            this.$errorCallback.invoke();
        }
        return Unit.INSTANCE;
    }
}
