package com.okinc.find_ui.widgetprovider.logic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.sync.Mutex;
import o.C35119npM;
import o.C35192nqg;
import o.C43296rmc;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes8.dex */
public final class AppWidgetSearchViewModel$markSelected$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C35119npM.Application $bizInfWrap;
    final /* synthetic */ boolean $isChecked;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final /* synthetic */ C35119npM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetSearchViewModel$markSelected$2(C35119npM c35119npM, boolean z, C35119npM.Application application, Continuation<? super AppWidgetSearchViewModel$markSelected$2> continuation) {
        super(2, continuation);
        this.this$0 = c35119npM;
        this.$isChecked = z;
        this.$bizInfWrap = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppWidgetSearchViewModel$markSelected$2(this.this$0, this.$isChecked, this.$bizInfWrap, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppWidgetSearchViewModel$markSelected$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Mutex mutex;
        C35119npM c35119npM;
        boolean z;
        C35119npM.Application application;
        List<C35119npM.Application> value;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            mutex = this.this$0.isConnected;
            c35119npM = this.this$0;
            boolean z2 = this.$isChecked;
            C35119npM.Application application2 = this.$bizInfWrap;
            this.L$0 = mutex;
            this.L$1 = c35119npM;
            this.L$2 = application2;
            this.Z$0 = z2;
            this.label = 1;
            if (mutex.lock(null, this) == objCopydefault) {
                return objCopydefault;
            }
            z = z2;
            application = application2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.Z$0;
            application = (C35119npM.Application) this.L$2;
            c35119npM = (C35119npM) this.L$1;
            mutex = (Mutex) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        try {
            C43296rmc.AEQbTJ("AppWidgetSearchViewModel", "markSelected() called");
            MutableStateFlow<List<C35119npM.Application>> mutableStateFlowOLrzqt = c35119npM.OLrzqt();
            do {
                value = mutableStateFlowOLrzqt.getValue();
                List<C35119npM.Application> list = value;
                int i3 = 0;
                if ((list instanceof Collection) && list.isEmpty()) {
                    i = 0;
                } else {
                    Iterator<T> it = list.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if (((C35119npM.Application) it.next()).OLrzqt() == 1 && (i = i + 1) < 0) {
                            yDY.djBIcL();
                        }
                    }
                }
                int i4 = z ? i + 1 : i - 1;
                String str = c35119npM.fetchVPNInfo;
                if (str == null) {
                    str = "";
                }
                if (i4 >= C35192nqg.AEQbTJ(str)) {
                    i3 = 2;
                }
                int i5 = i3;
                arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                for (C35119npM.Application applicationCopy$default : list) {
                    if (Intrinsics.EZpvd(applicationCopy$default.KWHzl(), application.KWHzl())) {
                        applicationCopy$default = C35119npM.Application.copy$default(applicationCopy$default, null, z ? 1 : 0, false, 5, null);
                    } else if (applicationCopy$default.OLrzqt() != 1) {
                        arrayList2 = arrayList;
                        applicationCopy$default = C35119npM.Application.copy$default(applicationCopy$default, null, i5, false, 5, null);
                        arrayList2.add(applicationCopy$default);
                        arrayList = arrayList2;
                    }
                    arrayList2 = arrayList;
                    arrayList2.add(applicationCopy$default);
                    arrayList = arrayList2;
                }
            } while (!mutableStateFlowOLrzqt.compareAndSet(value, arrayList));
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }
}
