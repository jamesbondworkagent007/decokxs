package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import com.okinc.unify_trade.core.usecase.ipublic.coroutine.GetCurrencyListCoUseCase$doRetrieveData$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xCd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54269xCd extends xKQ<java.util.ArrayList<ValuationCurrencyBean>> {
    public boolean EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.EZpvd = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.xKQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<java.util.ArrayList<ValuationCurrencyBean>>> continuation) throws java.lang.Throwable {
        GetCurrencyListCoUseCase$doRetrieveData$1 getCurrencyListCoUseCase$doRetrieveData$1;
        C54269xCd c54269xCd;
        AbstractC58185ywX<ResponseData<java.util.ArrayList<ValuationCurrencyBean>>> abstractC58185ywXCopydefault;
        if (continuation instanceof GetCurrencyListCoUseCase$doRetrieveData$1) {
            getCurrencyListCoUseCase$doRetrieveData$1 = (GetCurrencyListCoUseCase$doRetrieveData$1) continuation;
            int i = getCurrencyListCoUseCase$doRetrieveData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getCurrencyListCoUseCase$doRetrieveData$1.label = i - Integer.MIN_VALUE;
            } else {
                getCurrencyListCoUseCase$doRetrieveData$1 = new GetCurrencyListCoUseCase$doRetrieveData$1(this, continuation);
            }
        }
        java.lang.Object result = getCurrencyListCoUseCase$doRetrieveData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getCurrencyListCoUseCase$doRetrieveData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(result);
            try {
                InterfaceC46550tYm interfaceC46550tYm = (InterfaceC46550tYm) C43251rlk.OLrzqt(InterfaceC46550tYm.class);
                if (interfaceC46550tYm != null && (abstractC58185ywXCopydefault = interfaceC46550tYm.copydefault(this.EZpvd)) != null) {
                    getCurrencyListCoUseCase$doRetrieveData$1.L$0 = this;
                    getCurrencyListCoUseCase$doRetrieveData$1.L$1 = abstractC58185ywXCopydefault;
                    getCurrencyListCoUseCase$doRetrieveData$1.label = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(getCurrencyListCoUseCase$doRetrieveData$1), 1);
                    cancellableContinuationImpl.initCancellability();
                    cancellableContinuationImpl.invokeOnCancellation(new Activity(abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58227yxM(new Application(cancellableContinuationImpl)) { // from class: o.xCd.StateListAnimator
                        public final /* synthetic */ Function1 AEQbTJ;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            Intrinsics.checkNotNullParameter(function1, "");
                            this.AEQbTJ = function1;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final /* synthetic */ void accept(java.lang.Object obj) {
                            this.AEQbTJ.invoke(obj);
                        }
                    }, new InterfaceC58227yxM(new ActionBar(cancellableContinuationImpl, this)) { // from class: o.xCd.StateListAnimator
                        public final /* synthetic */ Function1 AEQbTJ;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            Intrinsics.checkNotNullParameter(function1, "");
                            this.AEQbTJ = function1;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final /* synthetic */ void accept(java.lang.Object obj) {
                            this.AEQbTJ.invoke(obj);
                        }
                    })));
                    result = cancellableContinuationImpl.getResult();
                    if (result == C56442yFn.copydefault()) {
                        C56447yFs.copydefault(getCurrencyListCoUseCase$doRetrieveData$1);
                    }
                    if (result == objCopydefault) {
                        return objCopydefault;
                    }
                    c54269xCd = this;
                }
                return AEQbTJ("LocalConfigService not available");
            } catch (java.lang.Exception e) {
                e = e;
                c54269xCd = this;
                return c54269xCd.AEQbTJ(e.getMessage());
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c54269xCd = (C54269xCd) getCurrencyListCoUseCase$doRetrieveData$1.L$0;
        try {
            C56391yDq.AEQbTJ(result);
        } catch (java.lang.Exception e2) {
            e = e2;
            return c54269xCd.AEQbTJ(e.getMessage());
        }
        return (ResponseData) result;
    }

    /* JADX INFO: renamed from: o.xCd$ActionBar */
    public static final class ActionBar implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ C54269xCd OLrzqt;
        public final /* synthetic */ CancellableContinuation<ResponseData<java.util.ArrayList<ValuationCurrencyBean>>> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super com.okinc.network.okg.response.ResponseData<java.util.ArrayList<com.okinc.preference.data.model.ValuationCurrencyBean>>> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(CancellableContinuation<? super ResponseData<java.util.ArrayList<ValuationCurrencyBean>>> cancellableContinuation, C54269xCd c54269xCd) {
            this.copydefault = cancellableContinuation;
            this.OLrzqt = c54269xCd;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            AEQbTJ(th);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(java.lang.Throwable th) {
            CancellableContinuation<ResponseData<java.util.ArrayList<ValuationCurrencyBean>>> cancellableContinuation = this.copydefault;
            Result.Application application = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7377constructorimpl(this.OLrzqt.AEQbTJ(th.getMessage())));
        }
    }

    /* JADX INFO: renamed from: o.xCd$Application */
    public static final class Application implements Function1<ResponseData<java.util.ArrayList<ValuationCurrencyBean>>, Unit> {
        public final /* synthetic */ CancellableContinuation<ResponseData<java.util.ArrayList<ValuationCurrencyBean>>> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super com.okinc.network.okg.response.ResponseData<java.util.ArrayList<com.okinc.preference.data.model.ValuationCurrencyBean>>> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(CancellableContinuation<? super ResponseData<java.util.ArrayList<ValuationCurrencyBean>>> cancellableContinuation) {
            this.EZpvd = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(ResponseData<java.util.ArrayList<ValuationCurrencyBean>> responseData) {
            AEQbTJ(responseData);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(ResponseData<java.util.ArrayList<ValuationCurrencyBean>> responseData) {
            CancellableContinuation<ResponseData<java.util.ArrayList<ValuationCurrencyBean>>> cancellableContinuation = this.EZpvd;
            Result.Application application = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7377constructorimpl(responseData));
        }
    }

    /* JADX INFO: renamed from: o.xCd$Activity */
    public static final class Activity implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ InterfaceC58217yxC EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(InterfaceC58217yxC interfaceC58217yxC) {
            this.EZpvd = interfaceC58217yxC;
        }

        public final void AEQbTJ(java.lang.Throwable th) {
            this.EZpvd.dispose();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            AEQbTJ(th);
            return Unit.INSTANCE;
        }
    }

    public final ResponseData<java.util.ArrayList<ValuationCurrencyBean>> AEQbTJ(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        return new ResponseData<>(0, str, null, null, null, null, 61, null);
    }
}
