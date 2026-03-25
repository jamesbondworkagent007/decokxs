package com.okinc.planet.biz_content.publisher;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.planet.domain.remote.dto.LinkAnalysisResp;
import com.okinc.planet.domain.remote.dto.LinkInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C46349tRa;
import o.C47793twn;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.C56548yJl;
import o.pUU;
import o.tQN;
import o.yDY;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetPublisherViewModel$handleLinkDetection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $detectedLinks;
    int label;
    final /* synthetic */ C47793twn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetPublisherViewModel$handleLinkDetection$1(C47793twn c47793twn, List<String> list, Continuation<? super PlanetPublisherViewModel$handleLinkDetection$1> continuation) {
        super(2, continuation);
        this.this$0 = c47793twn;
        this.$detectedLinks = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetPublisherViewModel$handleLinkDetection$1(this.this$0, this.$detectedLinks, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetPublisherViewModel$handleLinkDetection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot abstractC43419rot;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            if (DelayKt.delay(300L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = (AbstractC43419rot) obj;
                if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                    AbstractC43419rot.StateListAnimator stateListAnimator = (AbstractC43419rot.StateListAnimator) abstractC43419rot;
                    List<LinkInfo> listKWHzl = ((LinkAnalysisResp) stateListAnimator.KWHzl()).KWHzl();
                    ArrayList<LinkInfo> arrayList = new ArrayList();
                    for (Object obj2 : listKWHzl) {
                        if (((LinkInfo) obj2).djBIcL()) {
                            arrayList.add(obj2);
                        }
                    }
                    MutableStateFlow mutableStateFlow = this.this$0.AwvSrB;
                    ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((LinkInfo) it.next()).OLrzqt());
                    }
                    mutableStateFlow.setValue(arrayList2);
                    C47793twn c47793twn = this.this$0;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList, 10)), 16));
                    for (LinkInfo linkInfo : arrayList) {
                        Pair pairOLrzqt = C56390yDp.OLrzqt(linkInfo.OLrzqt(), new tQN.Activity(linkInfo.OLrzqt(), linkInfo.KWHzl()));
                        linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
                    }
                    c47793twn.fvQaOB = linkedHashMap;
                    if (!this.this$0.dvKsVJ) {
                        this.this$0.KWHzl(this.$detectedLinks, ((LinkAnalysisResp) stateListAnimator.KWHzl()).KWHzl());
                    }
                } else {
                    if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pUU.copydefault("PlanetPublisherViewModel", "Analyze link failed: " + ((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getMessage());
                    if (!this.this$0.dvKsVJ) {
                        this.this$0.getFieldNames();
                    } else {
                        this.this$0.AwvSrB.setValue(yDY.AhwBna());
                        this.this$0.fvQaOB = C56424yEw.KWHzl();
                        this.this$0.gGvvIC = yDY.AhwBna();
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C46349tRa c46349tRa = this.this$0.QUSxYX;
        List<String> list = this.$detectedLinks;
        this.label = 2;
        obj = c46349tRa.copydefault(list, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        abstractC43419rot = (AbstractC43419rot) obj;
        if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
        }
        return Unit.INSTANCE;
    }
}
