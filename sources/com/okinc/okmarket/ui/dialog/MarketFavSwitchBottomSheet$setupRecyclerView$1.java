package com.okinc.okmarket.ui.dialog;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okmarket.ui.dialog.MarketFavSwitchBottomSheet$setupRecyclerView$1;
import com.okinc.okmarket.ui.market.data.UserGroupVo;
import com.okinc.okmarket.ui.market.quote.WrapContentLinearLayoutManager;
import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C27807kEa;
import o.C46662tbR;
import o.C46665tbU;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27808kEb;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketFavSwitchBottomSheet$setupRecyclerView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RecyclerView $recyclerView;
    Object L$0;
    int label;
    final /* synthetic */ C46665tbU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavSwitchBottomSheet$setupRecyclerView$1(RecyclerView recyclerView, C46665tbU c46665tbU, Continuation<? super MarketFavSwitchBottomSheet$setupRecyclerView$1> continuation) {
        super(2, continuation);
        this.$recyclerView = recyclerView;
        this.this$0 = c46665tbU;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketFavSwitchBottomSheet$setupRecyclerView$1(this.$recyclerView, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketFavSwitchBottomSheet$setupRecyclerView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C46665tbU c46665tbU;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.$recyclerView.setLayoutManager(new WrapContentLinearLayoutManager(this.this$0.getContext(), 1, false));
            C46665tbU c46665tbU2 = this.this$0;
            MarketHomeV2ViewModel marketHomeV2ViewModelCopydefault = c46665tbU2.copydefault();
            this.L$0 = c46665tbU2;
            this.label = 1;
            Object objAEQbTJ = marketHomeV2ViewModelCopydefault.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c46665tbU = c46665tbU2;
            obj = objAEQbTJ;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c46665tbU = (C46665tbU) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        final C46665tbU c46665tbU3 = this.this$0;
        c46665tbU.copydefault = new C46662tbR((String) obj, new Function2() { // from class: o.tbZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                return MarketFavSwitchBottomSheet$setupRecyclerView$1.invokeSuspend$lambda$0(c46665tbU3, ((java.lang.Integer) obj2).intValue(), (UserGroupVo) obj3);
            }
        });
        this.$recyclerView.setAdapter(this.this$0.copydefault);
        this.this$0.EZpvd().attachToRecyclerView(this.$recyclerView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C46665tbU c46665tbU, int i, UserGroupVo userGroupVo) {
        InterfaceC27808kEb interfaceC27808kEbEZpvd = C27807kEa.EZpvd(c46665tbU);
        if (interfaceC27808kEbEZpvd != null) {
            interfaceC27808kEbEZpvd.AEQbTJ(userGroupVo.getUserGroup().getGroupName());
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c46665tbU), null, null, new MarketFavSwitchBottomSheet$setupRecyclerView$1$1$1(c46665tbU, userGroupVo, null), 3, null);
        return Unit.INSTANCE;
    }
}
