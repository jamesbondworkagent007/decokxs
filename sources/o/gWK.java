package o;

import com.okinc.business.dex.trade.copytrading.home.data.CTStrategiesRequest;
import com.okinc.business.dex.trade.copytrading.home.data.CTStrategy;
import com.okinc.business.dex.trade.copytrading.home.usecase.CopyTradingStrategiesUseCase$getStrategies$1;
import com.okinc.business.dex.trade.copytrading.home.usecase.CopyTradingStrategiesUseCase$getStrategiesBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gWK {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final C19868gSh AEQbTJ;
    public final InterfaceC20053gZd EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final C28196kSl copydefault;

    @yCM
    public gWK(@NotNull InterfaceC20053gZd interfaceC20053gZd, @NotNull C28196kSl c28196kSl, @NotNull C19868gSh c19868gSh, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC20053gZd, "");
        Intrinsics.checkNotNullParameter(c28196kSl, "");
        Intrinsics.checkNotNullParameter(c19868gSh, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC20053gZd;
        this.copydefault = c28196kSl;
        this.AEQbTJ = c19868gSh;
        this.KWHzl = coroutineDispatcher;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gWK.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: getStrategies-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8607getStrategiesBWLJW6A$default(gWK gwk, java.lang.String str, boolean z, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        return gwk.copydefault(str, z, str2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<OrderListPagerResult<CTStrategy>>> continuation) throws java.lang.Throwable {
        CopyTradingStrategiesUseCase$getStrategies$1 copyTradingStrategiesUseCase$getStrategies$1;
        java.lang.String str3;
        ?? r7;
        java.util.List<java.lang.String> list;
        gWK gwk;
        java.util.List listAhwBna;
        if (continuation instanceof CopyTradingStrategiesUseCase$getStrategies$1) {
            copyTradingStrategiesUseCase$getStrategies$1 = (CopyTradingStrategiesUseCase$getStrategies$1) continuation;
            int i = copyTradingStrategiesUseCase$getStrategies$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyTradingStrategiesUseCase$getStrategies$1.label = i - Integer.MIN_VALUE;
            } else {
                copyTradingStrategiesUseCase$getStrategies$1 = new CopyTradingStrategiesUseCase$getStrategies$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = copyTradingStrategiesUseCase$getStrategies$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = copyTradingStrategiesUseCase$getStrategies$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            java.util.List<java.lang.String> listOLrzqt = this.AEQbTJ.OLrzqt();
            C28196kSl c28196kSl = this.copydefault;
            copyTradingStrategiesUseCase$getStrategies$1.L$0 = this;
            copyTradingStrategiesUseCase$getStrategies$1.L$1 = str;
            copyTradingStrategiesUseCase$getStrategies$1.L$2 = str2;
            copyTradingStrategiesUseCase$getStrategies$1.L$3 = listOLrzqt;
            copyTradingStrategiesUseCase$getStrategies$1.Z$0 = z;
            copyTradingStrategiesUseCase$getStrategies$1.label = 1;
            java.lang.Object objOLrzqt = c28196kSl.OLrzqt(copyTradingStrategiesUseCase$getStrategies$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            str3 = str;
            r7 = z;
            list = listOLrzqt;
            objWithContext = objOLrzqt;
            gwk = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                return ((Result) objWithContext).m7386unboximpl();
            }
            boolean z2 = copyTradingStrategiesUseCase$getStrategies$1.Z$0;
            java.util.List<java.lang.String> list2 = (java.util.List) copyTradingStrategiesUseCase$getStrategies$1.L$3;
            str2 = (java.lang.String) copyTradingStrategiesUseCase$getStrategies$1.L$2;
            java.lang.String str4 = (java.lang.String) copyTradingStrategiesUseCase$getStrategies$1.L$1;
            gWK gwk2 = (gWK) copyTradingStrategiesUseCase$getStrategies$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            list = list2;
            r7 = z2;
            str3 = str4;
            gwk = gwk2;
        }
        java.lang.String str5 = (java.lang.String) objWithContext;
        if (str2.length() <= 0) {
            str2 = null;
        }
        if (str2 == null || (listAhwBna = C56402yEa.EZpvd(str2)) == null) {
            listAhwBna = yDY.AhwBna();
        }
        CTStrategiesRequest cTStrategiesRequest = new CTStrategiesRequest(str5, list, r7, str3, 10, listAhwBna);
        CoroutineDispatcher coroutineDispatcher = gwk.KWHzl;
        CopyTradingStrategiesUseCase$getStrategiesBWLJW6A$$inlined$dexRunCatching$1 copyTradingStrategiesUseCase$getStrategiesBWLJW6A$$inlined$dexRunCatching$1 = new CopyTradingStrategiesUseCase$getStrategiesBWLJW6A$$inlined$dexRunCatching$1(null, gwk, cTStrategiesRequest);
        copyTradingStrategiesUseCase$getStrategies$1.L$0 = null;
        copyTradingStrategiesUseCase$getStrategies$1.L$1 = null;
        copyTradingStrategiesUseCase$getStrategies$1.L$2 = null;
        copyTradingStrategiesUseCase$getStrategies$1.L$3 = null;
        copyTradingStrategiesUseCase$getStrategies$1.label = 2;
        objWithContext = BuildersKt.withContext(coroutineDispatcher, copyTradingStrategiesUseCase$getStrategiesBWLJW6A$$inlined$dexRunCatching$1, copyTradingStrategiesUseCase$getStrategies$1);
        if (objWithContext == objCopydefault) {
            return objCopydefault;
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
