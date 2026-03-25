package com.okinc.im.imui.utils;

import com.okinc.okimcore.model.other.GroupMemberInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32979mnm;
import o.C56391yDq;
import o.C56442yFn;
import o.C58113yvE;
import o.InterfaceC35331ntM;
import o.oDT;

/* JADX INFO: loaded from: classes8.dex */
public final class IMExtKt$loadMemberInfoById$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Throwable, Unit> $error;
    final /* synthetic */ String $groupId;
    final /* synthetic */ Function1<GroupMemberInfo, Unit> $success;
    final /* synthetic */ String $this_loadMemberInfoById;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.okimcore.model.other.GroupMemberInfo, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IMExtKt$loadMemberInfoById$1(String str, String str2, Function1<? super Throwable, Unit> function1, Function1<? super GroupMemberInfo, Unit> function12, Continuation<? super IMExtKt$loadMemberInfoById$1> continuation) {
        super(2, continuation);
        this.$groupId = str;
        this.$this_loadMemberInfoById = str2;
        this.$error = function1;
        this.$success = function12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IMExtKt$loadMemberInfoById$1 iMExtKt$loadMemberInfoById$1 = new IMExtKt$loadMemberInfoById$1(this.$groupId, this.$this_loadMemberInfoById, this.$error, this.$success, continuation);
        iMExtKt$loadMemberInfoById$1.L$0 = obj;
        return iMExtKt$loadMemberInfoById$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IMExtKt$loadMemberInfoById$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        GroupMemberInfo groupMemberInfo;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                oDT odtFfGIBT = ((InterfaceC35331ntM) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC35331ntM.class)).ffGIBT();
                String str = this.$groupId;
                String str2 = this.$this_loadMemberInfoById;
                Result.Application application = Result.Companion;
                this.label = 1;
                obj = oDT.invoke$default(odtFfGIBT, str, str2, false, this, 4, null);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            groupMemberInfo = (GroupMemberInfo) obj;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (groupMemberInfo != null) {
            objM7377constructorimpl = Result.m7377constructorimpl(groupMemberInfo);
            Function1<Throwable, Unit> function1 = this.$error;
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                function1.invoke(thM7380exceptionOrNullimpl);
            }
            Function1<GroupMemberInfo, Unit> function12 = this.$success;
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                function12.invoke((GroupMemberInfo) objM7377constructorimpl);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
