package com.okinc.oklive.app.ui.list.fragment;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC44569sUu;
import o.C44573sUy;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class LivestreamListFragment$observeFloatingWindow$2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ C44573sUy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamListFragment$observeFloatingWindow$2(C44573sUy c44573sUy, Continuation<? super LivestreamListFragment$observeFloatingWindow$2> continuation) {
        super(2, continuation);
        this.this$0 = c44573sUy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LivestreamListFragment$observeFloatingWindow$2 livestreamListFragment$observeFloatingWindow$2 = new LivestreamListFragment$observeFloatingWindow$2(this.this$0, continuation);
        livestreamListFragment$observeFloatingWindow$2.Z$0 = ((Boolean) obj).booleanValue();
        return livestreamListFragment$observeFloatingWindow$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((LivestreamListFragment$observeFloatingWindow$2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0;
            List<AbstractC44569sUu> currentList = this.this$0.OLrzqt().getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "");
            if (!(currentList instanceof Collection) || !currentList.isEmpty()) {
                Iterator<T> it = currentList.iterator();
                while (it.hasNext()) {
                    if (((AbstractC44569sUu) it.next()) instanceof AbstractC44569sUu.Activity) {
                        this.this$0.OLrzqt().EZpvd(z);
                        if (z) {
                            this.this$0.AhwBna();
                        }
                        this.this$0.copydefault();
                        if (!z) {
                            this.this$0.gEmmrt();
                        }
                        return Unit.INSTANCE;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
