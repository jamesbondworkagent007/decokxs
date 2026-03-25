package com.okinc.im.imui.pushnotification.handler;

import com.okinc.okimcore.model.biz.OKBizCustomMessage;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKMessagePushConfig;
import com.okinc.okimcore.model.im.OKSystemNotificationMessage;
import com.okinc.okimcore.model.im.OKSystemRouterNotificationMessage;
import com.okinc.okimcore.model.other.OKRecallNotificationMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C32979mnm;
import o.C33129mqd;
import o.C37207opV;
import o.C44157sFk;
import o.C44364sNb;
import o.C44370sNh;
import o.C44467sQx;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.sDX;
import o.sDZ;
import o.sGF;
import o.sSY;

/* JADX INFO: loaded from: classes8.dex */
public final class PushNotificationHandler$processWSPushNotification$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C44467sQx $receiveEvent;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationHandler$processWSPushNotification$1(C44467sQx c44467sQx, Continuation<? super PushNotificationHandler$processWSPushNotification$1> continuation) {
        super(2, continuation);
        this.$receiveEvent = c44467sQx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PushNotificationHandler$processWSPushNotification$1(this.$receiveEvent, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PushNotificationHandler$processWSPushNotification$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [134=4] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0242 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        boolean zBooleanValue;
        OKMessage oKMessageCopydefault;
        Object objKWHzl;
        OKMessagePushConfig oKMessagePushConfig;
        OKMessageContent content;
        OKMessage oKMessage;
        String pushTitle;
        String pushContent;
        Object objOLrzqt;
        OKMessage oKMessage2;
        OKMessagePushConfig oKMessagePushConfig2;
        String pushTitle2;
        String content2;
        String str;
        String string;
        Object objAEQbTJ;
        OKMessagePushConfig oKMessagePushConfig3;
        String str2;
        String str3;
        String extra;
        Object conversation$default;
        String str4;
        String str5;
        OKMessage oKMessage3;
        boolean z;
        boolean zEZpvd;
        C37207opV c37207opV;
        C44364sNb c44364sNb;
        Object objCopydefault2 = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                sSY ssy = sSY.AEQbTJ;
                C44467sQx c44467sQx = this.$receiveEvent;
                this.label = 1;
                objCopydefault = ssy.copydefault(c44467sQx, this);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                zBooleanValue = ((Boolean) objCopydefault).booleanValue();
                pUU.KWHzl("PushNotificationHandler", "on receive local notification[IN-HOUSE]: " + this.$receiveEvent + ", shouldShowNotification=" + zBooleanValue);
                if (zBooleanValue) {
                    return Unit.INSTANCE;
                }
                oKMessageCopydefault = this.$receiveEvent.copydefault();
                sSY ssy2 = sSY.AEQbTJ;
                this.L$0 = oKMessageCopydefault;
                this.label = 2;
                objKWHzl = ssy2.KWHzl(oKMessageCopydefault, this);
                if (objKWHzl == objCopydefault2) {
                    return objCopydefault2;
                }
                oKMessagePushConfig = (OKMessagePushConfig) objKWHzl;
                content = oKMessageCopydefault.getContent();
                if (!(content instanceof OKSystemNotificationMessage)) {
                    OKSystemNotificationMessage oKSystemNotificationMessage = (OKSystemNotificationMessage) content;
                    pushTitle2 = oKSystemNotificationMessage.getPushTitle();
                    content2 = oKSystemNotificationMessage.getContent();
                } else if (content instanceof OKSystemRouterNotificationMessage) {
                    OKSystemRouterNotificationMessage oKSystemRouterNotificationMessage = (OKSystemRouterNotificationMessage) content;
                    pushTitle2 = oKSystemRouterNotificationMessage.getPushTitle();
                    content2 = oKSystemRouterNotificationMessage.getContent();
                } else {
                    if (!(content instanceof OKBizCustomMessage)) {
                        if (!(content instanceof OKRecallNotificationMessage)) {
                            if (oKMessagePushConfig == null || ((StringsKt__StringsKt.fARcdN((CharSequence) oKMessagePushConfig.getPushTitle()) && StringsKt__StringsKt.fARcdN((CharSequence) oKMessagePushConfig.getPushContent())) || Intrinsics.EZpvd((Object) oKMessageCopydefault.getSenderUserId(), (Object) C44157sFk.EZpvd()))) {
                                return Unit.INSTANCE;
                            }
                            oKMessage = oKMessageCopydefault;
                            pushTitle = oKMessagePushConfig.getPushTitle();
                            pushContent = oKMessagePushConfig.getPushContent();
                            if (pushTitle != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        sSY ssy3 = sSY.AEQbTJ;
                        this.L$0 = oKMessageCopydefault;
                        this.L$1 = oKMessagePushConfig;
                        this.label = 3;
                        objOLrzqt = ssy3.OLrzqt(oKMessageCopydefault, this);
                        if (objOLrzqt == objCopydefault2) {
                            return objCopydefault2;
                        }
                        oKMessage2 = oKMessageCopydefault;
                        oKMessagePushConfig2 = oKMessagePushConfig;
                        str = (String) objOLrzqt;
                        string = C32979mnm.EZpvd.OLrzqt().getString(sDX.StateListAnimator.AYXKKw);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        if (oKMessage2.getConversationType() == OKConversationType.PRIVATE) {
                            sSY ssy4 = sSY.AEQbTJ;
                            this.L$0 = oKMessage2;
                            this.L$1 = oKMessagePushConfig2;
                            this.L$2 = str;
                            this.L$3 = string;
                            this.label = 4;
                            objAEQbTJ = ssy4.AEQbTJ(oKMessage2, this);
                            if (objAEQbTJ == objCopydefault2) {
                                return objCopydefault2;
                            }
                            oKMessagePushConfig3 = oKMessagePushConfig2;
                            str2 = string;
                            OKMessagePushConfig oKMessagePushConfig4 = oKMessagePushConfig3;
                            string = objAEQbTJ + ": " + str2;
                            str3 = str;
                            oKMessagePushConfig = oKMessagePushConfig4;
                            pushTitle = str3;
                            pushContent = string;
                            oKMessage = oKMessage2;
                            if (pushTitle != null) {
                                pUU.KWHzl("PushNotificationHandler", "on receive local notification[IN-HOUSE]: " + this.$receiveEvent + ", ignore: title=" + pushTitle + ", content=" + pushContent);
                                return Unit.INSTANCE;
                            }
                            pUU.KWHzl("PushNotificationHandler", "on receive local notification[IN-HOUSE]: " + this.$receiveEvent + ", ignore: title=" + pushTitle + ", content=" + pushContent);
                            return Unit.INSTANCE;
                            return Unit.INSTANCE;
                        }
                        oKMessagePushConfig = oKMessagePushConfig2;
                        str3 = str;
                        pushTitle = str3;
                        pushContent = string;
                        oKMessage = oKMessage2;
                        if ((pushTitle != null || pushTitle.length() == 0) && (pushContent == null || pushContent.length() == 0)) {
                            pUU.KWHzl("PushNotificationHandler", "on receive local notification[IN-HOUSE]: " + this.$receiveEvent + ", ignore: title=" + pushTitle + ", content=" + pushContent);
                            return Unit.INSTANCE;
                        }
                        String pushData = oKMessagePushConfig != null ? oKMessagePushConfig.getPushData() : null;
                        if (pushData == null || pushData.length() == 0) {
                            OKMessageContent content3 = oKMessage.getContent();
                            extra = content3 != null ? content3.getExtra() : null;
                            if (extra != null) {
                                C44370sNh.EZpvd.EZpvd(oKMessage, extra);
                            }
                            sDZ sdz = sDZ.AEQbTJ;
                            boolean zAEQbTJ = sdz.fIwbmz().AEQbTJ(oKMessage.getTargetId());
                            sGF sgfAYXKKw = sdz.AYXKKw();
                            String targetId = oKMessage.getTargetId();
                            this.L$0 = oKMessage;
                            this.L$1 = pushTitle;
                            this.L$2 = pushContent;
                            this.L$3 = null;
                            this.Z$0 = zAEQbTJ;
                            this.label = 5;
                            conversation$default = sGF.Activity.getConversation$default(sgfAYXKKw, targetId, null, this, 2, null);
                            if (conversation$default != objCopydefault2) {
                                return objCopydefault2;
                            }
                            str4 = pushContent;
                            str5 = pushTitle;
                            oKMessage3 = oKMessage;
                            z = zAEQbTJ;
                            OKConversation oKConversation = (OKConversation) conversation$default;
                            sSY ssy5 = sSY.AEQbTJ;
                            int iOLrzqt = ssy5.OLrzqt(oKMessage3.getTargetId(), C33129mqd.AhwBna(C56443yFo.KWHzl(oKMessage3.getSeq())));
                            zEZpvd = ssy5.EZpvd(oKMessage3);
                            c37207opV = C37207opV.copydefault;
                            c44364sNb = new C44364sNb(iOLrzqt, str5 != null ? "" : str5, str4 != null ? "" : str4, oKConversation, z);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 6;
                            if (c37207opV.copydefault(zEZpvd, c44364sNb, this) == objCopydefault2) {
                                return objCopydefault2;
                            }
                        } else {
                            if (oKMessagePushConfig != null) {
                                extra = oKMessagePushConfig.getPushData();
                            }
                            if (extra != null) {
                            }
                            sDZ sdz2 = sDZ.AEQbTJ;
                            boolean zAEQbTJ2 = sdz2.fIwbmz().AEQbTJ(oKMessage.getTargetId());
                            sGF sgfAYXKKw2 = sdz2.AYXKKw();
                            String targetId2 = oKMessage.getTargetId();
                            this.L$0 = oKMessage;
                            this.L$1 = pushTitle;
                            this.L$2 = pushContent;
                            this.L$3 = null;
                            this.Z$0 = zAEQbTJ2;
                            this.label = 5;
                            conversation$default = sGF.Activity.getConversation$default(sgfAYXKKw2, targetId2, null, this, 2, null);
                            if (conversation$default != objCopydefault2) {
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    OKBizCustomMessage oKBizCustomMessage = (OKBizCustomMessage) content;
                    if (!oKBizCustomMessage.m6868isShowNotify()) {
                        return Unit.INSTANCE;
                    }
                    pushTitle2 = oKBizCustomMessage.getPushTitle();
                    content2 = oKBizCustomMessage.getContent();
                }
                oKMessage = oKMessageCopydefault;
                pushContent = content2;
                pushTitle = pushTitle2;
                if (pushTitle != null) {
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                objCopydefault = obj;
                zBooleanValue = ((Boolean) objCopydefault).booleanValue();
                pUU.KWHzl("PushNotificationHandler", "on receive local notification[IN-HOUSE]: " + this.$receiveEvent + ", shouldShowNotification=" + zBooleanValue);
                if (zBooleanValue) {
                }
                break;
            case 2:
                oKMessageCopydefault = (OKMessage) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = obj;
                oKMessagePushConfig = (OKMessagePushConfig) objKWHzl;
                content = oKMessageCopydefault.getContent();
                if (!(content instanceof OKSystemNotificationMessage)) {
                }
                oKMessage = oKMessageCopydefault;
                pushContent = content2;
                pushTitle = pushTitle2;
                if (pushTitle != null) {
                }
                return Unit.INSTANCE;
            case 3:
                oKMessagePushConfig2 = (OKMessagePushConfig) this.L$1;
                OKMessage oKMessage4 = (OKMessage) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj;
                oKMessage2 = oKMessage4;
                str = (String) objOLrzqt;
                string = C32979mnm.EZpvd.OLrzqt().getString(sDX.StateListAnimator.AYXKKw);
                Intrinsics.checkNotNullExpressionValue(string, "");
                if (oKMessage2.getConversationType() == OKConversationType.PRIVATE) {
                }
                break;
            case 4:
                str2 = (String) this.L$3;
                str = (String) this.L$2;
                oKMessagePushConfig3 = (OKMessagePushConfig) this.L$1;
                oKMessage2 = (OKMessage) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj;
                OKMessagePushConfig oKMessagePushConfig42 = oKMessagePushConfig3;
                string = objAEQbTJ + ": " + str2;
                str3 = str;
                oKMessagePushConfig = oKMessagePushConfig42;
                pushTitle = str3;
                pushContent = string;
                oKMessage = oKMessage2;
                if (pushTitle != null) {
                }
                return Unit.INSTANCE;
            case 5:
                boolean z2 = this.Z$0;
                str4 = (String) this.L$2;
                str5 = (String) this.L$1;
                oKMessage3 = (OKMessage) this.L$0;
                C56391yDq.AEQbTJ(obj);
                z = z2;
                conversation$default = obj;
                OKConversation oKConversation2 = (OKConversation) conversation$default;
                sSY ssy52 = sSY.AEQbTJ;
                int iOLrzqt2 = ssy52.OLrzqt(oKMessage3.getTargetId(), C33129mqd.AhwBna(C56443yFo.KWHzl(oKMessage3.getSeq())));
                zEZpvd = ssy52.EZpvd(oKMessage3);
                c37207opV = C37207opV.copydefault;
                c44364sNb = new C44364sNb(iOLrzqt2, str5 != null ? "" : str5, str4 != null ? "" : str4, oKConversation2, z);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 6;
                if (c37207opV.copydefault(zEZpvd, c44364sNb, this) == objCopydefault2) {
                }
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
