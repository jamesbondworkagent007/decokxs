package com.okinc.im.usecase.group.members;

import com.okinc.okimcore.model.exception.OKIMException;
import com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus;
import com.okinc.okimcore.model.other.GroupAddMembersResult;
import com.okinc.okimcore.model.remote.GroupAddOrRemoveMemberRequest;
import com.okinc.okimcore.model.remote.GroupScenarioType;
import com.okinc.okimcore.model.remote.GroupServiceType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonObject;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.oDR;
import o.pUU;
import o.sIR;

/* JADX INFO: loaded from: classes8.dex */
public final class AddMembersUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GroupAddMembersResult>, Object> {
    final /* synthetic */ Boolean $addNonPayingMember;
    final /* synthetic */ String $groupId;
    final /* synthetic */ GroupServiceType $groupServiceType;
    final /* synthetic */ GroupScenarioType $scenarioType;
    final /* synthetic */ List<String> $userIdList;
    int label;
    final /* synthetic */ oDR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMembersUseCase$execute$2(String str, List<String> list, Boolean bool, GroupServiceType groupServiceType, GroupScenarioType groupScenarioType, oDR odr, Continuation<? super AddMembersUseCase$execute$2> continuation) {
        super(2, continuation);
        this.$groupId = str;
        this.$userIdList = list;
        this.$addNonPayingMember = bool;
        this.$groupServiceType = groupServiceType;
        this.$scenarioType = groupScenarioType;
        this.this$0 = odr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddMembersUseCase$execute$2(this.$groupId, this.$userIdList, this.$addNonPayingMember, this.$groupServiceType, this.$scenarioType, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GroupAddMembersResult> continuation) {
        return ((AddMembersUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<String> list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            PaymentRequiredStatus paymentRequiredStatus = null;
            if (this.$groupId == null || (list = this.$userIdList) == null || list.isEmpty()) {
                pUU.KWHzl("AddMembersUseCase", "Not enough data");
                throw new OKIMException((String) null, 0, 3, (DefaultConstructorMarker) null);
            }
            Boolean bool = this.$addNonPayingMember;
            if (bool != null) {
                paymentRequiredStatus = Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true)) ? PaymentRequiredStatus.NOT_REQUIRED : PaymentRequiredStatus.REQUIRED;
            }
            PaymentRequiredStatus paymentRequiredStatus2 = paymentRequiredStatus;
            GroupServiceType groupServiceType = this.$groupServiceType;
            GroupScenarioType groupScenarioType = this.$scenarioType;
            long jValueOf = C33129mqd.valueOf(this.$groupId);
            List<String> list2 = this.$userIdList;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(C56443yFo.KWHzl(C33129mqd.valueOf((String) it.next())));
            }
            GroupAddOrRemoveMemberRequest groupAddOrRemoveMemberRequest = new GroupAddOrRemoveMemberRequest(groupServiceType, groupScenarioType, jValueOf, CollectionsKt___CollectionsKt.OqFWZa(arrayList), paymentRequiredStatus2, (JsonObject) null, 32, (DefaultConstructorMarker) null);
            sIR sir = this.this$0.OLrzqt;
            this.label = 1;
            obj = sir.copydefault(groupAddOrRemoveMemberRequest, this);
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
