package com.okinc.business.defi.wallet.mine.walletbind.viewmodel;

import androidx.fragment.app.FragmentManager;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C19334fzN;
import o.C19339fzS;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletBindViewModel$unbindCeFi$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ String $accountName;
    final /* synthetic */ FragmentManager $fragmentManager;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WalletBindViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBindViewModel$unbindCeFi$1(WalletBindViewModel walletBindViewModel, String str, String str2, FragmentManager fragmentManager, Continuation<? super WalletBindViewModel$unbindCeFi$1> continuation) {
        super(2, continuation);
        this.this$0 = walletBindViewModel;
        this.$accountId = str;
        this.$accountName = str2;
        this.$fragmentManager = fragmentManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletBindViewModel$unbindCeFi$1 walletBindViewModel$unbindCeFi$1 = new WalletBindViewModel$unbindCeFi$1(this.this$0, this.$accountId, this.$accountName, this.$fragmentManager, continuation);
        walletBindViewModel$unbindCeFi$1.L$0 = obj;
        return walletBindViewModel$unbindCeFi$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletBindViewModel$unbindCeFi$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:8:0x0020, B:55:0x0101, B:57:0x0105, B:13:0x002e, B:48:0x00cb, B:50:0x00d1, B:52:0x00ef, B:16:0x0037, B:27:0x0089, B:31:0x0092, B:33:0x0096, B:35:0x009a, B:36:0x009e, B:38:0x00a2, B:40:0x00aa, B:43:0x00bc, B:46:0x00c5, B:47:0x00ca, B:23:0x0070), top: B:72:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:8:0x0020, B:55:0x0101, B:57:0x0105, B:13:0x002e, B:48:0x00cb, B:50:0x00d1, B:52:0x00ef, B:16:0x0037, B:27:0x0089, B:31:0x0092, B:33:0x0096, B:35:0x009a, B:36:0x009e, B:38:0x00a2, B:40:0x00aa, B:43:0x00bc, B:46:0x00c5, B:47:0x00ca, B:23:0x0070), top: B:72:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0164 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objEZpvd;
        Object objM7386unboximpl;
        WalletBindViewModel walletBindViewModel;
        C19334fzN.TaskDescription taskDescription;
        Throwable thM7380exceptionOrNullimpl2;
        Unit unit;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                MutableSharedFlow mutableSharedFlow2 = this.this$0.isConnected;
                Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                this.L$0 = coroutineScope;
                this.label = 1;
                if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                    return objCopydefault;
                }
                String str = this.$accountId;
                String str2 = this.$accountName;
                FragmentManager fragmentManager = this.$fragmentManager;
                WalletBindViewModel walletBindViewModel2 = this.this$0;
                Result.Application application2 = Result.Companion;
                C19334fzN.StateListAnimator stateListAnimator = new C19334fzN.StateListAnimator(str, str2, fragmentManager);
                C19334fzN c19334fzN = walletBindViewModel2.ORxRYg;
                this.L$0 = walletBindViewModel2;
                this.label = 2;
                objEZpvd = c19334fzN.EZpvd(stateListAnimator, this);
                if (objEZpvd != objCopydefault) {
                    return objCopydefault;
                }
                objM7386unboximpl = objEZpvd;
                walletBindViewModel = walletBindViewModel2;
                taskDescription = (C19334fzN.TaskDescription) (!Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl);
                if (taskDescription != null) {
                    if (taskDescription instanceof C19334fzN.TaskDescription.Application) {
                        walletBindViewModel.getFieldNames();
                    } else if (taskDescription instanceof C19334fzN.TaskDescription.StateListAnimator) {
                        String strEZpvd = ((C19334fzN.TaskDescription.StateListAnimator) taskDescription).EZpvd();
                        if (strEZpvd != null) {
                            MutableSharedFlow mutableSharedFlow3 = walletBindViewModel.ejfBZ;
                            this.L$0 = walletBindViewModel;
                            this.L$1 = objM7386unboximpl;
                            this.label = 3;
                            if (mutableSharedFlow3.emit(strEZpvd, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    } else if (!Intrinsics.EZpvd(taskDescription, C19334fzN.TaskDescription.C0851TaskDescription.copydefault)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl2 != null) {
                    C19339fzS.EZpvd.OLrzqt("[UnBind Wallet]", "fail to unbind wallet account, error=" + thM7380exceptionOrNullimpl2.getMessage());
                    String message = thM7380exceptionOrNullimpl2.getMessage();
                    if (message != null) {
                        MutableSharedFlow mutableSharedFlow4 = walletBindViewModel.ejfBZ;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 4;
                        if (mutableSharedFlow4.emit(message, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        unit = Unit.INSTANCE;
                        objM7377constructorimpl = Result.m7377constructorimpl(unit);
                        WalletBindViewModel walletBindViewModel3 = this.this$0;
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl != null) {
                            C19339fzS.EZpvd.OLrzqt("[UnBind Wallet]", "fail to unbind wallet account, error=" + thM7380exceptionOrNullimpl.getMessage());
                            String message2 = thM7380exceptionOrNullimpl.getMessage();
                            if (message2 != null) {
                                MutableSharedFlow mutableSharedFlow5 = walletBindViewModel3.ejfBZ;
                                this.L$0 = objM7377constructorimpl;
                                this.L$1 = null;
                                this.label = 5;
                                if (mutableSharedFlow5.emit(message2, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                        }
                        mutableSharedFlow = this.this$0.isConnected;
                        boolKWHzl = C56443yFo.KWHzl(false);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 6;
                        if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                }
                unit = null;
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                WalletBindViewModel walletBindViewModel32 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.isConnected;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 6;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                String str3 = this.$accountId;
                String str22 = this.$accountName;
                FragmentManager fragmentManager2 = this.$fragmentManager;
                WalletBindViewModel walletBindViewModel22 = this.this$0;
                Result.Application application22 = Result.Companion;
                C19334fzN.StateListAnimator stateListAnimator2 = new C19334fzN.StateListAnimator(str3, str22, fragmentManager2);
                C19334fzN c19334fzN2 = walletBindViewModel22.ORxRYg;
                this.L$0 = walletBindViewModel22;
                this.label = 2;
                objEZpvd = c19334fzN2.EZpvd(stateListAnimator2, this);
                if (objEZpvd != objCopydefault) {
                }
                break;
            case 2:
                WalletBindViewModel walletBindViewModel4 = (WalletBindViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                walletBindViewModel = walletBindViewModel4;
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                taskDescription = (C19334fzN.TaskDescription) (!Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl);
                if (taskDescription != null) {
                }
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                unit = null;
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                WalletBindViewModel walletBindViewModel322 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.isConnected;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 6;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 3:
                objM7386unboximpl = this.L$1;
                walletBindViewModel = (WalletBindViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                unit = null;
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                WalletBindViewModel walletBindViewModel3222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.isConnected;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 6;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 4:
                C56391yDq.AEQbTJ(obj);
                unit = Unit.INSTANCE;
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                WalletBindViewModel walletBindViewModel32222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.isConnected;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 6;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 5:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = this.this$0.isConnected;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 6;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
