package o;

import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.SolanaMessageSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaWCSignResult;
import com.okinc.network.okg.response.ResponseData;
import io.reactivex.BackpressureStrategy;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: renamed from: o.bWM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9476bWM extends AbstractC8610bFv<SolanaMessageSignData> {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.bWN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C9476bWM.AEQbTJ(this.copydefault);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String ag_() {
        return "";
    }

    public final C9654bZf OLrzqt() {
        return (C9654bZf) this.EZpvd.getValue();
    }

    public static final C9654bZf AEQbTJ(C9476bWM c9476bWM) {
        return new C9654bZf(c9476bWM);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r6v12, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r6v23, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r6v27, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r6v31, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8610bFv
    public java.lang.String AEQbTJ(boolean z) throws java.lang.Throwable {
        java.lang.Object objM7377constructorimpl;
        java.lang.String string;
        if (z) {
            if (C59449zhJ.startsWith$default(((SolanaMessageSignData) QVsKAR()).getData(), "[", false, 2, null)) {
                try {
                    Result.Application application = Result.Companion;
                    JSONArray jSONArray = new JSONArray(((SolanaMessageSignData) QVsKAR()).getData());
                    if (jSONArray.length() == 1) {
                        java.lang.String string2 = jSONArray.getString(0);
                        Intrinsics.checkNotNullExpressionValue(string2, "");
                        string = copydefault(string2);
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            sb.append(jSONArray.getString(i));
                            if (i < jSONArray.length() - 1) {
                                sb.append("\n");
                            }
                        }
                        string = sb.toString();
                        Intrinsics.copydefault((java.lang.Object) string);
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(string);
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    C56391yDq.AEQbTJ(objM7377constructorimpl);
                    return (java.lang.String) objM7377constructorimpl;
                }
                return ((SolanaMessageSignData) QVsKAR()).getData();
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((SolanaMessageSignData) QVsKAR()).getRaw())) {
                java.lang.String raw = ((SolanaMessageSignData) QVsKAR()).getRaw();
                return copydefault(raw != null ? raw : "");
            }
            return copydefault(((SolanaMessageSignData) QVsKAR()).getData());
        }
        return ((SolanaMessageSignData) QVsKAR()).getData();
    }

    public final java.lang.String copydefault(java.lang.String str) {
        try {
            byte[] bArrCopydefault = C58171ywJ.copydefault(str);
            Intrinsics.checkNotNullExpressionValue(bArrCopydefault, "");
            return new java.lang.String(bArrCopydefault, Charsets.UTF_8);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("OKWSolanaSignMessage", "Failed to decode base58", e);
            return str;
        }
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bWK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C9476bWM.EZpvd(this.copydefault, str, interfaceC58184ywW);
            }
        }, BackpressureStrategy.LATEST);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(C9476bWM c9476bWM, java.lang.String str, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        if (((SolanaMessageSignData) c9476bWM.QVsKAR()).getSolSignDappMessages()) {
            interfaceC58184ywW.onNext(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8610bFv.generateCommonBroadcastModel$default(c9476bWM, c9476bWM.EZpvd(c9476bWM.OLrzqt().EZpvd(str)), null, 2, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
            interfaceC58184ywW.onComplete();
        } else if (C59449zhJ.startsWith$default(((SolanaMessageSignData) c9476bWM.QVsKAR()).getData(), "[", false, 2, null)) {
            interfaceC58184ywW.onNext(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8610bFv.generateCommonBroadcastModel$default(c9476bWM, c9476bWM.EZpvd(c9476bWM.OLrzqt().copydefault(str)), null, 2, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
            interfaceC58184ywW.onComplete();
        } else {
            interfaceC58184ywW.onNext(new ResponseData(-5001, null, null, null, new BatchBroadcastModel(C56402yEa.EZpvd(AbstractC8610bFv.generateCommonBroadcastModel$default(c9476bWM, c9476bWM.EZpvd(c9476bWM.OLrzqt().KWHzl(str, ((SolanaMessageSignData) c9476bWM.QVsKAR()).getData())), null, 2, null)), (java.util.List) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, (SignAuthType) null, 254, (DefaultConstructorMarker) null), null, 46, null));
            interfaceC58184ywW.onComplete();
        }
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        if (QwvEab() != 5) {
            return str;
        }
        try {
            return C54907xZt.encodeToString$default(SolanaWCSignResult.Companion.serializer(), new SolanaWCSignResult((java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) C54907xZt.OLrzqt(BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(C56529yIt.KWHzl)), str))), false, 2, null);
        } catch (java.lang.Exception unused) {
            return C54907xZt.encodeToString$default(SolanaWCSignResult.Companion.serializer(), new SolanaWCSignResult(str), false, 2, null);
        }
    }
}
