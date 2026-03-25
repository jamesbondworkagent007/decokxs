package com.okinc.core.ok_app.modeswitch.liteSubMode;

import com.google.android.material.tabs.TabLayout;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33240msi;
import o.C33301mtq;
import o.C33377mvM;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class LegacyAppModeSegmentView$createSegment$1 extends SuspendLambda implements yHO<CoroutineScope, AbstractC33240msi, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<TabLayout.Tab> $advancedTabRef;
    final /* synthetic */ C33301mtq $binding;
    final /* synthetic */ Ref.ObjectRef<TabLayout.Tab> $payTabRef;
    final /* synthetic */ Ref.ObjectRef<TabLayout.Tab> $simpleTabRef;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyAppModeSegmentView$createSegment$1(Ref.ObjectRef<TabLayout.Tab> objectRef, Ref.ObjectRef<TabLayout.Tab> objectRef2, Ref.ObjectRef<TabLayout.Tab> objectRef3, C33301mtq c33301mtq, Continuation<? super LegacyAppModeSegmentView$createSegment$1> continuation) {
        super(3, continuation);
        this.$advancedTabRef = objectRef;
        this.$simpleTabRef = objectRef2;
        this.$payTabRef = objectRef3;
        this.$binding = c33301mtq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, AbstractC33240msi abstractC33240msi, Continuation<? super Unit> continuation) {
        LegacyAppModeSegmentView$createSegment$1 legacyAppModeSegmentView$createSegment$1 = new LegacyAppModeSegmentView$createSegment$1(this.$advancedTabRef, this.$simpleTabRef, this.$payTabRef, this.$binding, continuation);
        legacyAppModeSegmentView$createSegment$1.L$0 = abstractC33240msi;
        return legacyAppModeSegmentView$createSegment$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TabLayout.Tab tab;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC33240msi abstractC33240msi = (AbstractC33240msi) this.L$0;
            if (C33377mvM.copydefault.OLrzqt()) {
                if (Intrinsics.EZpvd(abstractC33240msi, AbstractC33240msi.ActionBar.EZpvd)) {
                    tab = this.$advancedTabRef.element;
                } else if (Intrinsics.EZpvd(abstractC33240msi, AbstractC33240msi.Activity.OLrzqt)) {
                    tab = this.$simpleTabRef.element;
                } else {
                    tab = Intrinsics.EZpvd(abstractC33240msi, AbstractC33240msi.TaskDescription.OLrzqt) ? this.$payTabRef.element : null;
                }
                if (tab != null) {
                    this.$binding.copydefault.selectTab(tab);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
