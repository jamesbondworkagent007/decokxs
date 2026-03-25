package o;

import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.signdata.UserCancelledException;
import com.okinc.business.defi.biz.core.transaction.SignTransactionsUseCase$getPrivateKey$1;
import com.okinc.business.defi.biz.core.transaction.SignTransactionsUseCase$invoke$1;
import com.okinc.business.defi.biz.core.transaction.SignTransactionsUseCase$signAllTransactions$1;
import com.okinc.business.defi.biz.core.transaction.SignTransactionsUseCase$signTransactionsInternal$1;
import com.okinc.wallet.core.sign.evm.SigData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC9836bdB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bBv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8398bBv {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T extends AbstractC9836bdB> java.lang.Object EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull java.util.List<? extends T> list, boolean z, @NotNull Continuation<? super Result<C9843bdI<T>>> continuation) {
        SignTransactionsUseCase$invoke$1 signTransactionsUseCase$invoke$1;
        if (continuation instanceof SignTransactionsUseCase$invoke$1) {
            signTransactionsUseCase$invoke$1 = (SignTransactionsUseCase$invoke$1) continuation;
            int i = signTransactionsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                signTransactionsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                signTransactionsUseCase$invoke$1 = new SignTransactionsUseCase$invoke$1(this, continuation);
            }
        }
        SignTransactionsUseCase$invoke$1 signTransactionsUseCase$invoke$12 = signTransactionsUseCase$invoke$1;
        java.lang.Object objAEQbTJ = signTransactionsUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = signTransactionsUseCase$invoke$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                Result.Application application = Result.Companion;
                signTransactionsUseCase$invoke$12.label = 1;
                objAEQbTJ = AEQbTJ(fragmentManager, interfaceC9738bbJ, list, z, signTransactionsUseCase$invoke$12);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            return Result.m7377constructorimpl((C9843bdI) objAEQbTJ);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T extends AbstractC9836bdB> java.lang.Object AEQbTJ(androidx.fragment.app.FragmentManager fragmentManager, InterfaceC9738bbJ interfaceC9738bbJ, java.util.List<? extends T> list, boolean z, Continuation<? super C9843bdI<T>> continuation) throws java.lang.Throwable {
        SignTransactionsUseCase$signTransactionsInternal$1 signTransactionsUseCase$signTransactionsInternal$1;
        C8398bBv c8398bBv;
        SignAuthType signAuthType;
        if (continuation instanceof SignTransactionsUseCase$signTransactionsInternal$1) {
            signTransactionsUseCase$signTransactionsInternal$1 = (SignTransactionsUseCase$signTransactionsInternal$1) continuation;
            int i = signTransactionsUseCase$signTransactionsInternal$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                signTransactionsUseCase$signTransactionsInternal$1.label = i - Integer.MIN_VALUE;
            } else {
                signTransactionsUseCase$signTransactionsInternal$1 = new SignTransactionsUseCase$signTransactionsInternal$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = signTransactionsUseCase$signTransactionsInternal$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = signTransactionsUseCase$signTransactionsInternal$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            if (list.isEmpty()) {
                return new C9843bdI(null, yDY.AhwBna());
            }
            if (!interfaceC9738bbJ.aKErDB()) {
                throw KWHzl("current wallet doesn't support signTransactions");
            }
            signTransactionsUseCase$signTransactionsInternal$1.L$0 = this;
            signTransactionsUseCase$signTransactionsInternal$1.L$1 = interfaceC9738bbJ;
            signTransactionsUseCase$signTransactionsInternal$1.L$2 = list;
            signTransactionsUseCase$signTransactionsInternal$1.label = 1;
            objAEQbTJ = AEQbTJ(fragmentManager, interfaceC9738bbJ, z, signTransactionsUseCase$signTransactionsInternal$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c8398bBv = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                signAuthType = (SignAuthType) signTransactionsUseCase$signTransactionsInternal$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                return new C9843bdI(signAuthType, (java.util.List) objAEQbTJ);
            }
            list = (java.util.List) signTransactionsUseCase$signTransactionsInternal$1.L$2;
            interfaceC9738bbJ = (InterfaceC9738bbJ) signTransactionsUseCase$signTransactionsInternal$1.L$1;
            c8398bBv = (C8398bBv) signTransactionsUseCase$signTransactionsInternal$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        kotlin.Pair pair = (kotlin.Pair) objAEQbTJ;
        SignAuthType signAuthType2 = (SignAuthType) pair.component1();
        java.lang.String str = (java.lang.String) pair.component2();
        signTransactionsUseCase$signTransactionsInternal$1.L$0 = signAuthType2;
        signTransactionsUseCase$signTransactionsInternal$1.L$1 = null;
        signTransactionsUseCase$signTransactionsInternal$1.L$2 = null;
        signTransactionsUseCase$signTransactionsInternal$1.label = 2;
        objAEQbTJ = c8398bBv.AEQbTJ(interfaceC9738bbJ, str, list, signTransactionsUseCase$signTransactionsInternal$1);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        signAuthType = signAuthType2;
        return new C9843bdI(signAuthType, (java.util.List) objAEQbTJ);
    }

    /* JADX INFO: renamed from: o.bBv$ActionBar */
    public static final class ActionBar implements Function2<java.lang.String, java.lang.Boolean, Unit> {
        public final /* synthetic */ CancellableContinuation<kotlin.Pair<? extends SignAuthType, java.lang.String>> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Pair<? extends com.okinc.business.defi.api.model.tx.SignAuthType, java.lang.String>> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(CancellableContinuation<? super kotlin.Pair<? extends SignAuthType, java.lang.String>> cancellableContinuation) {
            this.copydefault = cancellableContinuation;
        }

        public final void copydefault(java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            if (this.copydefault.isActive()) {
                CancellableContinuation<kotlin.Pair<? extends SignAuthType, java.lang.String>> cancellableContinuation = this.copydefault;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56390yDp.OLrzqt(SignAuthType.Companion.KWHzl(java.lang.Boolean.valueOf(z)), str)));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(java.lang.String str, java.lang.Boolean bool) {
            copydefault(str, bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.bBv$TaskDescription */
    public static final class TaskDescription implements Function0<Unit> {
        public final /* synthetic */ C8398bBv AEQbTJ;
        public final /* synthetic */ CancellableContinuation<kotlin.Pair<? extends SignAuthType, java.lang.String>> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Pair<? extends com.okinc.business.defi.api.model.tx.SignAuthType, java.lang.String>> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(CancellableContinuation<? super kotlin.Pair<? extends SignAuthType, java.lang.String>> cancellableContinuation, C8398bBv c8398bBv) {
            this.copydefault = cancellableContinuation;
            this.AEQbTJ = c8398bBv;
        }

        public final void EZpvd() {
            if (this.copydefault.isActive()) {
                CancellableContinuation<kotlin.Pair<? extends SignAuthType, java.lang.String>> cancellableContinuation = this.copydefault;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(this.AEQbTJ.AEQbTJ())));
            }
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.bBv$Activity */
    public static final class Activity implements Function1<java.lang.String, Unit> {
        public final /* synthetic */ CancellableContinuation<kotlin.Pair<? extends SignAuthType, java.lang.String>> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Pair<? extends com.okinc.business.defi.api.model.tx.SignAuthType, java.lang.String>> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(CancellableContinuation<? super kotlin.Pair<? extends SignAuthType, java.lang.String>> cancellableContinuation) {
            this.EZpvd = cancellableContinuation;
        }

        public final void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (this.EZpvd.isActive()) {
                CancellableContinuation<kotlin.Pair<? extends SignAuthType, java.lang.String>> cancellableContinuation = this.EZpvd;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56390yDp.OLrzqt(SignAuthType.USER_VERIFIED, str)));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.String str) {
            AEQbTJ(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.bBv$StateListAnimator */
    public static final class StateListAnimator implements Function0<Unit> {
        public final /* synthetic */ C8398bBv AEQbTJ;
        public final /* synthetic */ CancellableContinuation<kotlin.Pair<? extends SignAuthType, java.lang.String>> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Pair<? extends com.okinc.business.defi.api.model.tx.SignAuthType, java.lang.String>> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(CancellableContinuation<? super kotlin.Pair<? extends SignAuthType, java.lang.String>> cancellableContinuation, C8398bBv c8398bBv) {
            this.EZpvd = cancellableContinuation;
            this.AEQbTJ = c8398bBv;
        }

        public final void AEQbTJ() {
            if (this.EZpvd.isActive()) {
                CancellableContinuation<kotlin.Pair<? extends SignAuthType, java.lang.String>> cancellableContinuation = this.EZpvd;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(this.AEQbTJ.AEQbTJ())));
            }
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            AEQbTJ();
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Type inference failed for r7v9. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r8v2. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15, types: [T] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, o.bBv] */
    /* JADX WARN: Type inference failed for: r15v2, types: [o.bBv] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [o.bBv] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d6 -> B:27:0x00e2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ed -> B:29:0x00f0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T extends AbstractC9836bdB> java.lang.Object AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ, java.lang.String str, java.util.List<? extends T> list, Continuation<? super java.util.List<C9842bdH<T>>> continuation) throws java.lang.Throwable {
        SignTransactionsUseCase$signAllTransactions$1 signTransactionsUseCase$signAllTransactions$1;
        C8398bBv c8398bBv;
        Ref.ObjectRef objectRef;
        ?? r15;
        java.util.Iterator it;
        InterfaceC9738bbJ interfaceC9738bbJ2;
        java.util.Collection collection;
        SignTransactionsUseCase$signAllTransactions$1 signTransactionsUseCase$signAllTransactions$12;
        java.lang.String str2;
        if (continuation instanceof SignTransactionsUseCase$signAllTransactions$1) {
            signTransactionsUseCase$signAllTransactions$1 = (SignTransactionsUseCase$signAllTransactions$1) continuation;
            int i = signTransactionsUseCase$signAllTransactions$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                signTransactionsUseCase$signAllTransactions$1.label = i - Integer.MIN_VALUE;
                c8398bBv = this;
            } else {
                c8398bBv = this;
                signTransactionsUseCase$signAllTransactions$1 = new SignTransactionsUseCase$signAllTransactions$1(c8398bBv, continuation);
            }
        }
        java.lang.Object obj = signTransactionsUseCase$signAllTransactions$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = signTransactionsUseCase$signAllTransactions$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = "";
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            objectRef = objectRef2;
            r15 = c8398bBv;
            it = list.iterator();
            interfaceC9738bbJ2 = interfaceC9738bbJ;
            collection = arrayList;
            signTransactionsUseCase$signAllTransactions$12 = signTransactionsUseCase$signAllTransactions$1;
            str2 = str;
            if (!it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.util.Collection collection2 = (java.util.Collection) signTransactionsUseCase$signAllTransactions$1.L$8;
            Ref.ObjectRef objectRef3 = (Ref.ObjectRef) signTransactionsUseCase$signAllTransactions$1.L$7;
            AbstractC9836bdB abstractC9836bdB = (AbstractC9836bdB) signTransactionsUseCase$signAllTransactions$1.L$6;
            java.util.Iterator it2 = (java.util.Iterator) signTransactionsUseCase$signAllTransactions$1.L$5;
            java.util.Collection collection3 = (java.util.Collection) signTransactionsUseCase$signAllTransactions$1.L$4;
            Ref.ObjectRef objectRef4 = (Ref.ObjectRef) signTransactionsUseCase$signAllTransactions$1.L$3;
            java.lang.String str3 = (java.lang.String) signTransactionsUseCase$signAllTransactions$1.L$2;
            InterfaceC9738bbJ interfaceC9738bbJ3 = (InterfaceC9738bbJ) signTransactionsUseCase$signAllTransactions$1.L$1;
            C8398bBv c8398bBv2 = (C8398bBv) signTransactionsUseCase$signAllTransactions$1.L$0;
            C56391yDq.AEQbTJ(obj);
            ?? r0 = obj;
            ?? r13 = c8398bBv2;
            objectRef3.element = r0;
            collection = collection2;
            it = it2;
            interfaceC9738bbJ2 = interfaceC9738bbJ3;
            ?? r152 = r13;
            signTransactionsUseCase$signAllTransactions$12 = signTransactionsUseCase$signAllTransactions$1;
            AbstractC9836bdB abstractC9836bdB2 = abstractC9836bdB;
            objectRef = objectRef4;
            str2 = str3;
            collection.add(r152.AEQbTJ(abstractC9836bdB2, (java.lang.String) objectRef.element));
            collection = collection3;
            r15 = r152;
            if (!it.hasNext()) {
                abstractC9836bdB2 = (AbstractC9836bdB) it.next();
                C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(abstractC9836bdB2.EZpvd());
                if (c10854bwMCopydefault == null) {
                    throw r15.KWHzl("chain[" + abstractC9836bdB2.EZpvd() + "] not found");
                }
                if (!c10854bwMCopydefault.QkdxfA()) {
                    throw r15.KWHzl("chain[" + abstractC9836bdB2.EZpvd() + "] doesn't support signTransactions");
                }
                if (((java.lang.CharSequence) objectRef.element).length() == 0) {
                    long jAEQbTJ = c10854bwMCopydefault.AEQbTJ();
                    signTransactionsUseCase$signAllTransactions$12.L$0 = r15;
                    signTransactionsUseCase$signAllTransactions$12.L$1 = interfaceC9738bbJ2;
                    signTransactionsUseCase$signAllTransactions$12.L$2 = str2;
                    signTransactionsUseCase$signAllTransactions$12.L$3 = objectRef;
                    signTransactionsUseCase$signAllTransactions$12.L$4 = collection;
                    signTransactionsUseCase$signAllTransactions$12.L$5 = it;
                    signTransactionsUseCase$signAllTransactions$12.L$6 = abstractC9836bdB2;
                    signTransactionsUseCase$signAllTransactions$12.L$7 = objectRef;
                    signTransactionsUseCase$signAllTransactions$12.L$8 = collection;
                    signTransactionsUseCase$signAllTransactions$12.label = 1;
                    java.lang.Object objCopydefault2 = r15.copydefault(interfaceC9738bbJ2, str2, jAEQbTJ, signTransactionsUseCase$signAllTransactions$12);
                    if (objCopydefault2 == objCopydefault) {
                        return objCopydefault;
                    }
                    interfaceC9738bbJ3 = interfaceC9738bbJ2;
                    str3 = str2;
                    signTransactionsUseCase$signAllTransactions$1 = signTransactionsUseCase$signAllTransactions$12;
                    collection2 = collection;
                    collection3 = collection2;
                    r0 = objCopydefault2;
                    objectRef3 = objectRef;
                    objectRef4 = objectRef3;
                    it2 = it;
                    r13 = r15;
                    abstractC9836bdB = abstractC9836bdB2;
                    objectRef3.element = r0;
                    collection = collection2;
                    it = it2;
                    interfaceC9738bbJ2 = interfaceC9738bbJ3;
                    ?? r1522 = r13;
                    signTransactionsUseCase$signAllTransactions$12 = signTransactionsUseCase$signAllTransactions$1;
                    AbstractC9836bdB abstractC9836bdB22 = abstractC9836bdB;
                    objectRef = objectRef4;
                    str2 = str3;
                    collection.add(r1522.AEQbTJ(abstractC9836bdB22, (java.lang.String) objectRef.element));
                    collection = collection3;
                    r15 = r1522;
                    if (!it.hasNext()) {
                        return (java.util.List) collection;
                    }
                } else {
                    collection3 = collection;
                    r1522 = r15;
                    collection.add(r1522.AEQbTJ(abstractC9836bdB22, (java.lang.String) objectRef.element));
                    collection = collection3;
                    r15 = r1522;
                    if (!it.hasNext()) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(InterfaceC9738bbJ interfaceC9738bbJ, java.lang.String str, long j, Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        SignTransactionsUseCase$getPrivateKey$1 signTransactionsUseCase$getPrivateKey$1;
        C8398bBv c8398bBv;
        if (continuation instanceof SignTransactionsUseCase$getPrivateKey$1) {
            signTransactionsUseCase$getPrivateKey$1 = (SignTransactionsUseCase$getPrivateKey$1) continuation;
            int i = signTransactionsUseCase$getPrivateKey$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                signTransactionsUseCase$getPrivateKey$1.label = i - Integer.MIN_VALUE;
            } else {
                signTransactionsUseCase$getPrivateKey$1 = new SignTransactionsUseCase$getPrivateKey$1(this, continuation);
            }
        }
        java.lang.Object objAwait = signTransactionsUseCase$getPrivateKey$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = signTransactionsUseCase$getPrivateKey$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAwait);
            Intrinsics.copydefault(interfaceC9738bbJ, "");
            AbstractC58260yxt abstractC58260yxtPrivateKeyForChainId$default = AbstractC12782ctV.privateKeyForChainId$default((cCS) interfaceC9738bbJ, str, j, 0, 4, null);
            signTransactionsUseCase$getPrivateKey$1.L$0 = this;
            signTransactionsUseCase$getPrivateKey$1.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtPrivateKeyForChainId$default, signTransactionsUseCase$getPrivateKey$1);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            c8398bBv = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c8398bBv = (C8398bBv) signTransactionsUseCase$getPrivateKey$1.L$0;
            C56391yDq.AEQbTJ(objAwait);
        }
        java.lang.CharSequence charSequence = (java.lang.CharSequence) objAwait;
        if (charSequence.length() != 0) {
            Intrinsics.checkNotNullExpressionValue(charSequence, "");
            return charSequence;
        }
        throw c8398bBv.KWHzl("failed to retrieve private key");
    }

    public final java.lang.IllegalStateException KWHzl(java.lang.String str) {
        return new java.lang.IllegalStateException(C10857bwP.AEQbTJ("SignTransactionsUseCase", str));
    }

    public final UserCancelledException AEQbTJ() {
        return new UserCancelledException(C10857bwP.AEQbTJ("SignTransactionsUseCase", "user cancelled"));
    }

    public final <T extends AbstractC9836bdB> C9842bdH<T> AEQbTJ(T t, java.lang.String str) {
        if (!(t instanceof AbstractC9836bdB.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        xYZ xyz = xYZ.KWHzl;
        AbstractC9836bdB.StateListAnimator stateListAnimator = (AbstractC9836bdB.StateListAnimator) t;
        long jKWHzl = stateListAnimator.KWHzl();
        java.lang.String strDjBIcL = stateListAnimator.djBIcL();
        java.lang.String strIsConnected = stateListAnimator.isConnected();
        java.lang.String strOLrzqt = stateListAnimator.OLrzqt();
        java.lang.String strAEQbTJ = stateListAnimator.AEQbTJ();
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        java.lang.String strEZpvd = xyz.EZpvd(str, jKWHzl, new SigData(strDjBIcL, strIsConnected, strOLrzqt, strAEQbTJ, stateListAnimator.copydefault(), stateListAnimator.AhwBna(), stateListAnimator.AYXKKw(), stateListAnimator.valueOf(), stateListAnimator.gEmmrt(), (java.util.List) null, 512, (DefaultConstructorMarker) null));
        return new C9842bdH<>(strEZpvd, xYW.AEQbTJ.AEQbTJ(strEZpvd, stateListAnimator.EZpvd()), t);
    }

    public final java.lang.Object AEQbTJ(androidx.fragment.app.FragmentManager fragmentManager, InterfaceC9738bbJ interfaceC9738bbJ, boolean z, Continuation<? super kotlin.Pair<? extends SignAuthType, java.lang.String>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (z) {
            Intrinsics.copydefault(interfaceC9738bbJ, "");
            new C14438dlU(fragmentManager, "signTransactionsUseCase", ((cCS) interfaceC9738bbJ).RlQdEF(), new ActionBar(cancellableContinuationImpl), new TaskDescription(cancellableContinuationImpl, this)).EZpvd();
        } else {
            new C14461dlr(fragmentManager, "signTransactionsUseCase", new Activity(cancellableContinuationImpl), new StateListAnimator(cancellableContinuationImpl, this), null, false, 48, null).EZpvd();
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }
}
