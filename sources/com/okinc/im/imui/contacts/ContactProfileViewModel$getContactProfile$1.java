package com.okinc.im.imui.contacts;

import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.imui.contacts.ContactProfileViewModel;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus;
import com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.other.GroupRole;
import com.okinc.okimcore.model.other.GroupUserSettingInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import com.okinc.okuser.data.User;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C44157sFk;
import o.C44170sFx;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oDB;
import o.oDP;
import o.oDT;
import o.oDZ;

/* JADX INFO: loaded from: classes8.dex */
public final class ContactProfileViewModel$getContactProfile$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    int label;
    final /* synthetic */ ContactProfileViewModel this$0;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PaymentRequiredStatus.values().length];
            try {
                iArr[PaymentRequiredStatus.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentRequiredStatus.REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactProfileViewModel$getContactProfile$1(ContactProfileViewModel contactProfileViewModel, Continuation<? super ContactProfileViewModel$getContactProfile$1> continuation) {
        super(2, continuation);
        this.this$0 = contactProfileViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContactProfileViewModel$getContactProfile$1 contactProfileViewModel$getContactProfile$1 = new ContactProfileViewModel$getContactProfile$1(this.this$0, continuation);
        contactProfileViewModel$getContactProfile$1.L$0 = obj;
        return contactProfileViewModel$getContactProfile$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContactProfileViewModel$getContactProfile$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x023d A[Catch: all -> 0x0249, TryCatch #0 {all -> 0x0249, blocks: (B:9:0x0031, B:60:0x0177, B:62:0x017b, B:64:0x0181, B:76:0x01af, B:80:0x01c5, B:81:0x01ce, B:83:0x01e5, B:86:0x01f2, B:88:0x01f8, B:90:0x0202, B:94:0x020b, B:96:0x0223, B:100:0x022e, B:72:0x0199, B:73:0x019e, B:68:0x018b, B:12:0x004f, B:41:0x0122, B:43:0x012a, B:46:0x0138, B:50:0x0142, B:52:0x0148, B:54:0x014e, B:56:0x0154, B:15:0x0070, B:37:0x00ee, B:18:0x007f, B:32:0x00c2, B:34:0x00d6, B:21:0x008b, B:28:0x00ad, B:101:0x023d, B:102:0x0248, B:24:0x009a), top: B:117:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad A[Catch: all -> 0x0249, TryCatch #0 {all -> 0x0249, blocks: (B:9:0x0031, B:60:0x0177, B:62:0x017b, B:64:0x0181, B:76:0x01af, B:80:0x01c5, B:81:0x01ce, B:83:0x01e5, B:86:0x01f2, B:88:0x01f8, B:90:0x0202, B:94:0x020b, B:96:0x0223, B:100:0x022e, B:72:0x0199, B:73:0x019e, B:68:0x018b, B:12:0x004f, B:41:0x0122, B:43:0x012a, B:46:0x0138, B:50:0x0142, B:52:0x0148, B:54:0x014e, B:56:0x0154, B:15:0x0070, B:37:0x00ee, B:18:0x007f, B:32:0x00c2, B:34:0x00d6, B:21:0x008b, B:28:0x00ad, B:101:0x023d, B:102:0x0248, B:24:0x009a), top: B:117:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6 A[Catch: all -> 0x0249, TryCatch #0 {all -> 0x0249, blocks: (B:9:0x0031, B:60:0x0177, B:62:0x017b, B:64:0x0181, B:76:0x01af, B:80:0x01c5, B:81:0x01ce, B:83:0x01e5, B:86:0x01f2, B:88:0x01f8, B:90:0x0202, B:94:0x020b, B:96:0x0223, B:100:0x022e, B:72:0x0199, B:73:0x019e, B:68:0x018b, B:12:0x004f, B:41:0x0122, B:43:0x012a, B:46:0x0138, B:50:0x0142, B:52:0x0148, B:54:0x014e, B:56:0x0154, B:15:0x0070, B:37:0x00ee, B:18:0x007f, B:32:0x00c2, B:34:0x00d6, B:21:0x008b, B:28:0x00ad, B:101:0x023d, B:102:0x0248, B:24:0x009a), top: B:117:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012a A[Catch: all -> 0x0249, TryCatch #0 {all -> 0x0249, blocks: (B:9:0x0031, B:60:0x0177, B:62:0x017b, B:64:0x0181, B:76:0x01af, B:80:0x01c5, B:81:0x01ce, B:83:0x01e5, B:86:0x01f2, B:88:0x01f8, B:90:0x0202, B:94:0x020b, B:96:0x0223, B:100:0x022e, B:72:0x0199, B:73:0x019e, B:68:0x018b, B:12:0x004f, B:41:0x0122, B:43:0x012a, B:46:0x0138, B:50:0x0142, B:52:0x0148, B:54:0x014e, B:56:0x0154, B:15:0x0070, B:37:0x00ee, B:18:0x007f, B:32:0x00c2, B:34:0x00d6, B:21:0x008b, B:28:0x00ad, B:101:0x023d, B:102:0x0248, B:24:0x009a), top: B:117:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018b A[Catch: all -> 0x0249, TryCatch #0 {all -> 0x0249, blocks: (B:9:0x0031, B:60:0x0177, B:62:0x017b, B:64:0x0181, B:76:0x01af, B:80:0x01c5, B:81:0x01ce, B:83:0x01e5, B:86:0x01f2, B:88:0x01f8, B:90:0x0202, B:94:0x020b, B:96:0x0223, B:100:0x022e, B:72:0x0199, B:73:0x019e, B:68:0x018b, B:12:0x004f, B:41:0x0122, B:43:0x012a, B:46:0x0138, B:50:0x0142, B:52:0x0148, B:54:0x014e, B:56:0x0154, B:15:0x0070, B:37:0x00ee, B:18:0x007f, B:32:0x00c2, B:34:0x00d6, B:21:0x008b, B:28:0x00ad, B:101:0x023d, B:102:0x0248, B:24:0x009a), top: B:117:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019e A[Catch: all -> 0x0249, TryCatch #0 {all -> 0x0249, blocks: (B:9:0x0031, B:60:0x0177, B:62:0x017b, B:64:0x0181, B:76:0x01af, B:80:0x01c5, B:81:0x01ce, B:83:0x01e5, B:86:0x01f2, B:88:0x01f8, B:90:0x0202, B:94:0x020b, B:96:0x0223, B:100:0x022e, B:72:0x0199, B:73:0x019e, B:68:0x018b, B:12:0x004f, B:41:0x0122, B:43:0x012a, B:46:0x0138, B:50:0x0142, B:52:0x0148, B:54:0x014e, B:56:0x0154, B:15:0x0070, B:37:0x00ee, B:18:0x007f, B:32:0x00c2, B:34:0x00d6, B:21:0x008b, B:28:0x00ad, B:101:0x023d, B:102:0x0248, B:24:0x009a), top: B:117:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e5 A[Catch: all -> 0x0249, TryCatch #0 {all -> 0x0249, blocks: (B:9:0x0031, B:60:0x0177, B:62:0x017b, B:64:0x0181, B:76:0x01af, B:80:0x01c5, B:81:0x01ce, B:83:0x01e5, B:86:0x01f2, B:88:0x01f8, B:90:0x0202, B:94:0x020b, B:96:0x0223, B:100:0x022e, B:72:0x0199, B:73:0x019e, B:68:0x018b, B:12:0x004f, B:41:0x0122, B:43:0x012a, B:46:0x0138, B:50:0x0142, B:52:0x0148, B:54:0x014e, B:56:0x0154, B:15:0x0070, B:37:0x00ee, B:18:0x007f, B:32:0x00c2, B:34:0x00d6, B:21:0x008b, B:28:0x00ad, B:101:0x023d, B:102:0x0248, B:24:0x009a), top: B:117:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        ContactProfileViewModel contactProfileViewModel;
        Object objKWHzl;
        Object objAEQbTJ;
        ContactProfileViewModel contactProfileViewModel2;
        RelationInfo relationInfo;
        boolean zBooleanValue;
        boolean zOLrzqt;
        String strAEQbTJ;
        Object objAEQbTJ2;
        Object objOLrzqt;
        boolean z;
        boolean z2;
        String str;
        GroupInfo groupInfo;
        ContactProfileViewModel contactProfileViewModel3;
        boolean zBooleanValue2;
        Boolean boolKWHzl;
        GroupUserSettingInfo userSettingInfo;
        GroupRole role;
        Object objAEQbTJ3;
        RelationInfo relationInfo2;
        boolean z3;
        boolean z4;
        Pair pairOLrzqt;
        GroupInfo groupInfoEjfBZ;
        User userOLrzqt;
        int i;
        PaidGroupMemberStatus paidGroupMemberStatus;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                contactProfileViewModel = this.this$0;
                Result.Application application2 = Result.Companion;
                String strKWHzl = contactProfileViewModel.KWHzl();
                this.L$0 = contactProfileViewModel;
                this.label = 1;
                objKWHzl = contactProfileViewModel.KWHzl(strKWHzl, (String) null, (Continuation<? super RelationInfo>) this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                if (objKWHzl == null) {
                    RelationInfo relationInfo3 = (RelationInfo) objKWHzl;
                    oDZ odz = contactProfileViewModel.djBIcL;
                    this.L$0 = contactProfileViewModel;
                    this.L$1 = relationInfo3;
                    this.label = 2;
                    objAEQbTJ = odz.AEQbTJ(this);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    contactProfileViewModel2 = contactProfileViewModel;
                    relationInfo = relationInfo3;
                    zBooleanValue = ((Boolean) objAEQbTJ).booleanValue();
                    zOLrzqt = contactProfileViewModel2.OLrzqt(contactProfileViewModel2.KWHzl());
                    strAEQbTJ = contactProfileViewModel2.AEQbTJ();
                    if (strAEQbTJ != null) {
                        oDB odb = contactProfileViewModel2.valueOf;
                        this.L$0 = contactProfileViewModel2;
                        this.L$1 = relationInfo;
                        this.L$2 = strAEQbTJ;
                        this.Z$0 = zOLrzqt;
                        this.Z$1 = zBooleanValue;
                        this.label = 3;
                        objAEQbTJ2 = odb.AEQbTJ(strAEQbTJ, this);
                        if (objAEQbTJ2 == objCopydefault) {
                            return objCopydefault;
                        }
                        GroupInfo groupInfo2 = (GroupInfo) objAEQbTJ2;
                        contactProfileViewModel2.DbNXlk.set("KEY_GROUP_INFO", groupInfo2);
                        oDP odp = contactProfileViewModel2.OLrzqt;
                        String contactsId = relationInfo.getContactsId();
                        this.L$0 = contactProfileViewModel2;
                        this.L$1 = relationInfo;
                        this.L$2 = strAEQbTJ;
                        this.L$3 = groupInfo2;
                        this.Z$0 = zOLrzqt;
                        this.Z$1 = zBooleanValue;
                        this.label = 4;
                        objOLrzqt = odp.OLrzqt(strAEQbTJ, contactsId, this);
                        if (objOLrzqt != objCopydefault) {
                            return objCopydefault;
                        }
                        boolean z5 = zOLrzqt;
                        z = zBooleanValue;
                        z2 = z5;
                        ContactProfileViewModel contactProfileViewModel4 = contactProfileViewModel2;
                        str = strAEQbTJ;
                        groupInfo = groupInfo2;
                        contactProfileViewModel3 = contactProfileViewModel4;
                        zBooleanValue2 = ((Boolean) objOLrzqt).booleanValue();
                        if (groupInfo != null) {
                            Integer type = groupInfo.getType();
                            int value = GroupTagType.PAID_GROUP.getValue();
                            if (type != null && type.intValue() == value && !zBooleanValue2 && (userSettingInfo = groupInfo.getUserSettingInfo()) != null && (role = userSettingInfo.getRole()) != null && C44170sFx.KWHzl(role)) {
                                oDT odt = contactProfileViewModel3.AYXKKw;
                                String contactsId2 = relationInfo.getContactsId();
                                this.L$0 = contactProfileViewModel3;
                                this.L$1 = relationInfo;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.Z$0 = z2;
                                this.Z$1 = z;
                                this.Z$2 = zBooleanValue2;
                                this.label = 5;
                                objAEQbTJ3 = odt.AEQbTJ(str, contactsId2, false, this);
                                if (objAEQbTJ3 == objCopydefault) {
                                    return objCopydefault;
                                }
                                relationInfo2 = relationInfo;
                                z3 = z2;
                                z4 = zBooleanValue2;
                                GroupMemberInfo groupMemberInfo = (GroupMemberInfo) objAEQbTJ3;
                                PaymentRequiredStatus paymentRequiredStatus = (groupMemberInfo != null || (paidGroupMemberStatus = groupMemberInfo.getPaidGroupMemberStatus()) == null) ? null : paidGroupMemberStatus.getPaymentRequiredStatus();
                                i = paymentRequiredStatus != null ? -1 : Application.EZpvd[paymentRequiredStatus.ordinal()];
                                if (i != 1) {
                                    boolKWHzl = C56443yFo.KWHzl(false);
                                } else {
                                    boolKWHzl = i != 2 ? null : C56443yFo.KWHzl(true);
                                }
                                zBooleanValue2 = z4;
                                zBooleanValue = z;
                                zOLrzqt = z3;
                                relationInfo = relationInfo2;
                                contactProfileViewModel2 = contactProfileViewModel3;
                                contactProfileViewModel2.DbNXlk.set("KEY_IS_PAYING_MEMBER", boolKWHzl);
                                pairOLrzqt = C56390yDp.OLrzqt(C56443yFo.KWHzl(zBooleanValue2), boolKWHzl);
                                if (pairOLrzqt == null) {
                                }
                                boolean z6 = zOLrzqt;
                                boolean zBooleanValue3 = ((Boolean) pairOLrzqt.component1()).booleanValue();
                                Boolean bool = (Boolean) pairOLrzqt.component2();
                                groupInfoEjfBZ = contactProfileViewModel2.ejfBZ();
                                if (groupInfoEjfBZ == null) {
                                    Integer type2 = groupInfoEjfBZ.getType();
                                    boolean z7 = type2 != null && type2.intValue() == GroupTagType.RM_VIP_GROUP.getValue() && (userOLrzqt = C44157sFk.gEmmrt().OLrzqt()) != null && userOLrzqt.isVip();
                                    ChatOrigin chatOriginDjBIcL = contactProfileViewModel2.djBIcL();
                                    OKConversation oKConversationDbNXlk = contactProfileViewModel2.DbNXlk();
                                    boolean zIsFriend = relationInfo.isFriend();
                                    List listKWHzl = contactProfileViewModel2.KWHzl(zBooleanValue, relationInfo, z7);
                                    GroupInfo groupInfoEjfBZ2 = contactProfileViewModel2.ejfBZ();
                                    objM7377constructorimpl = Result.m7377constructorimpl(new ContactProfileViewModel.StateListAnimator.Activity(chatOriginDjBIcL, relationInfo, oKConversationDbNXlk, zIsFriend, z6, listKWHzl, zBooleanValue3, bool, groupInfoEjfBZ2 != null && groupInfoEjfBZ2.isAllowRemoveMember(), z7));
                                    ContactProfileViewModel contactProfileViewModel5 = this.this$0;
                                    if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                                        MutableStateFlow mutableStateFlow = contactProfileViewModel5.KWHzl;
                                        ContactProfileViewModel.StateListAnimator.ActionBar actionBar = ContactProfileViewModel.StateListAnimator.ActionBar.OLrzqt;
                                        this.L$0 = objM7377constructorimpl;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.label = 6;
                                        if (mutableStateFlow.emit(actionBar, this) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                    }
                                    ContactProfileViewModel contactProfileViewModel6 = this.this$0;
                                    if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                                        MutableStateFlow mutableStateFlow2 = contactProfileViewModel6.KWHzl;
                                        this.L$0 = objM7377constructorimpl;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.label = 7;
                                        if (mutableStateFlow2.emit((ContactProfileViewModel.StateListAnimator.Activity) objM7377constructorimpl, this) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        boolKWHzl = null;
                        contactProfileViewModel2 = contactProfileViewModel3;
                        boolean z8 = z;
                        zOLrzqt = z2;
                        zBooleanValue = z8;
                        contactProfileViewModel2.DbNXlk.set("KEY_IS_PAYING_MEMBER", boolKWHzl);
                        pairOLrzqt = C56390yDp.OLrzqt(C56443yFo.KWHzl(zBooleanValue2), boolKWHzl);
                        if (pairOLrzqt == null) {
                        }
                        boolean z62 = zOLrzqt;
                        boolean zBooleanValue32 = ((Boolean) pairOLrzqt.component1()).booleanValue();
                        Boolean bool2 = (Boolean) pairOLrzqt.component2();
                        groupInfoEjfBZ = contactProfileViewModel2.ejfBZ();
                        if (groupInfoEjfBZ == null) {
                        }
                        return Unit.INSTANCE;
                    }
                    pairOLrzqt = C56390yDp.OLrzqt(C56443yFo.KWHzl(false), null);
                    boolean z622 = zOLrzqt;
                    boolean zBooleanValue322 = ((Boolean) pairOLrzqt.component1()).booleanValue();
                    Boolean bool22 = (Boolean) pairOLrzqt.component2();
                    groupInfoEjfBZ = contactProfileViewModel2.ejfBZ();
                    if (groupInfoEjfBZ == null) {
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 1:
                contactProfileViewModel = (ContactProfileViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = obj;
                if (objKWHzl == null) {
                }
                break;
            case 2:
                RelationInfo relationInfo4 = (RelationInfo) this.L$1;
                ContactProfileViewModel contactProfileViewModel7 = (ContactProfileViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj;
                relationInfo = relationInfo4;
                contactProfileViewModel2 = contactProfileViewModel7;
                zBooleanValue = ((Boolean) objAEQbTJ).booleanValue();
                zOLrzqt = contactProfileViewModel2.OLrzqt(contactProfileViewModel2.KWHzl());
                strAEQbTJ = contactProfileViewModel2.AEQbTJ();
                if (strAEQbTJ != null) {
                }
                pairOLrzqt = C56390yDp.OLrzqt(C56443yFo.KWHzl(false), null);
                boolean z6222 = zOLrzqt;
                boolean zBooleanValue3222 = ((Boolean) pairOLrzqt.component1()).booleanValue();
                Boolean bool222 = (Boolean) pairOLrzqt.component2();
                groupInfoEjfBZ = contactProfileViewModel2.ejfBZ();
                if (groupInfoEjfBZ == null) {
                }
                return Unit.INSTANCE;
            case 3:
                zBooleanValue = this.Z$1;
                zOLrzqt = this.Z$0;
                strAEQbTJ = (String) this.L$2;
                relationInfo = (RelationInfo) this.L$1;
                contactProfileViewModel2 = (ContactProfileViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ2 = obj;
                GroupInfo groupInfo22 = (GroupInfo) objAEQbTJ2;
                contactProfileViewModel2.DbNXlk.set("KEY_GROUP_INFO", groupInfo22);
                oDP odp2 = contactProfileViewModel2.OLrzqt;
                String contactsId3 = relationInfo.getContactsId();
                this.L$0 = contactProfileViewModel2;
                this.L$1 = relationInfo;
                this.L$2 = strAEQbTJ;
                this.L$3 = groupInfo22;
                this.Z$0 = zOLrzqt;
                this.Z$1 = zBooleanValue;
                this.label = 4;
                objOLrzqt = odp2.OLrzqt(strAEQbTJ, contactsId3, this);
                if (objOLrzqt != objCopydefault) {
                }
                break;
            case 4:
                boolean z9 = this.Z$1;
                boolean z10 = this.Z$0;
                groupInfo = (GroupInfo) this.L$3;
                String str2 = (String) this.L$2;
                RelationInfo relationInfo5 = (RelationInfo) this.L$1;
                contactProfileViewModel3 = (ContactProfileViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj;
                z = z9;
                z2 = z10;
                str = str2;
                relationInfo = relationInfo5;
                zBooleanValue2 = ((Boolean) objOLrzqt).booleanValue();
                if (groupInfo != null) {
                }
                boolKWHzl = null;
                contactProfileViewModel2 = contactProfileViewModel3;
                boolean z82 = z;
                zOLrzqt = z2;
                zBooleanValue = z82;
                contactProfileViewModel2.DbNXlk.set("KEY_IS_PAYING_MEMBER", boolKWHzl);
                pairOLrzqt = C56390yDp.OLrzqt(C56443yFo.KWHzl(zBooleanValue2), boolKWHzl);
                if (pairOLrzqt == null) {
                }
                boolean z62222 = zOLrzqt;
                boolean zBooleanValue32222 = ((Boolean) pairOLrzqt.component1()).booleanValue();
                Boolean bool2222 = (Boolean) pairOLrzqt.component2();
                groupInfoEjfBZ = contactProfileViewModel2.ejfBZ();
                if (groupInfoEjfBZ == null) {
                }
                return Unit.INSTANCE;
            case 5:
                z4 = this.Z$2;
                z = this.Z$1;
                boolean z11 = this.Z$0;
                RelationInfo relationInfo6 = (RelationInfo) this.L$1;
                ContactProfileViewModel contactProfileViewModel8 = (ContactProfileViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                contactProfileViewModel3 = contactProfileViewModel8;
                relationInfo2 = relationInfo6;
                z3 = z11;
                objAEQbTJ3 = obj;
                GroupMemberInfo groupMemberInfo2 = (GroupMemberInfo) objAEQbTJ3;
                if (groupMemberInfo2 != null) {
                    if (paymentRequiredStatus != null) {
                    }
                    if (i != 1) {
                    }
                    zBooleanValue2 = z4;
                    zBooleanValue = z;
                    zOLrzqt = z3;
                    relationInfo = relationInfo2;
                    contactProfileViewModel2 = contactProfileViewModel3;
                    contactProfileViewModel2.DbNXlk.set("KEY_IS_PAYING_MEMBER", boolKWHzl);
                    pairOLrzqt = C56390yDp.OLrzqt(C56443yFo.KWHzl(zBooleanValue2), boolKWHzl);
                    if (pairOLrzqt == null) {
                    }
                    boolean z622222 = zOLrzqt;
                    boolean zBooleanValue322222 = ((Boolean) pairOLrzqt.component1()).booleanValue();
                    Boolean bool22222 = (Boolean) pairOLrzqt.component2();
                    groupInfoEjfBZ = contactProfileViewModel2.ejfBZ();
                    if (groupInfoEjfBZ == null) {
                    }
                }
                return Unit.INSTANCE;
            case 6:
                objM7377constructorimpl = this.L$0;
                C56391yDq.AEQbTJ(obj);
                ContactProfileViewModel contactProfileViewModel62 = this.this$0;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                return Unit.INSTANCE;
            case 7:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
