package com.okinc.business.market.market.fragment;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C28001kLf;
import o.C33542myS;
import o.C41428qqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC54581xNr;
import o.kHF;
import o.qZM;
import o.xLJ;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class OptionQuoteFragment$handleTradeInitResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $success;
    final /* synthetic */ InterfaceC54581xNr $trade;
    int label;
    final /* synthetic */ kHF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionQuoteFragment$handleTradeInitResult$1(boolean z, InterfaceC54581xNr interfaceC54581xNr, kHF khf, Continuation<? super OptionQuoteFragment$handleTradeInitResult$1> continuation) {
        super(2, continuation);
        this.$success = z;
        this.$trade = interfaceC54581xNr;
        this.this$0 = khf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionQuoteFragment$handleTradeInitResult$1(this.$success, this.$trade, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionQuoteFragment$handleTradeInitResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC54581xNr interfaceC54581xNr;
        List listAhwBna;
        C33542myS c33542myS;
        View view;
        C28001kLf c28001kLf;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            if (!this.$success || (interfaceC54581xNr = this.$trade) == null) {
                this.this$0.copydefault();
                return Unit.INSTANCE;
            }
            this.label = 1;
            obj = interfaceC54581xNr.EZpvd("OPTION", this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        }
        AbstractC54531xLw abstractC54531xLw = (AbstractC54531xLw) obj;
        if (abstractC54531xLw != null) {
            qZM qzm = this.this$0.gEmmrt;
            if (qzm != null && (c28001kLf = qzm.AEQbTJ) != null) {
                c28001kLf.setVisibility(0);
            }
            qZM qzm2 = this.this$0.gEmmrt;
            if (qzm2 != null && (view = qzm2.KWHzl) != null) {
                view.setVisibility(0);
            }
            LinearLayout linearLayout = this.this$0.valueOf;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            if (!this.this$0.OLrzqt) {
                this.this$0.OLrzqt = true;
                kHF khf = this.this$0;
                xLJ xlj = abstractC54531xLw instanceof xLJ ? (xLJ) abstractC54531xLw : null;
                khf.djBIcL = xlj != null ? xlj.zsXlph() : null;
                List list = this.this$0.djBIcL;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) ((Pair) it.next()).getFirst());
                    }
                    kHF khf2 = this.this$0;
                    List<String> listOLrzqt = C41428qqd.OLrzqt.OLrzqt(arrayList);
                    if (true ^ listOLrzqt.isEmpty()) {
                        List list2 = khf2.djBIcL;
                        if (list2 == null) {
                            listAhwBna = yDY.AhwBna();
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : list2) {
                                if (listOLrzqt.contains(((Pair) obj2).getFirst())) {
                                    arrayList2.add(obj2);
                                }
                            }
                            listAhwBna = new ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                listAhwBna.add((String) ((Pair) it2.next()).getSecond());
                            }
                        }
                        khf2.AEQbTJ((List<String>) listAhwBna);
                    }
                }
                this.this$0.AEQbTJ();
            } else {
                qZM qzm3 = this.this$0.gEmmrt;
                if (((qzm3 == null || (c33542myS = qzm3.valueOf) == null) ? null : c33542myS.getAdapter()) == null) {
                }
            }
        }
        return Unit.INSTANCE;
    }
}
