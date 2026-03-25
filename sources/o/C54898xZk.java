package o;

import com.okinc.wallet.core.sign.InvokeMethodParams;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.TransactionParams;
import com.okinc.wallet.core.sign.sui.SuiSignedTx;
import com.okinc.wallet.core.sign.sui.SuiTokenTxData;
import com.okinc.wallet.core.sign.sui.SuiTransaction;
import com.okinc.wallet.core.sign.sui.SuiTxData;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xZk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54898xZk {
    public static final C54898xZk AEQbTJ = new C54898xZk();

    private C54898xZk() {
    }

    public final java.lang.String copydefault(@NotNull SuiTxData suiTxData) {
        Intrinsics.checkNotNullParameter(suiTxData, "");
        return xXV.KWHzl.OLrzqt(suiTxData);
    }

    public final java.lang.String EZpvd(@NotNull SuiTokenTxData suiTokenTxData) {
        Intrinsics.checkNotNullParameter(suiTokenTxData, "");
        return xXV.KWHzl.OLrzqt(suiTokenTxData);
    }

    public final SignedTx copydefault(@NotNull SignParams signParams, @NotNull SuiTransaction suiTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(suiTransaction, "");
        return EZpvd(xYU.copydefault.AYXKKw(TransactionParams.Companion.AEQbTJ(signParams, suiTransaction)));
    }

    public final SignedTx OLrzqt(@NotNull SignParams signParams, @NotNull SuiTransaction suiTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(suiTransaction, "");
        return EZpvd(xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("signMoveCall", signParams, suiTransaction)));
    }

    public final SignedTx EZpvd(java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            SignedTx signedTx = (SignedTx) C54907xZt.OLrzqt(SignedTx.Companion.serializer(), str);
            KSerializer<SuiSignedTx> kSerializerSerializer = SuiSignedTx.Companion.serializer();
            java.lang.String tx = signedTx.getTx();
            if (tx == null) {
                tx = "";
            }
            objM7377constructorimpl = Result.m7377constructorimpl(SignedTx.copy$default(signedTx, ((SuiSignedTx) C54907xZt.OLrzqt(kSerializerSerializer, tx)).toSerializedJson(), null, null, null, 14, null));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        SignedTx signedTx2 = new SignedTx((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 15, (DefaultConstructorMarker) null);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = signedTx2;
        }
        return (SignedTx) objM7377constructorimpl;
    }

    public final java.lang.String KWHzl(@NotNull SignParams signParams, @NotNull SuiTransaction suiTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(suiTransaction, "");
        return xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("signMessage", signParams, suiTransaction));
    }
}
