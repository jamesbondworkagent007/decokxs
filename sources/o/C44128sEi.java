package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$addContact$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$addContactOnChannel$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$deleteContact$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$flowRelationList$$inlined$mapNotNull$1$2$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$flowRelationList$3;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$getBlockContactList$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$getContactInfoFromRemote$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$getCurrentUser$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$getCurrentUserQRCode$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$getNonLoginIMToken$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$getRealContactId$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$getRelationInfo$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$getRelationInfoAsyncById$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$getRelationInfoFlow$$inlined$map$1$2$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$getRelationInfoFromCacheFirst$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$getRelationList$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$getRelationListById$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$getSuggestedList$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$modifyContactInfo$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$preLoadUserInfoFromInHouseIfNecessary$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$queryContactInfoOnChannel$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$queryCurrentUserInfo$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$searchContactByIdOnChannel$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$searchRelationById$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$syncFriendListOnChannel$1;
import com.okinc.okimcore.channel.inhouse.impl.InHouseIMContactImpl$uploadAddOrRemoveContactEvent$1;
import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao;
import com.okinc.okimcore.feature.user.repository.remote.inhouseim.InHouseIMAuthService;
import com.okinc.okimcore.feature.user.repository.remote.inhouseim.InHouseIMUserService;
import com.okinc.okimcore.model.exception.OKIMException;
import com.okinc.okimcore.model.exception.OKIMReportException;
import com.okinc.okimcore.model.im.CacheStrategy;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.inhouseim.ContactRelationType;
import com.okinc.okimcore.model.remote.AddContactReq;
import com.okinc.okimcore.model.remote.BlockContactReq;
import com.okinc.okimcore.model.remote.IMAuthRequest;
import com.okinc.okimcore.model.remote.IMAuthResponse;
import com.okinc.okimcore.model.remote.InHouseUserInfo;
import com.okinc.okimcore.model.remote.InhouseIMQueryMyQRCodeResponse;
import com.okinc.okimcore.model.remote.PhoneNumber;
import com.okinc.okimcore.model.remote.ReferralTasks;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.remote.RemoveContactReq;
import com.okinc.okimcore.model.remote.SearchContactReqV2;
import com.okinc.okimcore.model.remote.SetContactRemarkReq;
import com.okinc.okimcore.model.remote.UpdateSecuritySettingRequest;
import com.okinc.okimcore.model.room.ContactEntity;
import com.okinc.okimcore.model.room.inhouseim.ContactWithPhoneData;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.InterfaceC44178sGe;
import o.sGH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sEi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44128sEi implements InterfaceC44177sGd, sEH {
    public final sIC AEQbTJ;
    public final InHouseIMUserService AYXKKw;
    public final sFU EZpvd;
    public final InHouseIMAuthService KWHzl;
    public final sHU OLrzqt;
    public final sGH copydefault;
    public final CoroutineDispatcher djBIcL;
    public boolean gEmmrt;

    /* JADX INFO: renamed from: o.sEi$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CacheStrategy.values().length];
            try {
                iArr[CacheStrategy.ForceRemote.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CacheStrategy.CacheOnly.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[CacheStrategy.CacheFirst.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    @Override // o.sEH
    public void bp_() {
    }

    @yCM
    public C44128sEi(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull sHU shu, @NotNull sFU sfu, @NotNull InHouseIMUserService inHouseIMUserService, @NotNull InHouseIMAuthService inHouseIMAuthService, @NotNull sIC sic, @NotNull sGH sgh) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(shu, "");
        Intrinsics.checkNotNullParameter(sfu, "");
        Intrinsics.checkNotNullParameter(inHouseIMUserService, "");
        Intrinsics.checkNotNullParameter(inHouseIMAuthService, "");
        Intrinsics.checkNotNullParameter(sic, "");
        Intrinsics.checkNotNullParameter(sgh, "");
        this.djBIcL = coroutineDispatcher;
        this.OLrzqt = shu;
        this.EZpvd = sfu;
        this.AYXKKw = inHouseIMUserService;
        this.KWHzl = inHouseIMAuthService;
        this.AEQbTJ = sic;
        this.copydefault = sgh;
    }

    @Override // o.sEH
    public void bq_() {
        sDZ sdz = sDZ.AEQbTJ;
        if (sdz.uzCIH()) {
            this.gEmmrt = false;
            sdz.copydefault(false);
        }
    }

    @Override // o.InterfaceC44177sGd
    public boolean copydefault() {
        java.lang.String avatar;
        java.lang.String petname;
        com.okinc.okimcore.model.remote.UserInfo userInfoOLrzqt = this.EZpvd.OLrzqt();
        return userInfoOLrzqt != null && ((avatar = userInfoOLrzqt.getAvatar()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) avatar) || (petname = userInfoOLrzqt.getPetname()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) petname));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super IMAuthResponse> continuation) throws java.lang.Throwable {
        InHouseIMContactImpl$getNonLoginIMToken$1 inHouseIMContactImpl$getNonLoginIMToken$1;
        if (continuation instanceof InHouseIMContactImpl$getNonLoginIMToken$1) {
            inHouseIMContactImpl$getNonLoginIMToken$1 = (InHouseIMContactImpl$getNonLoginIMToken$1) continuation;
            int i = inHouseIMContactImpl$getNonLoginIMToken$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactImpl$getNonLoginIMToken$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactImpl$getNonLoginIMToken$1 = new InHouseIMContactImpl$getNonLoginIMToken$1(this, continuation);
            }
        }
        java.lang.Object iMToken = inHouseIMContactImpl$getNonLoginIMToken$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactImpl$getNonLoginIMToken$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(iMToken);
            InHouseIMAuthService inHouseIMAuthService = this.KWHzl;
            IMAuthRequest iMAuthRequest = new IMAuthRequest(str, 0, 0, 6, (DefaultConstructorMarker) null);
            inHouseIMContactImpl$getNonLoginIMToken$1.label = 1;
            iMToken = inHouseIMAuthService.getIMToken(iMAuthRequest, inHouseIMContactImpl$getNonLoginIMToken$1);
            if (iMToken == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(iMToken);
        }
        ResponseData responseData = (ResponseData) iMToken;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            return (IMAuthResponse) responseData.getData();
        }
        throw new OKIMException("Unable to get im token", 0, 2, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: o.sEi$ActionBar */
    public static final class ActionBar implements Flow<RelationInfo> {
        public final /* synthetic */ Flow OLrzqt;

        public ActionBar(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector<? super RelationInfo> flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.sEi$ActionBar$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                InHouseIMContactImpl$getRelationInfoFlow$$inlined$map$1$2$1 inHouseIMContactImpl$getRelationInfoFlow$$inlined$map$1$2$1;
                if (continuation instanceof InHouseIMContactImpl$getRelationInfoFlow$$inlined$map$1$2$1) {
                    inHouseIMContactImpl$getRelationInfoFlow$$inlined$map$1$2$1 = (InHouseIMContactImpl$getRelationInfoFlow$$inlined$map$1$2$1) continuation;
                    int i = inHouseIMContactImpl$getRelationInfoFlow$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        inHouseIMContactImpl$getRelationInfoFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        inHouseIMContactImpl$getRelationInfoFlow$$inlined$map$1$2$1 = new InHouseIMContactImpl$getRelationInfoFlow$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = inHouseIMContactImpl$getRelationInfoFlow$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = inHouseIMContactImpl$getRelationInfoFlow$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    ContactWithPhoneData contactWithPhoneData = (ContactWithPhoneData) obj;
                    RelationInfo relationInfoOLrzqt = sSM.AEQbTJ.OLrzqt(contactWithPhoneData != null ? C44169sFw.EZpvd(contactWithPhoneData) : null);
                    inHouseIMContactImpl$getRelationInfoFlow$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(relationInfoOLrzqt, inHouseIMContactImpl$getRelationInfoFlow$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: o.sEi$TaskDescription */
    public static final class TaskDescription implements Flow<java.util.List<? extends ContactEntity>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ C44128sEi OLrzqt;

        public TaskDescription(Flow flow, C44128sEi c44128sEi) {
            this.AEQbTJ = flow;
            this.OLrzqt = c44128sEi;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector<? super java.util.List<? extends ContactEntity>> flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass2(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.sEi$TaskDescription$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ C44128sEi AEQbTJ;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, C44128sEi c44128sEi) {
                this.copydefault = flowCollector;
                this.AEQbTJ = c44128sEi;
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                InHouseIMContactImpl$flowRelationList$$inlined$mapNotNull$1$2$1 inHouseIMContactImpl$flowRelationList$$inlined$mapNotNull$1$2$1;
                FlowCollector flowCollector;
                java.util.List arrayList;
                FlowCollector flowCollector2;
                if (continuation instanceof InHouseIMContactImpl$flowRelationList$$inlined$mapNotNull$1$2$1) {
                    inHouseIMContactImpl$flowRelationList$$inlined$mapNotNull$1$2$1 = (InHouseIMContactImpl$flowRelationList$$inlined$mapNotNull$1$2$1) continuation;
                    int i = inHouseIMContactImpl$flowRelationList$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        inHouseIMContactImpl$flowRelationList$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        inHouseIMContactImpl$flowRelationList$$inlined$mapNotNull$1$2$1 = new InHouseIMContactImpl$flowRelationList$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = inHouseIMContactImpl$flowRelationList$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = inHouseIMContactImpl$flowRelationList$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = this.copydefault;
                    java.util.List list = (java.util.List) obj;
                    arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C44169sFw.EZpvd((ContactWithPhoneData) it.next()));
                    }
                    if (arrayList.isEmpty()) {
                        C44124sEe.imLogContact$default("flowRelationList: DB Contact List was empty, fetching from API", null, 2, null);
                        C44128sEi c44128sEi = this.AEQbTJ;
                        inHouseIMContactImpl$flowRelationList$$inlined$mapNotNull$1$2$1.L$0 = flowCollector;
                        inHouseIMContactImpl$flowRelationList$$inlined$mapNotNull$1$2$1.label = 1;
                        java.lang.Object objGEmmrt = c44128sEi.gEmmrt(inHouseIMContactImpl$flowRelationList$$inlined$mapNotNull$1$2$1);
                        if (objGEmmrt == objCopydefault) {
                            return objCopydefault;
                        }
                        obj2 = objGEmmrt;
                        flowCollector2 = flowCollector;
                    }
                    if (arrayList != null) {
                        inHouseIMContactImpl$flowRelationList$$inlined$mapNotNull$1$2$1.L$0 = null;
                        inHouseIMContactImpl$flowRelationList$$inlined$mapNotNull$1$2$1.label = 2;
                        if (flowCollector.emit(arrayList, inHouseIMContactImpl$flowRelationList$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                    return Unit.INSTANCE;
                }
                flowCollector2 = (FlowCollector) inHouseIMContactImpl$flowRelationList$$inlined$mapNotNull$1$2$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                arrayList = (java.util.List) obj2;
                flowCollector = flowCollector2;
                if (arrayList != null) {
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44177sGd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(boolean z, @NotNull Continuation<? super com.okinc.okimcore.model.remote.UserInfo> continuation) throws java.lang.Throwable {
        InHouseIMContactImpl$getCurrentUser$1 inHouseIMContactImpl$getCurrentUser$1;
        java.lang.Throwable th;
        C44128sEi c44128sEi;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof InHouseIMContactImpl$getCurrentUser$1) {
            inHouseIMContactImpl$getCurrentUser$1 = (InHouseIMContactImpl$getCurrentUser$1) continuation;
            int i = inHouseIMContactImpl$getCurrentUser$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactImpl$getCurrentUser$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactImpl$getCurrentUser$1 = new InHouseIMContactImpl$getCurrentUser$1(this, continuation);
            }
        }
        java.lang.Object objValueOf = inHouseIMContactImpl$getCurrentUser$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactImpl$getCurrentUser$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objValueOf);
            C44124sEe.imLogCurrentUser$default("Get current user... isLoadCache = " + z, null, 2, null);
            if (z) {
                return this.EZpvd.OLrzqt();
            }
            try {
                Result.Application application = Result.Companion;
                inHouseIMContactImpl$getCurrentUser$1.L$0 = this;
                inHouseIMContactImpl$getCurrentUser$1.label = 1;
                objValueOf = valueOf(inHouseIMContactImpl$getCurrentUser$1);
                if (objValueOf == objCopydefault) {
                    return objCopydefault;
                }
                c44128sEi = this;
            } catch (java.lang.Throwable th2) {
                th = th2;
                c44128sEi = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c44128sEi = (C44128sEi) inHouseIMContactImpl$getCurrentUser$1.L$0;
            try {
                C56391yDq.AEQbTJ(objValueOf);
            } catch (java.lang.Throwable th3) {
                th = th3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((com.okinc.okimcore.model.remote.UserInfo) objValueOf);
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            com.okinc.okimcore.model.remote.UserInfo userInfo = (com.okinc.okimcore.model.remote.UserInfo) objM7377constructorimpl;
            C44124sEe.imLogCurrentUser$default("Load user info from net success: " + C33129mqd.gEmmrt(userInfo), null, 2, null);
            c44128sEi.AEQbTJ(userInfo);
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            java.lang.String str = "Load user info from net failed: uuid: " + C44157sFk.copydefault(C44157sFk.gEmmrt()) + ", message: " + C44157sFk.copydefault(thM7380exceptionOrNullimpl);
            C44124sEe.imLogCurrentUser$default(str, null, 2, null);
            C44170sFx.KWHzl(new OKIMReportException(str));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = c44128sEi.EZpvd.OLrzqt();
        }
        return (com.okinc.okimcore.model.remote.UserInfo) objM7377constructorimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44177sGd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        InHouseIMContactImpl$preLoadUserInfoFromInHouseIfNecessary$1 inHouseIMContactImpl$preLoadUserInfoFromInHouseIfNecessary$1;
        C44128sEi c44128sEi;
        if (continuation instanceof InHouseIMContactImpl$preLoadUserInfoFromInHouseIfNecessary$1) {
            inHouseIMContactImpl$preLoadUserInfoFromInHouseIfNecessary$1 = (InHouseIMContactImpl$preLoadUserInfoFromInHouseIfNecessary$1) continuation;
            int i = inHouseIMContactImpl$preLoadUserInfoFromInHouseIfNecessary$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactImpl$preLoadUserInfoFromInHouseIfNecessary$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactImpl$preLoadUserInfoFromInHouseIfNecessary$1 = new InHouseIMContactImpl$preLoadUserInfoFromInHouseIfNecessary$1(this, continuation);
            }
        }
        java.lang.Object objValueOf = inHouseIMContactImpl$preLoadUserInfoFromInHouseIfNecessary$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactImpl$preLoadUserInfoFromInHouseIfNecessary$1.label;
        boolean z = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objValueOf);
            C44124sEe.imLogCurrentUser$default("preLoadUserInfoFromInHouseIfNecessary => hasReloadedImUserInfo=" + this.gEmmrt, null, 2, null);
            if (!this.gEmmrt) {
                inHouseIMContactImpl$preLoadUserInfoFromInHouseIfNecessary$1.L$0 = this;
                inHouseIMContactImpl$preLoadUserInfoFromInHouseIfNecessary$1.label = 1;
                objValueOf = valueOf(inHouseIMContactImpl$preLoadUserInfoFromInHouseIfNecessary$1);
                if (objValueOf == objCopydefault) {
                    return objCopydefault;
                }
                c44128sEi = this;
            } else {
                z = false;
                return C56443yFo.KWHzl(z);
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c44128sEi = (C44128sEi) inHouseIMContactImpl$preLoadUserInfoFromInHouseIfNecessary$1.L$0;
            C56391yDq.AEQbTJ(objValueOf);
        }
        com.okinc.okimcore.model.remote.UserInfo userInfo = (com.okinc.okimcore.model.remote.UserInfo) objValueOf;
        C44124sEe.imLogCurrentUser$default("preLoadUserInfoFromInHouseIfNecessary => store user info: " + userInfo, null, 2, null);
        c44128sEi.AEQbTJ(userInfo);
        c44128sEi.gEmmrt = true;
        return C56443yFo.KWHzl(z);
    }

    public final void AEQbTJ(@NotNull com.okinc.okimcore.model.remote.UserInfo userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "");
        this.EZpvd.EZpvd(userInfo);
        sFU sfu = this.EZpvd;
        ContactEntity contactEntity = new ContactEntity();
        contactEntity.setContactsId(C44157sFk.copydefault(C44157sFk.gEmmrt()));
        java.lang.String avatar = userInfo.getAvatar();
        if (avatar == null) {
            avatar = "";
        }
        contactEntity.setAvatar(avatar);
        java.lang.String petname = userInfo.getPetname();
        contactEntity.setNickName(petname != null ? petname : "");
        contactEntity.setEnNickname(userInfo.getEnPetname());
        contactEntity.setOfficialTagInfo(userInfo.getOfficialTag());
        sfu.OLrzqt(contactEntity);
    }

    public final sIB EZpvd() {
        return this.AEQbTJ.copydefault();
    }

    public final InHouseIMContactDao AEQbTJ() {
        return EZpvd().OLrzqt();
    }

    @Override // o.InterfaceC44177sGd
    public Flow<java.util.List<RelationInfo>> OLrzqt() throws java.lang.Exception {
        C44124sEe.imLogContact$default("flowRelationList: Retrieve contact list from DB", null, 2, null);
        InHouseIMContactDao inHouseIMContactDaoAEQbTJ = AEQbTJ();
        Ref.LongRef longRef = new Ref.LongRef();
        java.lang.Exception exc = null;
        int i = 0;
        while (i < 3) {
            try {
                long jNanoTime = java.lang.System.nanoTime();
                Flow<java.util.List<ContactWithPhoneData>> flowFlowAllContacts = AEQbTJ().flowAllContacts();
                long jValueOf = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - jNanoTime, DurationUnit.NANOSECONDS));
                longRef.element = jValueOf;
                C44159sFm.EZpvd(inHouseIMContactDaoAEQbTJ, jValueOf);
                return FlowKt.mapLatest(new TaskDescription(FlowKt.distinctUntilChanged(flowFlowAllContacts), this), new InHouseIMContactImpl$flowRelationList$3(this, null));
            } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
                try {
                    C44159sFm.copydefault(e, exc);
                    i++;
                    exc = e;
                } finally {
                    C44159sFm.EZpvd(inHouseIMContactDaoAEQbTJ, longRef.element);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44177sGd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super RelationInfo> continuation) throws java.lang.Throwable {
        InHouseIMContactImpl$getRelationInfoAsyncById$1 inHouseIMContactImpl$getRelationInfoAsyncById$1;
        C44128sEi c44128sEi;
        if (continuation instanceof InHouseIMContactImpl$getRelationInfoAsyncById$1) {
            inHouseIMContactImpl$getRelationInfoAsyncById$1 = (InHouseIMContactImpl$getRelationInfoAsyncById$1) continuation;
            int i = inHouseIMContactImpl$getRelationInfoAsyncById$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactImpl$getRelationInfoAsyncById$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactImpl$getRelationInfoAsyncById$1 = new InHouseIMContactImpl$getRelationInfoAsyncById$1(this, continuation);
            }
        }
        java.lang.Object objDjBIcL = inHouseIMContactImpl$getRelationInfoAsyncById$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactImpl$getRelationInfoAsyncById$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objDjBIcL);
            inHouseIMContactImpl$getRelationInfoAsyncById$1.L$0 = this;
            inHouseIMContactImpl$getRelationInfoAsyncById$1.label = 1;
            objDjBIcL = djBIcL(str, str2, inHouseIMContactImpl$getRelationInfoAsyncById$1);
            if (objDjBIcL == objCopydefault) {
                return objCopydefault;
            }
            c44128sEi = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c44128sEi = (C44128sEi) inHouseIMContactImpl$getRelationInfoAsyncById$1.L$0;
            C56391yDq.AEQbTJ(objDjBIcL);
        }
        ContactEntity contactEntity = (ContactEntity) objDjBIcL;
        c44128sEi.EZpvd.OLrzqt(contactEntity);
        RelationInfo relationInfoOLrzqt = sSM.AEQbTJ.OLrzqt(contactEntity);
        if (relationInfoOLrzqt != null) {
            return relationInfoOLrzqt;
        }
        throw new OKIMException("Contact info is null", -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44177sGd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object valueOf(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<RelationInfo>> continuation) throws java.lang.Throwable {
        InHouseIMContactImpl$searchRelationById$1 inHouseIMContactImpl$searchRelationById$1;
        if (continuation instanceof InHouseIMContactImpl$searchRelationById$1) {
            inHouseIMContactImpl$searchRelationById$1 = (InHouseIMContactImpl$searchRelationById$1) continuation;
            int i = inHouseIMContactImpl$searchRelationById$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactImpl$searchRelationById$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactImpl$searchRelationById$1 = new InHouseIMContactImpl$searchRelationById$1(this, continuation);
            }
        }
        java.lang.Object objGEmmrt = inHouseIMContactImpl$searchRelationById$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactImpl$searchRelationById$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objGEmmrt);
            if (str.length() == 0) {
                throw new OKIMException("uid is empty", -2);
            }
            inHouseIMContactImpl$searchRelationById$1.label = 1;
            objGEmmrt = gEmmrt(str, inHouseIMContactImpl$searchRelationById$1);
            if (objGEmmrt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objGEmmrt);
        }
        java.util.List list = (java.util.List) ((ResponseData) objGEmmrt).getData();
        if (list == null) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            RelationInfo relationInfoOLrzqt = sSM.AEQbTJ.OLrzqt((ContactEntity) it.next());
            if (relationInfoOLrzqt != null) {
                arrayList.add(relationInfoOLrzqt);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44177sGd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super RelationInfo> continuation) throws java.lang.Throwable {
        InHouseIMContactImpl$addContact$1 inHouseIMContactImpl$addContact$1;
        C44128sEi c44128sEi;
        ContactEntity contactEntity;
        RelationInfo relationInfoOLrzqt;
        if (continuation instanceof InHouseIMContactImpl$addContact$1) {
            inHouseIMContactImpl$addContact$1 = (InHouseIMContactImpl$addContact$1) continuation;
            int i = inHouseIMContactImpl$addContact$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactImpl$addContact$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactImpl$addContact$1 = new InHouseIMContactImpl$addContact$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = inHouseIMContactImpl$addContact$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactImpl$addContact$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            inHouseIMContactImpl$addContact$1.L$0 = this;
            inHouseIMContactImpl$addContact$1.L$1 = str;
            inHouseIMContactImpl$addContact$1.label = 1;
            objOLrzqt = OLrzqt(str, str2, inHouseIMContactImpl$addContact$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c44128sEi = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                contactEntity = (ContactEntity) inHouseIMContactImpl$addContact$1.L$1;
                c44128sEi = (C44128sEi) inHouseIMContactImpl$addContact$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                c44128sEi.EZpvd.OLrzqt(contactEntity);
                relationInfoOLrzqt = sSM.AEQbTJ.OLrzqt(contactEntity);
                if (relationInfoOLrzqt == null) {
                    return relationInfoOLrzqt;
                }
                throw new OKIMException("Convert newly added contact failed", -3);
            }
            str = (java.lang.String) inHouseIMContactImpl$addContact$1.L$1;
            c44128sEi = (C44128sEi) inHouseIMContactImpl$addContact$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        ContactEntity contactEntity2 = (ContactEntity) objOLrzqt;
        inHouseIMContactImpl$addContact$1.L$0 = c44128sEi;
        inHouseIMContactImpl$addContact$1.L$1 = contactEntity2;
        inHouseIMContactImpl$addContact$1.label = 2;
        if (c44128sEi.AEQbTJ(true, str, (Continuation<? super Unit>) inHouseIMContactImpl$addContact$1) == objCopydefault) {
            return objCopydefault;
        }
        contactEntity = contactEntity2;
        c44128sEi.EZpvd.OLrzqt(contactEntity);
        relationInfoOLrzqt = sSM.AEQbTJ.OLrzqt(contactEntity);
        if (relationInfoOLrzqt == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44177sGd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        InHouseIMContactImpl$deleteContact$1 inHouseIMContactImpl$deleteContact$1;
        C44128sEi c44128sEi;
        if (continuation instanceof InHouseIMContactImpl$deleteContact$1) {
            inHouseIMContactImpl$deleteContact$1 = (InHouseIMContactImpl$deleteContact$1) continuation;
            int i = inHouseIMContactImpl$deleteContact$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactImpl$deleteContact$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactImpl$deleteContact$1 = new InHouseIMContactImpl$deleteContact$1(this, continuation);
            }
        }
        java.lang.Object obj = inHouseIMContactImpl$deleteContact$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactImpl$deleteContact$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            inHouseIMContactImpl$deleteContact$1.L$0 = this;
            inHouseIMContactImpl$deleteContact$1.L$1 = str;
            inHouseIMContactImpl$deleteContact$1.label = 1;
            if (AEQbTJ(str, inHouseIMContactImpl$deleteContact$1) == objCopydefault) {
                return objCopydefault;
            }
            c44128sEi = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            str = (java.lang.String) inHouseIMContactImpl$deleteContact$1.L$1;
            c44128sEi = (C44128sEi) inHouseIMContactImpl$deleteContact$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        c44128sEi.EZpvd.EZpvd(str);
        inHouseIMContactImpl$deleteContact$1.L$0 = null;
        inHouseIMContactImpl$deleteContact$1.L$1 = null;
        inHouseIMContactImpl$deleteContact$1.label = 2;
        if (c44128sEi.AEQbTJ(false, str, (Continuation<? super Unit>) inHouseIMContactImpl$deleteContact$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(final boolean z, final java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Exception {
        InHouseIMContactImpl$uploadAddOrRemoveContactEvent$1 inHouseIMContactImpl$uploadAddOrRemoveContactEvent$1;
        if (continuation instanceof InHouseIMContactImpl$uploadAddOrRemoveContactEvent$1) {
            inHouseIMContactImpl$uploadAddOrRemoveContactEvent$1 = (InHouseIMContactImpl$uploadAddOrRemoveContactEvent$1) continuation;
            int i = inHouseIMContactImpl$uploadAddOrRemoveContactEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactImpl$uploadAddOrRemoveContactEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactImpl$uploadAddOrRemoveContactEvent$1 = new InHouseIMContactImpl$uploadAddOrRemoveContactEvent$1(this, continuation);
            }
        }
        java.lang.Object objFirstOrNull = inHouseIMContactImpl$uploadAddOrRemoveContactEvent$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactImpl$uploadAddOrRemoveContactEvent$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objFirstOrNull);
            Flow<java.util.List<RelationInfo>> flowOLrzqt = OLrzqt();
            inHouseIMContactImpl$uploadAddOrRemoveContactEvent$1.L$0 = str;
            inHouseIMContactImpl$uploadAddOrRemoveContactEvent$1.Z$0 = z;
            inHouseIMContactImpl$uploadAddOrRemoveContactEvent$1.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowOLrzqt, inHouseIMContactImpl$uploadAddOrRemoveContactEvent$1);
            if (objFirstOrNull == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = inHouseIMContactImpl$uploadAddOrRemoveContactEvent$1.Z$0;
            str = (java.lang.String) inHouseIMContactImpl$uploadAddOrRemoveContactEvent$1.L$0;
            C56391yDq.AEQbTJ(objFirstOrNull);
        }
        final java.util.List list = (java.util.List) objFirstOrNull;
        if (list != null) {
            C32866mlf.EZpvd("app_okim_add_remove_contacts", new TrackChannel[]{TrackChannel.All}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.sEk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C44128sEi.copydefault(z, list, str, (EventParamsList) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(boolean z, java.util.List list, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String strCopydefault = C44157sFk.copydefault(C44157sFk.gEmmrt());
        java.lang.String str2 = z ? "add" : "remove";
        int size = list.size();
        eventParamsList.put(OtcExtraKeys.OPERATOR_ID, strCopydefault, false);
        eventParamsList.put("operationType", str2, true);
        eventParamsList.put("targetId", str, false);
        eventParamsList.put("contactsCount", java.lang.String.valueOf(size), false);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Duplicate block (B:103:0x027c) to fix multi-entry loop: BACK_EDGE: B:103:0x027c -> B:104:0x0285 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:124:0x0285 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:16:0x005c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x00b0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:25:0x00b3 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:27:0x00b6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:78:0x0215 */
    /* JADX DEBUG: Type inference failed for r0v29. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r0v39. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r14v3. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0166 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0228 A[Catch: all -> 0x005c, TryCatch #13 {all -> 0x005c, blocks: (B:14:0x004c, B:82:0x021b, B:83:0x021e, B:86:0x0222, B:88:0x0228, B:90:0x0234, B:91:0x0237, B:92:0x0238, B:93:0x023b), top: B:117:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0252 A[Catch: all -> 0x0292, TRY_LEAVE, TryCatch #10 {all -> 0x0292, blocks: (B:97:0x0245, B:99:0x0252), top: B:115:0x0245 }] */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, android.database.sqlite.SQLiteDatabaseLockedException] */
    /* JADX WARN: Type inference failed for: r0v21, types: [T] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v17, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v7, types: [kotlin.jvm.internal.Ref$LongRef] */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, int i, java.lang.String str2, java.lang.Boolean bool, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        InHouseIMContactImpl$modifyContactInfo$1 inHouseIMContactImpl$modifyContactInfo$1;
        ?? r10;
        BaseDao baseDaoAEQbTJ;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Boolean bool2;
        int i2;
        C44128sEi c44128sEi;
        Ref.ObjectRef objectRef;
        java.lang.String str5;
        int i3;
        int i4;
        java.lang.String str6;
        BaseDao baseDao;
        ?? r12;
        java.lang.Exception e;
        java.lang.IllegalStateException e2;
        java.lang.String message;
        java.lang.String str7;
        C44128sEi c44128sEi2;
        ?? r102;
        BaseDao baseDao2;
        int i5;
        Ref.ObjectRef objectRef2;
        int i6;
        int i7;
        ?? r0;
        int i8;
        int i9;
        ?? r3;
        C44128sEi c44128sEi3;
        int i10;
        int i11;
        java.lang.String str8;
        ?? r14;
        Ref.ObjectRef objectRef3;
        ?? r122;
        InHouseIMContactImpl$modifyContactInfo$1 inHouseIMContactImpl$modifyContactInfo$12;
        Ref.ObjectRef objectRef4;
        int i12;
        Ref.ObjectRef objectRef5;
        BaseDao baseDao3;
        java.lang.String str9;
        long j;
        ?? r02;
        ContactWithPhoneData contactWithPhoneData;
        ContactEntity contactEntityEZpvd;
        java.lang.String nickName;
        int i13;
        if (!(continuation instanceof InHouseIMContactImpl$modifyContactInfo$1) || ( = (i13 = (inHouseIMContactImpl$modifyContactInfo$1 = (InHouseIMContactImpl$modifyContactInfo$1) continuation).label) & Integer.MIN_VALUE) == 0) {
            inHouseIMContactImpl$modifyContactInfo$1 = new InHouseIMContactImpl$modifyContactInfo$1(this, continuation);
        } else {
            inHouseIMContactImpl$modifyContactInfo$1.label = i13 - Integer.MIN_VALUE;
        }
        InHouseIMContactImpl$modifyContactInfo$1 inHouseIMContactImpl$modifyContactInfo$13 = inHouseIMContactImpl$modifyContactInfo$1;
        java.lang.Object obj = inHouseIMContactImpl$modifyContactInfo$13.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i14 = inHouseIMContactImpl$modifyContactInfo$13.label;
        try {
            if (i14 == 0) {
                C56391yDq.AEQbTJ(obj);
                inHouseIMContactImpl$modifyContactInfo$13.L$0 = this;
                str3 = str;
                inHouseIMContactImpl$modifyContactInfo$13.L$1 = str3;
                str4 = str2;
                inHouseIMContactImpl$modifyContactInfo$13.L$2 = str4;
                bool2 = bool;
                inHouseIMContactImpl$modifyContactInfo$13.L$3 = bool2;
                i2 = i;
                inHouseIMContactImpl$modifyContactInfo$13.I$0 = i2;
                inHouseIMContactImpl$modifyContactInfo$13.label = 1;
                if (OLrzqt(str, i, str2, bool, inHouseIMContactImpl$modifyContactInfo$13) == objCopydefault) {
                    return objCopydefault;
                }
                c44128sEi = this;
            } else {
                if (i14 != 1) {
                    if (i14 == 2) {
                        long j2 = inHouseIMContactImpl$modifyContactInfo$13.J$0;
                        int i15 = inHouseIMContactImpl$modifyContactInfo$13.I$2;
                        int i16 = inHouseIMContactImpl$modifyContactInfo$13.I$1;
                        int i17 = inHouseIMContactImpl$modifyContactInfo$13.I$0;
                        Ref.ObjectRef objectRef6 = (Ref.ObjectRef) inHouseIMContactImpl$modifyContactInfo$13.L$8;
                        Ref.LongRef longRef = (Ref.LongRef) inHouseIMContactImpl$modifyContactInfo$13.L$7;
                        Ref.ObjectRef objectRef7 = (Ref.ObjectRef) inHouseIMContactImpl$modifyContactInfo$13.L$6;
                        Ref.ObjectRef objectRef8 = (Ref.ObjectRef) inHouseIMContactImpl$modifyContactInfo$13.L$5;
                        r12 = (Ref.LongRef) inHouseIMContactImpl$modifyContactInfo$13.L$4;
                        baseDao = (BaseDao) inHouseIMContactImpl$modifyContactInfo$13.L$3;
                        str5 = (java.lang.String) inHouseIMContactImpl$modifyContactInfo$13.L$2;
                        java.lang.String str10 = (java.lang.String) inHouseIMContactImpl$modifyContactInfo$13.L$1;
                        C44128sEi c44128sEi4 = (C44128sEi) inHouseIMContactImpl$modifyContactInfo$13.L$0;
                        try {
                            C56391yDq.AEQbTJ(obj);
                            str9 = str10;
                            c44128sEi = c44128sEi4;
                            j = j2;
                            i11 = i15;
                            i10 = i16;
                            baseDao3 = baseDao;
                            r14 = r12;
                            r122 = longRef;
                            objectRef4 = objectRef6;
                            objectRef5 = objectRef7;
                            str8 = str5;
                            objectRef3 = objectRef8;
                            inHouseIMContactImpl$modifyContactInfo$12 = inHouseIMContactImpl$modifyContactInfo$13;
                            i12 = i17;
                            r02 = obj;
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e3) {
                            str7 = str10;
                            i7 = i16;
                            r102 = r12;
                            i5 = i15;
                            objectRef2 = objectRef8;
                            c44128sEi2 = c44128sEi4;
                            i6 = i17;
                            baseDao2 = baseDao;
                            r0 = e3;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i5 < i6 - 1) {
                                inHouseIMContactImpl$modifyContactInfo$13.L$0 = c44128sEi2;
                                inHouseIMContactImpl$modifyContactInfo$13.L$1 = str7;
                                inHouseIMContactImpl$modifyContactInfo$13.L$2 = str5;
                                inHouseIMContactImpl$modifyContactInfo$13.L$3 = baseDao2;
                                inHouseIMContactImpl$modifyContactInfo$13.L$4 = r102;
                                inHouseIMContactImpl$modifyContactInfo$13.L$5 = objectRef2;
                                inHouseIMContactImpl$modifyContactInfo$13.L$6 = null;
                                inHouseIMContactImpl$modifyContactInfo$13.L$7 = null;
                                inHouseIMContactImpl$modifyContactInfo$13.L$8 = null;
                                inHouseIMContactImpl$modifyContactInfo$13.I$0 = i6;
                                inHouseIMContactImpl$modifyContactInfo$13.I$1 = i7;
                                inHouseIMContactImpl$modifyContactInfo$13.label = 3;
                                if (DelayKt.delay(((long) (i5 + 1)) * 50, inHouseIMContactImpl$modifyContactInfo$13) == objCopydefault) {
                                    return objCopydefault;
                                }
                                i8 = i6;
                                str6 = str7;
                                i9 = 1;
                                C44128sEi c44128sEi5 = c44128sEi2;
                                objectRef = objectRef2;
                                r3 = r102;
                                c44128sEi3 = c44128sEi5;
                            } else {
                                i8 = i6;
                                str6 = str7;
                                i9 = 1;
                                C44128sEi c44128sEi6 = c44128sEi2;
                                objectRef = objectRef2;
                                r3 = r102;
                                c44128sEi3 = c44128sEi6;
                            }
                            i4 = i8;
                            ?? r20 = r3;
                            i3 = i7 + i9;
                            baseDaoAEQbTJ = baseDao2;
                            c44128sEi = c44128sEi3;
                            r10 = r20;
                            if (i3 < i4) {
                            }
                        } catch (java.lang.IllegalStateException e4) {
                            e2 = e4;
                            message = e2.getMessage();
                            if (message == null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "not open", false, 2, (java.lang.Object) null)) {
                                C44159sFm.OLrzqt(e2);
                                throw e2;
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e5) {
                            e = e5;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            r10 = r12;
                            baseDaoAEQbTJ = baseDao;
                            C44159sFm.EZpvd(baseDaoAEQbTJ, r10.element);
                            throw th;
                        }
                        objectRef4.element = r02;
                        r122.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                        java.lang.Object obj2 = objectRef5.element;
                        C44159sFm.EZpvd(baseDao3, r14.element);
                        contactWithPhoneData = (ContactWithPhoneData) obj2;
                        if (contactWithPhoneData != null) {
                            c44128sEi.EZpvd.OLrzqt(contactEntityEZpvd);
                            nickName = contactEntityEZpvd.getNickName();
                            if (str8 != null) {
                                str8 = nickName;
                                c44128sEi.OLrzqt(str8, str9);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i14 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i7 = inHouseIMContactImpl$modifyContactInfo$13.I$1;
                    int i18 = inHouseIMContactImpl$modifyContactInfo$13.I$0;
                    Ref.ObjectRef objectRef9 = (Ref.ObjectRef) inHouseIMContactImpl$modifyContactInfo$13.L$5;
                    Ref.LongRef longRef2 = (Ref.LongRef) inHouseIMContactImpl$modifyContactInfo$13.L$4;
                    baseDao2 = (BaseDao) inHouseIMContactImpl$modifyContactInfo$13.L$3;
                    java.lang.String str11 = (java.lang.String) inHouseIMContactImpl$modifyContactInfo$13.L$2;
                    java.lang.String str12 = (java.lang.String) inHouseIMContactImpl$modifyContactInfo$13.L$1;
                    c44128sEi3 = (C44128sEi) inHouseIMContactImpl$modifyContactInfo$13.L$0;
                    C56391yDq.AEQbTJ(obj);
                    i8 = i18;
                    str6 = str12;
                    objectRef = objectRef9;
                    r3 = longRef2;
                    str5 = str11;
                    i9 = 1;
                    i4 = i8;
                    ?? r202 = r3;
                    i3 = i7 + i9;
                    baseDaoAEQbTJ = baseDao2;
                    c44128sEi = c44128sEi3;
                    r10 = r202;
                    if (i3 < i4) {
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                            try {
                                C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                                objectRef2.element = r0;
                                if (i5 < i6 - 1) {
                                }
                                i4 = i8;
                                ?? r2022 = r3;
                                i3 = i7 + i9;
                                baseDaoAEQbTJ = baseDao2;
                                c44128sEi = c44128sEi3;
                                r10 = r2022;
                                if (i3 < i4) {
                                }
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                ?? r4 = r102;
                                r10 = r4;
                                baseDaoAEQbTJ = baseDao2;
                                C44159sFm.EZpvd(baseDaoAEQbTJ, r10.element);
                                throw th;
                            }
                            str7 = str6;
                            i6 = i4;
                            i5 = i3;
                            objectRef2 = objectRef;
                            c44128sEi2 = c44128sEi;
                            baseDao2 = baseDaoAEQbTJ;
                            i7 = i5;
                            r0 = e6;
                            r102 = r10;
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
                            C44159sFm.EZpvd(baseDaoAEQbTJ, r10.element);
                            throw th;
                        }
                        objectRef5 = new Ref.ObjectRef();
                        long jNanoTime = java.lang.System.nanoTime();
                        InHouseIMContactDao inHouseIMContactDaoAEQbTJ = c44128sEi.AEQbTJ();
                        inHouseIMContactImpl$modifyContactInfo$13.L$0 = c44128sEi;
                        inHouseIMContactImpl$modifyContactInfo$13.L$1 = str6;
                        inHouseIMContactImpl$modifyContactInfo$13.L$2 = str5;
                        inHouseIMContactImpl$modifyContactInfo$13.L$3 = baseDaoAEQbTJ;
                        inHouseIMContactImpl$modifyContactInfo$13.L$4 = r10;
                        inHouseIMContactImpl$modifyContactInfo$13.L$5 = objectRef;
                        inHouseIMContactImpl$modifyContactInfo$13.L$6 = objectRef5;
                        inHouseIMContactImpl$modifyContactInfo$13.L$7 = r10;
                        inHouseIMContactImpl$modifyContactInfo$13.L$8 = objectRef5;
                        inHouseIMContactImpl$modifyContactInfo$13.I$0 = i4;
                        inHouseIMContactImpl$modifyContactInfo$13.I$1 = i3;
                        inHouseIMContactImpl$modifyContactInfo$13.I$2 = i3;
                        inHouseIMContactImpl$modifyContactInfo$13.J$0 = jNanoTime;
                        inHouseIMContactImpl$modifyContactInfo$13.label = 2;
                        java.lang.Object contactById = inHouseIMContactDaoAEQbTJ.getContactById(str6, inHouseIMContactImpl$modifyContactInfo$13);
                        if (contactById == objCopydefault) {
                            return objCopydefault;
                        }
                        i11 = i3;
                        i10 = i11;
                        ?? r123 = r10;
                        str9 = str6;
                        objectRef4 = objectRef5;
                        int i19 = i4;
                        baseDao3 = baseDaoAEQbTJ;
                        j = jNanoTime;
                        r14 = r123;
                        str8 = str5;
                        objectRef3 = objectRef;
                        inHouseIMContactImpl$modifyContactInfo$12 = inHouseIMContactImpl$modifyContactInfo$13;
                        i12 = i19;
                        r02 = contactById;
                        r122 = r123;
                        try {
                        } catch (android.database.sqlite.SQLiteDatabaseLockedException e9) {
                            i7 = i10;
                            i6 = i12;
                            inHouseIMContactImpl$modifyContactInfo$13 = inHouseIMContactImpl$modifyContactInfo$12;
                            r102 = r14;
                            c44128sEi2 = c44128sEi;
                            baseDao2 = baseDao3;
                            i5 = i11;
                            java.lang.String str13 = str8;
                            str7 = str9;
                            objectRef2 = objectRef3;
                            str5 = str13;
                            r0 = e9;
                            C44159sFm.copydefault(r0, (java.lang.Exception) objectRef2.element);
                            objectRef2.element = r0;
                            if (i5 < i6 - 1) {
                            }
                            i4 = i8;
                            ?? r20222 = r3;
                            i3 = i7 + i9;
                            baseDaoAEQbTJ = baseDao2;
                            c44128sEi = c44128sEi3;
                            r10 = r20222;
                            if (i3 < i4) {
                            }
                        } catch (java.lang.IllegalStateException e10) {
                            e2 = e10;
                            r12 = r14;
                            baseDao = baseDao3;
                            message = e2.getMessage();
                            if (message == null) {
                            }
                            C44159sFm.copydefault(e2);
                            throw e2;
                        } catch (java.lang.Exception e11) {
                            e = e11;
                            r12 = r14;
                            baseDao = baseDao3;
                            C44159sFm.OLrzqt(e);
                            throw e;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            r12 = r14;
                            baseDao = baseDao3;
                            r10 = r12;
                            baseDaoAEQbTJ = baseDao;
                            C44159sFm.EZpvd(baseDaoAEQbTJ, r10.element);
                            throw th;
                        }
                        objectRef4.element = r02;
                        r122.element = C59462zhW.valueOf(C59519zia.AEQbTJ(java.lang.System.nanoTime() - j, DurationUnit.NANOSECONDS));
                        java.lang.Object obj22 = objectRef5.element;
                        C44159sFm.EZpvd(baseDao3, r14.element);
                        contactWithPhoneData = (ContactWithPhoneData) obj22;
                        if (contactWithPhoneData != null && (contactEntityEZpvd = C44169sFw.EZpvd(contactWithPhoneData)) != null) {
                            c44128sEi.EZpvd.OLrzqt(contactEntityEZpvd);
                            nickName = contactEntityEZpvd.getNickName();
                            if (str8 != null || str8.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str8)) {
                                str8 = nickName;
                            }
                            c44128sEi.OLrzqt(str8, str9);
                        }
                        return Unit.INSTANCE;
                    }
                    C44159sFm.EZpvd(baseDaoAEQbTJ, r10.element);
                    java.lang.Exception exc = (java.lang.Exception) objectRef.element;
                    if (exc == null) {
                        exc = new java.lang.Exception("Database Operation failed after " + i4 + " attempts");
                    }
                    C44159sFm.OLrzqt(exc);
                    throw exc;
                }
                int i20 = inHouseIMContactImpl$modifyContactInfo$13.I$0;
                java.lang.Boolean bool3 = (java.lang.Boolean) inHouseIMContactImpl$modifyContactInfo$13.L$3;
                java.lang.String str14 = (java.lang.String) inHouseIMContactImpl$modifyContactInfo$13.L$2;
                java.lang.String str15 = (java.lang.String) inHouseIMContactImpl$modifyContactInfo$13.L$1;
                c44128sEi = (C44128sEi) inHouseIMContactImpl$modifyContactInfo$13.L$0;
                C56391yDq.AEQbTJ(obj);
                i2 = i20;
                bool2 = bool3;
                str4 = str14;
                str3 = str15;
            }
            C44124sEe.imLogContact$default("modifyContactInfo: [contactId=" + str3 + "], [operateType=" + i2 + "], [remarkName=" + str4 + "], [isEnable=" + bool2 + "]", null, 2, null);
            if (i2 == 1) {
                baseDaoAEQbTJ = c44128sEi.AEQbTJ();
                Ref.LongRef longRef3 = new Ref.LongRef();
                objectRef = new Ref.ObjectRef();
                str5 = str4;
                i3 = 0;
                i4 = 3;
                r10 = longRef3;
                str6 = str3;
                if (i3 < i4) {
                }
            } else {
                if (i2 != 2 && i2 != 3 && i2 != 4) {
                    C44124sEe.imLogContact$default("modifyContactInfo: Unknown operation type", null, 2, null);
                }
                return Unit.INSTANCE;
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
        }
    }

    public final void OLrzqt(java.lang.String str, @NotNull java.lang.String str2) {
        OKConversation oKConversationCopydefault;
        Intrinsics.checkNotNullParameter(str2, "");
        if (str == null || (oKConversationCopydefault = this.EZpvd.copydefault(str2)) == null || oKConversationCopydefault.getConversationType() != OKConversationType.PRIVATE) {
            return;
        }
        oKConversationCopydefault.setConversationTitle(str);
        this.EZpvd.AEQbTJ(oKConversationCopydefault);
        sGH.Application.refreshConversation$default(this.copydefault, null, oKConversationCopydefault, 1, null);
    }

    @Override // o.InterfaceC44177sGd
    public java.lang.Object AYXKKw(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        java.lang.Object objAEQbTJ = AEQbTJ(str, 1, str2, null, continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }

    @Override // o.InterfaceC44177sGd
    public java.lang.Object EZpvd(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Unit> continuation) throws java.lang.Exception {
        java.lang.Object objAEQbTJ = AEQbTJ(str, 4, null, C56443yFo.KWHzl(z), continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object valueOf(@NotNull Continuation<? super com.okinc.okimcore.model.remote.UserInfo> continuation) throws java.lang.Throwable {
        InHouseIMContactImpl$queryCurrentUserInfo$1 inHouseIMContactImpl$queryCurrentUserInfo$1;
        if (continuation instanceof InHouseIMContactImpl$queryCurrentUserInfo$1) {
            inHouseIMContactImpl$queryCurrentUserInfo$1 = (InHouseIMContactImpl$queryCurrentUserInfo$1) continuation;
            int i = inHouseIMContactImpl$queryCurrentUserInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactImpl$queryCurrentUserInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactImpl$queryCurrentUserInfo$1 = new InHouseIMContactImpl$queryCurrentUserInfo$1(this, continuation);
            }
        }
        java.lang.Object currentUserInfo = inHouseIMContactImpl$queryCurrentUserInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactImpl$queryCurrentUserInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(currentUserInfo);
            InHouseIMUserService inHouseIMUserService = this.AYXKKw;
            inHouseIMContactImpl$queryCurrentUserInfo$1.label = 1;
            currentUserInfo = inHouseIMUserService.getCurrentUserInfo(inHouseIMContactImpl$queryCurrentUserInfo$1);
            if (currentUserInfo == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(currentUserInfo);
        }
        ResponseData responseData = (ResponseData) currentUserInfo;
        InHouseUserInfo inHouseUserInfo = (InHouseUserInfo) responseData.getData();
        if (responseData.getCode() == 0 && responseData.getData() != null && inHouseUserInfo != null) {
            com.okinc.okimcore.model.remote.UserInfo userInfoKWHzl = C44169sFw.KWHzl(inHouseUserInfo);
            return userInfoKWHzl.copy((524287 & 1) != 0 ? userInfoKWHzl.identifyId : null, (524287 & 2) != 0 ? userInfoKWHzl.avatar : null, (524287 & 4) != 0 ? userInfoKWHzl.avatarStatus : null, (524287 & 8) != 0 ? userInfoKWHzl.petname : null, (524287 & 16) != 0 ? userInfoKWHzl.enPetname : null, (524287 & 32) != 0 ? userInfoKWHzl.rcToken : null, (524287 & 64) != 0 ? userInfoKWHzl.sign : null, (524287 & 128) != 0 ? userInfoKWHzl.phoneSearchStatus : null, (524287 & 256) != 0 ? userInfoKWHzl.qrSearchStatus : null, (524287 & 512) != 0 ? userInfoKWHzl.petnameSearchStatus : null, (524287 & 1024) != 0 ? userInfoKWHzl.groupStatus : Intrinsics.EZpvd((java.lang.Object) userInfoKWHzl.getGroupStatus(), (java.lang.Object) "1") ? "0" : "1", (524287 & 2048) != 0 ? userInfoKWHzl.allowContactDiscovery : Intrinsics.EZpvd((java.lang.Object) userInfoKWHzl.getAllowContactDiscovery(), (java.lang.Object) "1") ? "0" : "1", (524287 & 4096) != 0 ? userInfoKWHzl.timestamp : null, (524287 & 8192) != 0 ? userInfoKWHzl.officialTag : null, (524287 & 16384) != 0 ? userInfoKWHzl.allowGenerateQrCode : null, (524287 & 32768) != 0 ? userInfoKWHzl.allowCreateGroup : null, (524287 & 65536) != 0 ? userInfoKWHzl.allowSearchUuid : null, (524287 & 131072) != 0 ? userInfoKWHzl.phoneSyncQuota : null, (524287 & 262144) != 0 ? userInfoKWHzl.allowInAppNotification : null, (524287 & 524288) != 0 ? userInfoKWHzl.allowChatViaProfile : null);
        }
        throw new OKIMException("Unable to preload user info", 0, 2, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c A[LOOP:1: B:47:0x0106->B:49:0x010c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44177sGd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object gEmmrt(@NotNull Continuation<? super java.util.List<ContactEntity>> continuation) throws java.lang.Throwable {
        InHouseIMContactImpl$syncFriendListOnChannel$1 inHouseIMContactImpl$syncFriendListOnChannel$1;
        java.lang.String strKWHzl;
        C44128sEi c44128sEi;
        C44128sEi c44128sEi2;
        InterfaceC44178sGe interfaceC44178sGeAEQbTJ;
        java.util.List<? extends ContactRelationType> listEZpvd;
        InterfaceC44178sGe interfaceC44178sGeAEQbTJ2;
        java.util.List<? extends ContactRelationType> listGEmmrt;
        C44128sEi c44128sEi3;
        java.util.Iterator it;
        if (continuation instanceof InHouseIMContactImpl$syncFriendListOnChannel$1) {
            inHouseIMContactImpl$syncFriendListOnChannel$1 = (InHouseIMContactImpl$syncFriendListOnChannel$1) continuation;
            int i = inHouseIMContactImpl$syncFriendListOnChannel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactImpl$syncFriendListOnChannel$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactImpl$syncFriendListOnChannel$1 = new InHouseIMContactImpl$syncFriendListOnChannel$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = inHouseIMContactImpl$syncFriendListOnChannel$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactImpl$syncFriendListOnChannel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            strKWHzl = C44157sFk.KWHzl();
            if (strKWHzl != null) {
                InterfaceC44178sGe interfaceC44178sGeAEQbTJ3 = this.OLrzqt.AEQbTJ();
                inHouseIMContactImpl$syncFriendListOnChannel$1.L$0 = this;
                inHouseIMContactImpl$syncFriendListOnChannel$1.L$1 = strKWHzl;
                inHouseIMContactImpl$syncFriendListOnChannel$1.label = 1;
                if (interfaceC44178sGeAEQbTJ3.EZpvd(strKWHzl, false, null, inHouseIMContactImpl$syncFriendListOnChannel$1) == objCopydefault) {
                    return objCopydefault;
                }
                c44128sEi2 = this;
            } else {
                c44128sEi = this;
                interfaceC44178sGeAEQbTJ = c44128sEi.OLrzqt.AEQbTJ();
                listEZpvd = C56402yEa.EZpvd(ContactRelationType.STRANGER);
                inHouseIMContactImpl$syncFriendListOnChannel$1.L$0 = c44128sEi;
                inHouseIMContactImpl$syncFriendListOnChannel$1.L$1 = null;
                inHouseIMContactImpl$syncFriendListOnChannel$1.label = 2;
                if (interfaceC44178sGeAEQbTJ.AEQbTJ(listEZpvd, inHouseIMContactImpl$syncFriendListOnChannel$1) == objCopydefault) {
                    return objCopydefault;
                }
                interfaceC44178sGeAEQbTJ2 = c44128sEi.OLrzqt.AEQbTJ();
                listGEmmrt = yDY.gEmmrt(ContactRelationType.ONE_WAY, ContactRelationType.TWO_WAY);
                inHouseIMContactImpl$syncFriendListOnChannel$1.L$0 = c44128sEi;
                inHouseIMContactImpl$syncFriendListOnChannel$1.label = 3;
                if (interfaceC44178sGeAEQbTJ2.copydefault(listGEmmrt, inHouseIMContactImpl$syncFriendListOnChannel$1) == objCopydefault) {
                }
                InterfaceC44178sGe interfaceC44178sGeAEQbTJ4 = c44128sEi.OLrzqt.AEQbTJ();
                inHouseIMContactImpl$syncFriendListOnChannel$1.L$0 = c44128sEi;
                inHouseIMContactImpl$syncFriendListOnChannel$1.label = 4;
                objEZpvd = interfaceC44178sGeAEQbTJ4.EZpvd(inHouseIMContactImpl$syncFriendListOnChannel$1);
                if (objEZpvd != objCopydefault) {
                }
            }
        } else if (i2 == 1) {
            strKWHzl = (java.lang.String) inHouseIMContactImpl$syncFriendListOnChannel$1.L$1;
            c44128sEi2 = (C44128sEi) inHouseIMContactImpl$syncFriendListOnChannel$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    c44128sEi = (C44128sEi) inHouseIMContactImpl$syncFriendListOnChannel$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    InterfaceC44178sGe interfaceC44178sGeAEQbTJ42 = c44128sEi.OLrzqt.AEQbTJ();
                    inHouseIMContactImpl$syncFriendListOnChannel$1.L$0 = c44128sEi;
                    inHouseIMContactImpl$syncFriendListOnChannel$1.label = 4;
                    objEZpvd = interfaceC44178sGeAEQbTJ42.EZpvd(inHouseIMContactImpl$syncFriendListOnChannel$1);
                    if (objEZpvd != objCopydefault) {
                        return objCopydefault;
                    }
                    c44128sEi3 = c44128sEi;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (r9.hasNext()) {
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                    }
                    return arrayList2;
                }
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c44128sEi3 = (C44128sEi) inHouseIMContactImpl$syncFriendListOnChannel$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj : (java.lang.Iterable) objEZpvd) {
                    ContactWithPhoneData contactWithPhoneData = (ContactWithPhoneData) obj;
                    if (contactWithPhoneData.getRelationType() == ContactRelationType.ONE_WAY || contactWithPhoneData.getRelationType() == ContactRelationType.TWO_WAY) {
                        arrayList3.add(obj);
                    }
                }
                java.util.ArrayList arrayList22 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
                it = arrayList3.iterator();
                while (it.hasNext()) {
                    ContactEntity contactEntityEZpvd = C44169sFw.EZpvd((ContactWithPhoneData) it.next());
                    c44128sEi3.EZpvd.OLrzqt(contactEntityEZpvd);
                    arrayList22.add(contactEntityEZpvd);
                }
                return arrayList22;
            }
            c44128sEi = (C44128sEi) inHouseIMContactImpl$syncFriendListOnChannel$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            interfaceC44178sGeAEQbTJ2 = c44128sEi.OLrzqt.AEQbTJ();
            listGEmmrt = yDY.gEmmrt(ContactRelationType.ONE_WAY, ContactRelationType.TWO_WAY);
            inHouseIMContactImpl$syncFriendListOnChannel$1.L$0 = c44128sEi;
            inHouseIMContactImpl$syncFriendListOnChannel$1.label = 3;
            if (interfaceC44178sGeAEQbTJ2.copydefault(listGEmmrt, inHouseIMContactImpl$syncFriendListOnChannel$1) == objCopydefault) {
                return objCopydefault;
            }
            InterfaceC44178sGe interfaceC44178sGeAEQbTJ422 = c44128sEi.OLrzqt.AEQbTJ();
            inHouseIMContactImpl$syncFriendListOnChannel$1.L$0 = c44128sEi;
            inHouseIMContactImpl$syncFriendListOnChannel$1.label = 4;
            objEZpvd = interfaceC44178sGeAEQbTJ422.EZpvd(inHouseIMContactImpl$syncFriendListOnChannel$1);
            if (objEZpvd != objCopydefault) {
            }
        }
        c44128sEi2.EZpvd.EZpvd(strKWHzl);
        c44128sEi = c44128sEi2;
        interfaceC44178sGeAEQbTJ = c44128sEi.OLrzqt.AEQbTJ();
        listEZpvd = C56402yEa.EZpvd(ContactRelationType.STRANGER);
        inHouseIMContactImpl$syncFriendListOnChannel$1.L$0 = c44128sEi;
        inHouseIMContactImpl$syncFriendListOnChannel$1.L$1 = null;
        inHouseIMContactImpl$syncFriendListOnChannel$1.label = 2;
        if (interfaceC44178sGeAEQbTJ.AEQbTJ(listEZpvd, inHouseIMContactImpl$syncFriendListOnChannel$1) == objCopydefault) {
        }
        interfaceC44178sGeAEQbTJ2 = c44128sEi.OLrzqt.AEQbTJ();
        listGEmmrt = yDY.gEmmrt(ContactRelationType.ONE_WAY, ContactRelationType.TWO_WAY);
        inHouseIMContactImpl$syncFriendListOnChannel$1.L$0 = c44128sEi;
        inHouseIMContactImpl$syncFriendListOnChannel$1.label = 3;
        if (interfaceC44178sGeAEQbTJ2.copydefault(listGEmmrt, inHouseIMContactImpl$syncFriendListOnChannel$1) == objCopydefault) {
        }
        InterfaceC44178sGe interfaceC44178sGeAEQbTJ4222 = c44128sEi.OLrzqt.AEQbTJ();
        inHouseIMContactImpl$syncFriendListOnChannel$1.L$0 = c44128sEi;
        inHouseIMContactImpl$syncFriendListOnChannel$1.label = 4;
        objEZpvd = interfaceC44178sGeAEQbTJ4222.EZpvd(inHouseIMContactImpl$syncFriendListOnChannel$1);
        if (objEZpvd != objCopydefault) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44177sGd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<RelationInfo>> continuation) throws java.lang.Throwable {
        InHouseIMContactImpl$getRelationList$1 inHouseIMContactImpl$getRelationList$1;
        C44128sEi c44128sEi;
        if (continuation instanceof InHouseIMContactImpl$getRelationList$1) {
            inHouseIMContactImpl$getRelationList$1 = (InHouseIMContactImpl$getRelationList$1) continuation;
            int i = inHouseIMContactImpl$getRelationList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactImpl$getRelationList$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactImpl$getRelationList$1 = new InHouseIMContactImpl$getRelationList$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = inHouseIMContactImpl$getRelationList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactImpl$getRelationList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            InterfaceC44178sGe interfaceC44178sGeAEQbTJ = this.OLrzqt.AEQbTJ();
            java.util.List<? extends ContactRelationType> listEZpvd = C56402yEa.EZpvd(ContactRelationType.STRANGER);
            inHouseIMContactImpl$getRelationList$1.L$0 = this;
            inHouseIMContactImpl$getRelationList$1.label = 1;
            objAEQbTJ = interfaceC44178sGeAEQbTJ.AEQbTJ(listEZpvd, inHouseIMContactImpl$getRelationList$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c44128sEi = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c44128sEi = (C44128sEi) inHouseIMContactImpl$getRelationList$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        java.util.List listAhwBna = (java.util.List) objAEQbTJ;
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator it = listAhwBna.iterator();
        while (it.hasNext()) {
            ContactEntity contactEntityEZpvd = C44169sFw.EZpvd((ContactWithPhoneData) it.next());
            c44128sEi.EZpvd.OLrzqt(contactEntityEZpvd);
            arrayList.add(contactEntityEZpvd);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            RelationInfo relationInfoOLrzqt = sSM.AEQbTJ.OLrzqt((ContactEntity) it2.next());
            if (relationInfoOLrzqt != null) {
                arrayList2.add(relationInfoOLrzqt);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44177sGd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super RelationInfo> continuation) throws java.lang.Throwable {
        InHouseIMContactImpl$getContactInfoFromRemote$1 inHouseIMContactImpl$getContactInfoFromRemote$1;
        C44128sEi c44128sEi;
        if (continuation instanceof InHouseIMContactImpl$getContactInfoFromRemote$1) {
            inHouseIMContactImpl$getContactInfoFromRemote$1 = (InHouseIMContactImpl$getContactInfoFromRemote$1) continuation;
            int i = inHouseIMContactImpl$getContactInfoFromRemote$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactImpl$getContactInfoFromRemote$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactImpl$getContactInfoFromRemote$1 = new InHouseIMContactImpl$getContactInfoFromRemote$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = inHouseIMContactImpl$getContactInfoFromRemote$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactImpl$getContactInfoFromRemote$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            InterfaceC44178sGe interfaceC44178sGeAEQbTJ = this.OLrzqt.AEQbTJ();
            inHouseIMContactImpl$getContactInfoFromRemote$1.L$0 = this;
            inHouseIMContactImpl$getContactInfoFromRemote$1.label = 1;
            objEZpvd = interfaceC44178sGeAEQbTJ.EZpvd(str, null, inHouseIMContactImpl$getContactInfoFromRemote$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c44128sEi = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c44128sEi = (C44128sEi) inHouseIMContactImpl$getContactInfoFromRemote$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        ContactWithPhoneData contactWithPhoneData = (ContactWithPhoneData) objEZpvd;
        if (contactWithPhoneData == null) {
            return null;
        }
        ContactEntity contactEntityEZpvd = C44169sFw.EZpvd(contactWithPhoneData);
        c44128sEi.EZpvd.OLrzqt(contactEntityEZpvd);
        return sSM.AEQbTJ.OLrzqt(contactEntityEZpvd);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009d A[LOOP:2: B:29:0x0097->B:31:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44177sGd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull CacheStrategy cacheStrategy, @NotNull Continuation<? super java.util.List<RelationInfo>> continuation) throws java.lang.Throwable {
        InHouseIMContactImpl$getRelationListById$1 inHouseIMContactImpl$getRelationListById$1;
        C44128sEi c44128sEi;
        C44128sEi c44128sEi2;
        java.util.List list2;
        java.util.List listAhwBna;
        java.util.Iterator it;
        java.util.Set setAYXKKw;
        java.util.List listAhwBna2;
        java.util.List list3;
        if (continuation instanceof InHouseIMContactImpl$getRelationListById$1) {
            inHouseIMContactImpl$getRelationListById$1 = (InHouseIMContactImpl$getRelationListById$1) continuation;
            int i = inHouseIMContactImpl$getRelationListById$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactImpl$getRelationListById$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactImpl$getRelationListById$1 = new InHouseIMContactImpl$getRelationListById$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = inHouseIMContactImpl$getRelationListById$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactImpl$getRelationListById$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            int i3 = Application.AEQbTJ[cacheStrategy.ordinal()];
            if (i3 == 1) {
                InterfaceC44178sGe interfaceC44178sGeAEQbTJ = this.OLrzqt.AEQbTJ();
                inHouseIMContactImpl$getRelationListById$1.L$0 = this;
                inHouseIMContactImpl$getRelationListById$1.label = 1;
                objKWHzl = interfaceC44178sGeAEQbTJ.KWHzl(list, inHouseIMContactImpl$getRelationListById$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                c44128sEi = this;
                list2 = (java.util.List) objKWHzl;
                c44128sEi2 = c44128sEi;
                listAhwBna = list2;
            } else if (i3 == 2) {
                InterfaceC44178sGe interfaceC44178sGeAEQbTJ2 = this.OLrzqt.AEQbTJ();
                inHouseIMContactImpl$getRelationListById$1.L$0 = this;
                inHouseIMContactImpl$getRelationListById$1.label = 2;
                objKWHzl = interfaceC44178sGeAEQbTJ2.OLrzqt(list, inHouseIMContactImpl$getRelationListById$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                c44128sEi = this;
                list2 = (java.util.List) objKWHzl;
                c44128sEi2 = c44128sEi;
                listAhwBna = list2;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC44178sGe interfaceC44178sGeAEQbTJ3 = this.OLrzqt.AEQbTJ();
                inHouseIMContactImpl$getRelationListById$1.L$0 = this;
                inHouseIMContactImpl$getRelationListById$1.L$1 = list;
                inHouseIMContactImpl$getRelationListById$1.label = 3;
                objKWHzl = interfaceC44178sGeAEQbTJ3.OLrzqt(list, inHouseIMContactImpl$getRelationListById$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                c44128sEi2 = this;
                java.util.List list4 = (java.util.List) objKWHzl;
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list4, 10));
                it = list4.iterator();
                while (it.hasNext()) {
                }
                setAYXKKw = CollectionsKt___CollectionsKt.AYXKKw((java.lang.Iterable) list, (java.lang.Iterable) CollectionsKt___CollectionsKt.OqFWZa(arrayList));
                if (!(!setAYXKKw.isEmpty())) {
                }
            }
        } else if (i2 == 1) {
            c44128sEi = (C44128sEi) inHouseIMContactImpl$getRelationListById$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            list2 = (java.util.List) objKWHzl;
            c44128sEi2 = c44128sEi;
            listAhwBna = list2;
        } else if (i2 == 2) {
            c44128sEi = (C44128sEi) inHouseIMContactImpl$getRelationListById$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            list2 = (java.util.List) objKWHzl;
            c44128sEi2 = c44128sEi;
            listAhwBna = list2;
        } else if (i2 == 3) {
            list = (java.util.List) inHouseIMContactImpl$getRelationListById$1.L$1;
            c44128sEi2 = (C44128sEi) inHouseIMContactImpl$getRelationListById$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            java.util.List list42 = (java.util.List) objKWHzl;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list42, 10));
            it = list42.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ContactWithPhoneData) it.next()).getContactUid());
            }
            setAYXKKw = CollectionsKt___CollectionsKt.AYXKKw((java.lang.Iterable) list, (java.lang.Iterable) CollectionsKt___CollectionsKt.OqFWZa(arrayList2));
            if (!(!setAYXKKw.isEmpty())) {
                InterfaceC44178sGe interfaceC44178sGeAEQbTJ4 = c44128sEi2.OLrzqt.AEQbTJ();
                java.util.List<java.lang.String> listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(setAYXKKw);
                inHouseIMContactImpl$getRelationListById$1.L$0 = c44128sEi2;
                inHouseIMContactImpl$getRelationListById$1.L$1 = list42;
                inHouseIMContactImpl$getRelationListById$1.label = 4;
                java.lang.Object objKWHzl2 = interfaceC44178sGeAEQbTJ4.KWHzl(listAxsJAYsNCnLh, inHouseIMContactImpl$getRelationListById$1);
                if (objKWHzl2 == objCopydefault) {
                    return objCopydefault;
                }
                objKWHzl = objKWHzl2;
                list3 = list42;
                listAhwBna2 = (java.util.List) objKWHzl;
                if (listAhwBna2 == null) {
                }
                listAhwBna = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) list3, (java.lang.Iterable) listAhwBna2);
            } else {
                listAhwBna2 = yDY.AhwBna();
                list3 = list42;
                if (listAhwBna2 == null) {
                }
                listAhwBna = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) list3, (java.lang.Iterable) listAhwBna2);
            }
        } else {
            if (i2 != 4) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list3 = (java.util.List) inHouseIMContactImpl$getRelationListById$1.L$1;
            c44128sEi2 = (C44128sEi) inHouseIMContactImpl$getRelationListById$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            listAhwBna2 = (java.util.List) objKWHzl;
            if (listAhwBna2 == null) {
                listAhwBna2 = yDY.AhwBna();
            }
            listAhwBna = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) list3, (java.lang.Iterable) listAhwBna2);
        }
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator it2 = listAhwBna.iterator();
        while (it2.hasNext()) {
            ContactEntity contactEntityEZpvd = C44169sFw.EZpvd((ContactWithPhoneData) it2.next());
            c44128sEi2.EZpvd.OLrzqt(contactEntityEZpvd);
            arrayList3.add(contactEntityEZpvd);
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            RelationInfo relationInfoOLrzqt = sSM.AEQbTJ.OLrzqt((ContactEntity) it3.next());
            if (relationInfoOLrzqt != null) {
                arrayList4.add(relationInfoOLrzqt);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44177sGd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull com.okinc.network.okg.cache.CacheStrategy cacheStrategy, @NotNull Continuation<? super java.util.List<RelationInfo>> continuation) throws java.lang.Throwable {
        InHouseIMContactImpl$getSuggestedList$1 inHouseIMContactImpl$getSuggestedList$1;
        if (continuation instanceof InHouseIMContactImpl$getSuggestedList$1) {
            inHouseIMContactImpl$getSuggestedList$1 = (InHouseIMContactImpl$getSuggestedList$1) continuation;
            int i = inHouseIMContactImpl$getSuggestedList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactImpl$getSuggestedList$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactImpl$getSuggestedList$1 = new InHouseIMContactImpl$getSuggestedList$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = inHouseIMContactImpl$getSuggestedList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactImpl$getSuggestedList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            int iCopydefault = sEI.KWHzl.copydefault();
            InterfaceC44178sGe interfaceC44178sGeAEQbTJ = this.OLrzqt.AEQbTJ();
            inHouseIMContactImpl$getSuggestedList$1.label = 1;
            objKWHzl = interfaceC44178sGeAEQbTJ.KWHzl(cacheStrategy, iCopydefault, inHouseIMContactImpl$getSuggestedList$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        java.lang.Iterable iterable = (java.lang.Iterable) objKWHzl;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(C44169sFw.OLrzqt((InHouseIMContactInfoEntity) it.next()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            RelationInfo relationInfoOLrzqt = sSM.AEQbTJ.OLrzqt((ContactEntity) it2.next());
            if (relationInfoOLrzqt != null) {
                arrayList2.add(relationInfoOLrzqt);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object djBIcL(java.lang.String str, java.lang.String str2, @NotNull Continuation<? super ContactEntity> continuation) throws java.lang.Throwable {
        InHouseIMContactImpl$queryContactInfoOnChannel$1 inHouseIMContactImpl$queryContactInfoOnChannel$1;
        C44128sEi c44128sEi;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        ContactWithPhoneData contactWithPhoneData;
        ContactEntity contactEntityEZpvd;
        if (continuation instanceof InHouseIMContactImpl$queryContactInfoOnChannel$1) {
            inHouseIMContactImpl$queryContactInfoOnChannel$1 = (InHouseIMContactImpl$queryContactInfoOnChannel$1) continuation;
            int i = inHouseIMContactImpl$queryContactInfoOnChannel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactImpl$queryContactInfoOnChannel$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactImpl$queryContactInfoOnChannel$1 = new InHouseIMContactImpl$queryContactInfoOnChannel$1(this, continuation);
            }
        }
        InHouseIMContactImpl$queryContactInfoOnChannel$1 inHouseIMContactImpl$queryContactInfoOnChannel$12 = inHouseIMContactImpl$queryContactInfoOnChannel$1;
        java.lang.Object objKWHzl = inHouseIMContactImpl$queryContactInfoOnChannel$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactImpl$queryContactInfoOnChannel$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            if (str != null) {
                inHouseIMContactImpl$queryContactInfoOnChannel$12.L$0 = this;
                inHouseIMContactImpl$queryContactInfoOnChannel$12.L$1 = str2;
                inHouseIMContactImpl$queryContactInfoOnChannel$12.label = 1;
                objKWHzl = KWHzl(str, str2, inHouseIMContactImpl$queryContactInfoOnChannel$12);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                c44128sEi = this;
            } else {
                c44128sEi = this;
                str3 = str2;
                str4 = null;
                str5 = str4 != null ? "" : str4;
                if (str5.length() <= 0) {
                    InterfaceC44178sGe interfaceC44178sGeAEQbTJ = c44128sEi.OLrzqt.AEQbTJ();
                    inHouseIMContactImpl$queryContactInfoOnChannel$12.L$0 = null;
                    inHouseIMContactImpl$queryContactInfoOnChannel$12.L$1 = null;
                    inHouseIMContactImpl$queryContactInfoOnChannel$12.label = 2;
                    objKWHzl = InterfaceC44178sGe.ActionBar.getContactById$default(interfaceC44178sGeAEQbTJ, str5, false, str3, inHouseIMContactImpl$queryContactInfoOnChannel$12, 2, null);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    contactWithPhoneData = (ContactWithPhoneData) objKWHzl;
                    if (contactWithPhoneData != null) {
                    }
                    throw new OKIMException("Contact not available", 0, 2, (DefaultConstructorMarker) null);
                }
                throw new OKIMException("Invalid search params", 0, 2, (DefaultConstructorMarker) null);
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
                contactWithPhoneData = (ContactWithPhoneData) objKWHzl;
                if (contactWithPhoneData != null || (contactEntityEZpvd = C44169sFw.EZpvd(contactWithPhoneData)) == null) {
                    throw new OKIMException("Contact not available", 0, 2, (DefaultConstructorMarker) null);
                }
                return contactEntityEZpvd;
            }
            str2 = (java.lang.String) inHouseIMContactImpl$queryContactInfoOnChannel$12.L$1;
            c44128sEi = (C44128sEi) inHouseIMContactImpl$queryContactInfoOnChannel$12.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        str4 = (java.lang.String) objKWHzl;
        str3 = str2;
        if (str4 != null) {
        }
        if (str5.length() <= 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object gEmmrt(@NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<ContactEntity>>> continuation) throws java.lang.Throwable {
        InHouseIMContactImpl$searchContactByIdOnChannel$1 inHouseIMContactImpl$searchContactByIdOnChannel$1;
        java.lang.Object objM7377constructorimpl;
        java.util.List list;
        if (continuation instanceof InHouseIMContactImpl$searchContactByIdOnChannel$1) {
            inHouseIMContactImpl$searchContactByIdOnChannel$1 = (InHouseIMContactImpl$searchContactByIdOnChannel$1) continuation;
            int i = inHouseIMContactImpl$searchContactByIdOnChannel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactImpl$searchContactByIdOnChannel$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactImpl$searchContactByIdOnChannel$1 = new InHouseIMContactImpl$searchContactByIdOnChannel$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = inHouseIMContactImpl$searchContactByIdOnChannel$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactImpl$searchContactByIdOnChannel$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                Result.Application application = Result.Companion;
                InterfaceC44178sGe interfaceC44178sGeAEQbTJ = this.OLrzqt.AEQbTJ();
                inHouseIMContactImpl$searchContactByIdOnChannel$1.label = 1;
                objOLrzqt = interfaceC44178sGeAEQbTJ.OLrzqt(str, inHouseIMContactImpl$searchContactByIdOnChannel$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            list = (java.util.List) objOLrzqt;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (list == null) {
            throw new OKIMException("Contact not found", 0, 2, (DefaultConstructorMarker) null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C44169sFw.EZpvd((ContactWithPhoneData) it.next()));
        }
        objM7377constructorimpl = Result.m7377constructorimpl(new ResponseData(0, null, null, null, arrayList, null, 46, null));
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            return objM7377constructorimpl;
        }
        java.lang.String message = thM7380exceptionOrNullimpl.getMessage();
        if (message == null) {
            message = "";
        }
        return new ResponseData(-1, message, null, null, null, null, 60, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super ContactEntity> continuation) throws java.lang.Throwable {
        InHouseIMContactImpl$addContactOnChannel$1 inHouseIMContactImpl$addContactOnChannel$1;
        C44128sEi c44128sEi;
        if (continuation instanceof InHouseIMContactImpl$addContactOnChannel$1) {
            inHouseIMContactImpl$addContactOnChannel$1 = (InHouseIMContactImpl$addContactOnChannel$1) continuation;
            int i = inHouseIMContactImpl$addContactOnChannel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactImpl$addContactOnChannel$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactImpl$addContactOnChannel$1 = new InHouseIMContactImpl$addContactOnChannel$1(this, continuation);
            }
        }
        java.lang.Object objDjBIcL = inHouseIMContactImpl$addContactOnChannel$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactImpl$addContactOnChannel$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objDjBIcL);
            AddContactReq addContactReq = new AddContactReq(java.lang.Long.parseLong(str), str2 != null ? C56443yFo.KWHzl(java.lang.Long.parseLong(str2)) : null);
            InterfaceC44178sGe interfaceC44178sGeAEQbTJ = this.OLrzqt.AEQbTJ();
            inHouseIMContactImpl$addContactOnChannel$1.L$0 = this;
            inHouseIMContactImpl$addContactOnChannel$1.L$1 = str;
            inHouseIMContactImpl$addContactOnChannel$1.L$2 = str2;
            inHouseIMContactImpl$addContactOnChannel$1.label = 1;
            if (interfaceC44178sGeAEQbTJ.EZpvd(addContactReq, inHouseIMContactImpl$addContactOnChannel$1) == objCopydefault) {
                return objCopydefault;
            }
            c44128sEi = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objDjBIcL);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (java.lang.String) inHouseIMContactImpl$addContactOnChannel$1.L$2;
            str = (java.lang.String) inHouseIMContactImpl$addContactOnChannel$1.L$1;
            c44128sEi = (C44128sEi) inHouseIMContactImpl$addContactOnChannel$1.L$0;
            C56391yDq.AEQbTJ(objDjBIcL);
        }
        inHouseIMContactImpl$addContactOnChannel$1.L$0 = null;
        inHouseIMContactImpl$addContactOnChannel$1.L$1 = null;
        inHouseIMContactImpl$addContactOnChannel$1.L$2 = null;
        inHouseIMContactImpl$addContactOnChannel$1.label = 2;
        objDjBIcL = c44128sEi.djBIcL(str, str2, inHouseIMContactImpl$addContactOnChannel$1);
        return objDjBIcL == objCopydefault ? objCopydefault : objDjBIcL;
    }

    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objEZpvd = this.OLrzqt.AEQbTJ().EZpvd(new RemoveContactReq(java.lang.Long.parseLong(str)), continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    public java.lang.Object OLrzqt(@NotNull java.lang.String str, int i, java.lang.String str2, java.lang.Boolean bool, @NotNull Continuation<? super Unit> continuation) {
        if (i == 1) {
            long jValueOf = C33129mqd.valueOf(str);
            if (str2 == null) {
                str2 = "";
            }
            return this.OLrzqt.AEQbTJ().EZpvd(new SetContactRemarkReq(jValueOf, str2), continuation);
        }
        if (i != 4) {
            throw new java.lang.UnsupportedOperationException("Unsupported operation type");
        }
        if (bool == null) {
            throw new java.lang.IllegalArgumentException("isEnable must be provided for block operation".toString());
        }
        java.lang.Object objEZpvd = this.OLrzqt.AEQbTJ().EZpvd(new BlockContactReq(C33129mqd.valueOf(str), bool.booleanValue() ? 1 : 0), continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44177sGd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super java.util.List<RelationInfo>> continuation) throws java.lang.Throwable {
        InHouseIMContactImpl$getBlockContactList$1 inHouseIMContactImpl$getBlockContactList$1;
        if (continuation instanceof InHouseIMContactImpl$getBlockContactList$1) {
            inHouseIMContactImpl$getBlockContactList$1 = (InHouseIMContactImpl$getBlockContactList$1) continuation;
            int i = inHouseIMContactImpl$getBlockContactList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactImpl$getBlockContactList$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactImpl$getBlockContactList$1 = new InHouseIMContactImpl$getBlockContactList$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = inHouseIMContactImpl$getBlockContactList$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = inHouseIMContactImpl$getBlockContactList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            InterfaceC44178sGe interfaceC44178sGeAEQbTJ = this.OLrzqt.AEQbTJ();
            inHouseIMContactImpl$getBlockContactList$1.label = 1;
            objCopydefault = interfaceC44178sGeAEQbTJ.copydefault(inHouseIMContactImpl$getBlockContactList$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.lang.Iterable) objCopydefault).iterator();
        while (it.hasNext()) {
            RelationInfo relationInfoOLrzqt = sSM.AEQbTJ.OLrzqt(C44169sFw.OLrzqt((InHouseIMContactInfoEntity) it.next()));
            if (relationInfoOLrzqt != null) {
                arrayList.add(relationInfoOLrzqt);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44177sGd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        InHouseIMContactImpl$getCurrentUserQRCode$1 inHouseIMContactImpl$getCurrentUserQRCode$1;
        if (continuation instanceof InHouseIMContactImpl$getCurrentUserQRCode$1) {
            inHouseIMContactImpl$getCurrentUserQRCode$1 = (InHouseIMContactImpl$getCurrentUserQRCode$1) continuation;
            int i = inHouseIMContactImpl$getCurrentUserQRCode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactImpl$getCurrentUserQRCode$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactImpl$getCurrentUserQRCode$1 = new InHouseIMContactImpl$getCurrentUserQRCode$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = inHouseIMContactImpl$getCurrentUserQRCode$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactImpl$getCurrentUserQRCode$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            InterfaceC44178sGe interfaceC44178sGeAEQbTJ = this.OLrzqt.AEQbTJ();
            inHouseIMContactImpl$getCurrentUserQRCode$1.label = 1;
            objAEQbTJ = interfaceC44178sGeAEQbTJ.AEQbTJ(inHouseIMContactImpl$getCurrentUserQRCode$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        return ((InhouseIMQueryMyQRCodeResponse) objAEQbTJ).getQrcode();
    }

    @Override // o.InterfaceC44177sGd
    public java.lang.Object OLrzqt(int i, boolean z, @NotNull Continuation<? super Unit> continuation) {
        if (i == 1) {
            java.lang.Object userPrivacy = this.AYXKKw.setUserPrivacy(new UpdateSecuritySettingRequest((java.lang.Integer) null, C56443yFo.AEQbTJ(z ? 1 : 0), (java.lang.Integer) null, (java.lang.Integer) null, 13, (DefaultConstructorMarker) null), continuation);
            return userPrivacy == C56442yFn.copydefault() ? userPrivacy : Unit.INSTANCE;
        }
        if (i == 3) {
            java.lang.Object userPrivacy2 = this.AYXKKw.setUserPrivacy(new UpdateSecuritySettingRequest(C56443yFo.AEQbTJ(z ? 1 : 0), (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, 14, (DefaultConstructorMarker) null), continuation);
            return userPrivacy2 == C56442yFn.copydefault() ? userPrivacy2 : Unit.INSTANCE;
        }
        if (i == 4) {
            java.lang.Object userPrivacy3 = this.AYXKKw.setUserPrivacy(new UpdateSecuritySettingRequest((java.lang.Integer) null, (java.lang.Integer) null, C56443yFo.AEQbTJ(z ? 1 : 0), (java.lang.Integer) null, 11, (DefaultConstructorMarker) null), continuation);
            return userPrivacy3 == C56442yFn.copydefault() ? userPrivacy3 : Unit.INSTANCE;
        }
        if (i == 5) {
            java.lang.Object userPrivacy4 = this.AYXKKw.setUserPrivacy(new UpdateSecuritySettingRequest((java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, C56443yFo.AEQbTJ(z ? 1 : 0), 7, (DefaultConstructorMarker) null), continuation);
            return userPrivacy4 == C56442yFn.copydefault() ? userPrivacy4 : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.lang.String str, java.lang.String str2, Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        InHouseIMContactImpl$getRealContactId$1 inHouseIMContactImpl$getRealContactId$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable th;
        C44128sEi c44128sEi;
        if (continuation instanceof InHouseIMContactImpl$getRealContactId$1) {
            inHouseIMContactImpl$getRealContactId$1 = (InHouseIMContactImpl$getRealContactId$1) continuation;
            int i = inHouseIMContactImpl$getRealContactId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactImpl$getRealContactId$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactImpl$getRealContactId$1 = new InHouseIMContactImpl$getRealContactId$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = inHouseIMContactImpl$getRealContactId$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactImpl$getRealContactId$1.label;
        try {
        } catch (java.lang.Throwable th2) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            try {
                Result.Application application2 = Result.Companion;
                InterfaceC44178sGe interfaceC44178sGeAEQbTJ = this.OLrzqt.AEQbTJ();
                inHouseIMContactImpl$getRealContactId$1.L$0 = this;
                inHouseIMContactImpl$getRealContactId$1.L$1 = str;
                inHouseIMContactImpl$getRealContactId$1.label = 1;
                objEZpvd = interfaceC44178sGeAEQbTJ.EZpvd(str, true, str2, inHouseIMContactImpl$getRealContactId$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c44128sEi = this;
            } catch (java.lang.Throwable th3) {
                th = th3;
                c44128sEi = this;
                Result.Application application3 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
                objM7377constructorimpl = Result.m7377constructorimpl((java.lang.String) objEZpvd);
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = "";
                }
                java.lang.String str3 = (java.lang.String) objM7377constructorimpl;
                return str3 != null ? "" : str3;
            }
            str = (java.lang.String) inHouseIMContactImpl$getRealContactId$1.L$1;
            c44128sEi = (C44128sEi) inHouseIMContactImpl$getRealContactId$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
            } catch (java.lang.Throwable th4) {
                th = th4;
                Result.Application application32 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        if (((ContactWithPhoneData) objEZpvd) != null) {
            return str;
        }
        Result.m7377constructorimpl(null);
        Result.Application application4 = Result.Companion;
        sGI sgiOLrzqt = c44128sEi.OLrzqt.OLrzqt();
        inHouseIMContactImpl$getRealContactId$1.L$0 = null;
        inHouseIMContactImpl$getRealContactId$1.L$1 = null;
        inHouseIMContactImpl$getRealContactId$1.label = 2;
        objEZpvd = sgiOLrzqt.AEQbTJ(str, inHouseIMContactImpl$getRealContactId$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((java.lang.String) objEZpvd);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
        }
        java.lang.String str32 = (java.lang.String) objM7377constructorimpl;
        if (str32 != null) {
        }
    }

    @Override // o.InterfaceC44177sGd
    public Flow<RelationInfo> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.filterNotNull(new ActionBar(this.OLrzqt.AEQbTJ().EZpvd(str)));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44177sGd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super RelationInfo> continuation) throws java.lang.Throwable {
        InHouseIMContactImpl$getRelationInfo$1 inHouseIMContactImpl$getRelationInfo$1;
        C44128sEi c44128sEi;
        ContactEntity contactEntityEZpvd;
        if (continuation instanceof InHouseIMContactImpl$getRelationInfo$1) {
            inHouseIMContactImpl$getRelationInfo$1 = (InHouseIMContactImpl$getRelationInfo$1) continuation;
            int i = inHouseIMContactImpl$getRelationInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactImpl$getRelationInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactImpl$getRelationInfo$1 = new InHouseIMContactImpl$getRelationInfo$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = inHouseIMContactImpl$getRelationInfo$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = inHouseIMContactImpl$getRelationInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            InterfaceC44178sGe interfaceC44178sGeAEQbTJ = this.OLrzqt.AEQbTJ();
            inHouseIMContactImpl$getRelationInfo$1.L$0 = this;
            inHouseIMContactImpl$getRelationInfo$1.L$1 = str;
            inHouseIMContactImpl$getRelationInfo$1.label = 1;
            objCopydefault = interfaceC44178sGeAEQbTJ.copydefault(str, inHouseIMContactImpl$getRelationInfo$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c44128sEi = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                ContactWithPhoneData contactWithPhoneData = (ContactWithPhoneData) objCopydefault;
                contactEntityEZpvd = contactWithPhoneData == null ? C44169sFw.EZpvd(contactWithPhoneData) : null;
                if (contactEntityEZpvd == null) {
                    return sSM.AEQbTJ.OLrzqt(contactEntityEZpvd);
                }
                return null;
            }
            str = (java.lang.String) inHouseIMContactImpl$getRelationInfo$1.L$1;
            c44128sEi = (C44128sEi) inHouseIMContactImpl$getRelationInfo$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        ContactWithPhoneData contactWithPhoneData2 = (ContactWithPhoneData) objCopydefault;
        if (contactWithPhoneData2 == null || (contactEntityEZpvd = C44169sFw.EZpvd(contactWithPhoneData2)) == null) {
            InterfaceC44178sGe interfaceC44178sGeAEQbTJ2 = c44128sEi.OLrzqt.AEQbTJ();
            inHouseIMContactImpl$getRelationInfo$1.L$0 = null;
            inHouseIMContactImpl$getRelationInfo$1.L$1 = null;
            inHouseIMContactImpl$getRelationInfo$1.label = 2;
            objCopydefault = interfaceC44178sGeAEQbTJ2.EZpvd(str, null, inHouseIMContactImpl$getRelationInfo$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            ContactWithPhoneData contactWithPhoneData3 = (ContactWithPhoneData) objCopydefault;
            if (contactWithPhoneData3 == null) {
            }
        }
        if (contactEntityEZpvd == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super RelationInfo> continuation) throws java.lang.Throwable {
        InHouseIMContactImpl$getRelationInfoFromCacheFirst$1 inHouseIMContactImpl$getRelationInfoFromCacheFirst$1;
        if (continuation instanceof InHouseIMContactImpl$getRelationInfoFromCacheFirst$1) {
            inHouseIMContactImpl$getRelationInfoFromCacheFirst$1 = (InHouseIMContactImpl$getRelationInfoFromCacheFirst$1) continuation;
            int i = inHouseIMContactImpl$getRelationInfoFromCacheFirst$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseIMContactImpl$getRelationInfoFromCacheFirst$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseIMContactImpl$getRelationInfoFromCacheFirst$1 = new InHouseIMContactImpl$getRelationInfoFromCacheFirst$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = inHouseIMContactImpl$getRelationInfoFromCacheFirst$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseIMContactImpl$getRelationInfoFromCacheFirst$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            InterfaceC44178sGe interfaceC44178sGeAEQbTJ = this.OLrzqt.AEQbTJ();
            inHouseIMContactImpl$getRelationInfoFromCacheFirst$1.label = 1;
            objEZpvd = interfaceC44178sGeAEQbTJ.EZpvd(str, true, str2, inHouseIMContactImpl$getRelationInfoFromCacheFirst$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        ContactWithPhoneData contactWithPhoneData = (ContactWithPhoneData) objEZpvd;
        if (contactWithPhoneData != null) {
            return sSM.AEQbTJ.OLrzqt(C44169sFw.EZpvd(contactWithPhoneData));
        }
        return null;
    }

    @Override // o.InterfaceC44177sGd
    public java.lang.Object KWHzl(java.lang.Long l, java.lang.String str, PhoneNumber phoneNumber, @NotNull Continuation<? super java.util.List<InHouseIMContactInfoEntity>> continuation) {
        return this.OLrzqt.AEQbTJ().KWHzl(new SearchContactReqV2(l, str, phoneNumber), continuation);
    }

    @Override // o.InterfaceC44177sGd
    public java.lang.Object copydefault(@NotNull Continuation<? super ReferralTasks> continuation) {
        return this.OLrzqt.AEQbTJ().KWHzl(continuation);
    }
}
