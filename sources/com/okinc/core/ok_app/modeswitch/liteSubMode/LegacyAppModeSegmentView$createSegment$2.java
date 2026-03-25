package com.okinc.core.ok_app.modeswitch.liteSubMode;

import com.google.android.material.tabs.TabLayout;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C33301mtq;
import o.C33377mvM;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class LegacyAppModeSegmentView$createSegment$2 extends SuspendLambda implements yHO<CoroutineScope, Integer, Continuation<? super Unit>, Object> {
    final /* synthetic */ C33301mtq $binding;
    final /* synthetic */ Ref.ObjectRef<TabLayout.Tab> $selectedTab;
    final /* synthetic */ Ref.ObjectRef<TabLayout.Tab> $tradeTab;
    final /* synthetic */ Ref.ObjectRef<TabLayout.Tab> $walletTab;
    /* synthetic */ int I$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyAppModeSegmentView$createSegment$2(Ref.ObjectRef<TabLayout.Tab> objectRef, Ref.ObjectRef<TabLayout.Tab> objectRef2, C33301mtq c33301mtq, Ref.ObjectRef<TabLayout.Tab> objectRef3, Continuation<? super LegacyAppModeSegmentView$createSegment$2> continuation) {
        super(3, continuation);
        this.$walletTab = objectRef;
        this.$tradeTab = objectRef2;
        this.$binding = c33301mtq;
        this.$selectedTab = objectRef3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(CoroutineScope coroutineScope, Integer num, Continuation<? super Unit> continuation) {
        return invoke(coroutineScope, num.intValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(CoroutineScope coroutineScope, int i, Continuation<? super Unit> continuation) {
        LegacyAppModeSegmentView$createSegment$2 legacyAppModeSegmentView$createSegment$2 = new LegacyAppModeSegmentView$createSegment$2(this.$walletTab, this.$tradeTab, this.$binding, this.$selectedTab, continuation);
        legacyAppModeSegmentView$createSegment$2.I$0 = i;
        return legacyAppModeSegmentView$createSegment$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: o.xgQ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v7, types: [T, com.google.android.material.tabs.TabLayout$Tab] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            int i = this.I$0;
            if (!C33377mvM.copydefault.OLrzqt()) {
                if (i == 3) {
                    r2 = this.$walletTab.element;
                } else {
                    r2 = this.$tradeTab.element;
                }
                this.$binding.copydefault.selectTab(r2);
                this.$selectedTab.element = r2;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
