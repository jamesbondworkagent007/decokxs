package com.okinc.im.imui.group.create.viewmodel;

import com.okinc.im.imui.group.create.model.CreateGroupDisplayItem;
import com.okinc.im.imui.group.create.viewmodel.CreateGroupViewModel;
import com.okinc.im.imui.relationlist.model.GroupType;
import com.okinc.okimcore.model.im.group.GroupPublicType;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupBillingStatus;
import com.okinc.okimcore.model.remote.GroupEntryBillingModel;
import com.okinc.okimcore.model.remote.GroupScenarioType;
import com.okinc.okimcore.model.remote.GroupServiceType;
import com.okinc.okimcore.model.remote.SetGroupSettingsReq;
import com.okinc.okimcore.model.utility.PrepareGroupCreation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.serialization.json.JsonObject;
import o.AbstractC44396sOg;
import o.C35778oDi;
import o.C37683oyU;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class CreateGroupViewModel$createGroup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ CreateGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateGroupViewModel$createGroup$1(CreateGroupViewModel createGroupViewModel, Continuation<? super CreateGroupViewModel$createGroup$1> continuation) {
        super(2, continuation);
        this.this$0 = createGroupViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CreateGroupViewModel$createGroup$1 createGroupViewModel$createGroup$1 = new CreateGroupViewModel$createGroup$1(this.this$0, continuation);
        createGroupViewModel$createGroup$1.L$0 = obj;
        return createGroupViewModel$createGroup$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateGroupViewModel$createGroup$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0209 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0245  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        String str;
        String str2;
        MutableStateFlow mutableStateFlow;
        CreateGroupViewModel.Activity.Application application;
        Iterator it;
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                String string = StringsKt__StringsKt.hDKMBd((CharSequence) this.this$0.OLrzqt.getValue()).toString();
                String string2 = StringsKt__StringsKt.hDKMBd((CharSequence) this.this$0.EZpvd.getValue()).toString();
                if (!((Boolean) this.this$0.djBIcL.getValue()).booleanValue() || C37683oyU.copydefault(string2)) {
                    MutableStateFlow mutableStateFlow2 = this.this$0.fetchVPNInfo;
                    CreateGroupViewModel.Activity.TaskDescription taskDescription = CreateGroupViewModel.Activity.TaskDescription.OLrzqt;
                    this.L$0 = coroutineScope;
                    this.L$1 = string;
                    this.L$2 = string2;
                    this.label = 3;
                    if (mutableStateFlow2.emit(taskDescription, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    str = string;
                    str2 = string2;
                    Iterable iterable = (Iterable) this.this$0.AhwBna.getValue();
                    ArrayList arrayList = new ArrayList();
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(((CreateGroupDisplayItem.MemberItem) it.next()).OLrzqt().getContactsId());
                        if (fieldNames != null) {
                            arrayList.add(fieldNames);
                        }
                    }
                    Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
                    CreateGroupViewModel.InvitePermissions invitePermissions = (CreateGroupViewModel.InvitePermissions) this.this$0.valueOf.getValue();
                    PrepareGroupCreation prepareGroupCreation = new PrepareGroupCreation(GroupServiceType.IM, GroupScenarioType.Default, str, (String) this.this$0.copydefault.getValue(), setOqFWZa, new SetGroupSettingsReq((Long) null, (Long) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (Long) null, (Long) null, C56443yFo.KWHzl(!((Boolean) this.this$0.AYXKKw.getValue()).booleanValue() ? 0L : 1L), (Long) null, (Integer) null, C56443yFo.KWHzl(!invitePermissions.copydefault() ? 1L : 0L), C56443yFo.KWHzl(invitePermissions.AEQbTJ() ? 1L : 0L), C56443yFo.AEQbTJ(invitePermissions.OLrzqt() ? 1 : 0), (String) null, (Integer) null, 101887, (DefaultConstructorMarker) null), !((Boolean) this.this$0.djBIcL.getValue()).booleanValue() ? GroupPublicType.PUBLIC : GroupPublicType.PRIVATE, !(true ^ StringsKt__StringsKt.fARcdN((CharSequence) str2)) ? str2 : null, this.this$0.copydefault() != GroupType.PREMIUM ? new GroupEntryBillingModel(PaidGroupBillingStatus.ENABLED, this.this$0.djBIcL(), (String) null, (String) null, String.valueOf(this.this$0.gEmmrt()), this.this$0.AhwBna(), 12, (DefaultConstructorMarker) null) : null, (JsonObject) null, 512, (DefaultConstructorMarker) null);
                    CreateGroupViewModel createGroupViewModel = this.this$0;
                    Result.Application application3 = Result.Companion;
                    C35778oDi c35778oDi = createGroupViewModel.DbNXlk;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    objKWHzl = c35778oDi.KWHzl(prepareGroupCreation, this);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl((AbstractC44396sOg) objKWHzl);
                    CreateGroupViewModel createGroupViewModel2 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        C44124sEe.AYXKKw("Failed to create group: Generic error", thM7380exceptionOrNullimpl);
                        this.L$0 = objM7377constructorimpl;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                        if (CreateGroupViewModel.handleCreateFailure$default(createGroupViewModel2, thM7380exceptionOrNullimpl, null, this, 2, null) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    CreateGroupViewModel createGroupViewModel3 = this.this$0;
                    if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                        AbstractC44396sOg abstractC44396sOg = (AbstractC44396sOg) objM7377constructorimpl;
                        if (abstractC44396sOg instanceof AbstractC44396sOg.Application) {
                            AbstractC44396sOg.Application application4 = (AbstractC44396sOg.Application) abstractC44396sOg;
                            if (application4.KWHzl().isAllAddSuccess()) {
                                MutableStateFlow mutableStateFlow3 = createGroupViewModel3.fetchVPNInfo;
                                CreateGroupViewModel.Activity.Dialog dialog = new CreateGroupViewModel.Activity.Dialog(application4.EZpvd());
                                this.L$0 = objM7377constructorimpl;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 6;
                                if (mutableStateFlow3.emit(dialog, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                MutableStateFlow mutableStateFlow4 = createGroupViewModel3.fetchVPNInfo;
                                CreateGroupViewModel.Activity.StateListAnimator stateListAnimator = new CreateGroupViewModel.Activity.StateListAnimator(application4.EZpvd(), application4.KWHzl());
                                this.L$0 = objM7377constructorimpl;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 7;
                                if (mutableStateFlow4.emit(stateListAnimator, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                        } else {
                            if (!(abstractC44396sOg instanceof AbstractC44396sOg.TaskDescription)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            AbstractC44396sOg.TaskDescription taskDescription2 = (AbstractC44396sOg.TaskDescription) abstractC44396sOg;
                            C44124sEe.AYXKKw("Failed to create group: Service error", taskDescription2.KWHzl());
                            Throwable thKWHzl = taskDescription2.KWHzl();
                            Integer numAEQbTJ = C56443yFo.AEQbTJ(taskDescription2.EZpvd());
                            this.L$0 = objM7377constructorimpl;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 8;
                            if (createGroupViewModel3.KWHzl(thKWHzl, numAEQbTJ, (Continuation<? super Unit>) this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                MutableStateFlow mutableStateFlow5 = this.this$0.fetchVPNInfo;
                CreateGroupViewModel.Activity.LoaderManager loaderManager = new CreateGroupViewModel.Activity.LoaderManager(false);
                this.label = 1;
                if (mutableStateFlow5.emit(loaderManager, this) == objCopydefault) {
                    return objCopydefault;
                }
                mutableStateFlow = this.this$0.fetchVPNInfo;
                application = CreateGroupViewModel.Activity.Application.AEQbTJ;
                this.label = 2;
                if (mutableStateFlow.emit(application, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                mutableStateFlow = this.this$0.fetchVPNInfo;
                application = CreateGroupViewModel.Activity.Application.AEQbTJ;
                this.label = 2;
                if (mutableStateFlow.emit(application, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 2:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 3:
                str2 = (String) this.L$2;
                String str3 = (String) this.L$1;
                C56391yDq.AEQbTJ(obj);
                str = str3;
                Iterable iterable2 = (Iterable) this.this$0.AhwBna.getValue();
                ArrayList arrayList2 = new ArrayList();
                it = iterable2.iterator();
                while (it.hasNext()) {
                }
                Set setOqFWZa2 = CollectionsKt___CollectionsKt.OqFWZa(arrayList2);
                CreateGroupViewModel.InvitePermissions invitePermissions2 = (CreateGroupViewModel.InvitePermissions) this.this$0.valueOf.getValue();
                if (this.this$0.copydefault() != GroupType.PREMIUM) {
                }
                PrepareGroupCreation prepareGroupCreation2 = new PrepareGroupCreation(GroupServiceType.IM, GroupScenarioType.Default, str, (String) this.this$0.copydefault.getValue(), setOqFWZa2, new SetGroupSettingsReq((Long) null, (Long) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (Long) null, (Long) null, C56443yFo.KWHzl(!((Boolean) this.this$0.AYXKKw.getValue()).booleanValue() ? 0L : 1L), (Long) null, (Integer) null, C56443yFo.KWHzl(!invitePermissions2.copydefault() ? 1L : 0L), C56443yFo.KWHzl(invitePermissions2.AEQbTJ() ? 1L : 0L), C56443yFo.AEQbTJ(invitePermissions2.OLrzqt() ? 1 : 0), (String) null, (Integer) null, 101887, (DefaultConstructorMarker) null), !((Boolean) this.this$0.djBIcL.getValue()).booleanValue() ? GroupPublicType.PUBLIC : GroupPublicType.PRIVATE, !(true ^ StringsKt__StringsKt.fARcdN((CharSequence) str2)) ? str2 : null, this.this$0.copydefault() != GroupType.PREMIUM ? new GroupEntryBillingModel(PaidGroupBillingStatus.ENABLED, this.this$0.djBIcL(), (String) null, (String) null, String.valueOf(this.this$0.gEmmrt()), this.this$0.AhwBna(), 12, (DefaultConstructorMarker) null) : null, (JsonObject) null, 512, (DefaultConstructorMarker) null);
                CreateGroupViewModel createGroupViewModel4 = this.this$0;
                Result.Application application32 = Result.Companion;
                C35778oDi c35778oDi2 = createGroupViewModel4.DbNXlk;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                objKWHzl = c35778oDi2.KWHzl(prepareGroupCreation2, this);
                if (objKWHzl == objCopydefault) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl((AbstractC44396sOg) objKWHzl);
                CreateGroupViewModel createGroupViewModel22 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                CreateGroupViewModel createGroupViewModel32 = this.this$0;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                return Unit.INSTANCE;
            case 4:
                C56391yDq.AEQbTJ(obj);
                objKWHzl = obj;
                objM7377constructorimpl = Result.m7377constructorimpl((AbstractC44396sOg) objKWHzl);
                CreateGroupViewModel createGroupViewModel222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                CreateGroupViewModel createGroupViewModel322 = this.this$0;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                return Unit.INSTANCE;
            case 5:
                objM7377constructorimpl = this.L$0;
                C56391yDq.AEQbTJ(obj);
                CreateGroupViewModel createGroupViewModel3222 = this.this$0;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                return Unit.INSTANCE;
            case 6:
            case 7:
            case 8:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
