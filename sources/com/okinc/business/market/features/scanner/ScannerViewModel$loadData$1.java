package com.okinc.business.market.features.scanner;

import com.okinc.business.market.data.model.HomeTabRequest;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC29288kqn;
import o.C25983jNp;
import o.C28446kat;
import o.C29709kyk;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class ScannerViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ScannerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScannerViewModel$loadData$1(ScannerViewModel scannerViewModel, Continuation<? super ScannerViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = scannerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScannerViewModel$loadData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScannerViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objOLrzqt;
        Object value2;
        Object objAEQbTJ;
        Object value3;
        Object value4;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, AbstractC29288kqn.Activity.EZpvd));
            C25983jNp c25983jNp = this.this$0.KWHzl;
            this.label = 1;
            objOLrzqt = c25983jNp.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    ((Result) obj).m7386unboximpl();
                    C28446kat c28446kat = this.this$0.copydefault;
                    HomeTabRequest homeTabRequest = HomeTabRequest.SA;
                    this.label = 3;
                    objAEQbTJ = c28446kat.AEQbTJ("scanner", homeTabRequest, this);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    ScannerViewModel scannerViewModel = this.this$0;
                    if (Result.m7384isSuccessimpl(objAEQbTJ)) {
                    }
                    ScannerViewModel scannerViewModel2 = this.this$0;
                    if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
                ScannerViewModel scannerViewModel3 = this.this$0;
                if (Result.m7384isSuccessimpl(objAEQbTJ)) {
                    List list = (List) objAEQbTJ;
                    MutableStateFlow mutableStateFlow2 = scannerViewModel3.EZpvd;
                    do {
                        value4 = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value4, new AbstractC29288kqn.ActionBar(list)));
                }
                ScannerViewModel scannerViewModel22 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
                    MutableStateFlow mutableStateFlow3 = scannerViewModel22.EZpvd;
                    do {
                        value3 = mutableStateFlow3.getValue();
                    } while (!mutableStateFlow3.compareAndSet(value3, new AbstractC29288kqn.ActionBar(yDY.AhwBna())));
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        ScannerViewModel scannerViewModel4 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objOLrzqt) != null) {
            MutableStateFlow mutableStateFlow4 = scannerViewModel4.EZpvd;
            do {
                value2 = mutableStateFlow4.getValue();
            } while (!mutableStateFlow4.compareAndSet(value2, AbstractC29288kqn.TaskDescription.OLrzqt));
            return Unit.INSTANCE;
        }
        C29709kyk c29709kyk = this.this$0.AEQbTJ;
        this.label = 2;
        if (c29709kyk.AEQbTJ(this) == objCopydefault) {
            return objCopydefault;
        }
        C28446kat c28446kat2 = this.this$0.copydefault;
        HomeTabRequest homeTabRequest2 = HomeTabRequest.SA;
        this.label = 3;
        objAEQbTJ = c28446kat2.AEQbTJ("scanner", homeTabRequest2, this);
        if (objAEQbTJ == objCopydefault) {
        }
        ScannerViewModel scannerViewModel32 = this.this$0;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
        }
        ScannerViewModel scannerViewModel222 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
        }
        return Unit.INSTANCE;
    }
}
