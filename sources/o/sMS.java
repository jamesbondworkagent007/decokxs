package o;

import com.okinc.okimcore.model.im.OKGroupVoiceCallMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.CallMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption;
import com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.im.inhouseim.ws.InhouseIMAtUser;
import com.okinc.okimcore.model.im.inhouseim.ws.MediaMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.TextMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.VideoMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.VoiceMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import com.okinc.okimcore.model.room.inhouseim.MessageStatus;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public final class sMS {
    public static final int EZpvd;
    public static final java.util.Set<InHouseIMContentType> KWHzl;
    public static final java.util.Set<java.lang.String> OLrzqt;
    public static final java.util.Set<InHouseIMContentType> copydefault;
    public static final sMS djBIcL = new sMS();
    public static final java.util.Set<java.lang.String> AEQbTJ = yEE.AhwBna("CHAT_STATUS_MESSAGE", "SESSION_END", "ANSWER_CSAT_MESSAGE");

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InHouseIMContentType.values().length];
            try {
                iArr[InHouseIMContentType.Image.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InHouseIMContentType.Video.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[InHouseIMContentType.Voice.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[InHouseIMContentType.Media.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            EZpvd = iArr;
        }
    }

    private sMS() {
    }

    static {
        InHouseIMContentType inHouseIMContentType = InHouseIMContentType.RecallMessageByAdmin;
        copydefault = yEE.AhwBna(inHouseIMContentType, InHouseIMContentType.RecallMessageByAdminServer);
        KWHzl = yEE.AhwBna(InHouseIMContentType.ReadReceipt, inHouseIMContentType, InHouseIMContentType.RecallMessageBySender, InHouseIMContentType.TypingIndicator);
        OLrzqt = yEE.AhwBna(OKGroupVoiceCallMessage.BIZ_NAME_AGORA_CALL_ONGOING, OKGroupVoiceCallMessage.BIZ_NAME_AGORA_CALL_END);
        EZpvd = 8;
    }

    public final SystemMessageData OLrzqt(@NotNull WSSendMessageDetailData wSSendMessageDetailData, int i) {
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        SystemMessageData systemMessage = wSSendMessageDetailData.getSystemMessage();
        if (systemMessage == null || C33129mqd.AhwBna(systemMessage.EZpvd()) != i) {
            return null;
        }
        return systemMessage;
    }

    public final boolean KWHzl(@NotNull WSSendMessageDetailData wSSendMessageDetailData) {
        java.lang.Long lEZpvd;
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        java.util.List listGEmmrt = yDY.gEmmrt(java.lang.Integer.valueOf(SystemMessageData.InvisibleSystemAction.SYSTEM_ACTION_GROUP_APPROVAL.getSystemAction()), java.lang.Integer.valueOf(SystemMessageData.InvisibleSystemAction.SYSTEM_ACTION_GROUP_JOIN_APPLICATION.getSystemAction()), java.lang.Integer.valueOf(SystemMessageData.InvisibleSystemAction.SYSTEM_ACTION_GROUP_REJECT.getSystemAction()), java.lang.Integer.valueOf(SystemMessageData.InvisibleSystemAction.SYSTEM_ACTION_GROUP_WITHDRAWN_APPLICATION.getSystemAction()));
        SystemMessageData systemMessage = wSSendMessageDetailData.getSystemMessage();
        return CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Integer>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), (systemMessage == null || (lEZpvd = systemMessage.EZpvd()) == null) ? null : java.lang.Integer.valueOf(C33129mqd.AhwBna(lEZpvd)));
    }

    public final boolean AhwBna(@NotNull WSSendMessageDetailData wSSendMessageDetailData) {
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        return wSSendMessageDetailData.getContentType() == InHouseIMContentType.Stream;
    }

    public final boolean gEmmrt(@NotNull WSSendMessageDetailData wSSendMessageDetailData) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objDecodeFromString;
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        CustomMessageData customMessage = wSSendMessageDetailData.getCustomMessage();
        java.lang.String frontendOption = customMessage != null ? customMessage.getFrontendOption() : null;
        FrontendOption frontendOption2 = wSSendMessageDetailData.getFrontendOption();
        if (frontendOption != null) {
            try {
                Result.Application application = Result.Companion;
                try {
                    objDecodeFromString = sHW.copydefault().KWHzl().decodeFromString(FrontendOption.Companion.serializer(), frontendOption);
                } catch (SerializationException e) {
                    pUU.copydefault("SafeJson", "decodeFromString with multiple parameters SerializationException: " + e.getMessage());
                    sSR.copydefault("decodeFromString with multiple parameters SerializationException", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e.getMessage()))));
                    objDecodeFromString = null;
                } catch (java.lang.Exception e2) {
                    pUU.copydefault("SafeJson", "decodeFromString with multiple parameters error: " + e2.getMessage());
                    sSR.copydefault("decodeFromString with multiple parameters Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e2.getMessage()))));
                    objDecodeFromString = null;
                }
                objM7377constructorimpl = Result.m7377constructorimpl((FrontendOption) objDecodeFromString);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                java.lang.String message = thM7380exceptionOrNullimpl.getMessage();
                pUU.AEQbTJ("NotificationServiceExtension", message != null ? message : "", thM7380exceptionOrNullimpl);
            }
            FrontendOption frontendOption3 = (FrontendOption) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            if (frontendOption3 != null) {
                return djBIcL.EZpvd(frontendOption3, wSSendMessageDetailData.getSenderUid());
            }
        } else if (frontendOption2 != null) {
            return EZpvd(frontendOption2, wSSendMessageDetailData.getSenderUid());
        }
        return false;
    }

    public final boolean EZpvd(FrontendOption frontendOption, java.lang.String str) {
        java.util.List<java.lang.String> listAhwBna;
        try {
            if (frontendOption.copydefault() != null) {
                if (frontendOption.copydefault().booleanValue() || !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) C44157sFk.KWHzl())) {
                    return false;
                }
            } else {
                java.lang.String strKWHzl = C44157sFk.KWHzl();
                java.lang.Integer numOLrzqt = frontendOption.OLrzqt();
                int iIntValue = numOLrzqt != null ? numOLrzqt.intValue() : 0;
                if (iIntValue != 1) {
                    if (iIntValue == 2) {
                        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) strKWHzl);
                    }
                    if (iIntValue != 3) {
                        if (iIntValue != 4) {
                            return false;
                        }
                        FrontendOption.VisibilityStrategy visibilityStrategyKWHzl = frontendOption.KWHzl();
                        if (visibilityStrategyKWHzl == null || (listAhwBna = visibilityStrategyKWHzl.copydefault()) == null) {
                            listAhwBna = yDY.AhwBna();
                        }
                        if (!(listAhwBna instanceof java.util.Collection) || !listAhwBna.isEmpty()) {
                            java.util.Iterator<T> it = listAhwBna.iterator();
                            while (it.hasNext()) {
                                if (Intrinsics.EZpvd(it.next(), (java.lang.Object) strKWHzl)) {
                                    return false;
                                }
                            }
                        }
                    }
                } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) strKWHzl)) {
                    return false;
                }
            }
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FrontendOption copydefault(@NotNull WSSendMessageDetailData wSSendMessageDetailData) {
        java.lang.String frontendOption;
        FrontendOption frontendOption2;
        java.lang.Object objDecodeFromString;
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        if (wSSendMessageDetailData.getContentType() != InHouseIMContentType.Custom) {
            return wSSendMessageDetailData.getFrontendOption();
        }
        CustomMessageData customMessage = wSSendMessageDetailData.getCustomMessage();
        if (customMessage != null && (frontendOption = customMessage.getFrontendOption()) != null) {
            try {
                try {
                    try {
                        objDecodeFromString = sHW.copydefault().KWHzl().decodeFromString(FrontendOption.Companion.serializer(), frontendOption);
                    } catch (SerializationException e) {
                        pUU.copydefault("SafeJson", "decodeFromString with multiple parameters SerializationException: " + e.getMessage());
                        sSR.copydefault("decodeFromString with multiple parameters SerializationException", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e.getMessage()))));
                        objDecodeFromString = null;
                        frontendOption2 = (FrontendOption) objDecodeFromString;
                        if (frontendOption2 != null) {
                        }
                        return wSSendMessageDetailData.getFrontendOption();
                    }
                } catch (java.lang.Exception e2) {
                    pUU.copydefault("SafeJson", "decodeFromString with multiple parameters error: " + e2.getMessage());
                    sSR.copydefault("decodeFromString with multiple parameters Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e2.getMessage()))));
                    objDecodeFromString = null;
                    frontendOption2 = (FrontendOption) objDecodeFromString;
                    if (frontendOption2 != null) {
                    }
                    return wSSendMessageDetailData.getFrontendOption();
                }
                frontendOption2 = (FrontendOption) objDecodeFromString;
            } catch (java.lang.Exception unused) {
                frontendOption2 = null;
            }
            if (frontendOption2 != null) {
                return frontendOption2;
            }
        }
        return wSSendMessageDetailData.getFrontendOption();
    }

    public final boolean EZpvd(@NotNull InHouseIMContentType inHouseIMContentType) {
        Intrinsics.checkNotNullParameter(inHouseIMContentType, "");
        return copydefault.contains(inHouseIMContentType);
    }

    public final boolean AEQbTJ(InHouseIMContentType inHouseIMContentType) {
        if (inHouseIMContentType == null) {
            return false;
        }
        return !copydefault(inHouseIMContentType);
    }

    public final boolean copydefault(@NotNull InHouseIMContentType inHouseIMContentType) {
        Intrinsics.checkNotNullParameter(inHouseIMContentType, "");
        return KWHzl.contains(inHouseIMContentType);
    }

    public final boolean djBIcL(@NotNull WSSendMessageDetailData wSSendMessageDetailData) {
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        java.lang.Integer status = wSSendMessageDetailData.getStatus();
        return status != null && status.intValue() == MessageStatus.Rejected.getStatus();
    }

    public final boolean AEQbTJ(@NotNull WSSendMessageDetailData wSSendMessageDetailData, @NotNull java.lang.String str) {
        java.util.List<InhouseIMAtUser> listAEQbTJ;
        java.lang.Long fieldNames;
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        Intrinsics.checkNotNullParameter(str, "");
        long jValueOf = C33129mqd.valueOf(str);
        TextMessageData textMessage = wSSendMessageDetailData.getTextMessage();
        if (textMessage != null && (listAEQbTJ = textMessage.AEQbTJ()) != null && !listAEQbTJ.isEmpty()) {
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                java.lang.String strKWHzl = ((InhouseIMAtUser) it.next()).KWHzl();
                if (strKWHzl != null && (fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(strKWHzl)) != null && fieldNames.longValue() == jValueOf) {
                    return true;
                }
            }
        }
        return false;
    }

    public final C44434sPr OLrzqt(@NotNull WSSendMessageDetailData wSSendMessageDetailData) {
        MediaMessageData mediaMessage;
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        InHouseIMContentType contentType = wSSendMessageDetailData.getContentType();
        int i = contentType == null ? -1 : ActionBar.EZpvd[contentType.ordinal()];
        if (i == 1) {
            ImageMessageData imageMessage = wSSendMessageDetailData.getImageMessage();
            if (imageMessage != null) {
                return C44447sQd.OLrzqt(imageMessage);
            }
        } else if (i == 2) {
            VideoMessageData videoMessage = wSSendMessageDetailData.getVideoMessage();
            if (videoMessage != null) {
                return C44447sQd.EZpvd(videoMessage);
            }
        } else if (i == 3) {
            VoiceMessageData voiceMessage = wSSendMessageDetailData.getVoiceMessage();
            if (voiceMessage != null) {
                return C44447sQd.AEQbTJ(voiceMessage);
            }
        } else if (i == 4 && (mediaMessage = wSSendMessageDetailData.getMediaMessage()) != null) {
            return C44447sQd.KWHzl(mediaMessage);
        }
        return null;
    }

    public final C44434sPr KWHzl(@NotNull InHouseIMContentType inHouseIMContentType, java.lang.String str) {
        java.lang.Object objDecodeFromString;
        java.lang.Object objDecodeFromString2;
        java.lang.Object objDecodeFromString3;
        java.lang.Object objDecodeFromString4;
        Intrinsics.checkNotNullParameter(inHouseIMContentType, "");
        if (str == null) {
            return null;
        }
        try {
            int i = ActionBar.EZpvd[inHouseIMContentType.ordinal()];
            if (i == 1) {
                sHY shyCopydefault = sHW.copydefault();
                try {
                    Json jsonKWHzl = shyCopydefault.KWHzl();
                    shyCopydefault.KWHzl().getSerializersModule();
                    objDecodeFromString = jsonKWHzl.decodeFromString(BuiltinSerializersKt.getNullable(ImageMessageData.Companion.serializer()), str);
                } catch (SerializationException e) {
                    pUU.copydefault("SafeJson", "decodeFromString SerializationException: " + e.getMessage());
                    sSR.copydefault("decodeFromString SerializationException", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e.getMessage()))));
                    objDecodeFromString = null;
                } catch (java.lang.Exception e2) {
                    pUU.copydefault("SafeJson", "decodeFromString error: " + e2.getMessage());
                    sSR.copydefault("decodeFromString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e2.getMessage()))));
                    objDecodeFromString = null;
                }
                ImageMessageData imageMessageData = (ImageMessageData) objDecodeFromString;
                if (imageMessageData != null) {
                    return C44447sQd.OLrzqt(imageMessageData);
                }
                return null;
            }
            if (i == 2) {
                sHY shyCopydefault2 = sHW.copydefault();
                try {
                    Json jsonKWHzl2 = shyCopydefault2.KWHzl();
                    shyCopydefault2.KWHzl().getSerializersModule();
                    objDecodeFromString2 = jsonKWHzl2.decodeFromString(BuiltinSerializersKt.getNullable(VideoMessageData.Companion.serializer()), str);
                } catch (SerializationException e3) {
                    pUU.copydefault("SafeJson", "decodeFromString SerializationException: " + e3.getMessage());
                    sSR.copydefault("decodeFromString SerializationException", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e3.getMessage()))));
                    objDecodeFromString2 = null;
                } catch (java.lang.Exception e4) {
                    pUU.copydefault("SafeJson", "decodeFromString error: " + e4.getMessage());
                    sSR.copydefault("decodeFromString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e4.getMessage()))));
                    objDecodeFromString2 = null;
                }
                VideoMessageData videoMessageData = (VideoMessageData) objDecodeFromString2;
                if (videoMessageData != null) {
                    return C44447sQd.EZpvd(videoMessageData);
                }
                return null;
            }
            if (i == 3) {
                sHY shyCopydefault3 = sHW.copydefault();
                try {
                    Json jsonKWHzl3 = shyCopydefault3.KWHzl();
                    shyCopydefault3.KWHzl().getSerializersModule();
                    objDecodeFromString3 = jsonKWHzl3.decodeFromString(BuiltinSerializersKt.getNullable(VoiceMessageData.Companion.serializer()), str);
                } catch (SerializationException e5) {
                    pUU.copydefault("SafeJson", "decodeFromString SerializationException: " + e5.getMessage());
                    sSR.copydefault("decodeFromString SerializationException", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e5.getMessage()))));
                    objDecodeFromString3 = null;
                } catch (java.lang.Exception e6) {
                    pUU.copydefault("SafeJson", "decodeFromString error: " + e6.getMessage());
                    sSR.copydefault("decodeFromString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e6.getMessage()))));
                    objDecodeFromString3 = null;
                }
                VoiceMessageData voiceMessageData = (VoiceMessageData) objDecodeFromString3;
                if (voiceMessageData != null) {
                    return C44447sQd.AEQbTJ(voiceMessageData);
                }
                return null;
            }
            if (i != 4) {
                return null;
            }
            sHY shyCopydefault4 = sHW.copydefault();
            try {
                Json jsonKWHzl4 = shyCopydefault4.KWHzl();
                shyCopydefault4.KWHzl().getSerializersModule();
                objDecodeFromString4 = jsonKWHzl4.decodeFromString(BuiltinSerializersKt.getNullable(MediaMessageData.Companion.serializer()), str);
            } catch (SerializationException e7) {
                pUU.copydefault("SafeJson", "decodeFromString SerializationException: " + e7.getMessage());
                sSR.copydefault("decodeFromString SerializationException", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e7.getMessage()))));
                objDecodeFromString4 = null;
            } catch (java.lang.Exception e8) {
                pUU.copydefault("SafeJson", "decodeFromString error: " + e8.getMessage());
                sSR.copydefault("decodeFromString Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e8.getMessage()))));
                objDecodeFromString4 = null;
            }
            MediaMessageData mediaMessageData = (MediaMessageData) objDecodeFromString4;
            if (mediaMessageData != null) {
                return C44447sQd.KWHzl(mediaMessageData);
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
        return null;
    }

    public final boolean AYXKKw(@NotNull WSSendMessageDetailData wSSendMessageDetailData) {
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        boolean zValueOf = valueOf(wSSendMessageDetailData);
        boolean zEZpvd = EZpvd(wSSendMessageDetailData);
        return (!AEQbTJ(wSSendMessageDetailData.getContentType()) || zValueOf || djBIcL(wSSendMessageDetailData) || zEZpvd || gEmmrt(wSSendMessageDetailData) || AEQbTJ(wSSendMessageDetailData)) ? false : true;
    }

    public final boolean AEQbTJ(@NotNull WSSendMessageDetailData wSSendMessageDetailData) {
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        if (wSSendMessageDetailData.getContentType() == InHouseIMContentType.Custom) {
            java.util.Set<java.lang.String> set = AEQbTJ;
            CustomMessageData customMessage = wSSendMessageDetailData.getCustomMessage();
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) set), customMessage != null ? customMessage.getBizName() : null)) {
                return true;
            }
        }
        return false;
    }

    public final boolean EZpvd(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity) {
        Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
        if (inHouseIMMessageEntity.getContentType() == InHouseIMContentType.Custom.getApiValue()) {
            java.util.Set<java.lang.String> set = OLrzqt;
            CustomMessageData customMessage = inHouseIMMessageEntity.getCustomMessage();
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) set), customMessage != null ? customMessage.getBizName() : null)) {
                return true;
            }
        }
        return false;
    }

    public final boolean valueOf(WSSendMessageDetailData wSSendMessageDetailData) {
        if (wSSendMessageDetailData.getContentType() == InHouseIMContentType.SystemMessage) {
            SystemMessageData.VisibleSystemAction.Application application = SystemMessageData.VisibleSystemAction.Companion;
            SystemMessageData systemMessage = wSSendMessageDetailData.getSystemMessage();
            if (application.KWHzl(C33129mqd.AhwBna(systemMessage != null ? systemMessage.EZpvd() : null)) == null) {
                return true;
            }
        }
        return false;
    }

    public final boolean EZpvd(WSSendMessageDetailData wSSendMessageDetailData) {
        java.lang.Integer signalType;
        java.lang.Integer signalType2;
        CallMessageData callMessage = wSSendMessageDetailData.getCallMessage();
        if (callMessage != null && (signalType2 = callMessage.getSignalType()) != null && signalType2.intValue() == 1) {
            return true;
        }
        CallMessageData callMessage2 = wSSendMessageDetailData.getCallMessage();
        return (callMessage2 == null || (signalType = callMessage2.getSignalType()) == null || signalType.intValue() != 4) ? false : true;
    }
}
