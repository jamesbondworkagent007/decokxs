package com.okinc.okimcore.channel.inhouse.impl;

import com.okinc.okimcore.model.im.OKConversation;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C43296rmc;
import o.C56391yDq;
import o.C56442yFn;
import o.sGJ;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMQueryImpl$getConversationsByPageFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends OKConversation>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $onlyFlagged;
    final /* synthetic */ boolean $onlyUnread;
    final /* synthetic */ boolean $showCacheFirst;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMQueryImpl$getConversationsByPageFlow$1(boolean z, boolean z2, boolean z3, Continuation<? super InHouseIMQueryImpl$getConversationsByPageFlow$1> continuation) {
        super(2, continuation);
        this.$showCacheFirst = z;
        this.$onlyUnread = z2;
        this.$onlyFlagged = z3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InHouseIMQueryImpl$getConversationsByPageFlow$1 inHouseIMQueryImpl$getConversationsByPageFlow$1 = new InHouseIMQueryImpl$getConversationsByPageFlow$1(this.$showCacheFirst, this.$onlyUnread, this.$onlyFlagged, continuation);
        inHouseIMQueryImpl$getConversationsByPageFlow$1.L$0 = obj;
        return inHouseIMQueryImpl$getConversationsByPageFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends OKConversation>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super List<OKConversation>>) flowCollector, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super List<OKConversation>> flowCollector, Continuation<? super Unit> continuation) {
        return ((InHouseIMQueryImpl$getConversationsByPageFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            if (this.$showCacheFirst) {
                if (this.$onlyUnread) {
                    List<OKConversation> listKWHzl = sGJ.copydefault.KWHzl();
                    if (listKWHzl != null) {
                        C43296rmc.AEQbTJ("InHouseQueryImpl", "getConversationsByPageFlow emit cached unread list, size:" + listKWHzl.size());
                        this.label = 1;
                        if (flowCollector.emit(listKWHzl, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else if (this.$onlyFlagged) {
                    List<OKConversation> listCopydefault = sGJ.copydefault.copydefault();
                    if (listCopydefault != null) {
                        C43296rmc.AEQbTJ("InHouseQueryImpl", "getConversationsByPageFlow emit cached flagged list, size:" + listCopydefault.size());
                        this.label = 2;
                        if (flowCollector.emit(listCopydefault, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    List<OKConversation> listOLrzqt = sGJ.copydefault.OLrzqt();
                    if (listOLrzqt != null) {
                        C43296rmc.AEQbTJ("InHouseQueryImpl", "getConversationsByPageFlow emit cached list, size:" + listOLrzqt.size());
                        this.label = 3;
                        if (flowCollector.emit(listOLrzqt, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
