package com.okinc.core.ok_app.modeswitch.liteSubMode;

import android.content.Context;
import com.google.android.material.tabs.TabLayout;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C33377mvM;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class LegacyAppModeSegmentView$createSegment$setupTabs$4$onTabSelected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Function2<Integer, Integer, Unit> $onValueChange;
    final /* synthetic */ Ref.ObjectRef<TabLayout.Tab> $selectedTab;
    final /* synthetic */ String $source;
    final /* synthetic */ TabLayout.Tab $tab;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LegacyAppModeSegmentView$createSegment$setupTabs$4$onTabSelected$1(TabLayout.Tab tab, Context context, Ref.ObjectRef<TabLayout.Tab> objectRef, String str, Function2<? super Integer, ? super Integer, Unit> function2, Continuation<? super LegacyAppModeSegmentView$createSegment$setupTabs$4$onTabSelected$1> continuation) {
        super(2, continuation);
        this.$tab = tab;
        this.$context = context;
        this.$selectedTab = objectRef;
        this.$source = str;
        this.$onValueChange = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LegacyAppModeSegmentView$createSegment$setupTabs$4$onTabSelected$1(this.$tab, this.$context, this.$selectedTab, this.$source, this.$onValueChange, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LegacyAppModeSegmentView$createSegment$setupTabs$4$onTabSelected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.google.android.material.tabs.TabLayout$Tab] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C33377mvM c33377mvM = C33377mvM.copydefault;
            if (c33377mvM.OLrzqt()) {
                String string = c33377mvM.EZpvd().KWHzl().getValue().toString();
                String strAEQbTJ = c33377mvM.AEQbTJ(this.$tab);
                this.label = 1;
                if (c33377mvM.OLrzqt(string, strAEQbTJ, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (c33377mvM.copydefault(this.$context, C56443yFo.AEQbTJ(c33377mvM.copydefault(this.$selectedTab.element)), c33377mvM.copydefault(this.$tab), this.$source)) {
                    this.$onValueChange.invoke(C56443yFo.AEQbTJ(c33377mvM.copydefault(this.$selectedTab.element)), C56443yFo.AEQbTJ(c33377mvM.copydefault(this.$tab)));
                    this.$selectedTab.element = this.$tab;
                }
                Unit unit = Unit.INSTANCE;
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
