package com.okinc.okimcore.channel.inhouse.impl;

import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupSettingEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.sJM;
import o.yHO;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMGroupImpl$getGroupInfoByIdFlow$1 extends SuspendLambda implements yHO<InHouseIMGroupEntity, InHouseIMGroupSettingEntity, Continuation<? super GroupInfo>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseIMGroupImpl$getGroupInfoByIdFlow$1(Continuation<? super InHouseIMGroupImpl$getGroupInfoByIdFlow$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(InHouseIMGroupEntity inHouseIMGroupEntity, InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity, Continuation<? super GroupInfo> continuation) {
        InHouseIMGroupImpl$getGroupInfoByIdFlow$1 inHouseIMGroupImpl$getGroupInfoByIdFlow$1 = new InHouseIMGroupImpl$getGroupInfoByIdFlow$1(continuation);
        inHouseIMGroupImpl$getGroupInfoByIdFlow$1.L$0 = inHouseIMGroupEntity;
        inHouseIMGroupImpl$getGroupInfoByIdFlow$1.L$1 = inHouseIMGroupSettingEntity;
        return inHouseIMGroupImpl$getGroupInfoByIdFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InHouseIMGroupEntity inHouseIMGroupEntity = (InHouseIMGroupEntity) this.L$0;
            InHouseIMGroupSettingEntity inHouseIMGroupSettingEntity = (InHouseIMGroupSettingEntity) this.L$1;
            if (inHouseIMGroupEntity == null) {
                return null;
            }
            inHouseIMGroupEntity.setUserSetting(inHouseIMGroupSettingEntity);
            sJM sjm = sJM.AEQbTJ;
            this.L$0 = null;
            this.label = 1;
            obj = sjm.EZpvd(inHouseIMGroupEntity, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return (GroupInfo) obj;
    }
}
