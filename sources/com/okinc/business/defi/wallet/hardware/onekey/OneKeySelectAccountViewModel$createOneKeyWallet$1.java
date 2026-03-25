package com.okinc.business.defi.wallet.hardware.onekey;

import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.model.wallet.OneKeyAccountInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C13458dMb;
import o.C13758dXe;
import o.C14140dfo;
import o.C14458dlo;
import o.C14459dlp;
import o.C15423eHu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC14457dln;
import o.yBK;

/* JADX INFO: loaded from: classes5.dex */
public final class OneKeySelectAccountViewModel$createOneKeyWallet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C15423eHu.TaskDescription.ActionBar $accountInfo;
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Function1<AbstractC12782ctV, Unit> $callback;
    final /* synthetic */ FragmentManager $fm;
    final /* synthetic */ int $mode;
    int label;
    final /* synthetic */ C15423eHu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super o.ctV, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneKeySelectAccountViewModel$createOneKeyWallet$1(Activity activity, C15423eHu.TaskDescription.ActionBar actionBar, int i, C15423eHu c15423eHu, FragmentManager fragmentManager, Function1<? super AbstractC12782ctV, Unit> function1, Continuation<? super OneKeySelectAccountViewModel$createOneKeyWallet$1> continuation) {
        super(2, continuation);
        this.$activity = activity;
        this.$accountInfo = actionBar;
        this.$mode = i;
        this.this$0 = c15423eHu;
        this.$fm = fragmentManager;
        this.$callback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneKeySelectAccountViewModel$createOneKeyWallet$1(this.$activity, this.$accountInfo, this.$mode, this.this$0, this.$fm, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OneKeySelectAccountViewModel$createOneKeyWallet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        InterfaceC14457dln c14458dlo;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C13758dXe c13758dXeIsConnected = C13458dMb.EZpvd(this.$activity).isConnected();
            ChainAddress chainAddress = (ChainAddress) CollectionsKt___CollectionsKt.AuCTelauCTel(this.$accountInfo.OLrzqt());
            this.label = 1;
            objEZpvd = c13758dXeIsConnected.EZpvd(chainAddress, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
        }
        if (!((Boolean) objEZpvd).booleanValue()) {
            this.this$0.djBIcL();
        } else {
            if (this.$mode == 1) {
                c14458dlo = new C14459dlp(this.$activity, false, 2, null);
            } else {
                c14458dlo = new C14458dlo(this.$activity);
            }
            C14140dfo instance$default = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null);
            List<ChainAddress> listOLrzqt = this.$accountInfo.OLrzqt();
            int iKWHzl = this.$accountInfo.KWHzl();
            String str = this.this$0.OLrzqt;
            String str2 = this.this$0.valueOf;
            String str3 = this.this$0.AhwBna;
            String str4 = this.this$0.djBIcL;
            yBK.EZpvd(instance$default.OLrzqt((List<ChainAddress>) listOLrzqt, iKWHzl, str, str2, str3, str4, (List<OneKeyAccountInfo>) this.this$0.OLrzqt(), c14458dlo, this.$fm, (Function1<? super AbstractC12782ctV, Unit>) ((512 & 512) != 0 ? null : null), (Function1<? super AbstractC12782ctV, Unit>) this.$callback), this.this$0.call());
        }
        return Unit.INSTANCE;
    }
}
