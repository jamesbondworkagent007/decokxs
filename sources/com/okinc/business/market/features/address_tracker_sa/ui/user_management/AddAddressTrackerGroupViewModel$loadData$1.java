package com.okinc.business.market.features.address_tracker_sa.ui.user_management;

import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C28586kda;
import o.C56391yDq;
import o.C56442yFn;
import o.jAL;
import o.jEI;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
public final class AddAddressTrackerGroupViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AddAddressTrackerGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddAddressTrackerGroupViewModel$loadData$1(AddAddressTrackerGroupViewModel addAddressTrackerGroupViewModel, Continuation<? super AddAddressTrackerGroupViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = addAddressTrackerGroupViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddAddressTrackerGroupViewModel$loadData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddAddressTrackerGroupViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objEZpvd;
        MutableStateFlow mutableStateFlow;
        jEI jei;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28586kda c28586kda = this.this$0.KWHzl;
            this.label = 1;
            objOLrzqt = c28586kda.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jei = (jEI) this.L$1;
                MutableStateFlow mutableStateFlow2 = (MutableStateFlow) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
                mutableStateFlow = mutableStateFlow2;
                if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
                    objEZpvd = yDY.AhwBna();
                }
                mutableStateFlow.setValue(jEI.copy$default(jei, (List) objEZpvd, null, null, 6, null));
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
        if (dexUserIdentity != null && !dexUserIdentity.KWHzl()) {
            MutableStateFlow mutableStateFlow3 = this.this$0.copydefault;
            jEI jei2 = (jEI) this.this$0.copydefault.getValue();
            jAL jal = this.this$0.OLrzqt;
            String strEZpvd = dexUserIdentity.EZpvd();
            this.L$0 = mutableStateFlow3;
            this.L$1 = jei2;
            this.label = 2;
            objEZpvd = jal.EZpvd(strEZpvd, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            mutableStateFlow = mutableStateFlow3;
            jei = jei2;
            if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
            }
            mutableStateFlow.setValue(jEI.copy$default(jei, (List) objEZpvd, null, null, 6, null));
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
