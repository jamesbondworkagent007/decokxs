package com.okinc.planet.biz_positions;

import com.okinc.planet.biz_positions.data.LatestRecordDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC46197tLk;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;
import o.tEF;
import o.tEM;
import o.tGA;
import o.tQX;

/* JADX INFO: loaded from: classes19.dex */
public final class LatestRecordsViewModel$loadData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $instId;
    final /* synthetic */ String $instType;
    final /* synthetic */ boolean $reset;
    final /* synthetic */ String $uniqueName;
    int label;
    final /* synthetic */ tEM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LatestRecordsViewModel$loadData$2(tEM tem, String str, String str2, String str3, boolean z, Continuation<? super LatestRecordsViewModel$loadData$2> continuation) {
        super(2, continuation);
        this.this$0 = tem;
        this.$uniqueName = str;
        this.$instId = str2;
        this.$instType = str3;
        this.$reset = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LatestRecordsViewModel$loadData$2(this.this$0, this.$uniqueName, this.$instId, this.$instType, this.$reset, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LatestRecordsViewModel$loadData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List listFARcdN;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!(this.this$0.EZpvd.getValue() instanceof AbstractC46197tLk.StateListAnimator)) {
                this.this$0.EZpvd.setValue(AbstractC46197tLk.Companion.OLrzqt(false));
            }
            tGA tga = this.this$0.djBIcL;
            tGA.Activity activity = new tGA.Activity(this.$uniqueName, this.$instId, this.$instType, this.$reset, this.this$0.KWHzl() ? 7 : 20, null);
            this.label = 1;
            obj = tga.AEQbTJ(activity, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        tQX.TaskDescription taskDescription = (tQX.TaskDescription) obj;
        MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
        AbstractC46197tLk.TaskDescription taskDescription2 = AbstractC46197tLk.Companion;
        boolean zCopydefault = taskDescription.copydefault();
        if (this.this$0.KWHzl()) {
            List listOLrzqt = C56402yEa.OLrzqt();
            List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((Iterable) taskDescription.OLrzqt(), 6);
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
            Iterator it = listAhwBna.iterator();
            while (it.hasNext()) {
                arrayList.add(tEF.StateListAnimator.Companion.OLrzqt((LatestRecordDto) it.next()));
            }
            listOLrzqt.addAll(arrayList);
            if (taskDescription.copydefault()) {
                listOLrzqt.add(tEF.TaskDescription.AEQbTJ);
            }
            Unit unit = Unit.INSTANCE;
            listFARcdN = C56402yEa.fARcdN(listOLrzqt);
        } else {
            List listOLrzqt2 = taskDescription.OLrzqt();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listOLrzqt2, 10));
            Iterator it2 = listOLrzqt2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(tEF.StateListAnimator.Companion.OLrzqt((LatestRecordDto) it2.next()));
            }
            listFARcdN = arrayList2;
        }
        mutableStateFlow.setValue(taskDescription2.KWHzl(new tEM.TaskDescription(zCopydefault, listFARcdN)));
        return Unit.INSTANCE;
    }
}
