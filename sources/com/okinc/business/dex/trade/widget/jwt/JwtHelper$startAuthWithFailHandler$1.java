package com.okinc.business.dex.trade.widget.jwt;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C55328xhq;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9738bbJ;
import o.InterfaceC9755bba;
import o.InterfaceC9858bdX;

/* JADX INFO: loaded from: classes5.dex */
public final class JwtHelper$startAuthWithFailHandler$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ Function0<Unit> $onFailListener;
    final /* synthetic */ Function0<Unit> $onSuccessListener;
    final /* synthetic */ InterfaceC9738bbJ $wallet;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JwtHelper$startAuthWithFailHandler$1(FragmentActivity fragmentActivity, InterfaceC9738bbJ interfaceC9738bbJ, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super JwtHelper$startAuthWithFailHandler$1> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$wallet = interfaceC9738bbJ;
        this.$onSuccessListener = function0;
        this.$onFailListener = function02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new JwtHelper$startAuthWithFailHandler$1(this.$activity, this.$wallet, this.$onSuccessListener, this.$onFailListener, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((JwtHelper$startAuthWithFailHandler$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC9858bdX interfaceC9858bdX = (InterfaceC9858bdX) C43251rlk.copydefault(InterfaceC9858bdX.class);
            FragmentManager supportFragmentManager = this.$activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            String strDbNXlk = this.$wallet.DbNXlk();
            this.label = 1;
            obj = interfaceC9858bdX.KWHzl(supportFragmentManager, strDbNXlk, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC9755bba interfaceC9755bba = (InterfaceC9755bba) obj;
        if (interfaceC9755bba instanceof InterfaceC9755bba.TaskDescription) {
            this.$onSuccessListener.invoke();
        } else if (interfaceC9755bba instanceof InterfaceC9755bba.Application) {
            this.$onFailListener.invoke();
        } else {
            if (!(interfaceC9755bba instanceof InterfaceC9755bba.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            C55328xhq.show$default(C55328xhq.OLrzqt, ((InterfaceC9755bba.ActionBar) interfaceC9755bba).copydefault(), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
            this.$onFailListener.invoke();
        }
        return Unit.INSTANCE;
    }
}
