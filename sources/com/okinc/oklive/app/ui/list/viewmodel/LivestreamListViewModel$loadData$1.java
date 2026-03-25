package com.okinc.oklive.app.ui.list.viewmodel;

import com.okinc.oklive.app.data.model.remote.LivestreamInfoResponse;
import com.okinc.oklive.app.data.repository.remote.RecordedStreamsResponse;
import com.okinc.oklive.app.data.repository.remote.RecordingInfoResponse;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC44569sUu;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.sUN;
import o.yDY;

/* JADX INFO: loaded from: classes19.dex */
public final class LivestreamListViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $forceRestartMonitoring;
    final /* synthetic */ long $uidLong;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ sUN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamListViewModel$loadData$1(sUN sun, long j, boolean z, Continuation<? super LivestreamListViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = sun;
        this.$uidLong = j;
        this.$forceRestartMonitoring = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LivestreamListViewModel$loadData$1 livestreamListViewModel$loadData$1 = new LivestreamListViewModel$loadData$1(this.this$0, this.$uidLong, this.$forceRestartMonitoring, continuation);
        livestreamListViewModel$loadData$1.L$0 = obj;
        return livestreamListViewModel$loadData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LivestreamListViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferred;
        LivestreamInfoResponse livestreamInfoResponse;
        Object objM7386unboximpl;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            this.this$0.gEmmrt.setValue(sUN.TaskDescription.Activity.copydefault);
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new LivestreamListViewModel$loadData$1$previewDef$1(this.this$0, this.$uidLong, null), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new LivestreamListViewModel$loadData$1$recordDef$1(this.this$0, this.$uidLong, null), 3, null);
            this.L$0 = deferredAsync$default2;
            this.label = 1;
            Object objAwait = deferredAsync$default.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            deferred = deferredAsync$default2;
            obj = objAwait;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                livestreamInfoResponse = (LivestreamInfoResponse) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                sUN sun = this.this$0;
                boolean z = this.$forceRestartMonitoring;
                if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    RecordedStreamsResponse recordedStreamsResponse = (RecordedStreamsResponse) objM7386unboximpl;
                    boolean zDjBIcL = sun.djBIcL();
                    List listOLrzqt = C56402yEa.OLrzqt();
                    if (livestreamInfoResponse != null) {
                        C56443yFo.KWHzl(listOLrzqt.add(sun.copydefault(livestreamInfoResponse)));
                    }
                    if (!zDjBIcL && livestreamInfoResponse != null) {
                        listOLrzqt.add(AbstractC44569sUu.Application.EZpvd);
                    } else if (zDjBIcL) {
                        List<RecordingInfoResponse> items = recordedStreamsResponse.getItems();
                        if (items == null) {
                            items = yDY.AhwBna();
                        }
                        listOLrzqt.addAll(sun.copydefault((List<RecordingInfoResponse>) items, true, livestreamInfoResponse != null));
                    }
                    List listFARcdN = C56402yEa.fARcdN(listOLrzqt);
                    sun.fARcdN = zDjBIcL ? recordedStreamsResponse.hasMorePages() : false;
                    sun.AYXKKw = recordedStreamsResponse.getPageIndex();
                    if (listFARcdN.isEmpty()) {
                        sun.gEmmrt.setValue(!zDjBIcL ? sUN.TaskDescription.ActionBar.EZpvd : sUN.TaskDescription.C0943TaskDescription.AEQbTJ);
                    } else {
                        sun.OLrzqt.setValue(listFARcdN);
                        sun.gEmmrt.setValue(sUN.TaskDescription.FragmentManager.OLrzqt);
                        sun.copydefault((List<? extends AbstractC44569sUu>) listFARcdN, z);
                    }
                    sun.AuCTel = true;
                    sun.uzCIH = false;
                }
                sUN sun2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("LivestreamListViewModel", "Failed to load recordings", thM7380exceptionOrNullimpl);
                    if (!sun2.fJNWhG()) {
                        sun2.gEmmrt.setValue(sUN.TaskDescription.Application.AEQbTJ);
                    } else if (livestreamInfoResponse == null) {
                        MutableStateFlow mutableStateFlow = sun2.gEmmrt;
                        String message = thM7380exceptionOrNullimpl.getMessage();
                        if (message == null) {
                            message = "Unknown error";
                        }
                        mutableStateFlow.setValue(new sUN.TaskDescription.StateListAnimator(message));
                    } else {
                        sun2.OLrzqt.setValue(yDY.gEmmrt(sun2.copydefault(livestreamInfoResponse), AbstractC44569sUu.TaskDescription.copydefault));
                        sun2.gEmmrt.setValue(sUN.TaskDescription.FragmentManager.OLrzqt);
                    }
                    sun2.uzCIH = false;
                }
                return Unit.INSTANCE;
            }
            deferred = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        LivestreamInfoResponse livestreamInfoResponse2 = (LivestreamInfoResponse) obj;
        this.L$0 = livestreamInfoResponse2;
        this.label = 2;
        Object objAwait2 = deferred.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        livestreamInfoResponse = livestreamInfoResponse2;
        obj = objAwait2;
        objM7386unboximpl = ((Result) obj).m7386unboximpl();
        sUN sun3 = this.this$0;
        boolean z2 = this.$forceRestartMonitoring;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
        }
        sUN sun22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
