package o;

import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.feature.cache.contact.ContactCacheImpl$getContact$1;
import com.okinc.okimcore.feature.cache.contact.ContactCacheImpl$reloadIfNoCache$1;
import com.okinc.okimcore.feature.cache.contact.ContactCacheImpl$updateContactByDisplayUser$1;
import com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao;
import com.okinc.okimcore.model.im.RelationSourceType;
import com.okinc.okimcore.model.im.inhouseim.ContactRelationType;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.ContactEntity;
import com.okinc.okimcore.model.room.inhouseim.ContactWithPhoneData;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import com.okinc.okimcore.model.room.inhouseim.RelationPermission;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
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
public final class sFP extends sFJ<ContactEntity> implements sFK {
    public final CoroutineDispatcher AEQbTJ;
    public final sIC KWHzl;
    public final sFZ OLrzqt;

    @Override // o.sFJ
    public int AEQbTJ() {
        return 800;
    }

    @yCM
    public sFP(@NotNull sFZ sfz, @NotNull sIC sic, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sfz, "");
        Intrinsics.checkNotNullParameter(sic, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = sfz;
        this.KWHzl = sic;
        this.AEQbTJ = coroutineDispatcher;
    }

    public final InHouseIMContactDao OLrzqt() {
        return this.KWHzl.copydefault().OLrzqt();
    }

    /* JADX DEBUG: Duplicate block (B:79:0x01ac) to fix multi-entry loop: BACK_EDGE: B:79:0x01ac -> B:80:0x01b6 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v31, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v44, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v45, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01bd: MOVE (r6 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:81:0x01bd */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01be: MOVE (r7 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:81:0x01bd */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:57:0x0141, B:58:0x0144, B:62:0x0149, B:64:0x014f, B:66:0x015b, B:67:0x015e, B:68:0x015f, B:69:0x0162, B:73:0x0178, B:75:0x0185), top: B:89:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0185 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0046, B:38:0x00fe, B:57:0x0141, B:58:0x0144, B:62:0x0149, B:64:0x014f, B:66:0x015b, B:67:0x015e, B:68:0x015f, B:69:0x0162, B:73:0x0178, B:75:0x0185), top: B:89:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    @Override // o.sFJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super ContactEntity> continuation) throws java.lang.Exception {
        ContactCacheImpl$reloadIfNoCache$1 contactCacheImpl$reloadIfNoCache$1;
        Ref.LongRef longRef;
        Ref.LongRef longRef2;
        BaseDao baseDao;
        BaseDao baseDaoOLrzqt;
        Ref.LongRef longRef3;
        Ref.ObjectRef objectRef;
        int i;
        int i2;
        sFP sfp;
        ContactCacheImpl$reloadIfNoCache$1 contactCacheImpl$reloadIfNoCache$12;
        java.lang.String str2;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        int i3;
        java.lang.String str3;
        Ref.ObjectRef objectRef2;
        int i4;
        sFP sfp2;
        android.database.sqlite.SQLiteDatabaseLockedException sQLiteDatabaseLockedException;
        sFP sfp3;
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
        ContactWithPhoneData contactWithPhoneData;
        if (continuation instanceof ContactCacheImpl$reloadIfNoCache$1) {
            contactCacheImpl$reloadIfNoCache$1 = (ContactCacheImpl$reloadIfNoCache$1) continuation;
            int i7 = contactCacheImpl$reloadIfNoCache$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                contactCacheImpl$reloadIfNoCache$1.label = i7 - Integer.MIN_VALUE;
            } else {
                contactCacheImpl$reloadIfNoCache$1 = new ContactCacheImpl$reloadIfNoCache$1(this, continuation);
            }
        }
        java.lang.Object obj = contactCacheImpl$reloadIfNoCache$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i8 = contactCacheImpl$reloadIfNoCache$1.label;
        try {
            if (i8 == 0) {
                C56391yDq.AEQbTJ(obj);
                baseDaoOLrzqt = OLrzqt();
                longRef3 = new Ref.LongRef();
                objectRef = new Ref.ObjectRef();
                i = 3;
                i2 = 0;
                sfp = this;
                contactCacheImpl$reloadIfNoCache$12 = contactCacheImpl$reloadIfNoCache$1;
                str2 = str;
                if (i2 >= i) {
                }
            } else {
                if (i8 != 1) {
                    if (i8 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i9 = contactCacheImpl$reloadIfNoCache$1.I$1;
                    int i10 = contactCacheImpl$reloadIfNoCache$1.I$0;
                    Ref.ObjectRef objectRef6 = (Ref.ObjectRef) contactCacheImpl$reloadIfNoCache$1.L$4;
                    longRef4 = (Ref.LongRef) contactCacheImpl$reloadIfNoCache$1.L$3;
                    BaseDao baseDao3 = (BaseDao) contactCacheImpl$reloadIfNoCache$1.L$2;
                    java.lang.String str5 = (java.lang.String) contactCacheImpl$reloadIfNoCache$1.L$1;
                    sfp3 = (sFP) contactCacheImpl$reloadIfNoCache$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    ContactCacheImpl$reloadIfNoCache$1 contactCacheImpl$reloadIfNoCache$13 = contactCacheImpl$reloadIfNoCache$1;
                    int i11 = 1;
                    baseDaoOLrzqt = baseDao3;
                    str2 = str5;
                    i = i10;
                    objectRef = objectRef6;
                    contactCacheImpl$reloadIfNoCache$12 = contactCacheImpl$reloadIfNoCache$13;
                    i2 = i9 + i11;
                    sfp = sfp3;
                    longRef3 = longRef4;
                    if (i2 >= i) {
                        try {
                            try {
                            } catch (java.lang.IllegalStateException e3) {
                                e2 = e3;
                                longRef2 = longRef3;
                                message = e2.getMessage();
                                if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                    C44159sFm.OLrzqt(e2);
                                    throw e2;
                                }
                                C44159sFm.copydefault(e2);
                                throw e2;
                            } catch (java.lang.Exception e4) {
                                e = e4;
                                longRef2 = longRef3;
                                C44159sFm.OLrzqt(e);
                                throw e;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                longRef2 = longRef3;
                                C44159sFm.EZpvd(baseDaoOLrzqt, longRef2.element);
                                throw th;
                            }
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e5) {
                            str3 = str2;
                            contactCacheImpl$reloadIfNoCache$1 = contactCacheImpl$reloadIfNoCache$12;
                            sfp2 = sfp;
                            i4 = i2;
                            i3 = i4;
                            objectRef2 = objectRef;
                            longRef2 = longRef3;
                            sQLiteDatabaseLockedException = e5;
                            sfp3 = sfp2;
                            objectRef3 = objectRef2;
                            int i12 = i3;
                            longRef4 = longRef2;
                            i5 = i12;
                            int i13 = i;
                            baseDao2 = baseDaoOLrzqt;
                            i6 = i13;
                            r0 = sQLiteDatabaseLockedException;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                            objectRef3.element = r0;
                            if (i4 >= i6 - 1) {
                                contactCacheImpl$reloadIfNoCache$1.L$0 = sfp3;
                                contactCacheImpl$reloadIfNoCache$1.L$1 = str3;
                                contactCacheImpl$reloadIfNoCache$1.L$2 = baseDao2;
                                contactCacheImpl$reloadIfNoCache$1.L$3 = longRef4;
                                contactCacheImpl$reloadIfNoCache$1.L$4 = objectRef3;
                                contactCacheImpl$reloadIfNoCache$1.L$5 = null;
                                contactCacheImpl$reloadIfNoCache$1.L$6 = null;
                                contactCacheImpl$reloadIfNoCache$1.L$7 = null;
                                contactCacheImpl$reloadIfNoCache$1.I$0 = i6;
                                contactCacheImpl$reloadIfNoCache$1.I$1 = i5;
                                contactCacheImpl$reloadIfNoCache$1.label = 2;
                                if (DelayKt.delay(((long) (i4 + 1)) * 50, contactCacheImpl$reloadIfNoCache$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                                contactCacheImpl$reloadIfNoCache$13 = contactCacheImpl$reloadIfNoCache$1;
                                i9 = i5;
                                str2 = str3;
                                objectRef = objectRef3;
                                i11 = 1;
                                BaseDao baseDao4 = baseDao2;
                                i = i6;
                                baseDaoOLrzqt = baseDao4;
                            } else {
                                contactCacheImpl$reloadIfNoCache$13 = contactCacheImpl$reloadIfNoCache$1;
                                i9 = i5;
                                str2 = str3;
                                objectRef = objectRef3;
                                i11 = 1;
                                BaseDao baseDao5 = baseDao2;
                                i = i6;
                                baseDaoOLrzqt = baseDao5;
                            }
                            contactCacheImpl$reloadIfNoCache$12 = contactCacheImpl$reloadIfNoCache$13;
                            i2 = i9 + i11;
                            sfp = sfp3;
                            longRef3 = longRef4;
                            if (i2 >= i) {
                            }
                        }
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                            str3 = str2;
                            contactCacheImpl$reloadIfNoCache$1 = contactCacheImpl$reloadIfNoCache$12;
                            sfp2 = sfp;
                            i4 = i2;
                            i3 = i4;
                            objectRef2 = objectRef;
                            longRef2 = longRef3;
                            sQLiteDatabaseLockedException2 = e6;
                            sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                            sfp3 = sfp2;
                            objectRef3 = objectRef2;
                            int i122 = i3;
                            longRef4 = longRef2;
                            i5 = i122;
                            int i132 = i;
                            baseDao2 = baseDaoOLrzqt;
                            i6 = i132;
                            r0 = sQLiteDatabaseLockedException;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                            objectRef3.element = r0;
                            if (i4 >= i6 - 1) {
                            }
                            contactCacheImpl$reloadIfNoCache$12 = contactCacheImpl$reloadIfNoCache$13;
                            i2 = i9 + i11;
                            sfp = sfp3;
                            longRef3 = longRef4;
                            if (i2 >= i) {
                            }
                        }
                        objectRef5 = new Ref.ObjectRef();
                        jNanoTime = java.lang.System.nanoTime();
                        InHouseIMContactDao inHouseIMContactDaoOLrzqt = sfp.OLrzqt();
                        contactCacheImpl$reloadIfNoCache$12.L$0 = sfp;
                        contactCacheImpl$reloadIfNoCache$12.L$1 = str2;
                        contactCacheImpl$reloadIfNoCache$12.L$2 = baseDaoOLrzqt;
                        contactCacheImpl$reloadIfNoCache$12.L$3 = longRef3;
                        contactCacheImpl$reloadIfNoCache$12.L$4 = objectRef;
                        contactCacheImpl$reloadIfNoCache$12.L$5 = objectRef5;
                        contactCacheImpl$reloadIfNoCache$12.L$6 = longRef3;
                        contactCacheImpl$reloadIfNoCache$12.L$7 = objectRef5;
                        contactCacheImpl$reloadIfNoCache$12.I$0 = i;
                        contactCacheImpl$reloadIfNoCache$12.I$1 = i2;
                        contactCacheImpl$reloadIfNoCache$12.I$2 = i2;
                        contactCacheImpl$reloadIfNoCache$12.J$0 = jNanoTime;
                        contactCacheImpl$reloadIfNoCache$12.label = 1;
                        java.lang.Object contactById = inHouseIMContactDaoOLrzqt.getContactById(str2, contactCacheImpl$reloadIfNoCache$12);
                        if (contactById == objCopydefault) {
                            return objCopydefault;
                        }
                        str4 = str2;
                        contactCacheImpl$reloadIfNoCache$1 = contactCacheImpl$reloadIfNoCache$12;
                        sfp2 = sfp;
                        i4 = i2;
                        objectRef4 = objectRef5;
                        longRef4 = longRef3;
                        objectRef2 = objectRef;
                        i5 = i4;
                        int i14 = i;
                        baseDao2 = baseDaoOLrzqt;
                        i6 = i14;
                        t = contactById;
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e7) {
                            sfp3 = sfp2;
                            objectRef3 = objectRef2;
                            str3 = str4;
                            r0 = e7;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                            objectRef3.element = r0;
                            if (i4 >= i6 - 1) {
                            }
                            contactCacheImpl$reloadIfNoCache$12 = contactCacheImpl$reloadIfNoCache$13;
                            i2 = i9 + i11;
                            sfp = sfp3;
                            longRef3 = longRef4;
                            if (i2 >= i) {
                            }
                        } catch (java.lang.IllegalStateException e8) {
                            e2 = e8;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e9) {
                            e = e9;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        }
                        objectRef5.element = t;
                        longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                        T t2 = objectRef4.element;
                        C44159sFm.EZpvd(baseDao2, longRef4.element);
                        contactWithPhoneData = (ContactWithPhoneData) t2;
                        if (contactWithPhoneData == null) {
                            return C44169sFw.EZpvd(contactWithPhoneData);
                        }
                        return null;
                    }
                    C44159sFm.EZpvd(baseDaoOLrzqt, longRef3.element);
                    java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                    if (exc == null) {
                        exc = new java.lang.Exception("Database Operation failed after " + i + " attempts");
                    }
                    C44159sFm.OLrzqt(exc);
                    throw exc;
                }
                jNanoTime = contactCacheImpl$reloadIfNoCache$1.J$0;
                i4 = contactCacheImpl$reloadIfNoCache$1.I$2;
                i3 = contactCacheImpl$reloadIfNoCache$1.I$1;
                i = contactCacheImpl$reloadIfNoCache$1.I$0;
                objectRef5 = (Ref.ObjectRef) contactCacheImpl$reloadIfNoCache$1.L$7;
                longRef3 = (Ref.LongRef) contactCacheImpl$reloadIfNoCache$1.L$6;
                objectRef4 = (Ref.ObjectRef) contactCacheImpl$reloadIfNoCache$1.L$5;
                objectRef2 = (Ref.ObjectRef) contactCacheImpl$reloadIfNoCache$1.L$4;
                longRef2 = (Ref.LongRef) contactCacheImpl$reloadIfNoCache$1.L$3;
                baseDaoOLrzqt = (BaseDao) contactCacheImpl$reloadIfNoCache$1.L$2;
                str4 = (java.lang.String) contactCacheImpl$reloadIfNoCache$1.L$1;
                sfp2 = (sFP) contactCacheImpl$reloadIfNoCache$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    longRef4 = longRef2;
                    i5 = i3;
                    baseDao2 = baseDaoOLrzqt;
                    i6 = i;
                    t = obj;
                } catch (android.database.sqlite.SQLiteDatabaseLockedException e10) {
                    str3 = str4;
                    sQLiteDatabaseLockedException2 = e10;
                    sQLiteDatabaseLockedException = sQLiteDatabaseLockedException2;
                    sfp3 = sfp2;
                    objectRef3 = objectRef2;
                    int i1222 = i3;
                    longRef4 = longRef2;
                    i5 = i1222;
                    int i1322 = i;
                    baseDao2 = baseDaoOLrzqt;
                    i6 = i1322;
                    r0 = sQLiteDatabaseLockedException;
                    C44159sFm.copydefault(r0, (java.lang.Exception) objectRef3.element);
                    objectRef3.element = r0;
                    if (i4 >= i6 - 1) {
                    }
                    contactCacheImpl$reloadIfNoCache$12 = contactCacheImpl$reloadIfNoCache$13;
                    i2 = i9 + i11;
                    sfp = sfp3;
                    longRef3 = longRef4;
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
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    C44159sFm.EZpvd(baseDaoOLrzqt, longRef2.element);
                    throw th;
                }
                objectRef5.element = t;
                longRef3.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                T t22 = objectRef4.element;
                C44159sFm.EZpvd(baseDao2, longRef4.element);
                contactWithPhoneData = (ContactWithPhoneData) t22;
                if (contactWithPhoneData == null) {
                }
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            longRef2 = longRef;
            baseDaoOLrzqt = baseDao;
        }
    }

    @Override // o.sFK
    public void OLrzqt(@NotNull ContactEntity contactEntity) {
        Intrinsics.checkNotNullParameter(contactEntity, "");
        EZpvd(contactEntity.getContactsId(), contactEntity);
    }

    @Override // o.sFK
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        n_(str);
    }

    public ContactEntity AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (ContactEntity) BuildersKt.runBlocking(this.AEQbTJ, new ContactCacheImpl$getContact$1(this, str, null));
    }

    @Override // o.sFK
    public void copydefault(@NotNull java.lang.String str, @NotNull C44461sQr c44461sQr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c44461sQr, "");
        InHouseIMContactInfoEntity inHouseIMContactInfoEntity = new InHouseIMContactInfoEntity(str, (java.lang.String) null, (ContactRelationType) null, (java.lang.String) null, c44461sQr.OLrzqt(), c44461sQr.copydefault(), c44461sQr.AEQbTJ(), (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (RelationSourceType) null, (RelationPermission) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, 65422, (DefaultConstructorMarker) null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.AEQbTJ), null, null, new ContactCacheImpl$updateContactByDisplayUser$1(this, inHouseIMContactInfoEntity, null), 3, null);
        EZpvd(str, C44169sFw.OLrzqt(inHouseIMContactInfoEntity));
    }

    @Override // o.sFK
    public RelationInfo KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C44157sFk.KWHzl(str)) {
            return copydefault();
        }
        return sSM.AEQbTJ.OLrzqt(AEQbTJ(str));
    }

    @Override // o.sFK
    public RelationInfo copydefault() {
        if (!C44157sFk.gEmmrt().values()) {
            return null;
        }
        com.okinc.okimcore.model.remote.UserInfo userInfoOLrzqt = this.OLrzqt.OLrzqt();
        C44124sEe.imLogCurrentUser$default("getCurrentUserContactInfo, user cache: " + userInfoOLrzqt, null, 2, null);
        if (userInfoOLrzqt == null) {
            return null;
        }
        ContactEntity contactEntity = new ContactEntity();
        contactEntity.setContactsId(C44157sFk.copydefault(C44157sFk.gEmmrt()));
        java.lang.String avatar = userInfoOLrzqt.getAvatar();
        if (avatar == null) {
            avatar = "";
        }
        contactEntity.setAvatar(avatar);
        java.lang.String petname = userInfoOLrzqt.getPetname();
        if (petname == null) {
            petname = "";
        }
        contactEntity.setNickName(petname);
        contactEntity.setEnNickname(userInfoOLrzqt.getEnPetname());
        contactEntity.setRemarkName("");
        contactEntity.setOfficialTagInfo(userInfoOLrzqt.getOfficialTag());
        OLrzqt(contactEntity);
        return sSM.AEQbTJ.OLrzqt(contactEntity);
    }
}
