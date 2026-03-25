package o;

import com.okinc.business.market.features.address_tracker.domain.FetchTrackerGroupsUseCase$invoke$1;
import com.okinc.business.market.features.address_tracker.domain.FetchTrackerGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.group.domain.CommonGroupData;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jAJ {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC25651jBh KWHzl;
    public final C26240jXc OLrzqt;
    public final C25649jBf copydefault;
    public final kKG djBIcL;

    @yCM
    public jAJ(@NotNull InterfaceC25651jBh interfaceC25651jBh, @NotNull C25649jBf c25649jBf, @NotNull kKG kkg, @NotNull C26240jXc c26240jXc, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC25651jBh, "");
        Intrinsics.checkNotNullParameter(c25649jBf, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c26240jXc, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC25651jBh;
        this.copydefault = c25649jBf;
        this.djBIcL = kkg;
        this.OLrzqt = c26240jXc;
        this.AEQbTJ = coroutineDispatcher;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jAJ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(boolean z, @NotNull Continuation<? super Result<? extends java.util.List<CommonGroupData>>> continuation) {
        FetchTrackerGroupsUseCase$invoke$1 fetchTrackerGroupsUseCase$invoke$1;
        if (continuation instanceof FetchTrackerGroupsUseCase$invoke$1) {
            fetchTrackerGroupsUseCase$invoke$1 = (FetchTrackerGroupsUseCase$invoke$1) continuation;
            int i = fetchTrackerGroupsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchTrackerGroupsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchTrackerGroupsUseCase$invoke$1 = new FetchTrackerGroupsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = fetchTrackerGroupsUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchTrackerGroupsUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            java.lang.String strCopydefault = this.djBIcL.copydefault();
            android.util.LruCache<java.lang.String, java.util.List<CommonGroupData>> lruCacheCopydefault = this.copydefault.copydefault();
            java.util.List<CommonGroupData> list = lruCacheCopydefault != null ? lruCacheCopydefault.get(strCopydefault) : null;
            if (!z && C33129mqd.KWHzl((java.util.Collection) list)) {
                Intrinsics.copydefault(list);
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.OLrzqt.EZpvd((CommonGroupData) it.next()));
                }
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(arrayList);
            }
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            FetchTrackerGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1 fetchTrackerGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1 = new FetchTrackerGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1(null, this, strCopydefault);
            fetchTrackerGroupsUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, fetchTrackerGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1, fetchTrackerGroupsUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
