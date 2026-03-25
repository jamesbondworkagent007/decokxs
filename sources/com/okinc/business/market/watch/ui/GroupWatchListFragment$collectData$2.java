package com.okinc.business.market.watch.ui;

import androidx.fragment.app.Fragment;
import com.okinc.market.watch.data.UserGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C27997kLb;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.kKI;
import o.rVN;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListFragment$collectData$2 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends C27997kLb>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ kKI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupWatchListFragment$collectData$2(kKI kki, Continuation<? super GroupWatchListFragment$collectData$2> continuation) {
        super(2, continuation);
        this.this$0 = kki;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupWatchListFragment$collectData$2 groupWatchListFragment$collectData$2 = new GroupWatchListFragment$collectData$2(this.this$0, continuation);
        groupWatchListFragment$collectData$2.L$0 = obj;
        return groupWatchListFragment$collectData$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends C27997kLb> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<C27997kLb>) interfaceC49371unL, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<C27997kLb> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ((GroupWatchListFragment$collectData$2) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
            if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
                if (!((C27997kLb) activity.copydefault()).AEQbTJ()) {
                    this.this$0.AhwBna(true);
                    this.this$0.OLrzqt((List<UserGroup>) yDY.AhwBna());
                } else {
                    this.this$0.DbNXlk();
                    kKI kki = this.this$0;
                    List<UserGroup> listKWHzl = ((C27997kLb) activity.copydefault()).KWHzl();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listKWHzl) {
                        if (!((UserGroup) obj2).isHidden()) {
                            arrayList.add(obj2);
                        }
                    }
                    kki.OLrzqt((List<UserGroup>) arrayList);
                    this.this$0.AhwBna(false);
                }
                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                this.this$0.AhwBna(false);
                this.this$0.uzCIH();
                rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
            } else if (interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription) {
                this.this$0.AhwBna(true);
                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
