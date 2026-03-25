package com.okinc.business.market.features.address_tracker.domain;

import android.content.Context;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25640jAx;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC25657jBn;
import o.jAF;
import o.jAT;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerApiKt$checkFollow$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C25640jAx $addressTrackerNotificationUseCase;
    final /* synthetic */ jAF $batchUpdateTrackerGroupUseCase;
    final /* synthetic */ Function1<Boolean, Unit> $callback;
    final /* synthetic */ String $collectAddress;
    final /* synthetic */ Context $context;
    final /* synthetic */ List<CommonGroupUiModel> $groupData;
    final /* synthetic */ boolean $showToast;
    final /* synthetic */ InterfaceC25657jBn $type;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TrackerApiKt$checkFollow$4$1(jAF jaf, C25640jAx c25640jAx, InterfaceC25657jBn interfaceC25657jBn, String str, List<CommonGroupUiModel> list, boolean z, Context context, Function1<? super Boolean, Unit> function1, Continuation<? super TrackerApiKt$checkFollow$4$1> continuation) {
        super(2, continuation);
        this.$batchUpdateTrackerGroupUseCase = jaf;
        this.$addressTrackerNotificationUseCase = c25640jAx;
        this.$type = interfaceC25657jBn;
        this.$collectAddress = str;
        this.$groupData = list;
        this.$showToast = z;
        this.$context = context;
        this.$callback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerApiKt$checkFollow$4$1(this.$batchUpdateTrackerGroupUseCase, this.$addressTrackerNotificationUseCase, this.$type, this.$collectAddress, this.$groupData, this.$showToast, this.$context, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerApiKt$checkFollow$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            jAF jaf = this.$batchUpdateTrackerGroupUseCase;
            C25640jAx c25640jAx = this.$addressTrackerNotificationUseCase;
            InterfaceC25657jBn interfaceC25657jBn = this.$type;
            String str = this.$collectAddress;
            List<CommonGroupUiModel> list = this.$groupData;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((CommonGroupUiModel) obj2).copydefault()) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(C56443yFo.AEQbTJ(((CommonGroupUiModel) it.next()).KWHzl()));
            }
            boolean z = this.$showToast;
            Context context = this.$context;
            Function1<Boolean, Unit> function1 = this.$callback;
            this.label = 1;
            if (jAT.copydefault(jaf, c25640jAx, interfaceC25657jBn, str, (List<Integer>) arrayList2, z, context, (Function1<? super Boolean, Unit>) function1, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
