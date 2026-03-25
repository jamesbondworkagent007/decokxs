package com.okinc.im.usecase.group.info;

import androidx.camera.video.AudioStats;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C35551nxW;
import o.C35780oDk;
import o.C56391yDq;
import o.C56442yFn;
import o.oDF;
import o.yHT;

/* JADX INFO: loaded from: classes8.dex */
public final class ObserveGroupProfileInfoUseCase$invoke$1 extends SuspendLambda implements yHT<GroupInfo, List<? extends GroupMemberInfo>, OKConversation, Continuation<? super oDF.StateListAnimator>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ oDF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveGroupProfileInfoUseCase$invoke$1(oDF odf, Continuation<? super ObserveGroupProfileInfoUseCase$invoke$1> continuation) {
        super(4, continuation);
        this.this$0 = odf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(GroupInfo groupInfo, List<GroupMemberInfo> list, OKConversation oKConversation, Continuation<? super oDF.StateListAnimator> continuation) {
        ObserveGroupProfileInfoUseCase$invoke$1 observeGroupProfileInfoUseCase$invoke$1 = new ObserveGroupProfileInfoUseCase$invoke$1(this.this$0, continuation);
        observeGroupProfileInfoUseCase$invoke$1.L$0 = groupInfo;
        observeGroupProfileInfoUseCase$invoke$1.L$1 = list;
        observeGroupProfileInfoUseCase$invoke$1.L$2 = oKConversation;
        return observeGroupProfileInfoUseCase$invoke$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* bridge */ /* synthetic */ Object invoke(GroupInfo groupInfo, List<? extends GroupMemberInfo> list, OKConversation oKConversation, Continuation<? super oDF.StateListAnimator> continuation) {
        return invoke2(groupInfo, (List<GroupMemberInfo>) list, oKConversation, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<GroupMemberInfo> list;
        Object objOLrzqt;
        GroupInfo groupInfo;
        OKConversation oKConversation;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupInfo groupInfo2 = (GroupInfo) this.L$0;
            list = (List) this.L$1;
            OKConversation oKConversation2 = (OKConversation) this.L$2;
            C35780oDk c35780oDk = this.this$0.EZpvd;
            this.L$0 = groupInfo2;
            this.L$1 = list;
            this.L$2 = oKConversation2;
            this.label = 1;
            objOLrzqt = c35780oDk.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            groupInfo = groupInfo2;
            oKConversation = oKConversation2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oKConversation = (OKConversation) this.L$2;
            list = (List) this.L$1;
            GroupInfo groupInfo3 = (GroupInfo) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
            groupInfo = groupInfo3;
        }
        boolean zBooleanValue = ((Boolean) objOLrzqt).booleanValue();
        boolean zIsShowAddAffiliateMember = groupInfo.isShowAddAffiliateMember();
        Integer type = groupInfo.getType();
        return new oDF.StateListAnimator(GroupInfo.copy$default(groupInfo, null, null, null, null, false, null, null, 0L, 0L, null, false, false, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, false, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, 0, null, null, false, false, null, false, false, false, false, false, zBooleanValue && zIsShowAddAffiliateMember, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, false, false, false, 0, 0L, false, false, false, false, false, false, null, null, false, null, null, null, null, null, null, null, -1073741825, -1, 63, null), (type != null && type.intValue() == GroupTagType.RM_VIP_GROUP.getValue()) ? C35551nxW.copydefault.AYXKKw(list) : C35551nxW.copydefault.copydefault(list), oKConversation);
    }
}
