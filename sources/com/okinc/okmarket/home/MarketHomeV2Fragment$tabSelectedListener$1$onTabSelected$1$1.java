package com.okinc.okmarket.home;

import android.view.View;
import android.widget.ImageView;
import com.google.android.material.tabs.TabLayout;
import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C55243xgK;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketHomeV2Fragment$tabSelectedListener$1$onTabSelected$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TabLayout.Tab $it;
    Object L$0;
    int label;
    final /* synthetic */ MarketHomeV2Fragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeV2Fragment$tabSelectedListener$1$onTabSelected$1$1(TabLayout.Tab tab, MarketHomeV2Fragment marketHomeV2Fragment, Continuation<? super MarketHomeV2Fragment$tabSelectedListener$1$onTabSelected$1$1> continuation) {
        super(2, continuation);
        this.$it = tab;
        this.this$0 = marketHomeV2Fragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeV2Fragment$tabSelectedListener$1$onTabSelected$1$1(this.$it, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeV2Fragment$tabSelectedListener$1$onTabSelected$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        View view;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ImageView imageViewEZpvd = C55243xgK.EZpvd(this.$it);
            if (imageViewEZpvd != null) {
                MarketHomeV2ViewModel marketHomeV2ViewModelAubY = this.this$0.AubY();
                this.L$0 = imageViewEZpvd;
                this.label = 1;
                Object objEZpvd = marketHomeV2ViewModelAubY.EZpvd(this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                view = imageViewEZpvd;
                obj = objEZpvd;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        view = (View) this.L$0;
        C56391yDq.AEQbTJ(obj);
        List list = (List) obj;
        view.setVisibility((list == null || !(list.isEmpty() ^ true)) ? 8 : 0);
        return Unit.INSTANCE;
    }
}
