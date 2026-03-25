package o;

import com.okinc.network.okg.cache.CacheStrategy;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$addContact$1;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$blockContact$1;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$getBlockedContactList$1;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$getContactById$1;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$getContactInfoFromRemote$1;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$getLocalRelationList$1;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$getMyQRCode$1;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$getQueryQRCodeResult$1;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$getQueryQRCodeResultV2$1;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$getReferralData$1;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$getRelationInfo$1;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$getRelationList$1;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$getRelationListFromLocalByUids$2;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$getRelationsWithRemarkNames$1;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$getSuggestedList$1;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$getSyncedFriendFromLocalByUids$1;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$initContact$1;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$removeContact$1;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$saveContactToDb$1;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$searchContact$1;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$searchContactById$1;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$setContactRemark$1;
import com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$updateConversationEntityInfo$1;
import com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao;
import com.okinc.okimcore.feature.contact.repository.remote.inhouseim.InHouseIMRelationService;
import com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao;
import com.okinc.okimcore.model.im.inhouseim.ContactRelationType;
import com.okinc.okimcore.model.im.inhouseim.UserTagType;
import com.okinc.okimcore.model.remote.AddContactReq;
import com.okinc.okimcore.model.remote.BlockContactReq;
import com.okinc.okimcore.model.remote.InhouseIMQueryMyQRCodeResponse;
import com.okinc.okimcore.model.remote.InhouseIMQueryQRCodeScanResponse;
import com.okinc.okimcore.model.remote.InitContactReq;
import com.okinc.okimcore.model.remote.ReferralTasks;
import com.okinc.okimcore.model.remote.RelationListRequest;
import com.okinc.okimcore.model.remote.RemoveContactReq;
import com.okinc.okimcore.model.remote.ScanQRCodeRequestBody;
import com.okinc.okimcore.model.remote.SearchContactReq;
import com.okinc.okimcore.model.remote.SearchContactReqV2;
import com.okinc.okimcore.model.remote.SetContactRemarkReq;
import com.okinc.okimcore.model.room.inhouseim.ContactWithPhoneData;
import com.okinc.okimcore.model.room.inhouseim.EntityInfo;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.JsonElement;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sGc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44176sGc implements InterfaceC44178sGe {
    public static final Application Companion = new Application(null);
    public final InHouseIMRelationService AEQbTJ;
    public final sIC KWHzl;
    public final C44485sRo OLrzqt;
    public final sKN copydefault;

    public C44176sGc(@NotNull sIC sic, @NotNull InHouseIMRelationService inHouseIMRelationService, @NotNull sKN skn) {
        Intrinsics.checkNotNullParameter(sic, "");
        Intrinsics.checkNotNullParameter(inHouseIMRelationService, "");
        Intrinsics.checkNotNullParameter(skn, "");
        this.KWHzl = sic;
        this.AEQbTJ = inHouseIMRelationService;
        this.copydefault = skn;
        this.OLrzqt = new C44485sRo(sic);
    }

    /* JADX INFO: renamed from: o.sGc$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sGc.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final InHouseIMContactDao KWHzl() {
        return this.KWHzl.copydefault().OLrzqt();
    }

    public final InHouseIMConversationDao AEQbTJ() {
        return this.KWHzl.copydefault().KWHzl();
    }

    /* JADX DEBUG: Duplicate block (B:76:0x01a4) to fix multi-entry loop: BACK_EDGE: B:76:0x01a4 -> B:77:0x01ae */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01b5: MOVE (r6 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:78:0x01b5 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01b6: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:78:0x01b5 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147 A[Catch: all -> 0x0054, TryCatch #4 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0139, B:55:0x013c, B:59:0x0141, B:61:0x0147, B:63:0x0153, B:64:0x0156, B:65:0x0157, B:66:0x015a, B:70:0x0170, B:72:0x017d), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017d A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #4 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0139, B:55:0x013c, B:59:0x0141, B:61:0x0147, B:63:0x0153, B:64:0x0156, B:65:0x0157, B:66:0x015a, B:70:0x0170, B:72:0x017d), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(InHouseIMContactInfoEntity inHouseIMContactInfoEntity, Continuation<? super Unit> continuation) throws java.lang.Exception {
        InHouseIMContactManagerImpl$saveContactToDb$1 inHouseIMContactManagerImpl$saveContactToDb$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDaoKWHzl;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        C44176sGc c44176sGc;
        InHouseIMContactManagerImpl$saveContactToDb$1 inHouseIMContactManagerImpl$saveContactToDb$12;
        InHouseIMContactInfoEntity inHouseIMContactInfoEntity2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        int i3;
        InHouseIMContactInfoEntity inHouseIMContactInfoEntity3;
        Ref.ObjectRef objectRef2;
        int i4;
        C44176sGc c44176sGc2;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        C44176sGc c44176sGc3;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef4;
        int i5;
        BaseDao baseDao2;
        int i6;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException2;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        long jNanoTime;
        InHouseIMContactInfoEntity inHouseIMContactInfoEntity4;
        if (continuation instanceof InHouseIMContactManagerImpl$saveContactToDb$1) {
            inHouseIMContactManagerImpl$saveContactToDb$1 = (InHouseIMContactManagerImpl$saveContactToDb$1) continuation;
            int i7 = inHouseIMContactManagerImpl$saveContactToDb$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                inHouseIMContactManagerImpl$saveContactToDb$1.label = i7 - Integer.MIN_VALUE;
            } else {
                inHouseIMContactManagerImpl$saveContactToDb$1 = new InHouseIMContactManagerImpl$saveContactToDb$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMContactManagerImpl$saveContactToDb$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = inHouseIMContactManagerImpl$saveContactToDb$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = inHouseIMContactManagerImpl$saveContactToDb$1.J$0;
                    i4 = inHouseIMContactManagerImpl$saveContactToDb$1.I$2;
                    i3 = inHouseIMContactManagerImpl$saveContactToDb$1.I$1;
                    i = inHouseIMContactManagerImpl$saveContactToDb$1.I$0;
                    objectRef5 = (Ref.ObjectRef) inHouseIMContactManagerImpl$saveContactToDb$1.L$7;
                    longRef3 = (Ref.LongRef) inHouseIMContactManagerImpl$saveContactToDb$1.L$6;
                    objectRef4 = (Ref.ObjectRef) inHouseIMContactManagerImpl$saveContactToDb$1.L$5;
                    objectRef2 = (Ref.ObjectRef) inHouseIMContactManagerImpl$saveContactToDb$1.L$4;
                    longRef2 = (Ref.LongRef) inHouseIMContactManagerImpl$saveContactToDb$1.L$3;
                    baseDaoKWHzl = (BaseDao) inHouseIMContactManagerImpl$saveContactToDb$1.L$2;
                    inHouseIMContactInfoEntity4 = (InHouseIMContactInfoEntity) inHouseIMContactManagerImpl$saveContactToDb$1.L$1;
                    c44176sGc2 = (C44176sGc) inHouseIMContactManagerImpl$saveContactToDb$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef4 = longRef2;
                        i5 = i3;
                        baseDao2 = baseDaoKWHzl;
                        i6 = i;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        inHouseIMContactInfoEntity3 = inHouseIMContactInfoEntity4;
                        sQLiteDatabaseLockedException2 = e3;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        c44176sGc3 = c44176sGc2;
                        objectRef3 = objectRef2;
                        int i9 = i3;
                        longRef4 = longRef2;
                        i5 = i9;
                        int i10 = i;
                        baseDao2 = baseDaoKWHzl;
                        i6 = i10;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMContactManagerImpl$saveContactToDb$12 = inHouseIMContactManagerImpl$saveContactToDb$1;
                        i2 = i + i;
                        c44176sGc = c44176sGc3;
                        longRef3 = longRef4;
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
                        C44159sFm.EZpvd(baseDaoKWHzl, longRef2.element);
                        throw th;
                    }
                    ?? r02 = Unit.INSTANCE;
                    objectRef5.element = r02;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return r02;
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = inHouseIMContactManagerImpl$saveContactToDb$1.I$1;
                int i12 = inHouseIMContactManagerImpl$saveContactToDb$1.I$0;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) inHouseIMContactManagerImpl$saveContactToDb$1.L$4;
                longRef4 = (Ref.LongRef) inHouseIMContactManagerImpl$saveContactToDb$1.L$3;
                BaseDao baseDao3 = (BaseDao) inHouseIMContactManagerImpl$saveContactToDb$1.L$2;
                InHouseIMContactInfoEntity inHouseIMContactInfoEntity5 = (InHouseIMContactInfoEntity) inHouseIMContactManagerImpl$saveContactToDb$1.L$1;
                c44176sGc3 = (C44176sGc) inHouseIMContactManagerImpl$saveContactToDb$1.L$0;
                C56391yDq.AEQbTJ(obj);
                InHouseIMContactManagerImpl$saveContactToDb$1 inHouseIMContactManagerImpl$saveContactToDb$13 = inHouseIMContactManagerImpl$saveContactToDb$1;
                int i13 = 1;
                baseDaoKWHzl = baseDao3;
                inHouseIMContactInfoEntity2 = inHouseIMContactInfoEntity5;
                i = i12;
                objectRef = objectRef6;
                inHouseIMContactManagerImpl$saveContactToDb$12 = inHouseIMContactManagerImpl$saveContactToDb$13;
                i2 = i11 + i13;
                c44176sGc = c44176sGc3;
                longRef3 = longRef4;
                if (i2 >= i) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            longRef2 = longRef3;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e7) {
                            e = e7;
                            longRef2 = longRef3;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDaoKWHzl, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        inHouseIMContactInfoEntity3 = inHouseIMContactInfoEntity2;
                        inHouseIMContactManagerImpl$saveContactToDb$1 = inHouseIMContactManagerImpl$saveContactToDb$12;
                        c44176sGc2 = c44176sGc;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                        c44176sGc3 = c44176sGc2;
                        objectRef3 = objectRef2;
                        int i92 = i3;
                        longRef4 = longRef2;
                        i5 = i92;
                        int i102 = i;
                        baseDao2 = baseDaoKWHzl;
                        i6 = i102;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                            inHouseIMContactManagerImpl$saveContactToDb$1.L$0 = c44176sGc3;
                            inHouseIMContactManagerImpl$saveContactToDb$1.L$1 = inHouseIMContactInfoEntity3;
                            inHouseIMContactManagerImpl$saveContactToDb$1.L$2 = baseDao2;
                            inHouseIMContactManagerImpl$saveContactToDb$1.L$3 = longRef4;
                            inHouseIMContactManagerImpl$saveContactToDb$1.L$4 = objectRef3;
                            inHouseIMContactManagerImpl$saveContactToDb$1.L$5 = null;
                            inHouseIMContactManagerImpl$saveContactToDb$1.L$6 = null;
                            inHouseIMContactManagerImpl$saveContactToDb$1.L$7 = null;
                            inHouseIMContactManagerImpl$saveContactToDb$1.I$0 = i6;
                            inHouseIMContactManagerImpl$saveContactToDb$1.I$1 = i5;
                            inHouseIMContactManagerImpl$saveContactToDb$1.label = 2;
                            if (DelayKt.delay(((long) (i4 + 1)) * 50, inHouseIMContactManagerImpl$saveContactToDb$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            inHouseIMContactManagerImpl$saveContactToDb$13 = inHouseIMContactManagerImpl$saveContactToDb$1;
                            i11 = i5;
                            inHouseIMContactInfoEntity2 = inHouseIMContactInfoEntity3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao4 = baseDao2;
                            i = i6;
                            baseDaoKWHzl = baseDao4;
                        } else {
                            inHouseIMContactManagerImpl$saveContactToDb$13 = inHouseIMContactManagerImpl$saveContactToDb$1;
                            i11 = i5;
                            inHouseIMContactInfoEntity2 = inHouseIMContactInfoEntity3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao5 = baseDao2;
                            i = i6;
                            baseDaoKWHzl = baseDao5;
                        }
                        inHouseIMContactManagerImpl$saveContactToDb$12 = inHouseIMContactManagerImpl$saveContactToDb$13;
                        i2 = i11 + i13;
                        c44176sGc = c44176sGc3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        inHouseIMContactInfoEntity3 = inHouseIMContactInfoEntity2;
                        inHouseIMContactManagerImpl$saveContactToDb$1 = inHouseIMContactManagerImpl$saveContactToDb$12;
                        c44176sGc2 = c44176sGc;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException2 = e9;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        c44176sGc3 = c44176sGc2;
                        objectRef3 = objectRef2;
                        int i922 = i3;
                        longRef4 = longRef2;
                        i5 = i922;
                        int i1022 = i;
                        baseDao2 = baseDaoKWHzl;
                        i6 = i1022;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMContactManagerImpl$saveContactToDb$12 = inHouseIMContactManagerImpl$saveContactToDb$13;
                        i2 = i11 + i13;
                        c44176sGc = c44176sGc3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    objectRef5 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMContactDao inHouseIMContactDaoKWHzl = c44176sGc.KWHzl();
                    inHouseIMContactManagerImpl$saveContactToDb$12.L$0 = c44176sGc;
                    inHouseIMContactManagerImpl$saveContactToDb$12.L$1 = inHouseIMContactInfoEntity2;
                    inHouseIMContactManagerImpl$saveContactToDb$12.L$2 = baseDaoKWHzl;
                    inHouseIMContactManagerImpl$saveContactToDb$12.L$3 = longRef3;
                    inHouseIMContactManagerImpl$saveContactToDb$12.L$4 = objectRef;
                    inHouseIMContactManagerImpl$saveContactToDb$12.L$5 = objectRef5;
                    inHouseIMContactManagerImpl$saveContactToDb$12.L$6 = longRef3;
                    inHouseIMContactManagerImpl$saveContactToDb$12.L$7 = objectRef5;
                    inHouseIMContactManagerImpl$saveContactToDb$12.I$0 = i;
                    inHouseIMContactManagerImpl$saveContactToDb$12.I$1 = i2;
                    inHouseIMContactManagerImpl$saveContactToDb$12.I$2 = i2;
                    inHouseIMContactManagerImpl$saveContactToDb$12.J$0 = jNanoTime;
                    inHouseIMContactManagerImpl$saveContactToDb$12.label = 1;
                    if (inHouseIMContactDaoKWHzl.insertOrReplaceContact(inHouseIMContactInfoEntity2, inHouseIMContactManagerImpl$saveContactToDb$12) == objCopydefault) {
                        return objCopydefault;
                    }
                    inHouseIMContactInfoEntity4 = inHouseIMContactInfoEntity2;
                    inHouseIMContactManagerImpl$saveContactToDb$1 = inHouseIMContactManagerImpl$saveContactToDb$12;
                    c44176sGc2 = c44176sGc;
                    i4 = i2;
                    objectRef4 = objectRef5;
                    longRef4 = longRef3;
                    objectRef2 = objectRef;
                    i5 = i4;
                    int i14 = i;
                    baseDao2 = baseDaoKWHzl;
                    i6 = i14;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        c44176sGc3 = c44176sGc2;
                        objectRef3 = objectRef2;
                        inHouseIMContactInfoEntity3 = inHouseIMContactInfoEntity4;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMContactManagerImpl$saveContactToDb$12 = inHouseIMContactManagerImpl$saveContactToDb$13;
                        i2 = i11 + i13;
                        c44176sGc = c44176sGc3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
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
                    ?? r022 = Unit.INSTANCE;
                    objectRef5.element = r022;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return r022;
                }
                C44159sFm.EZpvd(baseDaoKWHzl, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            baseDaoKWHzl = KWHzl();
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            c44176sGc = this;
            inHouseIMContactManagerImpl$saveContactToDb$12 = inHouseIMContactManagerImpl$saveContactToDb$1;
            inHouseIMContactInfoEntity2 = inHouseIMContactInfoEntity;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDaoKWHzl = baseDao;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v33, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v52, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v53, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01cc: MOVE (r6 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:79:0x01cc */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x01cd: MOVE (r9 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:79:0x01cc */
    /* JADX WARN: Removed duplicated region for block: B:102:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0137 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018b A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #3 {all -> 0x0062, blocks: (B:18:0x005b, B:69:0x017e, B:71:0x018b, B:53:0x0152, B:54:0x0155, B:57:0x0159, B:59:0x015f, B:61:0x016b, B:62:0x016e, B:63:0x016f, B:64:0x0172), top: B:107:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0223 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01b3 -> B:75:0x01b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01be -> B:76:0x01bc). Please report as a decompilation issue!!! */
    @Override // o.InterfaceC44178sGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, boolean z, java.lang.String str2, @NotNull Continuation<? super ContactWithPhoneData> continuation) throws java.lang.Exception {
        InHouseIMContactManagerImpl$getContactById$1 inHouseIMContactManagerImpl$getContactById$1;
        java.lang.Object obj;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDaoKWHzl;
        java.lang.Object objM7377constructorimpl;
        C44176sGc c44176sGc;
        java.lang.String str3;
        java.lang.String str4;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        InHouseIMContactManagerImpl$getContactById$1 inHouseIMContactManagerImpl$getContactById$12;
        java.lang.String str5;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        java.lang.String str6;
        java.lang.String str7;
        BaseDao baseDao2;
        Ref.LongRef longRef4;
        Ref.ObjectRef objectRef2;
        int i3;
        C44176sGc c44176sGc2;
        int i4;
        ?? r0;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        java.lang.Object objEZpvd;
        java.lang.String str8;
        Ref.LongRef longRef5;
        Ref.ObjectRef objectRef3;
        long jNanoTime;
        int i5;
        Ref.ObjectRef objectRef4;
        T t;
        ContactWithPhoneData contactWithPhoneData;
        java.lang.Object obj2;
        if (continuation instanceof InHouseIMContactManagerImpl$getContactById$1) {
            inHouseIMContactManagerImpl$getContactById$1 = (InHouseIMContactManagerImpl$getContactById$1) continuation;
            int i6 = inHouseIMContactManagerImpl$getContactById$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                inHouseIMContactManagerImpl$getContactById$1.label = i6 - Integer.MIN_VALUE;
            } else {
                inHouseIMContactManagerImpl$getContactById$1 = new InHouseIMContactManagerImpl$getContactById$1(this, continuation);
            }
        }
        java.lang.Object obj3 = inHouseIMContactManagerImpl$getContactById$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i7 = inHouseIMContactManagerImpl$getContactById$1.label;
        try {
            try {
            } catch (java.lang.Throwable th) {
                th = th;
                obj = null;
            }
            if (i7 == 0) {
                C56391yDq.AEQbTJ(obj3);
                if (z) {
                    c44176sGc = this;
                    baseDaoKWHzl = KWHzl();
                    longRef3 = new Ref.LongRef();
                    objectRef = new Ref.ObjectRef();
                    i = 0;
                    i2 = 3;
                    str4 = str2;
                    inHouseIMContactManagerImpl$getContactById$12 = inHouseIMContactManagerImpl$getContactById$1;
                    str5 = str;
                    if (i >= i2) {
                    }
                } else {
                    c44176sGc = this;
                    str3 = str;
                    str4 = str2;
                    Result.Application application = Result.Companion;
                    obj = null;
                    inHouseIMContactManagerImpl$getContactById$1.L$0 = null;
                    inHouseIMContactManagerImpl$getContactById$1.L$1 = null;
                    inHouseIMContactManagerImpl$getContactById$1.L$2 = null;
                    inHouseIMContactManagerImpl$getContactById$1.L$3 = null;
                    inHouseIMContactManagerImpl$getContactById$1.L$4 = null;
                    inHouseIMContactManagerImpl$getContactById$1.L$5 = null;
                    inHouseIMContactManagerImpl$getContactById$1.L$6 = null;
                    inHouseIMContactManagerImpl$getContactById$1.L$7 = null;
                    inHouseIMContactManagerImpl$getContactById$1.L$8 = null;
                    inHouseIMContactManagerImpl$getContactById$1.label = 3;
                    objEZpvd = c44176sGc.EZpvd(str3, str4, inHouseIMContactManagerImpl$getContactById$1);
                    obj2 = objEZpvd;
                    if (objEZpvd == objCopydefault) {
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl((ContactWithPhoneData) obj2);
                    if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) == null) {
                    }
                }
            } else if (i7 == 1) {
                jNanoTime = inHouseIMContactManagerImpl$getContactById$1.J$0;
                i4 = inHouseIMContactManagerImpl$getContactById$1.I$2;
                int i8 = inHouseIMContactManagerImpl$getContactById$1.I$1;
                i2 = inHouseIMContactManagerImpl$getContactById$1.I$0;
                objectRef3 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getContactById$1.L$8;
                Ref.LongRef longRef6 = (Ref.LongRef) inHouseIMContactManagerImpl$getContactById$1.L$7;
                Ref.ObjectRef objectRef5 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getContactById$1.L$6;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getContactById$1.L$5;
                longRef2 = (Ref.LongRef) inHouseIMContactManagerImpl$getContactById$1.L$4;
                baseDaoKWHzl = (BaseDao) inHouseIMContactManagerImpl$getContactById$1.L$3;
                java.lang.String str9 = (java.lang.String) inHouseIMContactManagerImpl$getContactById$1.L$2;
                str8 = (java.lang.String) inHouseIMContactManagerImpl$getContactById$1.L$1;
                C44176sGc c44176sGc3 = (C44176sGc) inHouseIMContactManagerImpl$getContactById$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj3);
                    inHouseIMContactManagerImpl$getContactById$12 = inHouseIMContactManagerImpl$getContactById$1;
                    objectRef4 = objectRef5;
                    longRef5 = longRef6;
                    longRef3 = longRef2;
                    i = i4;
                    c44176sGc = c44176sGc3;
                    str4 = str9;
                    i5 = i8;
                    objectRef = objectRef6;
                    t = obj3;
                } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                    str6 = str8;
                    objectRef2 = objectRef6;
                    str7 = str9;
                    baseDao2 = baseDaoKWHzl;
                    i3 = i2;
                    longRef4 = longRef2;
                    i = i8;
                    c44176sGc2 = c44176sGc3;
                    r0 = e3;
                    C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                    objectRef2.element = r0;
                    if (i4 < i3 - 1) {
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
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    C44159sFm.EZpvd(baseDaoKWHzl, longRef2.element);
                    throw th;
                }
                objectRef3.element = t;
                longRef5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                T t2 = objectRef4.element;
                C44159sFm.EZpvd(baseDaoKWHzl, longRef3.element);
                contactWithPhoneData = (ContactWithPhoneData) t2;
                if (contactWithPhoneData == null) {
                }
            } else {
                if (i7 != 2) {
                    if (i7 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj3);
                    obj = null;
                    obj2 = obj3;
                    objM7377constructorimpl = Result.m7377constructorimpl((ContactWithPhoneData) obj2);
                    return Result.m7380exceptionOrNullimpl(objM7377constructorimpl) == null ? objM7377constructorimpl : obj;
                }
                int i9 = inHouseIMContactManagerImpl$getContactById$1.I$1;
                i3 = inHouseIMContactManagerImpl$getContactById$1.I$0;
                objectRef2 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getContactById$1.L$5;
                longRef4 = (Ref.LongRef) inHouseIMContactManagerImpl$getContactById$1.L$4;
                baseDao2 = (BaseDao) inHouseIMContactManagerImpl$getContactById$1.L$3;
                str7 = (java.lang.String) inHouseIMContactManagerImpl$getContactById$1.L$2;
                str6 = (java.lang.String) inHouseIMContactManagerImpl$getContactById$1.L$1;
                c44176sGc2 = (C44176sGc) inHouseIMContactManagerImpl$getContactById$1.L$0;
                C56391yDq.AEQbTJ(obj3);
                i = i9;
                c44176sGc = c44176sGc2;
                objectRef = objectRef2;
                Ref.LongRef longRef7 = longRef4;
                baseDaoKWHzl = baseDao2;
                inHouseIMContactManagerImpl$getContactById$12 = inHouseIMContactManagerImpl$getContactById$1;
                i2 = i3;
                str5 = str6;
                i++;
                str4 = str7;
                longRef3 = longRef7;
                if (i >= i2) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            message = e2.getMessage();
                            if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                C44159sFm.OLrzqt(e2);
                                throw e2;
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e7) {
                            e = e7;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDaoKWHzl, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        str6 = str5;
                        inHouseIMContactManagerImpl$getContactById$1 = inHouseIMContactManagerImpl$getContactById$12;
                        i4 = i;
                        objectRef2 = objectRef;
                        baseDao2 = baseDaoKWHzl;
                        i3 = i2;
                        longRef4 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                        str7 = str4;
                        c44176sGc2 = c44176sGc;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i4 < i3 - 1) {
                        }
                    }
                    objectRef3 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMContactDao inHouseIMContactDaoKWHzl = c44176sGc.KWHzl();
                    inHouseIMContactManagerImpl$getContactById$12.L$0 = c44176sGc;
                    inHouseIMContactManagerImpl$getContactById$12.L$1 = str5;
                    inHouseIMContactManagerImpl$getContactById$12.L$2 = str4;
                    inHouseIMContactManagerImpl$getContactById$12.L$3 = baseDaoKWHzl;
                    inHouseIMContactManagerImpl$getContactById$12.L$4 = longRef3;
                    inHouseIMContactManagerImpl$getContactById$12.L$5 = objectRef;
                    inHouseIMContactManagerImpl$getContactById$12.L$6 = objectRef3;
                    inHouseIMContactManagerImpl$getContactById$12.L$7 = longRef3;
                    inHouseIMContactManagerImpl$getContactById$12.L$8 = objectRef3;
                    inHouseIMContactManagerImpl$getContactById$12.I$0 = i2;
                    inHouseIMContactManagerImpl$getContactById$12.I$1 = i;
                    inHouseIMContactManagerImpl$getContactById$12.I$2 = i;
                    inHouseIMContactManagerImpl$getContactById$12.J$0 = jNanoTime;
                    inHouseIMContactManagerImpl$getContactById$12.label = 1;
                    java.lang.Object contactById = inHouseIMContactDaoKWHzl.getContactById(str5, inHouseIMContactManagerImpl$getContactById$12);
                    if (contactById == objCopydefault) {
                        return objCopydefault;
                    }
                    str8 = str5;
                    i5 = i;
                    objectRef4 = objectRef3;
                    longRef5 = longRef3;
                    t = contactById;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        str6 = str8;
                        inHouseIMContactManagerImpl$getContactById$1 = inHouseIMContactManagerImpl$getContactById$12;
                        i4 = i;
                        objectRef2 = objectRef;
                        i = i5;
                        baseDao2 = baseDaoKWHzl;
                        i3 = i2;
                        longRef4 = longRef3;
                        sQLiteDatabaseLockedException = e9;
                        str7 = str4;
                        c44176sGc2 = c44176sGc;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i4 < i3 - 1) {
                            inHouseIMContactManagerImpl$getContactById$1.L$0 = c44176sGc2;
                            inHouseIMContactManagerImpl$getContactById$1.L$1 = str6;
                            inHouseIMContactManagerImpl$getContactById$1.L$2 = str7;
                            inHouseIMContactManagerImpl$getContactById$1.L$3 = baseDao2;
                            inHouseIMContactManagerImpl$getContactById$1.L$4 = longRef4;
                            inHouseIMContactManagerImpl$getContactById$1.L$5 = objectRef2;
                            inHouseIMContactManagerImpl$getContactById$1.L$6 = null;
                            inHouseIMContactManagerImpl$getContactById$1.L$7 = null;
                            inHouseIMContactManagerImpl$getContactById$1.L$8 = null;
                            inHouseIMContactManagerImpl$getContactById$1.I$0 = i3;
                            inHouseIMContactManagerImpl$getContactById$1.I$1 = i;
                            inHouseIMContactManagerImpl$getContactById$1.label = 2;
                            if (DelayKt.delay(((long) (i4 + 1)) * 50, inHouseIMContactManagerImpl$getContactById$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            i9 = i;
                            i = i9;
                            c44176sGc = c44176sGc2;
                            objectRef = objectRef2;
                            Ref.LongRef longRef72 = longRef4;
                            baseDaoKWHzl = baseDao2;
                            inHouseIMContactManagerImpl$getContactById$12 = inHouseIMContactManagerImpl$getContactById$1;
                            i2 = i3;
                            str5 = str6;
                            i++;
                            str4 = str7;
                            longRef3 = longRef72;
                            if (i >= i2) {
                            }
                        } else {
                            inHouseIMContactManagerImpl$getContactById$12 = inHouseIMContactManagerImpl$getContactById$1;
                            c44176sGc = c44176sGc2;
                            objectRef = objectRef2;
                            longRef72 = longRef4;
                            baseDaoKWHzl = baseDao2;
                            str5 = str6;
                            i2 = i3;
                            i++;
                            str4 = str7;
                            longRef3 = longRef72;
                            if (i >= i2) {
                            }
                        }
                    }
                    objectRef3.element = t;
                    longRef5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t22 = objectRef4.element;
                    C44159sFm.EZpvd(baseDaoKWHzl, longRef3.element);
                    contactWithPhoneData = (ContactWithPhoneData) t22;
                    if (contactWithPhoneData == null) {
                        return contactWithPhoneData;
                    }
                    str3 = str8;
                    inHouseIMContactManagerImpl$getContactById$1 = inHouseIMContactManagerImpl$getContactById$12;
                    Result.Application application2 = Result.Companion;
                    obj = null;
                    try {
                        inHouseIMContactManagerImpl$getContactById$1.L$0 = null;
                        inHouseIMContactManagerImpl$getContactById$1.L$1 = null;
                        inHouseIMContactManagerImpl$getContactById$1.L$2 = null;
                        inHouseIMContactManagerImpl$getContactById$1.L$3 = null;
                        inHouseIMContactManagerImpl$getContactById$1.L$4 = null;
                        inHouseIMContactManagerImpl$getContactById$1.L$5 = null;
                        inHouseIMContactManagerImpl$getContactById$1.L$6 = null;
                        inHouseIMContactManagerImpl$getContactById$1.L$7 = null;
                        inHouseIMContactManagerImpl$getContactById$1.L$8 = null;
                        inHouseIMContactManagerImpl$getContactById$1.label = 3;
                        objEZpvd = c44176sGc.EZpvd(str3, str4, inHouseIMContactManagerImpl$getContactById$1);
                        obj2 = objEZpvd;
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        objM7377constructorimpl = Result.m7377constructorimpl((ContactWithPhoneData) obj2);
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        Result.Application application3 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) == null) {
                    }
                } else {
                    C44159sFm.EZpvd(baseDaoKWHzl, longRef3.element);
                    java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                    if (exc == null) {
                        exc = new java.lang.Exception("Database Operation failed after " + i2 + " attempts");
                    }
                    C44159sFm.OLrzqt(exc);
                    throw exc;
                }
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            longRef2 = longRef;
            baseDaoKWHzl = baseDao;
        }
    }

    /* JADX DEBUG: Duplicate block (B:108:0x029c) to fix multi-entry loop: BACK_EDGE: B:108:0x029c -> B:109:0x029e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:131:0x029e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:25:0x00a3 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:78:0x022f */
    /* JADX DEBUG: Type inference failed for r0v38. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v47. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0261: MOVE (r13 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:98:0x0260 */
    /* JADX WARN: Path cross not found for [B:47:0x00fc, B:50:0x010f], limit reached: 126 */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0274 A[Catch: all -> 0x02a5, TRY_LEAVE, TryCatch #4 {all -> 0x02a5, blocks: (B:102:0x0267, B:104:0x0274), top: B:122:0x0267 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v29, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v35, types: [T] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r11v2, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v3, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.jvm.internal.Ref$LongRef] */
    @Override // o.InterfaceC44178sGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super ContactWithPhoneData> continuation) throws java.lang.Exception {
        InHouseIMContactManagerImpl$getContactInfoFromRemote$1 inHouseIMContactManagerImpl$getContactInfoFromRemote$1;
        ?? r11;
        BaseDao baseDao;
        BaseDao baseDaoKWHzl;
        C44176sGc c44176sGc;
        AbstractC43419rot actionBar;
        int i;
        C44176sGc c44176sGc2;
        InHouseIMContactInfoEntity inHouseIMContactInfoEntity;
        java.lang.Object obj;
        ResponseData responseData;
        InHouseIMContactInfoEntity inHouseIMContactInfoEntity2;
        ?? longRef;
        Ref.ObjectRef objectRef;
        int i2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        BaseDao baseDao2;
        int i3;
        ?? r0;
        ?? r15;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        long jNanoTime;
        ?? r1;
        ?? r02;
        if (continuation instanceof InHouseIMContactManagerImpl$getContactInfoFromRemote$1) {
            inHouseIMContactManagerImpl$getContactInfoFromRemote$1 = (InHouseIMContactManagerImpl$getContactInfoFromRemote$1) continuation;
            int i4 = inHouseIMContactManagerImpl$getContactInfoFromRemote$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                inHouseIMContactManagerImpl$getContactInfoFromRemote$1.label = i4 - Integer.MIN_VALUE;
            } else {
                inHouseIMContactManagerImpl$getContactInfoFromRemote$1 = new InHouseIMContactManagerImpl$getContactInfoFromRemote$1(this, continuation);
            }
        }
        java.lang.Object obj2 = inHouseIMContactManagerImpl$getContactInfoFromRemote$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = inHouseIMContactManagerImpl$getContactInfoFromRemote$1.label;
        int i6 = 3;
        try {
            if (i5 == 0) {
                C56391yDq.AEQbTJ(obj2);
                try {
                    InHouseIMRelationService inHouseIMRelationService = this.AEQbTJ;
                    inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$0 = this;
                    inHouseIMContactManagerImpl$getContactInfoFromRemote$1.label = 1;
                    java.lang.Object relationById = inHouseIMRelationService.getRelationById(str, str2, inHouseIMContactManagerImpl$getContactInfoFromRemote$1);
                    if (relationById == objCopydefault) {
                        return objCopydefault;
                    }
                    c44176sGc = this;
                    obj = relationById;
                    responseData = (ResponseData) obj;
                    if (responseData.getCode() != 0) {
                    }
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                } catch (java.lang.Throwable th) {
                    th = th;
                    c44176sGc = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            } else if (i5 == 1) {
                c44176sGc = (C44176sGc) inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj2);
                    obj = obj2;
                    responseData = (ResponseData) obj;
                    if (responseData.getCode() != 0 && responseData.getData() != null) {
                        java.lang.Object data = responseData.getData();
                        Intrinsics.copydefault(data);
                        actionBar = new AbstractC43419rot.StateListAnimator(data);
                    } else {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            } else if (i5 == 2) {
                inHouseIMContactInfoEntity = (InHouseIMContactInfoEntity) inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$1;
                c44176sGc2 = (C44176sGc) inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$0 = c44176sGc2;
                inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$1 = inHouseIMContactInfoEntity;
                inHouseIMContactManagerImpl$getContactInfoFromRemote$1.label = 3;
                if (c44176sGc2.OLrzqt(inHouseIMContactInfoEntity, inHouseIMContactManagerImpl$getContactInfoFromRemote$1) == objCopydefault) {
                    return objCopydefault;
                }
                if (Intrinsics.EZpvd((java.lang.Object) inHouseIMContactInfoEntity.getContactUid(), (java.lang.Object) C44157sFk.EZpvd())) {
                }
                baseDaoKWHzl = c44176sGc2.KWHzl();
                inHouseIMContactInfoEntity2 = inHouseIMContactInfoEntity;
                longRef = new Ref.LongRef();
                objectRef = new Ref.ObjectRef();
                i2 = 0;
                if (i2 < i6) {
                }
            } else {
                if (i5 != 3) {
                    if (i5 == 4) {
                        jNanoTime = inHouseIMContactManagerImpl$getContactInfoFromRemote$1.J$0;
                        int i7 = inHouseIMContactManagerImpl$getContactInfoFromRemote$1.I$2;
                        i3 = inHouseIMContactManagerImpl$getContactInfoFromRemote$1.I$1;
                        i6 = inHouseIMContactManagerImpl$getContactInfoFromRemote$1.I$0;
                        Ref.ObjectRef objectRef4 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$7;
                        Ref.LongRef longRef2 = (Ref.LongRef) inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$6;
                        Ref.ObjectRef objectRef5 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$5;
                        objectRef = (Ref.ObjectRef) inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$4;
                        r11 = (Ref.LongRef) inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$3;
                        baseDaoKWHzl = (BaseDao) inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$2;
                        inHouseIMContactInfoEntity2 = (InHouseIMContactInfoEntity) inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$1;
                        C44176sGc c44176sGc3 = (C44176sGc) inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$0;
                        try {
                            C56391yDq.AEQbTJ(obj2);
                            r1 = longRef2;
                            r15 = r11;
                            objectRef3 = objectRef4;
                            objectRef2 = objectRef5;
                            c44176sGc2 = c44176sGc3;
                            i2 = i7;
                            r02 = obj2;
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                            c44176sGc2 = c44176sGc3;
                            longRef = r11;
                            baseDao2 = baseDaoKWHzl;
                            i2 = i7;
                            r0 = e3;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                            objectRef.element = r0;
                            if (i2 < i6 - 1) {
                            }
                            i2 = i3 + 1;
                            longRef = longRef;
                            if (i2 < i6) {
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
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            C44159sFm.EZpvd(baseDaoKWHzl, r11.element);
                            throw th;
                        }
                        objectRef3.element = r02;
                        r1.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                        java.lang.Object obj3 = objectRef2.element;
                        C44159sFm.EZpvd(baseDaoKWHzl, r15.element);
                        return (ContactWithPhoneData) obj3;
                    }
                    if (i5 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i8 = inHouseIMContactManagerImpl$getContactInfoFromRemote$1.I$1;
                    int i9 = inHouseIMContactManagerImpl$getContactInfoFromRemote$1.I$0;
                    Ref.ObjectRef objectRef6 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$4;
                    Ref.LongRef longRef3 = (Ref.LongRef) inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$3;
                    BaseDao baseDao3 = (BaseDao) inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$2;
                    InHouseIMContactInfoEntity inHouseIMContactInfoEntity3 = (InHouseIMContactInfoEntity) inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$1;
                    C44176sGc c44176sGc4 = (C44176sGc) inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    c44176sGc2 = c44176sGc4;
                    objectRef = objectRef6;
                    baseDaoKWHzl = baseDao3;
                    inHouseIMContactInfoEntity2 = inHouseIMContactInfoEntity3;
                    i3 = i8;
                    longRef = longRef3;
                    i6 = i9;
                    i2 = i3 + 1;
                    longRef = longRef;
                    if (i2 < i6) {
                        try {
                            try {
                            } catch (java.lang.IllegalStateException e6) {
                                e2 = e6;
                                message = e2.getMessage();
                                if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                    C44159sFm.OLrzqt(e2);
                                    throw e2;
                                }
                                C44159sFm.copydefault(e2);
                                throw e2;
                            } catch (java.lang.Exception e7) {
                                e = e7;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                r11 = longRef;
                                C44159sFm.EZpvd(baseDaoKWHzl, r11.element);
                                throw th;
                            }
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                            try {
                                C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                                objectRef.element = r0;
                                if (i2 < i6 - 1) {
                                    inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$0 = c44176sGc2;
                                    inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$1 = inHouseIMContactInfoEntity2;
                                    inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$2 = baseDao2;
                                    inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$3 = longRef;
                                    inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$4 = objectRef;
                                    inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$5 = null;
                                    inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$6 = null;
                                    inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$7 = null;
                                    inHouseIMContactManagerImpl$getContactInfoFromRemote$1.I$0 = i6;
                                    inHouseIMContactManagerImpl$getContactInfoFromRemote$1.I$1 = i3;
                                    inHouseIMContactManagerImpl$getContactInfoFromRemote$1.label = 5;
                                    if (DelayKt.delay(((long) (i2 + 1)) * 50, inHouseIMContactManagerImpl$getContactInfoFromRemote$1) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    baseDaoKWHzl = baseDao2;
                                } else {
                                    baseDaoKWHzl = baseDao2;
                                }
                                i2 = i3 + 1;
                                longRef = longRef;
                                if (i2 < i6) {
                                }
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                baseDaoKWHzl = baseDao2;
                                r11 = longRef;
                                C44159sFm.EZpvd(baseDaoKWHzl, r11.element);
                                throw th;
                            }
                            i3 = i2;
                            baseDao2 = baseDaoKWHzl;
                            r0 = e8;
                            longRef = longRef;
                        }
                        objectRef2 = new Ref.ObjectRef();
                        jNanoTime = java.lang.System.nanoTime();
                        InHouseIMContactDao inHouseIMContactDaoKWHzl = c44176sGc2.KWHzl();
                        java.lang.String contactUid = inHouseIMContactInfoEntity2.getContactUid();
                        inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$0 = c44176sGc2;
                        inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$1 = inHouseIMContactInfoEntity2;
                        inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$2 = baseDaoKWHzl;
                        inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$3 = longRef;
                        inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$4 = objectRef;
                        inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$5 = objectRef2;
                        inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$6 = longRef;
                        inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$7 = objectRef2;
                        inHouseIMContactManagerImpl$getContactInfoFromRemote$1.I$0 = i6;
                        inHouseIMContactManagerImpl$getContactInfoFromRemote$1.I$1 = i2;
                        inHouseIMContactManagerImpl$getContactInfoFromRemote$1.I$2 = i2;
                        inHouseIMContactManagerImpl$getContactInfoFromRemote$1.J$0 = jNanoTime;
                        inHouseIMContactManagerImpl$getContactInfoFromRemote$1.label = 4;
                        java.lang.Object contactById = inHouseIMContactDaoKWHzl.getContactById(contactUid, inHouseIMContactManagerImpl$getContactInfoFromRemote$1);
                        if (contactById == objCopydefault) {
                            return objCopydefault;
                        }
                        i3 = i2;
                        objectRef3 = objectRef2;
                        r1 = longRef;
                        r02 = contactById;
                        r15 = longRef;
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                            baseDao2 = baseDaoKWHzl;
                            r0 = e9;
                            longRef = r15;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                            objectRef.element = r0;
                            if (i2 < i6 - 1) {
                            }
                            i2 = i3 + 1;
                            longRef = longRef;
                            if (i2 < i6) {
                            }
                        }
                        objectRef3.element = r02;
                        r1.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                        java.lang.Object obj32 = objectRef2.element;
                        C44159sFm.EZpvd(baseDaoKWHzl, r15.element);
                        return (ContactWithPhoneData) obj32;
                    }
                    C44159sFm.EZpvd(baseDaoKWHzl, longRef.element);
                    java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                    if (exc == null) {
                        exc = new java.lang.Exception("Database Operation failed after " + i6 + " attempts");
                    }
                    C44159sFm.OLrzqt(exc);
                    throw exc;
                }
                inHouseIMContactInfoEntity = (InHouseIMContactInfoEntity) inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$1;
                c44176sGc2 = (C44176sGc) inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                if (Intrinsics.EZpvd((java.lang.Object) inHouseIMContactInfoEntity.getContactUid(), (java.lang.Object) C44157sFk.EZpvd())) {
                    C44124sEe.imLogContact$default("getContactById => update user info", null, 2, null);
                    c44176sGc2.EZpvd(inHouseIMContactInfoEntity);
                }
                baseDaoKWHzl = c44176sGc2.KWHzl();
                inHouseIMContactInfoEntity2 = inHouseIMContactInfoEntity;
                longRef = new Ref.LongRef();
                objectRef = new Ref.ObjectRef();
                i2 = 0;
                if (i2 < i6) {
                }
            }
            if (actionBar instanceof AbstractC43419rot.ActionBar) {
                i = 2;
                C44124sEe.imLogContact$default("getRelationById failed: " + ((OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()), null, 2, null);
            } else {
                i = 2;
            }
            InHouseIMContactInfoEntity inHouseIMContactInfoEntity4 = (InHouseIMContactInfoEntity) actionBar.AEQbTJ();
            c44176sGc.copydefault.AEQbTJ(C56402yEa.EZpvd(inHouseIMContactInfoEntity4));
            inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$0 = c44176sGc;
            inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$1 = inHouseIMContactInfoEntity4;
            inHouseIMContactManagerImpl$getContactInfoFromRemote$1.label = i;
            if (c44176sGc.KWHzl(inHouseIMContactInfoEntity4, inHouseIMContactManagerImpl$getContactInfoFromRemote$1) == objCopydefault) {
                return objCopydefault;
            }
            c44176sGc2 = c44176sGc;
            inHouseIMContactInfoEntity = inHouseIMContactInfoEntity4;
            inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$0 = c44176sGc2;
            inHouseIMContactManagerImpl$getContactInfoFromRemote$1.L$1 = inHouseIMContactInfoEntity;
            inHouseIMContactManagerImpl$getContactInfoFromRemote$1.label = 3;
            if (c44176sGc2.OLrzqt(inHouseIMContactInfoEntity, inHouseIMContactManagerImpl$getContactInfoFromRemote$1) == objCopydefault) {
            }
            if (Intrinsics.EZpvd((java.lang.Object) inHouseIMContactInfoEntity.getContactUid(), (java.lang.Object) C44157sFk.EZpvd())) {
            }
            baseDaoKWHzl = c44176sGc2.KWHzl();
            inHouseIMContactInfoEntity2 = inHouseIMContactInfoEntity;
            longRef = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i2 = 0;
            if (i2 < i6) {
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            r11 = 3;
            baseDaoKWHzl = baseDao;
        }
    }

    public final void EZpvd(InHouseIMContactInfoEntity inHouseIMContactInfoEntity) {
        sFU sfuValueOf = sDZ.AEQbTJ.valueOf();
        com.okinc.okimcore.model.remote.UserInfo userInfoOLrzqt = sfuValueOf.OLrzqt();
        if (userInfoOLrzqt != null) {
            sfuValueOf.EZpvd(userInfoOLrzqt.copy((524287 & 1) != 0 ? userInfoOLrzqt.identifyId : null, (524287 & 2) != 0 ? userInfoOLrzqt.avatar : inHouseIMContactInfoEntity.getAvatar(), (524287 & 4) != 0 ? userInfoOLrzqt.avatarStatus : null, (524287 & 8) != 0 ? userInfoOLrzqt.petname : inHouseIMContactInfoEntity.getNickname(), (524287 & 16) != 0 ? userInfoOLrzqt.enPetname : inHouseIMContactInfoEntity.getEnNickname(), (524287 & 32) != 0 ? userInfoOLrzqt.rcToken : null, (524287 & 64) != 0 ? userInfoOLrzqt.sign : null, (524287 & 128) != 0 ? userInfoOLrzqt.phoneSearchStatus : null, (524287 & 256) != 0 ? userInfoOLrzqt.qrSearchStatus : null, (524287 & 512) != 0 ? userInfoOLrzqt.petnameSearchStatus : null, (524287 & 1024) != 0 ? userInfoOLrzqt.groupStatus : null, (524287 & 2048) != 0 ? userInfoOLrzqt.allowContactDiscovery : null, (524287 & 4096) != 0 ? userInfoOLrzqt.timestamp : null, (524287 & 8192) != 0 ? userInfoOLrzqt.officialTag : null, (524287 & 16384) != 0 ? userInfoOLrzqt.allowGenerateQrCode : null, (524287 & 32768) != 0 ? userInfoOLrzqt.allowCreateGroup : null, (524287 & 65536) != 0 ? userInfoOLrzqt.allowSearchUuid : null, (524287 & 131072) != 0 ? userInfoOLrzqt.phoneSyncQuota : null, (524287 & 262144) != 0 ? userInfoOLrzqt.allowInAppNotification : null, (524287 & 524288) != 0 ? userInfoOLrzqt.allowChatViaProfile : null));
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x0223 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0225 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v48, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x027e: MOVE (r9 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:98:0x027e */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b8 A[Catch: all -> 0x02f3, TRY_LEAVE, TryCatch #11 {all -> 0x02f3, blocks: (B:102:0x02ab, B:104:0x02b8), top: B:124:0x02ab }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026a A[Catch: all -> 0x0053, TryCatch #13 {all -> 0x0053, blocks: (B:13:0x004a, B:57:0x01ed, B:85:0x0259, B:86:0x025c, B:90:0x0264, B:92:0x026a, B:94:0x0276, B:95:0x0279, B:96:0x027a, B:97:0x027d), top: B:126:0x0028 }] */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x02dd -> B:107:0x02e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x02eb -> B:107:0x02e0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull InHouseIMContactInfoEntity inHouseIMContactInfoEntity, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        InHouseIMContactManagerImpl$updateConversationEntityInfo$1 inHouseIMContactManagerImpl$updateConversationEntityInfo$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        java.lang.String nickname;
        java.lang.String enNickname;
        java.util.ArrayList arrayList;
        C44176sGc c44176sGc;
        EntityInfo entityInfo;
        BaseDao baseDaoAEQbTJ;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        InHouseIMContactManagerImpl$updateConversationEntityInfo$1 inHouseIMContactManagerImpl$updateConversationEntityInfo$12;
        InHouseIMContactInfoEntity inHouseIMContactInfoEntity2;
        Ref.ObjectRef objectRef2;
        int i3;
        int i4;
        int i5;
        EntityInfo entityInfo2;
        Ref.LongRef longRef4;
        BaseDao baseDao2;
        InHouseIMContactInfoEntity inHouseIMContactInfoEntity3;
        C44176sGc c44176sGc2;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        InHouseIMContactInfoEntity inHouseIMContactInfoEntity4;
        EntityInfo entityInfo3;
        int i6;
        int i7;
        Ref.ObjectRef objectRef3;
        int i8;
        Ref.LongRef longRef5;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        ?? r0;
        int i9;
        Ref.ObjectRef objectRef4;
        Ref.LongRef longRef6;
        Ref.ObjectRef objectRef5;
        long j;
        Ref.ObjectRef objectRef6;
        InHouseIMContactInfoEntity inHouseIMContactInfoEntity5;
        Ref.LongRef longRef7;
        BaseDao baseDao3;
        InHouseIMContactInfoEntity inHouseIMContactInfoEntity6;
        EntityInfo entityInfo4;
        C44176sGc c44176sGc3;
        if (continuation instanceof InHouseIMContactManagerImpl$updateConversationEntityInfo$1) {
            inHouseIMContactManagerImpl$updateConversationEntityInfo$1 = (InHouseIMContactManagerImpl$updateConversationEntityInfo$1) continuation;
            int i10 = inHouseIMContactManagerImpl$updateConversationEntityInfo$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                inHouseIMContactManagerImpl$updateConversationEntityInfo$1.label = i10 - Integer.MIN_VALUE;
            } else {
                inHouseIMContactManagerImpl$updateConversationEntityInfo$1 = new InHouseIMContactManagerImpl$updateConversationEntityInfo$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMContactManagerImpl$updateConversationEntityInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i11 = inHouseIMContactManagerImpl$updateConversationEntityInfo$1.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    j = inHouseIMContactManagerImpl$updateConversationEntityInfo$1.J$0;
                    int i12 = inHouseIMContactManagerImpl$updateConversationEntityInfo$1.I$2;
                    i5 = inHouseIMContactManagerImpl$updateConversationEntityInfo$1.I$1;
                    i4 = inHouseIMContactManagerImpl$updateConversationEntityInfo$1.I$0;
                    objectRef5 = (Ref.ObjectRef) inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$8;
                    longRef6 = (Ref.LongRef) inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$7;
                    objectRef4 = (Ref.ObjectRef) inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$6;
                    objectRef6 = (Ref.ObjectRef) inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$5;
                    longRef4 = (Ref.LongRef) inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$4;
                    baseDao2 = (BaseDao) inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$3;
                    entityInfo2 = (EntityInfo) inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$2;
                    InHouseIMContactInfoEntity inHouseIMContactInfoEntity7 = (InHouseIMContactInfoEntity) inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$1;
                    c44176sGc2 = (C44176sGc) inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        i3 = i12;
                        i9 = i4;
                        inHouseIMContactInfoEntity5 = inHouseIMContactInfoEntity7;
                        baseDaoAEQbTJ = baseDao2;
                        i8 = i5;
                        longRef5 = longRef4;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        i3 = i12;
                        objectRef2 = objectRef6;
                        inHouseIMContactInfoEntity3 = inHouseIMContactInfoEntity7;
                        sQLiteDatabaseLockedException = e3;
                        c44176sGc = c44176sGc2;
                        inHouseIMContactInfoEntity4 = inHouseIMContactInfoEntity3;
                        entityInfo3 = entityInfo2;
                        i6 = i4;
                        i7 = i3;
                        objectRef3 = objectRef2;
                        baseDaoAEQbTJ = baseDao2;
                        i8 = i5;
                        longRef5 = longRef4;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i7 >= i6 - 1) {
                        }
                        InHouseIMContactManagerImpl$updateConversationEntityInfo$1 inHouseIMContactManagerImpl$updateConversationEntityInfo$13 = inHouseIMContactManagerImpl$updateConversationEntityInfo$1;
                        inHouseIMContactInfoEntity2 = inHouseIMContactInfoEntity4;
                        Ref.ObjectRef objectRef7 = objectRef3;
                        i = i6;
                        longRef3 = longRef5;
                        entityInfo = entityInfo3;
                        objectRef = objectRef7;
                        i2 = i8 + 1;
                        inHouseIMContactManagerImpl$updateConversationEntityInfo$12 = inHouseIMContactManagerImpl$updateConversationEntityInfo$13;
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
                        baseDao = baseDao2;
                        longRef2 = longRef4;
                        C44159sFm.EZpvd(baseDao, longRef2.element);
                        throw th;
                    }
                    ?? r02 = Unit.INSTANCE;
                    objectRef5.element = r02;
                    longRef6.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                    T t = objectRef4.element;
                    C44159sFm.EZpvd(baseDaoAEQbTJ, longRef5.element);
                    return r02;
                }
                if (i11 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i13 = inHouseIMContactManagerImpl$updateConversationEntityInfo$1.I$1;
                i6 = inHouseIMContactManagerImpl$updateConversationEntityInfo$1.I$0;
                objectRef3 = (Ref.ObjectRef) inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$5;
                longRef5 = (Ref.LongRef) inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$4;
                baseDaoAEQbTJ = (BaseDao) inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$3;
                entityInfo3 = (EntityInfo) inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$2;
                inHouseIMContactInfoEntity4 = (InHouseIMContactInfoEntity) inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$1;
                c44176sGc = (C44176sGc) inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$0;
                C56391yDq.AEQbTJ(obj);
                i8 = i13;
                InHouseIMContactManagerImpl$updateConversationEntityInfo$1 inHouseIMContactManagerImpl$updateConversationEntityInfo$132 = inHouseIMContactManagerImpl$updateConversationEntityInfo$1;
                inHouseIMContactInfoEntity2 = inHouseIMContactInfoEntity4;
                Ref.ObjectRef objectRef72 = objectRef3;
                i = i6;
                longRef3 = longRef5;
                entityInfo = entityInfo3;
                objectRef = objectRef72;
                i2 = i8 + 1;
                inHouseIMContactManagerImpl$updateConversationEntityInfo$12 = inHouseIMContactManagerImpl$updateConversationEntityInfo$132;
                if (i2 >= i) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            longRef7 = longRef3;
                            baseDao3 = baseDaoAEQbTJ;
                        } catch (java.lang.Exception e7) {
                            e = e7;
                            longRef7 = longRef3;
                            baseDao3 = baseDaoAEQbTJ;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            longRef7 = longRef3;
                            baseDao3 = baseDaoAEQbTJ;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        BaseDao baseDao4 = baseDaoAEQbTJ;
                        objectRef2 = objectRef;
                        i3 = i2;
                        inHouseIMContactInfoEntity3 = inHouseIMContactInfoEntity2;
                        longRef4 = longRef3;
                        inHouseIMContactManagerImpl$updateConversationEntityInfo$1 = inHouseIMContactManagerImpl$updateConversationEntityInfo$12;
                        entityInfo2 = entityInfo;
                        i5 = i3;
                        c44176sGc2 = c44176sGc;
                        i4 = i;
                        baseDao2 = baseDao4;
                        sQLiteDatabaseLockedException = e8;
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        e = e9;
                        inHouseIMContactInfoEntity6 = inHouseIMContactInfoEntity2;
                    }
                    Ref.ObjectRef objectRef8 = new Ref.ObjectRef();
                    long jNanoTime = java.lang.System.nanoTime();
                    InHouseIMConversationDao inHouseIMConversationDaoAEQbTJ = c44176sGc.AEQbTJ();
                    java.lang.String strGEmmrt = C33129mqd.gEmmrt(inHouseIMContactInfoEntity2.getChannelId());
                    java.lang.String nickname2 = entityInfo.getNickname();
                    java.lang.String enNickname2 = entityInfo.getEnNickname();
                    java.lang.String avatar = entityInfo.getAvatar();
                    java.lang.String relatedId = entityInfo.getRelatedId();
                    java.util.List<java.lang.Integer> tags = entityInfo.getTags();
                    java.lang.Integer groupType = entityInfo.getGroupType();
                    inHouseIMContactManagerImpl$updateConversationEntityInfo$12.L$0 = c44176sGc;
                    inHouseIMContactManagerImpl$updateConversationEntityInfo$12.L$1 = inHouseIMContactInfoEntity2;
                    inHouseIMContactManagerImpl$updateConversationEntityInfo$12.L$2 = entityInfo;
                    inHouseIMContactManagerImpl$updateConversationEntityInfo$12.L$3 = baseDaoAEQbTJ;
                    inHouseIMContactManagerImpl$updateConversationEntityInfo$12.L$4 = longRef3;
                    inHouseIMContactManagerImpl$updateConversationEntityInfo$12.L$5 = objectRef;
                    inHouseIMContactManagerImpl$updateConversationEntityInfo$12.L$6 = objectRef8;
                    inHouseIMContactManagerImpl$updateConversationEntityInfo$12.L$7 = longRef3;
                    inHouseIMContactManagerImpl$updateConversationEntityInfo$12.L$8 = objectRef8;
                    inHouseIMContactManagerImpl$updateConversationEntityInfo$12.I$0 = i;
                    inHouseIMContactManagerImpl$updateConversationEntityInfo$12.I$1 = i2;
                    inHouseIMContactManagerImpl$updateConversationEntityInfo$12.I$2 = i2;
                    inHouseIMContactManagerImpl$updateConversationEntityInfo$12.J$0 = jNanoTime;
                    inHouseIMContactInfoEntity6 = inHouseIMContactInfoEntity2;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        try {
                            e = e10;
                            longRef7 = longRef3;
                            i9 = i;
                            entityInfo4 = entityInfo;
                            baseDao3 = baseDaoAEQbTJ;
                            objectRef2 = objectRef;
                            i3 = i2;
                            c44176sGc3 = c44176sGc;
                            inHouseIMContactInfoEntity3 = inHouseIMContactInfoEntity6;
                            longRef4 = longRef7;
                            inHouseIMContactManagerImpl$updateConversationEntityInfo$1 = inHouseIMContactManagerImpl$updateConversationEntityInfo$12;
                            entityInfo2 = entityInfo4;
                            i5 = i3;
                            c44176sGc2 = c44176sGc3;
                            i4 = i9;
                            baseDao2 = baseDao3;
                            sQLiteDatabaseLockedException = e;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                            objectRef3.element = r0;
                            if (i7 >= i6 - 1) {
                                inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$0 = c44176sGc;
                                inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$1 = inHouseIMContactInfoEntity4;
                                inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$2 = entityInfo3;
                                inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$3 = baseDaoAEQbTJ;
                                inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$4 = longRef5;
                                inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$5 = objectRef3;
                                inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$6 = null;
                                inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$7 = null;
                                inHouseIMContactManagerImpl$updateConversationEntityInfo$1.L$8 = null;
                                inHouseIMContactManagerImpl$updateConversationEntityInfo$1.I$0 = i6;
                                inHouseIMContactManagerImpl$updateConversationEntityInfo$1.I$1 = i8;
                                inHouseIMContactManagerImpl$updateConversationEntityInfo$1.label = 2;
                                if (DelayKt.delay(((long) (i7 + 1)) * 50, inHouseIMContactManagerImpl$updateConversationEntityInfo$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                            InHouseIMContactManagerImpl$updateConversationEntityInfo$1 inHouseIMContactManagerImpl$updateConversationEntityInfo$1322 = inHouseIMContactManagerImpl$updateConversationEntityInfo$1;
                            inHouseIMContactInfoEntity2 = inHouseIMContactInfoEntity4;
                            Ref.ObjectRef objectRef722 = objectRef3;
                            i = i6;
                            longRef3 = longRef5;
                            entityInfo = entityInfo3;
                            objectRef = objectRef722;
                            i2 = i8 + 1;
                            inHouseIMContactManagerImpl$updateConversationEntityInfo$12 = inHouseIMContactManagerImpl$updateConversationEntityInfo$1322;
                            if (i2 >= i) {
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            longRef4 = longRef5;
                            baseDao2 = baseDaoAEQbTJ;
                            baseDao = baseDao2;
                            longRef2 = longRef4;
                            C44159sFm.EZpvd(baseDao, longRef2.element);
                            throw th;
                        }
                        c44176sGc = c44176sGc2;
                        inHouseIMContactInfoEntity4 = inHouseIMContactInfoEntity3;
                        entityInfo3 = entityInfo2;
                        i6 = i4;
                        i7 = i3;
                        objectRef3 = objectRef2;
                        baseDaoAEQbTJ = baseDao2;
                        i8 = i5;
                        longRef5 = longRef4;
                        r0 = sQLiteDatabaseLockedException;
                    }
                    inHouseIMContactManagerImpl$updateConversationEntityInfo$12.label = 1;
                    longRef7 = longRef3;
                    i9 = i;
                    entityInfo4 = entityInfo;
                    baseDao3 = baseDaoAEQbTJ;
                    objectRef2 = objectRef;
                    i3 = i2;
                    c44176sGc3 = c44176sGc;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e11) {
                        e = e11;
                        inHouseIMContactInfoEntity3 = inHouseIMContactInfoEntity6;
                        longRef4 = longRef7;
                        inHouseIMContactManagerImpl$updateConversationEntityInfo$1 = inHouseIMContactManagerImpl$updateConversationEntityInfo$12;
                        entityInfo2 = entityInfo4;
                        i5 = i3;
                        c44176sGc2 = c44176sGc3;
                        i4 = i9;
                        baseDao2 = baseDao3;
                        sQLiteDatabaseLockedException = e;
                        c44176sGc = c44176sGc2;
                        inHouseIMContactInfoEntity4 = inHouseIMContactInfoEntity3;
                        entityInfo3 = entityInfo2;
                        i6 = i4;
                        i7 = i3;
                        objectRef3 = objectRef2;
                        baseDaoAEQbTJ = baseDao2;
                        i8 = i5;
                        longRef5 = longRef4;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i7 >= i6 - 1) {
                        }
                        InHouseIMContactManagerImpl$updateConversationEntityInfo$1 inHouseIMContactManagerImpl$updateConversationEntityInfo$13222 = inHouseIMContactManagerImpl$updateConversationEntityInfo$1;
                        inHouseIMContactInfoEntity2 = inHouseIMContactInfoEntity4;
                        Ref.ObjectRef objectRef7222 = objectRef3;
                        i = i6;
                        longRef3 = longRef5;
                        entityInfo = entityInfo3;
                        objectRef = objectRef7222;
                        i2 = i8 + 1;
                        inHouseIMContactManagerImpl$updateConversationEntityInfo$12 = inHouseIMContactManagerImpl$updateConversationEntityInfo$13222;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e12) {
                        e2 = e12;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e13) {
                        e = e13;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        longRef2 = longRef7;
                        baseDao = baseDao3;
                        C44159sFm.EZpvd(baseDao, longRef2.element);
                        throw th;
                    }
                    if (InHouseIMConversationDao.Activity.updateEntityInfo$default(inHouseIMConversationDaoAEQbTJ, strGEmmrt, nickname2, enNickname2, null, avatar, tags, relatedId, groupType, inHouseIMContactManagerImpl$updateConversationEntityInfo$12, 8, null) == objCopydefault) {
                        return objCopydefault;
                    }
                    inHouseIMContactInfoEntity5 = inHouseIMContactInfoEntity6;
                    objectRef5 = objectRef8;
                    objectRef4 = objectRef5;
                    longRef5 = longRef7;
                    longRef6 = longRef5;
                    inHouseIMContactManagerImpl$updateConversationEntityInfo$1 = inHouseIMContactManagerImpl$updateConversationEntityInfo$12;
                    entityInfo2 = entityInfo4;
                    i8 = i3;
                    c44176sGc2 = c44176sGc3;
                    j = jNanoTime;
                    baseDaoAEQbTJ = baseDao3;
                    objectRef6 = objectRef2;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e14) {
                        c44176sGc = c44176sGc2;
                        inHouseIMContactInfoEntity4 = inHouseIMContactInfoEntity5;
                        objectRef3 = objectRef6;
                        entityInfo3 = entityInfo2;
                        i7 = i3;
                        i6 = i9;
                        r0 = e14;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i7 >= i6 - 1) {
                        }
                        InHouseIMContactManagerImpl$updateConversationEntityInfo$1 inHouseIMContactManagerImpl$updateConversationEntityInfo$132222 = inHouseIMContactManagerImpl$updateConversationEntityInfo$1;
                        inHouseIMContactInfoEntity2 = inHouseIMContactInfoEntity4;
                        Ref.ObjectRef objectRef72222 = objectRef3;
                        i = i6;
                        longRef3 = longRef5;
                        entityInfo = entityInfo3;
                        objectRef = objectRef72222;
                        i2 = i8 + 1;
                        inHouseIMContactManagerImpl$updateConversationEntityInfo$12 = inHouseIMContactManagerImpl$updateConversationEntityInfo$132222;
                        if (i2 >= i) {
                        }
                    } catch (java.lang.IllegalStateException e15) {
                        e2 = e15;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e16) {
                        e = e16;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    ?? r022 = Unit.INSTANCE;
                    objectRef5.element = r022;
                    longRef6.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                    T t2 = objectRef4.element;
                    C44159sFm.EZpvd(baseDaoAEQbTJ, longRef5.element);
                    return r022;
                }
                int i14 = i;
                C44159sFm.EZpvd(baseDaoAEQbTJ, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i14 + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            C44124sEe.imLogContact$default("updateConversationEntityInfo: " + inHouseIMContactInfoEntity.getContactUid(), null, 2, null);
            java.lang.String avatar2 = inHouseIMContactInfoEntity.getAvatar();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) inHouseIMContactInfoEntity.getRemarkName())) {
                nickname = inHouseIMContactInfoEntity.getRemarkName();
            } else {
                nickname = inHouseIMContactInfoEntity.getNickname();
            }
            java.lang.String str = nickname;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) inHouseIMContactInfoEntity.getRemarkName())) {
                enNickname = inHouseIMContactInfoEntity.getRemarkName();
            } else {
                enNickname = inHouseIMContactInfoEntity.getEnNickname();
            }
            java.lang.String str2 = enNickname;
            java.lang.String contactUid = inHouseIMContactInfoEntity.getContactUid();
            java.util.List<UserTagType> tags2 = inHouseIMContactInfoEntity.getTags();
            if (tags2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(tags2, 10));
                java.util.Iterator<T> it = tags2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(C56443yFo.AEQbTJ(((UserTagType) it.next()).getApiValue()));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            EntityInfo entityInfo5 = new EntityInfo(avatar2, str2, str, (java.lang.String) null, contactUid, arrayList, (java.lang.Integer) null, (java.lang.Integer) null, (java.util.List) null, (JsonElement) null, 968, (DefaultConstructorMarker) null);
            c44176sGc = this;
            entityInfo = entityInfo5;
            baseDaoAEQbTJ = AEQbTJ();
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            inHouseIMContactManagerImpl$updateConversationEntityInfo$12 = inHouseIMContactManagerImpl$updateConversationEntityInfo$1;
            inHouseIMContactInfoEntity2 = inHouseIMContactInfoEntity;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            longRef2 = longRef;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44178sGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull InitContactReq initContactReq, @NotNull Continuation<? super InHouseIMContactInfoEntity> continuation) throws java.lang.Throwable {
        InHouseIMContactManagerImpl$initContact$1 inHouseIMContactManagerImpl$initContact$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof InHouseIMContactManagerImpl$initContact$1) {
            inHouseIMContactManagerImpl$initContact$1 = (InHouseIMContactManagerImpl$initContact$1) continuation;
            int i = inHouseIMContactManagerImpl$initContact$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactManagerImpl$initContact$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactManagerImpl$initContact$1 = new InHouseIMContactManagerImpl$initContact$1(this, continuation);
            }
        }
        java.lang.Object objInitRelation = inHouseIMContactManagerImpl$initContact$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactManagerImpl$initContact$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objInitRelation);
                InHouseIMRelationService inHouseIMRelationService = this.AEQbTJ;
                inHouseIMContactManagerImpl$initContact$1.label = 1;
                objInitRelation = inHouseIMRelationService.initRelation(initContactReq, inHouseIMContactManagerImpl$initContact$1);
                if (objInitRelation == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objInitRelation);
            }
            responseData = (ResponseData) objInitRelation;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                return (InHouseIMContactInfoEntity) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl();
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) stateListAnimator;
            C44124sEe.imLogContact$default("initContact failed: " + actionBar2.KWHzl(), null, 2, null);
            throw ((java.lang.Throwable) actionBar2.KWHzl());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44178sGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull AddContactReq addContactReq, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        InHouseIMContactManagerImpl$addContact$1 inHouseIMContactManagerImpl$addContact$1;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof InHouseIMContactManagerImpl$addContact$1) {
            inHouseIMContactManagerImpl$addContact$1 = (InHouseIMContactManagerImpl$addContact$1) continuation;
            int i = inHouseIMContactManagerImpl$addContact$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactManagerImpl$addContact$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactManagerImpl$addContact$1 = new InHouseIMContactManagerImpl$addContact$1(this, continuation);
            }
        }
        java.lang.Object objAddRelation = inHouseIMContactManagerImpl$addContact$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactManagerImpl$addContact$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAddRelation);
                InHouseIMRelationService inHouseIMRelationService = this.AEQbTJ;
                inHouseIMContactManagerImpl$addContact$1.label = 1;
                objAddRelation = inHouseIMRelationService.addRelation(addContactReq, inHouseIMContactManagerImpl$addContact$1);
                if (objAddRelation == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAddRelation);
            }
            responseData = (ResponseData) objAddRelation;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            return stateListAnimator.AEQbTJ();
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        return stateListAnimator.AEQbTJ();
    }

    /* JADX DEBUG: Duplicate block (B:92:0x0259) to fix multi-entry loop: BACK_EDGE: B:92:0x0259 -> B:16:0x0058 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:107:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:113:0x0058 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x0096 */
    /* JADX DEBUG: Type inference failed for r0v35. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v45. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r6v13. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0218: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:82:0x0217 */
    /* JADX WARN: Path cross not found for [B:43:0x00db, B:46:0x00ee], limit reached: 110 */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0231 A[Catch: all -> 0x0268, TRY_LEAVE, TryCatch #4 {all -> 0x0268, blocks: (B:14:0x004d, B:86:0x0224, B:88:0x0231, B:70:0x01f6, B:71:0x01f9, B:74:0x01fd, B:76:0x0203, B:78:0x020f, B:79:0x0212, B:80:0x0213, B:81:0x0216), top: B:103:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0270  */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v32, types: [T] */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v4, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Object, kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // o.InterfaceC44178sGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull RemoveContactReq removeContactReq, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        InHouseIMContactManagerImpl$removeContact$1 inHouseIMContactManagerImpl$removeContact$1;
        ?? r10;
        BaseDao baseDao;
        BaseDao baseDao2;
        C44176sGc c44176sGc;
        AbstractC43419rot actionBar;
        Ref.ObjectRef objectRef;
        RemoveContactReq removeContactReq2;
        ?? r15;
        int i;
        BaseDao baseDao3;
        InHouseIMContactManagerImpl$removeContact$1 inHouseIMContactManagerImpl$removeContact$12;
        int i2;
        java.lang.Object obj;
        ResponseData responseData;
        C44176sGc c44176sGc2;
        RemoveContactReq removeContactReq3;
        BaseDao baseDao4;
        ?? r8;
        int i3;
        int i4;
        int i5;
        ?? r0;
        int i6;
        int i7;
        ?? r82;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        ?? r152;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        long j;
        Ref.ObjectRef objectRef4;
        ?? r02;
        RemoveContactReq removeContactReq4 = removeContactReq;
        if (continuation instanceof InHouseIMContactManagerImpl$removeContact$1) {
            inHouseIMContactManagerImpl$removeContact$1 = (InHouseIMContactManagerImpl$removeContact$1) continuation;
            int i8 = inHouseIMContactManagerImpl$removeContact$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                inHouseIMContactManagerImpl$removeContact$1.label = i8 - Integer.MIN_VALUE;
            } else {
                inHouseIMContactManagerImpl$removeContact$1 = new InHouseIMContactManagerImpl$removeContact$1(this, continuation);
            }
        }
        java.lang.Object obj2 = inHouseIMContactManagerImpl$removeContact$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i9 = inHouseIMContactManagerImpl$removeContact$1.label;
        try {
            if (i9 == 0) {
                C56391yDq.AEQbTJ(obj2);
                try {
                    InHouseIMRelationService inHouseIMRelationService = this.AEQbTJ;
                    inHouseIMContactManagerImpl$removeContact$1.L$0 = this;
                    inHouseIMContactManagerImpl$removeContact$1.L$1 = removeContactReq4;
                    inHouseIMContactManagerImpl$removeContact$1.label = 1;
                    java.lang.Object objRemoveRelation = inHouseIMRelationService.removeRelation(removeContactReq4, inHouseIMContactManagerImpl$removeContact$1);
                    if (objRemoveRelation == objCopydefault) {
                        return objCopydefault;
                    }
                    c44176sGc = this;
                    obj = objRemoveRelation;
                    responseData = (ResponseData) obj;
                    if (responseData.getCode() != 0) {
                    }
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                } catch (java.lang.Throwable th) {
                    th = th;
                    c44176sGc = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            } else {
                if (i9 != 1) {
                    if (i9 == 2) {
                        j = inHouseIMContactManagerImpl$removeContact$1.J$0;
                        int i10 = inHouseIMContactManagerImpl$removeContact$1.I$2;
                        int i11 = inHouseIMContactManagerImpl$removeContact$1.I$1;
                        i = inHouseIMContactManagerImpl$removeContact$1.I$0;
                        objectRef2 = (Ref.ObjectRef) inHouseIMContactManagerImpl$removeContact$1.L$7;
                        Ref.LongRef longRef = (Ref.LongRef) inHouseIMContactManagerImpl$removeContact$1.L$6;
                        objectRef3 = (Ref.ObjectRef) inHouseIMContactManagerImpl$removeContact$1.L$5;
                        objectRef4 = (Ref.ObjectRef) inHouseIMContactManagerImpl$removeContact$1.L$4;
                        r10 = (Ref.LongRef) inHouseIMContactManagerImpl$removeContact$1.L$3;
                        baseDao2 = (BaseDao) inHouseIMContactManagerImpl$removeContact$1.L$2;
                        removeContactReq2 = (RemoveContactReq) inHouseIMContactManagerImpl$removeContact$1.L$1;
                        C44176sGc c44176sGc3 = (C44176sGc) inHouseIMContactManagerImpl$removeContact$1.L$0;
                        try {
                            try {
                                C56391yDq.AEQbTJ(obj2);
                                i5 = i11;
                                c44176sGc = c44176sGc3;
                                i4 = i10;
                                r02 = obj2;
                                r10 = r10;
                                r152 = longRef;
                            } catch (java.lang.IllegalStateException e3) {
                                e2 = e3;
                                message = e2.getMessage();
                                if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                    C44159sFm.OLrzqt(e2);
                                    throw e2;
                                }
                                C44159sFm.copydefault(e2);
                                throw e2;
                            } catch (java.lang.Exception e4) {
                                e = e4;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                C44159sFm.EZpvd(baseDao2, r10.element);
                                throw th;
                            }
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e5) {
                            c44176sGc2 = c44176sGc3;
                            i5 = i11;
                            objectRef = objectRef4;
                            r82 = r10;
                            removeContactReq3 = removeContactReq2;
                            i3 = i;
                            i4 = i10;
                            sQLiteDatabaseLockedException = e5;
                            baseDao4 = baseDao2;
                            r0 = sQLiteDatabaseLockedException;
                            r8 = r82;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                            objectRef.element = r0;
                            if (i4 < i3 - 1) {
                                inHouseIMContactManagerImpl$removeContact$1.L$0 = c44176sGc2;
                                inHouseIMContactManagerImpl$removeContact$1.L$1 = removeContactReq3;
                                inHouseIMContactManagerImpl$removeContact$1.L$2 = baseDao4;
                                inHouseIMContactManagerImpl$removeContact$1.L$3 = r8;
                                inHouseIMContactManagerImpl$removeContact$1.L$4 = objectRef;
                                inHouseIMContactManagerImpl$removeContact$1.L$5 = null;
                                inHouseIMContactManagerImpl$removeContact$1.L$6 = null;
                                inHouseIMContactManagerImpl$removeContact$1.L$7 = null;
                                inHouseIMContactManagerImpl$removeContact$1.I$0 = i3;
                                inHouseIMContactManagerImpl$removeContact$1.I$1 = i5;
                                inHouseIMContactManagerImpl$removeContact$1.label = 3;
                                if (DelayKt.delay(((long) (i4 + 1)) * 50, inHouseIMContactManagerImpl$removeContact$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                                i6 = i3;
                                removeContactReq2 = removeContactReq3;
                                c44176sGc = c44176sGc2;
                                i7 = 1;
                            } else {
                                i6 = i3;
                                removeContactReq2 = removeContactReq3;
                                c44176sGc = c44176sGc2;
                                i7 = 1;
                            }
                            r15 = r8;
                            inHouseIMContactManagerImpl$removeContact$12 = inHouseIMContactManagerImpl$removeContact$1;
                            baseDao3 = baseDao4;
                            i = i6;
                            i2 = i5 + i7;
                            if (i2 < i) {
                            }
                        }
                        objectRef2.element = r02;
                        r152.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                        java.lang.Object obj3 = objectRef3.element;
                        C44159sFm.EZpvd(baseDao2, r10.element);
                        return Unit.INSTANCE;
                    }
                    if (i9 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i12 = inHouseIMContactManagerImpl$removeContact$1.I$1;
                    int i13 = inHouseIMContactManagerImpl$removeContact$1.I$0;
                    objectRef = (Ref.ObjectRef) inHouseIMContactManagerImpl$removeContact$1.L$4;
                    r8 = (Ref.LongRef) inHouseIMContactManagerImpl$removeContact$1.L$3;
                    baseDao4 = (BaseDao) inHouseIMContactManagerImpl$removeContact$1.L$2;
                    RemoveContactReq removeContactReq5 = (RemoveContactReq) inHouseIMContactManagerImpl$removeContact$1.L$1;
                    C44176sGc c44176sGc4 = (C44176sGc) inHouseIMContactManagerImpl$removeContact$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    i5 = i12;
                    i6 = i13;
                    i7 = 1;
                    removeContactReq2 = removeContactReq5;
                    c44176sGc = c44176sGc4;
                    r15 = r8;
                    inHouseIMContactManagerImpl$removeContact$12 = inHouseIMContactManagerImpl$removeContact$1;
                    baseDao3 = baseDao4;
                    i = i6;
                    i2 = i5 + i7;
                    if (i2 < i) {
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                            i5 = i2;
                            removeContactReq3 = removeContactReq2;
                            r8 = r15;
                            c44176sGc2 = c44176sGc;
                            inHouseIMContactManagerImpl$removeContact$1 = inHouseIMContactManagerImpl$removeContact$12;
                            i3 = i;
                            baseDao4 = baseDao3;
                            i4 = i5;
                            r0 = e6;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                            objectRef.element = r0;
                            if (i4 < i3 - 1) {
                            }
                            r15 = r8;
                            inHouseIMContactManagerImpl$removeContact$12 = inHouseIMContactManagerImpl$removeContact$1;
                            baseDao3 = baseDao4;
                            i = i6;
                            i2 = i5 + i7;
                            if (i2 < i) {
                            }
                        } catch (java.lang.IllegalStateException e7) {
                            e2 = e7;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e8) {
                            e = e8;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            baseDao2 = baseDao3;
                            r10 = r15;
                            C44159sFm.EZpvd(baseDao2, r10.element);
                            throw th;
                        }
                        objectRef2 = new Ref.ObjectRef();
                        long jNanoTime = java.lang.System.nanoTime();
                        InHouseIMContactDao inHouseIMContactDaoKWHzl = c44176sGc.KWHzl();
                        java.util.List<java.lang.String> listEZpvd = C56402yEa.EZpvd(C33129mqd.gEmmrt(C56443yFo.KWHzl(removeContactReq2.getContactUid())));
                        ContactRelationType contactRelationType = ContactRelationType.STRANGER;
                        inHouseIMContactManagerImpl$removeContact$12.L$0 = c44176sGc;
                        inHouseIMContactManagerImpl$removeContact$12.L$1 = removeContactReq2;
                        inHouseIMContactManagerImpl$removeContact$12.L$2 = baseDao3;
                        inHouseIMContactManagerImpl$removeContact$12.L$3 = r15;
                        inHouseIMContactManagerImpl$removeContact$12.L$4 = objectRef;
                        inHouseIMContactManagerImpl$removeContact$12.L$5 = objectRef2;
                        inHouseIMContactManagerImpl$removeContact$12.L$6 = r15;
                        inHouseIMContactManagerImpl$removeContact$12.L$7 = objectRef2;
                        inHouseIMContactManagerImpl$removeContact$12.I$0 = i;
                        inHouseIMContactManagerImpl$removeContact$12.I$1 = i2;
                        inHouseIMContactManagerImpl$removeContact$12.I$2 = i2;
                        inHouseIMContactManagerImpl$removeContact$12.J$0 = jNanoTime;
                        inHouseIMContactManagerImpl$removeContact$12.label = 2;
                        java.lang.Object objUpdateRelationTypes = inHouseIMContactDaoKWHzl.updateRelationTypes(listEZpvd, contactRelationType, inHouseIMContactManagerImpl$removeContact$12);
                        if (objUpdateRelationTypes == objCopydefault) {
                            return objCopydefault;
                        }
                        baseDao2 = baseDao3;
                        i5 = i2;
                        i4 = i5;
                        inHouseIMContactManagerImpl$removeContact$1 = inHouseIMContactManagerImpl$removeContact$12;
                        objectRef4 = objectRef;
                        j = jNanoTime;
                        objectRef3 = objectRef2;
                        r10 = r15;
                        r02 = objUpdateRelationTypes;
                        r152 = r15;
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                            c44176sGc2 = c44176sGc;
                            objectRef = objectRef4;
                            r82 = r10;
                            removeContactReq3 = removeContactReq2;
                            i3 = i;
                            sQLiteDatabaseLockedException = e9;
                            baseDao4 = baseDao2;
                            r0 = sQLiteDatabaseLockedException;
                            r8 = r82;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                            objectRef.element = r0;
                            if (i4 < i3 - 1) {
                            }
                            r15 = r8;
                            inHouseIMContactManagerImpl$removeContact$12 = inHouseIMContactManagerImpl$removeContact$1;
                            baseDao3 = baseDao4;
                            i = i6;
                            i2 = i5 + i7;
                            if (i2 < i) {
                            }
                        }
                        objectRef2.element = r02;
                        r152.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                        java.lang.Object obj32 = objectRef3.element;
                        C44159sFm.EZpvd(baseDao2, r10.element);
                        return Unit.INSTANCE;
                    }
                    C44159sFm.EZpvd(baseDao3, r15.element);
                    java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                    if (exc == null) {
                        exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                    }
                    C44159sFm.OLrzqt(exc);
                    throw exc;
                }
                removeContactReq4 = (RemoveContactReq) inHouseIMContactManagerImpl$removeContact$1.L$1;
                c44176sGc = (C44176sGc) inHouseIMContactManagerImpl$removeContact$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj2);
                    obj = obj2;
                    responseData = (ResponseData) obj;
                    if (responseData.getCode() != 0 && responseData.getData() != null) {
                        java.lang.Object data = responseData.getData();
                        Intrinsics.copydefault(data);
                        actionBar = new AbstractC43419rot.StateListAnimator(data);
                    } else {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            }
            if (actionBar instanceof AbstractC43419rot.ActionBar) {
                C44124sEe.imLogContact$default("removeContact failed: " + ((OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()).getMessage(), null, 2, null);
            }
            actionBar.AEQbTJ();
            InHouseIMContactDao inHouseIMContactDaoKWHzl2 = c44176sGc.KWHzl();
            Ref.LongRef longRef2 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            removeContactReq2 = removeContactReq4;
            r15 = longRef2;
            i = 3;
            baseDao3 = inHouseIMContactDaoKWHzl2;
            inHouseIMContactManagerImpl$removeContact$12 = inHouseIMContactManagerImpl$removeContact$1;
            i2 = 0;
            if (i2 < i) {
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            r10 = "Error: ";
            baseDao2 = baseDao;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:109:0x0372 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:158:0x0465 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:160:0x0468 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:168:0x0479 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x0109 */
    /* JADX DEBUG: Type inference failed for r0v46. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v60. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v86. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v98. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r11v21. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r1v6. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:60:0x01b0, B:63:0x01c3], limit reached: 230 */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0394 A[Catch: all -> 0x0065, TryCatch #2 {all -> 0x0065, blocks: (B:14:0x0060, B:119:0x0385, B:120:0x0388, B:123:0x038e, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03a2, B:130:0x03a5, B:132:0x03b1, B:134:0x03be), top: B:210:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03be A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #2 {all -> 0x0065, blocks: (B:14:0x0060, B:119:0x0385, B:120:0x0388, B:123:0x038e, B:125:0x0394, B:127:0x039e, B:128:0x03a1, B:129:0x03a2, B:130:0x03a5, B:132:0x03b1, B:134:0x03be), top: B:210:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x048a A[Catch: all -> 0x0109, TryCatch #18 {all -> 0x0109, blocks: (B:32:0x00fc, B:170:0x047c, B:171:0x047f, B:173:0x0484, B:175:0x048a, B:177:0x0494, B:178:0x0497, B:179:0x0498, B:180:0x049b), top: B:210:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04c2 A[Catch: all -> 0x0507, TRY_LEAVE, TryCatch #16 {all -> 0x0507, blocks: (B:184:0x04b5, B:186:0x04c2), top: B:217:0x04b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0241 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0331  */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v114 */
    /* JADX WARN: Type inference failed for: r0v115 */
    /* JADX WARN: Type inference failed for: r0v116 */
    /* JADX WARN: Type inference failed for: r0v31, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v37, types: [T] */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v74, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v80, types: [T] */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v3, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v34, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15, types: [com.okinc.okimcore.common.database.BaseDao, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:137:0x03ec -> B:138:0x03f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:140:0x03ff -> B:139:0x03f9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:187:0x04e9 -> B:189:0x04ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:190:0x04f8 -> B:189:0x04ec). Please report as a decompilation issue!!! */
    @Override // o.InterfaceC44178sGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull SetContactRemarkReq setContactRemarkReq, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        InHouseIMContactManagerImpl$setContactRemark$1 inHouseIMContactManagerImpl$setContactRemark$1;
        ?? r2;
        ?? r15;
        Ref.LongRef longRef;
        ?? r22;
        C44176sGc c44176sGc;
        java.lang.Object relationRemark;
        AbstractC43419rot actionBar;
        Ref.LongRef longRef2;
        Ref.ObjectRef objectRef;
        int i;
        InHouseIMContactManagerImpl$setContactRemark$1 inHouseIMContactManagerImpl$setContactRemark$12;
        java.lang.String str;
        Unit unit;
        SetContactRemarkReq setContactRemarkReq2;
        int i2;
        java.lang.Object obj;
        ResponseData responseData;
        int i3;
        int i4;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef2;
        int i5;
        java.lang.String str2;
        int i6;
        Ref.ObjectRef objectRef3;
        java.lang.String str3;
        Unit unit2;
        SetContactRemarkReq setContactRemarkReq3;
        C44176sGc c44176sGc2;
        java.lang.String str4;
        int i7;
        Ref.ObjectRef objectRef4;
        Ref.LongRef longRef4;
        ?? r23;
        SetContactRemarkReq setContactRemarkReq4;
        java.lang.String str5;
        java.lang.String str6;
        long jNanoTime;
        ?? r7;
        java.lang.String message;
        ?? r0;
        ?? r02;
        Ref.LongRef longRef5;
        Ref.ObjectRef objectRef5;
        java.lang.String str7;
        int i8;
        int i9;
        BaseDao baseDao;
        int i10;
        java.lang.String str8;
        ?? r8;
        int i11;
        int i12;
        Ref.ObjectRef objectRef6;
        int i13;
        java.lang.String str9;
        BaseDao baseDao2;
        C44176sGc c44176sGc3;
        int i14;
        Ref.ObjectRef objectRef7;
        Ref.LongRef longRef6;
        java.lang.String str10;
        Unit unit3;
        Ref.LongRef longRef7;
        BaseDao baseDao3;
        C44176sGc c44176sGc4;
        Ref.ObjectRef objectRef8;
        java.lang.String str11;
        java.lang.String str12;
        long jNanoTime2;
        java.lang.String str13;
        java.lang.String message2;
        Ref.LongRef longRef8;
        BaseDao baseDao4;
        ?? r03;
        InHouseIMContactManagerImpl$setContactRemark$1 inHouseIMContactManagerImpl$setContactRemark$13;
        int i15;
        BaseDao baseDao5;
        int i16;
        java.lang.String str14;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        Ref.LongRef longRef9;
        ?? r04;
        InHouseIMContactInfoEntity inHouseIMContactInfoEntity;
        C44176sGc c44176sGc5;
        java.lang.String str15;
        Ref.LongRef longRef10;
        Ref.LongRef longRef11;
        BaseDao baseDao6;
        int i17;
        ?? r6;
        SetContactRemarkReq setContactRemarkReq5 = setContactRemarkReq;
        if (!(continuation instanceof InHouseIMContactManagerImpl$setContactRemark$1) || (r6 = (i17 = (inHouseIMContactManagerImpl$setContactRemark$1 = (InHouseIMContactManagerImpl$setContactRemark$1) continuation).label) & Integer.MIN_VALUE) == 0) {
            inHouseIMContactManagerImpl$setContactRemark$1 = new InHouseIMContactManagerImpl$setContactRemark$1(this, continuation);
        } else {
            inHouseIMContactManagerImpl$setContactRemark$1.label = i17 - Integer.MIN_VALUE;
        }
        java.lang.Object obj2 = inHouseIMContactManagerImpl$setContactRemark$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i18 = inHouseIMContactManagerImpl$setContactRemark$1.label;
        ?? r82 = AbstractC43419rot.TAG;
        java.lang.String str16 = "Database Operation failed after ";
        java.lang.String str17 = " attempts";
        java.lang.String str18 = "not open";
        try {
            try {
                switch (i18) {
                    case 0:
                        C56391yDq.AEQbTJ(obj2);
                        try {
                            InHouseIMRelationService inHouseIMRelationService = this.AEQbTJ;
                            inHouseIMContactManagerImpl$setContactRemark$1.L$0 = this;
                            inHouseIMContactManagerImpl$setContactRemark$1.L$1 = setContactRemarkReq5;
                            inHouseIMContactManagerImpl$setContactRemark$1.label = 1;
                            relationRemark = inHouseIMRelationService.setRelationRemark(setContactRemarkReq5, inHouseIMContactManagerImpl$setContactRemark$1);
                            break;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            c44176sGc = this;
                            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                        }
                        if (relationRemark == objCopydefault) {
                            return objCopydefault;
                        }
                        c44176sGc = this;
                        obj = relationRemark;
                        responseData = (ResponseData) obj;
                        if (responseData.getCode() != 0 && responseData.getData() != null) {
                            java.lang.Object data = responseData.getData();
                            Intrinsics.copydefault(data);
                            actionBar = new AbstractC43419rot.StateListAnimator(data);
                        } else {
                            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                        }
                        if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
                            ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
                            Unit unit4 = Unit.INSTANCE;
                            java.lang.String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.KWHzl(setContactRemarkReq5.getContactUid()));
                            InHouseIMContactDao inHouseIMContactDaoKWHzl = c44176sGc.KWHzl();
                            longRef2 = new Ref.LongRef();
                            objectRef = new Ref.ObjectRef();
                            i = 3;
                            inHouseIMContactManagerImpl$setContactRemark$12 = inHouseIMContactManagerImpl$setContactRemark$1;
                            str = strGEmmrt;
                            unit = unit4;
                            setContactRemarkReq2 = setContactRemarkReq5;
                            i2 = 0;
                            r7 = inHouseIMContactDaoKWHzl;
                            if (i2 < i) {
                                try {
                                    try {
                                    } catch (java.lang.IllegalStateException e) {
                                        e = e;
                                        java.lang.String str19 = str18;
                                        message = e.getMessage();
                                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) str19, false, 2, (java.lang.Object) null)) {
                                            C44159sFm.OLrzqt(e);
                                            throw e;
                                        }
                                        C44159sFm.copydefault(e);
                                        throw e;
                                    } catch (java.lang.Exception e2) {
                                        e = e2;
                                        C44159sFm.OLrzqt(e);
                                        throw e;
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        r22 = r7;
                                        longRef = longRef2;
                                        C44159sFm.EZpvd(r22, longRef.element);
                                        throw th;
                                    }
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                                    e = e3;
                                    i10 = i2;
                                    str4 = str16;
                                    str8 = str17;
                                }
                                Ref.ObjectRef objectRef9 = new Ref.ObjectRef();
                                str8 = str17;
                                try {
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e4) {
                                    e = e4;
                                    i10 = i2;
                                    str4 = str16;
                                }
                                jNanoTime = java.lang.System.nanoTime();
                                InHouseIMContactDao inHouseIMContactDaoKWHzl2 = c44176sGc.KWHzl();
                                str4 = str16;
                                try {
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e5) {
                                    e = e5;
                                    i10 = i2;
                                }
                                java.lang.String remarkName = setContactRemarkReq2.getRemarkName();
                                inHouseIMContactManagerImpl$setContactRemark$12.L$0 = c44176sGc;
                                inHouseIMContactManagerImpl$setContactRemark$12.L$1 = setContactRemarkReq2;
                                inHouseIMContactManagerImpl$setContactRemark$12.L$2 = unit;
                                inHouseIMContactManagerImpl$setContactRemark$12.L$3 = str;
                                inHouseIMContactManagerImpl$setContactRemark$12.L$4 = r7;
                                inHouseIMContactManagerImpl$setContactRemark$12.L$5 = longRef2;
                                inHouseIMContactManagerImpl$setContactRemark$12.L$6 = objectRef;
                                inHouseIMContactManagerImpl$setContactRemark$12.L$7 = objectRef9;
                                inHouseIMContactManagerImpl$setContactRemark$12.L$8 = longRef2;
                                inHouseIMContactManagerImpl$setContactRemark$12.L$9 = objectRef9;
                                inHouseIMContactManagerImpl$setContactRemark$12.I$0 = i;
                                inHouseIMContactManagerImpl$setContactRemark$12.I$1 = i2;
                                inHouseIMContactManagerImpl$setContactRemark$12.I$2 = i2;
                                inHouseIMContactManagerImpl$setContactRemark$12.J$0 = jNanoTime;
                                i10 = i2;
                                try {
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                                    try {
                                        e = e6;
                                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                                        objectRef3.element = r0;
                                        if (i7 < i6 - 1) {
                                            inHouseIMContactManagerImpl$setContactRemark$1.L$0 = c44176sGc2;
                                            inHouseIMContactManagerImpl$setContactRemark$1.L$1 = setContactRemarkReq3;
                                            inHouseIMContactManagerImpl$setContactRemark$1.L$2 = unit2;
                                            inHouseIMContactManagerImpl$setContactRemark$1.L$3 = str3;
                                            inHouseIMContactManagerImpl$setContactRemark$1.L$4 = r82;
                                            inHouseIMContactManagerImpl$setContactRemark$1.L$5 = longRef;
                                            inHouseIMContactManagerImpl$setContactRemark$1.L$6 = objectRef3;
                                            inHouseIMContactManagerImpl$setContactRemark$1.L$7 = null;
                                            inHouseIMContactManagerImpl$setContactRemark$1.L$8 = null;
                                            inHouseIMContactManagerImpl$setContactRemark$1.L$9 = null;
                                            inHouseIMContactManagerImpl$setContactRemark$1.I$0 = i6;
                                            inHouseIMContactManagerImpl$setContactRemark$1.I$1 = i3;
                                            inHouseIMContactManagerImpl$setContactRemark$1.label = 3;
                                            r8 = r82;
                                            if (DelayKt.delay(((long) (i7 + 1)) * 50, inHouseIMContactManagerImpl$setContactRemark$1) == objCopydefault) {
                                                return objCopydefault;
                                            }
                                        } else {
                                            r8 = r82;
                                        }
                                        InHouseIMContactManagerImpl$setContactRemark$1 inHouseIMContactManagerImpl$setContactRemark$14 = inHouseIMContactManagerImpl$setContactRemark$1;
                                        setContactRemarkReq2 = setContactRemarkReq3;
                                        longRef2 = longRef;
                                        Unit unit5 = unit2;
                                        i = i6;
                                        c44176sGc = c44176sGc2;
                                        objectRef = objectRef3;
                                        unit = unit5;
                                        i2 = i3 + 1;
                                        r7 = r8;
                                        str = str3;
                                        str16 = str4;
                                        inHouseIMContactManagerImpl$setContactRemark$12 = inHouseIMContactManagerImpl$setContactRemark$14;
                                        if (i2 < i) {
                                        }
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        Ref.LongRef longRef12 = longRef;
                                        longRef = longRef12;
                                        r22 = r82;
                                        C44159sFm.EZpvd(r22, longRef.element);
                                        throw th;
                                    }
                                    longRef = longRef2;
                                    str17 = str8;
                                    i7 = i10;
                                    setContactRemarkReq3 = setContactRemarkReq2;
                                    inHouseIMContactManagerImpl$setContactRemark$1 = inHouseIMContactManagerImpl$setContactRemark$12;
                                    str3 = str;
                                    r82 = r7;
                                    i3 = i7;
                                    Ref.ObjectRef objectRef10 = objectRef;
                                    c44176sGc2 = c44176sGc;
                                    i6 = i;
                                    unit2 = unit;
                                    objectRef3 = objectRef10;
                                    r0 = e;
                                }
                                inHouseIMContactManagerImpl$setContactRemark$12.label = 2;
                                java.lang.Object objUpdateRemarkName = inHouseIMContactDaoKWHzl2.updateRemarkName(str, remarkName, inHouseIMContactManagerImpl$setContactRemark$12);
                                if (objUpdateRemarkName == objCopydefault) {
                                    return objCopydefault;
                                }
                                setContactRemarkReq4 = setContactRemarkReq2;
                                r23 = r7;
                                longRef4 = longRef2;
                                str16 = str4;
                                i3 = i10;
                                str2 = str;
                                i4 = i;
                                longRef3 = longRef4;
                                objectRef2 = objectRef9;
                                str5 = str18;
                                str6 = str8;
                                i5 = i3;
                                r02 = objUpdateRemarkName;
                                objectRef4 = objectRef2;
                                try {
                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e7) {
                                    setContactRemarkReq3 = setContactRemarkReq4;
                                    longRef = longRef4;
                                    unit2 = unit;
                                    inHouseIMContactManagerImpl$setContactRemark$1 = inHouseIMContactManagerImpl$setContactRemark$12;
                                    objectRef3 = objectRef;
                                    str17 = str6;
                                    str3 = str2;
                                    str18 = str5;
                                    c44176sGc2 = c44176sGc;
                                    i6 = i4;
                                    str4 = str16;
                                    r82 = r23;
                                    i7 = i5;
                                    r0 = e7;
                                    C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                                    objectRef3.element = r0;
                                    if (i7 < i6 - 1) {
                                    }
                                    InHouseIMContactManagerImpl$setContactRemark$1 inHouseIMContactManagerImpl$setContactRemark$142 = inHouseIMContactManagerImpl$setContactRemark$1;
                                    setContactRemarkReq2 = setContactRemarkReq3;
                                    longRef2 = longRef;
                                    Unit unit52 = unit2;
                                    i = i6;
                                    c44176sGc = c44176sGc2;
                                    objectRef = objectRef3;
                                    unit = unit52;
                                    i2 = i3 + 1;
                                    r7 = r8;
                                    str = str3;
                                    str16 = str4;
                                    inHouseIMContactManagerImpl$setContactRemark$12 = inHouseIMContactManagerImpl$setContactRemark$142;
                                    if (i2 < i) {
                                    }
                                } catch (java.lang.IllegalStateException e8) {
                                    e = e8;
                                    r7 = r23;
                                    longRef2 = longRef4;
                                    str18 = str5;
                                    java.lang.String str192 = str18;
                                    message = e.getMessage();
                                    if (message == null) {
                                    }
                                    C44159sFm.copydefault(e);
                                    throw e;
                                } catch (java.lang.Exception e9) {
                                    e = e9;
                                    r7 = r23;
                                    longRef2 = longRef4;
                                    C44159sFm.OLrzqt(e);
                                    throw e;
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    longRef = longRef4;
                                    r22 = r23;
                                    C44159sFm.EZpvd(r22, longRef.element);
                                    throw th;
                                }
                                objectRef4.element = r02;
                                longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                                java.lang.Object obj3 = objectRef2.element;
                                C44159sFm.EZpvd(r23, longRef4.element);
                                InHouseIMContactDao inHouseIMContactDaoKWHzl3 = c44176sGc.KWHzl();
                                longRef5 = new Ref.LongRef();
                                objectRef5 = new Ref.ObjectRef();
                                str17 = str6;
                                str7 = str2;
                                str18 = str5;
                                i8 = 0;
                                i9 = 3;
                                baseDao = inHouseIMContactDaoKWHzl3;
                                if (i8 < i9) {
                                    try {
                                        try {
                                        } catch (java.lang.IllegalStateException e10) {
                                            e = e10;
                                            str13 = str18;
                                            message2 = e.getMessage();
                                            if (message2 == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message2, (java.lang.CharSequence) str13, false, 2, (java.lang.Object) null)) {
                                                C44159sFm.OLrzqt(e);
                                                throw e;
                                            }
                                            C44159sFm.copydefault(e);
                                            throw e;
                                        } catch (java.lang.Exception e11) {
                                            e = e11;
                                            C44159sFm.OLrzqt(e);
                                            throw e;
                                        } catch (java.lang.Throwable th5) {
                                            th = th5;
                                            r2 = baseDao;
                                            r15 = longRef5;
                                            C44159sFm.EZpvd(r2, r15.element);
                                            throw th;
                                        }
                                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e12) {
                                        e = e12;
                                        c44176sGc5 = c44176sGc;
                                        str15 = str17;
                                    }
                                    Ref.ObjectRef objectRef11 = new Ref.ObjectRef();
                                    str15 = str17;
                                    try {
                                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e13) {
                                        e = e13;
                                        c44176sGc5 = c44176sGc;
                                    }
                                    jNanoTime2 = java.lang.System.nanoTime();
                                    InHouseIMContactDao inHouseIMContactDaoKWHzl4 = c44176sGc.KWHzl();
                                    inHouseIMContactManagerImpl$setContactRemark$12.L$0 = c44176sGc;
                                    inHouseIMContactManagerImpl$setContactRemark$12.L$1 = unit;
                                    inHouseIMContactManagerImpl$setContactRemark$12.L$2 = str7;
                                    inHouseIMContactManagerImpl$setContactRemark$12.L$3 = baseDao;
                                    inHouseIMContactManagerImpl$setContactRemark$12.L$4 = longRef5;
                                    inHouseIMContactManagerImpl$setContactRemark$12.L$5 = objectRef5;
                                    inHouseIMContactManagerImpl$setContactRemark$12.L$6 = objectRef11;
                                    inHouseIMContactManagerImpl$setContactRemark$12.L$7 = longRef5;
                                    inHouseIMContactManagerImpl$setContactRemark$12.L$8 = objectRef11;
                                    c44176sGc5 = c44176sGc;
                                    try {
                                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e14) {
                                        e = e14;
                                        unit3 = unit;
                                        str17 = str15;
                                        i14 = i9;
                                        objectRef7 = objectRef5;
                                        c44176sGc3 = c44176sGc5;
                                        baseDao4 = baseDao;
                                        str10 = str7;
                                        inHouseIMContactManagerImpl$setContactRemark$1 = inHouseIMContactManagerImpl$setContactRemark$12;
                                        longRef8 = longRef5;
                                        i11 = i8;
                                        r03 = e;
                                        C44159sFm.copydefault(r03, (java.lang.Exception) objectRef7.element);
                                        objectRef7.element = r03;
                                        if (i8 < i14 - 1) {
                                            java.lang.String str20 = str16;
                                            java.lang.String str21 = str17;
                                            inHouseIMContactManagerImpl$setContactRemark$1.L$0 = c44176sGc3;
                                            inHouseIMContactManagerImpl$setContactRemark$1.L$1 = unit3;
                                            inHouseIMContactManagerImpl$setContactRemark$1.L$2 = str10;
                                            inHouseIMContactManagerImpl$setContactRemark$1.L$3 = baseDao4;
                                            inHouseIMContactManagerImpl$setContactRemark$1.L$4 = longRef8;
                                            inHouseIMContactManagerImpl$setContactRemark$1.L$5 = objectRef7;
                                            inHouseIMContactManagerImpl$setContactRemark$1.L$6 = null;
                                            inHouseIMContactManagerImpl$setContactRemark$1.L$7 = null;
                                            inHouseIMContactManagerImpl$setContactRemark$1.L$8 = null;
                                            inHouseIMContactManagerImpl$setContactRemark$1.L$9 = null;
                                            inHouseIMContactManagerImpl$setContactRemark$1.I$0 = i14;
                                            inHouseIMContactManagerImpl$setContactRemark$1.I$1 = i11;
                                            inHouseIMContactManagerImpl$setContactRemark$1.label = 5;
                                            if (DelayKt.delay(((long) (i8 + 1)) * 50, inHouseIMContactManagerImpl$setContactRemark$1) == objCopydefault) {
                                                return objCopydefault;
                                            }
                                            str16 = str20;
                                            str17 = str21;
                                            i16 = i11;
                                            str14 = str10;
                                            baseDao6 = baseDao4;
                                            longRef11 = longRef8;
                                            inHouseIMContactManagerImpl$setContactRemark$13 = inHouseIMContactManagerImpl$setContactRemark$1;
                                            baseDao5 = baseDao6;
                                            str7 = str14;
                                            objectRef5 = objectRef7;
                                            unit = unit3;
                                            i11 = i16;
                                            i15 = 1;
                                            longRef10 = longRef11;
                                            C44176sGc c44176sGc6 = c44176sGc3;
                                            i9 = i14;
                                            c44176sGc = c44176sGc6;
                                            i8 = i11 + i15;
                                            longRef5 = longRef10;
                                            inHouseIMContactManagerImpl$setContactRemark$12 = inHouseIMContactManagerImpl$setContactRemark$13;
                                            baseDao = baseDao5;
                                            if (i8 < i9) {
                                            }
                                        } else {
                                            inHouseIMContactManagerImpl$setContactRemark$13 = inHouseIMContactManagerImpl$setContactRemark$1;
                                            objectRef5 = objectRef7;
                                            i15 = 1;
                                            str7 = str10;
                                            baseDao5 = baseDao4;
                                            unit = unit3;
                                            longRef10 = longRef8;
                                            C44176sGc c44176sGc62 = c44176sGc3;
                                            i9 = i14;
                                            c44176sGc = c44176sGc62;
                                            i8 = i11 + i15;
                                            longRef5 = longRef10;
                                            inHouseIMContactManagerImpl$setContactRemark$12 = inHouseIMContactManagerImpl$setContactRemark$13;
                                            baseDao = baseDao5;
                                            if (i8 < i9) {
                                            }
                                        }
                                    }
                                    inHouseIMContactManagerImpl$setContactRemark$12.L$9 = null;
                                    inHouseIMContactManagerImpl$setContactRemark$12.I$0 = i9;
                                    inHouseIMContactManagerImpl$setContactRemark$12.I$1 = i8;
                                    inHouseIMContactManagerImpl$setContactRemark$12.I$2 = i8;
                                    inHouseIMContactManagerImpl$setContactRemark$12.J$0 = jNanoTime2;
                                    inHouseIMContactManagerImpl$setContactRemark$12.label = 4;
                                    java.lang.Object contactEntityById = inHouseIMContactDaoKWHzl4.getContactEntityById(str7, inHouseIMContactManagerImpl$setContactRemark$12);
                                    if (contactEntityById == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    objectRef6 = objectRef11;
                                    str9 = str7;
                                    str11 = str18;
                                    c44176sGc4 = c44176sGc5;
                                    i13 = i8;
                                    r04 = contactEntityById;
                                    str12 = str15;
                                    i12 = i9;
                                    objectRef8 = objectRef6;
                                    Ref.LongRef longRef13 = longRef5;
                                    baseDao3 = baseDao;
                                    longRef7 = longRef13;
                                    i11 = i13;
                                    longRef9 = longRef13;
                                    try {
                                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e15) {
                                        c44176sGc3 = c44176sGc4;
                                        unit3 = unit;
                                        i14 = i12;
                                        inHouseIMContactManagerImpl$setContactRemark$1 = inHouseIMContactManagerImpl$setContactRemark$12;
                                        objectRef7 = objectRef5;
                                        str17 = str12;
                                        str18 = str11;
                                        longRef6 = longRef7;
                                        baseDao2 = baseDao3;
                                        str10 = str9;
                                        sQLiteDatabaseLockedException = e15;
                                        i8 = i13;
                                        r03 = sQLiteDatabaseLockedException;
                                        baseDao4 = baseDao2;
                                        longRef8 = longRef6;
                                        C44159sFm.copydefault(r03, (java.lang.Exception) objectRef7.element);
                                        objectRef7.element = r03;
                                        if (i8 < i14 - 1) {
                                        }
                                    } catch (java.lang.IllegalStateException e16) {
                                        e = e16;
                                        str13 = str11;
                                        message2 = e.getMessage();
                                        if (message2 == null) {
                                        }
                                        C44159sFm.copydefault(e);
                                        throw e;
                                    } catch (java.lang.Exception e17) {
                                        e = e17;
                                        C44159sFm.OLrzqt(e);
                                        throw e;
                                    } catch (java.lang.Throwable th6) {
                                        th = th6;
                                        r15 = longRef7;
                                        r2 = baseDao3;
                                        C44159sFm.EZpvd(r2, r15.element);
                                        throw th;
                                    }
                                    objectRef8.element = r04;
                                    longRef9.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime2, DurationUnit.NANOSECONDS));
                                    java.lang.Object obj4 = objectRef6.element;
                                    C44159sFm.EZpvd(baseDao3, longRef7.element);
                                    inHouseIMContactInfoEntity = (InHouseIMContactInfoEntity) obj4;
                                    if (inHouseIMContactInfoEntity != null) {
                                        inHouseIMContactManagerImpl$setContactRemark$12.L$0 = unit;
                                        inHouseIMContactManagerImpl$setContactRemark$12.L$1 = null;
                                        inHouseIMContactManagerImpl$setContactRemark$12.L$2 = null;
                                        inHouseIMContactManagerImpl$setContactRemark$12.L$3 = null;
                                        inHouseIMContactManagerImpl$setContactRemark$12.L$4 = null;
                                        inHouseIMContactManagerImpl$setContactRemark$12.L$5 = null;
                                        inHouseIMContactManagerImpl$setContactRemark$12.L$6 = null;
                                        inHouseIMContactManagerImpl$setContactRemark$12.L$7 = null;
                                        inHouseIMContactManagerImpl$setContactRemark$12.L$8 = null;
                                        inHouseIMContactManagerImpl$setContactRemark$12.label = 6;
                                        if (c44176sGc4.KWHzl(inHouseIMContactInfoEntity, inHouseIMContactManagerImpl$setContactRemark$12) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                        Unit unit6 = Unit.INSTANCE;
                                    }
                                    return Unit.INSTANCE;
                                }
                                java.lang.String str22 = str17;
                                C44159sFm.EZpvd(baseDao, longRef5.element);
                                java.lang.Exception exc = (java.lang.Exception) objectRef5.element;
                                if (exc == null) {
                                    exc = new java.lang.Exception(str16 + i9 + str22);
                                }
                                C44159sFm.OLrzqt(exc);
                                throw exc;
                            }
                            java.lang.String str23 = str16;
                            java.lang.String str24 = str17;
                            C44159sFm.EZpvd(r7, longRef2.element);
                            java.lang.Exception exc2 = (java.lang.Exception) objectRef.element;
                            if (exc2 == null) {
                                exc2 = new java.lang.Exception(str23 + i + str24);
                            }
                            C44159sFm.OLrzqt(exc2);
                            throw exc2;
                        }
                        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
                        C44124sEe.imLogContact$default("setContactRemark failed: " + actionBar2.KWHzl(), null, 2, null);
                        actionBar2.KWHzl();
                        return null;
                    case 1:
                        setContactRemarkReq5 = (SetContactRemarkReq) inHouseIMContactManagerImpl$setContactRemark$1.L$1;
                        c44176sGc = (C44176sGc) inHouseIMContactManagerImpl$setContactRemark$1.L$0;
                        try {
                            C56391yDq.AEQbTJ(obj2);
                            obj = obj2;
                            responseData = (ResponseData) obj;
                            if (responseData.getCode() != 0) {
                            }
                            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                        }
                        if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
                        }
                        break;
                    case 2:
                        long j = inHouseIMContactManagerImpl$setContactRemark$1.J$0;
                        int i19 = inHouseIMContactManagerImpl$setContactRemark$1.I$2;
                        i3 = inHouseIMContactManagerImpl$setContactRemark$1.I$1;
                        i4 = inHouseIMContactManagerImpl$setContactRemark$1.I$0;
                        Ref.ObjectRef objectRef12 = (Ref.ObjectRef) inHouseIMContactManagerImpl$setContactRemark$1.L$9;
                        longRef3 = (Ref.LongRef) inHouseIMContactManagerImpl$setContactRemark$1.L$8;
                        objectRef2 = (Ref.ObjectRef) inHouseIMContactManagerImpl$setContactRemark$1.L$7;
                        objectRef = (Ref.ObjectRef) inHouseIMContactManagerImpl$setContactRemark$1.L$6;
                        longRef = (Ref.LongRef) inHouseIMContactManagerImpl$setContactRemark$1.L$5;
                        i5 = i19;
                        BaseDao baseDao7 = (BaseDao) inHouseIMContactManagerImpl$setContactRemark$1.L$4;
                        str2 = (java.lang.String) inHouseIMContactManagerImpl$setContactRemark$1.L$3;
                        Unit unit7 = (Unit) inHouseIMContactManagerImpl$setContactRemark$1.L$2;
                        SetContactRemarkReq setContactRemarkReq6 = (SetContactRemarkReq) inHouseIMContactManagerImpl$setContactRemark$1.L$1;
                        C44176sGc c44176sGc7 = (C44176sGc) inHouseIMContactManagerImpl$setContactRemark$1.L$0;
                        try {
                            C56391yDq.AEQbTJ(obj2);
                            objectRef4 = objectRef12;
                            inHouseIMContactManagerImpl$setContactRemark$12 = inHouseIMContactManagerImpl$setContactRemark$1;
                            longRef4 = longRef;
                            r23 = baseDao7;
                            setContactRemarkReq4 = setContactRemarkReq6;
                            c44176sGc = c44176sGc7;
                            unit = unit7;
                            str5 = "not open";
                            str6 = " attempts";
                            jNanoTime = j;
                            r02 = obj2;
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e18) {
                            i6 = i4;
                            objectRef3 = objectRef;
                            str3 = str2;
                            unit2 = unit7;
                            setContactRemarkReq3 = setContactRemarkReq6;
                            r82 = baseDao7;
                            c44176sGc2 = c44176sGc7;
                            str4 = "Database Operation failed after ";
                            i7 = i5;
                            r0 = e18;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                            objectRef3.element = r0;
                            if (i7 < i6 - 1) {
                            }
                            InHouseIMContactManagerImpl$setContactRemark$1 inHouseIMContactManagerImpl$setContactRemark$1422 = inHouseIMContactManagerImpl$setContactRemark$1;
                            setContactRemarkReq2 = setContactRemarkReq3;
                            longRef2 = longRef;
                            Unit unit522 = unit2;
                            i = i6;
                            c44176sGc = c44176sGc2;
                            objectRef = objectRef3;
                            unit = unit522;
                            i2 = i3 + 1;
                            r7 = r8;
                            str = str3;
                            str16 = str4;
                            inHouseIMContactManagerImpl$setContactRemark$12 = inHouseIMContactManagerImpl$setContactRemark$1422;
                            if (i2 < i) {
                            }
                        } catch (java.lang.IllegalStateException e19) {
                            e = e19;
                            java.lang.String str1922 = str18;
                            message = e.getMessage();
                            if (message == null) {
                                break;
                            }
                            C44159sFm.copydefault(e);
                            throw e;
                        } catch (java.lang.Exception e20) {
                            e = e20;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            r22 = baseDao7;
                            C44159sFm.EZpvd(r22, longRef.element);
                            throw th;
                        }
                        objectRef4.element = r02;
                        longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                        java.lang.Object obj32 = objectRef2.element;
                        C44159sFm.EZpvd(r23, longRef4.element);
                        InHouseIMContactDao inHouseIMContactDaoKWHzl32 = c44176sGc.KWHzl();
                        longRef5 = new Ref.LongRef();
                        objectRef5 = new Ref.ObjectRef();
                        str17 = str6;
                        str7 = str2;
                        str18 = str5;
                        i8 = 0;
                        i9 = 3;
                        baseDao = inHouseIMContactDaoKWHzl32;
                        if (i8 < i9) {
                        }
                        break;
                    case 3:
                        int i20 = inHouseIMContactManagerImpl$setContactRemark$1.I$1;
                        i6 = inHouseIMContactManagerImpl$setContactRemark$1.I$0;
                        objectRef3 = (Ref.ObjectRef) inHouseIMContactManagerImpl$setContactRemark$1.L$6;
                        Ref.LongRef longRef14 = (Ref.LongRef) inHouseIMContactManagerImpl$setContactRemark$1.L$5;
                        BaseDao baseDao8 = (BaseDao) inHouseIMContactManagerImpl$setContactRemark$1.L$4;
                        str3 = (java.lang.String) inHouseIMContactManagerImpl$setContactRemark$1.L$3;
                        unit2 = (Unit) inHouseIMContactManagerImpl$setContactRemark$1.L$2;
                        setContactRemarkReq3 = (SetContactRemarkReq) inHouseIMContactManagerImpl$setContactRemark$1.L$1;
                        c44176sGc2 = (C44176sGc) inHouseIMContactManagerImpl$setContactRemark$1.L$0;
                        C56391yDq.AEQbTJ(obj2);
                        longRef = longRef14;
                        str4 = "Database Operation failed after ";
                        i3 = i20;
                        r8 = baseDao8;
                        InHouseIMContactManagerImpl$setContactRemark$1 inHouseIMContactManagerImpl$setContactRemark$14222 = inHouseIMContactManagerImpl$setContactRemark$1;
                        setContactRemarkReq2 = setContactRemarkReq3;
                        longRef2 = longRef;
                        Unit unit5222 = unit2;
                        i = i6;
                        c44176sGc = c44176sGc2;
                        objectRef = objectRef3;
                        unit = unit5222;
                        i2 = i3 + 1;
                        r7 = r8;
                        str = str3;
                        str16 = str4;
                        inHouseIMContactManagerImpl$setContactRemark$12 = inHouseIMContactManagerImpl$setContactRemark$14222;
                        if (i2 < i) {
                        }
                        break;
                    case 4:
                        long j2 = inHouseIMContactManagerImpl$setContactRemark$1.J$0;
                        int i21 = inHouseIMContactManagerImpl$setContactRemark$1.I$2;
                        i11 = inHouseIMContactManagerImpl$setContactRemark$1.I$1;
                        i12 = inHouseIMContactManagerImpl$setContactRemark$1.I$0;
                        Ref.ObjectRef objectRef13 = (Ref.ObjectRef) inHouseIMContactManagerImpl$setContactRemark$1.L$8;
                        Ref.LongRef longRef15 = (Ref.LongRef) inHouseIMContactManagerImpl$setContactRemark$1.L$7;
                        objectRef6 = (Ref.ObjectRef) inHouseIMContactManagerImpl$setContactRemark$1.L$6;
                        objectRef5 = (Ref.ObjectRef) inHouseIMContactManagerImpl$setContactRemark$1.L$5;
                        Ref.LongRef longRef16 = (Ref.LongRef) inHouseIMContactManagerImpl$setContactRemark$1.L$4;
                        i13 = i21;
                        BaseDao baseDao9 = (BaseDao) inHouseIMContactManagerImpl$setContactRemark$1.L$3;
                        str9 = (java.lang.String) inHouseIMContactManagerImpl$setContactRemark$1.L$2;
                        Unit unit8 = (Unit) inHouseIMContactManagerImpl$setContactRemark$1.L$1;
                        C44176sGc c44176sGc8 = (C44176sGc) inHouseIMContactManagerImpl$setContactRemark$1.L$0;
                        try {
                            C56391yDq.AEQbTJ(obj2);
                            longRef7 = longRef16;
                            baseDao3 = baseDao9;
                            InHouseIMContactManagerImpl$setContactRemark$1 inHouseIMContactManagerImpl$setContactRemark$15 = inHouseIMContactManagerImpl$setContactRemark$1;
                            c44176sGc4 = c44176sGc8;
                            inHouseIMContactManagerImpl$setContactRemark$12 = inHouseIMContactManagerImpl$setContactRemark$15;
                            objectRef8 = objectRef13;
                            unit = unit8;
                            str11 = "not open";
                            str12 = " attempts";
                            jNanoTime2 = j2;
                            r04 = obj2;
                            longRef9 = longRef15;
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e21) {
                            baseDao2 = baseDao9;
                            c44176sGc3 = c44176sGc8;
                            i14 = i12;
                            objectRef7 = objectRef5;
                            longRef6 = longRef16;
                            str10 = str9;
                            unit3 = unit8;
                            sQLiteDatabaseLockedException = e21;
                            i8 = i13;
                            r03 = sQLiteDatabaseLockedException;
                            baseDao4 = baseDao2;
                            longRef8 = longRef6;
                            C44159sFm.copydefault(r03, (java.lang.Exception) objectRef7.element);
                            objectRef7.element = r03;
                            if (i8 < i14 - 1) {
                            }
                        } catch (java.lang.IllegalStateException e22) {
                            e = e22;
                            str13 = str18;
                            message2 = e.getMessage();
                            if (message2 == null) {
                            }
                            C44159sFm.copydefault(e);
                            throw e;
                        } catch (java.lang.Exception e23) {
                            e = e23;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th9) {
                            th = th9;
                            r2 = baseDao9;
                            r15 = longRef16;
                            C44159sFm.EZpvd(r2, r15.element);
                            throw th;
                        }
                        objectRef8.element = r04;
                        longRef9.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime2, DurationUnit.NANOSECONDS));
                        java.lang.Object obj42 = objectRef6.element;
                        C44159sFm.EZpvd(baseDao3, longRef7.element);
                        inHouseIMContactInfoEntity = (InHouseIMContactInfoEntity) obj42;
                        if (inHouseIMContactInfoEntity != null) {
                        }
                        return Unit.INSTANCE;
                    case 5:
                        i16 = inHouseIMContactManagerImpl$setContactRemark$1.I$1;
                        i14 = inHouseIMContactManagerImpl$setContactRemark$1.I$0;
                        objectRef7 = (Ref.ObjectRef) inHouseIMContactManagerImpl$setContactRemark$1.L$5;
                        Ref.LongRef longRef17 = (Ref.LongRef) inHouseIMContactManagerImpl$setContactRemark$1.L$4;
                        BaseDao baseDao10 = (BaseDao) inHouseIMContactManagerImpl$setContactRemark$1.L$3;
                        str14 = (java.lang.String) inHouseIMContactManagerImpl$setContactRemark$1.L$2;
                        unit3 = (Unit) inHouseIMContactManagerImpl$setContactRemark$1.L$1;
                        c44176sGc3 = (C44176sGc) inHouseIMContactManagerImpl$setContactRemark$1.L$0;
                        C56391yDq.AEQbTJ(obj2);
                        baseDao6 = baseDao10;
                        longRef11 = longRef17;
                        inHouseIMContactManagerImpl$setContactRemark$13 = inHouseIMContactManagerImpl$setContactRemark$1;
                        baseDao5 = baseDao6;
                        str7 = str14;
                        objectRef5 = objectRef7;
                        unit = unit3;
                        i11 = i16;
                        i15 = 1;
                        longRef10 = longRef11;
                        C44176sGc c44176sGc622 = c44176sGc3;
                        i9 = i14;
                        c44176sGc = c44176sGc622;
                        i8 = i11 + i15;
                        longRef5 = longRef10;
                        inHouseIMContactManagerImpl$setContactRemark$12 = inHouseIMContactManagerImpl$setContactRemark$13;
                        baseDao = baseDao5;
                        if (i8 < i9) {
                        }
                        break;
                    case 6:
                        C56391yDq.AEQbTJ(obj2);
                        Unit unit62 = Unit.INSTANCE;
                        return Unit.INSTANCE;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (java.lang.Throwable th10) {
                th = th10;
            }
        } catch (java.lang.Throwable th11) {
            th = th11;
            r2 = r6;
            r15 = "Error: ";
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:158:0x0527 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:190:0x05d2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:198:0x05f2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:200:0x05f4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:209:0x0603 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:250:0x06e2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:258:0x0700 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:267:0x0712 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:269:0x0715 */
    /* JADX DEBUG: Type inference failed for r0v117. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v142. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v152. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v47. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v62. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v99. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r13v21. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r1v6. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r3v12. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r6v4. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r9v46. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x073c: MOVE (r2 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:285:0x073b */
    /* JADX WARN: Path cross not found for [B:80:0x027a, B:83:0x028d], limit reached: 351 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0387 A[LOOP:2: B:103:0x0381->B:105:0x0387, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x053a A[Catch: all -> 0x0058, TryCatch #25 {all -> 0x0058, blocks: (B:13:0x0053, B:134:0x048b, B:136:0x0492, B:140:0x04cb, B:166:0x0534, B:168:0x053a, B:170:0x0544, B:171:0x0547, B:172:0x0548, B:173:0x054b, B:176:0x0560, B:178:0x056d, B:162:0x052d, B:163:0x0530), top: B:314:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x056d A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #25 {all -> 0x0058, blocks: (B:13:0x0053, B:134:0x048b, B:136:0x0492, B:140:0x04cb, B:166:0x0534, B:168:0x053a, B:170:0x0544, B:171:0x0547, B:172:0x0548, B:173:0x054b, B:176:0x0560, B:178:0x056d, B:162:0x052d, B:163:0x0530), top: B:314:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0617 A[Catch: all -> 0x00e2, TryCatch #30 {all -> 0x00e2, blocks: (B:29:0x00dd, B:211:0x0606, B:212:0x0609, B:217:0x0611, B:219:0x0617, B:221:0x0621, B:222:0x0624, B:223:0x0625, B:224:0x0628), top: B:314:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0658 A[Catch: all -> 0x06a9, TRY_LEAVE, TryCatch #6 {all -> 0x06a9, blocks: (B:230:0x064b, B:232:0x0658), top: B:315:0x064b }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0729 A[Catch: all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:46:0x018c, B:271:0x0718, B:272:0x071b, B:277:0x0723, B:279:0x0729, B:281:0x0733, B:282:0x0736, B:283:0x0737, B:284:0x073a), top: B:314:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0767 A[Catch: all -> 0x07ae, TRY_LEAVE, TryCatch #7 {all -> 0x07ae, blocks: (B:290:0x075a, B:292:0x0767), top: B:317:0x075a }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x048b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0308 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0406 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e0  */
    /* JADX WARN: Type inference failed for: r0v132, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v138, types: [T] */
    /* JADX WARN: Type inference failed for: r0v161 */
    /* JADX WARN: Type inference failed for: r0v162 */
    /* JADX WARN: Type inference failed for: r0v165 */
    /* JADX WARN: Type inference failed for: r0v166 */
    /* JADX WARN: Type inference failed for: r0v169 */
    /* JADX WARN: Type inference failed for: r0v170 */
    /* JADX WARN: Type inference failed for: r0v173 */
    /* JADX WARN: Type inference failed for: r0v174 */
    /* JADX WARN: Type inference failed for: r0v175 */
    /* JADX WARN: Type inference failed for: r0v35, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v83, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r1v27, types: [T, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v113 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r3v10, types: [T, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v62 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:177:0x056b -> B:181:0x0597). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:179:0x0594 -> B:181:0x0597). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:235:0x0684 -> B:236:0x0689). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:238:0x0699 -> B:237:0x0693). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:293:0x078e -> B:295:0x0791). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:296:0x079b -> B:295:0x0791). Please report as a decompilation issue!!! */
    @Override // o.InterfaceC44178sGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(java.util.List<? extends ContactRelationType> list, @NotNull Continuation<? super java.util.List<ContactWithPhoneData>> continuation) throws java.lang.Exception {
        InHouseIMContactManagerImpl$getRelationList$1 inHouseIMContactManagerImpl$getRelationList$1;
        ?? r13;
        ?? r2;
        ?? r11;
        ?? r22;
        ?? r6;
        BaseDao baseDao;
        BaseDao baseDao2;
        C44176sGc c44176sGc;
        java.util.ArrayList arrayList;
        java.lang.Object relationList;
        AbstractC43419rot actionBar;
        java.util.List<InHouseIMContactInfoEntity> list2;
        BaseDao baseDaoKWHzl;
        Ref.LongRef longRef;
        Ref.ObjectRef objectRef;
        java.lang.String str;
        int i;
        InHouseIMContactManagerImpl$getRelationList$1 inHouseIMContactManagerImpl$getRelationList$12;
        C44176sGc c44176sGc2;
        int i2;
        java.util.List<? extends ContactRelationType> list3;
        java.lang.Object obj;
        java.lang.Object obj2;
        ResponseData responseData;
        int i3;
        Ref.LongRef longRef2;
        Ref.ObjectRef objectRef2;
        java.lang.Object obj3;
        java.util.List<? extends ContactRelationType> list4;
        BaseDao baseDao3;
        C44176sGc c44176sGc3;
        java.lang.String str2;
        int i4;
        java.lang.String str3;
        java.lang.String str4;
        Ref.ObjectRef objectRef3;
        java.lang.Object obj4;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        int i5;
        Ref.LongRef longRef3;
        java.lang.String str5;
        long jNanoTime;
        java.util.List<? extends ContactRelationType> list5;
        java.lang.String message;
        Ref.LongRef longRef4;
        ?? r0;
        java.util.Iterator it;
        java.lang.Object objEZpvd;
        java.lang.Object obj5;
        java.util.List<? extends ContactRelationType> list6;
        C44176sGc c44176sGc4;
        java.lang.String str6;
        java.lang.Object obj6;
        Ref.LongRef longRef5;
        java.lang.Object obj7;
        Ref.LongRef longRef6;
        Ref.ObjectRef objectRef6;
        java.lang.String str7;
        int i6;
        java.util.List<java.lang.String> list7;
        InHouseIMContactManagerImpl$getRelationList$1 inHouseIMContactManagerImpl$getRelationList$13;
        BaseDao baseDao4;
        java.lang.Object obj8;
        int i7;
        Ref.ObjectRef objectRef7;
        int i8;
        BaseDao baseDao5;
        int i9;
        Ref.ObjectRef objectRef8;
        java.util.List<java.lang.String> list8;
        java.lang.Object obj9;
        java.util.List<? extends ContactRelationType> list9;
        C44176sGc c44176sGc5;
        int i10;
        Ref.LongRef longRef7;
        Ref.ObjectRef objectRef9;
        java.lang.String str8;
        java.lang.String str9;
        BaseDao baseDao6;
        int i11;
        java.lang.String str10;
        Ref.LongRef longRef8;
        long jNanoTime2;
        java.lang.String message2;
        Ref.LongRef longRef9;
        BaseDao baseDao7;
        ?? r02;
        Ref.LongRef longRef10;
        int i12;
        int i13;
        BaseDao baseDao8;
        java.lang.String str11;
        Ref.LongRef longRef11;
        java.lang.String str12;
        int i14;
        C44176sGc c44176sGc6;
        java.util.List<? extends ContactRelationType> list10;
        java.lang.Object obj10;
        BaseDao baseDao9;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        Ref.LongRef longRef12;
        Ref.LongRef longRef13;
        Ref.ObjectRef objectRef10;
        java.util.List<? extends ContactRelationType> list11;
        java.lang.String str13;
        int i15;
        int i16;
        BaseDao baseDao10;
        java.lang.String str14;
        java.lang.String str15;
        BaseDao baseDao11;
        Ref.LongRef longRef14;
        Ref.ObjectRef objectRef11;
        Ref.ObjectRef objectRef12;
        int i17;
        C44176sGc c44176sGc7;
        int i18;
        int i19;
        Ref.LongRef longRef15;
        Ref.ObjectRef objectRef13;
        java.util.List<? extends ContactRelationType> list12;
        java.lang.String str16;
        java.util.List<? extends ContactRelationType> list13;
        java.lang.String str17;
        java.lang.String str18;
        Ref.LongRef longRef16;
        long jNanoTime3;
        Ref.LongRef longRef17;
        int i20;
        java.lang.String message3;
        ?? r03;
        BaseDao baseDao12;
        Ref.LongRef longRef18;
        C44176sGc c44176sGc8;
        int i21;
        InHouseIMContactManagerImpl$getRelationList$1 inHouseIMContactManagerImpl$getRelationList$14;
        java.util.List<? extends ContactRelationType> list14;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException2;
        ?? r04;
        java.lang.String str19;
        Ref.LongRef longRef19;
        java.util.List<? extends ContactRelationType> list15 = list;
        if (continuation instanceof InHouseIMContactManagerImpl$getRelationList$1) {
            inHouseIMContactManagerImpl$getRelationList$1 = (InHouseIMContactManagerImpl$getRelationList$1) continuation;
            int i22 = inHouseIMContactManagerImpl$getRelationList$1.label;
            if ((i22 & Integer.MIN_VALUE) != 0) {
                inHouseIMContactManagerImpl$getRelationList$1.label = i22 - Integer.MIN_VALUE;
            } else {
                inHouseIMContactManagerImpl$getRelationList$1 = new InHouseIMContactManagerImpl$getRelationList$1(this, continuation);
            }
        }
        java.lang.Object obj11 = inHouseIMContactManagerImpl$getRelationList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        java.lang.String str20 = "not open";
        java.lang.String str21 = "Database Operation failed after ";
        java.lang.String str22 = " attempts";
        try {
            try {
                try {
                    switch (inHouseIMContactManagerImpl$getRelationList$1.label) {
                        case 0:
                            C56391yDq.AEQbTJ(obj11);
                            try {
                                InHouseIMRelationService inHouseIMRelationService = this.AEQbTJ;
                                if (list15 != null) {
                                    arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list15, 10));
                                    java.util.Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(C56443yFo.AEQbTJ(((ContactRelationType) it2.next()).getApiValue()));
                                    }
                                } else {
                                    arrayList = null;
                                }
                                inHouseIMContactManagerImpl$getRelationList$1.L$0 = this;
                                inHouseIMContactManagerImpl$getRelationList$1.L$1 = list15;
                                inHouseIMContactManagerImpl$getRelationList$1.label = 1;
                                relationList = inHouseIMRelationService.getRelationList(arrayList, inHouseIMContactManagerImpl$getRelationList$1);
                                break;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                c44176sGc = this;
                                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                            }
                            if (relationList == objCopydefault) {
                                return objCopydefault;
                            }
                            c44176sGc = this;
                            obj2 = relationList;
                            responseData = (ResponseData) obj2;
                            if (responseData.getCode() != 0 && responseData.getData() != null) {
                                java.lang.Object data = responseData.getData();
                                Intrinsics.copydefault(data);
                                actionBar = new AbstractC43419rot.StateListAnimator(data);
                            } else {
                                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                            }
                            if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
                                java.lang.Object objKWHzl = ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
                                list2 = (java.util.List) objKWHzl;
                                c44176sGc.copydefault.AEQbTJ(list2);
                                baseDaoKWHzl = c44176sGc.KWHzl();
                                longRef = new Ref.LongRef();
                                objectRef = new Ref.ObjectRef();
                                str = " attempts";
                                i = 3;
                                inHouseIMContactManagerImpl$getRelationList$12 = inHouseIMContactManagerImpl$getRelationList$1;
                                c44176sGc2 = c44176sGc;
                                i2 = 0;
                                list3 = list15;
                                obj = objKWHzl;
                                if (i2 < i) {
                                    try {
                                        try {
                                            try {
                                            } catch (java.lang.Exception e) {
                                                e = e;
                                                C44159sFm.OLrzqt(e);
                                                throw e;
                                            } catch (java.lang.Throwable th2) {
                                                th = th2;
                                                baseDao2 = baseDaoKWHzl;
                                                r6 = longRef;
                                                C44159sFm.EZpvd(baseDao2, r6.element);
                                                throw th;
                                            }
                                        } catch (java.lang.IllegalStateException e2) {
                                            e = e2;
                                            str6 = str20;
                                        }
                                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                                        e = e3;
                                        obj6 = obj;
                                        str6 = str20;
                                        str4 = str21;
                                    }
                                    try {
                                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e4) {
                                        e = e4;
                                        obj6 = obj;
                                        str6 = str20;
                                        str4 = str21;
                                    }
                                    objectRef3 = new Ref.ObjectRef();
                                    str6 = str20;
                                    str4 = str21;
                                    try {
                                        try {
                                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e5) {
                                            e = e5;
                                            obj6 = obj;
                                        }
                                        jNanoTime = java.lang.System.nanoTime();
                                        InHouseIMContactDao inHouseIMContactDaoKWHzl = c44176sGc2.KWHzl();
                                        inHouseIMContactManagerImpl$getRelationList$12.L$0 = c44176sGc2;
                                        inHouseIMContactManagerImpl$getRelationList$12.L$1 = list3;
                                        inHouseIMContactManagerImpl$getRelationList$12.L$2 = obj;
                                        inHouseIMContactManagerImpl$getRelationList$12.L$3 = list2;
                                        inHouseIMContactManagerImpl$getRelationList$12.L$4 = baseDaoKWHzl;
                                        inHouseIMContactManagerImpl$getRelationList$12.L$5 = longRef;
                                        inHouseIMContactManagerImpl$getRelationList$12.L$6 = objectRef;
                                        inHouseIMContactManagerImpl$getRelationList$12.L$7 = objectRef3;
                                        inHouseIMContactManagerImpl$getRelationList$12.L$8 = longRef;
                                        inHouseIMContactManagerImpl$getRelationList$12.L$9 = objectRef3;
                                        inHouseIMContactManagerImpl$getRelationList$12.I$0 = i;
                                        inHouseIMContactManagerImpl$getRelationList$12.I$1 = i2;
                                        inHouseIMContactManagerImpl$getRelationList$12.I$2 = i2;
                                        inHouseIMContactManagerImpl$getRelationList$12.J$0 = jNanoTime;
                                        obj6 = obj;
                                        try {
                                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                                            try {
                                                e = e6;
                                                C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                                                objectRef2.element = r0;
                                                if (i4 < i - 1) {
                                                    inHouseIMContactManagerImpl$getRelationList$1.L$0 = c44176sGc3;
                                                    inHouseIMContactManagerImpl$getRelationList$1.L$1 = list4;
                                                    inHouseIMContactManagerImpl$getRelationList$1.L$2 = obj3;
                                                    inHouseIMContactManagerImpl$getRelationList$1.L$3 = list2;
                                                    inHouseIMContactManagerImpl$getRelationList$1.L$4 = baseDao3;
                                                    inHouseIMContactManagerImpl$getRelationList$1.L$5 = longRef2;
                                                    inHouseIMContactManagerImpl$getRelationList$1.L$6 = objectRef2;
                                                    inHouseIMContactManagerImpl$getRelationList$1.L$7 = null;
                                                    inHouseIMContactManagerImpl$getRelationList$1.L$8 = null;
                                                    inHouseIMContactManagerImpl$getRelationList$1.L$9 = null;
                                                    inHouseIMContactManagerImpl$getRelationList$1.I$0 = i;
                                                    inHouseIMContactManagerImpl$getRelationList$1.I$1 = i3;
                                                    inHouseIMContactManagerImpl$getRelationList$1.label = 3;
                                                    longRef5 = longRef2;
                                                    if (DelayKt.delay(((long) (i4 + 1)) * 50, inHouseIMContactManagerImpl$getRelationList$1) == objCopydefault) {
                                                        return objCopydefault;
                                                    }
                                                } else {
                                                    longRef5 = longRef2;
                                                }
                                                Ref.LongRef longRef20 = longRef5;
                                                inHouseIMContactManagerImpl$getRelationList$12 = inHouseIMContactManagerImpl$getRelationList$1;
                                                C44176sGc c44176sGc9 = c44176sGc3;
                                                objectRef = objectRef2;
                                                baseDaoKWHzl = baseDao3;
                                                c44176sGc2 = c44176sGc9;
                                                i2 = i3 + 1;
                                                obj = obj3;
                                                list3 = list4;
                                                str21 = str4;
                                                str20 = str3;
                                                str = str2;
                                                longRef = longRef20;
                                                if (i2 < i) {
                                                }
                                            } catch (java.lang.Throwable th3) {
                                                th = th3;
                                                longRef = longRef2;
                                                baseDaoKWHzl = baseDao3;
                                                baseDao2 = baseDaoKWHzl;
                                                r6 = longRef;
                                                C44159sFm.EZpvd(baseDao2, r6.element);
                                                throw th;
                                            }
                                            i4 = i2;
                                            str2 = str;
                                            list4 = list3;
                                            inHouseIMContactManagerImpl$getRelationList$1 = inHouseIMContactManagerImpl$getRelationList$12;
                                            longRef2 = longRef;
                                            obj3 = obj6;
                                            str3 = str6;
                                            i3 = i4;
                                            C44176sGc c44176sGc10 = c44176sGc2;
                                            baseDao3 = baseDaoKWHzl;
                                            objectRef2 = objectRef;
                                            c44176sGc3 = c44176sGc10;
                                            r0 = e;
                                        }
                                        inHouseIMContactManagerImpl$getRelationList$12.label = 2;
                                        if (inHouseIMContactDaoKWHzl.insertOrReplaceContacts(list2, inHouseIMContactManagerImpl$getRelationList$12) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                        baseDao2 = baseDaoKWHzl;
                                        str2 = str;
                                        str5 = str4;
                                        obj4 = obj6;
                                        str3 = str6;
                                        i5 = i2;
                                        list5 = list3;
                                        longRef3 = longRef;
                                        objectRef4 = objectRef;
                                        objectRef5 = objectRef3;
                                        i3 = i5;
                                        longRef = longRef;
                                        try {
                                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e7) {
                                            list4 = list5;
                                            inHouseIMContactManagerImpl$getRelationList$1 = inHouseIMContactManagerImpl$getRelationList$12;
                                            c44176sGc3 = c44176sGc2;
                                            longRef2 = longRef;
                                            objectRef2 = objectRef4;
                                            str4 = str5;
                                            obj3 = obj4;
                                            baseDao3 = baseDao2;
                                            i4 = i5;
                                            r0 = e7;
                                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                                            objectRef2.element = r0;
                                            if (i4 < i - 1) {
                                            }
                                            Ref.LongRef longRef202 = longRef5;
                                            inHouseIMContactManagerImpl$getRelationList$12 = inHouseIMContactManagerImpl$getRelationList$1;
                                            C44176sGc c44176sGc92 = c44176sGc3;
                                            objectRef = objectRef2;
                                            baseDaoKWHzl = baseDao3;
                                            c44176sGc2 = c44176sGc92;
                                            i2 = i3 + 1;
                                            obj = obj3;
                                            list3 = list4;
                                            str21 = str4;
                                            str20 = str3;
                                            str = str2;
                                            longRef = longRef202;
                                            if (i2 < i) {
                                            }
                                        } catch (java.lang.IllegalStateException e8) {
                                            e = e8;
                                            baseDaoKWHzl = baseDao2;
                                            str20 = str3;
                                            longRef4 = longRef;
                                            message = e.getMessage();
                                            if (message == null) {
                                            }
                                            C44159sFm.copydefault(e);
                                            throw e;
                                        } catch (java.lang.Exception e9) {
                                            e = e9;
                                            baseDaoKWHzl = baseDao2;
                                            C44159sFm.OLrzqt(e);
                                            throw e;
                                        } catch (java.lang.Throwable th4) {
                                            th = th4;
                                            r6 = longRef;
                                            C44159sFm.EZpvd(baseDao2, r6.element);
                                            throw th;
                                        }
                                        objectRef3.element = Unit.INSTANCE;
                                        longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                                        java.lang.Object obj12 = objectRef5.element;
                                        C44159sFm.EZpvd(baseDao2, longRef.element);
                                        C44485sRo c44485sRo = c44176sGc2.OLrzqt;
                                        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                                        it = list2.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(((InHouseIMContactInfoEntity) it.next()).getContactUid());
                                        }
                                        java.util.List<? extends ContactRelationType> listAhwBna = list5 != null ? yDY.AhwBna() : list5;
                                        inHouseIMContactManagerImpl$getRelationList$12.L$0 = c44176sGc2;
                                        inHouseIMContactManagerImpl$getRelationList$12.L$1 = list5;
                                        inHouseIMContactManagerImpl$getRelationList$12.L$2 = obj4;
                                        inHouseIMContactManagerImpl$getRelationList$12.L$3 = null;
                                        inHouseIMContactManagerImpl$getRelationList$12.L$4 = null;
                                        inHouseIMContactManagerImpl$getRelationList$12.L$5 = null;
                                        inHouseIMContactManagerImpl$getRelationList$12.L$6 = null;
                                        inHouseIMContactManagerImpl$getRelationList$12.L$7 = null;
                                        inHouseIMContactManagerImpl$getRelationList$12.L$8 = null;
                                        inHouseIMContactManagerImpl$getRelationList$12.L$9 = null;
                                        inHouseIMContactManagerImpl$getRelationList$12.label = 4;
                                        objEZpvd = c44485sRo.EZpvd(arrayList2, listAhwBna, inHouseIMContactManagerImpl$getRelationList$12);
                                        if (objEZpvd != objCopydefault) {
                                            return objCopydefault;
                                        }
                                        obj5 = obj4;
                                        list6 = list5;
                                        inHouseIMContactManagerImpl$getRelationList$1 = inHouseIMContactManagerImpl$getRelationList$12;
                                        c44176sGc4 = c44176sGc2;
                                        str20 = str3;
                                        str21 = str5;
                                        str22 = str2;
                                        obj7 = objEZpvd;
                                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                        for (java.lang.Object obj13 : (java.lang.Iterable) obj7) {
                                            if (!Intrinsics.EZpvd(obj13, (java.lang.Object) C44157sFk.KWHzl())) {
                                                arrayList3.add(obj13);
                                            }
                                        }
                                        InHouseIMContactDao inHouseIMContactDaoKWHzl2 = c44176sGc4.KWHzl();
                                        longRef6 = new Ref.LongRef();
                                        objectRef6 = new Ref.ObjectRef();
                                        str7 = str22;
                                        i6 = 3;
                                        list7 = arrayList3;
                                        inHouseIMContactManagerImpl$getRelationList$13 = inHouseIMContactManagerImpl$getRelationList$1;
                                        baseDao4 = inHouseIMContactDaoKWHzl2;
                                        obj8 = obj5;
                                        i7 = 0;
                                        if (i7 < i6) {
                                            try {
                                                try {
                                                } catch (java.lang.Exception e10) {
                                                    e = e10;
                                                    C44159sFm.OLrzqt(e);
                                                    throw e;
                                                } catch (java.lang.Throwable th5) {
                                                    th = th5;
                                                    r2 = baseDao4;
                                                    r13 = longRef6;
                                                    C44159sFm.EZpvd(r2, r13.element);
                                                    throw th;
                                                }
                                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e11) {
                                                e = e11;
                                                str15 = str7;
                                                str14 = str20;
                                            } catch (java.lang.IllegalStateException e12) {
                                                e = e12;
                                                str14 = str20;
                                            }
                                            Ref.ObjectRef objectRef14 = new Ref.ObjectRef();
                                            str14 = str20;
                                            try {
                                                try {
                                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e13) {
                                                    e = e13;
                                                    str15 = str7;
                                                }
                                                jNanoTime2 = java.lang.System.nanoTime();
                                                str15 = str7;
                                                try {
                                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e14) {
                                                    try {
                                                        e = e14;
                                                        str11 = str21;
                                                        str20 = str14;
                                                        longRef11 = longRef6;
                                                        str12 = str15;
                                                        i14 = i6;
                                                        list8 = list7;
                                                        c44176sGc6 = c44176sGc4;
                                                        list10 = list6;
                                                        obj10 = obj8;
                                                        i10 = i7;
                                                        sQLiteDatabaseLockedException = e;
                                                        baseDao9 = baseDao4;
                                                        C44159sFm.copydefault(r02, (java.lang.Exception) objectRef8.element);
                                                        objectRef8.element = r02;
                                                        if (i7 >= i9 - 1) {
                                                            java.lang.String str23 = str20;
                                                            inHouseIMContactManagerImpl$getRelationList$13.L$0 = c44176sGc5;
                                                            inHouseIMContactManagerImpl$getRelationList$13.L$1 = list9;
                                                            inHouseIMContactManagerImpl$getRelationList$13.L$2 = obj9;
                                                            inHouseIMContactManagerImpl$getRelationList$13.L$3 = list8;
                                                            inHouseIMContactManagerImpl$getRelationList$13.L$4 = baseDao5;
                                                            inHouseIMContactManagerImpl$getRelationList$13.L$5 = longRef7;
                                                            inHouseIMContactManagerImpl$getRelationList$13.L$6 = objectRef8;
                                                            inHouseIMContactManagerImpl$getRelationList$13.L$7 = null;
                                                            inHouseIMContactManagerImpl$getRelationList$13.L$8 = null;
                                                            inHouseIMContactManagerImpl$getRelationList$13.L$9 = null;
                                                            inHouseIMContactManagerImpl$getRelationList$13.I$0 = i9;
                                                            inHouseIMContactManagerImpl$getRelationList$13.I$1 = i10;
                                                            inHouseIMContactManagerImpl$getRelationList$13.label = 6;
                                                            if (DelayKt.delay(((long) (i7 + 1)) * 50, inHouseIMContactManagerImpl$getRelationList$13) == objCopydefault) {
                                                                return objCopydefault;
                                                            }
                                                            str20 = str23;
                                                            i13 = i10;
                                                            inHouseIMContactManagerImpl$getRelationList$1 = inHouseIMContactManagerImpl$getRelationList$13;
                                                            baseDao8 = baseDao5;
                                                            longRef14 = longRef7;
                                                            longRef10 = longRef14;
                                                            baseDao11 = baseDao8;
                                                            list7 = list8;
                                                            inHouseIMContactManagerImpl$getRelationList$13 = inHouseIMContactManagerImpl$getRelationList$1;
                                                            i6 = i9;
                                                            list6 = list9;
                                                            str7 = str22;
                                                            i10 = i13;
                                                            i12 = 1;
                                                            C44176sGc c44176sGc11 = c44176sGc5;
                                                            objectRef6 = objectRef8;
                                                            c44176sGc4 = c44176sGc11;
                                                            i7 = i10 + i12;
                                                            obj8 = obj9;
                                                            longRef6 = longRef10;
                                                            baseDao4 = baseDao11;
                                                            if (i7 < i6) {
                                                            }
                                                        } else {
                                                            longRef10 = longRef7;
                                                            list7 = list8;
                                                            i12 = 1;
                                                            i6 = i9;
                                                            list6 = list9;
                                                            str7 = str22;
                                                            baseDao11 = baseDao5;
                                                            C44176sGc c44176sGc112 = c44176sGc5;
                                                            objectRef6 = objectRef8;
                                                            c44176sGc4 = c44176sGc112;
                                                            i7 = i10 + i12;
                                                            obj8 = obj9;
                                                            longRef6 = longRef10;
                                                            baseDao4 = baseDao11;
                                                            if (i7 < i6) {
                                                            }
                                                        }
                                                    } catch (java.lang.Throwable th6) {
                                                        th = th6;
                                                        baseDao6 = baseDao5;
                                                        longRef8 = longRef7;
                                                        r13 = longRef8;
                                                        r2 = baseDao6;
                                                        C44159sFm.EZpvd(r2, r13.element);
                                                        throw th;
                                                    }
                                                    str22 = str12;
                                                    list9 = list10;
                                                    objectRef8 = objectRef6;
                                                    c44176sGc5 = c44176sGc6;
                                                    longRef7 = longRef11;
                                                    str21 = str11;
                                                    int i23 = i14;
                                                    obj9 = obj10;
                                                    i9 = i23;
                                                    r02 = sQLiteDatabaseLockedException;
                                                    baseDao5 = baseDao9;
                                                    r13 = longRef8;
                                                    r2 = baseDao6;
                                                    C44159sFm.EZpvd(r2, r13.element);
                                                    throw th;
                                                }
                                                InHouseIMContactDao inHouseIMContactDaoKWHzl3 = c44176sGc4.KWHzl();
                                                str11 = str21;
                                                try {
                                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e15) {
                                                    e = e15;
                                                    str20 = str14;
                                                    longRef11 = longRef6;
                                                    str12 = str15;
                                                    i14 = i6;
                                                    list8 = list7;
                                                    c44176sGc6 = c44176sGc4;
                                                    list10 = list6;
                                                    obj10 = obj8;
                                                    i10 = i7;
                                                    sQLiteDatabaseLockedException = e;
                                                    baseDao9 = baseDao4;
                                                    str22 = str12;
                                                    list9 = list10;
                                                    objectRef8 = objectRef6;
                                                    c44176sGc5 = c44176sGc6;
                                                    longRef7 = longRef11;
                                                    str21 = str11;
                                                    int i232 = i14;
                                                    obj9 = obj10;
                                                    i9 = i232;
                                                    r02 = sQLiteDatabaseLockedException;
                                                    baseDao5 = baseDao9;
                                                    C44159sFm.copydefault(r02, (java.lang.Exception) objectRef8.element);
                                                    objectRef8.element = r02;
                                                    if (i7 >= i9 - 1) {
                                                    }
                                                    r13 = longRef8;
                                                    r2 = baseDao6;
                                                    C44159sFm.EZpvd(r2, r13.element);
                                                    throw th;
                                                }
                                                ContactRelationType contactRelationType = ContactRelationType.STRANGER;
                                                inHouseIMContactManagerImpl$getRelationList$13.L$0 = c44176sGc4;
                                                inHouseIMContactManagerImpl$getRelationList$13.L$1 = list6;
                                                inHouseIMContactManagerImpl$getRelationList$13.L$2 = obj8;
                                                inHouseIMContactManagerImpl$getRelationList$13.L$3 = list7;
                                                inHouseIMContactManagerImpl$getRelationList$13.L$4 = baseDao4;
                                                inHouseIMContactManagerImpl$getRelationList$13.L$5 = longRef6;
                                                inHouseIMContactManagerImpl$getRelationList$13.L$6 = objectRef6;
                                                inHouseIMContactManagerImpl$getRelationList$13.L$7 = objectRef14;
                                                inHouseIMContactManagerImpl$getRelationList$13.L$8 = longRef6;
                                                inHouseIMContactManagerImpl$getRelationList$13.L$9 = objectRef14;
                                                inHouseIMContactManagerImpl$getRelationList$13.I$0 = i6;
                                                inHouseIMContactManagerImpl$getRelationList$13.I$1 = i7;
                                                inHouseIMContactManagerImpl$getRelationList$13.I$2 = i7;
                                                inHouseIMContactManagerImpl$getRelationList$13.J$0 = jNanoTime2;
                                                inHouseIMContactManagerImpl$getRelationList$13.label = 5;
                                                if (inHouseIMContactDaoKWHzl3.updateRelationTypes(list7, contactRelationType, inHouseIMContactManagerImpl$getRelationList$13) == objCopydefault) {
                                                    return objCopydefault;
                                                }
                                                longRef8 = longRef6;
                                                str8 = str15;
                                                objectRef9 = objectRef14;
                                                objectRef7 = objectRef9;
                                                str9 = str14;
                                                i11 = i7;
                                                str10 = str11;
                                                i8 = i11;
                                                baseDao6 = baseDao4;
                                                longRef12 = longRef6;
                                                try {
                                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e16) {
                                                    baseDao9 = baseDao6;
                                                    i14 = i6;
                                                    str20 = str9;
                                                    i7 = i8;
                                                    str11 = str10;
                                                    str12 = str8;
                                                    list8 = list7;
                                                    c44176sGc6 = c44176sGc4;
                                                    list10 = list6;
                                                    obj10 = obj8;
                                                    i10 = i11;
                                                    sQLiteDatabaseLockedException = e16;
                                                    longRef11 = longRef8;
                                                    str22 = str12;
                                                    list9 = list10;
                                                    objectRef8 = objectRef6;
                                                    c44176sGc5 = c44176sGc6;
                                                    longRef7 = longRef11;
                                                    str21 = str11;
                                                    int i2322 = i14;
                                                    obj9 = obj10;
                                                    i9 = i2322;
                                                    r02 = sQLiteDatabaseLockedException;
                                                    baseDao5 = baseDao9;
                                                    C44159sFm.copydefault(r02, (java.lang.Exception) objectRef8.element);
                                                    objectRef8.element = r02;
                                                    if (i7 >= i9 - 1) {
                                                    }
                                                    r13 = longRef8;
                                                    r2 = baseDao6;
                                                    C44159sFm.EZpvd(r2, r13.element);
                                                    throw th;
                                                } catch (java.lang.IllegalStateException e17) {
                                                    e = e17;
                                                    baseDao7 = baseDao6;
                                                    longRef9 = longRef8;
                                                    str20 = str9;
                                                    message2 = e.getMessage();
                                                    if (message2 == null) {
                                                    }
                                                    C44159sFm.copydefault(e);
                                                    throw e;
                                                } catch (java.lang.Exception e18) {
                                                    e = e18;
                                                    baseDao4 = baseDao6;
                                                    longRef6 = longRef8;
                                                    C44159sFm.OLrzqt(e);
                                                    throw e;
                                                } catch (java.lang.Throwable th7) {
                                                    th = th7;
                                                    r13 = longRef8;
                                                    r2 = baseDao6;
                                                    C44159sFm.EZpvd(r2, r13.element);
                                                    throw th;
                                                }
                                                objectRef9.element = Unit.INSTANCE;
                                                longRef12.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime2, DurationUnit.NANOSECONDS));
                                                java.lang.Object obj14 = objectRef7.element;
                                                C44159sFm.EZpvd(baseDao6, longRef8.element);
                                                InHouseIMContactDao inHouseIMContactDaoKWHzl4 = c44176sGc4.KWHzl();
                                                longRef13 = new Ref.LongRef();
                                                objectRef10 = new Ref.ObjectRef();
                                                list11 = list6;
                                                inHouseIMContactManagerImpl$getRelationList$1 = inHouseIMContactManagerImpl$getRelationList$13;
                                                str20 = str9;
                                                str21 = str10;
                                                str13 = str8;
                                                i15 = 0;
                                                i16 = 3;
                                                baseDao10 = inHouseIMContactDaoKWHzl4;
                                                if (i15 >= i16) {
                                                    try {
                                                        try {
                                                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e19) {
                                                            e = e19;
                                                            str19 = str20;
                                                        } catch (java.lang.IllegalStateException e20) {
                                                            e = e20;
                                                        }
                                                        objectRef11 = new Ref.ObjectRef();
                                                        str19 = str20;
                                                        try {
                                                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e21) {
                                                            e = e21;
                                                            str20 = str19;
                                                            baseDao12 = baseDao10;
                                                            longRef18 = longRef13;
                                                            c44176sGc8 = c44176sGc4;
                                                            i21 = i15;
                                                            inHouseIMContactManagerImpl$getRelationList$14 = inHouseIMContactManagerImpl$getRelationList$1;
                                                            list14 = list11;
                                                            i20 = i21;
                                                            sQLiteDatabaseLockedException2 = e;
                                                            str22 = str13;
                                                            i17 = i20;
                                                            list12 = list14;
                                                            inHouseIMContactManagerImpl$getRelationList$1 = inHouseIMContactManagerImpl$getRelationList$14;
                                                            i18 = i21;
                                                            c44176sGc7 = c44176sGc8;
                                                            longRef15 = longRef18;
                                                            baseDao10 = baseDao12;
                                                            i19 = i16;
                                                            objectRef13 = objectRef10;
                                                            r03 = sQLiteDatabaseLockedException2;
                                                            C44159sFm.copydefault(r03, (java.lang.Exception) objectRef13.element);
                                                            objectRef13.element = r03;
                                                            longRef19 = longRef15;
                                                            if (i17 < i19 - 1) {
                                                                inHouseIMContactManagerImpl$getRelationList$1.L$0 = c44176sGc7;
                                                                inHouseIMContactManagerImpl$getRelationList$1.L$1 = list12;
                                                                inHouseIMContactManagerImpl$getRelationList$1.L$2 = baseDao10;
                                                                inHouseIMContactManagerImpl$getRelationList$1.L$3 = longRef15;
                                                                inHouseIMContactManagerImpl$getRelationList$1.L$4 = objectRef13;
                                                                inHouseIMContactManagerImpl$getRelationList$1.L$5 = null;
                                                                inHouseIMContactManagerImpl$getRelationList$1.L$6 = null;
                                                                inHouseIMContactManagerImpl$getRelationList$1.L$7 = null;
                                                                inHouseIMContactManagerImpl$getRelationList$1.L$8 = null;
                                                                inHouseIMContactManagerImpl$getRelationList$1.L$9 = null;
                                                                inHouseIMContactManagerImpl$getRelationList$1.I$0 = i19;
                                                                inHouseIMContactManagerImpl$getRelationList$1.I$1 = i18;
                                                                inHouseIMContactManagerImpl$getRelationList$1.label = 8;
                                                                longRef19 = longRef15;
                                                                if (DelayKt.delay(((long) (i17 + 1)) * 50, inHouseIMContactManagerImpl$getRelationList$1) == objCopydefault) {
                                                                    return objCopydefault;
                                                                }
                                                            }
                                                            int i24 = i18;
                                                            i16 = i19;
                                                            objectRef10 = objectRef13;
                                                            list11 = list12;
                                                            c44176sGc4 = c44176sGc7;
                                                            str13 = str22;
                                                            i15 = i24 + 1;
                                                            longRef13 = longRef19;
                                                            if (i15 >= i16) {
                                                            }
                                                        } catch (java.lang.IllegalStateException e22) {
                                                            e = e22;
                                                            str20 = str19;
                                                            message3 = e.getMessage();
                                                            if (message3 == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message3, (java.lang.CharSequence) str20, false, 2, (java.lang.Object) null)) {
                                                                C44159sFm.OLrzqt(e);
                                                                throw e;
                                                            }
                                                            C44159sFm.copydefault(e);
                                                            throw e;
                                                        }
                                                        jNanoTime3 = java.lang.System.nanoTime();
                                                        InHouseIMContactDao inHouseIMContactDaoKWHzl5 = c44176sGc4.KWHzl();
                                                        inHouseIMContactManagerImpl$getRelationList$1.L$0 = c44176sGc4;
                                                        inHouseIMContactManagerImpl$getRelationList$1.L$1 = list11;
                                                        inHouseIMContactManagerImpl$getRelationList$1.L$2 = baseDao10;
                                                        inHouseIMContactManagerImpl$getRelationList$1.L$3 = longRef13;
                                                        inHouseIMContactManagerImpl$getRelationList$1.L$4 = objectRef10;
                                                        inHouseIMContactManagerImpl$getRelationList$1.L$5 = objectRef11;
                                                        inHouseIMContactManagerImpl$getRelationList$1.L$6 = longRef13;
                                                        inHouseIMContactManagerImpl$getRelationList$1.L$7 = objectRef11;
                                                        inHouseIMContactManagerImpl$getRelationList$1.L$8 = null;
                                                        inHouseIMContactManagerImpl$getRelationList$1.L$9 = null;
                                                        inHouseIMContactManagerImpl$getRelationList$1.I$0 = i16;
                                                        inHouseIMContactManagerImpl$getRelationList$1.I$1 = i15;
                                                        inHouseIMContactManagerImpl$getRelationList$1.I$2 = i15;
                                                        inHouseIMContactManagerImpl$getRelationList$1.J$0 = jNanoTime3;
                                                        inHouseIMContactManagerImpl$getRelationList$1.label = 7;
                                                        java.lang.Object allContacts = inHouseIMContactDaoKWHzl5.getAllContacts(inHouseIMContactManagerImpl$getRelationList$1);
                                                        if (allContacts == objCopydefault) {
                                                            return objCopydefault;
                                                        }
                                                        str17 = str19;
                                                        str16 = str13;
                                                        list13 = list11;
                                                        i20 = i15;
                                                        objectRef12 = objectRef11;
                                                        str18 = str21;
                                                        longRef16 = longRef13;
                                                        r04 = allContacts;
                                                        longRef17 = longRef13;
                                                        try {
                                                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e23) {
                                                            baseDao12 = baseDao10;
                                                            str20 = str17;
                                                            str21 = str18;
                                                            longRef18 = longRef17;
                                                            c44176sGc8 = c44176sGc4;
                                                            i21 = i15;
                                                            inHouseIMContactManagerImpl$getRelationList$14 = inHouseIMContactManagerImpl$getRelationList$1;
                                                            list14 = list13;
                                                            str13 = str16;
                                                            sQLiteDatabaseLockedException2 = e23;
                                                            str22 = str13;
                                                            i17 = i20;
                                                            list12 = list14;
                                                            inHouseIMContactManagerImpl$getRelationList$1 = inHouseIMContactManagerImpl$getRelationList$14;
                                                            i18 = i21;
                                                            c44176sGc7 = c44176sGc8;
                                                            longRef15 = longRef18;
                                                            baseDao10 = baseDao12;
                                                            i19 = i16;
                                                            objectRef13 = objectRef10;
                                                            r03 = sQLiteDatabaseLockedException2;
                                                            C44159sFm.copydefault(r03, (java.lang.Exception) objectRef13.element);
                                                            objectRef13.element = r03;
                                                            longRef19 = longRef15;
                                                            if (i17 < i19 - 1) {
                                                            }
                                                            int i242 = i18;
                                                            i16 = i19;
                                                            objectRef10 = objectRef13;
                                                            list11 = list12;
                                                            c44176sGc4 = c44176sGc7;
                                                            str13 = str22;
                                                            i15 = i242 + 1;
                                                            longRef13 = longRef19;
                                                            if (i15 >= i16) {
                                                            }
                                                        } catch (java.lang.IllegalStateException e24) {
                                                            e = e24;
                                                            str20 = str17;
                                                            message3 = e.getMessage();
                                                            if (message3 == null) {
                                                            }
                                                            C44159sFm.copydefault(e);
                                                            throw e;
                                                        }
                                                        objectRef11.element = r04;
                                                        longRef16.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime3, DurationUnit.NANOSECONDS));
                                                        java.lang.Object obj15 = objectRef12.element;
                                                        C44159sFm.EZpvd(baseDao10, longRef17.element);
                                                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                                        for (java.lang.Object obj16 : (java.lang.Iterable) obj15) {
                                                            ContactWithPhoneData contactWithPhoneData = (ContactWithPhoneData) obj16;
                                                            if (list13 == null || !list13.contains(contactWithPhoneData.getRelationType())) {
                                                                arrayList4.add(obj16);
                                                            }
                                                        }
                                                        return arrayList4;
                                                    } catch (java.lang.Exception e25) {
                                                        e = e25;
                                                        C44159sFm.OLrzqt(e);
                                                        throw e;
                                                    }
                                                }
                                                C44159sFm.EZpvd(baseDao10, longRef13.element);
                                                java.lang.Exception exc = (java.lang.Exception) objectRef10.element;
                                                if (exc == null) {
                                                    exc = new java.lang.Exception(str21 + i16 + str13);
                                                }
                                                C44159sFm.OLrzqt(exc);
                                                throw exc;
                                            } catch (java.lang.IllegalStateException e26) {
                                                e = e26;
                                                str20 = str14;
                                                baseDao7 = baseDao4;
                                                longRef9 = longRef6;
                                                message2 = e.getMessage();
                                                if (message2 == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message2, (java.lang.CharSequence) str20, false, 2, (java.lang.Object) null)) {
                                                    C44159sFm.OLrzqt(e);
                                                    throw e;
                                                }
                                                C44159sFm.copydefault(e);
                                                throw e;
                                            }
                                        }
                                        java.lang.String str24 = str7;
                                        java.lang.String str25 = str21;
                                        C44159sFm.EZpvd(baseDao4, longRef6.element);
                                        java.lang.Exception exc2 = (java.lang.Exception) objectRef6.element;
                                        if (exc2 == null) {
                                            exc2 = new java.lang.Exception(str25 + i6 + str24);
                                        }
                                        C44159sFm.OLrzqt(exc2);
                                        throw exc2;
                                    } catch (java.lang.IllegalStateException e27) {
                                        e = e27;
                                        str20 = str6;
                                        longRef4 = longRef;
                                        message = e.getMessage();
                                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) str20, false, 2, (java.lang.Object) null)) {
                                            C44159sFm.OLrzqt(e);
                                            throw e;
                                        }
                                        C44159sFm.copydefault(e);
                                        throw e;
                                    }
                                }
                                java.lang.String str26 = str21;
                                C44159sFm.EZpvd(baseDaoKWHzl, longRef.element);
                                java.lang.Exception exc3 = (java.lang.Exception) objectRef.element;
                                if (exc3 == null) {
                                    exc3 = new java.lang.Exception(str26 + i + str);
                                }
                                C44159sFm.OLrzqt(exc3);
                                throw exc3;
                            }
                            if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
                            C44124sEe.imLogContact$default("getRelationList failed: " + actionBar2.KWHzl(), null, 2, null);
                            actionBar2.KWHzl();
                            return null;
                        case 1:
                            list15 = (java.util.List) inHouseIMContactManagerImpl$getRelationList$1.L$1;
                            c44176sGc = (C44176sGc) inHouseIMContactManagerImpl$getRelationList$1.L$0;
                            try {
                                C56391yDq.AEQbTJ(obj11);
                                obj2 = obj11;
                                responseData = (ResponseData) obj2;
                                if (responseData.getCode() != 0) {
                                }
                                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                            } catch (java.lang.Throwable th8) {
                                th = th8;
                                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                            }
                            if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
                            }
                            break;
                        case 2:
                            long j = inHouseIMContactManagerImpl$getRelationList$1.J$0;
                            int i25 = inHouseIMContactManagerImpl$getRelationList$1.I$2;
                            i3 = inHouseIMContactManagerImpl$getRelationList$1.I$1;
                            int i26 = inHouseIMContactManagerImpl$getRelationList$1.I$0;
                            Ref.ObjectRef objectRef15 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationList$1.L$9;
                            Ref.LongRef longRef21 = (Ref.LongRef) inHouseIMContactManagerImpl$getRelationList$1.L$8;
                            Ref.ObjectRef objectRef16 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationList$1.L$7;
                            Ref.ObjectRef objectRef17 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationList$1.L$6;
                            Ref.LongRef longRef22 = (Ref.LongRef) inHouseIMContactManagerImpl$getRelationList$1.L$5;
                            BaseDao baseDao13 = (BaseDao) inHouseIMContactManagerImpl$getRelationList$1.L$4;
                            java.util.List<InHouseIMContactInfoEntity> list16 = (java.util.List) inHouseIMContactManagerImpl$getRelationList$1.L$3;
                            java.lang.Object obj17 = inHouseIMContactManagerImpl$getRelationList$1.L$2;
                            java.util.List<? extends ContactRelationType> list17 = (java.util.List) inHouseIMContactManagerImpl$getRelationList$1.L$1;
                            C44176sGc c44176sGc12 = (C44176sGc) inHouseIMContactManagerImpl$getRelationList$1.L$0;
                            try {
                                C56391yDq.AEQbTJ(obj11);
                                objectRef3 = objectRef15;
                                obj4 = obj17;
                                i = i26;
                                str2 = " attempts";
                                c44176sGc2 = c44176sGc12;
                                objectRef4 = objectRef17;
                                baseDao2 = baseDao13;
                                objectRef5 = objectRef16;
                                i5 = i25;
                                longRef3 = longRef21;
                                str3 = "not open";
                                longRef = longRef22;
                                list2 = list16;
                                str5 = "Database Operation failed after ";
                                jNanoTime = j;
                                list5 = list17;
                                inHouseIMContactManagerImpl$getRelationList$12 = inHouseIMContactManagerImpl$getRelationList$1;
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e28) {
                                longRef2 = longRef22;
                                i = i26;
                                objectRef2 = objectRef17;
                                list2 = list16;
                                obj3 = obj17;
                                list4 = list17;
                                baseDao3 = baseDao13;
                                c44176sGc3 = c44176sGc12;
                                str2 = " attempts";
                                i4 = i25;
                                str3 = "not open";
                                str4 = "Database Operation failed after ";
                                r0 = e28;
                                C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                                objectRef2.element = r0;
                                if (i4 < i - 1) {
                                }
                                Ref.LongRef longRef2022 = longRef5;
                                inHouseIMContactManagerImpl$getRelationList$12 = inHouseIMContactManagerImpl$getRelationList$1;
                                C44176sGc c44176sGc922 = c44176sGc3;
                                objectRef = objectRef2;
                                baseDaoKWHzl = baseDao3;
                                c44176sGc2 = c44176sGc922;
                                i2 = i3 + 1;
                                obj = obj3;
                                list3 = list4;
                                str21 = str4;
                                str20 = str3;
                                str = str2;
                                longRef = longRef2022;
                                if (i2 < i) {
                                }
                            } catch (java.lang.IllegalStateException e29) {
                                e = e29;
                                message = e.getMessage();
                                if (message == null) {
                                }
                                C44159sFm.copydefault(e);
                                throw e;
                            } catch (java.lang.Exception e30) {
                                e = e30;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (java.lang.Throwable th9) {
                                th = th9;
                                baseDao2 = baseDao13;
                                r6 = longRef22;
                                C44159sFm.EZpvd(baseDao2, r6.element);
                                throw th;
                            }
                            objectRef3.element = Unit.INSTANCE;
                            longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                            java.lang.Object obj122 = objectRef5.element;
                            C44159sFm.EZpvd(baseDao2, longRef.element);
                            C44485sRo c44485sRo2 = c44176sGc2.OLrzqt;
                            java.util.ArrayList arrayList22 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                            it = list2.iterator();
                            while (it.hasNext()) {
                            }
                            if (list5 != null) {
                            }
                            inHouseIMContactManagerImpl$getRelationList$12.L$0 = c44176sGc2;
                            inHouseIMContactManagerImpl$getRelationList$12.L$1 = list5;
                            inHouseIMContactManagerImpl$getRelationList$12.L$2 = obj4;
                            inHouseIMContactManagerImpl$getRelationList$12.L$3 = null;
                            inHouseIMContactManagerImpl$getRelationList$12.L$4 = null;
                            inHouseIMContactManagerImpl$getRelationList$12.L$5 = null;
                            inHouseIMContactManagerImpl$getRelationList$12.L$6 = null;
                            inHouseIMContactManagerImpl$getRelationList$12.L$7 = null;
                            inHouseIMContactManagerImpl$getRelationList$12.L$8 = null;
                            inHouseIMContactManagerImpl$getRelationList$12.L$9 = null;
                            inHouseIMContactManagerImpl$getRelationList$12.label = 4;
                            objEZpvd = c44485sRo2.EZpvd(arrayList22, listAhwBna, inHouseIMContactManagerImpl$getRelationList$12);
                            if (objEZpvd != objCopydefault) {
                            }
                            break;
                        case 3:
                            int i27 = inHouseIMContactManagerImpl$getRelationList$1.I$1;
                            int i28 = inHouseIMContactManagerImpl$getRelationList$1.I$0;
                            objectRef2 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationList$1.L$6;
                            Ref.LongRef longRef23 = (Ref.LongRef) inHouseIMContactManagerImpl$getRelationList$1.L$5;
                            baseDao3 = (BaseDao) inHouseIMContactManagerImpl$getRelationList$1.L$4;
                            java.util.List<InHouseIMContactInfoEntity> list18 = (java.util.List) inHouseIMContactManagerImpl$getRelationList$1.L$3;
                            obj3 = inHouseIMContactManagerImpl$getRelationList$1.L$2;
                            list4 = (java.util.List) inHouseIMContactManagerImpl$getRelationList$1.L$1;
                            c44176sGc3 = (C44176sGc) inHouseIMContactManagerImpl$getRelationList$1.L$0;
                            C56391yDq.AEQbTJ(obj11);
                            list2 = list18;
                            str3 = "not open";
                            str2 = " attempts";
                            i = i28;
                            str4 = "Database Operation failed after ";
                            i3 = i27;
                            longRef5 = longRef23;
                            Ref.LongRef longRef20222 = longRef5;
                            inHouseIMContactManagerImpl$getRelationList$12 = inHouseIMContactManagerImpl$getRelationList$1;
                            C44176sGc c44176sGc9222 = c44176sGc3;
                            objectRef = objectRef2;
                            baseDaoKWHzl = baseDao3;
                            c44176sGc2 = c44176sGc9222;
                            i2 = i3 + 1;
                            obj = obj3;
                            list3 = list4;
                            str21 = str4;
                            str20 = str3;
                            str = str2;
                            longRef = longRef20222;
                            if (i2 < i) {
                            }
                            break;
                        case 4:
                            obj5 = inHouseIMContactManagerImpl$getRelationList$1.L$2;
                            list6 = (java.util.List) inHouseIMContactManagerImpl$getRelationList$1.L$1;
                            c44176sGc4 = (C44176sGc) inHouseIMContactManagerImpl$getRelationList$1.L$0;
                            C56391yDq.AEQbTJ(obj11);
                            obj7 = obj11;
                            java.util.ArrayList arrayList32 = new java.util.ArrayList();
                            while (r0.hasNext()) {
                            }
                            InHouseIMContactDao inHouseIMContactDaoKWHzl22 = c44176sGc4.KWHzl();
                            longRef6 = new Ref.LongRef();
                            objectRef6 = new Ref.ObjectRef();
                            str7 = str22;
                            i6 = 3;
                            list7 = arrayList32;
                            inHouseIMContactManagerImpl$getRelationList$13 = inHouseIMContactManagerImpl$getRelationList$1;
                            baseDao4 = inHouseIMContactDaoKWHzl22;
                            obj8 = obj5;
                            i7 = 0;
                            if (i7 < i6) {
                            }
                            break;
                        case 5:
                            long j2 = inHouseIMContactManagerImpl$getRelationList$1.J$0;
                            int i29 = inHouseIMContactManagerImpl$getRelationList$1.I$2;
                            int i30 = inHouseIMContactManagerImpl$getRelationList$1.I$1;
                            int i31 = inHouseIMContactManagerImpl$getRelationList$1.I$0;
                            Ref.ObjectRef objectRef18 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationList$1.L$9;
                            Ref.LongRef longRef24 = (Ref.LongRef) inHouseIMContactManagerImpl$getRelationList$1.L$8;
                            objectRef7 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationList$1.L$7;
                            objectRef6 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationList$1.L$6;
                            Ref.LongRef longRef25 = (Ref.LongRef) inHouseIMContactManagerImpl$getRelationList$1.L$5;
                            i8 = i29;
                            BaseDao baseDao14 = (BaseDao) inHouseIMContactManagerImpl$getRelationList$1.L$4;
                            java.util.List<java.lang.String> list19 = (java.util.List) inHouseIMContactManagerImpl$getRelationList$1.L$3;
                            java.lang.Object obj18 = inHouseIMContactManagerImpl$getRelationList$1.L$2;
                            java.util.List<? extends ContactRelationType> list20 = (java.util.List) inHouseIMContactManagerImpl$getRelationList$1.L$1;
                            C44176sGc c44176sGc13 = (C44176sGc) inHouseIMContactManagerImpl$getRelationList$1.L$0;
                            try {
                                C56391yDq.AEQbTJ(obj11);
                                objectRef9 = objectRef18;
                                i6 = i31;
                                inHouseIMContactManagerImpl$getRelationList$13 = inHouseIMContactManagerImpl$getRelationList$1;
                                obj8 = obj18;
                                str8 = " attempts";
                                str9 = "not open";
                                baseDao6 = baseDao14;
                                i11 = i30;
                                list7 = list19;
                                str10 = "Database Operation failed after ";
                                longRef8 = longRef25;
                                jNanoTime2 = j2;
                                list6 = list20;
                                c44176sGc4 = c44176sGc13;
                                longRef12 = longRef24;
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e31) {
                                baseDao5 = baseDao14;
                                i9 = i31;
                                objectRef8 = objectRef6;
                                list8 = list19;
                                obj9 = obj18;
                                list9 = list20;
                                c44176sGc5 = c44176sGc13;
                                inHouseIMContactManagerImpl$getRelationList$13 = inHouseIMContactManagerImpl$getRelationList$1;
                                i10 = i30;
                                longRef7 = longRef25;
                                i7 = i8;
                                r02 = e31;
                                C44159sFm.copydefault(r02, (java.lang.Exception) objectRef8.element);
                                objectRef8.element = r02;
                                if (i7 >= i9 - 1) {
                                }
                                r13 = longRef8;
                                r2 = baseDao6;
                                C44159sFm.EZpvd(r2, r13.element);
                                throw th;
                            } catch (java.lang.IllegalStateException e32) {
                                e = e32;
                                message2 = e.getMessage();
                                if (message2 == null) {
                                    break;
                                }
                                C44159sFm.copydefault(e);
                                throw e;
                            } catch (java.lang.Exception e33) {
                                e = e33;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (java.lang.Throwable th10) {
                                th = th10;
                                r2 = baseDao14;
                                r13 = longRef25;
                                C44159sFm.EZpvd(r2, r13.element);
                                throw th;
                            }
                            objectRef9.element = Unit.INSTANCE;
                            longRef12.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime2, DurationUnit.NANOSECONDS));
                            java.lang.Object obj142 = objectRef7.element;
                            C44159sFm.EZpvd(baseDao6, longRef8.element);
                            InHouseIMContactDao inHouseIMContactDaoKWHzl42 = c44176sGc4.KWHzl();
                            longRef13 = new Ref.LongRef();
                            objectRef10 = new Ref.ObjectRef();
                            list11 = list6;
                            inHouseIMContactManagerImpl$getRelationList$1 = inHouseIMContactManagerImpl$getRelationList$13;
                            str20 = str9;
                            str21 = str10;
                            str13 = str8;
                            i15 = 0;
                            i16 = 3;
                            baseDao10 = inHouseIMContactDaoKWHzl42;
                            if (i15 >= i16) {
                            }
                            break;
                        case 6:
                            i13 = inHouseIMContactManagerImpl$getRelationList$1.I$1;
                            i9 = inHouseIMContactManagerImpl$getRelationList$1.I$0;
                            objectRef8 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationList$1.L$6;
                            Ref.LongRef longRef26 = (Ref.LongRef) inHouseIMContactManagerImpl$getRelationList$1.L$5;
                            BaseDao baseDao15 = (BaseDao) inHouseIMContactManagerImpl$getRelationList$1.L$4;
                            list8 = (java.util.List) inHouseIMContactManagerImpl$getRelationList$1.L$3;
                            obj9 = inHouseIMContactManagerImpl$getRelationList$1.L$2;
                            list9 = (java.util.List) inHouseIMContactManagerImpl$getRelationList$1.L$1;
                            c44176sGc5 = (C44176sGc) inHouseIMContactManagerImpl$getRelationList$1.L$0;
                            C56391yDq.AEQbTJ(obj11);
                            longRef14 = longRef26;
                            baseDao8 = baseDao15;
                            longRef10 = longRef14;
                            baseDao11 = baseDao8;
                            list7 = list8;
                            inHouseIMContactManagerImpl$getRelationList$13 = inHouseIMContactManagerImpl$getRelationList$1;
                            i6 = i9;
                            list6 = list9;
                            str7 = str22;
                            i10 = i13;
                            i12 = 1;
                            C44176sGc c44176sGc1122 = c44176sGc5;
                            objectRef6 = objectRef8;
                            c44176sGc4 = c44176sGc1122;
                            i7 = i10 + i12;
                            obj8 = obj9;
                            longRef6 = longRef10;
                            baseDao4 = baseDao11;
                            if (i7 < i6) {
                            }
                            break;
                        case 7:
                            long j3 = inHouseIMContactManagerImpl$getRelationList$1.J$0;
                            int i32 = inHouseIMContactManagerImpl$getRelationList$1.I$2;
                            int i33 = inHouseIMContactManagerImpl$getRelationList$1.I$1;
                            int i34 = inHouseIMContactManagerImpl$getRelationList$1.I$0;
                            objectRef11 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationList$1.L$7;
                            Ref.LongRef longRef27 = (Ref.LongRef) inHouseIMContactManagerImpl$getRelationList$1.L$6;
                            objectRef12 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationList$1.L$5;
                            objectRef10 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationList$1.L$4;
                            Ref.LongRef longRef28 = (Ref.LongRef) inHouseIMContactManagerImpl$getRelationList$1.L$3;
                            BaseDao baseDao16 = (BaseDao) inHouseIMContactManagerImpl$getRelationList$1.L$2;
                            java.util.List<? extends ContactRelationType> list21 = (java.util.List) inHouseIMContactManagerImpl$getRelationList$1.L$1;
                            C44176sGc c44176sGc14 = (C44176sGc) inHouseIMContactManagerImpl$getRelationList$1.L$0;
                            try {
                                C56391yDq.AEQbTJ(obj11);
                                str16 = " attempts";
                                list13 = list21;
                                str17 = "not open";
                                str18 = "Database Operation failed after ";
                                longRef16 = longRef27;
                                jNanoTime3 = j3;
                                i15 = i33;
                                longRef17 = longRef28;
                                c44176sGc4 = c44176sGc14;
                                i16 = i34;
                                i20 = i32;
                                baseDao10 = baseDao16;
                                r04 = obj11;
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e34) {
                                i17 = i32;
                                c44176sGc7 = c44176sGc14;
                                i18 = i33;
                                i19 = i34;
                                longRef15 = longRef28;
                                objectRef13 = objectRef10;
                                list12 = list21;
                                baseDao10 = baseDao16;
                                r03 = e34;
                                C44159sFm.copydefault(r03, (java.lang.Exception) objectRef13.element);
                                objectRef13.element = r03;
                                longRef19 = longRef15;
                                if (i17 < i19 - 1) {
                                }
                                int i2422 = i18;
                                i16 = i19;
                                objectRef10 = objectRef13;
                                list11 = list12;
                                c44176sGc4 = c44176sGc7;
                                str13 = str22;
                                i15 = i2422 + 1;
                                longRef13 = longRef19;
                                if (i15 >= i16) {
                                }
                            } catch (java.lang.IllegalStateException e35) {
                                e = e35;
                                message3 = e.getMessage();
                                if (message3 == null) {
                                }
                                C44159sFm.copydefault(e);
                                throw e;
                            } catch (java.lang.Exception e36) {
                                e = e36;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (java.lang.Throwable th11) {
                                th = th11;
                                r22 = baseDao16;
                                r11 = longRef28;
                                C44159sFm.EZpvd(r22, r11.element);
                                throw th;
                            }
                            objectRef11.element = r04;
                            longRef16.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime3, DurationUnit.NANOSECONDS));
                            java.lang.Object obj152 = objectRef12.element;
                            C44159sFm.EZpvd(baseDao10, longRef17.element);
                            java.util.ArrayList arrayList42 = new java.util.ArrayList();
                            while (r0.hasNext()) {
                            }
                            return arrayList42;
                        case 8:
                            i18 = inHouseIMContactManagerImpl$getRelationList$1.I$1;
                            i19 = inHouseIMContactManagerImpl$getRelationList$1.I$0;
                            objectRef13 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationList$1.L$4;
                            Ref.LongRef longRef29 = (Ref.LongRef) inHouseIMContactManagerImpl$getRelationList$1.L$3;
                            baseDao10 = (BaseDao) inHouseIMContactManagerImpl$getRelationList$1.L$2;
                            list12 = (java.util.List) inHouseIMContactManagerImpl$getRelationList$1.L$1;
                            c44176sGc7 = (C44176sGc) inHouseIMContactManagerImpl$getRelationList$1.L$0;
                            C56391yDq.AEQbTJ(obj11);
                            longRef19 = longRef29;
                            int i24222 = i18;
                            i16 = i19;
                            objectRef10 = objectRef13;
                            list11 = list12;
                            c44176sGc4 = c44176sGc7;
                            str13 = str22;
                            i15 = i24222 + 1;
                            longRef13 = longRef19;
                            if (i15 >= i16) {
                            }
                            break;
                        default:
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (java.lang.Throwable th12) {
                    th = th12;
                    r13 = AbstractC43419rot.TAG;
                    r2 = "Error: ";
                }
            } catch (java.lang.Throwable th13) {
                th = th13;
                r11 = AbstractC43419rot.TAG;
                r22 = "Error: ";
            }
        } catch (java.lang.Throwable th14) {
            th = th14;
            r6 = "Error: ";
            baseDao2 = baseDao;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v38, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v39, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a A[Catch: all -> 0x004a, TryCatch #10 {all -> 0x004a, blocks: (B:13:0x0042, B:37:0x00ec, B:51:0x011d, B:52:0x0120, B:55:0x0124, B:57:0x012a, B:59:0x0136, B:60:0x0139, B:61:0x013a, B:62:0x013d), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0153 A[Catch: all -> 0x0189, TRY_LEAVE, TryCatch #9 {all -> 0x0189, blocks: (B:66:0x0146, B:68:0x0153), top: B:86:0x0146 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0176 -> B:72:0x0178). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x017d -> B:73:0x017b). Please report as a decompilation issue!!! */
    @Override // o.InterfaceC44178sGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<ContactWithPhoneData>> continuation) throws java.lang.Exception {
        InHouseIMContactManagerImpl$getLocalRelationList$1 inHouseIMContactManagerImpl$getLocalRelationList$1;
        C44176sGc c44176sGc;
        BaseDao baseDao;
        Ref.LongRef longRef;
        Ref.ObjectRef objectRef;
        C44176sGc c44176sGc2;
        Ref.LongRef longRef2;
        int i;
        int i2;
        C44176sGc c44176sGc3;
        int i3;
        Ref.ObjectRef objectRef2;
        int i4;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        BaseDao baseDao2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.LongRef longRef3;
        long jNanoTime;
        int i5;
        int i6;
        T t;
        if (continuation instanceof InHouseIMContactManagerImpl$getLocalRelationList$1) {
            inHouseIMContactManagerImpl$getLocalRelationList$1 = (InHouseIMContactManagerImpl$getLocalRelationList$1) continuation;
            int i7 = inHouseIMContactManagerImpl$getLocalRelationList$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                inHouseIMContactManagerImpl$getLocalRelationList$1.label = i7 - Integer.MIN_VALUE;
                c44176sGc = this;
            } else {
                c44176sGc = this;
                inHouseIMContactManagerImpl$getLocalRelationList$1 = new InHouseIMContactManagerImpl$getLocalRelationList$1(c44176sGc, continuation);
            }
        }
        java.lang.Object obj = inHouseIMContactManagerImpl$getLocalRelationList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = inHouseIMContactManagerImpl$getLocalRelationList$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = inHouseIMContactManagerImpl$getLocalRelationList$1.J$0;
                    i2 = inHouseIMContactManagerImpl$getLocalRelationList$1.I$2;
                    i3 = inHouseIMContactManagerImpl$getLocalRelationList$1.I$1;
                    int i9 = inHouseIMContactManagerImpl$getLocalRelationList$1.I$0;
                    objectRef4 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getLocalRelationList$1.L$6;
                    longRef2 = (Ref.LongRef) inHouseIMContactManagerImpl$getLocalRelationList$1.L$5;
                    objectRef3 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getLocalRelationList$1.L$4;
                    objectRef = (Ref.ObjectRef) inHouseIMContactManagerImpl$getLocalRelationList$1.L$3;
                    longRef = (Ref.LongRef) inHouseIMContactManagerImpl$getLocalRelationList$1.L$2;
                    baseDao = (BaseDao) inHouseIMContactManagerImpl$getLocalRelationList$1.L$1;
                    c44176sGc2 = (C44176sGc) inHouseIMContactManagerImpl$getLocalRelationList$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef3 = longRef;
                        i6 = i3;
                        baseDao2 = baseDao;
                        i5 = i9;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        objectRef2 = objectRef;
                        longRef2 = longRef;
                        c44176sGc3 = c44176sGc2;
                        i4 = i9;
                        sQLiteDatabaseLockedException = e3;
                        baseDao2 = baseDao;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i4 - 1) {
                        }
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
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
                    objectRef4.element = t;
                    longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    return t2;
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = inHouseIMContactManagerImpl$getLocalRelationList$1.I$1;
                i4 = inHouseIMContactManagerImpl$getLocalRelationList$1.I$0;
                objectRef2 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getLocalRelationList$1.L$3;
                Ref.LongRef longRef4 = (Ref.LongRef) inHouseIMContactManagerImpl$getLocalRelationList$1.L$2;
                baseDao2 = (BaseDao) inHouseIMContactManagerImpl$getLocalRelationList$1.L$1;
                c44176sGc3 = (C44176sGc) inHouseIMContactManagerImpl$getLocalRelationList$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objectRef = objectRef2;
                longRef2 = longRef4;
                i3 = i10;
                i2 = i3 + 1;
                baseDao = baseDao2;
                c44176sGc2 = c44176sGc3;
                i = i4;
                if (i2 >= i) {
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                        try {
                            i3 = i2;
                            objectRef2 = objectRef;
                            c44176sGc3 = c44176sGc2;
                            i4 = i;
                            sQLiteDatabaseLockedException = e6;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i2 < i4 - 1) {
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            Ref.LongRef longRef5 = longRef2;
                            longRef = longRef5;
                            baseDao = baseDao2;
                            C44159sFm.EZpvd(baseDao, longRef.element);
                            throw th;
                        }
                        baseDao2 = baseDao;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    } catch (java.lang.IllegalStateException e7) {
                        e2 = e7;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e8) {
                        e = e8;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        longRef = longRef2;
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    }
                    objectRef4 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMContactDao inHouseIMContactDaoKWHzl = c44176sGc2.KWHzl();
                    inHouseIMContactManagerImpl$getLocalRelationList$1.L$0 = c44176sGc2;
                    inHouseIMContactManagerImpl$getLocalRelationList$1.L$1 = baseDao;
                    inHouseIMContactManagerImpl$getLocalRelationList$1.L$2 = longRef2;
                    inHouseIMContactManagerImpl$getLocalRelationList$1.L$3 = objectRef;
                    inHouseIMContactManagerImpl$getLocalRelationList$1.L$4 = objectRef4;
                    inHouseIMContactManagerImpl$getLocalRelationList$1.L$5 = longRef2;
                    inHouseIMContactManagerImpl$getLocalRelationList$1.L$6 = objectRef4;
                    inHouseIMContactManagerImpl$getLocalRelationList$1.I$0 = i;
                    inHouseIMContactManagerImpl$getLocalRelationList$1.I$1 = i2;
                    inHouseIMContactManagerImpl$getLocalRelationList$1.I$2 = i2;
                    inHouseIMContactManagerImpl$getLocalRelationList$1.J$0 = jNanoTime;
                    inHouseIMContactManagerImpl$getLocalRelationList$1.label = 1;
                    java.lang.Object allContacts = inHouseIMContactDaoKWHzl.getAllContacts(inHouseIMContactManagerImpl$getLocalRelationList$1);
                    if (allContacts == objCopydefault) {
                        return objCopydefault;
                    }
                    i6 = i2;
                    objectRef3 = objectRef4;
                    longRef3 = longRef2;
                    int i11 = i;
                    baseDao2 = baseDao;
                    i5 = i11;
                    t = allContacts;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        objectRef2 = objectRef;
                        i4 = i5;
                        c44176sGc3 = c44176sGc2;
                        longRef2 = longRef3;
                        i3 = i6;
                        r0 = e9;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i2 < i4 - 1) {
                            inHouseIMContactManagerImpl$getLocalRelationList$1.L$0 = c44176sGc3;
                            inHouseIMContactManagerImpl$getLocalRelationList$1.L$1 = baseDao2;
                            inHouseIMContactManagerImpl$getLocalRelationList$1.L$2 = longRef2;
                            inHouseIMContactManagerImpl$getLocalRelationList$1.L$3 = objectRef2;
                            inHouseIMContactManagerImpl$getLocalRelationList$1.L$4 = null;
                            inHouseIMContactManagerImpl$getLocalRelationList$1.L$5 = null;
                            inHouseIMContactManagerImpl$getLocalRelationList$1.L$6 = null;
                            inHouseIMContactManagerImpl$getLocalRelationList$1.I$0 = i4;
                            inHouseIMContactManagerImpl$getLocalRelationList$1.I$1 = i3;
                            inHouseIMContactManagerImpl$getLocalRelationList$1.label = 2;
                            if (DelayKt.delay(((long) (i2 + 1)) * 50, inHouseIMContactManagerImpl$getLocalRelationList$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            i10 = i3;
                            longRef4 = longRef2;
                            objectRef = objectRef2;
                            longRef2 = longRef4;
                            i3 = i10;
                            i2 = i3 + 1;
                            baseDao = baseDao2;
                            c44176sGc2 = c44176sGc3;
                            i = i4;
                            if (i2 >= i) {
                            }
                        } else {
                            objectRef = objectRef2;
                            i2 = i3 + 1;
                            baseDao = baseDao2;
                            c44176sGc2 = c44176sGc3;
                            i = i4;
                            if (i2 >= i) {
                            }
                        }
                        C44159sFm.EZpvd(baseDao, longRef.element);
                        throw th;
                    } catch (java.lang.IllegalStateException e10) {
                        e2 = e10;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e11) {
                        e = e11;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    }
                    objectRef4.element = t;
                    longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t22 = objectRef3.element;
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    return t22;
                }
                C44159sFm.EZpvd(baseDao, longRef2.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            InHouseIMContactDao inHouseIMContactDaoKWHzl2 = KWHzl();
            Ref.LongRef longRef6 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            baseDao = inHouseIMContactDaoKWHzl2;
            c44176sGc2 = c44176sGc;
            longRef2 = longRef6;
            i = 3;
            i2 = 0;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:112:0x03c8 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:122:0x03e9 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:155:0x048a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:163:0x04a8 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:172:0x04b7 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:33:0x00fc */
    /* JADX DEBUG: Type inference failed for r0v102. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v44. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v57. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v87. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r11v21. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r6v2. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r8v9. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x045b: MOVE (r11 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:147:0x045b */
    /* JADX WARN: Path cross not found for [B:65:0x01d8, B:68:0x01eb], limit reached: 239 */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03fb A[Catch: all -> 0x005a, TryCatch #30 {all -> 0x005a, blocks: (B:13:0x0055, B:104:0x035b, B:106:0x0362, B:125:0x03ec, B:126:0x03ef, B:130:0x03f5, B:132:0x03fb, B:134:0x0405, B:135:0x0408, B:136:0x0409, B:137:0x040c, B:141:0x041b, B:143:0x0428), top: B:222:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0428 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #30 {all -> 0x005a, blocks: (B:13:0x0055, B:104:0x035b, B:106:0x0362, B:125:0x03ec, B:126:0x03ef, B:130:0x03f5, B:132:0x03fb, B:134:0x0405, B:135:0x0408, B:136:0x0409, B:137:0x040c, B:141:0x041b, B:143:0x0428), top: B:222:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04c9 A[Catch: all -> 0x00fc, TryCatch #17 {all -> 0x00fc, blocks: (B:31:0x00f1, B:174:0x04ba, B:175:0x04bd, B:179:0x04c3, B:181:0x04c9, B:183:0x04d3, B:184:0x04d6, B:185:0x04d7, B:186:0x04da), top: B:222:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0501 A[Catch: all -> 0x0553, TRY_LEAVE, TryCatch #27 {all -> 0x0553, blocks: (B:191:0x04f4, B:193:0x0501), top: B:224:0x04f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x035b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0261 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02df A[LOOP:1: B:87:0x02d9->B:89:0x02df, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0311 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x032c  */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v114 */
    /* JADX WARN: Type inference failed for: r0v33, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v77, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r1v26, types: [T, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v34, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v63, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r3v10, types: [T, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20, types: [com.okinc.okimcore.common.database.BaseDao, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32, types: [com.okinc.okimcore.common.database.BaseDao, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:142:0x0426 -> B:146:0x044f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x044c -> B:146:0x044f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:196:0x052b -> B:197:0x0531). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:198:0x053a -> B:199:0x0549). Please report as a decompilation issue!!! */
    @Override // o.InterfaceC44178sGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(java.util.List<? extends ContactRelationType> list, @NotNull Continuation<? super java.util.List<InHouseIMContactInfoEntity>> continuation) throws java.lang.Exception {
        InHouseIMContactManagerImpl$getRelationsWithRemarkNames$1 inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        ?? r2;
        Ref.LongRef longRef3;
        ?? r22;
        C44176sGc c44176sGc;
        java.util.ArrayList arrayList;
        AbstractC43419rot actionBar;
        java.util.List<InHouseIMContactInfoEntity> list2;
        Ref.LongRef longRef4;
        Ref.ObjectRef objectRef;
        java.lang.String str;
        int i;
        InHouseIMContactManagerImpl$getRelationsWithRemarkNames$1 inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12;
        C44176sGc c44176sGc2;
        int i2;
        java.util.List<? extends ContactRelationType> listAhwBna;
        java.lang.Object obj;
        ResponseData responseData;
        int i3;
        int i4;
        Ref.ObjectRef objectRef2;
        java.util.List<InHouseIMContactInfoEntity> list3;
        java.lang.Object obj2;
        java.util.List<? extends ContactRelationType> list4;
        C44176sGc c44176sGc3;
        java.lang.String str2;
        int i5;
        java.lang.String str3;
        java.lang.String str4;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        ?? r23;
        Ref.ObjectRef objectRef5;
        int i6;
        Ref.LongRef longRef5;
        java.lang.String str5;
        long jNanoTime;
        ?? r7;
        java.lang.String message;
        ?? r72;
        ?? r0;
        Ref.ObjectRef objectRef6;
        int i7;
        java.util.Iterator it;
        java.lang.Object obj3;
        C44176sGc c44176sGc4;
        java.lang.Object obj4;
        java.lang.String str6;
        ?? r9;
        ?? r92;
        ?? KWHzl;
        Ref.LongRef longRef6;
        Ref.ObjectRef objectRef7;
        java.lang.String str7;
        int i8;
        InHouseIMContactManagerImpl$getRelationsWithRemarkNames$1 inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13;
        java.util.List<java.lang.String> list5;
        java.lang.Object obj5;
        int i9;
        int i10;
        int i11;
        Ref.ObjectRef objectRef8;
        Ref.LongRef longRef7;
        int i12;
        java.lang.Object obj6;
        int i13;
        ?? r93;
        C44176sGc c44176sGc5;
        int i14;
        Ref.ObjectRef objectRef9;
        java.util.List<java.lang.String> list6;
        java.lang.Object obj7;
        Ref.ObjectRef objectRef10;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        long jNanoTime2;
        java.lang.String message2;
        ?? r02;
        java.lang.String str11;
        ?? r94;
        java.util.List<? extends ContactRelationType> list7 = list;
        if (continuation instanceof InHouseIMContactManagerImpl$getRelationsWithRemarkNames$1) {
            inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1 = (InHouseIMContactManagerImpl$getRelationsWithRemarkNames$1) continuation;
            int i15 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.label;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.label = i15 - Integer.MIN_VALUE;
            } else {
                inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1 = new InHouseIMContactManagerImpl$getRelationsWithRemarkNames$1(this, continuation);
            }
        }
        java.lang.Object relationListWithRemarks = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i16 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.label;
        ?? r95 = AbstractC43419rot.TAG;
        java.lang.String str12 = "not open";
        java.lang.String str13 = "Database Operation failed after ";
        java.lang.String str14 = " attempts";
        try {
            try {
                switch (i16) {
                    case 0:
                        C56391yDq.AEQbTJ(relationListWithRemarks);
                        try {
                            InHouseIMRelationService inHouseIMRelationService = this.AEQbTJ;
                            if (list7 != null) {
                                arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list7, 10));
                                java.util.Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(C56443yFo.AEQbTJ(((ContactRelationType) it2.next()).getApiValue()));
                                }
                            } else {
                                arrayList = null;
                            }
                            inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$0 = this;
                            inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$1 = list7;
                            inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.label = 1;
                            relationListWithRemarks = inHouseIMRelationService.getRelationListWithRemarks(arrayList, inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1);
                            break;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            c44176sGc = this;
                            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                        }
                        if (relationListWithRemarks == objCopydefault) {
                            return objCopydefault;
                        }
                        c44176sGc = this;
                        responseData = (ResponseData) relationListWithRemarks;
                        if (responseData.getCode() != 0 && responseData.getData() != null) {
                            java.lang.Object data = responseData.getData();
                            Intrinsics.copydefault(data);
                            actionBar = new AbstractC43419rot.StateListAnimator(data);
                        } else {
                            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                        }
                        if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
                            java.lang.Object objKWHzl = ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
                            list2 = (java.util.List) objKWHzl;
                            InHouseIMContactDao inHouseIMContactDaoKWHzl = c44176sGc.KWHzl();
                            longRef4 = new Ref.LongRef();
                            objectRef = new Ref.ObjectRef();
                            str = " attempts";
                            i = 3;
                            inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1;
                            c44176sGc2 = c44176sGc;
                            i2 = 0;
                            listAhwBna = list7;
                            obj = objKWHzl;
                            r7 = inHouseIMContactDaoKWHzl;
                            if (i2 >= i) {
                                try {
                                    try {
                                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
                                        e = e;
                                        obj4 = obj;
                                        str6 = str12;
                                        str4 = str13;
                                    } catch (java.lang.IllegalStateException e2) {
                                        e = e2;
                                        r72 = r7;
                                    }
                                    objectRef3 = new Ref.ObjectRef();
                                    str6 = str12;
                                    str4 = str13;
                                    try {
                                        try {
                                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                                            e = e3;
                                            obj4 = obj;
                                        }
                                        jNanoTime = java.lang.System.nanoTime();
                                        InHouseIMContactDao inHouseIMContactDaoKWHzl2 = c44176sGc2.KWHzl();
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$0 = c44176sGc2;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$1 = listAhwBna;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$2 = obj;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$3 = list2;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$4 = r7;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$5 = longRef4;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$6 = objectRef;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$7 = objectRef3;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$8 = longRef4;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$9 = objectRef3;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.I$0 = i;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.I$1 = i2;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.I$2 = i2;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.J$0 = jNanoTime;
                                        obj4 = obj;
                                        try {
                                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e4) {
                                            try {
                                                e = e4;
                                                C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                                                objectRef2.element = r0;
                                                if (i5 < i4 - 1) {
                                                    inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$0 = c44176sGc3;
                                                    inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$1 = list4;
                                                    inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$2 = obj2;
                                                    inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$3 = list3;
                                                    inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$4 = r95;
                                                    inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$5 = longRef4;
                                                    inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$6 = objectRef2;
                                                    inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$7 = null;
                                                    inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$8 = null;
                                                    inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$9 = null;
                                                    inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.I$0 = i4;
                                                    inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.I$1 = i3;
                                                    inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.label = 3;
                                                    if (DelayKt.delay(((long) (i5 + 1)) * 50, inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1) == objCopydefault) {
                                                        return objCopydefault;
                                                    }
                                                    str13 = str4;
                                                    str12 = str3;
                                                    str14 = str2;
                                                    r92 = r95;
                                                    inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1;
                                                    objectRef6 = objectRef2;
                                                    list2 = list3;
                                                    i7 = 1;
                                                    i = i4;
                                                    listAhwBna = list4;
                                                    str = str14;
                                                    r9 = r92;
                                                    obj = obj2;
                                                    i2 = i3 + i7;
                                                    r7 = r9;
                                                    c44176sGc2 = c44176sGc3;
                                                    objectRef = objectRef6;
                                                    if (i2 >= i) {
                                                    }
                                                } else {
                                                    inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1;
                                                    objectRef6 = objectRef2;
                                                    list2 = list3;
                                                    str13 = str4;
                                                    str12 = str3;
                                                    i7 = 1;
                                                    i = i4;
                                                    listAhwBna = list4;
                                                    str = str2;
                                                    r9 = r95;
                                                    obj = obj2;
                                                    i2 = i3 + i7;
                                                    r7 = r9;
                                                    c44176sGc2 = c44176sGc3;
                                                    objectRef = objectRef6;
                                                    if (i2 >= i) {
                                                    }
                                                }
                                            } catch (java.lang.Throwable th2) {
                                                th = th2;
                                                Ref.LongRef longRef8 = longRef4;
                                                longRef3 = longRef8;
                                                r22 = r95;
                                                C44159sFm.EZpvd(r22, longRef3.element);
                                                throw th;
                                            }
                                            i5 = i2;
                                            str2 = str;
                                            obj2 = obj4;
                                            str3 = str6;
                                            list4 = listAhwBna;
                                            inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12;
                                            i4 = i;
                                            list3 = list2;
                                            objectRef2 = objectRef;
                                            c44176sGc3 = c44176sGc2;
                                            r95 = r7;
                                            i3 = i5;
                                            r0 = e;
                                        }
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.label = 2;
                                        if (inHouseIMContactDaoKWHzl2.insertOrReplaceContacts(list2, inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                        r23 = r7;
                                        str2 = str;
                                        str5 = str4;
                                        obj2 = obj4;
                                        str3 = str6;
                                        i6 = i2;
                                        i3 = i6;
                                        longRef5 = longRef4;
                                        objectRef4 = objectRef;
                                        objectRef5 = objectRef3;
                                        try {
                                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e5) {
                                            list4 = listAhwBna;
                                            inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12;
                                            c44176sGc3 = c44176sGc2;
                                            i4 = i;
                                            r95 = r23;
                                            list3 = list2;
                                            objectRef2 = objectRef4;
                                            str4 = str5;
                                            i5 = i6;
                                            r0 = e5;
                                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                                            objectRef2.element = r0;
                                            if (i5 < i4 - 1) {
                                            }
                                        } catch (java.lang.IllegalStateException e6) {
                                            e = e6;
                                            r72 = r23;
                                            str12 = str3;
                                            message = e.getMessage();
                                            if (message == null) {
                                            }
                                            C44159sFm.copydefault(e);
                                            throw e;
                                        } catch (java.lang.Exception e7) {
                                            e = e7;
                                            r7 = r23;
                                            C44159sFm.OLrzqt(e);
                                            throw e;
                                        } catch (java.lang.Throwable th3) {
                                            th = th3;
                                            longRef3 = longRef4;
                                            r22 = r23;
                                            C44159sFm.EZpvd(r22, longRef3.element);
                                            throw th;
                                        }
                                        objectRef3.element = Unit.INSTANCE;
                                        longRef5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                                        java.lang.Object obj8 = objectRef5.element;
                                        C44159sFm.EZpvd(r23, longRef4.element);
                                        C44485sRo c44485sRo = c44176sGc2.OLrzqt;
                                        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                                        it = list2.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(((InHouseIMContactInfoEntity) it.next()).getContactUid());
                                        }
                                        if (listAhwBna == null) {
                                            listAhwBna = yDY.AhwBna();
                                        }
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$0 = c44176sGc2;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$1 = obj2;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$2 = null;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$3 = null;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$4 = null;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$5 = null;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$6 = null;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$7 = null;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$8 = null;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$9 = null;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.label = 4;
                                        relationListWithRemarks = c44485sRo.EZpvd(arrayList2, listAhwBna, inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12);
                                        if (relationListWithRemarks != objCopydefault) {
                                            return objCopydefault;
                                        }
                                        obj3 = obj2;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12;
                                        c44176sGc4 = c44176sGc2;
                                        str12 = str3;
                                        str13 = str5;
                                        str14 = str2;
                                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                        for (java.lang.Object obj9 : (java.lang.Iterable) relationListWithRemarks) {
                                            if (!Intrinsics.EZpvd(obj9, (java.lang.Object) C44157sFk.KWHzl())) {
                                                arrayList3.add(obj9);
                                            }
                                        }
                                        KWHzl = c44176sGc4.KWHzl();
                                        longRef6 = new Ref.LongRef();
                                        objectRef7 = new Ref.ObjectRef();
                                        str7 = str14;
                                        i8 = 3;
                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1;
                                        list5 = arrayList3;
                                        obj5 = obj3;
                                        i9 = 0;
                                        if (i9 >= i8) {
                                            try {
                                                try {
                                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                                                    e = e8;
                                                    str11 = str12;
                                                } catch (java.lang.IllegalStateException e9) {
                                                    e = e9;
                                                    str11 = str12;
                                                }
                                                Ref.ObjectRef objectRef11 = new Ref.ObjectRef();
                                                str11 = str12;
                                                try {
                                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                                                    e = e10;
                                                    str12 = str11;
                                                    obj7 = obj5;
                                                    i13 = i9;
                                                    list6 = list5;
                                                    inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13;
                                                    str14 = str7;
                                                    objectRef9 = objectRef7;
                                                    c44176sGc5 = c44176sGc4;
                                                    i14 = i8;
                                                    r02 = e;
                                                    r93 = KWHzl;
                                                    C44159sFm.copydefault(r02, (java.lang.Exception) objectRef9.element);
                                                    objectRef9.element = r02;
                                                    r94 = r93;
                                                    if (i13 < i14 - 1) {
                                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$0 = c44176sGc5;
                                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$1 = obj7;
                                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$2 = list6;
                                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$3 = r93;
                                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$4 = longRef6;
                                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$5 = objectRef9;
                                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$6 = null;
                                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$7 = null;
                                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$8 = null;
                                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.I$0 = i14;
                                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.I$1 = i9;
                                                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.label = 6;
                                                        r94 = r93;
                                                        if (DelayKt.delay(((long) (i13 + 1)) * 50, inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1) == objCopydefault) {
                                                            return objCopydefault;
                                                        }
                                                    }
                                                    i8 = i14;
                                                    c44176sGc4 = c44176sGc5;
                                                    objectRef7 = objectRef9;
                                                    obj5 = obj7;
                                                    str7 = str14;
                                                    inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1;
                                                    list5 = list6;
                                                    i9++;
                                                    KWHzl = r94;
                                                    if (i9 >= i8) {
                                                    }
                                                } catch (java.lang.IllegalStateException e11) {
                                                    e = e11;
                                                    str12 = str11;
                                                    message2 = e.getMessage();
                                                    if (message2 == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message2, (java.lang.CharSequence) str12, false, 2, (java.lang.Object) null)) {
                                                        C44159sFm.OLrzqt(e);
                                                        throw e;
                                                    }
                                                    C44159sFm.copydefault(e);
                                                    throw e;
                                                }
                                                jNanoTime2 = java.lang.System.nanoTime();
                                                InHouseIMContactDao inHouseIMContactDaoKWHzl3 = c44176sGc4.KWHzl();
                                                inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13.L$0 = c44176sGc4;
                                                inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13.L$1 = obj5;
                                                inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13.L$2 = list5;
                                                inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13.L$3 = KWHzl;
                                                inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13.L$4 = longRef6;
                                                inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13.L$5 = objectRef7;
                                                inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13.L$6 = objectRef11;
                                                inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13.L$7 = longRef6;
                                                inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13.L$8 = objectRef11;
                                                inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13.I$0 = i8;
                                                inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13.I$1 = i9;
                                                inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13.I$2 = i9;
                                                inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13.J$0 = jNanoTime2;
                                                inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13.label = 5;
                                                if (inHouseIMContactDaoKWHzl3.updateRemarkNames(list5, "", inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13) == objCopydefault) {
                                                    return objCopydefault;
                                                }
                                                objectRef10 = objectRef11;
                                                obj6 = obj5;
                                                str8 = str7;
                                                longRef7 = longRef6;
                                                str9 = str13;
                                                str10 = str11;
                                                i12 = i9;
                                                i10 = i12;
                                                r2 = KWHzl;
                                                objectRef8 = objectRef10;
                                                i11 = i8;
                                                longRef2 = longRef7;
                                                try {
                                                } catch (android.database.sqlite.SQLiteDatabaseLockedException e12) {
                                                    i13 = i12;
                                                    r93 = r2;
                                                    list6 = list5;
                                                    inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13;
                                                    i9 = i10;
                                                    objectRef9 = objectRef7;
                                                    str12 = str10;
                                                    str13 = str9;
                                                    str14 = str8;
                                                    obj7 = obj6;
                                                    c44176sGc5 = c44176sGc4;
                                                    i14 = i11;
                                                    longRef6 = longRef2;
                                                    r02 = e12;
                                                    C44159sFm.copydefault(r02, (java.lang.Exception) objectRef9.element);
                                                    objectRef9.element = r02;
                                                    r94 = r93;
                                                    if (i13 < i14 - 1) {
                                                    }
                                                    i8 = i14;
                                                    c44176sGc4 = c44176sGc5;
                                                    objectRef7 = objectRef9;
                                                    obj5 = obj7;
                                                    str7 = str14;
                                                    inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1;
                                                    list5 = list6;
                                                    i9++;
                                                    KWHzl = r94;
                                                    if (i9 >= i8) {
                                                    }
                                                } catch (java.lang.IllegalStateException e13) {
                                                    e = e13;
                                                    str12 = str10;
                                                    message2 = e.getMessage();
                                                    if (message2 == null) {
                                                    }
                                                    C44159sFm.copydefault(e);
                                                    throw e;
                                                } catch (java.lang.Exception e14) {
                                                    e = e14;
                                                    C44159sFm.OLrzqt(e);
                                                    throw e;
                                                } catch (java.lang.Throwable th4) {
                                                    th = th4;
                                                    C44159sFm.EZpvd(r2, longRef2.element);
                                                    throw th;
                                                }
                                                objectRef8.element = Unit.INSTANCE;
                                                longRef7.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime2, DurationUnit.NANOSECONDS));
                                                java.lang.Object obj10 = objectRef10.element;
                                                C44159sFm.EZpvd(r2, longRef2.element);
                                                return (java.util.List) obj6;
                                            } catch (java.lang.Exception e15) {
                                                e = e15;
                                                C44159sFm.OLrzqt(e);
                                                throw e;
                                            }
                                        }
                                        C44159sFm.EZpvd(KWHzl, longRef6.element);
                                        java.lang.Exception exc = (java.lang.Exception) objectRef7.element;
                                        if (exc == null) {
                                            exc = new java.lang.Exception(str13 + i8 + str7);
                                        }
                                        C44159sFm.OLrzqt(exc);
                                        throw exc;
                                    } catch (java.lang.IllegalStateException e16) {
                                        e = e16;
                                        str12 = str6;
                                        r72 = r7;
                                        message = e.getMessage();
                                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) str12, false, 2, (java.lang.Object) null)) {
                                            C44159sFm.OLrzqt(e);
                                            throw e;
                                        }
                                        C44159sFm.copydefault(e);
                                        throw e;
                                    }
                                } catch (java.lang.Exception e17) {
                                    e = e17;
                                    C44159sFm.OLrzqt(e);
                                    throw e;
                                } catch (java.lang.Throwable th5) {
                                    th = th5;
                                    r23 = r7;
                                    longRef3 = longRef4;
                                    r22 = r23;
                                    C44159sFm.EZpvd(r22, longRef3.element);
                                    throw th;
                                }
                            }
                            java.lang.String str15 = str13;
                            C44159sFm.EZpvd(r7, longRef4.element);
                            java.lang.Exception exc2 = (java.lang.Exception) objectRef.element;
                            if (exc2 == null) {
                                exc2 = new java.lang.Exception(str15 + i + str);
                            }
                            C44159sFm.OLrzqt(exc2);
                            throw exc2;
                        }
                        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
                        C44124sEe.imLogContact$default("getRelationsWithRemarkNames failed: " + actionBar2.KWHzl(), null, 2, null);
                        actionBar2.KWHzl();
                        return null;
                    case 1:
                        list7 = (java.util.List) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$1;
                        c44176sGc = (C44176sGc) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$0;
                        try {
                            C56391yDq.AEQbTJ(relationListWithRemarks);
                            responseData = (ResponseData) relationListWithRemarks;
                            if (responseData.getCode() != 0) {
                            }
                            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                        }
                        if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
                        }
                        break;
                    case 2:
                        long j = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.J$0;
                        int i17 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.I$2;
                        i3 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.I$1;
                        int i18 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.I$0;
                        Ref.ObjectRef objectRef12 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$9;
                        Ref.LongRef longRef9 = (Ref.LongRef) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$8;
                        Ref.ObjectRef objectRef13 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$7;
                        Ref.ObjectRef objectRef14 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$6;
                        longRef3 = (Ref.LongRef) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$5;
                        BaseDao baseDao = (BaseDao) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$4;
                        java.util.List<InHouseIMContactInfoEntity> list8 = (java.util.List) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$3;
                        java.lang.Object obj11 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$2;
                        java.util.List<? extends ContactRelationType> list9 = (java.util.List) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$1;
                        C44176sGc c44176sGc6 = (C44176sGc) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$0;
                        try {
                            C56391yDq.AEQbTJ(relationListWithRemarks);
                            objectRef3 = objectRef12;
                            obj2 = obj11;
                            i = i18;
                            str2 = " attempts";
                            c44176sGc2 = c44176sGc6;
                            objectRef4 = objectRef14;
                            r23 = baseDao;
                            objectRef5 = objectRef13;
                            i6 = i17;
                            longRef5 = longRef9;
                            str3 = "not open";
                            longRef4 = longRef3;
                            inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1;
                            str5 = "Database Operation failed after ";
                            jNanoTime = j;
                            list2 = list8;
                            listAhwBna = list9;
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e18) {
                            longRef4 = longRef3;
                            i4 = i18;
                            objectRef2 = objectRef14;
                            list3 = list8;
                            obj2 = obj11;
                            list4 = list9;
                            r95 = baseDao;
                            c44176sGc3 = c44176sGc6;
                            str2 = " attempts";
                            i5 = i17;
                            str3 = "not open";
                            str4 = "Database Operation failed after ";
                            r0 = e18;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i5 < i4 - 1) {
                            }
                        } catch (java.lang.IllegalStateException e19) {
                            e = e19;
                            message = e.getMessage();
                            if (message == null) {
                                break;
                            }
                            C44159sFm.copydefault(e);
                            throw e;
                        } catch (java.lang.Exception e20) {
                            e = e20;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            r22 = baseDao;
                            C44159sFm.EZpvd(r22, longRef3.element);
                            throw th;
                        }
                        objectRef3.element = Unit.INSTANCE;
                        longRef5.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                        java.lang.Object obj82 = objectRef5.element;
                        C44159sFm.EZpvd(r23, longRef4.element);
                        C44485sRo c44485sRo2 = c44176sGc2.OLrzqt;
                        java.util.ArrayList arrayList22 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                        it = list2.iterator();
                        while (it.hasNext()) {
                        }
                        if (listAhwBna == null) {
                        }
                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$0 = c44176sGc2;
                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$1 = obj2;
                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$2 = null;
                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$3 = null;
                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$4 = null;
                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$5 = null;
                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$6 = null;
                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$7 = null;
                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$8 = null;
                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.L$9 = null;
                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12.label = 4;
                        relationListWithRemarks = c44485sRo2.EZpvd(arrayList22, listAhwBna, inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12);
                        if (relationListWithRemarks != objCopydefault) {
                        }
                        break;
                    case 3:
                        int i19 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.I$1;
                        i4 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.I$0;
                        objectRef2 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$6;
                        Ref.LongRef longRef10 = (Ref.LongRef) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$5;
                        BaseDao baseDao2 = (BaseDao) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$4;
                        list3 = (java.util.List) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$3;
                        java.lang.Object obj12 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$2;
                        list4 = (java.util.List) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$1;
                        c44176sGc3 = (C44176sGc) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$0;
                        C56391yDq.AEQbTJ(relationListWithRemarks);
                        obj2 = obj12;
                        longRef4 = longRef10;
                        i3 = i19;
                        r92 = baseDao2;
                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$12 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1;
                        objectRef6 = objectRef2;
                        list2 = list3;
                        i7 = 1;
                        i = i4;
                        listAhwBna = list4;
                        str = str14;
                        r9 = r92;
                        obj = obj2;
                        i2 = i3 + i7;
                        r7 = r9;
                        c44176sGc2 = c44176sGc3;
                        objectRef = objectRef6;
                        if (i2 >= i) {
                        }
                        break;
                    case 4:
                        obj3 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$1;
                        c44176sGc4 = (C44176sGc) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$0;
                        C56391yDq.AEQbTJ(relationListWithRemarks);
                        java.util.ArrayList arrayList32 = new java.util.ArrayList();
                        while (r0.hasNext()) {
                        }
                        KWHzl = c44176sGc4.KWHzl();
                        longRef6 = new Ref.LongRef();
                        objectRef7 = new Ref.ObjectRef();
                        str7 = str14;
                        i8 = 3;
                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1;
                        list5 = arrayList32;
                        obj5 = obj3;
                        i9 = 0;
                        if (i9 >= i8) {
                        }
                        break;
                    case 5:
                        long j2 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.J$0;
                        int i20 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.I$2;
                        i10 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.I$1;
                        i11 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.I$0;
                        objectRef8 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$8;
                        longRef7 = (Ref.LongRef) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$7;
                        Ref.ObjectRef objectRef15 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$6;
                        objectRef7 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$5;
                        longRef2 = (Ref.LongRef) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$4;
                        i12 = i20;
                        BaseDao baseDao3 = (BaseDao) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$3;
                        java.util.List<java.lang.String> list10 = (java.util.List) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$2;
                        obj6 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$1;
                        C44176sGc c44176sGc7 = (C44176sGc) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$0;
                        try {
                            C56391yDq.AEQbTJ(relationListWithRemarks);
                            objectRef10 = objectRef15;
                            r2 = baseDao3;
                            c44176sGc4 = c44176sGc7;
                            inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1;
                            list5 = list10;
                            str8 = " attempts";
                            str9 = "Database Operation failed after ";
                            str10 = "not open";
                            jNanoTime2 = j2;
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e21) {
                            i13 = i12;
                            r93 = baseDao3;
                            c44176sGc5 = c44176sGc7;
                            i9 = i10;
                            i14 = i11;
                            longRef6 = longRef2;
                            objectRef9 = objectRef7;
                            list6 = list10;
                            obj7 = obj6;
                            r02 = e21;
                            C44159sFm.copydefault(r02, (java.lang.Exception) objectRef9.element);
                            objectRef9.element = r02;
                            r94 = r93;
                            if (i13 < i14 - 1) {
                            }
                            i8 = i14;
                            c44176sGc4 = c44176sGc5;
                            objectRef7 = objectRef9;
                            obj5 = obj7;
                            str7 = str14;
                            inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1;
                            list5 = list6;
                            i9++;
                            KWHzl = r94;
                            if (i9 >= i8) {
                            }
                        } catch (java.lang.IllegalStateException e22) {
                            e = e22;
                            message2 = e.getMessage();
                            if (message2 == null) {
                                break;
                            }
                            C44159sFm.copydefault(e);
                            throw e;
                        } catch (java.lang.Exception e23) {
                            e = e23;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            r2 = baseDao3;
                            C44159sFm.EZpvd(r2, longRef2.element);
                            throw th;
                        }
                        objectRef8.element = Unit.INSTANCE;
                        longRef7.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime2, DurationUnit.NANOSECONDS));
                        java.lang.Object obj102 = objectRef10.element;
                        C44159sFm.EZpvd(r2, longRef2.element);
                        return (java.util.List) obj6;
                    case 6:
                        i9 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.I$1;
                        i14 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.I$0;
                        objectRef9 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$5;
                        longRef6 = (Ref.LongRef) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$4;
                        BaseDao baseDao4 = (BaseDao) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$3;
                        list6 = (java.util.List) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$2;
                        obj7 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$1;
                        c44176sGc5 = (C44176sGc) inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1.L$0;
                        C56391yDq.AEQbTJ(relationListWithRemarks);
                        r94 = baseDao4;
                        i8 = i14;
                        c44176sGc4 = c44176sGc5;
                        objectRef7 = objectRef9;
                        obj5 = obj7;
                        str7 = str14;
                        inHouseIMContactManagerImpl$getRelationsWithRemarkNames$13 = inHouseIMContactManagerImpl$getRelationsWithRemarkNames$1;
                        list5 = list6;
                        i9++;
                        KWHzl = r94;
                        if (i9 >= i8) {
                        }
                        break;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (java.lang.Throwable th9) {
                th = th9;
                longRef2 = longRef;
                r2 = AbstractC43419rot.TAG;
            }
        } catch (java.lang.Throwable th10) {
            th = th10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44178sGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull ScanQRCodeRequestBody scanQRCodeRequestBody, @NotNull Continuation<? super InhouseIMQueryQRCodeScanResponse> continuation) throws java.lang.Throwable {
        InHouseIMContactManagerImpl$getQueryQRCodeResult$1 inHouseIMContactManagerImpl$getQueryQRCodeResult$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof InHouseIMContactManagerImpl$getQueryQRCodeResult$1) {
            inHouseIMContactManagerImpl$getQueryQRCodeResult$1 = (InHouseIMContactManagerImpl$getQueryQRCodeResult$1) continuation;
            int i = inHouseIMContactManagerImpl$getQueryQRCodeResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactManagerImpl$getQueryQRCodeResult$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactManagerImpl$getQueryQRCodeResult$1 = new InHouseIMContactManagerImpl$getQueryQRCodeResult$1(this, continuation);
            }
        }
        java.lang.Object qRCodeScanResult = inHouseIMContactManagerImpl$getQueryQRCodeResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactManagerImpl$getQueryQRCodeResult$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(qRCodeScanResult);
                InHouseIMRelationService inHouseIMRelationService = this.AEQbTJ;
                inHouseIMContactManagerImpl$getQueryQRCodeResult$1.label = 1;
                qRCodeScanResult = inHouseIMRelationService.getQRCodeScanResult(scanQRCodeRequestBody, inHouseIMContactManagerImpl$getQueryQRCodeResult$1);
                if (qRCodeScanResult == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(qRCodeScanResult);
            }
            responseData = (ResponseData) qRCodeScanResult;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                return (InhouseIMQueryQRCodeScanResponse) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl();
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) stateListAnimator;
            C44124sEe.imLogContact$default("getQueryQRCodeResult failed: " + actionBar2.KWHzl(), null, 2, null);
            throw ((java.lang.Throwable) actionBar2.KWHzl());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44178sGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull ScanQRCodeRequestBody scanQRCodeRequestBody, @NotNull Continuation<? super InhouseIMQueryQRCodeScanResponse> continuation) throws java.lang.Throwable {
        InHouseIMContactManagerImpl$getQueryQRCodeResultV2$1 inHouseIMContactManagerImpl$getQueryQRCodeResultV2$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof InHouseIMContactManagerImpl$getQueryQRCodeResultV2$1) {
            inHouseIMContactManagerImpl$getQueryQRCodeResultV2$1 = (InHouseIMContactManagerImpl$getQueryQRCodeResultV2$1) continuation;
            int i = inHouseIMContactManagerImpl$getQueryQRCodeResultV2$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactManagerImpl$getQueryQRCodeResultV2$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactManagerImpl$getQueryQRCodeResultV2$1 = new InHouseIMContactManagerImpl$getQueryQRCodeResultV2$1(this, continuation);
            }
        }
        java.lang.Object qRCodeScanResultV2 = inHouseIMContactManagerImpl$getQueryQRCodeResultV2$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactManagerImpl$getQueryQRCodeResultV2$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(qRCodeScanResultV2);
                InHouseIMRelationService inHouseIMRelationService = this.AEQbTJ;
                inHouseIMContactManagerImpl$getQueryQRCodeResultV2$1.label = 1;
                qRCodeScanResultV2 = inHouseIMRelationService.getQRCodeScanResultV2(scanQRCodeRequestBody, inHouseIMContactManagerImpl$getQueryQRCodeResultV2$1);
                if (qRCodeScanResultV2 == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(qRCodeScanResultV2);
            }
            responseData = (ResponseData) qRCodeScanResultV2;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
                return (InhouseIMQueryQRCodeScanResponse) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl();
            }
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) stateListAnimator;
            C44124sEe.imLogContact$default("getQueryQRCodeResult failed: " + actionBar2.KWHzl(), null, 2, null);
            throw ((java.lang.Throwable) actionBar2.KWHzl());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44178sGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super InhouseIMQueryMyQRCodeResponse> continuation) throws java.lang.Throwable {
        InHouseIMContactManagerImpl$getMyQRCode$1 inHouseIMContactManagerImpl$getMyQRCode$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof InHouseIMContactManagerImpl$getMyQRCode$1) {
            inHouseIMContactManagerImpl$getMyQRCode$1 = (InHouseIMContactManagerImpl$getMyQRCode$1) continuation;
            int i = inHouseIMContactManagerImpl$getMyQRCode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactManagerImpl$getMyQRCode$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactManagerImpl$getMyQRCode$1 = new InHouseIMContactManagerImpl$getMyQRCode$1(this, continuation);
            }
        }
        java.lang.Object myQRCode = inHouseIMContactManagerImpl$getMyQRCode$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactManagerImpl$getMyQRCode$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(myQRCode);
                InHouseIMRelationService inHouseIMRelationService = this.AEQbTJ;
                inHouseIMContactManagerImpl$getMyQRCode$1.label = 1;
                myQRCode = inHouseIMRelationService.getMyQRCode(inHouseIMContactManagerImpl$getMyQRCode$1);
                if (myQRCode == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(myQRCode);
            }
            ResponseData responseData = (ResponseData) myQRCode;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            return (InhouseIMQueryMyQRCodeResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
        C44124sEe.imLogContact$default("getMyQRCode failed: " + actionBar2.KWHzl(), null, 2, null);
        throw ((java.lang.Throwable) actionBar2.KWHzl());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v44, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r9v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0236: MOVE (r10 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:91:0x0236 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0237: MOVE (r9 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:91:0x0236 */
    /* JADX WARN: Path cross not found for [B:44:0x00d9, B:47:0x00ec], limit reached: 111 */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[PHI: r4 r5 r6 r8 r12 r13 r14 r15
  0x0052: PHI (r4v17 int) = (r4v8 int), (r4v26 int) binds: [B:86:0x0200, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r5v23 kotlin.jvm.internal.Ref$ObjectRef) = (r5v16 kotlin.jvm.internal.Ref$ObjectRef), (r5v26 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:86:0x0200, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r6v10 int) = (r6v3 int), (r6v14 int) binds: [B:86:0x0200, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r8v11 o.sGc) = (r8v3 o.sGc), (r8v15 o.sGc) binds: [B:86:0x0200, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r12v14 kotlin.jvm.internal.Ref$LongRef) = (r12v3 kotlin.jvm.internal.Ref$LongRef), (r12v18 kotlin.jvm.internal.Ref$LongRef) binds: [B:86:0x0200, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r13v12 com.okinc.okimcore.common.database.BaseDao) = (r13v2 com.okinc.okimcore.common.database.BaseDao), (r13v17 com.okinc.okimcore.common.database.BaseDao) binds: [B:86:0x0200, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r14v9 java.util.List<com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity>) = 
  (r14v2 java.util.List<com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity>)
  (r14v14 java.util.List<com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity>)
 binds: [B:86:0x0200, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r15v6 java.lang.Object) = (r15v0 java.lang.Object), (r15v10 java.lang.Object) binds: [B:86:0x0200, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0202 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #4 {all -> 0x0055, blocks: (B:14:0x004d, B:85:0x01f5, B:87:0x0202, B:70:0x01ca, B:71:0x01cd, B:74:0x01d1, B:76:0x01d7, B:78:0x01e3, B:79:0x01e6, B:80:0x01e7, B:81:0x01ea), top: B:105:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023e  */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r7v4, types: [T, kotlin.Unit] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0200 -> B:16:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0226 -> B:90:0x0229). Please report as a decompilation issue!!! */
    @Override // o.InterfaceC44178sGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Continuation<? super java.util.List<InHouseIMContactInfoEntity>> continuation) throws java.lang.Exception {
        InHouseIMContactManagerImpl$getBlockedContactList$1 inHouseIMContactManagerImpl$getBlockedContactList$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        C44176sGc c44176sGc;
        AbstractC43419rot actionBar;
        Ref.ObjectRef objectRef;
        java.util.List<InHouseIMContactInfoEntity> list;
        Ref.LongRef longRef3;
        int i;
        java.lang.Object obj;
        C44176sGc c44176sGc2;
        int i2;
        ResponseData responseData;
        java.lang.Object obj2;
        java.util.List<InHouseIMContactInfoEntity> list2;
        BaseDao baseDao3;
        Ref.LongRef longRef4;
        C44176sGc c44176sGc3;
        int i3;
        Ref.ObjectRef objectRef2;
        int i4;
        ?? r0;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        int i5;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        int i6;
        java.lang.Object obj3;
        long jNanoTime;
        if (continuation instanceof InHouseIMContactManagerImpl$getBlockedContactList$1) {
            inHouseIMContactManagerImpl$getBlockedContactList$1 = (InHouseIMContactManagerImpl$getBlockedContactList$1) continuation;
            int i7 = inHouseIMContactManagerImpl$getBlockedContactList$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                inHouseIMContactManagerImpl$getBlockedContactList$1.label = i7 - Integer.MIN_VALUE;
            } else {
                inHouseIMContactManagerImpl$getBlockedContactList$1 = new InHouseIMContactManagerImpl$getBlockedContactList$1(this, continuation);
            }
        }
        java.lang.Object blockedContactList = inHouseIMContactManagerImpl$getBlockedContactList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = inHouseIMContactManagerImpl$getBlockedContactList$1.label;
        try {
            if (i8 == 0) {
                C56391yDq.AEQbTJ(blockedContactList);
                try {
                    InHouseIMRelationService inHouseIMRelationService = this.AEQbTJ;
                    inHouseIMContactManagerImpl$getBlockedContactList$1.L$0 = this;
                    inHouseIMContactManagerImpl$getBlockedContactList$1.label = 1;
                    blockedContactList = inHouseIMRelationService.getBlockedContactList(inHouseIMContactManagerImpl$getBlockedContactList$1);
                    if (blockedContactList == objCopydefault) {
                        return objCopydefault;
                    }
                    c44176sGc = this;
                    responseData = (ResponseData) blockedContactList;
                    if (responseData.getCode() != 0) {
                    }
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                } catch (java.lang.Throwable th) {
                    th = th;
                    c44176sGc = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            } else {
                if (i8 != 1) {
                    if (i8 == 2) {
                        long j = inHouseIMContactManagerImpl$getBlockedContactList$1.J$0;
                        int i9 = inHouseIMContactManagerImpl$getBlockedContactList$1.I$2;
                        i6 = inHouseIMContactManagerImpl$getBlockedContactList$1.I$1;
                        i = inHouseIMContactManagerImpl$getBlockedContactList$1.I$0;
                        objectRef4 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getBlockedContactList$1.L$8;
                        longRef3 = (Ref.LongRef) inHouseIMContactManagerImpl$getBlockedContactList$1.L$7;
                        objectRef3 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getBlockedContactList$1.L$6;
                        objectRef2 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getBlockedContactList$1.L$5;
                        longRef2 = (Ref.LongRef) inHouseIMContactManagerImpl$getBlockedContactList$1.L$4;
                        baseDao2 = (BaseDao) inHouseIMContactManagerImpl$getBlockedContactList$1.L$3;
                        list = (java.util.List) inHouseIMContactManagerImpl$getBlockedContactList$1.L$2;
                        i5 = i9;
                        java.lang.Object obj4 = inHouseIMContactManagerImpl$getBlockedContactList$1.L$1;
                        C44176sGc c44176sGc4 = (C44176sGc) inHouseIMContactManagerImpl$getBlockedContactList$1.L$0;
                        try {
                            try {
                                C56391yDq.AEQbTJ(blockedContactList);
                                jNanoTime = j;
                                c44176sGc2 = c44176sGc4;
                                obj3 = obj4;
                            } catch (java.lang.IllegalStateException e3) {
                                e2 = e3;
                                message = e2.getMessage();
                                if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                    C44159sFm.OLrzqt(e2);
                                    throw e2;
                                }
                                C44159sFm.copydefault(e2);
                                throw e2;
                            } catch (java.lang.Exception e4) {
                                e = e4;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                C44159sFm.EZpvd(baseDao2, longRef2.element);
                                throw th;
                            }
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e5) {
                            baseDao3 = baseDao2;
                            list2 = list;
                            i3 = i;
                            i4 = i5;
                            obj2 = obj4;
                            longRef4 = longRef2;
                            c44176sGc3 = c44176sGc4;
                            i2 = i6;
                            r0 = e5;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i4 < i3 - 1) {
                            }
                            list = list2;
                            longRef3 = longRef4;
                            i = i3;
                            c44176sGc2 = c44176sGc3;
                            objectRef = objectRef2;
                            obj = obj2;
                            i2++;
                            baseDao2 = baseDao3;
                            if (i2 < i) {
                            }
                        }
                        objectRef4.element = Unit.INSTANCE;
                        longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                        T t = objectRef3.element;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        return (java.util.List) obj3;
                    }
                    if (i8 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = inHouseIMContactManagerImpl$getBlockedContactList$1.I$1;
                    i3 = inHouseIMContactManagerImpl$getBlockedContactList$1.I$0;
                    Ref.ObjectRef objectRef5 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getBlockedContactList$1.L$5;
                    longRef4 = (Ref.LongRef) inHouseIMContactManagerImpl$getBlockedContactList$1.L$4;
                    baseDao3 = (BaseDao) inHouseIMContactManagerImpl$getBlockedContactList$1.L$3;
                    list2 = (java.util.List) inHouseIMContactManagerImpl$getBlockedContactList$1.L$2;
                    obj2 = inHouseIMContactManagerImpl$getBlockedContactList$1.L$1;
                    c44176sGc3 = (C44176sGc) inHouseIMContactManagerImpl$getBlockedContactList$1.L$0;
                    C56391yDq.AEQbTJ(blockedContactList);
                    objectRef2 = objectRef5;
                    list = list2;
                    longRef3 = longRef4;
                    i = i3;
                    c44176sGc2 = c44176sGc3;
                    objectRef = objectRef2;
                    obj = obj2;
                    i2++;
                    baseDao2 = baseDao3;
                    if (i2 < i) {
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                            i4 = i2;
                            obj2 = obj;
                            objectRef2 = objectRef;
                            baseDao3 = baseDao2;
                            c44176sGc3 = c44176sGc2;
                            i3 = i;
                            longRef4 = longRef3;
                            list2 = list;
                            r0 = e6;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i4 < i3 - 1) {
                            }
                            list = list2;
                            longRef3 = longRef4;
                            i = i3;
                            c44176sGc2 = c44176sGc3;
                            objectRef = objectRef2;
                            obj = obj2;
                            i2++;
                            baseDao2 = baseDao3;
                            if (i2 < i) {
                            }
                        } catch (java.lang.IllegalStateException e7) {
                            e2 = e7;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e8) {
                            e = e8;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                            throw th;
                        }
                        objectRef4 = new Ref.ObjectRef();
                        jNanoTime = java.lang.System.nanoTime();
                        InHouseIMContactDao inHouseIMContactDaoKWHzl = c44176sGc2.KWHzl();
                        inHouseIMContactManagerImpl$getBlockedContactList$1.L$0 = c44176sGc2;
                        inHouseIMContactManagerImpl$getBlockedContactList$1.L$1 = obj;
                        inHouseIMContactManagerImpl$getBlockedContactList$1.L$2 = list;
                        inHouseIMContactManagerImpl$getBlockedContactList$1.L$3 = baseDao2;
                        inHouseIMContactManagerImpl$getBlockedContactList$1.L$4 = longRef3;
                        inHouseIMContactManagerImpl$getBlockedContactList$1.L$5 = objectRef;
                        inHouseIMContactManagerImpl$getBlockedContactList$1.L$6 = objectRef4;
                        inHouseIMContactManagerImpl$getBlockedContactList$1.L$7 = longRef3;
                        inHouseIMContactManagerImpl$getBlockedContactList$1.L$8 = objectRef4;
                        inHouseIMContactManagerImpl$getBlockedContactList$1.I$0 = i;
                        inHouseIMContactManagerImpl$getBlockedContactList$1.I$1 = i2;
                        inHouseIMContactManagerImpl$getBlockedContactList$1.I$2 = i2;
                        inHouseIMContactManagerImpl$getBlockedContactList$1.J$0 = jNanoTime;
                        inHouseIMContactManagerImpl$getBlockedContactList$1.label = 2;
                        if (inHouseIMContactDaoKWHzl.insertOrReplaceContacts(list, inHouseIMContactManagerImpl$getBlockedContactList$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        i5 = i2;
                        objectRef3 = objectRef4;
                        longRef2 = longRef3;
                        obj3 = obj;
                        objectRef2 = objectRef;
                        i6 = i5;
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                            obj2 = obj3;
                            i2 = i6;
                            baseDao3 = baseDao2;
                            list2 = list;
                            i4 = i5;
                            c44176sGc3 = c44176sGc2;
                            i3 = i;
                            longRef4 = longRef2;
                            r0 = e9;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i4 < i3 - 1) {
                                inHouseIMContactManagerImpl$getBlockedContactList$1.L$0 = c44176sGc3;
                                inHouseIMContactManagerImpl$getBlockedContactList$1.L$1 = obj2;
                                inHouseIMContactManagerImpl$getBlockedContactList$1.L$2 = list2;
                                inHouseIMContactManagerImpl$getBlockedContactList$1.L$3 = baseDao3;
                                inHouseIMContactManagerImpl$getBlockedContactList$1.L$4 = longRef4;
                                inHouseIMContactManagerImpl$getBlockedContactList$1.L$5 = objectRef2;
                                inHouseIMContactManagerImpl$getBlockedContactList$1.L$6 = null;
                                inHouseIMContactManagerImpl$getBlockedContactList$1.L$7 = null;
                                inHouseIMContactManagerImpl$getBlockedContactList$1.L$8 = null;
                                inHouseIMContactManagerImpl$getBlockedContactList$1.I$0 = i3;
                                inHouseIMContactManagerImpl$getBlockedContactList$1.I$1 = i2;
                                inHouseIMContactManagerImpl$getBlockedContactList$1.label = 3;
                                if (DelayKt.delay(((long) (i4 + 1)) * 50, inHouseIMContactManagerImpl$getBlockedContactList$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                            list = list2;
                            longRef3 = longRef4;
                            i = i3;
                            c44176sGc2 = c44176sGc3;
                            objectRef = objectRef2;
                            obj = obj2;
                            i2++;
                            baseDao2 = baseDao3;
                            if (i2 < i) {
                            }
                        }
                        objectRef4.element = Unit.INSTANCE;
                        longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                        T t2 = objectRef3.element;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        return (java.util.List) obj3;
                    }
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                    if (exc == null) {
                        exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                    }
                    C44159sFm.OLrzqt(exc);
                    throw exc;
                }
                c44176sGc = (C44176sGc) inHouseIMContactManagerImpl$getBlockedContactList$1.L$0;
                try {
                    C56391yDq.AEQbTJ(blockedContactList);
                    responseData = (ResponseData) blockedContactList;
                    if (responseData.getCode() != 0 && responseData.getData() != null) {
                        java.lang.Object data = responseData.getData();
                        Intrinsics.copydefault(data);
                        actionBar = new AbstractC43419rot.StateListAnimator(data);
                    } else {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            }
            if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                java.lang.Object objKWHzl = ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
                InHouseIMContactDao inHouseIMContactDaoKWHzl2 = c44176sGc.KWHzl();
                Ref.LongRef longRef5 = new Ref.LongRef();
                objectRef = new Ref.ObjectRef();
                list = (java.util.List) objKWHzl;
                baseDao2 = inHouseIMContactDaoKWHzl2;
                longRef3 = longRef5;
                i = 3;
                obj = objKWHzl;
                c44176sGc2 = c44176sGc;
                i2 = 0;
                if (i2 < i) {
                }
            } else {
                if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
                C44124sEe.imLogContact$default("getBlockedContactList failed: " + actionBar2.KWHzl(), null, 2, null);
                throw ((java.lang.Throwable) actionBar2.KWHzl());
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            longRef2 = longRef;
            baseDao2 = baseDao;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:102:0x0311 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:113:0x032f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:115:0x0331 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:151:0x03d8 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:153:0x03da */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:162:0x03f9 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:169:0x0405 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:173:0x040c */
    /* JADX DEBUG: Type inference failed for r0v42. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v53. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v77. Raw type applied. Possible types: T, java.lang.Object */
    /* JADX DEBUG: Type inference failed for r0v88. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r6v26. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:64:0x01a4, B:67:0x01b7], limit reached: 232 */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0346 A[Catch: all -> 0x005e, TryCatch #34 {all -> 0x005e, blocks: (B:16:0x0057, B:121:0x0339, B:122:0x033c, B:125:0x0340, B:127:0x0346, B:129:0x0350, B:130:0x0353, B:131:0x0354, B:132:0x0357, B:137:0x0365, B:139:0x0372), top: B:224:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0372 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #34 {all -> 0x005e, blocks: (B:16:0x0057, B:121:0x0339, B:122:0x033c, B:125:0x0340, B:127:0x0346, B:129:0x0350, B:130:0x0353, B:131:0x0354, B:132:0x0357, B:137:0x0365, B:139:0x0372), top: B:224:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0415 A[Catch: all -> 0x0104, TryCatch #17 {all -> 0x0104, blocks: (B:35:0x00f1, B:171:0x0408, B:172:0x040b, B:175:0x040f, B:177:0x0415, B:179:0x041f, B:180:0x0422, B:181:0x0423, B:182:0x0426), top: B:224:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[PHI: r2 r4 r8 r9 r10 r11 r12 r13 r15 r16
  0x005b: PHI (r2v24 com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$searchContactById$1) = 
  (r2v18 com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$searchContactById$1)
  (r2v2 com.okinc.okimcore.feature.contact.manager.InHouseIMContactManagerImpl$searchContactById$1)
 binds: [B:138:0x0370, B:17:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x005b: PHI (r4v37 int) = (r4v28 int), (r4v61 int) binds: [B:138:0x0370, B:17:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x005b: PHI (r8v24 int) = (r8v17 int), (r8v34 int) binds: [B:138:0x0370, B:17:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x005b: PHI (r9v23 kotlin.jvm.internal.Ref$ObjectRef) = (r9v14 kotlin.jvm.internal.Ref$ObjectRef), (r9v35 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:138:0x0370, B:17:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x005b: PHI (r10v21 com.okinc.okimcore.common.database.BaseDao) = (r10v36 com.okinc.okimcore.common.database.BaseDao), (r10v37 com.okinc.okimcore.common.database.BaseDao) binds: [B:138:0x0370, B:17:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x005b: PHI (r11v18 o.sGc) = (r11v13 o.sGc), (r11v28 o.sGc) binds: [B:138:0x0370, B:17:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x005b: PHI (r12v16 java.lang.String) = (r12v9 java.lang.String), (r12v28 java.lang.String) binds: [B:138:0x0370, B:17:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x005b: PHI (r13v21 kotlin.jvm.internal.Ref$LongRef) = (r13v34 kotlin.jvm.internal.Ref$LongRef), (r13v35 kotlin.jvm.internal.Ref$LongRef) binds: [B:138:0x0370, B:17:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x005b: PHI (r15v15 java.lang.String) = (r15v8 java.lang.String), (r15v0 java.lang.String) binds: [B:138:0x0370, B:17:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x005b: PHI (r16v17 java.lang.String) = (r16v10 java.lang.String), (r16v0 java.lang.String) binds: [B:138:0x0370, B:17:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x044f A[Catch: all -> 0x0491, TRY_LEAVE, TryCatch #23 {all -> 0x0491, blocks: (B:188:0x0442, B:190:0x044f), top: B:225:0x0442 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0233 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v28, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v65, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v71, types: [T] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v2, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r13v23, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v21, types: [com.okinc.okimcore.common.database.BaseDao, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.okinc.okimcore.common.database.BaseDao] */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x0370 -> B:18:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:140:0x0397 -> B:142:0x039a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:191:0x0474 -> B:193:0x0477). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:194:0x0480 -> B:193:0x0477). Please report as a decompilation issue!!! */
    @Override // o.InterfaceC44178sGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<ContactWithPhoneData>> continuation) throws java.lang.Exception {
        InHouseIMContactManagerImpl$searchContactById$1 inHouseIMContactManagerImpl$searchContactById$1;
        ?? r4;
        ?? r5;
        ?? r13;
        ?? r42;
        java.lang.String str2;
        java.lang.String str3;
        C44176sGc c44176sGc;
        InHouseIMRelationService inHouseIMRelationService;
        AbstractC43419rot actionBar;
        ?? longRef;
        Ref.ObjectRef objectRef;
        java.lang.String str4;
        int i;
        int i2;
        java.util.List<InHouseIMContactInfoEntity> list;
        java.lang.String str5;
        java.lang.Object obj;
        ResponseData responseData;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        java.lang.String str6;
        java.lang.String str7;
        C44176sGc c44176sGc2;
        java.lang.String str8;
        java.util.List<InHouseIMContactInfoEntity> list2;
        ?? r11;
        ?? r8;
        Ref.ObjectRef objectRef2;
        int i3;
        ?? r0;
        InHouseIMContactManagerImpl$searchContactById$1 inHouseIMContactManagerImpl$searchContactById$12;
        long j;
        Ref.ObjectRef objectRef3;
        ?? r112;
        int i4;
        java.util.List<InHouseIMContactInfoEntity> list3;
        C44176sGc c44176sGc3;
        Ref.ObjectRef objectRef4;
        java.util.List<InHouseIMContactInfoEntity> list4;
        java.lang.String str9;
        java.lang.String str10;
        Ref.LongRef longRef2;
        Ref.ObjectRef objectRef5;
        java.lang.String str11;
        int i5;
        int i6;
        C44176sGc c44176sGc4;
        BaseDao baseDao;
        C44176sGc c44176sGc5;
        BaseDao baseDao2;
        java.lang.Exception e3;
        Ref.LongRef longRef3;
        java.lang.IllegalStateException e4;
        java.lang.String message2;
        Ref.LongRef longRef4;
        Ref.LongRef longRef5;
        java.lang.String str12;
        C44176sGc c44176sGc6;
        BaseDao baseDao3;
        Ref.ObjectRef objectRef6;
        int i7;
        int i8;
        ?? r02;
        BaseDao baseDao4;
        Ref.LongRef longRef6;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        Ref.ObjectRef objectRef7;
        Ref.LongRef longRef7;
        Ref.ObjectRef objectRef8;
        Ref.ObjectRef objectRef9;
        long jNanoTime;
        int i9;
        C44176sGc c44176sGc7;
        ?? r03;
        C44176sGc c44176sGc8;
        Ref.LongRef longRef8;
        BaseDao baseDao5;
        if (continuation instanceof InHouseIMContactManagerImpl$searchContactById$1) {
            inHouseIMContactManagerImpl$searchContactById$1 = (InHouseIMContactManagerImpl$searchContactById$1) continuation;
            int i10 = inHouseIMContactManagerImpl$searchContactById$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                inHouseIMContactManagerImpl$searchContactById$1.label = i10 - Integer.MIN_VALUE;
            } else {
                inHouseIMContactManagerImpl$searchContactById$1 = new InHouseIMContactManagerImpl$searchContactById$1(this, continuation);
            }
        }
        java.lang.Object obj2 = inHouseIMContactManagerImpl$searchContactById$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i11 = inHouseIMContactManagerImpl$searchContactById$1.label;
        java.lang.String str16 = "Database Operation failed after ";
        java.lang.String str17 = " attempts";
        try {
            try {
                if (i11 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    SearchContactReq searchContactReq = new SearchContactReq(java.lang.Long.parseLong(str));
                    try {
                        inHouseIMRelationService = this.AEQbTJ;
                        inHouseIMContactManagerImpl$searchContactById$1.L$0 = this;
                        str2 = str;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        str2 = str;
                    }
                    try {
                        inHouseIMContactManagerImpl$searchContactById$1.L$1 = str2;
                        inHouseIMContactManagerImpl$searchContactById$1.label = 1;
                        java.lang.Object objSearchRelationById = inHouseIMRelationService.searchRelationById(searchContactReq, inHouseIMContactManagerImpl$searchContactById$1);
                        if (objSearchRelationById == objCopydefault) {
                            return objCopydefault;
                        }
                        str3 = str2;
                        c44176sGc = this;
                        obj = objSearchRelationById;
                        responseData = (ResponseData) obj;
                        if (responseData.getCode() != 0) {
                        }
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        str3 = str2;
                        c44176sGc = this;
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                        actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    }
                } else if (i11 == 1) {
                    str3 = (java.lang.String) inHouseIMContactManagerImpl$searchContactById$1.L$1;
                    c44176sGc = (C44176sGc) inHouseIMContactManagerImpl$searchContactById$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj2);
                        obj = obj2;
                        responseData = (ResponseData) obj;
                        if (responseData.getCode() != 0 && responseData.getData() != null) {
                            java.lang.Object data = responseData.getData();
                            Intrinsics.copydefault(data);
                            actionBar = new AbstractC43419rot.StateListAnimator(data);
                        } else {
                            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                        actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    }
                } else if (i11 == 2) {
                    long j2 = inHouseIMContactManagerImpl$searchContactById$1.J$0;
                    int i12 = inHouseIMContactManagerImpl$searchContactById$1.I$2;
                    i4 = inHouseIMContactManagerImpl$searchContactById$1.I$1;
                    int i13 = inHouseIMContactManagerImpl$searchContactById$1.I$0;
                    Ref.ObjectRef objectRef10 = (Ref.ObjectRef) inHouseIMContactManagerImpl$searchContactById$1.L$8;
                    Ref.LongRef longRef9 = (Ref.LongRef) inHouseIMContactManagerImpl$searchContactById$1.L$7;
                    objectRef3 = (Ref.ObjectRef) inHouseIMContactManagerImpl$searchContactById$1.L$6;
                    objectRef = (Ref.ObjectRef) inHouseIMContactManagerImpl$searchContactById$1.L$5;
                    r13 = (Ref.LongRef) inHouseIMContactManagerImpl$searchContactById$1.L$4;
                    j = j2;
                    BaseDao baseDao6 = (BaseDao) inHouseIMContactManagerImpl$searchContactById$1.L$3;
                    list3 = (java.util.List) inHouseIMContactManagerImpl$searchContactById$1.L$2;
                    java.lang.String str18 = (java.lang.String) inHouseIMContactManagerImpl$searchContactById$1.L$1;
                    C44176sGc c44176sGc9 = (C44176sGc) inHouseIMContactManagerImpl$searchContactById$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj2);
                        c44176sGc3 = c44176sGc9;
                        objectRef4 = objectRef10;
                        r42 = baseDao6;
                        inHouseIMContactManagerImpl$searchContactById$12 = inHouseIMContactManagerImpl$searchContactById$1;
                        i2 = i13;
                        i = i12;
                        str5 = str18;
                        r112 = longRef9;
                        r13 = r13;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e5) {
                        r11 = baseDao6;
                        i2 = i13;
                        str6 = " attempts";
                        i = i12;
                        objectRef2 = objectRef;
                        str7 = "Database Operation failed after ";
                        str8 = str18;
                        c44176sGc2 = c44176sGc9;
                        i3 = i4;
                        r8 = r13;
                        list2 = list3;
                        r0 = e5;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                        objectRef2.element = r0;
                        if (i < i2 - 1) {
                        }
                        ?? r04 = ;
                        list = list2;
                        java.lang.String str19 = str8;
                        objectRef = objectRef2;
                        str5 = str19;
                        i = i3 + 1;
                        r42 = ;
                        c44176sGc = c44176sGc2;
                        str16 = str7;
                        str4 = str6;
                        longRef = r04;
                        if (i < i2) {
                        }
                    } catch (java.lang.IllegalStateException e6) {
                        e2 = e6;
                        message = e2.getMessage();
                        if (message == null) {
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e7) {
                        e = e7;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        r42 = baseDao6;
                        C44159sFm.EZpvd(r42, r13.element);
                        throw th;
                    }
                    objectRef4.element = Unit.INSTANCE;
                    list4 = list3;
                    str9 = str5;
                    r112.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                    java.lang.Object obj3 = objectRef3.element;
                    C44159sFm.EZpvd(r42, r13.element);
                    InHouseIMContactDao inHouseIMContactDaoKWHzl = c44176sGc3.KWHzl();
                    str10 = str9;
                    longRef2 = new Ref.LongRef();
                    objectRef5 = new Ref.ObjectRef();
                    str11 = str17;
                    i5 = 0;
                    i6 = 3;
                    inHouseIMContactManagerImpl$searchContactById$1 = inHouseIMContactManagerImpl$searchContactById$12;
                    c44176sGc4 = c44176sGc3;
                    baseDao = inHouseIMContactDaoKWHzl;
                    if (i5 < i6) {
                    }
                } else {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            long j3 = inHouseIMContactManagerImpl$searchContactById$1.J$0;
                            int i14 = inHouseIMContactManagerImpl$searchContactById$1.I$2;
                            int i15 = inHouseIMContactManagerImpl$searchContactById$1.I$1;
                            int i16 = inHouseIMContactManagerImpl$searchContactById$1.I$0;
                            Ref.ObjectRef objectRef11 = (Ref.ObjectRef) inHouseIMContactManagerImpl$searchContactById$1.L$7;
                            Ref.LongRef longRef10 = (Ref.LongRef) inHouseIMContactManagerImpl$searchContactById$1.L$6;
                            Ref.ObjectRef objectRef12 = (Ref.ObjectRef) inHouseIMContactManagerImpl$searchContactById$1.L$5;
                            Ref.ObjectRef objectRef13 = (Ref.ObjectRef) inHouseIMContactManagerImpl$searchContactById$1.L$4;
                            Ref.LongRef longRef11 = (Ref.LongRef) inHouseIMContactManagerImpl$searchContactById$1.L$3;
                            BaseDao baseDao7 = (BaseDao) inHouseIMContactManagerImpl$searchContactById$1.L$2;
                            str13 = (java.lang.String) inHouseIMContactManagerImpl$searchContactById$1.L$1;
                            C44176sGc c44176sGc10 = (C44176sGc) inHouseIMContactManagerImpl$searchContactById$1.L$0;
                            try {
                                C56391yDq.AEQbTJ(obj2);
                                i8 = i14;
                                str15 = "Database Operation failed after ";
                                longRef7 = longRef10;
                                i6 = i16;
                                c44176sGc7 = c44176sGc10;
                                baseDao2 = baseDao7;
                                str14 = " attempts";
                                objectRef7 = objectRef13;
                                objectRef8 = objectRef11;
                                objectRef9 = objectRef12;
                                longRef2 = longRef11;
                                i9 = i15;
                                jNanoTime = j3;
                                r03 = obj2;
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                                i8 = i14;
                                longRef5 = longRef11;
                                i7 = i16;
                                objectRef6 = objectRef13;
                                str12 = str13;
                                c44176sGc6 = c44176sGc10;
                                i5 = i15;
                                baseDao3 = baseDao7;
                                r02 = e8;
                                C44159sFm.copydefault(r02, (java.lang.Exception) objectRef6.element);
                                objectRef6.element = r02;
                                baseDao5 = baseDao3;
                                longRef8 = longRef5;
                                if (i8 >= i7 - 1) {
                                }
                                objectRef5 = objectRef6;
                                baseDao = baseDao;
                                str11 = str17;
                                Ref.LongRef longRef12 = longRef;
                                i6 = i7;
                                longRef2 = longRef12;
                                i5++;
                                c44176sGc4 = c44176sGc6;
                                str10 = str12;
                                if (i5 < i6) {
                                }
                            } catch (java.lang.IllegalStateException e9) {
                                e4 = e9;
                                message2 = e4.getMessage();
                                if (message2 == null) {
                                }
                                C44159sFm.copydefault(e4);
                                throw e4;
                            } catch (java.lang.Exception e10) {
                                e3 = e10;
                                C44159sFm.OLrzqt(e3);
                                throw e3;
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                r4 = baseDao7;
                                r5 = longRef11;
                                C44159sFm.EZpvd(r4, r5.element);
                                throw th;
                            }
                            objectRef8.element = r03;
                            longRef7.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                            java.lang.Object obj4 = objectRef9.element;
                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                            return yDY.OLrzqt(obj4);
                        }
                        if (i11 != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i5 = inHouseIMContactManagerImpl$searchContactById$1.I$1;
                        i7 = inHouseIMContactManagerImpl$searchContactById$1.I$0;
                        objectRef6 = (Ref.ObjectRef) inHouseIMContactManagerImpl$searchContactById$1.L$4;
                        Ref.LongRef longRef13 = (Ref.LongRef) inHouseIMContactManagerImpl$searchContactById$1.L$3;
                        BaseDao baseDao8 = (BaseDao) inHouseIMContactManagerImpl$searchContactById$1.L$2;
                        str12 = (java.lang.String) inHouseIMContactManagerImpl$searchContactById$1.L$1;
                        c44176sGc6 = (C44176sGc) inHouseIMContactManagerImpl$searchContactById$1.L$0;
                        C56391yDq.AEQbTJ(obj2);
                        baseDao5 = baseDao8;
                        longRef8 = longRef13;
                        BaseDao baseDao9 = baseDao5;
                        Ref.LongRef longRef14 = longRef8;
                        objectRef5 = objectRef6;
                        baseDao = baseDao9;
                        str11 = str17;
                        Ref.LongRef longRef122 = longRef14;
                        i6 = i7;
                        longRef2 = longRef122;
                        i5++;
                        c44176sGc4 = c44176sGc6;
                        str10 = str12;
                        if (i5 < i6) {
                            try {
                                try {
                                } catch (java.lang.IllegalStateException e11) {
                                    e4 = e11;
                                    longRef4 = longRef2;
                                    message2 = e4.getMessage();
                                    if (message2 == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message2, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                        C44159sFm.OLrzqt(e4);
                                        throw e4;
                                    }
                                    C44159sFm.copydefault(e4);
                                    throw e4;
                                } catch (java.lang.Exception e12) {
                                    e3 = e12;
                                    longRef3 = longRef2;
                                    C44159sFm.OLrzqt(e3);
                                    throw e3;
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                    baseDao2 = baseDao;
                                    r5 = longRef2;
                                    r4 = baseDao2;
                                    C44159sFm.EZpvd(r4, r5.element);
                                    throw th;
                                }
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e13) {
                                e = e13;
                                c44176sGc8 = c44176sGc4;
                            }
                            objectRef9 = new Ref.ObjectRef();
                            jNanoTime = java.lang.System.nanoTime();
                            InHouseIMContactDao inHouseIMContactDaoKWHzl2 = c44176sGc4.KWHzl();
                            inHouseIMContactManagerImpl$searchContactById$1.L$0 = c44176sGc4;
                            inHouseIMContactManagerImpl$searchContactById$1.L$1 = str10;
                            inHouseIMContactManagerImpl$searchContactById$1.L$2 = baseDao;
                            inHouseIMContactManagerImpl$searchContactById$1.L$3 = longRef2;
                            inHouseIMContactManagerImpl$searchContactById$1.L$4 = objectRef5;
                            inHouseIMContactManagerImpl$searchContactById$1.L$5 = objectRef9;
                            inHouseIMContactManagerImpl$searchContactById$1.L$6 = longRef2;
                            inHouseIMContactManagerImpl$searchContactById$1.L$7 = objectRef9;
                            c44176sGc8 = c44176sGc4;
                            try {
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e14) {
                                e = e14;
                                c44176sGc6 = c44176sGc8;
                                baseDao4 = baseDao;
                                i8 = i5;
                                str12 = str10;
                                str17 = str11;
                                objectRef6 = objectRef5;
                                sQLiteDatabaseLockedException = e;
                                longRef6 = longRef2;
                                int i17 = i6;
                                longRef5 = longRef6;
                                i7 = i17;
                                r02 = sQLiteDatabaseLockedException;
                                baseDao3 = baseDao4;
                                C44159sFm.copydefault(r02, (java.lang.Exception) objectRef6.element);
                                objectRef6.element = r02;
                                baseDao5 = baseDao3;
                                longRef8 = longRef5;
                                if (i8 >= i7 - 1) {
                                    inHouseIMContactManagerImpl$searchContactById$1.L$0 = c44176sGc6;
                                    inHouseIMContactManagerImpl$searchContactById$1.L$1 = str12;
                                    inHouseIMContactManagerImpl$searchContactById$1.L$2 = baseDao3;
                                    inHouseIMContactManagerImpl$searchContactById$1.L$3 = longRef5;
                                    inHouseIMContactManagerImpl$searchContactById$1.L$4 = objectRef6;
                                    inHouseIMContactManagerImpl$searchContactById$1.L$5 = null;
                                    inHouseIMContactManagerImpl$searchContactById$1.L$6 = null;
                                    inHouseIMContactManagerImpl$searchContactById$1.L$7 = null;
                                    inHouseIMContactManagerImpl$searchContactById$1.L$8 = null;
                                    inHouseIMContactManagerImpl$searchContactById$1.I$0 = i7;
                                    inHouseIMContactManagerImpl$searchContactById$1.I$1 = i5;
                                    inHouseIMContactManagerImpl$searchContactById$1.label = 5;
                                    baseDao9 = baseDao3;
                                    longRef14 = longRef5;
                                    if (DelayKt.delay(((long) (i8 + 1)) * 50, inHouseIMContactManagerImpl$searchContactById$1) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                } else {
                                    BaseDao baseDao92 = baseDao5;
                                    Ref.LongRef longRef142 = longRef8;
                                }
                                objectRef5 = objectRef6;
                                baseDao = baseDao92;
                                str11 = str17;
                                Ref.LongRef longRef1222 = longRef142;
                                i6 = i7;
                                longRef2 = longRef1222;
                                i5++;
                                c44176sGc4 = c44176sGc6;
                                str10 = str12;
                                if (i5 < i6) {
                                }
                            }
                            inHouseIMContactManagerImpl$searchContactById$1.L$8 = null;
                            inHouseIMContactManagerImpl$searchContactById$1.I$0 = i6;
                            inHouseIMContactManagerImpl$searchContactById$1.I$1 = i5;
                            inHouseIMContactManagerImpl$searchContactById$1.I$2 = i5;
                            inHouseIMContactManagerImpl$searchContactById$1.J$0 = jNanoTime;
                            try {
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e15) {
                                e = e15;
                                c44176sGc6 = c44176sGc8;
                                baseDao4 = baseDao;
                                i8 = i5;
                                str12 = str10;
                                str17 = str11;
                                objectRef6 = objectRef5;
                                sQLiteDatabaseLockedException = e;
                                longRef6 = longRef2;
                                int i172 = i6;
                                longRef5 = longRef6;
                                i7 = i172;
                                r02 = sQLiteDatabaseLockedException;
                                baseDao3 = baseDao4;
                                C44159sFm.copydefault(r02, (java.lang.Exception) objectRef6.element);
                                objectRef6.element = r02;
                                baseDao5 = baseDao3;
                                longRef8 = longRef5;
                                if (i8 >= i7 - 1) {
                                }
                                objectRef5 = objectRef6;
                                baseDao = baseDao92;
                                str11 = str17;
                                Ref.LongRef longRef12222 = longRef142;
                                i6 = i7;
                                longRef2 = longRef12222;
                                i5++;
                                c44176sGc4 = c44176sGc6;
                                str10 = str12;
                                if (i5 < i6) {
                                }
                            }
                            inHouseIMContactManagerImpl$searchContactById$1.label = 4;
                            java.lang.Object contactById = inHouseIMContactDaoKWHzl2.getContactById(str10, inHouseIMContactManagerImpl$searchContactById$1);
                            if (contactById == objCopydefault) {
                                return objCopydefault;
                            }
                            str13 = str10;
                            str14 = str11;
                            objectRef7 = objectRef5;
                            str15 = str16;
                            c44176sGc7 = c44176sGc8;
                            i9 = i5;
                            longRef7 = longRef2;
                            objectRef8 = objectRef9;
                            baseDao2 = baseDao;
                            i8 = i9;
                            r03 = contactById;
                            longRef2 = longRef2;
                            try {
                            } catch (android.database.sqlite.SQLiteDatabaseLockedException e16) {
                                baseDao4 = baseDao2;
                                c44176sGc6 = c44176sGc7;
                                i5 = i9;
                                objectRef6 = objectRef7;
                                str16 = str15;
                                str17 = str14;
                                str12 = str13;
                                sQLiteDatabaseLockedException = e16;
                                longRef6 = longRef2;
                                int i1722 = i6;
                                longRef5 = longRef6;
                                i7 = i1722;
                                r02 = sQLiteDatabaseLockedException;
                                baseDao3 = baseDao4;
                                C44159sFm.copydefault(r02, (java.lang.Exception) objectRef6.element);
                                objectRef6.element = r02;
                                baseDao5 = baseDao3;
                                longRef8 = longRef5;
                                if (i8 >= i7 - 1) {
                                }
                                objectRef5 = objectRef6;
                                baseDao = baseDao92;
                                str11 = str17;
                                Ref.LongRef longRef122222 = longRef142;
                                i6 = i7;
                                longRef2 = longRef122222;
                                i5++;
                                c44176sGc4 = c44176sGc6;
                                str10 = str12;
                                if (i5 < i6) {
                                }
                            } catch (java.lang.IllegalStateException e17) {
                                e4 = e17;
                                longRef4 = longRef2;
                                message2 = e4.getMessage();
                                if (message2 == null) {
                                }
                                C44159sFm.copydefault(e4);
                                throw e4;
                            } catch (java.lang.Exception e18) {
                                e3 = e18;
                                longRef3 = longRef2;
                                C44159sFm.OLrzqt(e3);
                                throw e3;
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                                r5 = longRef2;
                                r4 = baseDao2;
                                C44159sFm.EZpvd(r4, r5.element);
                                throw th;
                            }
                            objectRef8.element = r03;
                            longRef7.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                            java.lang.Object obj42 = objectRef9.element;
                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                            return yDY.OLrzqt(obj42);
                        }
                        C44159sFm.EZpvd(baseDao, longRef2.element);
                        java.lang.Exception exc = (java.lang.Exception) objectRef5.element;
                        if (exc == null) {
                            exc = new java.lang.Exception(str16 + i6 + str11);
                        }
                        C44159sFm.OLrzqt(exc);
                        throw exc;
                    }
                    i3 = inHouseIMContactManagerImpl$searchContactById$1.I$1;
                    int i18 = inHouseIMContactManagerImpl$searchContactById$1.I$0;
                    objectRef2 = (Ref.ObjectRef) inHouseIMContactManagerImpl$searchContactById$1.L$5;
                    Ref.LongRef longRef15 = (Ref.LongRef) inHouseIMContactManagerImpl$searchContactById$1.L$4;
                    BaseDao baseDao10 = (BaseDao) inHouseIMContactManagerImpl$searchContactById$1.L$3;
                    java.util.List<InHouseIMContactInfoEntity> list5 = (java.util.List) inHouseIMContactManagerImpl$searchContactById$1.L$2;
                    java.lang.String str20 = (java.lang.String) inHouseIMContactManagerImpl$searchContactById$1.L$1;
                    C44176sGc c44176sGc11 = (C44176sGc) inHouseIMContactManagerImpl$searchContactById$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    str8 = str20;
                    str6 = " attempts";
                    ?? r113 = baseDao10;
                    str7 = "Database Operation failed after ";
                    list2 = list5;
                    c44176sGc2 = c44176sGc11;
                    i2 = i18;
                    ?? r82 = longRef15;
                    ?? r042 = r82;
                    list = list2;
                    java.lang.String str192 = str8;
                    objectRef = objectRef2;
                    str5 = str192;
                    i = i3 + 1;
                    r42 = r113;
                    c44176sGc = c44176sGc2;
                    str16 = str7;
                    str4 = str6;
                    longRef = r042;
                    if (i < i2) {
                        try {
                            try {
                            } catch (java.lang.IllegalStateException e19) {
                                e2 = e19;
                                message = e2.getMessage();
                                if (message == null) {
                                }
                                C44159sFm.copydefault(e2);
                                throw e2;
                            } catch (java.lang.Exception e20) {
                                e = e20;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (java.lang.Throwable th8) {
                                th = th8;
                                r13 = longRef;
                                C44159sFm.EZpvd(r42, r13.element);
                                throw th;
                            }
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e21) {
                            e = e21;
                            c44176sGc5 = c44176sGc;
                            str17 = str4;
                        }
                        objectRef4 = new Ref.ObjectRef();
                        str17 = str4;
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e22) {
                            e = e22;
                            c44176sGc5 = c44176sGc;
                        }
                        long jNanoTime2 = java.lang.System.nanoTime();
                        InHouseIMContactDao inHouseIMContactDaoKWHzl3 = c44176sGc.KWHzl();
                        inHouseIMContactManagerImpl$searchContactById$1.L$0 = c44176sGc;
                        inHouseIMContactManagerImpl$searchContactById$1.L$1 = str5;
                        inHouseIMContactManagerImpl$searchContactById$1.L$2 = list;
                        inHouseIMContactManagerImpl$searchContactById$1.L$3 = r42;
                        inHouseIMContactManagerImpl$searchContactById$1.L$4 = longRef;
                        inHouseIMContactManagerImpl$searchContactById$1.L$5 = objectRef;
                        inHouseIMContactManagerImpl$searchContactById$1.L$6 = objectRef4;
                        inHouseIMContactManagerImpl$searchContactById$1.L$7 = longRef;
                        inHouseIMContactManagerImpl$searchContactById$1.L$8 = objectRef4;
                        inHouseIMContactManagerImpl$searchContactById$1.I$0 = i2;
                        inHouseIMContactManagerImpl$searchContactById$1.I$1 = i;
                        inHouseIMContactManagerImpl$searchContactById$1.I$2 = i;
                        inHouseIMContactManagerImpl$searchContactById$1.J$0 = jNanoTime2;
                        c44176sGc5 = c44176sGc;
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e23) {
                            try {
                                e = e23;
                                C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                                objectRef2.element = r0;
                                if (i < i2 - 1) {
                                }
                                ?? r0422 = r82;
                                list = list2;
                                java.lang.String str1922 = str8;
                                objectRef = objectRef2;
                                str5 = str1922;
                                i = i3 + 1;
                                r42 = r113;
                                c44176sGc = c44176sGc2;
                                str16 = str7;
                                str4 = str6;
                                longRef = r0422;
                                if (i < i2) {
                                }
                            } catch (java.lang.Throwable th9) {
                                th = th9;
                                r13 = r8;
                                r42 = r11;
                                C44159sFm.EZpvd(r42, r13.element);
                                throw th;
                            }
                            list2 = list;
                            r8 = longRef;
                            str6 = str17;
                            r11 = r42;
                            i3 = i;
                            str7 = str16;
                            c44176sGc2 = c44176sGc5;
                            Ref.ObjectRef objectRef14 = objectRef;
                            str8 = str5;
                            objectRef2 = objectRef14;
                            r0 = e;
                        }
                        inHouseIMContactManagerImpl$searchContactById$1.label = 2;
                        if (inHouseIMContactDaoKWHzl3.insertOrReplaceContacts(list, inHouseIMContactManagerImpl$searchContactById$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        c44176sGc3 = c44176sGc5;
                        inHouseIMContactManagerImpl$searchContactById$12 = inHouseIMContactManagerImpl$searchContactById$1;
                        list3 = list;
                        i4 = i;
                        j = jNanoTime2;
                        objectRef3 = objectRef4;
                        r13 = longRef;
                        r42 = r42;
                        r112 = longRef;
                        try {
                            try {
                            } catch (java.lang.IllegalStateException e24) {
                                e2 = e24;
                                longRef = r13;
                                message = e2.getMessage();
                                if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                    C44159sFm.OLrzqt(e2);
                                    throw e2;
                                }
                                C44159sFm.copydefault(e2);
                                throw e2;
                            } catch (java.lang.Exception e25) {
                                e = e25;
                                longRef = r13;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (java.lang.Throwable th10) {
                                th = th10;
                                C44159sFm.EZpvd(r42, r13.element);
                                throw th;
                            }
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e26) {
                            e = e26;
                            list4 = list3;
                            str9 = str5;
                        }
                        objectRef4.element = Unit.INSTANCE;
                        list4 = list3;
                        str9 = str5;
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e27) {
                            e = e27;
                            r11 = r42;
                            i3 = i4;
                            r8 = r13;
                            objectRef2 = objectRef;
                            str6 = str17;
                            list2 = list4;
                            str8 = str9;
                            str7 = str16;
                            inHouseIMContactManagerImpl$searchContactById$1 = inHouseIMContactManagerImpl$searchContactById$12;
                            c44176sGc2 = c44176sGc3;
                            r0 = e;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i < i2 - 1) {
                                inHouseIMContactManagerImpl$searchContactById$1.L$0 = c44176sGc2;
                                inHouseIMContactManagerImpl$searchContactById$1.L$1 = str8;
                                inHouseIMContactManagerImpl$searchContactById$1.L$2 = list2;
                                inHouseIMContactManagerImpl$searchContactById$1.L$3 = r11;
                                inHouseIMContactManagerImpl$searchContactById$1.L$4 = r8;
                                inHouseIMContactManagerImpl$searchContactById$1.L$5 = objectRef2;
                                inHouseIMContactManagerImpl$searchContactById$1.L$6 = null;
                                inHouseIMContactManagerImpl$searchContactById$1.L$7 = null;
                                inHouseIMContactManagerImpl$searchContactById$1.L$8 = null;
                                inHouseIMContactManagerImpl$searchContactById$1.I$0 = i2;
                                inHouseIMContactManagerImpl$searchContactById$1.I$1 = i3;
                                inHouseIMContactManagerImpl$searchContactById$1.label = 3;
                                r82 = r8;
                                r113 = r11;
                                if (DelayKt.delay(((long) (i + 1)) * 50, inHouseIMContactManagerImpl$searchContactById$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                r82 = r8;
                                r113 = r11;
                            }
                            ?? r04222 = r82;
                            list = list2;
                            java.lang.String str19222 = str8;
                            objectRef = objectRef2;
                            str5 = str19222;
                            i = i3 + 1;
                            r42 = r113;
                            c44176sGc = c44176sGc2;
                            str16 = str7;
                            str4 = str6;
                            longRef = r04222;
                            if (i < i2) {
                            }
                        }
                        r112.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                        java.lang.Object obj32 = objectRef3.element;
                        C44159sFm.EZpvd(r42, r13.element);
                        InHouseIMContactDao inHouseIMContactDaoKWHzl4 = c44176sGc3.KWHzl();
                        str10 = str9;
                        longRef2 = new Ref.LongRef();
                        objectRef5 = new Ref.ObjectRef();
                        str11 = str17;
                        i5 = 0;
                        i6 = 3;
                        inHouseIMContactManagerImpl$searchContactById$1 = inHouseIMContactManagerImpl$searchContactById$12;
                        c44176sGc4 = c44176sGc3;
                        baseDao = inHouseIMContactDaoKWHzl4;
                        if (i5 < i6) {
                        }
                    } else {
                        java.lang.String str21 = str4;
                        C44159sFm.EZpvd(r42, longRef.element);
                        java.lang.Exception exc2 = (java.lang.Exception) objectRef.element;
                        if (exc2 == null) {
                            exc2 = new java.lang.Exception(str16 + i2 + str21);
                        }
                        C44159sFm.OLrzqt(exc2);
                        throw exc2;
                    }
                }
                if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    java.util.List<InHouseIMContactInfoEntity> list6 = (java.util.List) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
                    InHouseIMContactDao inHouseIMContactDaoKWHzl5 = c44176sGc.KWHzl();
                    longRef = new Ref.LongRef();
                    objectRef = new Ref.ObjectRef();
                    str4 = " attempts";
                    i = 0;
                    i2 = 3;
                    list = list6;
                    str5 = str3;
                    r42 = inHouseIMContactDaoKWHzl5;
                    if (i < i2) {
                    }
                } else {
                    if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
                    C44124sEe.imLogContact$default("searchContactById failed: " + actionBar2.KWHzl(), null, 2, null);
                    actionBar2.KWHzl();
                    return null;
                }
            } catch (java.lang.Throwable th11) {
                th = th11;
                r4 = 5;
                r5 = 3;
            }
        } catch (java.lang.Throwable th12) {
            th = th12;
            r13 = AbstractC43419rot.TAG;
            r42 = "Error: ";
        }
    }

    /* JADX DEBUG: Duplicate block (B:95:0x0236) to fix multi-entry loop: BACK_EDGE: B:95:0x0236 -> B:16:0x0058 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:121:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:125:0x0058 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x0099 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:69:0x01cd */
    /* JADX DEBUG: Type inference failed for r0v37. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v47. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r6v14. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x01f5: MOVE (r10 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:85:0x01f4 */
    /* JADX WARN: Path cross not found for [B:45:0x00d9, B:48:0x00ec], limit reached: 118 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020f A[Catch: all -> 0x0245, TRY_LEAVE, TryCatch #3 {all -> 0x0245, blocks: (B:89:0x0202, B:91:0x020f), top: B:113:0x0202 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0235  */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v34, types: [T] */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r11v11, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // o.InterfaceC44178sGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull BlockContactReq blockContactReq, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        InHouseIMContactManagerImpl$blockContact$1 inHouseIMContactManagerImpl$blockContact$1;
        ?? r11;
        BaseDao baseDao;
        BaseDao baseDao2;
        C44176sGc c44176sGc;
        AbstractC43419rot actionBar;
        Ref.ObjectRef objectRef;
        BlockContactReq blockContactReq2;
        ?? r15;
        int i;
        BaseDao baseDao3;
        InHouseIMContactManagerImpl$blockContact$1 inHouseIMContactManagerImpl$blockContact$12;
        int i2;
        java.lang.Object obj;
        ResponseData responseData;
        C44176sGc c44176sGc2;
        BlockContactReq blockContactReq3;
        BaseDao baseDao4;
        ?? r8;
        int i3;
        int i4;
        int i5;
        ?? r0;
        int i6;
        int i7;
        ?? r82;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        ?? r152;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        long j;
        Ref.ObjectRef objectRef4;
        ?? r02;
        BlockContactReq blockContactReq4 = blockContactReq;
        if (continuation instanceof InHouseIMContactManagerImpl$blockContact$1) {
            inHouseIMContactManagerImpl$blockContact$1 = (InHouseIMContactManagerImpl$blockContact$1) continuation;
            int i8 = inHouseIMContactManagerImpl$blockContact$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                inHouseIMContactManagerImpl$blockContact$1.label = i8 - Integer.MIN_VALUE;
            } else {
                inHouseIMContactManagerImpl$blockContact$1 = new InHouseIMContactManagerImpl$blockContact$1(this, continuation);
            }
        }
        java.lang.Object obj2 = inHouseIMContactManagerImpl$blockContact$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i9 = inHouseIMContactManagerImpl$blockContact$1.label;
        try {
            if (i9 == 0) {
                C56391yDq.AEQbTJ(obj2);
                try {
                    InHouseIMRelationService inHouseIMRelationService = this.AEQbTJ;
                    inHouseIMContactManagerImpl$blockContact$1.L$0 = this;
                    inHouseIMContactManagerImpl$blockContact$1.L$1 = blockContactReq4;
                    inHouseIMContactManagerImpl$blockContact$1.label = 1;
                    java.lang.Object objBlockContact = inHouseIMRelationService.blockContact(blockContactReq4, inHouseIMContactManagerImpl$blockContact$1);
                    if (objBlockContact == objCopydefault) {
                        return objCopydefault;
                    }
                    c44176sGc = this;
                    obj = objBlockContact;
                    responseData = (ResponseData) obj;
                    if (responseData.getCode() != 0) {
                    }
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                } catch (java.lang.Throwable th) {
                    th = th;
                    c44176sGc = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            } else {
                if (i9 != 1) {
                    if (i9 == 2) {
                        j = inHouseIMContactManagerImpl$blockContact$1.J$0;
                        int i10 = inHouseIMContactManagerImpl$blockContact$1.I$2;
                        int i11 = inHouseIMContactManagerImpl$blockContact$1.I$1;
                        i = inHouseIMContactManagerImpl$blockContact$1.I$0;
                        objectRef2 = (Ref.ObjectRef) inHouseIMContactManagerImpl$blockContact$1.L$7;
                        Ref.LongRef longRef = (Ref.LongRef) inHouseIMContactManagerImpl$blockContact$1.L$6;
                        objectRef3 = (Ref.ObjectRef) inHouseIMContactManagerImpl$blockContact$1.L$5;
                        objectRef4 = (Ref.ObjectRef) inHouseIMContactManagerImpl$blockContact$1.L$4;
                        r11 = (Ref.LongRef) inHouseIMContactManagerImpl$blockContact$1.L$3;
                        baseDao2 = (BaseDao) inHouseIMContactManagerImpl$blockContact$1.L$2;
                        blockContactReq2 = (BlockContactReq) inHouseIMContactManagerImpl$blockContact$1.L$1;
                        C44176sGc c44176sGc3 = (C44176sGc) inHouseIMContactManagerImpl$blockContact$1.L$0;
                        try {
                            try {
                                C56391yDq.AEQbTJ(obj2);
                                i5 = i11;
                                c44176sGc = c44176sGc3;
                                i4 = i10;
                                r02 = obj2;
                                r11 = r11;
                                r152 = longRef;
                            } catch (java.lang.IllegalStateException e3) {
                                e2 = e3;
                                message = e2.getMessage();
                                if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                    C44159sFm.OLrzqt(e2);
                                    throw e2;
                                }
                                C44159sFm.copydefault(e2);
                                throw e2;
                            } catch (java.lang.Exception e4) {
                                e = e4;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                C44159sFm.EZpvd(baseDao2, r11.element);
                                throw th;
                            }
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e5) {
                            c44176sGc2 = c44176sGc3;
                            i5 = i11;
                            objectRef = objectRef4;
                            r82 = r11;
                            blockContactReq3 = blockContactReq2;
                            i3 = i;
                            i4 = i10;
                            sQLiteDatabaseLockedException = e5;
                            baseDao4 = baseDao2;
                            r0 = sQLiteDatabaseLockedException;
                            r8 = r82;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                            objectRef.element = r0;
                            if (i4 < i3 - 1) {
                                inHouseIMContactManagerImpl$blockContact$1.L$0 = c44176sGc2;
                                inHouseIMContactManagerImpl$blockContact$1.L$1 = blockContactReq3;
                                inHouseIMContactManagerImpl$blockContact$1.L$2 = baseDao4;
                                inHouseIMContactManagerImpl$blockContact$1.L$3 = r8;
                                inHouseIMContactManagerImpl$blockContact$1.L$4 = objectRef;
                                inHouseIMContactManagerImpl$blockContact$1.L$5 = null;
                                inHouseIMContactManagerImpl$blockContact$1.L$6 = null;
                                inHouseIMContactManagerImpl$blockContact$1.L$7 = null;
                                inHouseIMContactManagerImpl$blockContact$1.I$0 = i3;
                                inHouseIMContactManagerImpl$blockContact$1.I$1 = i5;
                                inHouseIMContactManagerImpl$blockContact$1.label = 3;
                                if (DelayKt.delay(((long) (i4 + 1)) * 50, inHouseIMContactManagerImpl$blockContact$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                                inHouseIMContactManagerImpl$blockContact$12 = inHouseIMContactManagerImpl$blockContact$1;
                                i6 = i3;
                                blockContactReq2 = blockContactReq3;
                                c44176sGc = c44176sGc2;
                                i7 = 1;
                            } else {
                                inHouseIMContactManagerImpl$blockContact$12 = inHouseIMContactManagerImpl$blockContact$1;
                                i6 = i3;
                                blockContactReq2 = blockContactReq3;
                                c44176sGc = c44176sGc2;
                                i7 = 1;
                            }
                            r15 = r8;
                            i2 = i5 + i7;
                            baseDao3 = baseDao4;
                            i = i6;
                            if (i2 < i) {
                            }
                        }
                        objectRef2.element = r02;
                        r152.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                        java.lang.Object obj3 = objectRef3.element;
                        C44159sFm.EZpvd(baseDao2, r11.element);
                        ((java.lang.Number) obj3).intValue();
                        return Unit.INSTANCE;
                    }
                    if (i9 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i12 = inHouseIMContactManagerImpl$blockContact$1.I$1;
                    int i13 = inHouseIMContactManagerImpl$blockContact$1.I$0;
                    objectRef = (Ref.ObjectRef) inHouseIMContactManagerImpl$blockContact$1.L$4;
                    r8 = (Ref.LongRef) inHouseIMContactManagerImpl$blockContact$1.L$3;
                    baseDao4 = (BaseDao) inHouseIMContactManagerImpl$blockContact$1.L$2;
                    BlockContactReq blockContactReq5 = (BlockContactReq) inHouseIMContactManagerImpl$blockContact$1.L$1;
                    C44176sGc c44176sGc4 = (C44176sGc) inHouseIMContactManagerImpl$blockContact$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    i5 = i12;
                    inHouseIMContactManagerImpl$blockContact$12 = inHouseIMContactManagerImpl$blockContact$1;
                    i6 = i13;
                    i7 = 1;
                    blockContactReq2 = blockContactReq5;
                    c44176sGc = c44176sGc4;
                    r15 = r8;
                    i2 = i5 + i7;
                    baseDao3 = baseDao4;
                    i = i6;
                    if (i2 < i) {
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                            try {
                                C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                                objectRef.element = r0;
                                if (i4 < i3 - 1) {
                                }
                                r15 = r8;
                                i2 = i5 + i7;
                                baseDao3 = baseDao4;
                                i = i6;
                                if (i2 < i) {
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                r15 = r8;
                                baseDao3 = baseDao4;
                                baseDao2 = baseDao3;
                                r11 = r15;
                                C44159sFm.EZpvd(baseDao2, r11.element);
                                throw th;
                            }
                            i5 = i2;
                            blockContactReq3 = blockContactReq2;
                            r8 = r15;
                            c44176sGc2 = c44176sGc;
                            inHouseIMContactManagerImpl$blockContact$1 = inHouseIMContactManagerImpl$blockContact$12;
                            i3 = i;
                            baseDao4 = baseDao3;
                            i4 = i5;
                            r0 = e6;
                        } catch (java.lang.IllegalStateException e7) {
                            e2 = e7;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e8) {
                            e = e8;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            baseDao2 = baseDao3;
                            r11 = r15;
                            C44159sFm.EZpvd(baseDao2, r11.element);
                            throw th;
                        }
                        objectRef2 = new Ref.ObjectRef();
                        long jNanoTime = java.lang.System.nanoTime();
                        InHouseIMContactDao inHouseIMContactDaoKWHzl = c44176sGc.KWHzl();
                        java.lang.String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.KWHzl(blockContactReq2.getContactUid()));
                        int blockStatus = blockContactReq2.getBlockStatus();
                        inHouseIMContactManagerImpl$blockContact$12.L$0 = c44176sGc;
                        inHouseIMContactManagerImpl$blockContact$12.L$1 = blockContactReq2;
                        inHouseIMContactManagerImpl$blockContact$12.L$2 = baseDao3;
                        inHouseIMContactManagerImpl$blockContact$12.L$3 = r15;
                        inHouseIMContactManagerImpl$blockContact$12.L$4 = objectRef;
                        inHouseIMContactManagerImpl$blockContact$12.L$5 = objectRef2;
                        inHouseIMContactManagerImpl$blockContact$12.L$6 = r15;
                        inHouseIMContactManagerImpl$blockContact$12.L$7 = objectRef2;
                        inHouseIMContactManagerImpl$blockContact$12.I$0 = i;
                        inHouseIMContactManagerImpl$blockContact$12.I$1 = i2;
                        inHouseIMContactManagerImpl$blockContact$12.I$2 = i2;
                        inHouseIMContactManagerImpl$blockContact$12.J$0 = jNanoTime;
                        inHouseIMContactManagerImpl$blockContact$12.label = 2;
                        java.lang.Object objUpdateBlackListStatus = inHouseIMContactDaoKWHzl.updateBlackListStatus(strGEmmrt, blockStatus, inHouseIMContactManagerImpl$blockContact$12);
                        if (objUpdateBlackListStatus == objCopydefault) {
                            return objCopydefault;
                        }
                        baseDao2 = baseDao3;
                        i5 = i2;
                        i4 = i5;
                        inHouseIMContactManagerImpl$blockContact$1 = inHouseIMContactManagerImpl$blockContact$12;
                        objectRef4 = objectRef;
                        j = jNanoTime;
                        objectRef3 = objectRef2;
                        r11 = r15;
                        r02 = objUpdateBlackListStatus;
                        r152 = r15;
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                            c44176sGc2 = c44176sGc;
                            objectRef = objectRef4;
                            r82 = r11;
                            blockContactReq3 = blockContactReq2;
                            i3 = i;
                            sQLiteDatabaseLockedException = e9;
                            baseDao4 = baseDao2;
                            r0 = sQLiteDatabaseLockedException;
                            r8 = r82;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                            objectRef.element = r0;
                            if (i4 < i3 - 1) {
                            }
                            r15 = r8;
                            i2 = i5 + i7;
                            baseDao3 = baseDao4;
                            i = i6;
                            if (i2 < i) {
                            }
                        }
                        objectRef2.element = r02;
                        r152.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                        java.lang.Object obj32 = objectRef3.element;
                        C44159sFm.EZpvd(baseDao2, r11.element);
                        ((java.lang.Number) obj32).intValue();
                        return Unit.INSTANCE;
                    }
                    C44159sFm.EZpvd(baseDao3, r15.element);
                    java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                    if (exc == null) {
                        exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                    }
                    C44159sFm.OLrzqt(exc);
                    throw exc;
                }
                blockContactReq4 = (BlockContactReq) inHouseIMContactManagerImpl$blockContact$1.L$1;
                c44176sGc = (C44176sGc) inHouseIMContactManagerImpl$blockContact$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj2);
                    obj = obj2;
                    responseData = (ResponseData) obj;
                    if (responseData.getCode() != 0 && responseData.getData() != null) {
                        java.lang.Object data = responseData.getData();
                        Intrinsics.copydefault(data);
                        actionBar = new AbstractC43419rot.StateListAnimator(data);
                    } else {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    }
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            }
            if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                InHouseIMContactDao inHouseIMContactDaoKWHzl2 = c44176sGc.KWHzl();
                Ref.LongRef longRef2 = new Ref.LongRef();
                objectRef = new Ref.ObjectRef();
                blockContactReq2 = blockContactReq4;
                r15 = longRef2;
                i = 3;
                baseDao3 = inHouseIMContactDaoKWHzl2;
                inHouseIMContactManagerImpl$blockContact$12 = inHouseIMContactManagerImpl$blockContact$1;
                i2 = 0;
                if (i2 < i) {
                }
            } else {
                if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
                C44124sEe.imLogContact$default("blockContact failed: " + actionBar2.KWHzl(), null, 2, null);
                throw ((java.lang.Throwable) actionBar2.KWHzl());
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            r11 = "Error: ";
            baseDao2 = baseDao;
        }
    }

    @Override // o.InterfaceC44178sGe
    public Flow<ContactWithPhoneData> EZpvd(@NotNull java.lang.String str) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(str, "");
        InHouseIMContactDao inHouseIMContactDaoKWHzl = KWHzl();
        Ref.LongRef longRef = new Ref.LongRef();
        java.lang.Exception exc = null;
        int i = 0;
        while (i < 3) {
            try {
                long jNanoTime = java.lang.System.nanoTime();
                Flow<ContactWithPhoneData> flowFlowContactById = KWHzl().flowContactById(str);
                long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                longRef.element = jValueOf;
                C44159sFm.EZpvd(inHouseIMContactDaoKWHzl, jValueOf);
                return FlowKt.distinctUntilChanged(flowFlowContactById);
            } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
                try {
                    C44159sFm.copydefault(e, exc);
                    i++;
                    exc = e;
                } finally {
                    C44159sFm.EZpvd(inHouseIMContactDaoKWHzl, longRef.element);
                }
            } catch (java.lang.IllegalStateException e2) {
                java.lang.String message = e2.getMessage();
                if (message != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                    C44159sFm.OLrzqt(e2);
                    throw e2;
                }
                C44159sFm.copydefault(e2);
                throw e2;
            } catch (java.lang.Exception e3) {
                C44159sFm.OLrzqt(e3);
                throw e3;
            }
        }
        if (exc == null) {
            exc = new java.lang.Exception("Database Operation failed after 3 attempts");
        }
        C44159sFm.OLrzqt(exc);
        throw exc;
    }

    /* JADX DEBUG: Duplicate block (B:76:0x01a2) to fix multi-entry loop: BACK_EDGE: B:76:0x01a2 -> B:77:0x01ac */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v43, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v44, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01b3: MOVE (r6 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:78:0x01b3 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01b4: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:78:0x01b3 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0137, B:55:0x013a, B:59:0x013f, B:61:0x0145, B:63:0x0151, B:64:0x0154, B:65:0x0155, B:66:0x0158, B:70:0x016e, B:72:0x017b), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017b A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:54:0x0137, B:55:0x013a, B:59:0x013f, B:61:0x0145, B:63:0x0151, B:64:0x0154, B:65:0x0155, B:66:0x0158, B:70:0x016e, B:72:0x017b), top: B:88:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    @Override // o.InterfaceC44178sGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super ContactWithPhoneData> continuation) throws java.lang.Exception {
        InHouseIMContactManagerImpl$getRelationInfo$1 inHouseIMContactManagerImpl$getRelationInfo$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDaoKWHzl;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        C44176sGc c44176sGc;
        InHouseIMContactManagerImpl$getRelationInfo$1 inHouseIMContactManagerImpl$getRelationInfo$12;
        java.lang.String str2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        int i3;
        java.lang.String str3;
        Ref.ObjectRef objectRef2;
        int i4;
        C44176sGc c44176sGc2;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        C44176sGc c44176sGc3;
        Ref.ObjectRef objectRef3;
        Ref.LongRef longRef4;
        int i5;
        BaseDao baseDao2;
        int i6;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException2;
        java.lang.String message;
        ?? r0;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        long jNanoTime;
        java.lang.String str4;
        T t;
        if (continuation instanceof InHouseIMContactManagerImpl$getRelationInfo$1) {
            inHouseIMContactManagerImpl$getRelationInfo$1 = (InHouseIMContactManagerImpl$getRelationInfo$1) continuation;
            int i7 = inHouseIMContactManagerImpl$getRelationInfo$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                inHouseIMContactManagerImpl$getRelationInfo$1.label = i7 - Integer.MIN_VALUE;
            } else {
                inHouseIMContactManagerImpl$getRelationInfo$1 = new InHouseIMContactManagerImpl$getRelationInfo$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMContactManagerImpl$getRelationInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = inHouseIMContactManagerImpl$getRelationInfo$1.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    jNanoTime = inHouseIMContactManagerImpl$getRelationInfo$1.J$0;
                    i4 = inHouseIMContactManagerImpl$getRelationInfo$1.I$2;
                    i3 = inHouseIMContactManagerImpl$getRelationInfo$1.I$1;
                    i = inHouseIMContactManagerImpl$getRelationInfo$1.I$0;
                    objectRef5 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationInfo$1.L$7;
                    longRef3 = (Ref.LongRef) inHouseIMContactManagerImpl$getRelationInfo$1.L$6;
                    objectRef4 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationInfo$1.L$5;
                    objectRef2 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationInfo$1.L$4;
                    longRef2 = (Ref.LongRef) inHouseIMContactManagerImpl$getRelationInfo$1.L$3;
                    baseDaoKWHzl = (BaseDao) inHouseIMContactManagerImpl$getRelationInfo$1.L$2;
                    str4 = (java.lang.String) inHouseIMContactManagerImpl$getRelationInfo$1.L$1;
                    c44176sGc2 = (C44176sGc) inHouseIMContactManagerImpl$getRelationInfo$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        longRef4 = longRef2;
                        i5 = i3;
                        baseDao2 = baseDaoKWHzl;
                        i6 = i;
                        t = obj;
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                        str3 = str4;
                        sQLiteDatabaseLockedException2 = e3;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        c44176sGc3 = c44176sGc2;
                        objectRef3 = objectRef2;
                        int i9 = i3;
                        longRef4 = longRef2;
                        i5 = i9;
                        int i10 = i;
                        baseDao2 = baseDaoKWHzl;
                        i6 = i10;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMContactManagerImpl$getRelationInfo$12 = inHouseIMContactManagerImpl$getRelationInfo$1;
                        i2 = i + i;
                        c44176sGc = c44176sGc3;
                        longRef3 = longRef4;
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
                        C44159sFm.EZpvd(baseDaoKWHzl, longRef2.element);
                        throw th;
                    }
                    objectRef5.element = t;
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t2 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return t2;
                }
                if (i8 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = inHouseIMContactManagerImpl$getRelationInfo$1.I$1;
                int i12 = inHouseIMContactManagerImpl$getRelationInfo$1.I$0;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationInfo$1.L$4;
                longRef4 = (Ref.LongRef) inHouseIMContactManagerImpl$getRelationInfo$1.L$3;
                BaseDao baseDao3 = (BaseDao) inHouseIMContactManagerImpl$getRelationInfo$1.L$2;
                java.lang.String str5 = (java.lang.String) inHouseIMContactManagerImpl$getRelationInfo$1.L$1;
                c44176sGc3 = (C44176sGc) inHouseIMContactManagerImpl$getRelationInfo$1.L$0;
                C56391yDq.AEQbTJ(obj);
                InHouseIMContactManagerImpl$getRelationInfo$1 inHouseIMContactManagerImpl$getRelationInfo$13 = inHouseIMContactManagerImpl$getRelationInfo$1;
                int i13 = 1;
                baseDaoKWHzl = baseDao3;
                str2 = str5;
                i = i12;
                objectRef = objectRef6;
                inHouseIMContactManagerImpl$getRelationInfo$12 = inHouseIMContactManagerImpl$getRelationInfo$13;
                i2 = i11 + i13;
                c44176sGc = c44176sGc3;
                longRef3 = longRef4;
                if (i2 >= i) {
                    try {
                        try {
                        } catch (java.lang.IllegalStateException e6) {
                            e2 = e6;
                            longRef2 = longRef3;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e7) {
                            e = e7;
                            longRef2 = longRef3;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDaoKWHzl, longRef2.element);
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e8) {
                        str3 = str2;
                        inHouseIMContactManagerImpl$getRelationInfo$1 = inHouseIMContactManagerImpl$getRelationInfo$12;
                        c44176sGc2 = c44176sGc;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException = e8;
                        c44176sGc3 = c44176sGc2;
                        objectRef3 = objectRef2;
                        int i92 = i3;
                        longRef4 = longRef2;
                        i5 = i92;
                        int i102 = i;
                        baseDao2 = baseDaoKWHzl;
                        i6 = i102;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                            inHouseIMContactManagerImpl$getRelationInfo$1.L$0 = c44176sGc3;
                            inHouseIMContactManagerImpl$getRelationInfo$1.L$1 = str3;
                            inHouseIMContactManagerImpl$getRelationInfo$1.L$2 = baseDao2;
                            inHouseIMContactManagerImpl$getRelationInfo$1.L$3 = longRef4;
                            inHouseIMContactManagerImpl$getRelationInfo$1.L$4 = objectRef3;
                            inHouseIMContactManagerImpl$getRelationInfo$1.L$5 = null;
                            inHouseIMContactManagerImpl$getRelationInfo$1.L$6 = null;
                            inHouseIMContactManagerImpl$getRelationInfo$1.L$7 = null;
                            inHouseIMContactManagerImpl$getRelationInfo$1.I$0 = i6;
                            inHouseIMContactManagerImpl$getRelationInfo$1.I$1 = i5;
                            inHouseIMContactManagerImpl$getRelationInfo$1.label = 2;
                            if (DelayKt.delay(((long) (i4 + 1)) * 50, inHouseIMContactManagerImpl$getRelationInfo$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            inHouseIMContactManagerImpl$getRelationInfo$13 = inHouseIMContactManagerImpl$getRelationInfo$1;
                            i11 = i5;
                            str2 = str3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao4 = baseDao2;
                            i = i6;
                            baseDaoKWHzl = baseDao4;
                        } else {
                            inHouseIMContactManagerImpl$getRelationInfo$13 = inHouseIMContactManagerImpl$getRelationInfo$1;
                            i11 = i5;
                            str2 = str3;
                            objectRef = objectRef3;
                            i13 = 1;
                            BaseDao baseDao5 = baseDao2;
                            i = i6;
                            baseDaoKWHzl = baseDao5;
                        }
                        inHouseIMContactManagerImpl$getRelationInfo$12 = inHouseIMContactManagerImpl$getRelationInfo$13;
                        i2 = i11 + i13;
                        c44176sGc = c44176sGc3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                        str3 = str2;
                        inHouseIMContactManagerImpl$getRelationInfo$1 = inHouseIMContactManagerImpl$getRelationInfo$12;
                        c44176sGc2 = c44176sGc;
                        i4 = i2;
                        i3 = i4;
                        objectRef2 = objectRef;
                        longRef2 = longRef3;
                        sQLiteDatabaseLockedException2 = e9;
                        sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                        c44176sGc3 = c44176sGc2;
                        objectRef3 = objectRef2;
                        int i922 = i3;
                        longRef4 = longRef2;
                        i5 = i922;
                        int i1022 = i;
                        baseDao2 = baseDaoKWHzl;
                        i6 = i1022;
                        r0 = sQLiteDatabaseLockedException;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMContactManagerImpl$getRelationInfo$12 = inHouseIMContactManagerImpl$getRelationInfo$13;
                        i2 = i11 + i13;
                        c44176sGc = c44176sGc3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
                        }
                    }
                    objectRef5 = new Ref.ObjectRef();
                    jNanoTime = java.lang.System.nanoTime();
                    InHouseIMContactDao inHouseIMContactDaoKWHzl = c44176sGc.KWHzl();
                    inHouseIMContactManagerImpl$getRelationInfo$12.L$0 = c44176sGc;
                    inHouseIMContactManagerImpl$getRelationInfo$12.L$1 = str2;
                    inHouseIMContactManagerImpl$getRelationInfo$12.L$2 = baseDaoKWHzl;
                    inHouseIMContactManagerImpl$getRelationInfo$12.L$3 = longRef3;
                    inHouseIMContactManagerImpl$getRelationInfo$12.L$4 = objectRef;
                    inHouseIMContactManagerImpl$getRelationInfo$12.L$5 = objectRef5;
                    inHouseIMContactManagerImpl$getRelationInfo$12.L$6 = longRef3;
                    inHouseIMContactManagerImpl$getRelationInfo$12.L$7 = objectRef5;
                    inHouseIMContactManagerImpl$getRelationInfo$12.I$0 = i;
                    inHouseIMContactManagerImpl$getRelationInfo$12.I$1 = i2;
                    inHouseIMContactManagerImpl$getRelationInfo$12.I$2 = i2;
                    inHouseIMContactManagerImpl$getRelationInfo$12.J$0 = jNanoTime;
                    inHouseIMContactManagerImpl$getRelationInfo$12.label = 1;
                    java.lang.Object contactById = inHouseIMContactDaoKWHzl.getContactById(str2, inHouseIMContactManagerImpl$getRelationInfo$12);
                    if (contactById == objCopydefault) {
                        return objCopydefault;
                    }
                    str4 = str2;
                    inHouseIMContactManagerImpl$getRelationInfo$1 = inHouseIMContactManagerImpl$getRelationInfo$12;
                    c44176sGc2 = c44176sGc;
                    i4 = i2;
                    objectRef4 = objectRef5;
                    longRef4 = longRef3;
                    objectRef2 = objectRef;
                    i5 = i4;
                    int i14 = i;
                    baseDao2 = baseDaoKWHzl;
                    i6 = i14;
                    t = contactById;
                    try {
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                        c44176sGc3 = c44176sGc2;
                        objectRef3 = objectRef2;
                        str3 = str4;
                        r0 = e10;
                        C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                        objectRef3.element = r0;
                        if (i4 >= i6 - 1) {
                        }
                        inHouseIMContactManagerImpl$getRelationInfo$12 = inHouseIMContactManagerImpl$getRelationInfo$13;
                        i2 = i11 + i13;
                        c44176sGc = c44176sGc3;
                        longRef3 = longRef4;
                        if (i2 >= i) {
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
                    longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                    T t22 = objectRef4.element;
                    C44159sFm.EZpvd(baseDao2, longRef4.element);
                    return t22;
                }
                C44159sFm.EZpvd(baseDaoKWHzl, longRef3.element);
                java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                if (exc == null) {
                    exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                }
                C44159sFm.OLrzqt(exc);
                throw exc;
            }
            C56391yDq.AEQbTJ(obj);
            baseDaoKWHzl = KWHzl();
            longRef3 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            i2 = 0;
            c44176sGc = this;
            inHouseIMContactManagerImpl$getRelationInfo$12 = inHouseIMContactManagerImpl$getRelationInfo$1;
            str2 = str;
            if (i2 >= i) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDaoKWHzl = baseDao;
        }
    }

    /* JADX DEBUG: Duplicate block (B:91:0x0231) to fix multi-entry loop: BACK_EDGE: B:91:0x0231 -> B:16:0x0059 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v38, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r9v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x023e: MOVE (r10 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:93:0x023e */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x023f: MOVE (r9 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:93:0x023e */
    /* JADX WARN: Path cross not found for [B:44:0x00e3, B:47:0x00f6], limit reached: 114 */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0166 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0207 A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #11 {all -> 0x005d, blocks: (B:14:0x004d, B:85:0x01fa, B:87:0x0207, B:70:0x01d1, B:71:0x01d4, B:74:0x01d8, B:76:0x01de, B:78:0x01ea, B:79:0x01ed, B:80:0x01ee, B:81:0x01f1), top: B:114:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0246  */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v28, types: [T, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    @Override // o.InterfaceC44178sGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull SearchContactReqV2 searchContactReqV2, @NotNull Continuation<? super java.util.List<InHouseIMContactInfoEntity>> continuation) throws java.lang.Exception {
        InHouseIMContactManagerImpl$searchContact$1 inHouseIMContactManagerImpl$searchContact$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDao2;
        C44176sGc c44176sGc;
        AbstractC43419rot actionBar;
        Ref.ObjectRef objectRef;
        java.util.List<InHouseIMContactInfoEntity> list;
        Ref.LongRef longRef3;
        int i;
        java.lang.Object obj;
        C44176sGc c44176sGc2;
        int i2;
        ResponseData responseData;
        java.lang.Object obj2;
        java.util.List<InHouseIMContactInfoEntity> list2;
        BaseDao baseDao3;
        Ref.LongRef longRef4;
        int i3;
        int i4;
        ?? r0;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        java.lang.Object obj3;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        long j;
        if (continuation instanceof InHouseIMContactManagerImpl$searchContact$1) {
            inHouseIMContactManagerImpl$searchContact$1 = (InHouseIMContactManagerImpl$searchContact$1) continuation;
            int i5 = inHouseIMContactManagerImpl$searchContact$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                inHouseIMContactManagerImpl$searchContact$1.label = i5 - Integer.MIN_VALUE;
            } else {
                inHouseIMContactManagerImpl$searchContact$1 = new InHouseIMContactManagerImpl$searchContact$1(this, continuation);
            }
        }
        java.lang.Object objSearchRelationV2 = inHouseIMContactManagerImpl$searchContact$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i6 = inHouseIMContactManagerImpl$searchContact$1.label;
        try {
            if (i6 == 0) {
                C56391yDq.AEQbTJ(objSearchRelationV2);
                try {
                    InHouseIMRelationService inHouseIMRelationService = this.AEQbTJ;
                    inHouseIMContactManagerImpl$searchContact$1.L$0 = this;
                    inHouseIMContactManagerImpl$searchContact$1.label = 1;
                    objSearchRelationV2 = inHouseIMRelationService.searchRelationV2(searchContactReqV2, inHouseIMContactManagerImpl$searchContact$1);
                    if (objSearchRelationV2 == objCopydefault) {
                        return objCopydefault;
                    }
                    c44176sGc = this;
                    responseData = (ResponseData) objSearchRelationV2;
                    if (responseData.getCode() != 0) {
                    }
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                } catch (java.lang.Throwable th) {
                    th = th;
                    c44176sGc = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            } else {
                if (i6 != 1) {
                    if (i6 == 2) {
                        j = inHouseIMContactManagerImpl$searchContact$1.J$0;
                        int i7 = inHouseIMContactManagerImpl$searchContact$1.I$2;
                        int i8 = inHouseIMContactManagerImpl$searchContact$1.I$1;
                        i = inHouseIMContactManagerImpl$searchContact$1.I$0;
                        objectRef3 = (Ref.ObjectRef) inHouseIMContactManagerImpl$searchContact$1.L$8;
                        longRef3 = (Ref.LongRef) inHouseIMContactManagerImpl$searchContact$1.L$7;
                        objectRef2 = (Ref.ObjectRef) inHouseIMContactManagerImpl$searchContact$1.L$6;
                        Ref.ObjectRef objectRef4 = (Ref.ObjectRef) inHouseIMContactManagerImpl$searchContact$1.L$5;
                        longRef2 = (Ref.LongRef) inHouseIMContactManagerImpl$searchContact$1.L$4;
                        baseDao2 = (BaseDao) inHouseIMContactManagerImpl$searchContact$1.L$3;
                        list = (java.util.List) inHouseIMContactManagerImpl$searchContact$1.L$2;
                        obj3 = inHouseIMContactManagerImpl$searchContact$1.L$1;
                        C44176sGc c44176sGc3 = (C44176sGc) inHouseIMContactManagerImpl$searchContact$1.L$0;
                        try {
                            try {
                                C56391yDq.AEQbTJ(objSearchRelationV2);
                                i4 = i8;
                                objectRef = objectRef4;
                                c44176sGc2 = c44176sGc3;
                                i2 = i7;
                            } catch (java.lang.IllegalStateException e3) {
                                e2 = e3;
                                message = e2.getMessage();
                                if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                    C44159sFm.OLrzqt(e2);
                                    throw e2;
                                }
                                C44159sFm.copydefault(e2);
                                throw e2;
                            } catch (java.lang.Exception e4) {
                                e = e4;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                C44159sFm.EZpvd(baseDao2, longRef2.element);
                                throw th;
                            }
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e5) {
                            i4 = i8;
                            baseDao3 = baseDao2;
                            list2 = list;
                            i3 = i;
                            obj2 = obj3;
                            objectRef = objectRef4;
                            longRef4 = longRef2;
                            c44176sGc2 = c44176sGc3;
                            i2 = i7;
                            r0 = e5;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                            objectRef.element = r0;
                            if (i2 < i3 - 1) {
                                inHouseIMContactManagerImpl$searchContact$1.L$0 = c44176sGc2;
                                inHouseIMContactManagerImpl$searchContact$1.L$1 = obj2;
                                inHouseIMContactManagerImpl$searchContact$1.L$2 = list2;
                                inHouseIMContactManagerImpl$searchContact$1.L$3 = baseDao3;
                                inHouseIMContactManagerImpl$searchContact$1.L$4 = longRef4;
                                inHouseIMContactManagerImpl$searchContact$1.L$5 = objectRef;
                                inHouseIMContactManagerImpl$searchContact$1.L$6 = null;
                                inHouseIMContactManagerImpl$searchContact$1.L$7 = null;
                                inHouseIMContactManagerImpl$searchContact$1.L$8 = null;
                                inHouseIMContactManagerImpl$searchContact$1.I$0 = i3;
                                inHouseIMContactManagerImpl$searchContact$1.I$1 = i4;
                                inHouseIMContactManagerImpl$searchContact$1.label = 3;
                                if (DelayKt.delay(((long) (i2 + 1)) * 50, inHouseIMContactManagerImpl$searchContact$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                                list = list2;
                                longRef3 = longRef4;
                            } else {
                                list = list2;
                                longRef3 = longRef4;
                            }
                            i = i3;
                            obj = obj2;
                            i2 = i4 + 1;
                            baseDao2 = baseDao3;
                            if (i2 < i) {
                            }
                        }
                        objectRef3.element = Unit.INSTANCE;
                        longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                        T t = objectRef2.element;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        return (java.util.List) obj3;
                    }
                    if (i6 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i9 = inHouseIMContactManagerImpl$searchContact$1.I$1;
                    i3 = inHouseIMContactManagerImpl$searchContact$1.I$0;
                    Ref.ObjectRef objectRef5 = (Ref.ObjectRef) inHouseIMContactManagerImpl$searchContact$1.L$5;
                    Ref.LongRef longRef5 = (Ref.LongRef) inHouseIMContactManagerImpl$searchContact$1.L$4;
                    baseDao3 = (BaseDao) inHouseIMContactManagerImpl$searchContact$1.L$3;
                    java.util.List<InHouseIMContactInfoEntity> list3 = (java.util.List) inHouseIMContactManagerImpl$searchContact$1.L$2;
                    obj2 = inHouseIMContactManagerImpl$searchContact$1.L$1;
                    C44176sGc c44176sGc4 = (C44176sGc) inHouseIMContactManagerImpl$searchContact$1.L$0;
                    C56391yDq.AEQbTJ(objSearchRelationV2);
                    i4 = i9;
                    c44176sGc2 = c44176sGc4;
                    list = list3;
                    objectRef = objectRef5;
                    longRef3 = longRef5;
                    i = i3;
                    obj = obj2;
                    i2 = i4 + 1;
                    baseDao2 = baseDao3;
                    if (i2 < i) {
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                            i4 = i2;
                            obj2 = obj;
                            baseDao3 = baseDao2;
                            i3 = i;
                            longRef4 = longRef3;
                            list2 = list;
                            r0 = e6;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                            objectRef.element = r0;
                            if (i2 < i3 - 1) {
                            }
                            i = i3;
                            obj = obj2;
                            i2 = i4 + 1;
                            baseDao2 = baseDao3;
                            if (i2 < i) {
                            }
                        } catch (java.lang.IllegalStateException e7) {
                            e2 = e7;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e8) {
                            e = e8;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            longRef2 = longRef3;
                            C44159sFm.EZpvd(baseDao2, longRef2.element);
                            throw th;
                        }
                        objectRef3 = new Ref.ObjectRef();
                        long jNanoTime = java.lang.System.nanoTime();
                        InHouseIMContactDao inHouseIMContactDaoKWHzl = c44176sGc2.KWHzl();
                        inHouseIMContactManagerImpl$searchContact$1.L$0 = c44176sGc2;
                        inHouseIMContactManagerImpl$searchContact$1.L$1 = obj;
                        inHouseIMContactManagerImpl$searchContact$1.L$2 = list;
                        inHouseIMContactManagerImpl$searchContact$1.L$3 = baseDao2;
                        inHouseIMContactManagerImpl$searchContact$1.L$4 = longRef3;
                        inHouseIMContactManagerImpl$searchContact$1.L$5 = objectRef;
                        inHouseIMContactManagerImpl$searchContact$1.L$6 = objectRef3;
                        inHouseIMContactManagerImpl$searchContact$1.L$7 = longRef3;
                        inHouseIMContactManagerImpl$searchContact$1.L$8 = objectRef3;
                        inHouseIMContactManagerImpl$searchContact$1.I$0 = i;
                        inHouseIMContactManagerImpl$searchContact$1.I$1 = i2;
                        inHouseIMContactManagerImpl$searchContact$1.I$2 = i2;
                        inHouseIMContactManagerImpl$searchContact$1.J$0 = jNanoTime;
                        inHouseIMContactManagerImpl$searchContact$1.label = 2;
                        if (inHouseIMContactDaoKWHzl.insertOrReplaceContacts(list, inHouseIMContactManagerImpl$searchContact$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        obj3 = obj;
                        objectRef2 = objectRef3;
                        longRef2 = longRef3;
                        j = jNanoTime;
                        i4 = i2;
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                            baseDao3 = baseDao2;
                            list2 = list;
                            i3 = i;
                            obj2 = obj3;
                            longRef4 = longRef2;
                            r0 = e9;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                            objectRef.element = r0;
                            if (i2 < i3 - 1) {
                            }
                            i = i3;
                            obj = obj2;
                            i2 = i4 + 1;
                            baseDao2 = baseDao3;
                            if (i2 < i) {
                            }
                        }
                        objectRef3.element = Unit.INSTANCE;
                        longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                        T t2 = objectRef2.element;
                        C44159sFm.EZpvd(baseDao2, longRef2.element);
                        return (java.util.List) obj3;
                    }
                    C44159sFm.EZpvd(baseDao2, longRef3.element);
                    java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                    if (exc == null) {
                        exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                    }
                    C44159sFm.OLrzqt(exc);
                    throw exc;
                }
                c44176sGc = (C44176sGc) inHouseIMContactManagerImpl$searchContact$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objSearchRelationV2);
                    responseData = (ResponseData) objSearchRelationV2;
                    if (responseData.getCode() != 0 && responseData.getData() != null) {
                        java.lang.Object data = responseData.getData();
                        Intrinsics.copydefault(data);
                        actionBar = new AbstractC43419rot.StateListAnimator(data);
                    } else {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            }
            if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                java.lang.Object objKWHzl = ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
                InHouseIMContactDao inHouseIMContactDaoKWHzl2 = c44176sGc.KWHzl();
                Ref.LongRef longRef6 = new Ref.LongRef();
                objectRef = new Ref.ObjectRef();
                list = (java.util.List) objKWHzl;
                baseDao2 = inHouseIMContactDaoKWHzl2;
                longRef3 = longRef6;
                i = 3;
                obj = objKWHzl;
                c44176sGc2 = c44176sGc;
                i2 = 0;
                if (i2 < i) {
                }
            } else {
                if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw ((java.lang.Throwable) ((AbstractC43419rot.ActionBar) actionBar).KWHzl());
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            longRef2 = longRef;
            baseDao2 = baseDao;
        }
    }

    /* JADX DEBUG: Duplicate block (B:96:0x025e) to fix multi-entry loop: BACK_EDGE: B:96:0x025e -> B:97:0x0263 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v43, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r10v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:45:0x00e7, B:48:0x00fa], limit reached: 118 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c6 A[LOOP:0: B:61:0x01c0->B:63:0x01c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ef A[PHI: r0
  0x01ef: PHI (r0v50 java.lang.Object) = (r0v34 java.lang.Object), (r0v1 java.lang.Object) binds: [B:65:0x01ec, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0236 A[Catch: all -> 0x026a, TRY_LEAVE, TryCatch #6 {all -> 0x026a, blocks: (B:90:0x0229, B:92:0x0236), top: B:111:0x0229 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025c  */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, kotlin.Unit] */
    @Override // o.InterfaceC44178sGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<ContactWithPhoneData>> continuation) throws java.lang.Exception {
        InHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1 inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1;
        Ref.LongRef longRef;
        BaseDao baseDaoKWHzl;
        C44176sGc c44176sGc;
        AbstractC43419rot actionBar;
        java.util.List<InHouseIMContactInfoEntity> list2;
        Ref.LongRef longRef2;
        Ref.ObjectRef objectRef;
        int i;
        C44176sGc c44176sGc2;
        int i2;
        ResponseData responseData;
        java.util.List<InHouseIMContactInfoEntity> list3;
        BaseDao baseDao;
        int i3;
        ?? r0;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        Ref.ObjectRef objectRef2;
        long jNanoTime;
        Ref.ObjectRef objectRef3;
        java.util.Iterator it;
        if (continuation instanceof InHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1) {
            inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1 = (InHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1) continuation;
            int i4 = inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.label = i4 - Integer.MIN_VALUE;
            } else {
                inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1 = new InHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1(this, continuation);
            }
        }
        java.lang.Object relationListByRelationId = inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.label;
        try {
            if (i5 == 0) {
                C56391yDq.AEQbTJ(relationListByRelationId);
                try {
                    InHouseIMRelationService inHouseIMRelationService = this.AEQbTJ;
                    RelationListRequest relationListRequest = new RelationListRequest(list);
                    inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$0 = this;
                    inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.label = 1;
                    relationListByRelationId = inHouseIMRelationService.getRelationListByRelationId(relationListRequest, inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1);
                    if (relationListByRelationId == objCopydefault) {
                        return objCopydefault;
                    }
                    c44176sGc = this;
                    responseData = (ResponseData) relationListByRelationId;
                    if (responseData.getCode() != 0) {
                    }
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                } catch (java.lang.Throwable th) {
                    th = th;
                    c44176sGc = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            } else if (i5 == 1) {
                c44176sGc = (C44176sGc) inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$0;
                try {
                    C56391yDq.AEQbTJ(relationListByRelationId);
                    responseData = (ResponseData) relationListByRelationId;
                    if (responseData.getCode() != 0 && responseData.getData() != null) {
                        java.lang.Object data = responseData.getData();
                        Intrinsics.copydefault(data);
                        actionBar = new AbstractC43419rot.StateListAnimator(data);
                    } else {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            } else {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 == 4) {
                            C56391yDq.AEQbTJ(relationListByRelationId);
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.I$1;
                    int i7 = inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.I$0;
                    Ref.ObjectRef objectRef4 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$4;
                    Ref.LongRef longRef3 = (Ref.LongRef) inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$3;
                    BaseDao baseDao2 = (BaseDao) inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$2;
                    java.util.List<InHouseIMContactInfoEntity> list4 = (java.util.List) inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$1;
                    C44176sGc c44176sGc3 = (C44176sGc) inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$0;
                    C56391yDq.AEQbTJ(relationListByRelationId);
                    objectRef = objectRef4;
                    c44176sGc2 = c44176sGc3;
                    baseDaoKWHzl = baseDao2;
                    list2 = list4;
                    i3 = i6;
                    longRef2 = longRef3;
                    i = i7;
                    i2 = i3 + 1;
                    if (i2 < i) {
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                            try {
                                C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                                objectRef.element = r0;
                                if (i2 < i - 1) {
                                }
                                i2 = i3 + 1;
                                if (i2 < i) {
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                Ref.LongRef longRef4 = longRef;
                                longRef = longRef4;
                                baseDaoKWHzl = baseDao;
                                C44159sFm.EZpvd(baseDaoKWHzl, longRef.element);
                                throw th;
                            }
                            i3 = i2;
                            baseDao = baseDaoKWHzl;
                            longRef = longRef2;
                            list3 = list2;
                            r0 = e3;
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
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            longRef = longRef2;
                            C44159sFm.EZpvd(baseDaoKWHzl, longRef.element);
                            throw th;
                        }
                        objectRef2 = new Ref.ObjectRef();
                        jNanoTime = java.lang.System.nanoTime();
                        InHouseIMContactDao inHouseIMContactDaoKWHzl = c44176sGc2.KWHzl();
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$0 = c44176sGc2;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$1 = list2;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$2 = baseDaoKWHzl;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$3 = longRef2;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$4 = objectRef;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$5 = objectRef2;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$6 = longRef2;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$7 = objectRef2;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.I$0 = i;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.I$1 = i2;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.I$2 = i2;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.J$0 = jNanoTime;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.label = 2;
                        if (inHouseIMContactDaoKWHzl.insertOrReplaceContacts(list2, inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        i3 = i2;
                        objectRef3 = objectRef2;
                        longRef = longRef2;
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                            baseDao = baseDaoKWHzl;
                            list3 = list2;
                            r0 = e6;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                            objectRef.element = r0;
                            if (i2 < i - 1) {
                            }
                            i2 = i3 + 1;
                            if (i2 < i) {
                            }
                        }
                        objectRef3.element = Unit.INSTANCE;
                        longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                        T t = objectRef2.element;
                        C44159sFm.EZpvd(baseDaoKWHzl, longRef.element);
                        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                        it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((InHouseIMContactInfoEntity) it.next()).getContactUid());
                        }
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$0 = null;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$1 = null;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$2 = null;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$3 = null;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$4 = null;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$5 = null;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$6 = null;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$7 = null;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.label = 4;
                        relationListByRelationId = c44176sGc2.EZpvd(arrayList, inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1);
                        return relationListByRelationId != objCopydefault ? objCopydefault : relationListByRelationId;
                    }
                    C44159sFm.EZpvd(baseDaoKWHzl, longRef2.element);
                    java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                    if (exc == null) {
                        exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                    }
                    C44159sFm.OLrzqt(exc);
                    throw exc;
                }
                jNanoTime = inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.J$0;
                int i8 = inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.I$2;
                i3 = inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.I$1;
                i = inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.I$0;
                Ref.ObjectRef objectRef5 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$7;
                longRef2 = (Ref.LongRef) inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$6;
                Ref.ObjectRef objectRef6 = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$5;
                objectRef = (Ref.ObjectRef) inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$4;
                longRef = (Ref.LongRef) inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$3;
                baseDaoKWHzl = (BaseDao) inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$2;
                list2 = (java.util.List) inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$1;
                C44176sGc c44176sGc4 = (C44176sGc) inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$0;
                try {
                    try {
                        C56391yDq.AEQbTJ(relationListByRelationId);
                        objectRef3 = objectRef5;
                        objectRef2 = objectRef6;
                        c44176sGc2 = c44176sGc4;
                        i2 = i8;
                    } catch (java.lang.IllegalStateException e7) {
                        e2 = e7;
                        message = e2.getMessage();
                        if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                            C44159sFm.OLrzqt(e2);
                            throw e2;
                        }
                        C44159sFm.copydefault(e2);
                        throw e2;
                    } catch (java.lang.Exception e8) {
                        e = e8;
                        C44159sFm.OLrzqt(e);
                        throw e;
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        C44159sFm.EZpvd(baseDaoKWHzl, longRef.element);
                        throw th;
                    }
                } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                    c44176sGc2 = c44176sGc4;
                    baseDao = baseDaoKWHzl;
                    list3 = list2;
                    i2 = i8;
                    r0 = e9;
                    C44159sFm.copydefault(r0, (java.lang.Exception) objectRef.element);
                    objectRef.element = r0;
                    if (i2 < i - 1) {
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$0 = c44176sGc2;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$1 = list3;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$2 = baseDao;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$3 = longRef;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$4 = objectRef;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$5 = null;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$6 = null;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$7 = null;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.I$0 = i;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.I$1 = i3;
                        inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.label = 3;
                        if (DelayKt.delay(((long) (i2 + 1)) * 50, inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        baseDaoKWHzl = baseDao;
                        list2 = list3;
                        longRef2 = longRef;
                    } else {
                        baseDaoKWHzl = baseDao;
                        list2 = list3;
                        longRef2 = longRef;
                    }
                    i2 = i3 + 1;
                    if (i2 < i) {
                    }
                }
                objectRef3.element = Unit.INSTANCE;
                longRef2.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                T t2 = objectRef2.element;
                C44159sFm.EZpvd(baseDaoKWHzl, longRef.element);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                }
                inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$0 = null;
                inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$1 = null;
                inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$2 = null;
                inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$3 = null;
                inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$4 = null;
                inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$5 = null;
                inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$6 = null;
                inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.L$7 = null;
                inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1.label = 4;
                relationListByRelationId = c44176sGc2.EZpvd(arrayList2, inHouseIMContactManagerImpl$getRelationListFromRemoteByUids$1);
                if (relationListByRelationId != objCopydefault) {
                }
            }
            list2 = (java.util.List) actionBar.AEQbTJ();
            baseDaoKWHzl = c44176sGc.KWHzl();
            longRef2 = new Ref.LongRef();
            objectRef = new Ref.ObjectRef();
            i = 3;
            c44176sGc2 = c44176sGc;
            i2 = 0;
            if (i2 < i) {
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44178sGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<ContactWithPhoneData>> continuation) throws java.lang.Throwable {
        InHouseIMContactManagerImpl$getSyncedFriendFromLocalByUids$1 inHouseIMContactManagerImpl$getSyncedFriendFromLocalByUids$1;
        if (continuation instanceof InHouseIMContactManagerImpl$getSyncedFriendFromLocalByUids$1) {
            inHouseIMContactManagerImpl$getSyncedFriendFromLocalByUids$1 = (InHouseIMContactManagerImpl$getSyncedFriendFromLocalByUids$1) continuation;
            int i = inHouseIMContactManagerImpl$getSyncedFriendFromLocalByUids$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactManagerImpl$getSyncedFriendFromLocalByUids$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactManagerImpl$getSyncedFriendFromLocalByUids$1 = new InHouseIMContactManagerImpl$getSyncedFriendFromLocalByUids$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = inHouseIMContactManagerImpl$getSyncedFriendFromLocalByUids$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactManagerImpl$getSyncedFriendFromLocalByUids$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            inHouseIMContactManagerImpl$getSyncedFriendFromLocalByUids$1.label = 1;
            objEZpvd = EZpvd(list, inHouseIMContactManagerImpl$getSyncedFriendFromLocalByUids$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : (java.lang.Iterable) objEZpvd) {
            ContactWithPhoneData contactWithPhoneData = (ContactWithPhoneData) obj;
            if (contactWithPhoneData.getRelationType() == ContactRelationType.ONE_WAY || contactWithPhoneData.getRelationType() == ContactRelationType.TWO_WAY || (contactWithPhoneData.getRelationType() == ContactRelationType.STRANGER && C33129mqd.OLrzqt((java.lang.CharSequence) contactWithPhoneData.getRemarkName()))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final java.lang.Object EZpvd(java.util.List<java.lang.String> list, Continuation<? super java.util.List<ContactWithPhoneData>> continuation) {
        return sSU.OLrzqt(CollectionsKt___CollectionsKt.OqFWZa(list), new InHouseIMContactManagerImpl$getRelationListFromLocalByUids$2(this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0032, B:23:0x007f, B:25:0x008d, B:27:0x0093, B:28:0x00a0), top: B:37:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44178sGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull CacheStrategy cacheStrategy, int i, @NotNull Continuation<? super java.util.List<InHouseIMContactInfoEntity>> continuation) throws java.lang.Throwable {
        InHouseIMContactManagerImpl$getSuggestedList$1 inHouseIMContactManagerImpl$getSuggestedList$1;
        C44176sGc c44176sGc;
        java.lang.Throwable th;
        Ref.BooleanRef booleanRef;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        if (continuation instanceof InHouseIMContactManagerImpl$getSuggestedList$1) {
            inHouseIMContactManagerImpl$getSuggestedList$1 = (InHouseIMContactManagerImpl$getSuggestedList$1) continuation;
            int i2 = inHouseIMContactManagerImpl$getSuggestedList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inHouseIMContactManagerImpl$getSuggestedList$1.label = i2 - Integer.MIN_VALUE;
            } else {
                inHouseIMContactManagerImpl$getSuggestedList$1 = new InHouseIMContactManagerImpl$getSuggestedList$1(this, continuation);
            }
        }
        InHouseIMContactManagerImpl$getSuggestedList$1 inHouseIMContactManagerImpl$getSuggestedList$12 = inHouseIMContactManagerImpl$getSuggestedList$1;
        java.lang.Object obj = inHouseIMContactManagerImpl$getSuggestedList$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = inHouseIMContactManagerImpl$getSuggestedList$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("InHouseIMContactManagerImpl", "get suggested list => cacheStrategy:" + cacheStrategy);
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            try {
                InHouseIMRelationService inHouseIMRelationService = this.AEQbTJ;
                java.lang.String strName = cacheStrategy.name();
                java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(i);
                inHouseIMContactManagerImpl$getSuggestedList$12.L$0 = this;
                inHouseIMContactManagerImpl$getSuggestedList$12.L$1 = booleanRef2;
                inHouseIMContactManagerImpl$getSuggestedList$12.label = 1;
                java.lang.Object suggestedList$default = InHouseIMRelationService.TaskDescription.getSuggestedList$default(inHouseIMRelationService, strName, 0L, numAEQbTJ, inHouseIMContactManagerImpl$getSuggestedList$12, 2, null);
                if (suggestedList$default == objCopydefault) {
                    return objCopydefault;
                }
                c44176sGc = this;
                obj = suggestedList$default;
                booleanRef = booleanRef2;
                responseData = (ResponseData) obj;
                booleanRef.element = responseData.isFromCache();
                if (responseData.getCode() != 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th2) {
                c44176sGc = this;
                th = th2;
                booleanRef = booleanRef2;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            booleanRef = (Ref.BooleanRef) inHouseIMContactManagerImpl$getSuggestedList$12.L$1;
            c44176sGc = (C44176sGc) inHouseIMContactManagerImpl$getSuggestedList$12.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                responseData = (ResponseData) obj;
                booleanRef.element = responseData.isFromCache();
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        }
        java.util.List<InHouseIMContactInfoEntity> list = (java.util.List) actionBar.AEQbTJ();
        if (!booleanRef.element) {
            c44176sGc.copydefault.AEQbTJ(list);
        }
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44178sGe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super ReferralTasks> continuation) throws java.lang.Throwable {
        InHouseIMContactManagerImpl$getReferralData$1 inHouseIMContactManagerImpl$getReferralData$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof InHouseIMContactManagerImpl$getReferralData$1) {
            inHouseIMContactManagerImpl$getReferralData$1 = (InHouseIMContactManagerImpl$getReferralData$1) continuation;
            int i = inHouseIMContactManagerImpl$getReferralData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactManagerImpl$getReferralData$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactManagerImpl$getReferralData$1 = new InHouseIMContactManagerImpl$getReferralData$1(this, continuation);
            }
        }
        java.lang.Object referralTasks = inHouseIMContactManagerImpl$getReferralData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactManagerImpl$getReferralData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(referralTasks);
                InHouseIMRelationService inHouseIMRelationService = this.AEQbTJ;
                inHouseIMContactManagerImpl$getReferralData$1.label = 1;
                referralTasks = inHouseIMRelationService.getReferralTasks(inHouseIMContactManagerImpl$getReferralData$1);
                if (referralTasks == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(referralTasks);
            }
            ResponseData responseData = (ResponseData) referralTasks;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        return actionBar.AEQbTJ();
    }
}
