package com.okinc.im.usecase.group.members;

import com.okinc.okimcore.model.other.GroupMemberInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C34282nYe;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.oDO;
import o.oDQ;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class GetGroupMemberInfoListUseCase$invokeDisplayList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends C34282nYe>>, Object> {
    final /* synthetic */ String $groupId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ oDO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetGroupMemberInfoListUseCase$invokeDisplayList$2(oDO odo, String str, Continuation<? super GetGroupMemberInfoListUseCase$invokeDisplayList$2> continuation) {
        super(2, continuation);
        this.this$0 = odo;
        this.$groupId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetGroupMemberInfoListUseCase$invokeDisplayList$2 getGroupMemberInfoListUseCase$invokeDisplayList$2 = new GetGroupMemberInfoListUseCase$invokeDisplayList$2(this.this$0, this.$groupId, continuation);
        getGroupMemberInfoListUseCase$invokeDisplayList$2.L$0 = obj;
        return getGroupMemberInfoListUseCase$invokeDisplayList$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends C34282nYe>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<C34282nYe>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<C34282nYe>> continuation) {
        return ((GetGroupMemberInfoListUseCase$invokeDisplayList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                oDO odo = this.this$0;
                String str = this.$groupId;
                Result.Application application = Result.Companion;
                this.label = 1;
                obj = odo.EZpvd(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(oDQ.EZpvd((GroupMemberInfo) it.next()));
            }
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("GetGroupMemberInfoListUseCase", "Error fetching group member info list", thM7380exceptionOrNullimpl);
        }
        C56391yDq.AEQbTJ(objM7377constructorimpl);
        return objM7377constructorimpl;
    }
}
