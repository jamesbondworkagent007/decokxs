package com.okinc.im.imui.conversationlist.viewmodel;

import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.imui.conversationlist.model.ConversationListSectionHeaderType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C33129mqd;
import o.C35182nqW;
import o.C43248rlh;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC33171mrS;
import o.nGE;
import o.nGH;
import o.nGI;
import o.nGK;
import o.nGL;
import o.nGN;
import o.nGP;
import o.oGU;
import o.sEI;
import o.yDY;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class ConversationListViewModel$observeDisplayList$1$invokeSuspend$$inlined$combine$1$3 extends SuspendLambda implements yHO<FlowCollector<? super List<Object>>, Object[], Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ConversationListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationListViewModel$observeDisplayList$1$invokeSuspend$$inlined$combine$1$3(Continuation continuation, ConversationListViewModel conversationListViewModel) {
        super(3, continuation);
        this.this$0 = conversationListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super List<Object>> flowCollector, Object[] objArr, Continuation<? super Unit> continuation) {
        ConversationListViewModel$observeDisplayList$1$invokeSuspend$$inlined$combine$1$3 conversationListViewModel$observeDisplayList$1$invokeSuspend$$inlined$combine$1$3 = new ConversationListViewModel$observeDisplayList$1$invokeSuspend$$inlined$combine$1$3(continuation, this.this$0);
        conversationListViewModel$observeDisplayList$1$invokeSuspend$$inlined$combine$1$3.L$0 = flowCollector;
        conversationListViewModel$observeDisplayList$1$invokeSuspend$$inlined$combine$1$3.L$1 = objArr;
        return conversationListViewModel$observeDisplayList$1$invokeSuspend$$inlined$combine$1$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iKWHzl;
        ChatOrigin chatOriginKWHzl;
        ChatOrigin chatOriginKWHzl2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Object[] objArr = (Object[]) this.L$1;
            List listAhwBna = (List) objArr[0];
            Object obj2 = objArr[1];
            Intrinsics.copydefault(obj2, "");
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            Object obj3 = objArr[2];
            Intrinsics.copydefault(obj3, "");
            List list = (List) obj3;
            Object obj4 = objArr[3];
            Intrinsics.copydefault(obj4, "");
            List list2 = (List) obj4;
            Object obj5 = objArr[4];
            Intrinsics.copydefault(obj5, "");
            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
            Object obj6 = objArr[5];
            Intrinsics.copydefault(obj6, "");
            int iIntValue = ((Integer) obj6).intValue();
            Object obj7 = objArr[6];
            Intrinsics.copydefault(obj7, "");
            int iIntValue2 = ((Integer) obj7).intValue();
            Object obj8 = objArr[7];
            Intrinsics.copydefault(obj8, "");
            int iIntValue3 = ((Integer) obj8).intValue();
            ArrayList arrayList = new ArrayList();
            arrayList.add(nGN.copydefault);
            if (listAhwBna != null) {
                iKWHzl = this.this$0.KWHzl((List<? extends nGE>) listAhwBna);
                if (zBooleanValue && !this.this$0.AxsJAYaxsJAY()) {
                    if (iKWHzl <= 5) {
                        arrayList.add(nGL.AEQbTJ);
                    } else {
                        arrayList.add(nGK.KWHzl);
                    }
                }
            } else {
                iKWHzl = 0;
            }
            if (zBooleanValue2 && (!list2.isEmpty())) {
                oGU ogu = oGU.KWHzl;
                String strHDKMBd = this.this$0.hDKMBd();
                if (strHDKMBd == null || (chatOriginKWHzl2 = C35182nqW.KWHzl(strHDKMBd)) == null) {
                    chatOriginKWHzl2 = ChatOrigin.UNKNOWN;
                }
                if (!ogu.OLrzqt(chatOriginKWHzl2) && !this.this$0.AxsJAYaxsJAY()) {
                    arrayList.add(new nGH(ConversationListSectionHeaderType.TRENDING_GROUPS, list2.size()));
                    arrayList.add(new nGP(list2));
                }
            }
            if (this.this$0.AxsJAYaxsJAY()) {
                arrayList.add(new nGI(this.this$0.ODWQjV, iIntValue, iIntValue2, iIntValue3));
            }
            if (((InterfaceC33171mrS) C43248rlh.KWHzl.AEQbTJ(InterfaceC33171mrS.class)).getFieldNames()) {
                String strHDKMBd2 = this.this$0.hDKMBd();
                if ((strHDKMBd2 != null ? C35182nqW.KWHzl(strHDKMBd2) : null) != ChatOrigin.P2P && C33129mqd.KWHzl((Collection) listAhwBna)) {
                    oGU ogu2 = oGU.KWHzl;
                    String strHDKMBd3 = this.this$0.hDKMBd();
                    if (strHDKMBd3 == null || (chatOriginKWHzl = C35182nqW.KWHzl(strHDKMBd3)) == null) {
                        chatOriginKWHzl = ChatOrigin.UNKNOWN;
                    }
                    if (!ogu2.OLrzqt(chatOriginKWHzl) && !this.this$0.AxsJAYaxsJAY()) {
                        arrayList.add(new nGH(ConversationListSectionHeaderType.MY_CHATS, 0, 2, null));
                    }
                }
            }
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            arrayList.addAll(listAhwBna);
            int iKWHzl2 = sEI.KWHzl.KWHzl();
            if (C33129mqd.KWHzl((Collection) list) && !this.this$0.AxsJAYaxsJAY() && iKWHzl <= iKWHzl2) {
                arrayList.add(new nGH(ConversationListSectionHeaderType.SUGGESTED, 0, 2, null));
                arrayList.addAll(list);
            }
            this.label = 1;
            if (flowCollector.emit(arrayList, this) == objCopydefault) {
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
