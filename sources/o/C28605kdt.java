package o;

import com.okinc.business.market.features.jwt.domain.ParseSigningResultUseCase$parse$1;
import com.okinc.business.market.features.jwt.domain.ParseSigningResultUseCase$parsegIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kdt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28605kdt {
    public final CoroutineDispatcher KWHzl;
    public final Json OLrzqt;

    @yCM
    public C28605kdt(@NotNull Json json, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = json;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(android.os.Bundle bundle, @NotNull Continuation<? super Result<java.lang.String>> continuation) {
        ParseSigningResultUseCase$parse$1 parseSigningResultUseCase$parse$1;
        if (continuation instanceof ParseSigningResultUseCase$parse$1) {
            parseSigningResultUseCase$parse$1 = (ParseSigningResultUseCase$parse$1) continuation;
            int i = parseSigningResultUseCase$parse$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                parseSigningResultUseCase$parse$1.label = i - Integer.MIN_VALUE;
            } else {
                parseSigningResultUseCase$parse$1 = new ParseSigningResultUseCase$parse$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = parseSigningResultUseCase$parse$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = parseSigningResultUseCase$parse$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            ParseSigningResultUseCase$parsegIAlus$$inlined$dexRunCatching$1 parseSigningResultUseCase$parsegIAlus$$inlined$dexRunCatching$1 = new ParseSigningResultUseCase$parsegIAlus$$inlined$dexRunCatching$1(null, bundle, this);
            parseSigningResultUseCase$parse$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, parseSigningResultUseCase$parsegIAlus$$inlined$dexRunCatching$1, parseSigningResultUseCase$parse$1);
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
