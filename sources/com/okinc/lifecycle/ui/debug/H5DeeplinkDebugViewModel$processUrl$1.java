package com.okinc.lifecycle.ui.debug;

import java.net.URI;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC38177pPb;
import o.C38092pLy;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC38117pMw;

/* JADX INFO: loaded from: classes9.dex */
public final class H5DeeplinkDebugViewModel$processUrl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $url;
    final /* synthetic */ URI $urlData;
    int label;
    final /* synthetic */ H5DeeplinkDebugViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H5DeeplinkDebugViewModel$processUrl$1(H5DeeplinkDebugViewModel h5DeeplinkDebugViewModel, URI uri, String str, Continuation<? super H5DeeplinkDebugViewModel$processUrl$1> continuation) {
        super(2, continuation);
        this.this$0 = h5DeeplinkDebugViewModel;
        this.$urlData = uri;
        this.$url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new H5DeeplinkDebugViewModel$processUrl$1(this.this$0, this.$urlData, this.$url, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((H5DeeplinkDebugViewModel$processUrl$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.KWHzl.setValue(null);
                InterfaceC38117pMw interfaceC38117pMw = this.this$0.AhwBna;
                String path = this.$urlData.getPath();
                Intrinsics.checkNotNullExpressionValue(path, "");
                this.label = 1;
                obj = interfaceC38117pMw.copydefault(path, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            H5DeeplinkDebugViewModel h5DeeplinkDebugViewModel = this.this$0;
            String str = this.$url;
            URI uri = this.$urlData;
            C38092pLy c38092pLy = (C38092pLy) obj;
            if (c38092pLy == null) {
                h5DeeplinkDebugViewModel.KWHzl.setValue(new AbstractC38177pPb.Application(str));
            } else {
                String strAEQbTJ = h5DeeplinkDebugViewModel.gEmmrt.AEQbTJ(uri, c38092pLy);
                if (strAEQbTJ.length() == 0) {
                    h5DeeplinkDebugViewModel.KWHzl.setValue(new AbstractC38177pPb.Application(str));
                } else {
                    h5DeeplinkDebugViewModel.KWHzl.setValue(new AbstractC38177pPb.ActionBar(strAEQbTJ, str));
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return Unit.INSTANCE;
    }
}
