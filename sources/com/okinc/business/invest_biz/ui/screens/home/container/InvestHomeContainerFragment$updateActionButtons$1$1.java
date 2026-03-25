package com.okinc.business.invest_biz.ui.screens.home.container;

import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC58260yxt;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9738bbJ;
import o.InterfaceC9852bdR;
import o.iHC;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestHomeContainerFragment$updateActionButtons$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ iHC $this_with;
    int label;
    final /* synthetic */ InvestHomeContainerFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestHomeContainerFragment$updateActionButtons$1$1(InvestHomeContainerFragment investHomeContainerFragment, iHC ihc, Continuation<? super InvestHomeContainerFragment$updateActionButtons$1$1> continuation) {
        super(2, continuation);
        this.this$0 = investHomeContainerFragment;
        this.$this_with = ihc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestHomeContainerFragment$updateActionButtons$1$1(this.this$0, this.$this_with, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestHomeContainerFragment$updateActionButtons$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.screens.home.container.InvestHomeContainerFragment$updateActionButtons$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ iHC $this_with;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(iHC ihc, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_with = ihc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_with, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().KWHzl();
                    this.label = 1;
                    obj = RxAwaitKt.await(abstractC58260yxtKWHzl, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC9738bbJ) obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            iHC ihc = this.$this_with;
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) objM7377constructorimpl;
                ImageView imageView = ihc.KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility((interfaceC9738bbJ.zsXlph() || interfaceC9738bbJ.QfsBiF()) ? 8 : 0);
            }
            iHC ihc2 = this.$this_with;
            if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                ImageView imageView2 = ihc2.KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setVisibility(8);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_with, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == objCopydefault) {
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
