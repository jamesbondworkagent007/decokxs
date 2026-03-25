package com.okinc.planet.biz_setting.reset;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.planet.biz_setting.data.CurveResetInfo;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.AbstractC46197tLk;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.tIH;
import o.tQP;

/* JADX INFO: loaded from: classes10.dex */
public final class SocialDataResetViewModel$fetchResetDataInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tIH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialDataResetViewModel$fetchResetDataInfo$1(tIH tih, Continuation<? super SocialDataResetViewModel$fetchResetDataInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = tih;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SocialDataResetViewModel$fetchResetDataInfo$1 socialDataResetViewModel$fetchResetDataInfo$1 = new SocialDataResetViewModel$fetchResetDataInfo$1(this.this$0, continuation);
        socialDataResetViewModel$fetchResetDataInfo$1.L$0 = obj;
        return socialDataResetViewModel$fetchResetDataInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SocialDataResetViewModel$fetchResetDataInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: o.tIH */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: o.tIH */
    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: o.tIH */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: o.tIH */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objM7377constructorimpl;
        tIH tih;
        Throwable thM7380exceptionOrNullimpl;
        tIH tih2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
            } catch (Throwable th) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                tih = i;
            }
        } catch (Throwable th2) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            tIH tih3 = this.this$0;
            Result.Application application2 = Result.Companion;
            tQP tqp = tih3.copydefault;
            this.L$0 = tih3;
            this.label = 1;
            obj = tqp.OLrzqt(this);
            tih2 = tih3;
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                tIH tih4 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableStateFlow mutableStateFlow = tih4.KWHzl;
                    AbstractC46197tLk abstractC46197tLkOLrzqt = AbstractC46197tLk.Companion.OLrzqt(thM7380exceptionOrNullimpl);
                    this.L$0 = objM7377constructorimpl;
                    this.label = 3;
                    if (mutableStateFlow.emit(abstractC46197tLkOLrzqt, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            tIH tih5 = (tIH) this.L$0;
            C56391yDq.AEQbTJ(obj);
            tih2 = tih5;
        }
        ResponseData responseData = (ResponseData) obj;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Object data = responseData.getData();
            Intrinsics.copydefault(data);
            actionBar = new AbstractC43419rot.StateListAnimator(data);
            tih = tih2;
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            tih = tih2;
        }
        CurveResetInfo curveResetInfo = (CurveResetInfo) ((List) actionBar.AEQbTJ()).get(0);
        MutableStateFlow mutableStateFlow2 = tih.KWHzl;
        AbstractC46197tLk abstractC46197tLkKWHzl = AbstractC46197tLk.Companion.KWHzl(curveResetInfo);
        this.L$0 = null;
        this.label = 2;
        if (mutableStateFlow2.emit(abstractC46197tLkKWHzl, this) == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        tIH tih42 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
