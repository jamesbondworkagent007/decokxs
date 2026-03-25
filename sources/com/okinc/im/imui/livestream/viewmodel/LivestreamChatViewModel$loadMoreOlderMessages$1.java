package com.okinc.im.imui.livestream.viewmodel;

import com.okinc.im.imui.livestream.model.UXBehavior;
import com.okinc.okimcore.model.im.GetMessageDirection;
import com.okinc.okimcore.model.im.OKMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C36499ocC;
import o.C36547ocy;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.oEI;
import o.pUU;
import o.sNM;

/* JADX INFO: loaded from: classes23.dex */
public final class LivestreamChatViewModel$loadMoreOlderMessages$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Long $oldestMessageSeq;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C36547ocy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamChatViewModel$loadMoreOlderMessages$1(C36547ocy c36547ocy, Long l, Continuation<? super LivestreamChatViewModel$loadMoreOlderMessages$1> continuation) {
        super(2, continuation);
        this.this$0 = c36547ocy;
        this.$oldestMessageSeq = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LivestreamChatViewModel$loadMoreOlderMessages$1 livestreamChatViewModel$loadMoreOlderMessages$1 = new LivestreamChatViewModel$loadMoreOlderMessages$1(this.this$0, this.$oldestMessageSeq, continuation);
        livestreamChatViewModel$loadMoreOlderMessages$1.L$0 = obj;
        return livestreamChatViewModel$loadMoreOlderMessages$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LivestreamChatViewModel$loadMoreOlderMessages$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault;
        C36547ocy c36547ocy;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.EZpvd.setValue(C56443yFo.KWHzl(true));
                Long l = this.$oldestMessageSeq;
                C36547ocy c36547ocy2 = this.this$0;
                Result.Application application = Result.Companion;
                pUU.KWHzl("LivestreamChatViewModel", "Loading more older messages before seq: " + l);
                oEI oei = c36547ocy2.fARcdN;
                String strCopydefault = c36547ocy2.DbNXlk.copydefault();
                Long lKWHzl = C56443yFo.KWHzl(l.longValue() - 1);
                Boolean boolKWHzl = C56443yFo.KWHzl(true);
                GetMessageDirection getMessageDirection = GetMessageDirection.TOP;
                this.L$0 = c36547ocy2;
                this.label = 1;
                objCopydefault = oei.copydefault(strCopydefault, null, lKWHzl, false, 30L, boolKWHzl, getMessageDirection, false, this);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                c36547ocy = c36547ocy2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c36547ocy = (C36547ocy) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objCopydefault = obj;
            }
            sNM snm = (sNM) objCopydefault;
            List<OKMessage> listCopydefault = snm.copydefault();
            pUU.EZpvd("LivestreamChatViewModel", "Loaded:" + listCopydefault.size() + ", hasPrevious:" + snm.OLrzqt());
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listCopydefault) {
                if (c36547ocy.OLrzqt((OKMessage) obj2)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(c36547ocy.EZpvd((OKMessage) it.next()));
            }
            pUU.KWHzl("LivestreamChatViewModel", "Filtered to " + arrayList2.size() + " text messages");
            if (!arrayList2.isEmpty()) {
                c36547ocy.fetchVPNInfo.addAll(0, arrayList2);
            }
            OKMessage oKMessage = (OKMessage) CollectionsKt___CollectionsKt.firstOrNull(listCopydefault);
            c36547ocy.djBIcL.setValue(new C36499ocC(CollectionsKt___CollectionsKt.gkJEwt(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(c36547ocy.fetchVPNInfo)), UXBehavior.NoOperation, oKMessage != null ? C56443yFo.KWHzl(oKMessage.getSeq()) : null));
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("LivestreamChatViewModel", "Failed to load more older messages: " + thM7380exceptionOrNullimpl.getMessage());
        }
        this.this$0.EZpvd.setValue(C56443yFo.KWHzl(false));
        return Unit.INSTANCE;
    }
}
