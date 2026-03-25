package com.okinc.okex.center.viewmodel;

import com.okinc.okex.center.bean.TroubleshootResultPageData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC45235slv;
import o.C33070mpX;
import o.C44711scA;
import o.C47315tni;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportTroubleshootViewModel$fetchResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $txid;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SupportTroubleshootViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportTroubleshootViewModel$fetchResult$1(SupportTroubleshootViewModel supportTroubleshootViewModel, String str, Continuation<? super SupportTroubleshootViewModel$fetchResult$1> continuation) {
        super(2, continuation);
        this.this$0 = supportTroubleshootViewModel;
        this.$txid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportTroubleshootViewModel$fetchResult$1 supportTroubleshootViewModel$fetchResult$1 = new SupportTroubleshootViewModel$fetchResult$1(this.this$0, this.$txid, continuation);
        supportTroubleshootViewModel$fetchResult$1.L$0 = obj;
        return supportTroubleshootViewModel$fetchResult$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportTroubleshootViewModel$fetchResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.KWHzl.setValue(AbstractC45235slv.ActionBar.copydefault);
                SupportTroubleshootViewModel supportTroubleshootViewModel = this.this$0;
                String str = this.$txid;
                Result.Application application = Result.Companion;
                Integer value = supportTroubleshootViewModel.values().getValue();
                int iIntValue = value != null ? value.intValue() : -1;
                Integer value2 = supportTroubleshootViewModel.isConnected().getValue();
                Integer num = (value2 == null || value2.intValue() == -2) ? null : value2;
                String str2 = (supportTroubleshootViewModel.ejfBZ() && (StringsKt__StringsKt.fARcdN((CharSequence) str) ^ true)) ? str : null;
                CoroutineDispatcher coroutineDispatcherOLrzqt = C44711scA.EZpvd.OLrzqt();
                SupportTroubleshootViewModel$fetchResult$1$1$1 supportTroubleshootViewModel$fetchResult$1$1$1 = new SupportTroubleshootViewModel$fetchResult$1$1$1(supportTroubleshootViewModel, iIntValue, num, str2, null);
                this.label = 1;
                obj = BuildersKt.withContext(coroutineDispatcherOLrzqt, supportTroubleshootViewModel$fetchResult$1$1$1, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
            C56391yDq.AEQbTJ(objM7386unboximpl);
            objM7377constructorimpl = Result.m7377constructorimpl((TroubleshootResultPageData) objM7386unboximpl);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        SupportTroubleshootViewModel supportTroubleshootViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            supportTroubleshootViewModel2.KWHzl.setValue(new AbstractC45235slv.Application((TroubleshootResultPageData) objM7377constructorimpl));
        }
        SupportTroubleshootViewModel supportTroubleshootViewModel3 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            supportTroubleshootViewModel3.KWHzl.setValue(new AbstractC45235slv.Activity(C33070mpX.AYXKKw(C47315tni.PendingIntent.getPostValueLengthLimit), true));
            supportTroubleshootViewModel3.KWHzl.setValue(AbstractC45235slv.StateListAnimator.copydefault);
        }
        return Unit.INSTANCE;
    }
}
