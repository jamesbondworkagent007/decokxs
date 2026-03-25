package o;

import com.just.agentweb.DefaultWebClient;
import com.okinc.business.defi.jwt.GetSignMessageResponse;
import com.okinc.business.defi.jwt.TonSignData;
import com.okinc.business.defi.jwt.model.BtcHex;
import com.okinc.business.defi.jwt.model.BtcHexOptionJson;
import com.okinc.business.defi.jwt.model.StarkNetHex;
import com.okinc.business.defi.jwt.model.TonHex;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dRj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13601dRj {
    public final xYW AEQbTJ;
    public final Json KWHzl;
    public final C10948byA OLrzqt;

    @yCM
    public C13601dRj(@NotNull Json json, @NotNull C10948byA c10948byA, @NotNull xYW xyw) {
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(xyw, "");
        this.KWHzl = json;
        this.OLrzqt = c10948byA;
        this.AEQbTJ = xyw;
    }

    public final java.lang.String AEQbTJ(@NotNull GetSignMessageResponse getSignMessageResponse, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(getSignMessageResponse, "");
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.encodeToString(StarkNetHex.Companion.serializer(), new StarkNetHex(str, getSignMessageResponse.AEQbTJ()));
    }

    public final java.lang.String copydefault(@NotNull GetSignMessageResponse getSignMessageResponse, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(getSignMessageResponse, "");
        Intrinsics.checkNotNullParameter(str, "");
        return C59449zhJ.replace$default(this.KWHzl.encodeToString(BtcHex.Companion.serializer(), new BtcHex(getSignMessageResponse.KWHzl(), new BtcHexOptionJson(str), str)), "\n", "", false, 4, (java.lang.Object) null);
    }

    public final java.lang.String AEQbTJ(@NotNull GetSignMessageResponse getSignMessageResponse) {
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

    public final java.lang.String OLrzqt(@NotNull GetSignMessageResponse getSignMessageResponse) {
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(getSignMessageResponse, "");
        TonSignData tonSignDataOLrzqt = getSignMessageResponse.OLrzqt();
        if (!C59449zhJ.startsWith$default(tonSignDataOLrzqt.copydefault(), "http", false, 2, null)) {
            strCopydefault = DefaultWebClient.HTTPS_SCHEME + tonSignDataOLrzqt.copydefault();
        } else {
            strCopydefault = tonSignDataOLrzqt.copydefault();
        }
        return this.KWHzl.encodeToString(TonHex.Companion.serializer(), new TonHex(tonSignDataOLrzqt.KWHzl(), strCopydefault, (java.lang.String) null, 4, (DefaultConstructorMarker) null));
    }

    public final java.lang.String KWHzl(@NotNull GetSignMessageResponse getSignMessageResponse) {
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

    public final java.lang.Object OLrzqt(long j) {
        try {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(this.OLrzqt.copydefault(j));
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final java.lang.Object OLrzqt(@NotNull GetSignMessageResponse getSignMessageResponse, @NotNull java.lang.String str, long j, @NotNull Continuation<? super Result<java.lang.String>> continuation) {
        java.lang.String strKWHzl;
        try {
            Result.Application application = Result.Companion;
            java.lang.Object objOLrzqt = OLrzqt(j);
            if (Result.m7383isFailureimpl(objOLrzqt)) {
                objOLrzqt = null;
            }
            C10854bwM c10854bwM = (C10854bwM) objOLrzqt;
            if (c10854bwM != null && c10854bwM.fARcdN()) {
                strKWHzl = this.AEQbTJ.copydefault(getSignMessageResponse.KWHzl());
            } else if (c10854bwM != null && c10854bwM.ixgjPv()) {
                strKWHzl = getSignMessageResponse.KWHzl();
            } else if (c10854bwM != null && c10854bwM.DCUTEIdCUTEI()) {
                strKWHzl = AEQbTJ(getSignMessageResponse, str);
            } else if (c10854bwM != null && c10854bwM.iRxXKY()) {
                strKWHzl = copydefault(getSignMessageResponse, str);
            } else if (c10854bwM != null && c10854bwM.DGOPHZ()) {
                strKWHzl = OLrzqt(getSignMessageResponse);
            } else if (c10854bwM != null && c10854bwM.run()) {
                strKWHzl = AEQbTJ(getSignMessageResponse);
            } else {
                strKWHzl = KWHzl(getSignMessageResponse);
            }
            return Result.m7377constructorimpl(strKWHzl);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
