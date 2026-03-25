package com.okinc.business.market.features.vibes.domain;

import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.kAH;
import o.kAP;
import o.kBB;
import o.kBC;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class FetchVibesTreemapUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends kBC>>>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ VibesSortType $sortType;
    final /* synthetic */ VibesTimeRange $timeRange;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ kAH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchVibesTreemapUseCase$invoke$2(kAH kah, String str, String str2, VibesSortType vibesSortType, VibesTimeRange vibesTimeRange, Continuation<? super FetchVibesTreemapUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = kah;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
        this.$sortType = vibesSortType;
        this.$timeRange = vibesTimeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FetchVibesTreemapUseCase$invoke$2(this.this$0, this.$chainId, this.$tokenContractAddress, this.$sortType, this.$timeRange, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends kBC>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends List<kBC>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<kBC>>> continuation) {
        return ((FetchVibesTreemapUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objM7377constructorimpl;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kAP kap = this.this$0.OLrzqt;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            VibesSortType vibesSortType = this.$sortType;
            VibesTopKolType vibesTopKolType = VibesTopKolType.TOP_10;
            VibesTimeRange vibesTimeRange = this.$timeRange;
            this.label = 1;
            objCopydefault = kap.copydefault(str, str2, vibesSortType, vibesTopKolType, vibesTimeRange, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        VibesSortType vibesSortType2 = this.$sortType;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            Result.Application application = Result.Companion;
            List list = (List) objCopydefault;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            int i2 = 0;
            for (Object obj2 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                arrayList.add(kBB.EZpvd((VibesKolData) obj2, i3, vibesSortType2));
                i2 = i3;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
        } else {
            objM7377constructorimpl = Result.m7377constructorimpl(objCopydefault);
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
