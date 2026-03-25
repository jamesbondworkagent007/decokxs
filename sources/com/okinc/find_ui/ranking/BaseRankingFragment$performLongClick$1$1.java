package com.okinc.find_ui.ranking;

import com.okinc.business.market.market.dialog.MarketToolDialog;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC34904nlJ;
import o.C38383pWt;
import o.C55525xlb;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class BaseRankingFragment$performLongClick$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C55525xlb $item;
    final /* synthetic */ int[] $location;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ AbstractC34904nlJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRankingFragment$performLongClick$1$1(AbstractC34904nlJ abstractC34904nlJ, C55525xlb c55525xlb, int[] iArr, Continuation<? super BaseRankingFragment$performLongClick$1$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC34904nlJ;
        this.$item = c55525xlb;
        this.$location = iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseRankingFragment$performLongClick$1$1 baseRankingFragment$performLongClick$1$1 = new BaseRankingFragment$performLongClick$1$1(this.this$0, this.$item, this.$location, continuation);
        baseRankingFragment$performLongClick$1$1.L$0 = obj;
        return baseRankingFragment$performLongClick$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseRankingFragment$performLongClick$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        AbstractC34904nlJ abstractC34904nlJ;
        C55525xlb c55525xlb;
        int[] iArr;
        Ref.BooleanRef booleanRef;
        String strCopydefault;
        Object objCopydefault;
        Ref.BooleanRef booleanRef2;
        Unit unit;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                abstractC34904nlJ = this.this$0;
                c55525xlb = this.$item;
                iArr = this.$location;
                Result.Application application = Result.Companion;
                booleanRef = new Ref.BooleanRef();
                C38383pWt c38383pWtKWHzl = abstractC34904nlJ.KWHzl();
                if (c55525xlb == null || (strCopydefault = c55525xlb.copydefault()) == null) {
                    strCopydefault = "";
                }
                this.L$0 = coroutineScope;
                this.L$1 = abstractC34904nlJ;
                this.L$2 = c55525xlb;
                this.L$3 = iArr;
                this.L$4 = booleanRef;
                this.L$5 = booleanRef;
                this.label = 1;
                objCopydefault = c38383pWtKWHzl.copydefault(strCopydefault, "1", this);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                booleanRef2 = booleanRef;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef2 = (Ref.BooleanRef) this.L$5;
                booleanRef = (Ref.BooleanRef) this.L$4;
                iArr = (int[]) this.L$3;
                c55525xlb = (C55525xlb) this.L$2;
                abstractC34904nlJ = (AbstractC34904nlJ) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objCopydefault = obj;
            }
            AbstractC34904nlJ abstractC34904nlJ2 = abstractC34904nlJ;
            booleanRef2.element = ((Boolean) objCopydefault).booleanValue();
            Boolean boolGEmmrt = c55525xlb.gEmmrt();
            if (boolGEmmrt != null) {
                boolean zBooleanValue = boolGEmmrt.booleanValue();
                MarketToolDialog.Activity activity = MarketToolDialog.Companion;
                String name = coroutineScope.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                activity.copydefault(abstractC34904nlJ2, name, iArr[1], zBooleanValue, abstractC34904nlJ2.uzCIH(), (96 & 32) != 0 ? false : booleanRef.element, (96 & 64) != 0 ? false : false);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m7377constructorimpl(unit);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}
