package com.okinc.okimcore.feature.group.manager;

import android.database.sqlite.SQLiteDatabaseLockedException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.model.remote.InHouseIMGroupInfo;
import com.okinc.okimcore.model.remote.InHouseIMGroupMemberInfo;
import com.okinc.okimcore.model.remote.InHouseUserInfo;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C44124sEe;
import o.C44157sFk;
import o.C44159sFm;
import o.C44261sJg;
import o.C56391yDq;
import o.C56442yFn;
import o.C59462zhW;
import o.C59519zia;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMGroupManagerImpl$getGroupInfoById$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InHouseIMGroupInfo>, Object> {
    final /* synthetic */ long $groupId;
    final /* synthetic */ Integer $maxMembersToReturn;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ C44261sJg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMGroupManagerImpl$getGroupInfoById$2(C44261sJg c44261sJg, long j, Integer num, Continuation<? super InHouseIMGroupManagerImpl$getGroupInfoById$2> continuation) {
        super(2, continuation);
        this.this$0 = c44261sJg;
        this.$groupId = j;
        this.$maxMembersToReturn = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMGroupManagerImpl$getGroupInfoById$2(this.this$0, this.$groupId, this.$maxMembersToReturn, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InHouseIMGroupInfo> continuation) {
        return ((InHouseIMGroupManagerImpl$getGroupInfoById$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Duplicate block (B:146:0x0495) to fix multi-entry loop: BACK_EDGE: B:146:0x0495 -> B:147:0x04a7 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:102:0x036d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:104:0x0370 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:106:0x0373 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:169:0x0526 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:0x00bf */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:206:0x05f3 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x00c2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x00c5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:259:0x04a7 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x0155 */
    /* JADX DEBUG: Type inference failed for r0v104. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v31. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v46. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v82. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r2v4. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r4v24. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x041a: MOVE (r14 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:136:0x041a */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x041b: MOVE (r15 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:136:0x041a */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0408 A[Catch: all -> 0x005d, TryCatch #36 {all -> 0x005d, blocks: (B:10:0x0047, B:125:0x03f8, B:126:0x03fb, B:128:0x0402, B:130:0x0408, B:132:0x0412, B:133:0x0415, B:134:0x0416, B:135:0x0419), top: B:240:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0466 A[Catch: all -> 0x04ae, TRY_LEAVE, TryCatch #10 {all -> 0x04ae, blocks: (B:140:0x0459, B:142:0x0466), top: B:231:0x0459 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x054f A[Catch: all -> 0x0100, TryCatch #20 {all -> 0x0100, blocks: (B:28:0x00f1, B:69:0x022d, B:179:0x053f, B:180:0x0542, B:184:0x0549, B:186:0x054f, B:188:0x0558, B:189:0x055b, B:190:0x055c, B:191:0x055f), top: B:240:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x058f A[Catch: all -> 0x05f3, TRY_LEAVE, TryCatch #15 {all -> 0x05f3, blocks: (B:197:0x0582, B:199:0x058f), top: B:236:0x0582 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x026c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:260:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024c  */
    /* JADX WARN: Type inference failed for: r0v142 */
    /* JADX WARN: Type inference failed for: r0v143 */
    /* JADX WARN: Type inference failed for: r0v151 */
    /* JADX WARN: Type inference failed for: r0v152 */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v60, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v6, types: [T] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v42 */
    /* JADX WARN: Type inference failed for: r14v8, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r15v32, types: [T, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r15v39, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v15, types: [com.okinc.okimcore.common.database.BaseDao, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v42, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v9, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:202:0x05bc -> B:203:0x05ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:204:0x05d9 -> B:205:0x05ee). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        ?? r15;
        ?? r1;
        Object obj2;
        Object groupInfoById;
        InHouseIMGroupInfo inHouseIMGroupInfo;
        C44261sJg c44261sJg;
        String groupId;
        InHouseIMGroupInfo inHouseIMGroupInfo2;
        InHouseIMGroupInfo inHouseIMGroupInfo3;
        InHouseIMGroupInfo inHouseIMGroupInfo4;
        C44261sJg c44261sJg2;
        ?? longRef3;
        Ref.ObjectRef objectRef;
        int i;
        InHouseIMConversationDao inHouseIMConversationDao;
        int i2;
        Exception e;
        Object obj3;
        IllegalStateException e2;
        String message;
        String str;
        String str2;
        InHouseIMGroupInfo inHouseIMGroupInfo5;
        C44261sJg c44261sJg3;
        String str3;
        int i3;
        Ref.ObjectRef objectRef2;
        InHouseIMConversationDao inHouseIMConversationDao2;
        InHouseIMGroupInfo inHouseIMGroupInfo6;
        ?? r0;
        InHouseIMGroupInfo inHouseIMGroupInfo7;
        ?? r152;
        ?? r8;
        InHouseIMConversationDao inHouseIMConversationDao3;
        SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        C44261sJg c44261sJg4;
        InHouseIMGroupInfo inHouseIMGroupInfo8;
        InHouseIMConversationDao inHouseIMConversationDao4;
        String str4;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        ?? r14;
        ?? r13;
        int i4;
        int i5;
        ?? r82;
        ?? r7;
        long j;
        int i6;
        Ref.ObjectRef objectRef5;
        InHouseIMConversationEntity inHouseIMConversationEntity;
        InHouseIMConversationEntity inHouseIMConversationEntity2;
        Ref.LongRef longRef4;
        String str5;
        String str6;
        String str7;
        Ref.ObjectRef objectRef6;
        String str8;
        BaseDao baseDao3;
        InHouseIMGroupInfo inHouseIMGroupInfo9;
        C44261sJg c44261sJg5;
        InHouseIMGroupInfo inHouseIMGroupInfo10;
        int i7;
        int i8;
        String str9;
        String str10;
        String str11;
        String str12;
        InHouseIMGroupInfo inHouseIMGroupInfo11;
        Ref.ObjectRef objectRef7;
        SQLiteDatabaseLockedException sQLiteDatabaseLockedException2;
        SQLiteDatabaseLockedException sQLiteDatabaseLockedException3;
        Exception e3;
        IllegalStateException e4;
        String message2;
        BaseDao baseDao4;
        String str13;
        String str14;
        String str15;
        InHouseIMConversationEntity inHouseIMConversationEntity3;
        int i9;
        InHouseIMGroupInfo inHouseIMGroupInfo12;
        BaseDao baseDao5;
        C44261sJg c44261sJg6;
        InHouseIMGroupInfo inHouseIMGroupInfo13;
        int i10;
        Ref.ObjectRef objectRef8;
        InHouseIMConversationDao inHouseIMConversationDao5;
        String str16;
        int i11;
        ?? r02;
        InHouseIMConversationDao inHouseIMConversationDao6;
        String str17;
        BaseDao baseDao6;
        Ref.ObjectRef objectRef9;
        int i12;
        int i13;
        InHouseIMConversationEntity inHouseIMConversationEntity4;
        SQLiteDatabaseLockedException sQLiteDatabaseLockedException4;
        InHouseIMGroupMemberInfo currentUser;
        InHouseUserInfo userInfo;
        Ref.ObjectRef objectRef10;
        InHouseIMConversationDao inHouseIMConversationDao7;
        String str18;
        String str19;
        BaseDao baseDao7;
        Ref.LongRef longRef5;
        Ref.ObjectRef objectRef11;
        Ref.LongRef longRef6;
        Ref.ObjectRef objectRef12;
        InHouseIMConversationEntity inHouseIMConversationEntity5;
        long j2;
        InHouseIMConversationDao inHouseIMConversationDao8;
        BaseDao baseDao8;
        Ref.LongRef longRef7;
        int i14;
        InHouseIMGroupInfo inHouseIMGroupInfo14;
        C44261sJg c44261sJg7;
        InHouseIMGroupInfo inHouseIMGroupInfo15;
        InHouseIMConversationDao inHouseIMConversationDao9;
        BaseDao baseDao9;
        String str20;
        InHouseIMConversationEntity inHouseIMConversationEntity6;
        int i15;
        SQLiteDatabaseLockedException sQLiteDatabaseLockedException5;
        InHouseIMConversationDao inHouseIMConversationDao10;
        SQLiteDatabaseLockedException e5;
        Object objCopydefault = C56442yFn.copydefault();
        int i16 = this.label;
        ?? r83 = 2;
        String str21 = " attempts";
        String str22 = "Database Operation failed after ";
        String str23 = "not open";
        try {
            try {
                if (i16 == 0) {
                    C56391yDq.AEQbTJ(obj);
                    if (C44157sFk.gEmmrt().values()) {
                        InHouseIMGroupService inHouseIMGroupService = this.this$0.AEQbTJ;
                        long j3 = this.$groupId;
                        Integer num = this.$maxMembersToReturn;
                        this.label = 1;
                        groupInfoById = inHouseIMGroupService.getGroupInfoById(j3, num, this);
                        if (groupInfoById == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        obj2 = null;
                        C44124sEe.imLogLogin$default("getGroupInfoById: User not logged in", null, 2, null);
                        return obj2;
                    }
                } else if (i16 == 1) {
                    C56391yDq.AEQbTJ(obj);
                    groupInfoById = obj;
                } else if (i16 == 2) {
                    j = this.J$0;
                    i3 = this.I$2;
                    int i17 = this.I$1;
                    i = this.I$0;
                    Ref.ObjectRef objectRef13 = (Ref.ObjectRef) this.L$10;
                    Ref.LongRef longRef8 = (Ref.LongRef) this.L$9;
                    Ref.ObjectRef objectRef14 = (Ref.ObjectRef) this.L$8;
                    Ref.ObjectRef objectRef15 = (Ref.ObjectRef) this.L$7;
                    r15 = (Ref.LongRef) this.L$6;
                    r1 = (BaseDao) this.L$5;
                    str4 = (String) this.L$4;
                    InHouseIMConversationDao inHouseIMConversationDao11 = (InHouseIMConversationDao) this.L$3;
                    inHouseIMGroupInfo8 = (InHouseIMGroupInfo) this.L$2;
                    c44261sJg4 = (C44261sJg) this.L$1;
                    inHouseIMGroupInfo7 = (InHouseIMGroupInfo) this.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        objectRef5 = objectRef13;
                        objectRef3 = objectRef15;
                        r14 = longRef8;
                        i4 = i;
                        i5 = i17;
                        r82 = r1;
                        i6 = i3;
                        r7 = r15;
                        objectRef4 = objectRef14;
                        r13 = obj;
                        inHouseIMConversationDao4 = inHouseIMConversationDao11;
                    } catch (SQLiteDatabaseLockedException e6) {
                        str2 = " attempts";
                        str = "not open";
                        i2 = i17;
                        objectRef2 = objectRef15;
                        str3 = str4;
                        inHouseIMConversationDao3 = inHouseIMConversationDao11;
                        inHouseIMGroupInfo5 = inHouseIMGroupInfo8;
                        c44261sJg3 = c44261sJg4;
                        r8 = r1;
                        sQLiteDatabaseLockedException = e6;
                        r152 = r15;
                        inHouseIMGroupInfo6 = inHouseIMGroupInfo7;
                        r0 = sQLiteDatabaseLockedException;
                        inHouseIMConversationDao2 = inHouseIMConversationDao3;
                        r83 = r8;
                        r15 = r152;
                        C44159sFm.copydefault(r0, (Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i3 >= i - 1) {
                        }
                    } catch (IllegalStateException e7) {
                        e2 = e7;
                        obj3 = null;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (Exception e8) {
                        e = e8;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        C44159sFm.EZpvd(r1, r15.element);
                        throw th;
                    }
                    objectRef5.element = r13;
                    r14.element = C59462zhW.valueOf(C59519zia.AEQbTJ(System.nanoTime() - j, DurationUnit.NANOSECONDS));
                    Object obj4 = objectRef4.element;
                    C44159sFm.EZpvd(r82, r7.element);
                    inHouseIMConversationEntity = (InHouseIMConversationEntity) obj4;
                    if (inHouseIMConversationEntity != null) {
                    }
                    inHouseIMGroupInfo = inHouseIMGroupInfo8;
                    c44261sJg = c44261sJg4;
                    inHouseIMGroupInfo2 = inHouseIMGroupInfo7;
                    currentUser = inHouseIMGroupInfo.getCurrentUser();
                    if (currentUser != null) {
                    }
                } else {
                    if (i16 != 3) {
                        if (i16 == 4) {
                            long j4 = this.J$0;
                            i13 = this.I$2;
                            i10 = this.I$1;
                            i12 = this.I$0;
                            objectRef12 = (Ref.ObjectRef) this.L$11;
                            longRef6 = (Ref.LongRef) this.L$10;
                            objectRef11 = (Ref.ObjectRef) this.L$9;
                            objectRef9 = (Ref.ObjectRef) this.L$8;
                            longRef2 = (Ref.LongRef) this.L$7;
                            baseDao2 = (BaseDao) this.L$6;
                            inHouseIMConversationEntity4 = (InHouseIMConversationEntity) this.L$5;
                            str17 = (String) this.L$4;
                            InHouseIMConversationDao inHouseIMConversationDao12 = (InHouseIMConversationDao) this.L$3;
                            inHouseIMGroupInfo8 = (InHouseIMGroupInfo) this.L$2;
                            c44261sJg4 = (C44261sJg) this.L$1;
                            inHouseIMGroupInfo7 = (InHouseIMGroupInfo) this.L$0;
                            try {
                                C56391yDq.AEQbTJ(obj);
                                objectRef10 = objectRef9;
                                longRef5 = longRef2;
                                baseDao7 = baseDao2;
                                str19 = str17;
                                str18 = " attempts";
                                inHouseIMConversationEntity5 = inHouseIMConversationEntity4;
                                j2 = j4;
                                inHouseIMConversationDao7 = inHouseIMConversationDao12;
                            } catch (SQLiteDatabaseLockedException e9) {
                                sQLiteDatabaseLockedException4 = e9;
                                baseDao6 = baseDao2;
                                inHouseIMConversationDao6 = inHouseIMConversationDao12;
                                str13 = str21;
                                str15 = str22;
                                str14 = str23;
                                baseDao5 = baseDao6;
                                str16 = str17;
                                inHouseIMConversationDao5 = inHouseIMConversationDao6;
                                inHouseIMGroupInfo12 = inHouseIMGroupInfo8;
                                c44261sJg6 = c44261sJg4;
                                inHouseIMConversationEntity3 = inHouseIMConversationEntity4;
                                i11 = i13;
                                objectRef8 = objectRef9;
                                i9 = i12;
                                inHouseIMGroupInfo13 = inHouseIMGroupInfo7;
                                r02 = sQLiteDatabaseLockedException4;
                                C44159sFm.copydefault(r02, (Exception) objectRef8.element);
                                objectRef8.element = r02;
                                if (i11 >= i9 - 1) {
                                }
                                i7 = i + i;
                                inHouseIMGroupInfo9 = inHouseIMGroupInfo12;
                                str6 = str15;
                                inHouseIMConversationDao8 = inHouseIMConversationDao;
                                baseDao3 = baseDao;
                                if (i7 >= i8) {
                                }
                            } catch (IllegalStateException e10) {
                                e4 = e10;
                                message2 = e4.getMessage();
                                if (message2 == null) {
                                }
                                C44159sFm.copydefault(e4);
                                throw e4;
                            } catch (Exception e11) {
                                e3 = e11;
                                C44159sFm.OLrzqt(e3);
                                throw e3;
                            } catch (Throwable th2) {
                                th = th2;
                                C44159sFm.EZpvd(baseDao2, longRef2.element);
                                throw th;
                            }
                            objectRef12.element = Unit.INSTANCE;
                            longRef6.element = C59462zhW.valueOf(C59519zia.AEQbTJ(System.nanoTime() - j2, DurationUnit.NANOSECONDS));
                            Object obj5 = objectRef11.element;
                            C44159sFm.EZpvd(baseDao7, longRef5.element);
                            inHouseIMGroupInfo = inHouseIMGroupInfo8;
                            c44261sJg = c44261sJg4;
                            inHouseIMGroupInfo2 = inHouseIMGroupInfo7;
                            currentUser = inHouseIMGroupInfo.getCurrentUser();
                            return currentUser != null ? inHouseIMGroupInfo2 : inHouseIMGroupInfo2;
                        }
                        if (i16 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i18 = this.I$1;
                        int i19 = this.I$0;
                        Ref.ObjectRef objectRef16 = (Ref.ObjectRef) this.L$8;
                        Ref.LongRef longRef9 = (Ref.LongRef) this.L$7;
                        BaseDao baseDao10 = (BaseDao) this.L$6;
                        inHouseIMConversationEntity2 = (InHouseIMConversationEntity) this.L$5;
                        String str24 = (String) this.L$4;
                        InHouseIMConversationDao inHouseIMConversationDao13 = (InHouseIMConversationDao) this.L$3;
                        inHouseIMGroupInfo12 = (InHouseIMGroupInfo) this.L$2;
                        C44261sJg c44261sJg8 = (C44261sJg) this.L$1;
                        InHouseIMGroupInfo inHouseIMGroupInfo16 = (InHouseIMGroupInfo) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        str15 = "Database Operation failed after ";
                        str7 = "not open";
                        c44261sJg5 = c44261sJg8;
                        longRef4 = longRef9;
                        BaseDao baseDao11 = baseDao10;
                        objectRef6 = objectRef16;
                        InHouseIMConversationDao inHouseIMConversationDao14 = inHouseIMConversationDao13;
                        str5 = " attempts";
                        inHouseIMGroupInfo10 = inHouseIMGroupInfo16;
                        str8 = str24;
                        i8 = i19;
                        int i20 = 1;
                        i7 = i18 + i20;
                        inHouseIMGroupInfo9 = inHouseIMGroupInfo12;
                        str6 = str15;
                        inHouseIMConversationDao8 = inHouseIMConversationDao14;
                        baseDao3 = baseDao11;
                        if (i7 >= i8) {
                            try {
                                try {
                                } catch (IllegalStateException e12) {
                                    e4 = e12;
                                    baseDao8 = baseDao3;
                                    longRef7 = longRef4;
                                } catch (Exception e13) {
                                    e3 = e13;
                                    baseDao8 = baseDao3;
                                    longRef7 = longRef4;
                                } catch (Throwable th3) {
                                    th = th3;
                                    baseDao4 = baseDao3;
                                }
                            } catch (SQLiteDatabaseLockedException e14) {
                                i14 = i7;
                                inHouseIMGroupInfo14 = inHouseIMGroupInfo10;
                                c44261sJg7 = c44261sJg5;
                                inHouseIMGroupInfo15 = inHouseIMGroupInfo9;
                                inHouseIMConversationDao9 = inHouseIMConversationDao8;
                                baseDao9 = baseDao3;
                                str19 = str8;
                                longRef7 = longRef4;
                                objectRef10 = objectRef6;
                                str20 = str6;
                                inHouseIMConversationEntity6 = inHouseIMConversationEntity2;
                                i15 = i8;
                                str18 = str5;
                                sQLiteDatabaseLockedException5 = e14;
                            }
                            try {
                            } catch (SQLiteDatabaseLockedException e15) {
                                i14 = i7;
                                inHouseIMGroupInfo14 = inHouseIMGroupInfo10;
                                c44261sJg7 = c44261sJg5;
                                inHouseIMGroupInfo15 = inHouseIMGroupInfo9;
                                inHouseIMConversationDao10 = inHouseIMConversationDao8;
                                baseDao8 = baseDao3;
                                str19 = str8;
                                longRef7 = longRef4;
                                objectRef10 = objectRef6;
                                str20 = str6;
                                inHouseIMConversationEntity6 = inHouseIMConversationEntity2;
                                i15 = i8;
                                str18 = str5;
                                e5 = e15;
                            }
                            Ref.ObjectRef objectRef17 = new Ref.ObjectRef();
                            int i21 = i8;
                            str18 = str5;
                            try {
                            } catch (SQLiteDatabaseLockedException e16) {
                                i14 = i7;
                                inHouseIMGroupInfo14 = inHouseIMGroupInfo10;
                                c44261sJg7 = c44261sJg5;
                                inHouseIMGroupInfo15 = inHouseIMGroupInfo9;
                                inHouseIMConversationDao10 = inHouseIMConversationDao8;
                                baseDao8 = baseDao3;
                                str19 = str8;
                                longRef7 = longRef4;
                                objectRef10 = objectRef6;
                                str20 = str6;
                                inHouseIMConversationEntity6 = inHouseIMConversationEntity2;
                                i15 = i21;
                                e5 = e16;
                            }
                            long jNanoTime = System.nanoTime();
                            String groupName = inHouseIMGroupInfo9.getGroupName();
                            String groupName2 = inHouseIMGroupInfo9.getGroupName();
                            String bizGroupName = inHouseIMGroupInfo9.getBizGroupName();
                            String groupAvatar = inHouseIMGroupInfo9.getGroupAvatar();
                            List<Integer> tags = inHouseIMConversationEntity2.getTags();
                            Integer groupType = inHouseIMConversationEntity2.getGroupType();
                            String relatedId = inHouseIMConversationEntity2.getRelatedId();
                            this.L$0 = inHouseIMGroupInfo10;
                            this.L$1 = c44261sJg5;
                            this.L$2 = inHouseIMGroupInfo9;
                            this.L$3 = inHouseIMConversationDao8;
                            this.L$4 = str8;
                            this.L$5 = inHouseIMConversationEntity2;
                            this.L$6 = baseDao3;
                            this.L$7 = longRef4;
                            this.L$8 = objectRef6;
                            this.L$9 = objectRef17;
                            this.L$10 = longRef4;
                            this.L$11 = objectRef17;
                            inHouseIMConversationEntity6 = inHouseIMConversationEntity2;
                            try {
                            } catch (SQLiteDatabaseLockedException e17) {
                                try {
                                    i14 = i7;
                                    inHouseIMGroupInfo14 = inHouseIMGroupInfo10;
                                    c44261sJg7 = c44261sJg5;
                                    inHouseIMGroupInfo15 = inHouseIMGroupInfo9;
                                    inHouseIMConversationDao10 = inHouseIMConversationDao8;
                                    baseDao8 = baseDao3;
                                    str19 = str8;
                                    longRef7 = longRef4;
                                    objectRef10 = objectRef6;
                                    str20 = str6;
                                    i15 = i21;
                                    e5 = e17;
                                    sQLiteDatabaseLockedException5 = e5;
                                    baseDao9 = baseDao8;
                                    inHouseIMConversationDao9 = inHouseIMConversationDao10;
                                    C44159sFm.copydefault(r02, (Exception) objectRef8.element);
                                    objectRef8.element = r02;
                                    if (i11 >= i9 - 1) {
                                        this.L$0 = inHouseIMGroupInfo13;
                                        this.L$1 = c44261sJg6;
                                        this.L$2 = inHouseIMGroupInfo12;
                                        this.L$3 = inHouseIMConversationDao5;
                                        this.L$4 = str16;
                                        this.L$5 = inHouseIMConversationEntity3;
                                        this.L$6 = baseDao5;
                                        this.L$7 = longRef2;
                                        this.L$8 = objectRef8;
                                        this.L$9 = null;
                                        this.L$10 = null;
                                        this.L$11 = null;
                                        this.I$0 = i9;
                                        this.I$1 = i10;
                                        this.label = 5;
                                        if (DelayKt.delay(((long) (i11 + 1)) * 50, this) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                        i18 = i10;
                                        baseDao11 = baseDao5;
                                        str7 = str14;
                                        i20 = 1;
                                        objectRef6 = objectRef8;
                                        inHouseIMConversationDao14 = inHouseIMConversationDao5;
                                        c44261sJg5 = c44261sJg6;
                                        longRef4 = longRef2;
                                        i8 = i9;
                                        inHouseIMConversationEntity2 = inHouseIMConversationEntity3;
                                        str5 = str13;
                                        InHouseIMGroupInfo inHouseIMGroupInfo17 = inHouseIMGroupInfo13;
                                        str8 = str16;
                                        inHouseIMGroupInfo10 = inHouseIMGroupInfo17;
                                    } else {
                                        i18 = i10;
                                        baseDao11 = baseDao5;
                                        str7 = str14;
                                        i20 = 1;
                                        objectRef6 = objectRef8;
                                        inHouseIMConversationDao14 = inHouseIMConversationDao5;
                                        c44261sJg5 = c44261sJg6;
                                        longRef4 = longRef2;
                                        i8 = i9;
                                        inHouseIMConversationEntity2 = inHouseIMConversationEntity3;
                                        str5 = str13;
                                        InHouseIMGroupInfo inHouseIMGroupInfo18 = inHouseIMGroupInfo13;
                                        str8 = str16;
                                        inHouseIMGroupInfo10 = inHouseIMGroupInfo18;
                                    }
                                    i7 = i18 + i20;
                                    inHouseIMGroupInfo9 = inHouseIMGroupInfo12;
                                    str6 = str15;
                                    inHouseIMConversationDao8 = inHouseIMConversationDao14;
                                    baseDao3 = baseDao11;
                                    if (i7 >= i8) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    baseDao4 = baseDao5;
                                    longRef4 = longRef2;
                                    baseDao2 = baseDao4;
                                    longRef2 = longRef4;
                                    C44159sFm.EZpvd(baseDao2, longRef2.element);
                                    throw th;
                                }
                                inHouseIMConversationEntity3 = inHouseIMConversationEntity6;
                                str16 = str19;
                                baseDao5 = baseDao9;
                                i11 = i14;
                                i10 = i11;
                                i9 = i15;
                                str14 = str7;
                                str13 = str18;
                                inHouseIMGroupInfo12 = inHouseIMGroupInfo15;
                                inHouseIMConversationDao5 = inHouseIMConversationDao9;
                                inHouseIMGroupInfo13 = inHouseIMGroupInfo14;
                                c44261sJg6 = c44261sJg7;
                                longRef2 = longRef7;
                                objectRef8 = objectRef10;
                                str15 = str20;
                                r02 = sQLiteDatabaseLockedException5;
                            }
                            this.I$0 = i21;
                            this.I$1 = i7;
                            this.I$2 = i7;
                            this.J$0 = jNanoTime;
                            String str25 = str6;
                            try {
                            } catch (SQLiteDatabaseLockedException e18) {
                                e5 = e18;
                                i14 = i7;
                                inHouseIMGroupInfo14 = inHouseIMGroupInfo10;
                                c44261sJg7 = c44261sJg5;
                                inHouseIMGroupInfo15 = inHouseIMGroupInfo9;
                                inHouseIMConversationDao10 = inHouseIMConversationDao8;
                                baseDao8 = baseDao3;
                                str19 = str8;
                                longRef7 = longRef4;
                                objectRef10 = objectRef6;
                                i15 = i21;
                                str20 = str25;
                            }
                            this.label = 4;
                            i14 = i7;
                            inHouseIMGroupInfo14 = inHouseIMGroupInfo10;
                            c44261sJg7 = c44261sJg5;
                            inHouseIMGroupInfo15 = inHouseIMGroupInfo9;
                            inHouseIMConversationDao10 = inHouseIMConversationDao8;
                            str19 = str8;
                            longRef7 = longRef4;
                            i15 = i21;
                            objectRef10 = objectRef6;
                            baseDao8 = baseDao3;
                            str20 = str25;
                            try {
                            } catch (SQLiteDatabaseLockedException e19) {
                                e5 = e19;
                                sQLiteDatabaseLockedException5 = e5;
                                baseDao9 = baseDao8;
                                inHouseIMConversationDao9 = inHouseIMConversationDao10;
                                inHouseIMConversationEntity3 = inHouseIMConversationEntity6;
                                str16 = str19;
                                baseDao5 = baseDao9;
                                i11 = i14;
                                i10 = i11;
                                i9 = i15;
                                str14 = str7;
                                str13 = str18;
                                inHouseIMGroupInfo12 = inHouseIMGroupInfo15;
                                inHouseIMConversationDao5 = inHouseIMConversationDao9;
                                inHouseIMGroupInfo13 = inHouseIMGroupInfo14;
                                c44261sJg6 = c44261sJg7;
                                longRef2 = longRef7;
                                objectRef8 = objectRef10;
                                str15 = str20;
                                r02 = sQLiteDatabaseLockedException5;
                                C44159sFm.copydefault(r02, (Exception) objectRef8.element);
                                objectRef8.element = r02;
                                if (i11 >= i9 - 1) {
                                }
                                i7 = i18 + i20;
                                inHouseIMGroupInfo9 = inHouseIMGroupInfo12;
                                str6 = str15;
                                inHouseIMConversationDao8 = inHouseIMConversationDao14;
                                baseDao3 = baseDao11;
                                if (i7 >= i8) {
                                }
                            } catch (IllegalStateException e20) {
                                e4 = e20;
                                str23 = str7;
                                message2 = e4.getMessage();
                                if (message2 == null && StringsKt__StringsKt.contains$default((CharSequence) message2, (CharSequence) str23, false, 2, (Object) null)) {
                                    C44159sFm.OLrzqt(e4);
                                    throw e4;
                                }
                                C44159sFm.copydefault(e4);
                                throw e4;
                            } catch (Exception e21) {
                                e3 = e21;
                                C44159sFm.OLrzqt(e3);
                                throw e3;
                            } catch (Throwable th5) {
                                th = th5;
                                baseDao4 = baseDao8;
                                longRef4 = longRef7;
                                baseDao2 = baseDao4;
                                longRef2 = longRef4;
                                C44159sFm.EZpvd(baseDao2, longRef2.element);
                                throw th;
                            }
                            if (inHouseIMConversationDao8.updateEntityInfo(str8, groupName, groupName2, bizGroupName, groupAvatar, tags, relatedId, groupType, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            inHouseIMConversationEntity5 = inHouseIMConversationEntity6;
                            objectRef12 = objectRef17;
                            objectRef11 = objectRef12;
                            baseDao7 = baseDao8;
                            i13 = i14;
                            i10 = i13;
                            i12 = i15;
                            str23 = str7;
                            inHouseIMGroupInfo7 = inHouseIMGroupInfo14;
                            c44261sJg4 = c44261sJg7;
                            j2 = jNanoTime;
                            longRef6 = longRef7;
                            longRef5 = longRef6;
                            str22 = str20;
                            inHouseIMGroupInfo8 = inHouseIMGroupInfo15;
                            inHouseIMConversationDao7 = inHouseIMConversationDao10;
                            try {
                            } catch (SQLiteDatabaseLockedException e22) {
                                inHouseIMConversationEntity4 = inHouseIMConversationEntity5;
                                baseDao6 = baseDao7;
                                str21 = str18;
                                longRef2 = longRef5;
                                str17 = str19;
                                objectRef9 = objectRef10;
                                sQLiteDatabaseLockedException4 = e22;
                                inHouseIMConversationDao6 = inHouseIMConversationDao7;
                                str13 = str21;
                                str15 = str22;
                                str14 = str23;
                                baseDao5 = baseDao6;
                                str16 = str17;
                                inHouseIMConversationDao5 = inHouseIMConversationDao6;
                                inHouseIMGroupInfo12 = inHouseIMGroupInfo8;
                                c44261sJg6 = c44261sJg4;
                                inHouseIMConversationEntity3 = inHouseIMConversationEntity4;
                                i11 = i13;
                                objectRef8 = objectRef9;
                                i9 = i12;
                                inHouseIMGroupInfo13 = inHouseIMGroupInfo7;
                                r02 = sQLiteDatabaseLockedException4;
                                C44159sFm.copydefault(r02, (Exception) objectRef8.element);
                                objectRef8.element = r02;
                                if (i11 >= i9 - 1) {
                                }
                                i7 = i18 + i20;
                                inHouseIMGroupInfo9 = inHouseIMGroupInfo12;
                                str6 = str15;
                                inHouseIMConversationDao8 = inHouseIMConversationDao14;
                                baseDao3 = baseDao11;
                                if (i7 >= i8) {
                                }
                            } catch (IllegalStateException e23) {
                                e4 = e23;
                                baseDao2 = baseDao7;
                                longRef2 = longRef5;
                                message2 = e4.getMessage();
                                if (message2 == null) {
                                }
                                C44159sFm.copydefault(e4);
                                throw e4;
                            } catch (Exception e24) {
                                e3 = e24;
                                baseDao2 = baseDao7;
                                longRef2 = longRef5;
                                C44159sFm.OLrzqt(e3);
                                throw e3;
                            } catch (Throwable th6) {
                                th = th6;
                                baseDao2 = baseDao7;
                                longRef2 = longRef5;
                                C44159sFm.EZpvd(baseDao2, longRef2.element);
                                throw th;
                            }
                            objectRef12.element = Unit.INSTANCE;
                            longRef6.element = C59462zhW.valueOf(C59519zia.AEQbTJ(System.nanoTime() - j2, DurationUnit.NANOSECONDS));
                            Object obj52 = objectRef11.element;
                            C44159sFm.EZpvd(baseDao7, longRef5.element);
                            inHouseIMGroupInfo = inHouseIMGroupInfo8;
                            c44261sJg = c44261sJg4;
                            inHouseIMGroupInfo2 = inHouseIMGroupInfo7;
                            currentUser = inHouseIMGroupInfo.getCurrentUser();
                            if (currentUser != null && (userInfo = currentUser.getUserInfo()) != null) {
                                C44124sEe.imLogContact$default("getGroupInfoById => update user info", null, 2, null);
                                c44261sJg.OLrzqt(userInfo);
                                Unit unit = Unit.INSTANCE;
                                return inHouseIMGroupInfo2;
                            }
                        }
                        String str26 = str6;
                        int i22 = i8;
                        String str27 = str5;
                        C44159sFm.EZpvd(baseDao3, longRef4.element);
                        Exception exc = (Exception) objectRef6.element;
                        if (exc == null) {
                            exc = new Exception(str26 + i22 + str27);
                        }
                        C44159sFm.OLrzqt(exc);
                        throw exc;
                    }
                    int i23 = this.I$1;
                    int i24 = this.I$0;
                    objectRef2 = (Ref.ObjectRef) this.L$7;
                    Ref.LongRef longRef10 = (Ref.LongRef) this.L$6;
                    BaseDao baseDao12 = (BaseDao) this.L$5;
                    String str28 = (String) this.L$4;
                    InHouseIMConversationDao inHouseIMConversationDao15 = (InHouseIMConversationDao) this.L$3;
                    inHouseIMGroupInfo4 = (InHouseIMGroupInfo) this.L$2;
                    C44261sJg c44261sJg9 = (C44261sJg) this.L$1;
                    InHouseIMGroupInfo inHouseIMGroupInfo19 = (InHouseIMGroupInfo) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    inHouseIMGroupInfo6 = inHouseIMGroupInfo19;
                    ?? r153 = longRef10;
                    ?? r84 = baseDao12;
                    InHouseIMConversationDao inHouseIMConversationDao16 = inHouseIMConversationDao15;
                    int i25 = i24;
                    i2 = i23;
                    InHouseIMGroupInfo inHouseIMGroupInfo20 = inHouseIMGroupInfo6;
                    ?? r12 = r84;
                    InHouseIMConversationDao inHouseIMConversationDao17 = inHouseIMConversationDao16;
                    ?? r10 = r153;
                    c44261sJg2 = c44261sJg9;
                    objectRef = objectRef2;
                    groupId = str28;
                    i = i25;
                    i2++;
                    inHouseIMGroupInfo3 = inHouseIMGroupInfo20;
                    r1 = r12;
                    inHouseIMConversationDao = inHouseIMConversationDao17;
                    longRef3 = r10;
                    if (i2 >= i) {
                        try {
                            try {
                                try {
                                } catch (Exception e25) {
                                    e = e25;
                                    C44159sFm.OLrzqt(e);
                                    throw e;
                                } catch (Throwable th7) {
                                    th = th7;
                                    r15 = longRef3;
                                    C44159sFm.EZpvd(r1, r15.element);
                                    throw th;
                                }
                            } catch (IllegalStateException e26) {
                                e2 = e26;
                                str9 = str23;
                                obj3 = null;
                            }
                        } catch (SQLiteDatabaseLockedException e27) {
                            str10 = str21;
                            str11 = str22;
                            str12 = str23;
                            inHouseIMGroupInfo11 = inHouseIMGroupInfo4;
                            objectRef7 = objectRef;
                            sQLiteDatabaseLockedException2 = e27;
                        }
                        try {
                        } catch (SQLiteDatabaseLockedException e28) {
                            e = e28;
                            str10 = str21;
                            str11 = str22;
                        }
                        objectRef5 = new Ref.ObjectRef();
                        str10 = str21;
                        str11 = str22;
                        try {
                        } catch (SQLiteDatabaseLockedException e29) {
                            try {
                                e = e29;
                                str12 = str23;
                                inHouseIMGroupInfo11 = inHouseIMGroupInfo4;
                                sQLiteDatabaseLockedException3 = e;
                                objectRef7 = objectRef;
                                sQLiteDatabaseLockedException2 = sQLiteDatabaseLockedException3;
                                C44159sFm.copydefault(r0, (Exception) objectRef2.element);
                                objectRef2.element = r0;
                                if (i3 >= i - 1) {
                                    String str29 = str22;
                                    this.L$0 = inHouseIMGroupInfo6;
                                    this.L$1 = c44261sJg3;
                                    this.L$2 = inHouseIMGroupInfo5;
                                    this.L$3 = inHouseIMConversationDao2;
                                    this.L$4 = str3;
                                    this.L$5 = r83;
                                    this.L$6 = r15;
                                    this.L$7 = objectRef2;
                                    this.L$8 = null;
                                    this.L$9 = null;
                                    this.L$10 = null;
                                    this.I$0 = i;
                                    this.I$1 = i2;
                                    this.label = 3;
                                    if (DelayKt.delay(((long) (i3 + 1)) * 50, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    str22 = str29;
                                    i23 = i2;
                                    i24 = i;
                                    str28 = str3;
                                    str21 = str2;
                                    inHouseIMConversationDao16 = inHouseIMConversationDao2;
                                    str23 = str;
                                    InHouseIMGroupInfo inHouseIMGroupInfo21 = inHouseIMGroupInfo5;
                                    c44261sJg9 = c44261sJg3;
                                    inHouseIMGroupInfo4 = inHouseIMGroupInfo21;
                                    r84 = r83;
                                    r153 = r15;
                                    int i252 = i24;
                                    i2 = i23;
                                    InHouseIMGroupInfo inHouseIMGroupInfo202 = inHouseIMGroupInfo6;
                                    ?? r122 = r84;
                                    InHouseIMConversationDao inHouseIMConversationDao172 = inHouseIMConversationDao16;
                                    ?? r102 = r153;
                                    c44261sJg2 = c44261sJg9;
                                    objectRef = objectRef2;
                                    groupId = str28;
                                    i = i252;
                                    i2++;
                                    inHouseIMGroupInfo3 = inHouseIMGroupInfo202;
                                    r1 = r122;
                                    inHouseIMConversationDao = inHouseIMConversationDao172;
                                    longRef3 = r102;
                                    if (i2 >= i) {
                                    }
                                } else {
                                    inHouseIMGroupInfo202 = inHouseIMGroupInfo6;
                                    r122 = r83;
                                    str21 = str2;
                                    inHouseIMConversationDao172 = inHouseIMConversationDao2;
                                    str23 = str;
                                    InHouseIMGroupInfo inHouseIMGroupInfo22 = inHouseIMGroupInfo5;
                                    objectRef = objectRef2;
                                    groupId = str3;
                                    r102 = r15;
                                    c44261sJg2 = c44261sJg3;
                                    inHouseIMGroupInfo4 = inHouseIMGroupInfo22;
                                    i2++;
                                    inHouseIMGroupInfo3 = inHouseIMGroupInfo202;
                                    r1 = r122;
                                    inHouseIMConversationDao = inHouseIMConversationDao172;
                                    longRef3 = r102;
                                    if (i2 >= i) {
                                    }
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                r1 = r83;
                                C44159sFm.EZpvd(r1, r15.element);
                                throw th;
                            }
                            str = str12;
                            inHouseIMConversationDao2 = inHouseIMConversationDao;
                            c44261sJg3 = c44261sJg2;
                            str2 = str10;
                            inHouseIMGroupInfo5 = inHouseIMGroupInfo11;
                            r83 = r1;
                            inHouseIMGroupInfo6 = inHouseIMGroupInfo3;
                            r15 = longRef3;
                            i3 = i2;
                            str3 = groupId;
                            objectRef2 = objectRef7;
                            str22 = str11;
                            r0 = sQLiteDatabaseLockedException2;
                        }
                        long jNanoTime2 = System.nanoTime();
                        this.L$0 = inHouseIMGroupInfo3;
                        this.L$1 = c44261sJg2;
                        this.L$2 = inHouseIMGroupInfo4;
                        this.L$3 = inHouseIMConversationDao;
                        this.L$4 = groupId;
                        this.L$5 = r1;
                        this.L$6 = longRef3;
                        this.L$7 = objectRef;
                        this.L$8 = objectRef5;
                        this.L$9 = longRef3;
                        this.L$10 = objectRef5;
                        this.I$0 = i;
                        this.I$1 = i2;
                        this.I$2 = i2;
                        this.J$0 = jNanoTime2;
                        inHouseIMGroupInfo11 = inHouseIMGroupInfo4;
                        try {
                        } catch (SQLiteDatabaseLockedException e30) {
                            str12 = str23;
                            sQLiteDatabaseLockedException3 = e30;
                            objectRef7 = objectRef;
                            sQLiteDatabaseLockedException2 = sQLiteDatabaseLockedException3;
                            str = str12;
                            inHouseIMConversationDao2 = inHouseIMConversationDao;
                            c44261sJg3 = c44261sJg2;
                            str2 = str10;
                            inHouseIMGroupInfo5 = inHouseIMGroupInfo11;
                            r83 = r1;
                            inHouseIMGroupInfo6 = inHouseIMGroupInfo3;
                            r15 = longRef3;
                            i3 = i2;
                            str3 = groupId;
                            objectRef2 = objectRef7;
                            str22 = str11;
                            r0 = sQLiteDatabaseLockedException2;
                            C44159sFm.copydefault(r0, (Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i3 >= i - 1) {
                            }
                        }
                        this.label = 2;
                        try {
                            Object conversationEntity = inHouseIMConversationDao.getConversationEntity(groupId, this);
                            if (conversationEntity == objCopydefault) {
                                return objCopydefault;
                            }
                            inHouseIMGroupInfo7 = inHouseIMGroupInfo3;
                            ?? r72 = longRef3;
                            c44261sJg4 = c44261sJg2;
                            inHouseIMGroupInfo8 = inHouseIMGroupInfo11;
                            objectRef4 = objectRef5;
                            inHouseIMConversationDao4 = inHouseIMConversationDao;
                            r82 = r1;
                            i6 = i2;
                            i4 = i;
                            i5 = i6;
                            str4 = groupId;
                            j = jNanoTime2;
                            str21 = str10;
                            str22 = str11;
                            objectRef3 = objectRef;
                            r14 = r72;
                            r7 = r72;
                            r13 = conversationEntity;
                            try {
                            } catch (SQLiteDatabaseLockedException e31) {
                                str2 = str21;
                                str = str23;
                                r152 = r7;
                                i2 = i5;
                                i = i4;
                                objectRef2 = objectRef3;
                                str3 = str4;
                                inHouseIMConversationDao3 = inHouseIMConversationDao4;
                                inHouseIMGroupInfo5 = inHouseIMGroupInfo8;
                                c44261sJg3 = c44261sJg4;
                                i3 = i6;
                                sQLiteDatabaseLockedException = e31;
                                r8 = r82;
                                inHouseIMGroupInfo6 = inHouseIMGroupInfo7;
                                r0 = sQLiteDatabaseLockedException;
                                inHouseIMConversationDao2 = inHouseIMConversationDao3;
                                r83 = r8;
                                r15 = r152;
                                C44159sFm.copydefault(r0, (Exception) objectRef2.element);
                                objectRef2.element = r0;
                                if (i3 >= i - 1) {
                                }
                            } catch (IllegalStateException e32) {
                                e2 = e32;
                                str23 = str23;
                                obj3 = null;
                                message = e2.getMessage();
                                if (message == null) {
                                }
                                C44159sFm.copydefault(e2);
                                throw e2;
                            } catch (Exception e33) {
                                e = e33;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            }
                            objectRef5.element = r13;
                            r14.element = C59462zhW.valueOf(C59519zia.AEQbTJ(System.nanoTime() - j, DurationUnit.NANOSECONDS));
                            Object obj42 = objectRef4.element;
                            C44159sFm.EZpvd(r82, r7.element);
                            inHouseIMConversationEntity = (InHouseIMConversationEntity) obj42;
                            if (inHouseIMConversationEntity != null) {
                                inHouseIMConversationEntity2 = inHouseIMConversationEntity;
                                longRef4 = new Ref.LongRef();
                                str5 = str21;
                                str6 = str22;
                                str7 = str23;
                                objectRef6 = new Ref.ObjectRef();
                                str8 = str4;
                                InHouseIMConversationDao inHouseIMConversationDao18 = inHouseIMConversationDao4;
                                baseDao3 = inHouseIMConversationDao18;
                                inHouseIMGroupInfo9 = inHouseIMGroupInfo8;
                                c44261sJg5 = c44261sJg4;
                                inHouseIMGroupInfo10 = inHouseIMGroupInfo7;
                                i7 = 0;
                                i8 = 3;
                                inHouseIMConversationDao8 = inHouseIMConversationDao18;
                                if (i7 >= i8) {
                                }
                            }
                            inHouseIMGroupInfo = inHouseIMGroupInfo8;
                            c44261sJg = c44261sJg4;
                            inHouseIMGroupInfo2 = inHouseIMGroupInfo7;
                            currentUser = inHouseIMGroupInfo.getCurrentUser();
                            if (currentUser != null) {
                            }
                        } catch (IllegalStateException e34) {
                            e2 = e34;
                            str9 = str23;
                            obj3 = null;
                            str23 = str9;
                            message = e2.getMessage();
                            if (message == null && StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) str23, false, 2, obj3)) {
                                C44159sFm.OLrzqt(e2);
                                throw e2;
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        }
                    } else {
                        String str30 = str21;
                        String str31 = str22;
                        C44159sFm.EZpvd(r1, longRef3.element);
                        Exception exc2 = (Exception) objectRef.element;
                        if (exc2 == null) {
                            exc2 = new Exception(str31 + i + str30);
                        }
                        C44159sFm.OLrzqt(exc2);
                        throw exc2;
                    }
                }
                inHouseIMGroupInfo = (InHouseIMGroupInfo) ((ResponseData) groupInfoById).getData();
                if (inHouseIMGroupInfo == null) {
                    obj2 = null;
                    return obj2;
                }
                c44261sJg = this.this$0;
                InHouseIMConversationDao inHouseIMConversationDaoKWHzl = c44261sJg.KWHzl.copydefault().KWHzl();
                groupId = inHouseIMGroupInfo.getGroupId();
                if (groupId == null || StringsKt__StringsKt.fARcdN((CharSequence) groupId)) {
                    inHouseIMGroupInfo2 = inHouseIMGroupInfo;
                    currentUser = inHouseIMGroupInfo.getCurrentUser();
                    if (currentUser != null) {
                    }
                } else {
                    inHouseIMGroupInfo3 = inHouseIMGroupInfo;
                    inHouseIMGroupInfo4 = inHouseIMGroupInfo3;
                    c44261sJg2 = c44261sJg;
                    InHouseIMConversationDao inHouseIMConversationDao19 = inHouseIMConversationDaoKWHzl;
                    longRef3 = new Ref.LongRef();
                    objectRef = new Ref.ObjectRef();
                    i = 3;
                    inHouseIMConversationDao = inHouseIMConversationDao19;
                    i2 = 0;
                    r1 = inHouseIMConversationDao19;
                    if (i2 >= i) {
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                longRef2 = longRef;
                baseDao2 = baseDao;
            }
        } catch (Throwable th10) {
            th = th10;
            r15 = 1;
        }
    }
}
