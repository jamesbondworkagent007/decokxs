package com.okinc.im.usecase.message;

import com.okinc.im.bean.OrbitIMChatSearchResult;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C35816oEt;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.sQY;

/* JADX INFO: loaded from: classes8.dex */
public final class SearchOrbitIMChatsUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OrbitIMChatSearchResult>, Object> {
    final /* synthetic */ String $keyword;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C35816oEt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchOrbitIMChatsUseCase$invoke$2(C35816oEt c35816oEt, String str, Continuation<? super SearchOrbitIMChatsUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c35816oEt;
        this.$keyword = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchOrbitIMChatsUseCase$invoke$2 searchOrbitIMChatsUseCase$invoke$2 = new SearchOrbitIMChatsUseCase$invoke$2(this.this$0, this.$keyword, continuation);
        searchOrbitIMChatsUseCase$invoke$2.L$0 = obj;
        return searchOrbitIMChatsUseCase$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OrbitIMChatSearchResult> continuation) {
        return ((SearchOrbitIMChatsUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [31=4] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferred;
        Deferred deferred2;
        List list;
        Deferred deferred3;
        Object objAwait;
        List list2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU == null || !interfaceC35180nqU.djBIcL()) {
                return this.this$0.AEQbTJ(this.$keyword);
            }
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new SearchOrbitIMChatsUseCase$invoke$2$chatsDeferred$1(this.this$0, this.$keyword, null), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new SearchOrbitIMChatsUseCase$invoke$2$groupsDeferred$1(this.this$0, this.$keyword, null), 3, null);
            Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new SearchOrbitIMChatsUseCase$invoke$2$messagesDeferred$1(this.this$0, this.$keyword, null), 3, null);
            this.L$0 = deferredAsync$default2;
            this.L$1 = deferredAsync$default3;
            this.label = 1;
            Object objAwait2 = deferredAsync$default.await(this);
            if (objAwait2 == objCopydefault) {
                return objCopydefault;
            }
            deferred = deferredAsync$default2;
            deferred2 = deferredAsync$default3;
            obj = objAwait2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list2 = (List) this.L$1;
                    list = (List) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    String str = this.$keyword;
                    return new OrbitIMChatSearchResult(str, this.this$0.copydefault(list, str), this.this$0.AEQbTJ((List<InHouseIMConversationEntity>) list2, this.$keyword), this.this$0.AEQbTJ((List<sQY>) obj));
                }
                list = (List) this.L$1;
                deferred3 = (Deferred) this.L$0;
                C56391yDq.AEQbTJ(obj);
                List list3 = (List) obj;
                this.L$0 = list;
                this.L$1 = list3;
                this.label = 3;
                objAwait = deferred3.await(this);
                if (objAwait != objCopydefault) {
                    return objCopydefault;
                }
                list2 = list3;
                obj = objAwait;
                String str2 = this.$keyword;
                return new OrbitIMChatSearchResult(str2, this.this$0.copydefault(list, str2), this.this$0.AEQbTJ((List<InHouseIMConversationEntity>) list2, this.$keyword), this.this$0.AEQbTJ((List<sQY>) obj));
            }
            deferred2 = (Deferred) this.L$1;
            deferred = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        List list4 = (List) obj;
        this.L$0 = deferred2;
        this.L$1 = list4;
        this.label = 2;
        Object objAwait3 = deferred.await(this);
        if (objAwait3 == objCopydefault) {
            return objCopydefault;
        }
        Deferred deferred4 = deferred2;
        list = list4;
        obj = objAwait3;
        deferred3 = deferred4;
        List list32 = (List) obj;
        this.L$0 = list;
        this.L$1 = list32;
        this.label = 3;
        objAwait = deferred3.await(this);
        if (objAwait != objCopydefault) {
        }
    }
}
