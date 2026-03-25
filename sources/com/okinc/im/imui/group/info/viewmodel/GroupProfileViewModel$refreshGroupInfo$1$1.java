package com.okinc.im.imui.group.info.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import com.okinc.okimcore.model.other.GroupInfo;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.oDA;
import o.oDO;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupProfileViewModel$refreshGroupInfo$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $groupId;
    final /* synthetic */ boolean $updateMemberList;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ GroupProfileViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupProfileViewModel$refreshGroupInfo$1$1(GroupProfileViewModel groupProfileViewModel, boolean z, String str, Continuation<? super GroupProfileViewModel$refreshGroupInfo$1$1> continuation) {
        super(2, continuation);
        this.this$0 = groupProfileViewModel;
        this.$updateMemberList = z;
        this.$groupId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupProfileViewModel$refreshGroupInfo$1$1 groupProfileViewModel$refreshGroupInfo$1$1 = new GroupProfileViewModel$refreshGroupInfo$1$1(this.this$0, this.$updateMemberList, this.$groupId, continuation);
        groupProfileViewModel$refreshGroupInfo$1$1.L$0 = obj;
        return groupProfileViewModel$refreshGroupInfo$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupProfileViewModel$refreshGroupInfo$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:50:0x000c */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r2v12, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r2v13, resolved type: androidx.lifecycle.SavedStateHandle */
    /* JADX DEBUG: Multi-variable search result rejected for r2v14, resolved type: androidx.lifecycle.SavedStateHandle */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: androidx.lifecycle.SavedStateHandle */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARN: Type inference failed for: r2v1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objM7377constructorimpl2;
        SavedStateHandle savedStateHandle;
        Throwable thM7380exceptionOrNullimpl;
        String str = "KEY_GROUP_INFO";
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } catch (Throwable th2) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
            savedStateHandle = i;
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            SavedStateHandle savedStateHandle2 = this.this$0.fARcdN;
            GroupProfileViewModel groupProfileViewModel = this.this$0;
            String str2 = this.$groupId;
            Result.Application application3 = Result.Companion;
            oDA oda = groupProfileViewModel.AkhnZx;
            this.L$0 = coroutineScope;
            this.L$1 = savedStateHandle2;
            this.L$2 = "KEY_GROUP_INFO";
            this.label = 1;
            obj = oda.copydefault(str2, this);
            i = savedStateHandle2;
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
                GroupProfileViewModel groupProfileViewModel2 = this.this$0;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    List list = (List) objM7377constructorimpl;
                    pUU.KWHzl("GroupProfileViewModel", "Member list refreshed successfully, size=" + list.size());
                    groupProfileViewModel2.AhwBna = list;
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("GroupProfileViewModel", "Failed to refresh member list", thM7380exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
            str = (String) this.L$2;
            SavedStateHandle savedStateHandle3 = (SavedStateHandle) this.L$1;
            C56391yDq.AEQbTJ(obj);
            i = savedStateHandle3;
        }
        objM7377constructorimpl2 = Result.m7377constructorimpl((GroupInfo) obj);
        savedStateHandle = i;
        Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
        if (thM7380exceptionOrNullimpl2 != null) {
            pUU.AEQbTJ("GroupProfileViewModel", "Failed to refresh group info", thM7380exceptionOrNullimpl2);
            Unit unit = Unit.INSTANCE;
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl2)) {
            pUU.KWHzl("GroupProfileViewModel", "Group info refreshed successfully");
            Unit unit2 = Unit.INSTANCE;
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
            objM7377constructorimpl2 = null;
        }
        savedStateHandle.set(str, objM7377constructorimpl2);
        if (this.$updateMemberList) {
            GroupProfileViewModel groupProfileViewModel3 = this.this$0;
            String str3 = this.$groupId;
            Result.Application application4 = Result.Companion;
            oDO odo = groupProfileViewModel3.values;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            obj = odo.EZpvd(str3, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
            GroupProfileViewModel groupProfileViewModel22 = this.this$0;
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
        }
        return Unit.INSTANCE;
    }
}
