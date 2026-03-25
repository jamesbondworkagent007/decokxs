package com.okinc.im.imui.contacts;

import com.okinc.im.imui.contacts.ContactProfileViewModel;
import com.okinc.okimcore.model.im.group.GroupBillingType;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.GroupEntryBillingModel;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ContactProfileViewModel$actionWithGroupInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ContactProfileViewModel.GroupInfoAction $groupInfoAction;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContactProfileViewModel this$0;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ContactProfileViewModel.GroupInfoAction.values().length];
            try {
                iArr[ContactProfileViewModel.GroupInfoAction.REMOVE_MEMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContactProfileViewModel.GroupInfoAction.CHANGE_PAID_MEMBER_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactProfileViewModel$actionWithGroupInfo$1(ContactProfileViewModel.GroupInfoAction groupInfoAction, ContactProfileViewModel contactProfileViewModel, Continuation<? super ContactProfileViewModel$actionWithGroupInfo$1> continuation) {
        super(2, continuation);
        this.$groupInfoAction = groupInfoAction;
        this.this$0 = contactProfileViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContactProfileViewModel$actionWithGroupInfo$1 contactProfileViewModel$actionWithGroupInfo$1 = new ContactProfileViewModel$actionWithGroupInfo$1(this.$groupInfoAction, this.this$0, continuation);
        contactProfileViewModel$actionWithGroupInfo$1.L$0 = obj;
        return contactProfileViewModel$actionWithGroupInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContactProfileViewModel$actionWithGroupInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        ContactProfileViewModel.Activity activity;
        GroupInfo groupInfoEjfBZ;
        Object objM7377constructorimpl2;
        String strAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            int i2 = TaskDescription.copydefault[this.$groupInfoAction.ordinal()];
            if (i2 == 1) {
                ContactProfileViewModel contactProfileViewModel = this.this$0;
                try {
                    Result.Application application = Result.Companion;
                    groupInfoEjfBZ = contactProfileViewModel.ejfBZ();
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (groupInfoEjfBZ != null) {
                    RelationInfo relationInfoAhwBna = contactProfileViewModel.AhwBna();
                    if (relationInfoAhwBna != null) {
                        objM7377constructorimpl = Result.m7377constructorimpl(new ContactProfileViewModel.Activity.Fragment(groupInfoEjfBZ, relationInfoAhwBna));
                        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl != null) {
                            pUU.AEQbTJ("ContactProfileViewModel", "Error removing group member", thM7380exceptionOrNullimpl);
                            String message = thM7380exceptionOrNullimpl.getMessage();
                            objM7377constructorimpl = new ContactProfileViewModel.Activity.FragmentManager(message != null ? message : "");
                        }
                        activity = (ContactProfileViewModel.Activity) objM7377constructorimpl;
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ContactProfileViewModel contactProfileViewModel2 = this.this$0;
                try {
                    Result.Application application3 = Result.Companion;
                    strAEQbTJ = contactProfileViewModel2.AEQbTJ();
                } catch (Throwable th2) {
                    Result.Application application4 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                }
                if (strAEQbTJ != null) {
                    RelationInfo relationInfoAhwBna2 = contactProfileViewModel2.AhwBna();
                    String contactsId = relationInfoAhwBna2 != null ? relationInfoAhwBna2.getContactsId() : null;
                    if (contactsId != null) {
                        Boolean boolValues = contactProfileViewModel2.values();
                        if (boolValues != null) {
                            boolean zBooleanValue = boolValues.booleanValue();
                            GroupInfo groupInfoEjfBZ2 = contactProfileViewModel2.ejfBZ();
                            if (groupInfoEjfBZ2 == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                            PaidGroupInfo paidGroupInfo = groupInfoEjfBZ2.getPaidGroupInfo();
                            if (paidGroupInfo == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                            GroupEntryBillingModel billingModel = paidGroupInfo.getBillingModel();
                            GroupBillingType billingType = billingModel != null ? billingModel.getBillingType() : null;
                            if (billingType != null) {
                                objM7377constructorimpl2 = Result.m7377constructorimpl(new ContactProfileViewModel.Activity.ActionBar(Long.parseLong(strAEQbTJ), Long.parseLong(contactsId), !zBooleanValue, billingType));
                                Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                                if (thM7380exceptionOrNullimpl2 != null) {
                                    pUU.AEQbTJ("ContactProfileViewModel", "Error changing paid member type", thM7380exceptionOrNullimpl2);
                                    String message2 = thM7380exceptionOrNullimpl2.getMessage();
                                    objM7377constructorimpl2 = new ContactProfileViewModel.Activity.FragmentManager(message2 != null ? message2 : "");
                                }
                                activity = (ContactProfileViewModel.Activity) objM7377constructorimpl2;
                            } else {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            MutableSharedFlow mutableSharedFlow = this.this$0.AEQbTJ;
            this.label = 1;
            if (mutableSharedFlow.emit(activity, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
