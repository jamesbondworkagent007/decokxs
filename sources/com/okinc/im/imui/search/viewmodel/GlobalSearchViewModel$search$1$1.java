package com.okinc.im.imui.search.viewmodel;

import com.okinc.im.imui.search.viewmodel.GlobalSearchViewModel;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC37420otW;
import o.sQU;
import o.sQY;

/* JADX INFO: loaded from: classes8.dex */
public final class GlobalSearchViewModel$search$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $keyword;
    final /* synthetic */ int $querySize;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ GlobalSearchViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSearchViewModel$search$1$1(GlobalSearchViewModel globalSearchViewModel, String str, int i, Continuation<? super GlobalSearchViewModel$search$1$1> continuation) {
        super(2, continuation);
        this.this$0 = globalSearchViewModel;
        this.$keyword = str;
        this.$querySize = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GlobalSearchViewModel$search$1$1 globalSearchViewModel$search$1$1 = new GlobalSearchViewModel$search$1$1(this.this$0, this.$keyword, this.$querySize, continuation);
        globalSearchViewModel$search$1$1.L$0 = obj;
        return globalSearchViewModel$search$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GlobalSearchViewModel$search$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0140 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        GlobalSearchViewModel globalSearchViewModel;
        String str;
        int i;
        Object objCopydefault;
        GlobalSearchViewModel globalSearchViewModel2;
        List list;
        MutableSharedFlow mutableSharedFlow;
        List list2;
        MutableStateFlow mutableStateFlow;
        Object objCopydefault2 = C56442yFn.copydefault();
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                if (!Intrinsics.EZpvd((Object) this.this$0.valueOf, (Object) this.$keyword)) {
                    this.this$0.valueOf = this.$keyword;
                    this.this$0.djBIcL = Long.MAX_VALUE;
                }
                this.this$0.fetchVPNInfo.set("SAVED_STATE_KEY_CHATS_AND_CONTACTS_LOAD_MORE", C56443yFo.KWHzl(false));
                this.this$0.fetchVPNInfo.set("SAVED_STATE_KEY_MESSAGES_LOAD_MORE", C56443yFo.KWHzl(false));
                MutableStateFlow mutableStateFlow2 = this.this$0.OLrzqt;
                Boolean boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = coroutineScope;
                this.label = 1;
                if (mutableStateFlow2.emit(boolKWHzl, this) == objCopydefault2) {
                    return objCopydefault2;
                }
                this.this$0.fetchVPNInfo.set("SAVED_STATE_KEY_SEARCH_KEY_WORD", this.$keyword);
                if (this.$keyword.length() != 0) {
                    MutableStateFlow mutableStateFlow3 = this.this$0.AYXKKw;
                    InterfaceC37420otW.Application application2 = InterfaceC37420otW.Application.AEQbTJ;
                    this.L$0 = null;
                    this.label = 2;
                    if (mutableStateFlow3.emit(application2, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    return Unit.INSTANCE;
                }
                globalSearchViewModel = this.this$0;
                str = this.$keyword;
                i = this.$querySize;
                Result.Application application3 = Result.Companion;
                GlobalSearchViewModel.Activity activity = new GlobalSearchViewModel.Activity(str, C56443yFo.AEQbTJ(i));
                this.L$0 = globalSearchViewModel;
                this.L$1 = str;
                this.I$0 = i;
                this.label = 3;
                obj = globalSearchViewModel.EZpvd(activity, (Continuation<? super List<sQU>>) this);
                if (obj == objCopydefault2) {
                    return objCopydefault2;
                }
                List list3 = (List) obj;
                GlobalSearchViewModel.Application application4 = new GlobalSearchViewModel.Application(str, C56443yFo.AEQbTJ(i));
                this.L$0 = globalSearchViewModel;
                this.L$1 = list3;
                this.label = 4;
                objCopydefault = globalSearchViewModel.copydefault(application4, (Continuation<? super List<sQY>>) this);
                if (objCopydefault != objCopydefault2) {
                    return objCopydefault2;
                }
                globalSearchViewModel2 = globalSearchViewModel;
                list = list3;
                obj = objCopydefault;
                List list4 = (List) obj;
                mutableSharedFlow = globalSearchViewModel2.AEQbTJ;
                this.L$0 = globalSearchViewModel2;
                this.L$1 = list4;
                this.label = 5;
                if (mutableSharedFlow.emit(list, this) != objCopydefault2) {
                    return objCopydefault2;
                }
                list2 = list4;
                mutableStateFlow = globalSearchViewModel2.AhwBna;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 6;
                if (mutableStateFlow.emit(list2, this) == objCopydefault2) {
                    return objCopydefault2;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                GlobalSearchViewModel globalSearchViewModel3 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                    MutableStateFlow mutableStateFlow4 = globalSearchViewModel3.AYXKKw;
                    InterfaceC37420otW.ActionBar actionBar = InterfaceC37420otW.ActionBar.copydefault;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 7;
                    if (mutableStateFlow4.emit(actionBar, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                this.this$0.fetchVPNInfo.set("SAVED_STATE_KEY_SEARCH_KEY_WORD", this.$keyword);
                if (this.$keyword.length() != 0) {
                }
                break;
            case 2:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 3:
                i = this.I$0;
                str = (String) this.L$1;
                globalSearchViewModel = (GlobalSearchViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                List list32 = (List) obj;
                GlobalSearchViewModel.Application application42 = new GlobalSearchViewModel.Application(str, C56443yFo.AEQbTJ(i));
                this.L$0 = globalSearchViewModel;
                this.L$1 = list32;
                this.label = 4;
                objCopydefault = globalSearchViewModel.copydefault(application42, (Continuation<? super List<sQY>>) this);
                if (objCopydefault != objCopydefault2) {
                }
                break;
            case 4:
                list = (List) this.L$1;
                globalSearchViewModel2 = (GlobalSearchViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                List list42 = (List) obj;
                mutableSharedFlow = globalSearchViewModel2.AEQbTJ;
                this.L$0 = globalSearchViewModel2;
                this.L$1 = list42;
                this.label = 5;
                if (mutableSharedFlow.emit(list, this) != objCopydefault2) {
                }
                break;
            case 5:
                list2 = (List) this.L$1;
                globalSearchViewModel2 = (GlobalSearchViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableStateFlow = globalSearchViewModel2.AhwBna;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 6;
                if (mutableStateFlow.emit(list2, this) == objCopydefault2) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                GlobalSearchViewModel globalSearchViewModel32 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                }
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                GlobalSearchViewModel globalSearchViewModel322 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
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
