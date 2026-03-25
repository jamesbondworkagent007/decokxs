package com.okinc.im.imui.group.members;

import com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus;
import com.okinc.okimcore.model.other.GroupAddMembersResult;
import com.okinc.okimcore.model.remote.GroupAddOrRemoveMemberRequest;
import com.okinc.okimcore.model.remote.GroupScenarioType;
import com.okinc.okimcore.model.remote.GroupServiceType;
import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonObject;
import o.ActivityC34260nXj;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.sIR;

/* JADX INFO: loaded from: classes23.dex */
public final class ModifyMembersActivity$AddMembersFragment$performAddMembersAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<GroupAddMembersResult, Unit> $alert;
    final /* synthetic */ Function1<Throwable, Unit> $error;
    final /* synthetic */ List<RelationInfo> $list;
    final /* synthetic */ Function0<Unit> $success;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC34260nXj.Application this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.okimcore.model.other.GroupAddMembersResult, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModifyMembersActivity$AddMembersFragment$performAddMembersAction$1(ActivityC34260nXj.Application application, List<RelationInfo> list, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super GroupAddMembersResult, Unit> function12, Continuation<? super ModifyMembersActivity$AddMembersFragment$performAddMembersAction$1> continuation) {
        super(2, continuation);
        this.this$0 = application;
        this.$list = list;
        this.$error = function1;
        this.$success = function0;
        this.$alert = function12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ModifyMembersActivity$AddMembersFragment$performAddMembersAction$1 modifyMembersActivity$AddMembersFragment$performAddMembersAction$1 = new ModifyMembersActivity$AddMembersFragment$performAddMembersAction$1(this.this$0, this.$list, this.$error, this.$success, this.$alert, continuation);
        modifyMembersActivity$AddMembersFragment$performAddMembersAction$1.L$0 = obj;
        return modifyMembersActivity$AddMembersFragment$performAddMembersAction$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModifyMembersActivity$AddMembersFragment$performAddMembersAction$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
                if (interfaceC35180nqU == null) {
                    return Unit.INSTANCE;
                }
                this.this$0.showLoading();
                ActivityC34260nXj.Application application = this.this$0;
                List<RelationInfo> list = this.$list;
                Result.Application application2 = Result.Companion;
                long j = Long.parseLong(application.values().getGroupId());
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(((RelationInfo) it.next()).getContactsId());
                    if (fieldNames != null) {
                        arrayList.add(fieldNames);
                    }
                }
                GroupAddOrRemoveMemberRequest groupAddOrRemoveMemberRequest = new GroupAddOrRemoveMemberRequest(GroupServiceType.IM, GroupScenarioType.Default, j, CollectionsKt___CollectionsKt.OqFWZa(arrayList), (PaymentRequiredStatus) null, (JsonObject) null, 48, (DefaultConstructorMarker) null);
                sIR sirCopydefault = interfaceC35180nqU.AEQbTJ().copydefault();
                this.label = 1;
                obj = sirCopydefault.copydefault(groupAddOrRemoveMemberRequest, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((GroupAddMembersResult) obj);
        } catch (Throwable th) {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        ActivityC34260nXj.Application application4 = this.this$0;
        Function1<Throwable, Unit> function1 = this.$error;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            application4.dismissLoading();
            function1.invoke(thM7380exceptionOrNullimpl);
        }
        ActivityC34260nXj.Application application5 = this.this$0;
        Function0<Unit> function0 = this.$success;
        Function1<GroupAddMembersResult, Unit> function12 = this.$alert;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            GroupAddMembersResult groupAddMembersResult = (GroupAddMembersResult) objM7377constructorimpl;
            if (groupAddMembersResult.isAllAddSuccess()) {
                application5.dismissLoading();
                function0.invoke();
            } else {
                application5.dismissLoading();
                function12.invoke(groupAddMembersResult);
            }
        }
        return Unit.INSTANCE;
    }
}
