package o;

import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.api.model.tx.signdata.TonMessageSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonProofItem;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ccY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11886ccY extends AbstractC8610bFv<TonMessageSignData> {
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.ccZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C11886ccY.copydefault(this.EZpvd);
        }
    });
    public TonProofItem OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull TonProofItem tonProofItem) {
        Intrinsics.checkNotNullParameter(tonProofItem, "");
        this.OLrzqt = tonProofItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String ag_() {
        return "";
    }

    public final TonProofItem KWHzl() {
        TonProofItem tonProofItem = this.OLrzqt;
        if (tonProofItem != null) {
            return tonProofItem;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C11918cdD OLrzqt() {
        return (C11918cdD) this.AEQbTJ.getValue();
    }

    public static final C11918cdD copydefault(C11886ccY c11886ccY) {
        return new C11918cdD(c11886ccY);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull SignDataArgs<TonMessageSignData> signDataArgs) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        boolean zKWHzl = super.KWHzl(abstractC12782ctV, c10854bwM, signDataArgs);
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((TonProofItem) C54907xZt.OLrzqt(TonProofItem.Companion.serializer(), ((TonMessageSignData) QVsKAR()).getData()));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        TonProofItem tonProofItem = new TonProofItem((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 7, (DefaultConstructorMarker) null);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = tonProofItem;
        }
        AEQbTJ((TonProofItem) objM7377constructorimpl);
        return zKWHzl;
    }

    @Override // o.AbstractC8610bFv
    public java.lang.String AEQbTJ(boolean z) {
        return KWHzl().getPayload();
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        if (KWHzl().getPayload().length() == 0) {
            AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5000, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        java.lang.String strEZpvd = OLrzqt().EZpvd(str);
        if (strEZpvd.length() == 0) {
            AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8610bFv.generateCommonBroadcastModel$default(this, strEZpvd, null, 2, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
        return abstractC58185ywXKWHzl3;
    }
}
