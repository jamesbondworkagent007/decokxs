package com.okinc.core.ok_app.modeswitch.liteSubMode;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class LegacyAppModeSegmentView$setTabSelectionInterceptor$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $i;
    final /* synthetic */ Function2<Integer, Continuation<? super Boolean>, Object> $shouldAllowSelection;
    final /* synthetic */ TabLayout $this_setTabSelectionInterceptor;
    final /* synthetic */ View $view;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LegacyAppModeSegmentView$setTabSelectionInterceptor$1$1(TabLayout tabLayout, int i, Function2<? super Integer, ? super Continuation<? super Boolean>, ? extends Object> function2, View view, Continuation<? super LegacyAppModeSegmentView$setTabSelectionInterceptor$1$1> continuation) {
        super(2, continuation);
        this.$this_setTabSelectionInterceptor = tabLayout;
        this.$i = i;
        this.$shouldAllowSelection = function2;
        this.$view = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LegacyAppModeSegmentView$setTabSelectionInterceptor$1$1(this.$this_setTabSelectionInterceptor, this.$i, this.$shouldAllowSelection, this.$view, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LegacyAppModeSegmentView$setTabSelectionInterceptor$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            int selectedTabPosition = this.$this_setTabSelectionInterceptor.getSelectedTabPosition();
            int i2 = this.$i;
            if (selectedTabPosition == i2) {
                return Unit.INSTANCE;
            }
            Function2<Integer, Continuation<? super Boolean>, Object> function2 = this.$shouldAllowSelection;
            Integer numAEQbTJ = C56443yFo.AEQbTJ(i2);
            this.label = 1;
            obj = function2.invoke(numAEQbTJ, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            TabLayout.Tab tabAt = this.$this_setTabSelectionInterceptor.getTabAt(this.$i);
            if (tabAt != null) {
                this.$this_setTabSelectionInterceptor.selectTab(tabAt);
            }
            this.$view.performClick();
        }
        return Unit.INSTANCE;
    }
}
