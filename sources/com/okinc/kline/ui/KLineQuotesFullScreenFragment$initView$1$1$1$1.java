package com.okinc.kline.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.okinc.kline.ui.KLineQuotesFullScreenFragment$initView$1$1$1$1;
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
import o.ViewOnClickListenerC38659pdc;
import o.oMO;

/* JADX INFO: loaded from: classes8.dex */
public final class KLineQuotesFullScreenFragment$initView$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $it;
    int label;
    final /* synthetic */ ViewOnClickListenerC38659pdc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineQuotesFullScreenFragment$initView$1$1$1$1(Context context, ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, Continuation<? super KLineQuotesFullScreenFragment$initView$1$1$1$1> continuation) {
        super(2, continuation);
        this.$it = context;
        this.this$0 = viewOnClickListenerC38659pdc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineQuotesFullScreenFragment$initView$1$1$1$1(this.$it, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KLineQuotesFullScreenFragment$initView$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FrameLayout frameLayout;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49493upb interfaceC49493upb = (InterfaceC49493upb) C43251rlk.copydefault(InterfaceC49493upb.class);
            Context context = this.$it;
            String strORxRYg = this.this$0.ORxRYg();
            if (strORxRYg == null) {
                strORxRYg = "";
            }
            final ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc = this.this$0;
            Function1<? super Fragment, Unit> function1 = new Function1() { // from class: o.pem
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return KLineQuotesFullScreenFragment$initView$1$1$1$1.invokeSuspend$lambda$0(viewOnClickListenerC38659pdc, (androidx.fragment.app.Fragment) obj2);
                }
            };
            this.label = 1;
            obj = interfaceC49493upb.OLrzqt(context, strORxRYg, function1, this);
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
            oMO omo = this.this$0.QVsKAR;
            if (omo != null && (frameLayout = omo.AuCTelauCTel) != null) {
                frameLayout.setVisibility(0);
            }
            this.this$0.getParentFragmentManager().beginTransaction().add(C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1, fragment).commitAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc, Fragment fragment) {
        FrameLayout frameLayout;
        oMO omo = viewOnClickListenerC38659pdc.QVsKAR;
        if (omo != null && (frameLayout = omo.AuCTelauCTel) != null) {
            frameLayout.setVisibility(8);
        }
        if (viewOnClickListenerC38659pdc.isAdded()) {
            viewOnClickListenerC38659pdc.getParentFragmentManager().beginTransaction().remove(fragment).commitAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }
}
