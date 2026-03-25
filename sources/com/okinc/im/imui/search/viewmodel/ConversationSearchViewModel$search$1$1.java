package com.okinc.im.imui.search.viewmodel;

import com.okinc.im.imui.search.viewmodel.ConversationSearchViewModel;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC37420otW;
import o.sQY;

/* JADX INFO: loaded from: classes8.dex */
public final class ConversationSearchViewModel$search$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ConversationSearchViewModel.StateListAnimator $searchParams;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ConversationSearchViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationSearchViewModel$search$1$1(ConversationSearchViewModel conversationSearchViewModel, ConversationSearchViewModel.StateListAnimator stateListAnimator, Continuation<? super ConversationSearchViewModel$search$1$1> continuation) {
        super(2, continuation);
        this.this$0 = conversationSearchViewModel;
        this.$searchParams = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConversationSearchViewModel$search$1$1 conversationSearchViewModel$search$1$1 = new ConversationSearchViewModel$search$1$1(this.this$0, this.$searchParams, continuation);
        conversationSearchViewModel$search$1$1.L$0 = obj;
        return conversationSearchViewModel$search$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationSearchViewModel$search$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:8:0x0020, B:52:0x00f2, B:13:0x002c, B:46:0x00d4, B:16:0x0035, B:41:0x00c0, B:43:0x00c8, B:49:0x00e6, B:37:0x00af), top: B:66:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:8:0x0020, B:52:0x00f2, B:13:0x002c, B:46:0x00d4, B:16:0x0035, B:41:0x00c0, B:43:0x00c8, B:49:0x00e6, B:37:0x00af), top: B:66:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        ConversationSearchViewModel conversationSearchViewModel;
        MutableStateFlow mutableStateFlow;
        InterfaceC37420otW.ActionBar actionBar;
        ConversationSearchViewModel conversationSearchViewModel2;
        MutableStateFlow mutableStateFlow2;
        InterfaceC37420otW.Application application;
        List list;
        MutableStateFlow mutableStateFlow3;
        InterfaceC37420otW.ActionBar actionBar2;
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
                if (!Intrinsics.EZpvd((Object) this.this$0.AYXKKw, (Object) this.$searchParams.EZpvd())) {
                    this.this$0.AYXKKw = this.$searchParams.EZpvd();
                    ConversationSearchViewModel conversationSearchViewModel3 = this.this$0;
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (conversationSearchViewModel3.AEQbTJ((Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                if (this.$searchParams.EZpvd().length() != 0) {
                    ConversationSearchViewModel conversationSearchViewModel4 = this.this$0;
                    this.L$0 = null;
                    this.label = 2;
                    if (conversationSearchViewModel4.AEQbTJ((Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                    mutableStateFlow2 = this.this$0.copydefault;
                    application = InterfaceC37420otW.Application.AEQbTJ;
                    this.label = 3;
                    if (mutableStateFlow2.emit(application, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                ConversationSearchViewModel conversationSearchViewModel5 = this.this$0;
                ConversationSearchViewModel.StateListAnimator stateListAnimator = this.$searchParams;
                Result.Application application3 = Result.Companion;
                this.L$0 = conversationSearchViewModel5;
                this.label = 4;
                Object objAEQbTJ = conversationSearchViewModel5.AEQbTJ(stateListAnimator, (Continuation<? super List<sQY>>) this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                conversationSearchViewModel2 = conversationSearchViewModel5;
                obj = objAEQbTJ;
                list = (List) obj;
                if (!list.isEmpty()) {
                    this.L$0 = conversationSearchViewModel2;
                    this.label = 5;
                    if (conversationSearchViewModel2.AEQbTJ((Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                    mutableStateFlow3 = conversationSearchViewModel2.copydefault;
                    actionBar2 = InterfaceC37420otW.ActionBar.copydefault;
                    this.L$0 = null;
                    this.label = 6;
                    if (mutableStateFlow3.emit(actionBar2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    conversationSearchViewModel = this.this$0;
                    if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                        this.L$0 = conversationSearchViewModel;
                        this.label = 8;
                        if (conversationSearchViewModel.AEQbTJ((Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                        mutableStateFlow = conversationSearchViewModel.copydefault;
                        actionBar = InterfaceC37420otW.ActionBar.copydefault;
                        this.L$0 = null;
                        this.label = 9;
                        if (mutableStateFlow.emit(actionBar, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                this.L$0 = null;
                this.label = 7;
                if (conversationSearchViewModel2.OLrzqt((List<sQY>) list, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                conversationSearchViewModel = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                if (this.$searchParams.EZpvd().length() != 0) {
                }
                break;
            case 2:
                C56391yDq.AEQbTJ(obj);
                mutableStateFlow2 = this.this$0.copydefault;
                application = InterfaceC37420otW.Application.AEQbTJ;
                this.label = 3;
                if (mutableStateFlow2.emit(application, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 3:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 4:
                conversationSearchViewModel2 = (ConversationSearchViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                list = (List) obj;
                if (!list.isEmpty()) {
                }
                break;
            case 5:
                conversationSearchViewModel2 = (ConversationSearchViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableStateFlow3 = conversationSearchViewModel2.copydefault;
                actionBar2 = InterfaceC37420otW.ActionBar.copydefault;
                this.L$0 = null;
                this.label = 6;
                if (mutableStateFlow3.emit(actionBar2, this) == objCopydefault) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                conversationSearchViewModel = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                }
                return Unit.INSTANCE;
            case 6:
            case 7:
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                conversationSearchViewModel = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                }
                return Unit.INSTANCE;
            case 8:
                conversationSearchViewModel = (ConversationSearchViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableStateFlow = conversationSearchViewModel.copydefault;
                actionBar = InterfaceC37420otW.ActionBar.copydefault;
                this.L$0 = null;
                this.label = 9;
                if (mutableStateFlow.emit(actionBar, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 9:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
