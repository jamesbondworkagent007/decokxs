package com.okinc.kline.features.settings.sub.viewmodel;

import com.okinc.kline.features.settings.main.data.model.SettingEntryPoint;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC56554yJr;
import o.oTD;
import o.oTZ;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineSubSettingViewModel$loadSettingList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SettingEntryPoint $entryPoint;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ KlineSubSettingViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineSubSettingViewModel$loadSettingList$1(KlineSubSettingViewModel klineSubSettingViewModel, SettingEntryPoint settingEntryPoint, Continuation<? super KlineSubSettingViewModel$loadSettingList$1> continuation) {
        super(2, continuation);
        this.this$0 = klineSubSettingViewModel;
        this.$entryPoint = settingEntryPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KlineSubSettingViewModel$loadSettingList$1 klineSubSettingViewModel$loadSettingList$1 = new KlineSubSettingViewModel$loadSettingList$1(this.this$0, this.$entryPoint, continuation);
        klineSubSettingViewModel$loadSettingList$1.L$0 = obj;
        return klineSubSettingViewModel$loadSettingList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineSubSettingViewModel$loadSettingList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        KlineSubSettingViewModel klineSubSettingViewModel;
        InterfaceC56554yJr interfaceC56554yJr;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            klineSubSettingViewModel = this.this$0;
            SettingEntryPoint settingEntryPoint = this.$entryPoint;
            Result.Application application2 = Result.Companion;
            KlineSubSettingViewModel$loadSettingList$1$1$1 klineSubSettingViewModel$loadSettingList$1$1$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.features.settings.sub.viewmodel.KlineSubSettingViewModel$loadSettingList$1$1$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((oTZ) obj2).KWHzl();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((oTZ) obj2).EZpvd((List) obj3);
                }
            };
            oTD otd = klineSubSettingViewModel.KWHzl;
            this.L$0 = klineSubSettingViewModel$loadSettingList$1$1$1;
            this.L$1 = klineSubSettingViewModel;
            this.label = 1;
            obj = otd.EZpvd(settingEntryPoint, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            interfaceC56554yJr = klineSubSettingViewModel$loadSettingList$1$1$1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    thM7380exceptionOrNullimpl.printStackTrace();
                    pUU.copydefault("KlineSubSettingViewModel", "loadSettingData fail cause by: " + Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            }
            klineSubSettingViewModel = (KlineSubSettingViewModel) this.L$1;
            interfaceC56554yJr = (InterfaceC56554yJr) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (klineSubSettingViewModel.KWHzl((InterfaceC56554yJr<T, Object>) interfaceC56554yJr, obj, this) == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
