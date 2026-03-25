package com.okinc.common.localization;

import com.okinc.localization2.bean.LanguageUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC32554mfl;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pTU;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class SwitchMarketLoadingActivity$startSwitchMarket$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, Continuation<? super Unit>, Object> $finishCallback;
    final /* synthetic */ pTU $localizeService;
    final /* synthetic */ int $maxSwitchCount;
    final /* synthetic */ LanguageUnit $newUnit;
    final /* synthetic */ Ref.BooleanRef $success;
    int I$0;
    int label;
    final /* synthetic */ ActivityC32554mfl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwitchMarketLoadingActivity$startSwitchMarket$job$1(int i, ActivityC32554mfl activityC32554mfl, pTU ptu, LanguageUnit languageUnit, Function2<? super Boolean, ? super Continuation<? super Unit>, ? extends Object> function2, Ref.BooleanRef booleanRef, Continuation<? super SwitchMarketLoadingActivity$startSwitchMarket$job$1> continuation) {
        super(2, continuation);
        this.$maxSwitchCount = i;
        this.this$0 = activityC32554mfl;
        this.$localizeService = ptu;
        this.$newUnit = languageUnit;
        this.$finishCallback = function2;
        this.$success = booleanRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwitchMarketLoadingActivity$startSwitchMarket$job$1(this.$maxSwitchCount, this.this$0, this.$localizeService, this.$newUnit, this.$finishCallback, this.$success, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SwitchMarketLoadingActivity$startSwitchMarket$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005f -> B:19:0x0062). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            i = 0;
            if (i < this.$maxSwitchCount) {
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            this.$success.element = true;
            return Unit.INSTANCE;
        }
        i = this.I$0;
        C56391yDq.AEQbTJ(obj);
        if (!((Boolean) obj).booleanValue()) {
            Function2<Boolean, Continuation<? super Unit>, Object> function2 = this.$finishCallback;
            Boolean boolKWHzl = C56443yFo.KWHzl(true);
            this.label = 2;
            if (function2.invoke(boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
            this.$success.element = true;
            return Unit.INSTANCE;
        }
        i++;
        if (i < this.$maxSwitchCount) {
            long j = i == 0 ? 2000L : 0L;
            pUU.KWHzl(this.this$0.getTAG(), "startSwitchMarket, switch for the " + i + " times");
            ActivityC32554mfl activityC32554mfl = this.this$0;
            pTU ptu = this.$localizeService;
            LanguageUnit languageUnit = this.$newUnit;
            this.I$0 = i;
            this.label = 1;
            obj = activityC32554mfl.KWHzl(ptu, languageUnit, j, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        }
        return Unit.INSTANCE;
    }
}
