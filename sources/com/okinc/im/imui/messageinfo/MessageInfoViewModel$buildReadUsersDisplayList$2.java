package com.okinc.im.imui.messageinfo;

import com.okinc.okimcore.model.remote.ReadUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import o.C34282nYe;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.sDZ;
import o.sIR;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class MessageInfoViewModel$buildReadUsersDisplayList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends C34282nYe>>, Object> {
    final /* synthetic */ String $groupId;
    final /* synthetic */ List<ReadUser> $users;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageInfoViewModel$buildReadUsersDisplayList$2(String str, List<ReadUser> list, Continuation<? super MessageInfoViewModel$buildReadUsersDisplayList$2> continuation) {
        super(2, continuation);
        this.$groupId = str;
        this.$users = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessageInfoViewModel$buildReadUsersDisplayList$2 messageInfoViewModel$buildReadUsersDisplayList$2 = new MessageInfoViewModel$buildReadUsersDisplayList$2(this.$groupId, this.$users, continuation);
        messageInfoViewModel$buildReadUsersDisplayList$2.L$0 = obj;
        return messageInfoViewModel$buildReadUsersDisplayList$2;
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
        return ((MessageInfoViewModel$buildReadUsersDisplayList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ba -> B:34:0x00bd). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Iterator it;
        Collection collection;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            if (StringsKt__StringsKt.fARcdN((CharSequence) this.$groupId) || this.$users.isEmpty()) {
                return yDY.AhwBna();
            }
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(sDZ.AEQbTJ.AhwBna().copydefault());
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            sIR sir = (sIR) objM7377constructorimpl;
            if (sir == null) {
                return yDY.AhwBna();
            }
            List<ReadUser> list = this.$users;
            String str = this.$groupId;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, Dispatchers.getIO(), null, new MessageInfoViewModel$buildReadUsersDisplayList$2$1$1(sir, str, (ReadUser) it2.next(), null), 2, null));
            }
            ArrayList arrayList2 = new ArrayList();
            it = arrayList.iterator();
            collection = arrayList2;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$1;
            collection = (Collection) this.L$0;
            C56391yDq.AEQbTJ(obj);
            C34282nYe c34282nYe = (C34282nYe) obj;
            if (c34282nYe != null) {
                collection.add(c34282nYe);
            }
            if (it.hasNext()) {
                Deferred deferred = (Deferred) it.next();
                this.L$0 = collection;
                this.L$1 = it;
                this.label = 1;
                obj = deferred.await(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                C34282nYe c34282nYe2 = (C34282nYe) obj;
                if (c34282nYe2 != null) {
                }
                if (it.hasNext()) {
                    return (List) collection;
                }
            }
        }
    }
}
