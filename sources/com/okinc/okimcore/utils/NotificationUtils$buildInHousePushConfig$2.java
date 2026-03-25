package com.okinc.okimcore.utils;

import com.okinc.okimcore.model.im.OKAudioCallRecordMessage;
import com.okinc.okimcore.model.im.OKCallSTerminateMessage;
import com.okinc.okimcore.model.im.OKContractAddressMessage;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKCustomMessage;
import com.okinc.okimcore.model.im.OKGIFMessage;
import com.okinc.okimcore.model.im.OKGroupInvitationMessage;
import com.okinc.okimcore.model.im.OKHQVoiceMessage;
import com.okinc.okimcore.model.im.OKImageMessage;
import com.okinc.okimcore.model.im.OKMediaMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKMessagePushConfig;
import com.okinc.okimcore.model.im.OKShareMessage;
import com.okinc.okimcore.model.im.OKSightMessage;
import com.okinc.okimcore.model.im.OKStickerMessage;
import com.okinc.okimcore.model.im.OKStreamPlaceHolderMessage;
import com.okinc.okimcore.model.im.OKTextMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C43246rlf;
import o.C44166sFt;
import o.C56391yDq;
import o.C56442yFn;
import o.sDX;
import o.sDZ;
import o.sEG;
import o.sKH;
import o.sSY;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationUtils$buildInHousePushConfig$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OKMessagePushConfig>, Object> {
    final /* synthetic */ OKMessage $message;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKConversationType.values().length];
            try {
                iArr[OKConversationType.PRIVATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OKConversationType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationUtils$buildInHousePushConfig$2(OKMessage oKMessage, Continuation<? super NotificationUtils$buildInHousePushConfig$2> continuation) {
        super(2, continuation);
        this.$message = oKMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NotificationUtils$buildInHousePushConfig$2 notificationUtils$buildInHousePushConfig$2 = new NotificationUtils$buildInHousePushConfig$2(this.$message, continuation);
        notificationUtils$buildInHousePushConfig$2.L$0 = obj;
        return notificationUtils$buildInHousePushConfig$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OKMessagePushConfig> continuation) {
        return ((NotificationUtils$buildInHousePushConfig$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:216:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        String str;
        OKMessage oKMessage;
        OKMessageContent content;
        String str2;
        String strCopydefault;
        android.app.Application applicationValueOf;
        String str3;
        String str4;
        String str5;
        String str6;
        String string;
        String str7;
        String str8;
        String str9;
        Object objAEQbTJ;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        OKCustomMessage.Application pushData;
        String strOLrzqt;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            sSY ssy = sSY.AEQbTJ;
            OKMessage oKMessage2 = this.$message;
            this.L$0 = coroutineScope;
            this.label = 1;
            objCopydefault = ssy.copydefault(oKMessage2, (Continuation<? super OKConversation>) this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str11 = (String) this.L$9;
                String str15 = (String) this.L$8;
                str13 = (String) this.L$7;
                str5 = (String) this.L$6;
                str10 = (String) this.L$5;
                str12 = (String) this.L$4;
                applicationValueOf = (android.app.Application) this.L$3;
                content = (OKMessageContent) this.L$2;
                oKMessage = (OKMessage) this.L$1;
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str2 = "-";
                str7 = " ";
                str8 = str15;
                objAEQbTJ = obj;
                str14 = (String) objAEQbTJ;
                string = str11;
                str6 = str13;
                str4 = str10;
                str3 = str12;
                if (content instanceof OKTextMessage) {
                    StringBuilder sb = new StringBuilder();
                    if (C33129mqd.OLrzqt((CharSequence) str14)) {
                        sb.append(str14 + ": ");
                    }
                    sb.append(((OKTextMessage) content).getAliasedContent());
                    string = sb.toString();
                } else if (content instanceof OKStreamPlaceHolderMessage) {
                    StringBuilder sb2 = new StringBuilder();
                    if (C33129mqd.OLrzqt((CharSequence) str14)) {
                        sb2.append(str14 + ": ");
                    }
                    sb2.append(((OKStreamPlaceHolderMessage) content).getContent());
                    string = sb2.toString();
                } else if (content instanceof OKImageMessage) {
                    StringBuilder sb3 = new StringBuilder();
                    if (C33129mqd.OLrzqt((CharSequence) str14)) {
                        sb3.append(str14 + ": ");
                    }
                    sb3.append(str3);
                    string = sb3.toString();
                } else if (content instanceof OKGIFMessage) {
                    StringBuilder sb4 = new StringBuilder();
                    if (C33129mqd.OLrzqt((CharSequence) str14)) {
                        sb4.append(str14 + ": ");
                    }
                    sb4.append(str3);
                    string = sb4.toString();
                } else if (content instanceof OKSightMessage) {
                    StringBuilder sb5 = new StringBuilder();
                    if (C33129mqd.OLrzqt((CharSequence) str14)) {
                        sb5.append(str14 + ": ");
                    }
                    sb5.append(str4);
                    string = sb5.toString();
                } else if (content instanceof OKShareMessage) {
                    StringBuilder sb6 = new StringBuilder();
                    if (C33129mqd.OLrzqt((CharSequence) str14)) {
                        sb6.append(str14 + ": ");
                    }
                    OKMessageContent content2 = oKMessage.getContent();
                    OKShareMessage oKShareMessage = content2 instanceof OKShareMessage ? (OKShareMessage) content2 : null;
                    String messagePreview = oKShareMessage != null ? oKShareMessage.getMessagePreview() : null;
                    if (C33129mqd.OLrzqt((CharSequence) messagePreview)) {
                        str6 = str6 + str7 + messagePreview;
                    }
                    sb6.append(str6);
                    string = sb6.toString();
                } else {
                    String str16 = str7;
                    if (content instanceof OKContractAddressMessage) {
                        StringBuilder sb7 = new StringBuilder();
                        if (C33129mqd.OLrzqt((CharSequence) str14)) {
                            sb7.append(str14 + ": ");
                        }
                        OKMessageContent content3 = oKMessage.getContent();
                        OKContractAddressMessage oKContractAddressMessage = content3 instanceof OKContractAddressMessage ? (OKContractAddressMessage) content3 : null;
                        String preview = oKContractAddressMessage != null ? oKContractAddressMessage.getPreview() : null;
                        if (C33129mqd.OLrzqt((CharSequence) preview)) {
                            str6 = str6 + str16 + preview;
                        }
                        sb7.append(str6);
                        string = sb7.toString();
                    } else if (content instanceof OKHQVoiceMessage) {
                        StringBuilder sb8 = new StringBuilder();
                        if (C33129mqd.OLrzqt((CharSequence) str14)) {
                            sb8.append(str14 + ": ");
                        }
                        sb8.append(str5);
                        string = sb8.toString();
                    } else if (content instanceof OKMediaMessage) {
                        StringBuilder sb9 = new StringBuilder();
                        if (C33129mqd.OLrzqt((CharSequence) str14)) {
                            sb9.append(str14 + ": ");
                        }
                        sb9.append(string);
                        string = sb9.toString();
                    } else if (content instanceof OKCustomMessage) {
                        OKCustomMessage.Application pushData2 = ((OKCustomMessage) content).getPushData();
                        if (pushData2 == null || (strCopydefault = pushData2.copydefault()) == null) {
                            return null;
                        }
                        if (!C33129mqd.OLrzqt((CharSequence) strCopydefault)) {
                            strCopydefault = null;
                        }
                        if (strCopydefault == null) {
                            return null;
                        }
                        string = strCopydefault;
                    } else if (content instanceof OKStickerMessage) {
                        StringBuilder sb10 = new StringBuilder();
                        if (C33129mqd.OLrzqt((CharSequence) str14)) {
                            sb10.append(str14 + ": ");
                        }
                        sb10.append(str8);
                        string = sb10.toString();
                    } else {
                        if (!(content instanceof OKGroupInvitationMessage)) {
                            return null;
                        }
                        StringBuilder sb11 = new StringBuilder();
                        if (C33129mqd.OLrzqt((CharSequence) str14)) {
                            sb11.append(str14 + ": ");
                        }
                        sb11.append(sSY.AEQbTJ.EZpvd(applicationValueOf, ((OKGroupInvitationMessage) content).getGroupName()));
                        string = sb11.toString();
                    }
                }
                str9 = str;
                return new OKMessagePushConfig(str9, string != null ? str2 : string, (String) null, 4, (DefaultConstructorMarker) null);
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
        }
        OKConversation oKConversation = (OKConversation) objCopydefault;
        if (oKConversation == null) {
            return null;
        }
        String conversationTitle = oKConversation.getConversationTitle();
        if (conversationTitle == null) {
            conversationTitle = "-";
        }
        OKMessageContent content4 = this.$message.getContent();
        if (content4 != null && (content4 instanceof OKCustomMessage) && (pushData = ((OKCustomMessage) content4).getPushData()) != null && (strOLrzqt = pushData.OLrzqt()) != null) {
            if (!C33129mqd.OLrzqt((CharSequence) strOLrzqt)) {
                strOLrzqt = null;
            }
            if (strOLrzqt != null) {
                str = strOLrzqt;
            }
            oKMessage = this.$message;
            sDZ sdz = sDZ.AEQbTJ;
            sKH skhFARcdN = sdz.fARcdN();
            skhFARcdN.copydefault(oKMessage);
            skhFARcdN.OLrzqt(oKMessage);
            content = oKMessage.getContent();
            if (content == null) {
            }
            string = strCopydefault;
            str9 = str;
        } else {
            str = conversationTitle;
            oKMessage = this.$message;
            sDZ sdz2 = sDZ.AEQbTJ;
            sKH skhFARcdN2 = sdz2.fARcdN();
            skhFARcdN2.copydefault(oKMessage);
            skhFARcdN2.OLrzqt(oKMessage);
            content = oKMessage.getContent();
            if (content == null) {
                applicationValueOf = C43246rlf.OLrzqt.valueOf();
                str3 = "[" + applicationValueOf.getString(sDX.StateListAnimator.isConnected) + "]";
                str4 = "[" + applicationValueOf.getString(sDX.StateListAnimator.fJNWhG) + "]";
                str5 = "[" + applicationValueOf.getString(sDX.StateListAnimator.values) + "]";
                str2 = "-";
                str6 = "[" + applicationValueOf.getString(sDX.StateListAnimator.DbNXlk) + "]";
                string = applicationValueOf.getString(sDX.StateListAnimator.gEmmrt);
                Intrinsics.checkNotNullExpressionValue(string, "");
                str7 = " ";
                str8 = "[" + applicationValueOf.getString(sDX.StateListAnimator.ejfBZ) + "]";
                int i2 = Application.copydefault[oKMessage.getConversationType().ordinal()];
                if (i2 == 1) {
                    if (content instanceof OKTextMessage) {
                        string = ((OKTextMessage) content).getContent();
                    } else if (content instanceof OKStreamPlaceHolderMessage) {
                        string = ((OKStreamPlaceHolderMessage) content).getContent();
                    } else if ((content instanceof OKImageMessage) || (content instanceof OKGIFMessage)) {
                        str9 = str;
                        string = str3;
                    } else if (content instanceof OKSightMessage) {
                        string = str4;
                    } else if (!(content instanceof OKMediaMessage)) {
                        if (content instanceof OKHQVoiceMessage) {
                            string = str5;
                        } else if (content instanceof OKCallSTerminateMessage) {
                            sEG segGEmmrt = sdz2.gEmmrt();
                            if (segGEmmrt != null) {
                                string = segGEmmrt.AEQbTJ(content);
                            }
                        } else if (content instanceof OKAudioCallRecordMessage) {
                            sEG segGEmmrt2 = sdz2.gEmmrt();
                            if (segGEmmrt2 != null) {
                                string = segGEmmrt2.AEQbTJ(content);
                            }
                        } else if (content instanceof OKShareMessage) {
                            OKMessageContent content5 = oKMessage.getContent();
                            OKShareMessage oKShareMessage2 = content5 instanceof OKShareMessage ? (OKShareMessage) content5 : null;
                            String messagePreview2 = oKShareMessage2 != null ? oKShareMessage2.getMessagePreview() : null;
                            if (C33129mqd.OLrzqt((CharSequence) messagePreview2)) {
                                string = str6 + str7 + messagePreview2;
                            } else {
                                string = str6;
                            }
                        } else if (content instanceof OKCustomMessage) {
                            OKCustomMessage.Application pushData3 = ((OKCustomMessage) content).getPushData();
                            if (pushData3 == null || (strCopydefault = pushData3.copydefault()) == null) {
                                return null;
                            }
                            if (!C33129mqd.OLrzqt((CharSequence) strCopydefault)) {
                                strCopydefault = null;
                            }
                            if (strCopydefault == null) {
                                return null;
                            }
                        } else if (content instanceof OKStickerMessage) {
                            string = str8;
                        } else {
                            if (!(content instanceof OKGroupInvitationMessage)) {
                                return null;
                            }
                            string = sSY.AEQbTJ.EZpvd(applicationValueOf, ((OKGroupInvitationMessage) content).getGroupName());
                        }
                    }
                    str9 = str;
                } else if (i2 == 2) {
                    if (!C44166sFt.OLrzqt(oKConversation)) {
                        sSY ssy2 = sSY.AEQbTJ;
                        this.L$0 = str;
                        this.L$1 = oKMessage;
                        this.L$2 = content;
                        this.L$3 = applicationValueOf;
                        this.L$4 = str3;
                        this.L$5 = str4;
                        this.L$6 = str5;
                        this.L$7 = str6;
                        this.L$8 = str8;
                        this.L$9 = string;
                        this.label = 2;
                        objAEQbTJ = ssy2.AEQbTJ(oKMessage, this);
                        if (objAEQbTJ == objCopydefault2) {
                            return objCopydefault2;
                        }
                        str10 = str4;
                        str11 = string;
                        str12 = str3;
                        str13 = str6;
                        str14 = (String) objAEQbTJ;
                        string = str11;
                        str6 = str13;
                        str4 = str10;
                        str3 = str12;
                        if (content instanceof OKTextMessage) {
                        }
                        str9 = str;
                    } else {
                        str14 = null;
                        if (content instanceof OKTextMessage) {
                        }
                        str9 = str;
                    }
                }
                str9 = str;
                string = null;
            } else {
                str2 = "-";
                strCopydefault = null;
            }
            string = strCopydefault;
            str9 = str;
        }
        return new OKMessagePushConfig(str9, string != null ? str2 : string, (String) null, 4, (DefaultConstructorMarker) null);
    }
}
