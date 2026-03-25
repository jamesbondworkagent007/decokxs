package o;

import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.feature.cache.conversation.ConversationCacheImpl$getConversation$1;
import com.okinc.okimcore.feature.cache.conversation.ConversationCacheImpl$getDisplayUserById$1;
import com.okinc.okimcore.feature.cache.conversation.ConversationCacheImpl$loadDBSimpleInfoById$1;
import com.okinc.okimcore.feature.cache.conversation.ConversationCacheImpl$reloadIfNoCache$1;
import com.okinc.okimcore.feature.cache.conversation.ConversationCacheImpl$updateIsFlagged$1;
import com.okinc.okimcore.feature.cache.conversation.ConversationCacheImpl$updateIsNoDisturb$1;
import com.okinc.okimcore.feature.cache.conversation.ConversationCacheImpl$updateIsTop$1;
import com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKUserInfo;
import com.okinc.okimcore.model.im.inhouseim.ReceiveMessageOptionType;
import com.okinc.okimcore.model.im.inhouseim.ws.GroupStatus;
import com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus;
import com.okinc.okimcore.model.other.IMUserExtraInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.MessageSendRecordEntity;
import com.okinc.okimcore.model.room.inhouseim.ConversationStatus;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class sFN extends sFJ<OKConversation> implements sFQ {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final java.lang.String AEQbTJ;
    public final java.util.HashMap<java.lang.String, MessageSendRecordEntity> AYXKKw;
    public final sFK KWHzl;
    public final CoroutineDispatcher gEmmrt;
    public final sIC valueOf;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKConversationType.values().length];
            try {
                iArr[OKConversationType.BROADCAST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKConversationType.PRIVATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OKConversationType.GROUP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    @Override // o.sFJ
    public int AEQbTJ() {
        return 200;
    }

    @yCM
    public sFN(@NotNull sIC sic, @NotNull sFK sfk, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sic, "");
        Intrinsics.checkNotNullParameter(sfk, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.valueOf = sic;
        this.KWHzl = sfk;
        this.gEmmrt = coroutineDispatcher;
        this.AEQbTJ = "msg_cache";
        this.AYXKKw = new java.util.HashMap<>();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sFN.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    private final sIB djBIcL() {
        return this.valueOf.copydefault();
    }

    public final InHouseIMConversationDao copydefault() {
        return djBIcL().KWHzl();
    }

    public final InterfaceC44177sGd OLrzqt() {
        return sDZ.AEQbTJ.AhwBna().AEQbTJ();
    }

    public final InterfaceC44263sJi gEmmrt() {
        return sDZ.AEQbTJ.AhwBna().copydefault();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.sFJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super OKConversation> continuation) throws java.lang.Throwable {
        ConversationCacheImpl$reloadIfNoCache$1 conversationCacheImpl$reloadIfNoCache$1;
        if (continuation instanceof ConversationCacheImpl$reloadIfNoCache$1) {
            conversationCacheImpl$reloadIfNoCache$1 = (ConversationCacheImpl$reloadIfNoCache$1) continuation;
            int i = conversationCacheImpl$reloadIfNoCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                conversationCacheImpl$reloadIfNoCache$1.label = i - Integer.MIN_VALUE;
            } else {
                conversationCacheImpl$reloadIfNoCache$1 = new ConversationCacheImpl$reloadIfNoCache$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = conversationCacheImpl$reloadIfNoCache$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = conversationCacheImpl$reloadIfNoCache$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            conversationCacheImpl$reloadIfNoCache$1.label = 1;
            objEZpvd = EZpvd(str, (Continuation<? super InHouseIMConversationEntity>) conversationCacheImpl$reloadIfNoCache$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        InHouseIMConversationEntity inHouseIMConversationEntity = (InHouseIMConversationEntity) objEZpvd;
        if (inHouseIMConversationEntity == null) {
            return null;
        }
        OKConversation oKConversation = new OKConversation((OKConversationType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, (java.lang.Integer) null, false, false, false, (OKMessageContent) null, (OKMessage.SentStatus) null, 0L, 0L, (java.lang.String) null, (DraftMessageModel) null, (OfficialTagInfo) null, (java.lang.Integer) null, false, (InGroupStatus) null, (GroupStatus) null, (GroupTagType) null, (java.lang.Integer) null, (java.lang.String) null, (ConversationStatus) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, (java.lang.Integer) null, -1, 1, (DefaultConstructorMarker) null);
        oKConversation.setConversationType(OKConversationType.Companion.EZpvd(sPI.copydefault(inHouseIMConversationEntity.getChannelType()).getValue()));
        oKConversation.setTargetId(inHouseIMConversationEntity.getChannelId());
        oKConversation.setConversationTitle(inHouseIMConversationEntity.getNickname());
        java.lang.String strOLrzqt = C44170sFx.OLrzqt(inHouseIMConversationEntity);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt)) {
            oKConversation.setConversationTitle(strOLrzqt);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) inHouseIMConversationEntity.getAvatar())) {
            oKConversation.setPortraitUrl(inHouseIMConversationEntity.getAvatar());
        }
        oKConversation.setTop(inHouseIMConversationEntity.getPinnedStatus() == 1);
        java.lang.Integer muteStatus = inHouseIMConversationEntity.getMuteStatus();
        oKConversation.setNoDisturb(muteStatus != null && muteStatus.intValue() == ReceiveMessageOptionType.RECEIVE_SILENTLY.getApiValue());
        oKConversation.setOfficialTagInfo(C44169sFw.KWHzl(inHouseIMConversationEntity.getTags(), inHouseIMConversationEntity.getChannelType()));
        return oKConversation;
    }

    @Override // o.sFQ
    public void OLrzqt(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.HashMap<java.lang.String, MessageSendRecordEntity> map = this.AYXKKw;
        MessageSendRecordEntity messageSendRecordEntity = new MessageSendRecordEntity(str);
        messageSendRecordEntity.setMediaMessage(z);
        map.put(str, messageSendRecordEntity);
        pUU.EZpvd(this.AEQbTJ, "add msg record success==" + str);
    }

    public final C44461sQr AEQbTJ(OKMessage oKMessage) {
        boolean z;
        java.lang.String remarkName;
        java.lang.String enPetname;
        OfficialTagInfo officialTagInfo;
        boolean z2;
        java.lang.String str;
        java.lang.String name;
        OfficialTagInfo officialTag;
        java.lang.String senderUserId = oKMessage.getSenderUserId();
        if (senderUserId == null) {
            senderUserId = "";
        }
        RelationInfo relationInfoKWHzl = senderUserId.length() == 0 ? null : this.KWHzl.KWHzl(senderUserId);
        if (relationInfoKWHzl == null || !C33129mqd.OLrzqt((java.lang.CharSequence) relationInfoKWHzl.getRemarkName())) {
            z = false;
            remarkName = "";
        } else {
            remarkName = relationInfoKWHzl.getRemarkName();
            z = true;
        }
        OKMessageContent content = oKMessage.getContent();
        OKUserInfo userInfo = content != null ? content.getUserInfo() : null;
        if (userInfo != null) {
            android.net.Uri portraitUri = userInfo.getPortraitUri();
            java.lang.String string = portraitUri != null ? portraitUri.toString() : null;
            java.lang.String userId = userInfo.getUserId();
            if (userId != null) {
                RelationInfo relationInfoKWHzl2 = this.KWHzl.KWHzl(userId);
                name = relationInfoKWHzl2 != null ? relationInfoKWHzl2.getRemarkName() : null;
                if (name == null) {
                    name = "";
                }
            } else {
                name = null;
            }
            if (name == null) {
                name = "";
            }
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) name)) {
                z = true;
            } else {
                name = userInfo.getName();
            }
            java.lang.String extra = userInfo.getExtra();
            IMUserExtraInfo iMUserExtraInfoAEQbTJ = extra != null ? C44475sRe.AEQbTJ(extra) : null;
            if (relationInfoKWHzl == null || (officialTag = relationInfoKWHzl.getOfficialTags()) == null) {
                officialTag = iMUserExtraInfoAEQbTJ != null ? iMUserExtraInfoAEQbTJ.getOfficialTag() : null;
            }
            z2 = z;
            str = string;
            enPetname = iMUserExtraInfoAEQbTJ != null ? iMUserExtraInfoAEQbTJ.getEnPetname() : null;
            remarkName = name;
            officialTagInfo = officialTag;
        } else {
            enPetname = null;
            officialTagInfo = null;
            z2 = z;
            str = "";
        }
        return new C44461sQr(remarkName == null ? "" : remarkName, enPetname, str == null ? "" : str, z2, relationInfoKWHzl != null ? relationInfoKWHzl.getPhoneName() : null, relationInfoKWHzl != null ? C44157sFk.getDisplayName$default(relationInfoKWHzl, null, 1, null) : null, officialTagInfo);
    }

    @Override // o.sFQ
    public java.lang.Object copydefault(@NotNull OKMessage oKMessage, java.lang.String str, @NotNull Continuation<? super C44461sQr> continuation) {
        java.lang.String str2;
        Continuation<? super C44461sQr> continuation2;
        java.lang.String str3;
        java.lang.Long fieldNames;
        C44461sQr c44461sQrAEQbTJ = AEQbTJ(oKMessage);
        int i = Activity.AEQbTJ[oKMessage.getConversationType().ordinal()];
        if (i == 1) {
            RelationInfo relationInfoCopydefault = this.KWHzl.copydefault();
            return relationInfoCopydefault == null ? c44461sQrAEQbTJ : new C44461sQr(relationInfoCopydefault.getNickName(), relationInfoCopydefault.getEnNickName(), relationInfoCopydefault.getAvatar(), false, null, null, relationInfoCopydefault.getOfficialTags(), 56, null);
        }
        str2 = "";
        if (i == 2) {
            java.lang.String senderUserId = oKMessage.getSenderUserId();
            if (senderUserId == null) {
                str3 = str;
                continuation2 = continuation;
            } else {
                continuation2 = continuation;
                str2 = senderUserId;
                str3 = str;
            }
            return KWHzl(str2, c44461sQrAEQbTJ, str3, continuation2);
        }
        if (i == 3) {
            java.lang.String targetId = oKMessage.getTargetId();
            java.lang.String senderUserId2 = oKMessage.getSenderUserId();
            str2 = senderUserId2 != null ? senderUserId2 : "";
            if (str2.length() != 0 && ((fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(str2)) == null || fieldNames.longValue() != 0)) {
                return gEmmrt().EZpvd(targetId, str2, c44461sQrAEQbTJ, oKMessage, continuation);
            }
        }
        return c44461sQrAEQbTJ;
    }

    @Override // o.sFQ
    public void AEQbTJ(@NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        EZpvd(oKConversation.getTargetId(), oKConversation);
    }

    @Override // o.sFQ
    public OKConversation copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (OKConversation) BuildersKt.runBlocking(this.gEmmrt, new ConversationCacheImpl$getConversation$1(this, str, null));
    }

    @Override // o.sFQ
    public OKConversation copydefault(@NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        OKConversation oKConversationCopydefault = copydefault(oKConversation.getTargetId());
        if (oKConversationCopydefault != null) {
            return oKConversationCopydefault;
        }
        AEQbTJ(oKConversation);
        return oKConversation;
    }

    /* JADX DEBUG: Duplicate block (B:83:0x01ac) to fix multi-entry loop: BACK_EDGE: B:83:0x01ac -> B:84:0x01b6 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v24, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v34, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v45, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v46, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01bc: MOVE (r6 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:85:0x01bc */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01bd: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:85:0x01bc */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d A[Catch: all -> 0x0056, TryCatch #13 {all -> 0x0056, blocks: (B:13:0x0046, B:40:0x0101, B:57:0x013f, B:58:0x0142, B:62:0x0147, B:64:0x014d, B:66:0x0159, B:67:0x015c, B:68:0x015d, B:69:0x0160, B:73:0x0176, B:75:0x0183), top: B:106:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0183 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #13 {all -> 0x0056, blocks: (B:13:0x0046, B:40:0x0101, B:57:0x013f, B:58:0x0142, B:62:0x0147, B:64:0x014d, B:66:0x0159, B:67:0x015c, B:68:0x015d, B:69:0x0160, B:73:0x0176, B:75:0x0183), top: B:106:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c6 A[Catch: all -> 0x01f2, TryCatch #7 {all -> 0x01f2, blocks: (B:87:0x01c0, B:88:0x01c5, B:89:0x01c6, B:91:0x01d2, B:92:0x01ed, B:93:0x01f0), top: B:106:0x0028 }] */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super InHouseIMConversationEntity> continuation) throws java.lang.Throwable {
        ConversationCacheImpl$loadDBSimpleInfoById$1 conversationCacheImpl$loadDBSimpleInfoById$1;
        sFN sfn;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDaoCopydefault;
        Ref.LongRef longRef3;
        BaseDao baseDao2;
        Ref.LongRef longRef4;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        sFN sfn2;
        ConversationCacheImpl$loadDBSimpleInfoById$1 conversationCacheImpl$loadDBSimpleInfoById$12;
        java.lang.String str2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        int i3;
        java.lang.String str3;
        Ref.ObjectRef objectRef2;
        int i4;
        sFN sfn3;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        sFN sfn4;
        Ref.ObjectRef objectRef3;
        int i5;
        int i6;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException2;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        long jNanoTime;
        java.lang.String str4;
        T t;
        if (continuation instanceof ConversationCacheImpl$loadDBSimpleInfoById$1) {
            conversationCacheImpl$loadDBSimpleInfoById$1 = (ConversationCacheImpl$loadDBSimpleInfoById$1) continuation;
            int i7 = conversationCacheImpl$loadDBSimpleInfoById$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                conversationCacheImpl$loadDBSimpleInfoById$1.label = i7 - Integer.MIN_VALUE;
                sfn = this;
            } else {
                sfn = this;
                conversationCacheImpl$loadDBSimpleInfoById$1 = new ConversationCacheImpl$loadDBSimpleInfoById$1(sfn, continuation);
            }
        }
        java.lang.Object obj = conversationCacheImpl$loadDBSimpleInfoById$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = conversationCacheImpl$loadDBSimpleInfoById$1.label;
        try {
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        jNanoTime = conversationCacheImpl$loadDBSimpleInfoById$1.J$0;
                        i4 = conversationCacheImpl$loadDBSimpleInfoById$1.I$2;
                        i3 = conversationCacheImpl$loadDBSimpleInfoById$1.I$1;
                        i = conversationCacheImpl$loadDBSimpleInfoById$1.I$0;
                        objectRef5 = (Ref.ObjectRef) conversationCacheImpl$loadDBSimpleInfoById$1.L$7;
                        longRef4 = (Ref.LongRef) conversationCacheImpl$loadDBSimpleInfoById$1.L$6;
                        objectRef4 = (Ref.ObjectRef) conversationCacheImpl$loadDBSimpleInfoById$1.L$5;
                        objectRef2 = (Ref.ObjectRef) conversationCacheImpl$loadDBSimpleInfoById$1.L$4;
                        longRef2 = (Ref.LongRef) conversationCacheImpl$loadDBSimpleInfoById$1.L$3;
                        baseDaoCopydefault = (BaseDao) conversationCacheImpl$loadDBSimpleInfoById$1.L$2;
                        str4 = (java.lang.String) conversationCacheImpl$loadDBSimpleInfoById$1.L$1;
                        sfn3 = (sFN) conversationCacheImpl$loadDBSimpleInfoById$1.L$0;
                        try {
                            C56391yDq.AEQbTJ(obj);
                            longRef3 = longRef2;
                            i5 = i3;
                            baseDao2 = baseDaoCopydefault;
                            i6 = i;
                            t = obj;
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                            str3 = str4;
                            sQLiteDatabaseLockedException2 = e3;
                            sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                            sfn4 = sfn3;
                            objectRef3 = objectRef2;
                            int i9 = i3;
                            longRef3 = longRef2;
                            i5 = i9;
                            int i10 = i;
                            baseDao2 = baseDaoCopydefault;
                            i6 = i10;
                            r0 = sQLiteDatabaseLockedException;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                            objectRef3.element = r0;
                            if (i4 >= i6 - 1) {
                            }
                            conversationCacheImpl$loadDBSimpleInfoById$12 = conversationCacheImpl$loadDBSimpleInfoById$1;
                            i2 = i5 + i;
                            objectRef = objectRef3;
                            if (i2 >= i) {
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
                            longRef3 = longRef2;
                            baseDao2 = baseDaoCopydefault;
                            C44159sFm.EZpvd(baseDao2, longRef3.element);
                            throw th;
                        }
                        objectRef5.element = t;
                        longRef4.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                        T t2 = objectRef4.element;
                        C44159sFm.EZpvd(baseDao2, longRef3.element);
                        return (InHouseIMConversationEntity) t2;
                    }
                    if (i8 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i11 = conversationCacheImpl$loadDBSimpleInfoById$1.I$1;
                    int i12 = conversationCacheImpl$loadDBSimpleInfoById$1.I$0;
                    objectRef3 = (Ref.ObjectRef) conversationCacheImpl$loadDBSimpleInfoById$1.L$4;
                    Ref.LongRef longRef5 = (Ref.LongRef) conversationCacheImpl$loadDBSimpleInfoById$1.L$3;
                    BaseDao baseDao3 = (BaseDao) conversationCacheImpl$loadDBSimpleInfoById$1.L$2;
                    java.lang.String str5 = (java.lang.String) conversationCacheImpl$loadDBSimpleInfoById$1.L$1;
                    sFN sfn5 = (sFN) conversationCacheImpl$loadDBSimpleInfoById$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    ConversationCacheImpl$loadDBSimpleInfoById$1 conversationCacheImpl$loadDBSimpleInfoById$13 = conversationCacheImpl$loadDBSimpleInfoById$1;
                    int i13 = 1;
                    baseDaoCopydefault = baseDao3;
                    str2 = str5;
                    i = i12;
                    i5 = i11;
                    sfn2 = sfn5;
                    longRef4 = longRef5;
                    conversationCacheImpl$loadDBSimpleInfoById$12 = conversationCacheImpl$loadDBSimpleInfoById$13;
                    i2 = i5 + i13;
                    objectRef = objectRef3;
                    if (i2 >= i) {
                        try {
                            try {
                            } catch (java.lang.IllegalStateException e6) {
                                e2 = e6;
                                longRef2 = longRef4;
                                message = e2.getMessage();
                                if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                    C44159sFm.OLrzqt(e2);
                                    throw e2;
                                }
                                C44159sFm.copydefault(e2);
                                throw e2;
                            } catch (java.lang.Exception e7) {
                                e = e7;
                                longRef2 = longRef4;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                longRef2 = longRef4;
                                longRef3 = longRef2;
                                baseDao2 = baseDaoCopydefault;
                                C44159sFm.EZpvd(baseDao2, longRef3.element);
                                throw th;
                            }
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                            str3 = str2;
                            conversationCacheImpl$loadDBSimpleInfoById$1 = conversationCacheImpl$loadDBSimpleInfoById$12;
                            sfn3 = sfn2;
                            i4 = i2;
                            i3 = i4;
                            objectRef2 = objectRef;
                            longRef2 = longRef4;
                            sQLiteDatabaseLockedException = e8;
                            sfn4 = sfn3;
                            objectRef3 = objectRef2;
                            int i92 = i3;
                            longRef3 = longRef2;
                            i5 = i92;
                            int i102 = i;
                            baseDao2 = baseDaoCopydefault;
                            i6 = i102;
                            r0 = sQLiteDatabaseLockedException;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                            objectRef3.element = r0;
                            if (i4 >= i6 - 1) {
                            }
                            conversationCacheImpl$loadDBSimpleInfoById$12 = conversationCacheImpl$loadDBSimpleInfoById$13;
                            i2 = i5 + i13;
                            objectRef = objectRef3;
                            if (i2 >= i) {
                            }
                        }
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                            str3 = str2;
                            conversationCacheImpl$loadDBSimpleInfoById$1 = conversationCacheImpl$loadDBSimpleInfoById$12;
                            sfn3 = sfn2;
                            i4 = i2;
                            i3 = i4;
                            objectRef2 = objectRef;
                            longRef2 = longRef4;
                            sQLiteDatabaseLockedException2 = e9;
                            sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                            sfn4 = sfn3;
                            objectRef3 = objectRef2;
                            int i922 = i3;
                            longRef3 = longRef2;
                            i5 = i922;
                            int i1022 = i;
                            baseDao2 = baseDaoCopydefault;
                            i6 = i1022;
                            r0 = sQLiteDatabaseLockedException;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                            objectRef3.element = r0;
                            if (i4 >= i6 - 1) {
                                long j = i4 + 1;
                                conversationCacheImpl$loadDBSimpleInfoById$1.L$0 = sfn4;
                                conversationCacheImpl$loadDBSimpleInfoById$1.L$1 = str3;
                                conversationCacheImpl$loadDBSimpleInfoById$1.L$2 = baseDao2;
                                conversationCacheImpl$loadDBSimpleInfoById$1.L$3 = longRef3;
                                conversationCacheImpl$loadDBSimpleInfoById$1.L$4 = objectRef3;
                                try {
                                    conversationCacheImpl$loadDBSimpleInfoById$1.L$5 = null;
                                    conversationCacheImpl$loadDBSimpleInfoById$1.L$6 = null;
                                    conversationCacheImpl$loadDBSimpleInfoById$1.L$7 = null;
                                    conversationCacheImpl$loadDBSimpleInfoById$1.I$0 = i6;
                                    conversationCacheImpl$loadDBSimpleInfoById$1.I$1 = i5;
                                    conversationCacheImpl$loadDBSimpleInfoById$1.label = 2;
                                    if (DelayKt.delay(j * 50, conversationCacheImpl$loadDBSimpleInfoById$1) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    conversationCacheImpl$loadDBSimpleInfoById$13 = conversationCacheImpl$loadDBSimpleInfoById$1;
                                    str2 = str3;
                                    sfn2 = sfn4;
                                    i13 = 1;
                                    longRef4 = longRef3;
                                    BaseDao baseDao4 = baseDao2;
                                    i = i6;
                                    baseDaoCopydefault = baseDao4;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                                    throw th;
                                }
                            } else {
                                conversationCacheImpl$loadDBSimpleInfoById$13 = conversationCacheImpl$loadDBSimpleInfoById$1;
                                str2 = str3;
                                sfn2 = sfn4;
                                i13 = 1;
                                longRef4 = longRef3;
                                BaseDao baseDao5 = baseDao2;
                                i = i6;
                                baseDaoCopydefault = baseDao5;
                            }
                            conversationCacheImpl$loadDBSimpleInfoById$12 = conversationCacheImpl$loadDBSimpleInfoById$13;
                            i2 = i5 + i13;
                            objectRef = objectRef3;
                            if (i2 >= i) {
                            }
                        }
                        objectRef5 = new Ref.ObjectRef();
                        jNanoTime = java.lang.System.nanoTime();
                        InHouseIMConversationDao inHouseIMConversationDaoCopydefault = sfn2.copydefault();
                        conversationCacheImpl$loadDBSimpleInfoById$12.L$0 = sfn2;
                        conversationCacheImpl$loadDBSimpleInfoById$12.L$1 = str2;
                        conversationCacheImpl$loadDBSimpleInfoById$12.L$2 = baseDaoCopydefault;
                        conversationCacheImpl$loadDBSimpleInfoById$12.L$3 = longRef4;
                        conversationCacheImpl$loadDBSimpleInfoById$12.L$4 = objectRef;
                        conversationCacheImpl$loadDBSimpleInfoById$12.L$5 = objectRef5;
                        conversationCacheImpl$loadDBSimpleInfoById$12.L$6 = longRef4;
                        conversationCacheImpl$loadDBSimpleInfoById$12.L$7 = objectRef5;
                        conversationCacheImpl$loadDBSimpleInfoById$12.I$0 = i;
                        conversationCacheImpl$loadDBSimpleInfoById$12.I$1 = i2;
                        conversationCacheImpl$loadDBSimpleInfoById$12.I$2 = i2;
                        conversationCacheImpl$loadDBSimpleInfoById$12.J$0 = jNanoTime;
                        conversationCacheImpl$loadDBSimpleInfoById$12.label = 1;
                        java.lang.Object conversationEntityBlocking = inHouseIMConversationDaoCopydefault.getConversationEntityBlocking(str2, conversationCacheImpl$loadDBSimpleInfoById$12);
                        if (conversationEntityBlocking == objCopydefault) {
                            return objCopydefault;
                        }
                        str4 = str2;
                        conversationCacheImpl$loadDBSimpleInfoById$1 = conversationCacheImpl$loadDBSimpleInfoById$12;
                        sfn3 = sfn2;
                        i4 = i2;
                        objectRef4 = objectRef5;
                        longRef3 = longRef4;
                        objectRef2 = objectRef;
                        i5 = i4;
                        int i14 = i;
                        baseDao2 = baseDaoCopydefault;
                        i6 = i14;
                        t = conversationEntityBlocking;
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                            sfn4 = sfn3;
                            objectRef3 = objectRef2;
                            str3 = str4;
                            r0 = e10;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                            objectRef3.element = r0;
                            if (i4 >= i6 - 1) {
                            }
                            conversationCacheImpl$loadDBSimpleInfoById$12 = conversationCacheImpl$loadDBSimpleInfoById$13;
                            i2 = i5 + i13;
                            objectRef = objectRef3;
                            if (i2 >= i) {
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
                        longRef4.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                        T t22 = objectRef4.element;
                        C44159sFm.EZpvd(baseDao2, longRef3.element);
                        return (InHouseIMConversationEntity) t22;
                    }
                    C44159sFm.EZpvd(baseDaoCopydefault, longRef4.element);
                    java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                    if (exc == null) {
                        exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                    }
                    C44159sFm.OLrzqt(exc);
                    throw exc;
                }
                C56391yDq.AEQbTJ(obj);
                try {
                    baseDaoCopydefault = copydefault();
                    longRef4 = new Ref.LongRef();
                    objectRef = new Ref.ObjectRef();
                    i = 3;
                    i2 = 0;
                    sfn2 = this;
                    conversationCacheImpl$loadDBSimpleInfoById$12 = conversationCacheImpl$loadDBSimpleInfoById$1;
                    str2 = str;
                    if (i2 >= i) {
                    }
                } catch (java.lang.Throwable unused) {
                    sfn = null;
                    return sfn;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                longRef2 = longRef;
                baseDaoCopydefault = baseDao;
            }
        } catch (java.lang.Throwable unused2) {
        }
    }

    @Override // o.sFQ
    public void copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.gEmmrt), null, null, new ConversationCacheImpl$updateIsTop$1(this, str, z, null), 3, null);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // o.sFQ
    public void KWHzl(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.gEmmrt), null, null, new ConversationCacheImpl$updateIsFlagged$1(this, str, z, null), 3, null);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // o.sFQ
    public void EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.gEmmrt), null, null, new ConversationCacheImpl$updateIsNoDisturb$1(this, str, z, null), 3, null);
        } catch (java.lang.Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, C44461sQr c44461sQr, java.lang.String str2, @NotNull Continuation<? super C44461sQr> continuation) throws java.lang.Throwable {
        ConversationCacheImpl$getDisplayUserById$1 conversationCacheImpl$getDisplayUserById$1;
        sFN sfn;
        java.lang.String strOLrzqt;
        java.lang.String str3 = str;
        C44461sQr c44461sQr2 = c44461sQr;
        if (continuation instanceof ConversationCacheImpl$getDisplayUserById$1) {
            conversationCacheImpl$getDisplayUserById$1 = (ConversationCacheImpl$getDisplayUserById$1) continuation;
            int i = conversationCacheImpl$getDisplayUserById$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                conversationCacheImpl$getDisplayUserById$1.label = i - Integer.MIN_VALUE;
            } else {
                conversationCacheImpl$getDisplayUserById$1 = new ConversationCacheImpl$getDisplayUserById$1(this, continuation);
            }
        }
        java.lang.Object obj = conversationCacheImpl$getDisplayUserById$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = conversationCacheImpl$getDisplayUserById$1.label;
        boolean z = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "0")) {
                return c44461sQr2;
            }
            java.lang.String strAEQbTJ = null;
            if (C44157sFk.KWHzl(str)) {
                C44124sEe.imLogCurrentUser$default("getCurrentUserContactInfo, getDisplayUserById", null, 2, null);
                RelationInfo relationInfoCopydefault = this.KWHzl.copydefault();
                return relationInfoCopydefault == null ? c44461sQr2 : new C44461sQr(relationInfoCopydefault.getNickName(), relationInfoCopydefault.getEnNickName(), relationInfoCopydefault.getAvatar(), false, null, null, relationInfoCopydefault.getOfficialTags(), 56, null);
            }
            RelationInfo relationInfoKWHzl = this.KWHzl.KWHzl(str3);
            if (relationInfoKWHzl != null) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) relationInfoKWHzl.getRemarkName())) {
                    strOLrzqt = relationInfoKWHzl.getRemarkName();
                } else {
                    z = false;
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) relationInfoKWHzl.getNickName())) {
                        strOLrzqt = relationInfoKWHzl.getNickName();
                    } else {
                        strOLrzqt = c44461sQr2 != null ? c44461sQr.OLrzqt() : null;
                    }
                }
                boolean z2 = z;
                if (C33129mqd.OLrzqt((java.lang.CharSequence) relationInfoKWHzl.getAvatar())) {
                    strAEQbTJ = relationInfoKWHzl.getAvatar();
                } else if (c44461sQr2 != null) {
                    strAEQbTJ = c44461sQr.AEQbTJ();
                }
                return new C44461sQr(strOLrzqt == null ? "" : strOLrzqt, relationInfoKWHzl.getEnNickName(), strAEQbTJ == null ? "" : strAEQbTJ, z2, relationInfoKWHzl.getPhoneName(), null, relationInfoKWHzl.getOfficialTags(), 32, null);
            }
            if (c44461sQr2 != null && !c44461sQr.djBIcL()) {
                this.KWHzl.copydefault(str3, c44461sQr2);
                return c44461sQr2;
            }
            try {
                InterfaceC44177sGd interfaceC44177sGdOLrzqt = OLrzqt();
                conversationCacheImpl$getDisplayUserById$1.L$0 = this;
                conversationCacheImpl$getDisplayUserById$1.L$1 = str3;
                conversationCacheImpl$getDisplayUserById$1.L$2 = c44461sQr2;
                conversationCacheImpl$getDisplayUserById$1.label = 1;
                return interfaceC44177sGdOLrzqt.EZpvd(str3, str2, conversationCacheImpl$getDisplayUserById$1) == objCopydefault ? objCopydefault : c44461sQr2;
            } catch (java.lang.Exception e) {
                e = e;
                sfn = this;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C44461sQr c44461sQr3 = (C44461sQr) conversationCacheImpl$getDisplayUserById$1.L$2;
            java.lang.String str4 = (java.lang.String) conversationCacheImpl$getDisplayUserById$1.L$1;
            sfn = (sFN) conversationCacheImpl$getDisplayUserById$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                return c44461sQr3;
            } catch (java.lang.Exception e2) {
                e = e2;
                c44461sQr2 = c44461sQr3;
                str3 = str4;
            }
        }
        pUU.AEQbTJ(sfn.AEQbTJ, "Failed to fetch relation info for contactId: " + str3, e);
        return c44461sQr2;
    }
}
