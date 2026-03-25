package o;

import com.okinc.business.market.features.chain_list.domain.GetChainInfoUseCase$getChainLogo$1;
import com.okinc.business.market.features.chain_list.domain.GetChainInfoUseCase$getChainLogogIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.chain_list.domain.GetChainInfoUseCase$getChainName$1;
import com.okinc.business.market.features.chain_list.domain.GetChainInfoUseCase$getChainNamegIAlus$$inlined$dexRunCatching$1;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jNm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25980jNm {
    public final C25983jNp AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl;
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt;
    public final java.util.Map<java.lang.String, java.lang.String> copydefault;

    @yCM
    public C25980jNm(@NotNull C25983jNp c25983jNp, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c25983jNp, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = c25983jNp;
        this.EZpvd = coroutineDispatcher;
        this.copydefault = new LinkedHashMap();
        this.KWHzl = new LinkedHashMap();
        this.OLrzqt = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Result<java.lang.String>> continuation) {
        GetChainInfoUseCase$getChainLogo$1 getChainInfoUseCase$getChainLogo$1;
        if (continuation instanceof GetChainInfoUseCase$getChainLogo$1) {
            getChainInfoUseCase$getChainLogo$1 = (GetChainInfoUseCase$getChainLogo$1) continuation;
            int i = getChainInfoUseCase$getChainLogo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getChainInfoUseCase$getChainLogo$1.label = i - Integer.MIN_VALUE;
            } else {
                getChainInfoUseCase$getChainLogo$1 = new GetChainInfoUseCase$getChainLogo$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getChainInfoUseCase$getChainLogo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getChainInfoUseCase$getChainLogo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            GetChainInfoUseCase$getChainLogogIAlus$$inlined$dexRunCatching$1 getChainInfoUseCase$getChainLogogIAlus$$inlined$dexRunCatching$1 = new GetChainInfoUseCase$getChainLogogIAlus$$inlined$dexRunCatching$1(null, this, str);
            getChainInfoUseCase$getChainLogo$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getChainInfoUseCase$getChainLogogIAlus$$inlined$dexRunCatching$1, getChainInfoUseCase$getChainLogo$1);
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
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Result<java.lang.String>> continuation) {
        GetChainInfoUseCase$getChainName$1 getChainInfoUseCase$getChainName$1;
        if (continuation instanceof GetChainInfoUseCase$getChainName$1) {
            getChainInfoUseCase$getChainName$1 = (GetChainInfoUseCase$getChainName$1) continuation;
            int i = getChainInfoUseCase$getChainName$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getChainInfoUseCase$getChainName$1.label = i - Integer.MIN_VALUE;
            } else {
                getChainInfoUseCase$getChainName$1 = new GetChainInfoUseCase$getChainName$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getChainInfoUseCase$getChainName$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getChainInfoUseCase$getChainName$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            GetChainInfoUseCase$getChainNamegIAlus$$inlined$dexRunCatching$1 getChainInfoUseCase$getChainNamegIAlus$$inlined$dexRunCatching$1 = new GetChainInfoUseCase$getChainNamegIAlus$$inlined$dexRunCatching$1(null, this, str);
            getChainInfoUseCase$getChainName$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getChainInfoUseCase$getChainNamegIAlus$$inlined$dexRunCatching$1, getChainInfoUseCase$getChainName$1);
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
