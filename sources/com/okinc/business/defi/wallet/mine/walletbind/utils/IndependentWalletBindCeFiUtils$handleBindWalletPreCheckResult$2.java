package com.okinc.business.defi.wallet.mine.walletbind.utils;

import com.okinc.account.api.model.wallet.BindWalletCheckResult;
import com.okinc.account.api.model.wallet.WalletAccount;
import com.okinc.account.api.model.wallet.WalletAccountStatus;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.wallet.mine.walletbind.utils.IndependentWalletBindCeFiUtils$handleBindWalletPreCheckResult$2;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.reactive.AwaitKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C10337bmZ;
import o.C12827cuN;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC58229yxO;
import o.InterfaceC58261yxu;
import o.InterfaceC9739bbK;
import o.gJK;

/* JADX INFO: loaded from: classes18.dex */
public final class IndependentWalletBindCeFiUtils$handleBindWalletPreCheckResult$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ Ref.ObjectRef<gJK> $bindState;
    final /* synthetic */ String $walletId;
    Object L$0;
    Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndependentWalletBindCeFiUtils$handleBindWalletPreCheckResult$2(String str, Ref.ObjectRef<gJK> objectRef, Continuation<? super IndependentWalletBindCeFiUtils$handleBindWalletPreCheckResult$2> continuation) {
        super(2, continuation);
        this.$walletId = str;
        this.$bindState = objectRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IndependentWalletBindCeFiUtils$handleBindWalletPreCheckResult$2(this.$walletId, this.$bindState, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((IndependentWalletBindCeFiUtils$handleBindWalletPreCheckResult$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0094 A[Catch: all -> 0x0157, CancellationException -> 0x017a, TryCatch #2 {CancellationException -> 0x017a, all -> 0x0157, blocks: (B:8:0x001d, B:56:0x00ff, B:58:0x0103, B:62:0x010f, B:63:0x0111, B:65:0x0115, B:68:0x0150, B:66:0x011d, B:13:0x0030, B:25:0x0088, B:26:0x008e, B:28:0x0094, B:32:0x00a5, B:34:0x00a9, B:35:0x00ad, B:37:0x00b3, B:41:0x00c4, B:43:0x00c8, B:44:0x00cc, B:46:0x00d2, B:50:0x00e3, B:52:0x00e8, B:67:0x0149, B:16:0x003e, B:22:0x005e, B:19:0x0049), top: B:79:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9 A[Catch: all -> 0x0157, CancellationException -> 0x017a, TryCatch #2 {CancellationException -> 0x017a, all -> 0x0157, blocks: (B:8:0x001d, B:56:0x00ff, B:58:0x0103, B:62:0x010f, B:63:0x0111, B:65:0x0115, B:68:0x0150, B:66:0x011d, B:13:0x0030, B:25:0x0088, B:26:0x008e, B:28:0x0094, B:32:0x00a5, B:34:0x00a9, B:35:0x00ad, B:37:0x00b3, B:41:0x00c4, B:43:0x00c8, B:44:0x00cc, B:46:0x00d2, B:50:0x00e3, B:52:0x00e8, B:67:0x0149, B:16:0x003e, B:22:0x005e, B:19:0x0049), top: B:79:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8 A[Catch: all -> 0x0157, CancellationException -> 0x017a, TryCatch #2 {CancellationException -> 0x017a, all -> 0x0157, blocks: (B:8:0x001d, B:56:0x00ff, B:58:0x0103, B:62:0x010f, B:63:0x0111, B:65:0x0115, B:68:0x0150, B:66:0x011d, B:13:0x0030, B:25:0x0088, B:26:0x008e, B:28:0x0094, B:32:0x00a5, B:34:0x00a9, B:35:0x00ad, B:37:0x00b3, B:41:0x00c4, B:43:0x00c8, B:44:0x00cc, B:46:0x00d2, B:50:0x00e3, B:52:0x00e8, B:67:0x0149, B:16:0x003e, B:22:0x005e, B:19:0x0049), top: B:79:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0103 A[Catch: all -> 0x0157, CancellationException -> 0x017a, TryCatch #2 {CancellationException -> 0x017a, all -> 0x0157, blocks: (B:8:0x001d, B:56:0x00ff, B:58:0x0103, B:62:0x010f, B:63:0x0111, B:65:0x0115, B:68:0x0150, B:66:0x011d, B:13:0x0030, B:25:0x0088, B:26:0x008e, B:28:0x0094, B:32:0x00a5, B:34:0x00a9, B:35:0x00ad, B:37:0x00b3, B:41:0x00c4, B:43:0x00c8, B:44:0x00cc, B:46:0x00d2, B:50:0x00e3, B:52:0x00e8, B:67:0x0149, B:16:0x003e, B:22:0x005e, B:19:0x0049), top: B:79:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0115 A[Catch: all -> 0x0157, CancellationException -> 0x017a, TryCatch #2 {CancellationException -> 0x017a, all -> 0x0157, blocks: (B:8:0x001d, B:56:0x00ff, B:58:0x0103, B:62:0x010f, B:63:0x0111, B:65:0x0115, B:68:0x0150, B:66:0x011d, B:13:0x0030, B:25:0x0088, B:26:0x008e, B:28:0x0094, B:32:0x00a5, B:34:0x00a9, B:35:0x00ad, B:37:0x00b3, B:41:0x00c4, B:43:0x00c8, B:44:0x00cc, B:46:0x00d2, B:50:0x00e3, B:52:0x00e8, B:67:0x0149, B:16:0x003e, B:22:0x005e, B:19:0x0049), top: B:79:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011d A[Catch: all -> 0x0157, CancellationException -> 0x017a, TryCatch #2 {CancellationException -> 0x017a, all -> 0x0157, blocks: (B:8:0x001d, B:56:0x00ff, B:58:0x0103, B:62:0x010f, B:63:0x0111, B:65:0x0115, B:68:0x0150, B:66:0x011d, B:13:0x0030, B:25:0x0088, B:26:0x008e, B:28:0x0094, B:32:0x00a5, B:34:0x00a9, B:35:0x00ad, B:37:0x00b3, B:41:0x00c4, B:43:0x00c8, B:44:0x00cc, B:46:0x00d2, B:50:0x00e3, B:52:0x00e8, B:67:0x0149, B:16:0x003e, B:22:0x005e, B:19:0x0049), top: B:79:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149 A[Catch: all -> 0x0157, CancellationException -> 0x017a, TryCatch #2 {CancellationException -> 0x017a, all -> 0x0157, blocks: (B:8:0x001d, B:56:0x00ff, B:58:0x0103, B:62:0x010f, B:63:0x0111, B:65:0x0115, B:68:0x0150, B:66:0x011d, B:13:0x0030, B:25:0x0088, B:26:0x008e, B:28:0x0094, B:32:0x00a5, B:34:0x00a9, B:35:0x00ad, B:37:0x00b3, B:41:0x00c4, B:43:0x00c8, B:44:0x00cc, B:46:0x00d2, B:50:0x00e3, B:52:0x00e8, B:67:0x0149, B:16:0x003e, B:22:0x005e, B:19:0x0049), top: B:79:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, o.gJK$Dialog] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, o.gJK$Fragment] */
    /* JADX WARN: Type inference failed for: r3v8, types: [T, o.gJK$PendingIntent] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, o.gJK$Application] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        String str;
        Ref.ObjectRef<gJK> objectRef;
        Object objAwait;
        Iterator it;
        Object next;
        AbstractC12782ctV abstractC12782ctV;
        Object objWithContext;
        AbstractC12782ctV abstractC12782ctV2;
        Object next2;
        Object next3;
        Result result;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        Object obj2 = null;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            str = this.$walletId;
            objectRef = this.$bindState;
            Result.Application application2 = Result.Companion;
            AbstractC58185ywX abstractC58185ywXEnsureInitialized$default = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null);
            this.L$0 = str;
            this.L$1 = objectRef;
            this.label = 1;
            if (AwaitKt.awaitFirst(abstractC58185ywXEnsureInitialized$default, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC12782ctV2 = (AbstractC12782ctV) this.L$1;
                    objectRef = (Ref.ObjectRef) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objWithContext = obj;
                    result = (Result) objWithContext;
                    if (result != null) {
                        Object objM7386unboximpl = result.m7386unboximpl();
                        if (!Result.m7383isFailureimpl(objM7386unboximpl)) {
                            obj2 = objM7386unboximpl;
                        }
                        obj2 = (BindWalletCheckResult) obj2;
                    }
                    if (!(obj2 instanceof BindWalletCheckResult.AlreadyBound)) {
                        objectRef.element = new gJK.PendingIntent(abstractC12782ctV2);
                    } else {
                        objectRef.element = new gJK.Fragment(new WalletAccount(abstractC12782ctV2.DbNXlk(), abstractC12782ctV2.AEQbTJ(), abstractC12782ctV2.AYXKKw(), null, null, WalletAccountStatus.NOT_BOUND, null, null, false, false, null, 2008, null));
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    Ref.ObjectRef<gJK> objectRef2 = this.$bindState;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        objectRef2.element = new gJK.Application(thM7380exceptionOrNullimpl.getMessage());
                    }
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                objectRef = (Ref.ObjectRef) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAwait = obj;
                List list = (List) objAwait;
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((AbstractC12782ctV) next).QwvEab() == WalletType.HDWallet) {
                        break;
                    }
                }
                abstractC12782ctV = (AbstractC12782ctV) next;
                if (abstractC12782ctV == null) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        if (((AbstractC12782ctV) next2).QwvEab() == WalletType.KeyWallet) {
                            break;
                        }
                    }
                    abstractC12782ctV = (AbstractC12782ctV) next2;
                    if (abstractC12782ctV == null) {
                        Iterator it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it3.next();
                            if (((AbstractC12782ctV) next3).QwvEab() == WalletType.TonWallet) {
                                break;
                            }
                        }
                        abstractC12782ctV = (AbstractC12782ctV) next3;
                    }
                }
                if (abstractC12782ctV == null) {
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    IndependentWalletBindCeFiUtils$handleBindWalletPreCheckResult$2$1$bindWalletCheckResult$1 independentWalletBindCeFiUtils$handleBindWalletPreCheckResult$2$1$bindWalletCheckResult$1 = new IndependentWalletBindCeFiUtils$handleBindWalletPreCheckResult$2$1$bindWalletCheckResult$1(abstractC12782ctV, null);
                    this.L$0 = objectRef;
                    this.L$1 = abstractC12782ctV;
                    this.label = 3;
                    objWithContext = BuildersKt.withContext(io2, independentWalletBindCeFiUtils$handleBindWalletPreCheckResult$2$1$bindWalletCheckResult$1, this);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC12782ctV2 = abstractC12782ctV;
                    result = (Result) objWithContext;
                    if (result != null) {
                    }
                    if (!(obj2 instanceof BindWalletCheckResult.AlreadyBound)) {
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    Ref.ObjectRef<gJK> objectRef22 = this.$bindState;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                objectRef.element = new gJK.Dialog(false);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                Ref.ObjectRef<gJK> objectRef222 = this.$bindState;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            objectRef = (Ref.ObjectRef) this.L$1;
            str = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, false);
        final Function1 function1 = new Function1() { // from class: o.fAs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return CollectionsKt.KWHzl((AbstractC12782ctV) obj3);
            }
        };
        InterfaceC58261yxu interfaceC58261yxuCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.fAv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj3) {
                return IndependentWalletBindCeFiUtils$handleBindWalletPreCheckResult$2.invokeSuspend$lambda$5$lambda$1(function1, obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58261yxuCopydefault, "");
        this.L$0 = objectRef;
        this.L$1 = null;
        this.label = 2;
        objAwait = RxAwaitKt.await(interfaceC58261yxuCopydefault, this);
        if (objAwait == objCopydefault) {
            return objCopydefault;
        }
        List list2 = (List) objAwait;
        it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        abstractC12782ctV = (AbstractC12782ctV) next;
        if (abstractC12782ctV == null) {
        }
        if (abstractC12782ctV == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$5$lambda$1(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }
}
