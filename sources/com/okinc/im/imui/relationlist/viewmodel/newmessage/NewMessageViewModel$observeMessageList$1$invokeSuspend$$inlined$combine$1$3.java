package com.okinc.im.imui.relationlist.viewmodel.newmessage;

import com.okinc.affiliate.bean.AffiliateIMPermission;
import com.okinc.im.imui.relationlist.model.ListButton;
import com.okinc.okimcore.model.other.VipManagerRelationInfo;
import com.okinc.okimcore.model.remote.UserInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class NewMessageViewModel$observeMessageList$1$invokeSuspend$$inlined$combine$1$3 extends SuspendLambda implements yHO<FlowCollector<? super List<? extends Object>>, Object[], Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ NewMessageViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewMessageViewModel$observeMessageList$1$invokeSuspend$$inlined$combine$1$3(Continuation continuation, NewMessageViewModel newMessageViewModel) {
        super(3, continuation);
        this.this$0 = newMessageViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super List<? extends Object>> flowCollector, Object[] objArr, Continuation<? super Unit> continuation) {
        NewMessageViewModel$observeMessageList$1$invokeSuspend$$inlined$combine$1$3 newMessageViewModel$observeMessageList$1$invokeSuspend$$inlined$combine$1$3 = new NewMessageViewModel$observeMessageList$1$invokeSuspend$$inlined$combine$1$3(continuation, this.this$0);
        newMessageViewModel$observeMessageList$1$invokeSuspend$$inlined$combine$1$3.L$0 = flowCollector;
        newMessageViewModel$observeMessageList$1$invokeSuspend$$inlined$combine$1$3.L$1 = objArr;
        return newMessageViewModel$observeMessageList$1$invokeSuspend$$inlined$combine$1$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Boolean allowCreateGroup;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Object[] objArr = (Object[]) this.L$1;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            VipManagerRelationInfo vipManagerRelationInfo = (VipManagerRelationInfo) objArr[5];
            boolean zBooleanValue = ((Boolean) obj6).booleanValue();
            AffiliateIMPermission affiliateIMPermission = (AffiliateIMPermission) obj5;
            UserInfo userInfo = (UserInfo) obj4;
            List list = (List) obj3;
            List list2 = (List) obj2;
            this.this$0.DbNXlk = userInfo;
            boolean allowCreateAffiliateGroup = affiliateIMPermission != null ? affiliateIMPermission.getAllowCreateAffiliateGroup() : false;
            boolean allowSendBroadcastMessage = affiliateIMPermission != null ? affiliateIMPermission.getAllowSendBroadcastMessage() : false;
            boolean zBooleanValue2 = (userInfo == null || (allowCreateGroup = userInfo.getAllowCreateGroup()) == null) ? true : allowCreateGroup.booleanValue();
            ListButton[] listButtonArr = new ListButton[4];
            ListButton listButton = ListButton.NEW_GROUP;
            if (!zBooleanValue2) {
                listButton = null;
            }
            listButtonArr[0] = listButton;
            listButtonArr[1] = ListButton.ADD_BY_PHONE_NUMBER;
            ListButton listButton2 = ListButton.NEW_INVITEES_GROUP;
            if (!allowCreateAffiliateGroup) {
                listButton2 = null;
            }
            listButtonArr[2] = listButton2;
            listButtonArr[3] = allowSendBroadcastMessage ? ListButton.NEW_BROADCAST : null;
            List listKWHzl = this.this$0.KWHzl(yDY.valueOf(listButtonArr), list2, list, zBooleanValue, vipManagerRelationInfo);
            this.label = 1;
            if (flowCollector.emit(listKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
