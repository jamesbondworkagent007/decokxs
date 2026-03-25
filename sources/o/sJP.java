package o;

import com.okinc.okimcore.feature.group.utility.GroupNotifyParseHelper$handleNotifyMessageModel$1;
import com.okinc.okimcore.feature.group.utility.GroupNotifyParseHelper$updateMemberInfo$1;
import com.okinc.okimcore.model.im.AnnouncementGroupMessage;
import com.okinc.okimcore.model.im.OKMemberNickNameModifyGroupNotifyMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.other.OKGroupNotificationMessage;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sJP {
    public static final sJP EZpvd = new sJP();

    private sJP() {
    }

    public static /* synthetic */ java.lang.Object handleNotifyMessageModel$default(sJP sjp, OKMessage oKMessage, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return sjp.KWHzl(oKMessage, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull final OKMessage oKMessage, boolean z, @NotNull Continuation<? super Unit> continuation) {
        GroupNotifyParseHelper$handleNotifyMessageModel$1 groupNotifyParseHelper$handleNotifyMessageModel$1;
        OKGroupNotificationMessage oKGroupNotificationMessage;
        OKGroupNotificationMessage oKGroupNotificationMessage2;
        if (continuation instanceof GroupNotifyParseHelper$handleNotifyMessageModel$1) {
            groupNotifyParseHelper$handleNotifyMessageModel$1 = (GroupNotifyParseHelper$handleNotifyMessageModel$1) continuation;
            int i = groupNotifyParseHelper$handleNotifyMessageModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupNotifyParseHelper$handleNotifyMessageModel$1.label = i - Integer.MIN_VALUE;
            } else {
                groupNotifyParseHelper$handleNotifyMessageModel$1 = new GroupNotifyParseHelper$handleNotifyMessageModel$1(this, continuation);
            }
        }
        java.lang.Object obj = groupNotifyParseHelper$handleNotifyMessageModel$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = groupNotifyParseHelper$handleNotifyMessageModel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (oKMessage.getContent() instanceof OKGroupNotificationMessage) {
                OKMessageContent content = oKMessage.getContent();
                Intrinsics.copydefault(content, "");
                oKGroupNotificationMessage = (OKGroupNotificationMessage) content;
                java.lang.String operation = oKGroupNotificationMessage.getOperation();
                if (Intrinsics.EZpvd((java.lang.Object) operation, (java.lang.Object) AnnouncementGroupMessage.GROUP_OPERATION_ANNOUNCEMENT)) {
                    if (z) {
                        AbstractC58185ywX<Unit> abstractC58185ywXEZpvd = sDZ.AEQbTJ.AhwBna().copydefault().EZpvd(oKMessage.getTargetId(), true);
                        final Function1 function1 = new Function1() { // from class: o.sJQ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return sJP.EZpvd(oKMessage, (Unit) obj2);
                            }
                        };
                        InterfaceC58227yxM<? super Unit> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.sJR
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final void accept(java.lang.Object obj2) {
                                sJP.EZpvd(function1, obj2);
                            }
                        };
                        final Function1 function12 = new Function1() { // from class: o.sJS
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return sJP.KWHzl((java.lang.Throwable) obj2);
                            }
                        };
                        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.sJT
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final void accept(java.lang.Object obj2) {
                                sJP.AEQbTJ(function12, obj2);
                            }
                        });
                    }
                } else if (Intrinsics.EZpvd((java.lang.Object) operation, (java.lang.Object) OKMemberNickNameModifyGroupNotifyMessage.GROUP_OPERATION_NICK_NAME)) {
                    oKGroupNotificationMessage = (OKMemberNickNameModifyGroupNotifyMessage) C44170sFx.AEQbTJ(oKGroupNotificationMessage, OKMemberNickNameModifyGroupNotifyMessage.class);
                    if (z) {
                        java.lang.String targetId = oKMessage.getTargetId();
                        java.lang.String operatorUserId = oKGroupNotificationMessage.getOperatorUserId();
                        groupNotifyParseHelper$handleNotifyMessageModel$1.L$0 = oKGroupNotificationMessage;
                        groupNotifyParseHelper$handleNotifyMessageModel$1.L$1 = oKMessage;
                        groupNotifyParseHelper$handleNotifyMessageModel$1.label = 1;
                        if (OLrzqt(targetId, operatorUserId, groupNotifyParseHelper$handleNotifyMessageModel$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        oKGroupNotificationMessage2 = oKGroupNotificationMessage;
                    }
                }
                oKMessage.setContent(oKGroupNotificationMessage);
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oKMessage = (OKMessage) groupNotifyParseHelper$handleNotifyMessageModel$1.L$1;
        oKGroupNotificationMessage2 = (OKMemberNickNameModifyGroupNotifyMessage) groupNotifyParseHelper$handleNotifyMessageModel$1.L$0;
        C56391yDq.AEQbTJ(obj);
        oKGroupNotificationMessage = oKGroupNotificationMessage2;
        oKMessage.setContent(oKGroupNotificationMessage);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(OKMessage oKMessage, Unit unit) {
        sDZ.AEQbTJ.AhwBna().copydefault().EZpvd(oKMessage.getTargetId());
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        GroupNotifyParseHelper$updateMemberInfo$1 groupNotifyParseHelper$updateMemberInfo$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof GroupNotifyParseHelper$updateMemberInfo$1) {
            groupNotifyParseHelper$updateMemberInfo$1 = (GroupNotifyParseHelper$updateMemberInfo$1) continuation;
            int i = groupNotifyParseHelper$updateMemberInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupNotifyParseHelper$updateMemberInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                groupNotifyParseHelper$updateMemberInfo$1 = new GroupNotifyParseHelper$updateMemberInfo$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = groupNotifyParseHelper$updateMemberInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = groupNotifyParseHelper$updateMemberInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                Result.Application application = Result.Companion;
                sIR sirCopydefault = sDZ.AEQbTJ.AhwBna().copydefault();
                groupNotifyParseHelper$updateMemberInfo$1.L$0 = str;
                groupNotifyParseHelper$updateMemberInfo$1.L$1 = str2;
                groupNotifyParseHelper$updateMemberInfo$1.label = 1;
                objOLrzqt = sirCopydefault.OLrzqt(str, str2, groupNotifyParseHelper$updateMemberInfo$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (java.lang.String) groupNotifyParseHelper$updateMemberInfo$1.L$1;
                str = (java.lang.String) groupNotifyParseHelper$updateMemberInfo$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((GroupMemberInfo) objOLrzqt);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.imLogGroup$default("GroupNotifyParseHelper: Failed to update member info for groupId: " + str + ", memberId: " + str2 + " - " + thM7380exceptionOrNullimpl.getMessage(), null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
