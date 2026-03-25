package com.okinc.okimcore.feature.group.manager;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.constant.SetGroupRolesKeys;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.model.remote.SetOrRemoveAdminReq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C44261sJg;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMGroupManagerImpl$setOrRemoveGroupAdmin$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<Unit>>, Object> {
    final /* synthetic */ String $groupId;
    final /* synthetic */ boolean $isAdd;
    final /* synthetic */ List<String> $memberIds;
    int label;
    final /* synthetic */ C44261sJg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMGroupManagerImpl$setOrRemoveGroupAdmin$2(String str, List<String> list, boolean z, C44261sJg c44261sJg, Continuation<? super InHouseIMGroupManagerImpl$setOrRemoveGroupAdmin$2> continuation) {
        super(2, continuation);
        this.$groupId = str;
        this.$memberIds = list;
        this.$isAdd = z;
        this.this$0 = c44261sJg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMGroupManagerImpl$setOrRemoveGroupAdmin$2(this.$groupId, this.$memberIds, this.$isAdd, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<Unit>> continuation) {
        return ((InHouseIMGroupManagerImpl$setOrRemoveGroupAdmin$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            long jValueOf = C33129mqd.valueOf(this.$groupId);
            List<String> list = this.$memberIds;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C56443yFo.KWHzl(C33129mqd.valueOf((String) it.next())));
            }
            SetOrRemoveAdminReq setOrRemoveAdminReq = new SetOrRemoveAdminReq(jValueOf, arrayList, (this.$isAdd ? SetGroupRolesKeys.Admin : SetGroupRolesKeys.Normal).getValue());
            InHouseIMGroupService inHouseIMGroupService = this.this$0.AEQbTJ;
            this.label = 1;
            obj = inHouseIMGroupService.setOrRemoveGroupAdmin(setOrRemoveAdminReq, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
