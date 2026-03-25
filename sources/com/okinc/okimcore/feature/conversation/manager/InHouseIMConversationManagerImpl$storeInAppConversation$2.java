package com.okinc.okimcore.feature.conversation.manager;

import android.database.sqlite.SQLiteDatabaseLockedException;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.model.im.conversation.InAppConversationExtra;
import com.okinc.okimcore.model.im.inhouseim.ReceiveMessageOptionType;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.sync.Mutex;
import o.C44159sFm;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C59462zhW;
import o.C59519zia;
import o.pUU;
import o.sGK;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMConversationManagerImpl$storeInAppConversation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InHouseIMConversationEntity>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ InHouseIMChannelType $channelType;
    final /* synthetic */ InAppConversationExtra $extraFields;
    final /* synthetic */ Long $latestSendTime;
    final /* synthetic */ Integer $unreadCount;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ sGK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMConversationManagerImpl$storeInAppConversation$2(sGK sgk, String str, Integer num, Long l, InAppConversationExtra inAppConversationExtra, InHouseIMChannelType inHouseIMChannelType, Continuation<? super InHouseIMConversationManagerImpl$storeInAppConversation$2> continuation) {
        super(2, continuation);
        this.this$0 = sgk;
        this.$channelId = str;
        this.$unreadCount = num;
        this.$latestSendTime = l;
        this.$extraFields = inAppConversationExtra;
        this.$channelType = inHouseIMChannelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMConversationManagerImpl$storeInAppConversation$2(this.this$0, this.$channelId, this.$unreadCount, this.$latestSendTime, this.$extraFields, this.$channelType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InHouseIMConversationEntity> continuation) {
        return ((InHouseIMConversationManagerImpl$storeInAppConversation$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v48, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v13, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x02f3: MOVE (r6 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:98:0x02f3 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x02f4: MOVE (r7 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:98:0x02f3 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x030f A[Catch: all -> 0x034e, TRY_LEAVE, TryCatch #5 {all -> 0x034e, blocks: (B:103:0x0302, B:105:0x030f), top: B:131:0x0302 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x035a A[Catch: all -> 0x0384, TRY_ENTER, TryCatch #2 {all -> 0x0384, blocks: (B:118:0x035a, B:120:0x0365, B:121:0x0380, B:122:0x0383, B:28:0x00b3, B:39:0x0145, B:43:0x0153, B:46:0x015e, B:48:0x0167, B:52:0x0178, B:64:0x0242, B:47:0x0163, B:44:0x0158, B:54:0x01ee, B:61:0x01ff, B:63:0x0205, B:36:0x0119), top: B:129:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0256 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ec  */
    /* JADX WARN: Type inference failed for: r0v25, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r4v19, types: [T, kotlin.Unit] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0337 -> B:109:0x033a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x0343 -> B:111:0x034a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        Mutex mutex;
        Mutex mutex2;
        Integer num;
        InHouseIMChannelType inHouseIMChannelType;
        String str;
        InAppConversationExtra inAppConversationExtra;
        sGK sgk;
        Long l;
        Object objKWHzl;
        InHouseIMConversationEntity inHouseIMConversationEntity;
        InHouseIMConversationEntity inHouseIMConversationEntityEZpvd;
        BaseDao baseDaoAYXKKw;
        Ref.ObjectRef objectRef;
        Ref.LongRef longRef3;
        int i;
        int i2;
        InHouseIMConversationEntity inHouseIMConversationEntity2;
        Mutex mutex3;
        sGK sgk2;
        Ref.LongRef longRef4;
        Ref.ObjectRef objectRef2;
        int i3;
        InHouseIMConversationEntity inHouseIMConversationEntity3;
        ?? r0;
        int i4;
        int i5;
        int i6;
        BaseDao baseDao3;
        int i7;
        sGK sgk3;
        SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        Exception e;
        IllegalStateException e2;
        String message;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        long jNanoTime;
        Ref.ObjectRef objectRef5;
        SQLiteDatabaseLockedException sQLiteDatabaseLockedException2;
        Object objCopydefault = C56442yFn.copydefault();
        int i8 = this.label;
        try {
            try {
            } catch (Throwable th) {
                th = th;
                longRef2 = longRef;
                baseDao2 = baseDao;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (i8 == 0) {
            C56391yDq.AEQbTJ(obj);
            Mutex mutex4 = this.this$0.djBIcL;
            String str2 = this.$channelId;
            sGK sgk4 = this.this$0;
            num = this.$unreadCount;
            Long l2 = this.$latestSendTime;
            InAppConversationExtra inAppConversationExtra2 = this.$extraFields;
            InHouseIMChannelType inHouseIMChannelType2 = this.$channelType;
            this.L$0 = mutex4;
            this.L$1 = str2;
            this.L$2 = sgk4;
            this.L$3 = num;
            this.L$4 = l2;
            this.L$5 = inAppConversationExtra2;
            this.L$6 = inHouseIMChannelType2;
            this.label = 1;
            if (mutex4.lock(null, this) == objCopydefault) {
                return objCopydefault;
            }
            mutex2 = mutex4;
            inHouseIMChannelType = inHouseIMChannelType2;
            str = str2;
            inAppConversationExtra = inAppConversationExtra2;
            sgk = sgk4;
            l = l2;
        } else {
            if (i8 != 1) {
                if (i8 == 2) {
                    inHouseIMChannelType = (InHouseIMChannelType) this.L$6;
                    inAppConversationExtra = (InAppConversationExtra) this.L$5;
                    l = (Long) this.L$4;
                    num = (Integer) this.L$3;
                    sgk = (sGK) this.L$2;
                    str = (String) this.L$1;
                    mutex2 = (Mutex) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objKWHzl = obj;
                    InHouseIMChannelType inHouseIMChannelType3 = inHouseIMChannelType;
                    inHouseIMConversationEntity = (InHouseIMConversationEntity) objKWHzl;
                    if (inHouseIMConversationEntity == null) {
                        int iIntValue = num != null ? num.intValue() : inHouseIMConversationEntity.getUnreadCount();
                        long jLongValue = l != null ? l.longValue() : inHouseIMConversationEntity.getLastUserMessageSendTime();
                        String strCopydefault = sgk.copydefault(inAppConversationExtra, inHouseIMConversationEntity.getExtra());
                        String str3 = jLongValue != 0 ? MultiTransferSignData.DEFAULT_INTERVAL : null;
                        pUU.KWHzl("InHouseIMConversationManagerImpl", "storeInAppConversation with existing conversation: " + str + " => updateTime:" + jLongValue + ", storeUnreadCount:" + iIntValue + ", storeExtra: " + strCopydefault);
                        inHouseIMConversationEntityEZpvd = inHouseIMConversationEntity.copy((536769023 & 1) != 0 ? inHouseIMConversationEntity.channelId : null, (536769023 & 2) != 0 ? inHouseIMConversationEntity.channelType : null, (536769023 & 4) != 0 ? inHouseIMConversationEntity.groupAtType : 0, (536769023 & 8) != 0 ? inHouseIMConversationEntity.inGroupStatus : null, (536769023 & 16) != 0 ? inHouseIMConversationEntity.groupStatus : null, (536769023 & 32) != 0 ? inHouseIMConversationEntity.pinnedStatus : 0, (536769023 & 64) != 0 ? inHouseIMConversationEntity.isFlagged : 0, (536769023 & 128) != 0 ? inHouseIMConversationEntity.muteStatus : C56443yFo.AEQbTJ(ReceiveMessageOptionType.RECEIVE.getApiValue()), (536769023 & 256) != 0 ? inHouseIMConversationEntity.role : 0, (536769023 & 512) != 0 ? inHouseIMConversationEntity.unreadCount : iIntValue, (536769023 & 1024) != 0 ? inHouseIMConversationEntity.unreadMentionedCount : 0, (536769023 & 2048) != 0 ? inHouseIMConversationEntity.unreadMentionedType : null, (536769023 & 4096) != 0 ? inHouseIMConversationEntity.startMsgSeq : null, (536769023 & 8192) != 0 ? inHouseIMConversationEntity.lastReadMsgSeq : null, (536769023 & 16384) != 0 ? inHouseIMConversationEntity.extra : strCopydefault, (536769023 & 32768) != 0 ? inHouseIMConversationEntity.lastUserMessageId : str3, (536769023 & 65536) != 0 ? inHouseIMConversationEntity.lastUserMessageSendTime : jLongValue, (536769023 & 131072) != 0 ? inHouseIMConversationEntity.draftMessage : null, (262144 & 536769023) != 0 ? inHouseIMConversationEntity.updateTime : null, (536769023 & 524288) != 0 ? inHouseIMConversationEntity.conversationStatus : null, (536769023 & 1048576) != 0 ? inHouseIMConversationEntity.relatedId : null, (536769023 & 2097152) != 0 ? inHouseIMConversationEntity.avatar : null, (536769023 & 4194304) != 0 ? inHouseIMConversationEntity.nickname : null, (536769023 & 8388608) != 0 ? inHouseIMConversationEntity.enNickname : null, (536769023 & 16777216) != 0 ? inHouseIMConversationEntity.bizGroupName : null, (536769023 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? inHouseIMConversationEntity.tags : null, (536769023 & 67108864) != 0 ? inHouseIMConversationEntity.groupType : null, (536769023 & 134217728) != 0 ? inHouseIMConversationEntity.conversationIcons : null, (536769023 & 268435456) != 0 ? inHouseIMConversationEntity.entityInfoExtra : null);
                    } else {
                        long jLongValue2 = l != null ? l.longValue() : 0L;
                        String str4 = jLongValue2 != 0 ? MultiTransferSignData.DEFAULT_INTERVAL : null;
                        int iIntValue2 = num != null ? num.intValue() : 0;
                        String strCopydefault2 = sgk.copydefault(inAppConversationExtra, (String) null);
                        pUU.KWHzl("InHouseIMConversationManagerImpl", "store new in-app conversation: build in-app conversation: " + str + " => updateTime:" + jLongValue2 + ", unread:" + iIntValue2 + ", extra: " + strCopydefault2);
                        inHouseIMConversationEntityEZpvd = sgk.EZpvd(str, inHouseIMChannelType3, strCopydefault2, jLongValue2, iIntValue2, str4);
                    }
                    baseDaoAYXKKw = sgk.AYXKKw();
                    Ref.LongRef longRef5 = new Ref.LongRef();
                    objectRef = new Ref.ObjectRef();
                    longRef3 = longRef5;
                    i = 0;
                    i2 = 3;
                    inHouseIMConversationEntity2 = inHouseIMConversationEntityEZpvd;
                    if (i < i2) {
                    }
                    mutex = mutex2;
                    mutex.unlock(null);
                    throw th;
                }
                if (i8 == 3) {
                    jNanoTime = this.J$0;
                    i3 = this.I$2;
                    i7 = this.I$1;
                    i2 = this.I$0;
                    objectRef5 = (Ref.ObjectRef) this.L$8;
                    longRef3 = (Ref.LongRef) this.L$7;
                    objectRef4 = (Ref.ObjectRef) this.L$6;
                    inHouseIMConversationEntity3 = (InHouseIMConversationEntity) this.L$5;
                    Ref.ObjectRef objectRef6 = (Ref.ObjectRef) this.L$4;
                    longRef2 = (Ref.LongRef) this.L$3;
                    baseDao2 = (BaseDao) this.L$2;
                    sgk3 = (sGK) this.L$1;
                    mutex = (Mutex) this.L$0;
                    try {
                        try {
                            C56391yDq.AEQbTJ(obj);
                            objectRef3 = objectRef6;
                        } catch (IllegalStateException e3) {
                            e2 = e3;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (Exception e4) {
                            e = e4;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (Throwable th3) {
                            th = th3;
                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                            throw th;
                        }
                    } catch (SQLiteDatabaseLockedException e5) {
                        objectRef2 = objectRef6;
                        sQLiteDatabaseLockedException = e5;
                        mutex3 = mutex;
                        sgk2 = sgk3;
                        int i9 = i7;
                        longRef4 = longRef2;
                        i = i9;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i3 < i2 - 1) {
                            this.L$0 = mutex3;
                            this.L$1 = sgk2;
                            this.L$2 = baseDao2;
                            this.L$3 = longRef4;
                            this.L$4 = objectRef2;
                            this.L$5 = inHouseIMConversationEntity3;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.L$8 = null;
                            this.I$0 = i2;
                            this.I$1 = i;
                            this.label = 4;
                            if (DelayKt.delay(((long) (i3 + 1)) * 50, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            i5 = i;
                            i6 = i2;
                            baseDao3 = baseDao2;
                            i = i5;
                            inHouseIMConversationEntity2 = inHouseIMConversationEntity3;
                            baseDaoAYXKKw = baseDao3;
                            sgk = sgk2;
                            i2 = i6;
                            objectRef = objectRef2;
                            longRef3 = longRef4;
                            i4 = 1;
                            i += i4;
                            mutex2 = mutex3;
                            if (i < i2) {
                            }
                            mutex = mutex2;
                            mutex.unlock(null);
                            throw th;
                        }
                        inHouseIMConversationEntity2 = inHouseIMConversationEntity3;
                        baseDaoAYXKKw = baseDao2;
                        objectRef = objectRef2;
                        sgk = sgk2;
                        i4 = 1;
                        longRef3 = longRef4;
                        i += i4;
                        mutex2 = mutex3;
                        if (i < i2) {
                        }
                        mutex = mutex2;
                        mutex.unlock(null);
                        throw th;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    objectRef5.element = Unit.INSTANCE;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef2.element);
                    mutex.unlock(null);
                    return inHouseIMConversationEntity3;
                }
                if (i8 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5 = this.I$1;
                i6 = this.I$0;
                InHouseIMConversationEntity inHouseIMConversationEntity4 = (InHouseIMConversationEntity) this.L$5;
                objectRef2 = (Ref.ObjectRef) this.L$4;
                longRef4 = (Ref.LongRef) this.L$3;
                baseDao3 = (BaseDao) this.L$2;
                sgk2 = (sGK) this.L$1;
                mutex3 = (Mutex) this.L$0;
                C56391yDq.AEQbTJ(obj);
                inHouseIMConversationEntity3 = inHouseIMConversationEntity4;
                i = i5;
                inHouseIMConversationEntity2 = inHouseIMConversationEntity3;
                baseDaoAYXKKw = baseDao3;
                sgk = sgk2;
                i2 = i6;
                objectRef = objectRef2;
                longRef3 = longRef4;
                i4 = 1;
                i += i4;
                mutex2 = mutex3;
                if (i < i2) {
                    try {
                        try {
                        } catch (IllegalStateException e6) {
                            e2 = e6;
                            message = e2.getMessage();
                            if (message == null && StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "not open", false, 2, (Object) null)) {
                                C44159sFm.OLrzqt(e2);
                                throw e2;
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (Exception e7) {
                            e = e7;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (Throwable th4) {
                            th = th4;
                            baseDao2 = baseDaoAYXKKw;
                            mutex = mutex2;
                            longRef2 = longRef3;
                            try {
                                C44159sFm.EZpvd(baseDao2, longRef2.element);
                                throw th;
                            } catch (Throwable th5) {
                                th = th5;
                                mutex2 = mutex;
                            }
                        }
                    } catch (SQLiteDatabaseLockedException e8) {
                        objectRef2 = objectRef;
                        i3 = i;
                        mutex3 = mutex2;
                        longRef4 = longRef3;
                        sQLiteDatabaseLockedException2 = e8;
                    }
                    try {
                    } catch (SQLiteDatabaseLockedException e9) {
                        try {
                            objectRef2 = objectRef;
                            i3 = i;
                            mutex3 = mutex2;
                            longRef4 = longRef3;
                            sQLiteDatabaseLockedException2 = e9;
                            C44159sFm.copydefault(r0, (Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i3 < i2 - 1) {
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            longRef2 = longRef4;
                            mutex = mutex3;
                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                            throw th;
                        }
                        sgk2 = sgk;
                        baseDao2 = baseDaoAYXKKw;
                        inHouseIMConversationEntity3 = inHouseIMConversationEntity2;
                        r0 = sQLiteDatabaseLockedException2;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    objectRef5 = new Ref.ObjectRef();
                    jNanoTime = System.nanoTime();
                    this.L$0 = mutex2;
                    this.L$1 = sgk;
                    this.L$2 = baseDaoAYXKKw;
                    this.L$3 = longRef3;
                    this.L$4 = objectRef;
                    this.L$5 = inHouseIMConversationEntity2;
                    this.L$6 = objectRef5;
                    this.L$7 = longRef3;
                    this.L$8 = objectRef5;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.I$2 = i;
                    this.J$0 = jNanoTime;
                    this.label = 3;
                    if (sgk.AYXKKw().insertOrReplace(new InHouseIMConversationEntity[]{inHouseIMConversationEntity2}, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    objectRef4 = objectRef5;
                    objectRef3 = objectRef;
                    i3 = i;
                    i7 = i3;
                    mutex = mutex2;
                    longRef2 = longRef3;
                    sgk3 = sgk;
                    baseDao2 = baseDaoAYXKKw;
                    inHouseIMConversationEntity3 = inHouseIMConversationEntity2;
                    try {
                    } catch (SQLiteDatabaseLockedException e10) {
                        objectRef2 = objectRef3;
                        sQLiteDatabaseLockedException = e10;
                        mutex3 = mutex;
                        sgk2 = sgk3;
                        int i92 = i7;
                        longRef4 = longRef2;
                        i = i92;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i3 < i2 - 1) {
                        }
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        throw th;
                    }
                    objectRef5.element = Unit.INSTANCE;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef4.element;
                    try {
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        mutex.unlock(null);
                        return inHouseIMConversationEntity3;
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } else {
                    C44159sFm.EZpvd(baseDaoAYXKKw, longRef3.element);
                    Exception exc = (Exception) objectRef.element;
                    if (exc == null) {
                        exc = new Exception("Database Operation failed after " + i2 + " attempts");
                    }
                    C44159sFm.OLrzqt(exc);
                    throw exc;
                }
                mutex = mutex2;
                mutex.unlock(null);
                throw th;
            }
            inHouseIMChannelType = (InHouseIMChannelType) this.L$6;
            inAppConversationExtra = (InAppConversationExtra) this.L$5;
            l = (Long) this.L$4;
            num = (Integer) this.L$3;
            sgk = (sGK) this.L$2;
            str = (String) this.L$1;
            mutex2 = (Mutex) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        pUU.KWHzl("InHouseIMConversationManagerImpl", "start storeInAppConversation...: " + str);
        this.L$0 = mutex2;
        this.L$1 = str;
        this.L$2 = sgk;
        this.L$3 = num;
        this.L$4 = l;
        this.L$5 = inAppConversationExtra;
        this.L$6 = inHouseIMChannelType;
        this.label = 2;
        objKWHzl = sgk.KWHzl(str, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        InHouseIMChannelType inHouseIMChannelType32 = inHouseIMChannelType;
        inHouseIMConversationEntity = (InHouseIMConversationEntity) objKWHzl;
        if (inHouseIMConversationEntity == null) {
        }
        baseDaoAYXKKw = sgk.AYXKKw();
        Ref.LongRef longRef52 = new Ref.LongRef();
        objectRef = new Ref.ObjectRef();
        longRef3 = longRef52;
        i = 0;
        i2 = 3;
        inHouseIMConversationEntity2 = inHouseIMConversationEntityEZpvd;
        if (i < i2) {
        }
        mutex = mutex2;
        mutex.unlock(null);
        throw th;
    }
}
