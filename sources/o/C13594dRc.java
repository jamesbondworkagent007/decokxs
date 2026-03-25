package o;

import com.okinc.business.defi.jwt.AddressLoginResponse;
import com.okinc.business.defi.jwt.domain.WalletJwtData;
import com.okinc.core.util.SPUtils;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dRc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13594dRc {
    public final CoroutineDispatcher OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    public C13594dRc(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = coroutineDispatcher;
    }

    public final boolean EZpvd(@NotNull java.lang.String str, @NotNull AddressLoginResponse addressLoginResponse) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(addressLoginResponse, "");
        try {
            java.util.Map mapIsConnected = C56424yEw.isConnected(KWHzl().EZpvd());
            mapIsConnected.put(str, addressLoginResponse);
            SPUtils.put("key.wallet_jwt", C43284rmQ.KWHzl().encodeToString(WalletJwtData.Companion.serializer(), new WalletJwtData(mapIsConnected)));
            return true;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("walletJwtRepository", e);
            return false;
        }
    }

    public final WalletJwtData KWHzl() {
        try {
            Json jsonKWHzl = C43284rmQ.KWHzl();
            KSerializer<WalletJwtData> kSerializerSerializer = WalletJwtData.Companion.serializer();
            java.lang.String string = SPUtils.getString("key.wallet_jwt", "");
            Intrinsics.checkNotNullExpressionValue(string, "");
            return (WalletJwtData) jsonKWHzl.decodeFromString(kSerializerSerializer, string);
        } catch (java.lang.Exception unused) {
            return new WalletJwtData(C56424yEw.KWHzl());
        }
    }

    /* JADX INFO: renamed from: o.dRc$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dRc.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C13594dRc getInstance$default(ActionBar actionBar, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return actionBar.copydefault(context);
        }

        public final C13594dRc copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).copydefault();
        }
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(KWHzl().EZpvd().get(str));
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
