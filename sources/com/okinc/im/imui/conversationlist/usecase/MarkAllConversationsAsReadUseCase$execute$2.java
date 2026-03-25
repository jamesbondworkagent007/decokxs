package com.okinc.im.imui.conversationlist.usecase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C33842nHw;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.rXL;

/* JADX INFO: loaded from: classes18.dex */
public final class MarkAllConversationsAsReadUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    final /* synthetic */ C33842nHw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkAllConversationsAsReadUseCase$execute$2(C33842nHw c33842nHw, Continuation<? super MarkAllConversationsAsReadUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = c33842nHw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarkAllConversationsAsReadUseCase$execute$2 markAllConversationsAsReadUseCase$execute$2 = new MarkAllConversationsAsReadUseCase$execute$2(this.this$0, continuation);
        markAllConversationsAsReadUseCase$execute$2.L$0 = obj;
        return markAllConversationsAsReadUseCase$execute$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((MarkAllConversationsAsReadUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0145 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0154 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00e4 -> B:23:0x00e6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferredAsync$default;
        Deferred deferredAsync$default2;
        Collection arrayList;
        Iterator it;
        List list;
        Object objAwait;
        boolean zBooleanValue;
        Iterator it2;
        int i;
        Object objAwait2;
        int i2;
        boolean z;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = this.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List<rXL> listKWHzl = rXL.Companion.KWHzl();
            C33842nHw c33842nHw = this.this$0;
            int i4 = 10;
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
            Iterator<T> it3 = listKWHzl.iterator();
            while (it3.hasNext()) {
                arrayList2.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new MarkAllConversationsAsReadUseCase$execute$2$markNotificationJobList$1$1(c33842nHw, (rXL) it3.next(), null), 3, null));
                i4 = i4;
            }
            deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new MarkAllConversationsAsReadUseCase$execute$2$markAllJob$1(this.this$0, null), 3, null);
            deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new MarkAllConversationsAsReadUseCase$execute$2$clearOrbitConversationJob$1(this.this$0, null), 3, null);
            arrayList = new ArrayList(C56403yEb.AYXKKw(arrayList2, i4));
            it = arrayList2.iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.I$0;
                    z = this.Z$0;
                    C56391yDq.AEQbTJ(obj);
                    objAwait2 = obj;
                    return C56443yFo.KWHzl(i2 != 0 && z && Result.m7384isSuccessimpl(((Result) objAwait2).m7386unboximpl()));
                }
                list = (List) this.L$1;
                Deferred deferred = (Deferred) this.L$0;
                C56391yDq.AEQbTJ(obj);
                deferredAsync$default2 = deferred;
                objAwait = obj;
                zBooleanValue = ((Boolean) objAwait).booleanValue();
                if (!(list instanceof Collection) && list.isEmpty()) {
                    i = 1;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.Z$0 = zBooleanValue;
                    this.I$0 = i;
                    this.label = 3;
                    objAwait2 = deferredAsync$default2.await(this);
                    if (objAwait2 == objCopydefault) {
                    }
                } else {
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (!((Boolean) it2.next()).booleanValue()) {
                            i = 0;
                            break;
                        }
                    }
                    i = 1;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.Z$0 = zBooleanValue;
                    this.I$0 = i;
                    this.label = 3;
                    objAwait2 = deferredAsync$default2.await(this);
                    if (objAwait2 == objCopydefault) {
                        return objCopydefault;
                    }
                    i2 = i;
                    z = zBooleanValue;
                }
                return C56443yFo.KWHzl(i2 != 0 && z && Result.m7384isSuccessimpl(((Result) objAwait2).m7386unboximpl()));
            }
            arrayList = (Collection) this.L$4;
            it = (Iterator) this.L$3;
            Collection collection = (Collection) this.L$2;
            Deferred deferred2 = (Deferred) this.L$1;
            deferredAsync$default = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Collection collection2 = collection;
            Object objAwait3 = obj;
            arrayList.add(C56443yFo.KWHzl(((Boolean) objAwait3).booleanValue()));
            arrayList = collection2;
            deferredAsync$default2 = deferred2;
            if (it.hasNext()) {
                Deferred deferred3 = (Deferred) it.next();
                this.L$0 = deferredAsync$default;
                this.L$1 = deferredAsync$default2;
                this.L$2 = arrayList;
                this.L$3 = it;
                this.L$4 = arrayList;
                this.label = 1;
                objAwait3 = deferred3.await(this);
                if (objAwait3 == objCopydefault) {
                    return objCopydefault;
                }
                deferred2 = deferredAsync$default2;
                collection2 = arrayList;
                arrayList.add(C56443yFo.KWHzl(((Boolean) objAwait3).booleanValue()));
                arrayList = collection2;
                deferredAsync$default2 = deferred2;
                if (it.hasNext()) {
                    list = (List) arrayList;
                    this.L$0 = deferredAsync$default2;
                    this.L$1 = list;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 2;
                    objAwait = deferredAsync$default.await(this);
                    if (objAwait == objCopydefault) {
                        return objCopydefault;
                    }
                    zBooleanValue = ((Boolean) objAwait).booleanValue();
                    if (!(list instanceof Collection)) {
                        it2 = list.iterator();
                        while (it2.hasNext()) {
                        }
                        i = 1;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.Z$0 = zBooleanValue;
                        this.I$0 = i;
                        this.label = 3;
                        objAwait2 = deferredAsync$default2.await(this);
                        if (objAwait2 == objCopydefault) {
                        }
                    }
                    return C56443yFo.KWHzl(i2 != 0 && z && Result.m7384isSuccessimpl(((Result) objAwait2).m7386unboximpl()));
                }
            }
        }
    }
}
