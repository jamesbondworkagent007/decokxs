package com.okinc.okimcore.channel.inhouse.impl;

import com.okinc.okimcore.model.im.inhouseim.ContactRelationType;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.ContactEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C44124sEe;
import o.C44128sEi;
import o.C56391yDq;
import o.C56442yFn;
import o.sSM;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMContactImpl$flowRelationList$3 extends SuspendLambda implements Function2<List<? extends ContactEntity>, Continuation<? super List<? extends RelationInfo>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44128sEi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMContactImpl$flowRelationList$3(C44128sEi c44128sEi, Continuation<? super InHouseIMContactImpl$flowRelationList$3> continuation) {
        super(2, continuation);
        this.this$0 = c44128sEi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InHouseIMContactImpl$flowRelationList$3 inHouseIMContactImpl$flowRelationList$3 = new InHouseIMContactImpl$flowRelationList$3(this.this$0, continuation);
        inHouseIMContactImpl$flowRelationList$3.L$0 = obj;
        return inHouseIMContactImpl$flowRelationList$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends ContactEntity> list, Continuation<? super List<? extends RelationInfo>> continuation) {
        return invoke2((List<ContactEntity>) list, (Continuation<? super List<RelationInfo>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<ContactEntity> list, Continuation<? super List<RelationInfo>> continuation) {
        return ((InHouseIMContactImpl$flowRelationList$3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            C44124sEe.imLogContact$default("flowRelationList: Entity list size before filter: " + list.size(), null, 2, null);
            C44128sEi c44128sEi = this.this$0;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                ContactEntity contactEntity = (ContactEntity) obj2;
                c44128sEi.EZpvd.OLrzqt(contactEntity);
                if (contactEntity.getStrangerStatus() != ContactRelationType.STRANGER.getApiValue()) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                RelationInfo relationInfoOLrzqt = sSM.AEQbTJ.OLrzqt((ContactEntity) it.next());
                if (relationInfoOLrzqt != null) {
                    arrayList2.add(relationInfoOLrzqt);
                }
            }
            C44124sEe.imLogContact$default("flowRelationList: Entity list size after filter: " + arrayList2.size(), null, 2, null);
            return arrayList2;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
