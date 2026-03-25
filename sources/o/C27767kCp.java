package o;

import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.business.market.features.watch_list_groups.domain.token.GetGroupsWithTokenStatusUseCase$invoke$1;
import com.okinc.business.market.features.watch_list_groups.domain.token.GetGroupsWithTokenStatusUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kCp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27767kCp {
    public final CoroutineDispatcher AEQbTJ;
    public final kKG EZpvd;
    public final InterfaceC27771kCt KWHzl;
    public final C27772kCu OLrzqt;
    public final C26240jXc copydefault;

    @yCM
    public C27767kCp(@NotNull InterfaceC27771kCt interfaceC27771kCt, @NotNull C27772kCu c27772kCu, @NotNull kKG kkg, @NotNull C26240jXc c26240jXc, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27771kCt, "");
        Intrinsics.checkNotNullParameter(c27772kCu, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c26240jXc, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC27771kCt;
        this.OLrzqt = c27772kCu;
        this.EZpvd = kkg;
        this.copydefault = c26240jXc;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<? extends java.util.List<CommonGroupData>>> continuation) {
        GetGroupsWithTokenStatusUseCase$invoke$1 getGroupsWithTokenStatusUseCase$invoke$1;
        if (continuation instanceof GetGroupsWithTokenStatusUseCase$invoke$1) {
            getGroupsWithTokenStatusUseCase$invoke$1 = (GetGroupsWithTokenStatusUseCase$invoke$1) continuation;
            int i = getGroupsWithTokenStatusUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getGroupsWithTokenStatusUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getGroupsWithTokenStatusUseCase$invoke$1 = new GetGroupsWithTokenStatusUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getGroupsWithTokenStatusUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getGroupsWithTokenStatusUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            GetGroupsWithTokenStatusUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 getGroupsWithTokenStatusUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 = new GetGroupsWithTokenStatusUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(null, this, str, str2);
            getGroupsWithTokenStatusUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getGroupsWithTokenStatusUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1, getGroupsWithTokenStatusUseCase$invoke$1);
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
