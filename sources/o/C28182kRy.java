package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMyAssetsUseCase$getMyPositionList$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMyAssetsUseCase$getMyPositionListhUnOzRk$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMyAssetsUseCase$saveAssetsFilter$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMyAssetsUseCase$saveAssetsFiltergIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedAssetsFilter;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kRy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28182kRy {
    public final C28399kZz AEQbTJ;
    public final CoroutineDispatcher OLrzqt;
    public final InterfaceC28156kQz copydefault;

    @yCM
    public C28182kRy(@NotNull InterfaceC28156kQz interfaceC28156kQz, @NotNull C28399kZz c28399kZz, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28156kQz, "");
        Intrinsics.checkNotNullParameter(c28399kZz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC28156kQz;
        this.AEQbTJ = c28399kZz;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.util.List<DexMultiTokenInfoBean> list, @NotNull AdvancedAssetsFilter advancedAssetsFilter, @NotNull Continuation<? super Result<? extends java.util.List<DexMultiTokenInfoBean>>> continuation) {
        AdvancedMyAssetsUseCase$getMyPositionList$1 advancedMyAssetsUseCase$getMyPositionList$1;
        if (continuation instanceof AdvancedMyAssetsUseCase$getMyPositionList$1) {
            advancedMyAssetsUseCase$getMyPositionList$1 = (AdvancedMyAssetsUseCase$getMyPositionList$1) continuation;
            int i = advancedMyAssetsUseCase$getMyPositionList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedMyAssetsUseCase$getMyPositionList$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedMyAssetsUseCase$getMyPositionList$1 = new AdvancedMyAssetsUseCase$getMyPositionList$1(this, continuation);
            }
        }
        AdvancedMyAssetsUseCase$getMyPositionList$1 advancedMyAssetsUseCase$getMyPositionList$12 = advancedMyAssetsUseCase$getMyPositionList$1;
        java.lang.Object objWithContext = advancedMyAssetsUseCase$getMyPositionList$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedMyAssetsUseCase$getMyPositionList$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            AdvancedMyAssetsUseCase$getMyPositionListhUnOzRk$$inlined$dexRunCatching$1 advancedMyAssetsUseCase$getMyPositionListhUnOzRk$$inlined$dexRunCatching$1 = new AdvancedMyAssetsUseCase$getMyPositionListhUnOzRk$$inlined$dexRunCatching$1(null, this, str, str2, str3, list, advancedAssetsFilter);
            advancedMyAssetsUseCase$getMyPositionList$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedMyAssetsUseCase$getMyPositionListhUnOzRk$$inlined$dexRunCatching$1, advancedMyAssetsUseCase$getMyPositionList$12);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull AdvancedAssetsFilter advancedAssetsFilter, @NotNull Continuation<? super Result<Unit>> continuation) {
        AdvancedMyAssetsUseCase$saveAssetsFilter$1 advancedMyAssetsUseCase$saveAssetsFilter$1;
        if (continuation instanceof AdvancedMyAssetsUseCase$saveAssetsFilter$1) {
            advancedMyAssetsUseCase$saveAssetsFilter$1 = (AdvancedMyAssetsUseCase$saveAssetsFilter$1) continuation;
            int i = advancedMyAssetsUseCase$saveAssetsFilter$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedMyAssetsUseCase$saveAssetsFilter$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedMyAssetsUseCase$saveAssetsFilter$1 = new AdvancedMyAssetsUseCase$saveAssetsFilter$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = advancedMyAssetsUseCase$saveAssetsFilter$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedMyAssetsUseCase$saveAssetsFilter$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            AdvancedMyAssetsUseCase$saveAssetsFiltergIAlus$$inlined$dexRunCatching$1 advancedMyAssetsUseCase$saveAssetsFiltergIAlus$$inlined$dexRunCatching$1 = new AdvancedMyAssetsUseCase$saveAssetsFiltergIAlus$$inlined$dexRunCatching$1(null, this, advancedAssetsFilter);
            advancedMyAssetsUseCase$saveAssetsFilter$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedMyAssetsUseCase$saveAssetsFiltergIAlus$$inlined$dexRunCatching$1, advancedMyAssetsUseCase$saveAssetsFilter$1);
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
