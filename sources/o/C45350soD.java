package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.center.bean.NetworkChain;
import com.okinc.okex.center.bean.TroubleshootResultPageData;
import com.okinc.okex.center.bean.TxnContextualModel;
import com.okinc.okex.center.bean.TxnCurrencyBean;
import com.okinc.okex.common.usecase.SupportTroubleshootUseCase$getCurrencyList$1;
import com.okinc.okex.common.usecase.SupportTroubleshootUseCase$getCurrencyList$2$1$1$1;
import com.okinc.okex.common.usecase.SupportTroubleshootUseCase$getTroubleshootingResult$1;
import com.okinc.okex.common.usecase.SupportTroubleshootUseCase$getTroubleshootingResult$result$1$1$1;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DelayKt;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.soD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45350soD {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC44921sfz OLrzqt;
    public final InterfaceC56387yDm copydefault;

    @yCM
    public C45350soD(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC44921sfz interfaceC44921sfz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC44921sfz, "");
        this.AEQbTJ = coroutineDispatcher;
        this.OLrzqt = interfaceC44921sfz;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.soJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45350soD.AEQbTJ();
            }
        });
    }

    public final Regex KWHzl() {
        return (Regex) this.copydefault.getValue();
    }

    public static final Regex AEQbTJ() {
        return new Regex("[ ?#&/\\\\:;\"'%><~{}\\[\\]+!@\\$\\^|]+");
    }

    /* JADX INFO: renamed from: o.soD$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.soD.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return !KWHzl().containsMatchIn(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: T */
    /* JADX WARN: Can't wrap try/catch for region: R(5:62|22|60|23|(1:25)(7:26|27|(2:32|33)(1:31)|37|38|44|(2:46|47)(4:48|(2:50|(1:52))|53|(2:54|55)(0)))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e8, code lost:
    
        r9 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:29:0x00a3, B:32:0x00b6], limit reached: 62 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r13v4, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Exception] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x013a -> B:53:0x014f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x014c -> B:53:0x014f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super Result<? extends java.util.List<TxnCurrencyBean>>> continuation) throws java.lang.Throwable {
        SupportTroubleshootUseCase$getCurrencyList$1 supportTroubleshootUseCase$getCurrencyList$1;
        C45350soD c45350soD;
        Ref.ObjectRef objectRef;
        C45350soD c45350soD2;
        int i;
        int i2;
        int i3;
        AbstractC43419rot actionBar;
        int i4;
        java.lang.Throwable th;
        java.lang.Object objM7377constructorimpl;
        ?? M7380exceptionOrNullimpl;
        ResponseData responseData;
        if (continuation instanceof SupportTroubleshootUseCase$getCurrencyList$1) {
            supportTroubleshootUseCase$getCurrencyList$1 = (SupportTroubleshootUseCase$getCurrencyList$1) continuation;
            int i5 = supportTroubleshootUseCase$getCurrencyList$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                supportTroubleshootUseCase$getCurrencyList$1.label = i5 - Integer.MIN_VALUE;
                c45350soD = this;
            } else {
                c45350soD = this;
                supportTroubleshootUseCase$getCurrencyList$1 = new SupportTroubleshootUseCase$getCurrencyList$1(c45350soD, continuation);
            }
        }
        java.lang.Object objWithContext = supportTroubleshootUseCase$getCurrencyList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i6 = supportTroubleshootUseCase$getCurrencyList$1.label;
        if (i6 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = new java.lang.Exception("Error when calling transaction API");
            objectRef = objectRef2;
            c45350soD2 = c45350soD;
            i = 10;
            i2 = 0;
            if (i2 < i) {
            }
        } else if (i6 == 1) {
            i2 = supportTroubleshootUseCase$getCurrencyList$1.I$2;
            i3 = supportTroubleshootUseCase$getCurrencyList$1.I$1;
            i = supportTroubleshootUseCase$getCurrencyList$1.I$0;
            objectRef = (Ref.ObjectRef) supportTroubleshootUseCase$getCurrencyList$1.L$1;
            c45350soD2 = (C45350soD) supportTroubleshootUseCase$getCurrencyList$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable th3 = th2;
                try {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th3);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th3));
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    int i7 = i3;
                    i4 = i2;
                    i2 = i7;
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    M7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (M7380exceptionOrNullimpl != 0) {
                    }
                }
                objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) actionBar.AEQbTJ());
                int i8 = i3;
                i4 = i2;
                i2 = i8;
                M7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (M7380exceptionOrNullimpl != 0) {
                }
            }
            responseData = (ResponseData) objWithContext;
            if (responseData.getCode() != 0) {
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) actionBar.AEQbTJ());
            int i82 = i3;
            i4 = i2;
            i2 = i82;
            M7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (M7380exceptionOrNullimpl != 0) {
            }
        } else {
            if (i6 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = supportTroubleshootUseCase$getCurrencyList$1.I$1;
            int i9 = supportTroubleshootUseCase$getCurrencyList$1.I$0;
            Ref.ObjectRef objectRef3 = (Ref.ObjectRef) supportTroubleshootUseCase$getCurrencyList$1.L$1;
            C45350soD c45350soD3 = (C45350soD) supportTroubleshootUseCase$getCurrencyList$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            c45350soD2 = c45350soD3;
            objectRef = objectRef3;
            i = i9;
            i2++;
            if (i2 < i) {
                try {
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    i4 = i2;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    M7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (M7380exceptionOrNullimpl != 0) {
                    }
                }
                Result.Application application3 = Result.Companion;
                CoroutineDispatcher coroutineDispatcher = c45350soD2.AEQbTJ;
                SupportTroubleshootUseCase$getCurrencyList$2$1$1$1 supportTroubleshootUseCase$getCurrencyList$2$1$1$1 = new SupportTroubleshootUseCase$getCurrencyList$2$1$1$1(c45350soD2, null);
                supportTroubleshootUseCase$getCurrencyList$1.L$0 = c45350soD2;
                supportTroubleshootUseCase$getCurrencyList$1.L$1 = objectRef;
                supportTroubleshootUseCase$getCurrencyList$1.I$0 = i;
                supportTroubleshootUseCase$getCurrencyList$1.I$1 = i2;
                supportTroubleshootUseCase$getCurrencyList$1.I$2 = i2;
                supportTroubleshootUseCase$getCurrencyList$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, supportTroubleshootUseCase$getCurrencyList$2$1$1$1, supportTroubleshootUseCase$getCurrencyList$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                i3 = i2;
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
                objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) actionBar.AEQbTJ());
                int i822 = i3;
                i4 = i2;
                i2 = i822;
                M7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (M7380exceptionOrNullimpl != 0) {
                    Result.Application application4 = Result.Companion;
                    return Result.m7377constructorimpl((java.util.List) objM7377constructorimpl);
                }
                objectRef.element = M7380exceptionOrNullimpl;
                if (i4 < 9) {
                    supportTroubleshootUseCase$getCurrencyList$1.L$0 = c45350soD2;
                    supportTroubleshootUseCase$getCurrencyList$1.L$1 = objectRef;
                    supportTroubleshootUseCase$getCurrencyList$1.I$0 = i;
                    supportTroubleshootUseCase$getCurrencyList$1.I$1 = i2;
                    supportTroubleshootUseCase$getCurrencyList$1.label = 2;
                    if (DelayKt.delay(1000L, supportTroubleshootUseCase$getCurrencyList$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                i2++;
                if (i2 < i) {
                    Result.Application application5 = Result.Companion;
                    return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) objectRef.element));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(int i, java.lang.Integer num, java.lang.String str, @NotNull Continuation<? super Result<TroubleshootResultPageData>> continuation) throws java.lang.Throwable {
        SupportTroubleshootUseCase$getTroubleshootingResult$1 supportTroubleshootUseCase$getTroubleshootingResult$1;
        java.lang.Object objM7377constructorimpl;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        ResponseData responseData;
        if (continuation instanceof SupportTroubleshootUseCase$getTroubleshootingResult$1) {
            supportTroubleshootUseCase$getTroubleshootingResult$1 = (SupportTroubleshootUseCase$getTroubleshootingResult$1) continuation;
            int i2 = supportTroubleshootUseCase$getTroubleshootingResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                supportTroubleshootUseCase$getTroubleshootingResult$1.label = i2 - Integer.MIN_VALUE;
            } else {
                supportTroubleshootUseCase$getTroubleshootingResult$1 = new SupportTroubleshootUseCase$getTroubleshootingResult$1(this, continuation);
            }
        }
        SupportTroubleshootUseCase$getTroubleshootingResult$1 supportTroubleshootUseCase$getTroubleshootingResult$12 = supportTroubleshootUseCase$getTroubleshootingResult$1;
        java.lang.Object objWithContext = supportTroubleshootUseCase$getTroubleshootingResult$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = supportTroubleshootUseCase$getTroubleshootingResult$12.label;
        try {
            try {
                if (i3 == 0) {
                    C56391yDq.AEQbTJ(objWithContext);
                    Result.Application application = Result.Companion;
                    CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
                    SupportTroubleshootUseCase$getTroubleshootingResult$result$1$1$1 supportTroubleshootUseCase$getTroubleshootingResult$result$1$1$1 = new SupportTroubleshootUseCase$getTroubleshootingResult$result$1$1$1(this, i, num, str, null);
                    supportTroubleshootUseCase$getTroubleshootingResult$12.label = 1;
                    objWithContext = BuildersKt.withContext(coroutineDispatcher, supportTroubleshootUseCase$getTroubleshootingResult$result$1$1$1, supportTroubleshootUseCase$getTroubleshootingResult$12);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i3 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objWithContext);
                }
                responseData = (ResponseData) objWithContext;
            } catch (java.lang.Throwable th) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        } catch (java.lang.Throwable th2) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            objM7377constructorimpl = Result.m7377constructorimpl((TxnContextualModel) stateListAnimator.AEQbTJ());
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            objM7377constructorimpl = Result.m7377constructorimpl((TxnContextualModel) stateListAnimator.AEQbTJ());
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                Result.Application application3 = Result.Companion;
                return Result.m7377constructorimpl(C44858sep.EZpvd((TxnContextualModel) objM7377constructorimpl));
            }
            Result.Application application4 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl));
        }
    }

    public final boolean OLrzqt(java.lang.Integer num, java.lang.Integer num2, java.util.List<NetworkChain> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (num != null) {
            if (num.intValue() == -1) {
                return true;
            }
            if (num2 != null && num2.intValue() == -1) {
                return true;
            }
            if ((list == null || !(!list.isEmpty()) || (num2 != null && num2.intValue() != -2)) && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str))) {
                return true;
            }
        }
        return false;
    }

    public final java.util.List<C45072sir> EZpvd(@NotNull java.util.List<C45072sir> list, @NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            C55167xeo c55167xeoEZpvd = ((C45072sir) obj).EZpvd();
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || StringsKt__StringsKt.AhwBna(c55167xeoEZpvd.EZpvd(), (java.lang.CharSequence) str, true) || StringsKt__StringsKt.AhwBna(c55167xeoEZpvd.OLrzqt(), (java.lang.CharSequence) str, true)) {
                arrayList.add(obj);
            }
        }
        java.util.List<C45072sir> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C45072sir) next).AEQbTJ() == -1) {
                break;
            }
        }
        C45072sir c45072sir = (C45072sir) next;
        if (c45072sir != null && !listFJNWhG.contains(c45072sir)) {
            listFJNWhG.add(c45072sir);
        }
        return listFJNWhG;
    }
}
