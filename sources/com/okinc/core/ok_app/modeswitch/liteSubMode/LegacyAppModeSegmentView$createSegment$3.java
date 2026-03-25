package com.okinc.core.ok_app.modeswitch.liteSubMode;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.tabs.TabLayout;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33240msi;
import o.AbstractC33249msr;
import o.C33301mtq;
import o.C33377mvM;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class LegacyAppModeSegmentView$createSegment$3 extends SuspendLambda implements yHO<CoroutineScope, Pair<? extends AbstractC33249msr, ? extends AbstractC33240msi>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<TabLayout.Tab> $advancedTabRef;
    final /* synthetic */ C33301mtq $binding;
    final /* synthetic */ Context $context;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ Function2<Integer, Integer, Unit> $onValueChange;
    final /* synthetic */ Ref.ObjectRef<TabLayout.Tab> $payTabRef;
    final /* synthetic */ Ref.ObjectRef<TabLayout.Tab> $selectedTab;
    final /* synthetic */ Ref.ObjectRef<TabLayout.Tab> $simpleTabRef;
    final /* synthetic */ String $source;
    final /* synthetic */ Ref.ObjectRef<TabLayout.Tab> $tradeTab;
    final /* synthetic */ Ref.ObjectRef<TabLayout.Tab> $walletTab;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LegacyAppModeSegmentView$createSegment$3(C33301mtq c33301mtq, Ref.ObjectRef<TabLayout.Tab> objectRef, Ref.ObjectRef<TabLayout.Tab> objectRef2, Ref.ObjectRef<TabLayout.Tab> objectRef3, String str, Ref.ObjectRef<TabLayout.Tab> objectRef4, Ref.ObjectRef<TabLayout.Tab> objectRef5, Ref.ObjectRef<TabLayout.Tab> objectRef6, LifecycleOwner lifecycleOwner, Context context, Function2<? super Integer, ? super Integer, Unit> function2, Continuation<? super LegacyAppModeSegmentView$createSegment$3> continuation) {
        super(3, continuation);
        this.$binding = c33301mtq;
        this.$simpleTabRef = objectRef;
        this.$advancedTabRef = objectRef2;
        this.$payTabRef = objectRef3;
        this.$source = str;
        this.$walletTab = objectRef4;
        this.$tradeTab = objectRef5;
        this.$selectedTab = objectRef6;
        this.$lifecycleOwner = lifecycleOwner;
        this.$context = context;
        this.$onValueChange = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, Pair<? extends AbstractC33249msr, ? extends AbstractC33240msi> pair, Continuation<? super Unit> continuation) {
        return new LegacyAppModeSegmentView$createSegment$3(this.$binding, this.$simpleTabRef, this.$advancedTabRef, this.$payTabRef, this.$source, this.$walletTab, this.$tradeTab, this.$selectedTab, this.$lifecycleOwner, this.$context, this.$onValueChange, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C33377mvM.KWHzl(this.$binding, this.$simpleTabRef, this.$advancedTabRef, this.$payTabRef, this.$source, this.$walletTab, this.$tradeTab, this.$selectedTab, this.$lifecycleOwner, this.$context, this.$onValueChange);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
