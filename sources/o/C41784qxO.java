package o;

import com.okinc.market.search.core.engine.domain.SearchInstrumentUseCase$onExecute$1;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qxO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41784qxO extends AbstractC49400uno<Triple<? extends java.lang.String, ? extends java.lang.Boolean, ? extends Function1<? super BizInstrument, ? extends java.lang.Boolean>>, java.util.List<? extends C54716xSr>> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final C41788qxS AEQbTJ;
    public final boolean KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((Triple<java.lang.String, java.lang.Boolean, ? extends Function1<? super BizInstrument, java.lang.Boolean>>) obj, (Continuation<? super java.util.List<C54716xSr>>) continuation);
    }

    @yCM
    public C41784qxO(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41788qxS c41788qxS) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41788qxS, "");
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = c41788qxS;
        this.KWHzl = true;
    }

    /* JADX INFO: renamed from: o.qxO$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qxO.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Triple<java.lang.String, java.lang.Boolean, ? extends Function1<? super BizInstrument, java.lang.Boolean>> triple, @NotNull Continuation<? super java.util.List<C54716xSr>> continuation) throws java.lang.Throwable {
        SearchInstrumentUseCase$onExecute$1 searchInstrumentUseCase$onExecute$1;
        C41784qxO c41784qxO;
        Function1<? super BizInstrument, java.lang.Boolean> function1;
        java.lang.String str;
        boolean z;
        Function1<? super BizInstrument, java.lang.Boolean> function12;
        C41784qxO c41784qxO2;
        if (continuation instanceof SearchInstrumentUseCase$onExecute$1) {
            searchInstrumentUseCase$onExecute$1 = (SearchInstrumentUseCase$onExecute$1) continuation;
            int i = searchInstrumentUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchInstrumentUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                searchInstrumentUseCase$onExecute$1 = new SearchInstrumentUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = searchInstrumentUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchInstrumentUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.String strComponent1 = triple.component1();
            boolean zBooleanValue = triple.component2().booleanValue();
            Function1<? super BizInstrument, java.lang.Boolean> function1Component3 = triple.component3();
            InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
            searchInstrumentUseCase$onExecute$1.L$0 = this;
            searchInstrumentUseCase$onExecute$1.L$1 = strComponent1;
            searchInstrumentUseCase$onExecute$1.L$2 = function1Component3;
            searchInstrumentUseCase$onExecute$1.Z$0 = zBooleanValue;
            searchInstrumentUseCase$onExecute$1.label = 1;
            if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNnKWHzl, false, null, searchInstrumentUseCase$onExecute$1, 3, null) == objCopydefault) {
                return objCopydefault;
            }
            c41784qxO = this;
            function1 = function1Component3;
            str = strComponent1;
            z = zBooleanValue;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = searchInstrumentUseCase$onExecute$1.Z$0;
                Function1<? super BizInstrument, java.lang.Boolean> function13 = (Function1) searchInstrumentUseCase$onExecute$1.L$2;
                str = (java.lang.String) searchInstrumentUseCase$onExecute$1.L$1;
                c41784qxO2 = (C41784qxO) searchInstrumentUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                function12 = function13;
                java.lang.String str2 = str;
                C40375qTn.AEQbTJ.copydefault("SearchInstrumentUseCase", "search instruments [keyword: " + str2 + ", forceRefresh: " + z + ", fuzzySearchEnable: " + c41784qxO2.KWHzl + "]");
                return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(C54704xSf.matchingV3$default(C54704xSf.OLrzqt, c41784qxO2.AEQbTJ.copydefault(), str2, function12, c41784qxO2.KWHzl, false, 16, null));
            }
            z = searchInstrumentUseCase$onExecute$1.Z$0;
            function1 = (Function1) searchInstrumentUseCase$onExecute$1.L$2;
            str = (java.lang.String) searchInstrumentUseCase$onExecute$1.L$1;
            c41784qxO = (C41784qxO) searchInstrumentUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        C41788qxS c41788qxS = c41784qxO.AEQbTJ;
        searchInstrumentUseCase$onExecute$1.L$0 = c41784qxO;
        searchInstrumentUseCase$onExecute$1.L$1 = str;
        searchInstrumentUseCase$onExecute$1.L$2 = function1;
        searchInstrumentUseCase$onExecute$1.Z$0 = z;
        searchInstrumentUseCase$onExecute$1.label = 2;
        if (c41788qxS.AEQbTJ(z, searchInstrumentUseCase$onExecute$1) == objCopydefault) {
            return objCopydefault;
        }
        function12 = function1;
        c41784qxO2 = c41784qxO;
        java.lang.String str22 = str;
        C40375qTn.AEQbTJ.copydefault("SearchInstrumentUseCase", "search instruments [keyword: " + str22 + ", forceRefresh: " + z + ", fuzzySearchEnable: " + c41784qxO2.KWHzl + "]");
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(C54704xSf.matchingV3$default(C54704xSf.OLrzqt, c41784qxO2.AEQbTJ.copydefault(), str22, function12, c41784qxO2.KWHzl, false, 16, null));
    }
}
