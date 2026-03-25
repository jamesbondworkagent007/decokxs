package com.okinc.im.imui.group.members;

import com.okinc.im.imui.group.members.SelectableMemberListViewModel;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C35859oGi;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class SelectableMemberListViewModel$getUserInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $memberOfGroup;
    final /* synthetic */ String $userId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SelectableMemberListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableMemberListViewModel$getUserInfo$1(SelectableMemberListViewModel selectableMemberListViewModel, String str, String str2, Continuation<? super SelectableMemberListViewModel$getUserInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = selectableMemberListViewModel;
        this.$userId = str;
        this.$memberOfGroup = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SelectableMemberListViewModel$getUserInfo$1 selectableMemberListViewModel$getUserInfo$1 = new SelectableMemberListViewModel$getUserInfo$1(this.this$0, this.$userId, this.$memberOfGroup, continuation);
        selectableMemberListViewModel$getUserInfo$1.L$0 = obj;
        return selectableMemberListViewModel$getUserInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectableMemberListViewModel$getUserInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:12:0x0028, B:22:0x0066, B:24:0x006a, B:25:0x006f, B:26:0x007a, B:19:0x0054), top: B:44:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:12:0x0028, B:22:0x0066, B:24:0x006a, B:25:0x006f, B:26:0x007a, B:19:0x0054), top: B:44:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        RelationInfo relationInfo;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            MutableSharedFlow mutableSharedFlow = this.this$0.OLrzqt;
            SelectableMemberListViewModel.ActionBar.TaskDescription taskDescription = SelectableMemberListViewModel.ActionBar.TaskDescription.OLrzqt;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    obj2 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    SelectableMemberListViewModel selectableMemberListViewModel = this.this$0;
                    String str = this.$memberOfGroup;
                    if (Result.m7384isSuccessimpl(obj2)) {
                        MutableSharedFlow mutableSharedFlow2 = selectableMemberListViewModel.OLrzqt;
                        SelectableMemberListViewModel.ActionBar.C0438ActionBar c0438ActionBar = new SelectableMemberListViewModel.ActionBar.C0438ActionBar((RelationInfo) obj2, str);
                        this.L$0 = obj2;
                        this.label = 4;
                        if (mutableSharedFlow2.emit(c0438ActionBar, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                relationInfo = (RelationInfo) obj;
                if (relationInfo == null) {
                    objM7377constructorimpl = Result.m7377constructorimpl(relationInfo);
                    obj2 = objM7377constructorimpl;
                    SelectableMemberListViewModel selectableMemberListViewModel2 = this.this$0;
                    Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                        MutableSharedFlow mutableSharedFlow3 = selectableMemberListViewModel2.OLrzqt;
                        String message = thM7380exceptionOrNullimpl.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        SelectableMemberListViewModel.ActionBar.StateListAnimator stateListAnimator = new SelectableMemberListViewModel.ActionBar.StateListAnimator(message);
                        this.L$0 = obj2;
                        this.label = 3;
                        if (mutableSharedFlow3.emit(stateListAnimator, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    SelectableMemberListViewModel selectableMemberListViewModel3 = this.this$0;
                    String str2 = this.$memberOfGroup;
                    if (Result.m7384isSuccessimpl(obj2)) {
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            C56391yDq.AEQbTJ(obj);
        }
        SelectableMemberListViewModel selectableMemberListViewModel4 = this.this$0;
        String str3 = this.$userId;
        String str4 = this.$memberOfGroup;
        Result.Application application2 = Result.Companion;
        C35859oGi c35859oGi = selectableMemberListViewModel4.copydefault;
        this.L$0 = null;
        this.label = 2;
        obj = c35859oGi.copydefault(str3, str4, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        relationInfo = (RelationInfo) obj;
        if (relationInfo == null) {
        }
    }
}
