package o;

import com.just.agentweb.DefaultWebClient;
import com.okinc.business.market.data.model.GetSignMessageResponse;
import com.okinc.business.market.data.model.TonSignData;
import com.okinc.business.market.features.jwt.domain.GenerateSignMessageUseCase$generateSignMessage$1;
import com.okinc.business.market.features.jwt.domain.GenerateSignMessageUseCase$generateSignMessageBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.jwt.domain.model.BtcHex;
import com.okinc.business.market.features.jwt.domain.model.BtcHexOptionJson;
import com.okinc.business.market.features.jwt.domain.model.StarkNetHex;
import com.okinc.business.market.features.jwt.domain.model.TonHex;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kdq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28602kdq {
    public final kKG AEQbTJ;
    public final C28604kds EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final Json OLrzqt;

    @yCM
    public C28602kdq(@NotNull kKG kkg, @NotNull C28604kds c28604kds, @NotNull Json json, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c28604kds, "");
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = kkg;
        this.EZpvd = c28604kds;
        this.OLrzqt = json;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull GetSignMessageResponse getSignMessageResponse, @NotNull java.lang.String str, long j, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        GenerateSignMessageUseCase$generateSignMessage$1 generateSignMessageUseCase$generateSignMessage$1;
        if (continuation instanceof GenerateSignMessageUseCase$generateSignMessage$1) {
            generateSignMessageUseCase$generateSignMessage$1 = (GenerateSignMessageUseCase$generateSignMessage$1) continuation;
            int i = generateSignMessageUseCase$generateSignMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateSignMessageUseCase$generateSignMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                generateSignMessageUseCase$generateSignMessage$1 = new GenerateSignMessageUseCase$generateSignMessage$1(this, continuation);
            }
        }
        GenerateSignMessageUseCase$generateSignMessage$1 generateSignMessageUseCase$generateSignMessage$12 = generateSignMessageUseCase$generateSignMessage$1;
        java.lang.Object objWithContext = generateSignMessageUseCase$generateSignMessage$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = generateSignMessageUseCase$generateSignMessage$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            GenerateSignMessageUseCase$generateSignMessageBWLJW6A$$inlined$dexRunCatching$1 generateSignMessageUseCase$generateSignMessageBWLJW6A$$inlined$dexRunCatching$1 = new GenerateSignMessageUseCase$generateSignMessageBWLJW6A$$inlined$dexRunCatching$1(null, this, j, getSignMessageResponse, str);
            generateSignMessageUseCase$generateSignMessage$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, generateSignMessageUseCase$generateSignMessageBWLJW6A$$inlined$dexRunCatching$1, generateSignMessageUseCase$generateSignMessage$12);
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

    public final java.lang.String OLrzqt(@NotNull GetSignMessageResponse getSignMessageResponse, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(getSignMessageResponse, "");
        Intrinsics.checkNotNullParameter(str, "");
        return this.OLrzqt.encodeToString(StarkNetHex.Companion.serializer(), new StarkNetHex(str, getSignMessageResponse.EZpvd()));
    }

    public final java.lang.String KWHzl(@NotNull GetSignMessageResponse getSignMessageResponse, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(getSignMessageResponse, "");
        Intrinsics.checkNotNullParameter(str, "");
        return C59449zhJ.replace$default(this.OLrzqt.encodeToString(BtcHex.Companion.serializer(), new BtcHex(getSignMessageResponse.KWHzl(), new BtcHexOptionJson(str), str)), "\n", "", false, 4, (java.lang.Object) null);
    }

    public final java.lang.String OLrzqt(@NotNull GetSignMessageResponse getSignMessageResponse) {
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(getSignMessageResponse, "");
        TonSignData tonSignDataAEQbTJ = getSignMessageResponse.AEQbTJ();
        if (!C59449zhJ.startsWith$default(tonSignDataAEQbTJ.copydefault(), "http", false, 2, null)) {
            strCopydefault = DefaultWebClient.HTTPS_SCHEME + tonSignDataAEQbTJ.copydefault();
        } else {
            strCopydefault = tonSignDataAEQbTJ.copydefault();
        }
        return this.OLrzqt.encodeToString(TonHex.Companion.serializer(), new TonHex(tonSignDataAEQbTJ.EZpvd(), strCopydefault, (java.lang.String) null, 4, (DefaultConstructorMarker) null));
    }

    public final java.lang.String EZpvd(@NotNull GetSignMessageResponse getSignMessageResponse) {
        Intrinsics.checkNotNullParameter(getSignMessageResponse, "");
        java.lang.String strKWHzl = getSignMessageResponse.KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList(strKWHzl.length());
        for (int i = 0; i < strKWHzl.length(); i++) {
            char cCharAt = strKWHzl.charAt(i);
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            java.lang.String str = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(cCharAt)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            arrayList.add(str);
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    public final java.lang.String copydefault(@NotNull GetSignMessageResponse getSignMessageResponse) {
        Intrinsics.checkNotNullParameter(getSignMessageResponse, "");
        java.lang.String strKWHzl = getSignMessageResponse.KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList(strKWHzl.length());
        for (int i = 0; i < strKWHzl.length(); i++) {
            char cCharAt = strKWHzl.charAt(i);
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            java.lang.String str = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(cCharAt)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            arrayList.add(str);
        }
        return EIP1271Verifier.hexPrefix + CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }
}
