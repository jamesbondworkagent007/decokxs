package com.okinc.planet.biz_performance.usecase;

import com.okinc.planet.biz_performance.data.PositionAssetDto;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.AbstractC43419rot;
import o.C46392tSq;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;
import o.tBE;
import o.tBG;

/* JADX INFO: loaded from: classes10.dex */
public final class FetchProfileAssetsUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends tBG>>, Object> {
    final /* synthetic */ String $input;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tBE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchProfileAssetsUseCase$execute$2(tBE tbe, String str, Continuation<? super FetchProfileAssetsUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = tbe;
        this.$input = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FetchProfileAssetsUseCase$execute$2 fetchProfileAssetsUseCase$execute$2 = new FetchProfileAssetsUseCase$execute$2(this.this$0, this.$input, continuation);
        fetchProfileAssetsUseCase$execute$2.L$0 = obj;
        return fetchProfileAssetsUseCase$execute$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends tBG>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<tBG>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<tBG>> continuation) {
        return ((FetchProfileAssetsUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            C46392tSq c46392tSq = C46392tSq.EZpvd;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (c46392tSq.AEQbTJ(this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return this.this$0.OLrzqt((List<PositionAssetDto>) ((AbstractC43419rot) obj).AEQbTJ());
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        CoroutineScope coroutineScope2 = coroutineScope;
        InterfaceC54581xNr interfaceC54581xNrEZpvd = this.this$0.EZpvd();
        if (interfaceC54581xNrEZpvd != null) {
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, this.this$0.copydefault, null, new FetchProfileAssetsUseCase$execute$2$assetsInfoAsync$1(this.this$0, this.$input, null), 2, null);
            this.this$0.EZpvd = interfaceC54581xNrEZpvd.KWHzl().AYXKKw("").gEmmrt();
            this.L$0 = null;
            this.label = 2;
            obj = deferredAsync$default.await(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            return this.this$0.OLrzqt((List<PositionAssetDto>) ((AbstractC43419rot) obj).AEQbTJ());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
