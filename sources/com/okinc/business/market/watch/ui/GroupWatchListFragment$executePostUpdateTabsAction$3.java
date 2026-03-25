package com.okinc.business.market.watch.ui;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.market.watch.ui.viewmodel.GroupWatchListViewModel;
import com.okinc.market.watch.data.UserGroup;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C27996kLa;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.jSE;
import o.kKI;
import o.pUU;
import o.qZH;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListFragment$executePostUpdateTabsAction$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<UserGroup> $arrayFilter;
    int label;
    final /* synthetic */ kKI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupWatchListFragment$executePostUpdateTabsAction$3(kKI kki, List<UserGroup> list, Continuation<? super GroupWatchListFragment$executePostUpdateTabsAction$3> continuation) {
        super(2, continuation);
        this.this$0 = kki;
        this.$arrayFilter = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupWatchListFragment$executePostUpdateTabsAction$3(this.this$0, this.$arrayFilter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupWatchListFragment$executePostUpdateTabsAction$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.watch.ui.GroupWatchListFragment$executePostUpdateTabsAction$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C27996kLa, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<UserGroup> $arrayFilter;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ kKI this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kKI kki, List<UserGroup> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = kki;
            this.$arrayFilter = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$arrayFilter, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C27996kLa c27996kLa, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(c27996kLa, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            kKI kki;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C27996kLa c27996kLa = (C27996kLa) this.L$0;
                kKI kki2 = this.this$0;
                List<UserGroup> list = this.$arrayFilter;
                Result.Application application2 = Result.Companion;
                pUU.KWHzl(kki2.getTAG(), "update tab select pendingTab: " + c27996kLa.OLrzqt());
                if (C33129mqd.OLrzqt((CharSequence) c27996kLa.OLrzqt())) {
                    Iterator<UserGroup> it = list.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        if (Intrinsics.EZpvd((Object) it.next().getGroupName(), (Object) c27996kLa.OLrzqt())) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 >= 0) {
                        kki2.OLrzqt(i2, true);
                        kki2.AkhnZx().AEQbTJ("");
                        this.L$0 = kki2;
                        this.label = 1;
                        if (DelayKt.delay(150L, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        kki = kki2;
                    }
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kki = (kKI) this.L$0;
            C56391yDq.AEQbTJ(obj);
            FragmentActivity activity = kki.getActivity();
            if (activity != null) {
                jSE.showTip$default(jSE.EZpvd, activity, qZH.PendingIntent.zEHIKV, null, 0, 12, null);
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kKI kki = this.this$0;
            GroupWatchListViewModel groupWatchListViewModelAkhnZx = kki.AkhnZx();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$arrayFilter, null);
            this.label = 1;
            if (kki.OLrzqt(groupWatchListViewModelAkhnZx, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
