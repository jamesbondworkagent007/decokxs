package o;

import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.market.features.jwt.domain.GenerateSignArgsUseCase$generateDisplayInfo$1;
import com.okinc.business.market.features.jwt.domain.GenerateSignArgsUseCase$generateSignArgs$1;
import com.okinc.business.market.features.jwt.domain.GenerateSignArgsUseCase$generateSignArgs0E7RQCE$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kdp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28601kdp {
    public final InterfaceC27595jyE AEQbTJ;
    public final C28602kdq KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final kKG copydefault;

    @yCM
    public C28601kdp(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull kKG kkg, @NotNull C28602kdq c28602kdq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c28602kdq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC27595jyE;
        this.copydefault = kkg;
        this.KWHzl = c28602kdq;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, long j, @NotNull Continuation<? super Result<DappSignArgs>> continuation) {
        GenerateSignArgsUseCase$generateSignArgs$1 generateSignArgsUseCase$generateSignArgs$1;
        if (continuation instanceof GenerateSignArgsUseCase$generateSignArgs$1) {
            generateSignArgsUseCase$generateSignArgs$1 = (GenerateSignArgsUseCase$generateSignArgs$1) continuation;
            int i = generateSignArgsUseCase$generateSignArgs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateSignArgsUseCase$generateSignArgs$1.label = i - Integer.MIN_VALUE;
            } else {
                generateSignArgsUseCase$generateSignArgs$1 = new GenerateSignArgsUseCase$generateSignArgs$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = generateSignArgsUseCase$generateSignArgs$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = generateSignArgsUseCase$generateSignArgs$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            GenerateSignArgsUseCase$generateSignArgs0E7RQCE$$inlined$dexRunCatching$1 generateSignArgsUseCase$generateSignArgs0E7RQCE$$inlined$dexRunCatching$1 = new GenerateSignArgsUseCase$generateSignArgs0E7RQCE$$inlined$dexRunCatching$1(null, this, str, j);
            generateSignArgsUseCase$generateSignArgs$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, generateSignArgsUseCase$generateSignArgs0E7RQCE$$inlined$dexRunCatching$1, generateSignArgsUseCase$generateSignArgs$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(long j, @NotNull Continuation<? super PlatformItem> continuation) throws java.lang.Throwable {
        GenerateSignArgsUseCase$generateDisplayInfo$1 generateSignArgsUseCase$generateDisplayInfo$1;
        PlatformItem platformItem;
        java.lang.Object objM7386unboximpl;
        PlatformItem platformItem2;
        if (continuation instanceof GenerateSignArgsUseCase$generateDisplayInfo$1) {
            generateSignArgsUseCase$generateDisplayInfo$1 = (GenerateSignArgsUseCase$generateDisplayInfo$1) continuation;
            int i = generateSignArgsUseCase$generateDisplayInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateSignArgsUseCase$generateDisplayInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                generateSignArgsUseCase$generateDisplayInfo$1 = new GenerateSignArgsUseCase$generateDisplayInfo$1(this, continuation);
            }
        }
        java.lang.Object obj = generateSignArgsUseCase$generateDisplayInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = generateSignArgsUseCase$generateDisplayInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            PlatformItem platformItem3 = new PlatformItem(0L, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, 0L, 0, (java.lang.String) null, (java.lang.String) null, 16383, (DefaultConstructorMarker) null);
            platformItem3.setPlatform("dex");
            kKG kkg = this.copydefault;
            generateSignArgsUseCase$generateDisplayInfo$1.L$0 = platformItem3;
            generateSignArgsUseCase$generateDisplayInfo$1.L$1 = platformItem3;
            generateSignArgsUseCase$generateDisplayInfo$1.label = 1;
            java.lang.Object objCopydefault2 = kkg.copydefault(j, generateSignArgsUseCase$generateDisplayInfo$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            platformItem = platformItem3;
            objM7386unboximpl = objCopydefault2;
            platformItem2 = platformItem;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            platformItem = (PlatformItem) generateSignArgsUseCase$generateDisplayInfo$1.L$1;
            platformItem2 = (PlatformItem) generateSignArgsUseCase$generateDisplayInfo$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
            objM7386unboximpl = null;
        }
        java.lang.String str = (java.lang.String) objM7386unboximpl;
        if (str == null) {
            str = "";
        }
        platformItem.setNetwork(str);
        return platformItem2;
    }
}
