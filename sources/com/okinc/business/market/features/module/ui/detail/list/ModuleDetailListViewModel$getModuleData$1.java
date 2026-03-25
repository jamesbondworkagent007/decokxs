package com.okinc.business.market.features.module.ui.detail.list;

import com.okinc.business.market.features.module.domain.type.TimeType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28896kjS;
import o.C28899kjV;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC29021kll;

/* JADX INFO: loaded from: classes7.dex */
public final class ModuleDetailListViewModel$getModuleData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $dataIdParam;
    final /* synthetic */ String $id;
    final /* synthetic */ boolean $isBoostModuleParam;
    final /* synthetic */ TimeType $type;
    final /* synthetic */ String $wsChannel;
    int label;
    final /* synthetic */ ModuleDetailListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDetailListViewModel$getModuleData$1(ModuleDetailListViewModel moduleDetailListViewModel, String str, String str2, String str3, TimeType timeType, String str4, boolean z, Continuation<? super ModuleDetailListViewModel$getModuleData$1> continuation) {
        super(2, continuation);
        this.this$0 = moduleDetailListViewModel;
        this.$chainId = str;
        this.$id = str2;
        this.$dataIdParam = str3;
        this.$type = timeType;
        this.$wsChannel = str4;
        this.$isBoostModuleParam = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModuleDetailListViewModel$getModuleData$1(this.this$0, this.$chainId, this.$id, this.$dataIdParam, this.$type, this.$wsChannel, this.$isBoostModuleParam, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModuleDetailListViewModel$getModuleData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.gEmmrt = this.$chainId;
            this.this$0.djBIcL = this.$id;
            this.this$0.OLrzqt = this.$dataIdParam;
            this.this$0.AkhnZx = this.$type;
            this.this$0.fetchVPNInfo = this.$wsChannel;
            this.this$0.AhwBna = this.$isBoostModuleParam;
            if (!this.this$0.EZpvd) {
                this.this$0.AEQbTJ.setValue(InterfaceC29021kll.ActionBar.AEQbTJ);
            }
            C28896kjS c28896kjS = this.this$0.isConnected;
            String str = this.$id;
            String str2 = this.$dataIdParam;
            TimeType timeType = this.$type;
            String str3 = this.$chainId;
            Boolean boolKWHzl = C56443yFo.KWHzl(this.$isBoostModuleParam);
            this.label = 1;
            objAEQbTJ = c28896kjS.AEQbTJ(str, str2, timeType, str3, boolKWHzl, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        ModuleDetailListViewModel moduleDetailListViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            C28899kjV c28899kjV = (C28899kjV) objAEQbTJ;
            moduleDetailListViewModel.AYXKKw = c28899kjV;
            moduleDetailListViewModel.EZpvd = true;
            moduleDetailListViewModel.AEQbTJ.setValue(new InterfaceC29021kll.StateListAnimator(c28899kjV.AhwBna()));
            ModuleDetailListViewModel.sortModule$default(moduleDetailListViewModel, null, null, false, 7, null);
            moduleDetailListViewModel.AEQbTJ();
        }
        ModuleDetailListViewModel moduleDetailListViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
            moduleDetailListViewModel2.EZpvd = true;
            moduleDetailListViewModel2.AEQbTJ.setValue(InterfaceC29021kll.Application.KWHzl);
        }
        return Unit.INSTANCE;
    }
}
