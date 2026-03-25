package com.okinc.business.market.features.module.ui.detail;

import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C28896kjS;
import o.C28897kjT;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28933kkC;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class ModuleDetailViewModel$setModuleInfoFromDeeplink$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $moduleNameEnglish;
    final /* synthetic */ String $moduleType;
    final /* synthetic */ String $name;
    int label;
    final /* synthetic */ ModuleDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDetailViewModel$setModuleInfoFromDeeplink$1(ModuleDetailViewModel moduleDetailViewModel, String str, String str2, String str3, Continuation<? super ModuleDetailViewModel$setModuleInfoFromDeeplink$1> continuation) {
        super(2, continuation);
        this.this$0 = moduleDetailViewModel;
        this.$name = str;
        this.$moduleNameEnglish = str2;
        this.$moduleType = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModuleDetailViewModel$setModuleInfoFromDeeplink$1(this.this$0, this.$name, this.$moduleNameEnglish, this.$moduleType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModuleDetailViewModel$setModuleInfoFromDeeplink$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7386unboximpl;
        String str;
        Object next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28896kjS c28896kjSValueOf = this.this$0.valueOf();
            this.label = 1;
            Object objEZpvd = c28896kjSValueOf.EZpvd(this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            objM7386unboximpl = objEZpvd;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        ModuleDetailViewModel moduleDetailViewModel = this.this$0;
        String str2 = this.$name;
        String str3 = this.$moduleNameEnglish;
        String str4 = this.$moduleType;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            Iterator it = ((List) objM7386unboximpl).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((C28897kjT) next).valueOf(), (Object) str4)) {
                    break;
                }
            }
            C28897kjT c28897kjT = (C28897kjT) next;
            if (c28897kjT != null) {
                moduleDetailViewModel.AEQbTJ.setValue(new InterfaceC28933kkC.TaskDescription(moduleDetailViewModel.EZpvd(c28897kjT.fJNWhG(), str2, str3)));
                str = "ModuleDetailViewModel";
            } else {
                pUU.copydefault("ModuleDetailViewModel", "Module not found for moduleType: " + str4);
                str = "ModuleDetailViewModel";
                moduleDetailViewModel.AEQbTJ.setValue(new InterfaceC28933kkC.TaskDescription(new ModuleInfo(str4, str4, str2, str3, null, false, null, null, null, null, false, null, null, null, null, 32752, null)));
            }
        } else {
            str = "ModuleDetailViewModel";
        }
        ModuleDetailViewModel moduleDetailViewModel2 = this.this$0;
        String str5 = this.$moduleType;
        String str6 = this.$name;
        String str7 = this.$moduleNameEnglish;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault(str, "Failed to fetch modules: " + thM7380exceptionOrNullimpl.getMessage());
            moduleDetailViewModel2.AEQbTJ.setValue(new InterfaceC28933kkC.TaskDescription(new ModuleInfo(str5, str5, str6, str7, null, false, null, null, null, null, false, null, null, null, null, 32752, null)));
        }
        return Unit.INSTANCE;
    }
}
