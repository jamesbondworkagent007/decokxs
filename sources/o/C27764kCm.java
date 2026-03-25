package o;

import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.business.market.features.watch_list_groups.domain.FetchWatchlistGroupsUseCase$invoke$1;
import com.okinc.business.market.features.watch_list_groups.domain.FetchWatchlistGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kCm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27764kCm {
    public final C27772kCu EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final InterfaceC27771kCt OLrzqt;
    public final C26240jXc copydefault;
    public final kKG gEmmrt;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C27764kCm(@NotNull InterfaceC27771kCt interfaceC27771kCt, @NotNull C27772kCu c27772kCu, @NotNull kKG kkg, @NotNull C26240jXc c26240jXc, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27771kCt, "");
        Intrinsics.checkNotNullParameter(c27772kCu, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c26240jXc, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC27771kCt;
        this.EZpvd = c27772kCu;
        this.gEmmrt = kkg;
        this.copydefault = c26240jXc;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.kCm$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kCm.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(boolean z, @NotNull Continuation<? super Result<? extends java.util.List<CommonGroupData>>> continuation) {
        FetchWatchlistGroupsUseCase$invoke$1 fetchWatchlistGroupsUseCase$invoke$1;
        if (continuation instanceof FetchWatchlistGroupsUseCase$invoke$1) {
            fetchWatchlistGroupsUseCase$invoke$1 = (FetchWatchlistGroupsUseCase$invoke$1) continuation;
            int i = fetchWatchlistGroupsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchWatchlistGroupsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchWatchlistGroupsUseCase$invoke$1 = new FetchWatchlistGroupsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = fetchWatchlistGroupsUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchWatchlistGroupsUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            java.lang.String strCopydefault = this.gEmmrt.copydefault();
            java.util.List<CommonGroupData> list = this.EZpvd.AEQbTJ().get(strCopydefault);
            if (!z && C33129mqd.KWHzl((java.util.Collection) list)) {
                Intrinsics.copydefault(list);
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.copydefault.EZpvd((CommonGroupData) it.next()));
                }
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(arrayList);
            }
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            FetchWatchlistGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1 fetchWatchlistGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1 = new FetchWatchlistGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1(null, this, strCopydefault);
            fetchWatchlistGroupsUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, fetchWatchlistGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1, fetchWatchlistGroupsUseCase$invoke$1);
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
