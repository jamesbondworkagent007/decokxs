package com.okinc.lifecycle.ui.debug;

import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C38092pLy;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC38106pMl;

/* JADX INFO: loaded from: classes9.dex */
public final class H5DeeplinkDebugViewModel$getH5DeeplinkMappings$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ H5DeeplinkDebugViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H5DeeplinkDebugViewModel$getH5DeeplinkMappings$1(H5DeeplinkDebugViewModel h5DeeplinkDebugViewModel, Continuation<? super H5DeeplinkDebugViewModel$getH5DeeplinkMappings$1> continuation) {
        super(2, continuation);
        this.this$0 = h5DeeplinkDebugViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new H5DeeplinkDebugViewModel$getH5DeeplinkMappings$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((H5DeeplinkDebugViewModel$getH5DeeplinkMappings$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Set<Map.Entry> setEntrySet;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC38106pMl interfaceC38106pMl = this.this$0.AYXKKw;
                this.label = 1;
                obj = interfaceC38106pMl.EZpvd(this);
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
            Objects.toString(responseData);
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                ArrayList arrayList = new ArrayList();
                Map map = (Map) responseData.getData();
                if (map != null && (setEntrySet = map.entrySet()) != null) {
                    for (Map.Entry entry : setEntrySet) {
                        String str = (String) entry.getKey();
                        String str2 = (String) ((Map) entry.getValue()).get("deeplink");
                        String str3 = "";
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str4 = (String) ((Map) entry.getValue()).get("dsl");
                        if (str4 != null) {
                            str3 = str4;
                        }
                        arrayList.add(new C38092pLy(str, str2, str3));
                    }
                }
                this.this$0.EZpvd.setValue(arrayList);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return Unit.INSTANCE;
    }
}
