package com.okinc.crcore.coreapi.repository;

import com.okinc.crcore.coreapi.net.requestbean.CeDefiDeleteRuleRequestBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31747mCk;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC31771mDh;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class CRRubikRepository$deleteCeDefiPriceRemind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends Unit, ? extends OKServerException>>, Object> {
    final /* synthetic */ CeDefiDeleteRuleRequestBean $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C31747mCk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CRRubikRepository$deleteCeDefiPriceRemind$2(C31747mCk c31747mCk, CeDefiDeleteRuleRequestBean ceDefiDeleteRuleRequestBean, Continuation<? super CRRubikRepository$deleteCeDefiPriceRemind$2> continuation) {
        super(2, continuation);
        this.this$0 = c31747mCk;
        this.$request = ceDefiDeleteRuleRequestBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CRRubikRepository$deleteCeDefiPriceRemind$2 cRRubikRepository$deleteCeDefiPriceRemind$2 = new CRRubikRepository$deleteCeDefiPriceRemind$2(this.this$0, this.$request, continuation);
        cRRubikRepository$deleteCeDefiPriceRemind$2.L$0 = obj;
        return cRRubikRepository$deleteCeDefiPriceRemind$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends Unit, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<Unit, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<Unit, OKServerException>> continuation) {
        return ((CRRubikRepository$deleteCeDefiPriceRemind$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C31747mCk c31747mCk = this.this$0;
                CeDefiDeleteRuleRequestBean ceDefiDeleteRuleRequestBean = this.$request;
                InterfaceC31771mDh interfaceC31771mDh = c31747mCk.OLrzqt;
                this.label = 1;
                obj = interfaceC31771mDh.AEQbTJ(ceDefiDeleteRuleRequestBean, this);
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
            if (responseData.getCode() == 0) {
                actionBar = new AbstractC43419rot.StateListAnimator(responseData.getData());
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            return new AbstractC43419rot.StateListAnimator(Unit.INSTANCE);
        }
        if (actionBar instanceof AbstractC43419rot.ActionBar) {
            return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) actionBar).KWHzl());
        }
        throw new NoWhenBranchMatchedException();
    }
}
