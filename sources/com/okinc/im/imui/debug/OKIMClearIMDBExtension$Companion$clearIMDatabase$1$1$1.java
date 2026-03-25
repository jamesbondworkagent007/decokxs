package com.okinc.im.imui.debug;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C59449zhJ;

/* JADX INFO: loaded from: classes18.dex */
public final class OKIMClearIMDBExtension$Companion$clearIMDatabase$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKIMClearIMDBExtension$Companion$clearIMDatabase$1$1$1(Activity activity, Continuation<? super OKIMClearIMDBExtension$Companion$clearIMDatabase$1$1$1> continuation) {
        super(2, continuation);
        this.$activity = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKIMClearIMDBExtension$Companion$clearIMDatabase$1$1$1(this.$activity, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKIMClearIMDBExtension$Companion$clearIMDatabase$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String[] strArrDatabaseList = this.$activity.databaseList();
            Intrinsics.checkNotNullExpressionValue(strArrDatabaseList, "");
            ArrayList arrayList = new ArrayList();
            for (String str : strArrDatabaseList) {
                Intrinsics.copydefault((Object) str);
                if (C59449zhJ.startsWith$default(str, "in_house_im", false, 2, null) || C59449zhJ.startsWith$default(str, "ok_im", false, 2, null)) {
                    arrayList.add(str);
                }
            }
            Activity activity = this.$activity;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                activity.deleteDatabase((String) it.next());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
