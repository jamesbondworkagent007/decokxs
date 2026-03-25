package com.okinc.business.market.features.module.domain;

import com.okinc.business.market.data.model.ModuleData;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C28896kjS;
import o.C28897kjT;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28901kjX;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.module.domain.ModuleUseCase$getModules-IoAF18A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class ModuleUseCase$getModulesIoAF18A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends C28897kjT>>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C28896kjS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleUseCase$getModulesIoAF18A$$inlined$dexRunCatching$1(Continuation continuation, C28896kjS c28896kjS) {
        super(2, continuation);
        this.this$0 = c28896kjS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModuleUseCase$getModulesIoAF18A$$inlined$dexRunCatching$1(continuation, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends C28897kjT>>> continuation) {
        return ((ModuleUseCase$getModulesIoAF18A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C28896kjS c28896kjS;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C28896kjS c28896kjS2 = this.this$0;
                InterfaceC28901kjX interfaceC28901kjX = c28896kjS2.valueOf;
                this.L$0 = c28896kjS2;
                this.label = 1;
                Object objOLrzqt = interfaceC28901kjX.OLrzqt(this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                c28896kjS = c28896kjS2;
                obj = objOLrzqt;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c28896kjS = (C28896kjS) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            List listCopydefault = c28896kjS.copydefault((List<ModuleData>) ((AbstractC43419rot) obj).AEQbTJ());
            this.this$0.OLrzqt.setValue(listCopydefault);
            objM7377constructorimpl = Result.m7377constructorimpl(listCopydefault);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
