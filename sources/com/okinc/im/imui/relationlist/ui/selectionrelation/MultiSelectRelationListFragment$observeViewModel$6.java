package com.okinc.im.imui.relationlist.ui.selectionrelation;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C37391osu;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiSelectRelationListFragment$observeViewModel$6 extends SuspendLambda implements yHO<CoroutineScope, Set<? extends String>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C37391osu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiSelectRelationListFragment$observeViewModel$6(C37391osu c37391osu, Continuation<? super MultiSelectRelationListFragment$observeViewModel$6> continuation) {
        super(3, continuation);
        this.this$0 = c37391osu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Set<? extends String> set, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Set<String>) set, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Set<String> set, Continuation<? super Unit> continuation) {
        MultiSelectRelationListFragment$observeViewModel$6 multiSelectRelationListFragment$observeViewModel$6 = new MultiSelectRelationListFragment$observeViewModel$6(this.this$0, continuation);
        multiSelectRelationListFragment$observeViewModel$6.L$0 = set;
        return multiSelectRelationListFragment$observeViewModel$6.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            FragmentKt.setFragmentResult(this.this$0, "REQUEST_KEY_SELECTION_LIST_CHANGED", BundleKt.bundleOf(C56390yDp.OLrzqt("RESULT_KEY_LIST", new ArrayList((Set) this.L$0))));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
