package com.okinc.okmarket.home.ui.fragment;

import androidx.fragment.app.Fragment;
import com.okinc.okmarket.home.ui.viewmodel.CountingBannerViewModel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C46614taW;
import o.C46684tbn;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.pUU;
import o.rVN;

/* JADX INFO: loaded from: classes16.dex */
public final class MarketNewListingBannerFragment$setListener$1 extends SuspendLambda implements Function2<CountingBannerViewModel.Activity, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C46614taW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketNewListingBannerFragment$setListener$1(C46614taW c46614taW, Continuation<? super MarketNewListingBannerFragment$setListener$1> continuation) {
        super(2, continuation);
        this.this$0 = c46614taW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketNewListingBannerFragment$setListener$1 marketNewListingBannerFragment$setListener$1 = new MarketNewListingBannerFragment$setListener$1(this.this$0, continuation);
        marketNewListingBannerFragment$setListener$1.L$0 = obj;
        return marketNewListingBannerFragment$setListener$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CountingBannerViewModel.Activity activity, Continuation<? super Unit> continuation) {
        return ((MarketNewListingBannerFragment$setListener$1) create(activity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            CountingBannerViewModel.Activity activity = (CountingBannerViewModel.Activity) this.L$0;
            InterfaceC49371unL<List<C46684tbn>> interfaceC49371unLCopydefault = activity.copydefault();
            if (interfaceC49371unLCopydefault instanceof InterfaceC49371unL.TaskDescription) {
                this.this$0.DbNXlk();
                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            } else if (interfaceC49371unLCopydefault instanceof InterfaceC49371unL.Application) {
                this.this$0.DbNXlk();
                rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
            } else if (!(interfaceC49371unLCopydefault instanceof InterfaceC49371unL.StateListAnimator) && !(interfaceC49371unLCopydefault instanceof InterfaceC49371unL.ActionBar)) {
                if (!(interfaceC49371unLCopydefault instanceof InterfaceC49371unL.Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                C46614taW c46614taW = this.this$0;
                try {
                    Result.Application application = Result.Companion;
                    InterfaceC49371unL<List<C46684tbn>> interfaceC49371unLCopydefault2 = activity.copydefault();
                    Intrinsics.copydefault(interfaceC49371unLCopydefault2, "");
                    List list = (List) ((InterfaceC49371unL.Activity) interfaceC49371unLCopydefault2).copydefault();
                    if (!(!list.isEmpty())) {
                        c46614taW.DbNXlk();
                    } else {
                        pUU.KWHzl(c46614taW.getTAG(), "Showing card with " + list.size() + " banners");
                        c46614taW.isConnected();
                        c46614taW.AEQbTJ((List<C46684tbn>) list);
                    }
                    rVN.reportFullyDrawn$default((Fragment) c46614taW, true, (String) null, 2, (Object) null);
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                C46614taW c46614taW2 = this.this$0;
                Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ(c46614taW2.getTAG(), "Error updating banners", thM7380exceptionOrNullimpl);
                }
                Result.m7376boximpl(objM7377constructorimpl);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
