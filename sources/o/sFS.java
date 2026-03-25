package o;

import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.feature.cache.groupMember.GroupMemberCacheImpl$getMember$1;
import com.okinc.okimcore.feature.cache.groupMember.GroupMemberCacheImpl$reloadIfNoCache$1;
import com.okinc.okimcore.feature.cache.groupMember.GroupMemberCacheImpl$updateUserNames$1$2$1;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupMemberDao;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupMemberEntity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class sFS extends sFJ<GroupMemberInfo> implements sFW {
    public final CoroutineDispatcher AEQbTJ;
    public final sIC OLrzqt;

    @Override // o.sFJ
    public int AEQbTJ() {
        return 3000;
    }

    @yCM
    public sFS(@NotNull sIC sic, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sic, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = sic;
        this.AEQbTJ = coroutineDispatcher;
    }

    public final sIB OLrzqt() {
        return this.OLrzqt.copydefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InHouseIMGroupMemberDao copydefault() {
        return OLrzqt().AYXKKw();
    }

    /* JADX DEBUG: Duplicate block (B:52:0x0133) to fix multi-entry loop: BACK_EDGE: B:52:0x0133 -> B:53:0x0134 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: T */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0134, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    @Override // o.sFJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super GroupMemberInfo> continuation) throws java.lang.Exception {
        GroupMemberCacheImpl$reloadIfNoCache$1 groupMemberCacheImpl$reloadIfNoCache$1;
        sFS sfs;
        java.lang.String str2;
        sFS sfs2;
        java.lang.String str3;
        int i;
        BaseDao baseDaoCopydefault;
        int i2;
        Ref.LongRef longRef;
        Ref.ObjectRef objectRef;
        ?? r0;
        if (continuation instanceof GroupMemberCacheImpl$reloadIfNoCache$1) {
            groupMemberCacheImpl$reloadIfNoCache$1 = (GroupMemberCacheImpl$reloadIfNoCache$1) continuation;
            int i3 = groupMemberCacheImpl$reloadIfNoCache$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                groupMemberCacheImpl$reloadIfNoCache$1.label = i3 - Integer.MIN_VALUE;
                sfs = this;
            } else {
                sfs = this;
                groupMemberCacheImpl$reloadIfNoCache$1 = new GroupMemberCacheImpl$reloadIfNoCache$1(sfs, continuation);
            }
        }
        java.lang.Object objEZpvd = groupMemberCacheImpl$reloadIfNoCache$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = groupMemberCacheImpl$reloadIfNoCache$1.label;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    C56391yDq.AEQbTJ(objEZpvd);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = groupMemberCacheImpl$reloadIfNoCache$1.I$1;
            i2 = groupMemberCacheImpl$reloadIfNoCache$1.I$0;
            objectRef = (Ref.ObjectRef) groupMemberCacheImpl$reloadIfNoCache$1.L$5;
            longRef = (Ref.LongRef) groupMemberCacheImpl$reloadIfNoCache$1.L$4;
            baseDaoCopydefault = (BaseDao) groupMemberCacheImpl$reloadIfNoCache$1.L$3;
            str2 = (java.lang.String) groupMemberCacheImpl$reloadIfNoCache$1.L$2;
            str3 = (java.lang.String) groupMemberCacheImpl$reloadIfNoCache$1.L$1;
            sfs2 = (sFS) groupMemberCacheImpl$reloadIfNoCache$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
                int i5 = 1;
                i += i5;
                if (i < i2) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e) {
                            java.lang.String message = e.getMessage();
                            if (message != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                C44159sFm.OLrzqt(e);
                                throw e;
                            }
                            C44159sFm.copydefault(e);
                            throw e;
                        } catch (java.lang.Exception e2) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        r0 = e3;
                    }
                    long jNanoTime = java.lang.System.nanoTime();
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e4) {
                        r0 = e4;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                        objectRef.element = r0;
                        if (i < i2 - 1) {
                            groupMemberCacheImpl$reloadIfNoCache$1.L$0 = sfs2;
                            groupMemberCacheImpl$reloadIfNoCache$1.L$1 = str3;
                            groupMemberCacheImpl$reloadIfNoCache$1.L$2 = str2;
                            groupMemberCacheImpl$reloadIfNoCache$1.L$3 = baseDaoCopydefault;
                            groupMemberCacheImpl$reloadIfNoCache$1.L$4 = longRef;
                            groupMemberCacheImpl$reloadIfNoCache$1.L$5 = objectRef;
                            groupMemberCacheImpl$reloadIfNoCache$1.I$0 = i2;
                            groupMemberCacheImpl$reloadIfNoCache$1.I$1 = i;
                            groupMemberCacheImpl$reloadIfNoCache$1.label = 1;
                            if (DelayKt.delay(((long) (i + 1)) * 50, groupMemberCacheImpl$reloadIfNoCache$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            i5 = 1;
                        }
                        i += i5;
                        if (i < i2) {
                        }
                    }
                    InHouseIMGroupMemberEntity memberInfoById = sfs2.copydefault().getMemberInfoById(str3, str2);
                    long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    longRef.element = jValueOf;
                    C44159sFm.EZpvd(baseDaoCopydefault, jValueOf);
                    sJM sjm = sJM.AEQbTJ;
                    groupMemberCacheImpl$reloadIfNoCache$1.L$0 = null;
                    groupMemberCacheImpl$reloadIfNoCache$1.L$1 = null;
                    groupMemberCacheImpl$reloadIfNoCache$1.L$2 = null;
                    groupMemberCacheImpl$reloadIfNoCache$1.L$3 = null;
                    groupMemberCacheImpl$reloadIfNoCache$1.L$4 = null;
                    groupMemberCacheImpl$reloadIfNoCache$1.L$5 = null;
                    groupMemberCacheImpl$reloadIfNoCache$1.label = 2;
                    objEZpvd = sjm.EZpvd(memberInfoById, groupMemberCacheImpl$reloadIfNoCache$1);
                    return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
                }
                C44159sFm.EZpvd(baseDaoCopydefault, longRef.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i2 + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            } catch (java.lang.Throwable th) {
                C44159sFm.EZpvd(baseDaoCopydefault, longRef.element);
                throw th;
            }
        }
        C56391yDq.AEQbTJ(objEZpvd);
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"@"}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() != 2) {
            return null;
        }
        java.lang.String str4 = (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(listSplit$default);
        str2 = (java.lang.String) listSplit$default.get(1);
        sfs2 = sfs;
        str3 = str4;
        i = 0;
        baseDaoCopydefault = copydefault();
        i2 = 3;
        longRef = new Ref.LongRef();
        objectRef = new Ref.ObjectRef();
        if (i < i2) {
        }
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return str + "@" + str2;
    }

    @Override // o.sFW
    public GroupMemberInfo OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return (GroupMemberInfo) BuildersKt.runBlocking(this.AEQbTJ, new GroupMemberCacheImpl$getMember$1(this, str, str2, null));
    }

    @Override // o.sFW
    public void OLrzqt(GroupMemberInfo groupMemberInfo) {
        if (groupMemberInfo != null) {
            EZpvd(AEQbTJ(groupMemberInfo.getGroupId(), groupMemberInfo.getMemberId()), groupMemberInfo);
        }
    }

    @Override // o.sFW
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        n_(AEQbTJ(str, str2));
    }

    @Override // o.sFW
    public void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C33515mxs.AEQbTJ.KWHzl(new Function0() { // from class: o.sFT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return sFS.copydefault(this.AEQbTJ, str, str2, str3);
            }
        });
    }

    public static final Unit copydefault(sFS sfs, java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.Exception {
        InHouseIMGroupMemberEntity inHouseIMGroupMemberEntityCopy;
        InHouseIMGroupMemberDao inHouseIMGroupMemberDaoCopydefault = sfs.copydefault();
        Ref.LongRef longRef = new Ref.LongRef();
        java.lang.Exception exc = null;
        int i = 0;
        while (i < 3) {
            try {
                try {
                    try {
                        long jNanoTime = java.lang.System.nanoTime();
                        try {
                            InHouseIMGroupMemberEntity memberInfoById = sfs.copydefault().getMemberInfoById(str, str2);
                            if (memberInfoById != null) {
                                inHouseIMGroupMemberEntityCopy = memberInfoById.copy((65503 & 1) != 0 ? memberInfoById.memberId : null, (65503 & 2) != 0 ? memberInfoById.groupId : null, (65503 & 4) != 0 ? memberInfoById.inviteId : null, (65503 & 8) != 0 ? memberInfoById.role : 0, (65503 & 16) != 0 ? memberInfoById.name : null, (65503 & 32) != 0 ? memberInfoById.nickName : str3, (65503 & 64) != 0 ? memberInfoById.avatar : null, (65503 & 128) != 0 ? memberInfoById.status : 0, (65503 & 256) != 0 ? memberInfoById.createTime : 0L, (65503 & 512) != 0 ? memberInfoById.updateTime : 0L, (65503 & 1024) != 0 ? memberInfoById._v1Field : null, (65503 & 2048) != 0 ? memberInfoById.v2Field : null, (65503 & 4096) != 0 ? memberInfoById._v3Field : null, (65503 & 8192) != 0 ? memberInfoById.officialTagInfo : null, (65503 & 16384) != 0 ? memberInfoById.enNickname : null, (65503 & 32768) != 0 ? memberInfoById.paidGroupMemberStatus : null);
                            } else {
                                inHouseIMGroupMemberEntityCopy = null;
                            }
                            long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                            longRef.element = jValueOf;
                            C44159sFm.EZpvd(inHouseIMGroupMemberDaoCopydefault, jValueOf);
                            if (inHouseIMGroupMemberEntityCopy != null) {
                                BuildersKt__BuildersKt.runBlocking$default(null, new GroupMemberCacheImpl$updateUserNames$1$2$1(sfs, inHouseIMGroupMemberEntityCopy, null), 1, null);
                            }
                            return Unit.INSTANCE;
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
                            e = e;
                            try {
                                C44159sFm.copydefault(e, exc);
                                i++;
                                exc = e;
                            } finally {
                                C44159sFm.EZpvd(inHouseIMGroupMemberDaoCopydefault, longRef.element);
                            }
                        }
                    } catch (java.lang.Exception e2) {
                        C44159sFm.OLrzqt(e2);
                        throw e2;
                    }
                } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                    e = e3;
                }
            } catch (java.lang.IllegalStateException e4) {
                java.lang.String message = e4.getMessage();
                if (message != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                    C44159sFm.OLrzqt(e4);
                    throw e4;
                }
                C44159sFm.copydefault(e4);
                throw e4;
            }
        }
        if (exc == null) {
            exc = new java.lang.Exception("Database Operation failed after 3 attempts");
        }
        C44159sFm.OLrzqt(exc);
        throw exc;
    }
}
