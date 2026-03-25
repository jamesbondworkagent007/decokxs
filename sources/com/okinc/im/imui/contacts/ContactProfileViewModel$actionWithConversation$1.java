package com.okinc.im.imui.contacts;

import com.okinc.im.imui.contacts.ContactProfileViewModel;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.sGF;
import o.sNF;

/* JADX INFO: loaded from: classes8.dex */
public final class ContactProfileViewModel$actionWithConversation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ContactProfileViewModel.ActionBar $conversationAction;
    int label;
    final /* synthetic */ ContactProfileViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactProfileViewModel$actionWithConversation$1(ContactProfileViewModel contactProfileViewModel, ContactProfileViewModel.ActionBar actionBar, Continuation<? super ContactProfileViewModel$actionWithConversation$1> continuation) {
        super(2, continuation);
        this.this$0 = contactProfileViewModel;
        this.$conversationAction = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContactProfileViewModel$actionWithConversation$1(this.this$0, this.$conversationAction, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContactProfileViewModel$actionWithConversation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.contacts.ContactProfileViewModel$actionWithConversation$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ContactProfileViewModel.ActionBar $conversationAction;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ ContactProfileViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ContactProfileViewModel contactProfileViewModel, ContactProfileViewModel.ActionBar actionBar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = contactProfileViewModel;
            this.$conversationAction = actionBar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$conversationAction, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x01d1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:104:0x01d2  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0131 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01ab  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            ContactProfileViewModel contactProfileViewModel;
            sNF.Application application;
            ContactProfileViewModel contactProfileViewModel2;
            sGF sgfKWHzl;
            sNF.StateListAnimator stateListAnimator;
            ContactProfileViewModel contactProfileViewModel3;
            sGF sgfKWHzl2;
            Object objM7377constructorimpl;
            Object obj2;
            Throwable thM7380exceptionOrNullimpl;
            ContactProfileViewModel contactProfileViewModel4;
            MutableSharedFlow mutableSharedFlow;
            ContactProfileViewModel.Activity.TaskStackBuilder taskStackBuilder;
            Object obj3;
            Object objM7377constructorimpl2;
            Object obj4;
            Throwable thM7380exceptionOrNullimpl2;
            ContactProfileViewModel contactProfileViewModel5;
            MutableSharedFlow mutableSharedFlow2;
            ContactProfileViewModel.Activity.TaskStackBuilder taskStackBuilder2;
            Object obj5;
            Object objCopydefault = C56442yFn.copydefault();
            switch (this.label) {
                case 0:
                    C56391yDq.AEQbTJ(obj);
                    OKConversation oKConversation = (OKConversation) this.this$0.DbNXlk.get("conversation");
                    if (oKConversation != null) {
                        ContactProfileViewModel.ActionBar actionBar = this.$conversationAction;
                        contactProfileViewModel = this.this$0;
                        if (Intrinsics.EZpvd(actionBar, ContactProfileViewModel.ActionBar.Activity.copydefault)) {
                            MutableSharedFlow mutableSharedFlow3 = contactProfileViewModel.AEQbTJ;
                            ContactProfileViewModel.Activity.LoaderManager loaderManager = new ContactProfileViewModel.Activity.LoaderManager(oKConversation);
                            this.label = 1;
                            if (mutableSharedFlow3.emit(loaderManager, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            Unit unit = Unit.INSTANCE;
                        } else if (actionBar instanceof ContactProfileViewModel.ActionBar.C0401ActionBar) {
                            try {
                                Result.Application application2 = Result.Companion;
                                InterfaceC35180nqU interfaceC35180nqU = contactProfileViewModel.gEmmrt;
                                if (interfaceC35180nqU == null || (sgfKWHzl = interfaceC35180nqU.KWHzl()) == null) {
                                    application = null;
                                    contactProfileViewModel2 = contactProfileViewModel;
                                    objM7377constructorimpl = Result.m7377constructorimpl(application);
                                    contactProfileViewModel = contactProfileViewModel2;
                                } else {
                                    String targetId = oKConversation.getTargetId();
                                    boolean zKWHzl = ((ContactProfileViewModel.ActionBar.C0401ActionBar) actionBar).KWHzl();
                                    this.L$0 = contactProfileViewModel;
                                    this.label = 2;
                                    obj = sgfKWHzl.OLrzqt(targetId, zKWHzl, this);
                                    if (obj == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    contactProfileViewModel2 = contactProfileViewModel;
                                    application = (sNF.Application) obj;
                                    objM7377constructorimpl = Result.m7377constructorimpl(application);
                                    contactProfileViewModel = contactProfileViewModel2;
                                }
                            } catch (Throwable th) {
                                th = th;
                                Result.Application application3 = Result.Companion;
                                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                            }
                            obj2 = objM7377constructorimpl;
                            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                            if (thM7380exceptionOrNullimpl != null) {
                                MutableSharedFlow mutableSharedFlow4 = contactProfileViewModel.AEQbTJ;
                                String strCopydefault = C44157sFk.copydefault(thM7380exceptionOrNullimpl);
                                ContactProfileViewModel.Activity.FragmentManager fragmentManager = new ContactProfileViewModel.Activity.FragmentManager(strCopydefault != null ? strCopydefault : "");
                                this.L$0 = contactProfileViewModel;
                                this.L$1 = obj2;
                                this.label = 3;
                                if (mutableSharedFlow4.emit(fragmentManager, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                            contactProfileViewModel4 = contactProfileViewModel;
                            if (Result.m7384isSuccessimpl(obj2)) {
                                this.L$0 = contactProfileViewModel4;
                                this.L$1 = obj2;
                                this.label = 4;
                                if (contactProfileViewModel4.AEQbTJ((Continuation<? super Unit>) this) == objCopydefault) {
                                    return objCopydefault;
                                }
                                mutableSharedFlow = contactProfileViewModel4.AEQbTJ;
                                taskStackBuilder = ContactProfileViewModel.Activity.TaskStackBuilder.copydefault;
                                this.L$0 = obj2;
                                this.L$1 = null;
                                this.label = 5;
                                if (mutableSharedFlow.emit(taskStackBuilder, this) != objCopydefault) {
                                    return objCopydefault;
                                }
                                obj3 = obj2;
                                obj2 = obj3;
                            }
                            Result.m7376boximpl(obj2);
                        } else {
                            if (!(actionBar instanceof ContactProfileViewModel.ActionBar.Application)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            try {
                                Result.Application application4 = Result.Companion;
                                InterfaceC35180nqU interfaceC35180nqU2 = contactProfileViewModel.gEmmrt;
                                if (interfaceC35180nqU2 == null || (sgfKWHzl2 = interfaceC35180nqU2.KWHzl()) == null) {
                                    stateListAnimator = null;
                                    contactProfileViewModel3 = contactProfileViewModel;
                                    objM7377constructorimpl2 = Result.m7377constructorimpl(stateListAnimator);
                                    contactProfileViewModel = contactProfileViewModel3;
                                } else {
                                    String targetId2 = oKConversation.getTargetId();
                                    boolean zEZpvd = ((ContactProfileViewModel.ActionBar.Application) actionBar).EZpvd();
                                    this.L$0 = contactProfileViewModel;
                                    this.label = 6;
                                    obj = sGF.Activity.changeTopStatus$default(sgfKWHzl2, targetId2, zEZpvd, false, this, 4, null);
                                    if (obj == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    contactProfileViewModel3 = contactProfileViewModel;
                                    stateListAnimator = (sNF.StateListAnimator) obj;
                                    objM7377constructorimpl2 = Result.m7377constructorimpl(stateListAnimator);
                                    contactProfileViewModel = contactProfileViewModel3;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                Result.Application application5 = Result.Companion;
                                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                            }
                            obj4 = objM7377constructorimpl2;
                            thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj4);
                            if (thM7380exceptionOrNullimpl2 != null) {
                                MutableSharedFlow mutableSharedFlow5 = contactProfileViewModel.AEQbTJ;
                                String strCopydefault2 = C44157sFk.copydefault(thM7380exceptionOrNullimpl2);
                                ContactProfileViewModel.Activity.FragmentManager fragmentManager2 = new ContactProfileViewModel.Activity.FragmentManager(strCopydefault2 != null ? strCopydefault2 : "");
                                this.L$0 = contactProfileViewModel;
                                this.L$1 = obj4;
                                this.label = 7;
                                if (mutableSharedFlow5.emit(fragmentManager2, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                            contactProfileViewModel5 = contactProfileViewModel;
                            if (Result.m7384isSuccessimpl(obj4)) {
                                this.L$0 = contactProfileViewModel5;
                                this.L$1 = obj4;
                                this.label = 8;
                                if (contactProfileViewModel5.AEQbTJ((Continuation<? super Unit>) this) == objCopydefault) {
                                    return objCopydefault;
                                }
                                mutableSharedFlow2 = contactProfileViewModel5.AEQbTJ;
                                taskStackBuilder2 = ContactProfileViewModel.Activity.TaskStackBuilder.copydefault;
                                this.L$0 = obj4;
                                this.L$1 = null;
                                this.label = 9;
                                if (mutableSharedFlow2.emit(taskStackBuilder2, this) != objCopydefault) {
                                    return objCopydefault;
                                }
                                obj5 = obj4;
                                obj4 = obj5;
                            }
                            Result.m7376boximpl(obj4);
                        }
                    }
                    return Unit.INSTANCE;
                case 1:
                    C56391yDq.AEQbTJ(obj);
                    Unit unit2 = Unit.INSTANCE;
                    return Unit.INSTANCE;
                case 2:
                    contactProfileViewModel2 = (ContactProfileViewModel) this.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        application = (sNF.Application) obj;
                        objM7377constructorimpl = Result.m7377constructorimpl(application);
                        contactProfileViewModel = contactProfileViewModel2;
                    } catch (Throwable th3) {
                        th = th3;
                        contactProfileViewModel = contactProfileViewModel2;
                        Result.Application application32 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    obj2 = objM7377constructorimpl;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    contactProfileViewModel4 = contactProfileViewModel;
                    if (Result.m7384isSuccessimpl(obj2)) {
                    }
                    Result.m7376boximpl(obj2);
                    return Unit.INSTANCE;
                case 3:
                    obj2 = this.L$1;
                    contactProfileViewModel4 = (ContactProfileViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    if (Result.m7384isSuccessimpl(obj2)) {
                    }
                    Result.m7376boximpl(obj2);
                    return Unit.INSTANCE;
                case 4:
                    obj2 = this.L$1;
                    contactProfileViewModel4 = (ContactProfileViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    mutableSharedFlow = contactProfileViewModel4.AEQbTJ;
                    taskStackBuilder = ContactProfileViewModel.Activity.TaskStackBuilder.copydefault;
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.label = 5;
                    if (mutableSharedFlow.emit(taskStackBuilder, this) != objCopydefault) {
                    }
                    break;
                case 5:
                    obj3 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    obj2 = obj3;
                    Result.m7376boximpl(obj2);
                    return Unit.INSTANCE;
                case 6:
                    contactProfileViewModel3 = (ContactProfileViewModel) this.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        stateListAnimator = (sNF.StateListAnimator) obj;
                        objM7377constructorimpl2 = Result.m7377constructorimpl(stateListAnimator);
                        contactProfileViewModel = contactProfileViewModel3;
                    } catch (Throwable th4) {
                        th = th4;
                        contactProfileViewModel = contactProfileViewModel3;
                        Result.Application application52 = Result.Companion;
                        objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    obj4 = objM7377constructorimpl2;
                    thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj4);
                    if (thM7380exceptionOrNullimpl2 != null) {
                    }
                    contactProfileViewModel5 = contactProfileViewModel;
                    if (Result.m7384isSuccessimpl(obj4)) {
                    }
                    Result.m7376boximpl(obj4);
                    return Unit.INSTANCE;
                case 7:
                    obj4 = this.L$1;
                    contactProfileViewModel5 = (ContactProfileViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    if (Result.m7384isSuccessimpl(obj4)) {
                    }
                    Result.m7376boximpl(obj4);
                    return Unit.INSTANCE;
                case 8:
                    obj4 = this.L$1;
                    contactProfileViewModel5 = (ContactProfileViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    mutableSharedFlow2 = contactProfileViewModel5.AEQbTJ;
                    taskStackBuilder2 = ContactProfileViewModel.Activity.TaskStackBuilder.copydefault;
                    this.L$0 = obj4;
                    this.L$1 = null;
                    this.label = 9;
                    if (mutableSharedFlow2.emit(taskStackBuilder2, this) != objCopydefault) {
                    }
                    break;
                case 9:
                    obj5 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    obj4 = obj5;
                    Result.m7376boximpl(obj4);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher coroutineDispatcher = this.this$0.AhwBna;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$conversationAction, null);
            this.label = 1;
            if (BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this) == objCopydefault) {
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
