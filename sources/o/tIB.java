package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.planet.biz_setting.data.CurveResetInfo;
import com.okinc.planet.biz_setting.domain.FetchCurveResetInfoUseCase$execute$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tIB extends AbstractC46360tRl<Unit, CurveResetInfo> {
    public final tQP KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tIB(@NotNull tQP tqp, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(tqp, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = tqp;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC46360tRl
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull Unit unit, @NotNull Continuation<? super CurveResetInfo> continuation) throws java.lang.Throwable {
        FetchCurveResetInfoUseCase$execute$1 fetchCurveResetInfoUseCase$execute$1;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof FetchCurveResetInfoUseCase$execute$1) {
            fetchCurveResetInfoUseCase$execute$1 = (FetchCurveResetInfoUseCase$execute$1) continuation;
            int i = fetchCurveResetInfoUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchCurveResetInfoUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchCurveResetInfoUseCase$execute$1 = new FetchCurveResetInfoUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = fetchCurveResetInfoUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchCurveResetInfoUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                tQP tqp = this.KWHzl;
                fetchCurveResetInfoUseCase$execute$1.label = 1;
                objOLrzqt = tqp.OLrzqt(fetchCurveResetInfoUseCase$execute$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            responseData = (ResponseData) objOLrzqt;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            return CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) stateListAnimator.AEQbTJ());
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        return CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) stateListAnimator.AEQbTJ());
    }
}
