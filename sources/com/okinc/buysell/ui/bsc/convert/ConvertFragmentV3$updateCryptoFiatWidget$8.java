package com.okinc.buysell.ui.bsc.convert;

import com.okinc.buysell.ui.bsc.convert.ConvertFragmentV3$updateCryptoFiatWidget$8;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C29848lCo;
import o.C31351lsQ;
import o.C31392ltE;
import o.C31437ltx;
import o.C31439ltz;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes15.dex */
public final class ConvertFragmentV3$updateCryptoFiatWidget$8 extends SuspendLambda implements yHO<C29848lCo.ActionBar, C29848lCo.TaskDescription, Continuation<? super C31437ltx>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ C29848lCo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConvertFragmentV3$updateCryptoFiatWidget$8(C29848lCo c29848lCo, Continuation<? super ConvertFragmentV3$updateCryptoFiatWidget$8> continuation) {
        super(3, continuation);
        this.this$0 = c29848lCo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(C29848lCo.ActionBar actionBar, C29848lCo.TaskDescription taskDescription, Continuation<? super C31437ltx> continuation) {
        ConvertFragmentV3$updateCryptoFiatWidget$8 convertFragmentV3$updateCryptoFiatWidget$8 = new ConvertFragmentV3$updateCryptoFiatWidget$8(this.this$0, continuation);
        convertFragmentV3$updateCryptoFiatWidget$8.L$0 = actionBar;
        convertFragmentV3$updateCryptoFiatWidget$8.L$1 = taskDescription;
        return convertFragmentV3$updateCryptoFiatWidget$8.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C29848lCo.ActionBar actionBar = (C29848lCo.ActionBar) this.L$0;
            C29848lCo.TaskDescription taskDescription = (C29848lCo.TaskDescription) this.L$1;
            String strKWHzl = actionBar.KWHzl();
            String strCopydefault = actionBar.copydefault();
            String strAEQbTJ = actionBar.AEQbTJ();
            String strOLrzqt = actionBar.OLrzqt();
            String string = this.this$0.getString(C31351lsQ.Activity.getAdvertisingId);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String str = strCopydefault == null ? "" : strCopydefault;
            String str2 = strAEQbTJ == null ? "" : strAEQbTJ;
            final C29848lCo c29848lCo = this.this$0;
            C31392ltE c31392ltE = new C31392ltE(strKWHzl, null, false, true, string, str, str2, strOLrzqt, null, null, new Function0() { // from class: o.lDi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ConvertFragmentV3$updateCryptoFiatWidget$8.invokeSuspend$lambda$0(c29848lCo);
                }
            }, 774, null);
            String strOLrzqt2 = taskDescription.OLrzqt();
            String strKWHzl2 = taskDescription.KWHzl();
            String strAEQbTJ2 = taskDescription.AEQbTJ();
            String string2 = this.this$0.getString(C31351lsQ.Activity.DwQSDd);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String str3 = strAEQbTJ2 == null ? "" : strAEQbTJ2;
            String strCopydefault2 = taskDescription.copydefault();
            final C29848lCo c29848lCo2 = this.this$0;
            C31392ltE c31392ltE2 = new C31392ltE(strKWHzl2, null, false, true, string2, str3, strOLrzqt2, "", strCopydefault2, null, new Function0() { // from class: o.lDn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ConvertFragmentV3$updateCryptoFiatWidget$8.invokeSuspend$lambda$1(c29848lCo2);
                }
            }, 518, null);
            final C29848lCo c29848lCo3 = this.this$0;
            return new C31437ltx(c31392ltE, c31392ltE2, new C31439ltz(new Function0() { // from class: o.lDr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ConvertFragmentV3$updateCryptoFiatWidget$8.invokeSuspend$lambda$2(c29848lCo3);
                }
            }));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C29848lCo c29848lCo) {
        c29848lCo.QOLQEE();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(C29848lCo c29848lCo) {
        c29848lCo.OcIXYQ();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(C29848lCo c29848lCo) {
        c29848lCo.getNewProxyInstance();
        return Unit.INSTANCE;
    }
}
