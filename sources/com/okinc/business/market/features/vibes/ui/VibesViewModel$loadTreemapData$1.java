package com.okinc.business.market.features.vibes.ui;

import com.okinc.business.market.features.vibes.domain.VibesSortType;
import com.okinc.business.market.features.vibes.domain.VibesTimeRange;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.kAH;
import o.kBE;

/* JADX INFO: loaded from: classes7.dex */
public final class VibesViewModel$loadTreemapData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ VibesSortType $sortType;
    final /* synthetic */ VibesTimeRange $timeRange;
    final /* synthetic */ String $tokenContractAddress;
    Object L$0;
    int label;
    final /* synthetic */ VibesViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VibesViewModel$loadTreemapData$1(VibesViewModel vibesViewModel, String str, String str2, VibesSortType vibesSortType, VibesTimeRange vibesTimeRange, Continuation<? super VibesViewModel$loadTreemapData$1> continuation) {
        super(2, continuation);
        this.this$0 = vibesViewModel;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
        this.$sortType = vibesSortType;
        this.$timeRange = vibesTimeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VibesViewModel$loadTreemapData$1(this.this$0, this.$chainId, this.$tokenContractAddress, this.$sortType, this.$timeRange, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VibesViewModel$loadTreemapData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object obj2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kAH kah = this.this$0.isConnected;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            VibesSortType vibesSortType = this.$sortType;
            VibesTimeRange vibesTimeRange = this.$timeRange;
            this.label = 1;
            objOLrzqt = kah.OLrzqt(str, str2, vibesSortType, vibesTimeRange, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                VibesViewModel vibesViewModel = this.this$0;
                if (Result.m7380exceptionOrNullimpl(obj2) != null) {
                    MutableStateFlow mutableStateFlow = vibesViewModel.valueOf;
                    kBE.Application application = kBE.Application.AEQbTJ;
                    this.L$0 = obj2;
                    this.label = 4;
                    if (mutableStateFlow.emit(application, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        obj2 = objOLrzqt;
        VibesViewModel vibesViewModel2 = this.this$0;
        VibesSortType vibesSortType2 = this.$sortType;
        if (Result.m7384isSuccessimpl(obj2)) {
            List list = (List) obj2;
            if (list.isEmpty()) {
                MutableStateFlow mutableStateFlow2 = vibesViewModel2.valueOf;
                kBE.Activity activity = kBE.Activity.EZpvd;
                this.L$0 = obj2;
                this.label = 2;
                if (mutableStateFlow2.emit(activity, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                MutableStateFlow mutableStateFlow3 = vibesViewModel2.valueOf;
                kBE.TaskDescription taskDescription = new kBE.TaskDescription(vibesSortType2, list);
                this.L$0 = obj2;
                this.label = 3;
                if (mutableStateFlow3.emit(taskDescription, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        }
        VibesViewModel vibesViewModel3 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(obj2) != null) {
        }
        return Unit.INSTANCE;
    }
}
