package o;

import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.AptosMessageSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bHE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8673bHE extends AbstractC8610bFv<AptosMessageSignData> {
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.bHD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8673bHE.copydefault(this.KWHzl);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String ag_() {
        return "";
    }

    public final C8750bIc OLrzqt() {
        return (C8750bIc) this.copydefault.getValue();
    }

    public static final C8750bIc copydefault(C8673bHE c8673bHE) {
        return new C8750bIc(c8673bHE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8610bFv
    public java.lang.String AEQbTJ(boolean z) {
        if (z) {
            return xYW.AEQbTJ.AYXKKw(((AptosMessageSignData) QVsKAR()).getData());
        }
        return ((AptosMessageSignData) QVsKAR()).getData();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) ((AptosMessageSignData) QVsKAR()).getMethod(), (java.lang.Object) DappSignArgs.APTOS_SIGN_NONCE_MESSAGE)) {
            strKWHzl = OLrzqt().OLrzqt(str);
        } else {
            strKWHzl = OLrzqt().KWHzl(str);
        }
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8610bFv.generateCommonBroadcastModel$default(this, strKWHzl, null, 2, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }
}
