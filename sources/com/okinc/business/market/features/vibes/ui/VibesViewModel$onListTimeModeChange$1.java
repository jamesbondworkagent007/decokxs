package com.okinc.business.market.features.vibes.ui;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C27750kBz;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.kBA;

/* JADX INFO: loaded from: classes7.dex */
public final class VibesViewModel$onListTimeModeChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ VibesViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VibesViewModel$onListTimeModeChange$1(VibesViewModel vibesViewModel, Continuation<? super VibesViewModel$onListTimeModeChange$1> continuation) {
        super(2, continuation);
        this.this$0 = vibesViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VibesViewModel$onListTimeModeChange$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VibesViewModel$onListTimeModeChange$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kBA value = this.this$0.valueOf().getValue();
            kBA.Application application = value instanceof kBA.Application ? (kBA.Application) value : null;
            if (application != null) {
                MutableStateFlow mutableStateFlow = this.this$0.gEmmrt;
                List<VibesKolUiModel> listKWHzl = application.KWHzl();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
                for (VibesKolUiModel vibesKolUiModel : listKWHzl) {
                    arrayList.add(vibesKolUiModel.AEQbTJ((1023 & 1) != 0 ? vibesKolUiModel.AEQbTJ : null, (1023 & 2) != 0 ? vibesKolUiModel.AhwBna : null, (1023 & 4) != 0 ? vibesKolUiModel.djBIcL : null, (1023 & 8) != 0 ? vibesKolUiModel.gEmmrt : null, (1023 & 16) != 0 ? vibesKolUiModel.valueOf : null, (1023 & 32) != 0 ? vibesKolUiModel.KWHzl : null, (1023 & 64) != 0 ? vibesKolUiModel.copydefault : null, (1023 & 128) != 0 ? vibesKolUiModel.OLrzqt : null, (1023 & 256) != 0 ? vibesKolUiModel.EZpvd : null, (1023 & 512) != 0 ? vibesKolUiModel.AkhnZx : null, (1023 & 1024) != 0 ? vibesKolUiModel.AYXKKw : !((C27750kBz) r5.OLrzqt.getValue()).OLrzqt()));
                }
                kBA.Application applicationCopy$default = kBA.Application.copy$default(application, null, arrayList, 1, null);
                this.label = 1;
                if (mutableStateFlow.emit(applicationCopy$default, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        MutableStateFlow mutableStateFlow2 = this.this$0.OLrzqt;
        C27750kBz c27750kBzCopy$default = C27750kBz.copy$default(this.this$0.OLrzqt().getValue(), null, 0, null, null, !((C27750kBz) this.this$0.OLrzqt.getValue()).OLrzqt(), 15, null);
        this.label = 2;
        if (mutableStateFlow2.emit(c27750kBzCopy$default, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
