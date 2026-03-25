package o;

import com.okinc.business.market.features.address_tracker.domain.GetTrackingGroupsListUseCase$invoke$1;
import com.okinc.business.market.features.address_tracker.domain.GetTrackingGroupsListUseCase$invokegIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jAL {
    public final InterfaceC25651jBh AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final C26240jXc copydefault;

    @yCM
    public jAL(@NotNull InterfaceC25651jBh interfaceC25651jBh, @NotNull C26240jXc c26240jXc, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC25651jBh, "");
        Intrinsics.checkNotNullParameter(c26240jXc, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC25651jBh;
        this.copydefault = c26240jXc;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends java.util.List<CommonGroupUiModel>>> continuation) throws java.lang.Throwable {
        GetTrackingGroupsListUseCase$invoke$1 getTrackingGroupsListUseCase$invoke$1;
        if (continuation instanceof GetTrackingGroupsListUseCase$invoke$1) {
            getTrackingGroupsListUseCase$invoke$1 = (GetTrackingGroupsListUseCase$invoke$1) continuation;
            int i = getTrackingGroupsListUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getTrackingGroupsListUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getTrackingGroupsListUseCase$invoke$1 = new GetTrackingGroupsListUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getTrackingGroupsListUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getTrackingGroupsListUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            GetTrackingGroupsListUseCase$invokegIAlus$$inlined$dexRunCatching$1 getTrackingGroupsListUseCase$invokegIAlus$$inlined$dexRunCatching$1 = new GetTrackingGroupsListUseCase$invokegIAlus$$inlined$dexRunCatching$1(null, this, str);
            getTrackingGroupsListUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getTrackingGroupsListUseCase$invokegIAlus$$inlined$dexRunCatching$1, getTrackingGroupsListUseCase$invoke$1);
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

    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((CommonGroupData) t).KWHzl()), java.lang.Integer.valueOf(((CommonGroupData) t2).KWHzl()));
        }
    }
}
