package com.okinc.im.imui.contacts;

import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35551nxW;
import o.C56391yDq;
import o.C56442yFn;
import o.C59454zhO;

/* JADX INFO: loaded from: classes8.dex */
public final class ContactOrderHelper$insertSectionByAlphabet$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ArrayList<Object>>, Object> {
    final /* synthetic */ List<RelationInfo> $this_insertSectionByAlphabet;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactOrderHelper$insertSectionByAlphabet$2(List<RelationInfo> list, Continuation<? super ContactOrderHelper$insertSectionByAlphabet$2> continuation) {
        super(2, continuation);
        this.$this_insertSectionByAlphabet = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContactOrderHelper$insertSectionByAlphabet$2(this.$this_insertSectionByAlphabet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ArrayList<Object>> continuation) {
        return ((ContactOrderHelper$insertSectionByAlphabet$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            ArrayList arrayList = new ArrayList(this.$this_insertSectionByAlphabet.size());
            HashSet hashSet = new HashSet(28);
            for (RelationInfo relationInfo : this.$this_insertSectionByAlphabet) {
                String strAEQbTJ = C35551nxW.copydefault.AEQbTJ(C59454zhO.wlaJM(relationInfo.getDisplayAlphabetText()));
                if (!hashSet.contains(strAEQbTJ)) {
                    arrayList.add(strAEQbTJ);
                    hashSet.add(strAEQbTJ);
                }
                arrayList.add(relationInfo);
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
