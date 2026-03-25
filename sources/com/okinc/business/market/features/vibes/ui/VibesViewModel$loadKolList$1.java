package com.okinc.business.market.features.vibes.ui;

import com.okinc.business.market.features.vibes.domain.VibesSortType;
import com.okinc.business.market.features.vibes.domain.VibesTimeRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.kAK;
import o.kBA;

/* JADX INFO: loaded from: classes7.dex */
public final class VibesViewModel$loadKolList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ VibesSortType $sortType;
    final /* synthetic */ VibesTimeRange $timeRange;
    final /* synthetic */ String $tokenContractAddress;
    Object L$0;
    int label;
    final /* synthetic */ VibesViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VibesViewModel$loadKolList$1(VibesViewModel vibesViewModel, String str, String str2, VibesSortType vibesSortType, VibesTimeRange vibesTimeRange, Continuation<? super VibesViewModel$loadKolList$1> continuation) {
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
        return new VibesViewModel$loadKolList$1(this.this$0, this.$chainId, this.$tokenContractAddress, this.$sortType, this.$timeRange, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VibesViewModel$loadKolList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        kBA application;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kAK kak = this.this$0.AYXKKw;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            VibesSortType vibesSortType = this.$sortType;
            VibesTimeRange vibesTimeRange = this.$timeRange;
            this.label = 1;
            objAEQbTJ = kak.AEQbTJ(str, str2, vibesSortType, vibesTimeRange, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                objAEQbTJ = this.L$0;
                C56391yDq.AEQbTJ(obj);
                VibesViewModel vibesViewModel = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
                    MutableStateFlow mutableStateFlow = vibesViewModel.gEmmrt;
                    kBA.Activity activity = kBA.Activity.OLrzqt;
                    this.L$0 = objAEQbTJ;
                    this.label = 3;
                    if (mutableStateFlow.emit(activity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        VibesViewModel vibesViewModel2 = this.this$0;
        VibesSortType vibesSortType2 = this.$sortType;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            List<VibesKolUiModel> list = (List) objAEQbTJ;
            MutableStateFlow mutableStateFlow2 = vibesViewModel2.gEmmrt;
            if (list.isEmpty()) {
                application = kBA.ActionBar.EZpvd;
            } else {
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                for (VibesKolUiModel vibesKolUiModel : list) {
                    arrayList.add(vibesKolUiModel.AEQbTJ((1023 & 1) != 0 ? vibesKolUiModel.AEQbTJ : null, (1023 & 2) != 0 ? vibesKolUiModel.AhwBna : null, (1023 & 4) != 0 ? vibesKolUiModel.djBIcL : null, (1023 & 8) != 0 ? vibesKolUiModel.gEmmrt : null, (1023 & 16) != 0 ? vibesKolUiModel.valueOf : null, (1023 & 32) != 0 ? vibesKolUiModel.KWHzl : null, (1023 & 64) != 0 ? vibesKolUiModel.copydefault : null, (1023 & 128) != 0 ? vibesKolUiModel.OLrzqt : null, (1023 & 256) != 0 ? vibesKolUiModel.EZpvd : null, (1023 & 512) != 0 ? vibesKolUiModel.AkhnZx : null, (1023 & 1024) != 0 ? vibesKolUiModel.AYXKKw : vibesViewModel2.OLrzqt().getValue().OLrzqt()));
                }
                application = new kBA.Application(vibesSortType2, arrayList);
            }
            this.L$0 = objAEQbTJ;
            this.label = 2;
            if (mutableStateFlow2.emit(application, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        VibesViewModel vibesViewModel3 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
        }
        return Unit.INSTANCE;
    }
}
