package com.okinc.kline.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.okinc.kline.ui.MarketKlinePortraitFragment$initView$7$1$1$2$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35964oKf;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49493upb;
import o.ViewOnClickListenerC38857phO;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketKlinePortraitFragment$initView$7$1$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $it;
    int label;
    final /* synthetic */ ViewOnClickListenerC38857phO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketKlinePortraitFragment$initView$7$1$1$2$1(Context context, ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, Continuation<? super MarketKlinePortraitFragment$initView$7$1$1$2$1> continuation) {
        super(2, continuation);
        this.$it = context;
        this.this$0 = viewOnClickListenerC38857phO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketKlinePortraitFragment$initView$7$1$1$2$1(this.$it, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketKlinePortraitFragment$initView$7$1$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49493upb interfaceC49493upb = (InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class);
            Context context = this.$it;
            String strFIwbmz = this.this$0.fIwbmz();
            if (strFIwbmz == null) {
                strFIwbmz = "";
            }
            final ViewOnClickListenerC38857phO viewOnClickListenerC38857phO = this.this$0;
            Function1<? super Fragment, Unit> function1 = new Function1() { // from class: o.piJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return MarketKlinePortraitFragment$initView$7$1$1$2$1.invokeSuspend$lambda$0(viewOnClickListenerC38857phO, (androidx.fragment.app.Fragment) obj2);
                }
            };
            this.label = 1;
            obj = interfaceC49493upb.OLrzqt(context, strFIwbmz, function1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Fragment fragment = (Fragment) obj;
        if (fragment != null) {
            FrameLayout frameLayout = this.this$0.values;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            this.this$0.getParentFragmentManager().beginTransaction().add(C35964oKf.StateListAnimator.postOrRun, fragment).commitAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, Fragment fragment) {
        FrameLayout frameLayout = viewOnClickListenerC38857phO.values;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        if (viewOnClickListenerC38857phO.isAdded()) {
            viewOnClickListenerC38857phO.getParentFragmentManager().beginTransaction().remove(fragment).commitAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }
}
