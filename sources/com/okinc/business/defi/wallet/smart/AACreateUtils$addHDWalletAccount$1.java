package com.okinc.business.defi.wallet.smart;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.wallet.smart.AACreateUtils$addHDWalletAccount$1;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C13754dXa;
import o.C14469dlz;
import o.C33069mpW;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.DialogC55112xdm;

/* JADX INFO: loaded from: classes5.dex */
public final class AACreateUtils$addHDWalletAccount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ Function1<AbstractC12782ctV, Unit> $callback;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ AbstractC12784ctX $rootWallet;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.ctV, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AACreateUtils$addHDWalletAccount$1(FragmentManager fragmentManager, FragmentActivity fragmentActivity, AbstractC12784ctX abstractC12784ctX, Function1<? super AbstractC12782ctV, Unit> function1, Continuation<? super AACreateUtils$addHDWalletAccount$1> continuation) {
        super(2, continuation);
        this.$fragmentManager = fragmentManager;
        this.$activity = fragmentActivity;
        this.$rootWallet = abstractC12784ctX;
        this.$callback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AACreateUtils$addHDWalletAccount$1(this.$fragmentManager, this.$activity, this.$rootWallet, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AACreateUtils$addHDWalletAccount$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                AbstractC58260yxt<Integer> abstractC58260yxtAkhnZx = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AkhnZx();
                this.label = 1;
                obj = RxAwaitKt.await(abstractC58260yxtAkhnZx, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((Integer) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Integer num = (Integer) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        if (num != null && num.intValue() > 100) {
            C55326xho.toast$default(C33069mpW.copydefault(C13754dXa.FragmentManager.MediaBrowserCompatItemCallback, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, "100"))), (Drawable) null, 0, C56443yFo.AEQbTJ(17), 0, 0, 27, (Object) null);
            return Unit.INSTANCE;
        }
        FragmentManager fragmentManager = this.$fragmentManager;
        final FragmentActivity fragmentActivity = this.$activity;
        final AbstractC12784ctX abstractC12784ctX = this.$rootWallet;
        final Function1<AbstractC12782ctV, Unit> function1 = this.$callback;
        new C14469dlz(fragmentManager, fragmentActivity, null, null, new Function1() { // from class: o.fPj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return AACreateUtils$addHDWalletAccount$1.invokeSuspend$lambda$1(fragmentActivity, abstractC12784ctX, function1, (java.lang.String) obj2);
            }
        }, null, null, null, 232, null).EZpvd();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(FragmentActivity fragmentActivity, AbstractC12784ctX abstractC12784ctX, Function1 function1, String str) {
        DialogC55112xdm dialogC55112xdm = new DialogC55112xdm(fragmentActivity, C13754dXa.LoaderManager.isConnected);
        dialogC55112xdm.show();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new AACreateUtils$addHDWalletAccount$1$1$1(fragmentActivity, abstractC12784ctX, str, dialogC55112xdm, function1, null), 3, null);
        return Unit.INSTANCE;
    }
}
