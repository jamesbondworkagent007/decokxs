package com.okinc.okex.common.usecase;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.SelfServiceTools;
import com.okinc.okex.center.ui.displaymodels.SelfServiceDisplayModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C44855sem;
import o.C45396sox;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC44921sfz;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportAllSelfToolsUseCase$getAllSelfToolsData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends SelfServiceDisplayModel>>>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C45396sox this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportAllSelfToolsUseCase$getAllSelfToolsData$2(C45396sox c45396sox, Continuation<? super SupportAllSelfToolsUseCase$getAllSelfToolsData$2> continuation) {
        super(2, continuation);
        this.this$0 = c45396sox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportAllSelfToolsUseCase$getAllSelfToolsData$2 supportAllSelfToolsUseCase$getAllSelfToolsData$2 = new SupportAllSelfToolsUseCase$getAllSelfToolsData$2(this.this$0, continuation);
        supportAllSelfToolsUseCase$getAllSelfToolsData$2.L$0 = obj;
        return supportAllSelfToolsUseCase$getAllSelfToolsData$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends SelfServiceDisplayModel>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends List<SelfServiceDisplayModel>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<SelfServiceDisplayModel>>> continuation) {
        return ((SupportAllSelfToolsUseCase$getAllSelfToolsData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objM7377constructorimpl;
        List listAhwBna;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC44921sfz interfaceC44921sfz = this.this$0.copydefault;
                this.label = 1;
                obj = interfaceC44921sfz.KWHzl(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            List<SelfServiceToolBean> list = ((SelfServiceTools) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl()).getList();
            if (list != null) {
                listAhwBna = new ArrayList(C56403yEb.AYXKKw(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    listAhwBna.add(C44855sem.OLrzqt((SelfServiceToolBean) it.next()));
                }
            } else {
                listAhwBna = null;
            }
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(listAhwBna);
        } else {
            if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd((Throwable) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
