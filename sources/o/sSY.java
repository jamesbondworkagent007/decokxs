package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao;
import com.okinc.okimcore.feature.notification.model.ConversationType;
import com.okinc.okimcore.feature.notification.model.LaunchUrlData;
import com.okinc.okimcore.feature.notification.model.NotificationData;
import com.okinc.okimcore.feature.notification.model.NotificationType;
import com.okinc.okimcore.feature.notification.model.PayloadData;
import com.okinc.okimcore.model.im.OKAudioCallRecordMessage;
import com.okinc.okimcore.model.im.OKCallSTerminateMessage;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKCustomMessage;
import com.okinc.okimcore.model.im.OKIMStartVoiceCallMessage;
import com.okinc.okimcore.model.im.OKMentionedInfo;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKMessagePushConfig;
import com.okinc.okimcore.model.im.inhouseim.ws.FrontendOption;
import com.okinc.okimcore.model.im.inhouseim.ws.GroupStatus;
import com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus;
import com.okinc.okimcore.model.other.OKRecallNotificationMessage;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.ContactEntity;
import com.okinc.okimcore.model.room.inhouseim.ContactWithPhoneData;
import com.okinc.okimcore.model.room.inhouseim.ConversationStatus;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import com.okinc.okimcore.utils.NotificationUtils$buildInHousePushConfig$2;
import com.okinc.okimcore.utils.NotificationUtils$getContact$1;
import com.okinc.okimcore.utils.NotificationUtils$getConversation$1;
import com.okinc.okimcore.utils.NotificationUtils$getMentionUidMap$1;
import com.okinc.okimcore.utils.NotificationUtils$getPushTittle$1;
import com.okinc.okimcore.utils.NotificationUtils$getSenderName$1;
import com.okinc.okimcore.utils.NotificationUtils$shouldShowIMLocalNotification$1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.serialization.SerializationException;
import o.sDX;
import o.sGF;
import o.sMY;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class sSY {
    public static final sSY AEQbTJ = new sSY();

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[GroupTagType.values().length];
            try {
                iArr[GroupTagType.VIP_CHAT_GROUP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[GroupTagType.OK_ASSISTANT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[ConversationType.values().length];
            try {
                iArr2[ConversationType.VIP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[ConversationType.GROUP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[ConversationType.INDIVIDUAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            copydefault = iArr2;
            int[] iArr3 = new int[NotificationType.values().length];
            try {
                iArr3[NotificationType.VOICE_CALL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr3[NotificationType.MESSAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            OLrzqt = iArr3;
        }
    }

    private sSY() {
    }

    public final java.lang.String EZpvd(OKConversation oKConversation) {
        java.lang.String str;
        GroupTagType groupType = oKConversation != null ? oKConversation.getGroupType() : null;
        int i = groupType == null ? -1 : StateListAnimator.EZpvd[groupType.ordinal()];
        if (i == 1 || i == 2) {
            str = "okx://app/customer/service?from=cg_app_notification";
        } else {
            str = "okx://app/im/notifyChat?conversation=" + (oKConversation != null ? oKConversation.getTargetId() : null);
        }
        return EZpvd(str);
    }

    public final java.lang.String copydefault(@NotNull LaunchUrlData launchUrlData, OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(launchUrlData, "");
        java.lang.String deeplink = launchUrlData.getDeeplink();
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) deeplink)) {
            deeplink = null;
        }
        if (deeplink == null) {
            deeplink = EZpvd(oKConversation);
        }
        return EZpvd(deeplink);
    }

    public final boolean copydefault(@NotNull NotificationData notificationData) {
        Intrinsics.checkNotNullParameter(notificationData, "");
        java.lang.Integer operation = notificationData.getOperation();
        return operation != null && operation.intValue() == 1;
    }

    public final java.util.List<java.lang.Integer> EZpvd(@NotNull java.lang.String str, @NotNull NotificationData notificationData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(notificationData, "");
        java.util.List<java.lang.String> refSeqList = notificationData.getRefSeqList();
        if (refSeqList == null) {
            refSeqList = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(refSeqList, 10));
        java.util.Iterator<T> it = refSeqList.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(str.hashCode() + java.lang.Integer.parseInt((java.lang.String) it.next())));
        }
        return arrayList;
    }

    public final PayloadData copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        JSONObject jSONObject = new JSONObject(str);
        java.lang.String strOptString = jSONObject.optString(RemoteMessageConst.Notification.SOUND);
        java.lang.String strOptString2 = jSONObject.optString("chnl");
        Intrinsics.copydefault((java.lang.Object) strOptString2);
        java.lang.String strOptString3 = strOptString2.length() != 0 ? new JSONObject(strOptString2).optString("id") : "";
        Intrinsics.copydefault((java.lang.Object) strOptString);
        Intrinsics.copydefault((java.lang.Object) strOptString3);
        return new PayloadData(strOptString, strOptString3);
    }

    /* JADX DEBUG: Duplicate block (B:81:0x01ab) to fix multi-entry loop: BACK_EDGE: B:81:0x01ab -> B:82:0x01af */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v31, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v43, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v44, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0154 A[Catch: all -> 0x0058, TryCatch #7 {all -> 0x0058, blocks: (B:13:0x0046, B:41:0x0106, B:58:0x0146, B:59:0x0149, B:63:0x014e, B:65:0x0154, B:67:0x0160, B:68:0x0163, B:69:0x0164, B:70:0x0167), top: B:101:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0184 A[Catch: all -> 0x01b6, TRY_LEAVE, TryCatch #6 {all -> 0x01b6, blocks: (B:75:0x0177, B:77:0x0184), top: B:99:0x0177 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(sIB sib, @NotNull java.lang.String str, @NotNull Continuation<? super ContactEntity> continuation) throws java.lang.Exception {
        NotificationUtils$getContact$1 notificationUtils$getContact$1;
        BaseDao baseDao;
        Ref.LongRef longRef;
        InHouseIMContactDao inHouseIMContactDaoOLrzqt;
        Ref.LongRef longRef2;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        java.lang.String str2;
        NotificationUtils$getContact$1 notificationUtils$getContact$12;
        sIB sib2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        int i3;
        java.lang.String str3;
        Ref.ObjectRef objectRef2;
        int i4;
        sIB sib3;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef3;
        int i5;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        BaseDao baseDao2;
        long jNanoTime;
        java.lang.String str4;
        int i6;
        T t;
        ContactWithPhoneData contactWithPhoneData;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException2;
        if (continuation instanceof NotificationUtils$getContact$1) {
            notificationUtils$getContact$1 = (NotificationUtils$getContact$1) continuation;
            int i7 = notificationUtils$getContact$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                notificationUtils$getContact$1.label = i7 - Integer.MIN_VALUE;
            } else {
                notificationUtils$getContact$1 = new NotificationUtils$getContact$1(this, continuation);
            }
        }
        java.lang.Object obj = notificationUtils$getContact$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = notificationUtils$getContact$1.label;
        try {
            if (i8 == 0) {
                C56391yDq.AEQbTJ(obj);
                if (sib != null && (inHouseIMContactDaoOLrzqt = sib.OLrzqt()) != null) {
                    baseDao = inHouseIMContactDaoOLrzqt;
                    longRef2 = new Ref.LongRef();
                    objectRef = new Ref.ObjectRef();
                    i = 3;
                    i2 = 0;
                    str2 = str;
                    notificationUtils$getContact$12 = notificationUtils$getContact$1;
                    sib2 = sib;
                    if (i2 < i) {
                    }
                }
                return null;
            }
            if (i8 == 1) {
                jNanoTime = notificationUtils$getContact$1.J$0;
                i4 = notificationUtils$getContact$1.I$2;
                i3 = notificationUtils$getContact$1.I$1;
                i = notificationUtils$getContact$1.I$0;
                objectRef5 = (Ref.ObjectRef) notificationUtils$getContact$1.L$7;
                longRef2 = (Ref.LongRef) notificationUtils$getContact$1.L$6;
                objectRef4 = (Ref.ObjectRef) notificationUtils$getContact$1.L$5;
                objectRef2 = (Ref.ObjectRef) notificationUtils$getContact$1.L$4;
                longRef = (Ref.LongRef) notificationUtils$getContact$1.L$3;
                baseDao = (BaseDao) notificationUtils$getContact$1.L$2;
                str4 = (java.lang.String) notificationUtils$getContact$1.L$1;
                sib3 = (sIB) notificationUtils$getContact$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    longRef3 = longRef;
                    i5 = i3;
                    baseDao2 = baseDao;
                    i6 = i;
                    t = obj;
                } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                    str3 = str4;
                    sQLiteDatabaseLockedException = e3;
                    objectRef3 = objectRef2;
                    int i9 = i3;
                    longRef3 = longRef;
                    i5 = i9;
                    r0 = sQLiteDatabaseLockedException;
                    C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                    objectRef3.element = r0;
                    if (i4 < i - 1) {
                    }
                    i2 = i5 + 1;
                    objectRef = objectRef3;
                    longRef2 = longRef3;
                    if (i2 < i) {
                    }
                } catch (java.lang.IllegalStateException e4) {
                    e2 = e4;
                    message = e2.getMessage();
                    if (message == null) {
                    }
                    C44159sFm.copydefault(e2);
                    throw e2;
                } catch (java.lang.Exception e5) {
                    e = e5;
                    C44159sFm.OLrzqt(e);
                    throw e;
                } catch (java.lang.Throwable th) {
                    th = th;
                    C44159sFm.EZpvd(baseDao, longRef.element);
                    throw th;
                }
                objectRef5.element = t;
                longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                T t2 = objectRef4.element;
                C44159sFm.EZpvd(baseDao2, longRef3.element);
                contactWithPhoneData = (ContactWithPhoneData) t2;
                if (contactWithPhoneData != null) {
                }
                return null;
            }
            if (i8 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i10 = notificationUtils$getContact$1.I$1;
            int i11 = notificationUtils$getContact$1.I$0;
            objectRef3 = (Ref.ObjectRef) notificationUtils$getContact$1.L$4;
            longRef3 = (Ref.LongRef) notificationUtils$getContact$1.L$3;
            BaseDao baseDao3 = (BaseDao) notificationUtils$getContact$1.L$2;
            java.lang.String str5 = (java.lang.String) notificationUtils$getContact$1.L$1;
            sIB sib4 = (sIB) notificationUtils$getContact$1.L$0;
            C56391yDq.AEQbTJ(obj);
            baseDao = baseDao3;
            str2 = str5;
            i = i11;
            notificationUtils$getContact$12 = notificationUtils$getContact$1;
            sib2 = sib4;
            i5 = i10;
            i2 = i5 + 1;
            objectRef = objectRef3;
            longRef2 = longRef3;
            if (i2 < i) {
                try {
                    try {
                    } catch (java.lang.IllegalStateException e6) {
                        e2 = e6;
                        longRef = longRef2;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e7) {
                        e = e7;
                        longRef = longRef2;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        longRef = longRef2;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    }
                } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                    str3 = str2;
                    i3 = i2;
                    sQLiteDatabaseLockedException2 = e8;
                }
                try {
                } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                    try {
                        str3 = str2;
                        i3 = i2;
                        sQLiteDatabaseLockedException2 = e9;
                        sib3 = sib2;
                        notificationUtils$getContact$1 = notificationUtils$getContact$12;
                        i4 = i3;
                        objectRef2 = objectRef;
                        longRef = longRef2;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 < i - 1) {
                            notificationUtils$getContact$1.L$0 = sib3;
                            notificationUtils$getContact$1.L$1 = str3;
                            notificationUtils$getContact$1.L$2 = baseDao;
                            notificationUtils$getContact$1.L$3 = longRef3;
                            notificationUtils$getContact$1.L$4 = objectRef3;
                            notificationUtils$getContact$1.L$5 = null;
                            notificationUtils$getContact$1.L$6 = null;
                            notificationUtils$getContact$1.L$7 = null;
                            notificationUtils$getContact$1.I$0 = i;
                            notificationUtils$getContact$1.I$1 = i5;
                            notificationUtils$getContact$1.label = 2;
                            if (DelayKt.delay(((long) (i4 + 1)) * 50, notificationUtils$getContact$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            notificationUtils$getContact$12 = notificationUtils$getContact$1;
                            sib2 = sib3;
                            str2 = str3;
                        } else {
                            notificationUtils$getContact$12 = notificationUtils$getContact$1;
                            sib2 = sib3;
                            str2 = str3;
                        }
                        i2 = i5 + 1;
                        objectRef = objectRef3;
                        longRef2 = longRef3;
                        if (i2 < i) {
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        BaseDao baseDao4 = baseDao;
                        longRef = longRef3;
                        baseDao = baseDao4;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    }
                    objectRef3 = objectRef2;
                    int i92 = i3;
                    longRef3 = longRef;
                    i5 = i92;
                    r0 = sQLiteDatabaseLockedException;
                }
                objectRef5 = new Ref.ObjectRef();
                jNanoTime = java.lang.System.nanoTime();
                InHouseIMContactDao inHouseIMContactDaoOLrzqt2 = sib2.OLrzqt();
                notificationUtils$getContact$12.L$0 = sib2;
                notificationUtils$getContact$12.L$1 = str2;
                notificationUtils$getContact$12.L$2 = baseDao;
                notificationUtils$getContact$12.L$3 = longRef2;
                notificationUtils$getContact$12.L$4 = objectRef;
                notificationUtils$getContact$12.L$5 = objectRef5;
                notificationUtils$getContact$12.L$6 = longRef2;
                notificationUtils$getContact$12.L$7 = objectRef5;
                notificationUtils$getContact$12.I$0 = i;
                notificationUtils$getContact$12.I$1 = i2;
                notificationUtils$getContact$12.I$2 = i2;
                notificationUtils$getContact$12.J$0 = jNanoTime;
                notificationUtils$getContact$12.label = 1;
                java.lang.Object contactById = inHouseIMContactDaoOLrzqt2.getContactById(str2, notificationUtils$getContact$12);
                if (contactById == objCopydefault) {
                    return objCopydefault;
                }
                str4 = str2;
                objectRef4 = objectRef5;
                longRef3 = longRef2;
                sib3 = sib2;
                notificationUtils$getContact$1 = notificationUtils$getContact$12;
                i4 = i2;
                objectRef2 = objectRef;
                i5 = i4;
                int i12 = i;
                baseDao2 = baseDao;
                i6 = i12;
                t = contactById;
                try {
                } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                    objectRef3 = objectRef2;
                    str3 = str4;
                    BaseDao baseDao5 = baseDao2;
                    i = i6;
                    baseDao = baseDao5;
                    r0 = e10;
                    C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                    objectRef3.element = r0;
                    if (i4 < i - 1) {
                    }
                    i2 = i5 + 1;
                    objectRef = objectRef3;
                    longRef2 = longRef3;
                    if (i2 < i) {
                    }
                } catch (java.lang.IllegalStateException e11) {
                    e2 = e11;
                    message = e2.getMessage();
                    if (message == null) {
                    }
                    C44159sFm.copydefault(e2);
                    throw e2;
                } catch (java.lang.Exception e12) {
                    e = e12;
                    C44159sFm.OLrzqt(e);
                    throw e;
                }
                objectRef5.element = t;
                longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                T t22 = objectRef4.element;
                C44159sFm.EZpvd(baseDao2, longRef3.element);
                contactWithPhoneData = (ContactWithPhoneData) t22;
                if (contactWithPhoneData != null) {
                    return C44169sFw.EZpvd(contactWithPhoneData);
                }
                return null;
            }
            C44159sFm.EZpvd(baseDao, longRef2.element);
            java.lang.Exception exc = (java.lang.Exception) objectRef.element;
            if (exc == null) {
                exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
            }
            C44159sFm.OLrzqt(exc);
            throw exc;
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    /* JADX DEBUG: Duplicate block (B:90:0x022a) to fix multi-entry loop: BACK_EDGE: B:90:0x022a -> B:91:0x022e */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v37, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v49, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v50, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d3 A[Catch: all -> 0x0058, TryCatch #7 {all -> 0x0058, blocks: (B:13:0x0046, B:41:0x010a, B:67:0x01c5, B:68:0x01c8, B:72:0x01cd, B:74:0x01d3, B:76:0x01df, B:77:0x01e2, B:78:0x01e3, B:79:0x01e6), top: B:110:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0203 A[Catch: all -> 0x0235, TRY_LEAVE, TryCatch #5 {all -> 0x0235, blocks: (B:84:0x01f6, B:86:0x0203), top: B:106:0x01f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023f  */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(sIB sib, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.Map<java.lang.String, java.lang.String>> continuation) throws java.lang.Exception {
        NotificationUtils$getMentionUidMap$1 notificationUtils$getMentionUidMap$1;
        BaseDao baseDao;
        Ref.LongRef longRef;
        InHouseIMContactDao inHouseIMContactDaoOLrzqt;
        Ref.LongRef longRef2;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        java.util.List<java.lang.String> list2;
        NotificationUtils$getMentionUidMap$1 notificationUtils$getMentionUidMap$12;
        sIB sib2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        int i3;
        java.util.List<java.lang.String> list3;
        Ref.ObjectRef objectRef2;
        int i4;
        sIB sib3;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef3;
        int i5;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        BaseDao baseDao2;
        long jNanoTime;
        java.util.List<java.lang.String> list4;
        int i6;
        T t;
        java.util.List list5;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException2;
        if (continuation instanceof NotificationUtils$getMentionUidMap$1) {
            notificationUtils$getMentionUidMap$1 = (NotificationUtils$getMentionUidMap$1) continuation;
            int i7 = notificationUtils$getMentionUidMap$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                notificationUtils$getMentionUidMap$1.label = i7 - Integer.MIN_VALUE;
            } else {
                notificationUtils$getMentionUidMap$1 = new NotificationUtils$getMentionUidMap$1(this, continuation);
            }
        }
        java.lang.Object obj = notificationUtils$getMentionUidMap$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = notificationUtils$getMentionUidMap$1.label;
        try {
            if (i8 == 0) {
                C56391yDq.AEQbTJ(obj);
                if (sib != null && (inHouseIMContactDaoOLrzqt = sib.OLrzqt()) != null) {
                    baseDao = inHouseIMContactDaoOLrzqt;
                    longRef2 = new Ref.LongRef();
                    objectRef = new Ref.ObjectRef();
                    i = 3;
                    i2 = 0;
                    list2 = list;
                    notificationUtils$getMentionUidMap$12 = notificationUtils$getMentionUidMap$1;
                    sib2 = sib;
                    if (i2 < i) {
                    }
                }
                return C56424yEw.KWHzl();
            }
            if (i8 == 1) {
                jNanoTime = notificationUtils$getMentionUidMap$1.J$0;
                i4 = notificationUtils$getMentionUidMap$1.I$2;
                i3 = notificationUtils$getMentionUidMap$1.I$1;
                i = notificationUtils$getMentionUidMap$1.I$0;
                objectRef5 = (Ref.ObjectRef) notificationUtils$getMentionUidMap$1.L$7;
                longRef2 = (Ref.LongRef) notificationUtils$getMentionUidMap$1.L$6;
                objectRef4 = (Ref.ObjectRef) notificationUtils$getMentionUidMap$1.L$5;
                objectRef2 = (Ref.ObjectRef) notificationUtils$getMentionUidMap$1.L$4;
                longRef = (Ref.LongRef) notificationUtils$getMentionUidMap$1.L$3;
                baseDao = (BaseDao) notificationUtils$getMentionUidMap$1.L$2;
                list4 = (java.util.List) notificationUtils$getMentionUidMap$1.L$1;
                sib3 = (sIB) notificationUtils$getMentionUidMap$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    longRef3 = longRef;
                    i5 = i3;
                    baseDao2 = baseDao;
                    i6 = i;
                    t = obj;
                } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                    list3 = list4;
                    sQLiteDatabaseLockedException = e3;
                    objectRef3 = objectRef2;
                    int i9 = i3;
                    longRef3 = longRef;
                    i5 = i9;
                    r0 = sQLiteDatabaseLockedException;
                    C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                    objectRef3.element = r0;
                    if (i4 < i - 1) {
                    }
                    i2 = i5 + 1;
                    objectRef = objectRef3;
                    longRef2 = longRef3;
                    if (i2 < i) {
                    }
                } catch (java.lang.IllegalStateException e4) {
                    e2 = e4;
                    message = e2.getMessage();
                    if (message == null) {
                    }
                    C44159sFm.copydefault(e2);
                    throw e2;
                } catch (java.lang.Exception e5) {
                    e = e5;
                    C44159sFm.OLrzqt(e);
                    throw e;
                } catch (java.lang.Throwable th) {
                    th = th;
                    C44159sFm.EZpvd(baseDao, longRef.element);
                    throw th;
                }
                objectRef5.element = t;
                longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                T t2 = objectRef4.element;
                C44159sFm.EZpvd(baseDao2, longRef3.element);
                list5 = (java.util.List) t2;
                if (list5 != null) {
                }
                return C56424yEw.KWHzl();
            }
            if (i8 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i10 = notificationUtils$getMentionUidMap$1.I$1;
            int i11 = notificationUtils$getMentionUidMap$1.I$0;
            objectRef3 = (Ref.ObjectRef) notificationUtils$getMentionUidMap$1.L$4;
            longRef3 = (Ref.LongRef) notificationUtils$getMentionUidMap$1.L$3;
            BaseDao baseDao3 = (BaseDao) notificationUtils$getMentionUidMap$1.L$2;
            java.util.List<java.lang.String> list6 = (java.util.List) notificationUtils$getMentionUidMap$1.L$1;
            sIB sib4 = (sIB) notificationUtils$getMentionUidMap$1.L$0;
            C56391yDq.AEQbTJ(obj);
            baseDao = baseDao3;
            list2 = list6;
            i = i11;
            notificationUtils$getMentionUidMap$12 = notificationUtils$getMentionUidMap$1;
            sib2 = sib4;
            i5 = i10;
            i2 = i5 + 1;
            objectRef = objectRef3;
            longRef2 = longRef3;
            if (i2 < i) {
                try {
                    try {
                    } catch (java.lang.IllegalStateException e6) {
                        e2 = e6;
                        longRef = longRef2;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e7) {
                        e = e7;
                        longRef = longRef2;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        longRef = longRef2;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    }
                } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                    list3 = list2;
                    i3 = i2;
                    sQLiteDatabaseLockedException2 = e8;
                }
                try {
                } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                    try {
                        list3 = list2;
                        i3 = i2;
                        sQLiteDatabaseLockedException2 = e9;
                        sib3 = sib2;
                        notificationUtils$getMentionUidMap$1 = notificationUtils$getMentionUidMap$12;
                        i4 = i3;
                        objectRef2 = objectRef;
                        longRef = longRef2;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 < i - 1) {
                            notificationUtils$getMentionUidMap$1.L$0 = sib3;
                            notificationUtils$getMentionUidMap$1.L$1 = list3;
                            notificationUtils$getMentionUidMap$1.L$2 = baseDao;
                            notificationUtils$getMentionUidMap$1.L$3 = longRef3;
                            notificationUtils$getMentionUidMap$1.L$4 = objectRef3;
                            notificationUtils$getMentionUidMap$1.L$5 = null;
                            notificationUtils$getMentionUidMap$1.L$6 = null;
                            notificationUtils$getMentionUidMap$1.L$7 = null;
                            notificationUtils$getMentionUidMap$1.I$0 = i;
                            notificationUtils$getMentionUidMap$1.I$1 = i5;
                            notificationUtils$getMentionUidMap$1.label = 2;
                            if (DelayKt.delay(((long) (i4 + 1)) * 50, notificationUtils$getMentionUidMap$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            notificationUtils$getMentionUidMap$12 = notificationUtils$getMentionUidMap$1;
                            sib2 = sib3;
                            list2 = list3;
                        } else {
                            notificationUtils$getMentionUidMap$12 = notificationUtils$getMentionUidMap$1;
                            sib2 = sib3;
                            list2 = list3;
                        }
                        i2 = i5 + 1;
                        objectRef = objectRef3;
                        longRef2 = longRef3;
                        if (i2 < i) {
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        BaseDao baseDao4 = baseDao;
                        longRef = longRef3;
                        baseDao = baseDao4;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    }
                    objectRef3 = objectRef2;
                    int i92 = i3;
                    longRef3 = longRef;
                    i5 = i92;
                    r0 = sQLiteDatabaseLockedException;
                }
                objectRef5 = new Ref.ObjectRef();
                jNanoTime = java.lang.System.nanoTime();
                InHouseIMContactDao inHouseIMContactDaoOLrzqt2 = sib2.OLrzqt();
                java.util.Set<java.lang.String> setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(list2);
                notificationUtils$getMentionUidMap$12.L$0 = sib2;
                notificationUtils$getMentionUidMap$12.L$1 = list2;
                notificationUtils$getMentionUidMap$12.L$2 = baseDao;
                notificationUtils$getMentionUidMap$12.L$3 = longRef2;
                notificationUtils$getMentionUidMap$12.L$4 = objectRef;
                notificationUtils$getMentionUidMap$12.L$5 = objectRef5;
                notificationUtils$getMentionUidMap$12.L$6 = longRef2;
                notificationUtils$getMentionUidMap$12.L$7 = objectRef5;
                notificationUtils$getMentionUidMap$12.I$0 = i;
                notificationUtils$getMentionUidMap$12.I$1 = i2;
                notificationUtils$getMentionUidMap$12.I$2 = i2;
                notificationUtils$getMentionUidMap$12.J$0 = jNanoTime;
                notificationUtils$getMentionUidMap$12.label = 1;
                java.lang.Object relationListFromLocalByUids = inHouseIMContactDaoOLrzqt2.getRelationListFromLocalByUids(setOqFWZa, notificationUtils$getMentionUidMap$12);
                if (relationListFromLocalByUids == objCopydefault) {
                    return objCopydefault;
                }
                list4 = list2;
                objectRef4 = objectRef5;
                longRef3 = longRef2;
                sib3 = sib2;
                notificationUtils$getMentionUidMap$1 = notificationUtils$getMentionUidMap$12;
                i4 = i2;
                objectRef2 = objectRef;
                i5 = i4;
                int i12 = i;
                baseDao2 = baseDao;
                i6 = i12;
                t = relationListFromLocalByUids;
                try {
                } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                    objectRef3 = objectRef2;
                    list3 = list4;
                    BaseDao baseDao5 = baseDao2;
                    i = i6;
                    baseDao = baseDao5;
                    r0 = e10;
                    C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                    objectRef3.element = r0;
                    if (i4 < i - 1) {
                    }
                    i2 = i5 + 1;
                    objectRef = objectRef3;
                    longRef2 = longRef3;
                    if (i2 < i) {
                    }
                } catch (java.lang.IllegalStateException e11) {
                    e2 = e11;
                    message = e2.getMessage();
                    if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                        C44159sFm.OLrzqt(e2);
                        throw e2;
                    }
                    C44159sFm.copydefault(e2);
                    throw e2;
                } catch (java.lang.Exception e12) {
                    e = e12;
                    C44159sFm.OLrzqt(e);
                    throw e;
                }
                objectRef5.element = t;
                longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                T t22 = objectRef4.element;
                C44159sFm.EZpvd(baseDao2, longRef3.element);
                list5 = (java.util.List) t22;
                if (list5 != null) {
                    java.util.ArrayList<ContactWithPhoneData> arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : list5) {
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) ((ContactWithPhoneData) obj2).getPhoneName())) {
                            arrayList.add(obj2);
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList, 10)), 16));
                    for (ContactWithPhoneData contactWithPhoneData : arrayList) {
                        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt("@" + sQQ.AEQbTJ(contactWithPhoneData), "@" + contactWithPhoneData.getPhoneName());
                        linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
                    }
                    return linkedHashMap;
                }
                return C56424yEw.KWHzl();
            }
            C44159sFm.EZpvd(baseDao, longRef2.element);
            java.lang.Exception exc = (java.lang.Exception) objectRef.element;
            if (exc == null) {
                exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
            }
            C44159sFm.OLrzqt(exc);
            throw exc;
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    public final int OLrzqt(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.hashCode() + i;
    }

    public final java.lang.String copydefault(@NotNull LaunchUrlData launchUrlData, @NotNull NotificationType notificationType) {
        Intrinsics.checkNotNullParameter(launchUrlData, "");
        Intrinsics.checkNotNullParameter(notificationType, "");
        int i = StateListAnimator.OLrzqt[notificationType.ordinal()];
        if (i == 1) {
            return launchUrlData.getConversationId();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = StateListAnimator.copydefault[launchUrlData.getConversationType().ordinal()];
        if (i2 == 1 || !(i2 == 2 || i2 == 3)) {
            return null;
        }
        return launchUrlData.getConversationId();
    }

    public final java.lang.String copydefault(ContactEntity contactEntity, @NotNull C46952tgq c46952tgq, @NotNull NotificationType notificationType, LaunchUrlData launchUrlData) {
        java.lang.String strGEmmrt;
        Intrinsics.checkNotNullParameter(c46952tgq, "");
        Intrinsics.checkNotNullParameter(notificationType, "");
        int i = StateListAnimator.OLrzqt[notificationType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ConversationType conversationType = launchUrlData != null ? launchUrlData.getConversationType() : null;
            int i2 = conversationType == null ? -1 : StateListAnimator.copydefault[conversationType.ordinal()];
            if (i2 == 1 || i2 == 2) {
                strGEmmrt = c46952tgq.gEmmrt();
                if (strGEmmrt == null) {
                    return "";
                }
            } else if (i2 != 3) {
                strGEmmrt = c46952tgq.gEmmrt();
                if (strGEmmrt == null) {
                    return "";
                }
            } else if ((contactEntity == null || (strGEmmrt = contactEntity.getPhoneName()) == null) && (strGEmmrt = c46952tgq.gEmmrt()) == null) {
                return "";
            }
        } else if ((contactEntity == null || (strGEmmrt = contactEntity.getPhoneName()) == null) && (strGEmmrt = c46952tgq.gEmmrt()) == null) {
            return "";
        }
        return strGEmmrt;
    }

    public final java.lang.Object KWHzl(@NotNull LaunchUrlData launchUrlData, @NotNull NotificationType notificationType, @NotNull Continuation<? super OKConversation> continuation) {
        int i = StateListAnimator.OLrzqt[notificationType.ordinal()];
        if (i == 1) {
            return sGF.Activity.getConversation$default(sDZ.AEQbTJ.AYXKKw(), launchUrlData.getConversationId(), null, continuation, 2, null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = StateListAnimator.copydefault[launchUrlData.getConversationType().ordinal()];
        if (i2 == 1) {
            return new OKConversation((OKConversationType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, (java.lang.Integer) null, false, false, false, (OKMessageContent) null, (OKMessage.SentStatus) null, 0L, 0L, (java.lang.String) null, (DraftMessageModel) null, (OfficialTagInfo) null, (java.lang.Integer) null, false, (InGroupStatus) null, (GroupStatus) null, GroupTagType.VIP_CHAT_GROUP, (java.lang.Integer) null, (java.lang.String) null, (ConversationStatus) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, (java.lang.Integer) null, -16777217, 1, (DefaultConstructorMarker) null);
        }
        if (i2 == 2 || i2 == 3) {
            return new OKConversation((OKConversationType) null, launchUrlData.getConversationId(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, (java.lang.Integer) null, false, false, false, (OKMessageContent) null, (OKMessage.SentStatus) null, 0L, 0L, (java.lang.String) null, (DraftMessageModel) null, (OfficialTagInfo) null, (java.lang.Integer) null, false, (InGroupStatus) null, (GroupStatus) null, (GroupTagType) null, (java.lang.Integer) null, (java.lang.String) null, (ConversationStatus) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, (java.lang.Integer) null, -3, 1, (DefaultConstructorMarker) null);
        }
        return null;
    }

    public final java.lang.String KWHzl(@NotNull LaunchUrlData launchUrlData, ContactEntity contactEntity, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull NotificationData notificationData, @NotNull C46952tgq c46952tgq) {
        java.lang.String strOLrzqt;
        java.lang.Integer operation;
        java.lang.String strSubstringBefore$default;
        Intrinsics.checkNotNullParameter(launchUrlData, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(notificationData, "");
        Intrinsics.checkNotNullParameter(c46952tgq, "");
        if (yDY.gEmmrt(ConversationType.INDIVIDUAL, ConversationType.VIP).contains(launchUrlData.getConversationType()) || ((operation = notificationData.getOperation()) != null && operation.intValue() == 1 && launchUrlData.getConversationType() == ConversationType.GROUP)) {
            strOLrzqt = c46952tgq.OLrzqt();
            if (strOLrzqt == null) {
                return "";
            }
        } else {
            if (launchUrlData.getConversationType() == ConversationType.GROUP) {
                java.lang.String strOLrzqt2 = c46952tgq.OLrzqt();
                if (strOLrzqt2 == null) {
                    strOLrzqt2 = "";
                }
                java.lang.String strOLrzqt3 = c46952tgq.OLrzqt();
                java.lang.String str = strOLrzqt3 == null ? "" : strOLrzqt3;
                if (contactEntity == null || (strSubstringBefore$default = contactEntity.getPhoneName()) == null) {
                    strSubstringBefore$default = StringsKt__StringsKt.substringBefore$default(strOLrzqt2, ":", (java.lang.String) null, 2, (java.lang.Object) null);
                }
                java.lang.String strReplaceBefore$default = StringsKt__StringsKt.replaceBefore$default(str, ":", strSubstringBefore$default, (java.lang.String) null, 4, (java.lang.Object) null);
                java.util.Set<Map.Entry<java.lang.String, java.lang.String>> setEntrySet = map.entrySet();
                java.lang.String strSubstringAfter$default = StringsKt__StringsKt.substringAfter$default(strOLrzqt2, ":", (java.lang.String) null, 2, (java.lang.Object) null);
                java.util.Iterator<T> it = setEntrySet.iterator();
                java.lang.String strReplace$default = strSubstringAfter$default;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    strReplace$default = C59449zhJ.replace$default(strReplace$default, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, (java.lang.Object) null);
                }
                return StringsKt__StringsKt.replaceAfter$default(strReplaceBefore$default, ":", strReplace$default, (java.lang.String) null, 4, (java.lang.Object) null);
            }
            strOLrzqt = c46952tgq.OLrzqt();
            if (strOLrzqt == null) {
                return "";
            }
        }
        return strOLrzqt;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull C44467sQx c44467sQx, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        NotificationUtils$shouldShowIMLocalNotification$1 notificationUtils$shouldShowIMLocalNotification$1;
        OKMessage oKMessageCopydefault;
        int i;
        int i2;
        C44467sQx c44467sQx2;
        InterfaceC44375sNm interfaceC44375sNmEZpvd;
        OKMentionedInfo mentionedInfo;
        java.lang.Object objM7377constructorimpl;
        int i3;
        C44467sQx c44467sQx3;
        FrontendOption frontendOption;
        java.lang.Boolean boolEZpvd;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        boolean z2;
        java.lang.Boolean bool;
        int i8;
        int i9;
        int i10;
        C44467sQx c44467sQx4;
        boolean z3;
        java.lang.String frontendOption2;
        java.lang.Object objDecodeFromString;
        java.lang.Object objM7377constructorimpl2;
        boolean z4;
        boolean z5;
        if (continuation instanceof NotificationUtils$shouldShowIMLocalNotification$1) {
            notificationUtils$shouldShowIMLocalNotification$1 = (NotificationUtils$shouldShowIMLocalNotification$1) continuation;
            int i11 = notificationUtils$shouldShowIMLocalNotification$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                notificationUtils$shouldShowIMLocalNotification$1.label = i11 - Integer.MIN_VALUE;
            } else {
                notificationUtils$shouldShowIMLocalNotification$1 = new NotificationUtils$shouldShowIMLocalNotification$1(this, continuation);
            }
        }
        NotificationUtils$shouldShowIMLocalNotification$1 notificationUtils$shouldShowIMLocalNotification$12 = notificationUtils$shouldShowIMLocalNotification$1;
        java.lang.Object objCopydefault = notificationUtils$shouldShowIMLocalNotification$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i12 = notificationUtils$shouldShowIMLocalNotification$12.label;
        if (i12 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            oKMessageCopydefault = c44467sQx.copydefault();
            java.lang.String targetId = oKMessageCopydefault.getTargetId();
            long seq = oKMessageCopydefault.getSeq();
            OKMessageContent content = oKMessageCopydefault.getContent();
            i = ((content == null || (mentionedInfo = content.getMentionedInfo()) == null) ? null : mentionedInfo.getType()) == OKMentionedInfo.MentionedType.ALL ? 1 : 0;
            i2 = (i != 0 || sDZ.AEQbTJ.fIwbmz().OLrzqt(targetId)) ? 1 : 0;
            try {
                Result.Application application = Result.Companion;
                interfaceC44375sNmEZpvd = sDZ.AEQbTJ.AhwBna().EZpvd();
                notificationUtils$shouldShowIMLocalNotification$12.L$0 = this;
                c44467sQx2 = c44467sQx;
            } catch (java.lang.Throwable th) {
                th = th;
                c44467sQx2 = c44467sQx;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            try {
                notificationUtils$shouldShowIMLocalNotification$12.L$1 = c44467sQx2;
                notificationUtils$shouldShowIMLocalNotification$12.L$2 = oKMessageCopydefault;
                notificationUtils$shouldShowIMLocalNotification$12.I$0 = i;
                notificationUtils$shouldShowIMLocalNotification$12.I$1 = i2;
                notificationUtils$shouldShowIMLocalNotification$12.label = 1;
                objCopydefault = interfaceC44375sNmEZpvd.copydefault(targetId, seq, notificationUtils$shouldShowIMLocalNotification$12);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(((java.lang.Boolean) objCopydefault).booleanValue()));
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i9 = notificationUtils$shouldShowIMLocalNotification$12.I$2;
                z3 = notificationUtils$shouldShowIMLocalNotification$12.Z$0;
                i10 = notificationUtils$shouldShowIMLocalNotification$12.I$1;
                i8 = notificationUtils$shouldShowIMLocalNotification$12.I$0;
                bool = (java.lang.Boolean) notificationUtils$shouldShowIMLocalNotification$12.L$1;
                c44467sQx4 = (C44467sQx) notificationUtils$shouldShowIMLocalNotification$12.L$0;
                try {
                    C56391yDq.AEQbTJ(objCopydefault);
                    objM7377constructorimpl2 = Result.m7377constructorimpl((OKConversation) objCopydefault);
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    i3 = i10;
                    i6 = i8;
                    c44467sQx3 = c44467sQx4;
                    z2 = z3;
                    java.lang.Boolean bool2 = bool;
                    i7 = i9;
                    boolEZpvd = bool2;
                    Result.Application application3 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    z3 = z2;
                    i8 = i6;
                    i10 = i3;
                    c44467sQx4 = c44467sQx3;
                    int i13 = i7;
                    bool = boolEZpvd;
                    i9 = i13;
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                    objM7377constructorimpl2 = null;
                }
                OKConversation oKConversation = (OKConversation) objM7377constructorimpl2;
                boolean z6 = (oKConversation == null ? oKConversation.getConversationStatus() : null) != ConversationStatus.FOREVER_HIDDEN;
                boolean z7 = (oKConversation != null ? oKConversation.getGroupType() : null) != GroupTagType.OTC_AGENT;
                pUU.KWHzl("NotificationUtils", "on receive local notification[IN-HOUSE]: " + c44467sQx4 + ", isMessageMentionAll=" + (i8 == 0) + ", isNeedShowNotify=" + (i10 == 0) + ", isSystemMessage=" + z3 + ", isDisallowPushCustomMessage:" + (i9 == 0) + ", isEnableAppPushNotificationCustomMessage:" + bool + ", isHiddenConversation=" + z6 + ", isDisabledNotificationGroup=" + z7);
                if (i10 == 0 && !z3 && i9 == 0) {
                    z4 = false;
                    if (!Intrinsics.EZpvd(bool, C56443yFo.KWHzl(false)) && !z6 && !z7) {
                        z5 = true;
                    }
                    return C56443yFo.KWHzl(z5);
                }
                z4 = false;
                z5 = z4;
                return C56443yFo.KWHzl(z5);
            }
            i2 = notificationUtils$shouldShowIMLocalNotification$12.I$1;
            i = notificationUtils$shouldShowIMLocalNotification$12.I$0;
            oKMessageCopydefault = (OKMessage) notificationUtils$shouldShowIMLocalNotification$12.L$2;
            C44467sQx c44467sQx5 = (C44467sQx) notificationUtils$shouldShowIMLocalNotification$12.L$1;
            try {
                C56391yDq.AEQbTJ(objCopydefault);
                c44467sQx2 = c44467sQx5;
                objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(((java.lang.Boolean) objCopydefault).booleanValue()));
            } catch (java.lang.Throwable th4) {
                th = th4;
                c44467sQx2 = c44467sQx5;
                Result.Application application222 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        i3 = i2;
        c44467sQx3 = c44467sQx2;
        int i14 = i;
        java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(false);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = boolKWHzl;
        }
        boolean zBooleanValue = ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
        OKMessageContent content2 = oKMessageCopydefault.getContent();
        boolean z8 = content2 instanceof OKCustomMessage;
        int i15 = (!z8 || ((OKCustomMessage) content2).isAllowInAppPush()) ? 0 : 1;
        if (!z8 || (frontendOption2 = ((OKCustomMessage) content2).getFrontendOption()) == null) {
            frontendOption = null;
            boolEZpvd = frontendOption == null ? frontendOption.EZpvd() : null;
            try {
                Result.Application application4 = Result.Companion;
                sGF sgfAYXKKw = sDZ.AEQbTJ.AYXKKw();
                java.lang.String targetId2 = oKMessageCopydefault.getTargetId();
                notificationUtils$shouldShowIMLocalNotification$12.L$0 = c44467sQx3;
                notificationUtils$shouldShowIMLocalNotification$12.L$1 = boolEZpvd;
                notificationUtils$shouldShowIMLocalNotification$12.L$2 = null;
                notificationUtils$shouldShowIMLocalNotification$12.I$0 = i14;
                notificationUtils$shouldShowIMLocalNotification$12.I$1 = i3;
                notificationUtils$shouldShowIMLocalNotification$12.Z$0 = zBooleanValue;
                notificationUtils$shouldShowIMLocalNotification$12.I$2 = i15;
                notificationUtils$shouldShowIMLocalNotification$12.label = 2;
                i4 = i15;
                z = zBooleanValue;
                i5 = i14;
            } catch (java.lang.Throwable th5) {
                th = th5;
                i4 = i15;
                z = zBooleanValue;
                i5 = i14;
            }
            try {
                objCopydefault = sGF.Activity.getConversation$default(sgfAYXKKw, targetId2, null, notificationUtils$shouldShowIMLocalNotification$12, 2, null);
                if (objCopydefault != objCopydefault2) {
                    return objCopydefault2;
                }
                bool = boolEZpvd;
                i8 = i5;
                i9 = i4;
                i10 = i3;
                c44467sQx4 = c44467sQx3;
                z3 = z;
                objM7377constructorimpl2 = Result.m7377constructorimpl((OKConversation) objCopydefault);
            } catch (java.lang.Throwable th6) {
                th = th6;
                i6 = i5;
                i7 = i4;
                z2 = z;
                Result.Application application32 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                z3 = z2;
                i8 = i6;
                i10 = i3;
                c44467sQx4 = c44467sQx3;
                int i132 = i7;
                bool = boolEZpvd;
                i9 = i132;
            }
        } else {
            try {
                try {
                    objDecodeFromString = sHW.copydefault().KWHzl().decodeFromString(FrontendOption.Companion.serializer(), frontendOption2);
                } catch (SerializationException e) {
                    pUU.copydefault("SafeJson", "decodeFromString with multiple parameters SerializationException: " + e.getMessage());
                    sSR.copydefault("decodeFromString with multiple parameters SerializationException", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e.getMessage()))));
                    objDecodeFromString = null;
                } catch (java.lang.Exception e2) {
                    pUU.copydefault("SafeJson", "decodeFromString with multiple parameters error: " + e2.getMessage());
                    sSR.copydefault("decodeFromString with multiple parameters Exception", C56423yEv.EZpvd(C56390yDp.OLrzqt("attr_1", C33129mqd.gEmmrt(e2.getMessage()))));
                    objDecodeFromString = null;
                }
                frontendOption = (FrontendOption) objDecodeFromString;
            } catch (JSONException unused) {
                frontendOption = null;
            }
            if (frontendOption == null) {
            }
            Result.Application application42 = Result.Companion;
            sGF sgfAYXKKw2 = sDZ.AEQbTJ.AYXKKw();
            java.lang.String targetId22 = oKMessageCopydefault.getTargetId();
            notificationUtils$shouldShowIMLocalNotification$12.L$0 = c44467sQx3;
            notificationUtils$shouldShowIMLocalNotification$12.L$1 = boolEZpvd;
            notificationUtils$shouldShowIMLocalNotification$12.L$2 = null;
            notificationUtils$shouldShowIMLocalNotification$12.I$0 = i14;
            notificationUtils$shouldShowIMLocalNotification$12.I$1 = i3;
            notificationUtils$shouldShowIMLocalNotification$12.Z$0 = zBooleanValue;
            notificationUtils$shouldShowIMLocalNotification$12.I$2 = i15;
            notificationUtils$shouldShowIMLocalNotification$12.label = 2;
            i4 = i15;
            z = zBooleanValue;
            i5 = i14;
            objCopydefault = sGF.Activity.getConversation$default(sgfAYXKKw2, targetId22, null, notificationUtils$shouldShowIMLocalNotification$12, 2, null);
            if (objCopydefault != objCopydefault2) {
            }
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
        }
        OKConversation oKConversation2 = (OKConversation) objM7377constructorimpl2;
        if ((oKConversation2 == null ? oKConversation2.getConversationStatus() : null) != ConversationStatus.FOREVER_HIDDEN) {
        }
        if ((oKConversation2 != null ? oKConversation2.getGroupType() : null) != GroupTagType.OTC_AGENT) {
        }
        if (i8 == 0) {
        }
        if (i10 == 0) {
        }
        if (i9 == 0) {
        }
        pUU.KWHzl("NotificationUtils", "on receive local notification[IN-HOUSE]: " + c44467sQx4 + ", isMessageMentionAll=" + (i8 == 0) + ", isNeedShowNotify=" + (i10 == 0) + ", isSystemMessage=" + z3 + ", isDisallowPushCustomMessage:" + (i9 == 0) + ", isEnableAppPushNotificationCustomMessage:" + bool + ", isHiddenConversation=" + z6 + ", isDisabledNotificationGroup=" + z7);
        if (i10 == 0) {
            z4 = false;
            z5 = z4;
        }
        return C56443yFo.KWHzl(z5);
    }

    public final boolean EZpvd(@NotNull OKMessage oKMessage) {
        OKMessageContent content;
        Intrinsics.checkNotNullParameter(oKMessage, "");
        pUU.KWHzl("NotificationUtils", "message content type: " + oKMessage.getContent());
        return (Intrinsics.EZpvd(OLrzqt(), sMY.Activity.OLrzqt) && ((oKMessage.getContent() instanceof OKIMStartVoiceCallMessage) || (oKMessage.getContent() instanceof OKAudioCallRecordMessage) || (oKMessage.getContent() instanceof OKCallSTerminateMessage) || (oKMessage.getContent() instanceof OKRecallNotificationMessage))) || !((content = oKMessage.getContent()) == null || content.getEnableAppPushNotification());
    }

    public final sMY OLrzqt() {
        java.lang.Integer allowInAppNotification;
        com.okinc.okimcore.model.remote.UserInfo userInfoOLrzqt = sDZ.AEQbTJ.valueOf().OLrzqt();
        if (userInfoOLrzqt != null && (allowInAppNotification = userInfoOLrzqt.getAllowInAppNotification()) != null && allowInAppNotification.intValue() == 1) {
            return sMY.Activity.OLrzqt;
        }
        return sMY.StateListAnimator.KWHzl;
    }

    public final java.lang.Object KWHzl(@NotNull OKMessage oKMessage, @NotNull Continuation<? super OKMessagePushConfig> continuation) {
        return BuildersKt.withContext(sDN.copydefault.copydefault(), new NotificationUtils$buildInHousePushConfig$2(oKMessage, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull OKMessage oKMessage, @NotNull Continuation<? super java.lang.String> continuation) {
        NotificationUtils$getPushTittle$1 notificationUtils$getPushTittle$1;
        OKCustomMessage.Application pushData;
        java.lang.String strOLrzqt;
        if (continuation instanceof NotificationUtils$getPushTittle$1) {
            notificationUtils$getPushTittle$1 = (NotificationUtils$getPushTittle$1) continuation;
            int i = notificationUtils$getPushTittle$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                notificationUtils$getPushTittle$1.label = i - Integer.MIN_VALUE;
            } else {
                notificationUtils$getPushTittle$1 = new NotificationUtils$getPushTittle$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = notificationUtils$getPushTittle$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = notificationUtils$getPushTittle$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            notificationUtils$getPushTittle$1.L$0 = oKMessage;
            notificationUtils$getPushTittle$1.label = 1;
            objCopydefault = copydefault(oKMessage, notificationUtils$getPushTittle$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oKMessage = (OKMessage) notificationUtils$getPushTittle$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        OKConversation oKConversation = (OKConversation) objCopydefault;
        if (oKConversation == null) {
            return "";
        }
        java.lang.String conversationTitle = oKConversation.getConversationTitle();
        if (conversationTitle == null) {
            conversationTitle = "-";
        }
        OKMessageContent content = oKMessage.getContent();
        if (content == null || !(content instanceof OKCustomMessage) || (pushData = ((OKCustomMessage) content).getPushData()) == null || (strOLrzqt = pushData.OLrzqt()) == null) {
            return conversationTitle;
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt)) {
            strOLrzqt = null;
        }
        return strOLrzqt == null ? conversationTitle : strOLrzqt;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull OKMessage oKMessage, @NotNull Continuation<? super java.lang.String> continuation) {
        NotificationUtils$getSenderName$1 notificationUtils$getSenderName$1;
        java.lang.Object objM7377constructorimpl;
        RelationInfo relationInfoKWHzl;
        if (continuation instanceof NotificationUtils$getSenderName$1) {
            notificationUtils$getSenderName$1 = (NotificationUtils$getSenderName$1) continuation;
            int i = notificationUtils$getSenderName$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                notificationUtils$getSenderName$1.label = i - Integer.MIN_VALUE;
            } else {
                notificationUtils$getSenderName$1 = new NotificationUtils$getSenderName$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = notificationUtils$getSenderName$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = notificationUtils$getSenderName$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            java.lang.String senderUserId = oKMessage.getSenderUserId();
            if (senderUserId == null) {
                return null;
            }
            sDZ sdz = sDZ.AEQbTJ;
            relationInfoKWHzl = sdz.valueOf().KWHzl(senderUserId);
            if (relationInfoKWHzl == null) {
                Result.Application application2 = Result.Companion;
                InterfaceC44177sGd interfaceC44177sGdAEQbTJ = sdz.AhwBna().AEQbTJ();
                notificationUtils$getSenderName$1.label = 1;
                objEZpvd = interfaceC44177sGdAEQbTJ.EZpvd(senderUserId, (java.lang.String) null, notificationUtils$getSenderName$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            }
            if (relationInfoKWHzl == null) {
                return C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null);
            }
            return null;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objEZpvd);
        objM7377constructorimpl = Result.m7377constructorimpl((RelationInfo) objEZpvd);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        relationInfoKWHzl = (RelationInfo) objM7377constructorimpl;
        if (relationInfoKWHzl == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(OKMessage oKMessage, Continuation<? super OKConversation> continuation) throws java.lang.Throwable {
        NotificationUtils$getConversation$1 notificationUtils$getConversation$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof NotificationUtils$getConversation$1) {
            notificationUtils$getConversation$1 = (NotificationUtils$getConversation$1) continuation;
            int i = notificationUtils$getConversation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                notificationUtils$getConversation$1.label = i - Integer.MIN_VALUE;
            } else {
                notificationUtils$getConversation$1 = new NotificationUtils$getConversation$1(this, continuation);
            }
        }
        NotificationUtils$getConversation$1 notificationUtils$getConversation$12 = notificationUtils$getConversation$1;
        java.lang.Object objKWHzl = notificationUtils$getConversation$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = notificationUtils$getConversation$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                Result.Application application = Result.Companion;
                sGF sgfAYXKKw = sDZ.AEQbTJ.AYXKKw();
                OKConversationType conversationType = oKMessage.getConversationType();
                java.lang.String targetId = oKMessage.getTargetId();
                notificationUtils$getConversation$12.label = 1;
                objKWHzl = sgfAYXKKw.KWHzl(conversationType, targetId, false, true, null, notificationUtils$getConversation$12);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((OKConversation) objKWHzl);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            return null;
        }
        return objM7377constructorimpl;
    }

    public final java.lang.String EZpvd(android.app.Application application, java.lang.String str) {
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = application.getString(sDX.StateListAnimator.fetchVPNInfo);
        objArr[1] = application.getString(sDX.StateListAnimator.djBIcL);
        if (str == null) {
            str = "";
        }
        objArr[2] = str;
        java.lang.String str2 = java.lang.String.format("%s %s %s", java.util.Arrays.copyOf(objArr, 3));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        android.net.Uri uri = android.net.Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri, "");
        if (uri.getQueryParameter("utm_medium") != null) {
            return str;
        }
        java.lang.String string = uri.buildUpon().appendQueryParameter("utm_medium", "in_app_push").build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final LaunchUrlData OLrzqt(@NotNull java.lang.String str) {
        java.util.List listAhwBna;
        Intrinsics.checkNotNullParameter(str, "");
        android.net.Uri uri = android.net.Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri, "");
        if (C59449zhJ.startsWith$default(str, "okx://app/customer/service?from=cg_app_notification", false, 2, null)) {
            return new LaunchUrlData("", ConversationType.VIP, "", yDY.AhwBna(), str);
        }
        java.lang.String queryParameter = uri.getQueryParameter("conversation");
        java.lang.String str2 = queryParameter == null ? "" : queryParameter;
        ConversationType.ActionBar actionBar = ConversationType.Companion;
        java.lang.String queryParameter2 = uri.getQueryParameter("conversationType");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        java.lang.String lowerCase = queryParameter2.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        ConversationType conversationTypeOLrzqt = actionBar.OLrzqt(lowerCase);
        java.lang.String queryParameter3 = uri.getQueryParameter("senderUid");
        java.lang.String str3 = queryParameter3 == null ? "" : queryParameter3;
        java.lang.String queryParameter4 = uri.getQueryParameter("atTargetUids");
        if (queryParameter4 == null || (listAhwBna = StringsKt__StringsKt.split$default((java.lang.CharSequence) queryParameter4, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null)) == null) {
            listAhwBna = yDY.AhwBna();
        }
        return new LaunchUrlData(str2, conversationTypeOLrzqt, str3, listAhwBna, str);
    }
}
